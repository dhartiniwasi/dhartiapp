package p418zc;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p182a7.C6431n;
import p190b7.C6667l;
import p264io.grpc.internal.C11169e2;
import p264io.grpc.internal.C11287l2;
import p343rc.C12271a;
import p343rc.C12335j1;
import p343rc.C12340k;
import p343rc.C12359n1;
import p343rc.C12367p;
import p343rc.C12370q;
import p343rc.C12376r0;
import p343rc.C12406x;
import p343rc.C12411y0;

/* renamed from: zc.e */
/* compiled from: OutlierDetectionLoadBalancer */
public final class C13560e extends C12376r0 {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C12271a.C12274c<C13562b> f48085k = C12271a.C12274c.m58939a("addressTrackerKey");

    /* renamed from: c */
    final C13564c f48086c = new C13564c();

    /* renamed from: d */
    private final C12359n1 f48087d;

    /* renamed from: e */
    private final C12376r0.C12381d f48088e;

    /* renamed from: f */
    private final C13555d f48089f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C11287l2 f48090g;

    /* renamed from: h */
    private final ScheduledExecutorService f48091h;

    /* renamed from: i */
    private C12359n1.C12363d f48092i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Long f48093j;

    /* renamed from: zc.e$b */
    /* compiled from: OutlierDetectionLoadBalancer */
    static class C13562b {

        /* renamed from: a */
        private C13568g f48094a;

        /* renamed from: b */
        private volatile C13563a f48095b = new C13563a();

        /* renamed from: c */
        private C13563a f48096c = new C13563a();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public Long f48097d;

        /* renamed from: e */
        private int f48098e;

        /* renamed from: f */
        private final Set<C13577i> f48099f = new HashSet();

        /* renamed from: zc.e$b$a */
        /* compiled from: OutlierDetectionLoadBalancer */
        private static class C13563a {

            /* renamed from: a */
            AtomicLong f48100a;

            /* renamed from: b */
            AtomicLong f48101b;

            private C13563a() {
                this.f48100a = new AtomicLong();
                this.f48101b = new AtomicLong();
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo38697a() {
                this.f48100a.set(0);
                this.f48101b.set(0);
            }
        }

