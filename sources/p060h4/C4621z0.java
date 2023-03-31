package p060h4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C2847sh;
import com.google.android.gms.internal.ads.C2958vh;
import com.google.android.gms.internal.ads.af0;
import com.google.android.gms.internal.ads.bf0;
import com.google.android.gms.internal.ads.el0;
import com.google.android.gms.internal.ads.fl0;
import com.google.android.gms.internal.ads.hi0;
import com.google.android.gms.internal.ads.ii0;
import com.google.android.gms.internal.ads.qb0;
import com.google.android.gms.internal.ads.se0;
import com.google.android.gms.internal.ads.te0;
import com.google.android.gms.internal.ads.u20;
import com.google.android.gms.internal.ads.v20;
import p088l5.C4954a;

/* renamed from: h4.z0 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4621z0 extends C2847sh implements C4478b1 {
    C4621z0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: D3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p060h4.C4567q0 mo7825D3(p088l5.C4954a r1, p060h4.C4571q4 r2, java.lang.String r3, com.google.android.gms.internal.ads.qb0 r4, int r5) throws android.os.RemoteException {
        /*
            r0 = this;
            android.os.Parcel r5 = r0.mo14006p()
            com.google.android.gms.internal.ads.C2958vh.m22238g(r5, r1)
            com.google.android.gms.internal.ads.C2958vh.m22236e(r5, r2)
            r5.writeString(r3)
            com.google.android.gms.internal.ads.C2958vh.m22238g(r5, r4)
            r1 = 223104000(0xd4c4c00, float:6.2953835E-31)
            r5.writeInt(r1)
            r1 = 2
            android.os.Parcel r1 = r0.mo14002B0(r1, r5)
            android.os.IBinder r2 = r1.readStrongBinder()
            if (r2 != 0) goto L_0x0023
            r2 = 0
            goto L_0x0037
        L_0x0023:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof p060h4.C4567q0
            if (r4 == 0) goto L_0x0031
            r2 = r3
            h4.q0 r2 = (p060h4.C4567q0) r2
            goto L_0x0037
        L_0x0031:
            h4.o0 r3 = new h4.o0
            r3.<init>(r2)
            r2 = r3
        L_0x0037:
            r1.recycle()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p060h4.C4621z0.mo7825D3(l5.a, h4.q4, java.lang.String, com.google.android.gms.internal.ads.qb0, int):h4.q0");
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: F1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p060h4.C4567q0 mo7826F1(p088l5.C4954a r1, p060h4.C4571q4 r2, java.lang.String r3, com.google.android.gms.internal.ads.qb0 r4, int r5) throws android.os.RemoteException {
        /*
            r0 = this;
            android.os.Parcel r5 = r0.mo14006p()
            com.google.android.gms.internal.ads.C2958vh.m22238g(r5, r1)
            com.google.android.gms.internal.ads.C2958vh.m22236e(r5, r2)
            r5.writeString(r3)
            com.google.android.gms.internal.ads.C2958vh.m22238g(r5, r4)
            r1 = 223104000(0xd4c4c00, float:6.2953835E-31)
            r5.writeInt(r1)
            r1 = 13
            android.os.Parcel r1 = r0.mo14002B0(r1, r5)
            android.os.IBinder r2 = r1.readStrongBinder()
            if (r2 != 0) goto L_0x0024
            r2 = 0
            goto L_0x0038
        L_0x0024:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof p060h4.C4567q0
            if (r4 == 0) goto L_0x0032
            r2 = r3
            h4.q0 r2 = (p060h4.C4567q0) r2
            goto L_0x0038
        L_0x0032:
            h4.o0 r3 = new h4.o0
            r3.<init>(r2)
            r2 = r3
        L_0x0038:
            r1.recycle()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p060h4.C4621z0.mo7826F1(l5.a, h4.q4, java.lang.String, com.google.android.gms.internal.ads.qb0, int):h4.q0");
    }

    /* renamed from: I4 */
    public final ii0 mo7827I4(C4954a aVar, String str, qb0 qb0, int i) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        p.writeString(str);
        C2958vh.m22238g(p, qb0);
        p.writeInt(223104000);
        Parcel B0 = mo14002B0(12, p);
        ii0 I6 = hi0.m13856I6(B0.readStrongBinder());
        B0.recycle();
        return I6;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: L0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p060h4.C4538l1 mo7828L0(p088l5.C4954a r3, int r4) throws android.os.RemoteException {
        /*
            r2 = this;
            android.os.Parcel r4 = r2.mo14006p()
            com.google.android.gms.internal.ads.C2958vh.m22238g(r4, r3)
            r3 = 223104000(0xd4c4c00, float:6.2953835E-31)
            r4.writeInt(r3)
            r3 = 9
            android.os.Parcel r3 = r2.mo14002B0(r3, r4)
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L_0x001b
            r4 = 0
            goto L_0x002f
        L_0x001b:
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof p060h4.C4538l1
            if (r1 == 0) goto L_0x0029
            r4 = r0
            h4.l1 r4 = (p060h4.C4538l1) r4
            goto L_0x002f
        L_0x0029:
            h4.j1 r0 = new h4.j1
            r0.<init>(r4)
            r4 = r0
        L_0x002f:
            r3.recycle()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p060h4.C4621z0.mo7828L0(l5.a, int):h4.l1");
    }

    /* renamed from: M3 */
    public final te0 mo7829M3(C4954a aVar, qb0 qb0, int i) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        C2958vh.m22238g(p, qb0);
        p.writeInt(223104000);
        Parcel B0 = mo14002B0(15, p);
        te0 I6 = se0.m20283I6(B0.readStrongBinder());
        B0.recycle();
        return I6;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: V5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p060h4.C4567q0 mo7831V5(p088l5.C4954a r1, p060h4.C4571q4 r2, java.lang.String r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            android.os.Parcel r4 = r0.mo14006p()
            com.google.android.gms.internal.ads.C2958vh.m22238g(r4, r1)
            com.google.android.gms.internal.ads.C2958vh.m22236e(r4, r2)
            r4.writeString(r3)
            r1 = 223104000(0xd4c4c00, float:6.2953835E-31)
            r4.writeInt(r1)
            r1 = 10
            android.os.Parcel r1 = r0.mo14002B0(r1, r4)
            android.os.IBinder r2 = r1.readStrongBinder()
            if (r2 != 0) goto L_0x0021
            r2 = 0
            goto L_0x0035
        L_0x0021:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof p060h4.C4567q0
            if (r4 == 0) goto L_0x002f
            r2 = r3
            h4.q0 r2 = (p060h4.C4567q0) r2
            goto L_0x0035
        L_0x002f:
            h4.o0 r3 = new h4.o0
            r3.<init>(r2)
            r2 = r3
        L_0x0035:
            r1.recycle()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p060h4.C4621z0.mo7831V5(l5.a, h4.q4, java.lang.String, int):h4.q0");
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: X1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p060h4.C4543m0 mo7832X1(p088l5.C4954a r1, java.lang.String r2, com.google.android.gms.internal.ads.qb0 r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            android.os.Parcel r4 = r0.mo14006p()
            com.google.android.gms.internal.ads.C2958vh.m22238g(r4, r1)
            r4.writeString(r2)
            com.google.android.gms.internal.ads.C2958vh.m22238g(r4, r3)
            r1 = 223104000(0xd4c4c00, float:6.2953835E-31)
            r4.writeInt(r1)
            r1 = 3
            android.os.Parcel r1 = r0.mo14002B0(r1, r4)
            android.os.IBinder r2 = r1.readStrongBinder()
            if (r2 != 0) goto L_0x0020
            r2 = 0
            goto L_0x0034
        L_0x0020:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdLoaderBuilder"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof p060h4.C4543m0
            if (r4 == 0) goto L_0x002e
            r2 = r3
            h4.m0 r2 = (p060h4.C4543m0) r2
            goto L_0x0034
        L_0x002e:
            h4.k0 r3 = new h4.k0
            r3.<init>(r2)
            r2 = r3
        L_0x0034:
            r1.recycle()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p060h4.C4621z0.mo7832X1(l5.a, java.lang.String, com.google.android.gms.internal.ads.qb0, int):h4.m0");
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p060h4.C4567q0 mo7833a3(p088l5.C4954a r1, p060h4.C4571q4 r2, java.lang.String r3, com.google.android.gms.internal.ads.qb0 r4, int r5) throws android.os.RemoteException {
        /*
            r0 = this;
            android.os.Parcel r5 = r0.mo14006p()
            com.google.android.gms.internal.ads.C2958vh.m22238g(r5, r1)
            com.google.android.gms.internal.ads.C2958vh.m22236e(r5, r2)
            r5.writeString(r3)
            com.google.android.gms.internal.ads.C2958vh.m22238g(r5, r4)
            r1 = 223104000(0xd4c4c00, float:6.2953835E-31)
            r5.writeInt(r1)
            r1 = 1
            android.os.Parcel r1 = r0.mo14002B0(r1, r5)
            android.os.IBinder r2 = r1.readStrongBinder()
            if (r2 != 0) goto L_0x0023
            r2 = 0
            goto L_0x0037
        L_0x0023:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof p060h4.C4567q0
            if (r4 == 0) goto L_0x0031
            r2 = r3
            h4.q0 r2 = (p060h4.C4567q0) r2
            goto L_0x0037
        L_0x0031:
            h4.o0 r3 = new h4.o0
            r3.<init>(r2)
            r2 = r3
        L_0x0037:
            r1.recycle()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p060h4.C4621z0.mo7833a3(l5.a, h4.q4, java.lang.String, com.google.android.gms.internal.ads.qb0, int):h4.q0");
    }

    /* renamed from: j1 */
    public final v20 mo7834j1(C4954a aVar, C4954a aVar2) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        C2958vh.m22238g(p, aVar2);
        Parcel B0 = mo14002B0(5, p);
        v20 I6 = u20.m21375I6(B0.readStrongBinder());
        B0.recycle();
        return I6;
    }

    /* renamed from: s0 */
    public final bf0 mo7836s0(C4954a aVar) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        Parcel B0 = mo14002B0(8, p);
        bf0 I6 = af0.m9700I6(B0.readStrongBinder());
        B0.recycle();
        return I6;
    }

    /* renamed from: y1 */
    public final fl0 mo7838y1(C4954a aVar, qb0 qb0, int i) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22238g(p, aVar);
        C2958vh.m22238g(p, qb0);
        p.writeInt(223104000);
        Parcel B0 = mo14002B0(14, p);
        fl0 I6 = el0.m12163I6(B0.readStrongBinder());
        B0.recycle();
        return I6;
    }
}
