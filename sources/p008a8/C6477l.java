package p008a8;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p211d8.C9885i;
import p211d8.C9898r;
import p247h8.C10466t;

/* renamed from: a8.l */
/* compiled from: CompositeFilter */
public class C6477l extends C6494r {

    /* renamed from: a */
    private final List<C6494r> f30790a;

    /* renamed from: b */
    private final C6478a f30791b;

    /* renamed from: c */
    private List<C6489q> f30792c;

    /* renamed from: a8.l$a */
    /* compiled from: CompositeFilter */
    public enum C6478a {
        AND("and"),
        OR("or");
        

        /* renamed from: a */
        private final String f30796a;

        private C6478a(String str) {
            this.f30796a = str;
        }

        public String toString() {
            return this.f30796a;
        }
    }

    public C6477l(List<C6494r> list, C6478a aVar) {
        this.f30790a = new ArrayList(list);
        this.f30791b = aVar;
    }

    /* renamed from: g */
    private C6489q m37784g(C10466t<C6489q, Boolean> tVar) {
        for (C6489q next : mo21991d()) {
            if (tVar.apply(next).booleanValue()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public String mo21988a() {
        StringBuilder sb = new StringBuilder();
        if (mo21998l()) {
            for (C6494r a : this.f30790a) {
                sb.append(a.mo21988a());
            }
            return sb.toString();
        }
        sb.append(this.f30791b.toString() + "(");
        sb.append(TextUtils.join(",", this.f30790a));
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: b */
    public List<C6494r> mo21989b() {
        return Collections.unmodifiableList(this.f30790a);
    }

    /* renamed from: c */
    public C9898r mo21990c() {
        C6489q g = m37784g(C0135k.f300a);
        if (g != null) {
            return g.mo22037g();
        }
        return null;
    }

    /* renamed from: d */
    public List<C6489q> mo21991d() {
        List<C6489q> list = this.f30792c;
        if (list != null) {
            return Collections.unmodifiableList(list);
        }
        this.f30792c = new ArrayList();
        for (C6494r d : this.f30790a) {
            this.f30792c.addAll(d.mo21991d());
        }
        return Collections.unmodifiableList(this.f30792c);
    }

    /* renamed from: e */
    public boolean mo21910e(C9885i iVar) {
        if (mo21995i()) {
            for (C6494r e : this.f30790a) {
                if (!e.mo21910e(iVar)) {
                    return false;
                }
            }
            return true;
        }
        for (C6494r e2 : this.f30790a) {
            if (e2.mo21910e(iVar)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C6477l)) {
            return false;
        }
        C6477l lVar = (C6477l) obj;
        if (this.f30791b != lVar.f30791b || !this.f30790a.equals(lVar.f30790a)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public C6478a mo21993h() {
        return this.f30791b;
    }

    public int hashCode() {
        return ((1147 + this.f30791b.hashCode()) * 31) + this.f30790a.hashCode();
    }

    /* renamed from: i */
    public boolean mo21995i() {
        return this.f30791b == C6478a.AND;
    }

    /* renamed from: j */
    public boolean mo21996j() {
        return this.f30791b == C6478a.OR;
    }

    /* renamed from: k */
    public boolean mo21997k() {
        for (C6494r rVar : this.f30790a) {
            if (rVar instanceof C6477l) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    public boolean mo21998l() {
        return mo21997k() && mo21995i();
    }

    /* renamed from: n */
    public C6477l mo21999n(List<C6494r> list) {
        ArrayList arrayList = new ArrayList(this.f30790a);
        arrayList.addAll(list);
        return new C6477l(arrayList, this.f30791b);
    }

    public String toString() {
        return mo21988a();
    }
}
