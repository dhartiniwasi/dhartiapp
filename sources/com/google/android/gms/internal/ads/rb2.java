package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p060h4.C4489d0;
import p060h4.C4519i0;
import p060h4.C4541l4;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class rb2 extends C4519i0 {

    /* renamed from: a */
    private final yc2 f16906a;

    public rb2(Context context, su0 su0, ct2 ct2, jm1 jm1, C4489d0 d0Var) {
        ad2 ad2 = new ad2(jm1, su0.mo9708A());
        ad2.mo8314e(d0Var);
        this.f16906a = new yc2(new ld2(su0, context, ad2, ct2), ct2.mo9343i());
    }

    /* renamed from: H3 */
    public final void mo13731H3(C4541l4 l4Var) throws RemoteException {
        this.f16906a.mo15426d(l4Var, 1);
    }

    /* renamed from: T */
    public final synchronized String mo13732T() {
        return this.f16906a.mo15425b();
    }

    /* renamed from: V */
    public final synchronized boolean mo13733V() throws RemoteException {
        return this.f16906a.mo15427e();
    }

    /* renamed from: a */
    public final synchronized String mo13734a() {
        return this.f16906a.mo15424a();
    }

    /* renamed from: u1 */
    public final synchronized void mo13735u1(C4541l4 l4Var, int i) throws RemoteException {
        this.f16906a.mo15426d(l4Var, i);
    }
}
