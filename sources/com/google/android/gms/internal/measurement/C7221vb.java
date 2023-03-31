package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.vb */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C7221vb extends AbstractList implements RandomAccess, C7203u9 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C7203u9 f32152a;

    public C7221vb(C7203u9 u9Var) {
        this.f32152a = u9Var;
    }

    /* renamed from: P0 */
    public final void mo23885P0(C6977g8 g8Var) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: U */
    public final List mo23886U() {
        return this.f32152a.mo23886U();
    }

    /* renamed from: a */
    public final C7203u9 mo23887a() {
        return this;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((C7187t9) this.f32152a).get(i);
    }

    public final Iterator iterator() {
        return new C7205ub(this);
    }

    public final ListIterator listIterator(int i) {
        return new C7189tb(this, i);
    }

    /* renamed from: p */
    public final Object mo23891p(int i) {
        return this.f32152a.mo23891p(i);
    }

    public final int size() {
        return this.f32152a.size();
    }
}
