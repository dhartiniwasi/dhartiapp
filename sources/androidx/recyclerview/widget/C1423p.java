package androidx.recyclerview.widget;

import androidx.core.util.C0828e;
import androidx.core.util.C0829f;
import androidx.recyclerview.widget.RecyclerView;
import p124r.C5418d;
import p124r.C5426g;

/* renamed from: androidx.recyclerview.widget.p */
/* compiled from: ViewInfoStore */
class C1423p {

    /* renamed from: a */
    final C5426g<RecyclerView.C1336d0, C1424a> f4055a = new C5426g<>();

    /* renamed from: b */
    final C5418d<RecyclerView.C1336d0> f4056b = new C5418d<>();

    /* renamed from: androidx.recyclerview.widget.p$a */
    /* compiled from: ViewInfoStore */
    static class C1424a {

        /* renamed from: d */
        static C0828e<C1424a> f4057d = new C0829f(20);

        /* renamed from: a */
        int f4058a;

        /* renamed from: b */
        RecyclerView.C1344l.C1347c f4059b;

        /* renamed from: c */
        RecyclerView.C1344l.C1347c f4060c;

        private C1424a() {
        }

        /* renamed from: a */
        static void m6723a() {
            do {
            } while (f4057d.mo3226b() != null);
        }

        /* renamed from: b */
        static C1424a m6724b() {
            C1424a b = f4057d.mo3226b();
            return b == null ? new C1424a() : b;
        }

        /* renamed from: c */
        static void m6725c(C1424a aVar) {
            aVar.f4058a = 0;
            aVar.f4059b = null;
            aVar.f4060c = null;
            f4057d.mo3225a(aVar);
        }
    }

    /* renamed from: androidx.recyclerview.widget.p$b */
    /* compiled from: ViewInfoStore */
    interface C1425b {
        /* renamed from: a */
        void mo4996a(RecyclerView.C1336d0 d0Var);

        /* renamed from: b */
        void mo4997b(RecyclerView.C1336d0 d0Var, RecyclerView.C1344l.C1347c cVar, RecyclerView.C1344l.C1347c cVar2);

        /* renamed from: c */
        void mo4998c(RecyclerView.C1336d0 d0Var, RecyclerView.C1344l.C1347c cVar, RecyclerView.C1344l.C1347c cVar2);

        /* renamed from: d */
        void mo4999d(RecyclerView.C1336d0 d0Var, RecyclerView.C1344l.C1347c cVar, RecyclerView.C1344l.C1347c cVar2);
    }

    C1423p() {
    }

    /* renamed from: l */
    private RecyclerView.C1344l.C1347c m6706l(RecyclerView.C1336d0 d0Var, int i) {
        C1424a n;
        RecyclerView.C1344l.C1347c cVar;
        int g = this.f4055a.mo19661g(d0Var);
        if (g >= 0 && (n = this.f4055a.mo19672n(g)) != null) {
            int i2 = n.f4058a;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                n.f4058a = i3;
                if (i == 4) {
                    cVar = n.f4059b;
                } else if (i == 8) {
                    cVar = n.f4060c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.f4055a.mo19670l(g);
                    C1424a.m6725c(n);
                }
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5536a(RecyclerView.C1336d0 d0Var, RecyclerView.C1344l.C1347c cVar) {
        C1424a aVar = this.f4055a.get(d0Var);
        if (aVar == null) {
            aVar = C1424a.m6724b();
            this.f4055a.put(d0Var, aVar);
        }
        aVar.f4058a |= 2;
        aVar.f4059b = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5537b(RecyclerView.C1336d0 d0Var) {
        C1424a aVar = this.f4055a.get(d0Var);
        if (aVar == null) {
            aVar = C1424a.m6724b();
            this.f4055a.put(d0Var, aVar);
        }
        aVar.f4058a |= 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo5538c(long j, RecyclerView.C1336d0 d0Var) {
        this.f4056b.mo19578i(j, d0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo5539d(RecyclerView.C1336d0 d0Var, RecyclerView.C1344l.C1347c cVar) {
        C1424a aVar = this.f4055a.get(d0Var);
        if (aVar == null) {
            aVar = C1424a.m6724b();
            this.f4055a.put(d0Var, aVar);
        }
        aVar.f4060c = cVar;
        aVar.f4058a |= 8;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo5540e(RecyclerView.C1336d0 d0Var, RecyclerView.C1344l.C1347c cVar) {
        C1424a aVar = this.f4055a.get(d0Var);
        if (aVar == null) {
            aVar = C1424a.m6724b();
            this.f4055a.put(d0Var, aVar);
        }
        aVar.f4059b = cVar;
        aVar.f4058a |= 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo5541f() {
        this.f4055a.clear();
        this.f4056b.mo19571b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public RecyclerView.C1336d0 mo5542g(long j) {
        return this.f4056b.mo19574e(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo5543h(RecyclerView.C1336d0 d0Var) {
        C1424a aVar = this.f4055a.get(d0Var);
        if (aVar == null || (aVar.f4058a & 1) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo5544i(RecyclerView.C1336d0 d0Var) {
        C1424a aVar = this.f4055a.get(d0Var);
        return (aVar == null || (aVar.f4058a & 4) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo5545j() {
        C1424a.m6723a();
    }

    /* renamed from: k */
    public void mo5546k(RecyclerView.C1336d0 d0Var) {
        mo5550p(d0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public RecyclerView.C1344l.C1347c mo5547m(RecyclerView.C1336d0 d0Var) {
        return m6706l(d0Var, 8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public RecyclerView.C1344l.C1347c mo5548n(RecyclerView.C1336d0 d0Var) {
        return m6706l(d0Var, 4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo5549o(C1425b bVar) {
        for (int size = this.f4055a.size() - 1; size >= 0; size--) {
            RecyclerView.C1336d0 j = this.f4055a.mo19668j(size);
            C1424a l = this.f4055a.mo19670l(size);
            int i = l.f4058a;
            if ((i & 3) == 3) {
                bVar.mo4996a(j);
            } else if ((i & 1) != 0) {
                RecyclerView.C1344l.C1347c cVar = l.f4059b;
                if (cVar == null) {
                    bVar.mo4996a(j);
                } else {
                    bVar.mo4998c(j, cVar, l.f4060c);
                }
            } else if ((i & 14) == 14) {
                bVar.mo4997b(j, l.f4059b, l.f4060c);
            } else if ((i & 12) == 12) {
                bVar.mo4999d(j, l.f4059b, l.f4060c);
            } else if ((i & 4) != 0) {
                bVar.mo4998c(j, l.f4059b, (RecyclerView.C1344l.C1347c) null);
            } else if ((i & 8) != 0) {
                bVar.mo4997b(j, l.f4059b, l.f4060c);
            }
            C1424a.m6725c(l);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo5550p(RecyclerView.C1336d0 d0Var) {
        C1424a aVar = this.f4055a.get(d0Var);
        if (aVar != null) {
            aVar.f4058a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo5551q(RecyclerView.C1336d0 d0Var) {
        int l = this.f4056b.mo19581l() - 1;
        while (true) {
            if (l < 0) {
                break;
            } else if (d0Var == this.f4056b.mo19582m(l)) {
                this.f4056b.mo19580k(l);
                break;
            } else {
                l--;
            }
        }
        C1424a remove = this.f4055a.remove(d0Var);
        if (remove != null) {
            C1424a.m6725c(remove);
        }
    }
}
