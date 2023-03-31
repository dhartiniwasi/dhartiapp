package com.google.firebase.firestore;

import android.app.Activity;
import com.google.firebase.firestore.C7942r;
import com.google.firebase.firestore.C7959y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p008a8.C6450a1;
import p008a8.C6452b1;
import p008a8.C6456d;
import p008a8.C6471h;
import p008a8.C6473i;
import p008a8.C6477l;
import p008a8.C6484p;
import p008a8.C6489q;
import p008a8.C6494r;
import p008a8.C6505w0;
import p008a8.C6514y1;
import p211d8.C9888l;
import p211d8.C9898r;
import p211d8.C9903u;
import p211d8.C9907y;
import p218e6.C9975i;
import p218e6.C9977j;
import p218e6.C9980l;
import p247h8.C10432b;
import p247h8.C10449g0;
import p247h8.C10460p;
import p247h8.C10472x;
import p405y8.C13085b;
import p405y8.C13088b0;

/* renamed from: com.google.firebase.firestore.o0 */
/* compiled from: Query */
public class C7929o0 {

    /* renamed from: a */
    final C6452b1 f34382a;

    /* renamed from: b */
    final FirebaseFirestore f34383b;

    /* renamed from: com.google.firebase.firestore.o0$a */
    /* compiled from: Query */
    static /* synthetic */ class C7930a {

        /* renamed from: a */
        static final /* synthetic */ int[] f34384a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                a8.q$b[] r0 = p008a8.C6489q.C6491b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f34384a = r0
                a8.q$b r1 = p008a8.C6489q.C6491b.NOT_EQUAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f34384a     // Catch:{ NoSuchFieldError -> 0x001d }
                a8.q$b r1 = p008a8.C6489q.C6491b.ARRAY_CONTAINS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f34384a     // Catch:{ NoSuchFieldError -> 0x0028 }
                a8.q$b r1 = p008a8.C6489q.C6491b.IN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f34384a     // Catch:{ NoSuchFieldError -> 0x0033 }
                a8.q$b r1 = p008a8.C6489q.C6491b.ARRAY_CONTAINS_ANY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f34384a     // Catch:{ NoSuchFieldError -> 0x003e }
                a8.q$b r1 = p008a8.C6489q.C6491b.NOT_IN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.C7929o0.C7930a.<clinit>():void");
        }
    }

    /* renamed from: com.google.firebase.firestore.o0$b */
    /* compiled from: Query */
    public enum C7931b {
        ASCENDING,
        DESCENDING
    }

    C7929o0(C6452b1 b1Var, FirebaseFirestore firebaseFirestore) {
        this.f34382a = (C6452b1) C10472x.m52785b(b1Var);
        this.f34383b = (FirebaseFirestore) C10472x.m52785b(firebaseFirestore);
    }

    /* renamed from: A */
    private C6494r m43783A(C7942r rVar) {
        boolean z = rVar instanceof C7942r.C7944b;
        C10432b.m52648d(z || (rVar instanceof C7942r.C7943a), "Parsing is only supported for Filter.UnaryFilter and Filter.CompositeFilter.", new Object[0]);
        if (z) {
            return m43805z((C7942r.C7944b) rVar);
        }
        return m43803x((C7942r.C7943a) rVar);
    }

    /* renamed from: D */
    private void m43784D(Object obj, C6489q.C6491b bVar) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() != 0) {
                if (list.size() > 10) {
                    throw new IllegalArgumentException("Invalid Query. '" + bVar.toString() + "' filters support a maximum of 10 elements in the value array.");
                }
                return;
            }
        }
        throw new IllegalArgumentException("Invalid Query. A non-empty array is required for '" + bVar.toString() + "' filters.");
    }

    /* renamed from: E */
    private void m43785E() {
        if (this.f34382a.mo21885l().equals(C6452b1.C6453a.LIMIT_TO_LAST) && this.f34382a.mo21880h().isEmpty()) {
            throw new IllegalStateException("limitToLast() queries require specifying at least one orderBy() clause");
        }
    }

    /* renamed from: F */
    private void m43786F(C6452b1 b1Var, C6489q qVar) {
        C6489q.C6491b h = qVar.mo22038h();
        if (qVar.mo22041j()) {
            C9898r q = b1Var.mo21890q();
            C9898r g = qVar.mo22037g();
            if (q == null || q.equals(g)) {
                C9898r j = b1Var.mo21883j();
                if (j != null) {
                    m43789I(j, g);
                }
            } else {
                throw new IllegalArgumentException(String.format("All where filters with an inequality (notEqualTo, notIn, lessThan, lessThanOrEqualTo, greaterThan, or greaterThanOrEqualTo) must be on the same field. But you have filters on '%s' and '%s'", new Object[]{q.mo32348c(), g.mo32348c()}));
            }
        }
        C6489q.C6491b l = m43796l(b1Var.mo21882i(), m43795h(h));
        if (l == null) {
            return;
        }
        if (l == h) {
            throw new IllegalArgumentException("Invalid Query. You cannot use more than one '" + h.toString() + "' filter.");
        }
        throw new IllegalArgumentException("Invalid Query. You cannot use '" + h.toString() + "' filters with '" + l.toString() + "' filters.");
    }

    /* renamed from: G */
    private void m43787G(C6494r rVar) {
        C6452b1 b1Var = this.f34382a;
        for (C6489q next : rVar.mo21991d()) {
            m43786F(b1Var, next);
            b1Var = b1Var.mo21876e(next);
        }
    }

    /* renamed from: H */
    private void m43788H(C9898r rVar) {
        C9898r q = this.f34382a.mo21890q();
        if (this.f34382a.mo21883j() == null && q != null) {
            m43789I(rVar, q);
        }
    }

    /* renamed from: I */
    private void m43789I(C9898r rVar, C9898r rVar2) {
        if (!rVar.equals(rVar2)) {
            String c = rVar2.mo32348c();
            throw new IllegalArgumentException(String.format("Invalid query. You have an inequality where filter (whereLessThan(), whereGreaterThan(), etc.) on field '%s' and so you must also have '%s' as your first orderBy() field, but your first orderBy() is currently on field '%s' instead.", new Object[]{c, c, rVar.mo32348c()}));
        }
    }

    /* renamed from: f */
    private C7904e0 m43793f(Executor executor, C6484p.C6485a aVar, Activity activity, C7926n<C7940q0> nVar) {
        m43785E();
        C6471h hVar = new C6471h(executor, new C7922l0(this, nVar));
        return C6456d.m37658c(activity, new C6505w0(this.f34383b.mo26305s(), this.f34383b.mo26305s().mo22024d0(this.f34382a, aVar, hVar), hVar));
    }

    /* renamed from: g */
    private C6473i m43794g(String str, Object[] objArr, boolean z) {
        List<C6450a1> h = this.f34382a.mo21880h();
        if (objArr.length <= h.size()) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < objArr.length; i++) {
                String str2 = objArr[i];
                if (!h.get(i).mo21865c().equals(C9898r.f39731b)) {
                    arrayList.add(this.f34383b.mo26308x().mo26491h(str2));
                } else if (str2 instanceof String) {
                    String str3 = str2;
                    if (this.f34382a.mo21891r() || !str3.contains("/")) {
                        C9903u uVar = (C9903u) this.f34382a.mo21887n().mo32346a(C9903u.m50784w(str3));
                        if (C9888l.m50699u(uVar)) {
                            arrayList.add(C9907y.m50803F(this.f34383b.mo26306t(), C9888l.m50697n(uVar)));
                        } else {
                            throw new IllegalArgumentException("Invalid query. When querying a collection group and ordering by FieldPath.documentId(), the value passed to " + str + "() must result in a valid document path, but '" + uVar + "' is not because it contains an odd number of segments.");
                        }
                    } else {
                        throw new IllegalArgumentException("Invalid query. When querying a collection and ordering by FieldPath.documentId(), the value passed to " + str + "() must be a plain document ID, but '" + str3 + "' contains a slash.");
                    }
                } else {
                    throw new IllegalArgumentException("Invalid query. Expected a string for document ID in " + str + "(), but got " + str2 + ".");
                }
            }
            return new C6473i(arrayList, z);
        }
        throw new IllegalArgumentException("Too many arguments provided to " + str + "(). The number of arguments must be less than or equal to the number of orderBy() clauses.");
    }

    /* renamed from: h */
    private List<C6489q.C6491b> m43795h(C6489q.C6491b bVar) {
        int i = C7930a.f34384a[bVar.ordinal()];
        if (i == 1) {
            return Arrays.asList(new C6489q.C6491b[]{C6489q.C6491b.NOT_EQUAL, C6489q.C6491b.NOT_IN});
        } else if (i == 2) {
            return Arrays.asList(new C6489q.C6491b[]{C6489q.C6491b.ARRAY_CONTAINS, C6489q.C6491b.ARRAY_CONTAINS_ANY, C6489q.C6491b.NOT_IN});
        } else if (i == 3) {
            return Arrays.asList(new C6489q.C6491b[]{C6489q.C6491b.ARRAY_CONTAINS_ANY, C6489q.C6491b.IN, C6489q.C6491b.NOT_IN});
        } else if (i == 4) {
            return Arrays.asList(new C6489q.C6491b[]{C6489q.C6491b.ARRAY_CONTAINS, C6489q.C6491b.ARRAY_CONTAINS_ANY, C6489q.C6491b.IN, C6489q.C6491b.NOT_IN});
        } else if (i != 5) {
            return new ArrayList();
        } else {
            return Arrays.asList(new C6489q.C6491b[]{C6489q.C6491b.ARRAY_CONTAINS, C6489q.C6491b.ARRAY_CONTAINS_ANY, C6489q.C6491b.IN, C6489q.C6491b.NOT_IN, C6489q.C6491b.NOT_EQUAL});
        }
    }

    /* renamed from: l */
    private C6489q.C6491b m43796l(List<C6494r> list, List<C6489q.C6491b> list2) {
        for (C6494r d : list) {
            Iterator<C6489q> it = d.mo21991d().iterator();
            while (true) {
                if (it.hasNext()) {
                    C6489q next = it.next();
                    if (list2.contains(next.mo22038h())) {
                        return next.mo22038h();
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: o */
    private C9975i<C7940q0> m43797o(C7951u0 u0Var) {
        C9977j jVar = new C9977j();
        C9977j jVar2 = new C9977j();
        C6484p.C6485a aVar = new C6484p.C6485a();
        aVar.f30819a = true;
        aVar.f30820b = true;
        aVar.f30821c = true;
        jVar2.mo32544c(m43793f(C10460p.f41438b, aVar, (Activity) null, new C7925m0(jVar, jVar2, u0Var)));
        return jVar.mo32542a();
    }

    /* renamed from: p */
    private static C6484p.C6485a m43798p(C7916i0 i0Var) {
        C6484p.C6485a aVar = new C6484p.C6485a();
        C7916i0 i0Var2 = C7916i0.INCLUDE;
        boolean z = true;
        aVar.f30819a = i0Var == i0Var2;
        if (i0Var != i0Var2) {
            z = false;
        }
        aVar.f30820b = z;
        aVar.f30821c = false;
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m43799q(C7926n nVar, C6514y1 y1Var, C7959y yVar) {
        if (yVar != null) {
            nVar.mo21951a(null, yVar);
            return;
        }
        C10432b.m52648d(y1Var != null, "Got event without value or error set", new Object[0]);
        nVar.mo21951a(new C7940q0(this, y1Var, this.f34383b), (C7959y) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ C7940q0 m43800r(C9975i iVar) throws Exception {
        return new C7940q0(new C7929o0(this.f34382a, this.f34383b), (C6514y1) iVar.mo26358m(), this.f34383b);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static /* synthetic */ void m43801s(C9977j jVar, C9977j jVar2, C7951u0 u0Var, C7940q0 q0Var, C7959y yVar) {
        if (yVar != null) {
            jVar.mo32543b(yVar);
            return;
        }
        try {
            ((C7904e0) C9980l.m51027a(jVar2.mo32542a())).remove();
            if (!q0Var.mo26442k().mo26457b() || u0Var != C7951u0.SERVER) {
                jVar.mo32544c(q0Var);
            } else {
                jVar.mo32543b(new C7959y("Failed to get documents from server. (However, these documents may exist in the local cache. Run again without setting source to SERVER to retrieve the cached documents.)", C7959y.C7960a.UNAVAILABLE));
            }
        } catch (ExecutionException e) {
            throw C10432b.m52646b(e, "Failed to register a listener for a query result", new Object[0]);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            throw C10432b.m52646b(e2, "Failed to register a listener for a query result", new Object[0]);
        }
    }

    /* renamed from: w */
    private C7929o0 m43802w(C9898r rVar, C7931b bVar) {
        C6450a1.C6451a aVar;
        C10472x.m52786c(bVar, "Provided direction must not be null.");
        if (this.f34382a.mo21888o() != null) {
            throw new IllegalArgumentException("Invalid query. You must not call Query.startAt() or Query.startAfter() before calling Query.orderBy().");
        } else if (this.f34382a.mo21879g() == null) {
            m43788H(rVar);
            if (bVar == C7931b.ASCENDING) {
                aVar = C6450a1.C6451a.ASCENDING;
            } else {
                aVar = C6450a1.C6451a.DESCENDING;
            }
            return new C7929o0(this.f34382a.mo21870B(C6450a1.m37613d(aVar, rVar)), this.f34383b);
        } else {
            throw new IllegalArgumentException("Invalid query. You must not call Query.endAt() or Query.endBefore() before calling Query.orderBy().");
        }
    }

    /* renamed from: x */
    private C6494r m43803x(C7942r.C7943a aVar) {
        ArrayList arrayList = new ArrayList();
        for (C7942r A : aVar.mo26447k()) {
            C6494r A2 = m43783A(A);
            if (!A2.mo21989b().isEmpty()) {
                arrayList.add(A2);
            }
        }
        if (arrayList.size() == 1) {
            return (C6494r) arrayList.get(0);
        }
        return new C6477l(arrayList, aVar.mo26448l());
    }

    /* renamed from: y */
    private C13088b0 m43804y(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.isEmpty()) {
                throw new IllegalArgumentException("Invalid query. When querying with FieldPath.documentId() you must provide a valid document ID, but it was an empty string.");
            } else if (this.f34382a.mo21891r() || !str.contains("/")) {
                C9903u uVar = (C9903u) this.f34382a.mo21887n().mo32346a(C9903u.m50784w(str));
                if (C9888l.m50699u(uVar)) {
                    return C9907y.m50803F(mo26424n().mo26306t(), C9888l.m50697n(uVar));
                }
                throw new IllegalArgumentException("Invalid query. When querying a collection group by FieldPath.documentId(), the value provided must result in a valid document path, but '" + uVar + "' is not because it has an odd number of segments (" + uVar.mo32358r() + ").");
            } else {
                throw new IllegalArgumentException("Invalid query. When querying a collection by FieldPath.documentId() you must provide a plain document ID, but '" + str + "' contains a '/' character.");
            }
        } else if (obj instanceof C7921l) {
            return C9907y.m50803F(mo26424n().mo26306t(), ((C7921l) obj).mo26390l());
        } else {
            throw new IllegalArgumentException("Invalid query. When querying with FieldPath.documentId() you must provide a valid String or DocumentReference, but it was of type: " + C10449g0.m52699B(obj));
        }
    }

    /* renamed from: z */
    private C6489q m43805z(C7942r.C7944b bVar) {
        C13088b0 b0Var;
        C7932p k = bVar.mo26449k();
        C6489q.C6491b l = bVar.mo26450l();
        Object m = bVar.mo26451m();
        C10472x.m52786c(k, "Provided field path must not be null.");
        C10472x.m52786c(l, "Provided op must not be null.");
        if (!k.mo26428c().mo32415y()) {
            C6489q.C6491b bVar2 = C6489q.C6491b.IN;
            if (l == bVar2 || l == C6489q.C6491b.NOT_IN || l == C6489q.C6491b.ARRAY_CONTAINS_ANY) {
                m43784D(m, l);
            }
            b0Var = this.f34383b.mo26308x().mo26492i(m, l == bVar2 || l == C6489q.C6491b.NOT_IN);
        } else if (l == C6489q.C6491b.ARRAY_CONTAINS || l == C6489q.C6491b.ARRAY_CONTAINS_ANY) {
            throw new IllegalArgumentException("Invalid query. You can't perform '" + l.toString() + "' queries on FieldPath.documentId().");
        } else if (l == C6489q.C6491b.IN || l == C6489q.C6491b.NOT_IN) {
            m43784D(m, l);
            C13085b.C13087b k0 = C13085b.m61455k0();
            for (Object y : (List) m) {
                k0.mo38108E(m43804y(y));
            }
            b0Var = (C13088b0) C13088b0.m61490y0().mo38124E(k0).build();
        } else {
            b0Var = m43804y(m);
        }
        return C6489q.m37894f(k.mo26428c(), l, b0Var);
    }

    /* renamed from: B */
    public C7929o0 mo26403B(Object... objArr) {
        return new C7929o0(this.f34382a.mo21871C(m43794g("startAfter", objArr, false)), this.f34383b);
    }

    /* renamed from: C */
    public C7929o0 mo26404C(Object... objArr) {
        return new C7929o0(this.f34382a.mo21871C(m43794g("startAt", objArr, true)), this.f34383b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public C7929o0 mo26405J(C7942r rVar) {
        C6494r A = m43783A(rVar);
        if (A.mo21989b().isEmpty()) {
            return this;
        }
        m43787G(A);
        return new C7929o0(this.f34382a.mo21876e(A), this.f34383b);
    }

    /* renamed from: K */
    public C7929o0 mo26406K(C7932p pVar, Object obj) {
        return mo26405J(C7942r.m43858a(pVar, obj));
    }

    /* renamed from: L */
    public C7929o0 mo26407L(C7932p pVar, List<? extends Object> list) {
        return mo26405J(C7942r.m43859b(pVar, list));
    }

    /* renamed from: M */
    public C7929o0 mo26408M(C7932p pVar, Object obj) {
        return mo26405J(C7942r.m43860c(pVar, obj));
    }

    /* renamed from: N */
    public C7929o0 mo26409N(C7932p pVar, Object obj) {
        return mo26405J(C7942r.m43861d(pVar, obj));
    }

    /* renamed from: O */
    public C7929o0 mo26410O(C7932p pVar, Object obj) {
        return mo26405J(C7942r.m43862e(pVar, obj));
    }

    /* renamed from: P */
    public C7929o0 mo26411P(C7932p pVar, List<? extends Object> list) {
        return mo26405J(C7942r.m43863f(pVar, list));
    }

    /* renamed from: Q */
    public C7929o0 mo26412Q(C7932p pVar, Object obj) {
        return mo26405J(C7942r.m43864g(pVar, obj));
    }

    /* renamed from: R */
    public C7929o0 mo26413R(C7932p pVar, Object obj) {
        return mo26405J(C7942r.m43865h(pVar, obj));
    }

    /* renamed from: S */
    public C7929o0 mo26414S(C7932p pVar, Object obj) {
        return mo26405J(C7942r.m43866i(pVar, obj));
    }

    /* renamed from: T */
    public C7929o0 mo26415T(C7932p pVar, List<? extends Object> list) {
        return mo26405J(C7942r.m43867j(pVar, list));
    }

    /* renamed from: d */
    public C7904e0 mo26416d(C7916i0 i0Var, C7926n<C7940q0> nVar) {
        return mo26417e(C10460p.f41437a, i0Var, nVar);
    }

    /* renamed from: e */
    public C7904e0 mo26417e(Executor executor, C7916i0 i0Var, C7926n<C7940q0> nVar) {
        C10472x.m52786c(executor, "Provided executor must not be null.");
        C10472x.m52786c(i0Var, "Provided MetadataChanges value must not be null.");
        C10472x.m52786c(nVar, "Provided EventListener must not be null.");
        return m43793f(executor, m43798p(i0Var), (Activity) null, nVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7929o0)) {
            return false;
        }
        C7929o0 o0Var = (C7929o0) obj;
        if (!this.f34382a.equals(o0Var.f34382a) || !this.f34383b.equals(o0Var.f34383b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f34382a.hashCode() * 31) + this.f34383b.hashCode();
    }

    /* renamed from: i */
    public C7896b mo26420i() {
        return new C7896b(this);
    }

    /* renamed from: j */
    public C7929o0 mo26421j(Object... objArr) {
        return new C7929o0(this.f34382a.mo21875d(m43794g("endAt", objArr, true)), this.f34383b);
    }

    /* renamed from: k */
    public C7929o0 mo26422k(Object... objArr) {
        return new C7929o0(this.f34382a.mo21875d(m43794g("endBefore", objArr, false)), this.f34383b);
    }

    /* renamed from: m */
    public C9975i<C7940q0> mo26423m(C7951u0 u0Var) {
        m43785E();
        if (u0Var == C7951u0.CACHE) {
            return this.f34383b.mo26305s().mo22021C(this.f34382a).mo26354i(C10460p.f41438b, new C7927n0(this));
        }
        return m43797o(u0Var);
    }

    /* renamed from: n */
    public FirebaseFirestore mo26424n() {
        return this.f34383b;
    }

    /* renamed from: t */
    public C7929o0 mo26425t(long j) {
        if (j > 0) {
            return new C7929o0(this.f34382a.mo21893t(j), this.f34383b);
        }
        throw new IllegalArgumentException("Invalid Query. Query limit (" + j + ") is invalid. Limit must be positive.");
    }

    /* renamed from: u */
    public C7929o0 mo26426u(long j) {
        if (j > 0) {
            return new C7929o0(this.f34382a.mo21895u(j), this.f34383b);
        }
        throw new IllegalArgumentException("Invalid Query. Query limitToLast (" + j + ") is invalid. Limit must be positive.");
    }

    /* renamed from: v */
    public C7929o0 mo26427v(C7932p pVar, C7931b bVar) {
        C10472x.m52786c(pVar, "Provided field path must not be null.");
        return m43802w(pVar.mo26428c(), bVar);
    }
}
