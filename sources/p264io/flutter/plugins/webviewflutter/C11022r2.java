package p264io.flutter.plugins.webviewflutter;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import p186ac.C6539c;
import p264io.flutter.plugins.webviewflutter.C10940k;

/* renamed from: io.flutter.plugins.webviewflutter.r2 */
/* compiled from: WebChromeClientFlutterApiImpl */
public class C11022r2 extends C10940k.C10963o {

    /* renamed from: b */
    private final C10932i2 f42608b;

    public C11022r2(C6539c cVar, C10932i2 i2Var) {
        super(cVar);
        this.f42608b = i2Var;
    }

    /* renamed from: i */
    private long m54679i(WebChromeClient webChromeClient) {
        Long g = this.f42608b.mo34670g(webChromeClient);
        if (g != null) {
            return g.longValue();
        }
        throw new IllegalStateException("Could not find identifier for WebChromeClient.");
    }

    /* renamed from: h */
    public void mo34795h(WebChromeClient webChromeClient, C10940k.C10963o.C10964a<Void> aVar) {
        if (this.f42608b.mo34669f(webChromeClient)) {
            mo34714c(Long.valueOf(m54679i(webChromeClient)), aVar);
        } else {
            aVar.mo34716a(null);
        }
    }

    /* renamed from: j */
    public void mo34796j(WebChromeClient webChromeClient, WebView webView, Long l, C10940k.C10963o.C10964a<Void> aVar) {
        Long g = this.f42608b.mo34670g(webView);
        if (g != null) {
            super.mo34715g(Long.valueOf(m54679i(webChromeClient)), g, l, aVar);
            return;
        }
        throw new IllegalStateException("Could not find identifier for WebView.");
    }
}
