package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class c44 implements b44, v34 {

    /* renamed from: b */
    private static final c44 f7588b = new c44((Object) null);

    /* renamed from: a */
    private final Object f7589a;

    private c44(Object obj) {
        this.f7589a = obj;
    }

    /* renamed from: a */
    public static b44 m10704a(Object obj) {
        j44.m14698a(obj, "instance cannot be null");
        return new c44(obj);
    }

    /* renamed from: b */
    public static b44 m10705b(Object obj) {
        return obj == null ? f7588b : new c44(obj);
    }

    /* renamed from: d */
    public final Object mo8155d() {
        return this.f7589a;
    }
}
