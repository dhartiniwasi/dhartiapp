package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class a44 implements o44, v34 {

    /* renamed from: c */
    private static final Object f6407c = new Object();

    /* renamed from: a */
    private volatile o44 f6408a;

    /* renamed from: b */
    private volatile Object f6409b = f6407c;

    private a44(o44 o44) {
        this.f6408a = o44;
    }

    /* renamed from: a */
    public static v34 m9577a(o44 o44) {
        if (o44 instanceof v34) {
            return (v34) o44;
        }
        Objects.requireNonNull(o44);
        return new a44(o44);
    }

    /* renamed from: b */
    public static o44 m9578b(o44 o44) {
        Objects.requireNonNull(o44);
        if (o44 instanceof a44) {
            return o44;
        }
        return new a44(o44);
    }

    /* renamed from: d */
    public final Object mo8155d() {
        Object obj = this.f6409b;
        Object obj2 = f6407c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f6409b;
                if (obj == obj2) {
                    obj = this.f6408a.mo8155d();
                    Object obj3 = this.f6409b;
                    if (obj3 != obj2) {
                        if (obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                    }
                    this.f6409b = obj;
                    this.f6408a = null;
                }
            }
        }
        return obj;
    }
}
