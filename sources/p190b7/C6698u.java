package p190b7;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p182a7.C6431n;
import p182a7.C6432o;

/* renamed from: b7.u */
/* compiled from: Iterators */
public final class C6698u {

    /* renamed from: b7.u$a */
    /* compiled from: Iterators */
    class C6699a extends C6615b<T> {

        /* renamed from: c */
        final /* synthetic */ Iterator f31196c;

        /* renamed from: d */
        final /* synthetic */ C6432o f31197d;

        C6699a(Iterator it, C6432o oVar) {
            this.f31196c = it;
            this.f31197d = oVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public T mo22251a() {
            while (this.f31196c.hasNext()) {
                T next = this.f31196c.next();
                if (this.f31197d.apply(next)) {
                    return next;
                }
            }
            return mo22252c();
        }
    }

    /* renamed from: b7.u$b */
    /* compiled from: Iterators */
    class C6700b extends C6695s0<T> {

        /* renamed from: a */
        boolean f31198a;

        /* renamed from: b */
        final /* synthetic */ Object f31199b;

        C6700b(Object obj) {
            this.f31199b = obj;
        }

        public boolean hasNext() {
            return !this.f31198a;
        }

        public T next() {
            if (!this.f31198a) {
                this.f31198a = true;
                return this.f31199b;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: b7.u$c */
    /* compiled from: Iterators */
    private enum C6701c implements Iterator<Object> {
        INSTANCE;

        public boolean hasNext() {
            return false;
        }

        public Object next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            C6652h.m38336c(false);
        }
    }

    /* renamed from: a */
    public static <T> boolean m38512a(Collection<T> collection, Iterator<? extends T> it) {
        C6431n.m37561n(collection);
        C6431n.m37561n(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    /* renamed from: b */
    public static <T> boolean m38513b(Iterator<T> it, C6432o<? super T> oVar) {
        return m38523l(it, oVar) != -1;
    }

    /* renamed from: c */
    static void m38514c(Iterator<?> it) {
        C6431n.m37561n(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* renamed from: d */
    public static boolean m38515d(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0006  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m38516e(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        /*
        L_0x0000:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = p182a7.C6425j.m37541a(r0, r2)
            if (r0 != 0) goto L_0x0000
            return r1
        L_0x001d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p190b7.C6698u.m38516e(java.util.Iterator, java.util.Iterator):boolean");
    }

    /* renamed from: f */
    static <T> Iterator<T> m38517f() {
        return C6701c.INSTANCE;
    }

    /* renamed from: g */
    public static <T> C6695s0<T> m38518g(Iterator<T> it, C6432o<? super T> oVar) {
        C6431n.m37561n(it);
        C6431n.m37561n(oVar);
        return new C6699a(it, oVar);
    }

    /* renamed from: h */
    public static <T> T m38519h(Iterator<T> it, C6432o<? super T> oVar) {
        C6431n.m37561n(it);
        C6431n.m37561n(oVar);
        while (it.hasNext()) {
            T next = it.next();
            if (oVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: i */
    public static <T> T m38520i(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* renamed from: j */
    public static <T> T m38521j(Iterator<? extends T> it, T t) {
        return it.hasNext() ? m38520i(it) : t;
    }

    /* renamed from: k */
    public static <T> T m38522k(Iterator<? extends T> it, T t) {
        return it.hasNext() ? it.next() : t;
    }

    /* renamed from: l */
    public static <T> int m38523l(Iterator<T> it, C6432o<? super T> oVar) {
        C6431n.m37562o(oVar, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (oVar.apply(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: m */
    static <T> T m38524m(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    /* renamed from: n */
    public static boolean m38525n(Iterator<?> it, Collection<?> collection) {
        C6431n.m37561n(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: o */
    public static <T> boolean m38526o(Iterator<T> it, C6432o<? super T> oVar) {
        C6431n.m37561n(oVar);
        boolean z = false;
        while (it.hasNext()) {
            if (oVar.apply(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: p */
    public static <T> C6695s0<T> m38527p(T t) {
        return new C6700b(t);
    }
}
