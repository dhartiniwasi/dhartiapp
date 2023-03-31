package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class bi4 implements C2792r {

    /* renamed from: A */
    private boolean f7280A;

    /* renamed from: B */
    private boolean f7281B;

    /* renamed from: C */
    private sd4 f7282C;

    /* renamed from: a */
    private final vh4 f7283a;

    /* renamed from: b */
    private final xh4 f7284b = new xh4();

    /* renamed from: c */
    private final ii4 f7285c = new ii4(wh4.f19636a);

    /* renamed from: d */
    private final rd4 f7286d;

    /* renamed from: e */
    private final ld4 f7287e;

    /* renamed from: f */
    private ai4 f7288f;

    /* renamed from: g */
    private C2388g4 f7289g;

    /* renamed from: h */
    private int f7290h = AdError.NETWORK_ERROR_CODE;

    /* renamed from: i */
    private int[] f7291i = new int[AdError.NETWORK_ERROR_CODE];

    /* renamed from: j */
    private long[] f7292j = new long[AdError.NETWORK_ERROR_CODE];

    /* renamed from: k */
    private int[] f7293k = new int[AdError.NETWORK_ERROR_CODE];

    /* renamed from: l */
    private int[] f7294l = new int[AdError.NETWORK_ERROR_CODE];

    /* renamed from: m */
    private long[] f7295m = new long[AdError.NETWORK_ERROR_CODE];

    /* renamed from: n */
    private C2755q[] f7296n = new C2755q[AdError.NETWORK_ERROR_CODE];

    /* renamed from: o */
    private int f7297o;

    /* renamed from: p */
    private int f7298p;

    /* renamed from: q */
    private int f7299q;

    /* renamed from: r */
    private int f7300r;

    /* renamed from: s */
    private long f7301s = Long.MIN_VALUE;

    /* renamed from: t */
    private long f7302t = Long.MIN_VALUE;

    /* renamed from: u */
    private long f7303u = Long.MIN_VALUE;

    /* renamed from: v */
    private boolean f7304v;

    /* renamed from: w */
    private boolean f7305w = true;

    /* renamed from: x */
    private boolean f7306x = true;

    /* renamed from: y */
    private C2388g4 f7307y;

    /* renamed from: z */
    private C2388g4 f7308z;

    protected bi4(nk4 nk4, rd4 rd4, ld4 ld4, byte[] bArr) {
        this.f7286d = rd4;
        this.f7287e = ld4;
        this.f7283a = new vh4(nk4, (byte[]) null);
    }

    /* renamed from: A */
    static /* synthetic */ void m10390A(zh4 zh4) {
        qd4 qd4 = zh4.f21088b;
        int i = pd4.f15811a;
    }

    /* renamed from: L */
    private final int m10391L(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = (this.f7295m[i] > j ? 1 : (this.f7295m[i] == j ? 0 : -1));
            if (i5 > 0) {
                break;
            }
            if (!z || (this.f7294l[i] & 1) != 0) {
                i3 = i4;
                if (i5 == 0) {
                    break;
                }
            }
            i++;
            if (i == this.f7290h) {
                i = 0;
            }
        }
        return i3;
    }

    /* renamed from: g */
    private final int m10392g(int i) {
        int i2 = this.f7299q + i;
        int i3 = this.f7290h;
        return i2 < i3 ? i2 : i2 - i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
        return -3;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized int m10393h(com.google.android.gms.internal.ads.c74 r6, com.google.android.gms.internal.ads.fo3 r7, boolean r8, boolean r9, com.google.android.gms.internal.ads.xh4 r10) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            r7.f9374d = r0     // Catch:{ all -> 0x0083 }
            boolean r0 = r5.m10401p()     // Catch:{ all -> 0x0083 }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 != 0) goto L_0x002b
            if (r9 != 0) goto L_0x0025
            boolean r9 = r5.f7304v     // Catch:{ all -> 0x0083 }
            if (r9 == 0) goto L_0x0014
            goto L_0x0025
        L_0x0014:
            com.google.android.gms.internal.ads.g4 r7 = r5.f7308z     // Catch:{ all -> 0x0083 }
            if (r7 == 0) goto L_0x0023
            if (r8 != 0) goto L_0x001e
            com.google.android.gms.internal.ads.g4 r8 = r5.f7289g     // Catch:{ all -> 0x0083 }
            if (r7 == r8) goto L_0x0023
        L_0x001e:
            r5.m10398m(r7, r6)     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r1
        L_0x0023:
            monitor-exit(r5)
            return r2
        L_0x0025:
            r6 = 4
            r7.mo15594c(r6)     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r3
        L_0x002b:
            com.google.android.gms.internal.ads.ii4 r9 = r5.f7285c     // Catch:{ all -> 0x0083 }
            int r0 = r5.f7298p     // Catch:{ all -> 0x0083 }
            int r4 = r5.f7300r     // Catch:{ all -> 0x0083 }
            int r0 = r0 + r4
            java.lang.Object r9 = r9.mo11118a(r0)     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.zh4 r9 = (com.google.android.gms.internal.ads.zh4) r9     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.g4 r9 = r9.f21087a     // Catch:{ all -> 0x0083 }
            if (r8 != 0) goto L_0x007e
            com.google.android.gms.internal.ads.g4 r8 = r5.f7289g     // Catch:{ all -> 0x0083 }
            if (r9 == r8) goto L_0x0041
            goto L_0x007e
        L_0x0041:
            int r6 = r5.f7300r     // Catch:{ all -> 0x0083 }
            int r6 = r5.m10392g(r6)     // Catch:{ all -> 0x0083 }
            boolean r8 = r5.m10402q(r6)     // Catch:{ all -> 0x0083 }
            if (r8 != 0) goto L_0x0052
            r6 = 1
            r7.f9374d = r6     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r2
        L_0x0052:
            int[] r8 = r5.f7294l     // Catch:{ all -> 0x0083 }
            r8 = r8[r6]     // Catch:{ all -> 0x0083 }
            r7.mo15594c(r8)     // Catch:{ all -> 0x0083 }
            long[] r8 = r5.f7295m     // Catch:{ all -> 0x0083 }
            r0 = r8[r6]     // Catch:{ all -> 0x0083 }
            r7.f9375e = r0     // Catch:{ all -> 0x0083 }
            long r8 = r5.f7301s     // Catch:{ all -> 0x0083 }
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x006a
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r7.mo15593a(r8)     // Catch:{ all -> 0x0083 }
        L_0x006a:
            int[] r7 = r5.f7293k     // Catch:{ all -> 0x0083 }
            r7 = r7[r6]     // Catch:{ all -> 0x0083 }
            r10.f20107a = r7     // Catch:{ all -> 0x0083 }
            long[] r7 = r5.f7292j     // Catch:{ all -> 0x0083 }
            r8 = r7[r6]     // Catch:{ all -> 0x0083 }
            r10.f20108b = r8     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.q[] r7 = r5.f7296n     // Catch:{ all -> 0x0083 }
            r6 = r7[r6]     // Catch:{ all -> 0x0083 }
            r10.f20109c = r6     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r3
        L_0x007e:
            r5.m10398m(r9, r6)     // Catch:{ all -> 0x0083 }
            monitor-exit(r5)
            return r1
        L_0x0083:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bi4.m10393h(com.google.android.gms.internal.ads.c74, com.google.android.gms.internal.ads.fo3, boolean, boolean, com.google.android.gms.internal.ads.xh4):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        return -1;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized long m10394i(long r10, boolean r12, boolean r13) {
        /*
            r9 = this;
            monitor-enter(r9)
            int r12 = r9.f7297o     // Catch:{ all -> 0x002f }
            r0 = -1
            if (r12 == 0) goto L_0x002d
            long[] r2 = r9.f7295m     // Catch:{ all -> 0x002f }
            int r4 = r9.f7299q     // Catch:{ all -> 0x002f }
            r5 = r2[r4]     // Catch:{ all -> 0x002f }
            int r2 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0012
            goto L_0x002d
        L_0x0012:
            if (r13 == 0) goto L_0x001a
            int r13 = r9.f7300r     // Catch:{ all -> 0x002f }
            if (r13 == r12) goto L_0x001a
            int r12 = r13 + 1
        L_0x001a:
            r5 = r12
            r8 = 0
            r3 = r9
            r6 = r10
            int r10 = r3.m10391L(r4, r5, r6, r8)     // Catch:{ all -> 0x002f }
            r11 = -1
            if (r10 != r11) goto L_0x0027
            monitor-exit(r9)
            return r0
        L_0x0027:
            long r10 = r9.m10396k(r10)     // Catch:{ all -> 0x002f }
            monitor-exit(r9)
            return r10
        L_0x002d:
            monitor-exit(r9)
            return r0
        L_0x002f:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bi4.m10394i(long, boolean, boolean):long");
    }

    /* renamed from: j */
    private final synchronized long m10395j() {
        int i = this.f7297o;
        if (i == 0) {
            return -1;
        }
        return m10396k(i);
    }

    /* renamed from: k */
    private final long m10396k(int i) {
        long j = this.f7302t;
        long j2 = Long.MIN_VALUE;
        if (i != 0) {
            int g = m10392g(i - 1);
            for (int i2 = 0; i2 < i; i2++) {
                j2 = Math.max(j2, this.f7295m[g]);
                if ((this.f7294l[g] & 1) != 0) {
                    break;
                }
                g--;
                if (g == -1) {
                    g = this.f7290h - 1;
                }
            }
        }
        this.f7302t = Math.max(j, j2);
        this.f7297o -= i;
        int i3 = this.f7298p + i;
        this.f7298p = i3;
        int i4 = this.f7299q + i;
        this.f7299q = i4;
        int i5 = this.f7290h;
        if (i4 >= i5) {
            this.f7299q = i4 - i5;
        }
        int i6 = this.f7300r - i;
        this.f7300r = i6;
        if (i6 < 0) {
            this.f7300r = 0;
        }
        this.f7285c.mo11122e(i3);
        if (this.f7297o != 0) {
            return this.f7292j[this.f7299q];
        }
        int i7 = this.f7299q;
        if (i7 == 0) {
            i7 = this.f7290h;
        }
        int i8 = i7 - 1;
        return this.f7292j[i8] + ((long) this.f7293k[i8]);
    }

    /* renamed from: l */
    private final synchronized void m10397l(long j, int i, long j2, int i2, C2755q qVar) {
        int i3 = this.f7297o;
        if (i3 > 0) {
            int g = m10392g(i3 - 1);
            v91.m22050d(this.f7292j[g] + ((long) this.f7293k[g]) <= j2);
        }
        this.f7304v = (536870912 & i) != 0;
        this.f7303u = Math.max(this.f7303u, j);
        int g2 = m10392g(this.f7297o);
        this.f7295m[g2] = j;
        this.f7292j[g2] = j2;
        this.f7293k[g2] = i2;
        this.f7294l[g2] = i;
        this.f7296n[g2] = qVar;
        this.f7291i[g2] = 0;
        if (this.f7285c.mo11123f() || !((zh4) this.f7285c.mo11119b()).f21087a.equals(this.f7308z)) {
            qd4 qd4 = qd4.f16350a;
            ii4 ii4 = this.f7285c;
            int i4 = this.f7298p + this.f7297o;
            C2388g4 g4Var = this.f7308z;
            Objects.requireNonNull(g4Var);
            ii4.mo11120c(i4, new zh4(g4Var, qd4, (yh4) null));
        }
        int i5 = this.f7297o + 1;
        this.f7297o = i5;
        int i6 = this.f7290h;
        if (i5 == i6) {
            int i7 = i6 + AdError.NETWORK_ERROR_CODE;
            int[] iArr = new int[i7];
            long[] jArr = new long[i7];
            long[] jArr2 = new long[i7];
            int[] iArr2 = new int[i7];
            int[] iArr3 = new int[i7];
            C2755q[] qVarArr = new C2755q[i7];
            int i8 = this.f7299q;
            int i9 = i6 - i8;
            System.arraycopy(this.f7292j, i8, jArr, 0, i9);
            System.arraycopy(this.f7295m, this.f7299q, jArr2, 0, i9);
            System.arraycopy(this.f7294l, this.f7299q, iArr2, 0, i9);
            System.arraycopy(this.f7293k, this.f7299q, iArr3, 0, i9);
            System.arraycopy(this.f7296n, this.f7299q, qVarArr, 0, i9);
            System.arraycopy(this.f7291i, this.f7299q, iArr, 0, i9);
            int i10 = this.f7299q;
            System.arraycopy(this.f7292j, 0, jArr, i9, i10);
            System.arraycopy(this.f7295m, 0, jArr2, i9, i10);
            System.arraycopy(this.f7294l, 0, iArr2, i9, i10);
            System.arraycopy(this.f7293k, 0, iArr3, i9, i10);
            System.arraycopy(this.f7296n, 0, qVarArr, i9, i10);
            System.arraycopy(this.f7291i, 0, iArr, i9, i10);
            this.f7292j = jArr;
            this.f7295m = jArr2;
            this.f7294l = iArr2;
            this.f7293k = iArr3;
            this.f7296n = qVarArr;
            this.f7291i = iArr;
            this.f7299q = 0;
            this.f7290h = i7;
        }
    }

    /* renamed from: m */
    private final void m10398m(C2388g4 g4Var, c74 c74) {
        fl4 fl4;
        C2388g4 g4Var2 = this.f7289g;
        sd4 sd4 = null;
        if (g4Var2 == null) {
            fl4 = null;
        } else {
            fl4 = g4Var2.f9676o;
        }
        this.f7289g = g4Var;
        fl4 fl42 = g4Var.f9676o;
        c74.f7638a = g4Var.mo10385c(this.f7286d.mo12589b(g4Var));
        c74.f7639b = this.f7282C;
        if (g4Var2 == null || !gb2.m13186t(fl4, fl42)) {
            if (g4Var.f9676o != null) {
                sd4 = new sd4(new jd4(new ud4(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
            }
            this.f7282C = sd4;
            c74.f7639b = sd4;
        }
    }

    /* renamed from: n */
    private final void m10399n() {
        if (this.f7282C != null) {
            this.f7282C = null;
            this.f7289g = null;
        }
    }

    /* renamed from: o */
    private final synchronized void m10400o() {
        this.f7300r = 0;
        this.f7283a.mo14771g();
    }

    /* renamed from: p */
    private final boolean m10401p() {
        return this.f7300r != this.f7297o;
    }

    /* renamed from: q */
    private final boolean m10402q(int i) {
        if (this.f7282C != null) {
            return (this.f7294l[i] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    /* renamed from: r */
    private final synchronized boolean m10403r(C2388g4 g4Var) {
        this.f7306x = false;
        if (gb2.m13186t(g4Var, this.f7308z)) {
            return false;
        }
        if (this.f7285c.mo11123f() || !((zh4) this.f7285c.mo11119b()).f21087a.equals(g4Var)) {
            this.f7308z = g4Var;
        } else {
            this.f7308z = ((zh4) this.f7285c.mo11119b()).f21087a;
        }
        C2388g4 g4Var2 = this.f7308z;
        this.f7280A = d90.m11367f(g4Var2.f9673l, g4Var2.f9670i);
        this.f7281B = false;
        return true;
    }

    /* renamed from: B */
    public final void mo8809B() throws IOException {
        sd4 sd4 = this.f7282C;
        if (sd4 != null) {
            throw sd4.mo13977a();
        }
    }

    /* renamed from: C */
    public final void mo8810C() {
        mo8832z();
        m10399n();
    }

    /* renamed from: D */
    public final void mo8811D() {
        mo8812E(true);
        m10399n();
    }

    /* renamed from: E */
    public final void mo8812E(boolean z) {
        this.f7283a.mo14770f();
        this.f7297o = 0;
        this.f7298p = 0;
        this.f7299q = 0;
        this.f7300r = 0;
        this.f7305w = true;
        this.f7301s = Long.MIN_VALUE;
        this.f7302t = Long.MIN_VALUE;
        this.f7303u = Long.MIN_VALUE;
        this.f7304v = false;
        this.f7285c.mo11121d();
        if (z) {
            this.f7307y = null;
            this.f7308z = null;
            this.f7306x = true;
        }
    }

    /* renamed from: F */
    public final void mo8813F(long j) {
        this.f7301s = j;
    }

    /* renamed from: G */
    public final void mo8814G(ai4 ai4) {
        this.f7288f = ai4;
    }

    /* renamed from: H */
    public final synchronized void mo8815H(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.f7300r + i <= this.f7297o) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        v91.m22050d(z);
        this.f7300r += i;
    }

    /* renamed from: I */
    public final synchronized boolean mo8816I() {
        return this.f7304v;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001c, code lost:
        return r1;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo8817J(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.m10401p()     // Catch:{ all -> 0x003e }
            r1 = 1
            if (r0 != 0) goto L_0x001d
            r0 = 0
            if (r4 != 0) goto L_0x001b
            boolean r4 = r3.f7304v     // Catch:{ all -> 0x003e }
            if (r4 != 0) goto L_0x001b
            com.google.android.gms.internal.ads.g4 r4 = r3.f7308z     // Catch:{ all -> 0x003e }
            if (r4 == 0) goto L_0x001a
            com.google.android.gms.internal.ads.g4 r2 = r3.f7289g     // Catch:{ all -> 0x003e }
            if (r4 == r2) goto L_0x0018
            goto L_0x001b
        L_0x0018:
            monitor-exit(r3)
            return r0
        L_0x001a:
            r1 = 0
        L_0x001b:
            monitor-exit(r3)
            return r1
        L_0x001d:
            com.google.android.gms.internal.ads.ii4 r4 = r3.f7285c     // Catch:{ all -> 0x003e }
            int r0 = r3.f7298p     // Catch:{ all -> 0x003e }
            int r2 = r3.f7300r     // Catch:{ all -> 0x003e }
            int r0 = r0 + r2
            java.lang.Object r4 = r4.mo11118a(r0)     // Catch:{ all -> 0x003e }
            com.google.android.gms.internal.ads.zh4 r4 = (com.google.android.gms.internal.ads.zh4) r4     // Catch:{ all -> 0x003e }
            com.google.android.gms.internal.ads.g4 r4 = r4.f21087a     // Catch:{ all -> 0x003e }
            com.google.android.gms.internal.ads.g4 r0 = r3.f7289g     // Catch:{ all -> 0x003e }
            if (r4 == r0) goto L_0x0032
            monitor-exit(r3)
            return r1
        L_0x0032:
            int r4 = r3.f7300r     // Catch:{ all -> 0x003e }
            int r4 = r3.m10392g(r4)     // Catch:{ all -> 0x003e }
            boolean r4 = r3.m10402q(r4)     // Catch:{ all -> 0x003e }
            monitor-exit(r3)
            return r4
        L_0x003e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bi4.mo8817J(boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        return false;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo8818K(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.m10400o()     // Catch:{ all -> 0x003d }
            int r0 = r8.f7300r     // Catch:{ all -> 0x003d }
            int r2 = r8.m10392g(r0)     // Catch:{ all -> 0x003d }
            boolean r1 = r8.m10401p()     // Catch:{ all -> 0x003d }
            r7 = 0
            if (r1 == 0) goto L_0x003b
            long[] r1 = r8.f7295m     // Catch:{ all -> 0x003d }
            r3 = r1[r2]     // Catch:{ all -> 0x003d }
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x003b
            long r3 = r8.f7303u     // Catch:{ all -> 0x003d }
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0021
            if (r11 == 0) goto L_0x003b
        L_0x0021:
            int r11 = r8.f7297o     // Catch:{ all -> 0x003d }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r11 = r1.m10391L(r2, r3, r4, r6)     // Catch:{ all -> 0x003d }
            r0 = -1
            if (r11 != r0) goto L_0x0031
            monitor-exit(r8)
            return r7
        L_0x0031:
            r8.f7301s = r9     // Catch:{ all -> 0x003d }
            int r9 = r8.f7300r     // Catch:{ all -> 0x003d }
            int r9 = r9 + r11
            r8.f7300r = r9     // Catch:{ all -> 0x003d }
            r9 = 1
            monitor-exit(r8)
            return r9
        L_0x003b:
            monitor-exit(r8)
            return r7
        L_0x003d:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bi4.mo8818K(long, boolean):boolean");
    }

    /* renamed from: a */
    public final /* synthetic */ int mo8819a(cf4 cf4, int i, boolean z) {
        return C2717p.m18260a(this, cf4, i, z);
    }

    /* renamed from: b */
    public final int mo8820b(cf4 cf4, int i, boolean z, int i2) throws IOException {
        return this.f7283a.mo14765a(cf4, i, z);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo8821c(y22 y22, int i) {
        C2717p.m18261b(this, y22, i);
    }

    /* renamed from: d */
    public final void mo8822d(y22 y22, int i, int i2) {
        this.f7283a.mo14772h(y22, i);
    }

    /* renamed from: e */
    public final void mo8823e(C2388g4 g4Var) {
        this.f7307y = g4Var;
        boolean r = m10403r(g4Var);
        ai4 ai4 = this.f7288f;
        if (ai4 != null && r) {
            ai4.mo8391m(g4Var);
        }
    }

    /* renamed from: f */
    public final void mo8824f(long j, int i, int i2, int i3, C2755q qVar) {
        int i4 = i & 1;
        if (this.f7305w) {
            if (i4 != 0) {
                this.f7305w = false;
            } else {
                return;
            }
        }
        if (this.f7280A) {
            if (j >= this.f7301s) {
                if (i4 == 0) {
                    if (!this.f7281B) {
                        ot1.m18060e("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.f7308z)));
                        this.f7281B = true;
                    }
                    i |= 1;
                }
            } else {
                return;
            }
        }
        m10397l(j, i, (this.f7283a.mo14766b() - ((long) i2)) - ((long) i3), i2, qVar);
    }

    /* renamed from: s */
    public final int mo8825s() {
        return this.f7298p + this.f7300r;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (r9 != -1) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0037, code lost:
        return 0;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo8826t(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.f7300r     // Catch:{ all -> 0x0038 }
            int r2 = r8.m10392g(r0)     // Catch:{ all -> 0x0038 }
            boolean r1 = r8.m10401p()     // Catch:{ all -> 0x0038 }
            r7 = 0
            if (r1 == 0) goto L_0x0036
            long[] r1 = r8.f7295m     // Catch:{ all -> 0x0038 }
            r3 = r1[r2]     // Catch:{ all -> 0x0038 }
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0017
            goto L_0x0036
        L_0x0017:
            long r3 = r8.f7303u     // Catch:{ all -> 0x0038 }
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0025
            if (r11 != 0) goto L_0x0020
            goto L_0x0025
        L_0x0020:
            int r9 = r8.f7297o     // Catch:{ all -> 0x0038 }
            int r9 = r9 - r0
            monitor-exit(r8)
            return r9
        L_0x0025:
            int r11 = r8.f7297o     // Catch:{ all -> 0x0038 }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r9 = r1.m10391L(r2, r3, r4, r6)     // Catch:{ all -> 0x0038 }
            r10 = -1
            monitor-exit(r8)
            if (r9 != r10) goto L_0x0035
            return r7
        L_0x0035:
            return r9
        L_0x0036:
            monitor-exit(r8)
            return r7
        L_0x0038:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bi4.mo8826t(long, boolean):int");
    }

    /* renamed from: u */
    public final int mo8827u() {
        return this.f7298p + this.f7297o;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r9 != 0) goto L_0x003d;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo8828v(com.google.android.gms.internal.ads.c74 r9, com.google.android.gms.internal.ads.fo3 r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L_0x0007
            r5 = 1
            goto L_0x0009
        L_0x0007:
            r0 = 0
            r5 = 0
        L_0x0009:
            com.google.android.gms.internal.ads.xh4 r7 = r8.f7284b
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.m10393h(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L_0x003e
            boolean r9 = r10.mo15598g()
            if (r9 != 0) goto L_0x003d
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L_0x0034
            if (r9 == 0) goto L_0x002c
            com.google.android.gms.internal.ads.vh4 r9 = r8.f7283a
            com.google.android.gms.internal.ads.xh4 r11 = r8.f7284b
            r9.mo14768d(r10, r11)
            goto L_0x003d
        L_0x002c:
            com.google.android.gms.internal.ads.vh4 r9 = r8.f7283a
            com.google.android.gms.internal.ads.xh4 r11 = r8.f7284b
            r9.mo14769e(r10, r11)
            goto L_0x0037
        L_0x0034:
            if (r9 == 0) goto L_0x0037
            goto L_0x003d
        L_0x0037:
            int r9 = r8.f7300r
            int r9 = r9 + r1
            r8.f7300r = r9
            return r12
        L_0x003d:
            r9 = -4
        L_0x003e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bi4.mo8828v(com.google.android.gms.internal.ads.c74, com.google.android.gms.internal.ads.fo3, int, boolean):int");
    }

    /* renamed from: w */
    public final synchronized long mo8829w() {
        return this.f7303u;
    }

    /* renamed from: x */
    public final synchronized C2388g4 mo8830x() {
        if (this.f7306x) {
            return null;
        }
        return this.f7308z;
    }

    /* renamed from: y */
    public final void mo8831y(long j, boolean z, boolean z2) {
        this.f7283a.mo14767c(m10394i(j, false, z2));
    }

    /* renamed from: z */
    public final void mo8832z() {
        this.f7283a.mo14767c(m10395j());
    }
}
