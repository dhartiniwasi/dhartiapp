package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vi */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2959vi {

    /* renamed from: d */
    public static final C2959vi f19105d = new C2959vi(1.0f, 1.0f);

    /* renamed from: a */
    public final float f19106a;

    /* renamed from: b */
    public final float f19107b = 1.0f;

    /* renamed from: c */
    private final int f19108c;

    public C2959vi(float f, float f2) {
        this.f19106a = f;
        this.f19108c = Math.round(f * 1000.0f);
    }

    /* renamed from: a */
    public final long mo14773a(long j) {
        return j * ((long) this.f19108c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C2959vi.class == obj.getClass() && this.f19106a == ((C2959vi) obj).f19106a;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f19106a) + 527) * 31) + Float.floatToRawIntBits(1.0f);
    }
}
