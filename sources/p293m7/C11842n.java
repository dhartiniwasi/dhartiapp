package p293m7;

import p218e6.C9967e;
import p246h7.C10422m;

/* renamed from: m7.n */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C11842n implements C9967e {

    /* renamed from: a */
    final /* synthetic */ C11845o f44550a;

    C11842n(C11845o oVar) {
        this.f44550a = oVar;
    }

    /* renamed from: d */
    public final void mo272d(Exception exc) {
        if (exc instanceof C10422m) {
            C11848p.f44557h.mo17934g("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            this.f44550a.f44554b.mo36099d();
        }
    }
}
