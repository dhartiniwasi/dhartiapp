package com.google.firebase.firestore;

import p247h8.C10449g0;

/* renamed from: com.google.firebase.firestore.c0 */
/* compiled from: GeoPoint */
public class C7900c0 implements Comparable<C7900c0> {

    /* renamed from: a */
    private final double f34322a;

    /* renamed from: b */
    private final double f34323b;

    public C7900c0(double d, double d2) {
        if (Double.isNaN(d) || d < -90.0d || d > 90.0d) {
            throw new IllegalArgumentException("Latitude must be in the range of [-90, 90]");
        } else if (Double.isNaN(d2) || d2 < -180.0d || d2 > 180.0d) {
            throw new IllegalArgumentException("Longitude must be in the range of [-180, 180]");
        } else {
            this.f34322a = d;
            this.f34323b = d2;
        }
    }

    /* renamed from: a */
    public int compareTo(C7900c0 c0Var) {
        int k = C10449g0.m52711k(this.f34322a, c0Var.f34322a);
        return k == 0 ? C10449g0.m52711k(this.f34323b, c0Var.f34323b) : k;
    }

    /* renamed from: b */
    public double mo26326b() {
        return this.f34322a;
    }

    /* renamed from: c */
    public double mo26327c() {
        return this.f34323b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7900c0)) {
            return false;
        }
        C7900c0 c0Var = (C7900c0) obj;
        if (this.f34322a == c0Var.f34322a && this.f34323b == c0Var.f34323b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f34322a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f34323b);
        return (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        return "GeoPoint { latitude=" + this.f34322a + ", longitude=" + this.f34323b + " }";
    }
}
