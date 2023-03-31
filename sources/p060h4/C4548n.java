package p060h4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.ag0;
import com.google.android.gms.internal.ads.sm0;
import com.google.android.gms.internal.ads.tm0;
import p088l5.C4956b;

/* renamed from: h4.n */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class C4548n extends C4578s {

    /* renamed from: b */
    final /* synthetic */ Context f24919b;

    /* renamed from: c */
    final /* synthetic */ C4572r f24920c;

    C4548n(C4572r rVar, Context context) {
        this.f24920c = rVar;
        this.f24919b = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo18015a() {
        C4572r.m29994p(this.f24919b, "mobile_ads_settings");
        return new C4582s3();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo18016b(C4478b1 b1Var) throws RemoteException {
        return b1Var.mo7828L0(C4956b.m31385o3(this.f24919b), 223104000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo18017c() throws RemoteException {
        C2679nz.m17343c(this.f24919b);
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14686s8)).booleanValue()) {
            return this.f24920c.f24989c.mo18066c(this.f24919b);
        }
        try {
            IBinder i5 = ((C4544m1) tm0.m21079b(this.f24919b, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", C4542m.f24907a)).mo18072i5(C4956b.m31385o3(this.f24919b), 223104000);
            if (i5 == null) {
                return null;
            }
            IInterface queryLocalInterface = i5.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof C4538l1 ? (C4538l1) queryLocalInterface : new C4526j1(i5);
        } catch (RemoteException | sm0 | NullPointerException e) {
            this.f24920c.f24994h = ag0.m9704c(this.f24919b);
            this.f24920c.f24994h.mo8326b(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
