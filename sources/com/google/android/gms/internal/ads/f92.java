package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p073j4.C4794n1;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class f92 implements k52 {

    /* renamed from: a */
    private final Context f9200a;

    /* renamed from: b */
    private final ur1 f9201b;

    public f92(Context context, ur1 ur1) {
        this.f9200a = context;
        this.f9201b = ur1;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8260a(us2 us2, is2 is2, g52 g52) throws jt2, v82 {
        j72 j72 = new j72(is2, (kd0) g52.f9705b, true);
        qr1 b = this.f9201b.mo13091b(new k61(us2, is2, g52.f9704a), new rr1(j72));
        j72.mo11335b(b.mo10315b());
        ((z62) g52.f9706c).mo15552J6(b.mo11822n());
        return b.mo11819k();
    }

    /* renamed from: b */
    public final void mo8261b(us2 us2, is2 is2, g52 g52) throws jt2 {
        try {
            ((kd0) g52.f9705b).mo11083A(is2.f10969a0);
            if (us2.f18722a.f17091a.f8944o.f16514a == 3) {
                ((kd0) g52.f9705b).mo11091f6(is2.f10963V, is2.f11006w.toString(), us2.f18722a.f17091a.f8933d, C4956b.m31385o3(this.f9200a), new d92(this, g52, (c92) null), (wb0) g52.f9706c);
            } else {
                ((kd0) g52.f9705b).mo11084O3(is2.f10963V, is2.f11006w.toString(), us2.f18722a.f17091a.f8933d, C4956b.m31385o3(this.f9200a), new d92(this, g52, (c92) null), (wb0) g52.f9706c);
            }
        } catch (RemoteException e) {
            C4794n1.m30694l("Remote exception loading a rewarded RTB ad", e);
        }
    }
}
