package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class t04 extends AbstractList implements RandomAccess, jy3 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final jy3 f17806a;

    public t04(jy3 jy3) {
        this.f17806a = jy3;
    }

    /* renamed from: F */
    public final void mo11254F(jw3 jw3) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: U */
    public final List mo11255U() {
        return this.f17806a.mo11255U();
    }

    /* renamed from: a */
    public final jy3 mo11256a() {
        return this;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((iy3) this.f17806a).get(i);
    }

    public final Iterator iterator() {
        return new s04(this);
    }

    public final ListIterator listIterator(int i) {
        return new r04(this, i);
    }

    /* renamed from: p */
    public final Object mo11262p(int i) {
        return this.f17806a.mo11262p(i);
    }

    public final int size() {
        return this.f17806a.size();
    }
}
