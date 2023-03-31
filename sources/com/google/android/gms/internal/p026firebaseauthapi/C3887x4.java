package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.x4 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3887x4 extends AbstractList implements RandomAccess, C3821v2 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3821v2 f22904a;

    public C3887x4(C3821v2 v2Var) {
        this.f22904a = v2Var;
    }

    /* renamed from: U */
    public final List mo16853U() {
        return this.f22904a.mo16853U();
    }

    /* renamed from: a */
    public final C3821v2 mo16854a() {
        return this;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C3788u2) this.f22904a).get(i);
    }

    public final Iterator iterator() {
        return new C3855w4(this);
    }

    public final ListIterator listIterator(int i) {
        return new C3823v4(this, i);
    }

    /* renamed from: p */
    public final Object mo16858p(int i) {
        return this.f22904a.mo16858p(i);
    }

    public final int size() {
        return this.f22904a.size();
    }

    /* renamed from: v1 */
    public final void mo16861v1(C3325g1 g1Var) {
        throw new UnsupportedOperationException();
    }
}
