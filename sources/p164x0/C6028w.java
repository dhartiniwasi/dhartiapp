package p164x0;

import android.net.Uri;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import p158w0.C5878g;
import p158w0.C5879h;
import p158w0.C5882j;
import p158w0.C5887m;
import p345re.C12451a;

/* renamed from: x0.w */
/* compiled from: WebViewProviderAdapter */
public class C6028w {

    /* renamed from: a */
    WebViewProviderBoundaryInterface f29294a;

    public C6028w(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.f29294a = webViewProviderBoundaryInterface;
    }

    /* renamed from: a */
    public void mo20737a(String str, String[] strArr, C5882j.C5884b bVar) {
        this.f29294a.addWebMessageListener(str, strArr, C12451a.m59408c(new C6021r(bVar)));
    }

    /* renamed from: b */
    public C5879h[] mo20738b() {
        InvocationHandler[] createWebMessageChannel = this.f29294a.createWebMessageChannel();
        C5879h[] hVarArr = new C5879h[createWebMessageChannel.length];
        for (int i = 0; i < createWebMessageChannel.length; i++) {
            hVarArr[i] = new C6022s(createWebMessageChannel[i]);
        }
        return hVarArr;
    }

    /* renamed from: c */
    public void mo20739c(C5878g gVar, Uri uri) {
        this.f29294a.postMessageToMainFrame(C12451a.m59408c(new C6019p(gVar)), uri);
    }

    /* renamed from: d */
    public void mo20740d(Executor executor, C5887m mVar) {
        this.f29294a.setWebViewRendererClient(mVar != null ? C12451a.m59408c(new C6031z(executor, mVar)) : null);
    }
}
