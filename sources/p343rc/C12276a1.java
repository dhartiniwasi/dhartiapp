package p343rc;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p182a7.C6419h;
import p182a7.C6425j;
import p182a7.C6431n;

/* renamed from: rc.a1 */
/* compiled from: NameResolver */
public abstract class C12276a1 {

    /* renamed from: rc.a1$a */
    /* compiled from: NameResolver */
    class C12277a extends C12282e {

        /* renamed from: a */
        final /* synthetic */ C12283f f45498a;

        C12277a(C12283f fVar) {
            this.f45498a = fVar;
        }

        /* renamed from: b */
        public void mo35130b(C12335j1 j1Var) {
            this.f45498a.mo35130b(j1Var);
        }

        /* renamed from: c */
        public void mo35131c(C12284g gVar) {
            this.f45498a.mo36944a(gVar.mo36945a(), gVar.mo36946b());
        }
    }

    /* renamed from: rc.a1$b */
    /* compiled from: NameResolver */
    public static final class C12278b {

        /* renamed from: a */
        private final int f45500a;

        /* renamed from: b */
        private final C12322g1 f45501b;

        /* renamed from: c */
        private final C12359n1 f45502c;

        /* renamed from: d */
        private final C12286h f45503d;

        /* renamed from: e */
        private final ScheduledExecutorService f45504e;

        /* renamed from: f */
        private final C12312f f45505f;

        /* renamed from: g */
        private final Executor f45506g;

        /* renamed from: h */
        private final String f45507h;

        /* renamed from: rc.a1$b$a */
        /* compiled from: NameResolver */
        public static final class C12279a {

            /* renamed from: a */
            private Integer f45508a;

            /* renamed from: b */
            private C12322g1 f45509b;

            /* renamed from: c */
            private C12359n1 f45510c;

            /* renamed from: d */
            private C12286h f45511d;

            /* renamed from: e */
            private ScheduledExecutorService f45512e;

            /* renamed from: f */
            private C12312f f45513f;

            /* renamed from: g */
            private Executor f45514g;

            /* renamed from: h */
            private String f45515h;

            C12279a() {
            }

            /* renamed from: a */
            public C12278b mo36930a() {
                return new C12278b(this.f45508a, this.f45509b, this.f45510c, this.f45511d, this.f45512e, this.f45513f, this.f45514g, this.f45515h, (C12277a) null);
            }

            /* renamed from: b */
            public C12279a mo36931b(C12312f fVar) {
                this.f45513f = (C12312f) C6431n.m37561n(fVar);
                return this;
            }

            /* renamed from: c */
            public C12279a mo36932c(int i) {
                this.f45508a = Integer.valueOf(i);
                return this;
            }

            /* renamed from: d */
            public C12279a mo36933d(Executor executor) {
                this.f45514g = executor;
                return this;
            }

            /* renamed from: e */
            public C12279a mo36934e(String str) {
                this.f45515h = str;
                return this;
            }

            /* renamed from: f */
            public C12279a mo36935f(C12322g1 g1Var) {
                this.f45509b = (C12322g1) C6431n.m37561n(g1Var);
                return this;
            }

            /* renamed from: g */
            public C12279a mo36936g(ScheduledExecutorService scheduledExecutorService) {
                this.f45512e = (ScheduledExecutorService) C6431n.m37561n(scheduledExecutorService);
                return this;
            }

            /* renamed from: h */
            public C12279a mo36937h(C12286h hVar) {
                this.f45511d = (C12286h) C6431n.m37561n(hVar);
                return this;
            }

            /* renamed from: i */
            public C12279a mo36938i(C12359n1 n1Var) {
                this.f45510c = (C12359n1) C6431n.m37561n(n1Var);
                return this;
            }
        }

        /* synthetic */ C12278b(Integer num, C12322g1 g1Var, C12359n1 n1Var, C12286h hVar, ScheduledExecutorService scheduledExecutorService, C12312f fVar, Executor executor, String str, C12277a aVar) {
            this(num, g1Var, n1Var, hVar, scheduledExecutorService, fVar, executor, str);
        }

