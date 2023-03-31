package p033d5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p088l5.C4954a;
import p137s5.C5485a;
import p137s5.C5487c;
import p180z4.C6365c0;
import p180z4.C6369e0;
import p180z4.C6373g0;

/* renamed from: d5.y0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C4164y0 extends C5485a implements C4083a1 {
    C4164y0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    /* renamed from: T4 */
    public final boolean mo17313T4(C6373g0 g0Var, C4954a aVar) throws RemoteException {
        Parcel B0 = mo19772B0();
        C5487c.m33441d(B0, g0Var);
        C5487c.m33442e(B0, aVar);
        Parcel p = mo19774p(5, B0);
        boolean f = C5487c.m33443f(p);
        p.recycle();
        return f;
    }

    /* renamed from: V */
    public final boolean mo17314V() throws RemoteException {
        Parcel p = mo19774p(7, mo19772B0());
        boolean f = C5487c.m33443f(p);
        p.recycle();
        return f;
    }

    /* renamed from: c4 */
    public final C6369e0 mo17315c4(C6365c0 c0Var) throws RemoteException {
        Parcel B0 = mo19772B0();
        C5487c.m33441d(B0, c0Var);
        Parcel p = mo19774p(8, B0);
        C6369e0 e0Var = (C6369e0) C5487c.m33438a(p, C6369e0.CREATOR);
        p.recycle();
        return e0Var;
    }

    /* renamed from: s6 */
    public final C6369e0 mo17316s6(C6365c0 c0Var) throws RemoteException {
        Parcel B0 = mo19772B0();
        C5487c.m33441d(B0, c0Var);
        Parcel p = mo19774p(6, B0);
        C6369e0 e0Var = (C6369e0) C5487c.m33438a(p, C6369e0.CREATOR);
        p.recycle();
        return e0Var;
    }
}
