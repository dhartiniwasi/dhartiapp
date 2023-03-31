package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class r93 implements qb3 {

    /* renamed from: a */
    private transient Set f16887a;

    /* renamed from: b */
    private transient Collection f16888b;

    /* renamed from: c */
    private transient Map f16889c;

    r93() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract Collection mo12871b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract Iterator mo12872c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract Map mo13695d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract Set mo13696e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qb3)) {
            return false;
        }
        return mo13523j().equals(((qb3) obj).mo13523j());
    }

    /* renamed from: f */
    public final Set mo13698f() {
        Set set = this.f16887a;
        if (set != null) {
            return set;
        }
        Set e = mo13696e();
        this.f16887a = e;
        return e;
    }

    /* renamed from: g */
    public final Collection mo13522g() {
        Collection collection = this.f16888b;
        if (collection != null) {
            return collection;
        }
        Collection b = mo12871b();
        this.f16888b = b;
        return b;
    }

    public final int hashCode() {
        return mo13523j().hashCode();
    }

    /* renamed from: j */
    public final Map mo13523j() {
        Map map = this.f16889c;
        if (map != null) {
            return map;
        }
        Map d = mo13695d();
        this.f16889c = d;
        return d;
    }

    public final String toString() {
        return mo13523j().toString();
    }
}
