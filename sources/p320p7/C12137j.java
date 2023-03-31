package p320p7;

import java.util.Comparator;
import p320p7.C12134h;

/* renamed from: p7.j */
/* compiled from: LLRBValueNode */
public abstract class C12137j<K, V> implements C12134h<K, V> {

    /* renamed from: a */
    private final K f45188a;

    /* renamed from: b */
    private final V f45189b;

    /* renamed from: c */
    private C12134h<K, V> f45190c;

    /* renamed from: d */
    private final C12134h<K, V> f45191d;

    C12137j(K k, V v, C12134h<K, V> hVar, C12134h<K, V> hVar2) {
        this.f45188a = k;
        this.f45189b = v;
        this.f45190c = hVar == null ? C12133g.m58289i() : hVar;
        this.f45191d = hVar2 == null ? C12133g.m58289i() : hVar2;
    }

    /* renamed from: i */
    private C12137j<K, V> m58309i() {
        C12134h<K, V> hVar = this.f45190c;
        C12134h<K, V> d = hVar.mo36658d(null, null, m58313p(hVar), (C12134h<K, V>) null, (C12134h<K, V>) null);
        C12134h<K, V> hVar2 = this.f45191d;
        return mo36658d((Object) null, (Object) null, m58313p(this), d, hVar2.mo36658d(null, null, m58313p(hVar2), (C12134h<K, V>) null, (C12134h<K, V>) null));
    }

    /* renamed from: l */
    private C12137j<K, V> m58310l() {
        C12137j r = (!this.f45191d.mo36650e() || this.f45190c.mo36650e()) ? this : m58315r();
        if (r.f45190c.mo36650e() && ((C12137j) r.f45190c).f45190c.mo36650e()) {
            r = r.m58316s();
        }
        return (!r.f45190c.mo36650e() || !r.f45191d.mo36650e()) ? r : r.m58309i();
    }

    /* renamed from: n */
    private C12137j<K, V> m58311n() {
        C12137j<K, V> i = m58309i();
        return i.mo36659f().mo36655a().mo36650e() ? i.mo36651k((K) null, (V) null, (C12134h<K, V>) null, ((C12137j) i.mo36659f()).m58316s()).m58315r().m58309i() : i;
    }

    /* renamed from: o */
    private C12137j<K, V> m58312o() {
        C12137j<K, V> i = m58309i();
        return i.mo36655a().mo36655a().mo36650e() ? i.m58316s().m58309i() : i;
    }

    /* renamed from: p */
    private static C12134h.C12135a m58313p(C12134h hVar) {
        return hVar.mo36650e() ? C12134h.C12135a.BLACK : C12134h.C12135a.RED;
    }

    /* renamed from: q */
    private C12134h<K, V> m58314q() {
        if (this.f45190c.isEmpty()) {
            return C12133g.m58289i();
        }
        C12137j n = (mo36655a().mo36650e() || mo36655a().mo36655a().mo36650e()) ? this : m58311n();
        return n.mo36651k((Object) null, (Object) null, ((C12137j) n.f45190c).m58314q(), (C12134h) null).m58310l();
    }

    /* renamed from: r */
    private C12137j<K, V> m58315r() {
        return (C12137j) this.f45191d.mo36658d(null, null, mo36652m(), mo36658d((Object) null, (Object) null, C12134h.C12135a.RED, (C12134h) null, ((C12137j) this.f45191d).f45190c), (C12137j<K, V>) null);
    }

    /* renamed from: s */
    private C12137j<K, V> m58316s() {
        return (C12137j) this.f45190c.mo36658d(null, null, mo36652m(), (C12134h) null, mo36658d((Object) null, (Object) null, C12134h.C12135a.RED, ((C12137j) this.f45190c).f45191d, (C12134h<K, V>) null));
    }

    /* renamed from: a */
    public C12134h<K, V> mo36655a() {
        return this.f45190c;
    }

    /* renamed from: b */
    public C12134h<K, V> mo36656b(K k, V v, Comparator<K> comparator) {
        C12137j<K, V> jVar;
        int compare = comparator.compare(k, this.f45188a);
        if (compare < 0) {
            jVar = mo36651k((Object) null, (Object) null, this.f45190c.mo36656b(k, v, comparator), (C12134h<K, V>) null);
        } else if (compare == 0) {
            jVar = mo36651k(k, v, (C12134h) null, (C12134h) null);
        } else {
            jVar = mo36651k((Object) null, (Object) null, (C12134h) null, this.f45191d.mo36656b(k, v, comparator));
        }
        return jVar.m58310l();
    }

    /* renamed from: c */
    public C12134h<K, V> mo36657c(K k, Comparator<K> comparator) {
        C12137j<K, V> jVar;
        if (comparator.compare(k, this.f45188a) < 0) {
            C12137j n = (this.f45190c.isEmpty() || this.f45190c.mo36650e() || ((C12137j) this.f45190c).f45190c.mo36650e()) ? this : m58311n();
            jVar = n.mo36651k((Object) null, (Object) null, n.f45190c.mo36657c(k, comparator), (C12134h<K, V>) null);
        } else {
            C12137j s = this.f45190c.mo36650e() ? m58316s() : this;
            if (!s.f45191d.isEmpty() && !s.f45191d.mo36650e() && !((C12137j) s.f45191d).f45190c.mo36650e()) {
                s = s.m58312o();
            }
            if (comparator.compare(k, s.f45188a) == 0) {
                if (s.f45191d.isEmpty()) {
                    return C12133g.m58289i();
                }
                C12134h<K, V> g = s.f45191d.mo36660g();
                s = s.mo36651k(g.getKey(), g.getValue(), (C12134h) null, ((C12137j) s.f45191d).m58314q());
            }
            jVar = s.mo36651k((Object) null, (Object) null, (C12134h) null, s.f45191d.mo36657c(k, comparator));
        }
        return jVar.m58310l();
    }

    /* renamed from: f */
    public C12134h<K, V> mo36659f() {
        return this.f45191d;
    }

    /* renamed from: g */
    public C12134h<K, V> mo36660g() {
        if (this.f45190c.isEmpty()) {
            return this;
        }
        return this.f45190c.mo36660g();
    }

    public K getKey() {
        return this.f45188a;
    }

    public V getValue() {
        return this.f45189b;
    }

    /* renamed from: h */
    public C12134h<K, V> mo36663h() {
        if (this.f45191d.isEmpty()) {
            return this;
        }
        return this.f45191d.mo36663h();
    }

    public boolean isEmpty() {
        return false;
    }

    /* renamed from: j */
    public C12137j<K, V> mo36658d(K k, V v, C12134h.C12135a aVar, C12134h<K, V> hVar, C12134h<K, V> hVar2) {
        if (k == null) {
            k = this.f45188a;
        }
        if (v == null) {
            v = this.f45189b;
        }
        if (hVar == null) {
            hVar = this.f45190c;
        }
        if (hVar2 == null) {
            hVar2 = this.f45191d;
        }
        if (aVar == C12134h.C12135a.RED) {
            return new C12136i(k, v, hVar, hVar2);
        }
        return new C12132f(k, v, hVar, hVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract C12137j<K, V> mo36651k(K k, V v, C12134h<K, V> hVar, C12134h<K, V> hVar2);

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract C12134h.C12135a mo36652m();

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo36654t(C12134h<K, V> hVar) {
        this.f45190c = hVar;
    }
}
