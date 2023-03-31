package p060h4;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.qb0;
import p088l5.C4956b;

/* renamed from: h4.h */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class C4512h extends C4578s {

    /* renamed from: b */
    final /* synthetic */ Context f24853b;

    /* renamed from: c */
    final /* synthetic */ C4571q4 f24854c;

    /* renamed from: d */
    final /* synthetic */ String f24855d;

    /* renamed from: e */
    final /* synthetic */ qb0 f24856e;

    /* renamed from: f */
    final /* synthetic */ C4572r f24857f;

    C4512h(C4572r rVar, Context context, C4571q4 q4Var, String str, qb0 qb0) {
        this.f24857f = rVar;
        this.f24853b = context;
        this.f24854c = q4Var;
        this.f24855d = str;
        this.f24856e = qb0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo18015a() {
        C4572r.m29994p(this.f24853b, "app_open");
        return new C4570q3();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo18016b(C4478b1 b1Var) throws RemoteException {
        return b1Var.mo7826F1(C4956b.m31385o3(this.f24853b), this.f24854c, this.f24855d, this.f24856e, 223104000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo18017c() throws RemoteException {
        return this.f24857f.f24987a.mo18067c(this.f24853b, this.f24854c, this.f24855d, this.f24856e, 4);
    }
}
