package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p053g4.C4409t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class i22 extends og0 {

    /* renamed from: a */
    private final Context f10591a;

    /* renamed from: b */
    private final Executor f10592b;

    /* renamed from: c */
    private final mf3 f10593c;

    /* renamed from: d */
    private final jh0 f10594d;

    /* renamed from: e */
    private final e01 f10595e;

    /* renamed from: f */
    private final ArrayDeque f10596f;

    /* renamed from: g */
    private final az2 f10597g;

    /* renamed from: h */
    private final kh0 f10598h;

    /* renamed from: i */
    private final n22 f10599i;

    public i22(Context context, Executor executor, mf3 mf3, kh0 kh0, e01 e01, jh0 jh0, ArrayDeque arrayDeque, n22 n22, az2 az2, byte[] bArr) {
        C2679nz.m17343c(context);
        this.f10591a = context;
        this.f10592b = executor;
        this.f10593c = mf3;
        this.f10598h = kh0;
        this.f10594d = jh0;
        this.f10595e = e01;
        this.f10596f = arrayDeque;
        this.f10599i = n22;
        this.f10597g = az2;
    }

    /* renamed from: O6 */
    private final synchronized f22 m14121O6(String str) {
        Iterator it = this.f10596f.iterator();
        while (it.hasNext()) {
            f22 f22 = (f22) it.next();
            if (f22.f9101d.equals(str)) {
                it.remove();
                return f22;
            }
        }
        return null;
    }

    /* renamed from: P6 */
    private final synchronized f22 m14122P6(String str) {
        Iterator it = this.f10596f.iterator();
        while (it.hasNext()) {
            f22 f22 = (f22) it.next();
            if (f22.f9100c.equals(str)) {
                it.remove();
                return f22;
            }
        }
        return null;
    }

    /* renamed from: Q6 */
    private static lf3 m14123Q6(lf3 lf3, kx2 kx2, pa0 pa0, yy2 yy2, ny2 ny2) {
        fa0 a = pa0.mo13200a("AFMA_getAdDictionary", ma0.f13287b, z12.f20906a);
        xy2.m23612d(lf3, ny2);
        ow2 a2 = kx2.mo8966b(ex2.BUILD_URL, lf3).mo8582f(a).mo8577a();
        xy2.m23611c(a2, yy2, ny2);
        return a2;
    }

    /* renamed from: R6 */
    private static lf3 m14124R6(yg0 yg0, kx2 kx2, lk2 lk2) {
        s12 s12 = new s12(lk2);
        return kx2.mo8966b(ex2.GMS_SIGNALS, cf3.m10911i(yg0.f20594a)).mo8582f(s12).mo8581e(t12.f17811a).mo8577a();
    }

    /* renamed from: S6 */
    private final synchronized void m14125S6(f22 f22) {
        m14127h();
        this.f10596f.addLast(f22);
    }

    /* renamed from: T6 */
    private final void m14126T6(lf3 lf3, tg0 tg0) {
        cf3.m10920r(cf3.m10916n(lf3, new c22(this), dn0.f8325a), new e22(this, tg0), dn0.f8330f);
    }

    /* renamed from: h */
    private final synchronized void m14127h() {
        int intValue = ((Long) k10.f11865c.mo13438e()).intValue();
        while (this.f10596f.size() >= intValue) {
            this.f10596f.removeFirst();
        }
    }

    /* renamed from: I6 */
    public final lf3 mo11000I6(yg0 yg0, int i) {
        if (!((Boolean) k10.f11863a.mo13438e()).booleanValue()) {
            return cf3.m10910h(new Exception("Split request is disabled."));
        }
        xu2 xu2 = yg0.f20602i;
        if (xu2 == null) {
            return cf3.m10910h(new Exception("Pool configuration missing from request."));
        }
        if (xu2.f20351e == 0 || xu2.f20352f == 0) {
            return cf3.m10910h(new Exception("Caching is disabled."));
        }
        pa0 b = C4409t.m29316h().mo10445b(this.f10591a, vm0.m22307I1(), this.f10597g);
        lk2 a = this.f10595e.mo9747a(yg0, i);
        kx2 c = a.mo8956c();
        lf3 R6 = m14124R6(yg0, c, a);
        yy2 d = a.mo8957d();
        ny2 a2 = my2.m16825a(this.f10591a, 9);
        lf3 Q6 = m14123Q6(R6, c, b, d, a2);
        return c.mo8965a(ex2.GET_URL_AND_CACHE_KEY, R6, Q6).mo13884a(new y12(this, Q6, R6, yg0, a2)).mo8577a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x006d  */
    /* renamed from: J6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.lf3 mo11001J6(com.google.android.gms.internal.ads.yg0 r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.gms.internal.ads.ga0 r2 = p053g4.C4409t.m29316h()
            android.content.Context r3 = r0.f10591a
            com.google.android.gms.internal.ads.vm0 r4 = com.google.android.gms.internal.ads.vm0.m22307I1()
            com.google.android.gms.internal.ads.az2 r5 = r0.f10597g
            com.google.android.gms.internal.ads.pa0 r2 = r2.mo10445b(r3, r4, r5)
            com.google.android.gms.internal.ads.e01 r3 = r0.f10595e
            r8 = r18
            com.google.android.gms.internal.ads.lk2 r3 = r3.mo9747a(r1, r8)
            com.google.android.gms.internal.ads.ia0 r4 = com.google.android.gms.internal.ads.h22.f10160d
            com.google.android.gms.internal.ads.ha0 r5 = com.google.android.gms.internal.ads.ma0.f13288c
            java.lang.String r6 = "google.afma.response.normalize"
            com.google.android.gms.internal.ads.fa0 r10 = r2.mo13200a(r6, r4, r5)
            com.google.android.gms.internal.ads.q00 r4 = com.google.android.gms.internal.ads.k10.f11863a
            java.lang.Object r4 = r4.mo13438e()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = 0
            if (r4 != 0) goto L_0x0046
            java.lang.String r4 = r1.f20603r
            if (r4 == 0) goto L_0x0044
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0044
            java.lang.String r4 = "Request contained a PoolKey but split request is disabled."
            p073j4.C4794n1.m30693k(r4)
        L_0x0044:
            r11 = r5
            goto L_0x0073
        L_0x0046:
            com.google.android.gms.internal.ads.q00 r4 = com.google.android.gms.internal.ads.k10.f11866d
            java.lang.Object r4 = r4.mo13438e()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x005c
            java.lang.String r4 = r1.f20601h
            com.google.android.gms.internal.ads.f22 r4 = r0.m14122P6(r4)
        L_0x005a:
            r5 = r4
            goto L_0x006b
        L_0x005c:
            java.lang.String r4 = r1.f20603r
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x006b
            java.lang.String r4 = r1.f20603r
            com.google.android.gms.internal.ads.f22 r4 = r0.m14121O6(r4)
            goto L_0x005a
        L_0x006b:
            if (r5 != 0) goto L_0x0044
            java.lang.String r4 = "Request contained a PoolKey but no matching parameters were found."
            p073j4.C4794n1.m30693k(r4)
            goto L_0x0044
        L_0x0073:
            if (r11 != 0) goto L_0x007e
            android.content.Context r4 = r0.f10591a
            r5 = 9
            com.google.android.gms.internal.ads.ny2 r4 = com.google.android.gms.internal.ads.my2.m16825a(r4, r5)
            goto L_0x0080
        L_0x007e:
            com.google.android.gms.internal.ads.ny2 r4 = r11.f9102e
        L_0x0080:
            r12 = r4
            com.google.android.gms.internal.ads.yy2 r13 = r3.mo8957d()
            android.os.Bundle r4 = r1.f20594a
            java.lang.String r5 = "ad_types"
            java.util.ArrayList r4 = r4.getStringArrayList(r5)
            r13.mo15518d(r4)
            com.google.android.gms.internal.ads.p22 r14 = new com.google.android.gms.internal.ads.p22
            java.lang.String r4 = r1.f20600g
            r14.<init>(r4, r13, r12)
            android.content.Context r5 = r0.f10591a
            com.google.android.gms.internal.ads.vm0 r4 = r1.f20595b
            java.lang.String r6 = r4.f19150a
            com.google.android.gms.internal.ads.kh0 r7 = r0.f10598h
            com.google.android.gms.internal.ads.m22 r15 = new com.google.android.gms.internal.ads.m22
            r9 = 0
            r4 = r15
            r8 = r18
            r4.<init>(r5, r6, r7, r8, r9)
            com.google.android.gms.internal.ads.kx2 r4 = r3.mo8956c()
            android.content.Context r5 = r0.f10591a
            r6 = 11
            com.google.android.gms.internal.ads.ny2 r5 = com.google.android.gms.internal.ads.my2.m16825a(r5, r6)
            r6 = 10
            r7 = 1
            r8 = 0
            r9 = 2
            if (r11 != 0) goto L_0x011a
            com.google.android.gms.internal.ads.lf3 r1 = m14124R6(r1, r4, r3)
            com.google.android.gms.internal.ads.lf3 r2 = m14123Q6(r1, r4, r2, r13, r12)
            android.content.Context r3 = r0.f10591a
            com.google.android.gms.internal.ads.ny2 r3 = com.google.android.gms.internal.ads.my2.m16825a(r3, r6)
            com.google.android.gms.internal.ads.ex2 r6 = com.google.android.gms.internal.ads.ex2.HTTP
            com.google.android.gms.internal.ads.lf3[] r11 = new com.google.android.gms.internal.ads.lf3[r9]
            r11[r8] = r2
            r11[r7] = r1
            com.google.android.gms.internal.ads.rw2 r6 = r4.mo8965a(r6, r11)
            com.google.android.gms.internal.ads.v12 r11 = new com.google.android.gms.internal.ads.v12
            r11.<init>(r1, r2)
            com.google.android.gms.internal.ads.ax2 r6 = r6.mo13884a(r11)
            com.google.android.gms.internal.ads.ax2 r6 = r6.mo8581e(r14)
            com.google.android.gms.internal.ads.ty2 r11 = new com.google.android.gms.internal.ads.ty2
            r11.<init>(r3)
            com.google.android.gms.internal.ads.ax2 r6 = r6.mo8581e(r11)
            com.google.android.gms.internal.ads.ax2 r6 = r6.mo8581e(r15)
            com.google.android.gms.internal.ads.ow2 r6 = r6.mo8577a()
            com.google.android.gms.internal.ads.xy2.m23609a(r6, r13, r3)
            com.google.android.gms.internal.ads.xy2.m23612d(r6, r5)
            com.google.android.gms.internal.ads.ex2 r3 = com.google.android.gms.internal.ads.ex2.PRE_PROCESS
            r11 = 3
            com.google.android.gms.internal.ads.lf3[] r11 = new com.google.android.gms.internal.ads.lf3[r11]
            r11[r8] = r1
            r11[r7] = r2
            r11[r9] = r6
            com.google.android.gms.internal.ads.rw2 r3 = r4.mo8965a(r3, r11)
            com.google.android.gms.internal.ads.w12 r4 = new com.google.android.gms.internal.ads.w12
            r4.<init>(r6, r1, r2)
            com.google.android.gms.internal.ads.ax2 r1 = r3.mo13884a(r4)
            com.google.android.gms.internal.ads.ax2 r1 = r1.mo8582f(r10)
            com.google.android.gms.internal.ads.ow2 r1 = r1.mo8577a()
            goto L_0x016f
        L_0x011a:
            com.google.android.gms.internal.ads.o22 r1 = new com.google.android.gms.internal.ads.o22
            org.json.JSONObject r2 = r11.f9099b
            com.google.android.gms.internal.ads.bh0 r3 = r11.f9098a
            r1.<init>(r2, r3)
            android.content.Context r2 = r0.f10591a
            com.google.android.gms.internal.ads.ny2 r2 = com.google.android.gms.internal.ads.my2.m16825a(r2, r6)
            com.google.android.gms.internal.ads.ex2 r3 = com.google.android.gms.internal.ads.ex2.HTTP
            com.google.android.gms.internal.ads.lf3 r1 = com.google.android.gms.internal.ads.cf3.m10911i(r1)
            com.google.android.gms.internal.ads.ax2 r1 = r4.mo8966b(r3, r1)
            com.google.android.gms.internal.ads.ax2 r1 = r1.mo8581e(r14)
            com.google.android.gms.internal.ads.ty2 r3 = new com.google.android.gms.internal.ads.ty2
            r3.<init>(r2)
            com.google.android.gms.internal.ads.ax2 r1 = r1.mo8581e(r3)
            com.google.android.gms.internal.ads.ax2 r1 = r1.mo8581e(r15)
            com.google.android.gms.internal.ads.ow2 r1 = r1.mo8577a()
            com.google.android.gms.internal.ads.xy2.m23609a(r1, r13, r2)
            com.google.android.gms.internal.ads.lf3 r2 = com.google.android.gms.internal.ads.cf3.m10911i(r11)
            com.google.android.gms.internal.ads.xy2.m23612d(r1, r5)
            com.google.android.gms.internal.ads.ex2 r3 = com.google.android.gms.internal.ads.ex2.PRE_PROCESS
            com.google.android.gms.internal.ads.lf3[] r6 = new com.google.android.gms.internal.ads.lf3[r9]
            r6[r8] = r1
            r6[r7] = r2
            com.google.android.gms.internal.ads.rw2 r3 = r4.mo8965a(r3, r6)
            com.google.android.gms.internal.ads.b22 r4 = new com.google.android.gms.internal.ads.b22
            r4.<init>(r1, r2)
            com.google.android.gms.internal.ads.ax2 r1 = r3.mo13884a(r4)
            com.google.android.gms.internal.ads.ax2 r1 = r1.mo8582f(r10)
            com.google.android.gms.internal.ads.ow2 r1 = r1.mo8577a()
        L_0x016f:
            com.google.android.gms.internal.ads.xy2.m23609a(r1, r13, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i22.mo11001J6(com.google.android.gms.internal.ads.yg0, int):com.google.android.gms.internal.ads.lf3");
    }

    /* renamed from: K6 */
    public final lf3 mo11002K6(yg0 yg0, int i) {
        pa0 b = C4409t.m29316h().mo10445b(this.f10591a, vm0.m22307I1(), this.f10597g);
        if (!((Boolean) q10.f16124a.mo13438e()).booleanValue()) {
            return cf3.m10910h(new Exception("Signal collection disabled."));
        }
        lk2 a = this.f10595e.mo9747a(yg0, i);
        wj2 a2 = a.mo8954a();
        fa0 a3 = b.mo13200a("google.afma.request.getSignals", ma0.f13287b, ma0.f13288c);
        ny2 a4 = my2.m16825a(this.f10591a, 22);
        ow2 a5 = a.mo8956c().mo8966b(ex2.GET_SIGNALS, cf3.m10911i(yg0.f20594a)).mo8581e(new ty2(a4)).mo8582f(new a22(a2)).mo8578b(ex2.JS_SIGNALS).mo8582f(a3).mo8577a();
        yy2 d = a.mo8957d();
        d.mo15518d(yg0.f20594a.getStringArrayList("ad_types"));
        xy2.m23610b(a5, d, a4);
        return a5;
    }

    /* renamed from: L6 */
    public final lf3 mo11003L6(String str) {
        f22 f22;
        if (!((Boolean) k10.f11863a.mo13438e()).booleanValue()) {
            return cf3.m10910h(new Exception("Split request is disabled."));
        }
        d22 d22 = new d22(this);
        if (((Boolean) k10.f11866d.mo13438e()).booleanValue()) {
            f22 = m14122P6(str);
        } else {
            f22 = m14121O6(str);
        }
        if (f22 == null) {
            return cf3.m10910h(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str))));
        }
        return cf3.m10911i(d22);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M6 */
    public final /* synthetic */ InputStream mo11004M6(lf3 lf3, lf3 lf32, yg0 yg0, ny2 ny2) throws Exception {
        String c = ((bh0) lf3.get()).mo8798c();
        String str = yg0.f20601h;
        m14125S6(new f22((bh0) lf3.get(), (JSONObject) lf32.get(), str, c, ny2));
        return new ByteArrayInputStream(c.getBytes(o73.f14986c));
    }

    /* renamed from: Q3 */
    public final void mo11005Q3(String str, tg0 tg0) {
        m14126T6(mo11003L6(str), tg0);
    }

    /* renamed from: Y0 */
    public final void mo11006Y0(yg0 yg0, tg0 tg0) {
        m14126T6(mo11000I6(yg0, Binder.getCallingUid()), tg0);
    }

    /* renamed from: c3 */
    public final void mo11007c3(yg0 yg0, tg0 tg0) {
        m14126T6(mo11002K6(yg0, Binder.getCallingUid()), tg0);
    }

    /* renamed from: r2 */
    public final void mo11008r2(yg0 yg0, tg0 tg0) {
        lf3 J6 = mo11001J6(yg0, Binder.getCallingUid());
        m14126T6(J6, tg0);
        if (((Boolean) c10.f7564j.mo13438e()).booleanValue()) {
            J6.mo10135j(new u12(this), this.f10593c);
        } else {
            J6.mo10135j(new u12(this), this.f10592b);
        }
    }
}
