package p177z1;

import p015b3.C1772x;
import p161w3.C5917a;
import p161w3.C5953m0;

/* renamed from: z1.g2 */
/* compiled from: MediaPeriodInfo */
final class C6222g2 {

    /* renamed from: a */
    public final C1772x.C1774b f29949a;

    /* renamed from: b */
    public final long f29950b;

    /* renamed from: c */
    public final long f29951c;

    /* renamed from: d */
    public final long f29952d;

    /* renamed from: e */
    public final long f29953e;

    /* renamed from: f */
    public final boolean f29954f;

    /* renamed from: g */
    public final boolean f29955g;

    /* renamed from: h */
    public final boolean f29956h;

    /* renamed from: i */
    public final boolean f29957i;

    C6222g2(C1772x.C1774b bVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = z;
        boolean z6 = z2;
        boolean z7 = z3;
        boolean z8 = z4;
        boolean z9 = false;
        C5917a.m34868a(!z8 || z6);
        C5917a.m34868a(!z7 || z6);
        if (!z5 || (!z6 && !z7 && !z8)) {
            z9 = true;
        }
        C5917a.m34868a(z9);
        this.f29949a = bVar;
        this.f29950b = j;
        this.f29951c = j2;
        this.f29952d = j3;
        this.f29953e = j4;
        this.f29954f = z5;
        this.f29955g = z6;
        this.f29956h = z7;
        this.f29957i = z8;
    }

    /* renamed from: a */
    public C6222g2 mo21318a(long j) {
        if (j == this.f29951c) {
            return this;
        }
        return new C6222g2(this.f29949a, this.f29950b, j, this.f29952d, this.f29953e, this.f29954f, this.f29955g, this.f29956h, this.f29957i);
    }

    /* renamed from: b */
    public C6222g2 mo21319b(long j) {
        if (j == this.f29950b) {
            return this;
        }
        return new C6222g2(this.f29949a, j, this.f29951c, this.f29952d, this.f29953e, this.f29954f, this.f29955g, this.f29956h, this.f29957i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6222g2.class != obj.getClass()) {
            return false;
        }
        C6222g2 g2Var = (C6222g2) obj;
        if (this.f29950b == g2Var.f29950b && this.f29951c == g2Var.f29951c && this.f29952d == g2Var.f29952d && this.f29953e == g2Var.f29953e && this.f29954f == g2Var.f29954f && this.f29955g == g2Var.f29955g && this.f29956h == g2Var.f29956h && this.f29957i == g2Var.f29957i && C5953m0.m35124c(this.f29949a, g2Var.f29949a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f29949a.hashCode()) * 31) + ((int) this.f29950b)) * 31) + ((int) this.f29951c)) * 31) + ((int) this.f29952d)) * 31) + ((int) this.f29953e)) * 31) + (this.f29954f ? 1 : 0)) * 31) + (this.f29955g ? 1 : 0)) * 31) + (this.f29956h ? 1 : 0)) * 31) + (this.f29957i ? 1 : 0);
    }
}
