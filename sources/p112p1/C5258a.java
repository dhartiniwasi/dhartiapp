package p112p1;

import p234fd.C10201a;

/* renamed from: p1.a */
/* compiled from: DoubleCheck */
public final class C5258a<T> implements C10201a<T> {

    /* renamed from: c */
    private static final Object f27126c = new Object();

    /* renamed from: a */
    private volatile C10201a<T> f27127a;

    /* renamed from: b */
    private volatile Object f27128b = f27126c;

    private C5258a(C10201a<T> aVar) {
        this.f27127a = aVar;
    }

    /* renamed from: a */
    public static <P extends C10201a<T>, T> C10201a<T> m32473a(P p) {
        C5261d.m32477b(p);
        if (p instanceof C5258a) {
            return p;
        }
        return new C5258a(p);
    }

    /* renamed from: b */
    public static Object m32474b(Object obj, Object obj2) {
        if (!(obj != f27126c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t = this.f27128b;
        T t2 = f27126c;
        if (t == t2) {
            synchronized (this) {
                t = this.f27128b;
                if (t == t2) {
                    t = this.f27127a.get();
                    this.f27128b = m32474b(this.f27128b, t);
                    this.f27127a = null;
                }
            }
        }
        return t;
    }
}
