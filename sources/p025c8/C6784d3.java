package p025c8;

import android.database.Cursor;
import com.google.protobuf.C8135e0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p008a8.C6452b1;
import p025c8.C6831x2;
import p211d8.C9885i;
import p211d8.C9886j;
import p211d8.C9888l;
import p211d8.C9893q;
import p211d8.C9899s;
import p211d8.C9903u;
import p211d8.C9905w;
import p229f8.C10144a;
import p246h7.C10428q;
import p247h8.C10432b;
import p247h8.C10449g0;
import p247h8.C10455m;
import p247h8.C10460p;
import p247h8.C10466t;
import p320p7.C12126c;

/* renamed from: c8.d3 */
/* compiled from: SQLiteRemoteDocumentCache */
final class C6784d3 implements C6799i1 {

    /* renamed from: a */
    private final C6831x2 f31322a;

    /* renamed from: b */
    private final C6810o f31323b;

    /* renamed from: c */
    private C6805l f31324c;

    C6784d3(C6831x2 x2Var, C6810o oVar) {
        this.f31322a = x2Var;
        this.f31323b = oVar;
    }

    /* renamed from: k */
    private C9899s m38831k(byte[] bArr, int i, int i2) {
        try {
            return this.f31323b.mo22863d(C10144a.m51480l0(bArr)).mo32425u(new C9905w(new C10428q((long) i, i2)));
        } catch (C8135e0 e) {
            throw C10432b.m52645a("MaybeDocument failed to parse: %s", e);
        }
    }

