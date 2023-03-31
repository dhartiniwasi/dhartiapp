package p188ae;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.C11690e0;
import kotlinx.coroutines.internal.C11715m0;
import kotlinx.coroutines.internal.C11721r;
import kotlinx.coroutines.internal.C11733y;
import p243gd.C10349s;
import p344rd.C12439l;
import p410yd.C13326m;
import p410yd.C13330n0;

/* renamed from: ae.m */
/* compiled from: ConflatedChannel.kt */
public class C6598m<E> extends C6576a<E> {

    /* renamed from: e */
    private final ReentrantLock f31059e = new ReentrantLock();

    /* renamed from: f */
    private Object f31060f = C6581b.f31032a;

    public C6598m(C12439l<? super E, C10349s> lVar) {
        super(lVar);
    }

    /* renamed from: x */
    private final C11715m0 m38212x(Object obj) {
        C12439l<E, C10349s> lVar;
        Object obj2 = this.f31060f;
        C11715m0 m0Var = null;
        if (!(obj2 == C6581b.f31032a || (lVar = this.f31039b) == null)) {
            m0Var = C11733y.m56987d(lVar, obj2, (C11715m0) null, 2, (Object) null);
        }
        this.f31060f = obj;
        return m0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo22211c() {
        return "(value=" + this.f31060f + ')';
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: i */
    public Object mo22214i(E e) {
        C6602q l;
        C11690e0 g;
        ReentrantLock reentrantLock = this.f31059e;
        reentrantLock.lock();
        try {
            C6595j<?> d = mo22212d();
            if (d == null) {
                if (this.f31060f == C6581b.f31032a) {
                    do {
                        l = mo22190l();
                        if (l != null) {
                            if (l instanceof C6595j) {
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
                    C10349s sVar = C10349s.f40964a;
                    reentrantLock.unlock();
                    l.mo22201f(e);
                    return l.mo22233a();
                }
                C11715m0 x = m38212x(e);
                if (x == null) {
                    C11690e0 e0Var = C6581b.f31033b;
                    reentrantLock.unlock();
                    return e0Var;
                }
                throw x;
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
        ReentrantLock reentrantLock = this.f31059e;
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
        return this.f31060f == C6581b.f31032a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Object mo22196v() {
        ReentrantLock reentrantLock = this.f31059e;
        reentrantLock.lock();
        try {
            Object obj = this.f31060f;
            C11690e0 e0Var = C6581b.f31032a;
            if (obj == e0Var) {
                Object d = mo22212d();
                if (d == null) {
                    d = C6581b.f31035d;
                }
                return d;
            }
            this.f31060f = e0Var;
            C10349s sVar = C10349s.f40964a;
            reentrantLock.unlock();
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
