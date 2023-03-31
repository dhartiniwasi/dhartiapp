package p060h4;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.qb0;
import p088l5.C4956b;

/* renamed from: h4.i */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class C4518i extends C4578s {

    /* renamed from: b */
    final /* synthetic */ Context f24863b;

    /* renamed from: c */
    final /* synthetic */ C4571q4 f24864c;

    /* renamed from: d */
    final /* synthetic */ String f24865d;

    /* renamed from: e */
    final /* synthetic */ C4572r f24866e;

    C4518i(C4572r rVar, Context context, C4571q4 q4Var, String str) {
        this.f24866e = rVar;
        this.f24863b = context;
        this.f24864c = q4Var;
        this.f24865d = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo18015a() {
        C4572r.m29994p(this.f24863b, "search");
        return new C4570q3();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo18016b(C4478b1 b1Var) throws RemoteException {
        return b1Var.mo7831V5(C4956b.m31385o3(this.f24863b), this.f24864c, this.f24865d, 223104000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo18017c() throws RemoteException {
        return this.f24866e.f24987a.mo18067c(this.f24863b, this.f24864c, this.f24865d, (qb0) null, 3);
    }
}
