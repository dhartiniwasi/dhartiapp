package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
import p060h4.C4491d2;
import p060h4.C4509g2;
import p060h4.C4527j2;
import p060h4.C4562p1;
import p060h4.C4580s1;
import p060h4.C4596v;
import p088l5.C4954a;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class hq1 extends m40 {

    /* renamed from: a */
    private final String f10452a;

    /* renamed from: b */
    private final sl1 f10453b;

    /* renamed from: c */
    private final xl1 f10454c;

    public hq1(String str, sl1 sl1, xl1 xl1) {
        this.f10452a = str;
        this.f10453b = sl1;
        this.f10454c = xl1;
    }

    /* renamed from: A5 */
    public final void mo10895A5(j40 j40) throws RemoteException {
        this.f10453b.mo14070q(j40);
    }

    /* renamed from: C */
    public final void mo10896C() {
        this.f10453b.mo14067n();
    }

    /* renamed from: Q2 */
    public final void mo10897Q2(C4491d2 d2Var) throws RemoteException {
        this.f10453b.mo14069p(d2Var);
    }

    /* renamed from: T */
    public final Bundle mo10898T() throws RemoteException {
        return this.f10454c.mo15133L();
    }

    /* renamed from: U */
    public final C4527j2 mo10899U() throws RemoteException {
        return this.f10454c.mo15139R();
    }

    /* renamed from: U4 */
    public final boolean mo10900U4(Bundle bundle) throws RemoteException {
        return this.f10453b.mo14076x(bundle);
    }

    /* renamed from: V */
    public final j20 mo10901V() throws RemoteException {
        return this.f10454c.mo15141T();
    }

    /* renamed from: W */
    public final o20 mo10902W() throws RemoteException {
        return this.f10453b.mo14045C().mo14533a();
    }

    /* renamed from: W3 */
    public final void mo10903W3(C4580s1 s1Var) throws RemoteException {
        this.f10453b.mo14057R(s1Var);
    }

    /* renamed from: X */
    public final r20 mo10904X() throws RemoteException {
        return this.f10454c.mo15143V();
    }

    /* renamed from: Y */
    public final String mo10905Y() throws RemoteException {
        return this.f10454c.mo15156e0();
    }

    /* renamed from: Z */
    public final C4954a mo10906Z() throws RemoteException {
        return this.f10454c.mo15150b0();
    }

    /* renamed from: a */
    public final double mo10907a() throws RemoteException {
        return this.f10454c.mo15129A();
    }

    /* renamed from: a0 */
    public final String mo10908a0() throws RemoteException {
        return this.f10454c.mo15154d0();
    }

    /* renamed from: b0 */
    public final String mo10909b0() throws RemoteException {
        return this.f10454c.mo15158f0();
    }

    /* renamed from: c */
    public final C4509g2 mo10910c() throws RemoteException {
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14408Q5)).booleanValue()) {
            return null;
        }
        return this.f10453b.mo14679c();
    }

    /* renamed from: c0 */
    public final C4954a mo10911c0() throws RemoteException {
        return C4956b.m31385o3(this.f10453b);
    }

    /* renamed from: d0 */
    public final String mo10912d0() throws RemoteException {
        return this.f10454c.mo15149b();
    }

    /* renamed from: d3 */
    public final void mo10913d3(Bundle bundle) throws RemoteException {
        this.f10453b.mo14065l(bundle);
    }

    /* renamed from: e0 */
    public final String mo10914e0() throws RemoteException {
        return this.f10452a;
    }

    /* renamed from: g */
    public final String mo10915g() throws RemoteException {
        return this.f10454c.mo15151c();
    }

    /* renamed from: g0 */
    public final List mo10916g0() throws RemoteException {
        if (mo10925w()) {
            return this.f10454c.mo15157f();
        }
        return Collections.emptyList();
    }

    /* renamed from: h */
    public final String mo10917h() throws RemoteException {
        return this.f10454c.mo15162h0();
    }

    /* renamed from: h0 */
    public final void mo10918h0() {
        this.f10453b.mo14061h();
    }

    /* renamed from: h2 */
    public final void mo10919h2(C4562p1 p1Var) throws RemoteException {
        this.f10453b.mo14068o(p1Var);
    }

    /* renamed from: j */
    public final List mo10920j() throws RemoteException {
        return this.f10454c.mo15155e();
    }

    /* renamed from: o */
    public final boolean mo10921o() {
        return this.f10453b.mo14074u();
    }

    /* renamed from: q */
    public final void mo10922q() throws RemoteException {
        this.f10453b.mo11305a();
    }

    /* renamed from: t */
    public final void mo10923t() throws RemoteException {
        this.f10453b.mo14050K();
    }

    /* renamed from: t6 */
    public final void mo10924t6(Bundle bundle) throws RemoteException {
        this.f10453b.mo14060U(bundle);
    }

    /* renamed from: w */
    public final boolean mo10925w() throws RemoteException {
        return !this.f10454c.mo15157f().isEmpty() && this.f10454c.mo15140S() != null;
    }
}
