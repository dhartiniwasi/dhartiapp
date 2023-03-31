package p164x0;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface;
import p158w0.C5879h;
import p345re.C12451a;

/* renamed from: x0.q */
/* compiled from: WebMessageCallbackAdapter */
public class C6020q implements WebMessageCallbackBoundaryInterface {

    /* renamed from: a */
    private final C5879h.C5880a f29236a;

    public C6020q(C5879h.C5880a aVar) {
        this.f29236a = aVar;
    }

    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_CALLBACK_ON_MESSAGE"};
    }

    public void onMessage(InvocationHandler invocationHandler, InvocationHandler invocationHandler2) {
        this.f29236a.onMessage(new C6022s(invocationHandler), C6019p.m35426b((WebMessageBoundaryInterface) C12451a.m59406a(WebMessageBoundaryInterface.class, invocationHandler2)));
    }
}
