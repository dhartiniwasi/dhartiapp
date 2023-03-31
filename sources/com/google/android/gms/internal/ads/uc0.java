package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p023c4.C1862d;
import p060h4.C4527j2;
import p087l4.C4950v;
import p088l5.C4954a;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class uc0 extends ec0 {

    /* renamed from: a */
    private final C4950v f18492a;

    public uc0(C4950v vVar) {
        this.f18492a = vVar;
    }

    /* renamed from: T */
    public final float mo9511T() {
        return this.f18492a.mo18810k();
    }

    /* renamed from: U */
    public final float mo9512U() {
        return this.f18492a.mo18805f();
    }

    /* renamed from: U1 */
    public final void mo9513U1(C4954a aVar) {
        this.f18492a.mo18816q((View) C4956b.m31384P0(aVar));
    }

    /* renamed from: U3 */
    public final void mo9514U3(C4954a aVar) {
        this.f18492a.mo18794F((View) C4956b.m31384P0(aVar));
    }

    /* renamed from: V */
    public final Bundle mo9515V() {
        return this.f18492a.mo18806g();
    }

    /* renamed from: W */
    public final C4527j2 mo9516W() {
        if (this.f18492a.mo18796H() != null) {
            return this.f18492a.mo18796H().mo21736b();
        }
        return null;
    }

    /* renamed from: X */
    public final j20 mo9517X() {
        return null;
    }

    /* renamed from: Y */
    public final C4954a mo9518Y() {
        Object I = this.f18492a.mo18797I();
        if (I == null) {
            return null;
        }
        return C4956b.m31385o3(I);
    }

    /* renamed from: Z */
    public final r20 mo9519Z() {
        C1862d i = this.f18492a.mo18808i();
        if (i != null) {
            return new d20(i.mo7085a(), i.mo7087c(), i.mo7086b(), i.mo7089e(), i.mo7088d());
        }
        return null;
    }

    /* renamed from: a */
    public final double mo9520a() {
        if (this.f18492a.mo18814o() != null) {
            return this.f18492a.mo18814o().doubleValue();
        }
        return -1.0d;
    }

    /* renamed from: a0 */
    public final C4954a mo9521a0() {
        View G = this.f18492a.mo18795G();
        if (G == null) {
            return null;
        }
        return C4956b.m31385o3(G);
    }

    /* renamed from: b0 */
    public final String mo9522b0() {
        return this.f18492a.mo18801b();
    }

    /* renamed from: c */
    public final float mo9523c() {
        return this.f18492a.mo18804e();
    }

    /* renamed from: c0 */
    public final C4954a mo9524c0() {
        View a = this.f18492a.mo18800a();
        if (a == null) {
            return null;
        }
        return C4956b.m31385o3(a);
    }

    /* renamed from: d0 */
    public final String mo9525d0() {
        return this.f18492a.mo18807h();
    }

    /* renamed from: e0 */
    public final String mo9526e0() {
        return this.f18492a.mo18803d();
    }

    /* renamed from: g */
    public final String mo9527g() {
        return this.f18492a.mo18813n();
    }

    /* renamed from: g0 */
    public final List mo9528g0() {
        List<C1862d> j = this.f18492a.mo18809j();
        ArrayList arrayList = new ArrayList();
        if (j != null) {
            for (C1862d next : j) {
                arrayList.add(new d20(next.mo7085a(), next.mo7087c(), next.mo7086b(), next.mo7089e(), next.mo7088d()));
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public final String mo9529h() {
        return this.f18492a.mo18802c();
    }

    /* renamed from: h0 */
    public final boolean mo9530h0() {
        return this.f18492a.mo18811l();
    }

    /* renamed from: j */
    public final String mo9531j() {
        return this.f18492a.mo18815p();
    }

    /* renamed from: l0 */
    public final boolean mo9532l0() {
        return this.f18492a.mo18812m();
    }

    /* renamed from: n1 */
    public final void mo9533n1(C4954a aVar, C4954a aVar2, C4954a aVar3) {
        this.f18492a.mo7697E((View) C4956b.m31384P0(aVar), (HashMap) C4956b.m31384P0(aVar2), (HashMap) C4956b.m31384P0(aVar3));
    }

    /* renamed from: q */
    public final void mo9534q() {
        this.f18492a.mo18818s();
    }
}
