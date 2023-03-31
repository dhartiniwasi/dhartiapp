package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.l5 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
abstract class C3494l5 extends C3725s5 {

    /* renamed from: a */
    private final int f22323a;

    /* renamed from: b */
    private int f22324b;

    protected C3494l5(int i, int i2) {
        C3782tt.m27048b(i2, i, "index");
        this.f22323a = i;
        this.f22324b = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo16325a(int i);

    public final boolean hasNext() {
        return this.f22324b < this.f22323a;
    }

    public final boolean hasPrevious() {
        return this.f22324b > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f22324b;
            this.f22324b = i + 1;
            return mo16325a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f22324b;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f22324b - 1;
            this.f22324b = i;
            return mo16325a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f22324b - 1;
    }
}
