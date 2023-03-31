package p164x0;

import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import p158w0.C5871a;
import p345re.C12451a;

/* renamed from: x0.k */
/* compiled from: JavaScriptReplyProxyImpl */
public class C6013k extends C5871a {

    /* renamed from: a */
    private JsReplyProxyBoundaryInterface f29225a;

    /* renamed from: x0.k$a */
    /* compiled from: JavaScriptReplyProxyImpl */
    class C6014a implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ JsReplyProxyBoundaryInterface f29226a;

        C6014a(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
            this.f29226a = jsReplyProxyBoundaryInterface;
        }

        public Object call() {
            return new C6013k(this.f29226a);
        }
    }

    public C6013k(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f29225a = jsReplyProxyBoundaryInterface;
    }

    /* renamed from: b */
    public static C6013k m35406b(InvocationHandler invocationHandler) {
        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) C12451a.m59406a(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (C6013k) jsReplyProxyBoundaryInterface.getOrCreatePeer(new C6014a(jsReplyProxyBoundaryInterface));
    }

    /* renamed from: a */
    public void mo20422a(String str) {
        if (C6024u.f29260S.mo20709d()) {
            this.f29225a.postMessage(str);
            return;
        }
        throw C6024u.m35442a();
    }
}
