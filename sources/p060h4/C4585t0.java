package p060h4;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.C2921uh;

/* renamed from: h4.t0 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class C4585t0 extends C2921uh implements C4591u0 {
    /* renamed from: I6 */
    public static C4591u0 m30040I6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return queryLocalInterface instanceof C4591u0 ? (C4591u0) queryLocalInterface : new C4579s0(iBinder);
    }
}
