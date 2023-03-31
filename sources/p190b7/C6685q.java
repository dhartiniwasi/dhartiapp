package p190b7;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p182a7.C6431n;
import p190b7.C6673o;

/* renamed from: b7.q */
/* compiled from: ImmutableList */
public abstract class C6685q<E> extends C6673o<E> implements List<E>, RandomAccess {

    /* renamed from: b */
    private static final C6697t0<Object> f31176b = new C6687b(C6658j0.f31136e, 0);

    /* renamed from: b7.q$a */
    /* compiled from: ImmutableList */
    public static final class C6686a<E> extends C6673o.C6674a<E> {
        public C6686a() {
            this(4);
        }

        /* renamed from: f */
        public C6686a<E> mo22506a(E e) {
            super.mo22505d(e);
            return this;
        }

        /* renamed from: g */
        public C6686a<E> mo22546g(Iterable<? extends E> iterable) {
            super.mo22504b(iterable);
            return this;
        }

        /* renamed from: h */
        public C6685q<E> mo22547h() {
            this.f31169c = true;
            return C6685q.m38440q(this.f31167a, this.f31168b);
        }

        C6686a(int i) {
            super(i);
        }
    }

    /* renamed from: b7.q$b */
    /* compiled from: ImmutableList */
    static class C6687b<E> extends C6613a<E> {

        /* renamed from: c */
        private final C6685q<E> f31177c;

        C6687b(C6685q<E> qVar, int i) {
            super(qVar.size(), i);
            this.f31177c = qVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public E mo22244a(int i) {
            return this.f31177c.get(i);
        }
    }

    /* renamed from: b7.q$c */
    /* compiled from: ImmutableList */
    class C6688c extends C6685q<E> {

        /* renamed from: c */
        final transient int f31178c;

        /* renamed from: d */
        final transient int f31179d;

        C6688c(int i, int i2) {
            this.f31178c = i;
            this.f31179d = i2;
        }

        /* renamed from: B */
        public C6685q<E> subList(int i, int i2) {
            C6431n.m37566s(i, i2, this.f31179d);
            C6685q qVar = C6685q.this;
            int i3 = this.f31178c;
            return qVar.subList(i + i3, i2 + i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public Object[] mo22448f() {
            return C6685q.this.mo22448f();
        }

        public E get(int i) {
            C6431n.m37559l(i, this.f31179d);
            return C6685q.this.get(i + this.f31178c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public int mo22450i() {
            return C6685q.this.mo22451j() + this.f31178c + this.f31179d;
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return C6685q.super.iterator();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public int mo22451j() {
            return C6685q.this.mo22451j() + this.f31178c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo22452k() {
            return true;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return C6685q.super.listIterator();
        }

        public int size() {
            return this.f31179d;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return C6685q.super.listIterator(i);
        }
    }

    C6685q() {
    }

    /* renamed from: A */
    public static <E> C6685q<E> m38438A(E e, E e2, E e3, E e4, E e5) {
        return m38442s(e, e2, e3, e4, e5);
    }

    /* renamed from: o */
    static <E> C6685q<E> m38439o(Object[] objArr) {
        return m38440q(objArr, objArr.length);
    }

    /* renamed from: q */
    static <E> C6685q<E> m38440q(Object[] objArr, int i) {
        if (i == 0) {
            return m38445x();
        }
        return new C6658j0(objArr, i);
    }

    /* renamed from: r */
    public static <E> C6686a<E> m38441r() {
        return new C6686a<>();
    }

    /* renamed from: s */
    private static <E> C6685q<E> m38442s(Object... objArr) {
        return m38439o(C6651g0.m38331b(objArr));
    }

    /* renamed from: t */
    public static <E> C6685q<E> m38443t(Collection<? extends E> collection) {
        if (!(collection instanceof C6673o)) {
            return m38442s(collection.toArray());
        }
        C6685q<E> b = ((C6673o) collection).mo22475b();
        return b.mo22452k() ? m38439o(b.toArray()) : b;
    }

    /* renamed from: u */
    public static <E> C6685q<E> m38444u(E[] eArr) {
        if (eArr.length == 0) {
            return m38445x();
        }
        return m38442s((Object[]) eArr.clone());
    }

    /* renamed from: x */
    public static <E> C6685q<E> m38445x() {
        return C6658j0.f31136e;
    }

    /* renamed from: y */
    public static <E> C6685q<E> m38446y(E e) {
        return m38442s(e);
    }

    /* renamed from: z */
    public static <E> C6685q<E> m38447z(E e, E e2) {
        return m38442s(e, e2);
    }

    /* renamed from: B */
    public C6685q<E> subList(int i, int i2) {
        C6431n.m37566s(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return m38445x();
        }
        return mo22531C(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public C6685q<E> mo22531C(int i, int i2) {
        return new C6688c(i, i2 - i);
    }

    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    /* renamed from: b */
    public final C6685q<E> mo22475b() {
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo22447c(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean equals(Object obj) {
        return C6703w.m38532c(this, obj);
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C6703w.m38533d(this, obj);
    }

    /* renamed from: l */
    public C6695s0<E> iterator() {
        return listIterator();
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C6703w.m38535f(this, obj);
    }

    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: v */
    public C6697t0<E> listIterator() {
        return listIterator(0);
    }

    /* renamed from: w */
    public C6697t0<E> listIterator(int i) {
        C6431n.m37564q(i, size());
        if (isEmpty()) {
            return f31176b;
        }
        return new C6687b(this, i);
    }
}
