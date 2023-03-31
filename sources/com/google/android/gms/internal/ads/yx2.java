package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class yx2 {

    /* renamed from: a */
    public final String f20839a;

    /* renamed from: b */
    public final String f20840b;

    public yx2(String str, String str2) {
        this.f20839a = str;
        this.f20840b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx2)) {
            return false;
        }
        yx2 yx2 = (yx2) obj;
        return this.f20839a.equals(yx2.f20839a) && this.f20840b.equals(yx2.f20840b);
    }

    public final int hashCode() {
        return String.valueOf(this.f20839a).concat(String.valueOf(this.f20840b)).hashCode();
    }
}
