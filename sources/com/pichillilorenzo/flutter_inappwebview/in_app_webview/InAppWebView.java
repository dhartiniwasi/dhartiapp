package com.pichillilorenzo.flutter_inappwebview.in_app_webview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.print.PrintAttributes;
import android.print.PrintManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.AbsoluteLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.JavaScriptBridgeInterface;
import com.pichillilorenzo.flutter_inappwebview.Util;
import com.pichillilorenzo.flutter_inappwebview.content_blocker.ContentBlocker;
import com.pichillilorenzo.flutter_inappwebview.content_blocker.ContentBlockerAction;
import com.pichillilorenzo.flutter_inappwebview.content_blocker.ContentBlockerHandler;
import com.pichillilorenzo.flutter_inappwebview.content_blocker.ContentBlockerTrigger;
import com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserDelegate;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.ConsoleLogJS;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.InterceptAjaxRequestJS;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.InterceptFetchRequestJS;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.JavaScriptBridgeJS;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.OnLoadResourceJS;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.OnWindowBlurEventJS;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.OnWindowFocusEventJS;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.PluginScriptsUtil;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.PrintJS;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.PromisePolyfillJS;
import com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout;
import com.pichillilorenzo.flutter_inappwebview.types.ContentWorld;
import com.pichillilorenzo.flutter_inappwebview.types.DownloadStartRequest;
import com.pichillilorenzo.flutter_inappwebview.types.HitTestResult;
import com.pichillilorenzo.flutter_inappwebview.types.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview.types.PluginScript;
import com.pichillilorenzo.flutter_inappwebview.types.PreferredContentModeOptionType;
import com.pichillilorenzo.flutter_inappwebview.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview.types.UserContentController;
import com.pichillilorenzo.flutter_inappwebview.types.UserScript;
import com.pichillilorenzo.flutter_inappwebview.types.WebMessage;
import com.pichillilorenzo.flutter_inappwebview.types.WebMessageChannel;
import com.pichillilorenzo.flutter_inappwebview.types.WebMessageListener;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p158w0.C5882j;
import p158w0.C5885k;
import p186ac.C6556k;

public final class InAppWebView extends InputAwareWebView implements InAppWebViewInterface {
    static final String LOG_TAG = "InAppWebView";
    static Handler mHandler = new Handler();
    public Map<String, ValueCallback<String>> callAsyncJavaScriptCallbacks = new HashMap();
    public C6556k channel;
    public Runnable checkContextMenuShouldBeClosedTask;
    public Runnable checkScrollStoppedTask;
    public ContentBlockerHandler contentBlockerHandler = new ContentBlockerHandler();
    public Map<String, Object> contextMenu = null;
    /* access modifiers changed from: private */
    public Point contextMenuPoint = new Point(0, 0);
    public Map<String, ValueCallback<String>> evaluateJavaScriptContentWorldCallbacks = new HashMap();
    public LinearLayout floatingContextMenu = null;
    public GestureDetector gestureDetector = null;

