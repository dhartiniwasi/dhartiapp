package p293m7;

import com.google.firebase.auth.C7803g0;
import com.google.firebase.auth.C7807h0;
import com.google.firebase.auth.C7811i0;
import com.google.firebase.auth.C7819k0;
import com.google.firebase.auth.FirebaseAuth;
import java.util.List;
import p033d5.C4141r;
import p218e6.C9975i;

/* renamed from: m7.f */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C11818f extends C7803g0 {

    /* renamed from: a */
    private final C11841m1 f44494a;

    public C11818f(C11841m1 m1Var) {
        C4141r.m28221k(m1Var);
        this.f44494a = m1Var;
    }

    /* renamed from: a */
    public final C9975i<Void> mo26099a(C7807h0 h0Var, String str) {
        C4141r.m28221k(h0Var);
        C11841m1 m1Var = this.f44494a;
        return FirebaseAuth.getInstance(m1Var.mo26244d2()).mo26003V(m1Var, h0Var, str);
    }

    /* renamed from: b */
    public final List<C7811i0> mo26100b() {
        return this.f44494a.mo36083p2();
    }

    /* renamed from: c */
    public final C9975i<C7819k0> mo26101c() {
        return this.f44494a.mo26224J1(false).mo26355j(new C11815e(this));
    }

    /* renamed from: d */
    public final C9975i<Void> mo26102d(String str) {
        C4141r.m28217g(str);
        C11841m1 m1Var = this.f44494a;
        return FirebaseAuth.getInstance(m1Var.mo26244d2()).mo26017e0(m1Var, str);
    }
}
