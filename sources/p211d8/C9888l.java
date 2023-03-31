package p211d8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p247h8.C10432b;
import p320p7.C12130e;

/* renamed from: d8.l */
/* compiled from: DocumentKey */
public final class C9888l implements Comparable<C9888l> {

    /* renamed from: b */
    private static final Comparator<C9888l> f39715b;

    /* renamed from: c */
    private static final C12130e<C9888l> f39716c;

    /* renamed from: a */
    private final C9903u f39717a;

    static {
        C9887k kVar = C9887k.f39714a;
        f39715b = kVar;
        f39716c = new C12130e<>(Collections.emptyList(), kVar);
    }

    private C9888l(C9903u uVar) {
        C10432b.m52648d(m50699u(uVar), "Not a document key path: %s", uVar);
        this.f39717a = uVar;
    }

    /* renamed from: a */
    public static Comparator<C9888l> m50693a() {
        return f39715b;
    }

    /* renamed from: c */
    public static C9888l m50694c() {
        return m50698o(Collections.emptyList());
    }

    /* renamed from: j */
    public static C12130e<C9888l> m50695j() {
        return f39716c;
    }

    /* renamed from: k */
    public static C9888l m50696k(String str) {
        C9903u w = C9903u.m50784w(str);
        C10432b.m52648d(w.mo32358r() > 4 && w.mo32355o(0).equals("projects") && w.mo32355o(2).equals("databases") && w.mo32355o(4).equals("documents"), "Tried to parse an invalid key: %s", w);
        return m50697n((C9903u) w.mo32359s(5));
    }

    /* renamed from: n */
    public static C9888l m50697n(C9903u uVar) {
        return new C9888l(uVar);
    }

    /* renamed from: o */
    public static C9888l m50698o(List<String> list) {
        return new C9888l(C9903u.m50783v(list));
    }

    /* renamed from: u */
    public static boolean m50699u(C9903u uVar) {
        return uVar.mo32358r() % 2 == 0;
    }

    /* renamed from: b */
    public int compareTo(C9888l lVar) {
        return this.f39717a.compareTo(lVar.f39717a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9888l.class != obj.getClass()) {
            return false;
        }
        return this.f39717a.equals(((C9888l) obj).f39717a);
    }

    public int hashCode() {
        return this.f39717a.hashCode();
    }

    /* renamed from: p */
    public String mo32387p() {
        C9903u uVar = this.f39717a;
        return uVar.mo32355o(uVar.mo32358r() - 2);
    }

    /* renamed from: q */
    public C9903u mo32388q() {
        return (C9903u) this.f39717a.mo32360t();
    }

    /* renamed from: r */
    public String mo32389r() {
        return this.f39717a.mo32354n();
    }

    /* renamed from: s */
    public C9903u mo32390s() {
        return this.f39717a;
    }

    /* renamed from: t */
    public boolean mo32391t(String str) {
        if (this.f39717a.mo32358r() >= 2) {
            C9903u uVar = this.f39717a;
            if (uVar.f39707a.get(uVar.mo32358r() - 2).equals(str)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return this.f39717a.toString();
    }
}
