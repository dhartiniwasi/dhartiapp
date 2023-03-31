package p220e8;

import java.util.HashSet;
import java.util.Set;
import p211d8.C9898r;

/* renamed from: e8.d */
/* compiled from: FieldMask */
public final class C10007d {

    /* renamed from: b */
    public static C10007d f39958b = m51096b(new HashSet());

    /* renamed from: a */
    private final Set<C9898r> f39959a;

    private C10007d(Set<C9898r> set) {
        this.f39959a = set;
    }

    /* renamed from: b */
    public static C10007d m51096b(Set<C9898r> set) {
        return new C10007d(set);
    }

    /* renamed from: a */
    public boolean mo32587a(C9898r rVar) {
        for (C9898r q : this.f39959a) {
            if (q.mo32357q(rVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public Set<C9898r> mo32588c() {
        return this.f39959a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10007d.class != obj.getClass()) {
            return false;
        }
        return this.f39959a.equals(((C10007d) obj).f39959a);
    }

    public int hashCode() {
        return this.f39959a.hashCode();
    }

    public String toString() {
        return "FieldMask{mask=" + this.f39959a.toString() + "}";
    }
}
