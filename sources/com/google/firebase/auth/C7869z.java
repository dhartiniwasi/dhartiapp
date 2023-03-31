package com.google.firebase.auth;

import android.app.Activity;
import android.net.Uri;
import com.google.android.gms.internal.p026firebaseauthapi.C3784tv;
import java.util.List;
import p033d5.C4141r;
import p040e5.C4240a;
import p218e6.C9975i;
import p246h7.C10412f;

/* renamed from: com.google.firebase.auth.z */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class C7869z extends C4240a implements C7863x0 {
    /* renamed from: I1 */
    public C9975i<Void> mo26223I1() {
        return FirebaseAuth.getInstance(mo26244d2()).mo26002U(this);
    }

    /* renamed from: J1 */
    public C9975i<C7782b0> mo26224J1(boolean z) {
        return FirebaseAuth.getInstance(mo26244d2()).mo26004W(this, z);
    }

    /* renamed from: K1 */
    public abstract C7778a0 mo26225K1();

    /* renamed from: L1 */
    public abstract C7803g0 mo26226L1();

    /* renamed from: M1 */
    public abstract List<? extends C7863x0> mo26227M1();

    /* renamed from: N1 */
    public abstract String mo26228N1();

    /* renamed from: O1 */
    public abstract boolean mo26229O1();

    /* renamed from: P1 */
    public C9975i<C7810i> mo26230P1(C7806h hVar) {
        C4141r.m28221k(hVar);
        return FirebaseAuth.getInstance(mo26244d2()).mo26005X(this, hVar);
    }

    /* renamed from: Q1 */
    public C9975i<C7810i> mo26231Q1(C7806h hVar) {
        C4141r.m28221k(hVar);
        return FirebaseAuth.getInstance(mo26244d2()).mo26006Y(this, hVar);
    }

    /* renamed from: R1 */
    public C9975i<Void> mo26232R1() {
        FirebaseAuth instance = FirebaseAuth.getInstance(mo26244d2());
        return instance.mo26007Z(this, new C7797e2(instance));
    }

    /* renamed from: S1 */
    public C9975i<Void> mo26233S1() {
        return FirebaseAuth.getInstance(mo26244d2()).mo26004W(this, false).mo26355j(new C7813i2(this));
    }

    /* renamed from: T1 */
    public C9975i<Void> mo26234T1(C7793e eVar) {
        return FirebaseAuth.getInstance(mo26244d2()).mo26004W(this, false).mo26355j(new C7817j2(this, eVar));
    }

    /* renamed from: U1 */
    public C9975i<C7810i> mo26235U1(Activity activity, C7829n nVar) {
        C4141r.m28221k(activity);
        C4141r.m28221k(nVar);
        return FirebaseAuth.getInstance(mo26244d2()).mo26013c0(activity, nVar, this);
    }

    /* renamed from: V1 */
    public C9975i<C7810i> mo26236V1(Activity activity, C7829n nVar) {
        C4141r.m28221k(activity);
        C4141r.m28221k(nVar);
        return FirebaseAuth.getInstance(mo26244d2()).mo26015d0(activity, nVar, this);
    }

    /* renamed from: W1 */
    public C9975i<C7810i> mo26237W1(String str) {
        C4141r.m28217g(str);
        return FirebaseAuth.getInstance(mo26244d2()).mo26019f0(this, str);
    }

    /* renamed from: X1 */
    public C9975i<Void> mo26238X1(String str) {
        C4141r.m28217g(str);
        return FirebaseAuth.getInstance(mo26244d2()).mo26021g0(this, str);
    }

    /* renamed from: Y */
    public abstract String mo26208Y();

    /* renamed from: Y1 */
    public C9975i<Void> mo26239Y1(String str) {
        C4141r.m28217g(str);
        return FirebaseAuth.getInstance(mo26244d2()).mo26023h0(this, str);
    }

    /* renamed from: Z1 */
    public C9975i<Void> mo26240Z1(C7830n0 n0Var) {
        return FirebaseAuth.getInstance(mo26244d2()).mo26025i0(this, n0Var);
    }

    /* renamed from: a2 */
    public C9975i<Void> mo26241a2(C7866y0 y0Var) {
        C4141r.m28221k(y0Var);
        return FirebaseAuth.getInstance(mo26244d2()).mo26027j0(this, y0Var);
    }

    /* renamed from: b */
    public abstract String mo26209b();

    /* renamed from: b2 */
    public C9975i<Void> mo26242b2(String str) {
        return mo26243c2(str, (C7793e) null);
    }

    /* renamed from: c2 */
    public C9975i<Void> mo26243c2(String str, C7793e eVar) {
        return FirebaseAuth.getInstance(mo26244d2()).mo26004W(this, false).mo26355j(new C7779a1(this, str, eVar));
    }

    /* renamed from: d2 */
    public abstract C10412f mo26244d2();

    /* renamed from: e2 */
    public abstract C7869z mo26245e2();

    /* renamed from: f2 */
    public abstract C7869z mo26246f2(List list);

    /* renamed from: g2 */
    public abstract C3784tv mo26247g2();

    /* renamed from: h2 */
    public abstract String mo26248h2();

    /* renamed from: i2 */
    public abstract String mo26249i2();

    /* renamed from: j1 */
    public abstract String mo26210j1();

    /* renamed from: j2 */
    public abstract List mo26250j2();

    /* renamed from: k2 */
    public abstract void mo26251k2(C3784tv tvVar);

    /* renamed from: l2 */
    public abstract void mo26252l2(List list);

    /* renamed from: u0 */
    public abstract String mo26211u0();

    /* renamed from: x */
    public abstract Uri mo26212x();
}