        /* renamed from: f */
        public static C12279a m58948f() {
            return new C12279a();
        }

        /* renamed from: a */
        public int mo36924a() {
            return this.f45500a;
        }

        /* renamed from: b */
        public Executor mo36925b() {
            return this.f45506g;
        }

        /* renamed from: c */
        public C12322g1 mo36926c() {
            return this.f45501b;
        }

        /* renamed from: d */
        public C12286h mo36927d() {
            return this.f45503d;
        }

        /* renamed from: e */
        public C12359n1 mo36928e() {
            return this.f45502c;
        }

        public String toString() {
            return C6419h.m37528c(this).mo21840b("defaultPort", this.f45500a).mo21842d("proxyDetector", this.f45501b).mo21842d("syncContext", this.f45502c).mo21842d("serviceConfigParser", this.f45503d).mo21842d("scheduledExecutorService", this.f45504e).mo21842d("channelLogger", this.f45505f).mo21842d("executor", this.f45506g).mo21842d("overrideAuthority", this.f45507h).toString();
        }

        private C12278b(Integer num, C12322g1 g1Var, C12359n1 n1Var, C12286h hVar, ScheduledExecutorService scheduledExecutorService, C12312f fVar, Executor executor, String str) {
            this.f45500a = ((Integer) C6431n.m37562o(num, "defaultPort not set")).intValue();
            this.f45501b = (C12322g1) C6431n.m37562o(g1Var, "proxyDetector not set");
            this.f45502c = (C12359n1) C6431n.m37562o(n1Var, "syncContext not set");
            this.f45503d = (C12286h) C6431n.m37562o(hVar, "serviceConfigParser not set");
            this.f45504e = scheduledExecutorService;
            this.f45505f = fVar;
            this.f45506g = executor;
            this.f45507h = str;
        }
    }

    /* renamed from: rc.a1$d */
    /* compiled from: NameResolver */
    public static abstract class C12281d {
        /* renamed from: a */
        public abstract String mo35026a();

        /* renamed from: b */
        public abstract C12276a1 mo35027b(URI uri, C12278b bVar);
    }

    /* renamed from: rc.a1$e */
    /* compiled from: NameResolver */
    public static abstract class C12282e implements C12283f {
        @Deprecated
        /* renamed from: a */
        public final void mo36944a(List<C12406x> list, C12271a aVar) {
            mo35131c(C12284g.m58974d().mo36952b(list).mo36953c(aVar).mo36951a());
        }

        /* renamed from: b */
        public abstract void mo35130b(C12335j1 j1Var);

        /* renamed from: c */
        public abstract void mo35131c(C12284g gVar);
    }

    /* renamed from: rc.a1$f */
    /* compiled from: NameResolver */
    public interface C12283f {
        /* renamed from: a */
        void mo36944a(List<C12406x> list, C12271a aVar);

        /* renamed from: b */
        void mo35130b(C12335j1 j1Var);
    }

    /* renamed from: rc.a1$g */
    /* compiled from: NameResolver */
    public static final class C12284g {

        /* renamed from: a */
        private final List<C12406x> f45518a;

        /* renamed from: b */
        private final C12271a f45519b;

        /* renamed from: c */
        private final C12280c f45520c;

        /* renamed from: rc.a1$g$a */
        /* compiled from: NameResolver */
        public static final class C12285a {

            /* renamed from: a */
            private List<C12406x> f45521a = Collections.emptyList();

            /* renamed from: b */
            private C12271a f45522b = C12271a.f45491c;

            /* renamed from: c */
            private C12280c f45523c;

            C12285a() {
            }

            /* renamed from: a */
            public C12284g mo36951a() {
                return new C12284g(this.f45521a, this.f45522b, this.f45523c);
            }

            /* renamed from: b */
            public C12285a mo36952b(List<C12406x> list) {
                this.f45521a = list;
                return this;
            }

