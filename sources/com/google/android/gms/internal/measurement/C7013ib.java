package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.ib */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7013ib implements Iterator {

    /* renamed from: a */
    private int f31758a = -1;

    /* renamed from: b */
    private boolean f31759b;

    /* renamed from: c */
    private Iterator f31760c;

    /* renamed from: d */
    final /* synthetic */ C7077mb f31761d;

    /* synthetic */ C7013ib(C7077mb mbVar, C6997hb hbVar) {
        this.f31761d = mbVar;
    }

    /* renamed from: a */
    private final Iterator m40212a() {
        if (this.f31760c == null) {
            this.f31760c = this.f31761d.f31823c.entrySet().iterator();
        }
        return this.f31760c;
    }

    public final boolean hasNext() {
        if (this.f31758a + 1 >= this.f31761d.f31822b.size()) {
            return !this.f31761d.f31823c.isEmpty() && m40212a().hasNext();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f31759b = true;
        int i = this.f31758a + 1;
        this.f31758a = i;
        if (i < this.f31761d.f31822b.size()) {
            return (Map.Entry) this.f31761d.f31822b.get(this.f31758a);
        }
        return (Map.Entry) m40212a().next();
    }

    public final void remove() {
        if (this.f31759b) {
            this.f31759b = false;
            this.f31761d.m40405o();
            if (this.f31758a < this.f31761d.f31822b.size()) {
                C7077mb mbVar = this.f31761d;
                int i = this.f31758a;
                this.f31758a = i - 1;
                Object unused = mbVar.m40403m(i);
                return;
            }
            m40212a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
