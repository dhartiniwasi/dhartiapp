package p025c8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p182a7.C6444t;
import p211d8.C9885i;
import p211d8.C9888l;
import p211d8.C9893q;
import p247h8.C10442g;
import p247h8.C10468v;

/* renamed from: c8.k */
/* compiled from: IndexBackfiller */
public class C6802k {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final long f31372f = TimeUnit.SECONDS.toMillis(15);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final long f31373g = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: a */
    private final C6803a f31374a;

    /* renamed from: b */
    private final C6778c1 f31375b;

    /* renamed from: c */
    private final C6444t<C6805l> f31376c;

    /* renamed from: d */
    private final C6444t<C6809n> f31377d;

    /* renamed from: e */
    private int f31378e;

    /* renamed from: c8.k$a */
    /* compiled from: IndexBackfiller */
    public class C6803a implements C6785d4 {

        /* renamed from: a */
        private C10442g.C10444b f31379a;

        /* renamed from: b */
        private final C10442g f31380b;

        public C6803a(C10442g gVar) {
            this.f31380b = gVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m39013b() {
            C10468v.m52767a("IndexBackfiller", "Documents written: %s", Integer.valueOf(C6802k.this.mo22850d()));
            m39014c(C6802k.f31373g);
        }

        /* renamed from: c */
        private void m39014c(long j) {
            this.f31379a = this.f31380b.mo33520k(C10442g.C10448d.INDEX_BACKFILL, j, new C1908j(this));
        }

        public void start() {
            m39014c(C6802k.f31372f);
        }

        public void stop() {
            C10442g.C10444b bVar = this.f31379a;
            if (bVar != null) {
                bVar.mo33528c();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C6802k(C6778c1 c1Var, C10442g gVar, C6795i0 i0Var) {
        this(c1Var, gVar, new C1897g(i0Var), new C1901h(i0Var));
        Objects.requireNonNull(i0Var);
    }

    /* renamed from: e */
    private C9893q.C9894a m39006e(C9893q.C9894a aVar, C6808m mVar) {
        Iterator<Map.Entry<C9888l, C9885i>> it = mVar.mo22853c().iterator();
        C9893q.C9894a aVar2 = aVar;
        while (it.hasNext()) {
            C9893q.C9894a k = C9893q.C9894a.m50727k((C9885i) it.next().getValue());
            if (k.compareTo(aVar2) > 0) {
                aVar2 = k;
            }
        }
        return C9893q.C9894a.m50725c(aVar2.mo32334p(), aVar2.mo32332n(), Math.max(mVar.mo22852b(), aVar.mo32333o()));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ Integer m39007g() {
        return Integer.valueOf(m39009i());
    }

    /* renamed from: h */
    private int m39008h(String str, int i) {
        C6805l lVar = this.f31376c.get();
        C9893q.C9894a j = lVar.mo22736j(str);
        C6808m j2 = this.f31377d.get().mo22858j(str, j, i);
        lVar.mo22728b(j2.mo22853c());
        C9893q.C9894a e = m39006e(j, j2);
        C10468v.m52767a("IndexBackfiller", "Updating offset: %s", e);
        lVar.mo22737k(str, e);
        return j2.mo22853c().size();
    }

    /* renamed from: i */
    private int m39009i() {
        C6805l lVar = this.f31376c.get();
        HashSet hashSet = new HashSet();
        int i = this.f31378e;
        while (i > 0) {
            String e = lVar.mo22731e();
            if (e == null || hashSet.contains(e)) {
                break;
            }
            C10468v.m52767a("IndexBackfiller", "Processing collection: %s", e);
            i -= m39008h(e, i);
            hashSet.add(e);
        }
        return this.f31378e - i;
    }

    /* renamed from: d */
    public int mo22850d() {
        return ((Integer) this.f31375b.mo22749j("Backfill Indexes", new C1905i(this))).intValue();
    }

    /* renamed from: f */
    public C6803a mo22851f() {
        return this.f31374a;
    }

    public C6802k(C6778c1 c1Var, C10442g gVar, C6444t<C6805l> tVar, C6444t<C6809n> tVar2) {
        this.f31378e = 50;
        this.f31375b = c1Var;
        this.f31374a = new C6803a(gVar);
        this.f31376c = tVar;
        this.f31377d = tVar2;
    }
}
