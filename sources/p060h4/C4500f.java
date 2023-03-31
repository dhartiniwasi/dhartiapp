package p060h4;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.qb0;
import com.google.android.gms.internal.ads.sm0;
import com.google.android.gms.internal.ads.tm0;
import com.google.android.gms.internal.ads.we0;
import p088l5.C4956b;

/* renamed from: h4.f */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class C4500f extends C4578s {

    /* renamed from: b */
    final /* synthetic */ Context f24840b;

    /* renamed from: c */
    final /* synthetic */ qb0 f24841c;

    C4500f(C4572r rVar, Context context, qb0 qb0) {
        this.f24840b = context;
        this.f24841c = qb0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo18015a() {
        return null;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo18016b(C4478b1 b1Var) throws RemoteException {
        return b1Var.mo7829M3(C4956b.m31385o3(this.f24840b), this.f24841c, 223104000);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo18017c() throws RemoteException {
        try {
            return ((we0) tm0.m21079b(this.f24840b, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", C4494e.f24836a)).mo14496H0(C4956b.m31385o3(this.f24840b), this.f24841c, 223104000);
        } catch (RemoteException | sm0 | NullPointerException unused) {
            return null;
        }
    }
}
