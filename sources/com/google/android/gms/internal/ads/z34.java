package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class z34 implements b44 {

    /* renamed from: a */
    private o44 f20928a;

    /* renamed from: a */
    public static void m24365a(o44 o44, o44 o442) {
        z34 z34 = (z34) o44;
        if (z34.f20928a == null) {
            z34.f20928a = o442;
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: d */
    public final Object mo8155d() {
        o44 o44 = this.f20928a;
        if (o44 != null) {
            return o44.mo8155d();
        }
        throw new IllegalStateException();
    }
}
