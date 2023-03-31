package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class n44 implements o44 {

    /* renamed from: c */
    private static final Object f13845c = new Object();

    /* renamed from: a */
    private volatile o44 f13846a;

    /* renamed from: b */
    private volatile Object f13847b = f13845c;

    private n44(o44 o44) {
        this.f13846a = o44;
    }

    /* renamed from: a */
    public static o44 m16932a(o44 o44) {
        if ((o44 instanceof n44) || (o44 instanceof a44)) {
            return o44;
        }
        Objects.requireNonNull(o44);
        return new n44(o44);
    }

    /* renamed from: d */
    public final Object mo8155d() {
        Object obj = this.f13847b;
        if (obj != f13845c) {
            return obj;
        }
        o44 o44 = this.f13846a;
        if (o44 == null) {
            return this.f13847b;
        }
        Object d = o44.mo8155d();
        this.f13847b = d;
        this.f13846a = null;
        return d;
    }
}
