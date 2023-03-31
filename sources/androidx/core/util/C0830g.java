package androidx.core.util;

/* renamed from: androidx.core.util.g */
/* compiled from: Pools */
public class C0830g<T> extends C0829f<T> {

    /* renamed from: c */
    private final Object f2442c = new Object();

    public C0830g(int i) {
        super(i);
    }

    /* renamed from: a */
    public boolean mo3225a(T t) {
        boolean a;
        synchronized (this.f2442c) {
            a = super.mo3225a(t);
        }
        return a;
    }

    /* renamed from: b */
    public T mo3226b() {
        T b;
        synchronized (this.f2442c) {
            b = super.mo3226b();
        }
        return b;
    }
}
