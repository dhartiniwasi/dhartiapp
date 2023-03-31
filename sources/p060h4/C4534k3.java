package p060h4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.pm0;
import p088l5.C4956b;
import p088l5.C4957c;

/* renamed from: h4.k3 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4534k3 extends C4957c {
    public C4534k3() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo13128a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof C4544m1 ? (C4544m1) queryLocalInterface : new C4544m1(iBinder);
    }

    /* renamed from: c */
    public final C4538l1 mo18066c(Context context) {
        try {
            IBinder i5 = ((C4544m1) mo18828b(context)).mo18072i5(C4956b.m31385o3(context), 223104000);
            if (i5 == null) {
                return null;
            }
            IInterface queryLocalInterface = i5.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof C4538l1 ? (C4538l1) queryLocalInterface : new C4526j1(i5);
        } catch (RemoteException | C4957c.C4958a e) {
            pm0.m18668h("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }
}
