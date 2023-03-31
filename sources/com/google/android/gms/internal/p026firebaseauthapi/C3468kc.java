package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.kc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
abstract class C3468kc implements Iterator {

    /* renamed from: a */
    private Object f22292a;

    /* renamed from: b */
    private int f22293b = 2;

    protected C3468kc() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo15978a();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Object mo16257c() {
        this.f22293b = 3;
        return null;
    }

    public final boolean hasNext() {
        int i = this.f22293b;
        if (i != 4) {
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 == 0) {
                return true;
            } else {
                if (i2 != 2) {
                    this.f22293b = 4;
                    this.f22292a = mo15978a();
                    if (this.f22293b != 3) {
                        this.f22293b = 1;
                        return true;
                    }
                }
                return false;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.f22293b = 2;
            Object obj = this.f22292a;
            this.f22292a = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
