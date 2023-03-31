package p264io.flutter.plugins.webviewflutter;

import android.os.Build;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;
import java.util.Map;
import p158w0.C5881i;
import p186ac.C6539c;
import p264io.flutter.plugins.webviewflutter.C10940k;

/* renamed from: io.flutter.plugins.webviewflutter.x2 */
/* compiled from: WebViewClientFlutterApiImpl */
public class C11051x2 extends C10940k.C10976y {

    /* renamed from: b */
    private final C10932i2 f42638b;

    public C11051x2(C6539c cVar, C10932i2 i2Var) {
        super(cVar);
        this.f42638b = i2Var;
    }

    /* renamed from: A */
    private long m54740A(WebViewClient webViewClient) {
        Long g = this.f42638b.mo34670g(webViewClient);
        if (g != null) {
            return g.longValue();
        }
        throw new IllegalStateException("Could not find identifier for WebViewClient.");
    }

    /* renamed from: w */
    static C10940k.C10968s m54741w(WebResourceError webResourceError) {
        return new C10940k.C10968s.C10969a().mo34723c(Long.valueOf((long) webResourceError.getErrorCode())).mo34722b(webResourceError.getDescription().toString()).mo34721a();
    }

    /* renamed from: x */
    static C10940k.C10968s m54742x(C5881i iVar) {
        return new C10940k.C10968s.C10969a().mo34723c(Long.valueOf((long) iVar.mo20444b())).mo34722b(iVar.mo20443a().toString()).mo34721a();
    }

    /* renamed from: y */
    static C10940k.C10970t m54743y(WebResourceRequest webResourceRequest) {
        Map map;
        C10940k.C10970t.C10971a e = new C10940k.C10970t.C10971a().mo34737g(webResourceRequest.getUrl().toString()).mo34733c(Boolean.valueOf(webResourceRequest.isForMainFrame())).mo34732b(Boolean.valueOf(webResourceRequest.hasGesture())).mo34735e(webResourceRequest.getMethod());
        if (webResourceRequest.getRequestHeaders() != null) {
            map = webResourceRequest.getRequestHeaders();
        } else {
            map = new HashMap();
        }
        C10940k.C10970t.C10971a f = e.mo34736f(map);
        if (Build.VERSION.SDK_INT >= 24) {
            f.mo34734d(Boolean.valueOf(webResourceRequest.isRedirect()));
        }
        return f.mo34731a();
    }

    /* renamed from: B */
    public void mo34806B(WebViewClient webViewClient, WebView webView, String str, C10940k.C10976y.C10977a<Void> aVar) {
        Long g = this.f42638b.mo34670g(webView);
        if (g != null) {
            mo34755q(Long.valueOf(m54740A(webViewClient)), g, str, aVar);
            return;
        }
        throw new IllegalStateException("Could not find identifier for WebView.");
    }

    /* renamed from: C */
    public void mo34807C(WebViewClient webViewClient, WebView webView, String str, C10940k.C10976y.C10977a<Void> aVar) {
        Long g = this.f42638b.mo34670g(webView);
        if (g != null) {
            mo34756r(Long.valueOf(m54740A(webViewClient)), g, str, aVar);
            return;
        }
        throw new IllegalStateException("Could not find identifier for WebView.");
    }

    /* renamed from: D */
    public void mo34808D(WebViewClient webViewClient, WebView webView, Long l, String str, String str2, C10940k.C10976y.C10977a<Void> aVar) {
        Long g = this.f42638b.mo34670g(webView);
        if (g != null) {
            mo34757s(Long.valueOf(m54740A(webViewClient)), g, l, str, str2, aVar);
            return;
        }
        throw new IllegalStateException("Could not find identifier for WebView.");
    }

    /* renamed from: E */
    public void mo34809E(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError, C10940k.C10976y.C10977a<Void> aVar) {
        Long g = this.f42638b.mo34670g(webView);
        if (g != null) {
            mo34758t(Long.valueOf(m54740A(webViewClient)), g, m54743y(webResourceRequest), m54741w(webResourceError), aVar);
            return;
        }
        throw new IllegalStateException("Could not find identifier for WebView.");
    }

    /* renamed from: F */
    public void mo34810F(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, C5881i iVar, C10940k.C10976y.C10977a<Void> aVar) {
        Long g = this.f42638b.mo34670g(webView);
        if (g != null) {
            mo34758t(Long.valueOf(m54740A(webViewClient)), g, m54743y(webResourceRequest), m54742x(iVar), aVar);
            return;
        }
        throw new IllegalStateException("Could not find identifier for WebView.");
    }

    /* renamed from: G */
    public void mo34811G(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, C10940k.C10976y.C10977a<Void> aVar) {
        Long g = this.f42638b.mo34670g(webView);
        if (g != null) {
            mo34759u(Long.valueOf(m54740A(webViewClient)), g, m54743y(webResourceRequest), aVar);
            return;
        }
        throw new IllegalStateException("Could not find identifier for WebView.");
    }

    /* renamed from: H */
    public void mo34812H(WebViewClient webViewClient, WebView webView, String str, C10940k.C10976y.C10977a<Void> aVar) {
        Long g = this.f42638b.mo34670g(webView);
        if (g != null) {
            mo34760v(Long.valueOf(m54740A(webViewClient)), g, str, aVar);
            return;
        }
        throw new IllegalStateException("Could not find identifier for WebView.");
    }

    /* renamed from: z */
    public void mo34813z(WebViewClient webViewClient, C10940k.C10976y.C10977a<Void> aVar) {
        if (this.f42638b.mo34669f(webViewClient)) {
            mo34754h(Long.valueOf(m54740A(webViewClient)), aVar);
        } else {
            aVar.mo34636a(null);
        }
    }
}
