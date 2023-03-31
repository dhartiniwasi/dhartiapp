package p410yd;

import androidx.concurrent.futures.C0600b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.C11649e;
import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;
import kotlinx.coroutines.internal.C11688d0;
import kotlinx.coroutines.internal.C11690e0;
import kotlinx.coroutines.internal.C11695h;
import p243gd.C10331d;
import p243gd.C10349s;
import p272jd.C11565d;
import p272jd.C11570g;
import p344rd.C12439l;
import p410yd.C13337p1;

/* renamed from: yd.l */
/* compiled from: CancellableContinuationImpl.kt */
public class C13322l<T> extends C13353u0<T> implements C13316k<T>, C11649e {

    /* renamed from: g */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f47635g = AtomicIntegerFieldUpdater.newUpdater(C13322l.class, "_decision");

    /* renamed from: h */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f47636h = AtomicReferenceFieldUpdater.newUpdater(C13322l.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* renamed from: d */
    private final C11565d<T> f47637d;

    /* renamed from: e */
    private final C11570g f47638e;

    /* renamed from: f */
    private C13368y0 f47639f;

    public C13322l(C11565d<? super T> dVar, int i) {
        super(i);
        this.f47637d = dVar;
        if (C13330n0.m62281a()) {
            if (!(i != -1)) {
                throw new AssertionError();
            }
        }
        this.f47638e = dVar.getContext();
        this._decision = 0;
        this._state = C13281d.f47611a;
    }

    /* renamed from: A */
    private final boolean m62238A() {
        return C13356v0.m62350c(this.f47674c) && ((C11695h) this.f47637d).mo35895p();
    }

    /* renamed from: B */
    private final C13307i m62239B(C12439l<? super Throwable, C10349s> lVar) {
        return lVar instanceof C13307i ? (C13307i) lVar : new C13328m1(lVar);
    }

    /* renamed from: C */
    private final void m62240C(C12439l<? super Throwable, C10349s> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    /* renamed from: F */
    private final void m62241F() {
        C11565d<T> dVar = this.f47637d;
        Throwable th = null;
        C11695h hVar = dVar instanceof C11695h ? (C11695h) dVar : null;
        if (hVar != null) {
            th = hVar.mo35898s(this);
        }
        if (th != null) {
            mo38456s();
            mo38455q(th);
        }
    }

    /* renamed from: H */
    private final void m62242H(Object obj, int i, C12439l<? super Throwable, C10349s> lVar) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof C13280c2) {
            } else {
                if (obj2 instanceof C13332o) {
                    C13332o oVar = (C13332o) obj2;
                    if (oVar.mo38465c()) {
                        if (lVar != null) {
                            mo38454p(lVar, oVar.f47676a);
                            return;
                        }
                        return;
                    }
                }
                m62248m(obj);
                throw new C10331d();
            }
        } while (!C0600b.m2800a(f47636h, this, obj2, m62244J((C13280c2) obj2, obj, i, lVar, (Object) null)));
        m62251t();
        m62252u(i);
    }

    /* renamed from: I */
    static /* synthetic */ void m62243I(C13322l lVar, Object obj, int i, C12439l lVar2, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 4) != 0) {
                lVar2 = null;
            }
            lVar.m62242H(obj, i, lVar2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    /* renamed from: J */
    private final Object m62244J(C13280c2 c2Var, Object obj, int i, C12439l<? super Throwable, C10349s> lVar, Object obj2) {
        if (obj instanceof C13355v) {
            boolean z = true;
            if (C13330n0.m62281a()) {
                if (!(obj2 == null)) {
                    throw new AssertionError();
                }
            }
            if (!C13330n0.m62281a()) {
                return obj;
            }
            if (lVar != null) {
                z = false;
            }
            if (z) {
                return obj;
            }
            throw new AssertionError();
        } else if (!C13356v0.m62349b(i) && obj2 == null) {
            return obj;
        } else {
            if (lVar == null && ((!(c2Var instanceof C13307i) || (c2Var instanceof C13287e)) && obj2 == null)) {
                return obj;
            }
            return new C13352u(obj, c2Var instanceof C13307i ? (C13307i) c2Var : null, lVar, obj2, (Throwable) null, 16, (C11665g) null);
        }
    }

    /* renamed from: K */
    private final boolean m62245K() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f47635g.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: L */
    private final C11690e0 m62246L(Object obj, Object obj2, C12439l<? super Throwable, C10349s> lVar) {
        Object obj3;
        do {
            obj3 = this._state;
            if (obj3 instanceof C13280c2) {
            } else if (!(obj3 instanceof C13352u) || obj2 == null) {
                return null;
            } else {
                C13352u uVar = (C13352u) obj3;
                if (uVar.f47672d != obj2) {
                    return null;
                }
                if (!C13330n0.m62281a() || C11669k.m56783a(uVar.f47669a, obj)) {
                    return C13326m.f47647a;
                }
                throw new AssertionError();
            }
        } while (!C0600b.m2800a(f47636h, this, obj3, m62244J((C13280c2) obj3, obj, this.f47674c, lVar, obj2)));
        m62251t();
        return C13326m.f47647a;
    }

    /* renamed from: M */
    private final boolean m62247M() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f47635g.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: m */
    private final Void m62248m(Object obj) {
        throw new IllegalStateException(C11669k.m56792j("Already resumed, but proposed with update ", obj).toString());
    }

    /* renamed from: n */
    private final void m62249n(C12439l<? super Throwable, C10349s> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            C13297g0.m62201a(getContext(), new C13367y(C11669k.m56792j("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    /* renamed from: r */
    private final boolean m62250r(Throwable th) {
        if (!m62238A()) {
            return false;
        }
        return ((C11695h) this.f47637d).mo35896q(th);
    }

    /* renamed from: t */
    private final void m62251t() {
        if (!m62238A()) {
            mo38456s();
        }
    }

    /* renamed from: u */
    private final void m62252u(int i) {
        if (!m62245K()) {
            C13356v0.m62348a(this, i);
        }
    }

    /* renamed from: y */
    private final String m62253y() {
        Object x = mo38460x();
        if (x instanceof C13280c2) {
            return "Active";
        }
        return x instanceof C13332o ? "Cancelled" : "Completed";
    }

    /* renamed from: z */
    private final C13368y0 m62254z() {
        C13337p1 p1Var = (C13337p1) getContext().get(C13337p1.f47660Z);
        if (p1Var == null) {
            return null;
        }
        C13368y0 d = C13337p1.C13338a.m62309d(p1Var, true, false, new C13335p(this), 2, (Object) null);
        this.f47639f = d;
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public String mo38448D() {
        return "CancellableContinuation";
    }

    /* renamed from: E */
    public final void mo38449E(Throwable th) {
        if (!m62250r(th)) {
            mo38455q(th);
            m62251t();
        }
    }

    /* renamed from: G */
    public final boolean mo38450G() {
        if (C13330n0.m62281a()) {
            if (!(this.f47674c == 2)) {
                throw new AssertionError();
            }
        }
        if (C13330n0.m62281a()) {
            if (!(this.f47639f != C13273b2.f47605a)) {
                throw new AssertionError();
            }
        }
        Object obj = this._state;
        if (C13330n0.m62281a() && !(!(obj instanceof C13280c2))) {
            throw new AssertionError();
        } else if (!(obj instanceof C13352u) || ((C13352u) obj).f47672d == null) {
            this._decision = 0;
            this._state = C13281d.f47611a;
            return true;
        } else {
            mo38456s();
            return false;
        }
    }

    /* renamed from: a */
    public Object mo38442a(T t, Object obj) {
        return m62246L(t, obj, (C12439l<? super Throwable, C10349s>) null);
    }

    /* renamed from: b */
    public void mo35890b(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof C13280c2) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof C13355v)) {
                if (obj2 instanceof C13352u) {
                    C13352u uVar = (C13352u) obj2;
                    if (!uVar.mo38483c()) {
                        if (C0600b.m2800a(f47636h, this, obj2, C13352u.m62331b(uVar, (Object) null, (C13307i) null, (C12439l) null, (Object) null, th, 15, (Object) null))) {
                            uVar.mo38484d(this, th);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (C0600b.m2800a(f47636h, this, obj2, new C13352u(obj2, (C13307i) null, (C12439l) null, (Object) null, th, 14, (C11665g) null))) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public Object mo38443c(T t, Object obj, C12439l<? super Throwable, C10349s> lVar) {
        return m62246L(t, obj, lVar);
    }

    /* renamed from: d */
    public final C11565d<T> mo35891d() {
        return this.f47637d;
    }

    /* renamed from: e */
    public Object mo38444e(Throwable th) {
        return m62246L(new C13355v(th, false, 2, (C11665g) null), (Object) null, (C12439l<? super Throwable, C10349s>) null);
    }

    /* renamed from: f */
    public Throwable mo38451f(Object obj) {
        Throwable f = super.mo38451f(obj);
        if (f == null) {
            return null;
        }
        C11565d d = mo35891d();
        return (!C13330n0.m62284d() || !(d instanceof C11649e)) ? f : C11688d0.m56846j(f, (C11649e) d);
    }

    /* renamed from: g */
    public <T> T mo38452g(Object obj) {
        return obj instanceof C13352u ? ((C13352u) obj).f47669a : obj;
    }

    public C11649e getCallerFrame() {
        C11565d<T> dVar = this.f47637d;
        if (dVar instanceof C11649e) {
            return (C11649e) dVar;
        }
        return null;
    }

    public C11570g getContext() {
        return this.f47638e;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* renamed from: i */
    public void mo38445i(T t, C12439l<? super Throwable, C10349s> lVar) {
        m62242H(t, this.f47674c, lVar);
    }

    /* renamed from: j */
    public void mo38446j(C12439l<? super Throwable, C10349s> lVar) {
        C13307i B = m62239B(lVar);
        while (true) {
            Object obj = this._state;
            if (obj instanceof C13281d) {
                if (C0600b.m2800a(f47636h, this, obj, B)) {
                    return;
                }
            } else if (obj instanceof C13307i) {
                m62240C(lVar, obj);
            } else {
                boolean z = obj instanceof C13355v;
                if (z) {
                    C13355v vVar = (C13355v) obj;
                    if (!vVar.mo38491b()) {
                        m62240C(lVar, obj);
                    }
                    if (obj instanceof C13332o) {
                        Throwable th = null;
                        if (!z) {
                            vVar = null;
                        }
                        if (vVar != null) {
                            th = vVar.f47676a;
                        }
                        m62249n(lVar, th);
                        return;
                    }
                    return;
                } else if (obj instanceof C13352u) {
                    C13352u uVar = (C13352u) obj;
                    if (uVar.f47670b != null) {
                        m62240C(lVar, obj);
                    }
                    if (!(B instanceof C13287e)) {
                        if (uVar.mo38483c()) {
                            m62249n(lVar, uVar.f47673e);
                            return;
                        }
                        if (C0600b.m2800a(f47636h, this, obj, C13352u.m62331b(uVar, (Object) null, B, (C12439l) null, (Object) null, (Throwable) null, 29, (Object) null))) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (!(B instanceof C13287e)) {
                    if (C0600b.m2800a(f47636h, this, obj, new C13352u(obj, B, (C12439l) null, (Object) null, (Throwable) null, 28, (C11665g) null))) {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: k */
    public void mo38447k(Object obj) {
        if (C13330n0.m62281a()) {
            if (!(obj == C13326m.f47647a)) {
                throw new AssertionError();
            }
        }
        m62252u(this.f47674c);
    }

    /* renamed from: l */
    public Object mo35892l() {
        return mo38460x();
    }

    /* renamed from: o */
    public final void mo38453o(C13307i iVar, Throwable th) {
        try {
            iVar.mo22206a(th);
        } catch (Throwable th2) {
            C13297g0.m62201a(getContext(), new C13367y(C11669k.m56792j("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    /* renamed from: p */
    public final void mo38454p(C12439l<? super Throwable, C10349s> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            C13297g0.m62201a(getContext(), new C13367y(C11669k.m56792j("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    /* renamed from: q */
    public boolean mo38455q(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof C13280c2)) {
                return false;
            }
            z = obj instanceof C13307i;
        } while (!C0600b.m2800a(f47636h, this, obj, new C13332o(this, th, z)));
        C13307i iVar = z ? (C13307i) obj : null;
        if (iVar != null) {
            mo38453o(iVar, th);
        }
        m62251t();
        m62252u(this.f47674c);
        return true;
    }

    public void resumeWith(Object obj) {
        m62243I(this, C13370z.m62446c(obj, this), this.f47674c, (C12439l) null, 4, (Object) null);
    }

    /* renamed from: s */
    public final void mo38456s() {
        C13368y0 y0Var = this.f47639f;
        if (y0Var != null) {
            y0Var.dispose();
            this.f47639f = C13273b2.f47605a;
        }
    }

    public String toString() {
        return mo38448D() + '(' + C13333o0.m62289c(this.f47637d) + "){" + m62253y() + "}@" + C13333o0.m62288b(this);
    }

    /* renamed from: v */
    public Throwable mo38458v(C13337p1 p1Var) {
        return p1Var.mo38470h();
    }

    /* renamed from: w */
    public final Object mo38459w() {
        C13337p1 p1Var;
        boolean A = m62238A();
        if (m62247M()) {
            if (this.f47639f == null) {
                m62254z();
            }
            if (A) {
                m62241F();
            }
            return C11632d.m56711c();
        }
        if (A) {
            m62241F();
        }
        Object x = mo38460x();
        if (x instanceof C13355v) {
            Throwable th = ((C13355v) x).f47676a;
            if (C13330n0.m62284d()) {
                th = C11688d0.m56846j(th, this);
            }
            throw th;
        } else if (!C13356v0.m62349b(this.f47674c) || (p1Var = (C13337p1) getContext().get(C13337p1.f47660Z)) == null || p1Var.mo38375b()) {
            return mo38452g(x);
        } else {
            Throwable h = p1Var.mo38470h();
            mo35890b(x, h);
            if (C13330n0.m62284d()) {
                h = C11688d0.m56846j(h, this);
            }
            throw h;
        }
    }

    /* renamed from: x */
    public final Object mo38460x() {
        return this._state;
    }
}
