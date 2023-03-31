package kotlinx.coroutines.internal;

import androidx.concurrent.futures.C0600b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C11669k;
import kotlin.jvm.internal.C11673o;
import p410yd.C13333o0;

/* renamed from: kotlinx.coroutines.internal.r */
/* compiled from: LockFreeLinkedList.kt */
public class C11721r {

    /* renamed from: a */
    static final /* synthetic */ AtomicReferenceFieldUpdater f44298a;

    /* renamed from: b */
    static final /* synthetic */ AtomicReferenceFieldUpdater f44299b;

    /* renamed from: c */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f44300c;
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* renamed from: kotlinx.coroutines.internal.r$a */
    /* compiled from: LockFreeLinkedList.kt */
    public static abstract class C11722a extends C11684c<C11721r> {

        /* renamed from: b */
        public final C11721r f44301b;

        /* renamed from: c */
        public C11721r f44302c;

        public C11722a(C11721r rVar) {
            this.f44301b = rVar;
        }

        /* renamed from: h */
        public void mo35879d(C11721r rVar, Object obj) {
            boolean z = obj == null;
            C11721r rVar2 = z ? this.f44301b : this.f44302c;
            if (rVar2 != null && C0600b.m2800a(C11721r.f44298a, rVar, this, rVar2) && z) {
                C11721r rVar3 = this.f44301b;
                C11721r rVar4 = this.f44302c;
                C11669k.m56784b(rVar4);
                rVar3.m56939m(rVar4);
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.r$b */
    /* compiled from: LockFreeLinkedList.kt */
    public static final class C11723b extends C11735z {
    }

    /* renamed from: kotlinx.coroutines.internal.r$c */
    /* compiled from: LockFreeLinkedList.kt */
    /* synthetic */ class C11724c extends C11673o {
        C11724c(Object obj) {
            super(obj, C13333o0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        }

        public Object get() {
            return C13333o0.m62287a(this.receiver);
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C11721r> cls2 = C11721r.class;
        f44298a = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f44299b = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f44300c = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: kotlinx.coroutines.internal.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: kotlinx.coroutines.internal.r} */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (androidx.concurrent.futures.C0600b.m2800a(f44298a, r3, r2, ((kotlinx.coroutines.internal.C11681a0) r4).f44247a) != false) goto L_0x004b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlinx.coroutines.internal.C11721r m56937k(kotlinx.coroutines.internal.C11735z r8) {
        /*
            r7 = this;
        L_0x0000:
            java.lang.Object r0 = r7._prev
            kotlinx.coroutines.internal.r r0 = (kotlinx.coroutines.internal.C11721r) r0
            r1 = 0
            r2 = r0
        L_0x0006:
            r3 = r1
        L_0x0007:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L_0x0018
            if (r0 != r2) goto L_0x000e
            return r2
        L_0x000e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f44299b
            boolean r0 = androidx.concurrent.futures.C0600b.m2800a(r1, r7, r0, r2)
            if (r0 != 0) goto L_0x0017
            goto L_0x0000
        L_0x0017:
            return r2
        L_0x0018:
            boolean r5 = r7.mo35927s()
            if (r5 == 0) goto L_0x001f
            return r1
        L_0x001f:
            if (r4 != r8) goto L_0x0022
            return r2
        L_0x0022:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.C11735z
            if (r5 == 0) goto L_0x0038
            if (r8 == 0) goto L_0x0032
            r0 = r4
            kotlinx.coroutines.internal.z r0 = (kotlinx.coroutines.internal.C11735z) r0
            boolean r0 = r8.mo35959b(r0)
            if (r0 == 0) goto L_0x0032
            return r1
        L_0x0032:
            kotlinx.coroutines.internal.z r4 = (kotlinx.coroutines.internal.C11735z) r4
            r4.mo35878c(r2)
            goto L_0x0000
        L_0x0038:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.C11681a0
            if (r5 == 0) goto L_0x0052
            if (r3 == 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f44298a
            kotlinx.coroutines.internal.a0 r4 = (kotlinx.coroutines.internal.C11681a0) r4
            kotlinx.coroutines.internal.r r4 = r4.f44247a
            boolean r2 = androidx.concurrent.futures.C0600b.m2800a(r5, r3, r2, r4)
            if (r2 != 0) goto L_0x004b
            goto L_0x0000
        L_0x004b:
            r2 = r3
            goto L_0x0006
        L_0x004d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.r r2 = (kotlinx.coroutines.internal.C11721r) r2
            goto L_0x0007
        L_0x0052:
            r3 = r4
            kotlinx.coroutines.internal.r r3 = (kotlinx.coroutines.internal.C11721r) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C11721r.m56937k(kotlinx.coroutines.internal.z):kotlinx.coroutines.internal.r");
    }

    /* renamed from: l */
    private final C11721r m56938l(C11721r rVar) {
        while (rVar.mo35927s()) {
            rVar = (C11721r) rVar._prev;
        }
        return rVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final void m56939m(C11721r rVar) {
        C11721r rVar2;
        do {
            rVar2 = (C11721r) rVar._prev;
            if (mo35930n() != rVar) {
                return;
            }
        } while (!C0600b.m2800a(f44299b, rVar, rVar2, this));
        if (mo35927s()) {
            rVar.m56937k((C11735z) null);
        }
    }

    /* renamed from: v */
    private final C11681a0 m56940v() {
        C11681a0 a0Var = (C11681a0) this._removedRef;
        if (a0Var != null) {
            return a0Var;
        }
        C11681a0 a0Var2 = new C11681a0(this);
        f44300c.lazySet(this, a0Var2);
        return a0Var2;
    }

    /* renamed from: i */
    public final boolean mo35928i(C11721r rVar, C11721r rVar2) {
        f44299b.lazySet(rVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f44298a;
        atomicReferenceFieldUpdater.lazySet(rVar, rVar2);
        if (!C0600b.m2800a(atomicReferenceFieldUpdater, this, rVar2, rVar)) {
            return false;
        }
        rVar.m56939m(rVar2);
        return true;
    }

    /* renamed from: j */
    public final boolean mo35929j(C11721r rVar) {
        f44299b.lazySet(rVar, this);
        f44298a.lazySet(rVar, this);
        while (mo35930n() == this) {
            if (C0600b.m2800a(f44298a, this, this, rVar)) {
                rVar.m56939m(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public final Object mo35930n() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof C11735z)) {
                return obj;
            }
            ((C11735z) obj).mo35878c(this);
        }
    }

    /* renamed from: o */
    public final C11721r mo35931o() {
        return C11720q.m56935b(mo35930n());
    }

    /* renamed from: p */
    public final C11721r mo35932p() {
        C11721r k = m56937k((C11735z) null);
        return k == null ? m56938l((C11721r) this._prev) : k;
    }

    /* renamed from: q */
    public final void mo35933q() {
        ((C11681a0) mo35930n()).f44247a.mo35934r();
    }

    /* renamed from: r */
    public final void mo35934r() {
        C11721r rVar = this;
        while (true) {
            Object n = rVar.mo35930n();
            if (!(n instanceof C11681a0)) {
                rVar.m56937k((C11735z) null);
                return;
            }
            rVar = ((C11681a0) n).f44247a;
        }
    }

    /* renamed from: s */
    public boolean mo35927s() {
        return mo35930n() instanceof C11681a0;
    }

    /* renamed from: t */
    public boolean mo35935t() {
        return mo35936u() == null;
    }

    public String toString() {
        return new C11724c(this) + '@' + C13333o0.m62288b(this);
    }

    /* renamed from: u */
    public final C11721r mo35936u() {
        Object n;
        C11721r rVar;
        do {
            n = mo35930n();
            if (n instanceof C11681a0) {
                return ((C11681a0) n).f44247a;
            }
            if (n == this) {
                return (C11721r) n;
            }
            rVar = (C11721r) n;
        } while (!C0600b.m2800a(f44298a, this, n, rVar.m56940v()));
        rVar.m56937k((C11735z) null);
        return null;
    }

    /* renamed from: w */
    public final int mo35937w(C11721r rVar, C11721r rVar2, C11722a aVar) {
        f44299b.lazySet(rVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f44298a;
        atomicReferenceFieldUpdater.lazySet(rVar, rVar2);
        aVar.f44302c = rVar2;
        if (!C0600b.m2800a(atomicReferenceFieldUpdater, this, rVar2, aVar)) {
            return 0;
        }
        return aVar.mo35878c(this) == null ? 1 : 2;
    }
}
