package p060h4;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.C2921uh;

/* renamed from: h4.o1 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class C4556o1 extends C2921uh implements C4562p1 {
    /* renamed from: I6 */
    public static C4562p1 m29823I6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        return queryLocalInterface instanceof C4562p1 ? (C4562p1) queryLocalInterface : new C4550n1(iBinder);
    }
}
