package p164x0;

import android.webkit.SafeBrowsingResponse;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import p158w0.C5872b;
import p164x0.C5988a;
import p345re.C12451a;

/* renamed from: x0.l */
/* compiled from: SafeBrowsingResponseImpl */
public class C6015l extends C5872b {

    /* renamed from: a */
    private SafeBrowsingResponse f29227a;

    /* renamed from: b */
    private SafeBrowsingResponseBoundaryInterface f29228b;

    public C6015l(InvocationHandler invocationHandler) {
        this.f29228b = (SafeBrowsingResponseBoundaryInterface) C12451a.m59406a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    /* renamed from: b */
    private SafeBrowsingResponseBoundaryInterface m35408b() {
        if (this.f29228b == null) {
            this.f29228b = (SafeBrowsingResponseBoundaryInterface) C12451a.m59406a(SafeBrowsingResponseBoundaryInterface.class, C6025v.m35447c().mo20717b(this.f29227a));
        }
        return this.f29228b;
    }

    /* renamed from: c */
    private SafeBrowsingResponse m35409c() {
        if (this.f29227a == null) {
            this.f29227a = C6025v.m35447c().mo20716a(Proxy.getInvocationHandler(this.f29228b));
        }
        return this.f29227a;
    }

    /* renamed from: a */
    public void mo20423a(boolean z) {
        C5988a.C5994f fVar = C6024u.f29291z;
        if (fVar.mo20708c()) {
            C6007e.m35388e(m35409c(), z);
        } else if (fVar.mo20709d()) {
            m35408b().showInterstitial(z);
        } else {
            throw C6024u.m35442a();
        }
    }

    public C6015l(SafeBrowsingResponse safeBrowsingResponse) {
        this.f29227a = safeBrowsingResponse;
    }
}
