package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ch4 {

    /* renamed from: d */
    public static final ch4 f7753d = new ch4(0, 0, 0);

    /* renamed from: e */
    public static final za4 f7754e = dg4.f8253a;

    /* renamed from: a */
    public final int f7755a = 0;

    /* renamed from: b */
    public final int f7756b;

    /* renamed from: c */
    public final int f7757c;

    public ch4(int i, int i2, int i3) {
        this.f7756b = i2;
        this.f7757c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch4)) {
            return false;
        }
        ch4 ch4 = (ch4) obj;
        int i = ch4.f7755a;
        return this.f7756b == ch4.f7756b && this.f7757c == ch4.f7757c;
    }

    public final int hashCode() {
        return ((this.f7756b + 16337) * 31) + this.f7757c;
    }
}
