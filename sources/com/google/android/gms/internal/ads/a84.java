package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class a84 {

    /* renamed from: c */
    public static final a84 f6469c;

    /* renamed from: d */
    public static final a84 f6470d = new a84(Long.MAX_VALUE, Long.MAX_VALUE);

    /* renamed from: e */
    public static final a84 f6471e = new a84(Long.MAX_VALUE, 0);

    /* renamed from: f */
    public static final a84 f6472f = new a84(0, Long.MAX_VALUE);

    /* renamed from: g */
    public static final a84 f6473g;

    /* renamed from: a */
    public final long f6474a;

    /* renamed from: b */
    public final long f6475b;

    static {
        a84 a84 = new a84(0, 0);
        f6469c = a84;
        f6473g = a84;
    }

    public a84(long j, long j2) {
        boolean z = true;
        v91.m22050d(j >= 0);
        v91.m22050d(j2 < 0 ? false : z);
        this.f6474a = j;
        this.f6475b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a84.class == obj.getClass()) {
            a84 a84 = (a84) obj;
            return this.f6474a == a84.f6474a && this.f6475b == a84.f6475b;
        }
    }

    public final int hashCode() {
        return (((int) this.f6474a) * 31) + ((int) this.f6475b);
    }
}
