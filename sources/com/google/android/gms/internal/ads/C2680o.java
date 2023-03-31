package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.o */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2680o {

    /* renamed from: c */
    public static final C2680o f14770c = new C2680o(0, 0);

    /* renamed from: a */
    public final long f14771a;

    /* renamed from: b */
    public final long f14772b;

    public C2680o(long j, long j2) {
        this.f14771a = j;
        this.f14772b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2680o.class == obj.getClass()) {
            C2680o oVar = (C2680o) obj;
            return this.f14771a == oVar.f14771a && this.f14772b == oVar.f14772b;
        }
    }

    public final int hashCode() {
        return (((int) this.f14771a) * 31) + ((int) this.f14772b);
    }

    public final String toString() {
        long j = this.f14771a;
        long j2 = this.f14772b;
        return "[timeUs=" + j + ", position=" + j2 + "]";
    }
}
