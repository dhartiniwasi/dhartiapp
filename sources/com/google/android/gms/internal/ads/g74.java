package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class g74 {

    /* renamed from: a */
    public final mg4 f9756a;

    /* renamed from: b */
    public final long f9757b;

    /* renamed from: c */
    public final long f9758c;

    /* renamed from: d */
    public final long f9759d;

    /* renamed from: e */
    public final long f9760e;

    /* renamed from: f */
    public final boolean f9761f;

    /* renamed from: g */
    public final boolean f9762g;

    /* renamed from: h */
    public final boolean f9763h;

    /* renamed from: i */
    public final boolean f9764i;

    g74(mg4 mg4, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        v91.m22050d(!z4 || z2);
        if (z3 && !z2) {
            z5 = false;
        }
        v91.m22050d(z5);
        this.f9756a = mg4;
        this.f9757b = j;
        this.f9758c = j2;
        this.f9759d = j3;
        this.f9760e = j4;
        this.f9761f = false;
        this.f9762g = z2;
        this.f9763h = z3;
        this.f9764i = z4;
    }

    /* renamed from: a */
    public final g74 mo10414a(long j) {
        if (j == this.f9758c) {
            return this;
        }
        return new g74(this.f9756a, this.f9757b, j, this.f9759d, this.f9760e, false, this.f9762g, this.f9763h, this.f9764i);
    }

    /* renamed from: b */
    public final g74 mo10415b(long j) {
        if (j == this.f9757b) {
            return this;
        }
        return new g74(this.f9756a, j, this.f9758c, this.f9759d, this.f9760e, false, this.f9762g, this.f9763h, this.f9764i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g74.class == obj.getClass()) {
            g74 g74 = (g74) obj;
            return this.f9757b == g74.f9757b && this.f9758c == g74.f9758c && this.f9759d == g74.f9759d && this.f9760e == g74.f9760e && this.f9762g == g74.f9762g && this.f9763h == g74.f9763h && this.f9764i == g74.f9764i && gb2.m13186t(this.f9756a, g74.f9756a);
        }
    }

    public final int hashCode() {
        return ((((((((((((((this.f9756a.hashCode() + 527) * 31) + ((int) this.f9757b)) * 31) + ((int) this.f9758c)) * 31) + ((int) this.f9759d)) * 31) + ((int) this.f9760e)) * 961) + (this.f9762g ? 1 : 0)) * 31) + (this.f9763h ? 1 : 0)) * 31) + (this.f9764i ? 1 : 0);
    }
}