    /* renamed from: l */
    private Map<C9888l, C9899s> m38832l(List<C9903u> list, C9893q.C9894a aVar, int i, C10466t<C9899s, Boolean> tVar) {
        C10428q b = aVar.mo32334p().mo32439b();
        C9888l n = aVar.mo32332n();
        StringBuilder z = C10449g0.m52726z("SELECT contents, read_time_seconds, read_time_nanos, path FROM remote_documents WHERE path >= ? AND path < ? AND path_length = ? AND (read_time_seconds > ? OR ( read_time_seconds = ? AND read_time_nanos > ?) OR ( read_time_seconds = ? AND read_time_nanos = ? and path > ?)) ", list.size(), " UNION ");
        z.append("ORDER BY read_time_seconds, read_time_nanos, path LIMIT ?");
        Object[] objArr = new Object[((list.size() * 9) + 1)];
        int i2 = 0;
        for (C9903u next : list) {
            String c = C6789f.m38862c(next);
            int i3 = i2 + 1;
            objArr[i2] = c;
            int i4 = i3 + 1;
            objArr[i3] = C6789f.m38865f(c);
            int i5 = i4 + 1;
            objArr[i4] = Integer.valueOf(next.mo32358r() + 1);
            int i6 = i5 + 1;
            objArr[i5] = Long.valueOf(b.mo33499c());
            int i7 = i6 + 1;
            objArr[i6] = Long.valueOf(b.mo33499c());
            int i8 = i7 + 1;
            objArr[i7] = Integer.valueOf(b.mo33498b());
            int i9 = i8 + 1;
            objArr[i8] = Long.valueOf(b.mo33499c());
            int i10 = i9 + 1;
            objArr[i9] = Integer.valueOf(b.mo33498b());
            objArr[i10] = C6789f.m38862c(n.mo32390s());
            i2 = i10 + 1;
        }
        objArr[i2] = Integer.valueOf(i);
        C10455m mVar = new C10455m();
        HashMap hashMap = new HashMap();
        this.f31322a.mo22912E(z.toString()).mo22929b(objArr).mo22932e(new C1880a3(this, mVar, hashMap, tVar));
        mVar.mo33539c();
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m38833m(C10455m mVar, Map map, Cursor cursor) {
        m38834n(mVar, map, cursor, (C10466t<C9899s, Boolean>) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ Boolean m38835o(C6452b1 b1Var, Set set, C9899s sVar) {
        return Boolean.valueOf(b1Var.mo21896v(sVar) || set.contains(sVar.getKey()));
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m38836p(byte[] bArr, int i, int i2, C10466t tVar, Map map) {
        C9899s k = m38831k(bArr, i, i2);
        if (tVar == null || ((Boolean) tVar.apply(k)).booleanValue()) {
            synchronized (map) {
                map.put(k.getKey(), k);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m38834n(C10455m mVar, Map<C9888l, C9899s> map, Cursor cursor, C10466t<C9899s, Boolean> tVar) {
        byte[] blob = cursor.getBlob(0);
        int i = cursor.getInt(1);
        int i2 = cursor.getInt(2);
        Executor executor = mVar;
        if (cursor.isLast()) {
            executor = C10460p.f41438b;
        }
        executor.execute(new C1888c3(this, blob, i, i2, tVar, map));
    }

    /* renamed from: a */
    public Map<C9888l, C9899s> mo22770a(C6452b1 b1Var, C9893q.C9894a aVar, Set<C9888l> set) {
        return m38832l(Collections.singletonList(b1Var.mo21887n()), aVar, Integer.MAX_VALUE, new C1883b3(b1Var, set));
    }

    /* renamed from: b */
    public void mo22771b(C9899s sVar, C9905w wVar) {
        C10432b.m52648d(!wVar.equals(C9905w.f39751b), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        C9888l key = sVar.getKey();
        C10428q b = wVar.mo32439b();
        C10144a m = this.f31323b.mo22869m(sVar);
        this.f31322a.mo22914v("INSERT OR REPLACE INTO remote_documents (path, path_length, read_time_seconds, read_time_nanos, contents) VALUES (?, ?, ?, ?, ?)", C6789f.m38862c(key.mo32390s()), Integer.valueOf(key.mo32390s().mo32358r()), Long.valueOf(b.mo33499c()), Integer.valueOf(b.mo33498b()), m.mo26773h());
        this.f31324c.mo22735i(sVar.getKey().mo32388q());
    }

    /* renamed from: c */
    public Map<C9888l, C9899s> mo22772c(Iterable<C9888l> iterable) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (C9888l next : iterable) {
            arrayList.add(C6789f.m38862c(next.mo32390s()));
            hashMap.put(next, C9899s.m50750p(next));
        }
        C6831x2.C6833b bVar = new C6831x2.C6833b(this.f31322a, "SELECT contents, read_time_seconds, read_time_nanos FROM remote_documents WHERE path IN (", arrayList, ") ORDER BY path");
        C10455m mVar = new C10455m();
        while (bVar.mo22922d()) {
            bVar.mo22923e().mo22932e(new C1967z2(this, mVar, hashMap));
        }
        mVar.mo33539c();
        return hashMap;
    }

    /* renamed from: d */
    public Map<C9888l, C9899s> mo22773d(String str, C9893q.C9894a aVar, int i) {
        List<C9903u> g = this.f31324c.mo22733g(str);
        ArrayList arrayList = new ArrayList(g.size());
        for (C9903u b : g) {
            arrayList.add((C9903u) b.mo32347b(str));
        }
        if (arrayList.isEmpty()) {
            return Collections.emptyMap();
        }
        if (arrayList.size() * 9 < 900) {
            return m38832l(arrayList, aVar, i, (C10466t<C9899s, Boolean>) null);
        }
        HashMap hashMap = new HashMap();
        int i2 = 0;
        while (i2 < arrayList.size()) {
            int i3 = i2 + 100;
            hashMap.putAll(m38832l(arrayList.subList(i2, Math.min(arrayList.size(), i3)), aVar, i, (C10466t<C9899s, Boolean>) null));
            i2 = i3;
        }
        return C10449g0.m52721u(hashMap, i, C9893q.C9894a.f39726b);
    }

    /* renamed from: e */
    public void mo22774e(C6805l lVar) {
        this.f31324c = lVar;
    }

    /* renamed from: f */
    public C9899s mo22775f(C9888l lVar) {
        return mo22772c(Collections.singletonList(lVar)).get(lVar);
    }

    public void removeAll(Collection<C9888l> collection) {
        if (!collection.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            C12126c<C9888l, C9885i> a = C9886j.m50690a();
            for (C9888l next : collection) {
                arrayList.add(C6789f.m38862c(next.mo32390s()));
                a = a.mo36618k(next, C9899s.m50751q(next, C9905w.f39751b));
            }
            C6831x2.C6833b bVar = new C6831x2.C6833b(this.f31322a, "DELETE FROM remote_documents WHERE path IN (", arrayList, ")");
            while (bVar.mo22922d()) {
                bVar.mo22920a();
            }
            this.f31324c.mo22728b(a);
        }
    }
}
