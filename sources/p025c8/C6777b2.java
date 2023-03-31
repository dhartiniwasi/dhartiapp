package p025c8;

import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import com.google.protobuf.C8135e0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.SortedSet;
import java.util.TreeSet;
import p008a8.C6450a1;
import p008a8.C6469g1;
import p008a8.C6473i;
import p008a8.C6477l;
import p008a8.C6489q;
import p008a8.C6494r;
import p025c8.C6805l;
import p025c8.C6823t0;
import p025c8.C6831x2;
import p191b8.C6717c;
import p191b8.C6719d;
import p191b8.C6722e;
import p211d8.C9885i;
import p211d8.C9888l;
import p211d8.C9893q;
import p211d8.C9898r;
import p211d8.C9903u;
import p211d8.C9906x;
import p211d8.C9907y;
import p247h8.C10432b;
import p247h8.C10449g0;
import p247h8.C10468v;
import p247h8.C10471w;
import p320p7.C12126c;
import p387w8.C12923a;
import p404y7.C13073j;
import p405y8.C13088b0;

/* renamed from: c8.b2 */
/* compiled from: SQLiteIndexManager */
final class C6777b2 implements C6805l {

    /* renamed from: k */
    private static final String f31297k = "b2";

    /* renamed from: l */
    private static final byte[] f31298l = new byte[0];

    /* renamed from: a */
    private final C6831x2 f31299a;

    /* renamed from: b */
    private final C6810o f31300b;

    /* renamed from: c */
    private final String f31301c;

    /* renamed from: d */
    private final Map<C6469g1, List<C6469g1>> f31302d = new HashMap();

    /* renamed from: e */
    private final C6823t0.C6824a f31303e = new C6823t0.C6824a();

    /* renamed from: f */
    private final Map<String, Map<Integer, C9893q>> f31304f = new HashMap();

    /* renamed from: g */
    private final Queue<C9893q> f31305g = new PriorityQueue(10, C1879a2.f5502a);

    /* renamed from: h */
    private boolean f31306h = false;

    /* renamed from: i */
    private int f31307i = -1;

    /* renamed from: j */
    private long f31308j = -1;

    C6777b2(C6831x2 x2Var, C6810o oVar, C13073j jVar) {
        this.f31299a = x2Var;
        this.f31300b = oVar;
        this.f31301c = jVar.mo38099b() ? jVar.mo38098a() : "";
    }

    /* renamed from: A */
    private byte[] m38728A(C13088b0 b0Var) {
        C6719d dVar = new C6719d();
        C6717c.f31213a.mo22622e(b0Var, dVar.mo22623b(C9893q.C9896c.C9897a.ASCENDING));
        return dVar.mo22624c();
    }

    /* renamed from: B */
    private Object[] m38729B(C9893q qVar, C6469g1 g1Var, Collection<C13088b0> collection) {
        if (collection == null) {
            return null;
        }
        List<C6719d> arrayList = new ArrayList<>();
        arrayList.add(new C6719d());
        Iterator<C13088b0> it = collection.iterator();
        for (C9893q.C9896c next : qVar.mo32409e()) {
            C13088b0 next2 = it.next();
            for (C6719d dVar : arrayList) {
                if (!m38738L(g1Var, next.mo32341c()) || !C9907y.m50825t(next2)) {
                    C6717c.f31213a.mo22622e(next2, dVar.mo22623b(next.mo32344j()));
                } else {
                    arrayList = m38730C(arrayList, next, next2);
                }
            }
        }
        return m38733F(arrayList);
    }

    /* renamed from: C */
    private List<C6719d> m38730C(List<C6719d> list, C9893q.C9896c cVar, C13088b0 b0Var) {
        ArrayList<C6719d> arrayList = new ArrayList<>(list);
        ArrayList arrayList2 = new ArrayList();
        for (C13088b0 next : b0Var.mo38112m0().mo38104g()) {
            for (C6719d c : arrayList) {
                C6719d dVar = new C6719d();
                dVar.mo22625d(c.mo22624c());
                C6717c.f31213a.mo22622e(next, dVar.mo22623b(cVar.mo32344j()));
                arrayList2.add(dVar);
            }
        }
        return arrayList2;
    }

