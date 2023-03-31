package androidx.lifecycle;

import androidx.lifecycle.C1208j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p075k.C4834a;
import p082l.C4889a;
import p082l.C4890b;

/* renamed from: androidx.lifecycle.o */
/* compiled from: LifecycleRegistry */
public class C1222o extends C1208j {

    /* renamed from: b */
    private C4889a<C1218m, C1223a> f3339b;

    /* renamed from: c */
    private C1208j.C1211c f3340c;

    /* renamed from: d */
    private final WeakReference<C1220n> f3341d;

    /* renamed from: e */
    private int f3342e;

    /* renamed from: f */
    private boolean f3343f;

    /* renamed from: g */
    private boolean f3344g;

    /* renamed from: h */
    private ArrayList<C1208j.C1211c> f3345h;

    /* renamed from: i */
    private final boolean f3346i;

    /* renamed from: androidx.lifecycle.o$a */
    /* compiled from: LifecycleRegistry */
    static class C1223a {

        /* renamed from: a */
        C1208j.C1211c f3347a;

        /* renamed from: b */
        C1216l f3348b;

        C1223a(C1218m mVar, C1208j.C1211c cVar) {
            this.f3348b = C1226r.m5460f(mVar);
            this.f3347a = cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4411a(C1220n nVar, C1208j.C1210b bVar) {
            C1208j.C1211c b = bVar.mo4402b();
            this.f3347a = C1222o.m5443k(this.f3347a, b);
            this.f3348b.mo752c(nVar, bVar);
            this.f3347a = b;
        }
    }

    public C1222o(C1220n nVar) {
        this(nVar, true);
    }

    /* renamed from: d */
    private void m5438d(C1220n nVar) {
        Iterator<Map.Entry<C1218m, C1223a>> descendingIterator = this.f3339b.descendingIterator();
        while (descendingIterator.hasNext() && !this.f3344g) {
            Map.Entry next = descendingIterator.next();
            C1223a aVar = (C1223a) next.getValue();
            while (aVar.f3347a.compareTo(this.f3340c) > 0 && !this.f3344g && this.f3339b.contains((C1218m) next.getKey())) {
                C1208j.C1210b a = C1208j.C1210b.m5424a(aVar.f3347a);
                if (a != null) {
                    m5446n(a.mo4402b());
                    aVar.mo4411a(nVar, a);
                    m5445m();
                } else {
                    throw new IllegalStateException("no event down from " + aVar.f3347a);
                }
            }
        }
    }

    /* renamed from: e */
    private C1208j.C1211c m5439e(C1218m mVar) {
        Map.Entry<C1218m, C1223a> o = this.f3339b.mo18681o(mVar);
        C1208j.C1211c cVar = null;
        C1208j.C1211c cVar2 = o != null ? o.getValue().f3347a : null;
        if (!this.f3345h.isEmpty()) {
            ArrayList<C1208j.C1211c> arrayList = this.f3345h;
            cVar = arrayList.get(arrayList.size() - 1);
        }
        return m5443k(m5443k(this.f3340c, cVar2), cVar);
    }

    /* renamed from: f */
    private void m5440f(String str) {
        if (this.f3346i && !C4834a.m30860e().mo18577b()) {
            throw new IllegalStateException("Method " + str + " must be called on the main thread");
        }
    }

    /* renamed from: g */
    private void m5441g(C1220n nVar) {
        C4890b<K, V>.d f = this.f3339b.mo18685f();
        while (f.hasNext() && !this.f3344g) {
            Map.Entry entry = (Map.Entry) f.next();
            C1223a aVar = (C1223a) entry.getValue();
            while (aVar.f3347a.compareTo(this.f3340c) < 0 && !this.f3344g && this.f3339b.contains((C1218m) entry.getKey())) {
                m5446n(aVar.f3347a);
                C1208j.C1210b c = C1208j.C1210b.m5425c(aVar.f3347a);
                if (c != null) {
                    aVar.mo4411a(nVar, c);
                    m5445m();
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f3347a);
                }
            }
        }
    }

