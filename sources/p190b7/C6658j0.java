package p190b7;

import java.util.Objects;
import p182a7.C6431n;

/* renamed from: b7.j0 */
/* compiled from: RegularImmutableList */
class C6658j0<E> extends C6685q<E> {

    /* renamed from: e */
    static final C6685q<Object> f31136e = new C6658j0(new Object[0], 0);

    /* renamed from: c */
    final transient Object[] f31137c;

    /* renamed from: d */
    private final transient int f31138d;

    C6658j0(Object[] objArr, int i) {
        this.f31137c = objArr;
        this.f31138d = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo22447c(Object[] objArr, int i) {
        System.arraycopy(this.f31137c, 0, objArr, i, this.f31138d);
        return i + this.f31138d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Object[] mo22448f() {
        return this.f31137c;
    }

    public E get(int i) {
        C6431n.m37559l(i, this.f31138d);
        E e = this.f31137c[i];
        Objects.requireNonNull(e);
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo22450i() {
        return this.f31138d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo22451j() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo22452k() {
        return false;
    }

    public int size() {
        return this.f31138d;
    }
}
