package p102n5;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: n5.e */
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
public abstract class C5129e extends C5126b implements C5130f {
    /* renamed from: p */
    public static C5130f m32017p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        if (queryLocalInterface instanceof C5130f) {
            return (C5130f) queryLocalInterface;
        }
        return new C5128d(iBinder);
    }
}
