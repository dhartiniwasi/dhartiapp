package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class fe0 {

    /* renamed from: d */
    public static final fe0 f9258d = new fe0(1.0f, 1.0f);

    /* renamed from: e */
    public static final za4 f9259e = gd0.f9838a;

    /* renamed from: a */
    public final float f9260a;

    /* renamed from: b */
    public final float f9261b;

    /* renamed from: c */
    private final int f9262c;

    public fe0(float f, float f2) {
        boolean z = true;
        v91.m22050d(f > 0.0f);
        v91.m22050d(f2 <= 0.0f ? false : z);
        this.f9260a = f;
        this.f9261b = f2;
        this.f9262c = Math.round(f * 1000.0f);
    }

    /* renamed from: a */
    public final long mo10147a(long j) {
        return j * ((long) this.f9262c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fe0.class == obj.getClass()) {
            fe0 fe0 = (fe0) obj;
            return this.f9260a == fe0.f9260a && this.f9261b == fe0.f9261b;
        }
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f9260a) + 527) * 31) + Float.floatToRawIntBits(this.f9261b);
    }

    public final String toString() {
        return gb2.m13173i("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f9260a), Float.valueOf(this.f9261b));
    }
}
