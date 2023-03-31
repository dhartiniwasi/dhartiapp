package p060h4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.pm0;
import com.google.android.gms.internal.ads.qb0;
import p088l5.C4956b;
import p088l5.C4957c;

/* renamed from: h4.i4 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4523i4 extends C4957c {
    public C4523i4() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo13128a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof C4549n0 ? (C4549n0) queryLocalInterface : new C4549n0(iBinder);
    }

    /* renamed from: c */
    public final C4543m0 mo18063c(Context context, String str, qb0 qb0) {
        try {
            IBinder i5 = ((C4549n0) mo18828b(context)).mo18081i5(C4956b.m31385o3(context), str, qb0, 223104000);
            if (i5 == null) {
                return null;
            }
            IInterface queryLocalInterface = i5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof C4543m0 ? (C4543m0) queryLocalInterface : new C4531k0(i5);
        } catch (RemoteException | C4957c.C4958a e) {
            pm0.m18668h("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }
}
