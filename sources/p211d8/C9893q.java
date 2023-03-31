package p211d8;

import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p246h7.C10428q;

@AutoValue
/* renamed from: d8.q */
/* compiled from: FieldIndex */
public abstract class C9893q {

    /* renamed from: a */
    public static C9895b f39723a = C9895b.m50733a(0, C9894a.f39725a);

    /* renamed from: b */
    public static final Comparator<C9893q> f39724b = C9891o.f39721a;

    @AutoValue
    /* renamed from: d8.q$a */
    /* compiled from: FieldIndex */
    public static abstract class C9894a implements Comparable<C9894a> {

        /* renamed from: a */
        public static final C9894a f39725a = m50725c(C9905w.f39751b, C9888l.m50694c(), -1);

        /* renamed from: b */
        public static final Comparator<C9899s> f39726b = C9892p.f39722a;

        /* renamed from: c */
        public static C9894a m50725c(C9905w wVar, C9888l lVar, int i) {
            return new C9878b(wVar, lVar, i);
        }

        /* renamed from: j */
        public static C9894a m50726j(C9905w wVar, int i) {
            C10428q qVar;
            long c = wVar.mo32439b().mo33499c();
            int b = wVar.mo32439b().mo33498b() + 1;
            if (((double) b) == 1.0E9d) {
                qVar = new C10428q(c + 1, 0);
            } else {
                qVar = new C10428q(c, b);
            }
            return m50725c(new C9905w(qVar), C9888l.m50694c(), i);
        }

        /* renamed from: k */
        public static C9894a m50727k(C9885i iVar) {
            return m50725c(iVar.mo32375f(), iVar.getKey(), -1);
        }

        /* renamed from: b */
        public int compareTo(C9894a aVar) {
            int a = mo32334p().compareTo(aVar.mo32334p());
            if (a != 0) {
                return a;
            }
            int b = mo32332n().compareTo(aVar.mo32332n());
            if (b != 0) {
                return b;
            }
            return Integer.compare(mo32333o(), aVar.mo32333o());
        }

        /* renamed from: n */
        public abstract C9888l mo32332n();

        /* renamed from: o */
        public abstract int mo32333o();

        /* renamed from: p */
        public abstract C9905w mo32334p();
    }

    @AutoValue
    /* renamed from: d8.q$b */
    /* compiled from: FieldIndex */
    public static abstract class C9895b {
        /* renamed from: a */
        public static C9895b m50733a(long j, C9894a aVar) {
            return new C9879c(j, aVar);
        }

        /* renamed from: b */
        public static C9895b m50734b(long j, C9905w wVar, C9888l lVar, int i) {
            return m50733a(j, C9894a.m50725c(wVar, lVar, i));
        }

        /* renamed from: c */
        public abstract C9894a mo32336c();

        /* renamed from: d */
        public abstract long mo32337d();
    }

    @AutoValue
    /* renamed from: d8.q$c */
    /* compiled from: FieldIndex */
    public static abstract class C9896c implements Comparable<C9896c> {

        /* renamed from: d8.q$c$a */
        /* compiled from: FieldIndex */
        public enum C9897a {
            ASCENDING,
            DESCENDING,
            CONTAINS
        }

        /* renamed from: b */
        public static C9896c m50737b(C9898r rVar, C9897a aVar) {
            return new C9880d(rVar, aVar);
        }

        /* renamed from: a */
        public int compareTo(C9896c cVar) {
            int j = mo32341c().compareTo(cVar.mo32341c());
            if (j != 0) {
                return j;
            }
            return mo32344j().compareTo(cVar.mo32344j());
        }

        /* renamed from: c */
        public abstract C9898r mo32341c();

        /* renamed from: j */
        public abstract C9897a mo32344j();
    }

    /* renamed from: b */
    public static C9893q m50716b(int i, String str, List<C9896c> list, C9895b bVar) {
        return new C9877a(i, str, list, bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ int m50717i(C9893q qVar, C9893q qVar2) {
        int compareTo = qVar.mo32323d().compareTo(qVar2.mo32323d());
        if (compareTo != 0) {
            return compareTo;
        }
        Iterator<C9896c> it = qVar.mo32327h().iterator();
        Iterator<C9896c> it2 = qVar2.mo32327h().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int a = it.next().compareTo(it2.next());
            if (a != 0) {
                return a;
            }
        }
        return Boolean.compare(it.hasNext(), it2.hasNext());
    }

    /* renamed from: c */
    public C9896c mo32408c() {
        for (C9896c next : mo32327h()) {
            if (next.mo32344j().equals(C9896c.C9897a.CONTAINS)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: d */
    public abstract String mo32323d();

    /* renamed from: e */
    public List<C9896c> mo32409e() {
        ArrayList arrayList = new ArrayList();
        for (C9896c next : mo32327h()) {
            if (!next.mo32344j().equals(C9896c.C9897a.CONTAINS)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public abstract int mo32325f();

    /* renamed from: g */
    public abstract C9895b mo32326g();

    /* renamed from: h */
    public abstract List<C9896c> mo32327h();
}
