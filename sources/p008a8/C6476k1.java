package p008a8;

import com.google.firebase.firestore.C7959y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p211d8.C9888l;
import p211d8.C9899s;
import p211d8.C9905w;
import p218e6.C9975i;
import p218e6.C9980l;
import p220e8.C10006c;
import p220e8.C10009f;
import p220e8.C10016m;
import p220e8.C10020q;
import p238g8.C10256n;
import p247h8.C10432b;
import p247h8.C10460p;

/* renamed from: a8.k1 */
/* compiled from: Transaction */
public class C6476k1 {

    /* renamed from: g */
    private static final Executor f30783g = m37769d();

    /* renamed from: a */
    private final C10256n f30784a;

    /* renamed from: b */
    private final HashMap<C9888l, C9905w> f30785b = new HashMap<>();

    /* renamed from: c */
    private final ArrayList<C10009f> f30786c = new ArrayList<>();

    /* renamed from: d */
    private boolean f30787d;

    /* renamed from: e */
    private C7959y f30788e;

    /* renamed from: f */
    private Set<C9888l> f30789f = new HashSet();

    public C6476k1(C10256n nVar) {
        this.f30784a = nVar;
    }

    /* renamed from: d */
    private static Executor m37769d() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, (long) 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: f */
    private void m37770f() {
        C10432b.m52648d(!this.f30787d, "A transaction object cannot be used after its update callback has been invoked.", new Object[0]);
    }

    /* renamed from: g */
    public static Executor m37771g() {
        return f30783g;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ C9975i m37772h(C9975i iVar) throws Exception {
        if (iVar.mo26362q()) {
            return C9980l.m51031e(null);
        }
        return C9980l.m51030d(iVar.mo26357l());
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ C9975i m37773i(C9975i iVar) throws Exception {
        if (iVar.mo26362q()) {
            for (C9899s m : (List) iVar.mo26358m()) {
                m37776m(m);
            }
        }
        return iVar;
    }

    /* renamed from: k */
    private C10016m m37774k(C9888l lVar) {
        C9905w wVar = this.f30785b.get(lVar);
        if (this.f30789f.contains(lVar) || wVar == null) {
            return C10016m.f39979c;
        }
        if (wVar.equals(C9905w.f39751b)) {
            return C10016m.m51148a(false);
        }
        return C10016m.m51149f(wVar);
    }

    /* renamed from: l */
    private C10016m m37775l(C9888l lVar) throws C7959y {
        C9905w wVar = this.f30785b.get(lVar);
        if (this.f30789f.contains(lVar) || wVar == null) {
            return C10016m.m51148a(true);
        }
        if (!wVar.equals(C9905w.f39751b)) {
            return C10016m.m51149f(wVar);
        }
        throw new C7959y("Can't update a document that doesn't exist.", C7959y.C7960a.INVALID_ARGUMENT);
    }

    /* renamed from: m */
    private void m37776m(C9899s sVar) throws C7959y {
        C9905w wVar;
        if (sVar.mo32371b()) {
            wVar = sVar.mo32381j();
        } else if (sVar.mo32379h()) {
            wVar = C9905w.f39751b;
        } else {
            throw C10432b.m52645a("Unexpected document type in transaction: " + sVar, new Object[0]);
        }
        if (!this.f30785b.containsKey(sVar.getKey())) {
            this.f30785b.put(sVar.getKey(), wVar);
        } else if (!this.f30785b.get(sVar.getKey()).equals(sVar.mo32381j())) {
            throw new C7959y("Document version changed between two reads.", C7959y.C7960a.ABORTED);
        }
    }

    /* renamed from: p */
    private void m37777p(List<C10009f> list) {
        m37770f();
        this.f30786c.addAll(list);
    }

    /* renamed from: c */
    public C9975i<Void> mo21983c() {
        m37770f();
        C7959y yVar = this.f30788e;
        if (yVar != null) {
            return C9980l.m51030d(yVar);
        }
        HashSet hashSet = new HashSet(this.f30785b.keySet());
        Iterator<C10009f> it = this.f30786c.iterator();
        while (it.hasNext()) {
            hashSet.remove(it.next().mo32598g());
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            C9888l lVar = (C9888l) it2.next();
            this.f30786c.add(new C10020q(lVar, m37774k(lVar)));
        }
        this.f30787d = true;
        return this.f30784a.mo33000e(this.f30786c).mo26356k(C10460p.f41438b, C0134j1.f299a);
    }

    /* renamed from: e */
    public void mo21984e(C9888l lVar) {
        m37777p(Collections.singletonList(new C10006c(lVar, m37774k(lVar))));
        this.f30789f.add(lVar);
    }

    /* renamed from: j */
    public C9975i<List<C9899s>> mo21985j(List<C9888l> list) {
        m37770f();
        if (this.f30786c.size() != 0) {
            return C9980l.m51030d(new C7959y("Firestore transactions require all reads to be executed before all writes.", C7959y.C7960a.INVALID_ARGUMENT));
        }
        return this.f30784a.mo33004o(list).mo26356k(C10460p.f41438b, new C0132i1(this));
    }

    /* renamed from: n */
    public void mo21986n(C9888l lVar, C6498s1 s1Var) {
        m37777p(Collections.singletonList(s1Var.mo22064a(lVar, m37774k(lVar))));
        this.f30789f.add(lVar);
    }

    /* renamed from: o */
    public void mo21987o(C9888l lVar, C6500t1 t1Var) {
        try {
            m37777p(Collections.singletonList(t1Var.mo22065a(lVar, m37775l(lVar))));
        } catch (C7959y e) {
            this.f30788e = e;
        }
        this.f30789f.add(lVar);
    }
}
