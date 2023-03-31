package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class fk4 {

    /* renamed from: a */
    public final int f9311a;

    /* renamed from: b */
    public final z74[] f9312b;

    /* renamed from: c */
    public final xj4[] f9313c;

    /* renamed from: d */
    public final p41 f9314d;

    /* renamed from: e */
    public final Object f9315e;

    public fk4(z74[] z74Arr, xj4[] xj4Arr, p41 p41, Object obj) {
        this.f9312b = z74Arr;
        this.f9313c = (xj4[]) xj4Arr.clone();
        this.f9314d = p41;
        this.f9315e = obj;
        this.f9311a = z74Arr.length;
    }

    /* renamed from: a */
    public final boolean mo10169a(fk4 fk4, int i) {
        if (fk4 != null && gb2.m13186t(this.f9312b[i], fk4.f9312b[i]) && gb2.m13186t(this.f9313c[i], fk4.f9313c[i])) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo10170b(int i) {
        return this.f9312b[i] != null;
    }
}
