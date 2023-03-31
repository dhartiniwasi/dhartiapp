package com.google.android.gms.internal.p026firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.C7793e;
import com.google.firebase.auth.C7814j;
import com.google.firebase.auth.C7840p1;
import com.google.firebase.auth.C7866y0;
import p033d5.C4141r;
import p293m7.C11836l;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.br */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3186br {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3189bu f21788a;

    public C3186br(C3189bu buVar) {
        this.f21788a = (C3189bu) C4141r.m28221k(buVar);
    }

    /* renamed from: m */
    private final void m25152m(String str, C3156au auVar) {
        C4141r.m28221k(auVar);
        C4141r.m28217g(str);
        C3784tv I1 = C3784tv.m27059I1(str);
        if (I1.mo16839O1()) {
            auVar.mo15754c(I1);
            return;
        }
        this.f21788a.mo15855f(new C3421iv(I1.mo16835K1()), new C3153ar(this, auVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final void m25153n(C3190bv bvVar, C3781ts tsVar) {
        C4141r.m28221k(bvVar);
        C4141r.m28221k(tsVar);
        this.f21788a.mo15852c(bvVar, new C3547mp(this, tsVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m25154o(C3784tv tvVar, String str, String str2, Boolean bool, C7840p1 p1Var, C3781ts tsVar, C3976zt ztVar) {
        C4141r.m28221k(tvVar);
        C4141r.m28221k(ztVar);
        C4141r.m28221k(tsVar);
        this.f21788a.mo15856g(new C3454jv(tvVar.mo16834J1()), new C3646pp(this, ztVar, str2, str, bool, p1Var, tsVar, tvVar));
    }

    /* renamed from: p */
    private final void m25155p(C3685qv qvVar, C3781ts tsVar) {
        C4141r.m28221k(qvVar);
        C4141r.m28221k(tsVar);
        this.f21788a.mo15857h(qvVar, new C3746sq(this, tsVar));
    }

    /* renamed from: t */
    static /* bridge */ /* synthetic */ void m25159t(C3186br brVar, C3225d0 d0Var, C3781ts tsVar, C3976zt ztVar) {
        Status status;
        if (d0Var.mo15939p()) {
            C7840p1 b = d0Var.mo15926b();
            String c = d0Var.mo15927c();
            String k = d0Var.mo15934k();
            if (d0Var.mo15937n()) {
                status = new Status(17012);
            } else {
                status = C11836l.m57255a(d0Var.mo15928d());
            }
            tsVar.mo16825e(new C3316fp(status, b, c, k));
            return;
        }
        brVar.m25154o(new C3784tv(d0Var.mo15933j(), d0Var.mo15929e(), Long.valueOf(d0Var.mo15925a()), "Bearer"), d0Var.mo15932i(), d0Var.mo15931h(), Boolean.valueOf(d0Var.mo15938o()), d0Var.mo15926b(), tsVar, ztVar);
    }

    /* renamed from: u */
    static /* bridge */ /* synthetic */ void m25160u(C3186br brVar, C3781ts tsVar, C3784tv tvVar, C3653q qVar, C3976zt ztVar) {
        C4141r.m28221k(tsVar);
        C4141r.m28221k(tvVar);
        C4141r.m28221k(qVar);
        C4141r.m28221k(ztVar);
        brVar.f21788a.mo15856g(new C3454jv(tvVar.mo16834J1()), new C3580np(brVar, ztVar, tsVar, tvVar, qVar));
    }

    /* renamed from: v */
    static /* bridge */ /* synthetic */ void m25161v(C3186br brVar, C3781ts tsVar, C3784tv tvVar, C3553mv mvVar, C3653q qVar, C3976zt ztVar) {
        C4141r.m28221k(tsVar);
        C4141r.m28221k(tvVar);
        C4141r.m28221k(mvVar);
        C4141r.m28221k(qVar);
        C4141r.m28221k(ztVar);
        brVar.f21788a.mo15860k(qVar, new C3613op(brVar, qVar, mvVar, tsVar, tvVar, ztVar));
    }

    /* renamed from: A */
    public final void mo15818A(String str, String str2, String str3, C3781ts tsVar) {
        C4141r.m28217g(str);
        C4141r.m28217g(str2);
        C4141r.m28221k(tsVar);
        this.f21788a.mo15858i(new C3455k(str, str2, str3), new C3811up(this, tsVar));
    }

    /* renamed from: B */
    public final void mo15819B(String str, String str2, String str3, C3781ts tsVar) {
        C4141r.m28217g(str);
        C4141r.m28217g(str2);
        C4141r.m28221k(tsVar);
        this.f21788a.mo15861l(new C3719s(str, str2, (String) null, str3), new C3448jp(this, tsVar));
    }

    /* renamed from: C */
    public final void mo15820C(String str, C3781ts tsVar) {
        C4141r.m28217g(str);
        C4141r.m28221k(tsVar);
        m25152m(str, new C3713rq(this, tsVar));
    }

    /* renamed from: D */
    public final void mo15821D(C3256dv dvVar, String str, C3781ts tsVar) {
        C4141r.m28221k(dvVar);
        C4141r.m28221k(tsVar);
        m25152m(str, new C3515lq(this, dvVar, tsVar));
    }

    /* renamed from: E */
    public final void mo15822E(C3322fv fvVar, C3781ts tsVar) {
        C4141r.m28221k(fvVar);
        C4141r.m28221k(tsVar);
        this.f21788a.mo15854e(fvVar, new C3548mq(this, tsVar));
    }

    /* renamed from: F */
    public final void mo15823F(String str, C3781ts tsVar) {
        C4141r.m28217g(str);
        C4141r.m28221k(tsVar);
        this.f21788a.mo15855f(new C3421iv(str), new C3778tp(this, tsVar));
    }

    /* renamed from: G */
    public final void mo15824G(String str, String str2, C3781ts tsVar) {
        C4141r.m28217g(str);
        C4141r.m28221k(tsVar);
        this.f21788a.mo15850a(new C3913xu(str, str2), new C3679qp(this, tsVar));
    }

    /* renamed from: H */
    public final void mo15825H(String str, String str2, String str3, C3781ts tsVar) {
        C4141r.m28217g(str);
        C4141r.m28217g(str2);
        C4141r.m28217g(str3);
        C4141r.m28221k(tsVar);
        m25152m(str3, new C3940yp(this, str, str2, tsVar));
    }

    /* renamed from: I */
    public final void mo15826I(String str, C3126a0 a0Var, C3781ts tsVar) {
        C4141r.m28217g(str);
        C4141r.m28221k(a0Var);
        C4141r.m28221k(tsVar);
        m25152m(str, new C3218cq(this, a0Var, tsVar));
    }

    /* renamed from: J */
    public final void mo15827J(String str, C3423j0 j0Var, C3781ts tsVar) {
        C4141r.m28217g(str);
        C4141r.m28221k(j0Var);
        C4141r.m28221k(tsVar);
        m25152m(str, new C3152aq(this, j0Var, tsVar));
    }

    /* renamed from: K */
    public final void mo15828K(String str, C3781ts tsVar) {
        C4141r.m28217g(str);
        C4141r.m28221k(tsVar);
        m25152m(str, new C3647pq(this, tsVar));
    }

    /* renamed from: L */
    public final void mo15829L(String str, C7793e eVar, C3781ts tsVar) {
        C4141r.m28217g(str);
        C4141r.m28221k(tsVar);
        C3685qv qvVar = new C3685qv(4);
        qvVar.mo16657f(str);
        if (eVar != null) {
            qvVar.mo16654c(eVar);
        }
        m25155p(qvVar, tsVar);
    }

    /* renamed from: M */
    public final void mo15830M(String str, C7793e eVar, String str2, C3781ts tsVar) {
        C4141r.m28217g(str);
        C4141r.m28221k(tsVar);
        C3685qv qvVar = new C3685qv(eVar.mo26077P1());
        qvVar.mo16655d(str);
        qvVar.mo16654c(eVar);
        qvVar.mo16656e(str2);
        this.f21788a.mo15857h(qvVar, new C3712rp(this, tsVar));
    }

    /* renamed from: N */
    public final void mo15831N(C3554n nVar, C3781ts tsVar) {
        C4141r.m28217g(nVar.mo16427J1());
        C4141r.m28221k(tsVar);
        this.f21788a.mo15859j(nVar, new C3876wp(this, tsVar));
    }

    /* renamed from: O */
    public final void mo15832O(String str, C3781ts tsVar) {
        C4141r.m28221k(tsVar);
        this.f21788a.mo15861l(new C3719s(str), new C3812uq(this, tsVar));
    }

    /* renamed from: a */
    public final void mo15833a(C3126a0 a0Var, C3781ts tsVar) {
        C4141r.m28221k(a0Var);
        C4141r.m28221k(tsVar);
        a0Var.mo15690K1(true);
        this.f21788a.mo15864o(a0Var, new C3779tq(this, tsVar));
    }

    /* renamed from: b */
    public final void mo15834b(C3258e0 e0Var, C3781ts tsVar) {
        C4141r.m28221k(e0Var);
        C4141r.m28221k(tsVar);
        this.f21788a.mo15865p(e0Var, new C3449jq(this, tsVar));
    }

    /* renamed from: c */
    public final void mo15835c(String str, String str2, String str3, C3781ts tsVar) {
        C4141r.m28217g(str);
        C4141r.m28217g(str2);
        C4141r.m28221k(tsVar);
        this.f21788a.mo15866q(new C3357h0(str, str2, str3), new C3481kp(this, tsVar));
    }

    /* renamed from: d */
    public final void mo15836d(C7814j jVar, C3781ts tsVar) {
        C4141r.m28221k(jVar);
        C4141r.m28221k(tsVar);
        if (jVar.mo26122R1()) {
            m25152m(jVar.mo26117M1(), new C3514lp(this, jVar, tsVar));
        } else {
            m25153n(new C3190bv(jVar, (String) null), tsVar);
        }
    }

    /* renamed from: e */
    public final void mo15837e(C3423j0 j0Var, C3781ts tsVar) {
        C4141r.m28221k(j0Var);
        C4141r.m28221k(tsVar);
        this.f21788a.mo15867r(j0Var, new C3908xp(this, tsVar));
    }

    /* renamed from: f */
    public final void mo15838f(C3785u uVar, C3781ts tsVar) {
        C4141r.m28221k(uVar);
        C4141r.m28221k(tsVar);
        this.f21788a.mo15862m(uVar, new C3416iq(this, tsVar));
    }

    /* renamed from: g */
    public final void mo15839g(C3850w wVar, C3781ts tsVar) {
        C4141r.m28221k(wVar);
        C4141r.m28221k(tsVar);
        this.f21788a.mo15863n(wVar, new C3581nq(this, tsVar));
    }

    /* renamed from: h */
    public final void mo15840h(String str, String str2, C3781ts tsVar) {
        C4141r.m28217g(str);
        C4141r.m28217g(str2);
        C4141r.m28221k(tsVar);
        m25152m(str, new C3383hq(this, str2, tsVar));
    }

    /* renamed from: i */
    public final void mo15841i(String str, C3781ts tsVar) {
        C4141r.m28217g(str);
        C4141r.m28221k(tsVar);
        m25152m(str, new C3251dq(this, tsVar));
    }

    /* renamed from: j */
    public final void mo15842j(String str, String str2, C3781ts tsVar) {
        C4141r.m28217g(str);
        C4141r.m28217g(str2);
        C4141r.m28221k(tsVar);
        m25152m(str2, new C3317fq(this, str, tsVar));
    }

    /* renamed from: k */
    public final void mo15843k(String str, C7866y0 y0Var, C3781ts tsVar) {
        C4141r.m28217g(str);
        C4141r.m28221k(y0Var);
        C4141r.m28221k(tsVar);
        m25152m(str, new C3877wq(this, y0Var, tsVar));
    }

    /* renamed from: l */
    public final void mo15844l(C3685qv qvVar, C3781ts tsVar) {
        m25155p(qvVar, tsVar);
    }

    /* renamed from: w */
    public final void mo15845w(String str, String str2, C3781ts tsVar) {
        C4141r.m28217g(str);
        C4141r.m28221k(tsVar);
        C3653q qVar = new C3653q();
        qVar.mo16577e(str);
        qVar.mo16580h(str2);
        this.f21788a.mo15860k(qVar, new C3973zq(this, tsVar));
    }

    /* renamed from: x */
    public final void mo15846x(String str, String str2, C3781ts tsVar) {
        C4141r.m28217g(str);
        C4141r.m28217g(str2);
        C4141r.m28221k(tsVar);
        m25152m(str, new C3909xq(this, str2, tsVar));
    }

    /* renamed from: y */
    public final void mo15847y(String str, String str2, C3781ts tsVar) {
        C4141r.m28217g(str);
        C4141r.m28217g(str2);
        C4141r.m28221k(tsVar);
        m25152m(str, new C3941yq(this, str2, tsVar));
    }

    /* renamed from: z */
    public final void mo15848z(String str, String str2, C3781ts tsVar) {
        C4141r.m28217g(str);
        C4141r.m28221k(tsVar);
        this.f21788a.mo15858i(new C3455k(str, (String) null, str2), new C3745sp(this, tsVar));
    }
}
