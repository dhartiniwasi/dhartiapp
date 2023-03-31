package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class dx3 {

    /* renamed from: a */
    private final Object f8520a;

    /* renamed from: b */
    private final int f8521b;

    dx3(Object obj, int i) {
        this.f8520a = obj;
        this.f8521b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dx3)) {
            return false;
        }
        dx3 dx3 = (dx3) obj;
        if (this.f8520a == dx3.f8520a && this.f8521b == dx3.f8521b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f8520a) * 65535) + this.f8521b;
    }
}
