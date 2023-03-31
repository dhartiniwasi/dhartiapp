package p211d8;

import p405y8.C13088b0;

/* renamed from: d8.s */
/* compiled from: MutableDocument */
public final class C9899s implements C9885i {

    /* renamed from: b */
    private final C9888l f39733b;

    /* renamed from: c */
    private C9901b f39734c;

    /* renamed from: d */
    private C9905w f39735d;

    /* renamed from: e */
    private C9905w f39736e;

    /* renamed from: f */
    private C9902t f39737f;

    /* renamed from: g */
    private C9900a f39738g;

    /* renamed from: d8.s$a */
    /* compiled from: MutableDocument */
    private enum C9900a {
        HAS_LOCAL_MUTATIONS,
        HAS_COMMITTED_MUTATIONS,
        SYNCED
    }

    /* renamed from: d8.s$b */
    /* compiled from: MutableDocument */
    private enum C9901b {
        INVALID,
        FOUND_DOCUMENT,
        NO_DOCUMENT,
        UNKNOWN_DOCUMENT
    }

    private C9899s(C9888l lVar) {
        this.f39733b = lVar;
        this.f39736e = C9905w.f39751b;
    }

    /* renamed from: o */
    public static C9899s m50749o(C9888l lVar, C9905w wVar, C9902t tVar) {
        return new C9899s(lVar).mo32418k(wVar, tVar);
    }

    /* renamed from: p */
    public static C9899s m50750p(C9888l lVar) {
        C9901b bVar = C9901b.INVALID;
        C9905w wVar = C9905w.f39751b;
        return new C9899s(lVar, bVar, wVar, wVar, new C9902t(), C9900a.SYNCED);
    }

    /* renamed from: q */
    public static C9899s m50751q(C9888l lVar, C9905w wVar) {
        return new C9899s(lVar).mo32419l(wVar);
    }

    /* renamed from: r */
    public static C9899s m50752r(C9888l lVar, C9905w wVar) {
        return new C9899s(lVar).mo32420m(wVar);
    }

    /* renamed from: a */
    public C9899s mo32370a() {
        return new C9899s(this.f39733b, this.f39734c, this.f39735d, this.f39736e, this.f39737f.clone(), this.f39738g);
    }

    /* renamed from: b */
    public boolean mo32371b() {
        return this.f39734c.equals(C9901b.FOUND_DOCUMENT);
    }

    /* renamed from: c */
    public boolean mo32372c() {
        return this.f39738g.equals(C9900a.HAS_COMMITTED_MUTATIONS);
    }

    /* renamed from: d */
    public boolean mo32373d() {
        return this.f39738g.equals(C9900a.HAS_LOCAL_MUTATIONS);
    }

    /* renamed from: e */
    public boolean mo32374e() {
        return mo32373d() || mo32372c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9899s.class != obj.getClass()) {
            return false;
        }
        C9899s sVar = (C9899s) obj;
        if (this.f39733b.equals(sVar.f39733b) && this.f39735d.equals(sVar.f39735d) && this.f39734c.equals(sVar.f39734c) && this.f39738g.equals(sVar.f39738g)) {
            return this.f39737f.equals(sVar.f39737f);
        }
        return false;
    }

    /* renamed from: f */
    public C9905w mo32375f() {
        return this.f39736e;
    }

    /* renamed from: g */
    public C13088b0 mo32376g(C9898r rVar) {
        return getData().mo32430h(rVar);
    }

    public C9902t getData() {
        return this.f39737f;
    }

    public C9888l getKey() {
        return this.f39733b;
    }

    /* renamed from: h */
    public boolean mo32379h() {
        return this.f39734c.equals(C9901b.NO_DOCUMENT);
    }

    public int hashCode() {
        return this.f39733b.hashCode();
    }

    /* renamed from: i */
    public boolean mo32380i() {
        return this.f39734c.equals(C9901b.UNKNOWN_DOCUMENT);
    }

    /* renamed from: j */
    public C9905w mo32381j() {
        return this.f39735d;
    }

    /* renamed from: k */
    public C9899s mo32418k(C9905w wVar, C9902t tVar) {
        this.f39735d = wVar;
        this.f39734c = C9901b.FOUND_DOCUMENT;
        this.f39737f = tVar;
        this.f39738g = C9900a.SYNCED;
        return this;
    }

    /* renamed from: l */
    public C9899s mo32419l(C9905w wVar) {
        this.f39735d = wVar;
        this.f39734c = C9901b.NO_DOCUMENT;
        this.f39737f = new C9902t();
        this.f39738g = C9900a.SYNCED;
        return this;
    }

    /* renamed from: m */
    public C9899s mo32420m(C9905w wVar) {
        this.f39735d = wVar;
        this.f39734c = C9901b.UNKNOWN_DOCUMENT;
        this.f39737f = new C9902t();
        this.f39738g = C9900a.HAS_COMMITTED_MUTATIONS;
        return this;
    }

    /* renamed from: n */
    public boolean mo32421n() {
        return !this.f39734c.equals(C9901b.INVALID);
    }

    /* renamed from: s */
    public C9899s mo32422s() {
        this.f39738g = C9900a.HAS_COMMITTED_MUTATIONS;
        return this;
    }

    /* renamed from: t */
    public C9899s mo32423t() {
        this.f39738g = C9900a.HAS_LOCAL_MUTATIONS;
        this.f39735d = C9905w.f39751b;
        return this;
    }

    public String toString() {
        return "Document{key=" + this.f39733b + ", version=" + this.f39735d + ", readTime=" + this.f39736e + ", type=" + this.f39734c + ", documentState=" + this.f39738g + ", value=" + this.f39737f + '}';
    }

    /* renamed from: u */
    public C9899s mo32425u(C9905w wVar) {
        this.f39736e = wVar;
        return this;
    }

    private C9899s(C9888l lVar, C9901b bVar, C9905w wVar, C9905w wVar2, C9902t tVar, C9900a aVar) {
        this.f39733b = lVar;
        this.f39735d = wVar;
        this.f39736e = wVar2;
        this.f39734c = bVar;
        this.f39738g = aVar;
        this.f39737f = tVar;
    }
}
