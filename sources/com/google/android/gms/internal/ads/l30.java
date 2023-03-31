package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class l30 {

    /* renamed from: a */
    public final Object f12629a;

    /* renamed from: b */
    public final int f12630b;

    /* renamed from: c */
    public final int f12631c;

    /* renamed from: d */
    public final long f12632d;

    /* renamed from: e */
    public final int f12633e;

    protected l30(l30 l30) {
        this.f12629a = l30.f12629a;
        this.f12630b = l30.f12630b;
        this.f12631c = l30.f12631c;
        this.f12632d = l30.f12632d;
        this.f12633e = l30.f12633e;
    }

    public l30(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    private l30(Object obj, int i, int i2, long j, int i3) {
        this.f12629a = obj;
        this.f12630b = i;
        this.f12631c = i2;
        this.f12632d = j;
        this.f12633e = i3;
    }

    /* renamed from: a */
    public final l30 mo11882a(Object obj) {
        if (this.f12629a.equals(obj)) {
            return this;
        }
        return new l30(obj, this.f12630b, this.f12631c, this.f12632d, this.f12633e);
    }

    /* renamed from: b */
    public final boolean mo11883b() {
        return this.f12630b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l30)) {
            return false;
        }
        l30 l30 = (l30) obj;
        return this.f12629a.equals(l30.f12629a) && this.f12630b == l30.f12630b && this.f12631c == l30.f12631c && this.f12632d == l30.f12632d && this.f12633e == l30.f12633e;
    }

    public final int hashCode() {
        return ((((((((this.f12629a.hashCode() + 527) * 31) + this.f12630b) * 31) + this.f12631c) * 31) + ((int) this.f12632d)) * 31) + this.f12633e;
    }

    public l30(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public l30(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}
