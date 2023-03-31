package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class oi4 {

    /* renamed from: a */
    public final long f15157a;

    /* renamed from: b */
    public final long f15158b;

    public oi4(long j, long j2) {
        this.f15157a = j;
        this.f15158b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi4)) {
            return false;
        }
        oi4 oi4 = (oi4) obj;
        return this.f15157a == oi4.f15157a && this.f15158b == oi4.f15158b;
    }

    public final int hashCode() {
        return (((int) this.f15157a) * 31) + ((int) this.f15158b);
    }
}
