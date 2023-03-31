package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.v4 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3823v4 implements ListIterator {

    /* renamed from: a */
    final ListIterator f22798a;

    /* renamed from: b */
    final /* synthetic */ int f22799b;

    /* renamed from: c */
    final /* synthetic */ C3887x4 f22800c;

    C3823v4(C3887x4 x4Var, int i) {
        this.f22800c = x4Var;
        this.f22799b = i;
        this.f22798a = x4Var.f22904a.listIterator(i);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f22798a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f22798a.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f22798a.next();
    }

    public final int nextIndex() {
        return this.f22798a.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f22798a.previous();
    }

    public final int previousIndex() {
        return this.f22798a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
