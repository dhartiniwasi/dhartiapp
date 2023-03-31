package p109o5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p150u4.C5748d;

/* renamed from: o5.g */
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class C5231g extends C5225a {
    C5231g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    /* renamed from: P0 */
    public final void mo19223P0(C5748d dVar, C5230f fVar) throws RemoteException {
        Parcel p = mo19218p();
        C5227c.m32407b(p, dVar);
        C5227c.m32408c(p, fVar);
        mo19216B0(1, p);
    }
}
