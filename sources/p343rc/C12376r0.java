package p343rc;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import p182a7.C6419h;
import p182a7.C6425j;
import p182a7.C6431n;
import p343rc.C12271a;
import p343rc.C12340k;

/* renamed from: rc.r0 */
/* compiled from: LoadBalancer */
public abstract class C12376r0 {

    /* renamed from: b */
    public static final C12271a.C12274c<Map<String, ?>> f45712b = C12271a.C12274c.m58939a("internal:health-checking-config");

    /* renamed from: a */
    private int f45713a;

    /* renamed from: rc.r0$b */
    /* compiled from: LoadBalancer */
    public static final class C12378b {

        /* renamed from: a */
        private final List<C12406x> f45714a;

        /* renamed from: b */
        private final C12271a f45715b;

        /* renamed from: c */
        private final Object[][] f45716c;

        /* renamed from: rc.r0$b$a */
        /* compiled from: LoadBalancer */
        public static final class C12379a {

            /* renamed from: a */
            private List<C12406x> f45717a;

            /* renamed from: b */
            private C12271a f45718b = C12271a.f45491c;

            /* renamed from: c */
            private Object[][] f45719c = ((Object[][]) Array.newInstance(Object.class, new int[]{0, 2}));

            C12379a() {
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public <T> C12379a m59216c(Object[][] objArr) {
                int length = objArr.length;
                int[] iArr = new int[2];
                iArr[1] = 2;
                iArr[0] = length;
                Object[][] objArr2 = (Object[][]) Array.newInstance(Object.class, iArr);
                this.f45719c = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
                return this;
            }

            /* renamed from: b */
            public C12378b mo37098b() {
                return new C12378b(this.f45717a, this.f45718b, this.f45719c);
            }

            /* renamed from: d */
            public C12379a mo37099d(List<C12406x> list) {
                C6431n.m37552e(!list.isEmpty(), "addrs is empty");
                this.f45717a = Collections.unmodifiableList(new ArrayList(list));
                return this;
            }

            /* renamed from: e */
            public C12379a mo37100e(C12406x xVar) {
                this.f45717a = Collections.singletonList(xVar);
                return this;
            }

            /* renamed from: f */
            public C12379a mo37101f(C12271a aVar) {
                this.f45718b = (C12271a) C6431n.m37562o(aVar, "attrs");
                return this;
            }
        }

        /* renamed from: c */
        public static C12379a m59211c() {
            return new C12379a();
        }

        /* renamed from: a */
        public List<C12406x> mo37094a() {
            return this.f45714a;
        }

        /* renamed from: b */
        public C12271a mo37095b() {
            return this.f45715b;
        }

        /* renamed from: d */
        public C12379a mo37096d() {
            return m59211c().mo37099d(this.f45714a).mo37101f(this.f45715b).m59216c(this.f45716c);
        }

        public String toString() {
            return C6419h.m37528c(this).mo21842d("addrs", this.f45714a).mo21842d("attrs", this.f45715b).mo21842d("customOptions", Arrays.deepToString(this.f45716c)).toString();
        }

        private C12378b(List<C12406x> list, C12271a aVar, Object[][] objArr) {
            this.f45714a = (List) C6431n.m37562o(list, "addresses are not set");
            this.f45715b = (C12271a) C6431n.m37562o(aVar, "attrs");
            this.f45716c = (Object[][]) C6431n.m37562o(objArr, "customOptions");
        }
    }

    /* renamed from: rc.r0$c */
    /* compiled from: LoadBalancer */
    public static abstract class C12380c {
        /* renamed from: a */
        public abstract C12376r0 mo35326a(C12381d dVar);
    }

    /* renamed from: rc.r0$d */
    /* compiled from: LoadBalancer */
    public static abstract class C12381d {
        /* renamed from: a */
        public C12386h mo35121a(C12378b bVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: b */
        public C12312f mo35122b() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public ScheduledExecutorService mo35123c() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public C12359n1 mo35124d() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public void mo35125e() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public abstract void mo35126f(C12367p pVar, C12387i iVar);
    }

    /* renamed from: rc.r0$e */
    /* compiled from: LoadBalancer */
    public static final class C12382e {

