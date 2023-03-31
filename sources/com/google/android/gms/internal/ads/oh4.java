package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class oh4 implements kg4, tn4, tk4, yk4, ai4 {
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public static final Map f15076a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public static final C2388g4 f15077b0;

    /* renamed from: A */
    private boolean f15078A;

    /* renamed from: B */
    private boolean f15079B;

    /* renamed from: C */
    private nh4 f15080C;

    /* renamed from: D */
    private C2643n f15081D;

    /* renamed from: E */
    private long f15082E;

    /* renamed from: F */
    private boolean f15083F;

    /* renamed from: G */
    private int f15084G;

    /* renamed from: H */
    private boolean f15085H;

    /* renamed from: I */
    private boolean f15086I;

    /* renamed from: J */
    private int f15087J;

    /* renamed from: K */
    private boolean f15088K;

    /* renamed from: L */
    private long f15089L;

    /* renamed from: M */
    private long f15090M;

    /* renamed from: N */
    private boolean f15091N;

    /* renamed from: O */
    private int f15092O;

    /* renamed from: P */
    private boolean f15093P;

    /* renamed from: Q */
    private boolean f15094Q;

    /* renamed from: R */
    private final rk4 f15095R;

    /* renamed from: S */
    private final nk4 f15096S;

    /* renamed from: a */
    private final Uri f15097a;

    /* renamed from: b */
    private final ql2 f15098b;

    /* renamed from: c */
    private final rd4 f15099c;

    /* renamed from: d */
    private final vg4 f15100d;

    /* renamed from: e */
    private final ld4 f15101e;

    /* renamed from: f */
    private final kh4 f15102f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final long f15103g;

    /* renamed from: h */
    private final bl4 f15104h = new bl4("ProgressiveMediaPeriod");

    /* renamed from: i */
    private final eh4 f15105i;

    /* renamed from: r */
    private final yc1 f15106r;

    /* renamed from: s */
    private final Runnable f15107s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final Runnable f15108t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final Handler f15109u;

    /* renamed from: v */
    private jg4 f15110v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C2757q1 f15111w;

    /* renamed from: x */
    private bi4[] f15112x;

    /* renamed from: y */
    private mh4[] f15113y;

    /* renamed from: z */
    private boolean f15114z;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f15076a0 = Collections.unmodifiableMap(hashMap);
        C2311e2 e2Var = new C2311e2();
        e2Var.mo9764h("icy");
        e2Var.mo9776s("application/x-icy");
        f15077b0 = e2Var.mo9782y();
    }

    public oh4(Uri uri, ql2 ql2, eh4 eh4, rd4 rd4, ld4 ld4, rk4 rk4, vg4 vg4, kh4 kh4, nk4 nk4, String str, int i, byte[] bArr) {
        this.f15097a = uri;
        this.f15098b = ql2;
        this.f15099c = rd4;
        this.f15101e = ld4;
        this.f15095R = rk4;
        this.f15100d = vg4;
        this.f15102f = kh4;
        this.f15096S = nk4;
        this.f15103g = (long) i;
        this.f15105i = eh4;
        this.f15106r = new yc1(wa1.f19542a);
        this.f15107s = new fh4(this);
        this.f15108t = new gh4(this);
        this.f15109u = gb2.m13163d((Handler.Callback) null);
        this.f15113y = new mh4[0];
        this.f15112x = new bi4[0];
        this.f15090M = -9223372036854775807L;
        this.f15082E = -9223372036854775807L;
        this.f15084G = 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final long m17782A(boolean z) {
        long j = Long.MIN_VALUE;
        int i = 0;
        while (true) {
            bi4[] bi4Arr = this.f15112x;
            if (i >= bi4Arr.length) {
                return j;
            }
            if (!z) {
                nh4 nh4 = this.f15080C;
                Objects.requireNonNull(nh4);
                if (!nh4.f14025c[i]) {
                    i++;
                }
            }
            j = Math.max(j, bi4Arr[i].mo8829w());
            i++;
        }
    }

    /* renamed from: B */
    private final C2792r m17783B(mh4 mh4) {
        int length = this.f15112x.length;
        for (int i = 0; i < length; i++) {
            if (mh4.equals(this.f15113y[i])) {
                return this.f15112x[i];
            }
        }
        nk4 nk4 = this.f15096S;
        rd4 rd4 = this.f15099c;
        ld4 ld4 = this.f15101e;
        Objects.requireNonNull(rd4);
        bi4 bi4 = new bi4(nk4, rd4, ld4, (byte[]) null);
        bi4.mo8814G(this);
        int i2 = length + 1;
        mh4[] mh4Arr = (mh4[]) Arrays.copyOf(this.f15113y, i2);
        mh4Arr[length] = mh4;
        this.f15113y = (mh4[]) gb2.m13134D(mh4Arr);
        bi4[] bi4Arr = (bi4[]) Arrays.copyOf(this.f15112x, i2);
        bi4Arr[length] = bi4;
        this.f15112x = (bi4[]) gb2.m13134D(bi4Arr);
        return bi4;
    }

    /* renamed from: D */
    private final void m17784D() {
        v91.m22052f(this.f15078A);
        Objects.requireNonNull(this.f15080C);
        Objects.requireNonNull(this.f15081D);
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final void m17785E() {
        int i;
        k60 k60;
        if (!this.f15094Q && !this.f15078A && this.f15114z && this.f15081D != null) {
            bi4[] bi4Arr = this.f15112x;
            int length = bi4Arr.length;
            int i2 = 0;
            while (i2 < length) {
                if (bi4Arr[i2].mo8830x() != null) {
                    i2++;
                } else {
                    return;
                }
            }
            this.f15106r.mo15421c();
            int length2 = this.f15112x.length;
            gv0[] gv0Arr = new gv0[length2];
            boolean[] zArr = new boolean[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                C2388g4 x = this.f15112x[i3].mo8830x();
                Objects.requireNonNull(x);
                String str = x.f9673l;
                boolean g = d90.m11368g(str);
                boolean z = g || d90.m11369h(str);
                zArr[i3] = z;
                this.f15079B = z | this.f15079B;
                C2757q1 q1Var = this.f15111w;
                if (q1Var != null) {
                    if (g || this.f15113y[i3].f13340b) {
                        k60 k602 = x.f9671j;
                        if (k602 == null) {
                            k60 = new k60(-9223372036854775807L, q1Var);
                        } else {
                            k60 = k602.mo11570c(q1Var);
                        }
                        C2311e2 b = x.mo10384b();
                        b.mo9770m(k60);
                        x = b.mo9782y();
                    }
                    if (g && x.f9667f == -1 && x.f9668g == -1 && (i = q1Var.f16118a) != -1) {
                        C2311e2 b2 = x.mo10384b();
                        b2.mo9757d0(i);
                        x = b2.mo9782y();
                    }
                }
                gv0Arr[i3] = new gv0(Integer.toString(i3), x.mo10385c(this.f15099c.mo12589b(x)));
            }
            this.f15080C = new nh4(new ki4(gv0Arr), zArr);
            this.f15078A = true;
            jg4 jg4 = this.f15110v;
            Objects.requireNonNull(jg4);
            jg4.mo8359i(this);
        }
    }

    /* renamed from: F */
    private final void m17786F(int i) {
        m17784D();
        nh4 nh4 = this.f15080C;
        boolean[] zArr = nh4.f14026d;
        if (!zArr[i]) {
            C2388g4 b = nh4.f14023a.mo11711b(i).mo10649b(0);
            this.f15100d.mo14754d(d90.m11363b(b.f9673l), b, 0, (Object) null, this.f15089L);
            zArr[i] = true;
        }
    }

    /* renamed from: G */
    private final void m17787G(int i) {
        m17784D();
        boolean[] zArr = this.f15080C.f14024b;
        if (this.f15091N && zArr[i] && !this.f15112x[i].mo8817J(false)) {
            this.f15090M = 0;
            this.f15091N = false;
            this.f15086I = true;
            this.f15089L = 0;
            this.f15092O = 0;
            for (bi4 E : this.f15112x) {
                E.mo8812E(false);
            }
            jg4 jg4 = this.f15110v;
            Objects.requireNonNull(jg4);
            jg4.mo8358h(this);
        }
    }

    /* renamed from: H */
    private final void m17788H() {
        jh4 jh4 = new jh4(this, this.f15097a, this.f15098b, this.f15105i, this, this.f15106r);
        if (this.f15078A) {
            v91.m22052f(m17789I());
            long j = this.f15082E;
            if (j == -9223372036854775807L || this.f15090M <= j) {
                C2643n nVar = this.f15081D;
                Objects.requireNonNull(nVar);
                jh4.m14867g(jh4, nVar.mo8198V(this.f15090M).f12535a.f14772b, this.f15090M);
                for (bi4 F : this.f15112x) {
                    F.mo8813F(this.f15090M);
                }
                this.f15090M = -9223372036854775807L;
            } else {
                this.f15093P = true;
                this.f15090M = -9223372036854775807L;
                return;
            }
        }
        this.f15092O = m17801z();
        long a = this.f15104h.mo8861a(jh4, this, rk4.m19900a(this.f15084G));
        wq2 e = jh4.f11620k;
        this.f15100d.mo14762l(new cg4(jh4.f11610a, e, e.f19753a, Collections.emptyMap(), a, 0, 0), 1, -1, (C2388g4) null, 0, (Object) null, jh4.f11619j, this.f15082E);
    }

    /* renamed from: I */
    private final boolean m17789I() {
        return this.f15090M != -9223372036854775807L;
    }

    /* renamed from: J */
    private final boolean m17790J() {
        return this.f15086I || m17789I();
    }

    /* renamed from: z */
    private final int m17801z() {
        int i = 0;
        for (bi4 u : this.f15112x) {
            i += u.mo8827u();
        }
        return i;
    }

    /* renamed from: C */
    public final void mo10058C() {
        this.f15114z = true;
        this.f15109u.post(this.f15107s);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final int mo12919K(int i, c74 c74, fo3 fo3, int i2) {
        if (m17790J()) {
            return -3;
        }
        m17786F(i);
        int v = this.f15112x[i].mo8828v(c74, fo3, i2, this.f15093P);
        if (v == -3) {
            m17787G(i);
        }
        return v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final int mo12920L(int i, long j) {
        if (m17790J()) {
            return 0;
        }
        m17786F(i);
        bi4 bi4 = this.f15112x[i];
        int t = bi4.mo8826t(j, this.f15093P);
        bi4.mo8815H(t);
        if (t != 0) {
            return t;
        }
        m17787G(i);
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final C2792r mo12921Q() {
        return m17783B(new mh4(0, true));
    }

    /* renamed from: U */
    public final ki4 mo8348U() {
        m17784D();
        return this.f15080C.f14023a;
    }

    /* renamed from: X */
    public final void mo8349X() throws IOException {
        mo12929v();
        if (this.f15093P && !this.f15078A) {
            throw ea0.m11990a("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    /* renamed from: a */
    public final boolean mo8350a(long j) {
        if (this.f15093P || this.f15104h.mo8866k() || this.f15091N) {
            return false;
        }
        if (this.f15078A && this.f15087J == 0) {
            return false;
        }
        boolean e = this.f15106r.mo15423e();
        if (this.f15104h.mo8867l()) {
            return e;
        }
        m17788H();
        return true;
    }

    /* renamed from: b */
    public final long mo8351b() {
        if (!this.f15086I) {
            return -9223372036854775807L;
        }
        if (!this.f15093P && m17801z() <= this.f15092O) {
            return -9223372036854775807L;
        }
        this.f15086I = false;
        return this.f15089L;
    }

    /* renamed from: b0 */
    public final boolean mo8352b0() {
        return this.f15104h.mo8867l() && this.f15106r.mo15422d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r2 == 0) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d2  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo8353c(com.google.android.gms.internal.ads.xj4[] r8, boolean[] r9, com.google.android.gms.internal.ads.ci4[] r10, boolean[] r11, long r12) {
        /*
            r7 = this;
            r7.m17784D()
            com.google.android.gms.internal.ads.nh4 r0 = r7.f15080C
            com.google.android.gms.internal.ads.ki4 r1 = r0.f14023a
            boolean[] r0 = r0.f14025c
            int r2 = r7.f15087J
            r3 = 0
            r4 = 0
        L_0x000d:
            int r5 = r8.length
            if (r4 >= r5) goto L_0x0035
            r5 = r10[r4]
            if (r5 == 0) goto L_0x0032
            r6 = r8[r4]
            if (r6 == 0) goto L_0x001c
            boolean r6 = r9[r4]
            if (r6 != 0) goto L_0x0032
        L_0x001c:
            com.google.android.gms.internal.ads.lh4 r5 = (com.google.android.gms.internal.ads.lh4) r5
            int r5 = r5.f12807a
            boolean r6 = r0[r5]
            com.google.android.gms.internal.ads.v91.m22052f(r6)
            int r6 = r7.f15087J
            int r6 = r6 + -1
            r7.f15087J = r6
            r0[r5] = r3
            r5 = 0
            r10[r4] = r5
        L_0x0032:
            int r4 = r4 + 1
            goto L_0x000d
        L_0x0035:
            boolean r9 = r7.f15085H
            r4 = 0
            r6 = 1
            if (r9 == 0) goto L_0x003f
            if (r2 != 0) goto L_0x0046
            goto L_0x0043
        L_0x003f:
            int r9 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r9 == 0) goto L_0x0045
        L_0x0043:
            r9 = 1
            goto L_0x0047
        L_0x0045:
            r12 = r4
        L_0x0046:
            r9 = 0
        L_0x0047:
            r2 = 0
        L_0x0048:
            int r4 = r8.length
            if (r2 >= r4) goto L_0x00a1
            r4 = r10[r2]
            if (r4 != 0) goto L_0x009e
            r4 = r8[r2]
            if (r4 == 0) goto L_0x009e
            int r5 = r4.mo8852e()
            if (r5 != r6) goto L_0x005b
            r5 = 1
            goto L_0x005c
        L_0x005b:
            r5 = 0
        L_0x005c:
            com.google.android.gms.internal.ads.v91.m22052f(r5)
            int r5 = r4.mo8853g(r3)
            if (r5 != 0) goto L_0x0067
            r5 = 1
            goto L_0x0068
        L_0x0067:
            r5 = 0
        L_0x0068:
            com.google.android.gms.internal.ads.v91.m22052f(r5)
            com.google.android.gms.internal.ads.gv0 r4 = r4.mo8851a()
            int r4 = r1.mo11710a(r4)
            boolean r5 = r0[r4]
            r5 = r5 ^ r6
            com.google.android.gms.internal.ads.v91.m22052f(r5)
            int r5 = r7.f15087J
            int r5 = r5 + r6
            r7.f15087J = r5
            r0[r4] = r6
            com.google.android.gms.internal.ads.lh4 r5 = new com.google.android.gms.internal.ads.lh4
            r5.<init>(r7, r4)
            r10[r2] = r5
            r11[r2] = r6
            if (r9 != 0) goto L_0x009e
            com.google.android.gms.internal.ads.bi4[] r9 = r7.f15112x
            r9 = r9[r4]
            boolean r4 = r9.mo8818K(r12, r6)
            if (r4 != 0) goto L_0x009d
            int r9 = r9.mo8825s()
            if (r9 == 0) goto L_0x009d
            r9 = 1
            goto L_0x009e
        L_0x009d:
            r9 = 0
        L_0x009e:
            int r2 = r2 + 1
            goto L_0x0048
        L_0x00a1:
            int r8 = r7.f15087J
            if (r8 != 0) goto L_0x00d2
            r7.f15091N = r3
            r7.f15086I = r3
            com.google.android.gms.internal.ads.bl4 r8 = r7.f15104h
            boolean r8 = r8.mo8867l()
            if (r8 == 0) goto L_0x00c4
            com.google.android.gms.internal.ads.bi4[] r8 = r7.f15112x
            int r9 = r8.length
        L_0x00b4:
            if (r3 >= r9) goto L_0x00be
            r10 = r8[r3]
            r10.mo8832z()
            int r3 = r3 + 1
            goto L_0x00b4
        L_0x00be:
            com.google.android.gms.internal.ads.bl4 r8 = r7.f15104h
            r8.mo8862g()
            goto L_0x00e4
        L_0x00c4:
            com.google.android.gms.internal.ads.bi4[] r8 = r7.f15112x
            int r9 = r8.length
            r10 = 0
        L_0x00c8:
            if (r10 >= r9) goto L_0x00e4
            r11 = r8[r10]
            r11.mo8812E(r3)
            int r10 = r10 + 1
            goto L_0x00c8
        L_0x00d2:
            if (r9 == 0) goto L_0x00e4
            long r12 = r7.mo8362l(r12)
        L_0x00d8:
            int r8 = r10.length
            if (r3 >= r8) goto L_0x00e4
            r8 = r10[r3]
            if (r8 == 0) goto L_0x00e1
            r11[r3] = r6
        L_0x00e1:
            int r3 = r3 + 1
            goto L_0x00d8
        L_0x00e4:
            r7.f15085H = r6
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oh4.mo8353c(com.google.android.gms.internal.ads.xj4[], boolean[], com.google.android.gms.internal.ads.ci4[], boolean[], long):long");
    }

    /* renamed from: d */
    public final long mo8354d() {
        long j;
        m17784D();
        if (this.f15093P || this.f15087J == 0) {
            return Long.MIN_VALUE;
        }
        if (m17789I()) {
            return this.f15090M;
        }
        if (this.f15079B) {
            int length = this.f15112x.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                nh4 nh4 = this.f15080C;
                if (nh4.f14024b[i] && nh4.f14025c[i] && !this.f15112x[i].mo8816I()) {
                    j = Math.min(j, this.f15112x[i].mo8829w());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = m17782A(false);
        }
        return j == Long.MIN_VALUE ? this.f15089L : j;
    }

    /* renamed from: e */
    public final long mo8355e() {
        return mo8354d();
    }

    /* renamed from: f */
    public final long mo8356f(long j, a84 a84) {
        long j2;
        long j3 = j;
        a84 a842 = a84;
        m17784D();
        if (!this.f15081D.mo8197U()) {
            return 0;
        }
        C2569l V = this.f15081D.mo8198V(j3);
        long j4 = V.f12535a.f14771a;
        long j5 = V.f12536b.f14771a;
        long j6 = a842.f6474a;
        if (j6 != 0) {
            j2 = j6;
        } else if (a842.f6475b == 0) {
            return j3;
        } else {
            j2 = 0;
        }
        long j7 = j;
        long h0 = gb2.m13172h0(j7, j2, Long.MIN_VALUE);
        long a0 = gb2.m13158a0(j7, a842.f6475b, Long.MAX_VALUE);
        boolean z = true;
        boolean z2 = h0 <= j4 && j4 <= a0;
        if (h0 > j5 || j5 > a0) {
            z = false;
        }
        if (!z2 || !z) {
            if (!z2) {
                return z ? j5 : h0;
            }
        } else if (Math.abs(j4 - j3) > Math.abs(j5 - j3)) {
            return j5;
        }
        return j4;
    }

    /* renamed from: g */
    public final void mo8357g(long j, boolean z) {
        m17784D();
        if (!m17789I()) {
            boolean[] zArr = this.f15080C.f14025c;
            int length = this.f15112x.length;
            for (int i = 0; i < length; i++) {
                this.f15112x[i].mo8831y(j, false, zArr[i]);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fc  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.vk4 mo12922h(com.google.android.gms.internal.ads.xk4 r27, long r28, long r30, java.io.IOException r32, int r33) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            com.google.android.gms.internal.ads.jh4 r1 = (com.google.android.gms.internal.ads.jh4) r1
            com.google.android.gms.internal.ads.ud3 r2 = r1.f11612c
            com.google.android.gms.internal.ads.cg4 r15 = new com.google.android.gms.internal.ads.cg4
            long r4 = r1.f11610a
            com.google.android.gms.internal.ads.wq2 r6 = r1.f11620k
            android.net.Uri r7 = r2.mo14494n()
            java.util.Map r8 = r2.mo14495o()
            long r13 = r2.mo14493m()
            r3 = r15
            r9 = r28
            r11 = r30
            r3.<init>(r4, r6, r7, r8, r9, r11, r13)
            com.google.android.gms.internal.ads.ig4 r2 = new com.google.android.gms.internal.ads.ig4
            long r3 = r1.f11619j
            long r22 = com.google.android.gms.internal.ads.gb2.m13176j0(r3)
            long r3 = r0.f15082E
            long r24 = com.google.android.gms.internal.ads.gb2.m13176j0(r3)
            r17 = 1
            r18 = -1
            r19 = 0
            r20 = 0
            r21 = 0
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r24)
            com.google.android.gms.internal.ads.sk4 r3 = new com.google.android.gms.internal.ads.sk4
            r14 = r32
            r4 = r33
            r3.<init>(r15, r2, r14, r4)
            java.io.IOException r2 = r3.f17519c
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.ea0
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 != 0) goto L_0x008a
            boolean r4 = r2 instanceof java.io.FileNotFoundException
            if (r4 != 0) goto L_0x008a
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.i43
            if (r4 != 0) goto L_0x008a
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.al4
            if (r4 != 0) goto L_0x008a
        L_0x0067:
            if (r2 == 0) goto L_0x007c
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.rm2
            if (r4 == 0) goto L_0x0077
            r4 = r2
            com.google.android.gms.internal.ads.rm2 r4 = (com.google.android.gms.internal.ads.rm2) r4
            int r4 = r4.f17020a
            r7 = 2008(0x7d8, float:2.814E-42)
            if (r4 != r7) goto L_0x0077
            goto L_0x008a
        L_0x0077:
            java.lang.Throwable r2 = r2.getCause()
            goto L_0x0067
        L_0x007c:
            int r2 = r3.f17520d
            int r2 = r2 + -1
            int r2 = r2 * 1000
            r3 = 5000(0x1388, float:7.006E-42)
            int r2 = java.lang.Math.min(r2, r3)
            long r2 = (long) r2
            goto L_0x008b
        L_0x008a:
            r2 = r5
        L_0x008b:
            r4 = 1
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0093
            com.google.android.gms.internal.ads.vk4 r2 = com.google.android.gms.internal.ads.bl4.f7347g
            goto L_0x00df
        L_0x0093:
            int r7 = r26.m17801z()
            int r8 = r0.f15092O
            r9 = 0
            if (r7 <= r8) goto L_0x009e
            r8 = 1
            goto L_0x009f
        L_0x009e:
            r8 = 0
        L_0x009f:
            boolean r10 = r0.f15088K
            if (r10 != 0) goto L_0x00d9
            com.google.android.gms.internal.ads.n r10 = r0.f15081D
            if (r10 == 0) goto L_0x00b0
            long r10 = r10.mo8199a()
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 == 0) goto L_0x00b0
            goto L_0x00d9
        L_0x00b0:
            boolean r5 = r0.f15078A
            if (r5 == 0) goto L_0x00bf
            boolean r6 = r26.m17790J()
            if (r6 != 0) goto L_0x00bf
            r0.f15091N = r4
            com.google.android.gms.internal.ads.vk4 r2 = com.google.android.gms.internal.ads.bl4.f7346f
            goto L_0x00df
        L_0x00bf:
            r0.f15086I = r5
            r5 = 0
            r0.f15089L = r5
            r0.f15092O = r9
            com.google.android.gms.internal.ads.bi4[] r7 = r0.f15112x
            int r10 = r7.length
            r11 = 0
        L_0x00cb:
            if (r11 >= r10) goto L_0x00d5
            r12 = r7[r11]
            r12.mo8812E(r9)
            int r11 = r11 + 1
            goto L_0x00cb
        L_0x00d5:
            com.google.android.gms.internal.ads.jh4.m14867g(r1, r5, r5)
            goto L_0x00db
        L_0x00d9:
            r0.f15092O = r7
        L_0x00db:
            com.google.android.gms.internal.ads.vk4 r2 = com.google.android.gms.internal.ads.bl4.m10462b(r8, r2)
        L_0x00df:
            boolean r3 = r2.mo14781c()
            r16 = r3 ^ 1
            com.google.android.gms.internal.ads.vg4 r3 = r0.f15100d
            r5 = 1
            r6 = -1
            r7 = 0
            r8 = 0
            r9 = 0
            long r10 = r1.f11619j
            long r12 = r0.f15082E
            r4 = r15
            r14 = r32
            r15 = r16
            r3.mo14760j(r4, r5, r6, r7, r8, r9, r10, r12, r14, r15)
            if (r16 == 0) goto L_0x00ff
            long unused = r1.f11610a
        L_0x00ff:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oh4.mo12922h(com.google.android.gms.internal.ads.xk4, long, long, java.io.IOException, int):com.google.android.gms.internal.ads.vk4");
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo12923i(xk4 xk4, long j, long j2) {
        C2643n nVar;
        if (this.f15082E == -9223372036854775807L && (nVar = this.f15081D) != null) {
            boolean U = nVar.mo8197U();
            long A = m17782A(true);
            long j3 = A == Long.MIN_VALUE ? 0 : A + 10000;
            this.f15082E = j3;
            this.f15102f.mo11701c(j3, U, this.f15083F);
        }
        jh4 jh4 = (jh4) xk4;
        ud3 f = jh4.f11612c;
        cg4 cg4 = new cg4(jh4.f11610a, jh4.f11620k, f.mo14494n(), f.mo14495o(), j, j2, f.mo14493m());
        long unused = jh4.f11610a;
        this.f15100d.mo14758h(cg4, 1, -1, (C2388g4) null, 0, (Object) null, jh4.f11619j, this.f15082E);
        this.f15093P = true;
        jg4 jg4 = this.f15110v;
        Objects.requireNonNull(jg4);
        jg4.mo8358h(this);
    }

    /* renamed from: j */
    public final void mo10059j(C2643n nVar) {
        this.f15109u.post(new ih4(this, nVar));
    }

    /* renamed from: j0 */
    public final void mo8361j0(long j) {
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo12924k(xk4 xk4, long j, long j2, boolean z) {
        jh4 jh4 = (jh4) xk4;
        ud3 f = jh4.f11612c;
        cg4 cg4 = new cg4(jh4.f11610a, jh4.f11620k, f.mo14494n(), f.mo14495o(), j, j2, f.mo14493m());
        long unused = jh4.f11610a;
        this.f15100d.mo14756f(cg4, 1, -1, (C2388g4) null, 0, (Object) null, jh4.f11619j, this.f15082E);
        if (!z) {
            for (bi4 E : this.f15112x) {
                E.mo8812E(false);
            }
            if (this.f15087J > 0) {
                jg4 jg4 = this.f15110v;
                Objects.requireNonNull(jg4);
                jg4.mo8358h(this);
            }
        }
    }

    /* renamed from: l */
    public final long mo8362l(long j) {
        m17784D();
        boolean[] zArr = this.f15080C.f14024b;
        if (true != this.f15081D.mo8197U()) {
            j = 0;
        }
        this.f15086I = false;
        this.f15089L = j;
        if (m17789I()) {
            this.f15090M = j;
            return j;
        }
        if (this.f15084G != 7) {
            int length = this.f15112x.length;
            int i = 0;
            while (i < length) {
                if (this.f15112x[i].mo8818K(j, false) || (!zArr[i] && this.f15079B)) {
                    i++;
                }
            }
            return j;
        }
        this.f15091N = false;
        this.f15090M = j;
        this.f15093P = false;
        bl4 bl4 = this.f15104h;
        if (bl4.mo8867l()) {
            for (bi4 z : this.f15112x) {
                z.mo8832z();
            }
            this.f15104h.mo8862g();
        } else {
            bl4.mo8863h();
            for (bi4 E : this.f15112x) {
                E.mo8812E(false);
            }
        }
        return j;
    }

    /* renamed from: m */
    public final void mo8391m(C2388g4 g4Var) {
        this.f15109u.post(this.f15107s);
    }

    /* renamed from: n */
    public final C2792r mo10060n(int i, int i2) {
        return m17783B(new mh4(i, false));
    }

    /* renamed from: o */
    public final void mo8363o(jg4 jg4, long j) {
        this.f15110v = jg4;
        this.f15106r.mo15423e();
        m17788H();
    }

    /* renamed from: r */
    public final void mo12925r() {
        for (bi4 D : this.f15112x) {
            D.mo8811D();
        }
        this.f15105i.mo9918a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final /* synthetic */ void mo12926s() {
        if (!this.f15094Q) {
            jg4 jg4 = this.f15110v;
            Objects.requireNonNull(jg4);
            jg4.mo8358h(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final /* synthetic */ void mo12927t() {
        this.f15088K = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final /* synthetic */ void mo12928u(C2643n nVar) {
        C2643n nVar2;
        if (this.f15111w == null) {
            nVar2 = nVar;
        } else {
            nVar2 = new C2606m(-9223372036854775807L, 0);
        }
        this.f15081D = nVar2;
        this.f15082E = nVar.mo8199a();
        boolean z = false;
        int i = 1;
        if (!this.f15088K && nVar.mo8199a() == -9223372036854775807L) {
            z = true;
        }
        this.f15083F = z;
        if (true == z) {
            i = 7;
        }
        this.f15084G = i;
        this.f15102f.mo11701c(this.f15082E, nVar.mo8197U(), this.f15083F);
        if (!this.f15078A) {
            m17785E();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo12929v() throws IOException {
        this.f15104h.mo8864i(rk4.m19900a(this.f15084G));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo12930w(int i) throws IOException {
        this.f15112x[i].mo8809B();
        mo12929v();
    }

    /* renamed from: x */
    public final void mo12931x() {
        if (this.f15078A) {
            for (bi4 C : this.f15112x) {
                C.mo8810C();
            }
        }
        this.f15104h.mo8865j(this);
        this.f15109u.removeCallbacksAndMessages((Object) null);
        this.f15110v = null;
        this.f15094Q = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final boolean mo12932y(int i) {
        return !m17790J() && this.f15112x[i].mo8817J(this.f15093P);
    }
}
