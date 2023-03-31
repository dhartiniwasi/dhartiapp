package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class p72 implements k52 {

    /* renamed from: a */
    private final Context f15718a;

    /* renamed from: b */
    private final mj1 f15719b;

    public p72(Context context, mj1 mj1) {
        this.f15718a = context;
        this.f15719b = mj1;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8260a(us2 us2, is2 is2, g52 g52) throws jt2, v82 {
        j72 j72 = new j72(is2, (kd0) g52.f9705b, false);
        li1 c = this.f15719b.mo12362c(new k61(us2, is2, g52.f9704a), new oi1(j72, (vs0) null));
        j72.mo11335b(c.mo10315b());
        ((z62) g52.f9706c).mo15552J6(c.mo12209f());
        return c.mo12023i();
    }

    /* renamed from: b */
    public final void mo8261b(us2 us2, is2 is2, g52 g52) throws jt2 {
        try {
            ((kd0) g52.f9705b).mo11083A(is2.f10969a0);
            ((kd0) g52.f9705b).mo11090f1(is2.f10963V, is2.f11006w.toString(), us2.f18722a.f17091a.f8933d, C4956b.m31385o3(this.f15718a), new o72(this, g52, (n72) null), (wb0) g52.f9706c);
        } catch (RemoteException e) {
            throw new jt2(e);
        }
    }
}
