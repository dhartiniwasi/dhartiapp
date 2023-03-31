package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class va3 {

    /* renamed from: a */
    private final Object f18994a;

    /* renamed from: b */
    private final Object f18995b;

    /* renamed from: c */
    private final Object f18996c;

    va3(Object obj, Object obj2, Object obj3) {
        this.f18994a = obj;
        this.f18995b = obj2;
        this.f18996c = obj3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final IllegalArgumentException mo14705a() {
        return new IllegalArgumentException("Multiple entries with same key: " + this.f18994a + "=" + this.f18995b + " and " + this.f18994a + "=" + this.f18996c);
    }
}
