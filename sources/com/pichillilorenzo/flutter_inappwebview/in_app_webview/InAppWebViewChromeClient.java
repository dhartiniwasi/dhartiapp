package com.pichillilorenzo.flutter_inappwebview.in_app_webview;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.MimeTypeMap;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.app.C0280c;
import androidx.core.content.C0681a;
import androidx.core.content.C0689b;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.in_app_browser.ActivityResultListener;
import com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserDelegate;
import com.pichillilorenzo.flutter_inappwebview.types.CreateWindowAction;
import com.pichillilorenzo.flutter_inappwebview.types.URLRequest;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p048g.C4296i;
import p186ac.C6556k;
import p186ac.C6563m;
import p186ac.C6565o;
import p360tb.C12590c;

public class InAppWebViewChromeClient extends WebChromeClient implements C6563m, ActivityResultListener {
    protected static final FrameLayout.LayoutParams FULLSCREEN_LAYOUT_PARAMS = new FrameLayout.LayoutParams(-1, -1, 17);
    protected static final int FULLSCREEN_SYSTEM_UI_VISIBILITY = 1798;
    protected static final int FULLSCREEN_SYSTEM_UI_VISIBILITY_KITKAT = 7942;
    protected static final String LOG_TAG = "IABWebChromeClient";
    private static final int PICKER = 1;
    private static final int PICKER_LEGACY = 3;
    private static final String fileProviderAuthorityExtension = "flutter_inappwebview.fileprovider";
    private static Uri imageOutputFileUri;
    private static Uri videoOutputFileUri;
    private static int windowAutoincrementId = 0;
    public static Map<Integer, Message> windowWebViewMessages = new HashMap();
    final String DEFAULT_MIME_TYPES = "*/*";
    private final C6556k channel;
    private InAppBrowserDelegate inAppBrowserDelegate;
    private View mCustomView;
    private WebChromeClient.CustomViewCallback mCustomViewCallback;
    private int mOriginalOrientation;
    private int mOriginalSystemUiVisibility;
    public InAppWebViewFlutterPlugin plugin;

    public InAppWebViewChromeClient(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, C6556k kVar, InAppBrowserDelegate inAppBrowserDelegate2) {
        this.plugin = inAppWebViewFlutterPlugin;
        this.channel = kVar;
        this.inAppBrowserDelegate = inAppBrowserDelegate2;
        if (inAppBrowserDelegate2 != null) {
            inAppBrowserDelegate2.getActivityResultListeners().add(this);
        }
        C6565o oVar = inAppWebViewFlutterPlugin.registrar;
        if (oVar != null) {
            oVar.mo22166a(this);
            return;
        }
        C12590c cVar = inAppWebViewFlutterPlugin.activityPluginBinding;
        if (cVar != null) {
            cVar.mo34111a(this);
        }
    }

