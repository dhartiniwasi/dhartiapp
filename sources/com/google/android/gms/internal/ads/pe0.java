package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.nativead.C2043a;
import java.util.ArrayList;
import java.util.List;
import p060h4.C4509g2;
import p060h4.C4528j3;
import p060h4.C4612x3;
import p179z3.C6345o;
import p179z3.C6348r;
import p179z3.C6353v;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class pe0 extends C2043a {

    /* renamed from: a */
    private final n40 f15817a;

    /* renamed from: b */
    private final List f15818b = new ArrayList();

    /* renamed from: c */
    private final oe0 f15819c;

    /* renamed from: d */
    private final C2043a.C2044a f15820d;

    /* renamed from: e */
    private final List f15821e = new ArrayList();

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0097 A[Catch:{ RemoteException -> 0x00a4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public pe0(com.google.android.gms.internal.ads.n40 r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f15818b = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f15821e = r1
            r5.f15817a = r6
            r1 = 0
            java.util.List r6 = r6.mo10920j()     // Catch:{ RemoteException -> 0x0043 }
            if (r6 == 0) goto L_0x0047
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x0043 }
        L_0x0020:
            boolean r2 = r6.hasNext()     // Catch:{ RemoteException -> 0x0043 }
            if (r2 == 0) goto L_0x0047
            java.lang.Object r2 = r6.next()     // Catch:{ RemoteException -> 0x0043 }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x0043 }
            if (r3 == 0) goto L_0x0035
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x0043 }
            com.google.android.gms.internal.ads.r20 r2 = com.google.android.gms.internal.ads.q20.m19033I6(r2)     // Catch:{ RemoteException -> 0x0043 }
            goto L_0x0036
        L_0x0035:
            r2 = r1
        L_0x0036:
            if (r2 == 0) goto L_0x0020
            java.util.List r3 = r5.f15818b     // Catch:{ RemoteException -> 0x0043 }
            com.google.android.gms.internal.ads.oe0 r4 = new com.google.android.gms.internal.ads.oe0     // Catch:{ RemoteException -> 0x0043 }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x0043 }
            r3.add(r4)     // Catch:{ RemoteException -> 0x0043 }
            goto L_0x0020
        L_0x0043:
            r6 = move-exception
            com.google.android.gms.internal.ads.pm0.m18665e(r0, r6)
        L_0x0047:
            com.google.android.gms.internal.ads.n40 r6 = r5.f15817a     // Catch:{ RemoteException -> 0x0076 }
            java.util.List r6 = r6.mo10916g0()     // Catch:{ RemoteException -> 0x0076 }
            if (r6 == 0) goto L_0x007a
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x0076 }
        L_0x0053:
            boolean r2 = r6.hasNext()     // Catch:{ RemoteException -> 0x0076 }
            if (r2 == 0) goto L_0x007a
            java.lang.Object r2 = r6.next()     // Catch:{ RemoteException -> 0x0076 }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x0076 }
            if (r3 == 0) goto L_0x0068
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x0076 }
            h4.s1 r2 = p060h4.C4574r1.m30004I6(r2)     // Catch:{ RemoteException -> 0x0076 }
            goto L_0x0069
        L_0x0068:
            r2 = r1
        L_0x0069:
            if (r2 == 0) goto L_0x0053
            java.util.List r3 = r5.f15821e     // Catch:{ RemoteException -> 0x0076 }
            h4.t1 r4 = new h4.t1     // Catch:{ RemoteException -> 0x0076 }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x0076 }
            r3.add(r4)     // Catch:{ RemoteException -> 0x0076 }
            goto L_0x0053
        L_0x0076:
            r6 = move-exception
            com.google.android.gms.internal.ads.pm0.m18665e(r0, r6)
        L_0x007a:
            com.google.android.gms.internal.ads.n40 r6 = r5.f15817a     // Catch:{ RemoteException -> 0x0088 }
            com.google.android.gms.internal.ads.r20 r6 = r6.mo10904X()     // Catch:{ RemoteException -> 0x0088 }
            if (r6 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.oe0 r2 = new com.google.android.gms.internal.ads.oe0     // Catch:{ RemoteException -> 0x0088 }
            r2.<init>(r6)     // Catch:{ RemoteException -> 0x0088 }
            goto L_0x008d
        L_0x0088:
            r6 = move-exception
            com.google.android.gms.internal.ads.pm0.m18665e(r0, r6)
        L_0x008c:
            r2 = r1
        L_0x008d:
            r5.f15819c = r2
            com.google.android.gms.internal.ads.n40 r6 = r5.f15817a     // Catch:{ RemoteException -> 0x00a4 }
            com.google.android.gms.internal.ads.j20 r6 = r6.mo10901V()     // Catch:{ RemoteException -> 0x00a4 }
            if (r6 == 0) goto L_0x00a8
            com.google.android.gms.internal.ads.ne0 r6 = new com.google.android.gms.internal.ads.ne0     // Catch:{ RemoteException -> 0x00a4 }
            com.google.android.gms.internal.ads.n40 r2 = r5.f15817a     // Catch:{ RemoteException -> 0x00a4 }
            com.google.android.gms.internal.ads.j20 r2 = r2.mo10901V()     // Catch:{ RemoteException -> 0x00a4 }
            r6.<init>(r2)     // Catch:{ RemoteException -> 0x00a4 }
            r1 = r6
            goto L_0x00a8
        L_0x00a4:
            r6 = move-exception
            com.google.android.gms.internal.ads.pm0.m18665e(r0, r6)
        L_0x00a8:
            r5.f15820d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pe0.<init>(com.google.android.gms.internal.ads.n40):void");
    }

    /* renamed from: a */
    public final String mo7905a() {
        try {
            return this.f15817a.mo10908a0();
        } catch (RemoteException e) {
            pm0.m18665e("", e);
            return null;
        }
    }

    /* renamed from: b */
    public final String mo7906b() {
        try {
            return this.f15817a.mo10905Y();
        } catch (RemoteException e) {
            pm0.m18665e("", e);
            return null;
        }
    }

    /* renamed from: c */
    public final String mo7907c() {
        try {
            return this.f15817a.mo10909b0();
        } catch (RemoteException e) {
            pm0.m18665e("", e);
            return null;
        }
    }

    /* renamed from: d */
    public final String mo7908d() {
        try {
            return this.f15817a.mo10917h();
        } catch (RemoteException e) {
            pm0.m18665e("", e);
            return null;
        }
    }

    /* renamed from: e */
    public final C2043a.C2045b mo7909e() {
        return this.f15819c;
    }

    /* renamed from: f */
    public final C6345o mo7910f() {
        try {
            if (this.f15817a.mo10902W() != null) {
                return new C4528j3(this.f15817a.mo10902W(), (j30) null);
            }
        } catch (RemoteException e) {
            pm0.m18665e("", e);
        }
        return null;
    }

    /* renamed from: g */
    public final String mo7911g() {
        try {
            return this.f15817a.mo10912d0();
        } catch (RemoteException e) {
            pm0.m18665e("", e);
            return null;
        }
    }

    /* renamed from: h */
    public final C6353v mo7912h() {
        C4509g2 g2Var;
        try {
            g2Var = this.f15817a.mo10910c();
        } catch (RemoteException e) {
            pm0.m18665e("", e);
            g2Var = null;
        }
        return C6353v.m37370f(g2Var);
    }

    /* renamed from: i */
    public final Double mo7913i() {
        try {
            double a = this.f15817a.mo10907a();
            if (a == -1.0d) {
                return null;
            }
            return Double.valueOf(a);
        } catch (RemoteException e) {
            pm0.m18665e("", e);
            return null;
        }
    }

    /* renamed from: j */
    public final String mo7914j() {
        try {
            return this.f15817a.mo10915g();
        } catch (RemoteException e) {
            pm0.m18665e("", e);
            return null;
        }
    }

    /* renamed from: k */
    public final void mo7915k(C6348r rVar) {
        try {
            this.f15817a.mo10897Q2(new C4612x3(rVar));
        } catch (RemoteException e) {
            pm0.m18665e("Failed to setOnPaidEventListener", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ Object mo7916l() {
        try {
            return this.f15817a.mo10911c0();
        } catch (RemoteException e) {
            pm0.m18665e("", e);
            return null;
        }
    }
}
