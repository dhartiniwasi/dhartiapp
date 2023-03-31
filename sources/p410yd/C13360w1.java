package p410yd;

import androidx.concurrent.futures.C0600b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;
import kotlinx.coroutines.internal.C11688d0;
import kotlinx.coroutines.internal.C11720q;
import kotlinx.coroutines.internal.C11721r;
import kotlinx.coroutines.internal.C11735z;
import p243gd.C10349s;
import p272jd.C11570g;
import p344rd.C12439l;
import p344rd.C12443p;
import p410yd.C13337p1;

/* renamed from: yd.w1 */
/* compiled from: JobSupport.kt */
public class C13360w1 implements C13337p1, C13346s, C13286d2 {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f47681a = AtomicReferenceFieldUpdater.newUpdater(C13360w1.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* renamed from: yd.w1$a */
    /* compiled from: JobSupport.kt */
    private static final class C13361a extends C13357v1 {

        /* renamed from: e */
        private final C13360w1 f47682e;

        /* renamed from: f */
        private final C13362b f47683f;

        /* renamed from: g */
        private final C13343r f47684g;

        /* renamed from: h */
        private final Object f47685h;

        public C13361a(C13360w1 w1Var, C13362b bVar, C13343r rVar, Object obj) {
            this.f47682e = w1Var;
            this.f47683f = bVar;
            this.f47684g = rVar;
            this.f47685h = obj;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38464x((Throwable) obj);
            return C10349s.f40964a;
        }

        /* renamed from: x */
        public void mo38464x(Throwable th) {
            this.f47682e.m62359G(this.f47683f, this.f47684g, this.f47685h);
        }
    }

    /* renamed from: yd.w1$b */
    /* compiled from: JobSupport.kt */
    private static final class C13362b implements C13319k1 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: a */
        private final C13267a2 f47686a;

        public C13362b(C13267a2 a2Var, boolean z, Throwable th) {
            this.f47686a = a2Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        /* renamed from: c */
        private final ArrayList<Throwable> m62417c() {
            return new ArrayList<>(4);
        }

        /* renamed from: d */
        private final Object m62418d() {
            return this._exceptionsHolder;
        }

        /* renamed from: l */
        private final void m62419l(Object obj) {
            this._exceptionsHolder = obj;
        }

        /* renamed from: a */
        public final void mo38515a(Throwable th) {
            Throwable f = mo38516f();
            if (f == null) {
                mo38522m(th);
            } else if (th != f) {
                Object d = m62418d();
                if (d == null) {
                    m62419l(th);
                } else if (d instanceof Throwable) {
                    if (th != d) {
                        ArrayList<Throwable> c = m62417c();
                        c.add(d);
                        c.add(th);
                        m62419l(c);
                    }
                } else if (d instanceof ArrayList) {
                    ((ArrayList) d).add(th);
                } else {
                    throw new IllegalStateException(C11669k.m56792j("State is ", d).toString());
                }
            }
        }

        /* renamed from: b */
        public boolean mo38390b() {
            return mo38516f() == null;
        }

        /* renamed from: e */
        public C13267a2 mo38391e() {
            return this.f47686a;
        }

        /* renamed from: f */
        public final Throwable mo38516f() {
            return (Throwable) this._rootCause;
        }

        /* renamed from: g */
        public final boolean mo38517g() {
            return mo38516f() != null;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
        /* renamed from: h */
        public final boolean mo38518h() {
            return this._isCompleting;
        }

        /* renamed from: i */
        public final boolean mo38519i() {
            return m62418d() == C13366x1.f47698e;
        }

        /* renamed from: j */
        public final List<Throwable> mo38520j(Throwable th) {
            ArrayList<Throwable> arrayList;
            Object d = m62418d();
            if (d == null) {
                arrayList = m62417c();
            } else if (d instanceof Throwable) {
                ArrayList<Throwable> c = m62417c();
                c.add(d);
                arrayList = c;
            } else if (d instanceof ArrayList) {
                arrayList = (ArrayList) d;
            } else {
                throw new IllegalStateException(C11669k.m56792j("State is ", d).toString());
            }
            Throwable f = mo38516f();
            if (f != null) {
                arrayList.add(0, f);
            }
            if (th != null && !C11669k.m56783a(th, f)) {
                arrayList.add(th);
            }
            m62419l(C13366x1.f47698e);
            return arrayList;
        }

        /* renamed from: k */
        public final void mo38521k(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        /* renamed from: m */
        public final void mo38522m(Throwable th) {
            this._rootCause = th;
        }

        public String toString() {
            return "Finishing[cancelling=" + mo38517g() + ", completing=" + mo38518h() + ", rootCause=" + mo38516f() + ", exceptions=" + m62418d() + ", list=" + mo38391e() + ']';
        }
    }

    /* renamed from: yd.w1$c */
    /* compiled from: LockFreeLinkedList.kt */
    public static final class C13363c extends C11721r.C11722a {

        /* renamed from: d */
        final /* synthetic */ C11721r f47687d;

        /* renamed from: e */
        final /* synthetic */ C13360w1 f47688e;

        /* renamed from: f */
        final /* synthetic */ Object f47689f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13363c(C11721r rVar, C13360w1 w1Var, Object obj) {
            super(rVar);
            this.f47687d = rVar;
            this.f47688e = w1Var;
            this.f47689f = obj;
        }

        /* renamed from: i */
        public Object mo22208g(C11721r rVar) {
            if (this.f47688e.mo38502Q() == this.f47689f) {
                return null;
            }
            return C11720q.m56934a();
        }
    }

    public C13360w1(boolean z) {
        this._state = z ? C13366x1.f47700g : C13366x1.f47699f;
        this._parentHandle = null;
    }

    /* renamed from: A */
    private final boolean m62357A(Throwable th) {
        if (mo35882V()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        C13340q P = mo38501P();
        if (P == null || P == C13273b2.f47605a) {
            return z;
        }
        if (P.mo38405c(th) || z) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    private final void m62358E(C13319k1 k1Var, Object obj) {
        C13340q P = mo38501P();
        if (P != null) {
            P.dispose();
            mo38509j0(C13273b2.f47605a);
        }
        Throwable th = null;
        C13355v vVar = obj instanceof C13355v ? (C13355v) obj : null;
        if (vVar != null) {
            th = vVar.f47676a;
        }
        if (k1Var instanceof C13357v1) {
            try {
                ((C13357v1) k1Var).mo38464x(th);
            } catch (Throwable th2) {
                mo38373S(new C13367y("Exception in completion handler " + k1Var + " for " + this, th2));
            }
        } else {
            C13267a2 e = k1Var.mo38391e();
            if (e != null) {
                m62370c0(e, th);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public final void m62359G(C13362b bVar, C13343r rVar, Object obj) {
        if (C13330n0.m62281a()) {
            if (!(mo38502Q() == bVar)) {
                throw new AssertionError();
            }
        }
        C13343r a0 = m62368a0(rVar);
        if (a0 == null || !m62384t0(bVar, a0, obj)) {
            mo35883u(m62361I(bVar, obj));
        }
    }

    /* renamed from: H */
    private final Throwable m62360H(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new C13342q1(mo38372B(), (Throwable) null, this);
            }
            return th;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((C13286d2) obj).mo38417x();
    }

    /* renamed from: I */
    private final Object m62361I(C13362b bVar, Object obj) {
        boolean g;
        Throwable L;
        boolean z = true;
        if (C13330n0.m62281a()) {
            if (!(mo38502Q() == bVar)) {
                throw new AssertionError();
            }
        }
        if (C13330n0.m62281a() && !(!bVar.mo38519i())) {
            throw new AssertionError();
        } else if (!C13330n0.m62281a() || bVar.mo38518h()) {
            C13355v vVar = obj instanceof C13355v ? (C13355v) obj : null;
            Throwable th = vVar == null ? null : vVar.f47676a;
            synchronized (bVar) {
                g = bVar.mo38517g();
                List<Throwable> j = bVar.mo38520j(th);
                L = m62364L(bVar, j);
                if (L != null) {
                    m62382s(L, j);
                }
            }
            if (!(L == null || L == th)) {
                obj = new C13355v(L, false, 2, (C11665g) null);
            }
            if (L != null) {
                if (!m62357A(L) && !mo38418R(L)) {
                    z = false;
                }
                if (z) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                    ((C13355v) obj).mo38491b();
                }
            }
            if (!g) {
                mo38506d0(L);
            }
            mo38376e0(obj);
            boolean a = C0600b.m2800a(f47681a, this, bVar, C13366x1.m62442g(obj));
            if (!C13330n0.m62281a() || a) {
                m62358E(bVar, obj);
                return obj;
            }
            throw new AssertionError();
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: J */
    private final C13343r m62362J(C13319k1 k1Var) {
        C13343r rVar = k1Var instanceof C13343r ? (C13343r) k1Var : null;
        if (rVar != null) {
            return rVar;
        }
        C13267a2 e = k1Var.mo38391e();
        if (e == null) {
            return null;
        }
        return m62368a0(e);
    }

    /* renamed from: K */
    private final Throwable m62363K(Object obj) {
        C13355v vVar = obj instanceof C13355v ? (C13355v) obj : null;
        if (vVar == null) {
            return null;
        }
        return vVar.f47676a;
    }

    /* renamed from: L */
    private final Throwable m62364L(C13362b bVar, List<? extends Throwable> list) {
        T t = null;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (!(((Throwable) next) instanceof CancellationException)) {
                    t = next;
                    break;
                }
            }
            Throwable th = (Throwable) t;
            if (th != null) {
                return th;
            }
            return (Throwable) list.get(0);
        } else if (bVar.mo38517g()) {
            return new C13342q1(mo38372B(), (Throwable) null, this);
        } else {
            return null;
        }
    }

    /* renamed from: O */
    private final C13267a2 m62365O(C13319k1 k1Var) {
        C13267a2 e = k1Var.mo38391e();
        if (e != null) {
            return e;
        }
        if (k1Var instanceof C13371z0) {
            return new C13267a2();
        }
        if (k1Var instanceof C13357v1) {
            m62372h0((C13357v1) k1Var);
            return null;
        }
        throw new IllegalStateException(C11669k.m56792j("State should have list: ", k1Var).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (r0 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        m62369b0(((p410yd.C13360w1.C13362b) r2).mo38391e(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        return p410yd.C13366x1.m62436a();
     */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m62366W(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r6.mo38502Q()
            boolean r3 = r2 instanceof p410yd.C13360w1.C13362b
            if (r3 == 0) goto L_0x0052
            monitor-enter(r2)
            r3 = r2
            yd.w1$b r3 = (p410yd.C13360w1.C13362b) r3     // Catch:{ all -> 0x004f }
            boolean r3 = r3.mo38519i()     // Catch:{ all -> 0x004f }
            if (r3 == 0) goto L_0x001a
            kotlinx.coroutines.internal.e0 r7 = p410yd.C13366x1.f47697d     // Catch:{ all -> 0x004f }
            monitor-exit(r2)
            return r7
        L_0x001a:
            r3 = r2
            yd.w1$b r3 = (p410yd.C13360w1.C13362b) r3     // Catch:{ all -> 0x004f }
            boolean r3 = r3.mo38517g()     // Catch:{ all -> 0x004f }
            if (r7 != 0) goto L_0x0025
            if (r3 != 0) goto L_0x0031
        L_0x0025:
            if (r1 != 0) goto L_0x002b
            java.lang.Throwable r1 = r6.m62360H(r7)     // Catch:{ all -> 0x004f }
        L_0x002b:
            r7 = r2
            yd.w1$b r7 = (p410yd.C13360w1.C13362b) r7     // Catch:{ all -> 0x004f }
            r7.mo38515a(r1)     // Catch:{ all -> 0x004f }
        L_0x0031:
            r7 = r2
            yd.w1$b r7 = (p410yd.C13360w1.C13362b) r7     // Catch:{ all -> 0x004f }
            java.lang.Throwable r7 = r7.mo38516f()     // Catch:{ all -> 0x004f }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x003d
            r0 = r7
        L_0x003d:
            monitor-exit(r2)
            if (r0 != 0) goto L_0x0041
            goto L_0x004a
        L_0x0041:
            yd.w1$b r2 = (p410yd.C13360w1.C13362b) r2
            yd.a2 r7 = r2.mo38391e()
            r6.m62369b0(r7, r0)
        L_0x004a:
            kotlinx.coroutines.internal.e0 r7 = p410yd.C13366x1.f47694a
            return r7
        L_0x004f:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        L_0x0052:
            boolean r3 = r2 instanceof p410yd.C13319k1
            if (r3 == 0) goto L_0x009a
            if (r1 != 0) goto L_0x005c
            java.lang.Throwable r1 = r6.m62360H(r7)
        L_0x005c:
            r3 = r2
            yd.k1 r3 = (p410yd.C13319k1) r3
            boolean r4 = r3.mo38390b()
            if (r4 == 0) goto L_0x0070
            boolean r2 = r6.m62379q0(r3, r1)
            if (r2 == 0) goto L_0x0002
            kotlinx.coroutines.internal.e0 r7 = p410yd.C13366x1.f47694a
            return r7
        L_0x0070:
            yd.v r3 = new yd.v
            r4 = 0
            r5 = 2
            r3.<init>(r1, r4, r5, r0)
            java.lang.Object r3 = r6.m62381r0(r2, r3)
            kotlinx.coroutines.internal.e0 r4 = p410yd.C13366x1.f47694a
            if (r3 == r4) goto L_0x008a
            kotlinx.coroutines.internal.e0 r2 = p410yd.C13366x1.f47696c
            if (r3 != r2) goto L_0x0089
            goto L_0x0002
        L_0x0089:
            return r3
        L_0x008a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot happen in "
            java.lang.String r0 = kotlin.jvm.internal.C11669k.m56792j(r0, r2)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x009a:
            kotlinx.coroutines.internal.e0 r7 = p410yd.C13366x1.f47697d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p410yd.C13360w1.m62366W(java.lang.Object):java.lang.Object");
    }

    /* renamed from: Y */
    private final C13357v1 m62367Y(C12439l<? super Throwable, C10349s> lVar, boolean z) {
        C13357v1 v1Var = null;
        if (z) {
            if (lVar instanceof C13345r1) {
                v1Var = (C13345r1) lVar;
            }
            if (v1Var == null) {
                v1Var = new C13331n1(lVar);
            }
        } else {
            C13357v1 v1Var2 = lVar instanceof C13357v1 ? (C13357v1) lVar : null;
            if (v1Var2 != null) {
                if (!C13330n0.m62281a() || (!(v1Var2 instanceof C13345r1))) {
                    v1Var = v1Var2;
                } else {
                    throw new AssertionError();
                }
            }
            if (v1Var == null) {
                v1Var = new C13334o1(lVar);
            }
        }
        v1Var.mo38494z(this);
        return v1Var;
    }

    /* renamed from: a0 */
    private final C13343r m62368a0(C11721r rVar) {
        while (rVar.mo35927s()) {
            rVar = rVar.mo35932p();
        }
        while (true) {
            rVar = rVar.mo35931o();
            if (!rVar.mo35927s()) {
                if (rVar instanceof C13343r) {
                    return (C13343r) rVar;
                }
                if (rVar instanceof C13267a2) {
                    return null;
                }
            }
        }
    }

    /* renamed from: b0 */
    private final void m62369b0(C13267a2 a2Var, Throwable th) {
        C13367y yVar;
        mo38506d0(th);
        C13367y yVar2 = null;
        for (C11721r rVar = (C11721r) a2Var.mo35930n(); !C11669k.m56783a(rVar, a2Var); rVar = rVar.mo35931o()) {
            if (rVar instanceof C13345r1) {
                C13357v1 v1Var = (C13357v1) rVar;
                try {
                    v1Var.mo38464x(th);
                } catch (Throwable th2) {
                    if (yVar2 == null) {
                        yVar = null;
                    } else {
                        C10329b.m52230a(yVar2, th2);
                        yVar = yVar2;
                    }
                    if (yVar == null) {
                        yVar2 = new C13367y("Exception in completion handler " + v1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (yVar2 != null) {
            mo38373S(yVar2);
        }
        m62357A(th);
    }

    /* renamed from: c0 */
    private final void m62370c0(C13267a2 a2Var, Throwable th) {
        C13367y yVar;
        C13367y yVar2 = null;
        for (C11721r rVar = (C11721r) a2Var.mo35930n(); !C11669k.m56783a(rVar, a2Var); rVar = rVar.mo35931o()) {
            if (rVar instanceof C13357v1) {
                C13357v1 v1Var = (C13357v1) rVar;
                try {
                    v1Var.mo38464x(th);
                } catch (Throwable th2) {
                    if (yVar2 == null) {
                        yVar = null;
                    } else {
                        C10329b.m52230a(yVar2, th2);
                        yVar = yVar2;
                    }
                    if (yVar == null) {
                        yVar2 = new C13367y("Exception in completion handler " + v1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (yVar2 != null) {
            mo38373S(yVar2);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [yd.j1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m62371g0(p410yd.C13371z0 r3) {
        /*
            r2 = this;
            yd.a2 r0 = new yd.a2
            r0.<init>()
            boolean r1 = r3.mo38390b()
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            yd.j1 r1 = new yd.j1
            r1.<init>(r0)
            r0 = r1
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f47681a
            androidx.concurrent.futures.C0600b.m2800a(r1, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p410yd.C13360w1.m62371g0(yd.z0):void");
    }

    /* renamed from: h0 */
    private final void m62372h0(C13357v1 v1Var) {
        v1Var.mo35929j(new C13267a2());
        C0600b.m2800a(f47681a, this, v1Var, v1Var.mo35931o());
    }

    /* renamed from: k0 */
    private final int m62373k0(Object obj) {
        if (obj instanceof C13371z0) {
            if (((C13371z0) obj).mo38390b()) {
                return 0;
            }
            if (!C0600b.m2800a(f47681a, this, obj, C13366x1.f47700g)) {
                return -1;
            }
            mo38507f0();
            return 1;
        } else if (!(obj instanceof C13314j1)) {
            return 0;
        } else {
            if (!C0600b.m2800a(f47681a, this, obj, ((C13314j1) obj).mo38391e())) {
                return -1;
            }
            mo38507f0();
            return 1;
        }
    }

    /* renamed from: l0 */
    private final String m62375l0(Object obj) {
        if (obj instanceof C13362b) {
            C13362b bVar = (C13362b) obj;
            if (bVar.mo38517g()) {
                return "Cancelling";
            }
            if (bVar.mo38518h()) {
                return "Completing";
            }
            return "Active";
        } else if (!(obj instanceof C13319k1)) {
            return obj instanceof C13355v ? "Cancelled" : "Completed";
        } else {
            if (((C13319k1) obj).mo38390b()) {
                return "Active";
            }
            return "New";
        }
    }

    /* renamed from: n0 */
    public static /* synthetic */ CancellationException m62376n0(C13360w1 w1Var, Throwable th, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return w1Var.mo38510m0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    /* renamed from: p0 */
    private final boolean m62378p0(C13319k1 k1Var, Object obj) {
        if (C13330n0.m62281a()) {
            if (!((k1Var instanceof C13371z0) || (k1Var instanceof C13357v1))) {
                throw new AssertionError();
            }
        }
        if (C13330n0.m62281a() && !(!(obj instanceof C13355v))) {
            throw new AssertionError();
        } else if (!C0600b.m2800a(f47681a, this, k1Var, C13366x1.m62442g(obj))) {
            return false;
        } else {
            mo38506d0((Throwable) null);
            mo38376e0(obj);
            m62358E(k1Var, obj);
            return true;
        }
    }

    /* renamed from: q0 */
    private final boolean m62379q0(C13319k1 k1Var, Throwable th) {
        if (C13330n0.m62281a() && !(!(k1Var instanceof C13362b))) {
            throw new AssertionError();
        } else if (!C13330n0.m62281a() || k1Var.mo38390b()) {
            C13267a2 O = m62365O(k1Var);
            if (O == null) {
                return false;
            }
            if (!C0600b.m2800a(f47681a, this, k1Var, new C13362b(O, false, th))) {
                return false;
            }
            m62369b0(O, th);
            return true;
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: r */
    private final boolean m62380r(Object obj, C13267a2 a2Var, C13357v1 v1Var) {
        int w;
        C13363c cVar = new C13363c(v1Var, this, obj);
        do {
            w = a2Var.mo35932p().mo35937w(v1Var, a2Var, cVar);
            if (w == 1) {
                return true;
            }
        } while (w != 2);
        return false;
    }

    /* renamed from: r0 */
    private final Object m62381r0(Object obj, Object obj2) {
        if (!(obj instanceof C13319k1)) {
            return C13366x1.f47694a;
        }
        if ((!(obj instanceof C13371z0) && !(obj instanceof C13357v1)) || (obj instanceof C13343r) || (obj2 instanceof C13355v)) {
            return m62383s0((C13319k1) obj, obj2);
        }
        if (m62378p0((C13319k1) obj, obj2)) {
            return obj2;
        }
        return C13366x1.f47696c;
    }

    /* renamed from: s */
    private final void m62382s(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            Throwable n = !C13330n0.m62284d() ? th : C11688d0.m56850n(th);
            for (Throwable th2 : list) {
                if (C13330n0.m62284d()) {
                    th2 = C11688d0.m56850n(th2);
                }
                if (th2 != th && th2 != n && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                    C10329b.m52230a(th, th2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0072, code lost:
        if (r2 != null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0075, code lost:
        m62369b0(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0078, code lost:
        r7 = m62362J(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x007c, code lost:
        if (r7 == null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0082, code lost:
        if (m62384t0(r1, r7, r8) == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0086, code lost:
        return p410yd.C13366x1.f47695b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x008b, code lost:
        return m62361I(r1, r8);
     */
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m62383s0(p410yd.C13319k1 r7, java.lang.Object r8) {
        /*
            r6 = this;
            yd.a2 r0 = r6.m62365O(r7)
            if (r0 != 0) goto L_0x000b
            kotlinx.coroutines.internal.e0 r7 = p410yd.C13366x1.f47696c
            return r7
        L_0x000b:
            boolean r1 = r7 instanceof p410yd.C13360w1.C13362b
            r2 = 0
            if (r1 == 0) goto L_0x0014
            r1 = r7
            yd.w1$b r1 = (p410yd.C13360w1.C13362b) r1
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            if (r1 != 0) goto L_0x001d
            yd.w1$b r1 = new yd.w1$b
            r3 = 0
            r1.<init>(r0, r3, r2)
        L_0x001d:
            monitor-enter(r1)
            boolean r3 = r1.mo38518h()     // Catch:{ all -> 0x008c }
            if (r3 == 0) goto L_0x002a
            kotlinx.coroutines.internal.e0 r7 = p410yd.C13366x1.f47694a     // Catch:{ all -> 0x008c }
            monitor-exit(r1)
            return r7
        L_0x002a:
            r3 = 1
            r1.mo38521k(r3)     // Catch:{ all -> 0x008c }
            if (r1 == r7) goto L_0x003e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f47681a     // Catch:{ all -> 0x008c }
            boolean r4 = androidx.concurrent.futures.C0600b.m2800a(r4, r6, r7, r1)     // Catch:{ all -> 0x008c }
            if (r4 != 0) goto L_0x003e
            kotlinx.coroutines.internal.e0 r7 = p410yd.C13366x1.f47696c     // Catch:{ all -> 0x008c }
            monitor-exit(r1)
            return r7
        L_0x003e:
            boolean r4 = p410yd.C13330n0.m62281a()     // Catch:{ all -> 0x008c }
            if (r4 == 0) goto L_0x0052
            boolean r4 = r1.mo38519i()     // Catch:{ all -> 0x008c }
            r4 = r4 ^ r3
            if (r4 == 0) goto L_0x004c
            goto L_0x0052
        L_0x004c:
            java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch:{ all -> 0x008c }
            r7.<init>()     // Catch:{ all -> 0x008c }
            throw r7     // Catch:{ all -> 0x008c }
        L_0x0052:
            boolean r4 = r1.mo38517g()     // Catch:{ all -> 0x008c }
            boolean r5 = r8 instanceof p410yd.C13355v     // Catch:{ all -> 0x008c }
            if (r5 == 0) goto L_0x005e
            r5 = r8
            yd.v r5 = (p410yd.C13355v) r5     // Catch:{ all -> 0x008c }
            goto L_0x005f
        L_0x005e:
            r5 = r2
        L_0x005f:
            if (r5 != 0) goto L_0x0062
            goto L_0x0067
        L_0x0062:
            java.lang.Throwable r5 = r5.f47676a     // Catch:{ all -> 0x008c }
            r1.mo38515a(r5)     // Catch:{ all -> 0x008c }
        L_0x0067:
            java.lang.Throwable r5 = r1.mo38516f()     // Catch:{ all -> 0x008c }
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x006f
            r2 = r5
        L_0x006f:
            gd.s r3 = p243gd.C10349s.f40964a     // Catch:{ all -> 0x008c }
            monitor-exit(r1)
            if (r2 != 0) goto L_0x0075
            goto L_0x0078
        L_0x0075:
            r6.m62369b0(r0, r2)
        L_0x0078:
            yd.r r7 = r6.m62362J(r7)
            if (r7 == 0) goto L_0x0087
            boolean r7 = r6.m62384t0(r1, r7, r8)
            if (r7 == 0) goto L_0x0087
            kotlinx.coroutines.internal.e0 r7 = p410yd.C13366x1.f47695b
            return r7
        L_0x0087:
            java.lang.Object r7 = r6.m62361I(r1, r8)
            return r7
        L_0x008c:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p410yd.C13360w1.m62383s0(yd.k1, java.lang.Object):java.lang.Object");
    }

    /* renamed from: t0 */
    private final boolean m62384t0(C13362b bVar, C13343r rVar, Object obj) {
        while (C13337p1.C13338a.m62309d(rVar.f47665e, false, false, new C13361a(this, bVar, rVar, obj), 1, (Object) null) == C13273b2.f47605a) {
            rVar = m62368a0(rVar);
            if (rVar == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: z */
    private final Object m62385z(Object obj) {
        Object r0;
        do {
            Object Q = mo38502Q();
            if (!(Q instanceof C13319k1) || ((Q instanceof C13362b) && ((C13362b) Q).mo38518h())) {
                return C13366x1.f47694a;
            }
            r0 = m62381r0(Q, new C13355v(m62360H(obj), false, 2, (C11665g) null));
        } while (r0 == C13366x1.f47696c);
        return r0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public String mo38372B() {
        return "Job was cancelled";
    }

    /* renamed from: C */
    public boolean mo38500C(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (!mo38513v(th) || !mo38480M()) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    public final C13368y0 mo38467D(boolean z, boolean z2, C12439l<? super Throwable, C10349s> lVar) {
        C13357v1 Y = m62367Y(lVar, z);
        while (true) {
            Object Q = mo38502Q();
            if (Q instanceof C13371z0) {
                C13371z0 z0Var = (C13371z0) Q;
                if (!z0Var.mo38390b()) {
                    m62371g0(z0Var);
                } else if (C0600b.m2800a(f47681a, this, Q, Y)) {
                    return Y;
                }
            } else {
                Throwable th = null;
                if (Q instanceof C13319k1) {
                    C13267a2 e = ((C13319k1) Q).mo38391e();
                    if (e == null) {
                        Objects.requireNonNull(Q, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        m62372h0((C13357v1) Q);
                    } else {
                        C13368y0 y0Var = C13273b2.f47605a;
                        if (z && (Q instanceof C13362b)) {
                            synchronized (Q) {
                                th = ((C13362b) Q).mo38516f();
                                if (th == null || ((lVar instanceof C13343r) && !((C13362b) Q).mo38518h())) {
                                    if (m62380r(Q, e, Y)) {
                                        if (th == null) {
                                            return Y;
                                        }
                                        y0Var = Y;
                                    }
                                }
                                C10349s sVar = C10349s.f40964a;
                            }
                        }
                        if (th != null) {
                            if (z2) {
                                lVar.invoke(th);
                            }
                            return y0Var;
                        } else if (m62380r(Q, e, Y)) {
                            return Y;
                        }
                    }
                } else {
                    if (z2) {
                        C13355v vVar = Q instanceof C13355v ? (C13355v) Q : null;
                        if (vVar != null) {
                            th = vVar.f47676a;
                        }
                        lVar.invoke(th);
                    }
                    return C13273b2.f47605a;
                }
            }
        }
    }

    /* renamed from: F */
    public void mo38468F(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C13342q1(mo38372B(), (Throwable) null, this);
        }
        mo38514y(cancellationException);
    }

    /* renamed from: M */
    public boolean mo38480M() {
        return true;
    }

    /* renamed from: N */
    public boolean mo38481N() {
        return false;
    }

    /* renamed from: P */
    public final C13340q mo38501P() {
        return (C13340q) this._parentHandle;
    }

    /* renamed from: Q */
    public final Object mo38502Q() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof C11735z)) {
                return obj;
            }
            ((C11735z) obj).mo35878c(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public boolean mo38418R(Throwable th) {
        return false;
    }

    /* renamed from: S */
    public void mo38373S(Throwable th) {
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public final void mo38503T(C13337p1 p1Var) {
        if (C13330n0.m62281a()) {
            if (!(mo38501P() == null)) {
                throw new AssertionError();
            }
        }
        if (p1Var == null) {
            mo38509j0(C13273b2.f47605a);
            return;
        }
        p1Var.start();
        C13340q f = p1Var.mo38469f(this);
        mo38509j0(f);
        if (mo38504U()) {
            f.dispose();
            mo38509j0(C13273b2.f47605a);
        }
    }

    /* renamed from: U */
    public final boolean mo38504U() {
        return !(mo38502Q() instanceof C13319k1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public boolean mo35882V() {
        return false;
    }

    /* renamed from: X */
    public final Object mo38505X(Object obj) {
        Object r0;
        do {
            r0 = m62381r0(mo38502Q(), obj);
            if (r0 == C13366x1.f47694a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m62363K(obj));
            }
        } while (r0 == C13366x1.f47696c);
        return r0;
    }

    /* renamed from: Z */
    public String mo38374Z() {
        return C13333o0.m62287a(this);
    }

    /* renamed from: b */
    public boolean mo38375b() {
        Object Q = mo38502Q();
        return (Q instanceof C13319k1) && ((C13319k1) Q).mo38390b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public void mo38506d0(Throwable th) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public void mo38376e0(Object obj) {
    }

    /* renamed from: f */
    public final C13340q mo38469f(C13346s sVar) {
        return (C13340q) C13337p1.C13338a.m62309d(this, true, false, new C13343r(sVar), 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public void mo38507f0() {
    }

    public <R> R fold(R r, C12443p<? super R, ? super C11570g.C11573b, ? extends R> pVar) {
        return C13337p1.C13338a.m62307b(this, r, pVar);
    }

    public <E extends C11570g.C11573b> E get(C11570g.C11575c<E> cVar) {
        return C13337p1.C13338a.m62308c(this, cVar);
    }

    public final C11570g.C11575c<?> getKey() {
        return C13337p1.f47660Z;
    }

    /* renamed from: h */
    public final CancellationException mo38470h() {
        Object Q = mo38502Q();
        CancellationException cancellationException = null;
        if (Q instanceof C13362b) {
            Throwable f = ((C13362b) Q).mo38516f();
            if (f != null) {
                cancellationException = mo38510m0(f, C11669k.m56792j(C13333o0.m62287a(this), " is cancelling"));
            }
            if (cancellationException != null) {
                return cancellationException;
            }
            throw new IllegalStateException(C11669k.m56792j("Job is still new or active: ", this).toString());
        } else if (Q instanceof C13319k1) {
            throw new IllegalStateException(C11669k.m56792j("Job is still new or active: ", this).toString());
        } else if (Q instanceof C13355v) {
            return m62376n0(this, ((C13355v) Q).f47676a, (String) null, 1, (Object) null);
        } else {
            return new C13342q1(C11669k.m56792j(C13333o0.m62287a(this), " has completed normally"), (Throwable) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38508i0(p410yd.C13357v1 r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.mo38502Q()
            boolean r1 = r0 instanceof p410yd.C13357v1
            if (r1 == 0) goto L_0x0018
            if (r0 == r4) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f47681a
            yd.z0 r2 = p410yd.C13366x1.f47700g
            boolean r0 = androidx.concurrent.futures.C0600b.m2800a(r1, r3, r0, r2)
            if (r0 == 0) goto L_0x0000
            return
        L_0x0018:
            boolean r1 = r0 instanceof p410yd.C13319k1
            if (r1 == 0) goto L_0x0027
            yd.k1 r0 = (p410yd.C13319k1) r0
            yd.a2 r0 = r0.mo38391e()
            if (r0 == 0) goto L_0x0027
            r4.mo35935t()
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p410yd.C13360w1.mo38508i0(yd.v1):void");
    }

    /* renamed from: j0 */
    public final void mo38509j0(C13340q qVar) {
        this._parentHandle = qVar;
    }

    /* renamed from: m */
    public final void mo38477m(C13286d2 d2Var) {
        mo38513v(d2Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public final CancellationException mo38510m0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = mo38372B();
            }
            cancellationException = new C13342q1(str, th, this);
        }
        return cancellationException;
    }

    public C11570g minusKey(C11570g.C11575c<?> cVar) {
        return C13337p1.C13338a.m62310e(this, cVar);
    }

    /* renamed from: o0 */
    public final String mo38511o0() {
        return mo38374Z() + '{' + m62375l0(mo38502Q()) + '}';
    }

    public C11570g plus(C11570g gVar) {
        return C13337p1.C13338a.m62311f(this, gVar);
    }

    public final boolean start() {
        int k0;
        do {
            k0 = m62373k0(mo38502Q());
            if (k0 == 0) {
                return false;
            }
        } while (k0 != 1);
        return true;
    }

    public String toString() {
        return mo38511o0() + '@' + C13333o0.m62288b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo35883u(Object obj) {
    }

    /* renamed from: v */
    public final boolean mo38513v(Object obj) {
        Object a = C13366x1.f47694a;
        if (mo38481N() && (a = m62385z(obj)) == C13366x1.f47695b) {
            return true;
        }
        if (a == C13366x1.f47694a) {
            a = m62366W(obj);
        }
        if (a == C13366x1.f47694a || a == C13366x1.f47695b) {
            return true;
        }
        if (a == C13366x1.f47697d) {
            return false;
        }
        mo35883u(a);
        return true;
    }

    /* renamed from: x */
    public CancellationException mo38417x() {
        Throwable th;
        Object Q = mo38502Q();
        CancellationException cancellationException = null;
        if (Q instanceof C13362b) {
            th = ((C13362b) Q).mo38516f();
        } else if (Q instanceof C13355v) {
            th = ((C13355v) Q).f47676a;
        } else if (!(Q instanceof C13319k1)) {
            th = null;
        } else {
            throw new IllegalStateException(C11669k.m56792j("Cannot be cancelling child in this state: ", Q).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        return cancellationException == null ? new C13342q1(C11669k.m56792j("Parent job is ", m62375l0(Q)), th, this) : cancellationException;
    }

    /* renamed from: y */
    public void mo38514y(Throwable th) {
        mo38513v(th);
    }
}