            /* renamed from: c */
            public C12285a mo36953c(C12271a aVar) {
                this.f45522b = aVar;
                return this;
            }

            /* renamed from: d */
            public C12285a mo36954d(C12280c cVar) {
                this.f45523c = cVar;
                return this;
            }
        }

        C12284g(List<C12406x> list, C12271a aVar, C12280c cVar) {
            this.f45518a = Collections.unmodifiableList(new ArrayList(list));
            this.f45519b = (C12271a) C6431n.m37562o(aVar, "attributes");
            this.f45520c = cVar;
        }

        /* renamed from: d */
        public static C12285a m58974d() {
            return new C12285a();
        }

        /* renamed from: a */
        public List<C12406x> mo36945a() {
            return this.f45518a;
        }

        /* renamed from: b */
        public C12271a mo36946b() {
            return this.f45519b;
        }

        /* renamed from: c */
        public C12280c mo36947c() {
            return this.f45520c;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C12284g)) {
                return false;
            }
            C12284g gVar = (C12284g) obj;
            if (!C6425j.m37541a(this.f45518a, gVar.f45518a) || !C6425j.m37541a(this.f45519b, gVar.f45519b) || !C6425j.m37541a(this.f45520c, gVar.f45520c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C6425j.m37542b(this.f45518a, this.f45519b, this.f45520c);
        }

        public String toString() {
            return C6419h.m37528c(this).mo21842d("addresses", this.f45518a).mo21842d("attributes", this.f45519b).mo21842d("serviceConfig", this.f45520c).toString();
        }
    }

    /* renamed from: rc.a1$h */
    /* compiled from: NameResolver */
    public static abstract class C12286h {
        /* renamed from: a */
        public abstract C12280c mo34981a(Map<String, ?> map);
    }

    /* renamed from: a */
    public abstract String mo34988a();

    /* renamed from: b */
    public void mo34989b() {
    }

    /* renamed from: c */
    public abstract void mo34990c();

    /* renamed from: d */
    public void mo34991d(C12282e eVar) {
        mo35257e(eVar);
    }

    /* renamed from: e */
    public void mo35257e(C12283f fVar) {
        if (fVar instanceof C12282e) {
            mo34991d((C12282e) fVar);
        } else {
            mo34991d(new C12277a(fVar));
        }
    }

    /* renamed from: rc.a1$c */
    /* compiled from: NameResolver */
    public static final class C12280c {

        /* renamed from: a */
        private final C12335j1 f45516a;

        /* renamed from: b */
        private final Object f45517b;

        private C12280c(Object obj) {
            this.f45517b = C6431n.m37562o(obj, "config");
            this.f45516a = null;
        }

        /* renamed from: a */
        public static C12280c m58963a(Object obj) {
            return new C12280c(obj);
        }

        /* renamed from: b */
        public static C12280c m58964b(C12335j1 j1Var) {
            return new C12280c(j1Var);
        }

        /* renamed from: c */
        public Object mo36939c() {
            return this.f45517b;
        }

        /* renamed from: d */
        public C12335j1 mo36940d() {
            return this.f45516a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C12280c.class != obj.getClass()) {
                return false;
            }
            C12280c cVar = (C12280c) obj;
            if (!C6425j.m37541a(this.f45516a, cVar.f45516a) || !C6425j.m37541a(this.f45517b, cVar.f45517b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C6425j.m37542b(this.f45516a, this.f45517b);
        }

        public String toString() {
            if (this.f45517b != null) {
                return C6419h.m37528c(this).mo21842d("config", this.f45517b).toString();
            }
            return C6419h.m37528c(this).mo21842d("error", this.f45516a).toString();
        }

        private C12280c(C12335j1 j1Var) {
            this.f45517b = null;
            this.f45516a = (C12335j1) C6431n.m37562o(j1Var, "status");
            C6431n.m37557j(!j1Var.mo37028o(), "cannot use OK status: %s", j1Var);
        }
    }
}
