package p060h4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2847sh;
import com.google.android.gms.internal.ads.C2958vh;

/* renamed from: h4.h0 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4513h0 extends C2847sh implements C4525j0 {
    C4513h0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    /* renamed from: H3 */
    public final void mo13731H3(C4541l4 l4Var) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, l4Var);
        mo14003P0(1, p);
    }
}
