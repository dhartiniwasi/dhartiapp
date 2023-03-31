package p164x0;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface;
import p158w0.C5873c;

/* renamed from: x0.m */
/* compiled from: ServiceWorkerClientAdapter */
public class C6016m implements ServiceWorkerClientBoundaryInterface {

    /* renamed from: a */
    private final C5873c f29229a;

    public C6016m(C5873c cVar) {
        this.f29229a = cVar;
    }

    public String[] getSupportedFeatures() {
        return new String[]{"SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST"};
    }

    public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        return this.f29229a.shouldInterceptRequest(webResourceRequest);
    }
}
