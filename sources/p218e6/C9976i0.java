package p218e6;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import p033d5.C4141r;

/* renamed from: e6.i0 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class C9976i0<TResult> extends C9975i<TResult> {

    /* renamed from: a */
    private final Object f39908a = new Object();

    /* renamed from: b */
    private final C9970f0 f39909b = new C9970f0();

    /* renamed from: c */
    private boolean f39910c;

    /* renamed from: d */
    private volatile boolean f39911d;

    /* renamed from: e */
    private Object f39912e;

    /* renamed from: f */
    private Exception f39913f;

    C9976i0() {
    }

    /* renamed from: A */
    private final void m50994A() {
        if (this.f39910c) {
            throw C9961b.m50958a(this);
        }
    }

    /* renamed from: B */
    private final void m50995B() {
        synchronized (this.f39908a) {
            if (this.f39910c) {
                this.f39909b.mo32534b(this);
            }
        }
    }

    /* renamed from: y */
    private final void m50996y() {
        C4141r.m28225o(this.f39910c, "Task is not yet complete");
    }

    /* renamed from: z */
    private final void m50997z() {
        if (this.f39911d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: a */
    public final C9975i<TResult> mo26346a(Executor executor, C9963c cVar) {
        this.f39909b.mo32533a(new C9990v(executor, cVar));
        m50995B();
        return this;
    }

    /* renamed from: b */
    public final C9975i<TResult> mo26347b(C9965d<TResult> dVar) {
        this.f39909b.mo32533a(new C9992x(C9979k.f39917a, dVar));
        m50995B();
        return this;
    }

    /* renamed from: c */
    public final C9975i<TResult> mo26348c(Executor executor, C9965d<TResult> dVar) {
        this.f39909b.mo32533a(new C9992x(executor, dVar));
        m50995B();
        return this;
    }

    /* renamed from: d */
    public final C9975i<TResult> mo26349d(C9967e eVar) {
        mo26350e(C9979k.f39917a, eVar);
        return this;
    }

    /* renamed from: e */
    public final C9975i<TResult> mo26350e(Executor executor, C9967e eVar) {
        this.f39909b.mo32533a(new C9994z(executor, eVar));
        m50995B();
        return this;
    }

    /* renamed from: f */
    public final C9975i<TResult> mo26351f(C9969f<? super TResult> fVar) {
        mo26352g(C9979k.f39917a, fVar);
        return this;
    }

    /* renamed from: g */
    public final C9975i<TResult> mo26352g(Executor executor, C9969f<? super TResult> fVar) {
        this.f39909b.mo32533a(new C9962b0(executor, fVar));
        m50995B();
        return this;
    }

    /* renamed from: h */
    public final <TContinuationResult> C9975i<TContinuationResult> mo26353h(C9959a<TResult, TContinuationResult> aVar) {
        return mo26354i(C9979k.f39917a, aVar);
    }

    /* renamed from: i */
    public final <TContinuationResult> C9975i<TContinuationResult> mo26354i(Executor executor, C9959a<TResult, TContinuationResult> aVar) {
        C9976i0 i0Var = new C9976i0();
        this.f39909b.mo32533a(new C9986r(executor, aVar, i0Var));
        m50995B();
        return i0Var;
    }

    /* renamed from: j */
    public final <TContinuationResult> C9975i<TContinuationResult> mo26355j(C9959a<TResult, C9975i<TContinuationResult>> aVar) {
        return mo26356k(C9979k.f39917a, aVar);
    }

    /* renamed from: k */
    public final <TContinuationResult> C9975i<TContinuationResult> mo26356k(Executor executor, C9959a<TResult, C9975i<TContinuationResult>> aVar) {
        C9976i0 i0Var = new C9976i0();
        this.f39909b.mo32533a(new C9988t(executor, aVar, i0Var));
        m50995B();
        return i0Var;
    }

    /* renamed from: l */
    public final Exception mo26357l() {
        Exception exc;
        synchronized (this.f39908a) {
            exc = this.f39913f;
        }
        return exc;
    }

    /* renamed from: m */
    public final TResult mo26358m() {
        TResult tresult;
        synchronized (this.f39908a) {
            m50996y();
            m50997z();
            Exception exc = this.f39913f;
            if (exc == null) {
                tresult = this.f39912e;
            } else {
                throw new C9971g(exc);
            }
        }
        return tresult;
    }

    /* renamed from: n */
    public final <X extends Throwable> TResult mo26359n(Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f39908a) {
            m50996y();
            m50997z();
            if (!cls.isInstance(this.f39913f)) {
                Exception exc = this.f39913f;
                if (exc == null) {
                    tresult = this.f39912e;
                } else {
                    throw new C9971g(exc);
                }
            } else {
                throw ((Throwable) cls.cast(this.f39913f));
            }
        }
        return tresult;
    }

    /* renamed from: o */
    public final boolean mo26360o() {
        return this.f39911d;
    }

    /* renamed from: p */
    public final boolean mo26361p() {
        boolean z;
        synchronized (this.f39908a) {
            z = this.f39910c;
        }
        return z;
    }

    /* renamed from: q */
    public final boolean mo26362q() {
        boolean z;
        synchronized (this.f39908a) {
            z = false;
            if (this.f39910c && !this.f39911d && this.f39913f == null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: r */
    public final <TContinuationResult> C9975i<TContinuationResult> mo26363r(C9973h<TResult, TContinuationResult> hVar) {
        Executor executor = C9979k.f39917a;
        C9976i0 i0Var = new C9976i0();
        this.f39909b.mo32533a(new C9966d0(executor, hVar, i0Var));
        m50995B();
        return i0Var;
    }

    /* renamed from: s */
    public final <TContinuationResult> C9975i<TContinuationResult> mo26364s(Executor executor, C9973h<TResult, TContinuationResult> hVar) {
        C9976i0 i0Var = new C9976i0();
        this.f39909b.mo32533a(new C9966d0(executor, hVar, i0Var));
        m50995B();
        return i0Var;
    }

    /* renamed from: t */
    public final void mo32537t(Exception exc) {
        C4141r.m28222l(exc, "Exception must not be null");
        synchronized (this.f39908a) {
            m50994A();
            this.f39910c = true;
            this.f39913f = exc;
        }
        this.f39909b.mo32534b(this);
    }

    /* renamed from: u */
    public final void mo32538u(Object obj) {
        synchronized (this.f39908a) {
            m50994A();
            this.f39910c = true;
            this.f39912e = obj;
        }
        this.f39909b.mo32534b(this);
    }

    /* renamed from: v */
    public final boolean mo32539v() {
        synchronized (this.f39908a) {
            if (this.f39910c) {
                return false;
            }
            this.f39910c = true;
            this.f39911d = true;
            this.f39909b.mo32534b(this);
            return true;
        }
    }

    /* renamed from: w */
    public final boolean mo32540w(Exception exc) {
        C4141r.m28222l(exc, "Exception must not be null");
        synchronized (this.f39908a) {
            if (this.f39910c) {
                return false;
            }
            this.f39910c = true;
            this.f39913f = exc;
            this.f39909b.mo32534b(this);
            return true;
        }
    }

    /* renamed from: x */
    public final boolean mo32541x(Object obj) {
        synchronized (this.f39908a) {
            if (this.f39910c) {
                return false;
            }
            this.f39910c = true;
            this.f39912e = obj;
            this.f39909b.mo32534b(this);
            return true;
        }
    }
}
