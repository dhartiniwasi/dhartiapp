package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.k4 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3460k4 implements Iterator {

    /* renamed from: a */
    private int f22272a = -1;

    /* renamed from: b */
    private boolean f22273b;

    /* renamed from: c */
    private Iterator f22274c;

    /* renamed from: d */
    final /* synthetic */ C3592o4 f22275d;

    /* synthetic */ C3460k4(C3592o4 o4Var, C3427j4 j4Var) {
        this.f22275d = o4Var;
    }

    /* renamed from: a */
    private final Iterator m25982a() {
        if (this.f22274c == null) {
            this.f22274c = this.f22275d.f22436c.entrySet().iterator();
        }
        return this.f22274c;
    }

    public final boolean hasNext() {
        if (this.f22272a + 1 >= this.f22275d.f22435b.size()) {
            return !this.f22275d.f22436c.isEmpty() && m25982a().hasNext();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f22273b = true;
        int i = this.f22272a + 1;
        this.f22272a = i;
        if (i < this.f22275d.f22435b.size()) {
            return (Map.Entry) this.f22275d.f22435b.get(this.f22272a);
        }
        return (Map.Entry) m25982a().next();
    }

    public final void remove() {
        if (this.f22273b) {
            this.f22273b = false;
            this.f22275d.m26339o();
            if (this.f22272a < this.f22275d.f22435b.size()) {
                C3592o4 o4Var = this.f22275d;
                int i = this.f22272a;
                this.f22272a = i - 1;
                Object unused = o4Var.m26337m(i);
                return;
            }
            m25982a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
