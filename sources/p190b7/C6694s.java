package p190b7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import p182a7.C6431n;

/* renamed from: b7.s */
/* compiled from: ImmutableSet */
public abstract class C6694s<E> extends C6673o<E> implements Set<E> {

    /* renamed from: b */
    private transient C6685q<E> f31195b;

    C6694s() {
    }

    /* renamed from: o */
    static int m38491o(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        C6431n.m37552e(z, "collection too large");
        return 1073741824;
    }

    /* renamed from: q */
    private static <E> C6694s<E> m38492q(int i, Object... objArr) {
        if (i == 0) {
            return m38495v();
        }
        if (i != 1) {
            int o = m38491o(i);
            Object[] objArr2 = new Object[o];
            int i2 = o - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object a = C6651g0.m38330a(objArr[i5], i5);
                int hashCode = a.hashCode();
                int a2 = C6671n.m38410a(hashCode);
                while (true) {
                    int i6 = a2 & i2;
                    Object obj = objArr2[i6];
                    if (obj == null) {
                        objArr[i4] = a;
                        objArr2[i6] = a;
                        i3 += hashCode;
                        i4++;
                        break;
                    } else if (obj.equals(a)) {
                        break;
                    } else {
                        a2++;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                return new C6689q0(obj2);
            } else if (m38491o(i4) < o / 2) {
                return m38492q(i4, objArr);
            } else {
                if (m38499z(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new C6668l0(objArr, i3, objArr2, i2, i4);
            }
        } else {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return m38496w(obj3);
        }
    }

    /* renamed from: r */
    public static <E> C6694s<E> m38493r(Collection<? extends E> collection) {
        if ((collection instanceof C6694s) && !(collection instanceof SortedSet)) {
            C6694s<E> sVar = (C6694s) collection;
            if (!sVar.mo22452k()) {
                return sVar;
            }
        }
        Object[] array = collection.toArray();
        return m38492q(array.length, array);
    }

    /* renamed from: s */
    public static <E> C6694s<E> m38494s(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return m38495v();
        }
        if (length != 1) {
            return m38492q(eArr.length, (Object[]) eArr.clone());
        }
        return m38496w(eArr[0]);
    }

    /* renamed from: v */
    public static <E> C6694s<E> m38495v() {
        return C6668l0.f31158i;
    }

    /* renamed from: w */
    public static <E> C6694s<E> m38496w(E e) {
        return new C6689q0(e);
    }

    /* renamed from: x */
    public static <E> C6694s<E> m38497x(E e, E e2) {
        return m38492q(2, e, e2);
    }

    /* renamed from: y */
    public static <E> C6694s<E> m38498y(E e, E e2, E e3) {
        return m38492q(3, e, e2, e3);
    }

    /* renamed from: z */
    private static boolean m38499z(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    /* renamed from: b */
    public C6685q<E> mo22475b() {
        C6685q<E> qVar = this.f31195b;
        if (qVar != null) {
            return qVar;
        }
        C6685q<E> t = mo22471t();
        this.f31195b = t;
        return t;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6694s) || !mo22489u() || !((C6694s) obj).mo22489u() || hashCode() == obj.hashCode()) {
            return C6678p0.m38426a(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return C6678p0.m38429d(this);
    }

    /* renamed from: l */
    public abstract C6695s0<E> iterator();

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public C6685q<E> mo22471t() {
        return C6685q.m38439o(toArray());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo22489u() {
        return false;
    }
}