    /* renamed from: D */
    private Object[] m38731D(int i, int i2, List<C13088b0> list, Object[] objArr, Object[] objArr2, Object[] objArr3) {
        byte[] bArr;
        int size = i / (list != null ? list.size() : 1);
        int i3 = 0;
        Object[] objArr4 = new Object[((i * 5) + (objArr3 != null ? objArr3.length : 0))];
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            int i6 = i5 + 1;
            objArr4[i5] = Integer.valueOf(i2);
            int i7 = i6 + 1;
            objArr4[i6] = this.f31301c;
            int i8 = i7 + 1;
            if (list != null) {
                bArr = m38728A(list.get(i4 / size));
            } else {
                bArr = f31298l;
            }
            objArr4[i7] = bArr;
            int i9 = i8 + 1;
            int i10 = i4 % size;
            objArr4[i8] = objArr[i10];
            objArr4[i9] = objArr2[i10];
            i4++;
            i5 = i9 + 1;
        }
        if (objArr3 != null) {
            int length = objArr3.length;
            while (i3 < length) {
                objArr4[i5] = objArr3[i3];
                i3++;
                i5++;
            }
        }
        return objArr4;
    }

    /* renamed from: E */
    private Object[] m38732E(C6469g1 g1Var, int i, List<C13088b0> list, Object[] objArr, String str, Object[] objArr2, String str2, Object[] objArr3) {
        StringBuilder sb;
        Object[] objArr4 = objArr3;
        int max = Math.max(objArr.length, objArr2.length) * (list != null ? list.size() : 1);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT document_key, directional_value FROM index_entries ");
        sb2.append("WHERE index_id = ? AND uid = ? ");
        sb2.append("AND array_value = ? ");
        sb2.append("AND directional_value ");
        String str3 = str;
        sb2.append(str);
        sb2.append(" ? ");
        sb2.append("AND directional_value ");
        String str4 = str2;
        sb2.append(str2);
        sb2.append(" ? ");
        StringBuilder z = C10449g0.m52726z(sb2, max, " UNION ");
        if (objArr4 != null) {
            StringBuilder sb3 = new StringBuilder("SELECT document_key, directional_value FROM (");
            sb3.append(z);
            sb3.append(") WHERE directional_value NOT IN (");
            sb3.append(C10449g0.m52726z("?", objArr4.length, ", "));
            sb3.append(")");
            sb = sb3;
        } else {
            sb = z;
        }
        Object[] D = m38731D(max, i, list, objArr, objArr2, objArr3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(sb.toString());
        arrayList.addAll(Arrays.asList(D));
        return arrayList.toArray();
    }

    /* renamed from: F */
    private Object[] m38733F(List<C6719d> list) {
        Object[] objArr = new Object[list.size()];
        for (int i = 0; i < list.size(); i++) {
            objArr[i] = list.get(i).mo22624c();
        }
        return objArr;
    }

    /* renamed from: G */
    private SortedSet<C6722e> m38734G(C9888l lVar, C9893q qVar) {
        TreeSet treeSet = new TreeSet();
        this.f31299a.mo22912E("SELECT array_value, directional_value FROM index_entries WHERE index_id = ? AND document_key = ? AND uid = ?").mo22929b(Integer.valueOf(qVar.mo32325f()), lVar.toString(), this.f31301c).mo22932e(new C1966z1(treeSet, qVar, lVar));
        return treeSet;
    }

    /* renamed from: H */
    private C9893q m38735H(C6469g1 g1Var) {
        String str;
        C10432b.m52648d(this.f31306h, "IndexManager not started", new Object[0]);
        C9906x xVar = new C9906x(g1Var);
        if (g1Var.mo21934d() != null) {
            str = g1Var.mo21934d();
        } else {
            str = g1Var.mo21944n().mo32354n();
        }
        Collection<C9893q> I = mo22726I(str);
        C9893q qVar = null;
        if (I.isEmpty()) {
            return null;
        }
        for (C9893q next : I) {
            if (xVar.mo32444d(next) && (qVar == null || next.mo32327h().size() > qVar.mo32327h().size())) {
                qVar = next;
            }
        }
        return qVar;
    }

    /* renamed from: J */
    private C9893q.C9894a m38736J(Collection<C9893q> collection) {
        C10432b.m52648d(!collection.isEmpty(), "Found empty index group when looking for least recent index offset.", new Object[0]);
        Iterator<C9893q> it = collection.iterator();
        C9893q.C9894a c = it.next().mo32326g().mo32336c();
        int o = c.mo32333o();
        while (it.hasNext()) {
            C9893q.C9894a c2 = it.next().mo32326g().mo32336c();
            if (c2.compareTo(c) < 0) {
                c = c2;
            }
            o = Math.max(c2.mo32333o(), o);
        }
        return C9893q.C9894a.m50725c(c.mo32334p(), c.mo32332n(), o);
    }

    /* renamed from: K */
    private List<C6469g1> m38737K(C6469g1 g1Var) {
        if (this.f31302d.containsKey(g1Var)) {
            return this.f31302d.get(g1Var);
        }
        ArrayList arrayList = new ArrayList();
        if (g1Var.mo21937h().isEmpty()) {
            arrayList.add(g1Var);
        } else {
            for (C6494r b : C10471w.m52779i(new C6477l(g1Var.mo21937h(), C6477l.C6478a.AND))) {
                arrayList.add(new C6469g1(g1Var.mo21944n(), g1Var.mo21934d(), b.mo21989b(), g1Var.mo21943m(), g1Var.mo21940j(), g1Var.mo21946p(), g1Var.mo21936f()));
            }
        }
        this.f31302d.put(g1Var, arrayList);
        return arrayList;
    }

    /* renamed from: L */
    private boolean m38738L(C6469g1 g1Var, C9898r rVar) {
        for (C6494r next : g1Var.mo21937h()) {
            if (next instanceof C6489q) {
                C6489q qVar = (C6489q) next;
                if (qVar.mo22037g().equals(rVar)) {
                    C6489q.C6491b h = qVar.mo22038h();
                    if (h.equals(C6489q.C6491b.IN) || h.equals(C6489q.C6491b.NOT_IN)) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public static /* synthetic */ int m38742P(C9893q qVar, C9893q qVar2) {
        int compare = Long.compare(qVar.mo32326g().mo32337d(), qVar2.mo32326g().mo32337d());
        return compare == 0 ? qVar.mo32323d().compareTo(qVar2.mo32323d()) : compare;
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ void m38744R(Map map, Cursor cursor) {
        C9893q.C9895b bVar;
        try {
            int i = cursor.getInt(0);
            String string = cursor.getString(1);
            List<C9893q.C9896c> c = this.f31300b.mo22862c(C12923a.m61060h0(cursor.getBlob(2)));
            if (map.containsKey(Integer.valueOf(i))) {
                bVar = (C9893q.C9895b) map.get(Integer.valueOf(i));
            } else {
                bVar = C9893q.f39723a;
            }
            m38747U(C9893q.m50716b(i, string, c, bVar));
        } catch (C8135e0 e) {
            throw C10432b.m52645a("Failed to decode index: " + e, new Object[0]);
        }
    }

    /* renamed from: U */
    private void m38747U(C9893q qVar) {
        Map map = this.f31304f.get(qVar.mo32323d());
        if (map == null) {
            map = new HashMap();
            this.f31304f.put(qVar.mo32323d(), map);
        }
        C9893q qVar2 = (C9893q) map.get(Integer.valueOf(qVar.mo32325f()));
        if (qVar2 != null) {
            this.f31305g.remove(qVar2);
        }
        map.put(Integer.valueOf(qVar.mo32325f()), qVar);
        this.f31305g.add(qVar);
        this.f31307i = Math.max(this.f31307i, qVar.mo32325f());
        this.f31308j = Math.max(this.f31308j, qVar.mo32326g().mo32337d());
    }

    /* renamed from: V */
    private void m38748V(C9885i iVar, SortedSet<C6722e> sortedSet, SortedSet<C6722e> sortedSet2) {
        C10468v.m52767a(f31297k, "Updating index entries for document '%s'", iVar.getKey());
        C10449g0.m52719s(sortedSet, sortedSet2, new C1949u1(this, iVar), new C1945t1(this, iVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m38745S(C9885i iVar, C6722e eVar) {
        this.f31299a.mo22914v("INSERT INTO index_entries (index_id, uid, array_value, directional_value, document_key) VALUES(?, ?, ?, ?, ?)", Integer.valueOf(eVar.mo22615n()), this.f31301c, eVar.mo22610c(), eVar.mo22613j(), iVar.getKey().toString());
    }

    /* renamed from: v */
    private SortedSet<C6722e> m38758v(C9885i iVar, C9893q qVar) {
        TreeSet treeSet = new TreeSet();
        byte[] y = m38761y(qVar, iVar);
        if (y == null) {
            return treeSet;
        }
        C9893q.C9896c c = qVar.mo32408c();
        if (c != null) {
            C13088b0 g = iVar.mo32376g(c.mo32341c());
            if (C9907y.m50825t(g)) {
                for (C13088b0 A : g.mo38112m0().mo38104g()) {
                    treeSet.add(C6722e.m38594b(qVar.mo32325f(), iVar.getKey(), m38728A(A), y));
                }
            }
        } else {
            treeSet.add(C6722e.m38594b(qVar.mo32325f(), iVar.getKey(), new byte[0], y));
        }
        return treeSet;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m38746T(C9885i iVar, C6722e eVar) {
        this.f31299a.mo22914v("DELETE FROM index_entries WHERE index_id = ? AND uid = ? AND array_value = ? AND directional_value = ? AND document_key = ?", Integer.valueOf(eVar.mo22615n()), this.f31301c, eVar.mo22610c(), eVar.mo22613j(), iVar.getKey().toString());
    }

    /* renamed from: x */
    private Object[] m38760x(C9893q qVar, C6469g1 g1Var, C6473i iVar) {
        return m38729B(qVar, g1Var, iVar.mo21954b());
    }

    /* renamed from: y */
    private byte[] m38761y(C9893q qVar, C9885i iVar) {
        C6719d dVar = new C6719d();
        for (C9893q.C9896c next : qVar.mo32409e()) {
            C13088b0 g = iVar.mo32376g(next.mo32341c());
            if (g == null) {
                return null;
            }
            C6717c.f31213a.mo22622e(g, dVar.mo22623b(next.mo32344j()));
        }
        return dVar.mo22624c();
    }

    /* renamed from: z */
    private byte[] m38762z(C9893q qVar) {
        return this.f31300b.mo22868l(qVar.mo32327h()).mo26773h();
    }

    /* renamed from: I */
    public Collection<C9893q> mo22726I(String str) {
        C10432b.m52648d(this.f31306h, "IndexManager not started", new Object[0]);
        Map map = this.f31304f.get(str);
        return map == null ? Collections.emptyList() : map.values();
    }

    /* renamed from: a */
    public void mo22727a(C9893q qVar) {
        this.f31299a.mo22914v("DELETE FROM index_configuration WHERE index_id = ?", Integer.valueOf(qVar.mo32325f()));
        this.f31299a.mo22914v("DELETE FROM index_entries WHERE index_id = ?", Integer.valueOf(qVar.mo32325f()));
        this.f31299a.mo22914v("DELETE FROM index_state WHERE index_id = ?", Integer.valueOf(qVar.mo32325f()));
        this.f31305g.remove(qVar);
        Map map = this.f31304f.get(qVar.mo32323d());
        if (map != null) {
            map.remove(Integer.valueOf(qVar.mo32325f()));
        }
    }

    /* renamed from: b */
    public void mo22728b(C12126c<C9888l, C9885i> cVar) {
        C10432b.m52648d(this.f31306h, "IndexManager not started", new Object[0]);
        Iterator<Map.Entry<C9888l, C9885i>> it = cVar.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            for (C9893q next2 : mo22726I(((C9888l) next.getKey()).mo32387p())) {
                SortedSet<C6722e> G = m38734G((C9888l) next.getKey(), next2);
                SortedSet<C6722e> v = m38758v((C9885i) next.getValue(), next2);
                if (!G.equals(v)) {
                    m38748V((C9885i) next.getValue(), G, v);
                }
            }
        }
    }

    /* renamed from: c */
    public List<C9888l> mo22729c(C6469g1 g1Var) {
        C10432b.m52648d(this.f31306h, "IndexManager not started", new Object[0]);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<Pair> arrayList3 = new ArrayList<>();
        for (C6469g1 next : m38737K(g1Var)) {
            C9893q H = m38735H(next);
            if (H == null) {
                return null;
            }
            arrayList3.add(Pair.create(next, H));
        }
        for (Pair pair : arrayList3) {
            C6469g1 g1Var2 = (C6469g1) pair.first;
            C9893q qVar = (C9893q) pair.second;
            List<C13088b0> a = g1Var2.mo21932a(qVar);
            Collection<C13088b0> l = g1Var2.mo21942l(qVar);
            C6473i k = g1Var2.mo21941k(qVar);
            C6473i q = g1Var2.mo21947q(qVar);
            if (C10468v.m52769c()) {
                C10468v.m52767a(f31297k, "Using index '%s' to execute '%s' (Arrays: %s, Lower bound: %s, Upper bound: %s)", qVar, g1Var2, a, k, q);
            }
            Object[] E = m38732E(g1Var2, qVar.mo32325f(), a, m38760x(qVar, g1Var2, k), k.mo21955c() ? ">=" : ">", m38760x(qVar, g1Var2, q), q.mo21955c() ? "<=" : "<", m38729B(qVar, g1Var2, l));
            arrayList.add(String.valueOf(E[0]));
            arrayList2.addAll(Arrays.asList(E).subList(1, E.length));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.join(" UNION ", arrayList));
        sb.append("ORDER BY directional_value, document_key ");
        sb.append(g1Var.mo21939i().equals(C6450a1.C6451a.ASCENDING) ? "asc " : "desc ");
        String str = "SELECT DISTINCT document_key FROM (" + sb.toString() + ")";
        if (g1Var.mo21948r()) {
            str = str + " LIMIT " + g1Var.mo21940j();
        }
        C10432b.m52648d(arrayList2.size() < 1000, "Cannot perform query with more than 999 bind elements", new Object[0]);
        C6831x2.C6835d b = this.f31299a.mo22912E(str).mo22929b(arrayList2.toArray());
        ArrayList arrayList4 = new ArrayList();
        b.mo22932e(new C1959x1(arrayList4));
        C10468v.m52767a(f31297k, "Index scan returned %s documents", Integer.valueOf(arrayList4.size()));
        return arrayList4;
    }

    /* renamed from: d */
    public Collection<C9893q> mo22730d() {
        ArrayList arrayList = new ArrayList();
        for (Map<Integer, C9893q> values : this.f31304f.values()) {
            arrayList.addAll(values.values());
        }
        return arrayList;
    }

    /* renamed from: e */
    public String mo22731e() {
        C10432b.m52648d(this.f31306h, "IndexManager not started", new Object[0]);
        C9893q peek = this.f31305g.peek();
        if (peek != null) {
            return peek.mo32323d();
        }
        return null;
    }

    /* renamed from: f */
    public void mo22732f(C9893q qVar) {
        C10432b.m52648d(this.f31306h, "IndexManager not started", new Object[0]);
        int i = this.f31307i + 1;
        C9893q b = C9893q.m50716b(i, qVar.mo32323d(), qVar.mo32327h(), qVar.mo32326g());
        this.f31299a.mo22914v("INSERT INTO index_configuration (index_id, collection_group, index_proto) VALUES(?, ?, ?)", Integer.valueOf(i), b.mo32323d(), m38762z(b));
        m38747U(b);
    }

    /* renamed from: g */
    public List<C9903u> mo22733g(String str) {
        C10432b.m52648d(this.f31306h, "IndexManager not started", new Object[0]);
        ArrayList arrayList = new ArrayList();
        this.f31299a.mo22912E("SELECT parent FROM collection_parents WHERE collection_id = ?").mo22929b(str).mo22932e(new C1956w1(arrayList));
        return arrayList;
    }

    /* renamed from: h */
    public C6805l.C6806a mo22734h(C6469g1 g1Var) {
        C6805l.C6806a aVar = C6805l.C6806a.FULL;
        List<C6469g1> K = m38737K(g1Var);
        Iterator<C6469g1> it = K.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C6469g1 next = it.next();
            C9893q H = m38735H(next);
            if (H == null) {
                aVar = C6805l.C6806a.NONE;
                break;
            } else if (H.mo32327h().size() < next.mo21945o()) {
                aVar = C6805l.C6806a.PARTIAL;
            }
        }
        return (!g1Var.mo21948r() || K.size() <= 1 || aVar != C6805l.C6806a.FULL) ? aVar : C6805l.C6806a.PARTIAL;
    }

    /* renamed from: i */
    public void mo22735i(C9903u uVar) {
        C10432b.m52648d(this.f31306h, "IndexManager not started", new Object[0]);
        C10432b.m52648d(uVar.mo32358r() % 2 == 1, "Expected a collection path.", new Object[0]);
        if (this.f31303e.mo22898a(uVar)) {
            this.f31299a.mo22914v("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)", uVar.mo32354n(), C6789f.m38862c((C9903u) uVar.mo32360t()));
        }
    }

    /* renamed from: j */
    public C9893q.C9894a mo22736j(String str) {
        Collection<C9893q> I = mo22726I(str);
        C10432b.m52648d(!I.isEmpty(), "minOffset was called for collection without indexes", new Object[0]);
        return m38736J(I);
    }

    /* renamed from: k */
    public void mo22737k(String str, C9893q.C9894a aVar) {
        C10432b.m52648d(this.f31306h, "IndexManager not started", new Object[0]);
        this.f31308j++;
        for (C9893q next : mo22726I(str)) {
            C9893q b = C9893q.m50716b(next.mo32325f(), next.mo32323d(), next.mo32327h(), C9893q.C9895b.m50733a(this.f31308j, aVar));
            this.f31299a.mo22914v("REPLACE INTO index_state (index_id, uid,  sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id) VALUES(?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(next.mo32325f()), this.f31301c, Long.valueOf(this.f31308j), Long.valueOf(aVar.mo32334p().mo32439b().mo33499c()), Integer.valueOf(aVar.mo32334p().mo32439b().mo33498b()), C6789f.m38862c(aVar.mo32332n().mo32390s()), Integer.valueOf(aVar.mo32333o()));
            m38747U(b);
        }
    }

    /* renamed from: l */
    public C9893q.C9894a mo22738l(C6469g1 g1Var) {
        ArrayList arrayList = new ArrayList();
        for (C6469g1 H : m38737K(g1Var)) {
            C9893q H2 = m38735H(H);
            if (H2 != null) {
                arrayList.add(H2);
            }
        }
        return m38736J(arrayList);
    }

    public void start() {
        HashMap hashMap = new HashMap();
        this.f31299a.mo22912E("SELECT index_id, sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id FROM index_state WHERE uid = ?").mo22929b(this.f31301c).mo22932e(new C1962y1(hashMap));
        this.f31299a.mo22912E("SELECT index_id, collection_group, index_proto FROM index_configuration").mo22932e(new C1952v1(this, hashMap));
        this.f31306h = true;
    }
}