        /* renamed from: e */
        private static final C12382e f45720e = new C12382e((C12386h) null, (C12340k.C12341a) null, C12335j1.f45606f, false);

        /* renamed from: a */
        private final C12386h f45721a;

        /* renamed from: b */
        private final C12340k.C12341a f45722b;

        /* renamed from: c */
        private final C12335j1 f45723c;

        /* renamed from: d */
        private final boolean f45724d;

        private C12382e(C12386h hVar, C12340k.C12341a aVar, C12335j1 j1Var, boolean z) {
            this.f45721a = hVar;
            this.f45722b = aVar;
            this.f45723c = (C12335j1) C6431n.m37562o(j1Var, "status");
            this.f45724d = z;
        }

        /* renamed from: e */
        public static C12382e m59228e(C12335j1 j1Var) {
            C6431n.m37552e(!j1Var.mo37028o(), "drop status shouldn't be OK");
            return new C12382e((C12386h) null, (C12340k.C12341a) null, j1Var, true);
        }

        /* renamed from: f */
        public static C12382e m59229f(C12335j1 j1Var) {
            C6431n.m37552e(!j1Var.mo37028o(), "error status shouldn't be OK");
            return new C12382e((C12386h) null, (C12340k.C12341a) null, j1Var, false);
        }

        /* renamed from: g */
        public static C12382e m59230g() {
            return f45720e;
        }

        /* renamed from: h */
        public static C12382e m59231h(C12386h hVar) {
            return m59232i(hVar, (C12340k.C12341a) null);
        }

        /* renamed from: i */
        public static C12382e m59232i(C12386h hVar, C12340k.C12341a aVar) {
            return new C12382e((C12386h) C6431n.m37562o(hVar, "subchannel"), aVar, C12335j1.f45606f, false);
        }

        /* renamed from: a */
        public C12335j1 mo37102a() {
            return this.f45723c;
        }

        /* renamed from: b */
        public C12340k.C12341a mo37103b() {
            return this.f45722b;
        }

        /* renamed from: c */
        public C12386h mo37104c() {
            return this.f45721a;
        }

        /* renamed from: d */
        public boolean mo37105d() {
            return this.f45724d;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C12382e)) {
                return false;
            }
            C12382e eVar = (C12382e) obj;
            if (!C6425j.m37541a(this.f45721a, eVar.f45721a) || !C6425j.m37541a(this.f45723c, eVar.f45723c) || !C6425j.m37541a(this.f45722b, eVar.f45722b) || this.f45724d != eVar.f45724d) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C6425j.m37542b(this.f45721a, this.f45723c, this.f45722b, Boolean.valueOf(this.f45724d));
        }

        public String toString() {
            return C6419h.m37528c(this).mo21842d("subchannel", this.f45721a).mo21842d("streamTracerFactory", this.f45722b).mo21842d("status", this.f45723c).mo21843e("drop", this.f45724d).toString();
        }
    }

    /* renamed from: rc.r0$f */
    /* compiled from: LoadBalancer */
    public static abstract class C12383f {
        /* renamed from: a */
        public abstract C12292c mo35344a();

        /* renamed from: b */
        public abstract C12411y0 mo35345b();

        /* renamed from: c */
        public abstract C12423z0<?, ?> mo35346c();
    }

    /* renamed from: rc.r0$g */
    /* compiled from: LoadBalancer */
    public static final class C12384g {

        /* renamed from: a */
        private final List<C12406x> f45725a;

        /* renamed from: b */
        private final C12271a f45726b;

        /* renamed from: c */
        private final Object f45727c;

        /* renamed from: rc.r0$g$a */
        /* compiled from: LoadBalancer */
        public static final class C12385a {

            /* renamed from: a */
            private List<C12406x> f45728a;

            /* renamed from: b */
            private C12271a f45729b = C12271a.f45491c;

            /* renamed from: c */
            private Object f45730c;

            C12385a() {
            }

            /* renamed from: a */
            public C12384g mo37116a() {
                return new C12384g(this.f45728a, this.f45729b, this.f45730c);
            }

            /* renamed from: b */
            public C12385a mo37117b(List<C12406x> list) {
                this.f45728a = list;
                return this;
            }

