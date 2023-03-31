package com.google.android.gms.internal.p026firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import p033d5.C4141r;
import p246h7.C10412f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.it */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3419it extends C3189bu implements C3750su {

    /* renamed from: a */
    private C3221ct f22175a;

    /* renamed from: b */
    private C3254dt f22176b;

    /* renamed from: c */
    private C3354gu f22177c;

    /* renamed from: d */
    private final C3386ht f22178d;

    /* renamed from: e */
    private final C10412f f22179e;

    /* renamed from: f */
    private final String f22180f;

    /* renamed from: g */
    C3452jt f22181g;

    C3419it(C10412f fVar, C3386ht htVar, C3354gu guVar, C3221ct ctVar, C3254dt dtVar) {
        this.f22179e = fVar;
        String b = fVar.mo33471r().mo33479b();
        this.f22180f = b;
        this.f22178d = (C3386ht) C4141r.m28221k(htVar);
        m25835u((C3354gu) null, (C3221ct) null, (C3254dt) null);
        C3783tu.m27055e(b, this);
    }

    /* renamed from: t */
    private final C3452jt m25834t() {
        if (this.f22181g == null) {
            C10412f fVar = this.f22179e;
            this.f22181g = new C3452jt(fVar.mo33469m(), fVar, this.f22178d.mo16109b());
        }
        return this.f22181g;
    }

    /* renamed from: u */
    private final void m25835u(C3354gu guVar, C3221ct ctVar, C3254dt dtVar) {
        this.f22177c = null;
        this.f22175a = null;
        this.f22176b = null;
        String a = C3684qu.m26648a("firebear.secureToken");
        if (TextUtils.isEmpty(a)) {
            a = C3783tu.m27054d(this.f22180f);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for secureToken URL: ".concat(String.valueOf(a)));
        }
        if (this.f22177c == null) {
            this.f22177c = new C3354gu(a, m25834t());
        }
        String a2 = C3684qu.m26648a("firebear.identityToolkit");
        if (TextUtils.isEmpty(a2)) {
            a2 = C3783tu.m27052b(this.f22180f);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkit URL: ".concat(String.valueOf(a2)));
        }
        if (this.f22175a == null) {
            this.f22175a = new C3221ct(a2, m25834t());
        }
        String a3 = C3684qu.m26648a("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(a3)) {
            a3 = C3783tu.m27053c(this.f22180f);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkitV2 URL: ".concat(String.valueOf(a3)));
        }
        if (this.f22176b == null) {
            this.f22176b = new C3254dt(a3, m25834t());
        }
    }

    /* renamed from: V */
    public final void mo16194V() {
        m25835u((C3354gu) null, (C3221ct) null, (C3254dt) null);
    }

    /* renamed from: a */
    public final void mo15850a(C3913xu xuVar, C3156au auVar) {
        C4141r.m28221k(xuVar);
        C4141r.m28221k(auVar);
        C3221ct ctVar = this.f22175a;
        C3255du.m25446a(ctVar.mo15849a("/createAuthUri", this.f22180f), xuVar, auVar, C3945yu.class, ctVar.f21791b);
    }

    /* renamed from: b */
    public final void mo15851b(C3157av avVar, C3156au auVar) {
        C4141r.m28221k(avVar);
        C4141r.m28221k(auVar);
        C3221ct ctVar = this.f22175a;
        C3255du.m25446a(ctVar.mo15849a("/deleteAccount", this.f22180f), avVar, auVar, Void.class, ctVar.f21791b);
    }

    /* renamed from: c */
    public final void mo15852c(C3190bv bvVar, C3156au auVar) {
        C4141r.m28221k(bvVar);
        C4141r.m28221k(auVar);
        C3221ct ctVar = this.f22175a;
        C3255du.m25446a(ctVar.mo15849a("/emailLinkSignin", this.f22180f), bvVar, auVar, C3223cv.class, ctVar.f21791b);
    }

    /* renamed from: d */
    public final void mo15853d(C3256dv dvVar, C3156au auVar) {
        C4141r.m28221k(dvVar);
        C4141r.m28221k(auVar);
        C3254dt dtVar = this.f22176b;
        C3255du.m25446a(dtVar.mo15849a("/accounts/mfaEnrollment:finalize", this.f22180f), dvVar, auVar, C3289ev.class, dtVar.f21791b);
    }

    /* renamed from: e */
    public final void mo15854e(C3322fv fvVar, C3156au auVar) {
        C4141r.m28221k(fvVar);
        C4141r.m28221k(auVar);
        C3254dt dtVar = this.f22176b;
        C3255du.m25446a(dtVar.mo15849a("/accounts/mfaSignIn:finalize", this.f22180f), fvVar, auVar, C3355gv.class, dtVar.f21791b);
    }

    /* renamed from: f */
    public final void mo15855f(C3421iv ivVar, C3156au auVar) {
        C4141r.m28221k(ivVar);
        C4141r.m28221k(auVar);
        C3354gu guVar = this.f22177c;
        C3255du.m25446a(guVar.mo15849a("/token", this.f22180f), ivVar, auVar, C3784tv.class, guVar.f21791b);
    }

    /* renamed from: g */
    public final void mo15856g(C3454jv jvVar, C3156au auVar) {
        C4141r.m28221k(jvVar);
        C4141r.m28221k(auVar);
        C3221ct ctVar = this.f22175a;
        C3255du.m25446a(ctVar.mo15849a("/getAccountInfo", this.f22180f), jvVar, auVar, C3487kv.class, ctVar.f21791b);
    }

    /* renamed from: h */
    public final void mo15857h(C3685qv qvVar, C3156au auVar) {
        C4141r.m28221k(qvVar);
        C4141r.m28221k(auVar);
        if (qvVar.mo16653a() != null) {
            m25834t().mo16234b(qvVar.mo16653a().mo26080T1());
        }
        C3221ct ctVar = this.f22175a;
        C3255du.m25446a(ctVar.mo15849a("/getOobConfirmationCode", this.f22180f), qvVar, auVar, C3718rv.class, ctVar.f21791b);
    }

    /* renamed from: i */
    public final void mo15858i(C3455k kVar, C3156au auVar) {
        C4141r.m28221k(kVar);
        C4141r.m28221k(auVar);
        C3221ct ctVar = this.f22175a;
        C3255du.m25446a(ctVar.mo15849a("/resetPassword", this.f22180f), kVar, auVar, C3488l.class, ctVar.f21791b);
    }

    /* renamed from: j */
    public final void mo15859j(C3554n nVar, C3156au auVar) {
        C4141r.m28221k(nVar);
        C4141r.m28221k(auVar);
        if (!TextUtils.isEmpty(nVar.mo16426I1())) {
            m25834t().mo16234b(nVar.mo16426I1());
        }
        C3221ct ctVar = this.f22175a;
        C3255du.m25446a(ctVar.mo15849a("/sendVerificationCode", this.f22180f), nVar, auVar, C3620p.class, ctVar.f21791b);
    }

    /* renamed from: k */
    public final void mo15860k(C3653q qVar, C3156au auVar) {
        C4141r.m28221k(qVar);
        C4141r.m28221k(auVar);
        C3221ct ctVar = this.f22175a;
        C3255du.m25446a(ctVar.mo15849a("/setAccountInfo", this.f22180f), qVar, auVar, C3686r.class, ctVar.f21791b);
    }

    /* renamed from: l */
    public final void mo15861l(C3719s sVar, C3156au auVar) {
        C4141r.m28221k(sVar);
        C4141r.m28221k(auVar);
        C3221ct ctVar = this.f22175a;
        C3255du.m25446a(ctVar.mo15849a("/signupNewUser", this.f22180f), sVar, auVar, C3752t.class, ctVar.f21791b);
    }

    /* renamed from: m */
    public final void mo15862m(C3785u uVar, C3156au auVar) {
        C4141r.m28221k(uVar);
        C4141r.m28221k(auVar);
        if (!TextUtils.isEmpty(uVar.mo16843b())) {
            m25834t().mo16234b(uVar.mo16843b());
        }
        C3254dt dtVar = this.f22176b;
        C3255du.m25446a(dtVar.mo15849a("/accounts/mfaEnrollment:start", this.f22180f), uVar, auVar, C3818v.class, dtVar.f21791b);
    }

    /* renamed from: n */
    public final void mo15863n(C3850w wVar, C3156au auVar) {
        C4141r.m28221k(wVar);
        C4141r.m28221k(auVar);
        if (!TextUtils.isEmpty(wVar.mo16972b())) {
            m25834t().mo16234b(wVar.mo16972b());
        }
        C3254dt dtVar = this.f22176b;
        C3255du.m25446a(dtVar.mo15849a("/accounts/mfaSignIn:start", this.f22180f), wVar, auVar, C3882x.class, dtVar.f21791b);
    }

    /* renamed from: o */
    public final void mo15864o(C3126a0 a0Var, C3156au auVar) {
        C4141r.m28221k(a0Var);
        C4141r.m28221k(auVar);
        C3221ct ctVar = this.f22175a;
        C3255du.m25446a(ctVar.mo15849a("/verifyAssertion", this.f22180f), a0Var, auVar, C3225d0.class, ctVar.f21791b);
    }

    /* renamed from: p */
    public final void mo15865p(C3258e0 e0Var, C3156au auVar) {
        C4141r.m28221k(e0Var);
        C4141r.m28221k(auVar);
        C3221ct ctVar = this.f22175a;
        C3255du.m25446a(ctVar.mo15849a("/verifyCustomToken", this.f22180f), e0Var, auVar, C3291f0.class, ctVar.f21791b);
    }

    /* renamed from: q */
    public final void mo15866q(C3357h0 h0Var, C3156au auVar) {
        C4141r.m28221k(h0Var);
        C4141r.m28221k(auVar);
        C3221ct ctVar = this.f22175a;
        C3255du.m25446a(ctVar.mo15849a("/verifyPassword", this.f22180f), h0Var, auVar, C3390i0.class, ctVar.f21791b);
    }

    /* renamed from: r */
    public final void mo15867r(C3423j0 j0Var, C3156au auVar) {
        C4141r.m28221k(j0Var);
        C4141r.m28221k(auVar);
        C3221ct ctVar = this.f22175a;
        C3255du.m25446a(ctVar.mo15849a("/verifyPhoneNumber", this.f22180f), j0Var, auVar, C3456k0.class, ctVar.f21791b);
    }

    /* renamed from: s */
    public final void mo15868s(C3489l0 l0Var, C3156au auVar) {
        C4141r.m28221k(l0Var);
        C4141r.m28221k(auVar);
        C3254dt dtVar = this.f22176b;
        C3255du.m25446a(dtVar.mo15849a("/accounts/mfaEnrollment:withdraw", this.f22180f), l0Var, auVar, C3522m0.class, dtVar.f21791b);
    }
}
