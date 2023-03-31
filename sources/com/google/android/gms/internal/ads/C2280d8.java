package com.google.android.gms.internal.ads;

import com.pichillilorenzo.flutter_inappwebview.C8710R;

/* renamed from: com.google.android.gms.internal.ads.d8 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2280d8 implements C2317e8 {

    /* renamed from: m */
    private static final int[] f8117m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n */
    private static final int[] f8118n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, C8710R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a */
    private final tn4 f8119a;

    /* renamed from: b */
    private final C2792r f8120b;

    /* renamed from: c */
    private final C2429h8 f8121c;

    /* renamed from: d */
    private final int f8122d;

    /* renamed from: e */
    private final byte[] f8123e;

    /* renamed from: f */
    private final y22 f8124f;

    /* renamed from: g */
    private final int f8125g;

    /* renamed from: h */
    private final C2388g4 f8126h;

    /* renamed from: i */
    private int f8127i;

    /* renamed from: j */
    private long f8128j;

    /* renamed from: k */
    private int f8129k;

    /* renamed from: l */
    private long f8130l;

    public C2280d8(tn4 tn4, C2792r rVar, C2429h8 h8Var) throws ea0 {
        this.f8119a = tn4;
        this.f8120b = rVar;
        this.f8121c = h8Var;
        int max = Math.max(1, h8Var.f10241c / 10);
        this.f8125g = max;
        y22 y22 = new y22(h8Var.f10244f);
        y22.mo15304q();
        int q = y22.mo15304q();
        this.f8122d = q;
        int i = h8Var.f10240b;
        int i2 = (((h8Var.f10242d - (i * 4)) * 8) / (h8Var.f10243e * i)) + 1;
        if (q == i2) {
            int O = gb2.m13145O(max, q);
            this.f8123e = new byte[(h8Var.f10242d * O)];
            this.f8124f = new y22(O * (q + q) * i);
            int i3 = ((h8Var.f10241c * h8Var.f10242d) * 8) / q;
            C2311e2 e2Var = new C2311e2();
            e2Var.mo9776s("audio/raw");
            e2Var.mo9757d0(i3);
            e2Var.mo9772o(i3);
            e2Var.mo9769l((max + max) * i);
            e2Var.mo9759e0(h8Var.f10240b);
            e2Var.mo9777t(h8Var.f10241c);
            e2Var.mo9771n(2);
            this.f8126h = e2Var.mo9782y();
            return;
        }
        throw ea0.m11990a("Expected frames per block: " + i2 + "; got: " + q, (Throwable) null);
    }

    /* renamed from: a */
    private final int m11344a(int i) {
        int i2 = this.f8121c.f10240b;
        return i / (i2 + i2);
    }

    /* renamed from: b */
    private final int m11345b(int i) {
        return (i + i) * this.f8121c.f10240b;
    }

    /* renamed from: f */
    private final void m11346f(int i) {
        long j = this.f8128j;
        long g0 = gb2.m13170g0(this.f8130l, 1000000, (long) this.f8121c.f10241c);
        int b = m11345b(i);
        this.f8120b.mo8824f(j + g0, 1, b, this.f8129k - b, (C2755q) null);
        this.f8130l += (long) i;
        this.f8129k -= b;
    }

    /* renamed from: c */
    public final void mo9453c(long j) {
        this.f8127i = 0;
        this.f8128j = j;
        this.f8129k = 0;
        this.f8130l = 0;
    }

    /* renamed from: d */
    public final void mo9454d(int i, long j) {
        this.f8119a.mo10059j(new C2578l8(this.f8121c, this.f8122d, (long) i, j));
        this.f8120b.mo8823e(this.f8126h);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0044 A[EDGE_INSN: B:38:0x0044->B:10:0x0044 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0024  */
    /* renamed from: e */
    public final boolean mo9455e(com.google.android.gms.internal.ads.rn4 r20, long r21) throws java.io.IOException {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            int r3 = r0.f8125g
            int r4 = r0.f8129k
            int r4 = r0.m11344a(r4)
            int r3 = r3 - r4
            int r4 = r0.f8122d
            int r3 = com.google.android.gms.internal.ads.gb2.m13145O(r3, r4)
            com.google.android.gms.internal.ads.h8 r4 = r0.f8121c
            int r4 = r4.f10242d
            int r3 = r3 * r4
            r6 = 0
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0021
        L_0x001f:
            r6 = 1
            goto L_0x0022
        L_0x0021:
            r6 = 0
        L_0x0022:
            if (r6 != 0) goto L_0x0044
            int r7 = r0.f8127i
            if (r7 >= r3) goto L_0x0044
            int r7 = r3 - r7
            long r7 = (long) r7
            long r7 = java.lang.Math.min(r7, r1)
            byte[] r9 = r0.f8123e
            int r10 = r0.f8127i
            int r8 = (int) r7
            r7 = r20
            int r8 = r7.mo8792c(r9, r10, r8)
            r9 = -1
            if (r8 != r9) goto L_0x003e
            goto L_0x001f
        L_0x003e:
            int r9 = r0.f8127i
            int r9 = r9 + r8
            r0.f8127i = r9
            goto L_0x0022
        L_0x0044:
            int r1 = r0.f8127i
            com.google.android.gms.internal.ads.h8 r2 = r0.f8121c
            int r2 = r2.f10242d
            int r1 = r1 / r2
            if (r1 <= 0) goto L_0x0148
            byte[] r2 = r0.f8123e
            com.google.android.gms.internal.ads.y22 r3 = r0.f8124f
            r7 = 0
        L_0x0052:
            if (r7 >= r1) goto L_0x0113
            r8 = 0
        L_0x0055:
            com.google.android.gms.internal.ads.h8 r9 = r0.f8121c
            int r10 = r9.f10240b
            if (r8 >= r10) goto L_0x010b
            byte[] r11 = r3.mo15295h()
            int r9 = r9.f10242d
            int r12 = r7 * r9
            int r13 = r8 * 4
            int r12 = r12 + r13
            int r13 = r10 * 4
            int r13 = r13 + r12
            int r9 = r9 / r10
            int r9 = r9 + -4
            int r14 = r12 + 1
            byte r14 = r2[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = r14 << 8
            byte r15 = r2[r12]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r14 = r14 | r15
            short r14 = (short) r14
            int r12 = r12 + 2
            byte r12 = r2[r12]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r15 = 88
            int r12 = java.lang.Math.min(r12, r15)
            int[] r16 = f8118n
            r16 = r16[r12]
            int r4 = r0.f8122d
            int r4 = r4 * r7
            int r4 = r4 * r10
            int r4 = r4 + r8
            int r4 = r4 + r4
            r15 = r14 & 255(0xff, float:3.57E-43)
            byte r15 = (byte) r15
            r11[r4] = r15
            int r15 = r4 + 1
            int r5 = r14 >> 8
            byte r5 = (byte) r5
            r11[r15] = r5
            r5 = 0
        L_0x009f:
            int r15 = r9 + r9
            if (r5 >= r15) goto L_0x0103
            int r15 = r5 / 8
            int r15 = r15 * r10
            int r15 = r15 * 4
            int r15 = r15 + r13
            int r18 = r5 / 2
            int r18 = r18 % 4
            int r15 = r15 + r18
            byte r15 = r2[r15]
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r18 = r5 % 2
            if (r18 != 0) goto L_0x00bb
            r15 = r15 & 15
            goto L_0x00bd
        L_0x00bb:
            int r15 = r15 >> 4
        L_0x00bd:
            r18 = r15 & 7
            int r18 = r18 + r18
            r17 = 1
            int r18 = r18 + 1
            int r18 = r18 * r16
            r16 = r2
            int r2 = r18 >> 3
            r18 = r15 & 8
            if (r18 == 0) goto L_0x00d0
            int r2 = -r2
        L_0x00d0:
            int r14 = r14 + r2
            r2 = -32768(0xffffffffffff8000, float:NaN)
            r21 = r9
            r9 = 32767(0x7fff, float:4.5916E-41)
            int r14 = com.google.android.gms.internal.ads.gb2.m13146P(r14, r2, r9)
            int r2 = r10 + r10
            int r4 = r4 + r2
            r2 = r14 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r11[r4] = r2
            int r2 = r4 + 1
            int r9 = r14 >> 8
            byte r9 = (byte) r9
            r11[r2] = r9
            int[] r2 = f8117m
            r2 = r2[r15]
            int r12 = r12 + r2
            r2 = 88
            r9 = 0
            int r12 = com.google.android.gms.internal.ads.gb2.m13146P(r12, r9, r2)
            int[] r9 = f8118n
            r9 = r9[r12]
            int r5 = r5 + 1
            r2 = r16
            r16 = r9
            r9 = r21
            goto L_0x009f
        L_0x0103:
            r16 = r2
            r17 = 1
            int r8 = r8 + 1
            goto L_0x0055
        L_0x010b:
            r16 = r2
            r17 = 1
            int r7 = r7 + 1
            goto L_0x0052
        L_0x0113:
            int r2 = r0.f8122d
            int r2 = r2 * r1
            int r2 = r0.m11345b(r2)
            r4 = 0
            r3.mo15293f(r4)
            r3.mo15292e(r2)
            int r2 = r0.f8127i
            com.google.android.gms.internal.ads.h8 r3 = r0.f8121c
            int r3 = r3.f10242d
            int r1 = r1 * r3
            int r2 = r2 - r1
            r0.f8127i = r2
            com.google.android.gms.internal.ads.y22 r1 = r0.f8124f
            int r2 = r1.mo15299l()
            com.google.android.gms.internal.ads.r r3 = r0.f8120b
            com.google.android.gms.internal.ads.C2717p.m18261b(r3, r1, r2)
            int r1 = r0.f8129k
            int r1 = r1 + r2
            r0.f8129k = r1
            int r1 = r0.m11344a(r1)
            int r2 = r0.f8125g
            if (r1 < r2) goto L_0x0148
            r0.m11346f(r2)
        L_0x0148:
            if (r6 == 0) goto L_0x0155
            int r1 = r0.f8129k
            int r1 = r0.m11344a(r1)
            if (r1 <= 0) goto L_0x0155
            r0.m11346f(r1)
        L_0x0155:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2280d8.mo9455e(com.google.android.gms.internal.ads.rn4, long):boolean");
    }
}
