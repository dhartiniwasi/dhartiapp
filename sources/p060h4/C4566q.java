package p060h4;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.qb0;
import com.google.android.gms.internal.ads.ui0;
import p088l5.C4956b;

/* renamed from: h4.q */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class C4566q extends C4578s {

    /* renamed from: b */
    final /* synthetic */ Context f24949b;

    /* renamed from: c */
    final /* synthetic */ String f24950c;

    /* renamed from: d */
    final /* synthetic */ qb0 f24951d;

    /* renamed from: e */
    final /* synthetic */ C4572r f24952e;

    C4566q(C4572r rVar, Context context, String str, qb0 qb0) {
        this.f24952e = rVar;
        this.f24949b = context;
        this.f24950c = str;
        this.f24951d = qb0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo18015a() {
        C4572r.m29994p(this.f24949b, "rewarded");
        return new C4600v3();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo18016b(C4478b1 b1Var) throws RemoteException {
        return b1Var.mo7827I4(C4956b.m31385o3(this.f24949b), this.f24950c, this.f24951d, 223104000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo18017c() throws RemoteException {
        return ui0.m21652a(this.f24949b, this.f24950c, this.f24951d);
    }
}
