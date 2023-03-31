package p293m7;

import com.google.firebase.auth.FirebaseAuth;
import p033d5.C4141r;
import p218e6.C9975i;
import p246h7.C10412f;

/* renamed from: m7.o */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C11845o implements Runnable {

    /* renamed from: a */
    private final String f44553a;

    /* renamed from: b */
    final /* synthetic */ C11848p f44554b;

    C11845o(C11848p pVar, String str) {
        this.f44554b = pVar;
        this.f44553a = C4141r.m28217g(str);
    }

    public final void run() {
        FirebaseAuth instance = FirebaseAuth.getInstance(C10412f.m52583p(this.f44553a));
        if (instance.mo26031m() != null) {
            C9975i c = instance.mo26012c(true);
            C11848p.f44557h.mo17934g("Token refreshing started", new Object[0]);
            c.mo26349d(new C11842n(this));
        }
    }
}
