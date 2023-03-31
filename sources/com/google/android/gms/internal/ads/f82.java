package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p060h4.C4596v;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class f82 implements k52 {

    /* renamed from: a */
    private final Context f9188a;

    /* renamed from: b */
    private final jk1 f9189b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public fc0 f9190c;

    /* renamed from: d */
    private final vm0 f9191d;

    public f82(Context context, jk1 jk1, vm0 vm0) {
        this.f9188a = context;
        this.f9189b = jk1;
        this.f9191d = vm0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8260a(us2 us2, is2 is2, g52 g52) throws jt2, v82 {
        if (us2.f18722a.f17091a.f8936g.contains(Integer.toString(6))) {
            xl1 a0 = xl1.m23313a0(this.f9190c);
            if (us2.f18722a.f17091a.f8936g.contains(Integer.toString(a0.mo15132K()))) {
                zl1 d = this.f9189b.mo11419d(new k61(us2, is2, g52.f9704a), new km1(a0), new zn1((cc0) null, (bc0) null, this.f9190c, (byte[]) null));
                ((z62) g52.f9706c).mo15552J6(d.mo12209f());
                return d.mo8435h();
            }
            throw new v82(1, "No corresponding native ad listener");
        }
        throw new v82(2, "Unified must be used for RTB.");
    }

    /* renamed from: b */
    public final void mo8261b(us2 us2, is2 is2, g52 g52) throws jt2 {
        try {
            ((kd0) g52.f9705b).mo11083A(is2.f10969a0);
            if (this.f9191d.f19152c < ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14709v1)).intValue()) {
                ((kd0) g52.f9705b).mo11087Z1(is2.f10963V, is2.f11006w.toString(), us2.f18722a.f17091a.f8933d, C4956b.m31385o3(this.f9188a), new e82(this, g52, (c82) null), (wb0) g52.f9706c);
            } else {
                ((kd0) g52.f9705b).mo11094i3(is2.f10963V, is2.f11006w.toString(), us2.f18722a.f17091a.f8933d, C4956b.m31385o3(this.f9188a), new e82(this, g52, (c82) null), (wb0) g52.f9706c, us2.f18722a.f17091a.f8938i);
            }
        } catch (RemoteException e) {
            throw new jt2(e);
        }
    }
}
