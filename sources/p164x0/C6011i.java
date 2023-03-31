package p164x0;

import android.webkit.ServiceWorkerClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import p158w0.C5873c;

/* renamed from: x0.i */
/* compiled from: FrameworkServiceWorkerClient */
public class C6011i extends ServiceWorkerClient {

    /* renamed from: a */
    private final C5873c f29223a;

    public C6011i(C5873c cVar) {
        this.f29223a = cVar;
    }

    public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        return this.f29223a.shouldInterceptRequest(webResourceRequest);
    }
}
