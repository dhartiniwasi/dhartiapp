package p015b3;

import android.net.Uri;
import p161w3.C5917a;
import p177z1.C6266q3;
import p177z1.C6300z1;

/* renamed from: b3.u0 */
/* compiled from: SinglePeriodTimeline */
public final class C1767u0 extends C6266q3 {

    /* renamed from: x */
    private static final Object f5255x = new Object();

    /* renamed from: y */
    private static final C6300z1 f5256y = new C6300z1.C6303c().mo21589c("SinglePeriodTimeline").mo21592f(Uri.EMPTY).mo21587a();

    /* renamed from: c */
    private final long f5257c;

    /* renamed from: d */
    private final long f5258d;

    /* renamed from: e */
    private final long f5259e;

    /* renamed from: f */
    private final long f5260f;

    /* renamed from: g */
    private final long f5261g;

    /* renamed from: h */
    private final long f5262h;

    /* renamed from: i */
    private final long f5263i;

    /* renamed from: r */
    private final boolean f5264r;

    /* renamed from: s */
    private final boolean f5265s;

    /* renamed from: t */
    private final boolean f5266t;

    /* renamed from: u */
    private final Object f5267u;

    /* renamed from: v */
    private final C6300z1 f5268v;

    /* renamed from: w */
    private final C6300z1.C6309g f5269w;

    public C1767u0(long j, boolean z, boolean z2, boolean z3, Object obj, C6300z1 z1Var) {
        this(j, j, 0, 0, z, z2, z3, obj, z1Var);
    }

    /* renamed from: f */
    public int mo6809f(Object obj) {
        return f5255x.equals(obj) ? 0 : -1;
    }

    /* renamed from: k */
    public C6266q3.C6268b mo6711k(int i, C6266q3.C6268b bVar, boolean z) {
        C5917a.m34870c(i, 0, 1);
        return bVar.mo21472v((Object) null, z ? f5255x : null, 0, this.f5260f, -this.f5262h);
    }

    /* renamed from: m */
    public int mo6760m() {
        return 1;
    }

    /* renamed from: q */
    public Object mo6813q(int i) {
        C5917a.m34870c(i, 0, 1);
        return f5255x;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r1 > r5) goto L_0x0024;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p177z1.C6266q3.C6270d mo6712s(int r25, p177z1.C6266q3.C6270d r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            p161w3.C5917a.m34870c(r3, r1, r2)
            long r1 = r0.f5263i
            boolean r14 = r0.f5265s
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 == 0) goto L_0x002e
            boolean r5 = r0.f5266t
            if (r5 != 0) goto L_0x002e
            r5 = 0
            int r7 = (r27 > r5 ? 1 : (r27 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x002e
            long r5 = r0.f5261g
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x0027
        L_0x0024:
            r16 = r3
            goto L_0x0030
        L_0x0027:
            long r1 = r1 + r27
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x002e
            goto L_0x0024
        L_0x002e:
            r16 = r1
        L_0x0030:
            java.lang.Object r4 = p177z1.C6266q3.C6270d.f30198z
            z1.z1 r5 = r0.f5268v
            java.lang.Object r6 = r0.f5267u
            long r7 = r0.f5257c
            long r9 = r0.f5258d
            long r11 = r0.f5259e
            boolean r13 = r0.f5264r
            z1.z1$g r15 = r0.f5269w
            long r1 = r0.f5261g
            r18 = r1
            r20 = 0
            r21 = 0
            long r1 = r0.f5262h
            r22 = r1
            r3 = r26
            z1.q3$d r1 = r3.mo21482j(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p015b3.C1767u0.mo6712s(int, z1.q3$d, long):z1.q3$d");
    }

    /* renamed from: t */
    public int mo6761t() {
        return 1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1767u0(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, Object obj, C6300z1 z1Var) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, false, obj, z1Var, z3 ? z1Var.f30393d : null);
    }

    public C1767u0(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, Object obj, C6300z1 z1Var, C6300z1.C6309g gVar) {
        this.f5257c = j;
        this.f5258d = j2;
        this.f5259e = j3;
        this.f5260f = j4;
        this.f5261g = j5;
        this.f5262h = j6;
        this.f5263i = j7;
        this.f5264r = z;
        this.f5265s = z2;
        this.f5266t = z3;
        this.f5267u = obj;
        this.f5268v = (C6300z1) C5917a.m34872e(z1Var);
        this.f5269w = gVar;
    }
}
