package p060h4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.ag0;
import com.google.android.gms.internal.ads.qb0;
import com.google.android.gms.internal.ads.sm0;
import com.google.android.gms.internal.ads.tm0;
import p088l5.C4956b;

/* renamed from: h4.l */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class C4536l extends C4578s {

    /* renamed from: b */
    final /* synthetic */ Context f24878b;

    /* renamed from: c */
    final /* synthetic */ String f24879c;

    /* renamed from: d */
    final /* synthetic */ qb0 f24880d;

    /* renamed from: e */
    final /* synthetic */ C4572r f24881e;

    C4536l(C4572r rVar, Context context, String str, qb0 qb0) {
        this.f24881e = rVar;
        this.f24878b = context;
        this.f24879c = str;
        this.f24880d = qb0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo18015a() {
        C4572r.m29994p(this.f24878b, "native_ad");
        return new C4558o3();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo18016b(C4478b1 b1Var) throws RemoteException {
        return b1Var.mo7832X1(C4956b.m31385o3(this.f24878b), this.f24879c, this.f24880d, 223104000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo18017c() throws RemoteException {
        C2679nz.m17343c(this.f24878b);
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14686s8)).booleanValue()) {
            return this.f24881e.f24988b.mo18063c(this.f24878b, this.f24879c, this.f24880d);
        }
        try {
            IBinder i5 = ((C4549n0) tm0.m21079b(this.f24878b, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", C4530k.f24876a)).mo18081i5(C4956b.m31385o3(this.f24878b), this.f24879c, this.f24880d, 223104000);
            if (i5 == null) {
                return null;
            }
            IInterface queryLocalInterface = i5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof C4543m0 ? (C4543m0) queryLocalInterface : new C4531k0(i5);
        } catch (RemoteException | sm0 | NullPointerException e) {
            this.f24881e.f24994h = ag0.m9704c(this.f24878b);
            this.f24881e.f24994h.mo8326b(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
