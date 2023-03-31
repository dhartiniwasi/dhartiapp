package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.oi */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2699oi implements Handler.Callback, C2222bo, C2446hp, C2296do {

    /* renamed from: A */
    private boolean f15115A;

    /* renamed from: B */
    private boolean f15116B;

    /* renamed from: C */
    private int f15117C;

    /* renamed from: D */
    private int f15118D = 0;

    /* renamed from: E */
    private int f15119E;

    /* renamed from: F */
    private int f15120F;

    /* renamed from: G */
    private long f15121G;

    /* renamed from: H */
    private int f15122H;

    /* renamed from: I */
    private C2625mi f15123I;

    /* renamed from: J */
    private long f15124J;

    /* renamed from: K */
    private C2551ki f15125K;

    /* renamed from: L */
    private C2551ki f15126L;

    /* renamed from: M */
    private C2551ki f15127M;

    /* renamed from: N */
    private C2254cj f15128N;

    /* renamed from: O */
    private boolean f15129O;

    /* renamed from: P */
    private boolean f15130P;

    /* renamed from: Q */
    private int f15131Q;

    /* renamed from: R */
    private volatile int f15132R;

    /* renamed from: S */
    private volatile int f15133S;

    /* renamed from: a */
    private final C2996wi[] f15134a;

    /* renamed from: a0 */
    private final yp0 f15135a0;

    /* renamed from: b */
    private final C3033xi[] f15136b;

    /* renamed from: c */
    private final C2484ip f15137c;

    /* renamed from: d */
    private final C2745pq f15138d;

    /* renamed from: e */
    private final Handler f15139e;

    /* renamed from: f */
    private final HandlerThread f15140f;

    /* renamed from: g */
    private final Handler f15141g;

    /* renamed from: h */
    private final C2402gi f15142h;

    /* renamed from: i */
    private final C2217bj f15143i;

    /* renamed from: r */
    private final C2180aj f15144r;

    /* renamed from: s */
    private C2588li f15145s;

    /* renamed from: t */
    private C2959vi f15146t;

    /* renamed from: u */
    private C2996wi f15147u;

    /* renamed from: v */
    private C2485iq f15148v;

    /* renamed from: w */
    private C2333eo f15149w;

    /* renamed from: x */
    private C2996wi[] f15150x;

    /* renamed from: y */
    private boolean f15151y;

    /* renamed from: z */
    private boolean f15152z;

    public C2699oi(C2996wi[] wiVarArr, C2484ip ipVar, yp0 yp0, boolean z, int i, Handler handler, C2588li liVar, C2402gi giVar, byte[] bArr) {
        this.f15134a = wiVarArr;
        this.f15137c = ipVar;
        this.f15135a0 = yp0;
        this.f15152z = z;
        this.f15141g = handler;
        this.f15117C = 1;
        this.f15145s = liVar;
        this.f15142h = giVar;
        this.f15136b = new C3033xi[2];
        for (int i2 = 0; i2 < 2; i2++) {
            wiVarArr[i2].mo8385n0(i2);
            this.f15136b[i2] = wiVarArr[i2].mo8364T();
        }
        this.f15138d = new C2745pq();
        this.f15150x = new C2996wi[0];
        this.f15143i = new C2217bj();
        this.f15144r = new C2180aj();
        ipVar.mo11184c(this);
        this.f15146t = C2959vi.f19105d;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f15140f = handlerThread;
        handlerThread.start();
        this.f15139e = new Handler(handlerThread.getLooper(), this);
    }

    /* renamed from: K */
    private final int m17833K(int i, C2254cj cjVar, C2254cj cjVar2) {
        int b = cjVar.mo9182b();
        int i2 = -1;
        for (int i3 = 0; i3 < b && i2 == -1; i3++) {
            i = cjVar.mo9186f(i, this.f15144r, this.f15143i, this.f15118D);
            i2 = cjVar2.mo9181a(cjVar.mo9184d(i, this.f15144r, true).f6592b);
        }
        return i2;
    }

    /* renamed from: L */
    private final long m17834L(int i, long j) throws C2253ci {
        C2551ki kiVar;
        m17852p();
        this.f15115A = false;
        m17849m(2);
        C2551ki kiVar2 = this.f15127M;
        if (kiVar2 == null) {
            C2551ki kiVar3 = this.f15125K;
            if (kiVar3 != null) {
                kiVar3.mo11704c();
            }
            kiVar = null;
        } else {
            kiVar = null;
            while (kiVar2 != null) {
                if (kiVar2.f12091g != i || !kiVar2.f12094j) {
                    kiVar2.mo11704c();
                } else {
                    kiVar = kiVar2;
                }
                kiVar2 = kiVar2.f12096l;
            }
        }
        C2551ki kiVar4 = this.f15127M;
        if (!(kiVar4 == kiVar && kiVar4 == this.f15126L)) {
            for (C2996wi W : this.f15150x) {
                W.mo8367W();
            }
            this.f15150x = new C2996wi[0];
            this.f15148v = null;
            this.f15147u = null;
            this.f15127M = null;
        }
        if (kiVar != null) {
            kiVar.f12096l = null;
            this.f15125K = kiVar;
            this.f15126L = kiVar;
            m17848l(kiVar);
            C2551ki kiVar5 = this.f15127M;
            if (kiVar5.f12095k) {
                j = kiVar5.f12085a.mo9240i0(j);
            }
            m17845i(j);
            m17841e();
        } else {
            this.f15125K = null;
            this.f15126L = null;
            this.f15127M = null;
            m17845i(j);
        }
        this.f15139e.sendEmptyMessage(2);
        return j;
    }

    /* renamed from: M */
    private final Pair m17835M(int i, long j) {
        return m17836N(this.f15128N, 0, -9223372036854775807L);
    }

    /* renamed from: N */
    private final Pair m17836N(C2254cj cjVar, int i, long j) {
        return m17837O(cjVar, 0, j, 0);
    }

    /* renamed from: O */
    private final Pair m17837O(C2254cj cjVar, int i, long j, long j2) {
        C2335eq.m12241a(0, 0, cjVar.mo9183c());
        cjVar.mo9185e(0, this.f15143i, false, j2);
        if (j == -9223372036854775807L) {
            j = 0;
        }
        long j3 = cjVar.mo9184d(0, this.f15144r, false).f6593c;
        if (j3 != -9223372036854775807L) {
            int i2 = (j > j3 ? 1 : (j == j3 ? 0 : -1));
        }
        return Pair.create(0, Long.valueOf(j));
    }

    /* renamed from: P */
    private final Pair m17838P(C2625mi miVar) {
        C2254cj cjVar = miVar.f13341a;
        if (cjVar.mo9188h()) {
            cjVar = this.f15128N;
        }
        try {
            Pair N = m17836N(cjVar, 0, miVar.f13343c);
            C2254cj cjVar2 = this.f15128N;
            if (cjVar2 == cjVar) {
                return N;
            }
            if (cjVar2.mo9181a(cjVar.mo9184d(((Integer) N.first).intValue(), this.f15144r, true).f6592b) != -1) {
                return Pair.create(0, (Long) N.second);
            }
            if (m17833K(((Integer) N.first).intValue(), cjVar, this.f15128N) == -1) {
                return null;
            }
            this.f15128N.mo9184d(0, this.f15144r, false);
            return m17835M(0, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new C2848si(this.f15128N, 0, miVar.f13343c);
        }
    }

    /* renamed from: Q */
    private final void m17839Q(boolean[] zArr, int i) throws C2253ci {
        int i2;
        this.f15150x = new C2996wi[i];
        int i3 = 0;
        int i4 = 0;
        while (i3 < 2) {
            C2996wi wiVar = this.f15134a[i3];
            C3039xo a = this.f15127M.f12097m.f11731b.mo10596a(i3);
            if (a != null) {
                int i5 = i4 + 1;
                this.f15150x[i4] = wiVar;
                if (wiVar.mo8369d() == 0) {
                    C3070yi yiVar = this.f15127M.f12097m.f11733d[i3];
                    boolean z = this.f15152z && this.f15117C == 3;
                    boolean z2 = !zArr[i3] && z;
                    a.mo15197b();
                    C2774qi[] qiVarArr = new C2774qi[1];
                    for (int i6 = 0; i6 <= 0; i6++) {
                        qiVarArr[i6] = a.mo15198c(i6);
                    }
                    C2551ki kiVar = this.f15127M;
                    i2 = i3;
                    wiVar.mo8390q0(yiVar, qiVarArr, kiVar.f12088d[i3], this.f15124J, z2, kiVar.f12090f - kiVar.f12092h);
                    C2485iq V = wiVar.mo8366V();
                    if (V != null) {
                        if (this.f15148v == null) {
                            this.f15148v = V;
                            this.f15147u = wiVar;
                            V.mo9927B(this.f15146t);
                        } else {
                            throw C2253ci.m10946c(new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                    }
                    if (z) {
                        wiVar.mo8383m0();
                    }
                } else {
                    i2 = i3;
                }
                i4 = i5;
            } else {
                i2 = i3;
            }
            i3 = i2 + 1;
        }
    }

    /* renamed from: c */
    private final void m17840c(Object obj, int i) {
        this.f15145s = new C2588li(0, 0);
        m17843g(obj, i);
        this.f15145s = new C2588li(0, -9223372036854775807L);
        m17849m(4);
        m17844h(false);
    }

    /* renamed from: e */
    private final void m17841e() {
        long j;
        C2551ki kiVar = this.f15125K;
        if (!kiVar.f12094j) {
            j = 0;
        } else {
            j = kiVar.f12085a.zza();
        }
        if (j == Long.MIN_VALUE) {
            m17847k(false);
            return;
        }
        C2551ki kiVar2 = this.f15125K;
        long j2 = this.f15124J - (kiVar2.f12090f - kiVar2.f12092h);
        boolean j3 = this.f15135a0.mo15489j(j - j2);
        m17847k(j3);
        if (j3) {
            this.f15125K.f12085a.mo9236e0(j2);
        }
    }

    /* renamed from: f */
    private final void m17842f() throws IOException {
        C2551ki kiVar = this.f15125K;
        if (kiVar != null && !kiVar.f12094j) {
            C2551ki kiVar2 = this.f15126L;
            if (kiVar2 == null || kiVar2.f12096l == kiVar) {
                C2996wi[] wiVarArr = this.f15150x;
                int length = wiVarArr.length;
                int i = 0;
                while (i < length) {
                    if (wiVarArr[i].mo8375h0()) {
                        i++;
                    } else {
                        return;
                    }
                }
                this.f15125K.f12085a.mo9235d0();
            }
        }
    }

    /* renamed from: g */
    private final void m17843g(Object obj, int i) {
        this.f15141g.obtainMessage(6, new C2662ni(this.f15128N, obj, this.f15145s, i)).sendToTarget();
    }

    /* renamed from: h */
    private final void m17844h(boolean z) {
        this.f15139e.removeMessages(2);
        this.f15115A = false;
        this.f15138d.mo13325c();
        this.f15148v = null;
        this.f15147u = null;
        this.f15124J = 60000000;
        for (C2996wi wiVar : this.f15150x) {
            try {
                m17856t(wiVar);
                wiVar.mo8367W();
            } catch (C2253ci | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.f15150x = new C2996wi[0];
        C2551ki kiVar = this.f15127M;
        if (kiVar == null) {
            kiVar = this.f15125K;
        }
        m17857u(kiVar);
        this.f15125K = null;
        this.f15126L = null;
        this.f15127M = null;
        m17847k(false);
        if (z) {
            C2333eo eoVar = this.f15149w;
            if (eoVar != null) {
                eoVar.mo8445b();
                this.f15149w = null;
            }
            this.f15128N = null;
        }
    }

    /* renamed from: i */
    private final void m17845i(long j) throws C2253ci {
        long j2;
        C2551ki kiVar = this.f15127M;
        if (kiVar == null) {
            j2 = j + 60000000;
        } else {
            j2 = j + (kiVar.f12090f - kiVar.f12092h);
        }
        this.f15124J = j2;
        this.f15138d.mo13323a(j2);
        for (C2996wi p0 : this.f15150x) {
            p0.mo8389p0(this.f15124J);
        }
    }

    /* renamed from: j */
    private final void m17846j(long j, long j2) {
        this.f15139e.removeMessages(2);
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f15139e.sendEmptyMessage(2);
        } else {
            this.f15139e.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    /* renamed from: k */
    private final void m17847k(boolean z) {
        if (this.f15116B != z) {
            this.f15116B = z;
            this.f15141g.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    /* renamed from: l */
    private final void m17848l(C2551ki kiVar) throws C2253ci {
        if (this.f15127M != kiVar) {
            boolean[] zArr = new boolean[2];
            int i = 0;
            for (int i2 = 0; i2 < 2; i2++) {
                C2996wi wiVar = this.f15134a[i2];
                zArr[i2] = wiVar.mo8369d() != 0;
                C3039xo a = kiVar.f12097m.f11731b.mo10596a(i2);
                if (a != null) {
                    i++;
                }
                if (zArr[i2] && (a == null || (wiVar.mo8381l0() && wiVar.mo8365U() == this.f15127M.f12088d[i2]))) {
                    if (wiVar == this.f15147u) {
                        this.f15138d.mo13326d(this.f15148v);
                        this.f15148v = null;
                        this.f15147u = null;
                    }
                    m17856t(wiVar);
                    wiVar.mo8367W();
                }
            }
            this.f15127M = kiVar;
            this.f15141g.obtainMessage(3, kiVar.f12097m).sendToTarget();
            m17839Q(zArr, i);
        }
    }

    /* renamed from: m */
    private final void m17849m(int i) {
        if (this.f15117C != i) {
            this.f15117C = i;
            this.f15141g.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    /* renamed from: n */
    private final void m17850n() throws C2253ci {
        this.f15115A = false;
        this.f15138d.mo13324b();
        for (C2996wi m0 : this.f15150x) {
            m0.mo8383m0();
        }
    }

    /* renamed from: o */
    private final void m17851o() {
        m17844h(true);
        this.f15135a0.mo15482c();
        m17849m(1);
    }

    /* renamed from: p */
    private final void m17852p() throws C2253ci {
        this.f15138d.mo13325c();
        for (C2996wi t : this.f15150x) {
            m17856t(t);
        }
    }

    /* renamed from: q */
    private final void m17853q() throws C2253ci {
        long j;
        C2551ki kiVar = this.f15127M;
        if (kiVar != null) {
            long U = kiVar.f12085a.mo9232U();
            if (U != -9223372036854775807L) {
                m17845i(U);
            } else {
                C2996wi wiVar = this.f15147u;
                if (wiVar == null || wiVar.mo9928k0()) {
                    this.f15124J = this.f15138d.mo9926A();
                } else {
                    long A = this.f15148v.mo9926A();
                    this.f15124J = A;
                    this.f15138d.mo13323a(A);
                }
                C2551ki kiVar2 = this.f15127M;
                U = this.f15124J - (kiVar2.f12090f - kiVar2.f12092h);
            }
            this.f15145s.f12811c = U;
            this.f15121G = SystemClock.elapsedRealtime() * 1000;
            if (this.f15150x.length == 0) {
                j = Long.MIN_VALUE;
            } else {
                j = this.f15127M.f12085a.mo9234c();
            }
            C2588li liVar = this.f15145s;
            if (j == Long.MIN_VALUE) {
                j = this.f15128N.mo9184d(this.f15127M.f12091g, this.f15144r, false).f6593c;
            }
            liVar.f12812d = j;
        }
    }

    /* renamed from: r */
    private final boolean m17854r(int i) {
        this.f15128N.mo9184d(i, this.f15144r, false);
        this.f15128N.mo9187g(0, this.f15143i, false);
        if (this.f15128N.mo9186f(i, this.f15144r, this.f15143i, this.f15118D) == -1) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r6 = r5.f15127M.f12096l;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m17855s(long r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.li r2 = r5.f15145s
            long r2 = r2.f12811c
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x001f
            com.google.android.gms.internal.ads.ki r6 = r5.f15127M
            com.google.android.gms.internal.ads.ki r6 = r6.f12096l
            if (r6 == 0) goto L_0x0020
            boolean r6 = r6.f12094j
            if (r6 == 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            return r0
        L_0x001f:
            r0 = 1
        L_0x0020:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2699oi.m17855s(long):boolean");
    }

    /* renamed from: t */
    private static final void m17856t(C2996wi wiVar) throws C2253ci {
        if (wiVar.mo8369d() == 2) {
            wiVar.mo8378j0();
        }
    }

    /* renamed from: u */
    private static final void m17857u(C2551ki kiVar) {
        while (kiVar != null) {
            kiVar.mo11704c();
            kiVar = kiVar.f12096l;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|11|12|13|23|20|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x000d, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo12933A() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f15151y     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            android.os.Handler r0 = r2.f15139e     // Catch:{ all -> 0x0024 }
            r1 = 6
            r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x0024 }
        L_0x000d:
            boolean r0 = r2.f15151y     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x001d
            r2.wait()     // Catch:{ InterruptedException -> 0x0015 }
            goto L_0x000d
        L_0x0015:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0024 }
            r0.interrupt()     // Catch:{ all -> 0x0024 }
            goto L_0x000d
        L_0x001d:
            android.os.HandlerThread r0 = r2.f15140f     // Catch:{ all -> 0x0024 }
            r0.quit()     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2699oi.mo12933A():void");
    }

    /* renamed from: B */
    public final void mo12934B(C2254cj cjVar, int i, long j) {
        this.f15139e.obtainMessage(3, new C2625mi(cjVar, 0, j)).sendToTarget();
    }

    /* renamed from: C */
    public final void mo12935C(C2365fi... fiVarArr) {
        if (this.f15151y) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        this.f15119E++;
        this.f15139e.obtainMessage(11, fiVarArr).sendToTarget();
    }

    /* renamed from: D */
    public final void mo12936D(int i) {
        this.f15133S = i;
    }

    /* renamed from: E */
    public final void mo12937E(int i) {
        this.f15132R = i;
    }

    /* renamed from: F */
    public final void mo12938F(boolean z) {
        this.f15139e.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
    }

    /* renamed from: G */
    public final void mo12939G() {
        this.f15139e.sendEmptyMessage(5);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:13|14|15|16|17|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002f */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003f A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0041  */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo12940H(com.google.android.gms.internal.ads.C2365fi... r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.f15151y     // Catch:{ all -> 0x0044 }
            r1 = 1
            if (r0 == 0) goto L_0x0008
            monitor-exit(r9)
            return r1
        L_0x0008:
            int r0 = r9.f15119E     // Catch:{ all -> 0x0044 }
            int r2 = r0 + 1
            r9.f15119E = r2     // Catch:{ all -> 0x0044 }
            android.os.Handler r2 = r9.f15139e     // Catch:{ all -> 0x0044 }
            r3 = 11
            android.os.Message r10 = r2.obtainMessage(r3, r10)     // Catch:{ all -> 0x0044 }
            r10.sendToTarget()     // Catch:{ all -> 0x0044 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0044 }
            int r10 = r9.f15131Q     // Catch:{ all -> 0x0044 }
            long r4 = (long) r10     // Catch:{ all -> 0x0044 }
            long r2 = r2 + r4
        L_0x0021:
            int r10 = r9.f15120F     // Catch:{ all -> 0x0044 }
            if (r10 > r0) goto L_0x003d
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x003d
            r9.wait(r4)     // Catch:{ InterruptedException -> 0x002f }
            goto L_0x0036
        L_0x002f:
            java.lang.Thread r10 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0044 }
            r10.interrupt()     // Catch:{ all -> 0x0044 }
        L_0x0036:
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0044 }
            long r4 = r2 - r4
            goto L_0x0021
        L_0x003d:
            if (r0 >= r10) goto L_0x0041
            monitor-exit(r9)
            return r1
        L_0x0041:
            r10 = 0
            monitor-exit(r9)
            return r10
        L_0x0044:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2699oi.mo12940H(com.google.android.gms.internal.ads.fi[]):boolean");
    }

    /* renamed from: I */
    public final boolean mo12941I() {
        return this.f15130P && this.f15131Q > 0;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:13|14|15|16|27|17) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x002b, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0024 */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo12942J() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.f15151y     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0008
            r0 = 1
            monitor-exit(r7)
            return r0
        L_0x0008:
            android.os.Handler r0 = r7.f15139e     // Catch:{ all -> 0x003b }
            r1 = 6
            r0.sendEmptyMessage(r1)     // Catch:{ all -> 0x003b }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x003b }
            int r2 = r7.f15131Q     // Catch:{ all -> 0x003b }
            long r2 = (long) r2     // Catch:{ all -> 0x003b }
            long r0 = r0 + r2
        L_0x0016:
            boolean r4 = r7.f15151y     // Catch:{ all -> 0x003b }
            if (r4 != 0) goto L_0x0032
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0037
            r7.wait(r2)     // Catch:{ InterruptedException -> 0x0024 }
            goto L_0x002b
        L_0x0024:
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x003b }
            r2.interrupt()     // Catch:{ all -> 0x003b }
        L_0x002b:
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x003b }
            long r2 = r0 - r2
            goto L_0x0016
        L_0x0032:
            android.os.HandlerThread r0 = r7.f15140f     // Catch:{ all -> 0x003b }
            r0.quit()     // Catch:{ all -> 0x003b }
        L_0x0037:
            boolean r0 = r7.f15151y     // Catch:{ all -> 0x003b }
            monitor-exit(r7)
            return r0
        L_0x003b:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2699oi.mo12942J():boolean");
    }

    /* renamed from: U */
    public final void mo10888U() {
        this.f15139e.sendEmptyMessage(10);
    }

    /* renamed from: a */
    public final void mo8898a(C2259co coVar) {
        this.f15139e.obtainMessage(8, coVar).sendToTarget();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo10219b(C2780qo qoVar) {
        this.f15139e.obtainMessage(9, (C2259co) qoVar).sendToTarget();
    }

    /* renamed from: d */
    public final void mo8447d(C2254cj cjVar, Object obj) {
        this.f15139e.obtainMessage(7, Pair.create(cjVar, (Object) null)).sendToTarget();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0798, code lost:
        if (m17855s(r1) != false) goto L_0x079a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x087e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x087f, code lost:
        r1 = r0;
        android.util.Log.e("ExoPlayerImplInternal", "Internal runtime error.", r1);
        r8.f15141g.obtainMessage(8, com.google.android.gms.internal.ads.C2253ci.m10946c(r1)).sendToTarget();
        m17851o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x089a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x089b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x089c, code lost:
        r1 = true;
        r3 = 8;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x08b8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x08b9, code lost:
        r1 = true;
        r3 = 8;
        r2 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0268 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x026c A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0271 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x04ea A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x04f1 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0508 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x050b A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0546 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0558 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0572 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }, LOOP:8: B:317:0x0572->B:321:0x0582, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x06c7 A[Catch:{ all -> 0x0416, all -> 0x0364, all -> 0x00c9, all -> 0x00d6, all -> 0x00c5, ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }] */
    /* JADX WARNING: Removed duplicated region for block: B:494:0x087e A[ExcHandler: RuntimeException (r0v2 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r34) {
        /*
            r33 = this;
            r8 = r33
            r1 = r34
            r10 = 1
            int r2 = r1.what     // Catch:{ ci -> 0x08b8, IOException -> 0x089b, RuntimeException -> 0x087e }
            r11 = 7
            r3 = 0
            r14 = 3
            r5 = -1
            r6 = 0
            r15 = 4
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 2
            r9 = 0
            switch(r2) {
                case 0: goto L_0x083d;
                case 1: goto L_0x080e;
                case 2: goto L_0x0429;
                case 3: goto L_0x038a;
                case 4: goto L_0x036c;
                case 5: goto L_0x0368;
                case 6: goto L_0x0351;
                case 7: goto L_0x01f6;
                case 8: goto L_0x01c6;
                case 9: goto L_0x01b6;
                case 10: goto L_0x00da;
                case 11: goto L_0x009c;
                case 12: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            r1 = 0
            return r1
        L_0x001a:
            int r1 = r1.arg1     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f15118D = r1     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ki r2 = r8.f15127M     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x0024
            com.google.android.gms.internal.ads.ki r2 = r8.f15125K     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0024:
            if (r2 != 0) goto L_0x0028
            goto L_0x009b
        L_0x0028:
            com.google.android.gms.internal.ads.ki r3 = r8.f15126L     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != r3) goto L_0x002e
            r3 = 1
            goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            com.google.android.gms.internal.ads.ki r4 = r8.f15125K     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != r4) goto L_0x0035
            r4 = 1
            goto L_0x0036
        L_0x0035:
            r4 = 0
        L_0x0036:
            com.google.android.gms.internal.ads.cj r11 = r8.f15128N     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r12 = r2.f12091g     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.aj r13 = r8.f15144r     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.bj r14 = r8.f15143i     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r11 = r11.mo9186f(r12, r13, r14, r1)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0042:
            com.google.android.gms.internal.ads.ki r12 = r2.f12096l     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 == 0) goto L_0x0068
            if (r11 == r5) goto L_0x0068
            int r13 = r12.f12091g     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r13 != r11) goto L_0x0068
            com.google.android.gms.internal.ads.ki r2 = r8.f15126L     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 != r2) goto L_0x0052
            r2 = 1
            goto L_0x0053
        L_0x0052:
            r2 = 0
        L_0x0053:
            r3 = r3 | r2
            com.google.android.gms.internal.ads.ki r2 = r8.f15125K     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 != r2) goto L_0x005a
            r2 = 1
            goto L_0x005b
        L_0x005a:
            r2 = 0
        L_0x005b:
            r4 = r4 | r2
            com.google.android.gms.internal.ads.cj r2 = r8.f15128N     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.aj r11 = r8.f15144r     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.bj r14 = r8.f15143i     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r11 = r2.mo9186f(r13, r11, r14, r1)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = r12
            goto L_0x0042
        L_0x0068:
            if (r12 == 0) goto L_0x006f
            m17857u(r12)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.f12096l = r6     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x006f:
            int r5 = r2.f12091g     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r5 = r8.m17854r(r5)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.f12093i = r5     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r4 != 0) goto L_0x007b
            r8.f15125K = r2     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x007b:
            if (r3 != 0) goto L_0x0092
            com.google.android.gms.internal.ads.ki r2 = r8.f15127M     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x0092
            int r2 = r2.f12091g     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.li r3 = r8.f15145s     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r3.f12811c     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r8.m17834L(r2, r3)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.li r5 = new com.google.android.gms.internal.ads.li     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r5.<init>(r2, r3)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f15145s = r5     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0092:
            int r2 = r8.f15117C     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != r15) goto L_0x009b
            if (r1 == 0) goto L_0x009b
            r8.m17849m(r7)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x009b:
            return r10
        L_0x009c:
            java.lang.Object r1 = r1.obj     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.fi[] r1 = (com.google.android.gms.internal.ads.C2365fi[]) r1     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r1.length     // Catch:{ all -> 0x00c9 }
        L_0x00a1:
            if (r9 >= r2) goto L_0x00b1
            r3 = r1[r9]     // Catch:{ all -> 0x00c9 }
            com.google.android.gms.internal.ads.ei r4 = r3.f9286a     // Catch:{ all -> 0x00c9 }
            int r5 = r3.f9287b     // Catch:{ all -> 0x00c9 }
            java.lang.Object r3 = r3.f9288c     // Catch:{ all -> 0x00c9 }
            r4.mo9675c(r5, r3)     // Catch:{ all -> 0x00c9 }
            int r9 = r9 + 1
            goto L_0x00a1
        L_0x00b1:
            com.google.android.gms.internal.ads.eo r1 = r8.f15149w     // Catch:{ all -> 0x00c9 }
            if (r1 == 0) goto L_0x00ba
            android.os.Handler r1 = r8.f15139e     // Catch:{ all -> 0x00c9 }
            r1.sendEmptyMessage(r7)     // Catch:{ all -> 0x00c9 }
        L_0x00ba:
            monitor-enter(r33)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r8.f15120F     // Catch:{ all -> 0x00c5 }
            int r1 = r1 + r10
            r8.f15120F = r1     // Catch:{ all -> 0x00c5 }
            r33.notifyAll()     // Catch:{ all -> 0x00c5 }
            monitor-exit(r33)     // Catch:{ all -> 0x00c5 }
            return r10
        L_0x00c5:
            r0 = move-exception
            r1 = r0
            monitor-exit(r33)     // Catch:{ all -> 0x00c5 }
            throw r1     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x00c9:
            r0 = move-exception
            r1 = r0
            monitor-enter(r33)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r8.f15120F     // Catch:{ all -> 0x00d6 }
            int r2 = r2 + r10
            r8.f15120F = r2     // Catch:{ all -> 0x00d6 }
            r33.notifyAll()     // Catch:{ all -> 0x00d6 }
            monitor-exit(r33)     // Catch:{ all -> 0x00d6 }
            throw r1     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x00d6:
            r0 = move-exception
            r1 = r0
            monitor-exit(r33)     // Catch:{ all -> 0x00d6 }
            throw r1     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x00da:
            com.google.android.gms.internal.ads.ki r1 = r8.f15127M     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x01b5
            r2 = 1
        L_0x00df:
            if (r1 == 0) goto L_0x01b5
            boolean r3 = r1.f12094j     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 != 0) goto L_0x00e7
            goto L_0x01b5
        L_0x00e7:
            boolean r3 = r1.mo11706e()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x01a9
            if (r2 == 0) goto L_0x0178
            com.google.android.gms.internal.ads.ki r2 = r8.f15126L     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ki r3 = r8.f15127M     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == r3) goto L_0x00f7
            r2 = 1
            goto L_0x00f8
        L_0x00f7:
            r2 = 0
        L_0x00f8:
            com.google.android.gms.internal.ads.ki r3 = r3.f12096l     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            m17857u(r3)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ki r3 = r8.f15127M     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.f12096l = r6     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f15125K = r3     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f15126L = r3     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean[] r4 = new boolean[r7]     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.li r5 = r8.f15145s     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r11 = r5.f12811c     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r2 = r3.mo11703b(r11, r2, r4)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.li r5 = r8.f15145s     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r11 = r5.f12811c     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r5 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x011e
            com.google.android.gms.internal.ads.li r5 = r8.f15145s     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r5.f12811c = r2     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m17845i(r2)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x011e:
            boolean[] r2 = new boolean[r7]     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3 = 0
            r5 = 0
        L_0x0122:
            if (r3 >= r7) goto L_0x0169
            com.google.android.gms.internal.ads.wi[] r11 = r8.f15134a     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r11 = r11[r3]     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r12 = r11.mo8369d()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 == 0) goto L_0x0130
            r12 = 1
            goto L_0x0131
        L_0x0130:
            r12 = 0
        L_0x0131:
            r2[r3] = r12     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ki r13 = r8.f15127M     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.oo[] r13 = r13.f12088d     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r13 = r13[r3]     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r13 == 0) goto L_0x013d
            int r5 = r5 + 1
        L_0x013d:
            if (r12 == 0) goto L_0x0166
            com.google.android.gms.internal.ads.oo r12 = r11.mo8365U()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r13 == r12) goto L_0x015d
            com.google.android.gms.internal.ads.wi r12 = r8.f15147u     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r11 != r12) goto L_0x0156
            if (r13 != 0) goto L_0x0152
            com.google.android.gms.internal.ads.pq r12 = r8.f15138d     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.iq r13 = r8.f15148v     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r12.mo13326d(r13)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0152:
            r8.f15148v = r6     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f15147u = r6     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0156:
            m17856t(r11)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r11.mo8367W()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0166
        L_0x015d:
            boolean r12 = r4[r3]     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 == 0) goto L_0x0166
            long r12 = r8.f15124J     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r11.mo8389p0(r12)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0166:
            int r3 = r3 + 1
            goto L_0x0122
        L_0x0169:
            android.os.Handler r3 = r8.f15141g     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.jp r1 = r1.f12097m     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r3.obtainMessage(r14, r1)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendToTarget()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m17839Q(r2, r5)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x019d
        L_0x0178:
            r8.f15125K = r1     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ki r1 = r1.f12096l     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x017c:
            if (r1 == 0) goto L_0x0184
            r1.mo11704c()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ki r1 = r1.f12096l     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x017c
        L_0x0184:
            com.google.android.gms.internal.ads.ki r1 = r8.f15125K     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.f12096l = r6     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r2 = r1.f12094j     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x019d
            long r2 = r1.f12092h     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r4 = r8.f15124J     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r11 = r1.f12090f     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r11 = r11 - r2
            long r4 = r4 - r11
            long r1 = java.lang.Math.max(r2, r4)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ki r3 = r8.f15125K     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.mo11702a(r1, r9)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x019d:
            r33.m17841e()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r33.m17853q()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r1 = r8.f15139e     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendEmptyMessage(r7)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x01b5
        L_0x01a9:
            com.google.android.gms.internal.ads.ki r3 = r8.f15126L     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 != r3) goto L_0x01af
            r3 = 0
            goto L_0x01b0
        L_0x01af:
            r3 = 1
        L_0x01b0:
            r2 = r2 & r3
            com.google.android.gms.internal.ads.ki r1 = r1.f12096l     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x00df
        L_0x01b5:
            return r10
        L_0x01b6:
            java.lang.Object r1 = r1.obj     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.co r1 = (com.google.android.gms.internal.ads.C2259co) r1     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ki r2 = r8.f15125K     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x01c5
            com.google.android.gms.internal.ads.co r2 = r2.f12085a     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != r1) goto L_0x01c5
            r33.m17841e()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x01c5:
            return r10
        L_0x01c6:
            java.lang.Object r1 = r1.obj     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.co r1 = (com.google.android.gms.internal.ads.C2259co) r1     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ki r2 = r8.f15125K     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x01f5
            com.google.android.gms.internal.ads.co r3 = r2.f12085a     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == r1) goto L_0x01d3
            goto L_0x01f5
        L_0x01d3:
            r2.f12094j = r10     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo11706e()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r2.f12092h     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r2.mo11702a(r3, r9)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.f12092h = r3     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ki r1 = r8.f15127M     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 != 0) goto L_0x01f2
            com.google.android.gms.internal.ads.ki r1 = r8.f15125K     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f15126L = r1     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r1 = r1.f12092h     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m17845i(r1)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ki r1 = r8.f15126L     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m17848l(r1)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x01f2:
            r33.m17841e()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x01f5:
            return r10
        L_0x01f6:
            java.lang.Object r1 = r1.obj     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.util.Pair r1 = (android.util.Pair) r1     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.cj r2 = r8.f15128N     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r3 = r1.first     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.cj r3 = (com.google.android.gms.internal.ads.C2254cj) r3     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f15128N = r3     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r1 = r1.second     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x0263
            int r4 = r8.f15122H     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r4 <= 0) goto L_0x0235
            com.google.android.gms.internal.ads.mi r3 = r8.f15123I     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.util.Pair r3 = r8.m17838P(r3)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r4 = r8.f15122H     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f15122H = r9     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f15123I = r6     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 != 0) goto L_0x021d
            r8.m17840c(r1, r4)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0350
        L_0x021d:
            com.google.android.gms.internal.ads.li r7 = new com.google.android.gms.internal.ads.li     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r11 = r3.first     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r11 = r11.intValue()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r3 = r3.second     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r3.longValue()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r7.<init>(r11, r14)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f15145s = r7     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0264
        L_0x0235:
            com.google.android.gms.internal.ads.li r4 = r8.f15145s     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r4.f12810b     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r4 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r4 != 0) goto L_0x0263
            boolean r3 = r3.mo9188h()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x0248
            r8.m17840c(r1, r9)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0350
        L_0x0248:
            android.util.Pair r3 = r8.m17835M(r9, r12)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.li r4 = new com.google.android.gms.internal.ads.li     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r7 = r3.first     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r7 = r7.intValue()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r3 = r3.second     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r3.longValue()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r4.<init>(r7, r14)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f15145s = r4     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0263:
            r4 = 0
        L_0x0264:
            com.google.android.gms.internal.ads.ki r3 = r8.f15127M     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 != 0) goto L_0x026a
            com.google.android.gms.internal.ads.ki r3 = r8.f15125K     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x026a:
            if (r3 != 0) goto L_0x0271
            r8.m17843g(r1, r4)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0350
        L_0x0271:
            com.google.android.gms.internal.ads.cj r7 = r8.f15128N     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r11 = r3.f12086b     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r7 = r7.mo9181a(r11)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r7 != r5) goto L_0x02d4
            int r6 = r3.f12091g     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.cj r7 = r8.f15128N     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r8.m17833K(r6, r2, r7)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != r5) goto L_0x028a
            r8.m17840c(r1, r4)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0350
        L_0x028a:
            com.google.android.gms.internal.ads.cj r2 = r8.f15128N     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.aj r6 = r8.f15144r     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo9184d(r9, r6, r9)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.util.Pair r2 = r8.m17835M(r9, r12)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r6 = r2.first     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r6 = r6.intValue()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r2 = r2.second     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r11 = r2.longValue()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.cj r2 = r8.f15128N     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.aj r7 = r8.f15144r     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo9184d(r6, r7, r10)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.aj r2 = r8.f15144r     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r2 = r2.f6592b     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.f12091g = r5     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x02b2:
            com.google.android.gms.internal.ads.ki r3 = r3.f12096l     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x02c4
            java.lang.Object r7 = r3.f12086b     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r7 = r7.equals(r2)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r10 == r7) goto L_0x02c0
            r7 = -1
            goto L_0x02c1
        L_0x02c0:
            r7 = r6
        L_0x02c1:
            r3.f12091g = r7     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x02b2
        L_0x02c4:
            long r2 = r8.m17834L(r6, r11)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.li r5 = new com.google.android.gms.internal.ads.li     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r5.<init>(r6, r2)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f15145s = r5     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m17843g(r1, r4)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0350
        L_0x02d4:
            boolean r2 = r8.m17854r(r9)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.f12091g = r9     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.f12093i = r2     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ki r2 = r8.f15126L     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 != r2) goto L_0x02e2
            r2 = 1
            goto L_0x02e3
        L_0x02e2:
            r2 = 0
        L_0x02e3:
            com.google.android.gms.internal.ads.li r11 = r8.f15145s     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r12 = r11.f12809a     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 == 0) goto L_0x02fa
            com.google.android.gms.internal.ads.li r12 = new com.google.android.gms.internal.ads.li     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r11.f12810b     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r12.<init>(r9, r13)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r11.f12811c     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r12.f12811c = r13     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r11.f12812d     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r12.f12812d = r13     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f15145s = r12     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x02fa:
            com.google.android.gms.internal.ads.ki r11 = r3.f12096l     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r11 == 0) goto L_0x034d
            com.google.android.gms.internal.ads.cj r12 = r8.f15128N     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.aj r13 = r8.f15144r     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.bj r14 = r8.f15143i     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r15 = r8.f15118D     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r7 = r12.mo9186f(r7, r13, r14, r15)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r7 == r5) goto L_0x0330
            java.lang.Object r12 = r11.f12086b     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.cj r13 = r8.f15128N     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.aj r14 = r8.f15144r     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.aj r13 = r13.mo9184d(r7, r14, r10)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r13 = r13.f6592b     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r12 = r12.equals(r13)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r12 == 0) goto L_0x0330
            boolean r3 = r8.m17854r(r7)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r11.f12091g = r7     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r11.f12093i = r3     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ki r3 = r8.f15126L     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r11 != r3) goto L_0x032c
            r3 = 1
            goto L_0x032d
        L_0x032c:
            r3 = 0
        L_0x032d:
            r2 = r2 | r3
            r3 = r11
            goto L_0x02fa
        L_0x0330:
            if (r2 != 0) goto L_0x0346
            com.google.android.gms.internal.ads.ki r2 = r8.f15127M     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2.f12091g     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.li r3 = r8.f15145s     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r5 = r3.f12811c     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r5 = r8.m17834L(r2, r5)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.li r3 = new com.google.android.gms.internal.ads.li     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.<init>(r2, r5)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f15145s = r3     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x034d
        L_0x0346:
            r8.f15125K = r3     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.f12096l = r6     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            m17857u(r11)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x034d:
            r8.m17843g(r1, r4)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0350:
            return r10
        L_0x0351:
            r8.m17844h(r10)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.yp0 r1 = r8.f15135a0     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.mo15481b()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m17849m(r10)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            monitor-enter(r33)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f15151y = r10     // Catch:{ all -> 0x0364 }
            r33.notifyAll()     // Catch:{ all -> 0x0364 }
            monitor-exit(r33)     // Catch:{ all -> 0x0364 }
            return r10
        L_0x0364:
            r0 = move-exception
            r1 = r0
            monitor-exit(r33)     // Catch:{ all -> 0x0364 }
            throw r1     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0368:
            r33.m17851o()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            return r10
        L_0x036c:
            java.lang.Object r1 = r1.obj     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.vi r1 = (com.google.android.gms.internal.ads.C2959vi) r1     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.iq r2 = r8.f15148v     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x0379
            com.google.android.gms.internal.ads.vi r1 = r2.mo9927B(r1)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x037e
        L_0x0379:
            com.google.android.gms.internal.ads.pq r2 = r8.f15138d     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo9927B(r1)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x037e:
            r8.f15146t = r1     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r2 = r8.f15141g     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r2.obtainMessage(r11, r1)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendToTarget()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            return r10
        L_0x038a:
            java.lang.Object r1 = r1.obj     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.mi r1 = (com.google.android.gms.internal.ads.C2625mi) r1     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.cj r2 = r8.f15128N     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x039b
            int r2 = r8.f15122H     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2 + r10
            r8.f15122H = r2     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f15123I = r1     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0415
        L_0x039b:
            android.util.Pair r2 = r8.m17838P(r1)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x03bf
            com.google.android.gms.internal.ads.li r1 = new com.google.android.gms.internal.ads.li     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.<init>(r9, r3)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f15145s = r1     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r2 = r8.f15141g     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r2.obtainMessage(r15, r10, r9, r1)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendToTarget()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.li r1 = new com.google.android.gms.internal.ads.li     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.<init>(r9, r12)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f15145s = r1     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m17849m(r15)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m17844h(r9)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0415
        L_0x03bf:
            long r3 = r1.f13343c     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x03c7
            r1 = 1
            goto L_0x03c8
        L_0x03c7:
            r1 = 0
        L_0x03c8:
            java.lang.Object r3 = r2.first     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r3 = r3.intValue()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r2 = r2.second     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r4 = r2.longValue()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.li r2 = r8.f15145s     // Catch:{ all -> 0x0416 }
            int r6 = r2.f12809a     // Catch:{ all -> 0x0416 }
            if (r3 != r6) goto L_0x03fb
            r16 = 1000(0x3e8, double:4.94E-321)
            long r6 = r4 / r16
            long r11 = r2.f12811c     // Catch:{ all -> 0x0416 }
            long r11 = r11 / r16
            int r2 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x03fb
            com.google.android.gms.internal.ads.li r2 = new com.google.android.gms.internal.ads.li     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.<init>(r3, r4)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f15145s = r2     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r3 = r8.f15141g     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r3.obtainMessage(r15, r1, r9, r2)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x03f7:
            r1.sendToTarget()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0415
        L_0x03fb:
            long r6 = r8.m17834L(r3, r4)     // Catch:{ all -> 0x0416 }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0405
            r2 = 1
            goto L_0x0406
        L_0x0405:
            r2 = 0
        L_0x0406:
            r1 = r1 | r2
            com.google.android.gms.internal.ads.li r2 = new com.google.android.gms.internal.ads.li     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.<init>(r3, r6)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f15145s = r2     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r3 = r8.f15141g     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r3.obtainMessage(r15, r1, r9, r2)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x03f7
        L_0x0415:
            return r10
        L_0x0416:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.internal.ads.li r6 = new com.google.android.gms.internal.ads.li     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r6.<init>(r3, r4)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f15145s = r6     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r3 = r8.f15141g     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r3.obtainMessage(r15, r1, r9, r6)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendToTarget()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            throw r2     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0429:
            r16 = 1000(0x3e8, double:4.94E-321)
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.cj r1 = r8.f15128N     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 != 0) goto L_0x043b
            com.google.android.gms.internal.ads.eo r1 = r8.f15149w     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.zza()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r11 = r5
            goto L_0x0677
        L_0x043b:
            com.google.android.gms.internal.ads.ki r1 = r8.f15125K     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 != 0) goto L_0x0444
            com.google.android.gms.internal.ads.li r1 = r8.f15145s     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r1.f12809a     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0479
        L_0x0444:
            int r2 = r1.f12091g     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r7 = r1.f12093i     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r7 != 0) goto L_0x0553
            boolean r1 = r1.mo11705d()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0553
            com.google.android.gms.internal.ads.cj r1 = r8.f15128N     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.aj r7 = r8.f15144r     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.aj r1 = r1.mo9184d(r2, r7, r9)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r1.f6593c     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x0553
            com.google.android.gms.internal.ads.ki r1 = r8.f15127M     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x046d
            com.google.android.gms.internal.ads.ki r7 = r8.f15125K     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r7 = r7.f12087c     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r1.f12087c     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r7 = r7 - r1
            r1 = 100
            if (r7 == r1) goto L_0x0553
        L_0x046d:
            com.google.android.gms.internal.ads.cj r1 = r8.f15128N     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.aj r7 = r8.f15144r     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.bj r14 = r8.f15143i     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r15 = r8.f15118D     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r1.mo9186f(r2, r7, r14, r15)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0479:
            com.google.android.gms.internal.ads.cj r2 = r8.f15128N     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2.mo9182b()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 < r2) goto L_0x0488
            com.google.android.gms.internal.ads.eo r1 = r8.f15149w     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.zza()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0553
        L_0x0488:
            com.google.android.gms.internal.ads.ki r2 = r8.f15125K     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x0493
            com.google.android.gms.internal.ads.li r2 = r8.f15145s     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r2.f12811c     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0490:
            r11 = r5
            r15 = 2
            goto L_0x04e6
        L_0x0493:
            com.google.android.gms.internal.ads.cj r2 = r8.f15128N     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.aj r7 = r8.f15144r     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo9184d(r1, r7, r9)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.cj r2 = r8.f15128N     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.bj r7 = r8.f15143i     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo9187g(r9, r7, r9)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x04a4
            goto L_0x0490
        L_0x04a4:
            com.google.android.gms.internal.ads.ki r1 = r8.f15125K     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r1.f12090f     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r11 = r1.f12092h     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r14 - r11
            com.google.android.gms.internal.ads.cj r2 = r8.f15128N     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r1.f12091g     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.aj r7 = r8.f15144r     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.aj r1 = r2.mo9184d(r1, r7, r9)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r1 = r1.f6593c     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r14 + r1
            long r1 = r8.f15124J     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r14 = r14 - r1
            com.google.android.gms.internal.ads.cj r2 = r8.f15128N     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r7 = 0
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r13 = java.lang.Math.max(r3, r14)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1 = r33
            r3 = r7
            r6 = r5
            r4 = r11
            r11 = r6
            r15 = 2
            r6 = r13
            android.util.Pair r1 = r1.m17837O(r2, r3, r4, r6)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0554
            java.lang.Object r2 = r1.first     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2.intValue()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r1 = r1.second     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r1.longValue()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1 = r2
        L_0x04e6:
            com.google.android.gms.internal.ads.ki r2 = r8.f15125K     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x04f1
            r5 = 60000000(0x3938700, double:2.96439388E-316)
            long r5 = r5 + r3
        L_0x04ee:
            r21 = r5
            goto L_0x0504
        L_0x04f1:
            long r5 = r2.f12090f     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r2.f12092h     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r5 = r5 - r13
            com.google.android.gms.internal.ads.cj r7 = r8.f15128N     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2.f12091g     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.aj r13 = r8.f15144r     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.aj r2 = r7.mo9184d(r2, r13, r9)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r2.f6593c     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r5 = r5 + r13
            goto L_0x04ee
        L_0x0504:
            com.google.android.gms.internal.ads.ki r2 = r8.f15125K     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x050b
            r27 = 0
            goto L_0x0510
        L_0x050b:
            int r2 = r2.f12087c     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2 + r10
            r27 = r2
        L_0x0510:
            boolean r29 = r8.m17854r(r1)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.cj r2 = r8.f15128N     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.aj r5 = r8.f15144r     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo9184d(r1, r5, r10)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ki r2 = new com.google.android.gms.internal.ads.ki     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.wi[] r5 = r8.f15134a     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.xi[] r6 = r8.f15136b     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ip r7 = r8.f15137c     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.yp0 r13 = r8.f15135a0     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.eo r14 = r8.f15149w     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.aj r15 = r8.f15144r     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            java.lang.Object r15 = r15.f6592b     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r32 = 0
            r18 = r2
            r19 = r5
            r20 = r6
            r23 = r7
            r24 = r13
            r25 = r14
            r26 = r15
            r28 = r1
            r30 = r3
            r18.<init>(r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r32)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ki r1 = r8.f15125K     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0548
            r1.f12096l = r2     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0548:
            r8.f15125K = r2     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.co r1 = r2.f12085a     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.mo9238g0(r8, r3)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m17847k(r10)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0554
        L_0x0553:
            r11 = r5
        L_0x0554:
            com.google.android.gms.internal.ads.ki r1 = r8.f15125K     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x056b
            boolean r1 = r1.mo11705d()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x055f
            goto L_0x056b
        L_0x055f:
            com.google.android.gms.internal.ads.ki r1 = r8.f15125K     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x056e
            boolean r1 = r8.f15116B     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 != 0) goto L_0x056e
            r33.m17841e()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x056e
        L_0x056b:
            r8.m17847k(r9)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x056e:
            com.google.android.gms.internal.ads.ki r1 = r8.f15127M     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0677
        L_0x0572:
            com.google.android.gms.internal.ads.ki r1 = r8.f15127M     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ki r2 = r8.f15126L     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == r2) goto L_0x05a9
            long r3 = r8.f15124J     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ki r5 = r1.f12096l     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r5 = r5.f12090f     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x05a9
            r1.mo11704c()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ki r1 = r8.f15127M     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ki r1 = r1.f12096l     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m17848l(r1)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.li r1 = new com.google.android.gms.internal.ads.li     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ki r2 = r8.f15127M     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r3 = r2.f12091g     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r4 = r2.f12092h     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.<init>(r3, r4)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f15145s = r1     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r33.m17853q()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r1 = r8.f15141g     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 5
            com.google.android.gms.internal.ads.li r3 = r8.f15145s     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Message r1 = r1.obtainMessage(r2, r3)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendToTarget()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0572
        L_0x05a9:
            boolean r1 = r2.f12093i     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x05cf
            r1 = 0
        L_0x05ae:
            r2 = 2
            if (r1 >= r2) goto L_0x0677
            com.google.android.gms.internal.ads.wi[] r2 = r8.f15134a     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = r2[r1]     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ki r3 = r8.f15126L     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.oo[] r3 = r3.f12088d     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3 = r3[r1]     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x05cc
            com.google.android.gms.internal.ads.oo r4 = r2.mo8365U()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r4 != r3) goto L_0x05cc
            boolean r3 = r2.mo8375h0()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x05cc
            r2.mo8373g0()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x05cc:
            int r1 = r1 + 1
            goto L_0x05ae
        L_0x05cf:
            r1 = 0
        L_0x05d0:
            r2 = 2
            if (r1 >= r2) goto L_0x05ee
            com.google.android.gms.internal.ads.wi[] r2 = r8.f15134a     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = r2[r1]     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ki r3 = r8.f15126L     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.oo[] r3 = r3.f12088d     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3 = r3[r1]     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.oo r4 = r2.mo8365U()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r4 != r3) goto L_0x0677
            if (r3 == 0) goto L_0x05eb
            boolean r2 = r2.mo8375h0()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x0677
        L_0x05eb:
            int r1 = r1 + 1
            goto L_0x05d0
        L_0x05ee:
            com.google.android.gms.internal.ads.ki r1 = r8.f15126L     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ki r2 = r1.f12096l     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x0677
            boolean r3 = r2.f12094j     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x0677
            com.google.android.gms.internal.ads.jp r1 = r1.f12097m     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f15126L = r2     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.jp r3 = r2.f12097m     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.co r2 = r2.f12085a     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r4 = r2.mo9232U()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 0
            r6 = 2
        L_0x0606:
            if (r2 >= r6) goto L_0x0677
            com.google.android.gms.internal.ads.wi[] r6 = r8.f15134a     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r6 = r6[r2]     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.gp r7 = r1.f11731b     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.xo r7 = r7.mo10596a(r2)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r7 != 0) goto L_0x0619
        L_0x0614:
            r19 = r3
            r20 = r4
            goto L_0x066d
        L_0x0619:
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x0626
            r6.mo8373g0()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0614
        L_0x0626:
            boolean r7 = r6.mo8381l0()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r7 != 0) goto L_0x0614
            com.google.android.gms.internal.ads.gp r7 = r3.f11731b     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.xo r7 = r7.mo10596a(r2)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.yi[] r13 = r1.f11733d     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r13 = r13[r2]     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.yi[] r14 = r3.f11733d     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r14 = r14[r2]     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r7 == 0) goto L_0x0666
            boolean r13 = r14.equals(r13)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r13 == 0) goto L_0x0666
            r7.mo15197b()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.qi[] r13 = new com.google.android.gms.internal.ads.C2774qi[r10]     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r14 = 0
        L_0x0648:
            if (r14 > 0) goto L_0x0653
            com.google.android.gms.internal.ads.qi r15 = r7.mo15198c(r14)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r13[r14] = r15     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r14 = r14 + 1
            goto L_0x0648
        L_0x0653:
            com.google.android.gms.internal.ads.ki r7 = r8.f15126L     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.oo[] r14 = r7.f12088d     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r14 = r14[r2]     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r9 = r7.f12090f     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r19 = r3
            r20 = r4
            long r3 = r7.f12092h     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r9 = r9 - r3
            r6.mo8387o0(r13, r14, r9)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x066d
        L_0x0666:
            r19 = r3
            r20 = r4
            r6.mo8373g0()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x066d:
            int r2 = r2 + 1
            r3 = r19
            r4 = r20
            r6 = 2
            r9 = 0
            r10 = 1
            goto L_0x0606
        L_0x0677:
            com.google.android.gms.internal.ads.ki r1 = r8.f15127M     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 10
            if (r1 != 0) goto L_0x0686
            r33.m17842f()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.m17846j(r11, r2)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0683:
            r1 = 1
            goto L_0x080d
        L_0x0686:
            java.lang.String r1 = "doSomeWork"
            com.google.android.gms.internal.ads.C2819rq.m19992a(r1)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r33.m17853q()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ki r1 = r8.f15127M     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.co r1 = r1.f12085a     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.li r4 = r8.f15145s     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r4 = r4.f12811c     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.mo9239h0(r4)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.wi[] r1 = r8.f15150x     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r4 = r1.length     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r5 = 1
            r6 = 1
            r7 = 0
        L_0x069f:
            if (r7 >= r4) goto L_0x06d6
            r9 = r1[r7]     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r8.f15124J     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r2 = r8.f15121G     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r9.mo14083r0(r13, r2)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r6 == 0) goto L_0x06b4
            boolean r2 = r9.mo9928k0()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x06b4
            r6 = 1
            goto L_0x06b5
        L_0x06b4:
            r6 = 0
        L_0x06b5:
            boolean r2 = r9.mo9676i0()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x06c4
            boolean r2 = r9.mo9928k0()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 == 0) goto L_0x06c2
            goto L_0x06c4
        L_0x06c2:
            r2 = 0
            goto L_0x06c5
        L_0x06c4:
            r2 = 1
        L_0x06c5:
            if (r2 != 0) goto L_0x06ca
            r9.mo8368c0()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x06ca:
            if (r5 == 0) goto L_0x06d0
            if (r2 == 0) goto L_0x06d0
            r5 = 1
            goto L_0x06d1
        L_0x06d0:
            r5 = 0
        L_0x06d1:
            int r7 = r7 + 1
            r2 = 10
            goto L_0x069f
        L_0x06d6:
            if (r5 != 0) goto L_0x06db
            r33.m17842f()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x06db:
            com.google.android.gms.internal.ads.iq r1 = r8.f15148v     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x06fe
            com.google.android.gms.internal.ads.vi r1 = r1.mo9930u()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.vi r2 = r8.f15146t     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r2 = r1.equals(r2)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r2 != 0) goto L_0x06fe
            r8.f15146t = r1     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.pq r2 = r8.f15138d     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.iq r3 = r8.f15148v     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.mo13326d(r3)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r2 = r8.f15141g     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3 = 7
            android.os.Message r1 = r2.obtainMessage(r3, r1)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendToTarget()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x06fe:
            com.google.android.gms.internal.ads.cj r1 = r8.f15128N     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ki r2 = r8.f15127M     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2.f12091g     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.aj r3 = r8.f15144r     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r4 = 0
            com.google.android.gms.internal.ads.aj r1 = r1.mo9184d(r2, r3, r4)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r1 = r1.f6593c     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r6 == 0) goto L_0x072f
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x0720
            com.google.android.gms.internal.ads.li r3 = r8.f15145s     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r3.f12811c     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 > 0) goto L_0x072f
        L_0x0720:
            com.google.android.gms.internal.ads.ki r3 = r8.f15127M     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r3 = r3.f12093i     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x072f
            r3 = 4
            r8.m17849m(r3)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r33.m17852p()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x07c0
        L_0x072f:
            int r3 = r8.f15117C     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r4 = 2
            if (r3 != r4) goto L_0x07a6
            com.google.android.gms.internal.ads.wi[] r3 = r8.f15150x     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r3 = r3.length     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 <= 0) goto L_0x0794
            if (r5 == 0) goto L_0x07c0
            boolean r1 = r8.f15115A     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ki r2 = r8.f15125K     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r3 = r2.f12094j     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 != 0) goto L_0x0746
            long r2 = r2.f12092h     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x074c
        L_0x0746:
            com.google.android.gms.internal.ads.co r2 = r2.f12085a     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r2 = r2.mo9234c()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x074c:
            r4 = -9223372036854775808
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0766
            com.google.android.gms.internal.ads.ki r2 = r8.f15125K     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r3 = r2.f12093i     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 == 0) goto L_0x0759
            goto L_0x079a
        L_0x0759:
            com.google.android.gms.internal.ads.cj r3 = r8.f15128N     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r2.f12091g     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.aj r4 = r8.f15144r     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r5 = 0
            com.google.android.gms.internal.ads.aj r2 = r3.mo9184d(r2, r4, r5)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r2 = r2.f6593c     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0766:
            boolean r4 = r8.f15129O     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r4 == 0) goto L_0x0780
            com.google.android.gms.internal.ads.yp0 r2 = r8.f15135a0     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.li r3 = r8.f15145s     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r3 = r3.f12812d     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ki r5 = r8.f15125K     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r6 = r8.f15124J     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r9 = r5.f12090f     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r5.f12092h     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r9 = r9 - r13
            long r6 = r6 - r9
            long r3 = r3 - r6
            boolean r1 = r2.mo15490k(r3, r1)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0791
        L_0x0780:
            com.google.android.gms.internal.ads.yp0 r4 = r8.f15135a0     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.ki r5 = r8.f15125K     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r6 = r8.f15124J     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r9 = r5.f12090f     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r13 = r5.f12092h     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r9 = r9 - r13
            long r6 = r6 - r9
            long r2 = r2 - r6
            boolean r1 = r4.mo15490k(r2, r1)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0791:
            if (r1 == 0) goto L_0x07c0
            goto L_0x079a
        L_0x0794:
            boolean r1 = r8.m17855s(r1)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x07c0
        L_0x079a:
            r1 = 3
            r8.m17849m(r1)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            boolean r1 = r8.f15152z     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x07c0
            r33.m17850n()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x07c0
        L_0x07a6:
            r4 = 3
            if (r3 != r4) goto L_0x07c0
            com.google.android.gms.internal.ads.wi[] r3 = r8.f15150x     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r3 = r3.length     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r3 <= 0) goto L_0x07af
            goto L_0x07b3
        L_0x07af:
            boolean r5 = r8.m17855s(r1)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x07b3:
            if (r5 != 0) goto L_0x07c0
            boolean r1 = r8.f15152z     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f15115A = r1     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1 = 2
            r8.m17849m(r1)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r33.m17852p()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x07c0:
            int r1 = r8.f15117C     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 2
            if (r1 != r2) goto L_0x07d3
            com.google.android.gms.internal.ads.wi[] r1 = r8.f15150x     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r2 = r1.length     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r9 = 0
        L_0x07c9:
            if (r9 >= r2) goto L_0x07d3
            r3 = r1[r9]     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.mo8368c0()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r9 = r9 + 1
            goto L_0x07c9
        L_0x07d3:
            boolean r1 = r8.f15152z     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x07dc
            int r1 = r8.f15117C     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 3
            if (r1 == r2) goto L_0x07e1
        L_0x07dc:
            int r1 = r8.f15117C     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 2
            if (r1 != r2) goto L_0x07ef
        L_0x07e1:
            int r1 = r8.f15132R     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 <= 0) goto L_0x07e9
            int r1 = r8.f15132R     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r2 = (long) r1     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x07eb
        L_0x07e9:
            r2 = 10
        L_0x07eb:
            r8.m17846j(r11, r2)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0808
        L_0x07ef:
            com.google.android.gms.internal.ads.wi[] r1 = r8.f15150x     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r1.length     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0802
            int r1 = r8.f15133S     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 <= 0) goto L_0x07fc
            int r1 = r8.f15133S     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            long r1 = (long) r1     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x07fe
        L_0x07fc:
            r1 = r16
        L_0x07fe:
            r8.m17846j(r11, r1)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0808
        L_0x0802:
            android.os.Handler r1 = r8.f15139e     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 2
            r1.removeMessages(r2)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0808:
            com.google.android.gms.internal.ads.C2819rq.m19993b()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0683
        L_0x080d:
            return r1
        L_0x080e:
            int r1 = r1.arg1     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0814
            r1 = 1
            goto L_0x0815
        L_0x0814:
            r1 = 0
        L_0x0815:
            r2 = 0
            r8.f15115A = r2     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f15152z = r1     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 != 0) goto L_0x0824
            r33.m17852p()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r33.m17853q()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0822:
            r1 = 1
            goto L_0x083c
        L_0x0824:
            int r1 = r8.f15117C     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 3
            if (r1 != r2) goto L_0x0833
            r33.m17850n()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r1 = r8.f15139e     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2 = 2
            r1.sendEmptyMessage(r2)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0822
        L_0x0833:
            r2 = 2
            if (r1 != r2) goto L_0x0822
            android.os.Handler r1 = r8.f15139e     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1.sendEmptyMessage(r2)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            goto L_0x0822
        L_0x083c:
            return r1
        L_0x083d:
            java.lang.Object r2 = r1.obj     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.eo r2 = (com.google.android.gms.internal.ads.C2333eo) r2     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            int r1 = r1.arg1     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r3 = r8.f15141g     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r4 = 0
            r3.sendEmptyMessage(r4)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3 = 1
            r8.m17844h(r3)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.yp0 r3 = r8.f15135a0     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3.mo15480a()     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            if (r1 == 0) goto L_0x0860
            com.google.android.gms.internal.ads.li r1 = new com.google.android.gms.internal.ads.li     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.<init>(r4, r5)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r8.f15145s = r1     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
        L_0x0860:
            r8.f15149w = r2     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            com.google.android.gms.internal.ads.gi r1 = r8.f15142h     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r3 = 1
            r2.mo8446c(r1, r3, r8)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r1 = 2
            r8.m17849m(r1)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            android.os.Handler r2 = r8.f15139e     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            r2.sendEmptyMessage(r1)     // Catch:{ ci -> 0x0878, IOException -> 0x0872, RuntimeException -> 0x087e }
            return r3
        L_0x0872:
            r0 = move-exception
            r2 = r0
            r1 = 1
            r3 = 8
            goto L_0x08a0
        L_0x0878:
            r0 = move-exception
            r2 = r0
            r1 = 1
            r3 = 8
            goto L_0x08bd
        L_0x087e:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Internal runtime error."
            android.util.Log.e(r2, r3, r1)
            android.os.Handler r2 = r8.f15141g
            com.google.android.gms.internal.ads.ci r1 = com.google.android.gms.internal.ads.C2253ci.m10946c(r1)
            r3 = 8
            android.os.Message r1 = r2.obtainMessage(r3, r1)
            r1.sendToTarget()
            r33.m17851o()
            r1 = 1
            return r1
        L_0x089b:
            r0 = move-exception
            r1 = 1
            r3 = 8
            r2 = r0
        L_0x08a0:
            java.lang.String r4 = "ExoPlayerImplInternal"
            java.lang.String r5 = "Source error."
            android.util.Log.e(r4, r5, r2)
            android.os.Handler r4 = r8.f15141g
            com.google.android.gms.internal.ads.ci r2 = com.google.android.gms.internal.ads.C2253ci.m10945b(r2)
            android.os.Message r2 = r4.obtainMessage(r3, r2)
            r2.sendToTarget()
            r33.m17851o()
            return r1
        L_0x08b8:
            r0 = move-exception
            r1 = 1
            r3 = 8
            r2 = r0
        L_0x08bd:
            java.lang.String r4 = "ExoPlayerImplInternal"
            java.lang.String r5 = "Renderer error."
            android.util.Log.e(r4, r5, r2)
            android.os.Handler r4 = r8.f15141g
            android.os.Message r2 = r4.obtainMessage(r3, r2)
            r2.sendToTarget()
            r33.m17851o()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2699oi.handleMessage(android.os.Message):boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|13|14|23|20|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x001f, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0027 */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo12944v(com.google.android.gms.internal.ads.C2365fi... r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f15151y     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x000e
            java.lang.String r4 = "ExoPlayerImplInternal"
            java.lang.String r0 = "Ignoring messages sent after release."
            android.util.Log.w(r4, r0)     // Catch:{ all -> 0x0031 }
            monitor-exit(r3)
            return
        L_0x000e:
            int r0 = r3.f15119E     // Catch:{ all -> 0x0031 }
            int r1 = r0 + 1
            r3.f15119E = r1     // Catch:{ all -> 0x0031 }
            android.os.Handler r1 = r3.f15139e     // Catch:{ all -> 0x0031 }
            r2 = 11
            android.os.Message r4 = r1.obtainMessage(r2, r4)     // Catch:{ all -> 0x0031 }
            r4.sendToTarget()     // Catch:{ all -> 0x0031 }
        L_0x001f:
            int r4 = r3.f15120F     // Catch:{ all -> 0x0031 }
            if (r4 > r0) goto L_0x002f
            r3.wait()     // Catch:{ InterruptedException -> 0x0027 }
            goto L_0x001f
        L_0x0027:
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0031 }
            r4.interrupt()     // Catch:{ all -> 0x0031 }
            goto L_0x001f
        L_0x002f:
            monitor-exit(r3)
            return
        L_0x0031:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2699oi.mo12944v(com.google.android.gms.internal.ads.fi[]):void");
    }

    /* renamed from: w */
    public final void mo12945w() {
        this.f15129O = true;
    }

    /* renamed from: x */
    public final void mo12946x(int i) {
        this.f15131Q = i;
    }

    /* renamed from: y */
    public final void mo12947y() {
        this.f15130P = true;
    }

    /* renamed from: z */
    public final void mo12948z(C2333eo eoVar, boolean z) {
        this.f15139e.obtainMessage(0, 1, 0, eoVar).sendToTarget();
    }
}
