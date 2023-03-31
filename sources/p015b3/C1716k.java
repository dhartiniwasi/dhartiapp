package p015b3;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p015b3.C1757s0;
import p015b3.C1772x;
import p155v3.C5789b;
import p155v3.C5840p0;
import p161w3.C5917a;
import p161w3.C5953m0;
import p177z1.C6196a;
import p177z1.C6266q3;
import p177z1.C6300z1;

/* renamed from: b3.k */
/* compiled from: ConcatenatingMediaSource */
public final class C1716k extends C1706g<C1721e> {
    /* access modifiers changed from: private */

    /* renamed from: E */
    public static final C6300z1 f5021E = new C6300z1.C6303c().mo21592f(Uri.EMPTY).mo21587a();

    /* renamed from: A */
    private final boolean f5022A;

    /* renamed from: B */
    private boolean f5023B;

    /* renamed from: C */
    private Set<C1720d> f5024C;

    /* renamed from: D */
    private C1757s0 f5025D;

    /* renamed from: s */
    private final List<C1721e> f5026s;

    /* renamed from: t */
    private final Set<C1720d> f5027t;

    /* renamed from: u */
    private Handler f5028u;

    /* renamed from: v */
    private final List<C1721e> f5029v;

    /* renamed from: w */
    private final IdentityHashMap<C1765u, C1721e> f5030w;

    /* renamed from: x */
    private final Map<Object, C1721e> f5031x;

    /* renamed from: y */
    private final Set<C1721e> f5032y;

    /* renamed from: z */
    private final boolean f5033z;

    /* renamed from: b3.k$b */
    /* compiled from: ConcatenatingMediaSource */
    private static final class C1718b extends C6196a {

        /* renamed from: f */
        private final int f5034f;

        /* renamed from: g */
        private final int f5035g;

        /* renamed from: h */
        private final int[] f5036h;

        /* renamed from: i */
        private final int[] f5037i;

        /* renamed from: r */
        private final C6266q3[] f5038r;

        /* renamed from: s */
        private final Object[] f5039s;

        /* renamed from: t */
        private final HashMap<Object, Integer> f5040t = new HashMap<>();

