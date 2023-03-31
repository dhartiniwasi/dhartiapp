package p177z1;

import android.os.Handler;
import p004a2.C0010a;
import p015b3.C1765u;
import p015b3.C1772x;
import p149u3.C5717b0;
import p149u3.C5720c0;
import p155v3.C5789b;
import p161w3.C5917a;
import p177z1.C6266q3;
import p190b7.C6685q;

/* renamed from: z1.i2 */
/* compiled from: MediaPeriodQueue */
final class C6228i2 {

    /* renamed from: a */
    private final C6266q3.C6268b f29965a = new C6266q3.C6268b();

    /* renamed from: b */
    private final C6266q3.C6270d f29966b = new C6266q3.C6270d();

    /* renamed from: c */
    private final C0010a f29967c;

    /* renamed from: d */
    private final Handler f29968d;

    /* renamed from: e */
    private long f29969e;

    /* renamed from: f */
    private int f29970f;

    /* renamed from: g */
    private boolean f29971g;

    /* renamed from: h */
    private C6219f2 f29972h;

    /* renamed from: i */
    private C6219f2 f29973i;

    /* renamed from: j */
    private C6219f2 f29974j;

    /* renamed from: k */
    private int f29975k;

    /* renamed from: l */
    private Object f29976l;

    /* renamed from: m */
    private long f29977m;

    public C6228i2(C0010a aVar, Handler handler) {
        this.f29967c = aVar;
        this.f29968d = handler;
    }

    /* renamed from: A */
    private static C1772x.C1774b m36503A(C6266q3 q3Var, Object obj, long j, long j2, C6266q3.C6270d dVar, C6266q3.C6268b bVar) {
        q3Var.mo21149l(obj, bVar);
        q3Var.mo21450r(bVar.f30186c, dVar);
        int f = q3Var.mo6809f(obj);
        Object obj2 = obj;
        while (bVar.f30187d == 0 && bVar.mo21456f() > 0 && bVar.mo21471t(bVar.mo21469r()) && bVar.mo21458h(0) == -1) {
            int i = f + 1;
            if (f >= dVar.f30214x) {
                break;
            }
            q3Var.mo6711k(i, bVar, true);
            obj2 = C5917a.m34872e(bVar.f30185b);
            f = i;
        }
        q3Var.mo21149l(obj2, bVar);
        int h = bVar.mo21458h(j);
        if (h == -1) {
            return new C1772x.C1774b(obj2, j2, bVar.mo21457g(j));
        }
        return new C1772x.C1774b(obj2, h, bVar.mo21465n(h), j2);
    }

    /* renamed from: C */
    private long m36504C(C6266q3 q3Var, Object obj) {
        int f;
        int i = q3Var.mo21149l(obj, this.f29965a).f30186c;
        Object obj2 = this.f29976l;
        if (obj2 != null && (f = q3Var.mo6809f(obj2)) != -1 && q3Var.mo21447j(f, this.f29965a).f30186c == i) {
            return this.f29977m;
        }
        for (C6219f2 f2Var = this.f29972h; f2Var != null; f2Var = f2Var.mo21303j()) {
            if (f2Var.f29934b.equals(obj)) {
                return f2Var.f29938f.f29949a.f5273d;
            }
        }
        for (C6219f2 f2Var2 = this.f29972h; f2Var2 != null; f2Var2 = f2Var2.mo21303j()) {
            int f2 = q3Var.mo6809f(f2Var2.f29934b);
            if (f2 != -1 && q3Var.mo21447j(f2, this.f29965a).f30186c == i) {
                return f2Var2.f29938f.f29949a.f5273d;
            }
        }
        long j = this.f29969e;
        this.f29969e = 1 + j;
        if (this.f29972h == null) {
            this.f29976l = obj;
            this.f29977m = j;
        }
        return j;
    }

    /* renamed from: E */
    private boolean m36505E(C6266q3 q3Var) {
        C6219f2 f2Var = this.f29972h;
        if (f2Var == null) {
            return true;
        }
        int f = q3Var.mo6809f(f2Var.f29934b);
        while (true) {
            f = q3Var.mo21445h(f, this.f29965a, this.f29966b, this.f29970f, this.f29971g);
            while (f2Var.mo21303j() != null && !f2Var.f29938f.f29955g) {
                f2Var = f2Var.mo21303j();
            }
            C6219f2 j = f2Var.mo21303j();
            if (f == -1 || j == null || q3Var.mo6809f(j.f29934b) != f) {
                boolean z = mo21341z(f2Var);
                f2Var.f29938f = mo21338r(q3Var, f2Var.f29938f);
            } else {
                f2Var = j;
            }
        }
        boolean z2 = mo21341z(f2Var);
        f2Var.f29938f = mo21338r(q3Var, f2Var.f29938f);
        return !z2;
    }

