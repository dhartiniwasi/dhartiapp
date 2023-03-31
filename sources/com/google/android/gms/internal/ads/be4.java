package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class be4 {

    /* renamed from: f */
    public static final za4 f7219f = bd4.f7211a;

    /* renamed from: a */
    public final int f7220a;

    /* renamed from: b */
    public final int f7221b;

    /* renamed from: c */
    public final int f7222c;

    /* renamed from: d */
    public final byte[] f7223d;

    /* renamed from: e */
    private int f7224e;

    public be4(int i, int i2, int i3, byte[] bArr) {
        this.f7220a = i;
        this.f7221b = i2;
        this.f7222c = i3;
        this.f7223d = bArr;
    }

    /* renamed from: a */
    public static int m10333a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    /* renamed from: b */
    public static int m10334b(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && be4.class == obj.getClass()) {
            be4 be4 = (be4) obj;
            return this.f7220a == be4.f7220a && this.f7221b == be4.f7221b && this.f7222c == be4.f7222c && Arrays.equals(this.f7223d, be4.f7223d);
        }
    }

    public final int hashCode() {
        int i = this.f7224e;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((this.f7220a + 527) * 31) + this.f7221b) * 31) + this.f7222c) * 31) + Arrays.hashCode(this.f7223d);
        this.f7224e = hashCode;
        return hashCode;
    }

    public final String toString() {
        int i = this.f7220a;
        int i2 = this.f7221b;
        int i3 = this.f7222c;
        boolean z = this.f7223d != null;
        return "ColorInfo(" + i + ", " + i2 + ", " + i3 + ", " + z + ")";
    }
}
