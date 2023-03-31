package p060h4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2822rt;
import com.google.android.gms.internal.ads.C2847sh;
import com.google.android.gms.internal.ads.C2958vh;
import p088l5.C4954a;

/* renamed from: h4.o0 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4555o0 extends C2847sh implements C4567q0 {
    C4555o0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* renamed from: M5 */
    public final void mo10847M5(C4571q4 q4Var) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, q4Var);
        mo14003P0(13, p);
    }

    /* renamed from: R0 */
    public final void mo10849R0(C4541l4 l4Var, C4507g0 g0Var) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, l4Var);
        C2958vh.m22238g(p, g0Var);
        mo14003P0(43, p);
    }

    /* renamed from: V1 */
    public final void mo10854V1(C4489d0 d0Var) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, d0Var);
        mo14003P0(7, p);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p060h4.C4509g2 mo10856X() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo14006p()
            r1 = 41
            android.os.Parcel r0 = r4.mo14002B0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IResponseInfo"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof p060h4.C4509g2
            if (r3 == 0) goto L_0x0020
            r1 = r2
            h4.g2 r1 = (p060h4.C4509g2) r1
            goto L_0x0026
        L_0x0020:
            h4.e2 r2 = new h4.e2
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p060h4.C4555o0.mo10856X():h4.g2");
    }

    /* renamed from: Y5 */
    public final void mo10858Y5(C4609x0 x0Var) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, x0Var);
        mo14003P0(8, p);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p060h4.C4527j2 mo10859Z() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo14006p()
            r1 = 26
            android.os.Parcel r0 = r4.mo14002B0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoController"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof p060h4.C4527j2
            if (r3 == 0) goto L_0x0020
            r1 = r2
            h4.j2 r1 = (p060h4.C4527j2) r1
            goto L_0x0026
        L_0x0020:
            h4.h2 r2 = new h4.h2
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p060h4.C4555o0.mo10859Z():h4.j2");
    }

    /* renamed from: Z2 */
    public final boolean mo10860Z2(C4541l4 l4Var) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, l4Var);
        Parcel B0 = mo14002B0(4, p);
        boolean h = C2958vh.m22239h(B0);
        B0.recycle();
        return h;
    }

    /* renamed from: a0 */
    public final C4954a mo10861a0() throws RemoteException {
        Parcel B0 = mo14002B0(1, mo14006p());
        C4954a B02 = C4954a.C4955a.m31383B0(B0.readStrongBinder());
        B0.recycle();
        return B02;
    }

    /* renamed from: c */
    public final C4571q4 mo10863c() throws RemoteException {
        Parcel B0 = mo14002B0(12, mo14006p());
        C4571q4 q4Var = (C4571q4) C2958vh.m22232a(B0, C4571q4.CREATOR);
        B0.recycle();
        return q4Var;
    }

    /* renamed from: e0 */
    public final String mo10868e0() throws RemoteException {
        Parcel B0 = mo14002B0(31, mo14006p());
        String readString = B0.readString();
        B0.recycle();
        return readString;
    }

    /* renamed from: j0 */
    public final void mo10872j0() throws RemoteException {
        mo14003P0(5, mo14006p());
    }

    /* renamed from: l0 */
    public final void mo10873l0() throws RemoteException {
        mo14003P0(6, mo14006p());
    }

    /* renamed from: n4 */
    public final void mo10874n4(C4471a0 a0Var) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, a0Var);
        mo14003P0(20, p);
    }

    /* renamed from: o5 */
    public final void mo10875o5(boolean z) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22235d(p, z);
        mo14003P0(34, p);
    }

    /* renamed from: o6 */
    public final void mo10876o6(C4954a aVar) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        mo14003P0(44, p);
    }

    /* renamed from: p4 */
    public final void mo10877p4(C4499e4 e4Var) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, e4Var);
        mo14003P0(29, p);
    }

    /* renamed from: q */
    public final void mo10878q() throws RemoteException {
        mo14003P0(2, mo14006p());
    }

    /* renamed from: x4 */
    public final void mo10881x4(C4491d2 d2Var) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, d2Var);
        mo14003P0(42, p);
    }

    /* renamed from: y3 */
    public final void mo10882y3(C2822rt rtVar) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, rtVar);
        mo14003P0(40, p);
    }

    /* renamed from: y5 */
    public final void mo10883y5(C4607w4 w4Var) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, w4Var);
        mo14003P0(39, p);
    }

    /* renamed from: y6 */
    public final void mo10884y6(boolean z) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22235d(p, z);
        mo14003P0(22, p);
    }

    /* renamed from: z4 */
    public final void mo10885z4(C4502f1 f1Var) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, f1Var);
        mo14003P0(45, p);
    }
}
