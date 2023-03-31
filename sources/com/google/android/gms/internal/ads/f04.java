package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class f04 implements Iterator {

    /* renamed from: a */
    private int f9068a = -1;

    /* renamed from: b */
    private boolean f9069b;

    /* renamed from: c */
    private Iterator f9070c;

    /* renamed from: d */
    final /* synthetic */ j04 f9071d;

    /* synthetic */ f04(j04 j04, e04 e04) {
        this.f9071d = j04;
    }

    /* renamed from: a */
    private final Iterator m12392a() {
        if (this.f9070c == null) {
            this.f9070c = this.f9071d.f11158c.entrySet().iterator();
        }
        return this.f9070c;
    }

    public final boolean hasNext() {
        if (this.f9068a + 1 >= this.f9071d.f11157b.size()) {
            return !this.f9071d.f11158c.isEmpty() && m12392a().hasNext();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f9069b = true;
        int i = this.f9068a + 1;
        this.f9068a = i;
        if (i < this.f9071d.f11157b.size()) {
            return (Map.Entry) this.f9071d.f11157b.get(this.f9068a);
        }
        return (Map.Entry) m12392a().next();
    }

    public final void remove() {
        if (this.f9069b) {
            this.f9069b = false;
            this.f9071d.m14625o();
            if (this.f9068a < this.f9071d.f11157b.size()) {
                j04 j04 = this.f9071d;
                int i = this.f9068a;
                this.f9068a = i - 1;
                Object unused = j04.m14623m(i);
                return;
            }
            m12392a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
