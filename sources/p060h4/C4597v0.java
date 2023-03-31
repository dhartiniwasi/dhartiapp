package p060h4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2847sh;

/* renamed from: h4.v0 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4597v0 extends C2847sh implements C4609x0 {
    C4597v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    /* renamed from: G0 */
    public final void mo11190G0(String str, String str2) throws RemoteException {
        Parcel p = mo14006p();
        p.writeString(str);
        p.writeString(str2);
        mo14003P0(1, p);
    }
}
