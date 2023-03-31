package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.C2043a;
import java.util.HashMap;
import java.util.Map;
import p016b4.C1781a;
import p053g4.C4409t;
import p060h4.C4509g2;
import p080k4.C4883a;
import p129r4.C5456c;
import p136s4.C5481a;
import p179z3.C6334g;
import p179z3.C6340j;
import p179z3.C6344n;
import p179z3.C6353v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zy1 {

    /* renamed from: a */
    final Map f21716a = new HashMap();

    /* renamed from: b */
    private final Context f21717b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final my1 f21718c;

    /* renamed from: d */
    private final mf3 f21719d;

    /* renamed from: e */
    private ey1 f21720e;

    zy1(Context context, my1 my1, mf3 mf3) {
        this.f21717b = context;
        this.f21718c = my1;
        this.f21719d = mf3;
    }

    /* renamed from: h */
    private static C6334g m24956h() {
        return new C6334g.C6335a().mo230c();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static String m24957i(Object obj) {
        C6353v vVar;
        C4509g2 h;
        if (obj instanceof C6344n) {
            vVar = ((C6344n) obj).mo21713f();
        } else if (obj instanceof C1781a) {
            vVar = ((C1781a) obj).mo6907a();
        } else if (obj instanceof C4883a) {
            vVar = ((C4883a) obj).mo13161a();
        } else if (obj instanceof C5456c) {
            vVar = ((C5456c) obj).mo13804a();
        } else if (obj instanceof C5481a) {
            vVar = ((C5481a) obj).mo9189a();
        } else if (obj instanceof C6340j) {
            vVar = ((C6340j) obj).getResponseInfo();
        } else {
            if (obj instanceof C2043a) {
                vVar = ((C2043a) obj).mo7912h();
            }
            return "";
        }
        if (vVar == null || (h = vVar.mo21731h()) == null) {
            return "";
        }
        try {
            return h.mo12861U();
        } catch (RemoteException unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final synchronized void m24958j(String str, String str2) {
        try {
            cf3.m10920r(this.f21720e.mo10031b(str), new xy1(this, str2), this.f21719d);
        } catch (NullPointerException e) {
            C4409t.m29325q().mo15126t(e, "OutOfContextTester.setAdAsOutOfContext");
            this.f21718c.mo12471h(str2);
        }
    }

    /* renamed from: k */
    private final synchronized void m24959k(String str, String str2) {
        try {
            cf3.m10920r(this.f21720e.mo10031b(str), new yy1(this, str2), this.f21719d);
        } catch (NullPointerException e) {
            C4409t.m29325q().mo15126t(e, "OutOfContextTester.setAdAsShown");
            this.f21718c.mo12471h(str2);
        }
    }

    /* renamed from: d */
    public final void mo15679d(ey1 ey1) {
        this.f21720e = ey1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final synchronized void mo15680e(String str, Object obj, String str2) {
        this.f21716a.put(str, obj);
        m24958j(m24957i(obj), str2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo15681f(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r8.hashCode()     // Catch:{ all -> 0x00dd }
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case -1999289321: goto L_0x0040;
                case -1372958932: goto L_0x0036;
                case -428325382: goto L_0x002c;
                case 543046670: goto L_0x0022;
                case 1854800829: goto L_0x0018;
                case 1951953708: goto L_0x000e;
                default: goto L_0x000d;
            }     // Catch:{ all -> 0x00dd }
        L_0x000d:
            goto L_0x004a
        L_0x000e:
            java.lang.String r0 = "BANNER"
            boolean r8 = r8.equals(r0)     // Catch:{ all -> 0x00dd }
            if (r8 == 0) goto L_0x004a
            r8 = 1
            goto L_0x004b
        L_0x0018:
            java.lang.String r0 = "REWARDED_INTERSTITIAL"
            boolean r8 = r8.equals(r0)     // Catch:{ all -> 0x00dd }
            if (r8 == 0) goto L_0x004a
            r8 = 5
            goto L_0x004b
        L_0x0022:
            java.lang.String r0 = "REWARDED"
            boolean r8 = r8.equals(r0)     // Catch:{ all -> 0x00dd }
            if (r8 == 0) goto L_0x004a
            r8 = 4
            goto L_0x004b
        L_0x002c:
            java.lang.String r0 = "APP_OPEN_AD"
            boolean r8 = r8.equals(r0)     // Catch:{ all -> 0x00dd }
            if (r8 == 0) goto L_0x004a
            r8 = 0
            goto L_0x004b
        L_0x0036:
            java.lang.String r0 = "INTERSTITIAL"
            boolean r8 = r8.equals(r0)     // Catch:{ all -> 0x00dd }
            if (r8 == 0) goto L_0x004a
            r8 = 2
            goto L_0x004b
        L_0x0040:
            java.lang.String r0 = "NATIVE"
            boolean r8 = r8.equals(r0)     // Catch:{ all -> 0x00dd }
            if (r8 == 0) goto L_0x004a
            r8 = 3
            goto L_0x004b
        L_0x004a:
            r8 = -1
        L_0x004b:
            if (r8 == 0) goto L_0x00cd
            if (r8 == r5) goto L_0x00ad
            if (r8 == r4) goto L_0x009d
            if (r8 == r3) goto L_0x0079
            if (r8 == r2) goto L_0x0069
            if (r8 == r1) goto L_0x0059
            monitor-exit(r6)
            return
        L_0x0059:
            android.content.Context r8 = r6.f21717b     // Catch:{ all -> 0x00dd }
            z3.g r0 = m24956h()     // Catch:{ all -> 0x00dd }
            com.google.android.gms.internal.ads.vy1 r1 = new com.google.android.gms.internal.ads.vy1     // Catch:{ all -> 0x00dd }
            r1.<init>(r6, r7, r9)     // Catch:{ all -> 0x00dd }
            p136s4.C5481a.m33427c(r8, r7, r0, r1)     // Catch:{ all -> 0x00dd }
            monitor-exit(r6)
            return
        L_0x0069:
            android.content.Context r8 = r6.f21717b     // Catch:{ all -> 0x00dd }
            z3.g r0 = m24956h()     // Catch:{ all -> 0x00dd }
            com.google.android.gms.internal.ads.ty1 r1 = new com.google.android.gms.internal.ads.ty1     // Catch:{ all -> 0x00dd }
            r1.<init>(r6, r7, r9)     // Catch:{ all -> 0x00dd }
            p129r4.C5456c.m33389c(r8, r7, r0, r1)     // Catch:{ all -> 0x00dd }
            monitor-exit(r6)
            return
        L_0x0079:
            z3.f$a r8 = new z3.f$a     // Catch:{ all -> 0x00dd }
            android.content.Context r0 = r6.f21717b     // Catch:{ all -> 0x00dd }
            r8.<init>(r0, r7)     // Catch:{ all -> 0x00dd }
            com.google.android.gms.internal.ads.py1 r0 = new com.google.android.gms.internal.ads.py1     // Catch:{ all -> 0x00dd }
            r0.<init>(r6, r7, r9)     // Catch:{ all -> 0x00dd }
            r8.mo21648c(r0)     // Catch:{ all -> 0x00dd }
            com.google.android.gms.internal.ads.wy1 r7 = new com.google.android.gms.internal.ads.wy1     // Catch:{ all -> 0x00dd }
            r7.<init>(r6, r9)     // Catch:{ all -> 0x00dd }
            r8.mo21650e(r7)     // Catch:{ all -> 0x00dd }
            z3.f r7 = r8.mo21646a()     // Catch:{ all -> 0x00dd }
            z3.g r8 = m24956h()     // Catch:{ all -> 0x00dd }
            r7.mo21644b(r8)     // Catch:{ all -> 0x00dd }
            monitor-exit(r6)
            return
        L_0x009d:
            android.content.Context r8 = r6.f21717b     // Catch:{ all -> 0x00dd }
            z3.g r0 = m24956h()     // Catch:{ all -> 0x00dd }
            com.google.android.gms.internal.ads.sy1 r1 = new com.google.android.gms.internal.ads.sy1     // Catch:{ all -> 0x00dd }
            r1.<init>(r6, r7, r9)     // Catch:{ all -> 0x00dd }
            p080k4.C4883a.m31060b(r8, r7, r0, r1)     // Catch:{ all -> 0x00dd }
            monitor-exit(r6)
            return
        L_0x00ad:
            z3.j r8 = new z3.j     // Catch:{ all -> 0x00dd }
            android.content.Context r0 = r6.f21717b     // Catch:{ all -> 0x00dd }
            r8.<init>(r0)     // Catch:{ all -> 0x00dd }
            z3.h r0 = p179z3.C6337h.f30518i     // Catch:{ all -> 0x00dd }
            r8.setAdSize(r0)     // Catch:{ all -> 0x00dd }
            r8.setAdUnitId(r7)     // Catch:{ all -> 0x00dd }
            com.google.android.gms.internal.ads.ry1 r0 = new com.google.android.gms.internal.ads.ry1     // Catch:{ all -> 0x00dd }
            r0.<init>(r6, r7, r8, r9)     // Catch:{ all -> 0x00dd }
            r8.setAdListener(r0)     // Catch:{ all -> 0x00dd }
            z3.g r7 = m24956h()     // Catch:{ all -> 0x00dd }
            r8.mo21696b(r7)     // Catch:{ all -> 0x00dd }
            monitor-exit(r6)
            return
        L_0x00cd:
            android.content.Context r8 = r6.f21717b     // Catch:{ all -> 0x00dd }
            z3.g r0 = m24956h()     // Catch:{ all -> 0x00dd }
            com.google.android.gms.internal.ads.qy1 r1 = new com.google.android.gms.internal.ads.qy1     // Catch:{ all -> 0x00dd }
            r1.<init>(r6, r7, r9)     // Catch:{ all -> 0x00dd }
            p016b4.C1781a.m8413c(r8, r7, r0, r5, r1)     // Catch:{ all -> 0x00dd }
            monitor-exit(r6)
            return
        L_0x00dd:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zy1.mo15681f(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: g */
    public final synchronized void mo15682g(String str, String str2) {
        Activity c = this.f21718c.mo12467c();
        if (c != null) {
            Object obj = this.f21716a.get(str);
            if (obj != null) {
                this.f21716a.remove(str);
                m24959k(m24957i(obj), str2);
                if (obj instanceof C1781a) {
                    ((C1781a) obj).mo6911g(c);
                } else if (obj instanceof C4883a) {
                    ((C4883a) obj).mo13165f(c);
                } else if (obj instanceof C5456c) {
                    ((C5456c) obj).mo13810i(c, ny1.f14229a);
                } else if (obj instanceof C5481a) {
                    ((C5481a) obj).mo9195i(c, oy1.f15620a);
                }
            }
        }
    }
}
