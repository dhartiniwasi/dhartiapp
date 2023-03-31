package p116p5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: p5.e */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public final class C5323e extends C5321c implements C5324f {
    C5323e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    /* renamed from: q5 */
    public final void mo19297q5(C5326h hVar) throws RemoteException {
        Parcel p = mo19296p();
        C5322d.m32652b(p, hVar);
        mo19294B0(1, p);
    }
}
