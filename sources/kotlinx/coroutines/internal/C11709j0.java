package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlin.jvm.internal.C11669k;
import kotlinx.coroutines.internal.C11711k0;
import p410yd.C13330n0;

/* renamed from: kotlinx.coroutines.internal.j0 */
/* compiled from: ThreadSafeHeap.kt */
public class C11709j0<T extends C11711k0 & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a */
    private T[] f44281a;

    /* renamed from: f */
    private final T[] m56899f() {
        T[] tArr = this.f44281a;
        if (tArr == null) {
            T[] tArr2 = new C11711k0[4];
            this.f44281a = tArr2;
            return tArr2;
        } else if (mo35911c() < tArr.length) {
            return tArr;
        } else {
            T[] copyOf = Arrays.copyOf(tArr, mo35911c() * 2);
            C11669k.m56786d(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (C11711k0[]) copyOf;
            this.f44281a = tArr3;
            return tArr3;
        }
    }

    /* renamed from: j */
    private final void m56900j(int i) {
        this._size = i;
    }

    /* renamed from: k */
    private final void m56901k(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 < mo35911c()) {
                T[] tArr = this.f44281a;
                C11669k.m56784b(tArr);
                int i3 = i2 + 1;
                if (i3 < mo35911c()) {
                    T t = tArr[i3];
                    C11669k.m56784b(t);
                    T t2 = tArr[i2];
                    C11669k.m56784b(t2);
                    if (((Comparable) t).compareTo(t2) < 0) {
                        i2 = i3;
                    }
                }
                T t3 = tArr[i];
                C11669k.m56784b(t3);
                T t4 = tArr[i2];
                C11669k.m56784b(t4);
                if (((Comparable) t3).compareTo(t4) > 0) {
                    m56903m(i, i2);
                    i = i2;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: l */
    private final void m56902l(int i) {
        while (i > 0) {
            T[] tArr = this.f44281a;
            C11669k.m56784b(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            C11669k.m56784b(t);
            T t2 = tArr[i];
            C11669k.m56784b(t2);
            if (((Comparable) t).compareTo(t2) > 0) {
                m56903m(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: m */
    private final void m56903m(int i, int i2) {
        T[] tArr = this.f44281a;
        C11669k.m56784b(tArr);
        T t = tArr[i2];
        C11669k.m56784b(t);
        T t2 = tArr[i];
        C11669k.m56784b(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.mo35921j(i);
        t2.mo35921j(i2);
    }

    /* renamed from: a */
    public final void mo35909a(T t) {
        if (C13330n0.m62281a()) {
            if (!(t.mo35920b() == null)) {
                throw new AssertionError();
            }
        }
        t.mo35919a(this);
        C11711k0[] f = m56899f();
        int c = mo35911c();
        m56900j(c + 1);
        f[c] = t;
        t.mo35921j(c);
        m56902l(c);
    }

    /* renamed from: b */
    public final T mo35910b() {
        T[] tArr = this.f44281a;
        if (tArr == null) {
            return null;
        }
        return tArr[0];
    }

    /* renamed from: c */
    public final int mo35911c() {
        return this._size;
    }

    /* renamed from: d */
    public final boolean mo35912d() {
        return mo35911c() == 0;
    }

    /* renamed from: e */
    public final T mo35913e() {
        T b;
        synchronized (this) {
            b = mo35910b();
        }
        return b;
    }

    /* renamed from: g */
    public final boolean mo35914g(T t) {
        boolean z;
        synchronized (this) {
            z = true;
            boolean z2 = false;
            if (t.mo35920b() == null) {
                z = false;
            } else {
                int k = t.mo35922k();
                if (C13330n0.m62281a()) {
                    if (k >= 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        throw new AssertionError();
                    }
                }
                mo35915h(k);
            }
        }
        return z;
    }

    /* renamed from: h */
    public final T mo35915h(int i) {
        boolean z = false;
        if (C13330n0.m62281a()) {
            if (!(mo35911c() > 0)) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.f44281a;
        C11669k.m56784b(tArr);
        m56900j(mo35911c() - 1);
        if (i < mo35911c()) {
            m56903m(i, mo35911c());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                C11669k.m56784b(t);
                T t2 = tArr[i2];
                C11669k.m56784b(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    m56903m(i, i2);
                    m56902l(i2);
                }
            }
            m56901k(i);
        }
        T t3 = tArr[mo35911c()];
        C11669k.m56784b(t3);
        if (C13330n0.m62281a()) {
            if (t3.mo35920b() == this) {
                z = true;
            }
            if (!z) {
                throw new AssertionError();
            }
        }
        t3.mo35919a((C11709j0<?>) null);
        t3.mo35921j(-1);
        tArr[mo35911c()] = null;
        return t3;
    }

    /* renamed from: i */
    public final T mo35916i() {
        T h;
        synchronized (this) {
            h = mo35911c() > 0 ? mo35915h(0) : null;
        }
        return h;
    }
}
