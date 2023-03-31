package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class dc3 extends ua3 {

    /* renamed from: e */
    static final ua3 f8184e = new dc3(new Object[0], 0);

    /* renamed from: c */
    final transient Object[] f8185c;

    /* renamed from: d */
    private final transient int f8186d;

    dc3(Object[] objArr, int i) {
        this.f8185c = objArr;
        this.f8186d = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo9535b(Object[] objArr, int i) {
        System.arraycopy(this.f8185c, 0, objArr, i, this.f8186d);
        return i + this.f8186d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo9536c() {
        return this.f8186d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo9537f() {
        return 0;
    }

    public final Object get(int i) {
        b83.m10237a(i, this.f8186d, "index");
        Object obj = this.f8185c[i];
        obj.getClass();
        return obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo9539k() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final Object[] mo9540l() {
        return this.f8185c;
    }

    public final int size() {
        return this.f8186d;
    }
}
