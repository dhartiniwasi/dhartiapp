package p164x0;

import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface;
import p158w0.C5886l;
import p158w0.C5887m;

/* renamed from: x0.z */
/* compiled from: WebViewRenderProcessClientAdapter */
public class C6031z implements WebViewRendererClientBoundaryInterface {

    /* renamed from: c */
    private static final String[] f29296c = {"WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"};

    /* renamed from: a */
    private final Executor f29297a;

    /* renamed from: b */
    private final C5887m f29298b;

    /* renamed from: x0.z$a */
    /* compiled from: WebViewRenderProcessClientAdapter */
    class C6032a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C5887m f29299a;

        /* renamed from: b */
        final /* synthetic */ WebView f29300b;

        /* renamed from: c */
        final /* synthetic */ C5886l f29301c;

        C6032a(C5887m mVar, WebView webView, C5886l lVar) {
            this.f29299a = mVar;
            this.f29300b = webView;
            this.f29301c = lVar;
        }

        public void run() {
            this.f29299a.onRenderProcessUnresponsive(this.f29300b, this.f29301c);
        }
    }

    /* renamed from: x0.z$b */
    /* compiled from: WebViewRenderProcessClientAdapter */
    class C6033b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C5887m f29303a;

        /* renamed from: b */
        final /* synthetic */ WebView f29304b;

        /* renamed from: c */
        final /* synthetic */ C5886l f29305c;

        C6033b(C5887m mVar, WebView webView, C5886l lVar) {
            this.f29303a = mVar;
            this.f29304b = webView;
            this.f29305c = lVar;
        }

        public void run() {
            this.f29303a.onRenderProcessResponsive(this.f29304b, this.f29305c);
        }
    }

    public C6031z(Executor executor, C5887m mVar) {
        this.f29297a = executor;
        this.f29298b = mVar;
    }

    public final String[] getSupportedFeatures() {
        return f29296c;
    }

    public final void onRendererResponsive(WebView webView, InvocationHandler invocationHandler) {
        C6002b0 c = C6002b0.m35352c(invocationHandler);
        C5887m mVar = this.f29298b;
        Executor executor = this.f29297a;
        if (executor == null) {
            mVar.onRenderProcessResponsive(webView, c);
        } else {
            executor.execute(new C6033b(mVar, webView, c));
        }
    }

    public final void onRendererUnresponsive(WebView webView, InvocationHandler invocationHandler) {
        C6002b0 c = C6002b0.m35352c(invocationHandler);
        C5887m mVar = this.f29298b;
        Executor executor = this.f29297a;
        if (executor == null) {
            mVar.onRenderProcessUnresponsive(webView, c);
        } else {
            executor.execute(new C6032a(mVar, webView, c));
        }
    }
}
