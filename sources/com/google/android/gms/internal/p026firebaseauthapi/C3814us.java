package com.google.android.gms.internal.p026firebaseauthapi;

import android.content.Context;
import com.google.firebase.auth.C7830n0;
import p033d5.C4141r;
import p054g5.C4410a;
import p246h7.C10412f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.us */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3814us {

    /* renamed from: c */
    private static final C4410a f22788c = new C4410a("FirebaseAuth", "FirebaseAuthFallback:");

    /* renamed from: a */
    private final C3186br f22789a;

    /* renamed from: b */
    private final C3651pu f22790b;

    C3814us(C10412f fVar) {
        C4141r.m28221k(fVar);
        Context m = fVar.mo33469m();
        C4141r.m28221k(m);
        this.f22789a = new C3186br(new C3419it(fVar, C3386ht.m25724a(), (C3354gu) null, (C3221ct) null, (C3254dt) null));
        this.f22790b = new C3651pu(m);
    }

    /* renamed from: g */
    private static boolean m27151g(long j, boolean z) {
        if (j > 0 && z) {
            return true;
        }
        f22788c.mo17935h("App hash will not be appended to the request.", new Object[0]);
        return false;
    }

    /* renamed from: A */
    public final void mo16887A(C3348go goVar, C3715rs rsVar) {
        C4141r.m28221k(goVar);
        C4141r.m28221k(goVar.mo16087I1());
        C4141r.m28221k(rsVar);
        this.f22789a.mo15833a(goVar.mo16087I1(), new C3781ts(rsVar, f22788c));
    }

    /* renamed from: B */
    public final void mo16888B(C3414io ioVar, C3715rs rsVar) {
        C4141r.m28221k(ioVar);
        C4141r.m28217g(ioVar.mo16189I1());
        C4141r.m28221k(rsVar);
        this.f22789a.mo15834b(new C3258e0(ioVar.mo16189I1(), ioVar.zza()), new C3781ts(rsVar, f22788c));
    }

    /* renamed from: C */
    public final void mo16889C(C3480ko koVar, C3715rs rsVar) {
        C4141r.m28221k(koVar);
        C4141r.m28217g(koVar.zza());
        C4141r.m28217g(koVar.mo16266I1());
        C4141r.m28221k(rsVar);
        this.f22789a.mo15835c(koVar.zza(), koVar.mo16266I1(), koVar.mo16267J1(), new C3781ts(rsVar, f22788c));
    }

    /* renamed from: D */
    public final void mo16890D(C3546mo moVar, C3715rs rsVar) {
        C4141r.m28221k(moVar);
        C4141r.m28221k(moVar.mo16400I1());
        C4141r.m28221k(rsVar);
        this.f22789a.mo15836d(moVar.mo16400I1(), new C3781ts(rsVar, f22788c));
    }

    /* renamed from: E */
    public final void mo16891E(C3612oo ooVar, C3715rs rsVar) {
        C4141r.m28221k(rsVar);
        C4141r.m28221k(ooVar);
        this.f22789a.mo15837e(C3321fu.m25602a((C7830n0) C4141r.m28221k(ooVar.mo16519I1())), new C3781ts(rsVar, f22788c));
    }

    /* renamed from: F */
    public final void mo16892F(C3678qo qoVar, C3715rs rsVar) {
        C4141r.m28221k(qoVar);
        C4141r.m28221k(rsVar);
        String L1 = qoVar.mo16611L1();
        C3781ts tsVar = new C3781ts(rsVar, f22788c);
        if (this.f22790b.mo16570l(L1)) {
            if (qoVar.mo16614O1()) {
                this.f22790b.mo16568j(L1);
            } else {
                this.f22790b.mo16567i(tsVar, L1);
                return;
            }
        }
        long I1 = qoVar.mo16608I1();
        boolean P1 = qoVar.mo16615P1();
        C3785u a = C3785u.m27069a(qoVar.mo16609J1(), qoVar.mo16611L1(), qoVar.mo16610K1(), qoVar.mo16612M1(), qoVar.mo16613N1());
        if (m27151g(I1, P1)) {
            a.mo16844c(new C3849vu(this.f22790b.mo16565c()));
        }
        this.f22790b.mo16569k(L1, tsVar, I1, P1);
        this.f22789a.mo15838f(a, new C3552mu(this.f22790b, tsVar, L1));
    }

    /* renamed from: a */
    public final void mo16893a(C3744so soVar, C3715rs rsVar) {
        C4141r.m28221k(soVar);
        C4141r.m28221k(rsVar);
        String Y = soVar.mo16770J1().mo26185Y();
        C3781ts tsVar = new C3781ts(rsVar, f22788c);
        if (this.f22790b.mo16570l(Y)) {
            if (soVar.mo16775O1()) {
                this.f22790b.mo16568j(Y);
            } else {
                this.f22790b.mo16567i(tsVar, Y);
                return;
            }
        }
        long I1 = soVar.mo16769I1();
        boolean P1 = soVar.mo16776P1();
        C3850w a = C3850w.m27263a(soVar.mo16772L1(), soVar.mo16770J1().mo26111b(), soVar.mo16770J1().mo26185Y(), soVar.mo16771K1(), soVar.mo16773M1(), soVar.mo16774N1());
        if (m27151g(I1, P1)) {
            a.mo16973c(new C3849vu(this.f22790b.mo16565c()));
        }
        this.f22790b.mo16569k(Y, tsVar, I1, P1);
        this.f22789a.mo15839g(a, new C3552mu(this.f22790b, tsVar, Y));
    }

    /* renamed from: b */
    public final void mo16894b(C3843vo voVar, C3715rs rsVar) {
        C4141r.m28221k(voVar);
        C4141r.m28221k(rsVar);
        this.f22789a.mo15840h(voVar.zza(), voVar.mo16961I1(), new C3781ts(rsVar, f22788c));
    }

    /* renamed from: c */
    public final void mo16895c(C3907xo xoVar, C3715rs rsVar) {
        C4141r.m28221k(xoVar);
        C4141r.m28217g(xoVar.zza());
        C4141r.m28221k(rsVar);
        this.f22789a.mo15841i(xoVar.zza(), new C3781ts(rsVar, f22788c));
    }

    /* renamed from: d */
    public final void mo16896d(C3971zo zoVar, C3715rs rsVar) {
        C4141r.m28221k(zoVar);
        C4141r.m28217g(zoVar.mo17125I1());
        C4141r.m28217g(zoVar.zza());
        C4141r.m28221k(rsVar);
        this.f22789a.mo15842j(zoVar.mo17125I1(), zoVar.zza(), new C3781ts(rsVar, f22788c));
    }

    /* renamed from: e */
    public final void mo16897e(C3184bp bpVar, C3715rs rsVar) {
        C4141r.m28221k(bpVar);
        C4141r.m28217g(bpVar.mo15816J1());
        C4141r.m28221k(bpVar.mo15815I1());
        C4141r.m28221k(rsVar);
        this.f22789a.mo15843k(bpVar.mo15816J1(), bpVar.mo15815I1(), new C3781ts(rsVar, f22788c));
    }

    /* renamed from: f */
    public final void mo16898f(C3250dp dpVar, C3715rs rsVar) {
        C4141r.m28221k(dpVar);
        this.f22789a.mo15844l(C3685qv.m26649b(dpVar.mo15968I1(), dpVar.mo15969J1(), dpVar.mo15970K1()), new C3781ts(rsVar, f22788c));
    }

    /* renamed from: h */
    public final void mo16899h(C3742sm smVar, C3715rs rsVar) {
        C4141r.m28221k(smVar);
        C4141r.m28217g(smVar.zza());
        C4141r.m28221k(rsVar);
        this.f22789a.mo15845w(smVar.zza(), smVar.mo16764I1(), new C3781ts(rsVar, f22788c));
    }

    /* renamed from: i */
    public final void mo16900i(C3841vm vmVar, C3715rs rsVar) {
        C4141r.m28221k(vmVar);
        C4141r.m28217g(vmVar.zza());
        C4141r.m28217g(vmVar.mo16958I1());
        C4141r.m28221k(rsVar);
        this.f22789a.mo15846x(vmVar.zza(), vmVar.mo16958I1(), new C3781ts(rsVar, f22788c));
    }

    /* renamed from: j */
    public final void mo16901j(C3905xm xmVar, C3715rs rsVar) {
        C4141r.m28221k(xmVar);
        C4141r.m28217g(xmVar.zza());
        C4141r.m28217g(xmVar.mo17054I1());
        C4141r.m28221k(rsVar);
        this.f22789a.mo15847y(xmVar.zza(), xmVar.mo17054I1(), new C3781ts(rsVar, f22788c));
    }

    /* renamed from: k */
    public final void mo16902k(C3969zm zmVar, C3715rs rsVar) {
        C4141r.m28221k(zmVar);
        C4141r.m28217g(zmVar.zza());
        C4141r.m28221k(rsVar);
        this.f22789a.mo15848z(zmVar.zza(), zmVar.mo17120I1(), new C3781ts(rsVar, f22788c));
    }

    /* renamed from: l */
    public final void mo16903l(C3182bn bnVar, C3715rs rsVar) {
        C4141r.m28221k(bnVar);
        C4141r.m28217g(bnVar.zza());
        C4141r.m28217g(bnVar.mo15809I1());
        C4141r.m28221k(rsVar);
        this.f22789a.mo15818A(bnVar.zza(), bnVar.mo15809I1(), bnVar.mo15810J1(), new C3781ts(rsVar, f22788c));
    }

    /* renamed from: m */
    public final void mo16904m(C3248dn dnVar, C3715rs rsVar) {
        C4141r.m28221k(dnVar);
        C4141r.m28217g(dnVar.zza());
        C4141r.m28217g(dnVar.mo15962I1());
        C4141r.m28221k(rsVar);
        this.f22789a.mo15819B(dnVar.zza(), dnVar.mo15962I1(), dnVar.mo15963J1(), new C3781ts(rsVar, f22788c));
    }

    /* renamed from: n */
    public final void mo16905n(C3314fn fnVar, C3715rs rsVar) {
        C4141r.m28221k(fnVar);
        C4141r.m28217g(fnVar.zza());
        C4141r.m28221k(rsVar);
        this.f22789a.mo15820C(fnVar.zza(), new C3781ts(rsVar, f22788c));
    }

    /* renamed from: o */
    public final void mo16906o(C3380hn hnVar, C3715rs rsVar) {
        C4141r.m28221k(hnVar);
        C4141r.m28221k(rsVar);
        this.f22789a.mo15821D(C3256dv.m25449a(hnVar.mo16100J1(), (String) C4141r.m28221k(hnVar.mo16099I1().mo26149R1()), (String) C4141r.m28221k(hnVar.mo16099I1().mo26145L1()), hnVar.mo16101K1()), hnVar.mo16100J1(), new C3781ts(rsVar, f22788c));
    }

    /* renamed from: p */
    public final void mo16907p(C3446jn jnVar, C3715rs rsVar) {
        C4141r.m28221k(jnVar);
        C4141r.m28221k(rsVar);
        this.f22789a.mo15822E(C3322fv.m25603a(jnVar.mo16229J1(), (String) C4141r.m28221k(jnVar.mo16228I1().mo26149R1()), (String) C4141r.m28221k(jnVar.mo16228I1().mo26145L1())), new C3781ts(rsVar, f22788c));
    }

    /* renamed from: q */
    public final void mo16908q(C3512ln lnVar, C3715rs rsVar) {
        C4141r.m28221k(lnVar);
        C4141r.m28221k(rsVar);
        C4141r.m28217g(lnVar.zza());
        this.f22789a.mo15823F(lnVar.zza(), new C3781ts(rsVar, f22788c));
    }

    /* renamed from: r */
    public final void mo16909r(C3578nn nnVar, C3715rs rsVar) {
        C4141r.m28221k(nnVar);
        C4141r.m28217g(nnVar.zza());
        this.f22789a.mo15824G(nnVar.zza(), nnVar.mo16465I1(), new C3781ts(rsVar, f22788c));
    }

    /* renamed from: s */
    public final void mo16910s(C3644pn pnVar, C3715rs rsVar) {
        C4141r.m28221k(pnVar);
        C4141r.m28217g(pnVar.mo16559I1());
        C4141r.m28217g(pnVar.mo16560J1());
        C4141r.m28217g(pnVar.zza());
        C4141r.m28221k(rsVar);
        this.f22789a.mo15825H(pnVar.mo16559I1(), pnVar.mo16560J1(), pnVar.zza(), new C3781ts(rsVar, f22788c));
    }

    /* renamed from: t */
    public final void mo16911t(C3710rn rnVar, C3715rs rsVar) {
        C4141r.m28221k(rnVar);
        C4141r.m28217g(rnVar.mo16674J1());
        C4141r.m28221k(rnVar.mo16673I1());
        C4141r.m28221k(rsVar);
        this.f22789a.mo15826I(rnVar.mo16674J1(), rnVar.mo16673I1(), new C3781ts(rsVar, f22788c));
    }

    /* renamed from: u */
    public final void mo16912u(C3776tn tnVar, C3715rs rsVar) {
        C4141r.m28221k(rsVar);
        C4141r.m28221k(tnVar);
        this.f22789a.mo15827J(C4141r.m28217g(tnVar.mo16818J1()), C3321fu.m25602a((C7830n0) C4141r.m28221k(tnVar.mo16817I1())), new C3781ts(rsVar, f22788c));
    }

    /* renamed from: v */
    public final void mo16913v(C3874wn wnVar, C3715rs rsVar) {
        C4141r.m28221k(wnVar);
        C4141r.m28217g(wnVar.zza());
        C4141r.m28221k(rsVar);
        this.f22789a.mo15828K(wnVar.zza(), new C3781ts(rsVar, f22788c));
    }

    /* renamed from: w */
    public final void mo16914w(C3938yn ynVar, C3715rs rsVar) {
        C4141r.m28221k(ynVar);
        C4141r.m28217g(ynVar.mo17085J1());
        C4141r.m28221k(rsVar);
        this.f22789a.mo15829L(ynVar.mo17085J1(), ynVar.mo17084I1(), new C3781ts(rsVar, f22788c));
    }

    /* renamed from: x */
    public final void mo16915x(C3150ao aoVar, C3715rs rsVar) {
        C4141r.m28221k(aoVar);
        C4141r.m28217g(aoVar.mo15749J1());
        C4141r.m28221k(rsVar);
        this.f22789a.mo15830M(aoVar.mo15749J1(), aoVar.mo15748I1(), aoVar.mo15750K1(), new C3781ts(rsVar, f22788c));
    }

    /* renamed from: y */
    public final void mo16916y(C3216co coVar, C3715rs rsVar) {
        C4141r.m28221k(rsVar);
        C4141r.m28221k(coVar);
        C3554n nVar = (C3554n) C4141r.m28221k(coVar.mo15911I1());
        String J1 = nVar.mo16427J1();
        C3781ts tsVar = new C3781ts(rsVar, f22788c);
        if (this.f22790b.mo16570l(J1)) {
            if (nVar.mo16429L1()) {
                this.f22790b.mo16568j(J1);
            } else {
                this.f22790b.mo16567i(tsVar, J1);
                return;
            }
        }
        long d = nVar.mo16431d();
        boolean M1 = nVar.mo16430M1();
        if (m27151g(d, M1)) {
            nVar.mo16428K1(new C3849vu(this.f22790b.mo16565c()));
        }
        this.f22790b.mo16569k(J1, tsVar, d, M1);
        this.f22789a.mo15831N(nVar, new C3552mu(this.f22790b, tsVar, J1));
    }

    /* renamed from: z */
    public final void mo16917z(C3282eo eoVar, C3715rs rsVar) {
        C4141r.m28221k(eoVar);
        C4141r.m28221k(rsVar);
        this.f22789a.mo15832O(eoVar.zza(), new C3781ts(rsVar, f22788c));
    }
}
