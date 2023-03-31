package p060h4;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.qb0;
import p088l5.C4956b;

/* renamed from: h4.j */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class C4524j extends C4578s {

    /* renamed from: b */
    final /* synthetic */ Context f24867b;

    /* renamed from: c */
    final /* synthetic */ C4571q4 f24868c;

    /* renamed from: d */
    final /* synthetic */ String f24869d;

    /* renamed from: e */
    final /* synthetic */ qb0 f24870e;

    /* renamed from: f */
    final /* synthetic */ C4572r f24871f;

    C4524j(C4572r rVar, Context context, C4571q4 q4Var, String str, qb0 qb0) {
        this.f24871f = rVar;
        this.f24867b = context;
        this.f24868c = q4Var;
        this.f24869d = str;
        this.f24870e = qb0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo18015a() {
        C4572r.m29994p(this.f24867b, "interstitial");
        return new C4570q3();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo18016b(C4478b1 b1Var) throws RemoteException {
        return b1Var.mo7825D3(C4956b.m31385o3(this.f24867b), this.f24868c, this.f24869d, this.f24870e, 223104000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo18017c() throws RemoteException {
        return this.f24871f.f24987a.mo18067c(this.f24867b, this.f24868c, this.f24869d, this.f24870e, 2);
    }
}
