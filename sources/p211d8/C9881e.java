package p211d8;

import java.util.ArrayList;
import java.util.List;
import p211d8.C9881e;
import p247h8.C10432b;
import p247h8.C10449g0;

/* renamed from: d8.e */
/* compiled from: BasePath */
public abstract class C9881e<B extends C9881e<B>> implements Comparable<B> {

    /* renamed from: a */
    final List<String> f39707a;

    C9881e(List<String> list) {
        this.f39707a = list;
    }

    /* renamed from: a */
    public B mo32346a(B b) {
        ArrayList arrayList = new ArrayList(this.f39707a);
        arrayList.addAll(b.f39707a);
        return mo32353k(arrayList);
    }

    /* renamed from: b */
    public B mo32347b(String str) {
        ArrayList arrayList = new ArrayList(this.f39707a);
        arrayList.add(str);
        return mo32353k(arrayList);
    }

    /* renamed from: c */
    public abstract String mo32348c();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9881e) && compareTo((C9881e) obj) == 0;
    }

    public int hashCode() {
        return ((getClass().hashCode() + 37) * 37) + this.f39707a.hashCode();
    }

    /* renamed from: j */
    public int compareTo(B b) {
        int r = mo32358r();
        int r2 = b.mo32358r();
        int i = 0;
        while (i < r && i < r2) {
            int compareTo = mo32355o(i).compareTo(b.mo32355o(i));
            if (compareTo != 0) {
                return compareTo;
            }
            i++;
        }
        return C10449g0.m52712l(r, r2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract B mo32353k(List<String> list);

    /* renamed from: n */
    public String mo32354n() {
        return this.f39707a.get(mo32358r() - 1);
    }

    /* renamed from: o */
    public String mo32355o(int i) {
        return this.f39707a.get(i);
    }

    /* renamed from: p */
    public boolean mo32356p() {
        return mo32358r() == 0;
    }

    /* renamed from: q */
    public boolean mo32357q(B b) {
        if (mo32358r() > b.mo32358r()) {
            return false;
        }
        for (int i = 0; i < mo32358r(); i++) {
            if (!mo32355o(i).equals(b.mo32355o(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public int mo32358r() {
        return this.f39707a.size();
    }

    /* renamed from: s */
    public B mo32359s(int i) {
        int r = mo32358r();
        C10432b.m52648d(r >= i, "Can't call popFirst with count > length() (%d > %d)", Integer.valueOf(i), Integer.valueOf(r));
        return mo32353k(this.f39707a.subList(i, r));
    }

    /* renamed from: t */
    public B mo32360t() {
        return mo32353k(this.f39707a.subList(0, mo32358r() - 1));
    }

    public String toString() {
        return mo32348c();
    }
}
