package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import p060h4.C4521i2;
import p060h4.C4527j2;
import p060h4.C4541l4;
import p060h4.C4571q4;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class rb0 extends C2847sh implements tb0 {
    rb0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* renamed from: A2 */
    public final void mo13218A2(C4954a aVar) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        mo14003P0(30, p);
    }

    /* renamed from: A3 */
    public final void mo13219A3(C4954a aVar, C4571q4 q4Var, C4541l4 l4Var, String str, String str2, wb0 wb0) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        C2958vh.m22236e(p, q4Var);
        C2958vh.m22236e(p, l4Var);
        p.writeString(str);
        p.writeString(str2);
        C2958vh.m22238g(p, wb0);
        mo14003P0(6, p);
    }

    /* renamed from: I */
    public final boolean mo13220I() throws RemoteException {
        Parcel B0 = mo14002B0(13, mo14006p());
        boolean h = C2958vh.m22239h(B0);
        B0.recycle();
        return h;
    }

    /* renamed from: K */
    public final void mo13221K() throws RemoteException {
        mo14003P0(8, mo14006p());
    }

    /* renamed from: K4 */
    public final void mo13222K4(C4954a aVar) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        mo14003P0(37, p);
    }

    /* renamed from: N4 */
    public final void mo13223N4(C4954a aVar, C4541l4 l4Var, String str, wb0 wb0) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        C2958vh.m22236e(p, l4Var);
        p.writeString(str);
        C2958vh.m22238g(p, wb0);
        mo14003P0(32, p);
    }

    /* renamed from: P3 */
    public final void mo13224P3(C4954a aVar, C4541l4 l4Var, String str, ai0 ai0, String str2) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        C2958vh.m22236e(p, l4Var);
        p.writeString((String) null);
        C2958vh.m22238g(p, ai0);
        p.writeString(str2);
        mo14003P0(10, p);
    }

    /* renamed from: U */
    public final C4527j2 mo13227U() throws RemoteException {
        Parcel B0 = mo14002B0(26, mo14006p());
        C4527j2 I6 = C4521i2.m29687I6(B0.readStrongBinder());
        B0.recycle();
        return I6;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zb0 mo13229W() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo14006p()
            r1 = 36
            android.os.Parcel r0 = r4.mo14002B0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zb0
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zb0 r1 = (com.google.android.gms.internal.ads.zb0) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.xb0 r2 = new com.google.android.gms.internal.ads.xb0
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rb0.mo13229W():com.google.android.gms.internal.ads.zb0");
    }

    /* renamed from: W0 */
    public final void mo13230W0(C4954a aVar, C4571q4 q4Var, C4541l4 l4Var, String str, String str2, wb0 wb0) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        C2958vh.m22236e(p, q4Var);
        C2958vh.m22236e(p, l4Var);
        p.writeString(str);
        p.writeString(str2);
        C2958vh.m22238g(p, wb0);
        mo14003P0(35, p);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.fc0 mo13231X() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo14006p()
            r1 = 27
            android.os.Parcel r0 = r4.mo14002B0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.fc0
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.fc0 r1 = (com.google.android.gms.internal.ads.fc0) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.dc0 r2 = new com.google.android.gms.internal.ads.dc0
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rb0.mo13231X():com.google.android.gms.internal.ads.fc0");
    }

    /* renamed from: Y */
    public final void mo13232Y() throws RemoteException {
        mo14003P0(5, mo14006p());
    }

    /* renamed from: Z */
    public final wd0 mo13233Z() throws RemoteException {
        Parcel B0 = mo14002B0(33, mo14006p());
        wd0 wd0 = (wd0) C2958vh.m22232a(B0, wd0.CREATOR);
        B0.recycle();
        return wd0;
    }

    /* renamed from: a0 */
    public final C4954a mo13235a0() throws RemoteException {
        Parcel B0 = mo14002B0(2, mo14006p());
        C4954a B02 = C4954a.C4955a.m31383B0(B0.readStrongBinder());
        B0.recycle();
        return B02;
    }

    /* renamed from: c0 */
    public final wd0 mo13237c0() throws RemoteException {
        Parcel B0 = mo14002B0(34, mo14006p());
        wd0 wd0 = (wd0) C2958vh.m22232a(B0, wd0.CREATOR);
        B0.recycle();
        return wd0;
    }

    /* renamed from: c2 */
    public final void mo13238c2(C4954a aVar) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        mo14003P0(21, p);
    }

    /* renamed from: f4 */
    public final void mo13239f4(boolean z) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22235d(p, z);
        mo14003P0(25, p);
    }

    /* renamed from: k0 */
    public final void mo13240k0() throws RemoteException {
        mo14003P0(9, mo14006p());
    }

    /* renamed from: k2 */
    public final void mo13241k2(C4954a aVar, C4541l4 l4Var, String str, wb0 wb0) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        C2958vh.m22236e(p, l4Var);
        p.writeString(str);
        C2958vh.m22238g(p, wb0);
        mo14003P0(28, p);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.cc0 mo13242m() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo14006p()
            r1 = 16
            android.os.Parcel r0 = r4.mo14002B0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.cc0
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.cc0 r1 = (com.google.android.gms.internal.ads.cc0) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.cc0 r2 = new com.google.android.gms.internal.ads.cc0
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rb0.mo13242m():com.google.android.gms.internal.ads.cc0");
    }

    /* renamed from: n3 */
    public final void mo13244n3(C4541l4 l4Var, String str) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, l4Var);
        p.writeString(str);
        mo14003P0(11, p);
    }

    /* renamed from: o */
    public final void mo13245o() throws RemoteException {
        mo14003P0(4, mo14006p());
    }

    /* renamed from: r */
    public final boolean mo13247r() throws RemoteException {
        Parcel B0 = mo14002B0(22, mo14006p());
        boolean h = C2958vh.m22239h(B0);
        B0.recycle();
        return h;
    }

    /* renamed from: r5 */
    public final void mo13248r5(C4954a aVar, w70 w70, List list) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        C2958vh.m22238g(p, w70);
        p.writeTypedList(list);
        mo14003P0(31, p);
    }

    /* renamed from: s2 */
    public final void mo13249s2(C4954a aVar, ai0 ai0, List list) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        C2958vh.m22238g(p, ai0);
        p.writeStringList(list);
        mo14003P0(23, p);
    }

    /* renamed from: u */
    public final void mo13250u() throws RemoteException {
        mo14003P0(12, mo14006p());
    }

    /* renamed from: v1 */
    public final void mo13251v1(C4954a aVar, C4541l4 l4Var, String str, String str2, wb0 wb0) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        C2958vh.m22236e(p, l4Var);
        p.writeString(str);
        p.writeString(str2);
        C2958vh.m22238g(p, wb0);
        mo14003P0(7, p);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.bc0 mo13252y() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo14006p()
            r1 = 15
            android.os.Parcel r0 = r4.mo14002B0(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.bc0
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.bc0 r1 = (com.google.android.gms.internal.ads.bc0) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.bc0 r2 = new com.google.android.gms.internal.ads.bc0
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rb0.mo13252y():com.google.android.gms.internal.ads.bc0");
    }

    /* renamed from: z1 */
    public final void mo13253z1(C4954a aVar, C4541l4 l4Var, String str, String str2, wb0 wb0, f20 f20, List list) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        C2958vh.m22236e(p, l4Var);
        p.writeString(str);
        p.writeString(str2);
        C2958vh.m22238g(p, wb0);
        C2958vh.m22236e(p, f20);
        p.writeStringList(list);
        mo14003P0(14, p);
    }
}
