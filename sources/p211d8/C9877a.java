package p211d8;

import java.util.List;
import java.util.Objects;
import p211d8.C9893q;

/* renamed from: d8.a */
/* compiled from: AutoValue_FieldIndex */
final class C9877a extends C9893q {

    /* renamed from: c */
    private final int f39696c;

    /* renamed from: d */
    private final String f39697d;

    /* renamed from: e */
    private final List<C9893q.C9896c> f39698e;

    /* renamed from: f */
    private final C9893q.C9895b f39699f;

    C9877a(int i, String str, List<C9893q.C9896c> list, C9893q.C9895b bVar) {
        this.f39696c = i;
        Objects.requireNonNull(str, "Null collectionGroup");
        this.f39697d = str;
        Objects.requireNonNull(list, "Null segments");
        this.f39698e = list;
        Objects.requireNonNull(bVar, "Null indexState");
        this.f39699f = bVar;
    }

    /* renamed from: d */
    public String mo32323d() {
        return this.f39697d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9893q)) {
            return false;
        }
        C9893q qVar = (C9893q) obj;
        if (this.f39696c != qVar.mo32325f() || !this.f39697d.equals(qVar.mo32323d()) || !this.f39698e.equals(qVar.mo32327h()) || !this.f39699f.equals(qVar.mo32326g())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public int mo32325f() {
        return this.f39696c;
    }

    /* renamed from: g */
    public C9893q.C9895b mo32326g() {
        return this.f39699f;
    }

    /* renamed from: h */
    public List<C9893q.C9896c> mo32327h() {
        return this.f39698e;
    }

    public int hashCode() {
        return ((((((this.f39696c ^ 1000003) * 1000003) ^ this.f39697d.hashCode()) * 1000003) ^ this.f39698e.hashCode()) * 1000003) ^ this.f39699f.hashCode();
    }

    public String toString() {
        return "FieldIndex{indexId=" + this.f39696c + ", collectionGroup=" + this.f39697d + ", segments=" + this.f39698e + ", indexState=" + this.f39699f + "}";
    }
}
