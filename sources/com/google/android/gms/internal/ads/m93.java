package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class m93 extends k93 implements ListIterator {

    /* renamed from: d */
    final /* synthetic */ n93 f13284d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    m93(n93 n93) {
        super(n93);
        this.f13284d = n93;
    }

    public final void add(Object obj) {
        boolean isEmpty = this.f13284d.isEmpty();
        mo11622a();
        ((ListIterator) this.f11977a).add(obj);
        o93.m17637l(this.f13284d.f13920f);
        if (isEmpty) {
            this.f13284d.mo11942b();
        }
    }

    public final boolean hasPrevious() {
        mo11622a();
        return ((ListIterator) this.f11977a).hasPrevious();
    }

    public final int nextIndex() {
        mo11622a();
        return ((ListIterator) this.f11977a).nextIndex();
    }

    public final Object previous() {
        mo11622a();
        return ((ListIterator) this.f11977a).previous();
    }

    public final int previousIndex() {
        mo11622a();
        return ((ListIterator) this.f11977a).previousIndex();
    }

    public final void set(Object obj) {
        mo11622a();
        ((ListIterator) this.f11977a).set(obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m93(n93 n93, int i) {
        super(n93, ((List) n93.f12696b).listIterator(i));
        this.f13284d = n93;
    }
}
