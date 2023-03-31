package p060h4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.ag0;
import com.google.android.gms.internal.ads.cg0;
import com.google.android.gms.internal.ads.pm0;
import com.google.android.gms.internal.ads.qb0;
import com.google.android.gms.internal.ads.sm0;
import com.google.android.gms.internal.ads.tm0;
import p088l5.C4956b;
import p088l5.C4957c;

/* renamed from: h4.k4 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4535k4 extends C4957c {

    /* renamed from: c */
    private cg0 f24877c;

    public C4535k4() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo13128a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof C4573r0 ? (C4573r0) queryLocalInterface : new C4573r0(iBinder);
    }

    /* renamed from: c */
    public final C4567q0 mo18067c(Context context, C4571q4 q4Var, String str, qb0 qb0, int i) {
        C2679nz.m17343c(context);
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14686s8)).booleanValue()) {
            try {
                IBinder i5 = ((C4573r0) tm0.m21079b(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", C4529j4.f24875a)).mo18134i5(C4956b.m31385o3(context), q4Var, str, qb0, 223104000, i);
                if (i5 == null) {
                    return null;
                }
                IInterface queryLocalInterface = i5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface instanceof C4567q0 ? (C4567q0) queryLocalInterface : new C4555o0(i5);
            } catch (RemoteException | sm0 | NullPointerException e) {
                cg0 c = ag0.m9704c(context);
                this.f24877c = c;
                c.mo8326b(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
                pm0.m18669i("#007 Could not call remote method.", e);
                return null;
            }
        } else {
            try {
                IBinder i52 = ((C4573r0) mo18828b(context)).mo18134i5(C4956b.m31385o3(context), q4Var, str, qb0, 223104000, i);
                if (i52 == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = i52.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface2 instanceof C4567q0 ? (C4567q0) queryLocalInterface2 : new C4555o0(i52);
            } catch (RemoteException | C4957c.C4958a e2) {
                pm0.m18663c("Could not create remote AdManager.", e2);
                return null;
            }
        }
    }
}
