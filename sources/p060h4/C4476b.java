package p060h4;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.af0;
import com.google.android.gms.internal.ads.ag0;
import com.google.android.gms.internal.ads.ef0;
import com.google.android.gms.internal.ads.sm0;
import com.google.android.gms.internal.ads.tm0;
import p088l5.C4956b;

/* renamed from: h4.b */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class C4476b extends C4578s {

    /* renamed from: b */
    final /* synthetic */ Activity f24819b;

    /* renamed from: c */
    final /* synthetic */ C4572r f24820c;

    C4476b(C4572r rVar, Activity activity) {
        this.f24820c = rVar;
        this.f24819b = activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo18015a() {
        C4572r.m29994p(this.f24819b, "ad_overlay");
        return null;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo18016b(C4478b1 b1Var) throws RemoteException {
        return b1Var.mo7836s0(C4956b.m31385o3(this.f24819b));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo18017c() throws RemoteException {
        C2679nz.m17343c(this.f24819b);
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14686s8)).booleanValue()) {
            return this.f24820c.f24992f.mo15089c(this.f24819b);
        }
        try {
            return af0.m9700I6(((ef0) tm0.m21079b(this.f24819b, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", C4625z4.f25067a)).zze(C4956b.m31385o3(this.f24819b)));
        } catch (RemoteException | sm0 | NullPointerException e) {
            this.f24820c.f24994h = ag0.m9704c(this.f24819b.getApplicationContext());
            this.f24820c.f24994h.mo8326b(e, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
