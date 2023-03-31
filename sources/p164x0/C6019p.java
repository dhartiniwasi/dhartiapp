package p164x0;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import p158w0.C5878g;
import p158w0.C5879h;

/* renamed from: x0.p */
/* compiled from: WebMessageAdapter */
public class C6019p implements WebMessageBoundaryInterface {

    /* renamed from: a */
    private C5878g f29235a;

    public C6019p(C5878g gVar) {
        this.f29235a = gVar;
    }

    /* renamed from: a */
    private static C5879h[] m35425a(InvocationHandler[] invocationHandlerArr) {
        C5879h[] hVarArr = new C5879h[invocationHandlerArr.length];
        for (int i = 0; i < invocationHandlerArr.length; i++) {
            hVarArr[i] = new C6022s(invocationHandlerArr[i]);
        }
        return hVarArr;
    }

    /* renamed from: b */
    public static C5878g m35426b(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        return new C5878g(webMessageBoundaryInterface.getData(), m35425a(webMessageBoundaryInterface.getPorts()));
    }

    public String getData() {
        return this.f29235a.mo20435a();
    }

    public InvocationHandler getMessagePayload() {
        throw new UnsupportedOperationException("This method is not yet supported");
    }

    public InvocationHandler[] getPorts() {
        C5879h[] b = this.f29235a.mo20436b();
        if (b == null) {
            return null;
        }
        InvocationHandler[] invocationHandlerArr = new InvocationHandler[b.length];
        for (int i = 0; i < b.length; i++) {
            invocationHandlerArr[i] = b[i].mo20439c();
        }
        return invocationHandlerArr;
    }

    public String[] getSupportedFeatures() {
        return new String[0];
    }
}
