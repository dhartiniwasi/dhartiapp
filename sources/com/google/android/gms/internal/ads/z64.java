package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class z64 implements Handler.Callback, jg4, ck4, o74, s34, r74 {

    /* renamed from: A */
    private final long f20959A;

    /* renamed from: B */
    private a84 f20960B;

    /* renamed from: C */
    private q74 f20961C;

    /* renamed from: D */
    private x64 f20962D;

    /* renamed from: E */
    private boolean f20963E;

    /* renamed from: F */
    private boolean f20964F;

    /* renamed from: G */
    private boolean f20965G;

    /* renamed from: H */
    private boolean f20966H;

    /* renamed from: I */
    private boolean f20967I;

    /* renamed from: J */
    private int f20968J = 0;

    /* renamed from: K */
    private boolean f20969K = false;

    /* renamed from: L */
    private boolean f20970L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public boolean f20971M;

    /* renamed from: N */
    private boolean f20972N;

    /* renamed from: O */
    private int f20973O;

    /* renamed from: P */
    private y64 f20974P;

    /* renamed from: Q */
    private long f20975Q;

    /* renamed from: R */
    private int f20976R;

    /* renamed from: S */
    private boolean f20977S;

    /* renamed from: a */
    private final x74[] f20978a;

    /* renamed from: a0 */
    private u44 f20979a0;

    /* renamed from: b */
    private final Set f20980b;

    /* renamed from: b0 */
    private long f20981b0;

    /* renamed from: c */
    private final y74[] f20982c;

    /* renamed from: c0 */
    private final q54 f20983c0;

    /* renamed from: d */
    private final dk4 f20984d;

    /* renamed from: d0 */
    private final q14 f20985d0;

    /* renamed from: e */
    private final fk4 f20986e;

    /* renamed from: f */
    private final d74 f20987f;

    /* renamed from: g */
    private final mk4 f20988g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final fk1 f20989h;

    /* renamed from: i */
    private final HandlerThread f20990i;

    /* renamed from: r */
    private final Looper f20991r;

    /* renamed from: s */
    private final fs0 f20992s;

    /* renamed from: t */
    private final dq0 f20993t;

    /* renamed from: u */
    private final long f20994u;

    /* renamed from: v */
    private final r44 f20995v;

    /* renamed from: w */
    private final ArrayList f20996w;

    /* renamed from: x */
    private final wa1 f20997x;

    /* renamed from: y */
    private final i74 f20998y;

    /* renamed from: z */
    private final p74 f20999z;

    public z64(x74[] x74Arr, dk4 dk4, fk4 fk4, d74 d74, mk4 mk4, int i, boolean z, l84 l84, a84 a84, q14 q14, long j, boolean z2, Looper looper, wa1 wa1, q54 q54, bb4 bb4, byte[] bArr) {
        x74[] x74Arr2 = x74Arr;
        mk4 mk42 = mk4;
        l84 l842 = l84;
        wa1 wa12 = wa1;
        bb4 bb42 = bb4;
        this.f20983c0 = q54;
        this.f20978a = x74Arr2;
        this.f20984d = dk4;
        this.f20986e = fk4;
        this.f20987f = d74;
        this.f20988g = mk42;
        this.f20960B = a84;
        this.f20985d0 = q14;
        this.f20959A = j;
        this.f20964F = false;
        this.f20997x = wa12;
        this.f20981b0 = -9223372036854775807L;
        this.f20994u = d74.zza();
        d74.mo9444T();
        q74 g = q74.m19103g(fk4);
        this.f20961C = g;
        this.f20962D = new x64(g);
        int length = x74Arr2.length;
        this.f20982c = new y74[2];
        for (int i2 = 0; i2 < 2; i2++) {
            x74Arr2[i2].mo13075h(i2, bb42);
            this.f20982c[i2] = x74Arr2[i2].mo13067W();
        }
        this.f20995v = new r44(this, wa12);
        this.f20996w = new ArrayList();
        this.f20980b = Collections.newSetFromMap(new IdentityHashMap());
        this.f20992s = new fs0();
        this.f20993t = new dq0();
        dk4.mo9622g(this, mk42);
        this.f20977S = true;
        Handler handler = new Handler(looper);
        this.f20998y = new i74(l842, handler);
        this.f20999z = new p74(this, l842, handler, bb42);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f20990i = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f20991r = looper2;
        this.f20989h = wa12.mo14878a(looper2, this);
    }

    /* renamed from: A */
    private final void m24417A() {
        f74 f = this.f20998y.mo11034f();
        boolean z = this.f20967I || (f != null && f.f9159a.mo8352b0());
        q74 q74 = this.f20961C;
        if (z != q74.f16240g) {
            this.f20961C = new q74(q74.f16234a, q74.f16235b, q74.f16236c, q74.f16237d, q74.f16238e, q74.f16239f, z, q74.f16241h, q74.f16242i, q74.f16243j, q74.f16244k, q74.f16245l, q74.f16246m, q74.f16247n, q74.f16249p, q74.f16250q, q74.f16251r, q74.f16248o);
        }
    }

    /* renamed from: B */
    private final void m24418B(ki4 ki4, fk4 fk4) {
        this.f20987f.mo9451f(this.f20978a, ki4, fk4.f9313c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bf  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m24419C() throws com.google.android.gms.internal.ads.u44 {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.i74 r0 = r11.f20998y
            com.google.android.gms.internal.ads.f74 r0 = r0.mo11035g()
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            boolean r1 = r0.f9162d
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x001a
            com.google.android.gms.internal.ads.kg4 r1 = r0.f9159a
            long r4 = r1.mo8351b()
            r6 = r4
            goto L_0x001b
        L_0x001a:
            r6 = r2
        L_0x001b:
            r10 = 0
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x003d
            r11.m24456q(r6)
            com.google.android.gms.internal.ads.q74 r0 = r11.f20961C
            long r0 = r0.f16251r
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x00cd
            com.google.android.gms.internal.ads.q74 r0 = r11.f20961C
            com.google.android.gms.internal.ads.mg4 r1 = r0.f16235b
            long r4 = r0.f16236c
            r8 = 1
            r9 = 5
            r0 = r11
            r2 = r6
            com.google.android.gms.internal.ads.q74 r0 = r0.m24450k0(r1, r2, r4, r6, r8, r9)
            r11.f20961C = r0
            goto L_0x00cd
        L_0x003d:
            com.google.android.gms.internal.ads.r44 r1 = r11.f20995v
            com.google.android.gms.internal.ads.i74 r2 = r11.f20998y
            com.google.android.gms.internal.ads.f74 r2 = r2.mo11036h()
            if (r0 == r2) goto L_0x0049
            r2 = 1
            goto L_0x004a
        L_0x0049:
            r2 = 0
        L_0x004a:
            long r1 = r1.mo13676a(r2)
            r11.f20975Q = r1
            long r3 = r0.mo10089e()
            long r1 = r1 - r3
            com.google.android.gms.internal.ads.q74 r0 = r11.f20961C
            long r3 = r0.f16251r
            java.util.ArrayList r0 = r11.f20996w
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00c9
            com.google.android.gms.internal.ads.q74 r0 = r11.f20961C
            com.google.android.gms.internal.ads.mg4 r0 = r0.f16235b
            boolean r0 = r0.mo11883b()
            if (r0 == 0) goto L_0x006c
            goto L_0x00c9
        L_0x006c:
            boolean r0 = r11.f20977S
            if (r0 == 0) goto L_0x0075
            r5 = -1
            long r3 = r3 + r5
            r11.f20977S = r10
        L_0x0075:
            com.google.android.gms.internal.ads.q74 r0 = r11.f20961C
            com.google.android.gms.internal.ads.gt0 r5 = r0.f16234a
            com.google.android.gms.internal.ads.mg4 r0 = r0.f16235b
            java.lang.Object r0 = r0.f12629a
            int r0 = r5.mo8899a(r0)
            int r5 = r11.f20976R
            java.util.ArrayList r6 = r11.f20996w
            int r6 = r6.size()
            int r5 = java.lang.Math.min(r5, r6)
            r6 = 0
            if (r5 <= 0) goto L_0x009b
            java.util.ArrayList r7 = r11.f20996w
            int r8 = r5 + -1
            java.lang.Object r7 = r7.get(r8)
            com.google.android.gms.internal.ads.w64 r7 = (com.google.android.gms.internal.ads.w64) r7
            goto L_0x009c
        L_0x009b:
            r7 = r6
        L_0x009c:
            if (r7 == 0) goto L_0x00b7
            if (r0 < 0) goto L_0x00a8
            if (r0 != 0) goto L_0x00b7
            r7 = 0
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x00b7
        L_0x00a8:
            int r5 = r5 + -1
            if (r5 <= 0) goto L_0x009b
            java.util.ArrayList r7 = r11.f20996w
            int r8 = r5 + -1
            java.lang.Object r7 = r7.get(r8)
            com.google.android.gms.internal.ads.w64 r7 = (com.google.android.gms.internal.ads.w64) r7
            goto L_0x009c
        L_0x00b7:
            java.util.ArrayList r0 = r11.f20996w
            int r0 = r0.size()
            if (r5 >= r0) goto L_0x00c7
            java.util.ArrayList r0 = r11.f20996w
            java.lang.Object r0 = r0.get(r5)
            com.google.android.gms.internal.ads.w64 r0 = (com.google.android.gms.internal.ads.w64) r0
        L_0x00c7:
            r11.f20976R = r5
        L_0x00c9:
            com.google.android.gms.internal.ads.q74 r0 = r11.f20961C
            r0.f16251r = r1
        L_0x00cd:
            com.google.android.gms.internal.ads.i74 r0 = r11.f20998y
            com.google.android.gms.internal.ads.f74 r0 = r0.mo11034f()
            com.google.android.gms.internal.ads.q74 r1 = r11.f20961C
            long r2 = r0.mo10087c()
            r1.f16249p = r2
            com.google.android.gms.internal.ads.q74 r0 = r11.f20961C
            long r1 = r11.m24440e0()
            r0.f16250q = r1
            com.google.android.gms.internal.ads.q74 r0 = r11.f20961C
            boolean r1 = r0.f16245l
            if (r1 == 0) goto L_0x0145
            int r1 = r0.f16238e
            r2 = 3
            if (r1 != r2) goto L_0x0145
            com.google.android.gms.internal.ads.gt0 r1 = r0.f16234a
            com.google.android.gms.internal.ads.mg4 r0 = r0.f16235b
            boolean r0 = r11.m24427K(r1, r0)
            if (r0 == 0) goto L_0x0145
            com.google.android.gms.internal.ads.q74 r0 = r11.f20961C
            com.google.android.gms.internal.ads.fe0 r1 = r0.f16247n
            float r1 = r1.f9260a
            r2 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0145
            com.google.android.gms.internal.ads.q14 r1 = r11.f20985d0
            com.google.android.gms.internal.ads.gt0 r2 = r0.f16234a
            com.google.android.gms.internal.ads.mg4 r3 = r0.f16235b
            java.lang.Object r3 = r3.f12629a
            long r4 = r0.f16251r
            long r2 = r11.m24438d0(r2, r3, r4)
            long r4 = r11.m24440e0()
            float r0 = r1.mo13453a(r2, r4)
            com.google.android.gms.internal.ads.r44 r1 = r11.f20995v
            com.google.android.gms.internal.ads.fe0 r1 = r1.mo9148e()
            float r1 = r1.f9260a
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 == 0) goto L_0x0145
            com.google.android.gms.internal.ads.r44 r1 = r11.f20995v
            com.google.android.gms.internal.ads.q74 r2 = r11.f20961C
            com.google.android.gms.internal.ads.fe0 r2 = r2.f16247n
            com.google.android.gms.internal.ads.fe0 r3 = new com.google.android.gms.internal.ads.fe0
            float r2 = r2.f9261b
            r3.<init>(r0, r2)
            r1.mo9147c(r3)
            com.google.android.gms.internal.ads.q74 r0 = r11.f20961C
            com.google.android.gms.internal.ads.fe0 r0 = r0.f16247n
            com.google.android.gms.internal.ads.r44 r1 = r11.f20995v
            com.google.android.gms.internal.ads.fe0 r1 = r1.mo9148e()
            float r1 = r1.f9260a
            r11.m24451l(r0, r1, r10, r10)
        L_0x0145:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z64.m24419C():void");
    }

    /* renamed from: D */
    private final void m24420D(gt0 gt0, mg4 mg4, gt0 gt02, mg4 mg42, long j) {
        fe0 fe0;
        if (!m24427K(gt0, mg4)) {
            if (mg4.mo11883b()) {
                fe0 = fe0.f9258d;
            } else {
                fe0 = this.f20961C.f16247n;
            }
            if (!this.f20995v.mo9148e().equals(fe0)) {
                this.f20995v.mo9147c(fe0);
                return;
            }
            return;
        }
        gt0.mo8903e(gt0.mo10608n(mg4.f12629a, this.f20993t).f8361c, this.f20992s, 0);
        q14 q14 = this.f20985d0;
        C3036xl xlVar = this.f20992s.f9434i;
        int i = gb2.f9812a;
        q14.mo13456d(xlVar);
        if (j != -9223372036854775807L) {
            this.f20985d0.mo13457e(m24438d0(gt0, mg4.f12629a, j));
            return;
        }
        if (!gb2.m13186t(!gt02.mo10643o() ? gt02.mo8903e(gt02.mo10608n(mg42.f12629a, this.f20993t).f8361c, this.f20992s, 0).f9426a : null, this.f20992s.f9426a)) {
            this.f20985d0.mo13457e(-9223372036854775807L);
        }
    }

    /* renamed from: E */
    private final synchronized void m24421E(s83 s83, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z = false;
        while (!Boolean.valueOf(((p64) s83).f15713a.f20963E).booleanValue() && j > 0) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: F */
    private final boolean m24422F() {
        f74 f = this.f20998y.mo11034f();
        if (f == null || f.mo10088d() == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    private static boolean m24423G(x74 x74) {
        return x74.mo13080n() != 0;
    }

    /* renamed from: H */
    private final boolean m24424H() {
        f74 g = this.f20998y.mo11035g();
        long j = g.f9164f.f9760e;
        if (g.f9162d) {
            return j == -9223372036854775807L || this.f20961C.f16251r < j || !m24426J();
        }
        return false;
    }

    /* renamed from: I */
    private static boolean m24425I(q74 q74, dq0 dq0) {
        mg4 mg4 = q74.f16235b;
        gt0 gt0 = q74.f16234a;
        return gt0.mo10643o() || gt0.mo10608n(mg4.f12629a, dq0).f8364f;
    }

    /* renamed from: J */
    private final boolean m24426J() {
        q74 q74 = this.f20961C;
        return q74.f16245l && q74.f16246m == 0;
    }

    /* renamed from: K */
    private final boolean m24427K(gt0 gt0, mg4 mg4) {
        if (!mg4.mo11883b() && !gt0.mo10643o()) {
            gt0.mo8903e(gt0.mo10608n(mg4.f12629a, this.f20993t).f8361c, this.f20992s, 0);
            if (this.f20992s.mo10268b()) {
                fs0 fs0 = this.f20992s;
                if (!fs0.f9432g || fs0.f9429d == -9223372036854775807L) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: L */
    private static C2388g4[] m24428L(xj4 xj4) {
        int e = xj4 != null ? xj4.mo8852e() : 0;
        C2388g4[] g4VarArr = new C2388g4[e];
        for (int i = 0; i < e; i++) {
            g4VarArr[i] = xj4.mo8854h(i);
        }
        return g4VarArr;
    }

    /* renamed from: M */
    private static final void m24429M(t74 t74) throws u44 {
        t74.mo14223j();
        try {
            t74.mo14216c().mo9150k(t74.mo14214a(), t74.mo14220g());
        } finally {
            t74.mo14221h(true);
        }
    }

    /* renamed from: N */
    private static final void m24430N(x74 x74) throws u44 {
        if (x74.mo13080n() == 2) {
            x74.mo13078i0();
        }
    }

    /* renamed from: O */
    private static final void m24431O(x74 x74, long j) {
        x74.mo13065C();
        if (x74 instanceof ni4) {
            ni4 ni4 = (ni4) x74;
            throw null;
        }
    }

    /* renamed from: S */
    static Object m24433S(fs0 fs0, dq0 dq0, int i, boolean z, Object obj, gt0 gt0, gt0 gt02) {
        int a = gt0.mo8899a(obj);
        int b = gt0.mo8900b();
        int i2 = 0;
        int i3 = a;
        int i4 = -1;
        while (true) {
            if (i2 >= b || i4 != -1) {
                break;
            }
            i3 = gt0.mo10640i(i3, dq0, fs0, i, z);
            if (i3 == -1) {
                i4 = -1;
                break;
            }
            i4 = gt02.mo8899a(gt0.mo8904f(i3));
            i2++;
        }
        if (i4 == -1) {
            return null;
        }
        return gt02.mo8904f(i4);
    }

    /* renamed from: c */
    private final void m24435c(x74 x74) throws u44 {
        if (m24423G(x74)) {
            this.f20995v.mo13677b(x74);
            m24430N(x74);
            x74.mo13069a0();
            this.f20973O--;
        }
    }

    /* renamed from: c0 */
    static final /* synthetic */ void m24436c0(t74 t74) {
        try {
            m24429M(t74);
        } catch (u44 e) {
            ot1.m18058c("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    private final void m24437d() throws u44 {
        int length = this.f20978a.length;
        m24439e(new boolean[2]);
    }

    /* renamed from: d0 */
    private final long m24438d0(gt0 gt0, Object obj, long j) {
        gt0.mo8903e(gt0.mo10608n(obj, this.f20993t).f8361c, this.f20992s, 0);
        fs0 fs0 = this.f20992s;
        if (fs0.f9429d != -9223372036854775807L && fs0.mo10268b()) {
            fs0 fs02 = this.f20992s;
            if (fs02.f9432g) {
                return gb2.m13168f0(gb2.m13164d0(fs02.f9430e) - this.f20992s.f9429d) - j;
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: e */
    private final void m24439e(boolean[] zArr) throws u44 {
        f74 h = this.f20998y.mo11036h();
        fk4 i = h.mo10093i();
        int i2 = 0;
        while (true) {
            int length = this.f20978a.length;
            if (i2 >= 2) {
                break;
            }
            if (!i.mo10170b(i2) && this.f20980b.remove(this.f20978a[i2])) {
                this.f20978a[i2].mo13076h0();
            }
            i2++;
        }
        int i3 = 0;
        while (true) {
            int length2 = this.f20978a.length;
            if (i3 < 2) {
                if (i.mo10170b(i3)) {
                    boolean z = zArr[i3];
                    x74 x74 = this.f20978a[i3];
                    if (!m24423G(x74)) {
                        f74 h2 = this.f20998y.mo11036h();
                        boolean z2 = h2 == this.f20998y.mo11035g();
                        fk4 i4 = h2.mo10093i();
                        z74 z74 = i4.f9312b[i3];
                        C2388g4[] L = m24428L(i4.f9313c[i3]);
                        boolean z3 = m24426J() && this.f20961C.f16238e == 3;
                        boolean z4 = !z && z3;
                        this.f20973O++;
                        this.f20980b.add(x74);
                        x74.mo13077i(z74, L, h2.f9161c[i3], this.f20975Q, z4, z2, h2.mo10090f(), h2.mo10089e());
                        x74.mo9150k(11, new r64(this));
                        this.f20995v.mo13678d(x74);
                        if (z3) {
                            x74.mo13079k0();
                        }
                    }
                }
                i3++;
            } else {
                h.f9165g = true;
                return;
            }
        }
    }

    /* renamed from: e0 */
    private final long m24440e0() {
        return m24442f0(this.f20961C.f16249p);
    }

    /* renamed from: f */
    private final void m24441f(IOException iOException, int i) {
        u44 c = u44.m21410c(iOException, i);
        f74 g = this.f20998y.mo11035g();
        if (g != null) {
            c = c.mo14451a(g.f9164f.f9756a);
        }
        ot1.m18058c("ExoPlayerImplInternal", "Playback error", c);
        m24464y(false, false);
        this.f20961C = this.f20961C.mo13490d(c);
    }

    /* renamed from: f0 */
    private final long m24442f0(long j) {
        f74 f = this.f20998y.mo11034f();
        if (f == null) {
            return 0;
        }
        return Math.max(0, j - (this.f20975Q - f.mo10089e()));
    }

    /* renamed from: g */
    private final void m24443g(boolean z) {
        mg4 mg4;
        long j;
        f74 f = this.f20998y.mo11034f();
        if (f == null) {
            mg4 = this.f20961C.f16235b;
        } else {
            mg4 = f.f9164f.f9756a;
        }
        boolean z2 = !this.f20961C.f16244k.equals(mg4);
        if (z2) {
            this.f20961C = this.f20961C.mo13487a(mg4);
        }
        q74 q74 = this.f20961C;
        if (f == null) {
            j = q74.f16251r;
        } else {
            j = f.mo10087c();
        }
        q74.f16249p = j;
        this.f20961C.f16250q = m24440e0();
        if ((z2 || z) && f != null && f.f9162d) {
            m24418B(f.mo10092h(), f.mo10093i());
        }
    }

    /* renamed from: g0 */
    private final long m24444g0(mg4 mg4, long j, boolean z) throws u44 {
        return m24445h0(mg4, j, this.f20998y.mo11035g() != this.f20998y.mo11036h(), z);
    }

    /* renamed from: h0 */
    private final long m24445h0(mg4 mg4, long j, boolean z, boolean z2) throws u44 {
        m24465z();
        this.f20966H = false;
        if (z2 || this.f20961C.f16238e == 3) {
            m24462w(2);
        }
        f74 g = this.f20998y.mo11035g();
        f74 f74 = g;
        while (f74 != null && !mg4.equals(f74.f9164f.f9756a)) {
            f74 = f74.mo10091g();
        }
        if (z || g != f74 || (f74 != null && f74.mo10089e() + j < 0)) {
            x74[] x74Arr = this.f20978a;
            int length = x74Arr.length;
            for (int i = 0; i < 2; i++) {
                m24435c(x74Arr[i]);
            }
            if (f74 != null) {
                while (this.f20998y.mo11035g() != f74) {
                    this.f20998y.mo11032d();
                }
                this.f20998y.mo11044p(f74);
                f74.mo10100p(1000000000000L);
                m24437d();
            }
        }
        if (f74 != null) {
            this.f20998y.mo11044p(f74);
            if (!f74.f9162d) {
                f74.f9164f = f74.f9164f.mo10415b(j);
            } else if (f74.f9163e) {
                j = f74.f9159a.mo8362l(j);
                f74.f9159a.mo8357g(j - this.f20994u, false);
            }
            m24456q(j);
            m24452m();
        } else {
            this.f20998y.mo11040l();
            m24456q(j);
        }
        m24443g(false);
        this.f20989h.mo9035i0(2);
        return j;
    }

    /* renamed from: i0 */
    private final Pair m24446i0(gt0 gt0) {
        long j = 0;
        if (gt0.mo10643o()) {
            return Pair.create(q74.m19104h(), 0L);
        }
        gt0 gt02 = gt0;
        Pair l = gt02.mo10641l(this.f20992s, this.f20993t, gt0.mo10604g(this.f20969K), -9223372036854775807L);
        mg4 k = this.f20998y.mo11039k(gt0, l.first, 0);
        long longValue = ((Long) l.second).longValue();
        if (k.mo11883b()) {
            gt0.mo10608n(k.f12629a, this.f20993t);
            if (k.f12631c == this.f20993t.mo9654e(k.f12630b)) {
                this.f20993t.mo9660i();
            }
        } else {
            j = longValue;
        }
        return Pair.create(k, Long.valueOf(j));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: com.google.android.gms.internal.ads.dq0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: com.google.android.gms.internal.ads.y64} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: com.google.android.gms.internal.ads.y64} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r14v4 */
    /* JADX WARNING: type inference failed for: r14v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0340  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01bd  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m24447j(com.google.android.gms.internal.ads.gt0 r29, boolean r30) throws com.google.android.gms.internal.ads.u44 {
        /*
            r28 = this;
            r11 = r28
            r12 = r29
            com.google.android.gms.internal.ads.q74 r0 = r11.f20961C
            com.google.android.gms.internal.ads.y64 r8 = r11.f20974P
            com.google.android.gms.internal.ads.i74 r9 = r11.f20998y
            int r4 = r11.f20968J
            boolean r10 = r11.f20969K
            com.google.android.gms.internal.ads.fs0 r13 = r11.f20992s
            com.google.android.gms.internal.ads.dq0 r14 = r11.f20993t
            boolean r1 = r29.mo10643o()
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = 1
            if (r1 == 0) goto L_0x002e
            com.google.android.gms.internal.ads.mg4 r0 = com.google.android.gms.internal.ads.q74.m19104h()
            r8 = r0
            r15 = r11
            r13 = r16
            r2 = 0
            r5 = 1
            r7 = 0
            r9 = -1
            r10 = 0
            goto L_0x01e4
        L_0x002e:
            com.google.android.gms.internal.ads.mg4 r1 = r0.f16235b
            java.lang.Object r15 = r1.f12629a
            boolean r19 = m24425I(r0, r14)
            com.google.android.gms.internal.ads.mg4 r2 = r0.f16235b
            boolean r2 = r2.mo11883b()
            if (r2 != 0) goto L_0x0044
            if (r19 == 0) goto L_0x0041
            goto L_0x0044
        L_0x0041:
            long r5 = r0.f16251r
            goto L_0x0046
        L_0x0044:
            long r5 = r0.f16236c
        L_0x0046:
            r23 = r5
            if (r8 == 0) goto L_0x009f
            r5 = 1
            r6 = r1
            r1 = r29
            r2 = r8
            r11 = 1
            r3 = r5
            r7 = -1
            r5 = r10
            r11 = r6
            r6 = r13
            r21 = r9
            r9 = -1
            r7 = r14
            android.util.Pair r1 = m24448j0(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x006a
            int r1 = r12.mo10604g(r10)
            r5 = r1
            r1 = r23
            r3 = 1
            r4 = 0
            r6 = 0
            goto L_0x0092
        L_0x006a:
            long r2 = r8.f20500c
            int r4 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r4 != 0) goto L_0x007c
            java.lang.Object r1 = r1.first
            com.google.android.gms.internal.ads.dq0 r1 = r12.mo10608n(r1, r14)
            int r5 = r1.f8361c
            r1 = r23
            r3 = 0
            goto L_0x0088
        L_0x007c:
            java.lang.Object r15 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r3 = 1
            r5 = -1
        L_0x0088:
            int r4 = r0.f16238e
            r6 = 4
            if (r4 != r6) goto L_0x008f
            r4 = 1
            goto L_0x0090
        L_0x008f:
            r4 = 0
        L_0x0090:
            r6 = r3
            r3 = 0
        L_0x0092:
            r10 = r4
            r4 = r5
            r22 = r6
            r7 = 0
        L_0x0098:
            r27 = r15
            r15 = r3
            r3 = r27
            goto L_0x013c
        L_0x009f:
            r11 = r1
            r21 = r9
            r9 = -1
            com.google.android.gms.internal.ads.gt0 r1 = r0.f16234a
            boolean r1 = r1.mo10643o()
            if (r1 == 0) goto L_0x00bb
            int r1 = r12.mo10604g(r10)
        L_0x00af:
            r4 = r1
            r3 = r15
            r1 = r23
            r7 = 0
        L_0x00b5:
            r10 = 0
            r15 = 0
            r22 = 0
            goto L_0x013c
        L_0x00bb:
            int r1 = r12.mo8899a(r15)
            if (r1 != r9) goto L_0x00e6
            com.google.android.gms.internal.ads.gt0 r6 = r0.f16234a
            r1 = r13
            r2 = r14
            r3 = r4
            r4 = r10
            r5 = r15
            r7 = r29
            java.lang.Object r1 = m24433S(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x00d6
            int r1 = r12.mo10604g(r10)
            r3 = 1
            goto L_0x00dd
        L_0x00d6:
            com.google.android.gms.internal.ads.dq0 r1 = r12.mo10608n(r1, r14)
            int r1 = r1.f8361c
            r3 = 0
        L_0x00dd:
            r4 = r1
            r1 = r23
            r7 = 0
            r10 = 0
            r22 = 0
            goto L_0x0098
        L_0x00e6:
            int r1 = (r23 > r16 ? 1 : (r23 == r16 ? 0 : -1))
            if (r1 != 0) goto L_0x00f1
            com.google.android.gms.internal.ads.dq0 r1 = r12.mo10608n(r15, r14)
            int r1 = r1.f8361c
            goto L_0x00af
        L_0x00f1:
            if (r19 == 0) goto L_0x0134
            com.google.android.gms.internal.ads.gt0 r1 = r0.f16234a
            java.lang.Object r2 = r11.f12629a
            r1.mo10608n(r2, r14)
            com.google.android.gms.internal.ads.gt0 r1 = r0.f16234a
            int r2 = r14.f8361c
            r7 = 0
            com.google.android.gms.internal.ads.fs0 r1 = r1.mo8903e(r2, r13, r7)
            int r1 = r1.f9438m
            com.google.android.gms.internal.ads.gt0 r2 = r0.f16234a
            java.lang.Object r3 = r11.f12629a
            int r2 = r2.mo8899a(r3)
            if (r1 != r2) goto L_0x012b
            com.google.android.gms.internal.ads.dq0 r1 = r12.mo10608n(r15, r14)
            int r4 = r1.f8361c
            r1 = r29
            r2 = r13
            r3 = r14
            r5 = r23
            android.util.Pair r1 = r1.mo10641l(r2, r3, r4, r5)
            java.lang.Object r15 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            goto L_0x012d
        L_0x012b:
            r1 = r23
        L_0x012d:
            r3 = r15
            r4 = -1
            r10 = 0
            r15 = 0
            r22 = 1
            goto L_0x013c
        L_0x0134:
            r7 = 0
            r3 = r15
            r1 = r23
            r4 = -1
            goto L_0x00b5
        L_0x013c:
            if (r4 == r9) goto L_0x0159
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r29
            r2 = r13
            r3 = r14
            android.util.Pair r1 = r1.mo10641l(r2, r3, r4, r5)
            java.lang.Object r3 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r4 = r1
            r1 = r16
            goto L_0x015a
        L_0x0159:
            r4 = r1
        L_0x015a:
            r6 = r21
            com.google.android.gms.internal.ads.mg4 r6 = r6.mo11039k(r12, r3, r4)
            int r13 = r6.f12633e
            if (r13 == r9) goto L_0x016d
            int r7 = r11.f12633e
            if (r7 == r9) goto L_0x016b
            if (r13 < r7) goto L_0x016b
            goto L_0x016d
        L_0x016b:
            r7 = 0
            goto L_0x016e
        L_0x016d:
            r7 = 1
        L_0x016e:
            java.lang.Object r8 = r11.f12629a
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0186
            boolean r8 = r11.mo11883b()
            if (r8 != 0) goto L_0x0186
            boolean r8 = r6.mo11883b()
            if (r8 != 0) goto L_0x0186
            if (r7 == 0) goto L_0x0186
            r7 = 1
            goto L_0x0187
        L_0x0186:
            r7 = 0
        L_0x0187:
            com.google.android.gms.internal.ads.dq0 r3 = r12.mo10608n(r3, r14)
            if (r19 != 0) goto L_0x01b2
            int r8 = (r23 > r1 ? 1 : (r23 == r1 ? 0 : -1))
            if (r8 != 0) goto L_0x01b2
            java.lang.Object r8 = r11.f12629a
            java.lang.Object r13 = r6.f12629a
            boolean r8 = r8.equals(r13)
            if (r8 != 0) goto L_0x019c
            goto L_0x01b2
        L_0x019c:
            boolean r8 = r11.mo11883b()
            if (r8 == 0) goto L_0x01a7
            int r8 = r11.f12630b
            r3.mo9663l(r8)
        L_0x01a7:
            boolean r8 = r6.mo11883b()
            if (r8 == 0) goto L_0x01b2
            int r8 = r6.f12630b
            r3.mo9663l(r8)
        L_0x01b2:
            r3 = 1
            if (r3 == r7) goto L_0x01b6
            goto L_0x01b7
        L_0x01b6:
            r6 = r11
        L_0x01b7:
            boolean r7 = r6.mo11883b()
            if (r7 == 0) goto L_0x01da
            boolean r4 = r6.equals(r11)
            if (r4 == 0) goto L_0x01c6
            long r4 = r0.f16251r
            goto L_0x01da
        L_0x01c6:
            java.lang.Object r0 = r6.f12629a
            r12.mo10608n(r0, r14)
            int r0 = r6.f12631c
            int r4 = r6.f12630b
            int r4 = r14.mo9654e(r4)
            if (r0 != r4) goto L_0x01d8
            r14.mo9660i()
        L_0x01d8:
            r4 = 0
        L_0x01da:
            r13 = r1
            r8 = r6
            r2 = r10
            r3 = r15
            r7 = r22
            r15 = r28
            r10 = r4
            r5 = 1
        L_0x01e4:
            com.google.android.gms.internal.ads.q74 r0 = r15.f20961C
            com.google.android.gms.internal.ads.mg4 r0 = r0.f16235b
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x01fa
            com.google.android.gms.internal.ads.q74 r0 = r15.f20961C
            long r0 = r0.f16251r
            int r4 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x01f7
            goto L_0x01fa
        L_0x01f7:
            r19 = 0
            goto L_0x01fc
        L_0x01fa:
            r19 = 1
        L_0x01fc:
            r20 = 3
            if (r3 == 0) goto L_0x0219
            com.google.android.gms.internal.ads.q74 r0 = r15.f20961C     // Catch:{ all -> 0x0211 }
            int r0 = r0.f16238e     // Catch:{ all -> 0x0211 }
            if (r0 == r5) goto L_0x020b
            r3 = 4
            r15.m24462w(r3)     // Catch:{ all -> 0x0211 }
            goto L_0x020c
        L_0x020b:
            r3 = 4
        L_0x020c:
            r4 = 0
            r15.m24454o(r4, r4, r4, r5)     // Catch:{ all -> 0x0211 }
            goto L_0x021b
        L_0x0211:
            r0 = move-exception
            r25 = r13
        L_0x0214:
            r9 = 1
            r13 = 0
            r14 = 0
            goto L_0x0335
        L_0x0219:
            r3 = 4
            r4 = 0
        L_0x021b:
            if (r19 != 0) goto L_0x0287
            com.google.android.gms.internal.ads.i74 r1 = r15.f20998y     // Catch:{ all -> 0x0211 }
            long r3 = r15.f20975Q     // Catch:{ all -> 0x0211 }
            com.google.android.gms.internal.ads.f74 r0 = r1.mo11036h()     // Catch:{ all -> 0x0211 }
            r21 = -9223372036854775808
            if (r0 != 0) goto L_0x022e
            r25 = r13
            r5 = 0
            goto L_0x0275
        L_0x022e:
            long r23 = r0.mo10089e()     // Catch:{ all -> 0x0211 }
            boolean r2 = r0.f9162d     // Catch:{ all -> 0x0211 }
            if (r2 != 0) goto L_0x023b
            r25 = r13
            r5 = r23
            goto L_0x0275
        L_0x023b:
            r5 = r23
            r2 = 0
        L_0x023e:
            com.google.android.gms.internal.ads.x74[] r9 = r15.f20978a     // Catch:{ all -> 0x0211 }
            r25 = r13
            int r13 = r9.length     // Catch:{ all -> 0x0285 }
            r13 = 2
            if (r2 >= r13) goto L_0x0275
            r9 = r9[r2]     // Catch:{ all -> 0x0285 }
            boolean r9 = m24423G(r9)     // Catch:{ all -> 0x0285 }
            if (r9 == 0) goto L_0x0270
            com.google.android.gms.internal.ads.x74[] r9 = r15.f20978a     // Catch:{ all -> 0x0285 }
            r9 = r9[r2]     // Catch:{ all -> 0x0285 }
            com.google.android.gms.internal.ads.ci4 r9 = r9.mo13071c0()     // Catch:{ all -> 0x0285 }
            com.google.android.gms.internal.ads.ci4[] r13 = r0.f9161c     // Catch:{ all -> 0x0285 }
            r13 = r13[r2]     // Catch:{ all -> 0x0285 }
            if (r9 == r13) goto L_0x025d
            goto L_0x0270
        L_0x025d:
            com.google.android.gms.internal.ads.x74[] r9 = r15.f20978a     // Catch:{ all -> 0x0285 }
            r9 = r9[r2]     // Catch:{ all -> 0x0285 }
            long r13 = r9.mo13066T()     // Catch:{ all -> 0x0285 }
            int r9 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r9 != 0) goto L_0x026c
            r5 = r21
            goto L_0x0275
        L_0x026c:
            long r5 = java.lang.Math.max(r13, r5)     // Catch:{ all -> 0x0285 }
        L_0x0270:
            int r2 = r2 + 1
            r13 = r25
            goto L_0x023e
        L_0x0275:
            r2 = r29
            r9 = 4
            r13 = 0
            r9 = 1
            r14 = 0
            boolean r0 = r1.mo11046r(r2, r3, r5)     // Catch:{ all -> 0x0334 }
            if (r0 != 0) goto L_0x02bb
            r15.m24459t(r13)     // Catch:{ all -> 0x0334 }
            goto L_0x02bb
        L_0x0285:
            r0 = move-exception
            goto L_0x0214
        L_0x0287:
            r25 = r13
            r9 = 1
            r13 = 0
            r14 = 0
            boolean r0 = r29.mo10643o()     // Catch:{ all -> 0x0334 }
            if (r0 != 0) goto L_0x02bb
            com.google.android.gms.internal.ads.i74 r0 = r15.f20998y     // Catch:{ all -> 0x0334 }
            com.google.android.gms.internal.ads.f74 r0 = r0.mo11035g()     // Catch:{ all -> 0x0334 }
        L_0x0298:
            if (r0 == 0) goto L_0x02b6
            com.google.android.gms.internal.ads.g74 r1 = r0.f9164f     // Catch:{ all -> 0x0334 }
            com.google.android.gms.internal.ads.mg4 r1 = r1.f9756a     // Catch:{ all -> 0x0334 }
            boolean r1 = r1.equals(r8)     // Catch:{ all -> 0x0334 }
            if (r1 == 0) goto L_0x02b1
            com.google.android.gms.internal.ads.i74 r1 = r15.f20998y     // Catch:{ all -> 0x0334 }
            com.google.android.gms.internal.ads.g74 r3 = r0.f9164f     // Catch:{ all -> 0x0334 }
            com.google.android.gms.internal.ads.g74 r1 = r1.mo11038j(r12, r3)     // Catch:{ all -> 0x0334 }
            r0.f9164f = r1     // Catch:{ all -> 0x0334 }
            r0.mo10101q()     // Catch:{ all -> 0x0334 }
        L_0x02b1:
            com.google.android.gms.internal.ads.f74 r0 = r0.mo10091g()     // Catch:{ all -> 0x0334 }
            goto L_0x0298
        L_0x02b6:
            long r0 = r15.m24444g0(r8, r10, r2)     // Catch:{ all -> 0x0334 }
            r10 = r0
        L_0x02bb:
            com.google.android.gms.internal.ads.q74 r0 = r15.f20961C
            com.google.android.gms.internal.ads.gt0 r4 = r0.f16234a
            com.google.android.gms.internal.ads.mg4 r5 = r0.f16235b
            if (r9 == r7) goto L_0x02c6
            r6 = r16
            goto L_0x02c7
        L_0x02c6:
            r6 = r10
        L_0x02c7:
            r1 = r28
            r2 = r29
            r3 = r8
            r1.m24420D(r2, r3, r4, r5, r6)
            if (r19 != 0) goto L_0x02d9
            com.google.android.gms.internal.ads.q74 r0 = r15.f20961C
            long r0 = r0.f16236c
            int r2 = (r25 > r0 ? 1 : (r25 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0316
        L_0x02d9:
            com.google.android.gms.internal.ads.q74 r0 = r15.f20961C
            com.google.android.gms.internal.ads.mg4 r1 = r0.f16235b
            java.lang.Object r1 = r1.f12629a
            com.google.android.gms.internal.ads.gt0 r0 = r0.f16234a
            if (r19 == 0) goto L_0x02f6
            if (r30 == 0) goto L_0x02f6
            boolean r2 = r0.mo10643o()
            if (r2 != 0) goto L_0x02f6
            com.google.android.gms.internal.ads.dq0 r2 = r15.f20993t
            com.google.android.gms.internal.ads.dq0 r0 = r0.mo10608n(r1, r2)
            boolean r0 = r0.f8364f
            if (r0 != 0) goto L_0x02f6
            goto L_0x02f7
        L_0x02f6:
            r9 = 0
        L_0x02f7:
            com.google.android.gms.internal.ads.q74 r0 = r15.f20961C
            long r5 = r0.f16237d
            int r0 = r12.mo8899a(r1)
            r1 = -1
            if (r0 != r1) goto L_0x0305
            r18 = 4
            goto L_0x0307
        L_0x0305:
            r18 = 3
        L_0x0307:
            r1 = r28
            r2 = r8
            r3 = r10
            r7 = r5
            r5 = r25
            r10 = r18
            com.google.android.gms.internal.ads.q74 r0 = r1.m24450k0(r2, r3, r5, r7, r9, r10)
            r15.f20961C = r0
        L_0x0316:
            r28.m24455p()
            com.google.android.gms.internal.ads.q74 r0 = r15.f20961C
            com.google.android.gms.internal.ads.gt0 r0 = r0.f16234a
            r15.m24457r(r12, r0)
            com.google.android.gms.internal.ads.q74 r0 = r15.f20961C
            com.google.android.gms.internal.ads.q74 r0 = r0.mo13492f(r12)
            r15.f20961C = r0
            boolean r0 = r29.mo10643o()
            if (r0 != 0) goto L_0x0330
            r15.f20974P = r14
        L_0x0330:
            r15.m24443g(r13)
            return
        L_0x0334:
            r0 = move-exception
        L_0x0335:
            com.google.android.gms.internal.ads.q74 r1 = r15.f20961C
            com.google.android.gms.internal.ads.gt0 r4 = r1.f16234a
            com.google.android.gms.internal.ads.mg4 r5 = r1.f16235b
            if (r9 == r7) goto L_0x0340
            r6 = r16
            goto L_0x0341
        L_0x0340:
            r6 = r10
        L_0x0341:
            r1 = r28
            r2 = r29
            r3 = r8
            r1.m24420D(r2, r3, r4, r5, r6)
            if (r19 != 0) goto L_0x0353
            com.google.android.gms.internal.ads.q74 r1 = r15.f20961C
            long r1 = r1.f16236c
            int r3 = (r25 > r1 ? 1 : (r25 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0390
        L_0x0353:
            com.google.android.gms.internal.ads.q74 r1 = r15.f20961C
            com.google.android.gms.internal.ads.mg4 r2 = r1.f16235b
            java.lang.Object r2 = r2.f12629a
            com.google.android.gms.internal.ads.gt0 r1 = r1.f16234a
            if (r19 == 0) goto L_0x0370
            if (r30 == 0) goto L_0x0370
            boolean r3 = r1.mo10643o()
            if (r3 != 0) goto L_0x0370
            com.google.android.gms.internal.ads.dq0 r3 = r15.f20993t
            com.google.android.gms.internal.ads.dq0 r1 = r1.mo10608n(r2, r3)
            boolean r1 = r1.f8364f
            if (r1 != 0) goto L_0x0370
            goto L_0x0371
        L_0x0370:
            r9 = 0
        L_0x0371:
            com.google.android.gms.internal.ads.q74 r1 = r15.f20961C
            long r5 = r1.f16237d
            int r1 = r12.mo8899a(r2)
            r2 = -1
            if (r1 != r2) goto L_0x037f
            r18 = 4
            goto L_0x0381
        L_0x037f:
            r18 = 3
        L_0x0381:
            r1 = r28
            r2 = r8
            r3 = r10
            r7 = r5
            r5 = r25
            r10 = r18
            com.google.android.gms.internal.ads.q74 r1 = r1.m24450k0(r2, r3, r5, r7, r9, r10)
            r15.f20961C = r1
        L_0x0390:
            r28.m24455p()
            com.google.android.gms.internal.ads.q74 r1 = r15.f20961C
            com.google.android.gms.internal.ads.gt0 r1 = r1.f16234a
            r15.m24457r(r12, r1)
            com.google.android.gms.internal.ads.q74 r1 = r15.f20961C
            com.google.android.gms.internal.ads.q74 r1 = r1.mo13492f(r12)
            r15.f20961C = r1
            boolean r1 = r29.mo10643o()
            if (r1 != 0) goto L_0x03aa
            r15.f20974P = r14
        L_0x03aa:
            r15.m24443g(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z64.m24447j(com.google.android.gms.internal.ads.gt0, boolean):void");
    }

    /* renamed from: j0 */
    private static Pair m24448j0(gt0 gt0, y64 y64, boolean z, int i, boolean z2, fs0 fs0, dq0 dq0) {
        gt0 gt02 = gt0;
        y64 y642 = y64;
        dq0 dq02 = dq0;
        gt0 gt03 = y642.f20498a;
        if (gt0.mo10643o()) {
            return null;
        }
        gt0 gt04 = true == gt03.mo10643o() ? gt02 : gt03;
        try {
            Pair l = gt04.mo10641l(fs0, dq0, y642.f20499b, y642.f20500c);
            if (gt0.equals(gt04)) {
                return l;
            }
            if (gt0.mo8899a(l.first) == -1) {
                fs0 fs02 = fs0;
                Object S = m24433S(fs0, dq0, i, z2, l.first, gt04, gt0);
                if (S != null) {
                    return gt0.mo10641l(fs0, dq0, gt0.mo10608n(S, dq02).f8361c, -9223372036854775807L);
                }
                return null;
            } else if (!gt04.mo10608n(l.first, dq02).f8364f || gt04.mo8903e(dq02.f8361c, fs0, 0).f9438m != gt04.mo8899a(l.first)) {
                return l;
            } else {
                return gt0.mo10641l(fs0, dq0, gt0.mo10608n(l.first, dq02).f8361c, y642.f20500c);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* renamed from: k */
    private final void m24449k(fe0 fe0, boolean z) throws u44 {
        m24451l(fe0, fe0.f9260a, true, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bd  */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.q74 m24450k0(com.google.android.gms.internal.ads.mg4 r17, long r18, long r20, long r22, boolean r24, int r25) {
        /*
            r16 = this;
            r0 = r16
            r2 = r17
            r5 = r20
            boolean r1 = r0.f20977S
            r3 = 0
            if (r1 != 0) goto L_0x0020
            com.google.android.gms.internal.ads.q74 r1 = r0.f20961C
            long r7 = r1.f16251r
            int r1 = (r18 > r7 ? 1 : (r18 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0020
            com.google.android.gms.internal.ads.q74 r1 = r0.f20961C
            com.google.android.gms.internal.ads.mg4 r1 = r1.f16235b
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r1 = 0
            goto L_0x0021
        L_0x0020:
            r1 = 1
        L_0x0021:
            r0.f20977S = r1
            r16.m24455p()
            com.google.android.gms.internal.ads.q74 r1 = r0.f20961C
            com.google.android.gms.internal.ads.ki4 r7 = r1.f16241h
            com.google.android.gms.internal.ads.fk4 r8 = r1.f16242i
            java.util.List r1 = r1.f16243j
            com.google.android.gms.internal.ads.p74 r9 = r0.f20999z
            boolean r9 = r9.mo13154i()
            if (r9 == 0) goto L_0x00a1
            com.google.android.gms.internal.ads.i74 r1 = r0.f20998y
            com.google.android.gms.internal.ads.f74 r1 = r1.mo11035g()
            if (r1 != 0) goto L_0x0041
            com.google.android.gms.internal.ads.ki4 r7 = com.google.android.gms.internal.ads.ki4.f12114d
            goto L_0x0045
        L_0x0041:
            com.google.android.gms.internal.ads.ki4 r7 = r1.mo10092h()
        L_0x0045:
            if (r1 != 0) goto L_0x004a
            com.google.android.gms.internal.ads.fk4 r8 = r0.f20986e
            goto L_0x004e
        L_0x004a:
            com.google.android.gms.internal.ads.fk4 r8 = r1.mo10093i()
        L_0x004e:
            com.google.android.gms.internal.ads.xj4[] r9 = r8.f9313c
            com.google.android.gms.internal.ads.ra3 r10 = new com.google.android.gms.internal.ads.ra3
            r10.<init>()
            int r11 = r9.length
            r12 = 0
            r13 = 0
        L_0x0058:
            if (r12 >= r11) goto L_0x007f
            r14 = r9[r12]
            if (r14 == 0) goto L_0x007a
            com.google.android.gms.internal.ads.g4 r14 = r14.mo8854h(r3)
            com.google.android.gms.internal.ads.k60 r14 = r14.f9671j
            if (r14 != 0) goto L_0x0076
            com.google.android.gms.internal.ads.k60 r14 = new com.google.android.gms.internal.ads.k60
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            com.google.android.gms.internal.ads.j50[] r15 = new com.google.android.gms.internal.ads.j50[r3]
            r14.<init>(r4, r15)
            r10.mo13701f(r14)
            goto L_0x007a
        L_0x0076:
            r10.mo13701f(r14)
            r13 = 1
        L_0x007a:
            int r12 = r12 + 1
            r5 = r20
            goto L_0x0058
        L_0x007f:
            if (r13 == 0) goto L_0x0086
            com.google.android.gms.internal.ads.ua3 r3 = r10.mo13703h()
            goto L_0x008a
        L_0x0086:
            com.google.android.gms.internal.ads.ua3 r3 = com.google.android.gms.internal.ads.ua3.m21508w()
        L_0x008a:
            if (r1 == 0) goto L_0x009d
            com.google.android.gms.internal.ads.g74 r4 = r1.f9164f
            long r5 = r4.f9758c
            r9 = r20
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x009f
            com.google.android.gms.internal.ads.g74 r4 = r4.mo10414a(r9)
            r1.f9164f = r4
            goto L_0x009f
        L_0x009d:
            r9 = r20
        L_0x009f:
            r13 = r3
            goto L_0x00b9
        L_0x00a1:
            r9 = r5
            com.google.android.gms.internal.ads.q74 r3 = r0.f20961C
            com.google.android.gms.internal.ads.mg4 r3 = r3.f16235b
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x00b8
            com.google.android.gms.internal.ads.ki4 r1 = com.google.android.gms.internal.ads.ki4.f12114d
            com.google.android.gms.internal.ads.fk4 r3 = r0.f20986e
            com.google.android.gms.internal.ads.ua3 r4 = com.google.android.gms.internal.ads.ua3.m21508w()
            r11 = r1
            r12 = r3
            r13 = r4
            goto L_0x00bb
        L_0x00b8:
            r13 = r1
        L_0x00b9:
            r11 = r7
            r12 = r8
        L_0x00bb:
            if (r24 == 0) goto L_0x00c4
            com.google.android.gms.internal.ads.x64 r1 = r0.f20962D
            r3 = r25
            r1.mo15059d(r3)
        L_0x00c4:
            com.google.android.gms.internal.ads.q74 r1 = r0.f20961C
            long r14 = r16.m24440e0()
            r2 = r17
            r3 = r18
            r5 = r20
            r7 = r22
            r9 = r14
            com.google.android.gms.internal.ads.q74 r1 = r1.mo13488b(r2, r3, r5, r7, r9, r11, r12, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z64.m24450k0(com.google.android.gms.internal.ads.mg4, long, long, long, boolean, int):com.google.android.gms.internal.ads.q74");
    }

    /* renamed from: l */
    private final void m24451l(fe0 fe0, float f, boolean z, boolean z2) throws u44 {
        int i;
        z64 z64 = this;
        fe0 fe02 = fe0;
        if (z) {
            if (z2) {
                z64.f20962D.mo15056a(1);
            }
            q74 q74 = z64.f20961C;
            gt0 gt0 = q74.f16234a;
            mg4 mg4 = q74.f16235b;
            q74 q742 = r1;
            q74 q743 = q742;
            q74 q744 = q74;
            gt0 gt02 = gt0;
            mg4 mg42 = mg4;
            q74 q745 = new q74(gt02, mg42, q74.f16236c, q74.f16237d, q74.f16238e, q74.f16239f, q74.f16240g, q74.f16241h, q74.f16242i, q74.f16243j, q74.f16244k, q744.f16245l, q744.f16246m, fe0, q744.f16249p, q744.f16250q, q744.f16251r, q744.f16248o);
            z64 = this;
            z64.f20961C = q742;
        }
        fe0 fe03 = fe0;
        float f2 = fe03.f9260a;
        f74 g = z64.f20998y.mo11035g();
        while (true) {
            i = 0;
            if (g == null) {
                break;
            }
            xj4[] xj4Arr = g.mo10093i().f9313c;
            int length = xj4Arr.length;
            while (i < length) {
                xj4 xj4 = xj4Arr[i];
                i++;
            }
            g = g.mo10091g();
        }
        x74[] x74Arr = z64.f20978a;
        int length2 = x74Arr.length;
        while (i < 2) {
            x74 x74 = x74Arr[i];
            if (x74 != null) {
                x74.mo12378f(f, fe03.f9260a);
            } else {
                float f3 = f;
            }
            i++;
        }
    }

    /* renamed from: m */
    private final void m24452m() {
        boolean z;
        long j;
        long j2;
        if (!m24422F()) {
            z = false;
        } else {
            f74 f = this.f20998y.mo11034f();
            long f0 = m24442f0(f.mo10088d());
            if (f == this.f20998y.mo11035g()) {
                j2 = this.f20975Q;
                j = f.mo10089e();
            } else {
                j2 = this.f20975Q - f.mo10089e();
                j = f.f9164f.f9757b;
            }
            z = this.f20987f.mo9448c(j2 - j, f0, this.f20995v.mo9148e().f9260a);
        }
        this.f20967I = z;
        if (z) {
            this.f20998y.mo11034f().mo10095k(this.f20975Q);
        }
        m24417A();
    }

    /* renamed from: n */
    private final void m24453n() {
        this.f20962D.mo15058c(this.f20961C);
        if (this.f20962D.f20013a) {
            q54 q54 = this.f20983c0;
            q54.f16192a.mo12840A(this.f20962D);
            this.f20962D = new x64(this.f20961C);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m24454o(boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            r29 = this;
            r1 = r29
            com.google.android.gms.internal.ads.fk1 r0 = r1.f20989h
            r2 = 2
            r0.mo9036n(r2)
            r3 = 0
            r1.f20979a0 = r3
            r4 = 0
            r1.f20966H = r4
            com.google.android.gms.internal.ads.r44 r0 = r1.f20995v
            r0.mo13681h()
            r5 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            r1.f20975Q = r5
            com.google.android.gms.internal.ads.x74[] r5 = r1.f20978a
            int r0 = r5.length
            r6 = 0
        L_0x001e:
            java.lang.String r7 = "ExoPlayerImplInternal"
            if (r6 >= r2) goto L_0x0033
            r0 = r5[r6]
            r1.m24435c(r0)     // Catch:{ u44 -> 0x002a, RuntimeException -> 0x0028 }
            goto L_0x0030
        L_0x0028:
            r0 = move-exception
            goto L_0x002b
        L_0x002a:
            r0 = move-exception
        L_0x002b:
            java.lang.String r8 = "Disable failed."
            com.google.android.gms.internal.ads.ot1.m18058c(r7, r8, r0)
        L_0x0030:
            int r6 = r6 + 1
            goto L_0x001e
        L_0x0033:
            if (r30 == 0) goto L_0x0053
            com.google.android.gms.internal.ads.x74[] r5 = r1.f20978a
            int r0 = r5.length
            r6 = 0
        L_0x0039:
            if (r6 >= r2) goto L_0x0053
            r0 = r5[r6]
            java.util.Set r8 = r1.f20980b
            boolean r8 = r8.remove(r0)
            if (r8 == 0) goto L_0x0050
            r0.mo13076h0()     // Catch:{ RuntimeException -> 0x0049 }
            goto L_0x0050
        L_0x0049:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "Reset failed."
            com.google.android.gms.internal.ads.ot1.m18058c(r7, r0, r8)
        L_0x0050:
            int r6 = r6 + 1
            goto L_0x0039
        L_0x0053:
            r1.f20973O = r4
            com.google.android.gms.internal.ads.q74 r0 = r1.f20961C
            com.google.android.gms.internal.ads.mg4 r2 = r0.f16235b
            long r5 = r0.f16251r
            com.google.android.gms.internal.ads.q74 r0 = r1.f20961C
            com.google.android.gms.internal.ads.mg4 r0 = r0.f16235b
            boolean r0 = r0.mo11883b()
            if (r0 != 0) goto L_0x0075
            com.google.android.gms.internal.ads.q74 r0 = r1.f20961C
            com.google.android.gms.internal.ads.dq0 r7 = r1.f20993t
            boolean r0 = m24425I(r0, r7)
            if (r0 == 0) goto L_0x0070
            goto L_0x0075
        L_0x0070:
            com.google.android.gms.internal.ads.q74 r0 = r1.f20961C
            long r7 = r0.f16251r
            goto L_0x0079
        L_0x0075:
            com.google.android.gms.internal.ads.q74 r0 = r1.f20961C
            long r7 = r0.f16236c
        L_0x0079:
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r31 == 0) goto L_0x00ad
            r1.f20974P = r3
            com.google.android.gms.internal.ads.q74 r0 = r1.f20961C
            com.google.android.gms.internal.ads.gt0 r0 = r0.f16234a
            android.util.Pair r0 = r1.m24446i0(r0)
            java.lang.Object r2 = r0.first
            com.google.android.gms.internal.ads.mg4 r2 = (com.google.android.gms.internal.ads.mg4) r2
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r5 = r0.longValue()
            com.google.android.gms.internal.ads.q74 r0 = r1.f20961C
            com.google.android.gms.internal.ads.mg4 r0 = r0.f16235b
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00a7
            r0 = 1
            r18 = r2
            r26 = r5
            r8 = r9
            goto L_0x00b3
        L_0x00a7:
            r18 = r2
            r26 = r5
            r8 = r9
            goto L_0x00b2
        L_0x00ad:
            r18 = r2
            r26 = r5
            r8 = r7
        L_0x00b2:
            r0 = 0
        L_0x00b3:
            com.google.android.gms.internal.ads.i74 r2 = r1.f20998y
            r2.mo11040l()
            r1.f20967I = r4
            com.google.android.gms.internal.ads.q74 r2 = new com.google.android.gms.internal.ads.q74
            com.google.android.gms.internal.ads.q74 r4 = r1.f20961C
            com.google.android.gms.internal.ads.gt0 r6 = r4.f16234a
            int r12 = r4.f16238e
            if (r33 == 0) goto L_0x00c5
            goto L_0x00c7
        L_0x00c5:
            com.google.android.gms.internal.ads.u44 r3 = r4.f16239f
        L_0x00c7:
            r13 = r3
            if (r0 == 0) goto L_0x00cd
            com.google.android.gms.internal.ads.ki4 r3 = com.google.android.gms.internal.ads.ki4.f12114d
            goto L_0x00cf
        L_0x00cd:
            com.google.android.gms.internal.ads.ki4 r3 = r4.f16241h
        L_0x00cf:
            r15 = r3
            if (r0 == 0) goto L_0x00d5
            com.google.android.gms.internal.ads.fk4 r3 = r1.f20986e
            goto L_0x00d7
        L_0x00d5:
            com.google.android.gms.internal.ads.fk4 r3 = r4.f16242i
        L_0x00d7:
            r16 = r3
            if (r0 == 0) goto L_0x00e0
            com.google.android.gms.internal.ads.ua3 r0 = com.google.android.gms.internal.ads.ua3.m21508w()
            goto L_0x00e2
        L_0x00e0:
            java.util.List r0 = r4.f16243j
        L_0x00e2:
            r17 = r0
            com.google.android.gms.internal.ads.q74 r0 = r1.f20961C
            r14 = 0
            boolean r3 = r0.f16245l
            r19 = r3
            int r3 = r0.f16246m
            r20 = r3
            com.google.android.gms.internal.ads.fe0 r0 = r0.f16247n
            r21 = r0
            r24 = 0
            r28 = 0
            r5 = r2
            r7 = r18
            r10 = r26
            r22 = r26
            r5.<init>(r6, r7, r8, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r26, r28)
            r1.f20961C = r2
            if (r32 == 0) goto L_0x010a
            com.google.android.gms.internal.ads.p74 r0 = r1.f20999z
            r0.mo13152g()
        L_0x010a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z64.m24454o(boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: p */
    private final void m24455p() {
        f74 g = this.f20998y.mo11035g();
        boolean z = false;
        if (g != null && g.f9164f.f9763h && this.f20964F) {
            z = true;
        }
        this.f20965G = z;
    }

    /* renamed from: q */
    private final void m24456q(long j) throws u44 {
        long j2;
        f74 g = this.f20998y.mo11035g();
        if (g == null) {
            j2 = 1000000000000L;
        } else {
            j2 = g.mo10089e();
        }
        long j3 = j + j2;
        this.f20975Q = j3;
        this.f20995v.mo13679f(j3);
        x74[] x74Arr = this.f20978a;
        int length = x74Arr.length;
        for (int i = 0; i < 2; i++) {
            x74 x74 = x74Arr[i];
            if (m24423G(x74)) {
                x74.mo13070b(this.f20975Q);
            }
        }
        for (f74 g2 = this.f20998y.mo11035g(); g2 != null; g2 = g2.mo10091g()) {
            for (xj4 xj4 : g2.mo10093i().f9313c) {
            }
        }
    }

    /* renamed from: r */
    private final void m24457r(gt0 gt0, gt0 gt02) {
        if (!gt0.mo10643o() || !gt02.mo10643o()) {
            int size = this.f20996w.size() - 1;
            if (size < 0) {
                Collections.sort(this.f20996w);
                return;
            }
            Object obj = ((w64) this.f20996w.get(size)).f19510a;
            int i = gb2.f9812a;
            throw null;
        }
    }

    /* renamed from: s */
    private final void m24458s(long j, long j2) {
        this.f20989h.mo9043v(2, j + j2);
    }

    /* renamed from: t */
    private final void m24459t(boolean z) throws u44 {
        mg4 mg4 = this.f20998y.mo11035g().f9164f.f9756a;
        long h0 = m24445h0(mg4, this.f20961C.f16251r, true, false);
        if (h0 != this.f20961C.f16251r) {
            q74 q74 = this.f20961C;
            this.f20961C = m24450k0(mg4, h0, q74.f16236c, q74.f16237d, z, 5);
        }
    }

    /* renamed from: u */
    private final void m24460u(t74 t74) throws u44 {
        if (t74.mo14215b() == this.f20991r) {
            m24429M(t74);
            int i = this.f20961C.f16238e;
            if (i == 3 || i == 2) {
                this.f20989h.mo9035i0(2);
                return;
            }
            return;
        }
        this.f20989h.mo9040s(15, t74).zza();
    }

    /* renamed from: v */
    private final void m24461v(boolean z, int i, boolean z2, int i2) throws u44 {
        this.f20962D.mo15056a(z2 ? 1 : 0);
        this.f20962D.mo15057b(i2);
        this.f20961C = this.f20961C.mo13489c(z, i);
        this.f20966H = false;
        for (f74 g = this.f20998y.mo11035g(); g != null; g = g.mo10091g()) {
            for (xj4 xj4 : g.mo10093i().f9313c) {
            }
        }
        if (!m24426J()) {
            m24465z();
            m24419C();
            return;
        }
        int i3 = this.f20961C.f16238e;
        if (i3 == 3) {
            m24463x();
            this.f20989h.mo9035i0(2);
        } else if (i3 == 2) {
            this.f20989h.mo9035i0(2);
        }
    }

    /* renamed from: w */
    private final void m24462w(int i) {
        q74 q74 = this.f20961C;
        if (q74.f16238e != i) {
            if (i != 2) {
                this.f20981b0 = -9223372036854775807L;
            }
            this.f20961C = q74.mo13491e(i);
        }
    }

    /* renamed from: x */
    private final void m24463x() throws u44 {
        this.f20966H = false;
        this.f20995v.mo13680g();
        x74[] x74Arr = this.f20978a;
        int length = x74Arr.length;
        for (int i = 0; i < 2; i++) {
            x74 x74 = x74Arr[i];
            if (m24423G(x74)) {
                x74.mo13079k0();
            }
        }
    }

    /* renamed from: y */
    private final void m24464y(boolean z, boolean z2) {
        m24454o(z || !this.f20970L, false, true, false);
        this.f20962D.mo15056a(z2 ? 1 : 0);
        this.f20987f.mo9447b();
        m24462w(1);
    }

    /* renamed from: z */
    private final void m24465z() throws u44 {
        this.f20995v.mo13681h();
        x74[] x74Arr = this.f20978a;
        int length = x74Arr.length;
        for (int i = 0; i < 2; i++) {
            x74 x74 = x74Arr[i];
            if (m24423G(x74)) {
                m24430N(x74);
            }
        }
    }

    /* renamed from: P */
    public final Looper mo15553P() {
        return this.f20991r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public final /* synthetic */ Boolean mo15554R() {
        return Boolean.valueOf(this.f20963E);
    }

    /* renamed from: U */
    public final void mo12858U() {
        this.f20989h.mo9035i0(22);
    }

    /* renamed from: V */
    public final void mo15555V() {
        this.f20989h.mo9034g(0).zza();
    }

    /* renamed from: W */
    public final void mo9203W() {
        this.f20989h.mo9035i0(10);
    }

    /* renamed from: X */
    public final void mo15556X(gt0 gt0, int i, long j) {
        this.f20989h.mo9040s(3, new y64(gt0, i, j)).zza();
    }

    /* renamed from: Y */
    public final void mo15557Y(boolean z, int i) {
        this.f20989h.mo9042u(1, z ? 1 : 0, i).zza();
    }

    /* renamed from: Z */
    public final void mo15558Z() {
        this.f20989h.mo9034g(6).zza();
    }

    /* renamed from: a */
    public final void mo13948a(fe0 fe0) {
        this.f20989h.mo9040s(16, fe0).zza();
    }

    /* renamed from: a0 */
    public final synchronized boolean mo15559a0() {
        if (!this.f20963E) {
            if (this.f20990i.isAlive()) {
                this.f20989h.mo9035i0(7);
                m24421E(new p64(this), this.f20959A);
                return this.f20963E;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final synchronized void mo13692b(t74 t74) {
        if (!this.f20963E) {
            if (this.f20990i.isAlive()) {
                this.f20989h.mo9040s(14, t74).zza();
                return;
            }
        }
        ot1.m18060e("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        t74.mo14221h(false);
    }

    /* renamed from: b0 */
    public final void mo15560b0(List list, int i, long j, gi4 gi4) {
        this.f20989h.mo9040s(17, new t64(list, gi4, i, j, (s64) null, (byte[]) null)).zza();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo8358h(fi4 fi4) {
        this.f20989h.mo9040s(9, (kg4) fi4).zza();
    }

    /* JADX WARNING: type inference failed for: r2v26, types: [com.google.android.gms.internal.ads.ve3, com.google.android.gms.internal.ads.mk4] */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x090f, code lost:
        if (r11.f20987f.mo9446a(m24440e0(), r11.f20995v.mo9148e().f9260a, r11.f20966H, r31) != false) goto L_0x0911;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0932, code lost:
        if (r2 == false) goto L_0x0934;
     */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x06c7 A[Catch:{ all -> 0x0359, all -> 0x0187, u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x06c8 A[Catch:{ all -> 0x0359, all -> 0x0187, u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x074d A[Catch:{ all -> 0x0359, all -> 0x0187, u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x07b8 A[Catch:{ all -> 0x0359, all -> 0x0187, u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0845 A[Catch:{ all -> 0x0359, all -> 0x0187, u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:496:0x096d A[Catch:{ all -> 0x0359, all -> 0x0187, u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:524:0x09e4 A[Catch:{ all -> 0x0359, all -> 0x0187, u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:525:0x09e6 A[Catch:{ all -> 0x0359, all -> 0x0187, u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:535:0x09fa A[Catch:{ all -> 0x0359, all -> 0x0187, u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:536:0x0a50 A[Catch:{ all -> 0x0359, all -> 0x0187, u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:542:0x0a64 A[Catch:{ all -> 0x0359, all -> 0x0187, u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:661:0x0848 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r54) {
        /*
            r53 = this;
            r11 = r53
            r1 = r54
            r13 = 0
            r14 = 1
            int r2 = r1.what     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r15 = 0
            r10 = -1
            r7 = 4
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 2
            switch(r2) {
                case 0: goto L_0x0a92;
                case 1: goto L_0x0a83;
                case 2: goto L_0x04f7;
                case 3: goto L_0x0381;
                case 4: goto L_0x036c;
                case 5: goto L_0x0364;
                case 6: goto L_0x035d;
                case 7: goto L_0x033f;
                case 8: goto L_0x02e6;
                case 9: goto L_0x02ce;
                case 10: goto L_0x01c0;
                case 11: goto L_0x01a8;
                case 12: goto L_0x018b;
                case 13: goto L_0x014c;
                case 14: goto L_0x0143;
                case 15: goto L_0x0115;
                case 16: goto L_0x010c;
                case 17: goto L_0x00ce;
                case 18: goto L_0x00aa;
                case 19: goto L_0x0094;
                case 20: goto L_0x007c;
                case 21: goto L_0x0068;
                case 22: goto L_0x005d;
                case 23: goto L_0x0037;
                case 24: goto L_0x001b;
                case 25: goto L_0x0016;
                default: goto L_0x0014;
            }     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x0014:
            r1 = 0
            return r1
        L_0x0016:
            r11.m24459t(r14)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0b23
        L_0x001b:
            int r1 = r1.arg1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r1 != r14) goto L_0x0021
            r1 = 1
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            boolean r2 = r11.f20972N     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r1 == r2) goto L_0x0b23
            r11.f20972N = r1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r1 != 0) goto L_0x0b23
            com.google.android.gms.internal.ads.q74 r1 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r1 = r1.f16248o     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r1 == 0) goto L_0x0b23
            com.google.android.gms.internal.ads.fk1 r1 = r11.f20989h     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r1.mo9035i0(r8)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0b23
        L_0x0037:
            int r1 = r1.arg1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r1 == 0) goto L_0x003d
            r1 = 1
            goto L_0x003e
        L_0x003d:
            r1 = 0
        L_0x003e:
            r11.f20964F = r1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r53.m24455p()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r1 = r11.f20965G     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r1 == 0) goto L_0x0b23
            com.google.android.gms.internal.ads.i74 r1 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.f74 r1 = r1.mo11036h()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.i74 r2 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.f74 r2 = r2.mo11035g()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r1 == r2) goto L_0x0b23
            r11.m24459t(r14)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r11.m24443g(r13)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0b23
        L_0x005d:
            com.google.android.gms.internal.ads.p74 r1 = r11.f20999z     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.gt0 r1 = r1.mo13149b()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r11.m24447j(r1, r14)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0b23
        L_0x0068:
            java.lang.Object r1 = r1.obj     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.gi4 r1 = (com.google.android.gms.internal.ads.gi4) r1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.x64 r2 = r11.f20962D     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r2.mo15056a(r14)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.p74 r2 = r11.f20999z     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.gt0 r1 = r2.mo13159n(r1)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r11.m24447j(r1, r13)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0b23
        L_0x007c:
            int r2 = r1.arg1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r3 = r1.arg2     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            java.lang.Object r1 = r1.obj     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.gi4 r1 = (com.google.android.gms.internal.ads.gi4) r1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.x64 r4 = r11.f20962D     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r4.mo15056a(r14)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.p74 r4 = r11.f20999z     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.gt0 r1 = r4.mo13157l(r2, r3, r1)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r11.m24447j(r1, r13)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0b23
        L_0x0094:
            java.lang.Object r1 = r1.obj     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.u64 r1 = (com.google.android.gms.internal.ads.u64) r1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.x64 r2 = r11.f20962D     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r2.mo15056a(r14)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.p74 r2 = r11.f20999z     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r1 = r1.f18417a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.gt0 r1 = r2.mo13156k(r13, r13, r13, r15)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r11.m24447j(r1, r13)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0b23
        L_0x00aa:
            java.lang.Object r2 = r1.obj     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.t64 r2 = (com.google.android.gms.internal.ads.t64) r2     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r1 = r1.arg1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.x64 r3 = r11.f20962D     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r3.mo15056a(r14)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.p74 r3 = r11.f20999z     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r1 != r10) goto L_0x00bd
            int r1 = r3.mo13148a()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x00bd:
            java.util.List r4 = r2.f17864a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.gi4 r2 = r2.f17867d     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.gt0 r1 = r3.mo13155j(r1, r4, r2)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r11.m24447j(r1, r13)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0b23
        L_0x00ce:
            java.lang.Object r1 = r1.obj     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.t64 r1 = (com.google.android.gms.internal.ads.t64) r1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.x64 r2 = r11.f20962D     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r2.mo15056a(r14)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r2 = r1.f17865b     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r2 == r10) goto L_0x00f9
            com.google.android.gms.internal.ads.y64 r2 = new com.google.android.gms.internal.ads.y64     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.u74 r3 = new com.google.android.gms.internal.ads.u74     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            java.util.List r4 = r1.f17864a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.gi4 r5 = r1.f17867d     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r3.<init>(r4, r5, r15)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r4 = r1.f17865b     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r5 = r1.f17866c     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r2.<init>(r3, r4, r5)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r11.f20974P = r2     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x00f9:
            com.google.android.gms.internal.ads.p74 r2 = r11.f20999z     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            java.util.List r3 = r1.f17864a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.gi4 r1 = r1.f17867d     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.gt0 r1 = r2.mo13158m(r3, r1)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r11.m24447j(r1, r13)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0b23
        L_0x010c:
            java.lang.Object r1 = r1.obj     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.fe0 r1 = (com.google.android.gms.internal.ads.fe0) r1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r11.m24449k(r1, r13)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0b23
        L_0x0115:
            java.lang.Object r1 = r1.obj     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.t74 r1 = (com.google.android.gms.internal.ads.t74) r1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            android.os.Looper r2 = r1.mo14215b()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            java.lang.Thread r3 = r2.getThread()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r3 = r3.isAlive()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r3 != 0) goto L_0x0133
            java.lang.String r2 = "TAG"
            java.lang.String r3 = "Trying to send message on a dead thread."
            com.google.android.gms.internal.ads.ot1.m18060e(r2, r3)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r1.mo14221h(r13)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0b23
        L_0x0133:
            com.google.android.gms.internal.ads.wa1 r3 = r11.f20997x     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.fk1 r2 = r3.mo14878a(r2, r15)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.q64 r3 = new com.google.android.gms.internal.ads.q64     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r3.<init>(r11, r1)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r2.mo9039r(r3)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0b23
        L_0x0143:
            java.lang.Object r1 = r1.obj     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.t74 r1 = (com.google.android.gms.internal.ads.t74) r1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r11.m24460u(r1)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0b23
        L_0x014c:
            int r2 = r1.arg1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r2 == 0) goto L_0x0152
            r2 = 1
            goto L_0x0153
        L_0x0152:
            r2 = 0
        L_0x0153:
            java.lang.Object r1 = r1.obj     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r3 = r11.f20970L     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r3 == r2) goto L_0x017b
            r11.f20970L = r2     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r2 != 0) goto L_0x017b
            com.google.android.gms.internal.ads.x74[] r2 = r11.f20978a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r3 = r2.length     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r3 = 0
        L_0x0163:
            if (r3 >= r8) goto L_0x017b
            r4 = r2[r3]     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r5 = m24423G(r4)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r5 != 0) goto L_0x0178
            java.util.Set r5 = r11.f20980b     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r5 = r5.remove(r4)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r5 == 0) goto L_0x0178
            r4.mo13076h0()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x0178:
            int r3 = r3 + 1
            goto L_0x0163
        L_0x017b:
            if (r1 == 0) goto L_0x0b23
            monitor-enter(r53)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r1.set(r14)     // Catch:{ all -> 0x0187 }
            r53.notifyAll()     // Catch:{ all -> 0x0187 }
            monitor-exit(r53)     // Catch:{ all -> 0x0187 }
            goto L_0x0b23
        L_0x0187:
            r0 = move-exception
            r1 = r0
            monitor-exit(r53)     // Catch:{ all -> 0x0187 }
            throw r1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x018b:
            int r1 = r1.arg1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r1 == 0) goto L_0x0191
            r1 = 1
            goto L_0x0192
        L_0x0191:
            r1 = 0
        L_0x0192:
            r11.f20969K = r1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.i74 r2 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.q74 r3 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.gt0 r3 = r3.f16234a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r1 = r2.mo11048t(r3, r1)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r1 != 0) goto L_0x01a3
            r11.m24459t(r14)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x01a3:
            r11.m24443g(r13)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0b23
        L_0x01a8:
            int r1 = r1.arg1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r11.f20968J = r1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.i74 r2 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.q74 r3 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.gt0 r3 = r3.f16234a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r1 = r2.mo11047s(r3, r1)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r1 != 0) goto L_0x01bb
            r11.m24459t(r14)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x01bb:
            r11.m24443g(r13)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0b23
        L_0x01c0:
            com.google.android.gms.internal.ads.r44 r1 = r11.f20995v     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.fe0 r1 = r1.mo9148e()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            float r1 = r1.f9260a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.i74 r2 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.f74 r2 = r2.mo11035g()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.i74 r3 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.f74 r3 = r3.mo11036h()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r4 = 1
        L_0x01d5:
            if (r2 == 0) goto L_0x0b23
            boolean r5 = r2.f9162d     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r5 == 0) goto L_0x0b23
            com.google.android.gms.internal.ads.q74 r5 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.gt0 r5 = r5.f16234a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.fk4 r5 = r2.mo10094j(r1, r5)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.fk4 r6 = r2.mo10093i()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r6 == 0) goto L_0x020c
            com.google.android.gms.internal.ads.xj4[] r9 = r6.f9313c     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r9 = r9.length     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.xj4[] r10 = r5.f9313c     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r10 = r10.length     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r9 == r10) goto L_0x01f2
            goto L_0x020c
        L_0x01f2:
            r9 = 0
        L_0x01f3:
            com.google.android.gms.internal.ads.xj4[] r10 = r5.f9313c     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r10 = r10.length     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r9 >= r10) goto L_0x0201
            boolean r10 = r5.mo10169a(r6, r9)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r10 == 0) goto L_0x020c
            int r9 = r9 + 1
            goto L_0x01f3
        L_0x0201:
            if (r2 != r3) goto L_0x0205
            r5 = 0
            goto L_0x0206
        L_0x0205:
            r5 = 1
        L_0x0206:
            r4 = r4 & r5
            com.google.android.gms.internal.ads.f74 r2 = r2.mo10091g()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x01d5
        L_0x020c:
            if (r4 == 0) goto L_0x0299
            com.google.android.gms.internal.ads.i74 r1 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.f74 r10 = r1.mo11035g()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.i74 r1 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r19 = r1.mo11044p(r10)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.x74[] r1 = r11.f20978a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r1 = r1.length     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean[] r9 = new boolean[r8]     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.q74 r1 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r1 = r1.f16251r     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r15 = r10
            r16 = r5
            r17 = r1
            r20 = r9
            long r5 = r15.mo10086b(r16, r17, r19, r20)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.q74 r1 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r2 = r1.f16238e     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r2 == r7) goto L_0x023c
            long r1 = r1.f16251r     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x023c
            r15 = 1
            goto L_0x023d
        L_0x023c:
            r15 = 0
        L_0x023d:
            com.google.android.gms.internal.ads.q74 r1 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.mg4 r2 = r1.f16235b     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r3 = r1.f16236c     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r7 = r1.f16237d     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r18 = 5
            r1 = r53
            r19 = r3
            r3 = r5
            r12 = r5
            r5 = r19
            r14 = 2
            r17 = r9
            r9 = r15
            r22 = r10
            r10 = r18
            com.google.android.gms.internal.ads.q74 r1 = r1.m24450k0(r2, r3, r5, r7, r9, r10)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r11.f20961C = r1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r15 == 0) goto L_0x0262
            r11.m24456q(r12)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x0262:
            com.google.android.gms.internal.ads.x74[] r1 = r11.f20978a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r1 = r1.length     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean[] r1 = new boolean[r14]     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r2 = 0
        L_0x0268:
            com.google.android.gms.internal.ads.x74[] r3 = r11.f20978a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r4 = r3.length     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r2 >= r14) goto L_0x0295
            r3 = r3[r2]     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r4 = m24423G(r3)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r1[r2] = r4     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r5 = r22
            com.google.android.gms.internal.ads.ci4[] r6 = r5.f9161c     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r6 = r6[r2]     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r4 == 0) goto L_0x0290
            com.google.android.gms.internal.ads.ci4 r4 = r3.mo13071c0()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r6 == r4) goto L_0x0287
            r11.m24435c(r3)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0290
        L_0x0287:
            boolean r4 = r17[r2]     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r4 == 0) goto L_0x0290
            long r6 = r11.f20975Q     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r3.mo13070b(r6)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x0290:
            int r2 = r2 + 1
            r22 = r5
            goto L_0x0268
        L_0x0295:
            r11.m24439e(r1)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x02b6
        L_0x0299:
            r14 = 2
            com.google.android.gms.internal.ads.i74 r1 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r1.mo11044p(r2)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r1 = r2.f9162d     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r1 == 0) goto L_0x02b6
            com.google.android.gms.internal.ads.g74 r1 = r2.f9164f     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r3 = r1.f9757b     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r6 = r11.f20975Q     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r8 = r2.mo10089e()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r6 = r6 - r8
            long r3 = java.lang.Math.max(r3, r6)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r1 = 0
            r2.mo10085a(r5, r3, r1)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x02b6:
            r1 = 1
            r11.m24443g(r1)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.q74 r1 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r1 = r1.f16238e     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r12 = 4
            if (r1 == r12) goto L_0x0b23
            r53.m24452m()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r53.m24419C()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.fk1 r1 = r11.f20989h     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r1.mo9035i0(r14)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0b23
        L_0x02ce:
            java.lang.Object r1 = r1.obj     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.kg4 r1 = (com.google.android.gms.internal.ads.kg4) r1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.i74 r2 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r1 = r2.mo11043o(r1)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r1 == 0) goto L_0x0b23
            com.google.android.gms.internal.ads.i74 r1 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r2 = r11.f20975Q     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r1.mo11042n(r2)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r53.m24452m()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0b23
        L_0x02e6:
            java.lang.Object r1 = r1.obj     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.kg4 r1 = (com.google.android.gms.internal.ads.kg4) r1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.i74 r2 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r1 = r2.mo11043o(r1)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r1 == 0) goto L_0x0b23
            com.google.android.gms.internal.ads.i74 r1 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.f74 r1 = r1.mo11034f()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.r44 r2 = r11.f20995v     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.fe0 r2 = r2.mo9148e()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            float r2 = r2.f9260a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.q74 r3 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.gt0 r3 = r3.f16234a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r1.mo10096l(r2, r3)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.ki4 r2 = r1.mo10092h()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.fk4 r3 = r1.mo10093i()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r11.m24418B(r2, r3)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.i74 r2 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.f74 r2 = r2.mo11035g()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r1 != r2) goto L_0x033a
            com.google.android.gms.internal.ads.g74 r2 = r1.f9164f     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r2 = r2.f9757b     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r11.m24456q(r2)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r53.m24437d()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.q74 r2 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.mg4 r3 = r2.f16235b     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.g74 r1 = r1.f9164f     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r7 = r1.f9757b     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r5 = r2.f16236c     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r9 = 0
            r10 = 5
            r1 = r53
            r2 = r3
            r3 = r7
            com.google.android.gms.internal.ads.q74 r1 = r1.m24450k0(r2, r3, r5, r7, r9, r10)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r11.f20961C = r1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x033a:
            r53.m24452m()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0b23
        L_0x033f:
            r1 = 0
            r2 = 1
            r11.m24454o(r2, r1, r2, r1)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.d74 r1 = r11.f20987f     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r1.mo9450e()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r11.m24462w(r2)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            android.os.HandlerThread r1 = r11.f20990i     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r1.quit()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            monitor-enter(r53)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r11.f20963E = r2     // Catch:{ all -> 0x0359 }
            r53.notifyAll()     // Catch:{ all -> 0x0359 }
            monitor-exit(r53)     // Catch:{ all -> 0x0359 }
            return r2
        L_0x0359:
            r0 = move-exception
            r1 = r0
            monitor-exit(r53)     // Catch:{ all -> 0x0359 }
            throw r1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x035d:
            r1 = 0
            r2 = 1
            r11.m24464y(r1, r2)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0b23
        L_0x0364:
            java.lang.Object r1 = r1.obj     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.a84 r1 = (com.google.android.gms.internal.ads.a84) r1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r11.f20960B = r1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0b23
        L_0x036c:
            java.lang.Object r1 = r1.obj     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.fe0 r1 = (com.google.android.gms.internal.ads.fe0) r1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.r44 r2 = r11.f20995v     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r2.mo9147c(r1)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.r44 r1 = r11.f20995v     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.fe0 r1 = r1.mo9148e()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r2 = 1
            r11.m24449k(r1, r2)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0b23
        L_0x0381:
            r12 = 4
            r14 = 2
            java.lang.Object r1 = r1.obj     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.y64 r1 = (com.google.android.gms.internal.ads.y64) r1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.x64 r2 = r11.f20962D     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r3 = 1
            r2.mo15056a(r3)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.q74 r2 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.gt0 r2 = r2.f16234a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r23 = 1
            int r3 = r11.f20968J     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r4 = r11.f20969K     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.fs0 r7 = r11.f20992s     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.dq0 r8 = r11.f20993t     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r21 = r2
            r22 = r1
            r24 = r3
            r25 = r4
            r26 = r7
            r27 = r8
            android.util.Pair r2 = m24448j0(r21, r22, r23, r24, r25, r26, r27)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r2 != 0) goto L_0x03d0
            com.google.android.gms.internal.ads.q74 r7 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.gt0 r7 = r7.f16234a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            android.util.Pair r7 = r11.m24446i0(r7)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            java.lang.Object r8 = r7.first     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.mg4 r8 = (com.google.android.gms.internal.ads.mg4) r8     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            java.lang.Object r7 = r7.second     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r17 = r7.longValue()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.q74 r7 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.gt0 r7 = r7.f16234a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r7 = r7.mo10643o()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r10 = 1
            r7 = r7 ^ r10
            r13 = r5
            r9 = r7
            r3 = r17
            goto L_0x0423
        L_0x03d0:
            java.lang.Object r7 = r2.first     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            java.lang.Object r8 = r2.second     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r9 = r8.longValue()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r13 = r1.f20500c     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r8 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x03e2
            r13 = r5
            goto L_0x03e3
        L_0x03e2:
            r13 = r9
        L_0x03e3:
            com.google.android.gms.internal.ads.i74 r8 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.q74 r15 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.gt0 r15 = r15.f16234a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.mg4 r7 = r8.mo11039k(r15, r7, r9)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r8 = r7.mo11883b()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r8 == 0) goto L_0x0414
            com.google.android.gms.internal.ads.q74 r5 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.gt0 r5 = r5.f16234a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            java.lang.Object r6 = r7.f12629a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.dq0 r8 = r11.f20993t     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r5.mo10608n(r6, r8)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.dq0 r5 = r11.f20993t     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r6 = r7.f12630b     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r5 = r5.mo9654e(r6)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r6 = r7.f12631c     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r5 != r6) goto L_0x040f
            com.google.android.gms.internal.ads.dq0 r5 = r11.f20993t     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r5.mo9660i()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x040f:
            r8 = r7
            r3 = 0
            r9 = 1
            goto L_0x0423
        L_0x0414:
            long r3 = r1.f20500c     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x041c
            r3 = 1
            goto L_0x041d
        L_0x041c:
            r3 = 0
        L_0x041d:
            r8 = r7
            r51 = r9
            r9 = r3
            r3 = r51
        L_0x0423:
            com.google.android.gms.internal.ads.q74 r5 = r11.f20961C     // Catch:{ all -> 0x04df }
            com.google.android.gms.internal.ads.gt0 r5 = r5.f16234a     // Catch:{ all -> 0x04df }
            boolean r5 = r5.mo10643o()     // Catch:{ all -> 0x04df }
            if (r5 == 0) goto L_0x0436
            r11.f20974P = r1     // Catch:{ all -> 0x0430 }
            goto L_0x0446
        L_0x0430:
            r0 = move-exception
            r1 = r0
            r18 = r13
            goto L_0x04e3
        L_0x0436:
            if (r2 != 0) goto L_0x044b
            com.google.android.gms.internal.ads.q74 r1 = r11.f20961C     // Catch:{ all -> 0x0430 }
            int r1 = r1.f16238e     // Catch:{ all -> 0x0430 }
            r2 = 1
            if (r1 == r2) goto L_0x0442
            r11.m24462w(r12)     // Catch:{ all -> 0x0430 }
        L_0x0442:
            r1 = 0
            r11.m24454o(r1, r2, r1, r2)     // Catch:{ all -> 0x0430 }
        L_0x0446:
            r18 = r13
            r12 = r3
            goto L_0x04c7
        L_0x044b:
            com.google.android.gms.internal.ads.q74 r1 = r11.f20961C     // Catch:{ all -> 0x04df }
            com.google.android.gms.internal.ads.mg4 r1 = r1.f16235b     // Catch:{ all -> 0x04df }
            boolean r1 = r8.equals(r1)     // Catch:{ all -> 0x04df }
            if (r1 == 0) goto L_0x049f
            com.google.android.gms.internal.ads.i74 r1 = r11.f20998y     // Catch:{ all -> 0x04df }
            com.google.android.gms.internal.ads.f74 r1 = r1.mo11035g()     // Catch:{ all -> 0x04df }
            if (r1 == 0) goto L_0x0470
            boolean r2 = r1.f9162d     // Catch:{ all -> 0x0430 }
            if (r2 == 0) goto L_0x0470
            r5 = 0
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0470
            com.google.android.gms.internal.ads.kg4 r1 = r1.f9159a     // Catch:{ all -> 0x0430 }
            com.google.android.gms.internal.ads.a84 r2 = r11.f20960B     // Catch:{ all -> 0x0430 }
            long r1 = r1.mo8356f(r3, r2)     // Catch:{ all -> 0x0430 }
            goto L_0x0471
        L_0x0470:
            r1 = r3
        L_0x0471:
            long r5 = com.google.android.gms.internal.ads.gb2.m13176j0(r1)     // Catch:{ all -> 0x04df }
            com.google.android.gms.internal.ads.q74 r7 = r11.f20961C     // Catch:{ all -> 0x04df }
            r18 = r13
            long r12 = r7.f16251r     // Catch:{ all -> 0x04dd }
            long r12 = com.google.android.gms.internal.ads.gb2.m13176j0(r12)     // Catch:{ all -> 0x04dd }
            int r7 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r7 != 0) goto L_0x04a2
            com.google.android.gms.internal.ads.q74 r5 = r11.f20961C     // Catch:{ all -> 0x04dd }
            int r6 = r5.f16238e     // Catch:{ all -> 0x04dd }
            r7 = 2
            if (r6 == r7) goto L_0x048d
            r12 = 3
            if (r6 != r12) goto L_0x04a2
        L_0x048d:
            long r12 = r5.f16251r     // Catch:{ all -> 0x04dd }
            r10 = 2
            r1 = r53
            r2 = r8
            r3 = r12
            r5 = r18
            r7 = r12
            com.google.android.gms.internal.ads.q74 r1 = r1.m24450k0(r2, r3, r5, r7, r9, r10)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x049b:
            r11.f20961C = r1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0b23
        L_0x049f:
            r18 = r13
            r1 = r3
        L_0x04a2:
            com.google.android.gms.internal.ads.q74 r5 = r11.f20961C     // Catch:{ all -> 0x04dd }
            int r5 = r5.f16238e     // Catch:{ all -> 0x04dd }
            r6 = 4
            if (r5 != r6) goto L_0x04ab
            r5 = 1
            goto L_0x04ac
        L_0x04ab:
            r5 = 0
        L_0x04ac:
            long r12 = r11.m24444g0(r8, r1, r5)     // Catch:{ all -> 0x04dd }
            int r1 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x04b6
            r1 = 1
            goto L_0x04b7
        L_0x04b6:
            r1 = 0
        L_0x04b7:
            r9 = r9 | r1
            com.google.android.gms.internal.ads.q74 r1 = r11.f20961C     // Catch:{ all -> 0x04d4 }
            com.google.android.gms.internal.ads.gt0 r4 = r1.f16234a     // Catch:{ all -> 0x04d4 }
            com.google.android.gms.internal.ads.mg4 r5 = r1.f16235b     // Catch:{ all -> 0x04d4 }
            r1 = r53
            r2 = r4
            r3 = r8
            r6 = r18
            r1.m24420D(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x04d4 }
        L_0x04c7:
            r10 = 2
            r1 = r53
            r2 = r8
            r3 = r12
            r5 = r18
            r7 = r12
            com.google.android.gms.internal.ads.q74 r1 = r1.m24450k0(r2, r3, r5, r7, r9, r10)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x049b
        L_0x04d4:
            r0 = move-exception
            r1 = r0
            r51 = r12
            r12 = r1
            r13 = r9
            r9 = r51
            goto L_0x04e6
        L_0x04dd:
            r0 = move-exception
            goto L_0x04e2
        L_0x04df:
            r0 = move-exception
            r18 = r13
        L_0x04e2:
            r1 = r0
        L_0x04e3:
            r12 = r1
            r13 = r9
            r9 = r3
        L_0x04e6:
            r14 = 2
            r1 = r53
            r2 = r8
            r3 = r9
            r5 = r18
            r7 = r9
            r9 = r13
            r10 = r14
            com.google.android.gms.internal.ads.q74 r1 = r1.m24450k0(r2, r3, r5, r7, r9, r10)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r11.f20961C = r1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            throw r12     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x04f7:
            r12 = 3
            long r13 = android.os.SystemClock.uptimeMillis()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.fk1 r1 = r11.f20989h     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r2 = 2
            r1.mo9036n(r2)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.q74 r1 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.gt0 r1 = r1.f16234a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r1 = r1.mo10643o()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r1 != 0) goto L_0x07ad
            com.google.android.gms.internal.ads.p74 r1 = r11.f20999z     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r1 = r1.mo13154i()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r1 != 0) goto L_0x0516
            goto L_0x07ad
        L_0x0516:
            com.google.android.gms.internal.ads.i74 r1 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r2 = r11.f20975Q     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r1.mo11042n(r2)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.i74 r1 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r1 = r1.mo11045q()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r1 == 0) goto L_0x0569
            com.google.android.gms.internal.ads.i74 r1 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r2 = r11.f20975Q     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.q74 r4 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.g74 r1 = r1.mo11037i(r2, r4)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r1 == 0) goto L_0x0569
            com.google.android.gms.internal.ads.i74 r2 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.y74[] r3 = r11.f20982c     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.dk4 r4 = r11.f20984d     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.d74 r7 = r11.f20987f     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.nk4 r25 = r7.mo9445V()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.p74 r7 = r11.f20999z     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.fk4 r8 = r11.f20986e     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r22 = r2
            r23 = r3
            r24 = r4
            r26 = r7
            r27 = r1
            r28 = r8
            com.google.android.gms.internal.ads.f74 r2 = r22.mo11049u(r23, r24, r25, r26, r27, r28)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.kg4 r3 = r2.f9159a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r7 = r1.f9757b     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r3.mo8363o(r11, r7)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.i74 r3 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.f74 r3 = r3.mo11035g()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r3 != r2) goto L_0x0565
            long r1 = r1.f9757b     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r11.m24456q(r1)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x0565:
            r1 = 0
            r11.m24443g(r1)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x0569:
            boolean r1 = r11.f20967I     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r1 == 0) goto L_0x0577
            boolean r1 = r53.m24422F()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r11.f20967I = r1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r53.m24417A()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x057a
        L_0x0577:
            r53.m24452m()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x057a:
            com.google.android.gms.internal.ads.i74 r1 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.f74 r1 = r1.mo11036h()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r1 != 0) goto L_0x0587
        L_0x0582:
            r22 = r13
            r12 = r5
            goto L_0x06b3
        L_0x0587:
            com.google.android.gms.internal.ads.f74 r2 = r1.mo10091g()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r2 == 0) goto L_0x066f
            boolean r2 = r11.f20965G     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r2 == 0) goto L_0x0593
            goto L_0x066f
        L_0x0593:
            com.google.android.gms.internal.ads.i74 r2 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.f74 r2 = r2.mo11036h()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r3 = r2.f9162d     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r3 == 0) goto L_0x0582
            r3 = 0
        L_0x059e:
            com.google.android.gms.internal.ads.x74[] r4 = r11.f20978a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r7 = r4.length     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r7 = 2
            if (r3 >= r7) goto L_0x05c3
            r4 = r4[r3]     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.ci4[] r7 = r2.f9161c     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r7 = r7[r3]     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.ci4 r8 = r4.mo13071c0()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r8 != r7) goto L_0x0582
            if (r7 == 0) goto L_0x05c0
            boolean r4 = r4.mo13081o()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r4 != 0) goto L_0x05c0
            r2.mo10091g()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.g74 r1 = r2.f9164f     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r1 = r1.f9761f     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0582
        L_0x05c0:
            int r3 = r3 + 1
            goto L_0x059e
        L_0x05c3:
            com.google.android.gms.internal.ads.f74 r2 = r1.mo10091g()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r2 = r2.f9162d     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r2 != 0) goto L_0x05d9
            long r2 = r11.f20975Q     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.f74 r4 = r1.mo10091g()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r7 = r4.mo10090f()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 < 0) goto L_0x0582
        L_0x05d9:
            com.google.android.gms.internal.ads.fk4 r8 = r1.mo10093i()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.i74 r2 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.f74 r9 = r2.mo11033e()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.fk4 r7 = r9.mo10093i()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.q74 r2 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.gt0 r4 = r2.f16234a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.g74 r2 = r9.f9164f     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.mg4 r3 = r2.f9756a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.g74 r1 = r1.f9164f     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.mg4 r2 = r1.f9756a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = r53
            r20 = r2
            r2 = r4
            r22 = r13
            r12 = r5
            r5 = r20
            r14 = r7
            r6 = r18
            r1.m24420D(r2, r3, r4, r5, r6)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r1 = r9.f9162d     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r1 == 0) goto L_0x062f
            com.google.android.gms.internal.ads.kg4 r1 = r9.f9159a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r1 = r1.mo8351b()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x062f
            long r1 = r9.mo10090f()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.x74[] r3 = r11.f20978a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r4 = r3.length     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r4 = 0
        L_0x061e:
            r5 = 2
            if (r4 >= r5) goto L_0x06b3
            r5 = r3[r4]     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.ci4 r6 = r5.mo13071c0()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r6 == 0) goto L_0x062c
            m24431O(r5, r1)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x062c:
            int r4 = r4 + 1
            goto L_0x061e
        L_0x062f:
            r1 = 0
        L_0x0630:
            com.google.android.gms.internal.ads.x74[] r2 = r11.f20978a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r2 = r2.length     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r2 = 2
            if (r1 >= r2) goto L_0x06b3
            boolean r2 = r8.mo10170b(r1)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r3 = r14.mo10170b(r1)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r2 == 0) goto L_0x066c
            com.google.android.gms.internal.ads.x74[] r2 = r11.f20978a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r2 = r2[r1]     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r2 = r2.mo13087w()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r2 != 0) goto L_0x066c
            com.google.android.gms.internal.ads.y74[] r2 = r11.f20982c     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r2 = r2[r1]     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r2.mo13072d()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.z74[] r2 = r8.f9312b     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r2 = r2[r1]     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.z74[] r4 = r14.f9312b     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r4 = r4[r1]     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r3 == 0) goto L_0x0661
            boolean r2 = r4.equals(r2)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r2 != 0) goto L_0x066c
        L_0x0661:
            com.google.android.gms.internal.ads.x74[] r2 = r11.f20978a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r2 = r2[r1]     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r3 = r9.mo10090f()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            m24431O(r2, r3)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x066c:
            int r1 = r1 + 1
            goto L_0x0630
        L_0x066f:
            r22 = r13
            r12 = r5
            com.google.android.gms.internal.ads.g74 r2 = r1.f9164f     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r2 = r2.f9764i     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r2 != 0) goto L_0x067c
            boolean r2 = r11.f20965G     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r2 == 0) goto L_0x06b3
        L_0x067c:
            r2 = 0
        L_0x067d:
            com.google.android.gms.internal.ads.x74[] r3 = r11.f20978a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r4 = r3.length     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r4 = 2
            if (r2 >= r4) goto L_0x06b3
            r3 = r3[r2]     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.ci4[] r4 = r1.f9161c     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r4 = r4[r2]     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r4 == 0) goto L_0x06b0
            com.google.android.gms.internal.ads.ci4 r5 = r3.mo13071c0()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r5 != r4) goto L_0x06b0
            boolean r4 = r3.mo13081o()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r4 == 0) goto L_0x06b0
            com.google.android.gms.internal.ads.g74 r4 = r1.f9164f     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r4 = r4.f9760e     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x06ac
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x06ac
            long r6 = r1.mo10089e()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r5 = r6 + r4
            goto L_0x06ad
        L_0x06ac:
            r5 = r12
        L_0x06ad:
            m24431O(r3, r5)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x06b0:
            int r2 = r2 + 1
            goto L_0x067d
        L_0x06b3:
            com.google.android.gms.internal.ads.i74 r1 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.f74 r1 = r1.mo11036h()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r1 == 0) goto L_0x0726
            com.google.android.gms.internal.ads.i74 r2 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.f74 r2 = r2.mo11035g()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r2 == r1) goto L_0x0726
            boolean r1 = r1.f9165g     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r1 == 0) goto L_0x06c8
            goto L_0x0726
        L_0x06c8:
            com.google.android.gms.internal.ads.i74 r1 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.f74 r1 = r1.mo11036h()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.fk4 r2 = r1.mo10093i()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r3 = 0
            r4 = 0
        L_0x06d4:
            com.google.android.gms.internal.ads.x74[] r5 = r11.f20978a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r6 = r5.length     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r6 = 2
            if (r3 >= r6) goto L_0x0721
            r5 = r5[r3]     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r6 = m24423G(r5)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r6 == 0) goto L_0x071e
            com.google.android.gms.internal.ads.ci4 r6 = r5.mo13071c0()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.ci4[] r7 = r1.f9161c     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r7 = r7[r3]     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r8 = r2.mo10170b(r3)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r8 == 0) goto L_0x06f3
            if (r6 != r7) goto L_0x06f3
            goto L_0x071e
        L_0x06f3:
            boolean r6 = r5.mo13087w()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r6 != 0) goto L_0x0713
            com.google.android.gms.internal.ads.xj4[] r6 = r2.f9313c     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r6 = r6[r3]     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.g4[] r25 = m24428L(r6)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.ci4[] r6 = r1.f9161c     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r26 = r6[r3]     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r27 = r1.mo10090f()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r29 = r1.mo10089e()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r24 = r5
            r24.mo13074g(r25, r26, r27, r29)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x071e
        L_0x0713:
            boolean r6 = r5.mo9159y()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r6 == 0) goto L_0x071d
            r11.m24435c(r5)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x071e
        L_0x071d:
            r4 = 1
        L_0x071e:
            int r3 = r3 + 1
            goto L_0x06d4
        L_0x0721:
            if (r4 != 0) goto L_0x0726
            r53.m24437d()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x0726:
            r1 = 0
        L_0x0727:
            boolean r2 = r53.m24426J()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r2 == 0) goto L_0x07ab
            boolean r2 = r11.f20965G     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r2 != 0) goto L_0x07ab
            com.google.android.gms.internal.ads.i74 r2 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.f74 r2 = r2.mo11035g()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r2 == 0) goto L_0x07ab
            com.google.android.gms.internal.ads.f74 r2 = r2.mo10091g()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r2 == 0) goto L_0x07ab
            long r3 = r11.f20975Q     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r5 = r2.mo10090f()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x07ab
            boolean r2 = r2.f9165g     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r2 == 0) goto L_0x07ab
            if (r1 == 0) goto L_0x0752
            r53.m24453n()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x0752:
            com.google.android.gms.internal.ads.i74 r1 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.f74 r1 = r1.mo11032d()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            java.util.Objects.requireNonNull(r1)
            com.google.android.gms.internal.ads.q74 r2 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.mg4 r2 = r2.f16235b     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            java.lang.Object r2 = r2.f12629a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.g74 r3 = r1.f9164f     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.mg4 r3 = r3.f9756a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            java.lang.Object r3 = r3.f12629a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r2 = r2.equals(r3)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r2 == 0) goto L_0x0785
            com.google.android.gms.internal.ads.q74 r2 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.mg4 r2 = r2.f16235b     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r3 = r2.f12630b     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r3 != r10) goto L_0x0785
            com.google.android.gms.internal.ads.g74 r3 = r1.f9164f     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.mg4 r3 = r3.f9756a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r4 = r3.f12630b     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r4 != r10) goto L_0x0785
            int r2 = r2.f12633e     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r3 = r3.f12633e     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r2 == r3) goto L_0x0785
            r2 = 1
            goto L_0x0786
        L_0x0785:
            r2 = 0
        L_0x0786:
            com.google.android.gms.internal.ads.g74 r1 = r1.f9164f     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.mg4 r3 = r1.f9756a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r7 = r1.f9757b     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r5 = r1.f9758c     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r1 = 1
            r9 = r2 ^ 1
            r14 = 0
            r1 = r53
            r2 = r3
            r3 = r7
            r15 = 3
            r19 = -1
            r10 = r14
            com.google.android.gms.internal.ads.q74 r1 = r1.m24450k0(r2, r3, r5, r7, r9, r10)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r11.f20961C = r1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r53.m24455p()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r53.m24419C()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r1 = 1
            r10 = -1
            r15 = 0
            goto L_0x0727
        L_0x07ab:
            r15 = 3
            goto L_0x07b1
        L_0x07ad:
            r22 = r13
            r15 = 3
            r12 = r5
        L_0x07b1:
            com.google.android.gms.internal.ads.q74 r1 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r1 = r1.f16238e     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r2 = 1
            if (r1 == r2) goto L_0x0b23
            r2 = 4
            if (r1 != r2) goto L_0x07bd
            goto L_0x0b23
        L_0x07bd:
            com.google.android.gms.internal.ads.i74 r1 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.f74 r1 = r1.mo11035g()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r2 = 10
            if (r1 != 0) goto L_0x07ce
            r4 = r22
            r11.m24458s(r4, r2)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0b23
        L_0x07ce:
            r4 = r22
            int r6 = com.google.android.gms.internal.ads.gb2.f9812a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            java.lang.String r6 = "doSomeWork"
            android.os.Trace.beginSection(r6)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r53.m24419C()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r6 = r1.f9162d     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r7 = 1000(0x3e8, double:4.94E-321)
            if (r6 == 0) goto L_0x0850
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r9 = r9 * r7
            com.google.android.gms.internal.ads.kg4 r6 = r1.f9159a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.q74 r14 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r2 = r14.f16251r     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r7 = r11.f20994u     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r2 = r2 - r7
            r7 = 0
            r6.mo8357g(r2, r7)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r2 = 1
            r3 = 1
            r6 = 0
        L_0x07f6:
            com.google.android.gms.internal.ads.x74[] r7 = r11.f20978a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r8 = r7.length     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r8 = 2
            if (r6 >= r8) goto L_0x0857
            r7 = r7[r6]     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r8 = m24423G(r7)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r8 != 0) goto L_0x0805
            goto L_0x0848
        L_0x0805:
            long r12 = r11.f20975Q     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r7.mo12632l(r12, r9)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r3 == 0) goto L_0x0814
            boolean r3 = r7.mo9159y()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r3 == 0) goto L_0x0814
            r3 = 1
            goto L_0x0815
        L_0x0814:
            r3 = 0
        L_0x0815:
            com.google.android.gms.internal.ads.ci4[] r8 = r1.f9161c     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r8 = r8[r6]     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.ci4 r12 = r7.mo13071c0()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r8 != r12) goto L_0x0827
            boolean r13 = r7.mo13081o()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r13 == 0) goto L_0x0827
            r13 = 1
            goto L_0x0828
        L_0x0827:
            r13 = 0
        L_0x0828:
            if (r8 != r12) goto L_0x083b
            if (r13 != 0) goto L_0x083b
            boolean r8 = r7.mo9152m()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r8 != 0) goto L_0x083b
            boolean r8 = r7.mo9159y()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r8 == 0) goto L_0x0839
            goto L_0x083b
        L_0x0839:
            r8 = 0
            goto L_0x083c
        L_0x083b:
            r8 = 1
        L_0x083c:
            if (r2 == 0) goto L_0x0842
            if (r8 == 0) goto L_0x0842
            r2 = 1
            goto L_0x0843
        L_0x0842:
            r2 = 0
        L_0x0843:
            if (r8 != 0) goto L_0x0848
            r7.mo13073e0()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x0848:
            int r6 = r6 + 1
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x07f6
        L_0x0850:
            com.google.android.gms.internal.ads.kg4 r2 = r1.f9159a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r2.mo8349X()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r2 = 1
            r3 = 1
        L_0x0857:
            com.google.android.gms.internal.ads.g74 r6 = r1.f9164f     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r6 = r6.f9760e     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r3 == 0) goto L_0x0890
            boolean r3 = r1.f9162d     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r3 == 0) goto L_0x0890
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x0872
            com.google.android.gms.internal.ads.q74 r3 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r8 = r3.f16251r     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 > 0) goto L_0x0890
        L_0x0872:
            boolean r3 = r11.f20965G     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r3 == 0) goto L_0x0881
            r3 = 0
            r11.f20965G = r3     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.q74 r6 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r6 = r6.f16246m     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r7 = 5
            r11.m24461v(r3, r6, r3, r7)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x0881:
            com.google.android.gms.internal.ads.g74 r3 = r1.f9164f     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r3 = r3.f9764i     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r3 == 0) goto L_0x0890
            r3 = 4
            r11.m24462w(r3)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r53.m24465z()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0966
        L_0x0890:
            com.google.android.gms.internal.ads.q74 r3 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r6 = r3.f16238e     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r7 = 2
            if (r6 != r7) goto L_0x0921
            int r6 = r11.f20973O     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r6 != 0) goto L_0x08a3
            boolean r3 = r53.m24424H()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r3 == 0) goto L_0x0921
            goto L_0x0911
        L_0x08a3:
            if (r2 != 0) goto L_0x08a7
            goto L_0x0921
        L_0x08a7:
            boolean r6 = r3.f16240g     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r6 == 0) goto L_0x0911
            com.google.android.gms.internal.ads.gt0 r3 = r3.f16234a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.i74 r6 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.f74 r6 = r6.mo11035g()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.g74 r6 = r6.f9164f     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.mg4 r6 = r6.f9756a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r3 = r11.m24427K(r3, r6)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r3 == 0) goto L_0x08c6
            com.google.android.gms.internal.ads.q14 r3 = r11.f20985d0     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r6 = r3.mo13454b()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r31 = r6
            goto L_0x08cb
        L_0x08c6:
            r31 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x08cb:
            com.google.android.gms.internal.ads.i74 r3 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.f74 r3 = r3.mo11034f()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r6 = r3.mo10102r()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r6 == 0) goto L_0x08df
            com.google.android.gms.internal.ads.g74 r6 = r3.f9164f     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r6 = r6.f9764i     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r6 == 0) goto L_0x08df
            r6 = 1
            goto L_0x08e0
        L_0x08df:
            r6 = 0
        L_0x08e0:
            com.google.android.gms.internal.ads.g74 r7 = r3.f9164f     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.mg4 r7 = r7.f9756a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r7 = r7.mo11883b()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r7 == 0) goto L_0x08f0
            boolean r3 = r3.f9162d     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r3 != 0) goto L_0x08f0
            r3 = 1
            goto L_0x08f1
        L_0x08f0:
            r3 = 0
        L_0x08f1:
            if (r6 != 0) goto L_0x0911
            if (r3 != 0) goto L_0x0911
            com.google.android.gms.internal.ads.d74 r3 = r11.f20987f     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r27 = r53.m24440e0()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.r44 r6 = r11.f20995v     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.fe0 r6 = r6.mo9148e()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            float r6 = r6.f9260a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r7 = r11.f20966H     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r26 = r3
            r29 = r6
            r30 = r7
            boolean r3 = r26.mo9446a(r27, r29, r30, r31)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r3 == 0) goto L_0x0921
        L_0x0911:
            r11.m24462w(r15)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r2 = 0
            r11.f20979a0 = r2     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r2 = r53.m24426J()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r2 == 0) goto L_0x0966
            r53.m24463x()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0966
        L_0x0921:
            com.google.android.gms.internal.ads.q74 r3 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r3 = r3.f16238e     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r3 != r15) goto L_0x0966
            int r3 = r11.f20973O     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r3 != 0) goto L_0x0932
            boolean r2 = r53.m24424H()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r2 != 0) goto L_0x0966
            goto L_0x0934
        L_0x0932:
            if (r2 != 0) goto L_0x0966
        L_0x0934:
            boolean r2 = r53.m24426J()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r11.f20966H = r2     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r2 = 2
            r11.m24462w(r2)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r2 = r11.f20966H     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r2 == 0) goto L_0x0963
            com.google.android.gms.internal.ads.i74 r2 = r11.f20998y     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.f74 r2 = r2.mo11035g()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x0948:
            if (r2 == 0) goto L_0x095e
            com.google.android.gms.internal.ads.fk4 r3 = r2.mo10093i()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.xj4[] r3 = r3.f9313c     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r6 = r3.length     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r7 = 0
        L_0x0952:
            if (r7 >= r6) goto L_0x0959
            r8 = r3[r7]     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r7 = r7 + 1
            goto L_0x0952
        L_0x0959:
            com.google.android.gms.internal.ads.f74 r2 = r2.mo10091g()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0948
        L_0x095e:
            com.google.android.gms.internal.ads.q14 r2 = r11.f20985d0     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r2.mo13455c()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x0963:
            r53.m24465z()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x0966:
            com.google.android.gms.internal.ads.q74 r2 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r2 = r2.f16238e     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r3 = 2
            if (r2 != r3) goto L_0x09d1
            r2 = 0
        L_0x096e:
            com.google.android.gms.internal.ads.x74[] r6 = r11.f20978a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r7 = r6.length     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r2 >= r3) goto L_0x0994
            r3 = r6[r2]     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r3 = m24423G(r3)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r3 == 0) goto L_0x0990
            com.google.android.gms.internal.ads.x74[] r3 = r11.f20978a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r3 = r3[r2]     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.ci4 r3 = r3.mo13071c0()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.ci4[] r6 = r1.f9161c     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r6 = r6[r2]     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r3 != r6) goto L_0x0990
            com.google.android.gms.internal.ads.x74[] r3 = r11.f20978a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r3 = r3[r2]     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r3.mo13073e0()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x0990:
            int r2 = r2 + 1
            r3 = 2
            goto L_0x096e
        L_0x0994:
            com.google.android.gms.internal.ads.q74 r1 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r2 = r1.f16240g     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r2 != 0) goto L_0x09d1
            long r1 = r1.f16250q     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r6 = 500000(0x7a120, double:2.47033E-318)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x09d1
            boolean r1 = r53.m24422F()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r1 == 0) goto L_0x09d1
            long r1 = r11.f20981b0     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x09bb
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r11.f20981b0 = r1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x09d8
        L_0x09bb:
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r6 = r11.f20981b0     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r1 = r1 - r6
            r6 = 4000(0xfa0, double:1.9763E-320)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x09c9
            goto L_0x09d8
        L_0x09c9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            java.lang.String r2 = "Playback stuck buffering and not loading"
            r1.<init>(r2)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            throw r1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x09d1:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11.f20981b0 = r1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x09d8:
            boolean r1 = r53.m24426J()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r1 == 0) goto L_0x09e6
            com.google.android.gms.internal.ads.q74 r1 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r1 = r1.f16238e     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r1 != r15) goto L_0x09e6
            r1 = 1
            goto L_0x09e7
        L_0x09e6:
            r1 = 0
        L_0x09e7:
            boolean r2 = r11.f20972N     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r2 == 0) goto L_0x09f3
            boolean r2 = r11.f20971M     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r2 == 0) goto L_0x09f3
            if (r1 == 0) goto L_0x09f3
            r2 = 1
            goto L_0x09f4
        L_0x09f3:
            r2 = 0
        L_0x09f4:
            com.google.android.gms.internal.ads.q74 r3 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r6 = r3.f16248o     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r6 == r2) goto L_0x0a50
            com.google.android.gms.internal.ads.q74 r6 = new com.google.android.gms.internal.ads.q74     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.gt0 r7 = r3.f16234a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.mg4 r8 = r3.f16235b     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r9 = r3.f16236c     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            long r12 = r3.f16237d     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r14 = r3.f16238e     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.u44 r15 = r3.f16239f     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r48 = r4
            boolean r4 = r3.f16240g     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.ki4 r5 = r3.f16241h     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r18 = r1
            com.google.android.gms.internal.ads.fk4 r1 = r3.f16242i     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r50 = r2
            java.util.List r2 = r3.f16243j     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r36 = r2
            com.google.android.gms.internal.ads.mg4 r2 = r3.f16244k     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r37 = r2
            boolean r2 = r3.f16245l     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r38 = r2
            int r2 = r3.f16246m     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r39 = r2
            com.google.android.gms.internal.ads.fe0 r2 = r3.f16247n     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r35 = r1
            r40 = r2
            long r1 = r3.f16249p     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r41 = r1
            long r1 = r3.f16250q     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r43 = r1
            long r1 = r3.f16251r     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r24 = r6
            r25 = r7
            r26 = r8
            r27 = r9
            r29 = r12
            r31 = r14
            r32 = r15
            r33 = r4
            r34 = r5
            r45 = r1
            r47 = r50
            r24.<init>(r25, r26, r27, r29, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r43, r45, r47)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r11.f20961C = r6     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0a56
        L_0x0a50:
            r18 = r1
            r50 = r2
            r48 = r4
        L_0x0a56:
            r1 = 0
            r11.f20971M = r1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r50 != 0) goto L_0x0b23
            com.google.android.gms.internal.ads.q74 r1 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            int r1 = r1.f16238e     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r2 = 4
            if (r1 == r2) goto L_0x0b23
            if (r18 != 0) goto L_0x0a77
            r2 = 2
            if (r1 != r2) goto L_0x0a68
            goto L_0x0a77
        L_0x0a68:
            r2 = 3
            if (r1 != r2) goto L_0x0a7e
            int r1 = r11.f20973O     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r1 == 0) goto L_0x0a7e
            r1 = r48
            r3 = 1000(0x3e8, double:4.94E-321)
            r11.m24458s(r1, r3)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0a7e
        L_0x0a77:
            r1 = r48
            r3 = 10
            r11.m24458s(r1, r3)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
        L_0x0a7e:
            android.os.Trace.endSection()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0b23
        L_0x0a83:
            int r2 = r1.arg1     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            if (r2 == 0) goto L_0x0a89
            r2 = 1
            goto L_0x0a8a
        L_0x0a89:
            r2 = 0
        L_0x0a8a:
            int r1 = r1.arg2     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r3 = 1
            r11.m24461v(r2, r1, r3, r3)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0b23
        L_0x0a92:
            r2 = 4
            com.google.android.gms.internal.ads.x64 r1 = r11.f20962D     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r3 = 1
            r1.mo15056a(r3)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r1 = 0
            r11.m24454o(r1, r1, r1, r3)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.d74 r1 = r11.f20987f     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r1.mo9449d()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.q74 r1 = r11.f20961C     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.gt0 r1 = r1.f16234a     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            boolean r1 = r1.mo10643o()     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r3 = 1
            if (r3 == r1) goto L_0x0aaf
            r7 = 2
            goto L_0x0ab0
        L_0x0aaf:
            r7 = 4
        L_0x0ab0:
            r11.m24462w(r7)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.p74 r1 = r11.f20999z     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.mk4 r2 = r11.f20988g     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r1.mo13151f(r2)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            com.google.android.gms.internal.ads.fk1 r1 = r11.f20989h     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            r2 = 2
            r1.mo9035i0(r2)     // Catch:{ u44 -> 0x0b25, jd4 -> 0x0b1c, ea0 -> 0x0b05, rm2 -> 0x0afd, nf4 -> 0x0af5, IOException -> 0x0aed, RuntimeException -> 0x0ac2 }
            goto L_0x0b23
        L_0x0ac2:
            r0 = move-exception
            r1 = r0
            boolean r2 = r1 instanceof java.lang.IllegalStateException
            r3 = 1004(0x3ec, float:1.407E-42)
            if (r2 != 0) goto L_0x0ad2
            boolean r2 = r1 instanceof java.lang.IllegalArgumentException
            if (r2 == 0) goto L_0x0acf
            goto L_0x0ad2
        L_0x0acf:
            r12 = 1000(0x3e8, float:1.401E-42)
            goto L_0x0ad4
        L_0x0ad2:
            r12 = 1004(0x3ec, float:1.407E-42)
        L_0x0ad4:
            com.google.android.gms.internal.ads.u44 r1 = com.google.android.gms.internal.ads.u44.m21411d(r1, r12)
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Playback error"
            com.google.android.gms.internal.ads.ot1.m18058c(r2, r3, r1)
            r2 = 0
            r3 = 1
            r11.m24464y(r3, r2)
            com.google.android.gms.internal.ads.q74 r2 = r11.f20961C
            com.google.android.gms.internal.ads.q74 r1 = r2.mo13490d(r1)
            r11.f20961C = r1
            goto L_0x0b23
        L_0x0aed:
            r0 = move-exception
            r1 = r0
            r2 = 2000(0x7d0, float:2.803E-42)
            r11.m24441f(r1, r2)
            goto L_0x0b23
        L_0x0af5:
            r0 = move-exception
            r1 = r0
            r2 = 1002(0x3ea, float:1.404E-42)
            r11.m24441f(r1, r2)
            goto L_0x0b23
        L_0x0afd:
            r0 = move-exception
            r1 = r0
            int r2 = r1.f17020a
            r11.m24441f(r1, r2)
            goto L_0x0b23
        L_0x0b05:
            r0 = move-exception
            r1 = r0
            int r2 = r1.f8715b
            r3 = 1
            if (r2 != r3) goto L_0x0b16
            boolean r2 = r1.f8714a
            if (r3 == r2) goto L_0x0b13
            r12 = 3003(0xbbb, float:4.208E-42)
            goto L_0x0b18
        L_0x0b13:
            r12 = 3001(0xbb9, float:4.205E-42)
            goto L_0x0b18
        L_0x0b16:
            r12 = 1000(0x3e8, float:1.401E-42)
        L_0x0b18:
            r11.m24441f(r1, r12)
            goto L_0x0b23
        L_0x0b1c:
            r0 = move-exception
            r1 = r0
            int r2 = r1.f11330a
            r11.m24441f(r1, r2)
        L_0x0b23:
            r3 = 1
            goto L_0x0b8b
        L_0x0b25:
            r0 = move-exception
            r1 = r0
            int r2 = r1.f18377d
            r3 = 1
            if (r2 != r3) goto L_0x0b3c
            com.google.android.gms.internal.ads.i74 r2 = r11.f20998y
            com.google.android.gms.internal.ads.f74 r2 = r2.mo11036h()
            if (r2 == 0) goto L_0x0b3c
            com.google.android.gms.internal.ads.g74 r2 = r2.f9164f
            com.google.android.gms.internal.ads.mg4 r2 = r2.f9756a
            com.google.android.gms.internal.ads.u44 r1 = r1.mo14451a(r2)
        L_0x0b3c:
            boolean r2 = r1.f18383r
            if (r2 == 0) goto L_0x0b59
            com.google.android.gms.internal.ads.u44 r2 = r11.f20979a0
            if (r2 != 0) goto L_0x0b59
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Recoverable renderer error"
            com.google.android.gms.internal.ads.ot1.m18061f(r2, r3, r1)
            r11.f20979a0 = r1
            com.google.android.gms.internal.ads.fk1 r2 = r11.f20989h
            r3 = 25
            com.google.android.gms.internal.ads.ej1 r1 = r2.mo9040s(r3, r1)
            r2.mo9038q(r1)
            goto L_0x0b23
        L_0x0b59:
            com.google.android.gms.internal.ads.u44 r2 = r11.f20979a0
            if (r2 == 0) goto L_0x0b77
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0b75 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            r5 = 0
            r4[r5] = r3     // Catch:{ Exception -> 0x0b75 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r6, r4)     // Catch:{ Exception -> 0x0b75 }
            r4 = 1
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0b75 }
            r6[r5] = r1     // Catch:{ Exception -> 0x0b75 }
            r3.invoke(r2, r6)     // Catch:{ Exception -> 0x0b75 }
        L_0x0b75:
            com.google.android.gms.internal.ads.u44 r1 = r11.f20979a0
        L_0x0b77:
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Playback error"
            com.google.android.gms.internal.ads.ot1.m18058c(r2, r3, r1)
            r2 = 0
            r3 = 1
            r11.m24464y(r3, r2)
            com.google.android.gms.internal.ads.q74 r2 = r11.f20961C
            com.google.android.gms.internal.ads.q74 r1 = r2.mo13490d(r1)
            r11.f20961C = r1
        L_0x0b8b:
            r53.m24453n()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.z64.handleMessage(android.os.Message):boolean");
    }

    /* renamed from: i */
    public final void mo8359i(kg4 kg4) {
        this.f20989h.mo9040s(8, kg4).zza();
    }
}
