package p008a8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p008a8.C6480n;
import p211d8.C9885i;
import p211d8.C9888l;
import p211d8.C9890n;
import p320p7.C12130e;

/* renamed from: a8.y1 */
/* compiled from: ViewSnapshot */
public class C6514y1 {

    /* renamed from: a */
    private final C6452b1 f30900a;

    /* renamed from: b */
    private final C9890n f30901b;

    /* renamed from: c */
    private final C9890n f30902c;

    /* renamed from: d */
    private final List<C6480n> f30903d;

    /* renamed from: e */
    private final boolean f30904e;

    /* renamed from: f */
    private final C12130e<C9888l> f30905f;

    /* renamed from: g */
    private final boolean f30906g;

    /* renamed from: h */
    private boolean f30907h;

    /* renamed from: i */
    private boolean f30908i;

    /* renamed from: a8.y1$a */
    /* compiled from: ViewSnapshot */
    public enum C6515a {
        NONE,
        LOCAL,
        SYNCED
    }

    public C6514y1(C6452b1 b1Var, C9890n nVar, C9890n nVar2, List<C6480n> list, boolean z, C12130e<C9888l> eVar, boolean z2, boolean z3, boolean z4) {
        this.f30900a = b1Var;
        this.f30901b = nVar;
        this.f30902c = nVar2;
        this.f30903d = list;
        this.f30904e = z;
        this.f30905f = eVar;
        this.f30906g = z2;
        this.f30907h = z3;
        this.f30908i = z4;
    }

    /* renamed from: c */
    public static C6514y1 m37976c(C6452b1 b1Var, C9890n nVar, C12130e<C9888l> eVar, boolean z, boolean z2, boolean z3) {
        ArrayList arrayList = new ArrayList();
        Iterator<C9885i> it = nVar.iterator();
        while (it.hasNext()) {
            arrayList.add(C6480n.m37801a(C6480n.C6481a.ADDED, it.next()));
        }
        return new C6514y1(b1Var, nVar, C9890n.m50707f(b1Var.mo21874c()), arrayList, z, eVar, true, z2, z3);
    }

    /* renamed from: a */
    public boolean mo22083a() {
        return this.f30906g;
    }

    /* renamed from: b */
    public boolean mo22084b() {
        return this.f30907h;
    }

    /* renamed from: d */
    public List<C6480n> mo22085d() {
        return this.f30903d;
    }

    /* renamed from: e */
    public C9890n mo22086e() {
        return this.f30901b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6514y1)) {
            return false;
        }
        C6514y1 y1Var = (C6514y1) obj;
        if (this.f30904e == y1Var.f30904e && this.f30906g == y1Var.f30906g && this.f30907h == y1Var.f30907h && this.f30900a.equals(y1Var.f30900a) && this.f30905f.equals(y1Var.f30905f) && this.f30901b.equals(y1Var.f30901b) && this.f30902c.equals(y1Var.f30902c) && this.f30908i == y1Var.f30908i) {
            return this.f30903d.equals(y1Var.f30903d);
        }
        return false;
    }

    /* renamed from: f */
    public C12130e<C9888l> mo22088f() {
        return this.f30905f;
    }

    /* renamed from: g */
    public C9890n mo22089g() {
        return this.f30902c;
    }

    /* renamed from: h */
    public C6452b1 mo22090h() {
        return this.f30900a;
    }

    public int hashCode() {
        return (((((((((((((((this.f30900a.hashCode() * 31) + this.f30901b.hashCode()) * 31) + this.f30902c.hashCode()) * 31) + this.f30903d.hashCode()) * 31) + this.f30905f.hashCode()) * 31) + (this.f30904e ? 1 : 0)) * 31) + (this.f30906g ? 1 : 0)) * 31) + (this.f30907h ? 1 : 0)) * 31) + (this.f30908i ? 1 : 0);
    }

    /* renamed from: i */
    public boolean mo22092i() {
        return this.f30908i;
    }

    /* renamed from: j */
    public boolean mo22093j() {
        return !this.f30905f.isEmpty();
    }

    /* renamed from: k */
    public boolean mo22094k() {
        return this.f30904e;
    }

    public String toString() {
        return "ViewSnapshot(" + this.f30900a + ", " + this.f30901b + ", " + this.f30902c + ", " + this.f30903d + ", isFromCache=" + this.f30904e + ", mutatedKeys=" + this.f30905f.size() + ", didSyncStateChange=" + this.f30906g + ", excludesMetadataChanges=" + this.f30907h + ", hasCachedResults=" + this.f30908i + ")";
    }
}
