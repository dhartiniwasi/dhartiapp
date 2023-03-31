package p188ae;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C11669k;
import kotlinx.coroutines.internal.C11690e0;
import kotlinx.coroutines.internal.C11721r;
import p243gd.C10339k;
import p243gd.C10349s;
import p344rd.C12439l;
import p410yd.C13326m;
import p410yd.C13330n0;

/* renamed from: ae.d */
/* compiled from: ArrayChannel.kt */
public class C6584d<E> extends C6576a<E> {

    /* renamed from: e */
    private final int f31042e;

    /* renamed from: f */
    private final C6586e f31043f;

    /* renamed from: g */
    private final ReentrantLock f31044g;

    /* renamed from: h */
    private Object[] f31045h;

    /* renamed from: i */
    private int f31046i;
    private volatile /* synthetic */ int size;

    /* renamed from: ae.d$a */
    /* compiled from: ArrayChannel.kt */
    public /* synthetic */ class C6585a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31047a;

        static {
            int[] iArr = new int[C6586e.values().length];
            iArr[C6586e.SUSPEND.ordinal()] = 1;
            iArr[C6586e.DROP_LATEST.ordinal()] = 2;
            iArr[C6586e.DROP_OLDEST.ordinal()] = 3;
            f31047a = iArr;
        }
    }

    public C6584d(int i, C6586e eVar, C12439l<? super E, C10349s> lVar) {
        super(lVar);
        this.f31042e = i;
        this.f31043f = eVar;
        if (i < 1 ? false : true) {
            this.f31044g = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i, 8)];
            C10513e.m52928e(objArr, C6581b.f31032a, 0, 0, 6, (Object) null);
            this.f31045h = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i + " was specified").toString());
    }

    /* renamed from: x */
    private final void m38183x(int i, E e) {
        if (i < this.f31042e) {
            m38184y(i);
            Object[] objArr = this.f31045h;
            objArr[(this.f31046i + i) % objArr.length] = e;
            return;
        }
        if (C13330n0.m62281a()) {
            if (!(this.f31043f == C6586e.DROP_OLDEST)) {
                throw new AssertionError();
            }
        }
        Object[] objArr2 = this.f31045h;
        int i2 = this.f31046i;
        objArr2[i2 % objArr2.length] = null;
        objArr2[(i + i2) % objArr2.length] = e;
        this.f31046i = (i2 + 1) % objArr2.length;
    }

    /* renamed from: y */
    private final void m38184y(int i) {
        Object[] objArr = this.f31045h;
        if (i >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f31042e);
            Object[] objArr2 = new Object[min];
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr3 = this.f31045h;
                objArr2[i2] = objArr3[(this.f31046i + i2) % objArr3.length];
            }
            C10513e.m52927d(objArr2, C6581b.f31032a, i, min);
            this.f31045h = objArr2;
            this.f31046i = 0;
        }
    }

    /* renamed from: z */
    private final C11690e0 m38185z(int i) {
        if (i < this.f31042e) {
            this.size = i + 1;
            return null;
        }
        int i2 = C6585a.f31047a[this.f31043f.ordinal()];
        if (i2 == 1) {
            return C6581b.f31034c;
        }
        if (i2 == 2) {
            return C6581b.f31033b;
        }
        if (i2 == 3) {
            return null;
        }
        throw new C10339k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo22211c() {
        return "(buffer:capacity=" + this.f31042e + ",size=" + this.size + ')';
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: i */
    public Object mo22214i(E e) {
        C6602q l;
        C11690e0 g;
        ReentrantLock reentrantLock = this.f31044g;
        reentrantLock.lock();
        try {
            int i = this.size;
            C6595j<?> d = mo22212d();
            if (d == null) {
                C11690e0 z = m38185z(i);
                if (z == null) {
                    if (i == 0) {
                        do {
                            l = mo22190l();
                            if (l != null) {
                                if (l instanceof C6595j) {
                                    this.size = i;
                                    reentrantLock.unlock();
                                    return l;
                                }
                                g = l.mo22202g(e, (C11721r.C11723b) null);
                            }
                        } while (g == null);
                        if (C13330n0.m62281a()) {
                            if (!(g == C13326m.f47647a)) {
                                throw new AssertionError();
                            }
                        }
                        this.size = i;
                        C10349s sVar = C10349s.f40964a;
                        reentrantLock.unlock();
                        l.mo22201f(e);
                        return l.mo22233a();
                    }
                    m38183x(i, e);
                    C11690e0 e0Var = C6581b.f31033b;
                    reentrantLock.unlock();
                    return e0Var;
                }
                reentrantLock.unlock();
                return z;
            }
            reentrantLock.unlock();
            return d;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo22191q(C6600o<? super E> oVar) {
        ReentrantLock reentrantLock = this.f31044g;
        reentrantLock.lock();
        try {
            return super.mo22191q(oVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo22192r() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final boolean mo22193s() {
        return this.size == 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Object mo22196v() {
        ReentrantLock reentrantLock = this.f31044g;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object d = mo22212d();
                if (d == null) {
                    d = C6581b.f31035d;
                }
                return d;
            }
            Object[] objArr = this.f31045h;
            int i2 = this.f31046i;
            Object obj = objArr[i2];
            C6604s sVar = null;
            objArr[i2] = null;
            this.size = i - 1;
            Object obj2 = C6581b.f31035d;
            boolean z = false;
            if (i == this.f31042e) {
                C6604s sVar2 = null;
                while (true) {
                    C6604s m = mo22217m();
                    if (m == null) {
                        sVar = sVar2;
                        break;
                    }
                    C11690e0 z2 = m.mo22221z((C11721r.C11723b) null);
                    if (z2 != null) {
                        if (C13330n0.m62281a()) {
                            if (z2 == C13326m.f47647a) {
                                z = true;
                            }
                            if (!z) {
                                throw new AssertionError();
                            }
                        }
                        obj2 = m.mo22220y();
                        sVar = m;
                        z = true;
                    } else {
                        m.mo22235A();
                        sVar2 = m;
                    }
                }
            }
            if (obj2 != C6581b.f31035d && !(obj2 instanceof C6595j)) {
                this.size = i;
                Object[] objArr2 = this.f31045h;
                objArr2[(this.f31046i + i) % objArr2.length] = obj2;
            }
            this.f31046i = (this.f31046i + 1) % this.f31045h.length;
            C10349s sVar3 = C10349s.f40964a;
            reentrantLock.unlock();
            if (z) {
                C11669k.m56784b(sVar);
                sVar.mo22219x();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
