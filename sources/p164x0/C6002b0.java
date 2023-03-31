package p164x0;

import android.webkit.WebViewRenderProcess;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;
import p158w0.C5886l;
import p164x0.C5988a;
import p345re.C12451a;

/* renamed from: x0.b0 */
/* compiled from: WebViewRenderProcessImpl */
public class C6002b0 extends C5886l {

    /* renamed from: c */
    private static final WeakHashMap<WebViewRenderProcess, C6002b0> f29218c = new WeakHashMap<>();

    /* renamed from: a */
    private WebViewRendererBoundaryInterface f29219a;

    /* renamed from: b */
    private WeakReference<WebViewRenderProcess> f29220b;

    /* renamed from: x0.b0$a */
    /* compiled from: WebViewRenderProcessImpl */
    class C6003a implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ WebViewRendererBoundaryInterface f29221a;

        C6003a(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
            this.f29221a = webViewRendererBoundaryInterface;
        }

        public Object call() {
            return new C6002b0(this.f29221a);
        }
    }

    public C6002b0(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
        this.f29219a = webViewRendererBoundaryInterface;
    }

    /* renamed from: b */
    public static C6002b0 m35351b(WebViewRenderProcess webViewRenderProcess) {
        WeakHashMap<WebViewRenderProcess, C6002b0> weakHashMap = f29218c;
        C6002b0 b0Var = weakHashMap.get(webViewRenderProcess);
        if (b0Var != null) {
            return b0Var;
        }
        C6002b0 b0Var2 = new C6002b0(webViewRenderProcess);
        weakHashMap.put(webViewRenderProcess, b0Var2);
        return b0Var2;
    }

    /* renamed from: c */
    public static C6002b0 m35352c(InvocationHandler invocationHandler) {
        WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) C12451a.m59406a(WebViewRendererBoundaryInterface.class, invocationHandler);
        return (C6002b0) webViewRendererBoundaryInterface.getOrCreatePeer(new C6003a(webViewRendererBoundaryInterface));
    }

    /* renamed from: a */
    public boolean mo20447a() {
        C5988a.C5996h hVar = C6024u.f29251J;
        if (hVar.mo20708c()) {
            WebViewRenderProcess webViewRenderProcess = (WebViewRenderProcess) this.f29220b.get();
            return webViewRenderProcess != null && C6009g.m35402g(webViewRenderProcess);
        } else if (hVar.mo20709d()) {
            return this.f29219a.terminate();
        } else {
            throw C6024u.m35442a();
        }
    }

    public C6002b0(WebViewRenderProcess webViewRenderProcess) {
        this.f29220b = new WeakReference<>(webViewRenderProcess);
    }
}
