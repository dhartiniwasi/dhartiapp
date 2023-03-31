package p025c8;

import com.google.protobuf.C8153i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p211d8.C9888l;
import p220e8.C10009f;
import p220e8.C10010g;
import p238g8.C10294w0;
import p246h7.C10428q;
import p247h8.C10432b;
import p247h8.C10449g0;
import p247h8.C10472x;
import p320p7.C12130e;
import p404y7.C13073j;

/* renamed from: c8.u0 */
/* compiled from: MemoryMutationQueue */
final class C6825u0 implements C6837z0 {

    /* renamed from: a */
    private final List<C10010g> f31436a = new ArrayList();

    /* renamed from: b */
    private C12130e<C6786e> f31437b = new C12130e<>(Collections.emptyList(), C6786e.f31325c);

    /* renamed from: c */
    private int f31438c = 1;

    /* renamed from: d */
    private C8153i f31439d = C10294w0.f40882v;

    /* renamed from: e */
    private final C6828w0 f31440e;

    /* renamed from: f */
    private final C6823t0 f31441f;

    C6825u0(C6828w0 w0Var, C13073j jVar) {
        this.f31440e = w0Var;
        this.f31441f = w0Var.mo22742c(jVar);
    }

    /* renamed from: m */
    private int m39197m(int i) {
        if (this.f31436a.isEmpty()) {
            return 0;
        }
        return i - this.f31436a.get(0).mo32610e();
    }

    /* renamed from: n */
    private int m39198n(int i, String str) {
        int m = m39197m(i);
        C10432b.m52648d(m >= 0 && m < this.f31436a.size(), "Batches must exist to be %s", str);
        return m;
    }

    /* renamed from: p */
    private List<C10010g> m39199p(C12130e<Integer> eVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = eVar.iterator();
        while (it.hasNext()) {
            C10010g i = mo22890i(it.next().intValue());
            if (i != null) {
                arrayList.add(i);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo22882a(C10010g gVar, C8153i iVar) {
        int e = gVar.mo32610e();
        int n = m39198n(e, "acknowledged");
        C10432b.m52648d(n == 0, "Can only acknowledge the first batch in the mutation queue", new Object[0]);
        C10010g gVar2 = this.f31436a.get(n);
        C10432b.m52648d(e == gVar2.mo32610e(), "Queue ordering failure: expected batch %d, got batch %d", Integer.valueOf(e), Integer.valueOf(gVar2.mo32610e()));
        this.f31439d = (C8153i) C10472x.m52785b(iVar);
    }

    /* renamed from: b */
    public void mo22883b() {
        if (this.f31436a.isEmpty()) {
            C10432b.m52648d(this.f31437b.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty.", new Object[0]);
        }
    }

    /* renamed from: c */
    public void mo22884c(C10010g gVar) {
        C10432b.m52648d(m39198n(gVar.mo32610e(), "removed") == 0, "Can only remove the first entry of the mutation queue", new Object[0]);
        this.f31436a.remove(0);
        C12130e<C6786e> eVar = this.f31437b;
        for (C10009f g : gVar.mo32614h()) {
            C9888l g2 = g.mo32598g();
            this.f31440e.mo22745f().mo22796n(g2);
            eVar = eVar.mo36644j(new C6786e(g2, gVar.mo32610e()));
        }
        this.f31437b = eVar;
    }

    /* renamed from: d */
    public List<C10010g> mo22885d(Iterable<C9888l> iterable) {
        C12130e eVar = new C12130e(Collections.emptyList(), C10449g0.m52707g());
        for (C9888l next : iterable) {
            Iterator<C6786e> i = this.f31437b.mo36640i(new C6786e(next, 0));
            while (i.hasNext()) {
                C6786e next2 = i.next();
                if (!next.equals(next2.mo22780d())) {
                    break;
                }
                eVar = eVar.mo36638f(Integer.valueOf(next2.mo22779c()));
            }
        }
        return m39199p(eVar);
    }

    /* renamed from: e */
    public C10010g mo22886e(C10428q qVar, List<C10009f> list, List<C10009f> list2) {
        boolean z = true;
        C10432b.m52648d(!list2.isEmpty(), "Mutation batches should not be empty", new Object[0]);
        int i = this.f31438c;
        this.f31438c = i + 1;
        int size = this.f31436a.size();
        if (size > 0) {
            if (this.f31436a.get(size - 1).mo32610e() >= i) {
                z = false;
            }
            C10432b.m52648d(z, "Mutation batchIds must be monotonically increasing order", new Object[0]);
        }
        C10010g gVar = new C10010g(i, qVar, list, list2);
        this.f31436a.add(gVar);
        for (C10009f next : list2) {
            this.f31437b = this.f31437b.mo36638f(new C6786e(next.mo32598g(), i));
            this.f31441f.mo22735i(next.mo32598g().mo32388q());
        }
        return gVar;
    }

    /* renamed from: f */
    public void mo22887f(C8153i iVar) {
        this.f31439d = (C8153i) C10472x.m52785b(iVar);
    }

    /* renamed from: g */
    public C10010g mo22888g(int i) {
        int m = m39197m(i + 1);
        if (m < 0) {
            m = 0;
        }
        if (this.f31436a.size() > m) {
            return this.f31436a.get(m);
        }
        return null;
    }

    /* renamed from: h */
    public int mo22889h() {
        if (this.f31436a.isEmpty()) {
            return -1;
        }
        return this.f31438c - 1;
    }

    /* renamed from: i */
    public C10010g mo22890i(int i) {
        int m = m39197m(i);
        if (m < 0 || m >= this.f31436a.size()) {
            return null;
        }
        C10010g gVar = this.f31436a.get(m);
        C10432b.m52648d(gVar.mo32610e() == i, "If found batch must match", new Object[0]);
        return gVar;
    }

    /* renamed from: j */
    public C8153i mo22891j() {
        return this.f31439d;
    }

    /* renamed from: k */
    public List<C10010g> mo22892k() {
        return Collections.unmodifiableList(this.f31436a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo22900l(C9888l lVar) {
        Iterator<C6786e> i = this.f31437b.mo36640i(new C6786e(lVar, 0));
        if (!i.hasNext()) {
            return false;
        }
        return i.next().mo22780d().equals(lVar);
    }

    /* renamed from: o */
    public boolean mo22901o() {
        return this.f31436a.isEmpty();
    }

    public void start() {
        if (mo22901o()) {
            this.f31438c = 1;
        }
    }
}
