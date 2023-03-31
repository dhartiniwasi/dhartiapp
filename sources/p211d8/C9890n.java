package p211d8;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import p320p7.C12126c;
import p320p7.C12130e;

/* renamed from: d8.n */
/* compiled from: DocumentSet */
public final class C9890n implements Iterable<C9885i> {

    /* renamed from: a */
    private final C12126c<C9888l, C9885i> f39719a;

    /* renamed from: b */
    private final C12130e<C9885i> f39720b;

    private C9890n(C12126c<C9888l, C9885i> cVar, C12130e<C9885i> eVar) {
        this.f39719a = cVar;
        this.f39720b = eVar;
    }

    /* renamed from: f */
    public static C9890n m50707f(Comparator<C9885i> comparator) {
        return new C9890n(C9886j.m50690a(), new C12130e(Collections.emptyList(), new C9889m(comparator)));
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ int m50708o(Comparator comparator, C9885i iVar, C9885i iVar2) {
        int compare = comparator.compare(iVar, iVar2);
        return compare == 0 ? C9885i.f39712a.compare(iVar, iVar2) : compare;
    }

    /* renamed from: c */
    public C9890n mo32394c(C9885i iVar) {
        C9890n q = mo32403q(iVar.getKey());
        return new C9890n(q.f39719a.mo36618k(iVar.getKey(), iVar), q.f39720b.mo36638f(iVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9890n.class != obj.getClass()) {
            return false;
        }
        C9890n nVar = (C9890n) obj;
        if (size() != nVar.size()) {
            return false;
        }
        Iterator<C9885i> it = iterator();
        Iterator<C9885i> it2 = nVar.iterator();
        while (it.hasNext()) {
            if (!it.next().equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Iterator<C9885i> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            C9885i next = it.next();
            i = (((i * 31) + next.getKey().hashCode()) * 31) + next.getData().hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public C9885i mo32397i(C9888l lVar) {
        return this.f39719a.mo36611c(lVar);
    }

    public boolean isEmpty() {
        return this.f39719a.isEmpty();
    }

    public Iterator<C9885i> iterator() {
        return this.f39720b.iterator();
    }

    /* renamed from: j */
    public C9885i mo32400j() {
        return this.f39720b.mo36635c();
    }

    /* renamed from: k */
    public C9885i mo32401k() {
        return this.f39720b.mo36634b();
    }

    /* renamed from: l */
    public int mo32402l(C9888l lVar) {
        C9885i c = this.f39719a.mo36611c(lVar);
        if (c == null) {
            return -1;
        }
        return this.f39720b.indexOf(c);
    }

    /* renamed from: q */
    public C9890n mo32403q(C9888l lVar) {
        C9885i c = this.f39719a.mo36611c(lVar);
        if (c == null) {
            return this;
        }
        return new C9890n(this.f39719a.mo36620o(lVar), this.f39720b.mo36644j(c));
    }

    public int size() {
        return this.f39719a.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<C9885i> it = iterator();
        boolean z = true;
        while (it.hasNext()) {
            C9885i next = it.next();
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(next);
        }
        sb.append("]");
        return sb.toString();
    }
}
