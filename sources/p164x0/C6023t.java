package p164x0;

import android.webkit.WebResourceError;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import p158w0.C5881i;
import p164x0.C5988a;
import p345re.C12451a;

/* renamed from: x0.t */
/* compiled from: WebResourceErrorImpl */
public class C6023t extends C5881i {

    /* renamed from: a */
    private WebResourceError f29240a;

    /* renamed from: b */
    private WebResourceErrorBoundaryInterface f29241b;

    public C6023t(InvocationHandler invocationHandler) {
        this.f29241b = (WebResourceErrorBoundaryInterface) C12451a.m59406a(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    /* renamed from: c */
    private WebResourceErrorBoundaryInterface m35438c() {
        if (this.f29241b == null) {
            this.f29241b = (WebResourceErrorBoundaryInterface) C12451a.m59406a(WebResourceErrorBoundaryInterface.class, C6025v.m35447c().mo20723h(this.f29240a));
        }
        return this.f29241b;
    }

    /* renamed from: d */
    private WebResourceError m35439d() {
        if (this.f29240a == null) {
            this.f29240a = C6025v.m35447c().mo20722g(Proxy.getInvocationHandler(this.f29241b));
        }
        return this.f29240a;
    }

    /* renamed from: a */
    public CharSequence mo20443a() {
        C5988a.C5990b bVar = C6024u.f29287v;
        if (bVar.mo20708c()) {
            return C5998b.m35342e(m35439d());
        }
        if (bVar.mo20709d()) {
            return m35438c().getDescription();
        }
        throw C6024u.m35442a();
    }

    /* renamed from: b */
    public int mo20444b() {
        C5988a.C5990b bVar = C6024u.f29288w;
        if (bVar.mo20708c()) {
            return C5998b.m35343f(m35439d());
        }
        if (bVar.mo20709d()) {
            return m35438c().getErrorCode();
        }
        throw C6024u.m35442a();
    }

    public C6023t(WebResourceError webResourceError) {
        this.f29240a = webResourceError;
    }
}