        C13562b(C13568g gVar) {
            this.f48094a = gVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo38682b(C13577i iVar) {
            if (mo38693m() && !iVar.mo38728n()) {
                iVar.mo38727m();
            } else if (!mo38693m() && iVar.mo38728n()) {
                iVar.mo38730p();
            }
            iVar.mo38729o(this);
            return this.f48099f.add(iVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo38683c() {
            int i = this.f48098e;
            this.f48098e = i == 0 ? 0 : i - 1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo38684d(long j) {
            this.f48097d = Long.valueOf(j);
            this.f48098e++;
            for (C13577i m : this.f48099f) {
                m.mo38727m();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public double mo38685e() {
            return ((double) this.f48096c.f48101b.get()) / ((double) mo38686f());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public long mo38686f() {
            return this.f48096c.f48100a.get() + this.f48096c.f48101b.get();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo38687g(boolean z) {
            C13568g gVar = this.f48094a;
            if (gVar.f48112e != null || gVar.f48113f != null) {
                if (z) {
                    this.f48095b.f48100a.getAndIncrement();
                } else {
                    this.f48095b.f48101b.getAndIncrement();
                }
            }
        }

        /* renamed from: h */
        public boolean mo38688h(long j) {
            return j > this.f48097d.longValue() + Math.min(this.f48094a.f48109b.longValue() * ((long) this.f48098e), Math.max(this.f48094a.f48109b.longValue(), this.f48094a.f48110c.longValue()));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public boolean mo38689i(C13577i iVar) {
            iVar.mo38726l();
            return this.f48099f.remove(iVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo38690j() {
            this.f48095b.mo38697a();
            this.f48096c.mo38697a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo38691k() {
            this.f48098e = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo38692l(C13568g gVar) {
            this.f48094a = gVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public boolean mo38693m() {
            return this.f48097d != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public double mo38694n() {
            return ((double) this.f48096c.f48100a.get()) / ((double) mo38686f());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo38695o() {
            this.f48096c.mo38697a();
            C13563a aVar = this.f48095b;
            this.f48095b = this.f48096c;
            this.f48096c = aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo38696p() {
            C6431n.m37568u(this.f48097d != null, "not currently ejected");
            this.f48097d = null;
            for (C13577i p : this.f48099f) {
                p.mo38730p();
            }
        }
    }

    /* renamed from: zc.e$c */
    /* compiled from: OutlierDetectionLoadBalancer */
    static class C13564c extends C6667l<SocketAddress, C13562b> {

        /* renamed from: a */
        private final Map<SocketAddress, C13562b> f48102a = new HashMap();

        C13564c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Map<SocketAddress, C13562b> mo20396b() {
            return this.f48102a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo38698g() {
            for (C13562b next : this.f48102a.values()) {
                if (next.mo38693m()) {
                    next.mo38696p();
                }
                next.mo38691k();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public double mo38699h() {
            if (this.f48102a.isEmpty()) {
                return 0.0d;
            }
            int i = 0;
            int i2 = 0;
            for (C13562b m : this.f48102a.values()) {
                i2++;
                if (m.mo38693m()) {
                    i++;
                }
            }
            return (((double) i) / ((double) i2)) * 100.0d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo38700i(Long l) {
            for (C13562b next : this.f48102a.values()) {
                if (!next.mo38693m()) {
                    next.mo38683c();
                }
                if (next.mo38693m() && next.mo38688h(l.longValue())) {
                    next.mo38696p();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo38701j(C13568g gVar, Collection<SocketAddress> collection) {
            for (SocketAddress next : collection) {
                if (!this.f48102a.containsKey(next)) {
                    this.f48102a.put(next, new C13562b(gVar));
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo38702k() {
            for (C13562b j : this.f48102a.values()) {
                j.mo38690j();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo38703l() {
            for (C13562b o : this.f48102a.values()) {
                o.mo38695o();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo38704m(C13568g gVar) {
            for (C13562b l : this.f48102a.values()) {
                l.mo38692l(gVar);
            }
        }
    }

    /* renamed from: zc.e$d */
    /* compiled from: OutlierDetectionLoadBalancer */
    class C13565d extends C13553b {

        /* renamed from: a */
        private C12376r0.C12381d f48103a;

        C13565d(C12376r0.C12381d dVar) {
            this.f48103a = dVar;
        }

        /* renamed from: a */
        public C12376r0.C12386h mo35121a(C12376r0.C12378b bVar) {
            C13577i iVar = new C13577i(this.f48103a.mo35121a(bVar));
            List<C12406x> a = bVar.mo37094a();
            if (C13560e.m62809m(a) && C13560e.this.f48086c.containsKey(a.get(0).mo37149a().get(0))) {
                C13562b bVar2 = (C13562b) C13560e.this.f48086c.get(a.get(0).mo37149a().get(0));
                bVar2.mo38682b(iVar);
                if (bVar2.f48097d != null) {
                    iVar.mo38727m();
                }
            }
            return iVar;
        }

        /* renamed from: f */
        public void mo35126f(C12367p pVar, C12376r0.C12387i iVar) {
            this.f48103a.mo35126f(pVar, new C13574h(iVar));
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public C12376r0.C12381d mo38675g() {
            return this.f48103a;
        }
    }

    /* renamed from: zc.e$e */
    /* compiled from: OutlierDetectionLoadBalancer */
    class C13566e implements Runnable {

        /* renamed from: a */
        C13568g f48105a;

        C13566e(C13568g gVar) {
            this.f48105a = gVar;
        }

        public void run() {
            C13560e eVar = C13560e.this;
            Long unused = eVar.f48093j = Long.valueOf(eVar.f48090g.mo35246a());
            C13560e.this.f48086c.mo38703l();
            for (C13579j a : C13581f.m62882a(this.f48105a)) {
                C13560e eVar2 = C13560e.this;
                a.mo38706a(eVar2.f48086c, eVar2.f48093j.longValue());
            }
            C13560e eVar3 = C13560e.this;
            eVar3.f48086c.mo38700i(eVar3.f48093j);
        }
    }

    /* renamed from: zc.e$f */
    /* compiled from: OutlierDetectionLoadBalancer */
    static class C13567f implements C13579j {

        /* renamed from: a */
        private final C13568g f48107a;

        C13567f(C13568g gVar) {
            this.f48107a = gVar;
        }

        /* renamed from: a */
        public void mo38706a(C13564c cVar, long j) {
            List<C13562b> l = C13560e.m62810n(cVar, this.f48107a.f48113f.f48125d.intValue());
            if (l.size() >= this.f48107a.f48113f.f48124c.intValue() && l.size() != 0) {
                for (C13562b bVar : l) {
                    if (cVar.mo38699h() < ((double) this.f48107a.f48111d.intValue())) {
                        if (bVar.mo38686f() >= ((long) this.f48107a.f48113f.f48125d.intValue())) {
                            if (bVar.mo38685e() > ((double) this.f48107a.f48113f.f48122a.intValue()) / 100.0d && new Random().nextInt(100) < this.f48107a.f48113f.f48123b.intValue()) {
                                bVar.mo38684d(j);
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: zc.e$g */
    /* compiled from: OutlierDetectionLoadBalancer */
    public static final class C13568g {

        /* renamed from: a */
        public final Long f48108a;

        /* renamed from: b */
        public final Long f48109b;

        /* renamed from: c */
        public final Long f48110c;

        /* renamed from: d */
        public final Integer f48111d;

        /* renamed from: e */
        public final C13572c f48112e;

        /* renamed from: f */
        public final C13570b f48113f;

        /* renamed from: g */
        public final C11169e2.C11171b f48114g;

        /* renamed from: zc.e$g$a */
        /* compiled from: OutlierDetectionLoadBalancer */
        public static class C13569a {

            /* renamed from: a */
            Long f48115a = 10000000000L;

            /* renamed from: b */
            Long f48116b = 30000000000L;

            /* renamed from: c */
            Long f48117c = 30000000000L;

            /* renamed from: d */
            Integer f48118d = 10;

            /* renamed from: e */
            C13572c f48119e;

            /* renamed from: f */
            C13570b f48120f;

            /* renamed from: g */
            C11169e2.C11171b f48121g;

            /* renamed from: a */
            public C13568g mo38708a() {
                C6431n.m37567t(this.f48121g != null);
                return new C13568g(this.f48115a, this.f48116b, this.f48117c, this.f48118d, this.f48119e, this.f48120f, this.f48121g);
            }

            /* renamed from: b */
            public C13569a mo38709b(Long l) {
                C6431n.m37551d(l != null);
                this.f48116b = l;
                return this;
            }

            /* renamed from: c */
            public C13569a mo38710c(C11169e2.C11171b bVar) {
                C6431n.m37567t(bVar != null);
                this.f48121g = bVar;
                return this;
            }

            /* renamed from: d */
            public C13569a mo38711d(C13570b bVar) {
                this.f48120f = bVar;
                return this;
            }

            /* renamed from: e */
            public C13569a mo38712e(Long l) {
                C6431n.m37551d(l != null);
                this.f48115a = l;
                return this;
            }

            /* renamed from: f */
            public C13569a mo38713f(Integer num) {
                C6431n.m37551d(num != null);
                this.f48118d = num;
                return this;
            }

            /* renamed from: g */
            public C13569a mo38714g(Long l) {
                C6431n.m37551d(l != null);
                this.f48117c = l;
                return this;
            }

            /* renamed from: h */
            public C13569a mo38715h(C13572c cVar) {
                this.f48119e = cVar;
                return this;
            }
        }

        /* renamed from: zc.e$g$b */
        /* compiled from: OutlierDetectionLoadBalancer */
        public static class C13570b {

            /* renamed from: a */
            public final Integer f48122a;

            /* renamed from: b */
            public final Integer f48123b;

            /* renamed from: c */
            public final Integer f48124c;

            /* renamed from: d */
            public final Integer f48125d;

            /* renamed from: zc.e$g$b$a */
            /* compiled from: OutlierDetectionLoadBalancer */
            public static class C13571a {

                /* renamed from: a */
                Integer f48126a = 85;

                /* renamed from: b */
                Integer f48127b = 100;

                /* renamed from: c */
                Integer f48128c = 5;

                /* renamed from: d */
                Integer f48129d = 50;

                /* renamed from: a */
                public C13570b mo38716a() {
                    return new C13570b(this.f48126a, this.f48127b, this.f48128c, this.f48129d);
                }

                /* renamed from: b */
                public C13571a mo38717b(Integer num) {
                    boolean z = true;
                    C6431n.m37551d(num != null);
                    if (num.intValue() < 0 || num.intValue() > 100) {
                        z = false;
                    }
                    C6431n.m37551d(z);
                    this.f48127b = num;
                    return this;
                }

                /* renamed from: c */
                public C13571a mo38718c(Integer num) {
                    boolean z = true;
                    C6431n.m37551d(num != null);
                    if (num.intValue() < 0) {
                        z = false;
                    }
                    C6431n.m37551d(z);
                    this.f48128c = num;
                    return this;
                }

                /* renamed from: d */
                public C13571a mo38719d(Integer num) {
                    boolean z = true;
                    C6431n.m37551d(num != null);
                    if (num.intValue() < 0) {
                        z = false;
                    }
                    C6431n.m37551d(z);
                    this.f48129d = num;
                    return this;
                }

                /* renamed from: e */
                public C13571a mo38720e(Integer num) {
                    boolean z = true;
                    C6431n.m37551d(num != null);
                    if (num.intValue() < 0 || num.intValue() > 100) {
                        z = false;
                    }
                    C6431n.m37551d(z);
                    this.f48126a = num;
                    return this;
                }
            }

            C13570b(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f48122a = num;
                this.f48123b = num2;
                this.f48124c = num3;
                this.f48125d = num4;
            }
        }

        /* renamed from: zc.e$g$c */
        /* compiled from: OutlierDetectionLoadBalancer */
        public static class C13572c {

            /* renamed from: a */
            public final Integer f48130a;

            /* renamed from: b */
            public final Integer f48131b;

            /* renamed from: c */
            public final Integer f48132c;

            /* renamed from: d */
            public final Integer f48133d;

            /* renamed from: zc.e$g$c$a */
            /* compiled from: OutlierDetectionLoadBalancer */
            public static final class C13573a {

                /* renamed from: a */
                Integer f48134a = 1900;

                /* renamed from: b */
                Integer f48135b = 100;

                /* renamed from: c */
                Integer f48136c = 5;

                /* renamed from: d */
                Integer f48137d = 100;

                /* renamed from: a */
                public C13572c mo38721a() {
                    return new C13572c(this.f48134a, this.f48135b, this.f48136c, this.f48137d);
                }

                /* renamed from: b */
                public C13573a mo38722b(Integer num) {
                    boolean z = true;
                    C6431n.m37551d(num != null);
                    if (num.intValue() < 0 || num.intValue() > 100) {
                        z = false;
                    }
                    C6431n.m37551d(z);
                    this.f48135b = num;
                    return this;
                }

                /* renamed from: c */
                public C13573a mo38723c(Integer num) {
                    boolean z = true;
                    C6431n.m37551d(num != null);
                    if (num.intValue() < 0) {
                        z = false;
                    }
                    C6431n.m37551d(z);
                    this.f48136c = num;
                    return this;
                }

                /* renamed from: d */
                public C13573a mo38724d(Integer num) {
                    boolean z = true;
                    C6431n.m37551d(num != null);
                    if (num.intValue() < 0) {
                        z = false;
                    }
                    C6431n.m37551d(z);
                    this.f48137d = num;
                    return this;
                }

                /* renamed from: e */
                public C13573a mo38725e(Integer num) {
                    C6431n.m37551d(num != null);
                    this.f48134a = num;
                    return this;
                }
            }

            C13572c(Integer num, Integer num2, Integer num3, Integer num4) {
                this.f48130a = num;
                this.f48131b = num2;
                this.f48132c = num3;
                this.f48133d = num4;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo38707a() {
            return (this.f48112e == null && this.f48113f == null) ? false : true;
        }

        private C13568g(Long l, Long l2, Long l3, Integer num, C13572c cVar, C13570b bVar, C11169e2.C11171b bVar2) {
            this.f48108a = l;
            this.f48109b = l2;
            this.f48110c = l3;
            this.f48111d = num;
            this.f48112e = cVar;
            this.f48113f = bVar;
            this.f48114g = bVar2;
        }
    }

    /* renamed from: zc.e$h */
    /* compiled from: OutlierDetectionLoadBalancer */
    class C13574h extends C12376r0.C12387i {

        /* renamed from: a */
        private final C12376r0.C12387i f48138a;

        /* renamed from: zc.e$h$a */
        /* compiled from: OutlierDetectionLoadBalancer */
        class C13575a extends C12340k {

            /* renamed from: a */
            C13562b f48140a;

            public C13575a(C13562b bVar) {
                this.f48140a = bVar;
            }

            /* renamed from: i */
            public void mo37062i(C12335j1 j1Var) {
                this.f48140a.mo38687g(j1Var.mo37028o());
            }
        }

        /* renamed from: zc.e$h$b */
        /* compiled from: OutlierDetectionLoadBalancer */
        class C13576b extends C12340k.C12341a {

            /* renamed from: a */
            private final C13562b f48142a;

            C13576b(C13562b bVar) {
                this.f48142a = bVar;
            }

            /* renamed from: a */
            public C12340k mo35452a(C12340k.C12342b bVar, C12411y0 y0Var) {
                return new C13575a(this.f48142a);
            }
        }

        C13574h(C12376r0.C12387i iVar) {
            this.f48138a = iVar;
        }

        /* renamed from: a */
        public C12376r0.C12382e mo35093a(C12376r0.C12383f fVar) {
            C12376r0.C12382e a = this.f48138a.mo35093a(fVar);
            C12376r0.C12386h c = a.mo37104c();
            return c != null ? C12376r0.C12382e.m59232i(c, new C13576b((C13562b) c.mo35164c().mo36915b(C13560e.f48085k))) : a;
        }
    }

    /* renamed from: zc.e$i */
    /* compiled from: OutlierDetectionLoadBalancer */
    class C13577i extends C13554c {

        /* renamed from: a */
        private final C12376r0.C12386h f48144a;

        /* renamed from: b */
        private C13562b f48145b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f48146c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C12370q f48147d;

        /* renamed from: e */
        private C12376r0.C12388j f48148e;

        /* renamed from: zc.e$i$a */
        /* compiled from: OutlierDetectionLoadBalancer */
        class C13578a implements C12376r0.C12388j {

            /* renamed from: a */
            private final C12376r0.C12388j f48150a;

            C13578a(C12376r0.C12388j jVar) {
                this.f48150a = jVar;
            }

            /* renamed from: a */
            public void mo35316a(C12370q qVar) {
                C12370q unused = C13577i.this.f48147d = qVar;
                if (!C13577i.this.f48146c) {
                    this.f48150a.mo35316a(qVar);
                }
            }
        }

        C13577i(C12376r0.C12386h hVar) {
            this.f48144a = hVar;
        }

        /* renamed from: c */
        public C12271a mo35164c() {
            if (this.f48145b != null) {
                return this.f48144a.mo35164c().mo36916d().mo36922d(C13560e.f48085k, this.f48145b).mo36920a();
            }
            return this.f48144a.mo35164c();
        }

        /* renamed from: g */
        public void mo35168g(C12376r0.C12388j jVar) {
            this.f48148e = jVar;
            super.mo35168g(new C13578a(jVar));
        }

        /* renamed from: h */
        public void mo35169h(List<C12406x> list) {
            if (C13560e.m62809m(mo35163b()) && C13560e.m62809m(list)) {
                if (C13560e.this.f48086c.containsValue(this.f48145b)) {
                    this.f48145b.mo38689i(this);
                }
                SocketAddress socketAddress = list.get(0).mo37149a().get(0);
                if (C13560e.this.f48086c.containsKey(socketAddress)) {
                    ((C13562b) C13560e.this.f48086c.get(socketAddress)).mo38682b(this);
                }
            } else if (!C13560e.m62809m(mo35163b()) || C13560e.m62809m(list)) {
                if (!C13560e.m62809m(mo35163b()) && C13560e.m62809m(list)) {
                    SocketAddress socketAddress2 = list.get(0).mo37149a().get(0);
                    if (C13560e.this.f48086c.containsKey(socketAddress2)) {
                        ((C13562b) C13560e.this.f48086c.get(socketAddress2)).mo38682b(this);
                    }
                }
            } else if (C13560e.this.f48086c.containsKey(mo37120a().mo37149a().get(0))) {
                C13562b bVar = (C13562b) C13560e.this.f48086c.get(mo37120a().mo37149a().get(0));
                bVar.mo38689i(this);
                bVar.mo38690j();
            }
            this.f48144a.mo35169h(list);
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public C12376r0.C12386h mo38677i() {
            return this.f48144a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo38726l() {
            this.f48145b = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo38727m() {
            this.f48146c = true;
            this.f48148e.mo35316a(C12370q.m59186b(C12335j1.f45621u));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo38728n() {
            return this.f48146c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo38729o(C13562b bVar) {
            this.f48145b = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo38730p() {
            this.f48146c = false;
            C12370q qVar = this.f48147d;
            if (qVar != null) {
                this.f48148e.mo35316a(qVar);
            }
        }
    }

    /* renamed from: zc.e$j */
    /* compiled from: OutlierDetectionLoadBalancer */
    interface C13579j {
        /* renamed from: a */
        void mo38706a(C13564c cVar, long j);
    }

    /* renamed from: zc.e$k */
    /* compiled from: OutlierDetectionLoadBalancer */
    static class C13580k implements C13579j {

        /* renamed from: a */
        private final C13568g f48152a;

        C13580k(C13568g gVar) {
            C6431n.m37552e(gVar.f48112e != null, "success rate ejection config is null");
            this.f48152a = gVar;
        }

        /* renamed from: b */
        static double m62879b(Collection<Double> collection) {
            double d = 0.0d;
            for (Double doubleValue : collection) {
                d += doubleValue.doubleValue();
            }
            return d / ((double) collection.size());
        }

        /* renamed from: c */
        static double m62880c(Collection<Double> collection, double d) {
            double d2 = 0.0d;
            for (Double doubleValue : collection) {
                double doubleValue2 = doubleValue.doubleValue() - d;
                d2 += doubleValue2 * doubleValue2;
            }
            return Math.sqrt(d2 / ((double) collection.size()));
        }

        /* renamed from: a */
        public void mo38706a(C13564c cVar, long j) {
            List<C13562b> l = C13560e.m62810n(cVar, this.f48152a.f48112e.f48133d.intValue());
            if (l.size() >= this.f48152a.f48112e.f48132c.intValue() && l.size() != 0) {
                ArrayList arrayList = new ArrayList();
                for (C13562b n : l) {
                    arrayList.add(Double.valueOf(n.mo38694n()));
                }
                double b = m62879b(arrayList);
                double c = b - (m62880c(arrayList, b) * ((double) (((float) this.f48152a.f48112e.f48130a.intValue()) / 1000.0f)));
                for (C13562b bVar : l) {
                    if (cVar.mo38699h() < ((double) this.f48152a.f48111d.intValue())) {
                        if (bVar.mo38694n() < c && new Random().nextInt(100) < this.f48152a.f48112e.f48131b.intValue()) {
                            bVar.mo38684d(j);
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public C13560e(C12376r0.C12381d dVar, C11287l2 l2Var) {
        C13565d dVar2 = new C13565d((C12376r0.C12381d) C6431n.m37562o(dVar, "helper"));
        this.f48088e = dVar2;
        this.f48089f = new C13555d(dVar2);
        this.f48087d = (C12359n1) C6431n.m37562o(dVar.mo35124d(), "syncContext");
        this.f48091h = (ScheduledExecutorService) C6431n.m37562o(dVar.mo35123c(), "timeService");
        this.f48090g = l2Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static boolean m62809m(List<C12406x> list) {
        int i = 0;
        for (C12406x a : list) {
            i += a.mo37149a().size();
            if (i > 1) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static List<C13562b> m62810n(C13564c cVar, int i) {
        ArrayList arrayList = new ArrayList();
        for (C13562b bVar : cVar.values()) {
            if (bVar.mo38686f() >= ((long) i)) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public boolean mo35213a(C12376r0.C12384g gVar) {
        Long l;
        C13568g gVar2 = (C13568g) gVar.mo37111c();
        ArrayList arrayList = new ArrayList();
        for (C12406x a : gVar.mo37109a()) {
            arrayList.addAll(a.mo37149a());
        }
        this.f48086c.keySet().retainAll(arrayList);
        this.f48086c.mo38704m(gVar2);
        this.f48086c.mo38701j(gVar2, arrayList);
        this.f48089f.mo38679r(gVar2.f48114g.mo35046b());
        if (gVar2.mo38707a()) {
            if (this.f48093j == null) {
                l = gVar2.f48108a;
            } else {
                l = Long.valueOf(Math.max(0, gVar2.f48108a.longValue() - (this.f48090g.mo35246a() - this.f48093j.longValue())));
            }
            C12359n1.C12363d dVar = this.f48092i;
            if (dVar != null) {
                dVar.mo37074a();
                this.f48086c.mo38702k();
            }
            this.f48092i = this.f48087d.mo37066e(new C13566e(gVar2), l.longValue(), gVar2.f48108a.longValue(), TimeUnit.NANOSECONDS, this.f48091h);
        } else {
            C12359n1.C12363d dVar2 = this.f48092i;
            if (dVar2 != null) {
                dVar2.mo37074a();
                this.f48093j = null;
                this.f48086c.mo38698g();
            }
        }
        this.f48089f.mo35215d(gVar.mo37112e().mo37119d(gVar2.f48114g.mo35045a()).mo37116a());
        return true;
    }

    /* renamed from: c */
    public void mo35214c(C12335j1 j1Var) {
        this.f48089f.mo35214c(j1Var);
    }

    /* renamed from: f */
    public void mo35216f() {
        this.f48089f.mo35216f();
    }
}
