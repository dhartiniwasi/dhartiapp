package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class s61 {

    /* renamed from: e */
    public static final s61 f17271e = new s61(0, 0, 0, 1.0f);

    /* renamed from: f */
    public static final za4 f17272f = q51.f16182a;

    /* renamed from: a */
    public final int f17273a;

    /* renamed from: b */
    public final int f17274b;

    /* renamed from: c */
    public final int f17275c;

    /* renamed from: d */
    public final float f17276d;

    public s61(int i, int i2, int i3, float f) {
        this.f17273a = i;
        this.f17274b = i2;
        this.f17275c = i3;
        this.f17276d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s61) {
            s61 s61 = (s61) obj;
            return this.f17273a == s61.f17273a && this.f17274b == s61.f17274b && this.f17275c == s61.f17275c && this.f17276d == s61.f17276d;
        }
    }

    public final int hashCode() {
        return ((((((this.f17273a + 217) * 31) + this.f17274b) * 31) + this.f17275c) * 31) + Float.floatToRawIntBits(this.f17276d);
    }
}
