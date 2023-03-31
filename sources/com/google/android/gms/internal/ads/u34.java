package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class u34 {

    /* renamed from: j */
    public static final u34 f18353j = new u34(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: k */
    public static final u34 f18354k = new u34(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: l */
    public static final u34 f18355l = new u34(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: m */
    public static final u34 f18356m = new u34(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: a */
    public final double f18357a;

    /* renamed from: b */
    public final double f18358b;

    /* renamed from: c */
    public final double f18359c;

    /* renamed from: d */
    public final double f18360d;

    /* renamed from: e */
    public final double f18361e;

    /* renamed from: f */
    public final double f18362f;

    /* renamed from: g */
    public final double f18363g;

    /* renamed from: h */
    public final double f18364h;

    /* renamed from: i */
    public final double f18365i;

    public u34(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.f18357a = d5;
        this.f18358b = d6;
        this.f18359c = d7;
        this.f18360d = d;
        this.f18361e = d2;
        this.f18362f = d3;
        this.f18363g = d4;
        this.f18364h = d8;
        this.f18365i = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u34.class != obj.getClass()) {
            return false;
        }
        u34 u34 = (u34) obj;
        return Double.compare(u34.f18360d, this.f18360d) == 0 && Double.compare(u34.f18361e, this.f18361e) == 0 && Double.compare(u34.f18362f, this.f18362f) == 0 && Double.compare(u34.f18363g, this.f18363g) == 0 && Double.compare(u34.f18364h, this.f18364h) == 0 && Double.compare(u34.f18365i, this.f18365i) == 0 && Double.compare(u34.f18357a, this.f18357a) == 0 && Double.compare(u34.f18358b, this.f18358b) == 0 && Double.compare(u34.f18359c, this.f18359c) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f18357a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f18358b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f18359c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f18360d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f18361e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f18362f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f18363g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.f18364h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f18365i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3))) * 31) + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4))) * 31) + ((int) ((doubleToLongBits5 >>> 32) ^ doubleToLongBits5))) * 31) + ((int) ((doubleToLongBits6 >>> 32) ^ doubleToLongBits6))) * 31) + ((int) ((doubleToLongBits7 >>> 32) ^ doubleToLongBits7))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f18353j)) {
            return "Rotate 0°";
        }
        if (equals(f18354k)) {
            return "Rotate 90°";
        }
        if (equals(f18355l)) {
            return "Rotate 180°";
        }
        if (equals(f18356m)) {
            return "Rotate 270°";
        }
        double d = this.f18357a;
        double d2 = this.f18358b;
        double d3 = this.f18359c;
        double d4 = this.f18360d;
        double d5 = this.f18361e;
        double d6 = this.f18362f;
        double d7 = this.f18363g;
        double d8 = this.f18364h;
        double d9 = this.f18365i;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d);
        sb.append(", v=");
        sb.append(d2);
        sb.append(", w=");
        sb.append(d3);
        sb.append(", a=");
        sb.append(d4);
        sb.append(", b=");
        sb.append(d5);
        sb.append(", c=");
        sb.append(d6);
        sb.append(", d=");
        sb.append(d7);
        sb.append(", tx=");
        sb.append(d8);
        sb.append(", ty=");
        sb.append(d9);
        sb.append("}");
        return sb.toString();
    }
}
