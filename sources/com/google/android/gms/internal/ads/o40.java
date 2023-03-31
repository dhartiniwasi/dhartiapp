package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p023c4.C1861c;
import p023c4.C1862d;
import p023c4.C1869h;
import p088l5.C4954a;
import p088l5.C4956b;
import p179z3.C6355x;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class o40 extends C1869h {

    /* renamed from: a */
    private final n40 f14884a;

    /* renamed from: b */
    private final List f14885b = new ArrayList();

    /* renamed from: c */
    private final s20 f14886c;

    /* renamed from: d */
    private final C6355x f14887d = new C6355x();

    /* renamed from: e */
    private final C1861c f14888e;

    /* renamed from: f */
    private final List f14889f = new ArrayList();

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050 A[Catch:{ RemoteException -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00af A[Catch:{ RemoteException -> 0x00bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0027 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o40(com.google.android.gms.internal.ads.n40 r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f14885b = r1
            z3.x r1 = new z3.x
            r1.<init>()
            r5.f14887d = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f14889f = r1
            r5.f14884a = r6
            r1 = 0
            java.util.List r6 = r6.mo10920j()     // Catch:{ RemoteException -> 0x005b }
            if (r6 == 0) goto L_0x005f
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x005b }
        L_0x0027:
            boolean r2 = r6.hasNext()     // Catch:{ RemoteException -> 0x005b }
            if (r2 == 0) goto L_0x005f
            java.lang.Object r2 = r6.next()     // Catch:{ RemoteException -> 0x005b }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x005b }
            if (r3 == 0) goto L_0x004d
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x005b }
            if (r2 != 0) goto L_0x003a
            goto L_0x004d
        L_0x003a:
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch:{ RemoteException -> 0x005b }
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.r20     // Catch:{ RemoteException -> 0x005b }
            if (r4 == 0) goto L_0x0047
            com.google.android.gms.internal.ads.r20 r3 = (com.google.android.gms.internal.ads.r20) r3     // Catch:{ RemoteException -> 0x005b }
            goto L_0x004e
        L_0x0047:
            com.google.android.gms.internal.ads.p20 r3 = new com.google.android.gms.internal.ads.p20     // Catch:{ RemoteException -> 0x005b }
            r3.<init>(r2)     // Catch:{ RemoteException -> 0x005b }
            goto L_0x004e
        L_0x004d:
            r3 = r1
        L_0x004e:
            if (r3 == 0) goto L_0x0027
            java.util.List r2 = r5.f14885b     // Catch:{ RemoteException -> 0x005b }
            com.google.android.gms.internal.ads.s20 r4 = new com.google.android.gms.internal.ads.s20     // Catch:{ RemoteException -> 0x005b }
            r4.<init>(r3)     // Catch:{ RemoteException -> 0x005b }
            r2.add(r4)     // Catch:{ RemoteException -> 0x005b }
            goto L_0x0027
        L_0x005b:
            r6 = move-exception
            com.google.android.gms.internal.ads.pm0.m18665e(r0, r6)
        L_0x005f:
            com.google.android.gms.internal.ads.n40 r6 = r5.f14884a     // Catch:{ RemoteException -> 0x008e }
            java.util.List r6 = r6.mo10916g0()     // Catch:{ RemoteException -> 0x008e }
            if (r6 == 0) goto L_0x0092
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x008e }
        L_0x006b:
            boolean r2 = r6.hasNext()     // Catch:{ RemoteException -> 0x008e }
            if (r2 == 0) goto L_0x0092
            java.lang.Object r2 = r6.next()     // Catch:{ RemoteException -> 0x008e }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x008e }
            if (r3 == 0) goto L_0x0080
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x008e }
            h4.s1 r2 = p060h4.C4574r1.m30004I6(r2)     // Catch:{ RemoteException -> 0x008e }
            goto L_0x0081
        L_0x0080:
            r2 = r1
        L_0x0081:
            if (r2 == 0) goto L_0x006b
            java.util.List r3 = r5.f14889f     // Catch:{ RemoteException -> 0x008e }
            h4.t1 r4 = new h4.t1     // Catch:{ RemoteException -> 0x008e }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x008e }
            r3.add(r4)     // Catch:{ RemoteException -> 0x008e }
            goto L_0x006b
        L_0x008e:
            r6 = move-exception
            com.google.android.gms.internal.ads.pm0.m18665e(r0, r6)
        L_0x0092:
            com.google.android.gms.internal.ads.n40 r6 = r5.f14884a     // Catch:{ RemoteException -> 0x00a0 }
            com.google.android.gms.internal.ads.r20 r6 = r6.mo10904X()     // Catch:{ RemoteException -> 0x00a0 }
            if (r6 == 0) goto L_0x00a4
            com.google.android.gms.internal.ads.s20 r2 = new com.google.android.gms.internal.ads.s20     // Catch:{ RemoteException -> 0x00a0 }
            r2.<init>(r6)     // Catch:{ RemoteException -> 0x00a0 }
            goto L_0x00a5
        L_0x00a0:
            r6 = move-exception
            com.google.android.gms.internal.ads.pm0.m18665e(r0, r6)
        L_0x00a4:
            r2 = r1
        L_0x00a5:
            r5.f14886c = r2
            com.google.android.gms.internal.ads.n40 r6 = r5.f14884a     // Catch:{ RemoteException -> 0x00bc }
            com.google.android.gms.internal.ads.j20 r6 = r6.mo10901V()     // Catch:{ RemoteException -> 0x00bc }
            if (r6 == 0) goto L_0x00c0
            com.google.android.gms.internal.ads.k20 r6 = new com.google.android.gms.internal.ads.k20     // Catch:{ RemoteException -> 0x00bc }
            com.google.android.gms.internal.ads.n40 r2 = r5.f14884a     // Catch:{ RemoteException -> 0x00bc }
            com.google.android.gms.internal.ads.j20 r2 = r2.mo10901V()     // Catch:{ RemoteException -> 0x00bc }
            r6.<init>(r2)     // Catch:{ RemoteException -> 0x00bc }
            r1 = r6
            goto L_0x00c0
        L_0x00bc:
            r6 = move-exception
            com.google.android.gms.internal.ads.pm0.m18665e(r0, r6)
        L_0x00c0:
            r5.f14888e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o40.<init>(com.google.android.gms.internal.ads.n40):void");
    }

    /* renamed from: a */
    public final String mo7112a() {
        try {
            return this.f14884a.mo10908a0();
        } catch (RemoteException e) {
            pm0.m18665e("", e);
            return null;
        }
    }

    /* renamed from: b */
    public final String mo7113b() {
        try {
            return this.f14884a.mo10905Y();
        } catch (RemoteException e) {
            pm0.m18665e("", e);
            return null;
        }
    }

    /* renamed from: c */
    public final String mo7114c() {
        try {
            return this.f14884a.mo10909b0();
        } catch (RemoteException e) {
            pm0.m18665e("", e);
            return null;
        }
    }

    /* renamed from: d */
    public final String mo7115d() {
        try {
            return this.f14884a.mo10917h();
        } catch (RemoteException e) {
            pm0.m18665e("", e);
            return null;
        }
    }

    /* renamed from: e */
    public final C1862d mo7116e() {
        return this.f14886c;
    }

    /* renamed from: f */
    public final List<C1862d> mo7117f() {
        return this.f14885b;
    }

    /* renamed from: g */
    public final String mo7118g() {
        try {
            return this.f14884a.mo10912d0();
        } catch (RemoteException e) {
            pm0.m18665e("", e);
            return null;
        }
    }

    /* renamed from: h */
    public final Double mo7119h() {
        try {
            double a = this.f14884a.mo10907a();
            if (a == -1.0d) {
                return null;
            }
            return Double.valueOf(a);
        } catch (RemoteException e) {
            pm0.m18665e("", e);
            return null;
        }
    }

    /* renamed from: i */
    public final String mo7120i() {
        try {
            return this.f14884a.mo10915g();
        } catch (RemoteException e) {
            pm0.m18665e("", e);
            return null;
        }
    }

    /* renamed from: j */
    public final C6355x mo7121j() {
        try {
            if (this.f14884a.mo10899U() != null) {
                this.f14887d.mo21737c(this.f14884a.mo10899U());
            }
        } catch (RemoteException e) {
            pm0.m18665e("Exception occurred while getting video controller", e);
        }
        return this.f14887d;
    }

    /* renamed from: k */
    public final Object mo7122k() {
        try {
            C4954a Z = this.f14884a.mo10906Z();
            if (Z != null) {
                return C4956b.m31384P0(Z);
            }
            return null;
        } catch (RemoteException e) {
            pm0.m18665e("", e);
            return null;
        }
    }
}