    private Boolean acceptsAny(String[] strArr) {
        if (isArrayEmpty(strArr).booleanValue()) {
            return Boolean.TRUE;
        }
        for (String equals : strArr) {
            if (equals.equals("*/*")) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private Boolean acceptsImages(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(".", ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains("image"));
    }

    private Boolean acceptsVideo(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(".", ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains("video"));
    }

    private Boolean arrayContainsString(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2 != null && str2.contains(str)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private String[] getAcceptedMimeType(String[] strArr) {
        if (isArrayEmpty(strArr).booleanValue()) {
            return new String[]{"*/*"};
        }
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str.matches("\\.\\w+")) {
                strArr2[i] = getMimeTypeFromExtension(str.replace(".", ""));
            } else {
                strArr2[i] = str;
            }
        }
        return strArr2;
    }

    private Activity getActivity() {
        InAppBrowserDelegate inAppBrowserDelegate2 = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate2 != null) {
            return inAppBrowserDelegate2.getActivity();
        }
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null) {
            return inAppWebViewFlutterPlugin.activity;
        }
        return null;
    }

    private File getCapturedFile(String str) throws IOException {
        String str2;
        String str3;
        String str4 = "";
        if (str.equals("android.media.action.IMAGE_CAPTURE")) {
            str4 = Environment.DIRECTORY_PICTURES;
            str2 = "image";
            str3 = ".jpg";
        } else if (str.equals("android.media.action.VIDEO_CAPTURE")) {
            str4 = Environment.DIRECTORY_MOVIES;
            str2 = "video";
            str3 = ".mp4";
        } else {
            str2 = str4;
            str3 = str2;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return new File(Environment.getExternalStoragePublicDirectory(str4), String.format("%s-%d%s", new Object[]{str2, Long.valueOf(System.currentTimeMillis()), str3}));
        }
        Activity activity = getActivity();
        if (activity == null) {
            return null;
        }
        return File.createTempFile(str2, str3, activity.getApplicationContext().getExternalFilesDir((String) null));
    }

    private Uri getCapturedMediaFile() {
        Uri uri = imageOutputFileUri;
        if (uri != null && isFileNotEmpty(uri)) {
            return imageOutputFileUri;
        }
        Uri uri2 = videoOutputFileUri;
        if (uri2 == null || !isFileNotEmpty(uri2)) {
            return null;
        }
        return videoOutputFileUri;
    }

    private Intent getFileChooserIntent(String str) {
        String str2 = str.isEmpty() ? "*/*" : str;
        if (str.matches("\\.\\w+")) {
            str2 = getMimeTypeFromExtension(str.replace(".", ""));
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str2);
        return intent;
    }

    private String getMimeTypeFromExtension(String str) {
        if (str != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
        return null;
    }

    private Uri getOutputUri(String str) {
        File file;
        try {
            file = getCapturedFile(str);
        } catch (IOException e) {
            Log.e(LOG_TAG, "Error occurred while creating the File", e);
            e.printStackTrace();
            file = null;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return Uri.fromFile(file);
        }
        Activity activity = getActivity();
        if (activity == null) {
            return null;
        }
        String packageName = activity.getApplicationContext().getPackageName();
        return C0689b.getUriForFile(activity.getApplicationContext(), packageName + "." + fileProviderAuthorityExtension, file);
    }

    private Intent getPhotoIntent() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        Uri outputUri = getOutputUri("android.media.action.IMAGE_CAPTURE");
        imageOutputFileUri = outputUri;
        intent.putExtra("output", outputUri);
        return intent;
    }

    private Uri[] getSelectedFiles(Intent intent, int i) {
        if (intent == null || intent.getData() == null) {
            if (intent == null || intent.getClipData() == null) {
                Uri capturedMediaFile = getCapturedMediaFile();
                if (capturedMediaFile == null) {
                    return null;
                }
                return new Uri[]{capturedMediaFile};
            }
            int itemCount = intent.getClipData().getItemCount();
            Uri[] uriArr = new Uri[itemCount];
            for (int i2 = 0; i2 < itemCount; i2++) {
                uriArr[i2] = intent.getClipData().getItemAt(i2).getUri();
            }
            return uriArr;
        } else if (i != -1 || Build.VERSION.SDK_INT < 21) {
            return null;
        } else {
            return WebChromeClient.FileChooserParams.parseResult(i, intent);
        }
    }

    private Intent getVideoIntent() {
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        Uri outputUri = getOutputUri("android.media.action.VIDEO_CAPTURE");
        videoOutputFileUri = outputUri;
        intent.putExtra("output", outputUri);
        return intent;
    }

    private Boolean isArrayEmpty(String[] strArr) {
        boolean z = false;
        if (strArr.length == 0 || (strArr.length == 1 && strArr[0].length() == 0)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    private boolean isFileNotEmpty(Uri uri) {
        Activity activity = getActivity();
        if (activity == null) {
            return false;
        }
        try {
            AssetFileDescriptor openAssetFileDescriptor = activity.getContentResolver().openAssetFileDescriptor(uri, "r");
            long length = openAssetFileDescriptor.getLength();
            openAssetFileDescriptor.close();
            if (length > 0) {
                return true;
            }
            return false;
        } catch (IOException unused) {
            return false;
        }
    }

    public void createAlertDialog(WebView webView, String str, final JsResult jsResult, String str2, String str3) {
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        C87602 r3 = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                jsResult.confirm();
                dialogInterface.dismiss();
            }
        };
        Activity activity = getActivity();
        if (activity != null) {
            C0280c.C0281a aVar = new C0280c.C0281a(activity, C4296i.f23932c);
            aVar.mo878f(str);
            if (str3 == null || str3.isEmpty()) {
                aVar.mo883k(17039370, r3);
            } else {
                aVar.mo884l(str3, r3);
            }
            aVar.mo881i(new DialogInterface.OnCancelListener() {
                public void onCancel(DialogInterface dialogInterface) {
                    jsResult.cancel();
                    dialogInterface.dismiss();
                }
            });
            aVar.mo873a().show();
        }
    }

    public void createBeforeUnloadDialog(WebView webView, String str, final JsResult jsResult, String str2, String str3, String str4) {
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        C875413 r4 = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                jsResult.confirm();
                dialogInterface.dismiss();
            }
        };
        C875514 r7 = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                jsResult.cancel();
                dialogInterface.dismiss();
            }
        };
        Activity activity = getActivity();
        if (activity != null) {
            C0280c.C0281a aVar = new C0280c.C0281a(activity, C4296i.f23932c);
            aVar.mo878f(str);
            if (str3 == null || str3.isEmpty()) {
                aVar.mo883k(17039370, r4);
            } else {
                aVar.mo884l(str3, r4);
            }
            if (str4 == null || str4.isEmpty()) {
                aVar.mo879g(17039360, r7);
            } else {
                aVar.mo880h(str4, r7);
            }
            aVar.mo881i(new DialogInterface.OnCancelListener() {
                public void onCancel(DialogInterface dialogInterface) {
                    jsResult.cancel();
                    dialogInterface.dismiss();
                }
            });
            aVar.mo873a().show();
        }
    }

    public void createConfirmDialog(WebView webView, String str, final JsResult jsResult, String str2, String str3, String str4) {
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        C87635 r4 = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                jsResult.confirm();
                dialogInterface.dismiss();
            }
        };
        C87646 r7 = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                jsResult.cancel();
                dialogInterface.dismiss();
            }
        };
        Activity activity = getActivity();
        if (activity != null) {
            C0280c.C0281a aVar = new C0280c.C0281a(activity, C4296i.f23932c);
            aVar.mo878f(str);
            if (str3 == null || str3.isEmpty()) {
                aVar.mo883k(17039370, r4);
            } else {
                aVar.mo884l(str3, r4);
            }
            if (str4 == null || str4.isEmpty()) {
                aVar.mo879g(17039360, r7);
            } else {
                aVar.mo880h(str4, r7);
            }
            aVar.mo881i(new DialogInterface.OnCancelListener() {
                public void onCancel(DialogInterface dialogInterface) {
                    jsResult.cancel();
                    dialogInterface.dismiss();
                }
            });
            aVar.mo873a().show();
        }
    }

    public void createPromptDialog(WebView webView, String str, String str2, final JsPromptResult jsPromptResult, String str3, String str4, final String str5, String str6, String str7) {
        FrameLayout frameLayout = new FrameLayout(webView.getContext());
        final EditText editText = new EditText(webView.getContext());
        editText.setMaxLines(1);
        if (str4 != null && !str4.isEmpty()) {
            str2 = str4;
        }
        editText.setText(str2);
        editText.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        frameLayout.setPaddingRelative(45, 15, 45, 0);
        frameLayout.addView(editText);
        if (str3 != null && !str3.isEmpty()) {
            str = str3;
        }
        C87679 r3 = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                String obj = editText.getText().toString();
                JsPromptResult jsPromptResult = jsPromptResult;
                String str = str5;
                if (str != null) {
                    obj = str;
                }
                jsPromptResult.confirm(obj);
                dialogInterface.dismiss();
            }
        };
        C875110 r5 = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                jsPromptResult.cancel();
                dialogInterface.dismiss();
            }
        };
        Activity activity = getActivity();
        if (activity != null) {
            C0280c.C0281a aVar = new C0280c.C0281a(activity, C4296i.f23932c);
            aVar.mo878f(str);
            if (str7 == null || str7.isEmpty()) {
                aVar.mo883k(17039370, r3);
            } else {
                aVar.mo884l(str7, r3);
            }
            if (str6 == null || str6.isEmpty()) {
                aVar.mo879g(17039360, r5);
            } else {
                aVar.mo880h(str6, r5);
            }
            aVar.mo881i(new DialogInterface.OnCancelListener() {
                public void onCancel(DialogInterface dialogInterface) {
                    jsPromptResult.cancel();
                    dialogInterface.dismiss();
                }
            });
            C0280c a = aVar.mo873a();
            a.mo869j(frameLayout);
            a.show();
        }
    }

    public void dispose() {
        C12590c cVar;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (!(inAppWebViewFlutterPlugin == null || (cVar = inAppWebViewFlutterPlugin.activityPluginBinding) == null)) {
            cVar.mo34116f(this);
        }
        InAppBrowserDelegate inAppBrowserDelegate2 = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate2 != null) {
            inAppBrowserDelegate2.getActivityResultListeners().clear();
            this.inAppBrowserDelegate = null;
        }
        this.plugin = null;
    }

    public Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
    }

    /* access modifiers changed from: protected */
    public ViewGroup getRootView() {
        Activity activity = getActivity();
        if (activity == null) {
            return null;
        }
        return (ViewGroup) activity.findViewById(16908290);
    }

    /* access modifiers changed from: protected */
    public boolean needsCameraPermission() {
        Activity activity = getActivity();
        if (activity == null) {
            return true;
        }
        try {
            if (!Arrays.asList(activity.getPackageManager().getPackageInfo(activity.getApplicationContext().getPackageName(), 4096).requestedPermissions).contains("android.permission.CAMERA") || C0681a.m3145a(activity, "android.permission.CAMERA") == 0) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        if (InAppWebViewFlutterPlugin.filePathCallback == null && InAppWebViewFlutterPlugin.filePathCallbackLegacy == null) {
            return true;
        }
        if (i == 1) {
            Uri[] selectedFiles = i2 == -1 ? getSelectedFiles(intent, i2) : null;
            ValueCallback<Uri[]> valueCallback = InAppWebViewFlutterPlugin.filePathCallback;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(selectedFiles);
            }
        } else if (i == 3) {
            InAppWebViewFlutterPlugin.filePathCallbackLegacy.onReceiveValue(i2 == -1 ? intent != null ? intent.getData() : getCapturedMediaFile() : null);
        }
        InAppWebViewFlutterPlugin.filePathCallback = null;
        InAppWebViewFlutterPlugin.filePathCallbackLegacy = null;
        imageOutputFileUri = null;
        videoOutputFileUri = null;
        return true;
    }

    public void onCloseWindow(WebView webView) {
        this.channel.mo22159c("onCloseWindow", new HashMap());
        super.onCloseWindow(webView);
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        HashMap hashMap = new HashMap();
        hashMap.put("message", consoleMessage.message());
        hashMap.put("messageLevel", Integer.valueOf(consoleMessage.messageLevel().ordinal()));
        this.channel.mo22159c("onConsoleMessage", hashMap);
        return true;
    }

    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        String string;
        final int i = windowAutoincrementId + 1;
        windowAutoincrementId = i;
        WebView.HitTestResult hitTestResult = webView.getHitTestResult();
        String extra = hitTestResult.getExtra();
        if (hitTestResult.getType() == 8) {
            Message obtainMessage = webView.getHandler().obtainMessage();
            webView.requestFocusNodeHref(obtainMessage);
            Bundle data = obtainMessage.getData();
            if (!(data == null || (string = data.getString("url")) == null || string.isEmpty())) {
                extra = string;
            }
        }
        CreateWindowAction createWindowAction = new CreateWindowAction(new URLRequest(extra, "GET", (byte[]) null, (Map<String, String>) null), true, z2, false, i, z);
        windowWebViewMessages.put(Integer.valueOf(i), message);
        this.channel.mo22160d("onCreateWindow", createWindowAction.toMap(), new C6556k.C6561d() {
            public void error(String str, String str2, Object obj) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(", ");
                if (str2 == null) {
                    str2 = "";
                }
                sb.append(str2);
                Log.e(InAppWebViewChromeClient.LOG_TAG, sb.toString());
                if (InAppWebViewChromeClient.windowWebViewMessages.containsKey(Integer.valueOf(i))) {
                    InAppWebViewChromeClient.windowWebViewMessages.remove(Integer.valueOf(i));
                }
            }

            public void notImplemented() {
                if (InAppWebViewChromeClient.windowWebViewMessages.containsKey(Integer.valueOf(i))) {
                    InAppWebViewChromeClient.windowWebViewMessages.remove(Integer.valueOf(i));
                }
            }

            public void success(Object obj) {
                if (!(obj instanceof Boolean ? ((Boolean) obj).booleanValue() : false) && InAppWebViewChromeClient.windowWebViewMessages.containsKey(Integer.valueOf(i))) {
                    InAppWebViewChromeClient.windowWebViewMessages.remove(Integer.valueOf(i));
                }
            }
        });
        return true;
    }

    public void onGeolocationPermissionsHidePrompt() {
        this.channel.mo22159c("onGeolocationPermissionsHidePrompt", new HashMap());
    }

    public void onGeolocationPermissionsShowPrompt(final String str, final GeolocationPermissions.Callback callback) {
        HashMap hashMap = new HashMap();
        hashMap.put("origin", str);
        this.channel.mo22160d("onGeolocationPermissionsShowPrompt", hashMap, new C6556k.C6561d() {
            public void error(String str, String str2, Object obj) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(", ");
                if (str2 == null) {
                    str2 = "";
                }
                sb.append(str2);
                Log.e(InAppWebViewChromeClient.LOG_TAG, sb.toString());
                callback.invoke(str, false, false);
            }

            public void notImplemented() {
                callback.invoke(str, false, false);
            }

            public void success(Object obj) {
                Map map = (Map) obj;
                if (map != null) {
                    callback.invoke((String) map.get("origin"), ((Boolean) map.get("allow")).booleanValue(), ((Boolean) map.get("retain")).booleanValue());
                } else {
                    callback.invoke(str, false, false);
                }
            }
        });
    }

    public void onHideCustomView() {
        ViewGroup rootView;
        Activity activity = getActivity();
        if (activity != null && (rootView = getRootView()) != null) {
            ((FrameLayout) rootView).removeView(this.mCustomView);
            this.mCustomView = null;
            rootView.setSystemUiVisibility(this.mOriginalSystemUiVisibility);
            activity.setRequestedOrientation(this.mOriginalOrientation);
            this.mCustomViewCallback.onCustomViewHidden();
            this.mCustomViewCallback = null;
            activity.getWindow().clearFlags(512);
            this.channel.mo22159c("onExitFullscreen", new HashMap());
        }
    }

    public boolean onJsAlert(final WebView webView, String str, final String str2, final JsResult jsResult) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("message", str2);
        hashMap.put("iosIsMainFrame", (Object) null);
        this.channel.mo22160d("onJsAlert", hashMap, new C6556k.C6561d() {
            public void error(String str, String str2, Object obj) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(", ");
                if (str2 == null) {
                    str2 = "";
                }
                sb.append(str2);
                Log.e(InAppWebViewChromeClient.LOG_TAG, sb.toString());
                jsResult.cancel();
            }

            public void notImplemented() {
                InAppWebViewChromeClient.this.createAlertDialog(webView, str2, jsResult, (String) null, (String) null);
            }

            public void success(Object obj) {
                String str;
                String str2;
                if (obj != null) {
                    Map map = (Map) obj;
                    String str3 = (String) map.get("message");
                    String str4 = (String) map.get("confirmButtonTitle");
                    Boolean bool = (Boolean) map.get("handledByClient");
                    if (bool == null || !bool.booleanValue()) {
                        str2 = str3;
                        str = str4;
                    } else {
                        Integer num = (Integer) map.get("action");
                        if (Integer.valueOf(num != null ? num.intValue() : 1).intValue() != 0) {
                            jsResult.cancel();
                            return;
                        } else {
                            jsResult.confirm();
                            return;
                        }
                    }
                } else {
                    str2 = null;
                    str = null;
                }
                InAppWebViewChromeClient.this.createAlertDialog(webView, str2, jsResult, str2, str);
            }
        });
        return true;
    }

    public boolean onJsBeforeUnload(final WebView webView, String str, final String str2, final JsResult jsResult) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("message", str2);
        this.channel.mo22160d("onJsBeforeUnload", hashMap, new C6556k.C6561d() {
            public void error(String str, String str2, Object obj) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(", ");
                if (str2 == null) {
                    str2 = "";
                }
                sb.append(str2);
                Log.e(InAppWebViewChromeClient.LOG_TAG, sb.toString());
                jsResult.cancel();
            }

            public void notImplemented() {
                InAppWebViewChromeClient.this.createConfirmDialog(webView, str2, jsResult, (String) null, (String) null, (String) null);
            }

            public void success(Object obj) {
                String str;
                String str2;
                String str3;
                if (obj != null) {
                    Map map = (Map) obj;
                    String str4 = (String) map.get("message");
                    String str5 = (String) map.get("confirmButtonTitle");
                    String str6 = (String) map.get("cancelButtonTitle");
                    Boolean bool = (Boolean) map.get("handledByClient");
                    if (bool == null || !bool.booleanValue()) {
                        str3 = str4;
                        str2 = str5;
                        str = str6;
                    } else {
                        Integer num = (Integer) map.get("action");
                        if (Integer.valueOf(num != null ? num.intValue() : 1).intValue() != 0) {
                            jsResult.cancel();
                            return;
                        } else {
                            jsResult.confirm();
                            return;
                        }
                    }
                } else {
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                InAppWebViewChromeClient.this.createBeforeUnloadDialog(webView, str2, jsResult, str3, str2, str);
            }
        });
        return true;
    }

    public boolean onJsConfirm(final WebView webView, String str, final String str2, final JsResult jsResult) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("message", str2);
        hashMap.put("iosIsMainFrame", (Object) null);
        this.channel.mo22160d("onJsConfirm", hashMap, new C6556k.C6561d() {
            public void error(String str, String str2, Object obj) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(", ");
                if (str2 == null) {
                    str2 = "";
                }
                sb.append(str2);
                Log.e(InAppWebViewChromeClient.LOG_TAG, sb.toString());
                jsResult.cancel();
            }

            public void notImplemented() {
                InAppWebViewChromeClient.this.createConfirmDialog(webView, str2, jsResult, (String) null, (String) null, (String) null);
            }

            public void success(Object obj) {
                String str;
                String str2;
                String str3;
                if (obj != null) {
                    Map map = (Map) obj;
                    String str4 = (String) map.get("message");
                    String str5 = (String) map.get("confirmButtonTitle");
                    String str6 = (String) map.get("cancelButtonTitle");
                    Boolean bool = (Boolean) map.get("handledByClient");
                    if (bool == null || !bool.booleanValue()) {
                        str3 = str4;
                        str2 = str5;
                        str = str6;
                    } else {
                        Integer num = (Integer) map.get("action");
                        if (Integer.valueOf(num != null ? num.intValue() : 1).intValue() != 0) {
                            jsResult.cancel();
                            return;
                        } else {
                            jsResult.confirm();
                            return;
                        }
                    }
                } else {
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                InAppWebViewChromeClient.this.createConfirmDialog(webView, str2, jsResult, str3, str2, str);
            }
        });
        return true;
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("message", str2);
        hashMap.put("defaultValue", str3);
        hashMap.put("iosIsMainFrame", (Object) null);
        final JsPromptResult jsPromptResult2 = jsPromptResult;
        final WebView webView2 = webView;
        final String str4 = str2;
        final String str5 = str3;
        this.channel.mo22160d("onJsPrompt", hashMap, new C6556k.C6561d() {
            public void error(String str, String str2, Object obj) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(", ");
                if (str2 == null) {
                    str2 = "";
                }
                sb.append(str2);
                Log.e(InAppWebViewChromeClient.LOG_TAG, sb.toString());
                jsPromptResult2.cancel();
            }

            public void notImplemented() {
                InAppWebViewChromeClient.this.createPromptDialog(webView2, str4, str5, jsPromptResult2, (String) null, (String) null, (String) null, (String) null, (String) null);
            }

            public void success(Object obj) {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                if (obj != null) {
                    Map map = (Map) obj;
                    String str6 = (String) map.get("message");
                    String str7 = (String) map.get("defaultValue");
                    String str8 = (String) map.get("confirmButtonTitle");
                    String str9 = (String) map.get("cancelButtonTitle");
                    String str10 = (String) map.get("value");
                    Boolean bool = (Boolean) map.get("handledByClient");
                    if (bool == null || !bool.booleanValue()) {
                        str5 = str6;
                        str4 = str7;
                        str = str8;
                        str2 = str9;
                        str3 = str10;
                    } else {
                        Integer num = (Integer) map.get("action");
                        if (Integer.valueOf(num != null ? num.intValue() : 1).intValue() != 0) {
                            jsPromptResult2.cancel();
                            return;
                        } else {
                            jsPromptResult2.confirm(str10);
                            return;
                        }
                    }
                } else {
                    str5 = null;
                    str4 = null;
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                InAppWebViewChromeClient.this.createPromptDialog(webView2, str4, str5, jsPromptResult2, str5, str4, str3, str2, str);
            }
        });
        return true;
    }

    public void onPermissionRequest(final PermissionRequest permissionRequest) {
        if (Build.VERSION.SDK_INT >= 21) {
            HashMap hashMap = new HashMap();
            hashMap.put("origin", permissionRequest.getOrigin().toString());
            hashMap.put("resources", Arrays.asList(permissionRequest.getResources()));
            this.channel.mo22160d("onPermissionRequest", hashMap, new C6556k.C6561d() {
                public void error(String str, String str2, Object obj) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(", ");
                    if (str2 == null) {
                        str2 = "";
                    }
                    sb.append(str2);
                    Log.e(InAppWebViewChromeClient.LOG_TAG, sb.toString());
                    permissionRequest.deny();
                }

                public void notImplemented() {
                    permissionRequest.deny();
                }

                public void success(Object obj) {
                    if (obj != null) {
                        Map map = (Map) obj;
                        Integer num = (Integer) map.get("action");
                        List list = (List) map.get("resources");
                        if (list == null) {
                            list = new ArrayList();
                        }
                        String[] strArr = (String[]) list.toArray(new String[list.size()]);
                        if (num != null) {
                            if (num.intValue() != 1) {
                                permissionRequest.deny();
                                return;
                            } else {
                                permissionRequest.grant(strArr);
                                return;
                            }
                        }
                    }
                    permissionRequest.deny();
                }
            });
        }
    }

    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        InAppWebView inAppWebView = (InAppWebView) webView;
        InAppBrowserDelegate inAppBrowserDelegate2 = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate2 != null) {
            inAppBrowserDelegate2.didChangeProgress(i);
        }
        InAppWebViewClient inAppWebViewClient = inAppWebView.inAppWebViewClient;
        if (inAppWebViewClient != null) {
            inAppWebViewClient.loadCustomJavaScriptOnPageStarted(webView);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("progress", Integer.valueOf(i));
        this.channel.mo22159c("onProgressChanged", hashMap);
    }

    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        super.onReceivedIcon(webView, bitmap);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        try {
            byteArrayOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            String message = e.getMessage();
            if (message != null) {
                Log.e(LOG_TAG, message);
            }
        }
        bitmap.recycle();
        HashMap hashMap = new HashMap();
        hashMap.put("icon", byteArrayOutputStream.toByteArray());
        this.channel.mo22159c("onReceivedIcon", hashMap);
    }

    public void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        InAppBrowserDelegate inAppBrowserDelegate2 = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate2 != null) {
            inAppBrowserDelegate2.didChangeTitle(str);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("title", str);
        this.channel.mo22159c("onTitleChanged", hashMap);
    }

    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        super.onReceivedTouchIconUrl(webView, str, z);
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("precomposed", Boolean.valueOf(z));
        this.channel.mo22159c("onReceivedTouchIconUrl", hashMap);
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        ViewGroup rootView;
        if (this.mCustomView != null) {
            onHideCustomView();
            return;
        }
        Activity activity = getActivity();
        if (activity != null && (rootView = getRootView()) != null) {
            this.mCustomView = view;
            this.mOriginalSystemUiVisibility = rootView.getSystemUiVisibility();
            this.mOriginalOrientation = activity.getRequestedOrientation();
            this.mCustomViewCallback = customViewCallback;
            this.mCustomView.setBackgroundColor(-16777216);
            if (Build.VERSION.SDK_INT >= 19) {
                rootView.setSystemUiVisibility(FULLSCREEN_SYSTEM_UI_VISIBILITY_KITKAT);
            } else {
                rootView.setSystemUiVisibility(FULLSCREEN_SYSTEM_UI_VISIBILITY);
            }
            activity.getWindow().setFlags(512, 512);
            ((FrameLayout) rootView).addView(this.mCustomView, FULLSCREEN_LAYOUT_PARAMS);
            this.channel.mo22159c("onEnterFullscreen", new HashMap());
        }
    }

    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        String[] acceptTypes = fileChooserParams.getAcceptTypes();
        boolean z = true;
        if (fileChooserParams.getMode() != 1) {
            z = false;
        }
        return startPickerIntent(valueCallback, acceptTypes, z, fileChooserParams.isCaptureEnabled());
    }

    /* access modifiers changed from: protected */
    public void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
        startPickerIntent(valueCallback, str, (String) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void startPickerIntent(android.webkit.ValueCallback<android.net.Uri> r3, java.lang.String r4, java.lang.String r5) {
        /*
            r2 = this;
            com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin.filePathCallbackLegacy = r3
            java.lang.Boolean r3 = r2.acceptsImages((java.lang.String) r4)
            boolean r3 = r3.booleanValue()
            java.lang.Boolean r0 = r2.acceptsVideo((java.lang.String) r4)
            boolean r0 = r0.booleanValue()
            if (r5 == 0) goto L_0x0028
            boolean r5 = r2.needsCameraPermission()
            if (r5 != 0) goto L_0x0028
            if (r3 == 0) goto L_0x0021
            android.content.Intent r5 = r2.getPhotoIntent()
            goto L_0x0029
        L_0x0021:
            if (r0 == 0) goto L_0x0028
            android.content.Intent r5 = r2.getVideoIntent()
            goto L_0x0029
        L_0x0028:
            r5 = 0
        L_0x0029:
            if (r5 != 0) goto L_0x0060
            android.content.Intent r4 = r2.getFileChooserIntent(r4)
            java.lang.String r5 = ""
            android.content.Intent r5 = android.content.Intent.createChooser(r4, r5)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r1 = r2.needsCameraPermission()
            if (r1 != 0) goto L_0x0052
            if (r3 == 0) goto L_0x0049
            android.content.Intent r3 = r2.getPhotoIntent()
            r4.add(r3)
        L_0x0049:
            if (r0 == 0) goto L_0x0052
            android.content.Intent r3 = r2.getVideoIntent()
            r4.add(r3)
        L_0x0052:
            r3 = 0
            android.os.Parcelable[] r3 = new android.os.Parcelable[r3]
            java.lang.Object[] r3 = r4.toArray(r3)
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            java.lang.String r4 = "android.intent.extra.INITIAL_INTENTS"
            r5.putExtra(r4, r3)
        L_0x0060:
            android.app.Activity r3 = r2.getActivity()
            if (r3 == 0) goto L_0x0075
            android.content.pm.PackageManager r4 = r3.getPackageManager()
            android.content.ComponentName r4 = r5.resolveActivity(r4)
            if (r4 == 0) goto L_0x0075
            r4 = 3
            r3.startActivityForResult(r5, r4)
            goto L_0x007c
        L_0x0075:
            java.lang.String r3 = "IABWebChromeClient"
            java.lang.String r4 = "there is no Activity to handle this Intent"
            android.util.Log.d(r3, r4)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.startPickerIntent(android.webkit.ValueCallback, java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    public void openFileChooser(ValueCallback<Uri> valueCallback) {
        startPickerIntent(valueCallback, "", (String) null);
    }

    /* access modifiers changed from: protected */
    public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        startPickerIntent(valueCallback, str, str2);
    }

    private Boolean acceptsImages(String[] strArr) {
        return Boolean.valueOf(acceptsAny(strArr).booleanValue() || arrayContainsString(getAcceptedMimeType(strArr), "image").booleanValue());
    }

    private Boolean acceptsVideo(String[] strArr) {
        return Boolean.valueOf(acceptsAny(strArr).booleanValue() || arrayContainsString(getAcceptedMimeType(strArr), "video").booleanValue());
    }

    private Intent getFileChooserIntent(String[] strArr, boolean z) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.MIME_TYPES", getAcceptedMimeType(strArr));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
        return intent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean startPickerIntent(android.webkit.ValueCallback<android.net.Uri[]> r3, java.lang.String[] r4, boolean r5, boolean r6) {
        /*
            r2 = this;
            com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin.filePathCallback = r3
            java.lang.Boolean r3 = r2.acceptsImages((java.lang.String[]) r4)
            boolean r3 = r3.booleanValue()
            java.lang.Boolean r0 = r2.acceptsVideo((java.lang.String[]) r4)
            boolean r0 = r0.booleanValue()
            if (r6 == 0) goto L_0x0028
            boolean r6 = r2.needsCameraPermission()
            if (r6 != 0) goto L_0x0028
            if (r3 == 0) goto L_0x0021
            android.content.Intent r6 = r2.getPhotoIntent()
            goto L_0x0029
        L_0x0021:
            if (r0 == 0) goto L_0x0028
            android.content.Intent r6 = r2.getVideoIntent()
            goto L_0x0029
        L_0x0028:
            r6 = 0
        L_0x0029:
            if (r6 != 0) goto L_0x0067
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            boolean r1 = r2.needsCameraPermission()
            if (r1 != 0) goto L_0x0048
            if (r3 == 0) goto L_0x003f
            android.content.Intent r3 = r2.getPhotoIntent()
            r6.add(r3)
        L_0x003f:
            if (r0 == 0) goto L_0x0048
            android.content.Intent r3 = r2.getVideoIntent()
            r6.add(r3)
        L_0x0048:
            android.content.Intent r3 = r2.getFileChooserIntent(r4, r5)
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "android.intent.action.CHOOSER"
            r4.<init>(r5)
            java.lang.String r5 = "android.intent.extra.INTENT"
            r4.putExtra(r5, r3)
            r3 = 0
            android.os.Parcelable[] r3 = new android.os.Parcelable[r3]
            java.lang.Object[] r3 = r6.toArray(r3)
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            java.lang.String r5 = "android.intent.extra.INITIAL_INTENTS"
            r4.putExtra(r5, r3)
            r6 = r4
        L_0x0067:
            android.app.Activity r3 = r2.getActivity()
            r4 = 1
            if (r3 == 0) goto L_0x007c
            android.content.pm.PackageManager r5 = r3.getPackageManager()
            android.content.ComponentName r5 = r6.resolveActivity(r5)
            if (r5 == 0) goto L_0x007c
            r3.startActivityForResult(r6, r4)
            goto L_0x0083
        L_0x007c:
            java.lang.String r3 = "IABWebChromeClient"
            java.lang.String r5 = "there is no Activity to handle this Intent"
            android.util.Log.d(r3, r5)
        L_0x0083:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebViewChromeClient.startPickerIntent(android.webkit.ValueCallback, java.lang.String[], boolean, boolean):boolean");
    }
}
