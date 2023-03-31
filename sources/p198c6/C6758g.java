package p198c6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p033d5.C4114j;
import p123q5.C5403a;
import p123q5.C5405c;

/* renamed from: c6.g */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C6758g extends C5403a {
    C6758g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: T5 */
    public final void mo22673T5(C6761j jVar, C6757f fVar) throws RemoteException {
        Parcel p = mo19530p();
        C5405c.m33156c(p, jVar);
        C5405c.m33157d(p, fVar);
        mo19527B0(12, p);
    }

    /* renamed from: i5 */
    public final void mo22674i5(C4114j jVar, int i, boolean z) throws RemoteException {
        Parcel p = mo19530p();
        C5405c.m33157d(p, jVar);
        p.writeInt(i);
        C5405c.m33155b(p, z);
        mo19527B0(9, p);
    }

    /* renamed from: o3 */
    public final void mo22675o3(int i) throws RemoteException {
        Parcel p = mo19530p();
        p.writeInt(i);
        mo19527B0(7, p);
    }
}
