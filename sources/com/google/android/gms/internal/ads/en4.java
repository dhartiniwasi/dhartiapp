package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class en4 implements C2643n {

    /* renamed from: a */
    private final long f8858a;

    /* renamed from: b */
    private final long f8859b;

    /* renamed from: c */
    private final int f8860c;

    /* renamed from: d */
    private final long f8861d;

    /* renamed from: e */
    private final int f8862e;

    /* renamed from: f */
    private final long f8863f;

    public en4(long j, long j2, int i, int i2, boolean z) {
        long c;
        this.f8858a = j;
        this.f8859b = j2;
        this.f8860c = i2 == -1 ? 1 : i2;
        this.f8862e = i;
        if (j == -1) {
            this.f8861d = -1;
            c = -9223372036854775807L;
        } else {
            this.f8861d = j - j2;
            c = m12174c(j, j2, i);
        }
        this.f8863f = c;
    }

    /* renamed from: c */
    private static long m12174c(long j, long j2, int i) {
        return (Math.max(0, j - j2) * 8000000) / ((long) i);
    }

    /* renamed from: U */
    public final boolean mo8197U() {
        return this.f8861d != -1;
    }

    /* renamed from: V */
    public final C2569l mo8198V(long j) {
        long j2 = this.f8861d;
        int i = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
        if (i != 0) {
            int i2 = this.f8862e;
            long j3 = (long) this.f8860c;
            long j4 = (((((long) i2) * j) / 8000000) / j3) * j3;
            if (i != 0) {
                j4 = Math.min(j4, j2 - j3);
            }
            long max = this.f8859b + Math.max(j4, 0);
            long b = mo9945b(max);
            C2680o oVar = new C2680o(b, max);
            if (this.f8861d != -1 && b < j) {
                long j5 = max + ((long) this.f8860c);
                if (j5 < this.f8858a) {
                    return new C2569l(oVar, new C2680o(mo9945b(j5), j5));
                }
            }
            return new C2569l(oVar, oVar);
        }
        C2680o oVar2 = new C2680o(0, this.f8859b);
        return new C2569l(oVar2, oVar2);
    }

    /* renamed from: a */
    public final long mo8199a() {
        return this.f8863f;
    }

    /* renamed from: b */
    public final long mo9945b(long j) {
        return m12174c(j, this.f8859b, this.f8862e);
    }
}
