package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class xm4 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final long f20216a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f20217b;

    /* renamed from: c */
    private final long f20218c;

    /* renamed from: d */
    private long f20219d = 0;

    /* renamed from: e */
    private long f20220e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f20221f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f20222g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f20223h;

    protected xm4(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f20216a = j;
        long j8 = j2;
        this.f20217b = j8;
        long j9 = j4;
        this.f20220e = j9;
        long j10 = j5;
        this.f20221f = j10;
        long j11 = j6;
        this.f20222g = j11;
        long j12 = j7;
        this.f20218c = j12;
        this.f20223h = m23395f(j8, 0, j9, j10, j11, j12);
    }

    /* renamed from: f */
    protected static long m23395f(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || 1 + j2 >= j3) {
            return j4;
        }
        long j7 = (long) (((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2))));
        return gb2.m13160b0(((j4 + j7) - j6) - (j7 / 20), j4, -1 + j5);
    }

    /* renamed from: g */
    static /* bridge */ /* synthetic */ void m23396g(xm4 xm4, long j, long j2) {
        xm4.f20220e = j;
        xm4.f20222g = j2;
        xm4.m23398i();
    }

    /* renamed from: h */
    static /* bridge */ /* synthetic */ void m23397h(xm4 xm4, long j, long j2) {
        xm4.f20219d = j;
        xm4.f20221f = j2;
        xm4.m23398i();
    }

    /* renamed from: i */
    private final void m23398i() {
        this.f20223h = m23395f(this.f20217b, this.f20219d, this.f20220e, this.f20221f, this.f20222g, this.f20218c);
    }
}
