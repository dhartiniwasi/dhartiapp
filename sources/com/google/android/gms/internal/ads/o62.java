package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.concurrent.ExecutionException;
import p060h4.C4596v;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class o62 implements k52 {

    /* renamed from: a */
    private final Context f14912a;

    /* renamed from: b */
    private final o41 f14913b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public View f14914c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public zb0 f14915d;

    public o62(Context context, o41 o41) {
        this.f14912a = context;
        this.f14913b = o41;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8260a(us2 us2, is2 is2, g52 g52) throws jt2, v82 {
        View view;
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14339J6)).booleanValue() || !is2.f10985i0) {
            view = this.f14914c;
        } else {
            try {
                view = (View) C4956b.m31384P0(this.f14915d.mo13526a());
                boolean T = this.f14915d.mo13525T();
                if (view == null) {
                    throw new jt2(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                } else if (T) {
                    try {
                        view = (View) cf3.m10916n(cf3.m10911i((Object) null), new k62(this, view, is2), dn0.f8329e).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new jt2(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new jt2(e2);
            }
        }
        s31 a = this.f14913b.mo8570a(new k61(us2, is2, g52.f9704a), new y31(view, (vs0) null, new l62(g52), (js2) is2.f11005v.get(0)));
        a.mo13940i().mo12019p0(view);
        ((z62) g52.f9706c).mo15552J6(a.mo12209f());
        return a.mo13939h();
    }

    /* renamed from: b */
    public final void mo8261b(us2 us2, is2 is2, g52 g52) throws jt2 {
        try {
            ((kd0) g52.f9705b).mo11083A(is2.f10969a0);
            if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14339J6)).booleanValue() || !is2.f10985i0) {
                ((kd0) g52.f9705b).mo11095k1(is2.f10963V, is2.f11006w.toString(), us2.f18722a.f17091a.f8933d, C4956b.m31385o3(this.f14912a), new n62(this, g52, (m62) null), (wb0) g52.f9706c, us2.f18722a.f17091a.f8934e);
            } else {
                ((kd0) g52.f9705b).mo11093h1(is2.f10963V, is2.f11006w.toString(), us2.f18722a.f17091a.f8933d, C4956b.m31385o3(this.f14912a), new n62(this, g52, (m62) null), (wb0) g52.f9706c, us2.f18722a.f17091a.f8934e);
            }
        } catch (RemoteException e) {
            throw new jt2(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ lf3 mo12839c(View view, is2 is2, Object obj) throws Exception {
        return cf3.m10911i(g51.m13041a(this.f14912a, view, is2));
    }
}