    /* renamed from: id */
    public Object f36277id;
    public InAppBrowserDelegate inAppBrowserDelegate;
    public InAppWebViewChromeClient inAppWebViewChromeClient;
    public InAppWebViewClient inAppWebViewClient;
    public InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient;
    public int initialPositionScrollStoppedTask;
    public boolean isLoading = false;
    public JavaScriptBridgeInterface javaScriptBridgeInterface;
    private Point lastTouch = new Point(0, 0);
    public Handler mainLooperHandler = new Handler(getWebViewLooper());
    public int newCheckContextMenuShouldBeClosedTaskTask = 100;
    public int newCheckScrollStoppedTask = 100;
    public InAppWebViewOptions options;
    public InAppWebViewFlutterPlugin plugin;
    public Pattern regexToCancelSubFramesLoadingCompiled;
    public UserContentController userContentController = new UserContentController();
    public Map<String, WebMessageChannel> webMessageChannels = new HashMap();
    public List<WebMessageListener> webMessageListeners = new ArrayList();
    public Integer windowId;
    public float zoomScale = 1.0f;

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView$19 */
    static /* synthetic */ class C874019 {

        /* renamed from: $SwitchMap$com$pichillilorenzo$flutter_inappwebview$types$PreferredContentModeOptionType */
        static final /* synthetic */ int[] f36278x3e028321;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.pichillilorenzo.flutter_inappwebview.types.PreferredContentModeOptionType[] r0 = com.pichillilorenzo.flutter_inappwebview.types.PreferredContentModeOptionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36278x3e028321 = r0
                com.pichillilorenzo.flutter_inappwebview.types.PreferredContentModeOptionType r1 = com.pichillilorenzo.flutter_inappwebview.types.PreferredContentModeOptionType.DESKTOP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36278x3e028321     // Catch:{ NoSuchFieldError -> 0x001d }
                com.pichillilorenzo.flutter_inappwebview.types.PreferredContentModeOptionType r1 = com.pichillilorenzo.flutter_inappwebview.types.PreferredContentModeOptionType.MOBILE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36278x3e028321     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.pichillilorenzo.flutter_inappwebview.types.PreferredContentModeOptionType r1 = com.pichillilorenzo.flutter_inappwebview.types.PreferredContentModeOptionType.RECOMMENDED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView.C874019.<clinit>():void");
        }
    }

    class DownloadStartListener implements DownloadListener {
        DownloadStartListener() {
        }

        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            InAppWebView.this.channel.mo22159c("onDownloadStartRequest", new DownloadStartRequest(str, str2, str3, str4, j, URLUtil.guessFileName(str, str3, str4), (String) null).toMap());
        }
    }

    public InAppWebView(Context context) {
        super(context);
    }

    private void clearCookies() {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().removeAllCookies(new ValueCallback<Boolean>() {
                public void onReceiveValue(Boolean bool) {
                }
            });
        } else {
            CookieManager.getInstance().removeAllCookie();
        }
    }

    private void sendOnCreateContextMenuEvent() {
        this.channel.mo22159c("onCreateContextMenu", HitTestResult.fromWebViewHitTestResult(getHitTestResult()).toMap());
    }

    public void addWebMessageListener(WebMessageListener webMessageListener) throws Exception {
        C5882j.m34791a(this, webMessageListener.jsObjectName, webMessageListener.allowedOriginRules, webMessageListener.listener);
        this.webMessageListeners.add(webMessageListener);
    }

    public void adjustFloatingContextMenuPosition() {
        evaluateJavascript("(function(){  var selection = window.getSelection();  var rangeY = null;  if (selection != null && selection.rangeCount > 0) {    var range = selection.getRangeAt(0);    var clientRect = range.getClientRects();    if (clientRect.length > 0) {      rangeY = clientRect[0].y;    } else if (document.activeElement != null && document.activeElement.tagName.toLowerCase() !== 'iframe') {      var boundingClientRect = document.activeElement.getBoundingClientRect();      rangeY = boundingClientRect.y;    }  }  return rangeY;})();", new ValueCallback<String>() {
            public void onReceiveValue(String str) {
                if (InAppWebView.this.floatingContextMenu == null) {
                    return;
                }
                if (str == null || str.equalsIgnoreCase("null")) {
                    InAppWebView.this.floatingContextMenu.setVisibility(0);
                    InAppWebView.this.floatingContextMenu.animate().alpha(1.0f).setDuration(100).setListener((Animator.AnimatorListener) null);
                    InAppWebView inAppWebView = InAppWebView.this;
                    inAppWebView.onFloatingActionGlobalLayout(inAppWebView.contextMenuPoint.x, InAppWebView.this.contextMenuPoint.y);
                    return;
                }
                int i = InAppWebView.this.contextMenuPoint.x;
                int parseFloat = (int) (((double) (Float.parseFloat(str) * Util.getPixelDensity(InAppWebView.this.getContext()))) + (((double) InAppWebView.this.floatingContextMenu.getHeight()) / 3.5d));
                InAppWebView.this.contextMenuPoint.y = parseFloat;
                InAppWebView.this.onFloatingActionGlobalLayout(i, parseFloat);
            }
        });
    }

    public void callAsyncJavaScript(String str, Map<String, Object> map, ContentWorld contentWorld, ValueCallback<String> valueCallback) {
        String uuid = UUID.randomUUID().toString();
        if (valueCallback != null) {
            this.callAsyncJavaScriptCallbacks.put(uuid, valueCallback);
        }
        Iterator<String> keys = new JSONObject(map).keys();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (keys.hasNext()) {
            String next = keys.next();
            arrayList.add(next);
            arrayList2.add("obj." + next);
        }
        String join = TextUtils.join(", ", arrayList);
        String join2 = TextUtils.join(", ", arrayList2);
        evaluateJavascript(this.userContentController.generateCodeForScriptEvaluation(PluginScriptsUtil.CALL_ASYNC_JAVA_SCRIPT_WRAPPER_JS_SOURCE.replace(PluginScriptsUtil.VAR_FUNCTION_ARGUMENT_NAMES, join).replace(PluginScriptsUtil.VAR_FUNCTION_ARGUMENT_VALUES, join2).replace(PluginScriptsUtil.VAR_FUNCTION_ARGUMENTS_OBJ, Util.JSONStringify(map)).replace(PluginScriptsUtil.VAR_FUNCTION_BODY, str).replace(PluginScriptsUtil.VAR_RESULT_UUID, uuid).replace(PluginScriptsUtil.VAR_RESULT_UUID, uuid), contentWorld), (ValueCallback) null);
    }

    public boolean canScrollHorizontally() {
        return computeHorizontalScrollRange() > computeHorizontalScrollExtent();
    }

    public boolean canScrollVertically() {
        return computeVerticalScrollRange() > computeVerticalScrollExtent();
    }

    public void clearAllCache() {
        clearCache(true);
        clearCookies();
        clearFormData();
        WebStorage.getInstance().deleteAllData();
    }

    public WebMessageChannel createCompatWebMessageChannel() {
        String uuid = UUID.randomUUID().toString();
        WebMessageChannel webMessageChannel = new WebMessageChannel(uuid, this);
        this.webMessageChannels.put(uuid, webMessageChannel);
        return webMessageChannel;
    }

    public WebMessageChannel createWebMessageChannel(ValueCallback<WebMessageChannel> valueCallback) {
        WebMessageChannel createCompatWebMessageChannel = createCompatWebMessageChannel();
        valueCallback.onReceiveValue(createCompatWebMessageChannel);
        return createCompatWebMessageChannel;
    }

    public void destroy() {
        super.destroy();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public void dispose() {
        Integer num = this.windowId;
        if (num != null) {
            InAppWebViewChromeClient.windowWebViewMessages.remove(num);
        }
        this.mainLooperHandler.removeCallbacksAndMessages((Object) null);
        mHandler.removeCallbacksAndMessages((Object) null);
        disposeWebMessageChannels();
        disposeWebMessageListeners();
        removeAllViews();
        Runnable runnable = this.checkContextMenuShouldBeClosedTask;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = this.checkScrollStoppedTask;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        this.callAsyncJavaScriptCallbacks.clear();
        this.evaluateJavaScriptContentWorldCallbacks.clear();
        this.inAppBrowserDelegate = null;
        this.inAppWebViewChromeClient = null;
        this.inAppWebViewClient = null;
        this.javaScriptBridgeInterface = null;
        this.inAppWebViewRenderProcessClient = null;
        this.plugin = null;
        super.dispose();
    }

    public void disposeWebMessageChannels() {
        for (WebMessageChannel dispose : this.webMessageChannels.values()) {
            dispose.dispose();
        }
        this.webMessageChannels.clear();
    }

    public void disposeWebMessageListeners() {
        for (WebMessageListener dispose : this.webMessageListeners) {
            dispose.dispose();
        }
        this.webMessageListeners.clear();
    }

    public void enablePluginScriptAtRuntime(final String str, final boolean z, final PluginScript pluginScript) {
        evaluateJavascript("window." + str, (ContentWorld) null, new ValueCallback<String>() {
            public void onReceiveValue(String str) {
                if (str != null && !str.equalsIgnoreCase("null")) {
                    InAppWebView.this.evaluateJavascript("window." + str + " = " + z + ";", (ContentWorld) null, (ValueCallback<String>) null);
                    if (!z) {
                        InAppWebView.this.userContentController.removePluginScript(pluginScript);
                    }
                } else if (z) {
                    InAppWebView.this.evaluateJavascript(pluginScript.getSource(), (ContentWorld) null, (ValueCallback<String>) null);
                    InAppWebView.this.userContentController.addPluginScript(pluginScript);
                }
            }
        });
    }

    public void evaluateJavascript(String str, ContentWorld contentWorld, ValueCallback<String> valueCallback) {
        injectDeferredObject(str, contentWorld, (String) null, valueCallback);
    }

    public void getContentHeight(ValueCallback<Integer> valueCallback) {
        valueCallback.onReceiveValue(Integer.valueOf(getContentHeight()));
    }

    public Map<String, Object> getContextMenu() {
        return this.contextMenu;
    }

    public HashMap<String, Object> getCopyBackForwardList() {
        WebBackForwardList copyBackForwardList = copyBackForwardList();
        int size = copyBackForwardList.getSize();
        int currentIndex = copyBackForwardList.getCurrentIndex();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i);
            HashMap hashMap = new HashMap();
            hashMap.put("originalUrl", itemAtIndex.getOriginalUrl());
            hashMap.put("title", itemAtIndex.getTitle());
            hashMap.put("url", itemAtIndex.getUrl());
            arrayList.add(hashMap);
        }
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("history", arrayList);
        hashMap2.put("currentIndex", Integer.valueOf(currentIndex));
        return hashMap2;
    }

    public void getHitTestResult(ValueCallback<HitTestResult> valueCallback) {
        valueCallback.onReceiveValue(HitTestResult.fromWebViewHitTestResult(getHitTestResult()));
    }

    public InAppBrowserDelegate getInAppBrowserDelegate() {
        return this.inAppBrowserDelegate;
    }

    public Map<String, Object> getOptions() {
        InAppWebViewOptions inAppWebViewOptions = this.options;
        if (inAppWebViewOptions != null) {
            return inAppWebViewOptions.getRealOptions((InAppWebViewInterface) this);
        }
        return null;
    }

    public InAppWebViewFlutterPlugin getPlugin() {
        return this.plugin;
    }

    public void getSelectedText(final ValueCallback<String> valueCallback) {
        evaluateJavascript(PluginScriptsUtil.GET_SELECTED_TEXT_JS_SOURCE, new ValueCallback<String>() {
            public void onReceiveValue(String str) {
                valueCallback.onReceiveValue((str == null || str.equalsIgnoreCase("null")) ? null : str.substring(1, str.length() - 1));
            }
        });
    }

    public UserContentController getUserContentController() {
        return this.userContentController;
    }

    public Map<String, WebMessageChannel> getWebMessageChannels() {
        return this.webMessageChannels;
    }

    public Looper getWebViewLooper() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getWebViewLooper();
        }
        return Looper.getMainLooper();
    }

    public float getZoomScale() {
        return this.zoomScale;
    }

    public void hideContextMenu() {
        removeView(this.floatingContextMenu);
        this.floatingContextMenu = null;
        onHideContextMenu();
    }

    public void injectCSSCode(String str) {
        injectDeferredObject(str, (ContentWorld) null, "(function(d) { var style = d.createElement('style'); style.innerHTML = %s; if (d.head != null) { d.head.appendChild(style); } })(document);", (ValueCallback<String>) null);
    }

    public void injectCSSFileFromUrl(String str, Map<String, Object> map) {
        String str2;
        String str3;
        String str4 = "";
        if (map != null) {
            String str5 = (String) map.get("id");
            if (str5 != null) {
                str3 = str4 + " link.id = '" + str5.replaceAll("'", "\\\\'") + "'; ";
            } else {
                str3 = str4;
            }
            String str6 = (String) map.get("media");
            if (str6 != null) {
                str3 = str3 + " link.media = '" + str6.replaceAll("'", "\\\\'") + "'; ";
            }
            String str7 = (String) map.get("crossOrigin");
            if (str7 != null) {
                str3 = str3 + " link.crossOrigin = '" + str7.replaceAll("'", "\\\\'") + "'; ";
            }
            String str8 = (String) map.get("integrity");
            if (str8 != null) {
                str3 = str3 + " link.integrity = '" + str8.replaceAll("'", "\\\\'") + "'; ";
            }
            String str9 = (String) map.get("referrerPolicy");
            if (str9 != null) {
                str3 = str3 + " link.referrerPolicy = '" + str9.replaceAll("'", "\\\\'") + "'; ";
            }
            Boolean bool = (Boolean) map.get("disabled");
            if (bool != null && bool.booleanValue()) {
                str3 = str3 + " link.disabled = true; ";
            }
            Boolean bool2 = (Boolean) map.get("alternate");
            if (bool2 != null && bool2.booleanValue()) {
                str4 = "alternate ";
            }
            String str10 = (String) map.get("title");
            if (str10 != null) {
                str2 = str3 + " link.title = '" + str10.replaceAll("'", "\\\\'") + "'; ";
            } else {
                str2 = str3;
            }
        } else {
            str2 = str4;
        }
        injectDeferredObject(str, (ContentWorld) null, "(function(d) { var link = d.createElement('link'); link.rel='" + str4 + "stylesheet'; link.type='text/css'; " + str2 + " link.href = %s; if (d.head != null) { d.head.appendChild(link); } })(document);", (ValueCallback<String>) null);
    }

    public void injectDeferredObject(String str, ContentWorld contentWorld, String str2, ValueCallback<String> valueCallback) {
        String str3;
        final String str4;
        final String uuid = (contentWorld == null || contentWorld.equals(ContentWorld.PAGE)) ? null : UUID.randomUUID().toString();
        if (str2 != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            String jSONArray2 = jSONArray.toString();
            str3 = String.format(str2, new Object[]{jSONArray2.substring(1, jSONArray2.length() - 1)});
        } else {
            str3 = str;
        }
        if (uuid == null || valueCallback == null) {
            str4 = str3;
        } else {
            this.evaluateJavaScriptContentWorldCallbacks.put(uuid, valueCallback);
            str4 = Util.replaceAll(PluginScriptsUtil.EVALUATE_JAVASCRIPT_WITH_CONTENT_WORLD_WRAPPER_JS_SOURCE, PluginScriptsUtil.VAR_RANDOM_NAME, "_flutter_inappwebview_" + Math.round(Math.random() * 1000000.0d)).replace(PluginScriptsUtil.VAR_PLACEHOLDER_VALUE, UserContentController.escapeCode(str)).replace(PluginScriptsUtil.VAR_RESULT_UUID, uuid);
        }
        final ContentWorld contentWorld2 = contentWorld;
        final ValueCallback<String> valueCallback2 = valueCallback;
        this.mainLooperHandler.post(new Runnable() {
            public void run() {
                ValueCallback valueCallback;
                String generateCodeForScriptEvaluation = InAppWebView.this.userContentController.generateCodeForScriptEvaluation(str4, contentWorld2);
                if (Build.VERSION.SDK_INT < 19) {
                    InAppWebView inAppWebView = InAppWebView.this;
                    inAppWebView.loadUrl("javascript:" + generateCodeForScriptEvaluation.replaceAll("[\r\n]+", ""));
                    if (contentWorld2 != null && (valueCallback = valueCallback2) != null) {
                        valueCallback.onReceiveValue("");
                        return;
                    }
                    return;
                }
                InAppWebView.this.evaluateJavascript(generateCodeForScriptEvaluation, new ValueCallback<String>() {
                    public void onReceiveValue(String str) {
                        ValueCallback valueCallback;
                        C873010 r0 = C873010.this;
                        if (uuid == null && (valueCallback = valueCallback2) != null) {
                            valueCallback.onReceiveValue(str);
                        }
                    }
                });
            }
        });
    }

    public void injectJavascriptFileFromUrl(String str, Map<String, Object> map) {
        String str2 = "";
        if (map != null) {
            String str3 = (String) map.get("type");
            if (str3 != null) {
                str2 = str2 + " script.type = '" + str3.replaceAll("'", "\\\\'") + "'; ";
            }
            String str4 = (String) map.get("id");
            if (str4 != null) {
                String replaceAll = str4.replaceAll("'", "\\\\'");
                str2 = ((str2 + " script.id = '" + replaceAll + "'; ") + " script.onload = function() {  if (window.flutter_inappwebview != null) {    window.flutter_inappwebview.callHandler('onInjectedScriptLoaded', '" + replaceAll + "');  }};") + " script.onerror = function() {  if (window.flutter_inappwebview != null) {    window.flutter_inappwebview.callHandler('onInjectedScriptError', '" + replaceAll + "');  }};";
            }
            Boolean bool = (Boolean) map.get("async");
            if (bool != null && bool.booleanValue()) {
                str2 = str2 + " script.async = true; ";
            }
            Boolean bool2 = (Boolean) map.get("defer");
            if (bool2 != null && bool2.booleanValue()) {
                str2 = str2 + " script.defer = true; ";
            }
            String str5 = (String) map.get("crossOrigin");
            if (str5 != null) {
                str2 = str2 + " script.crossOrigin = '" + str5.replaceAll("'", "\\\\'") + "'; ";
            }
            String str6 = (String) map.get("integrity");
            if (str6 != null) {
                str2 = str2 + " script.integrity = '" + str6.replaceAll("'", "\\\\'") + "'; ";
            }
            Boolean bool3 = (Boolean) map.get("noModule");
            if (bool3 != null && bool3.booleanValue()) {
                str2 = str2 + " script.noModule = true; ";
            }
            String str7 = (String) map.get("nonce");
            if (str7 != null) {
                str2 = str2 + " script.nonce = '" + str7.replaceAll("'", "\\\\'") + "'; ";
            }
            String str8 = (String) map.get("referrerPolicy");
            if (str8 != null) {
                str2 = str2 + " script.referrerPolicy = '" + str8.replaceAll("'", "\\\\'") + "'; ";
            }
        }
        injectDeferredObject(str, (ContentWorld) null, "(function(d) { var script = d.createElement('script'); " + str2 + " script.src = %s; if (d.body != null) { d.body.appendChild(script); } })(document);", (ValueCallback<String>) null);
    }

    public boolean isLoading() {
        return this.isLoading;
    }

    public void isSecureContext(final ValueCallback<Boolean> valueCallback) {
        evaluateJavascript("window.isSecureContext", new ValueCallback<String>() {
            public void onReceiveValue(String str) {
                if (str == null || str.isEmpty() || str.equalsIgnoreCase("null") || str.equalsIgnoreCase("false")) {
                    valueCallback.onReceiveValue(Boolean.FALSE);
                } else {
                    valueCallback.onReceiveValue(Boolean.TRUE);
                }
            }
        });
    }

    public void loadFile(String str) throws IOException {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null) {
            loadUrl(Util.getUrlAsset(inAppWebViewFlutterPlugin, str));
        }
    }

    public void loadUrl(URLRequest uRLRequest) {
        String url = uRLRequest.getUrl();
        String method = uRLRequest.getMethod();
        if (method == null || !method.equals("POST")) {
            Map<String, String> headers = uRLRequest.getHeaders();
            if (headers != null) {
                loadUrl(url, headers);
            } else {
                loadUrl(url);
            }
        } else {
            postUrl(url, uRLRequest.getBody());
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu2) {
        super.onCreateContextMenu(contextMenu2);
        sendOnCreateContextMenuEvent();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        View view;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null && !this.options.useHybridComposition.booleanValue() && (view = this.containerView) != null) {
            view.getHandler().postDelayed(new Runnable() {
                public void run() {
                    InputMethodManager inputMethodManager = (InputMethodManager) InAppWebView.this.getContext().getSystemService("input_method");
                    if (InAppWebView.this.containerView != null && inputMethodManager != null && !inputMethodManager.isAcceptingText()) {
                        inputMethodManager.hideSoftInputFromWindow(InAppWebView.this.containerView.getWindowToken(), 2);
                    }
                }
            }, 128);
        }
        return onCreateInputConnection;
    }

    public void onFloatingActionGlobalLayout(int i, int i2) {
        int width = getWidth();
        getHeight();
        int width2 = this.floatingContextMenu.getWidth();
        int height = this.floatingContextMenu.getHeight();
        int i3 = i - (width2 / 2);
        if (i3 < 0) {
            i3 = 0;
        } else if (i3 + width2 > width) {
            i3 = width - width2;
        }
        float f = ((float) i2) - (((float) height) * 1.5f);
        if (f < 0.0f) {
            f = (float) (i2 + height);
        }
        updateViewLayout(this.floatingContextMenu, new AbsoluteLayout.LayoutParams(-2, -2, i3, ((int) f) + getScrollY()));
        this.mainLooperHandler.post(new Runnable() {
            public void run() {
                LinearLayout linearLayout = InAppWebView.this.floatingContextMenu;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                    InAppWebView.this.floatingContextMenu.animate().alpha(1.0f).setDuration(100).setListener((Animator.AnimatorListener) null);
                }
            }
        });
    }

    public void onHideContextMenu() {
        this.channel.mo22159c("onHideContextMenu", new HashMap());
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.onOverScrolled(i, i2, z, z2);
        boolean z3 = true;
        boolean z4 = canScrollHorizontally() && z;
        if (!canScrollVertically() || !z2) {
            z3 = false;
        }
        ViewParent parent = getParent();
        if ((parent instanceof PullToRefreshLayout) && z3 && i2 <= 10) {
            PullToRefreshLayout pullToRefreshLayout = (PullToRefreshLayout) parent;
            setOverScrollMode(2);
            pullToRefreshLayout.setEnabled(pullToRefreshLayout.options.enabled.booleanValue());
            setOverScrollMode(this.options.overScrollMode.intValue());
        }
        if (z4 || z3) {
            HashMap hashMap = new HashMap();
            hashMap.put("x", Integer.valueOf(i));
            hashMap.put("y", Integer.valueOf(i2));
            hashMap.put("clampedX", Boolean.valueOf(z4));
            hashMap.put("clampedY", Boolean.valueOf(z3));
            this.channel.mo22159c("onOverScrolled", hashMap);
        }
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        LinearLayout linearLayout = this.floatingContextMenu;
        if (linearLayout != null) {
            linearLayout.setAlpha(0.0f);
            this.floatingContextMenu.setVisibility(8);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("x", Integer.valueOf(i));
        hashMap.put("y", Integer.valueOf(i2));
        this.channel.mo22159c("onScrollChanged", hashMap);
    }

    public void onScrollStopped() {
        if (this.floatingContextMenu != null && Build.VERSION.SDK_INT >= 19) {
            adjustFloatingContextMenuPosition();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.lastTouch = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        ViewParent parent = getParent();
        if (parent instanceof PullToRefreshLayout) {
            PullToRefreshLayout pullToRefreshLayout = (PullToRefreshLayout) parent;
            if (motionEvent.getActionMasked() == 0) {
                pullToRefreshLayout.setEnabled(false);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void postWebMessage(WebMessage webMessage, Uri uri, ValueCallback<String> valueCallback) throws Exception {
        throw new UnsupportedOperationException();
    }

    public void prepare() {
        Integer num;
        Integer num2;
        Integer num3;
        JavaScriptBridgeInterface javaScriptBridgeInterface2 = new JavaScriptBridgeInterface(this);
        this.javaScriptBridgeInterface = javaScriptBridgeInterface2;
        addJavascriptInterface(javaScriptBridgeInterface2, JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME);
        InAppWebViewChromeClient inAppWebViewChromeClient2 = new InAppWebViewChromeClient(this.plugin, this.channel, this.inAppBrowserDelegate);
        this.inAppWebViewChromeClient = inAppWebViewChromeClient2;
        setWebChromeClient(inAppWebViewChromeClient2);
        InAppWebViewClient inAppWebViewClient2 = new InAppWebViewClient(this.channel, this.inAppBrowserDelegate);
        this.inAppWebViewClient = inAppWebViewClient2;
        setWebViewClient(inAppWebViewClient2);
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && C5885k.m34805a("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE")) {
            InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient2 = new InAppWebViewRenderProcessClient(this.channel);
            this.inAppWebViewRenderProcessClient = inAppWebViewRenderProcessClient2;
            C5882j.m34803m(this, inAppWebViewRenderProcessClient2);
        }
        this.userContentController.addPluginScript(PromisePolyfillJS.PROMISE_POLYFILL_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(ConsoleLogJS.CONSOLE_LOG_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(PrintJS.PRINT_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(OnWindowBlurEventJS.ON_WINDOW_BLUR_EVENT_JS_PLUGIN_SCRIPT);
        this.userContentController.addPluginScript(OnWindowFocusEventJS.ON_WINDOW_FOCUS_EVENT_JS_PLUGIN_SCRIPT);
        if (this.options.useShouldInterceptAjaxRequest.booleanValue()) {
            this.userContentController.addPluginScript(InterceptAjaxRequestJS.INTERCEPT_AJAX_REQUEST_JS_PLUGIN_SCRIPT);
        }
        if (this.options.useShouldInterceptFetchRequest.booleanValue()) {
            this.userContentController.addPluginScript(InterceptFetchRequestJS.INTERCEPT_FETCH_REQUEST_JS_PLUGIN_SCRIPT);
        }
        if (this.options.useOnLoadResource.booleanValue()) {
            this.userContentController.addPluginScript(OnLoadResourceJS.ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT);
        }
        if (!this.options.useHybridComposition.booleanValue()) {
            this.userContentController.addPluginScript(PluginScriptsUtil.f36280x4e848d3b);
        }
        if (this.options.useOnDownloadStart.booleanValue()) {
            setDownloadListener(new DownloadStartListener());
        }
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(this.options.javaScriptEnabled.booleanValue());
        settings.setJavaScriptCanOpenWindowsAutomatically(this.options.javaScriptCanOpenWindowsAutomatically.booleanValue());
        settings.setBuiltInZoomControls(this.options.builtInZoomControls.booleanValue());
        settings.setDisplayZoomControls(this.options.displayZoomControls.booleanValue());
        settings.setSupportMultipleWindows(this.options.supportMultipleWindows.booleanValue());
        if (i >= 26) {
            settings.setSafeBrowsingEnabled(this.options.safeBrowsingEnabled.booleanValue());
        }
        settings.setMediaPlaybackRequiresUserGesture(this.options.mediaPlaybackRequiresUserGesture.booleanValue());
        settings.setDatabaseEnabled(this.options.databaseEnabled.booleanValue());
        settings.setDomStorageEnabled(this.options.domStorageEnabled.booleanValue());
        String str = this.options.userAgent;
        if (str != null && !str.isEmpty()) {
            settings.setUserAgentString(this.options.userAgent);
        } else if (i >= 17) {
            settings.setUserAgentString(WebSettings.getDefaultUserAgent(getContext()));
        }
        String str2 = this.options.applicationNameForUserAgent;
        if (str2 != null && !str2.isEmpty() && i >= 17) {
            String str3 = this.options.userAgent;
            String defaultUserAgent = (str3 == null || str3.isEmpty()) ? WebSettings.getDefaultUserAgent(getContext()) : this.options.userAgent;
            settings.setUserAgentString(defaultUserAgent + " " + this.options.applicationNameForUserAgent);
        }
        if (this.options.clearCache.booleanValue()) {
            clearAllCache();
        } else if (this.options.clearSessionCache.booleanValue()) {
            CookieManager.getInstance().removeSessionCookie();
        }
        if (i >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this, this.options.thirdPartyCookiesEnabled.booleanValue());
        }
        settings.setLoadWithOverviewMode(this.options.loadWithOverviewMode.booleanValue());
        settings.setUseWideViewPort(this.options.useWideViewPort.booleanValue());
        settings.setSupportZoom(this.options.supportZoom.booleanValue());
        settings.setTextZoom(this.options.textZoom.intValue());
        setVerticalScrollBarEnabled(!this.options.disableVerticalScroll.booleanValue() && this.options.verticalScrollBarEnabled.booleanValue());
        setHorizontalScrollBarEnabled(!this.options.disableHorizontalScroll.booleanValue() && this.options.horizontalScrollBarEnabled.booleanValue());
        if (this.options.transparentBackground.booleanValue()) {
            setBackgroundColor(0);
        }
        if (i >= 21 && (num3 = this.options.mixedContentMode) != null) {
            settings.setMixedContentMode(num3.intValue());
        }
        settings.setAllowContentAccess(this.options.allowContentAccess.booleanValue());
        settings.setAllowFileAccess(this.options.allowFileAccess.booleanValue());
        settings.setAllowFileAccessFromFileURLs(this.options.allowFileAccessFromFileURLs.booleanValue());
        settings.setAllowUniversalAccessFromFileURLs(this.options.allowUniversalAccessFromFileURLs.booleanValue());
        setCacheEnabled(this.options.cacheEnabled.booleanValue());
        String str4 = this.options.appCachePath;
        if (str4 != null && !str4.isEmpty() && this.options.cacheEnabled.booleanValue()) {
            Util.invokeMethodIfExists(settings, "setAppCachePath", this.options.appCachePath);
        }
        settings.setBlockNetworkImage(this.options.blockNetworkImage.booleanValue());
        settings.setBlockNetworkLoads(this.options.blockNetworkLoads.booleanValue());
        Integer num4 = this.options.cacheMode;
        if (num4 != null) {
            settings.setCacheMode(num4.intValue());
        }
        settings.setCursiveFontFamily(this.options.cursiveFontFamily);
        settings.setDefaultFixedFontSize(this.options.defaultFixedFontSize.intValue());
        settings.setDefaultFontSize(this.options.defaultFontSize.intValue());
        settings.setDefaultTextEncodingName(this.options.defaultTextEncodingName);
        if (i >= 24 && (num2 = this.options.disabledActionModeMenuItems) != null) {
            settings.setDisabledActionModeMenuItems(num2.intValue());
        }
        settings.setFantasyFontFamily(this.options.fantasyFontFamily);
        settings.setFixedFontFamily(this.options.fixedFontFamily);
        if (i >= 29 && (num = this.options.forceDark) != null) {
            settings.setForceDark(num.intValue());
        }
        settings.setGeolocationEnabled(this.options.geolocationEnabled.booleanValue());
        WebSettings.LayoutAlgorithm layoutAlgorithm = this.options.layoutAlgorithm;
        if (layoutAlgorithm != null) {
            if (i < 19 || !layoutAlgorithm.equals(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING)) {
                settings.setLayoutAlgorithm(this.options.layoutAlgorithm);
            } else {
                settings.setLayoutAlgorithm(this.options.layoutAlgorithm);
            }
        }
        settings.setLoadsImagesAutomatically(this.options.loadsImagesAutomatically.booleanValue());
        settings.setMinimumFontSize(this.options.minimumFontSize.intValue());
        settings.setMinimumLogicalFontSize(this.options.minimumLogicalFontSize.intValue());
        setInitialScale(this.options.initialScale.intValue());
        settings.setNeedInitialFocus(this.options.needInitialFocus.booleanValue());
        if (i >= 23) {
            settings.setOffscreenPreRaster(this.options.offscreenPreRaster.booleanValue());
        }
        settings.setSansSerifFontFamily(this.options.sansSerifFontFamily);
        settings.setSerifFontFamily(this.options.serifFontFamily);
        settings.setStandardFontFamily(this.options.standardFontFamily);
        Integer num5 = this.options.preferredContentMode;
        if (num5 != null && num5.intValue() == PreferredContentModeOptionType.DESKTOP.toValue()) {
            setDesktopMode(true);
        }
        settings.setSaveFormData(this.options.saveFormData.booleanValue());
        if (this.options.incognito.booleanValue()) {
            setIncognito(true);
        }
        if (this.options.hardwareAcceleration.booleanValue()) {
            setLayerType(2, (Paint) null);
        } else {
            setLayerType(1, (Paint) null);
        }
        String str5 = this.options.regexToCancelSubFramesLoading;
        if (str5 != null) {
            this.regexToCancelSubFramesLoadingCompiled = Pattern.compile(str5);
        }
        setScrollBarStyle(this.options.scrollBarStyle.intValue());
        InAppWebViewOptions inAppWebViewOptions = this.options;
        Integer num6 = inAppWebViewOptions.scrollBarDefaultDelayBeforeFade;
        if (num6 != null) {
            setScrollBarDefaultDelayBeforeFade(num6.intValue());
        } else {
            inAppWebViewOptions.scrollBarDefaultDelayBeforeFade = Integer.valueOf(getScrollBarDefaultDelayBeforeFade());
        }
        setScrollbarFadingEnabled(this.options.scrollbarFadingEnabled.booleanValue());
        InAppWebViewOptions inAppWebViewOptions2 = this.options;
        Integer num7 = inAppWebViewOptions2.scrollBarFadeDuration;
        if (num7 != null) {
            setScrollBarFadeDuration(num7.intValue());
        } else {
            inAppWebViewOptions2.scrollBarFadeDuration = Integer.valueOf(getScrollBarFadeDuration());
        }
        setVerticalScrollbarPosition(this.options.verticalScrollbarPosition.intValue());
        if (i >= 29) {
            if (this.options.verticalScrollbarThumbColor != null) {
                setVerticalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(this.options.verticalScrollbarThumbColor)));
            }
            if (this.options.verticalScrollbarTrackColor != null) {
                setVerticalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(this.options.verticalScrollbarTrackColor)));
            }
            if (this.options.horizontalScrollbarThumbColor != null) {
                setHorizontalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(this.options.horizontalScrollbarThumbColor)));
            }
            if (this.options.horizontalScrollbarTrackColor != null) {
                setHorizontalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(this.options.horizontalScrollbarTrackColor)));
            }
        }
        setOverScrollMode(this.options.overScrollMode.intValue());
        Boolean bool = this.options.networkAvailable;
        if (bool != null) {
            setNetworkAvailable(bool.booleanValue());
        }
        Map<String, Object> map = this.options.rendererPriorityPolicy;
        if (map != null && !map.isEmpty() && i >= 26) {
            setRendererPriorityPolicy(((Integer) this.options.rendererPriorityPolicy.get("rendererRequestedPriority")).intValue(), ((Boolean) this.options.rendererPriorityPolicy.get("waivedWhenNotVisible")).booleanValue());
        }
        this.contentBlockerHandler.getRuleList().clear();
        for (Map next : this.options.contentBlockers) {
            this.contentBlockerHandler.getRuleList().add(new ContentBlocker(ContentBlockerTrigger.fromMap((Map) next.get("trigger")), ContentBlockerAction.fromMap((Map) next.get("action"))));
        }
        setFindListener(new WebView.FindListener() {
            public void onFindResultReceived(int i, int i2, boolean z) {
                HashMap hashMap = new HashMap();
                hashMap.put("activeMatchOrdinal", Integer.valueOf(i));
                hashMap.put("numberOfMatches", Integer.valueOf(i2));
                hashMap.put("isDoneCounting", Boolean.valueOf(z));
                InAppWebView.this.channel.mo22159c("onFindResultReceived", hashMap);
            }
        });
        this.gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() {
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                InAppWebView inAppWebView = InAppWebView.this;
                if (inAppWebView.floatingContextMenu != null) {
                    inAppWebView.hideContextMenu();
                }
                return super.onSingleTapUp(motionEvent);
            }
        });
        this.checkScrollStoppedTask = new Runnable() {
            public void run() {
                int scrollY = InAppWebView.this.getScrollY();
                InAppWebView inAppWebView = InAppWebView.this;
                if (inAppWebView.initialPositionScrollStoppedTask - scrollY == 0) {
                    inAppWebView.onScrollStopped();
                    return;
                }
                inAppWebView.initialPositionScrollStoppedTask = inAppWebView.getScrollY();
                InAppWebView inAppWebView2 = InAppWebView.this;
                inAppWebView2.mainLooperHandler.postDelayed(inAppWebView2.checkScrollStoppedTask, (long) inAppWebView2.newCheckScrollStoppedTask);
            }
        };
        if (Build.VERSION.SDK_INT >= 19 && !this.options.useHybridComposition.booleanValue()) {
            this.checkContextMenuShouldBeClosedTask = new Runnable() {
                public void run() {
                    InAppWebView inAppWebView = InAppWebView.this;
                    if (inAppWebView.floatingContextMenu != null) {
                        inAppWebView.evaluateJavascript(PluginScriptsUtil.CHECK_CONTEXT_MENU_SHOULD_BE_HIDDEN_JS_SOURCE, new ValueCallback<String>() {
                            public void onReceiveValue(String str) {
                                if (str == null || str.equals("true")) {
                                    InAppWebView inAppWebView = InAppWebView.this;
                                    if (inAppWebView.floatingContextMenu != null) {
                                        inAppWebView.hideContextMenu();
                                        return;
                                    }
                                    return;
                                }
                                InAppWebView inAppWebView2 = InAppWebView.this;
                                inAppWebView2.mainLooperHandler.postDelayed(inAppWebView2.checkContextMenuShouldBeClosedTask, (long) inAppWebView2.newCheckContextMenuShouldBeClosedTaskTask);
                            }
                        });
                    }
                }
            };
        }
        setOnTouchListener(new View.OnTouchListener() {
            float m_downX;
            float m_downY;

            public boolean onTouch(View view, MotionEvent motionEvent) {
                InAppWebView.this.gestureDetector.onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 1) {
                    InAppWebView.this.checkScrollStoppedTask.run();
                }
                if (!InAppWebView.this.options.disableHorizontalScroll.booleanValue() || !InAppWebView.this.options.disableVerticalScroll.booleanValue()) {
                    if (InAppWebView.this.options.disableHorizontalScroll.booleanValue() || InAppWebView.this.options.disableVerticalScroll.booleanValue()) {
                        int action = motionEvent.getAction();
                        if (action == 0) {
                            this.m_downX = motionEvent.getX();
                            this.m_downY = motionEvent.getY();
                        } else if (action == 1 || action == 2 || action == 3) {
                            if (InAppWebView.this.options.disableHorizontalScroll.booleanValue()) {
                                motionEvent.setLocation(this.m_downX, motionEvent.getY());
                            } else {
                                motionEvent.setLocation(motionEvent.getX(), this.m_downY);
                            }
                        }
                    }
                    return false;
                } else if (motionEvent.getAction() == 2) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View view) {
                InAppWebView.this.channel.mo22159c("onLongPressHitTestResult", HitTestResult.fromWebViewHitTestResult(InAppWebView.this.getHitTestResult()).toMap());
                return false;
            }
        });
    }

    public void printCurrentPage() {
        Activity activity;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null && (activity = inAppWebViewFlutterPlugin.activity) != null) {
            PrintManager printManager = (PrintManager) activity.getSystemService("print");
            if (printManager != null) {
                String str = getTitle() + " Document";
                printManager.print(str, createPrintDocumentAdapter(str), new PrintAttributes.Builder().build());
                return;
            }
            Log.e(LOG_TAG, "No PrintManager available");
        }
    }

    public ActionMode rebuildActionMode(ActionMode actionMode, ActionMode.Callback callback) {
        boolean z;
        View view;
        ActionMode actionMode2 = actionMode;
        if (!this.options.useHybridComposition.booleanValue() && (view = this.containerView) != null) {
            onWindowFocusChanged(view.isFocused());
        }
        final int i = 0;
        if (this.floatingContextMenu != null) {
            hideContextMenu();
            z = true;
        } else {
            z = false;
        }
        if (actionMode2 == null) {
            return null;
        }
        Menu menu = actionMode.getMenu();
        if (Build.VERSION.SDK_INT >= 23) {
            actionMode2.hide(3000);
        }
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < menu.size(); i2++) {
            arrayList.add(menu.getItem(i2));
        }
        menu.clear();
        actionMode.finish();
        if (this.options.disableContextMenu.booleanValue()) {
            return actionMode2;
        }
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(C8710R.C8713layout.floating_action_mode, this, false);
        this.floatingContextMenu = linearLayout;
        LinearLayout linearLayout2 = (LinearLayout) ((HorizontalScrollView) linearLayout.getChildAt(0)).getChildAt(0);
        List arrayList2 = new ArrayList();
        ContextMenuOptions contextMenuOptions = new ContextMenuOptions();
        Map<String, Object> map = this.contextMenu;
        if (map != null) {
            arrayList2 = (List) map.get("menuItems");
            Map map2 = (Map) this.contextMenu.get("options");
            if (map2 != null) {
                contextMenuOptions.parse(map2);
            }
        }
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        List<Map> list = arrayList2;
        Boolean bool = contextMenuOptions.hideDefaultSystemContextMenuItems;
        if (bool == null || !bool.booleanValue()) {
            for (final MenuItem menuItem : arrayList) {
                final int itemId = menuItem.getItemId();
                final String charSequence = menuItem.getTitle().toString();
                TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C8710R.C8713layout.floating_action_mode_item, this, false);
                textView.setText(charSequence);
                final ActionMode.Callback callback2 = callback;
                final ActionMode actionMode3 = actionMode;
                textView.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        InAppWebView.this.hideContextMenu();
                        callback2.onActionItemClicked(actionMode3, menuItem);
                        HashMap hashMap = new HashMap();
                        hashMap.put("androidId", Integer.valueOf(itemId));
                        hashMap.put("iosId", (Object) null);
                        hashMap.put("title", charSequence);
                        InAppWebView.this.channel.mo22159c("onContextMenuActionItemClicked", hashMap);
                    }
                });
                if (this.floatingContextMenu != null) {
                    linearLayout2.addView(textView);
                }
            }
        }
        for (Map map3 : list) {
            final int intValue = ((Integer) map3.get("androidId")).intValue();
            final String str = (String) map3.get("title");
            TextView textView2 = (TextView) LayoutInflater.from(getContext()).inflate(C8710R.C8713layout.floating_action_mode_item, this, false);
            textView2.setText(str);
            textView2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    InAppWebView.this.hideContextMenu();
                    HashMap hashMap = new HashMap();
                    hashMap.put("androidId", Integer.valueOf(intValue));
                    hashMap.put("iosId", (Object) null);
                    hashMap.put("title", str);
                    InAppWebView.this.channel.mo22159c("onContextMenuActionItemClicked", hashMap);
                }
            });
            if (this.floatingContextMenu != null) {
                linearLayout2.addView(textView2);
            }
        }
        Point point = this.lastTouch;
        final int i3 = point != null ? point.x : 0;
        if (point != null) {
            i = point.y;
        }
        this.contextMenuPoint = new Point(i3, i);
        LinearLayout linearLayout3 = this.floatingContextMenu;
        if (linearLayout3 != null) {
            linearLayout3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                public void onGlobalLayout() {
                    LinearLayout linearLayout = InAppWebView.this.floatingContextMenu;
                    if (linearLayout != null) {
                        linearLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        if (InAppWebView.this.getSettings().getJavaScriptEnabled()) {
                            InAppWebView.this.onScrollStopped();
                        } else {
                            InAppWebView.this.onFloatingActionGlobalLayout(i3, i);
                        }
                    }
                }
            });
            addView(this.floatingContextMenu, new AbsoluteLayout.LayoutParams(-2, -2, i3, i));
            if (z) {
                sendOnCreateContextMenuEvent();
            }
            Runnable runnable = this.checkContextMenuShouldBeClosedTask;
            if (runnable != null) {
                runnable.run();
            }
        }
        return actionMode2;
    }

    public Map<String, Object> requestFocusNodeHref() {
        Message obtainMessage = mHandler.obtainMessage();
        requestFocusNodeHref(obtainMessage);
        Bundle peekData = obtainMessage.peekData();
        HashMap hashMap = new HashMap();
        hashMap.put("src", peekData.getString("src"));
        hashMap.put("url", peekData.getString("url"));
        hashMap.put("title", peekData.getString("title"));
        return hashMap;
    }

    public Map<String, Object> requestImageRef() {
        Message obtainMessage = mHandler.obtainMessage();
        requestImageRef(obtainMessage);
        Bundle peekData = obtainMessage.peekData();
        HashMap hashMap = new HashMap();
        hashMap.put("url", peekData.getString("url"));
        return hashMap;
    }

    public void scrollBy(Integer num, Integer num2, Boolean bool) {
        if (bool.booleanValue()) {
            ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{PropertyValuesHolder.ofInt("scrollX", new int[]{getScrollX() + num.intValue()}), PropertyValuesHolder.ofInt("scrollY", new int[]{getScrollY() + num2.intValue()})}).setDuration(300).start();
            return;
        }
        scrollBy(num.intValue(), num2.intValue());
    }

    public void scrollTo(Integer num, Integer num2, Boolean bool) {
        if (bool.booleanValue()) {
            ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{PropertyValuesHolder.ofInt("scrollX", new int[]{num.intValue()}), PropertyValuesHolder.ofInt("scrollY", new int[]{num2.intValue()})}).setDuration(300).start();
            return;
        }
        scrollTo(num.intValue(), num2.intValue());
    }

    public void setCacheEnabled(boolean z) {
        WebSettings settings = getSettings();
        if (z) {
            Context context = getContext();
            if (context != null) {
                Util.invokeMethodIfExists(settings, "setAppCachePath", context.getCacheDir().getAbsolutePath());
                settings.setCacheMode(-1);
                Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.TRUE);
                return;
            }
            return;
        }
        settings.setCacheMode(2);
        Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.FALSE);
    }

    public void setContextMenu(Map<String, Object> map) {
        this.contextMenu = map;
    }

    public void setDesktopMode(boolean z) {
        String str;
        WebSettings settings = getSettings();
        if (z) {
            str = settings.getUserAgentString().replace("Mobile", "eliboM").replace("Android", "diordnA");
        } else {
            str = settings.getUserAgentString().replace("eliboM", "Mobile").replace("diordnA", "Android");
        }
        settings.setUserAgentString(str);
        settings.setUseWideViewPort(z);
        settings.setLoadWithOverviewMode(z);
        settings.setSupportZoom(z);
        settings.setBuiltInZoomControls(z);
    }

    public void setInAppBrowserDelegate(InAppBrowserDelegate inAppBrowserDelegate2) {
        this.inAppBrowserDelegate = inAppBrowserDelegate2;
    }

    public void setIncognito(boolean z) {
        WebSettings settings = getSettings();
        if (z) {
            if (Build.VERSION.SDK_INT >= 21) {
                CookieManager.getInstance().removeAllCookies((ValueCallback) null);
            } else {
                CookieManager.getInstance().removeAllCookie();
            }
            settings.setCacheMode(2);
            Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.FALSE);
            clearHistory();
            clearCache(true);
            clearFormData();
            settings.setSavePassword(false);
            settings.setSaveFormData(false);
            return;
        }
        settings.setCacheMode(-1);
        Util.invokeMethodIfExists(settings, "setAppCacheEnabled", Boolean.TRUE);
        settings.setSavePassword(true);
        settings.setSaveFormData(true);
    }

    public void setOptions(InAppWebViewOptions inAppWebViewOptions, HashMap<String, Object> hashMap) {
        Map<String, Object> map;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Integer num;
        Integer num2;
        String str;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        Boolean bool8;
        Boolean bool9;
        Boolean bool10;
        WebSettings.LayoutAlgorithm layoutAlgorithm;
        Boolean bool11;
        Integer num3;
        Boolean bool12;
        Boolean bool13;
        String str2;
        Boolean bool14;
        Boolean bool15;
        Boolean bool16;
        Boolean bool17;
        Boolean bool18;
        Boolean bool19;
        Boolean bool20;
        Integer num4;
        Boolean bool21;
        Boolean bool22;
        Boolean bool23;
        Boolean bool24;
        Boolean bool25;
        Boolean bool26;
        Boolean bool27;
        Boolean bool28;
        Boolean bool29;
        Boolean bool30;
        Boolean bool31;
        Boolean bool32;
        Boolean bool33;
        Boolean bool34;
        Boolean bool35;
        Boolean bool36;
        WebSettings settings = getSettings();
        if (!(hashMap.get("javaScriptEnabled") == null || this.options.javaScriptEnabled == (bool36 = inAppWebViewOptions.javaScriptEnabled))) {
            settings.setJavaScriptEnabled(bool36.booleanValue());
        }
        if (!(hashMap.get("useShouldInterceptAjaxRequest") == null || this.options.useShouldInterceptAjaxRequest == (bool35 = inAppWebViewOptions.useShouldInterceptAjaxRequest))) {
            enablePluginScriptAtRuntime(InterceptAjaxRequestJS.FLAG_VARIABLE_FOR_SHOULD_INTERCEPT_AJAX_REQUEST_JS_SOURCE, bool35.booleanValue(), InterceptAjaxRequestJS.INTERCEPT_AJAX_REQUEST_JS_PLUGIN_SCRIPT);
        }
        if (!(hashMap.get("useShouldInterceptFetchRequest") == null || this.options.useShouldInterceptFetchRequest == (bool34 = inAppWebViewOptions.useShouldInterceptFetchRequest))) {
            enablePluginScriptAtRuntime(InterceptFetchRequestJS.FLAG_VARIABLE_FOR_SHOULD_INTERCEPT_FETCH_REQUEST_JS_SOURCE, bool34.booleanValue(), InterceptFetchRequestJS.INTERCEPT_FETCH_REQUEST_JS_PLUGIN_SCRIPT);
        }
        if (!(hashMap.get("useOnLoadResource") == null || this.options.useOnLoadResource == (bool33 = inAppWebViewOptions.useOnLoadResource))) {
            enablePluginScriptAtRuntime(OnLoadResourceJS.FLAG_VARIABLE_FOR_ON_LOAD_RESOURCE_JS_SOURCE, bool33.booleanValue(), OnLoadResourceJS.ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT);
        }
        if (!(hashMap.get("javaScriptCanOpenWindowsAutomatically") == null || this.options.javaScriptCanOpenWindowsAutomatically == (bool32 = inAppWebViewOptions.javaScriptCanOpenWindowsAutomatically))) {
            settings.setJavaScriptCanOpenWindowsAutomatically(bool32.booleanValue());
        }
        if (!(hashMap.get("builtInZoomControls") == null || this.options.builtInZoomControls == (bool31 = inAppWebViewOptions.builtInZoomControls))) {
            settings.setBuiltInZoomControls(bool31.booleanValue());
        }
        if (!(hashMap.get("displayZoomControls") == null || this.options.displayZoomControls == (bool30 = inAppWebViewOptions.displayZoomControls))) {
            settings.setDisplayZoomControls(bool30.booleanValue());
        }
        if (!(hashMap.get("safeBrowsingEnabled") == null || this.options.safeBrowsingEnabled == (bool29 = inAppWebViewOptions.safeBrowsingEnabled) || Build.VERSION.SDK_INT < 26)) {
            settings.setSafeBrowsingEnabled(bool29.booleanValue());
        }
        if (!(hashMap.get("mediaPlaybackRequiresUserGesture") == null || this.options.mediaPlaybackRequiresUserGesture == (bool28 = inAppWebViewOptions.mediaPlaybackRequiresUserGesture))) {
            settings.setMediaPlaybackRequiresUserGesture(bool28.booleanValue());
        }
        if (!(hashMap.get("databaseEnabled") == null || this.options.databaseEnabled == (bool27 = inAppWebViewOptions.databaseEnabled))) {
            settings.setDatabaseEnabled(bool27.booleanValue());
        }
        if (!(hashMap.get("domStorageEnabled") == null || this.options.domStorageEnabled == (bool26 = inAppWebViewOptions.domStorageEnabled))) {
            settings.setDomStorageEnabled(bool26.booleanValue());
        }
        if (hashMap.get("userAgent") != null && !this.options.userAgent.equals(inAppWebViewOptions.userAgent) && !inAppWebViewOptions.userAgent.isEmpty()) {
            settings.setUserAgentString(inAppWebViewOptions.userAgent);
        }
        if (hashMap.get("applicationNameForUserAgent") != null && !this.options.applicationNameForUserAgent.equals(inAppWebViewOptions.applicationNameForUserAgent) && !inAppWebViewOptions.applicationNameForUserAgent.isEmpty() && Build.VERSION.SDK_INT >= 17) {
            String str3 = inAppWebViewOptions.userAgent;
            String defaultUserAgent = (str3 == null || str3.isEmpty()) ? WebSettings.getDefaultUserAgent(getContext()) : inAppWebViewOptions.userAgent;
            settings.setUserAgentString(defaultUserAgent + " " + this.options.applicationNameForUserAgent);
        }
        if (hashMap.get("clearCache") != null && inAppWebViewOptions.clearCache.booleanValue()) {
            clearAllCache();
        } else if (hashMap.get("clearSessionCache") != null && inAppWebViewOptions.clearSessionCache.booleanValue()) {
            CookieManager.getInstance().removeSessionCookie();
        }
        if (!(hashMap.get("thirdPartyCookiesEnabled") == null || this.options.thirdPartyCookiesEnabled == inAppWebViewOptions.thirdPartyCookiesEnabled || Build.VERSION.SDK_INT < 21)) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this, inAppWebViewOptions.thirdPartyCookiesEnabled.booleanValue());
        }
        if (!(hashMap.get("useWideViewPort") == null || this.options.useWideViewPort == (bool25 = inAppWebViewOptions.useWideViewPort))) {
            settings.setUseWideViewPort(bool25.booleanValue());
        }
        if (!(hashMap.get("supportZoom") == null || this.options.supportZoom == (bool24 = inAppWebViewOptions.supportZoom))) {
            settings.setSupportZoom(bool24.booleanValue());
        }
        if (hashMap.get("textZoom") != null && !this.options.textZoom.equals(inAppWebViewOptions.textZoom)) {
            settings.setTextZoom(inAppWebViewOptions.textZoom.intValue());
        }
        if (!(hashMap.get("verticalScrollBarEnabled") == null || this.options.verticalScrollBarEnabled == (bool23 = inAppWebViewOptions.verticalScrollBarEnabled))) {
            setVerticalScrollBarEnabled(bool23.booleanValue());
        }
        if (!(hashMap.get("horizontalScrollBarEnabled") == null || this.options.horizontalScrollBarEnabled == (bool22 = inAppWebViewOptions.horizontalScrollBarEnabled))) {
            setHorizontalScrollBarEnabled(bool22.booleanValue());
        }
        boolean z = false;
        if (!(hashMap.get("transparentBackground") == null || this.options.transparentBackground == (bool21 = inAppWebViewOptions.transparentBackground))) {
            if (bool21.booleanValue()) {
                setBackgroundColor(0);
            } else {
                setBackgroundColor(Color.parseColor("#FFFFFF"));
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 21 && hashMap.get("mixedContentMode") != null && ((num4 = this.options.mixedContentMode) == null || !num4.equals(inAppWebViewOptions.mixedContentMode))) {
            settings.setMixedContentMode(inAppWebViewOptions.mixedContentMode.intValue());
        }
        if (!(hashMap.get("supportMultipleWindows") == null || this.options.supportMultipleWindows == (bool20 = inAppWebViewOptions.supportMultipleWindows))) {
            settings.setSupportMultipleWindows(bool20.booleanValue());
        }
        if (!(hashMap.get("useOnDownloadStart") == null || this.options.useOnDownloadStart == (bool19 = inAppWebViewOptions.useOnDownloadStart))) {
            if (bool19.booleanValue()) {
                setDownloadListener(new DownloadStartListener());
            } else {
                setDownloadListener((DownloadListener) null);
            }
        }
        if (!(hashMap.get("allowContentAccess") == null || this.options.allowContentAccess == (bool18 = inAppWebViewOptions.allowContentAccess))) {
            settings.setAllowContentAccess(bool18.booleanValue());
        }
        if (!(hashMap.get("allowFileAccess") == null || this.options.allowFileAccess == (bool17 = inAppWebViewOptions.allowFileAccess))) {
            settings.setAllowFileAccess(bool17.booleanValue());
        }
        if (!(hashMap.get("allowFileAccessFromFileURLs") == null || this.options.allowFileAccessFromFileURLs == (bool16 = inAppWebViewOptions.allowFileAccessFromFileURLs))) {
            settings.setAllowFileAccessFromFileURLs(bool16.booleanValue());
        }
        if (!(hashMap.get("allowUniversalAccessFromFileURLs") == null || this.options.allowUniversalAccessFromFileURLs == (bool15 = inAppWebViewOptions.allowUniversalAccessFromFileURLs))) {
            settings.setAllowUniversalAccessFromFileURLs(bool15.booleanValue());
        }
        if (!(hashMap.get("cacheEnabled") == null || this.options.cacheEnabled == (bool14 = inAppWebViewOptions.cacheEnabled))) {
            setCacheEnabled(bool14.booleanValue());
        }
        if (hashMap.get("appCachePath") != null && ((str2 = this.options.appCachePath) == null || !str2.equals(inAppWebViewOptions.appCachePath))) {
            Util.invokeMethodIfExists(settings, "setAppCachePath", inAppWebViewOptions.appCachePath);
        }
        if (!(hashMap.get("blockNetworkImage") == null || this.options.blockNetworkImage == (bool13 = inAppWebViewOptions.blockNetworkImage))) {
            settings.setBlockNetworkImage(bool13.booleanValue());
        }
        if (!(hashMap.get("blockNetworkLoads") == null || this.options.blockNetworkLoads == (bool12 = inAppWebViewOptions.blockNetworkLoads))) {
            settings.setBlockNetworkLoads(bool12.booleanValue());
        }
        if (hashMap.get("cacheMode") != null && !this.options.cacheMode.equals(inAppWebViewOptions.cacheMode)) {
            settings.setCacheMode(inAppWebViewOptions.cacheMode.intValue());
        }
        if (hashMap.get("cursiveFontFamily") != null && !this.options.cursiveFontFamily.equals(inAppWebViewOptions.cursiveFontFamily)) {
            settings.setCursiveFontFamily(inAppWebViewOptions.cursiveFontFamily);
        }
        if (hashMap.get("defaultFixedFontSize") != null && !this.options.defaultFixedFontSize.equals(inAppWebViewOptions.defaultFixedFontSize)) {
            settings.setDefaultFixedFontSize(inAppWebViewOptions.defaultFixedFontSize.intValue());
        }
        if (hashMap.get("defaultFontSize") != null && !this.options.defaultFontSize.equals(inAppWebViewOptions.defaultFontSize)) {
            settings.setDefaultFontSize(inAppWebViewOptions.defaultFontSize.intValue());
        }
        if (hashMap.get("defaultTextEncodingName") != null && !this.options.defaultTextEncodingName.equals(inAppWebViewOptions.defaultTextEncodingName)) {
            settings.setDefaultTextEncodingName(inAppWebViewOptions.defaultTextEncodingName);
        }
        if (i >= 24 && hashMap.get("disabledActionModeMenuItems") != null && ((num3 = this.options.disabledActionModeMenuItems) == null || !num3.equals(inAppWebViewOptions.disabledActionModeMenuItems))) {
            settings.setDisabledActionModeMenuItems(inAppWebViewOptions.disabledActionModeMenuItems.intValue());
        }
        if (hashMap.get("fantasyFontFamily") != null && !this.options.fantasyFontFamily.equals(inAppWebViewOptions.fantasyFontFamily)) {
            settings.setFantasyFontFamily(inAppWebViewOptions.fantasyFontFamily);
        }
        if (hashMap.get("fixedFontFamily") != null && !this.options.fixedFontFamily.equals(inAppWebViewOptions.fixedFontFamily)) {
            settings.setFixedFontFamily(inAppWebViewOptions.fixedFontFamily);
        }
        if (hashMap.get("forceDark") != null && !this.options.forceDark.equals(inAppWebViewOptions.forceDark) && i >= 29) {
            settings.setForceDark(inAppWebViewOptions.forceDark.intValue());
        }
        if (!(hashMap.get("geolocationEnabled") == null || this.options.geolocationEnabled == (bool11 = inAppWebViewOptions.geolocationEnabled))) {
            settings.setGeolocationEnabled(bool11.booleanValue());
        }
        if (!(hashMap.get("layoutAlgorithm") == null || this.options.layoutAlgorithm == (layoutAlgorithm = inAppWebViewOptions.layoutAlgorithm))) {
            if (i < 19 || !layoutAlgorithm.equals(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING)) {
                settings.setLayoutAlgorithm(inAppWebViewOptions.layoutAlgorithm);
            } else {
                settings.setLayoutAlgorithm(inAppWebViewOptions.layoutAlgorithm);
            }
        }
        if (!(hashMap.get("loadWithOverviewMode") == null || this.options.loadWithOverviewMode == (bool10 = inAppWebViewOptions.loadWithOverviewMode))) {
            settings.setLoadWithOverviewMode(bool10.booleanValue());
        }
        if (!(hashMap.get("loadsImagesAutomatically") == null || this.options.loadsImagesAutomatically == (bool9 = inAppWebViewOptions.loadsImagesAutomatically))) {
            settings.setLoadsImagesAutomatically(bool9.booleanValue());
        }
        if (hashMap.get("minimumFontSize") != null && !this.options.minimumFontSize.equals(inAppWebViewOptions.minimumFontSize)) {
            settings.setMinimumFontSize(inAppWebViewOptions.minimumFontSize.intValue());
        }
        if (hashMap.get("minimumLogicalFontSize") != null && !this.options.minimumLogicalFontSize.equals(inAppWebViewOptions.minimumLogicalFontSize)) {
            settings.setMinimumLogicalFontSize(inAppWebViewOptions.minimumLogicalFontSize.intValue());
        }
        if (hashMap.get("initialScale") != null && !this.options.initialScale.equals(inAppWebViewOptions.initialScale)) {
            setInitialScale(inAppWebViewOptions.initialScale.intValue());
        }
        if (!(hashMap.get("needInitialFocus") == null || this.options.needInitialFocus == (bool8 = inAppWebViewOptions.needInitialFocus))) {
            settings.setNeedInitialFocus(bool8.booleanValue());
        }
        if (!(hashMap.get("offscreenPreRaster") == null || this.options.offscreenPreRaster == (bool7 = inAppWebViewOptions.offscreenPreRaster) || i < 23)) {
            settings.setOffscreenPreRaster(bool7.booleanValue());
        }
        if (hashMap.get("sansSerifFontFamily") != null && !this.options.sansSerifFontFamily.equals(inAppWebViewOptions.sansSerifFontFamily)) {
            settings.setSansSerifFontFamily(inAppWebViewOptions.sansSerifFontFamily);
        }
        if (hashMap.get("serifFontFamily") != null && !this.options.serifFontFamily.equals(inAppWebViewOptions.serifFontFamily)) {
            settings.setSerifFontFamily(inAppWebViewOptions.serifFontFamily);
        }
        if (hashMap.get("standardFontFamily") != null && !this.options.standardFontFamily.equals(inAppWebViewOptions.standardFontFamily)) {
            settings.setStandardFontFamily(inAppWebViewOptions.standardFontFamily);
        }
        if (hashMap.get("preferredContentMode") != null && !this.options.preferredContentMode.equals(inAppWebViewOptions.preferredContentMode)) {
            int i2 = C874019.f36278x3e028321[PreferredContentModeOptionType.fromValue(inAppWebViewOptions.preferredContentMode.intValue()).ordinal()];
            if (i2 == 1) {
                setDesktopMode(true);
            } else if (i2 == 2 || i2 == 3) {
                setDesktopMode(false);
            }
        }
        if (!(hashMap.get("saveFormData") == null || this.options.saveFormData == (bool6 = inAppWebViewOptions.saveFormData))) {
            settings.setSaveFormData(bool6.booleanValue());
        }
        if (!(hashMap.get("incognito") == null || this.options.incognito == (bool5 = inAppWebViewOptions.incognito))) {
            setIncognito(bool5.booleanValue());
        }
        if (!(hashMap.get("hardwareAcceleration") == null || this.options.hardwareAcceleration == (bool4 = inAppWebViewOptions.hardwareAcceleration))) {
            if (bool4.booleanValue()) {
                setLayerType(2, (Paint) null);
            } else {
                setLayerType(1, (Paint) null);
            }
        }
        if (hashMap.get("regexToCancelSubFramesLoading") != null && ((str = this.options.regexToCancelSubFramesLoading) == null || !str.equals(inAppWebViewOptions.regexToCancelSubFramesLoading))) {
            if (inAppWebViewOptions.regexToCancelSubFramesLoading == null) {
                this.regexToCancelSubFramesLoadingCompiled = null;
            } else {
                this.regexToCancelSubFramesLoadingCompiled = Pattern.compile(this.options.regexToCancelSubFramesLoading);
            }
        }
        if (inAppWebViewOptions.contentBlockers != null) {
            this.contentBlockerHandler.getRuleList().clear();
            for (Map next : inAppWebViewOptions.contentBlockers) {
                this.contentBlockerHandler.getRuleList().add(new ContentBlocker(ContentBlockerTrigger.fromMap((Map) next.get("trigger")), ContentBlockerAction.fromMap((Map) next.get("action"))));
            }
        }
        if (hashMap.get("scrollBarStyle") != null && !this.options.scrollBarStyle.equals(inAppWebViewOptions.scrollBarStyle)) {
            setScrollBarStyle(inAppWebViewOptions.scrollBarStyle.intValue());
        }
        if (hashMap.get("scrollBarDefaultDelayBeforeFade") != null && ((num2 = this.options.scrollBarDefaultDelayBeforeFade) == null || !num2.equals(inAppWebViewOptions.scrollBarDefaultDelayBeforeFade))) {
            setScrollBarDefaultDelayBeforeFade(inAppWebViewOptions.scrollBarDefaultDelayBeforeFade.intValue());
        }
        if (hashMap.get("scrollbarFadingEnabled") != null && !this.options.scrollbarFadingEnabled.equals(inAppWebViewOptions.scrollbarFadingEnabled)) {
            setScrollbarFadingEnabled(inAppWebViewOptions.scrollbarFadingEnabled.booleanValue());
        }
        if (hashMap.get("scrollBarFadeDuration") != null && ((num = this.options.scrollBarFadeDuration) == null || !num.equals(inAppWebViewOptions.scrollBarFadeDuration))) {
            setScrollBarFadeDuration(inAppWebViewOptions.scrollBarFadeDuration.intValue());
        }
        if (hashMap.get("verticalScrollbarPosition") != null && !this.options.verticalScrollbarPosition.equals(inAppWebViewOptions.verticalScrollbarPosition)) {
            setVerticalScrollbarPosition(inAppWebViewOptions.verticalScrollbarPosition.intValue());
        }
        if (!(hashMap.get("disableVerticalScroll") == null || this.options.disableVerticalScroll == (bool3 = inAppWebViewOptions.disableVerticalScroll))) {
            setVerticalScrollBarEnabled(!bool3.booleanValue() && inAppWebViewOptions.verticalScrollBarEnabled.booleanValue());
        }
        if (!(hashMap.get("disableHorizontalScroll") == null || this.options.disableHorizontalScroll == (bool2 = inAppWebViewOptions.disableHorizontalScroll))) {
            if (!bool2.booleanValue() && inAppWebViewOptions.horizontalScrollBarEnabled.booleanValue()) {
                z = true;
            }
            setHorizontalScrollBarEnabled(z);
        }
        if (hashMap.get("overScrollMode") != null && !this.options.overScrollMode.equals(inAppWebViewOptions.overScrollMode)) {
            setOverScrollMode(inAppWebViewOptions.overScrollMode.intValue());
        }
        if (!(hashMap.get("networkAvailable") == null || this.options.networkAvailable == (bool = inAppWebViewOptions.networkAvailable))) {
            setNetworkAvailable(bool.booleanValue());
        }
        if (hashMap.get("rendererPriorityPolicy") != null && (!((map = this.options.rendererPriorityPolicy) != null && map.get("rendererRequestedPriority") == inAppWebViewOptions.rendererPriorityPolicy.get("rendererRequestedPriority") && this.options.rendererPriorityPolicy.get("waivedWhenNotVisible") == inAppWebViewOptions.rendererPriorityPolicy.get("waivedWhenNotVisible")) && Build.VERSION.SDK_INT >= 26)) {
            setRendererPriorityPolicy(((Integer) inAppWebViewOptions.rendererPriorityPolicy.get("rendererRequestedPriority")).intValue(), ((Boolean) inAppWebViewOptions.rendererPriorityPolicy.get("waivedWhenNotVisible")).booleanValue());
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (hashMap.get("verticalScrollbarThumbColor") != null && !Util.objEquals(this.options.verticalScrollbarThumbColor, inAppWebViewOptions.verticalScrollbarThumbColor)) {
                setVerticalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(inAppWebViewOptions.verticalScrollbarThumbColor)));
            }
            if (hashMap.get("verticalScrollbarTrackColor") != null && !Util.objEquals(this.options.verticalScrollbarTrackColor, inAppWebViewOptions.verticalScrollbarTrackColor)) {
                setVerticalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(inAppWebViewOptions.verticalScrollbarTrackColor)));
            }
            if (hashMap.get("horizontalScrollbarThumbColor") != null && !Util.objEquals(this.options.horizontalScrollbarThumbColor, inAppWebViewOptions.horizontalScrollbarThumbColor)) {
                setHorizontalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(inAppWebViewOptions.horizontalScrollbarThumbColor)));
            }
            if (hashMap.get("horizontalScrollbarTrackColor") != null && !Util.objEquals(this.options.horizontalScrollbarTrackColor, inAppWebViewOptions.horizontalScrollbarTrackColor)) {
                setHorizontalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(inAppWebViewOptions.horizontalScrollbarTrackColor)));
            }
        }
        this.options = inAppWebViewOptions;
    }

    public void setPlugin(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public void setUserContentController(UserContentController userContentController2) {
        this.userContentController = userContentController2;
    }

    public void setWebMessageChannels(Map<String, WebMessageChannel> map) {
        this.webMessageChannels = map;
    }

    public ActionMode startActionMode(ActionMode.Callback callback) {
        Map<String, Object> map;
        if (!this.options.useHybridComposition.booleanValue() || this.options.disableContextMenu.booleanValue() || ((map = this.contextMenu) != null && map.keySet().size() != 0)) {
            return rebuildActionMode(super.startActionMode(callback), callback);
        }
        return super.startActionMode(callback);
    }

    public void takeScreenshot(final Map<String, Object> map, final C6556k.C6561d dVar) {
        final float pixelDensity = Util.getPixelDensity(getContext());
        this.mainLooperHandler.post(new Runnable() {
            public void run() {
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(InAppWebView.this.getMeasuredWidth(), InAppWebView.this.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.translate((float) (-InAppWebView.this.getScrollX()), (float) (-InAppWebView.this.getScrollY()));
                    InAppWebView.this.draw(canvas);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                    int i = 100;
                    Map map = map;
                    if (map != null) {
                        Map map2 = (Map) map.get("rect");
                        if (map2 != null) {
                            createBitmap = Bitmap.createBitmap(createBitmap, (int) Math.floor((((Double) map2.get("x")).doubleValue() * ((double) pixelDensity)) + 0.5d), (int) Math.floor((((Double) map2.get("y")).doubleValue() * ((double) pixelDensity)) + 0.5d), Math.min(createBitmap.getWidth(), (int) Math.floor((((Double) map2.get("width")).doubleValue() * ((double) pixelDensity)) + 0.5d)), Math.min(createBitmap.getHeight(), (int) Math.floor((((Double) map2.get("height")).doubleValue() * ((double) pixelDensity)) + 0.5d)));
                        }
                        Double d = (Double) map.get("snapshotWidth");
                        if (d != null) {
                            int floor = (int) Math.floor((d.doubleValue() * ((double) pixelDensity)) + 0.5d);
                            createBitmap = Bitmap.createScaledBitmap(createBitmap, floor, (int) (((float) floor) / (((float) createBitmap.getWidth()) / ((float) createBitmap.getHeight()))), true);
                        }
                        try {
                            compressFormat = Bitmap.CompressFormat.valueOf((String) map.get("compressFormat"));
                        } catch (IllegalArgumentException e) {
                            e.printStackTrace();
                        }
                        i = ((Integer) map.get("quality")).intValue();
                    }
                    createBitmap.compress(compressFormat, i, byteArrayOutputStream);
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    createBitmap.recycle();
                    dVar.success(byteArrayOutputStream.toByteArray());
                } catch (IllegalArgumentException e3) {
                    e3.printStackTrace();
                    dVar.success((Object) null);
                }
            }
        });
    }

    public void getZoomScale(ValueCallback<Float> valueCallback) {
        valueCallback.onReceiveValue(Float.valueOf(this.zoomScale));
    }

    public ActionMode startActionMode(ActionMode.Callback callback, int i) {
        Map<String, Object> map;
        if (!this.options.useHybridComposition.booleanValue() || this.options.disableContextMenu.booleanValue() || ((map = this.contextMenu) != null && map.keySet().size() != 0)) {
            return rebuildActionMode(super.startActionMode(callback, i), callback);
        }
        return super.startActionMode(callback, i);
    }

    public InAppWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InAppWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public InAppWebView(Context context, InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, C6556k kVar, Object obj, Integer num, InAppWebViewOptions inAppWebViewOptions, Map<String, Object> map, View view, List<UserScript> list) {
        super(context, view, inAppWebViewOptions.useHybridComposition);
        Activity activity;
        this.plugin = inAppWebViewFlutterPlugin;
        this.channel = kVar;
        this.f36277id = obj;
        this.windowId = num;
        this.options = inAppWebViewOptions;
        this.contextMenu = map;
        this.userContentController.addUserOnlyScripts(list);
        if (inAppWebViewFlutterPlugin != null && (activity = inAppWebViewFlutterPlugin.activity) != null) {
            activity.registerForContextMenu(this);
        }
    }
}
