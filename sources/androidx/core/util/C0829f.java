package androidx.core.util;

/* renamed from: androidx.core.util.f */
/* compiled from: Pools */
public class C0829f<T> implements C0828e<T> {

    /* renamed from: a */
    private final Object[] f2440a;

    /* renamed from: b */
    private int f2441b;

    public C0829f(int i) {
        if (i > 0) {
            this.f2440a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: c */
    private boolean m3652c(T t) {
        for (int i = 0; i < this.f2441b; i++) {
            if (this.f2440a[i] == t) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo3225a(T t) {
        if (!m3652c(t)) {
            int i = this.f2441b;
            Object[] objArr = this.f2440a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f2441b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    /* renamed from: b */
    public T mo3226b() {
        int i = this.f2441b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f2440a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f2441b = i - 1;
        return t;
    }
}
