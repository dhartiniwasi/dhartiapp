package p302n7;

import p276k8.C11600b;

/* renamed from: n7.x */
/* compiled from: Lazy */
public class C11972x<T> implements C11600b<T> {

    /* renamed from: c */
    private static final Object f44888c = new Object();

    /* renamed from: a */
    private volatile Object f44889a = f44888c;

    /* renamed from: b */
    private volatile C11600b<T> f44890b;

    public C11972x(C11600b<T> bVar) {
        this.f44890b = bVar;
    }

    public T get() {
        T t = this.f44889a;
        T t2 = f44888c;
        if (t == t2) {
            synchronized (this) {
                t = this.f44889a;
                if (t == t2) {
                    t = this.f44890b.get();
                    this.f44889a = t;
                    this.f44890b = null;
                }
            }
        }
        return t;
    }
}
