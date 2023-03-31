package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.z0 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C3089z0 implements qn4 {

    /* renamed from: a */
    private final y22 f20887a = new y22(6);

    /* renamed from: b */
    private tn4 f20888b;

    /* renamed from: c */
    private int f20889c;

    /* renamed from: d */
    private int f20890d;

    /* renamed from: e */
    private int f20891e;

    /* renamed from: f */
    private long f20892f = -1;

    /* renamed from: g */
    private C3054y2 f20893g;

    /* renamed from: h */
    private rn4 f20894h;

    /* renamed from: i */
    private C2236c1 f20895i;

    /* renamed from: j */
    private C3019x4 f20896j;

    /* renamed from: a */
    private final int m24319a(rn4 rn4) throws IOException {
        this.f20887a.mo15290c(2);
        ((fn4) rn4).mo9986i(this.f20887a.mo15295h(), 0, 2, false);
        return this.f20887a.mo15310w();
    }

    /* renamed from: d */
    private final void m24320d() {
        m24321e(new j50[0]);
        tn4 tn4 = this.f20888b;
        Objects.requireNonNull(tn4);
        tn4.mo10058C();
        this.f20888b.mo10059j(new C2606m(-9223372036854775807L, 0));
        this.f20889c = 6;
    }

    /* renamed from: e */
    private final void m24321e(j50... j50Arr) {
        tn4 tn4 = this.f20888b;
        Objects.requireNonNull(tn4);
        C2792r n = tn4.mo10060n(1024, 4);
        C2311e2 e2Var = new C2311e2();
        e2Var.mo9765h0("image/jpeg");
        e2Var.mo9770m(new k60(-9223372036854775807L, j50Arr));
        n.mo8823e(e2Var.mo9782y());
    }

    /* renamed from: b */
    public final boolean mo9023b(rn4 rn4) throws IOException {
        if (m24319a(rn4) != 65496) {
            return false;
        }
        int a = m24319a(rn4);
        this.f20890d = a;
        if (a == 65504) {
            this.f20887a.mo15290c(2);
            fn4 fn4 = (fn4) rn4;
            fn4.mo9986i(this.f20887a.mo15295h(), 0, 2, false);
            fn4.mo10217m(this.f20887a.mo15310w() - 2, false);
            a = m24319a(rn4);
            this.f20890d = a;
        }
        if (a == 65505) {
            fn4 fn42 = (fn4) rn4;
            fn42.mo10217m(2, false);
            this.f20887a.mo15290c(6);
            fn42.mo9986i(this.f20887a.mo15295h(), 0, 6, false);
            if (this.f20887a.mo15280A() == 1165519206 && this.f20887a.mo15310w() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo9024c(tn4 tn4) {
        this.f20888b = tn4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:80:0x015e  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo9025f(com.google.android.gms.internal.ads.rn4 r24, com.google.android.gms.internal.ads.C2532k r25) throws java.io.IOException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            int r3 = r0.f20889c
            r4 = 4
            r5 = 2
            r6 = 1
            r7 = -1
            r9 = 0
            if (r3 == 0) goto L_0x018d
            if (r3 == r6) goto L_0x016f
            r10 = -1
            if (r3 == r5) goto L_0x00ac
            r5 = 5
            if (r3 == r4) goto L_0x004c
            if (r3 == r5) goto L_0x0024
            r1 = 6
            if (r3 != r1) goto L_0x001e
            return r10
        L_0x001e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0024:
            com.google.android.gms.internal.ads.c1 r3 = r0.f20895i
            if (r3 == 0) goto L_0x002c
            com.google.android.gms.internal.ads.rn4 r3 = r0.f20894h
            if (r1 == r3) goto L_0x0037
        L_0x002c:
            r0.f20894h = r1
            com.google.android.gms.internal.ads.c1 r3 = new com.google.android.gms.internal.ads.c1
            long r4 = r0.f20892f
            r3.<init>(r1, r4)
            r0.f20895i = r3
        L_0x0037:
            com.google.android.gms.internal.ads.x4 r1 = r0.f20896j
            java.util.Objects.requireNonNull(r1)
            com.google.android.gms.internal.ads.c1 r3 = r0.f20895i
            int r1 = r1.mo9025f(r3, r2)
            if (r1 != r6) goto L_0x004b
            long r3 = r2.f11852a
            long r5 = r0.f20892f
            long r3 = r3 + r5
            r2.f11852a = r3
        L_0x004b:
            return r1
        L_0x004c:
            long r3 = r24.mo9003T()
            long r7 = r0.f20892f
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x00a9
            com.google.android.gms.internal.ads.y22 r2 = r0.f20887a
            byte[] r2 = r2.mo15295h()
            boolean r2 = r1.mo9986i(r2, r9, r6, r6)
            if (r2 != 0) goto L_0x0066
            r23.m24320d()
            goto L_0x00a8
        L_0x0066:
            r24.mo9981W()
            com.google.android.gms.internal.ads.x4 r2 = r0.f20896j
            if (r2 != 0) goto L_0x0074
            com.google.android.gms.internal.ads.x4 r2 = new com.google.android.gms.internal.ads.x4
            r2.<init>(r9)
            r0.f20896j = r2
        L_0x0074:
            com.google.android.gms.internal.ads.c1 r2 = new com.google.android.gms.internal.ads.c1
            long r3 = r0.f20892f
            r2.<init>(r1, r3)
            r0.f20895i = r2
            com.google.android.gms.internal.ads.x4 r1 = r0.f20896j
            boolean r1 = r1.mo9023b(r2)
            if (r1 == 0) goto L_0x00a5
            com.google.android.gms.internal.ads.x4 r1 = r0.f20896j
            com.google.android.gms.internal.ads.f1 r2 = new com.google.android.gms.internal.ads.f1
            long r3 = r0.f20892f
            com.google.android.gms.internal.ads.tn4 r7 = r0.f20888b
            java.util.Objects.requireNonNull(r7)
            r2.<init>(r3, r7)
            r1.mo9024c(r2)
            com.google.android.gms.internal.ads.j50[] r1 = new com.google.android.gms.internal.ads.j50[r6]
            com.google.android.gms.internal.ads.y2 r2 = r0.f20893g
            java.util.Objects.requireNonNull(r2)
            r1[r9] = r2
            r0.m24321e(r1)
            r0.f20889c = r5
            goto L_0x00a8
        L_0x00a5:
            r23.m24320d()
        L_0x00a8:
            return r9
        L_0x00a9:
            r2.f11852a = r7
            return r6
        L_0x00ac:
            int r2 = r0.f20890d
            r3 = 65505(0xffe1, float:9.1792E-41)
            if (r2 != r3) goto L_0x0164
            com.google.android.gms.internal.ads.y22 r2 = new com.google.android.gms.internal.ads.y22
            int r3 = r0.f20891e
            r2.<init>((int) r3)
            byte[] r3 = r2.mo15295h()
            int r4 = r0.f20891e
            r6 = r1
            com.google.android.gms.internal.ads.fn4 r6 = (com.google.android.gms.internal.ads.fn4) r6
            r6.mo9984g(r3, r9, r4, r9)
            com.google.android.gms.internal.ads.y2 r3 = r0.f20893g
            if (r3 != 0) goto L_0x0162
            java.lang.String r3 = r2.mo15283D(r9)
            java.lang.String r4 = "http://ns.adobe.com/xap/1.0/"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0162
            java.lang.String r2 = r2.mo15283D(r9)
            if (r2 == 0) goto L_0x0162
            long r3 = r24.mo9005b()
            int r6 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x00e7
        L_0x00e4:
            r1 = 0
            goto L_0x015a
        L_0x00e7:
            com.google.android.gms.internal.ads.b1 r2 = com.google.android.gms.internal.ads.C2385g1.m12986a(r2)
            if (r2 != 0) goto L_0x00ee
            goto L_0x00e4
        L_0x00ee:
            java.util.List r6 = r2.f7045b
            int r6 = r6.size()
            if (r6 >= r5) goto L_0x00f7
            goto L_0x00e4
        L_0x00f7:
            java.util.List r5 = r2.f7045b
            int r5 = r5.size()
            int r5 = r5 + r10
            r11 = r7
            r13 = r11
            r17 = r13
            r19 = r17
            r6 = 0
        L_0x0105:
            if (r5 < 0) goto L_0x0140
            java.util.List r10 = r2.f7045b
            java.lang.Object r10 = r10.get(r5)
            com.google.android.gms.internal.ads.a1 r10 = (com.google.android.gms.internal.ads.C2162a1) r10
            java.lang.String r15 = r10.f6363a
            java.lang.String r1 = "video/mp4"
            boolean r1 = r1.equals(r15)
            r1 = r1 | r6
            if (r5 != 0) goto L_0x0120
            long r9 = r10.f6366d
            long r3 = r3 - r9
            r9 = 0
            goto L_0x0124
        L_0x0120:
            long r9 = r10.f6365c
            long r9 = r3 - r9
        L_0x0124:
            r21 = r3
            r3 = r9
            r9 = r21
            if (r1 == 0) goto L_0x0135
            int r6 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x0135
            long r19 = r9 - r3
            r17 = r3
            r6 = 0
            goto L_0x0136
        L_0x0135:
            r6 = r1
        L_0x0136:
            if (r5 != 0) goto L_0x0139
            r13 = r9
        L_0x0139:
            if (r5 != 0) goto L_0x013c
            r11 = r3
        L_0x013c:
            int r5 = r5 + -1
            r9 = 0
            goto L_0x0105
        L_0x0140:
            int r1 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00e4
            int r1 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00e4
            int r1 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00e4
            int r1 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0151
            goto L_0x00e4
        L_0x0151:
            com.google.android.gms.internal.ads.y2 r1 = new com.google.android.gms.internal.ads.y2
            long r2 = r2.f7044a
            r10 = r1
            r15 = r2
            r10.<init>(r11, r13, r15, r17, r19)
        L_0x015a:
            r0.f20893g = r1
            if (r1 == 0) goto L_0x0162
            long r1 = r1.f20442d
            r0.f20892f = r1
        L_0x0162:
            r3 = 0
            goto L_0x016c
        L_0x0164:
            int r2 = r0.f20891e
            com.google.android.gms.internal.ads.fn4 r1 = (com.google.android.gms.internal.ads.fn4) r1
            r3 = 0
            r1.mo10218n(r2, r3)
        L_0x016c:
            r0.f20889c = r3
            return r3
        L_0x016f:
            r3 = 0
            com.google.android.gms.internal.ads.y22 r2 = r0.f20887a
            r2.mo15290c(r5)
            com.google.android.gms.internal.ads.y22 r2 = r0.f20887a
            byte[] r2 = r2.mo15295h()
            com.google.android.gms.internal.ads.fn4 r1 = (com.google.android.gms.internal.ads.fn4) r1
            r1.mo9984g(r2, r3, r5, r3)
            com.google.android.gms.internal.ads.y22 r1 = r0.f20887a
            int r1 = r1.mo15310w()
            int r1 = r1 + -2
            r0.f20891e = r1
            r0.f20889c = r5
            return r3
        L_0x018d:
            r3 = 0
            com.google.android.gms.internal.ads.y22 r2 = r0.f20887a
            r2.mo15290c(r5)
            com.google.android.gms.internal.ads.y22 r2 = r0.f20887a
            byte[] r2 = r2.mo15295h()
            com.google.android.gms.internal.ads.fn4 r1 = (com.google.android.gms.internal.ads.fn4) r1
            r1.mo9984g(r2, r3, r5, r3)
            com.google.android.gms.internal.ads.y22 r1 = r0.f20887a
            int r1 = r1.mo15310w()
            r0.f20890d = r1
            r2 = 65498(0xffda, float:9.1782E-41)
            if (r1 != r2) goto L_0x01b8
            long r1 = r0.f20892f
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x01b4
            r0.f20889c = r4
            goto L_0x01c9
        L_0x01b4:
            r23.m24320d()
            goto L_0x01c9
        L_0x01b8:
            r2 = 65488(0xffd0, float:9.1768E-41)
            if (r1 < r2) goto L_0x01c2
            r2 = 65497(0xffd9, float:9.1781E-41)
            if (r1 <= r2) goto L_0x01c9
        L_0x01c2:
            r2 = 65281(0xff01, float:9.1478E-41)
            if (r1 == r2) goto L_0x01c9
            r0.f20889c = r6
        L_0x01c9:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3089z0.mo9025f(com.google.android.gms.internal.ads.rn4, com.google.android.gms.internal.ads.k):int");
    }

    /* renamed from: g */
    public final void mo9026g(long j, long j2) {
        if (j == 0) {
            this.f20889c = 0;
            this.f20896j = null;
        } else if (this.f20889c == 5) {
            C3019x4 x4Var = this.f20896j;
            Objects.requireNonNull(x4Var);
            x4Var.mo9026g(j, j2);
        }
    }
}
