package com.google.android.gms.internal.p026firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.C7793e;
import com.google.firebase.auth.C7806h;
import com.google.firebase.auth.C7814j;
import com.google.firebase.auth.C7830n0;
import com.google.firebase.auth.C7837p0;
import com.google.firebase.auth.C7842q0;
import com.google.firebase.auth.C7848s0;
import com.google.firebase.auth.C7866y0;
import com.google.firebase.auth.C7869z;
import com.pichillilorenzo.flutter_inappwebview.credential_database.URLCredentialContract;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p033d5.C4141r;
import p218e6.C9975i;
import p218e6.C9980l;
import p246h7.C10412f;
import p293m7.C11816e0;
import p293m7.C11829i1;
import p293m7.C11830j;
import p293m7.C11841m1;
import p293m7.C11846o0;
import p293m7.C11847o1;
import p293m7.C11850q;
import p293m7.C11861v0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.qs */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3682qs extends C3944yt {
    public C3682qs(C10412f fVar) {
        this.f22966a = new C3814us(fVar);
        this.f22967b = Executors.newCachedThreadPool();
    }

    /* renamed from: o */
    static C11841m1 m26612o(C10412f fVar, C3553mv mvVar) {
        C4141r.m28221k(fVar);
        C4141r.m28221k(mvVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C11829i1(mvVar, "firebase"));
        List Y1 = mvVar.mo16421Y1();
        if (Y1 != null && !Y1.isEmpty()) {
            for (int i = 0; i < Y1.size(); i++) {
                arrayList.add(new C11829i1((C3323g) Y1.get(i)));
            }
        }
        C11841m1 m1Var = new C11841m1(fVar, arrayList);
        m1Var.mo36087t2(new C11847o1(mvVar.mo16424d(), mvVar.mo16405I1()));
        m1Var.mo36086s2(mvVar.mo16423a2());
        m1Var.mo36085r2(mvVar.mo16407K1());
        m1Var.mo26252l2(C11816e0.m57209b(mvVar.mo16420X1()));
        return m1Var;
    }

    /* renamed from: A */
    public final C9975i mo16617A(C10412f fVar, C7869z zVar, C7806h hVar, String str, C11846o0 o0Var) {
        C3681qr qrVar = new C3681qr(hVar, str);
        qrVar.mo16966e(fVar);
        qrVar.mo16967f(zVar);
        qrVar.mo16964c(o0Var);
        qrVar.mo16965d(o0Var);
        return mo17089a(qrVar);
    }

    /* renamed from: B */
    public final C9975i mo16618B(C10412f fVar, C7869z zVar, C7814j jVar, C11846o0 o0Var) {
        C3714rr rrVar = new C3714rr(jVar);
        rrVar.mo16966e(fVar);
        rrVar.mo16967f(zVar);
        rrVar.mo16964c(o0Var);
        rrVar.mo16965d(o0Var);
        return mo17089a(rrVar);
    }

    /* renamed from: C */
    public final C9975i mo16619C(C10412f fVar, C7869z zVar, String str, String str2, String str3, C11846o0 o0Var) {
        C3747sr srVar = new C3747sr(str, str2, str3);
        srVar.mo16966e(fVar);
        srVar.mo16967f(zVar);
        srVar.mo16964c(o0Var);
        srVar.mo16965d(o0Var);
        return mo17089a(srVar);
    }

    /* renamed from: D */
    public final C9975i mo16620D(C10412f fVar, C7869z zVar, C7830n0 n0Var, String str, C11846o0 o0Var) {
        C3453ju.m25951c();
        C3813ur urVar = new C3813ur(n0Var, str);
        urVar.mo16966e(fVar);
        urVar.mo16967f(zVar);
        urVar.mo16964c(o0Var);
        urVar.mo16965d(o0Var);
        return mo17089a(urVar);
    }

    /* renamed from: E */
    public final C9975i mo16621E(C10412f fVar, C7869z zVar, C11846o0 o0Var) {
        C3846vr vrVar = new C3846vr();
        vrVar.mo16966e(fVar);
        vrVar.mo16967f(zVar);
        vrVar.mo16964c(o0Var);
        vrVar.mo16965d(o0Var);
        return mo17089a(vrVar);
    }

    /* renamed from: F */
    public final C9975i mo16622F(C10412f fVar, C7793e eVar, String str) {
        C3878wr wrVar = new C3878wr(str, eVar);
        wrVar.mo16966e(fVar);
        return mo17089a(wrVar);
    }

    /* renamed from: G */
    public final C9975i mo16623G(C10412f fVar, String str, C7793e eVar, String str2) {
        eVar.mo26082V1(1);
        C3910xr xrVar = new C3910xr(str, eVar, str2, "sendPasswordResetEmail");
        xrVar.mo16966e(fVar);
        return mo17089a(xrVar);
    }

    /* renamed from: H */
    public final C9975i mo16624H(C10412f fVar, String str, C7793e eVar, String str2) {
        eVar.mo26082V1(6);
        C3910xr xrVar = new C3910xr(str, eVar, str2, "sendSignInLinkToEmail");
        xrVar.mo16966e(fVar);
        return mo17089a(xrVar);
    }

    /* renamed from: I */
    public final C9975i mo16625I(C10412f fVar, C11861v0 v0Var, String str) {
        C3942yr yrVar = new C3942yr(str);
        yrVar.mo16966e(fVar);
        yrVar.mo16964c(v0Var);
        return mo17089a(yrVar);
    }

    /* renamed from: J */
    public final C9975i mo16626J(C10412f fVar, C7806h hVar, String str, C11861v0 v0Var) {
        C3974zr zrVar = new C3974zr(hVar, str);
        zrVar.mo16966e(fVar);
        zrVar.mo16964c(v0Var);
        return mo17089a(zrVar);
    }

    /* renamed from: K */
    public final C9975i mo16627K(C10412f fVar, String str, String str2, C11861v0 v0Var) {
        C3154as asVar = new C3154as(str, str2);
        asVar.mo16966e(fVar);
        asVar.mo16964c(v0Var);
        return mo17089a(asVar);
    }

    /* renamed from: b */
    public final C9975i mo16628b(C10412f fVar, String str, String str2, String str3, C11861v0 v0Var) {
        C3187bs bsVar = new C3187bs(str, str2, str3);
        bsVar.mo16966e(fVar);
        bsVar.mo16964c(v0Var);
        return mo17089a(bsVar);
    }

    /* renamed from: c */
    public final C9975i mo16629c(C10412f fVar, C7814j jVar, C11861v0 v0Var) {
        C3220cs csVar = new C3220cs(jVar);
        csVar.mo16966e(fVar);
        csVar.mo16964c(v0Var);
        return mo17089a(csVar);
    }

    /* renamed from: d */
    public final C9975i mo16630d(C10412f fVar, C7830n0 n0Var, String str, C11861v0 v0Var) {
        C3453ju.m25951c();
        C3253ds dsVar = new C3253ds(n0Var, str);
        dsVar.mo16966e(fVar);
        dsVar.mo16964c(v0Var);
        return mo17089a(dsVar);
    }

    /* renamed from: e */
    public final C9975i mo16631e(C11830j jVar, String str, String str2, long j, boolean z, boolean z2, String str3, String str4, boolean z3, C7837p0.C7839b bVar, Executor executor, Activity activity) {
        C3286es esVar = new C3286es(jVar, str, str2, j, z, z2, str3, str4, z3);
        String str5 = str;
        esVar.mo16968g(bVar, activity, executor, str);
        return mo17089a(esVar);
    }

    /* renamed from: f */
    public final C9975i mo16632f(C11830j jVar, C7848s0 s0Var, String str, long j, boolean z, boolean z2, String str2, String str3, boolean z3, C7837p0.C7839b bVar, Executor executor, Activity activity) {
        C3319fs fsVar = new C3319fs(s0Var, C4141r.m28217g(jVar.mo36060L1()), str, j, z, z2, str2, str3, z3);
        Activity activity2 = activity;
        fsVar.mo16968g(bVar, activity2, executor, s0Var.mo26111b());
        return mo17089a(fsVar);
    }

    /* renamed from: g */
    public final C9975i mo16633g(C10412f fVar, C7869z zVar, String str, C11846o0 o0Var) {
        C3352gs gsVar = new C3352gs(zVar.mo26249i2(), str);
        gsVar.mo16966e(fVar);
        gsVar.mo16967f(zVar);
        gsVar.mo16964c(o0Var);
        gsVar.mo16965d(o0Var);
        return mo17089a(gsVar);
    }

    /* renamed from: h */
    public final C9975i mo16634h(C10412f fVar, C7869z zVar, String str, C11846o0 o0Var) {
        C4141r.m28221k(fVar);
        C4141r.m28217g(str);
        C4141r.m28221k(zVar);
        C4141r.m28221k(o0Var);
        List j2 = zVar.mo26250j2();
        if ((j2 != null && !j2.contains(str)) || zVar.mo26229O1()) {
            return C9980l.m51030d(C3847vs.m27245a(new Status(17016, str)));
        }
        if (((str.hashCode() == 1216985755 && str.equals(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD)) ? (char) 0 : 65535) != 0) {
            C3418is isVar = new C3418is(str);
            isVar.mo16966e(fVar);
            isVar.mo16967f(zVar);
            isVar.mo16964c(o0Var);
            isVar.mo16965d(o0Var);
            return mo17089a(isVar);
        }
        C3385hs hsVar = new C3385hs();
        hsVar.mo16966e(fVar);
        hsVar.mo16967f(zVar);
        hsVar.mo16964c(o0Var);
        hsVar.mo16965d(o0Var);
        return mo17089a(hsVar);
    }

    /* renamed from: i */
    public final C9975i mo16635i(C10412f fVar, C7869z zVar, String str, C11846o0 o0Var) {
        C3451js jsVar = new C3451js(str);
        jsVar.mo16966e(fVar);
        jsVar.mo16967f(zVar);
        jsVar.mo16964c(o0Var);
        jsVar.mo16965d(o0Var);
        return mo17089a(jsVar);
    }

    /* renamed from: j */
    public final C9975i mo16636j(C10412f fVar, C7869z zVar, String str, C11846o0 o0Var) {
        C3484ks ksVar = new C3484ks(str);
        ksVar.mo16966e(fVar);
        ksVar.mo16967f(zVar);
        ksVar.mo16964c(o0Var);
        ksVar.mo16965d(o0Var);
        return mo17089a(ksVar);
    }

    /* renamed from: k */
    public final C9975i mo16637k(C10412f fVar, C7869z zVar, C7830n0 n0Var, C11846o0 o0Var) {
        C3453ju.m25951c();
        C3517ls lsVar = new C3517ls(n0Var);
        lsVar.mo16966e(fVar);
        lsVar.mo16967f(zVar);
        lsVar.mo16964c(o0Var);
        lsVar.mo16965d(o0Var);
        return mo17089a(lsVar);
    }

    /* renamed from: l */
    public final C9975i mo16638l(C10412f fVar, C7869z zVar, C7866y0 y0Var, C11846o0 o0Var) {
        C3550ms msVar = new C3550ms(y0Var);
        msVar.mo16966e(fVar);
        msVar.mo16967f(zVar);
        msVar.mo16964c(o0Var);
        msVar.mo16965d(o0Var);
        return mo17089a(msVar);
    }

    /* renamed from: m */
    public final C9975i mo16639m(String str, String str2, C7793e eVar) {
        eVar.mo26082V1(7);
        return mo17089a(new C3583ns(str, str2, eVar));
    }

    /* renamed from: n */
    public final C9975i mo16640n(C10412f fVar, String str, String str2) {
        C3616os osVar = new C3616os(str, str2);
        osVar.mo16966e(fVar);
        return mo17089a(osVar);
    }

    /* renamed from: p */
    public final void mo16641p(C10412f fVar, C3554n nVar, C7837p0.C7839b bVar, Activity activity, Executor executor) {
        C3649ps psVar = new C3649ps(nVar);
        psVar.mo16966e(fVar);
        psVar.mo16968g(bVar, activity, executor, nVar.mo16427J1());
        mo17089a(psVar);
    }

    /* renamed from: q */
    public final C9975i mo16642q(C10412f fVar, String str, String str2) {
        C3252dr drVar = new C3252dr(str, str2);
        drVar.mo16966e(fVar);
        return mo17089a(drVar);
    }

    /* renamed from: r */
    public final C9975i mo16643r(C10412f fVar, String str, String str2) {
        C3285er erVar = new C3285er(str, str2);
        erVar.mo16966e(fVar);
        return mo17089a(erVar);
    }

    /* renamed from: s */
    public final C9975i mo16644s(C10412f fVar, String str, String str2, String str3) {
        C3318fr frVar = new C3318fr(str, str2, str3);
        frVar.mo16966e(fVar);
        return mo17089a(frVar);
    }

    /* renamed from: t */
    public final C9975i mo16645t(C10412f fVar, String str, String str2, String str3, C11861v0 v0Var) {
        C3351gr grVar = new C3351gr(str, str2, str3);
        grVar.mo16966e(fVar);
        grVar.mo16964c(v0Var);
        return mo17089a(grVar);
    }

    /* renamed from: u */
    public final C9975i mo16646u(C7869z zVar, C11850q qVar) {
        C3384hr hrVar = new C3384hr();
        hrVar.mo16967f(zVar);
        hrVar.mo16964c(qVar);
        hrVar.mo16965d(qVar);
        return mo17089a(hrVar);
    }

    /* renamed from: v */
    public final C9975i mo16647v(C10412f fVar, String str, String str2) {
        C3417ir irVar = new C3417ir(str, str2);
        irVar.mo16966e(fVar);
        return mo17089a(irVar);
    }

    /* renamed from: w */
    public final C9975i mo16648w(C10412f fVar, C7842q0 q0Var, C7869z zVar, String str, C11861v0 v0Var) {
        C3453ju.m25951c();
        C3450jr jrVar = new C3450jr(q0Var, zVar.mo26249i2(), str);
        jrVar.mo16966e(fVar);
        jrVar.mo16964c(v0Var);
        return mo17089a(jrVar);
    }

    /* renamed from: x */
    public final C9975i mo16649x(C10412f fVar, C7869z zVar, C7842q0 q0Var, String str, C11861v0 v0Var) {
        C3453ju.m25951c();
        C3483kr krVar = new C3483kr(q0Var, str);
        krVar.mo16966e(fVar);
        krVar.mo16964c(v0Var);
        if (zVar != null) {
            krVar.mo16967f(zVar);
        }
        return mo17089a(krVar);
    }

    /* renamed from: y */
    public final C9975i mo16650y(C10412f fVar, C7869z zVar, String str, C11846o0 o0Var) {
        C3516lr lrVar = new C3516lr(str);
        lrVar.mo16966e(fVar);
        lrVar.mo16967f(zVar);
        lrVar.mo16964c(o0Var);
        lrVar.mo16965d(o0Var);
        return mo17089a(lrVar);
    }

    /* renamed from: z */
    public final C9975i mo16651z(C10412f fVar, C7869z zVar, C7806h hVar, C11846o0 o0Var) {
        C4141r.m28221k(fVar);
        C4141r.m28221k(hVar);
        C4141r.m28221k(zVar);
        C4141r.m28221k(o0Var);
        List j2 = zVar.mo26250j2();
        if (j2 != null && j2.contains(hVar.mo26062I1())) {
            return C9980l.m51030d(C3847vs.m27245a(new Status(17015)));
        }
        if (hVar instanceof C7814j) {
            C7814j jVar = (C7814j) hVar;
            if (!jVar.mo26121Q1()) {
                C3549mr mrVar = new C3549mr(jVar);
                mrVar.mo16966e(fVar);
                mrVar.mo16967f(zVar);
                mrVar.mo16964c(o0Var);
                mrVar.mo16965d(o0Var);
                return mo17089a(mrVar);
            }
            C3648pr prVar = new C3648pr(jVar);
            prVar.mo16966e(fVar);
            prVar.mo16967f(zVar);
            prVar.mo16964c(o0Var);
            prVar.mo16965d(o0Var);
            return mo17089a(prVar);
        } else if (hVar instanceof C7830n0) {
            C3453ju.m25951c();
            C3615or orVar = new C3615or((C7830n0) hVar);
            orVar.mo16966e(fVar);
            orVar.mo16967f(zVar);
            orVar.mo16964c(o0Var);
            orVar.mo16965d(o0Var);
            return mo17089a(orVar);
        } else {
            C4141r.m28221k(fVar);
            C4141r.m28221k(hVar);
            C4141r.m28221k(zVar);
            C4141r.m28221k(o0Var);
            C3582nr nrVar = new C3582nr(hVar);
            nrVar.mo16966e(fVar);
            nrVar.mo16967f(zVar);
            nrVar.mo16964c(o0Var);
            nrVar.mo16965d(o0Var);
            return mo17089a(nrVar);
        }
    }
}