    /* renamed from: i */
    private boolean m5442i() {
        if (this.f3339b.size() == 0) {
            return true;
        }
        C1208j.C1211c cVar = this.f3339b.mo18682b().getValue().f3347a;
        C1208j.C1211c cVar2 = this.f3339b.mo18687i().getValue().f3347a;
        if (cVar == cVar2 && this.f3340c == cVar2) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    static C1208j.C1211c m5443k(C1208j.C1211c cVar, C1208j.C1211c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    /* renamed from: l */
    private void m5444l(C1208j.C1211c cVar) {
        C1208j.C1211c cVar2 = this.f3340c;
        if (cVar2 != cVar) {
            if (cVar2 == C1208j.C1211c.INITIALIZED && cVar == C1208j.C1211c.DESTROYED) {
                throw new IllegalStateException("no event down from " + this.f3340c);
            }
            this.f3340c = cVar;
            if (this.f3343f || this.f3342e != 0) {
                this.f3344g = true;
                return;
            }
            this.f3343f = true;
            m5447p();
            this.f3343f = false;
            if (this.f3340c == C1208j.C1211c.DESTROYED) {
                this.f3339b = new C4889a<>();
            }
        }
    }

    /* renamed from: m */
    private void m5445m() {
        ArrayList<C1208j.C1211c> arrayList = this.f3345h;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: n */
    private void m5446n(C1208j.C1211c cVar) {
        this.f3345h.add(cVar);
    }

    /* renamed from: p */
    private void m5447p() {
        C1220n nVar = (C1220n) this.f3341d.get();
        if (nVar != null) {
            while (!m5442i()) {
                this.f3344g = false;
                if (this.f3340c.compareTo(this.f3339b.mo18682b().getValue().f3347a) < 0) {
                    m5438d(nVar);
                }
                Map.Entry<C1218m, C1223a> i = this.f3339b.mo18687i();
                if (!this.f3344g && i != null && this.f3340c.compareTo(i.getValue().f3347a) > 0) {
                    m5441g(nVar);
                }
            }
            this.f3344g = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    /* renamed from: a */
    public void mo4399a(C1218m mVar) {
        C1220n nVar;
        m5440f("addObserver");
        C1208j.C1211c cVar = this.f3340c;
        C1208j.C1211c cVar2 = C1208j.C1211c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = C1208j.C1211c.INITIALIZED;
        }
        C1223a aVar = new C1223a(mVar, cVar2);
        if (this.f3339b.mo18679k(mVar, aVar) == null && (nVar = (C1220n) this.f3341d.get()) != null) {
            boolean z = this.f3342e != 0 || this.f3343f;
            C1208j.C1211c e = m5439e(mVar);
            this.f3342e++;
            while (aVar.f3347a.compareTo(e) < 0 && this.f3339b.contains(mVar)) {
                m5446n(aVar.f3347a);
                C1208j.C1210b c = C1208j.C1210b.m5425c(aVar.f3347a);
                if (c != null) {
                    aVar.mo4411a(nVar, c);
                    m5445m();
                    e = m5439e(mVar);
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f3347a);
                }
            }
            if (!z) {
                m5447p();
            }
            this.f3342e--;
        }
    }

    /* renamed from: b */
    public C1208j.C1211c mo4400b() {
        return this.f3340c;
    }

    /* renamed from: c */
    public void mo4401c(C1218m mVar) {
        m5440f("removeObserver");
        this.f3339b.mo18680l(mVar);
    }

    /* renamed from: h */
    public void mo4408h(C1208j.C1210b bVar) {
        m5440f("handleLifecycleEvent");
        m5444l(bVar.mo4402b());
    }

    @Deprecated
    /* renamed from: j */
    public void mo4409j(C1208j.C1211c cVar) {
        m5440f("markState");
        mo4410o(cVar);
    }

    /* renamed from: o */
    public void mo4410o(C1208j.C1211c cVar) {
        m5440f("setCurrentState");
        m5444l(cVar);
    }

    private C1222o(C1220n nVar, boolean z) {
        this.f3339b = new C4889a<>();
        this.f3342e = 0;
        this.f3343f = false;
        this.f3344g = false;
        this.f3345h = new ArrayList<>();
        this.f3341d = new WeakReference<>(nVar);
        this.f3340c = C1208j.C1211c.INITIALIZED;
        this.f3346i = z;
    }
}
