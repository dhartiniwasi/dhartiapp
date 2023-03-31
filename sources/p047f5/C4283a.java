package p047f5;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p033d5.C4153v;
import p123q5.C5403a;
import p123q5.C5405c;

/* renamed from: f5.a */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C4283a extends C5403a {
    C4283a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    /* renamed from: o3 */
    public final void mo17709o3(C4153v vVar) throws RemoteException {
        Parcel p = mo19530p();
        C5405c.m33156c(p, vVar);
        mo19528P0(1, p);
    }
}
