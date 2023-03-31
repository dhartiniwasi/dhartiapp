package p060h4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2847sh;
import com.google.android.gms.internal.ads.C2958vh;
import com.google.android.gms.internal.ads.e40;
import com.google.android.gms.internal.ads.f20;
import com.google.android.gms.internal.ads.u30;
import com.google.android.gms.internal.ads.x30;

/* renamed from: h4.k0 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4531k0 extends C2847sh implements C4543m0 {
    C4531k0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* renamed from: D6 */
    public final void mo13510D6(C4489d0 d0Var) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, d0Var);
        mo14003P0(2, p);
    }

    /* renamed from: H1 */
    public final void mo13511H1(e40 e40) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, e40);
        mo14003P0(10, p);
    }

    /* renamed from: R4 */
    public final void mo13513R4(String str, x30 x30, u30 u30) throws RemoteException {
        Parcel p = mo14006p();
        p.writeString(str);
        C2958vh.m22238g(p, x30);
        C2958vh.m22238g(p, u30);
        mo14003P0(5, p);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p060h4.C4525j0 mo13516a() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo14006p()
            r1 = 1
            android.os.Parcel r0 = r4.mo14002B0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdLoader"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof p060h4.C4525j0
            if (r3 == 0) goto L_0x001f
            r1 = r2
            h4.j0 r1 = (p060h4.C4525j0) r1
            goto L_0x0025
        L_0x001f:
            h4.h0 r2 = new h4.h0
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p060h4.C4531k0.mo13516a():h4.j0");
    }

    /* renamed from: q1 */
    public final void mo13520q1(f20 f20) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, f20);
        mo14003P0(6, p);
    }
}
