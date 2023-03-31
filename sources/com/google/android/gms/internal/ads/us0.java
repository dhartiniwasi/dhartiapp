package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import p053g4.C4391b;
import p053g4.C4409t;
import p066i4.C4678r;
import p073j4.C4751b2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class us0 extends WebChromeClient {

    /* renamed from: a */
    private final vs0 f18719a;

    public us0(vs0 vs0) {
        this.f18719a = vs0;
    }

    /* renamed from: b */
    private static final Context m21838b(WebView webView) {
        if (!(webView instanceof vs0)) {
            return webView.getContext();
        }
        vs0 vs0 = (vs0) webView;
        Activity X = vs0.mo8461X();
        if (X != null) {
            return X;
        }
        return vs0.getContext();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo14607a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        C4391b b;
        try {
            vs0 vs0 = this.f18719a;
            if (vs0 == null || vs0.mo12108f0() == null || this.f18719a.mo12108f0().mo9301b() == null || (b = this.f18719a.mo12108f0().mo9301b()) == null || b.mo17898c()) {
                C4409t.m29326r();
                AlertDialog.Builder g = C4751b2.m30612g(context);
                g.setTitle(str2);
                if (z) {
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(context);
                    textView.setText(str3);
                    EditText editText = new EditText(context);
                    editText.setText(str4);
                    linearLayout.addView(textView);
                    linearLayout.addView(editText);
                    g.setView(linearLayout).setPositiveButton(17039370, new ss0(jsPromptResult, editText)).setNegativeButton(17039360, new rs0(jsPromptResult)).setOnCancelListener(new qs0(jsPromptResult)).create().show();
                } else {
                    g.setMessage(str3).setPositiveButton(17039370, new ps0(jsResult)).setNegativeButton(17039360, new os0(jsResult)).setOnCancelListener(new ns0(jsResult)).create().show();
                }
                return true;
            }
            b.mo17897b("window." + str + "('" + str3 + "')");
            return false;
        } catch (WindowManager.BadTokenException e) {
            pm0.m18668h("Fail to display Dialog.", e);
        }
    }

    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof vs0)) {
            pm0.m18667g("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        C4678r m = ((vs0) webView).mo12123m();
        if (m == null) {
            pm0.m18667g("Tried to close an AdWebView not associated with an overlay.");
        } else {
            m.mo18361d();
        }
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")";
        if (str.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = ts0.f18242a[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            pm0.m18664d(str);
        } else if (i == 2) {
            pm0.m18667g(str);
        } else if (i == 3 || i == 4) {
            pm0.m18666f(str);
        } else if (i != 5) {
            pm0.m18666f(str);
        } else {
            pm0.m18662b(str);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.f18719a.mo12141u() != null) {
            webView2.setWebViewClient(this.f18719a.mo12141u());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > j4 || j2 > 1048576) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = Math.min(j + Math.min(131072, j4), 1048576);
        } else {
            if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            C4409t.m29326r();
            if (!C4751b2.m30603U(this.f18719a.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                C4409t.m29326r();
                if (!C4751b2.m30603U(this.f18719a.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    public final void onHideCustomView() {
        C4678r m = this.f18719a.mo12123m();
        if (m == null) {
            pm0.m18667g("Could not get ad overlay when hiding custom view.");
        } else {
            m.mo18357T();
        }
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return mo14607a(m21838b(webView), "alert", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return mo14607a(m21838b(webView), "onBeforeUnload", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return mo14607a(m21838b(webView), "confirm", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return mo14607a(m21838b(webView), "prompt", str, str2, str3, (JsResult) null, jsPromptResult, true);
    }

    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        C4678r m = this.f18719a.mo12123m();
        if (m == null) {
            pm0.m18667g("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        m.mo18350J6(view, customViewCallback);
        m.mo18355P6(i);
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
