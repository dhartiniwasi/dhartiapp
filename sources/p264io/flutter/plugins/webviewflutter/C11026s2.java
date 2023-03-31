package p264io.flutter.plugins.webviewflutter;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p264io.flutter.plugins.webviewflutter.C10940k;

/* renamed from: io.flutter.plugins.webviewflutter.s2 */
/* compiled from: WebChromeClientHostApiImpl */
public class C11026s2 implements C10940k.C10966q {

    /* renamed from: a */
    private final C10932i2 f42612a;

    /* renamed from: b */
    private final C11027a f42613b;

    /* renamed from: c */
    private final C11022r2 f42614c;

    /* renamed from: io.flutter.plugins.webviewflutter.s2$a */
    /* compiled from: WebChromeClientHostApiImpl */
    public static class C11027a {
        /* renamed from: a */
        public C11028b mo34797a(C11022r2 r2Var, WebViewClient webViewClient) {
            return new C11028b(r2Var, webViewClient);
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.s2$b */
    /* compiled from: WebChromeClientHostApiImpl */
    public static class C11028b extends WebChromeClient implements C11008p2 {

        /* renamed from: a */
        private C11022r2 f42615a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public WebViewClient f42616b;

        public C11028b(C11022r2 r2Var, WebViewClient webViewClient) {
            this.f42615a = r2Var;
            this.f42616b = webViewClient;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static /* synthetic */ void m54690e(Void voidR) {
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ void m54691f(Void voidR) {
        }

        /* renamed from: a */
        public void mo34648a() {
            C11022r2 r2Var = this.f42615a;
            if (r2Var != null) {
                r2Var.mo34795h(this, C11037u2.f42624a);
            }
            this.f42615a = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public boolean mo34798g(WebView webView, Message message, WebView webView2) {
            C11029a aVar = new C11029a(webView);
            if (webView2 == null) {
                webView2 = new WebView(webView.getContext());
            }
            webView2.setWebViewClient(aVar);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }

        /* renamed from: h */
        public void mo34799h(WebViewClient webViewClient) {
            this.f42616b = webViewClient;
        }

        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            return mo34798g(webView, message, new WebView(webView.getContext()));
        }

        public void onProgressChanged(WebView webView, int i) {
            C11022r2 r2Var = this.f42615a;
            if (r2Var != null) {
                r2Var.mo34796j(this, webView, Long.valueOf((long) i), C11033t2.f42622a);
            }
        }

        /* renamed from: io.flutter.plugins.webviewflutter.s2$b$a */
        /* compiled from: WebChromeClientHostApiImpl */
        class C11029a extends WebViewClient {

            /* renamed from: a */
            final /* synthetic */ WebView f42617a;

            C11029a(WebView webView) {
                this.f42617a = webView;
            }

            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                if (C11028b.this.f42616b.shouldOverrideUrlLoading(this.f42617a, webResourceRequest)) {
                    return true;
                }
                this.f42617a.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (C11028b.this.f42616b.shouldOverrideUrlLoading(this.f42617a, str)) {
                    return true;
                }
                this.f42617a.loadUrl(str);
                return true;
            }
        }
    }

    public C11026s2(C10932i2 i2Var, C11027a aVar, C11022r2 r2Var) {
        this.f42612a = i2Var;
        this.f42613b = aVar;
        this.f42614c = r2Var;
    }

    /* renamed from: b */
    public void mo34717b(Long l, Long l2) {
        this.f42612a.mo34667b(this.f42613b.mo34797a(this.f42614c, (WebViewClient) this.f42612a.mo34671h(l2.longValue())), l.longValue());
    }
}
