package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class o31 {

    /* renamed from: e */
    public static final za4 f14877e = n21.f13772a;

    /* renamed from: a */
    public final int f14878a = 1;

    /* renamed from: b */
    private final gv0 f14879b;

    /* renamed from: c */
    private final int[] f14880c;

    /* renamed from: d */
    private final boolean[] f14881d;

    public o31(gv0 gv0, boolean z, int[] iArr, boolean[] zArr) {
        int i = gv0.f10063a;
        this.f14879b = gv0;
        this.f14880c = (int[]) iArr.clone();
        this.f14881d = (boolean[]) zArr.clone();
    }

    /* renamed from: a */
    public final int mo12812a() {
        return this.f14879b.f10065c;
    }

    /* renamed from: b */
    public final C2388g4 mo12813b(int i) {
        return this.f14879b.mo10649b(i);
    }

    /* renamed from: c */
    public final boolean mo12814c() {
        for (boolean z : this.f14881d) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo12815d(int i) {
        return this.f14881d[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o31.class == obj.getClass()) {
            o31 o31 = (o31) obj;
            return this.f14879b.equals(o31.f14879b) && Arrays.equals(this.f14880c, o31.f14880c) && Arrays.equals(this.f14881d, o31.f14881d);
        }
    }

    public final int hashCode() {
        return (((this.f14879b.hashCode() * 961) + Arrays.hashCode(this.f14880c)) * 31) + Arrays.hashCode(this.f14881d);
    }
}