            /* renamed from: c */
            public C12385a mo37118c(C12271a aVar) {
                this.f45729b = aVar;
                return this;
            }

            /* renamed from: d */
            public C12385a mo37119d(Object obj) {
                this.f45730c = obj;
                return this;
            }
        }

        /* renamed from: d */
        public static C12385a m59240d() {
            return new C12385a();
        }

        /* renamed from: a */
        public List<C12406x> mo37109a() {
            return this.f45725a;
        }

        /* renamed from: b */
        public C12271a mo37110b() {
            return this.f45726b;
        }

        /* renamed from: c */
        public Object mo37111c() {
            return this.f45727c;
        }

        /* renamed from: e */
        public C12385a mo37112e() {
            return m59240d().mo37117b(this.f45725a).mo37118c(this.f45726b).mo37119d(this.f45727c);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C12384g)) {
                return false;
            }
            C12384g gVar = (C12384g) obj;
            if (!C6425j.m37541a(this.f45725a, gVar.f45725a) || !C6425j.m37541a(this.f45726b, gVar.f45726b) || !C6425j.m37541a(this.f45727c, gVar.f45727c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C6425j.m37542b(this.f45725a, this.f45726b, this.f45727c);
        }

        public String toString() {
            return C6419h.m37528c(this).mo21842d("addresses", this.f45725a).mo21842d("attributes", this.f45726b).mo21842d("loadBalancingPolicyConfig", this.f45727c).toString();
        }

        private C12384g(List<C12406x> list, C12271a aVar, Object obj) {
            this.f45725a = Collections.unmodifiableList(new ArrayList((Collection) C6431n.m37562o(list, "addresses")));
            this.f45726b = (C12271a) C6431n.m37562o(aVar, "attributes");
            this.f45727c = obj;
        }
    }

    /* renamed from: rc.r0$h */
    /* compiled from: LoadBalancer */
    public static abstract class C12386h {
        /* renamed from: a */
        public final C12406x mo37120a() {
            List<C12406x> b = mo35163b();
            boolean z = true;
            if (b.size() != 1) {
                z = false;
            }
            C6431n.m37570w(z, "%s does not have exactly one group", b);
            return b.get(0);
        }

        /* renamed from: b */
        public List<C12406x> mo35163b() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public abstract C12271a mo35164c();

        /* renamed from: d */
        public Object mo35165d() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public abstract void mo35166e();

        /* renamed from: f */
        public abstract void mo35167f();

        /* renamed from: g */
        public void mo35168g(C12388j jVar) {
            throw new UnsupportedOperationException("Not implemented");
        }

        /* renamed from: h */
        public void mo35169h(List<C12406x> list) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: rc.r0$i */
    /* compiled from: LoadBalancer */
    public static abstract class C12387i {
        /* renamed from: a */
        public abstract C12382e mo35093a(C12383f fVar);

        @Deprecated
        /* renamed from: b */
        public void mo37121b() {
        }
    }

    /* renamed from: rc.r0$j */
    /* compiled from: LoadBalancer */
    public interface C12388j {
        /* renamed from: a */
        void mo35316a(C12370q qVar);
    }

    /* renamed from: a */
    public boolean mo35213a(C12384g gVar) {
        if (!gVar.mo37109a().isEmpty() || mo37093b()) {
            int i = this.f45713a;
            this.f45713a = i + 1;
            if (i == 0) {
                mo35215d(gVar);
            }
            this.f45713a = 0;
            return true;
        }
        C12335j1 j1Var = C12335j1.f45621u;
        mo35214c(j1Var.mo37030q("NameResolver returned no usable address. addrs=" + gVar.mo37109a() + ", attrs=" + gVar.mo37110b()));
        return false;
    }

    /* renamed from: b */
    public boolean mo37093b() {
        return false;
    }

    /* renamed from: c */
    public abstract void mo35214c(C12335j1 j1Var);

    /* renamed from: d */
    public void mo35215d(C12384g gVar) {
        int i = this.f45713a;
        this.f45713a = i + 1;
        if (i == 0) {
            mo35213a(gVar);
        }
        this.f45713a = 0;
    }

    /* renamed from: e */
    public void mo35315e() {
    }

    /* renamed from: f */
    public abstract void mo35216f();
}