    /* renamed from: d */
    private boolean m36507d(long j, long j2) {
        return j == -9223372036854775807L || j == j2;
    }

    /* renamed from: e */
    private boolean m36508e(C6222g2 g2Var, C6222g2 g2Var2) {
        return g2Var.f29950b == g2Var2.f29950b && g2Var.f29949a.equals(g2Var2.f29949a);
    }

    /* renamed from: h */
    private C6222g2 m36509h(C6275r2 r2Var) {
        return m36511k(r2Var.f30281a, r2Var.f30282b, r2Var.f30283c, r2Var.f30298r);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00cc, code lost:
        if (r0.mo21471t(r0.mo21469r()) != false) goto L_0x00d0;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p177z1.C6222g2 m36510i(p177z1.C6266q3 r20, p177z1.C6219f2 r21, long r22) {
        /*
            r19 = this;
            r9 = r19
            r8 = r20
            r10 = r21
            z1.g2 r11 = r10.f29938f
            long r0 = r21.mo21305l()
            long r2 = r11.f29953e
            long r0 = r0 + r2
            long r6 = r0 - r22
            boolean r0 = r11.f29955g
            r13 = -1
            r14 = 1
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r17 = 0
            if (r0 == 0) goto L_0x00ef
            b3.x$b r0 = r11.f29949a
            java.lang.Object r0 = r0.f5270a
            int r1 = r8.mo6809f(r0)
            z1.q3$b r2 = r9.f29965a
            z1.q3$d r3 = r9.f29966b
            int r0 = r9.f29970f
            boolean r5 = r9.f29971g
            r4 = r0
            r0 = r20
            int r0 = r0.mo21445h(r1, r2, r3, r4, r5)
            if (r0 != r13) goto L_0x0038
            return r17
        L_0x0038:
            z1.q3$b r1 = r9.f29965a
            z1.q3$b r1 = r8.mo6711k(r0, r1, r14)
            int r3 = r1.f30186c
            z1.q3$b r1 = r9.f29965a
            java.lang.Object r1 = r1.f30185b
            java.lang.Object r1 = p161w3.C5917a.m34872e(r1)
            b3.x$b r2 = r11.f29949a
            long r4 = r2.f5273d
            z1.q3$d r2 = r9.f29966b
            z1.q3$d r2 = r8.mo21450r(r3, r2)
            int r2 = r2.f30213w
            if (r2 != r0) goto L_0x0099
            z1.q3$d r1 = r9.f29966b
            z1.q3$b r2 = r9.f29965a
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = 0
            long r6 = java.lang.Math.max(r12, r6)
            r0 = r20
            android.util.Pair r0 = r0.mo21449o(r1, r2, r3, r4, r6)
            if (r0 != 0) goto L_0x006e
            return r17
        L_0x006e:
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r4 = r0.longValue()
            z1.f2 r0 = r21.mo21303j()
            if (r0 == 0) goto L_0x008d
            java.lang.Object r2 = r0.f29934b
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x008d
            z1.g2 r0 = r0.f29938f
            b3.x$b r0 = r0.f29949a
            long r2 = r0.f5273d
            goto L_0x0094
        L_0x008d:
            long r2 = r9.f29969e
            r6 = 1
            long r6 = r6 + r2
            r9.f29969e = r6
        L_0x0094:
            r12 = r4
            r17 = r15
            r4 = r2
            goto L_0x009d
        L_0x0099:
            r12 = 0
            r17 = r12
        L_0x009d:
            z1.q3$d r6 = r9.f29966b
            z1.q3$b r7 = r9.f29965a
            r0 = r20
            r2 = r12
            b3.x$b r2 = m36503A(r0, r1, r2, r4, r6, r7)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x00e3
            long r0 = r11.f29951c
            int r3 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r3 == 0) goto L_0x00e3
            b3.x$b r0 = r11.f29949a
            java.lang.Object r0 = r0.f5270a
            z1.q3$b r1 = r9.f29965a
            z1.q3$b r0 = r8.mo21149l(r0, r1)
            int r0 = r0.mo21456f()
            if (r0 <= 0) goto L_0x00cf
            z1.q3$b r0 = r9.f29965a
            int r1 = r0.mo21469r()
            boolean r0 = r0.mo21471t(r1)
            if (r0 == 0) goto L_0x00cf
            goto L_0x00d0
        L_0x00cf:
            r14 = 0
        L_0x00d0:
            boolean r0 = r2.mo6886b()
            if (r0 == 0) goto L_0x00dd
            if (r14 == 0) goto L_0x00dd
            long r0 = r11.f29951c
            r3 = r0
            r5 = r12
            goto L_0x00e6
        L_0x00dd:
            if (r14 == 0) goto L_0x00e3
            long r0 = r11.f29951c
            r5 = r0
            goto L_0x00e4
        L_0x00e3:
            r5 = r12
        L_0x00e4:
            r3 = r17
        L_0x00e6:
            r0 = r19
            r1 = r20
            z1.g2 r0 = r0.m36511k(r1, r2, r3, r5)
            return r0
        L_0x00ef:
            r0 = -1
            r12 = 0
            b3.x$b r10 = r11.f29949a
            java.lang.Object r1 = r10.f5270a
            z1.q3$b r2 = r9.f29965a
            r8.mo21149l(r1, r2)
            boolean r1 = r10.mo6886b()
            if (r1 == 0) goto L_0x016b
            int r3 = r10.f5271b
            z1.q3$b r1 = r9.f29965a
            int r1 = r1.mo21453d(r3)
            if (r1 != r0) goto L_0x010c
            return r17
        L_0x010c:
            z1.q3$b r0 = r9.f29965a
            int r2 = r10.f5272c
            int r4 = r0.mo21466o(r3, r2)
            if (r4 >= r1) goto L_0x0126
            java.lang.Object r2 = r10.f5270a
            long r5 = r11.f29951c
            long r10 = r10.f5273d
            r0 = r19
            r1 = r20
            r7 = r10
            z1.g2 r0 = r0.m36512l(r1, r2, r3, r4, r5, r7)
            return r0
        L_0x0126:
            long r0 = r11.f29951c
            int r2 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r2 != 0) goto L_0x014c
            z1.q3$d r1 = r9.f29966b
            z1.q3$b r2 = r9.f29965a
            int r3 = r2.f30186c
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r6 = java.lang.Math.max(r12, r6)
            r0 = r20
            android.util.Pair r0 = r0.mo21449o(r1, r2, r3, r4, r6)
            if (r0 != 0) goto L_0x0144
            return r17
        L_0x0144:
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
        L_0x014c:
            java.lang.Object r2 = r10.f5270a
            int r3 = r10.f5271b
            long r2 = r9.m36514n(r8, r2, r3)
            java.lang.Object r4 = r10.f5270a
            long r5 = java.lang.Math.max(r2, r0)
            long r11 = r11.f29951c
            long r13 = r10.f5273d
            r0 = r19
            r1 = r20
            r2 = r4
            r3 = r5
            r5 = r11
            r7 = r13
            z1.g2 r0 = r0.m36513m(r1, r2, r3, r5, r7)
            return r0
        L_0x016b:
            z1.q3$b r0 = r9.f29965a
            int r1 = r10.f5274e
            int r4 = r0.mo21465n(r1)
            z1.q3$b r0 = r9.f29965a
            int r1 = r10.f5274e
            boolean r0 = r0.mo21471t(r1)
            if (r0 == 0) goto L_0x018a
            z1.q3$b r0 = r9.f29965a
            int r1 = r10.f5274e
            int r0 = r0.mo21462k(r1, r4)
            r1 = 3
            if (r0 != r1) goto L_0x018a
            r12 = 1
            goto L_0x018b
        L_0x018a:
            r12 = 0
        L_0x018b:
            z1.q3$b r0 = r9.f29965a
            int r1 = r10.f5274e
            int r0 = r0.mo21453d(r1)
            if (r4 == r0) goto L_0x01aa
            if (r12 == 0) goto L_0x0198
            goto L_0x01aa
        L_0x0198:
            java.lang.Object r2 = r10.f5270a
            int r3 = r10.f5274e
            long r5 = r11.f29953e
            long r10 = r10.f5273d
            r0 = r19
            r1 = r20
            r7 = r10
            z1.g2 r0 = r0.m36512l(r1, r2, r3, r4, r5, r7)
            return r0
        L_0x01aa:
            java.lang.Object r0 = r10.f5270a
            int r1 = r10.f5274e
            long r3 = r9.m36514n(r8, r0, r1)
            java.lang.Object r2 = r10.f5270a
            long r5 = r11.f29953e
            long r10 = r10.f5273d
            r0 = r19
            r1 = r20
            r7 = r10
            z1.g2 r0 = r0.m36513m(r1, r2, r3, r5, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p177z1.C6228i2.m36510i(z1.q3, z1.f2, long):z1.g2");
    }

    /* renamed from: k */
    private C6222g2 m36511k(C6266q3 q3Var, C1772x.C1774b bVar, long j, long j2) {
        C1772x.C1774b bVar2 = bVar;
        C6266q3 q3Var2 = q3Var;
        q3Var.mo21149l(bVar2.f5270a, this.f29965a);
        if (bVar.mo6886b()) {
            return m36512l(q3Var, bVar2.f5270a, bVar2.f5271b, bVar2.f5272c, j, bVar2.f5273d);
        }
        return m36513m(q3Var, bVar2.f5270a, j2, j, bVar2.f5273d);
    }

    /* renamed from: l */
    private C6222g2 m36512l(C6266q3 q3Var, Object obj, int i, int i2, long j, long j2) {
        int i3 = i2;
        C1772x.C1774b bVar = new C1772x.C1774b(obj, i, i3, j2);
        long e = q3Var.mo21149l(bVar.f5270a, this.f29965a).mo21454e(bVar.f5271b, bVar.f5272c);
        long j3 = i3 == this.f29965a.mo21465n(i) ? this.f29965a.mo21461j() : 0;
        return new C6222g2(bVar, (e == -9223372036854775807L || j3 < e) ? j3 : Math.max(0, e - 1), j, -9223372036854775807L, e, this.f29965a.mo21471t(bVar.f5271b), false, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r9.mo21471t(r9.mo21469r()) != false) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0096  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p177z1.C6222g2 m36513m(p177z1.C6266q3 r25, java.lang.Object r26, long r27, long r29, long r31) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            z1.q3$b r5 = r0.f29965a
            r1.mo21149l(r2, r5)
            z1.q3$b r5 = r0.f29965a
            int r5 = r5.mo21457g(r3)
            r6 = 1
            r7 = -1
            r8 = 0
            if (r5 != r7) goto L_0x002d
            z1.q3$b r9 = r0.f29965a
            int r9 = r9.mo21456f()
            if (r9 <= 0) goto L_0x004c
            z1.q3$b r9 = r0.f29965a
            int r10 = r9.mo21469r()
            boolean r9 = r9.mo21471t(r10)
            if (r9 == 0) goto L_0x004c
            goto L_0x004a
        L_0x002d:
            z1.q3$b r9 = r0.f29965a
            boolean r9 = r9.mo21471t(r5)
            if (r9 == 0) goto L_0x004c
            z1.q3$b r9 = r0.f29965a
            long r9 = r9.mo21460i(r5)
            z1.q3$b r11 = r0.f29965a
            long r12 = r11.f30187d
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x004c
            boolean r9 = r11.mo21470s(r5)
            if (r9 == 0) goto L_0x004c
            r5 = -1
        L_0x004a:
            r9 = 1
            goto L_0x004d
        L_0x004c:
            r9 = 0
        L_0x004d:
            b3.x$b r11 = new b3.x$b
            r12 = r31
            r11.<init>(r2, r12, r5)
            boolean r2 = r0.m36515s(r11)
            boolean r22 = r0.m36517u(r1, r11)
            boolean r23 = r0.m36516t(r1, r11, r2)
            if (r5 == r7) goto L_0x006d
            z1.q3$b r1 = r0.f29965a
            boolean r1 = r1.mo21471t(r5)
            if (r1 == 0) goto L_0x006d
            r20 = 1
            goto L_0x006f
        L_0x006d:
            r20 = 0
        L_0x006f:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 == r7) goto L_0x007f
            z1.q3$b r1 = r0.f29965a
            long r14 = r1.mo21460i(r5)
        L_0x007c:
            r16 = r14
            goto L_0x0088
        L_0x007f:
            if (r9 == 0) goto L_0x0086
            z1.q3$b r1 = r0.f29965a
            long r14 = r1.f30187d
            goto L_0x007c
        L_0x0086:
            r16 = r12
        L_0x0088:
            int r1 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x0096
            r14 = -9223372036854775808
            int r1 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r1 != 0) goto L_0x0093
            goto L_0x0096
        L_0x0093:
            r18 = r16
            goto L_0x009c
        L_0x0096:
            z1.q3$b r1 = r0.f29965a
            long r14 = r1.f30187d
            r18 = r14
        L_0x009c:
            int r1 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x00b3
            int r1 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r1 < 0) goto L_0x00b3
            if (r23 != 0) goto L_0x00aa
            if (r9 != 0) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            r6 = 0
        L_0x00aa:
            r3 = 0
            long r5 = (long) r6
            long r5 = r18 - r5
            long r3 = java.lang.Math.max(r3, r5)
        L_0x00b3:
            r12 = r3
            z1.g2 r1 = new z1.g2
            r10 = r1
            r14 = r29
            r21 = r2
            r10.<init>(r11, r12, r14, r16, r18, r20, r21, r22, r23)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p177z1.C6228i2.m36513m(z1.q3, java.lang.Object, long, long, long):z1.g2");
    }

    /* renamed from: n */
    private long m36514n(C6266q3 q3Var, Object obj, int i) {
        q3Var.mo21149l(obj, this.f29965a);
        long i2 = this.f29965a.mo21460i(i);
        if (i2 == Long.MIN_VALUE) {
            return this.f29965a.f30187d;
        }
        return i2 + this.f29965a.mo21463l(i);
    }

    /* renamed from: s */
    private boolean m36515s(C1772x.C1774b bVar) {
        return !bVar.mo6886b() && bVar.f5274e == -1;
    }

    /* renamed from: t */
    private boolean m36516t(C6266q3 q3Var, C1772x.C1774b bVar, boolean z) {
        int f = q3Var.mo6809f(bVar.f5270a);
        if (!q3Var.mo21450r(q3Var.mo21447j(f, this.f29965a).f30186c, this.f29966b).f30207i) {
            return q3Var.mo21452v(f, this.f29965a, this.f29966b, this.f29970f, this.f29971g) && z;
        }
    }

    /* renamed from: u */
    private boolean m36517u(C6266q3 q3Var, C1772x.C1774b bVar) {
        if (!m36515s(bVar)) {
            return false;
        }
        int i = q3Var.mo21149l(bVar.f5270a, this.f29965a).f30186c;
        if (q3Var.mo21450r(i, this.f29966b).f30214x == q3Var.mo6809f(bVar.f5270a)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m36518w(C6685q.C6686a aVar, C1772x.C1774b bVar) {
        this.f29967c.mo48n0(aVar.mo22547h(), bVar);
    }

    /* renamed from: x */
    private void m36519x() {
        C6685q.C6686a r = C6685q.m38441r();
        for (C6219f2 f2Var = this.f29972h; f2Var != null; f2Var = f2Var.mo21303j()) {
            r.mo22506a(f2Var.f29938f.f29949a);
        }
        C6219f2 f2Var2 = this.f29973i;
        this.f29968d.post(new C13394h2(this, r, f2Var2 == null ? null : f2Var2.f29938f.f29949a));
    }

    /* renamed from: B */
    public C1772x.C1774b mo21325B(C6266q3 q3Var, Object obj, long j) {
        long C = m36504C(q3Var, obj);
        q3Var.mo21149l(obj, this.f29965a);
        q3Var.mo21450r(this.f29965a.f30186c, this.f29966b);
        boolean z = false;
        for (int f = q3Var.mo6809f(obj); f >= this.f29966b.f30213w; f--) {
            boolean z2 = true;
            q3Var.mo6711k(f, this.f29965a, true);
            if (this.f29965a.mo21456f() <= 0) {
                z2 = false;
            }
            z |= z2;
            C6266q3.C6268b bVar = this.f29965a;
            if (bVar.mo21458h(bVar.f30187d) != -1) {
                obj = C5917a.m34872e(this.f29965a.f30185b);
            }
            if (z && (!z2 || this.f29965a.f30187d != 0)) {
                break;
            }
        }
        return m36503A(q3Var, obj, j, C, this.f29966b, this.f29965a);
    }

    /* renamed from: D */
    public boolean mo21326D() {
        C6219f2 f2Var = this.f29974j;
        return f2Var == null || (!f2Var.f29938f.f29957i && f2Var.mo21310q() && this.f29974j.f29938f.f29953e != -9223372036854775807L && this.f29975k < 100);
    }

    /* renamed from: F */
    public boolean mo21327F(C6266q3 q3Var, long j, long j2) {
        C6222g2 g2Var;
        long j3;
        C6219f2 f2Var = this.f29972h;
        C6219f2 f2Var2 = null;
        while (f2Var != null) {
            C6222g2 g2Var2 = f2Var.f29938f;
            if (f2Var2 == null) {
                g2Var = mo21338r(q3Var, g2Var2);
            } else {
                C6222g2 i = m36510i(q3Var, f2Var2, j);
                if (i == null) {
                    return !mo21341z(f2Var2);
                }
                if (!m36508e(g2Var2, i)) {
                    return !mo21341z(f2Var2);
                }
                g2Var = i;
            }
            f2Var.f29938f = g2Var.mo21318a(g2Var2.f29951c);
            if (!m36507d(g2Var2.f29953e, g2Var.f29953e)) {
                f2Var.mo21298A();
                long j4 = g2Var.f29953e;
                if (j4 == -9223372036854775807L) {
                    j3 = Long.MAX_VALUE;
                } else {
                    j3 = f2Var.mo21317z(j4);
                }
                boolean z = f2Var == this.f29973i && !f2Var.f29938f.f29954f && (j2 == Long.MIN_VALUE || j2 >= j3);
                if (mo21341z(f2Var) || z) {
                    return false;
                }
                return true;
            }
            f2Var2 = f2Var;
            f2Var = f2Var.mo21303j();
        }
        return true;
    }

    /* renamed from: G */
    public boolean mo21328G(C6266q3 q3Var, int i) {
        this.f29970f = i;
        return m36505E(q3Var);
    }

    /* renamed from: H */
    public boolean mo21329H(C6266q3 q3Var, boolean z) {
        this.f29971g = z;
        return m36505E(q3Var);
    }

    /* renamed from: b */
    public C6219f2 mo21330b() {
        C6219f2 f2Var = this.f29972h;
        if (f2Var == null) {
            return null;
        }
        if (f2Var == this.f29973i) {
            this.f29973i = f2Var.mo21303j();
        }
        this.f29972h.mo21312t();
        int i = this.f29975k - 1;
        this.f29975k = i;
        if (i == 0) {
            this.f29974j = null;
            C6219f2 f2Var2 = this.f29972h;
            this.f29976l = f2Var2.f29934b;
            this.f29977m = f2Var2.f29938f.f29949a.f5273d;
        }
        this.f29972h = this.f29972h.mo21303j();
        m36519x();
        return this.f29972h;
    }

    /* renamed from: c */
    public C6219f2 mo21331c() {
        C6219f2 f2Var = this.f29973i;
        C5917a.m34873f((f2Var == null || f2Var.mo21303j() == null) ? false : true);
        this.f29973i = this.f29973i.mo21303j();
        m36519x();
        return this.f29973i;
    }

    /* renamed from: f */
    public void mo21332f() {
        if (this.f29975k != 0) {
            C6219f2 f2Var = (C6219f2) C5917a.m34875h(this.f29972h);
            this.f29976l = f2Var.f29934b;
            this.f29977m = f2Var.f29938f.f29949a.f5273d;
            while (f2Var != null) {
                f2Var.mo21312t();
                f2Var = f2Var.mo21303j();
            }
            this.f29972h = null;
            this.f29974j = null;
            this.f29973i = null;
            this.f29975k = 0;
            m36519x();
        }
    }

    /* renamed from: g */
    public C6219f2 mo21333g(C6220f3[] f3VarArr, C5717b0 b0Var, C5789b bVar, C6239l2 l2Var, C6222g2 g2Var, C5720c0 c0Var) {
        long j;
        C6219f2 f2Var = this.f29974j;
        if (f2Var == null) {
            j = 1000000000000L;
            C6222g2 g2Var2 = g2Var;
        } else {
            j = (f2Var.mo21305l() + this.f29974j.f29938f.f29953e) - g2Var.f29950b;
        }
        C6219f2 f2Var2 = new C6219f2(f3VarArr, j, b0Var, bVar, l2Var, g2Var, c0Var);
        C6219f2 f2Var3 = this.f29974j;
        if (f2Var3 != null) {
            f2Var3.mo21314w(f2Var2);
        } else {
            this.f29972h = f2Var2;
            this.f29973i = f2Var2;
        }
        this.f29976l = null;
        this.f29974j = f2Var2;
        this.f29975k++;
        m36519x();
        return f2Var2;
    }

    /* renamed from: j */
    public C6219f2 mo21334j() {
        return this.f29974j;
    }

    /* renamed from: o */
    public C6222g2 mo21335o(long j, C6275r2 r2Var) {
        C6219f2 f2Var = this.f29974j;
        if (f2Var == null) {
            return m36509h(r2Var);
        }
        return m36510i(r2Var.f30281a, f2Var, j);
    }

    /* renamed from: p */
    public C6219f2 mo21336p() {
        return this.f29972h;
    }

    /* renamed from: q */
    public C6219f2 mo21337q() {
        return this.f29973i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0029, code lost:
        r1 = r3.f5274e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p177z1.C6222g2 mo21338r(p177z1.C6266q3 r19, p177z1.C6222g2 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            b3.x$b r3 = r2.f29949a
            boolean r12 = r0.m36515s(r3)
            boolean r13 = r0.m36517u(r1, r3)
            boolean r14 = r0.m36516t(r1, r3, r12)
            b3.x$b r4 = r2.f29949a
            java.lang.Object r4 = r4.f5270a
            z1.q3$b r5 = r0.f29965a
            r1.mo21149l(r4, r5)
            boolean r1 = r3.mo6886b()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x0035
            int r1 = r3.f5274e
            if (r1 != r4) goto L_0x002e
            goto L_0x0035
        L_0x002e:
            z1.q3$b r7 = r0.f29965a
            long r7 = r7.mo21460i(r1)
            goto L_0x0036
        L_0x0035:
            r7 = r5
        L_0x0036:
            boolean r1 = r3.mo6886b()
            if (r1 == 0) goto L_0x0048
            z1.q3$b r1 = r0.f29965a
            int r5 = r3.f5271b
            int r6 = r3.f5272c
            long r5 = r1.mo21454e(r5, r6)
        L_0x0046:
            r9 = r5
            goto L_0x005c
        L_0x0048:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0055
            r5 = -9223372036854775808
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r9 = r7
            goto L_0x005c
        L_0x0055:
            z1.q3$b r1 = r0.f29965a
            long r5 = r1.mo21464m()
            goto L_0x0046
        L_0x005c:
            boolean r1 = r3.mo6886b()
            if (r1 == 0) goto L_0x006c
            z1.q3$b r1 = r0.f29965a
            int r4 = r3.f5271b
            boolean r1 = r1.mo21471t(r4)
            r11 = r1
            goto L_0x007d
        L_0x006c:
            int r1 = r3.f5274e
            if (r1 == r4) goto L_0x007b
            z1.q3$b r4 = r0.f29965a
            boolean r1 = r4.mo21471t(r1)
            if (r1 == 0) goto L_0x007b
            r1 = 1
            r11 = 1
            goto L_0x007d
        L_0x007b:
            r1 = 0
            r11 = 0
        L_0x007d:
            z1.g2 r15 = new z1.g2
            long r4 = r2.f29950b
            long r1 = r2.f29951c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p177z1.C6228i2.mo21338r(z1.q3, z1.g2):z1.g2");
    }

    /* renamed from: v */
    public boolean mo21339v(C1765u uVar) {
        C6219f2 f2Var = this.f29974j;
        return f2Var != null && f2Var.f29933a == uVar;
    }

    /* renamed from: y */
    public void mo21340y(long j) {
        C6219f2 f2Var = this.f29974j;
        if (f2Var != null) {
            f2Var.mo21311s(j);
        }
    }

    /* renamed from: z */
    public boolean mo21341z(C6219f2 f2Var) {
        boolean z = false;
        C5917a.m34873f(f2Var != null);
        if (f2Var.equals(this.f29974j)) {
            return false;
        }
        this.f29974j = f2Var;
        while (f2Var.mo21303j() != null) {
            f2Var = f2Var.mo21303j();
            if (f2Var == this.f29973i) {
                this.f29973i = this.f29972h;
                z = true;
            }
            f2Var.mo21312t();
            this.f29975k--;
        }
        this.f29974j.mo21314w((C6219f2) null);
        m36519x();
        return z;
    }
}
