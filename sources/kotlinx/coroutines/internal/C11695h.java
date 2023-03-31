package kotlinx.coroutines.internal;

import androidx.concurrent.futures.C0600b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.C11649e;
import kotlin.jvm.internal.C11669k;
import p243gd.C10349s;
import p272jd.C11565d;
import p272jd.C11570g;
import p344rd.C12439l;
import p410yd.C13266a1;
import p410yd.C13282d0;
import p410yd.C13301g2;
import p410yd.C13316k;
import p410yd.C13322l;
import p410yd.C13330n0;
import p410yd.C13333o0;
import p410yd.C13353u0;
import p410yd.C13358w;
import p410yd.C13370z;

/* renamed from: kotlinx.coroutines.internal.h */
/* compiled from: DispatchedContinuation.kt */
public final class C11695h<T> extends C13353u0<T> implements C11649e, C11565d<T> {

    /* renamed from: h */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f44260h = AtomicReferenceFieldUpdater.newUpdater(C11695h.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation = null;

    /* renamed from: d */
    public final C13282d0 f44261d;

    /* renamed from: e */
    public final C11565d<T> f44262e;

    /* renamed from: f */
    public Object f44263f = C11697i.f44265a;

    /* renamed from: g */
    public final Object f44264g = C11698i0.m56882b(getContext());

    public C11695h(C13282d0 d0Var, C11565d<? super T> dVar) {
        super(-1);
        this.f44261d = d0Var;
        this.f44262e = dVar;
    }

    /* renamed from: o */
    private final C13322l<?> m56863o() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof C13322l) {
            return (C13322l) obj;
        }
        return null;
    }

    /* renamed from: b */
    public void mo35890b(Object obj, Throwable th) {
        if (obj instanceof C13358w) {
            ((C13358w) obj).f47679b.invoke(th);
        }
    }

    /* renamed from: d */
    public C11565d<T> mo35891d() {
        return this;
    }

    public C11649e getCallerFrame() {
        C11565d<T> dVar = this.f44262e;
        if (dVar instanceof C11649e) {
            return (C11649e) dVar;
        }
        return null;
    }

    public C11570g getContext() {
        return this.f44262e.getContext();
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* renamed from: l */
    public Object mo35892l() {
        Object obj = this.f44263f;
        if (C13330n0.m62281a()) {
            if (!(obj != C11697i.f44265a)) {
                throw new AssertionError();
            }
        }
        this.f44263f = C11697i.f44265a;
        return obj;
    }

    /* renamed from: m */
    public final void mo35893m() {
        do {
        } while (this._reusableCancellableContinuation == C11697i.f44266b);
    }

    /* renamed from: n */
    public final C13322l<T> mo35894n() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = C11697i.f44266b;
                return null;
            } else if (obj instanceof C13322l) {
                if (C0600b.m2800a(f44260h, this, obj, C11697i.f44266b)) {
                    return (C13322l) obj;
                }
            } else if (obj != C11697i.f44266b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(C11669k.m56792j("Inconsistent state ", obj).toString());
            }
        }
    }

    /* renamed from: p */
    public final boolean mo35895p() {
        return this._reusableCancellableContinuation != null;
    }

    /* renamed from: q */
    public final boolean mo35896q(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C11690e0 e0Var = C11697i.f44266b;
            if (C11669k.m56783a(obj, e0Var)) {
                if (C0600b.m2800a(f44260h, this, e0Var, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (C0600b.m2800a(f44260h, this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    /* renamed from: r */
    public final void mo35897r() {
        mo35893m();
        C13322l<?> o = m56863o();
        if (o != null) {
            o.mo38456s();
        }
    }

    public void resumeWith(Object obj) {
        C11570g context;
        Object c;
        C11570g context2 = this.f44262e.getContext();
        Object d = C13370z.m62447d(obj, (C12439l) null, 1, (Object) null);
        if (this.f44261d.mo35954I(context2)) {
            this.f44263f = d;
            this.f47674c = 0;
            this.f44261d.mo35925H(context2, this);
            return;
        }
        boolean a = C13330n0.m62281a();
        C13266a1 a2 = C13301g2.f47622a.mo38422a();
        if (a2.mo38386c0()) {
            this.f44263f = d;
            this.f47674c = 0;
            a2.mo38383S(this);
            return;
        }
        a2.mo38385X(true);
        try {
            context = getContext();
            c = C11698i0.m56883c(context, this.f44264g);
            this.f44262e.resumeWith(obj);
            C10349s sVar = C10349s.f40964a;
            C11698i0.m56881a(context, c);
            do {
            } while (a2.mo38388f0());
        } catch (Throwable th) {
            try {
                mo38488h(th, (Throwable) null);
            } catch (Throwable th2) {
                a2.mo38382L(true);
                throw th2;
            }
        }
        a2.mo38382L(true);
    }

    /* renamed from: s */
    public final Throwable mo35898s(C13316k<?> kVar) {
        C11690e0 e0Var;
        do {
            Object obj = this._reusableCancellableContinuation;
            e0Var = C11697i.f44266b;
            if (obj != e0Var) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(C11669k.m56792j("Inconsistent state ", obj).toString());
                } else if (C0600b.m2800a(f44260h, this, obj, (Object) null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        } while (!C0600b.m2800a(f44260h, this, e0Var, kVar));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f44261d + ", " + C13333o0.m62289c(this.f44262e) + ']';
    }
}
