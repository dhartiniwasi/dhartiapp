package p264io.flutter.plugins.webviewflutter;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.KeyEvent;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebViewClientCompat;
import p158w0.C5881i;
import p264io.flutter.plugins.webviewflutter.C10940k;

/* renamed from: io.flutter.plugins.webviewflutter.y2 */
/* compiled from: WebViewClientHostApiImpl */
public class C11055y2 implements C10940k.C10942a0 {

    /* renamed from: a */
    private final C10932i2 f42641a;

    /* renamed from: b */
    private final C11058c f42642b;

    /* renamed from: c */
    private final C11051x2 f42643c;

    /* renamed from: io.flutter.plugins.webviewflutter.y2$a */
    /* compiled from: WebViewClientHostApiImpl */
    public interface C11056a extends C11008p2 {
    }

    /* renamed from: io.flutter.plugins.webviewflutter.y2$c */
    /* compiled from: WebViewClientHostApiImpl */
    public static class C11058c {
        /* renamed from: a */
        public WebViewClient mo34820a(C11051x2 x2Var, boolean z) {
            if (Build.VERSION.SDK_INT >= 24) {
                return new C11059d(x2Var, z);
            }
            return new C11057b(x2Var, z);
        }
    }

    public C11055y2(C10932i2 i2Var, C11058c cVar, C11051x2 x2Var) {
        this.f42641a = i2Var;
        this.f42642b = cVar;
        this.f42643c = x2Var;
    }

    /* renamed from: b */
    public void mo34675b(Long l, Boolean bool) {
        this.f42641a.mo34667b(this.f42642b.mo34820a(this.f42643c, bool.booleanValue()), l.longValue());
    }

    /* renamed from: io.flutter.plugins.webviewflutter.y2$d */
    /* compiled from: WebViewClientHostApiImpl */
    public static class C11059d extends WebViewClient implements C11056a {

        /* renamed from: a */
        private C11051x2 f42646a;

        /* renamed from: b */
        private final boolean f42647b;

        public C11059d(C11051x2 x2Var, boolean z) {
            this.f42647b = z;
            this.f42646a = x2Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static /* synthetic */ void m54783i(Void voidR) {
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static /* synthetic */ void m54784j(Void voidR) {
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static /* synthetic */ void m54785k(Void voidR) {
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static /* synthetic */ void m54786l(Void voidR) {
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public static /* synthetic */ void m54787m(Void voidR) {
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public static /* synthetic */ void m54788n(Void voidR) {
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public static /* synthetic */ void m54789o(Void voidR) {
        }

        /* renamed from: a */
        public void mo34648a() {
            C11051x2 x2Var = this.f42646a;
            if (x2Var != null) {
                x2Var.mo34813z(this, C10992m3.f42561a);
            }
            this.f42646a = null;
        }

        public void onPageFinished(WebView webView, String str) {
            C11051x2 x2Var = this.f42646a;
            if (x2Var != null) {
                x2Var.mo34806B(this, webView, str, C10928h3.f42489a);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C11051x2 x2Var = this.f42646a;
            if (x2Var != null) {
                x2Var.mo34807C(this, webView, str, C10922g3.f42483a);
            }
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            C11051x2 x2Var = this.f42646a;
            if (x2Var != null) {
                x2Var.mo34809E(this, webView, webResourceRequest, webResourceError, C10939j3.f42507a);
            }
        }

        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            C11051x2 x2Var = this.f42646a;
            if (x2Var != null) {
                x2Var.mo34811G(this, webView, webResourceRequest, C10934i3.f42502a);
            }
            return this.f42647b;
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            C11051x2 x2Var = this.f42646a;
            if (x2Var != null) {
                x2Var.mo34808D(this, webView, Long.valueOf((long) i), str, str2, C10982k3.f42548a);
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C11051x2 x2Var = this.f42646a;
            if (x2Var != null) {
                x2Var.mo34812H(this, webView, str, C10987l3.f42554a);
            }
            return this.f42647b;
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.y2$b */
    /* compiled from: WebViewClientHostApiImpl */
    public static class C11057b extends WebViewClientCompat implements C11056a {

        /* renamed from: b */
        private C11051x2 f42644b;

        /* renamed from: c */
        private final boolean f42645c;

        public C11057b(C11051x2 x2Var, boolean z) {
            this.f42645c = z;
            this.f42644b = x2Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static /* synthetic */ void m54766k(Void voidR) {
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static /* synthetic */ void m54767l(Void voidR) {
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public static /* synthetic */ void m54768m(Void voidR) {
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public static /* synthetic */ void m54769n(Void voidR) {
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public static /* synthetic */ void m54770o(Void voidR) {
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public static /* synthetic */ void m54771p(Void voidR) {
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public static /* synthetic */ void m54772q(Void voidR) {
        }

        /* renamed from: a */
        public void mo34648a() {
            C11051x2 x2Var = this.f42644b;
            if (x2Var != null) {
                x2Var.mo34813z(this, C10910e3.f42468a);
            }
            this.f42644b = null;
        }

        /* renamed from: b */
        public void mo5989b(WebView webView, WebResourceRequest webResourceRequest, C5881i iVar) {
            C11051x2 x2Var = this.f42644b;
            if (x2Var != null) {
                x2Var.mo34810F(this, webView, webResourceRequest, iVar, C10903d3.f42460a);
            }
        }

        public void onPageFinished(WebView webView, String str) {
            C11051x2 x2Var = this.f42644b;
            if (x2Var != null) {
                x2Var.mo34806B(this, webView, str, C11063z2.f42651a);
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C11051x2 x2Var = this.f42644b;
            if (x2Var != null) {
                x2Var.mo34807C(this, webView, str, C10892b3.f42449a);
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            C11051x2 x2Var = this.f42644b;
            if (x2Var != null) {
                x2Var.mo34808D(this, webView, Long.valueOf((long) i), str, str2, C10898c3.f42456a);
            }
        }

        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            C11051x2 x2Var = this.f42644b;
            if (x2Var != null) {
                x2Var.mo34811G(this, webView, webResourceRequest, C10887a3.f42445a);
            }
            return this.f42645c;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C11051x2 x2Var = this.f42644b;
            if (x2Var != null) {
                x2Var.mo34812H(this, webView, str, C10916f3.f42474a);
            }
            return this.f42645c;
        }
    }
}