        public C1718b(Collection<C1721e> collection, C1757s0 s0Var, boolean z) {
            super(z, s0Var);
            int size = collection.size();
            this.f5036h = new int[size];
            this.f5037i = new int[size];
            this.f5038r = new C6266q3[size];
            this.f5039s = new Object[size];
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (C1721e next : collection) {
                this.f5038r[i3] = next.f5043a.mo6870T();
                this.f5037i[i3] = i;
                this.f5036h[i3] = i2;
                i += this.f5038r[i3].mo6761t();
                i2 += this.f5038r[i3].mo6760m();
                Object[] objArr = this.f5039s;
                objArr[i3] = next.f5044b;
                this.f5040t.put(objArr[i3], Integer.valueOf(i3));
                i3++;
            }
            this.f5034f = i;
            this.f5035g = i2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: C */
        public Object mo6756C(int i) {
            return this.f5039s[i];
        }

        /* access modifiers changed from: protected */
        /* renamed from: E */
        public int mo6757E(int i) {
            return this.f5036h[i];
        }

        /* access modifiers changed from: protected */
        /* renamed from: F */
        public int mo6758F(int i) {
            return this.f5037i[i];
        }

        /* access modifiers changed from: protected */
        /* renamed from: I */
        public C6266q3 mo6759I(int i) {
            return this.f5038r[i];
        }

        /* renamed from: m */
        public int mo6760m() {
            return this.f5035g;
        }

        /* renamed from: t */
        public int mo6761t() {
            return this.f5034f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: x */
        public int mo6762x(Object obj) {
            Integer num = this.f5040t.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public int mo6763y(int i) {
            return C5953m0.m35134h(this.f5036h, i + 1, false, false);
        }

        /* access modifiers changed from: protected */
        /* renamed from: z */
        public int mo6764z(int i) {
            return C5953m0.m35134h(this.f5037i, i + 1, false, false);
        }
    }

    /* renamed from: b3.k$c */
    /* compiled from: ConcatenatingMediaSource */
    private static final class C1719c extends C1687a {
        private C1719c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: C */
        public void mo6651C(C5840p0 p0Var) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: E */
        public void mo6653E() {
        }

        /* renamed from: d */
        public void mo6707d(C1765u uVar) {
        }

        /* renamed from: i */
        public C6300z1 mo6708i() {
            return C1716k.f5021E;
        }

        /* renamed from: k */
        public C1765u mo6709k(C1772x.C1774b bVar, C5789b bVar2, long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: l */
        public void mo6710l() {
        }
    }

    /* renamed from: b3.k$d */
    /* compiled from: ConcatenatingMediaSource */
    private static final class C1720d {

        /* renamed from: a */
        private final Handler f5041a;

        /* renamed from: b */
        private final Runnable f5042b;

        public C1720d(Handler handler, Runnable runnable) {
            this.f5041a = handler;
            this.f5042b = runnable;
        }

        /* renamed from: a */
        public void mo6765a() {
            this.f5041a.post(this.f5042b);
        }
    }

    /* renamed from: b3.k$e */
    /* compiled from: ConcatenatingMediaSource */
    static final class C1721e {

        /* renamed from: a */
        public final C1754s f5043a;

        /* renamed from: b */
        public final Object f5044b = new Object();

        /* renamed from: c */
        public final List<C1772x.C1774b> f5045c = new ArrayList();

        /* renamed from: d */
        public int f5046d;

        /* renamed from: e */
        public int f5047e;

        /* renamed from: f */
        public boolean f5048f;

        public C1721e(C1772x xVar, boolean z) {
            this.f5043a = new C1754s(xVar, z);
        }

        /* renamed from: a */
        public void mo6766a(int i, int i2) {
            this.f5046d = i;
            this.f5047e = i2;
            this.f5048f = false;
            this.f5045c.clear();
        }
    }

    /* renamed from: b3.k$f */
    /* compiled from: ConcatenatingMediaSource */
    private static final class C1722f<T> {

        /* renamed from: a */
        public final int f5049a;

        /* renamed from: b */
        public final T f5050b;

        /* renamed from: c */
        public final C1720d f5051c;

        public C1722f(int i, T t, C1720d dVar) {
            this.f5049a = i;
            this.f5050b = t;
            this.f5051c = dVar;
        }
    }

    public C1716k(C1772x... xVarArr) {
        this(false, xVarArr);
    }

    /* renamed from: R */
    private void m7982R(int i, C1721e eVar) {
        if (i > 0) {
            C1721e eVar2 = this.f5029v.get(i - 1);
            eVar.mo6766a(i, eVar2.f5047e + eVar2.f5043a.mo6870T().mo6761t());
        } else {
            eVar.mo6766a(i, 0);
        }
        m7985W(i, 1, eVar.f5043a.mo6870T().mo6761t());
        this.f5029v.add(i, eVar);
        this.f5031x.put(eVar.f5044b, eVar);
        mo6739N(eVar, eVar.f5043a);
        if (!mo6650B() || !this.f5030w.isEmpty()) {
            mo6734G(eVar);
        } else {
            this.f5032y.add(eVar);
        }
    }

    /* renamed from: U */
    private void m7983U(int i, Collection<C1721e> collection) {
        for (C1721e R : collection) {
            m7982R(i, R);
            i++;
        }
    }

    /* renamed from: V */
    private void m7984V(int i, Collection<C1772x> collection, Handler handler, Runnable runnable) {
        boolean z = true;
        if ((handler == null) != (runnable == null)) {
            z = false;
        }
        C5917a.m34868a(z);
        Handler handler2 = this.f5028u;
        for (C1772x e : collection) {
            C5917a.m34872e(e);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (C1772x eVar : collection) {
            arrayList.add(new C1721e(eVar, this.f5022A));
        }
        this.f5026s.addAll(i, arrayList);
        if (handler2 != null && !collection.isEmpty()) {
            handler2.obtainMessage(0, new C1722f(i, arrayList, m7986X(handler, runnable))).sendToTarget();
        } else if (runnable != null && handler != null) {
            handler.post(runnable);
        }
    }

    /* renamed from: W */
    private void m7985W(int i, int i2, int i3) {
        while (i < this.f5029v.size()) {
            C1721e eVar = this.f5029v.get(i);
            eVar.f5046d += i2;
            eVar.f5047e += i3;
            i++;
        }
    }

    /* renamed from: X */
    private C1720d m7986X(Handler handler, Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        C1720d dVar = new C1720d(handler, runnable);
        this.f5027t.add(dVar);
        return dVar;
    }

    /* renamed from: Y */
    private void m7987Y() {
        Iterator<C1721e> it = this.f5032y.iterator();
        while (it.hasNext()) {
            C1721e next = it.next();
            if (next.f5045c.isEmpty()) {
                mo6734G(next);
                it.remove();
            }
        }
    }

    /* renamed from: Z */
    private synchronized void m7988Z(Set<C1720d> set) {
        for (C1720d a : set) {
            a.mo6765a();
        }
        this.f5027t.removeAll(set);
    }

    /* renamed from: a0 */
    private void m7989a0(C1721e eVar) {
        this.f5032y.add(eVar);
        mo6735H(eVar);
    }

    /* renamed from: b0 */
    private static Object m7990b0(Object obj) {
        return C6196a.m36062A(obj);
    }

    /* renamed from: d0 */
    private static Object m7991d0(Object obj) {
        return C6196a.m36063B(obj);
    }

    /* renamed from: e0 */
    private static Object m7992e0(C1721e eVar, Object obj) {
        return C6196a.m36064D(eVar.f5044b, obj);
    }

    /* renamed from: f0 */
    private Handler m7993f0() {
        return (Handler) C5917a.m34872e(this.f5028u);
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public boolean m7994i0(Message message) {
        int i = message.what;
        if (i == 0) {
            C1722f fVar = (C1722f) C5953m0.m35138j(message.obj);
            this.f5025D = this.f5025D.mo6878g(fVar.f5049a, ((Collection) fVar.f5050b).size());
            m7983U(fVar.f5049a, (Collection) fVar.f5050b);
            m8001s0(fVar.f5051c);
        } else if (i == 1) {
            C1722f fVar2 = (C1722f) C5953m0.m35138j(message.obj);
            int i2 = fVar2.f5049a;
            int intValue = ((Integer) fVar2.f5050b).intValue();
            if (i2 == 0 && intValue == this.f5025D.mo6873b()) {
                this.f5025D = this.f5025D.mo6880i();
            } else {
                this.f5025D = this.f5025D.mo6874c(i2, intValue);
            }
            for (int i3 = intValue - 1; i3 >= i2; i3--) {
                m7998o0(i3);
            }
            m8001s0(fVar2.f5051c);
        } else if (i == 2) {
            C1722f fVar3 = (C1722f) C5953m0.m35138j(message.obj);
            C1757s0 s0Var = this.f5025D;
            int i4 = fVar3.f5049a;
            C1757s0 c = s0Var.mo6874c(i4, i4 + 1);
            this.f5025D = c;
            this.f5025D = c.mo6878g(((Integer) fVar3.f5050b).intValue(), 1);
            m7996l0(fVar3.f5049a, ((Integer) fVar3.f5050b).intValue());
            m8001s0(fVar3.f5051c);
        } else if (i == 3) {
            C1722f fVar4 = (C1722f) C5953m0.m35138j(message.obj);
            this.f5025D = (C1757s0) fVar4.f5050b;
            m8001s0(fVar4.f5051c);
        } else if (i == 4) {
            m8004w0();
        } else if (i == 5) {
            m7988Z((Set) C5953m0.m35138j(message.obj));
        } else {
            throw new IllegalStateException();
        }
        return true;
    }

    /* renamed from: j0 */
    private void m7995j0(C1721e eVar) {
        if (eVar.f5048f && eVar.f5045c.isEmpty()) {
            this.f5032y.remove(eVar);
            mo6740O(eVar);
        }
    }

    /* renamed from: l0 */
    private void m7996l0(int i, int i2) {
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        int i3 = this.f5029v.get(min).f5047e;
        List<C1721e> list = this.f5029v;
        list.add(i2, list.remove(i));
        while (min <= max) {
            C1721e eVar = this.f5029v.get(min);
            eVar.f5046d = min;
            eVar.f5047e = i3;
            i3 += eVar.f5043a.mo6870T().mo6761t();
            min++;
        }
    }

    /* renamed from: m0 */
    private void m7997m0(int i, int i2, Handler handler, Runnable runnable) {
        boolean z = true;
        if ((handler == null) != (runnable == null)) {
            z = false;
        }
        C5917a.m34868a(z);
        Handler handler2 = this.f5028u;
        List<C1721e> list = this.f5026s;
        list.add(i2, list.remove(i));
        if (handler2 != null) {
            handler2.obtainMessage(2, new C1722f(i, Integer.valueOf(i2), m7986X(handler, runnable))).sendToTarget();
        } else if (runnable != null && handler != null) {
            handler.post(runnable);
        }
    }

    /* renamed from: o0 */
    private void m7998o0(int i) {
        C1721e remove = this.f5029v.remove(i);
        this.f5031x.remove(remove.f5044b);
        m7985W(i, -1, -remove.f5043a.mo6870T().mo6761t());
        remove.f5048f = true;
        m7995j0(remove);
    }

    /* renamed from: q0 */
    private void m7999q0(int i, int i2, Handler handler, Runnable runnable) {
        boolean z = false;
        if ((handler == null) == (runnable == null)) {
            z = true;
        }
        C5917a.m34868a(z);
        Handler handler2 = this.f5028u;
        C5953m0.m35093M0(this.f5026s, i, i2);
        if (handler2 != null) {
            handler2.obtainMessage(1, new C1722f(i, Integer.valueOf(i2), m7986X(handler, runnable))).sendToTarget();
        } else if (runnable != null && handler != null) {
            handler.post(runnable);
        }
    }

    /* renamed from: r0 */
    private void m8000r0() {
        m8001s0((C1720d) null);
    }

    /* renamed from: s0 */
    private void m8001s0(C1720d dVar) {
        if (!this.f5023B) {
            m7993f0().obtainMessage(4).sendToTarget();
            this.f5023B = true;
        }
        if (dVar != null) {
            this.f5024C.add(dVar);
        }
    }

    /* renamed from: t0 */
    private void m8002t0(C1757s0 s0Var, Handler handler, Runnable runnable) {
        boolean z = true;
        if ((handler == null) != (runnable == null)) {
            z = false;
        }
        C5917a.m34868a(z);
        Handler handler2 = this.f5028u;
        if (handler2 != null) {
            int g0 = mo6750g0();
            if (s0Var.mo6873b() != g0) {
                s0Var = s0Var.mo6880i().mo6878g(0, g0);
            }
            handler2.obtainMessage(3, new C1722f(0, s0Var, m7986X(handler, runnable))).sendToTarget();
            return;
        }
        if (s0Var.mo6873b() > 0) {
            s0Var = s0Var.mo6880i();
        }
        this.f5025D = s0Var;
        if (runnable != null && handler != null) {
            handler.post(runnable);
        }
    }

    /* renamed from: v0 */
    private void m8003v0(C1721e eVar, C6266q3 q3Var) {
        int t;
        if (eVar.f5046d + 1 < this.f5029v.size() && (t = q3Var.mo6761t() - (this.f5029v.get(eVar.f5046d + 1).f5047e - eVar.f5047e)) != 0) {
            m7985W(eVar.f5046d + 1, 0, t);
        }
        m8000r0();
    }

    /* renamed from: w0 */
    private void m8004w0() {
        this.f5023B = false;
        Set<C1720d> set = this.f5024C;
        this.f5024C = new HashSet();
        mo6652D(new C1718b(this.f5029v, this.f5025D, this.f5033z));
        m7993f0().obtainMessage(5, set).sendToTarget();
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public synchronized void mo6651C(C5840p0 p0Var) {
        super.mo6651C(p0Var);
        this.f5028u = new Handler(new C1714j(this));
        if (this.f5026s.isEmpty()) {
            m8004w0();
        } else {
            this.f5025D = this.f5025D.mo6878g(0, this.f5026s.size());
            m7983U(0, this.f5026s);
            m8000r0();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public synchronized void mo6653E() {
        super.mo6653E();
        this.f5029v.clear();
        this.f5032y.clear();
        this.f5031x.clear();
        this.f5025D = this.f5025D.mo6880i();
        Handler handler = this.f5028u;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f5028u = null;
        }
        this.f5023B = false;
        this.f5024C.clear();
        m7988Z(this.f5027t);
    }

    /* renamed from: S */
    public synchronized void mo6747S(int i, Collection<C1772x> collection, Handler handler, Runnable runnable) {
        m7984V(i, collection, handler, runnable);
    }

    /* renamed from: T */
    public synchronized void mo6748T(Collection<C1772x> collection) {
        m7984V(this.f5026s.size(), collection, (Handler) null, (Runnable) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public C1772x.C1774b mo6736I(C1721e eVar, C1772x.C1774b bVar) {
        for (int i = 0; i < eVar.f5045c.size(); i++) {
            if (eVar.f5045c.get(i).f5273d == bVar.f5273d) {
                return bVar.mo6896c(m7992e0(eVar, bVar.f5270a));
            }
        }
        return null;
    }

    /* renamed from: d */
    public void mo6707d(C1765u uVar) {
        C1721e eVar = (C1721e) C5917a.m34872e(this.f5030w.remove(uVar));
        eVar.f5043a.mo6707d(uVar);
        eVar.f5045c.remove(((C1750r) uVar).f5210a);
        if (!this.f5030w.isEmpty()) {
            m7987Y();
        }
        m7995j0(eVar);
    }

    /* renamed from: g0 */
    public synchronized int mo6750g0() {
        return this.f5026s.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public int mo6738K(C1721e eVar, int i) {
        return i + eVar.f5047e;
    }

    /* renamed from: i */
    public C6300z1 mo6708i() {
        return f5021E;
    }

    /* renamed from: k */
    public C1765u mo6709k(C1772x.C1774b bVar, C5789b bVar2, long j) {
        Object d0 = m7991d0(bVar.f5270a);
        C1772x.C1774b c = bVar.mo6896c(m7990b0(bVar.f5270a));
        C1721e eVar = this.f5031x.get(d0);
        if (eVar == null) {
            eVar = new C1721e(new C1719c(), this.f5022A);
            eVar.f5048f = true;
            mo6739N(eVar, eVar.f5043a);
        }
        m7989a0(eVar);
        eVar.f5045c.add(c);
        C1750r P = eVar.f5043a.mo6709k(c, bVar2, j);
        this.f5030w.put(P, eVar);
        m7987Y();
        return P;
    }

    /* renamed from: k0 */
    public synchronized void mo6752k0(int i, int i2, Handler handler, Runnable runnable) {
        m7997m0(i, i2, handler, runnable);
    }

    /* renamed from: m */
    public boolean mo6659m() {
        return false;
    }

    /* renamed from: n */
    public synchronized C6266q3 mo6660n() {
        C1757s0 s0Var;
        if (this.f5025D.mo6873b() != this.f5026s.size()) {
            s0Var = this.f5025D.mo6880i().mo6878g(0, this.f5026s.size());
        } else {
            s0Var = this.f5025D;
        }
        return new C1718b(this.f5026s, s0Var, this.f5033z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public void mo6705M(C1721e eVar, C1772x xVar, C6266q3 q3Var) {
        m8003v0(eVar, q3Var);
    }

    /* renamed from: p0 */
    public synchronized void mo6754p0(int i, int i2, Handler handler, Runnable runnable) {
        m7999q0(i, i2, handler, runnable);
    }

    /* renamed from: u0 */
    public synchronized void mo6755u0(C1757s0 s0Var) {
        m8002t0(s0Var, (Handler) null, (Runnable) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo6669y() {
        super.mo6669y();
        this.f5032y.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo6670z() {
    }

    public C1716k(boolean z, C1772x... xVarArr) {
        this(z, new C1757s0.C1758a(0), xVarArr);
    }

    public C1716k(boolean z, C1757s0 s0Var, C1772x... xVarArr) {
        this(z, false, s0Var, xVarArr);
    }

    public C1716k(boolean z, boolean z2, C1757s0 s0Var, C1772x... xVarArr) {
        for (C1772x e : xVarArr) {
            C5917a.m34872e(e);
        }
        this.f5025D = s0Var.mo6873b() > 0 ? s0Var.mo6880i() : s0Var;
        this.f5030w = new IdentityHashMap<>();
        this.f5031x = new HashMap();
        this.f5026s = new ArrayList();
        this.f5029v = new ArrayList();
        this.f5024C = new HashSet();
        this.f5027t = new HashSet();
        this.f5032y = new HashSet();
        this.f5033z = z;
        this.f5022A = z2;
        mo6748T(Arrays.asList(xVarArr));
    }
}
