package kotlinx.coroutines.internal;

import java.util.Objects;

/* renamed from: kotlinx.coroutines.internal.a */
/* compiled from: ArrayQueue.kt */
public class C11680a<T> {

    /* renamed from: a */
    private Object[] f44244a = new Object[16];

    /* renamed from: b */
    private int f44245b;

    /* renamed from: c */
    private int f44246c;

    /* renamed from: b */
    private final void m56819b() {
        Object[] objArr = this.f44244a;
        int length = objArr.length;
        Object[] objArr2 = new Object[(length << 1)];
        Object[] objArr3 = objArr2;
        Object[] unused = C10513e.m52926c(objArr, objArr3, 0, this.f44245b, 0, 10, (Object) null);
        Object[] objArr4 = this.f44244a;
        int length2 = objArr4.length;
        int i = this.f44245b;
        Object[] unused2 = C10513e.m52926c(objArr4, objArr2, length2 - i, 0, i, 4, (Object) null);
        this.f44244a = objArr3;
        this.f44245b = 0;
        this.f44246c = length;
    }

    /* renamed from: a */
    public final void mo35870a(T t) {
        Object[] objArr = this.f44244a;
        int i = this.f44246c;
        objArr[i] = t;
        int length = (objArr.length - 1) & (i + 1);
        this.f44246c = length;
        if (length == this.f44245b) {
            m56819b();
        }
    }

    /* renamed from: c */
    public final boolean mo35871c() {
        return this.f44245b == this.f44246c;
    }

    /* renamed from: d */
    public final T mo35872d() {
        int i = this.f44245b;
        if (i == this.f44246c) {
            return null;
        }
        T[] tArr = this.f44244a;
        T t = tArr[i];
        tArr[i] = null;
        this.f44245b = (i + 1) & (tArr.length - 1);
        Objects.requireNonNull(t, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
        return t;
    }
}
