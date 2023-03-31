package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.v9 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2950v9 {

    /* renamed from: a */
    public final Object f18978a;

    /* renamed from: b */
    public final C3023x8 f18979b;

    /* renamed from: c */
    public final C3061y9 f18980c;

    /* renamed from: d */
    public boolean f18981d;

    private C2950v9(C3061y9 y9Var) {
        this.f18981d = false;
        this.f18978a = null;
        this.f18979b = null;
        this.f18980c = y9Var;
    }

    private C2950v9(Object obj, C3023x8 x8Var) {
        this.f18981d = false;
        this.f18978a = obj;
        this.f18979b = x8Var;
        this.f18980c = null;
    }

    /* renamed from: a */
    public static C2950v9 m22043a(C3061y9 y9Var) {
        return new C2950v9(y9Var);
    }

    /* renamed from: b */
    public static C2950v9 m22044b(Object obj, C3023x8 x8Var) {
        return new C2950v9(obj, x8Var);
    }

    /* renamed from: c */
    public final boolean mo14698c() {
        return this.f18980c == null;
    }
}
