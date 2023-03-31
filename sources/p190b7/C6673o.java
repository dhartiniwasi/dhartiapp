package p190b7;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import p182a7.C6431n;

/* renamed from: b7.o */
/* compiled from: ImmutableCollection */
public abstract class C6673o<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a */
    private static final Object[] f31166a = new Object[0];

    /* renamed from: b7.o$a */
    /* compiled from: ImmutableCollection */
    static abstract class C6674a<E> extends C6675b<E> {

        /* renamed from: a */
        Object[] f31167a;

        /* renamed from: b */
        int f31168b = 0;

        /* renamed from: c */
        boolean f31169c;

        C6674a(int i) {
            C6652h.m38335b(i, "initialCapacity");
            this.f31167a = new Object[i];
        }

        /* renamed from: e */
        private void m38420e(int i) {
            Object[] objArr = this.f31167a;
            if (objArr.length < i) {
                this.f31167a = Arrays.copyOf(objArr, C6675b.m38423c(objArr.length, i));
                this.f31169c = false;
            } else if (this.f31169c) {
                this.f31167a = (Object[]) objArr.clone();
                this.f31169c = false;
            }
        }

        /* renamed from: b */
        public C6675b<E> mo22504b(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                m38420e(this.f31168b + collection.size());
                if (collection instanceof C6673o) {
                    this.f31168b = ((C6673o) collection).mo22447c(this.f31167a, this.f31168b);
                    return this;
                }
            }
            super.mo22504b(iterable);
            return this;
        }

        /* renamed from: d */
        public C6674a<E> mo22505d(E e) {
            C6431n.m37561n(e);
            m38420e(this.f31168b + 1);
            Object[] objArr = this.f31167a;
            int i = this.f31168b;
            this.f31168b = i + 1;
            objArr[i] = e;
            return this;
        }
    }

    /* renamed from: b7.o$b */
    /* compiled from: ImmutableCollection */
    public static abstract class C6675b<E> {
        C6675b() {
        }

        /* renamed from: c */
        static int m38423c(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }

        /* renamed from: a */
        public abstract C6675b<E> mo22506a(E e);

        /* renamed from: b */
        public C6675b<E> mo22504b(Iterable<? extends E> iterable) {
            for (Object a : iterable) {
                mo22506a(a);
            }
            return this;
        }
    }

    C6673o() {
    }

    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public C6685q<E> mo22475b() {
        return isEmpty() ? C6685q.m38445x() : C6685q.m38439o(toArray());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo22447c(Object[] objArr, int i) {
        C6695s0 l = iterator();
        while (l.hasNext()) {
            objArr[i] = l.next();
            i++;
        }
        return i;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Object[] mo22448f() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo22450i() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo22451j() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract boolean mo22452k();

    /* renamed from: l */
    public abstract C6695s0<E> iterator();

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f31166a);
    }

    public final <T> T[] toArray(T[] tArr) {
        C6431n.m37561n(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] f = mo22448f();
            if (f != null) {
                return C6656i0.m38344a(f, mo22451j(), mo22450i(), tArr);
            }
            tArr = C6651g0.m38333d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo22447c(tArr, 0);
        return tArr;
    }
}
