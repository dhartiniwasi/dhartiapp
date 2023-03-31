package p264io.grpc.internal;

import com.unity3d.ads.metadata.MediationMetaData;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import p182a7.C6431n;
import p182a7.C6441r;
import p182a7.C6445u;
import p182a7.C6448w;
import p182a7.C6449x;
import p264io.grpc.internal.C11183f2;
import p343rc.C12271a;
import p343rc.C12276a1;
import p343rc.C12318f1;
import p343rc.C12322g1;
import p343rc.C12335j1;
import p343rc.C12359n1;
import p343rc.C12406x;

/* renamed from: io.grpc.internal.c0 */
/* compiled from: DnsNameResolver */
public class C11138c0 extends C12276a1 {

    /* renamed from: A */
    private static final C11146g f42967A;

    /* renamed from: B */
    private static String f42968B;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final Logger f42969s;

    /* renamed from: t */
    private static final Set<String> f42970t = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"clientLanguage", "percentage", "clientHostname", "serviceConfig"})));

    /* renamed from: u */
    private static final String f42971u;

    /* renamed from: v */
    private static final String f42972v;

    /* renamed from: w */
    private static final String f42973w;

    /* renamed from: x */
    static boolean f42974x;

    /* renamed from: y */
    static boolean f42975y;

    /* renamed from: z */
    protected static boolean f42976z;

    /* renamed from: a */
    final C12322g1 f42977a;

    /* renamed from: b */
    private final Random f42978b = new Random();

    /* renamed from: c */
    protected volatile C11140b f42979c = C11142d.INSTANCE;

    /* renamed from: d */
    private final AtomicReference<C11145f> f42980d = new AtomicReference<>();

    /* renamed from: e */
    private final String f42981e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final String f42982f;

    /* renamed from: g */
    private final int f42983g;

    /* renamed from: h */
    private final C11183f2.C11187d<Executor> f42984h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final long f42985i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C12359n1 f42986j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C6441r f42987k;

    /* renamed from: l */
    protected boolean f42988l;

    /* renamed from: m */
    private boolean f42989m;

    /* renamed from: n */
    private Executor f42990n;

    /* renamed from: o */
    private final boolean f42991o;

    /* renamed from: p */
    private final C12276a1.C12286h f42992p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f42993q;

    /* renamed from: r */
    private C12276a1.C12282e f42994r;

    /* renamed from: io.grpc.internal.c0$b */
    /* compiled from: DnsNameResolver */
    public interface C11140b {
        /* renamed from: a */
        List<InetAddress> mo34994a(String str) throws Exception;
    }

    /* renamed from: io.grpc.internal.c0$c */
    /* compiled from: DnsNameResolver */
    protected static final class C11141c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C12335j1 f42995a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public List<C12406x> f42996b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C12276a1.C12280c f42997c;

        /* renamed from: d */
        public C12271a f42998d;

        private C11141c() {
        }
    }

    /* renamed from: io.grpc.internal.c0$d */
    /* compiled from: DnsNameResolver */
    private enum C11142d implements C11140b {
        INSTANCE;

        /* renamed from: a */
        public List<InetAddress> mo34994a(String str) throws UnknownHostException {
            return Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
        }
    }

    /* renamed from: io.grpc.internal.c0$e */
    /* compiled from: DnsNameResolver */
    private final class C11143e implements Runnable {

        /* renamed from: a */
        private final C12276a1.C12282e f43001a;

        /* renamed from: io.grpc.internal.c0$e$a */
        /* compiled from: DnsNameResolver */
        class C11144a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ boolean f43003a;

            C11144a(boolean z) {
                this.f43003a = z;
            }

            public void run() {
                if (this.f43003a) {
                    C11138c0 c0Var = C11138c0.this;
                    c0Var.f42988l = true;
                    if (c0Var.f42985i > 0) {
                        C11138c0.this.f42987k.mo21859f().mo21860g();
                    }
                }
                boolean unused = C11138c0.this.f42993q = false;
            }
        }

        C11143e(C12276a1.C12282e eVar) {
            this.f43001a = (C12276a1.C12282e) C6431n.m37562o(eVar, "savedListener");
        }

        public void run() {
            C12359n1 f;
            C11144a aVar;
            Logger g = C11138c0.f42969s;
            Level level = Level.FINER;
            if (g.isLoggable(level)) {
                Logger g2 = C11138c0.f42969s;
                g2.finer("Attempting DNS resolution of " + C11138c0.this.f42982f);
            }
            C11141c cVar = null;
            boolean z = true;
            try {
                C12406x i = C11138c0.this.m55138n();
                C12276a1.C12284g.C12285a d = C12276a1.C12284g.m58974d();
                if (i != null) {
                    if (C11138c0.f42969s.isLoggable(level)) {
                        Logger g3 = C11138c0.f42969s;
                        g3.finer("Using proxy address " + i);
                    }
                    d.mo36952b(Collections.singletonList(i));
                } else {
                    cVar = C11138c0.this.mo34992o(false);
                    if (cVar.f42995a != null) {
                        this.f43001a.mo35130b(cVar.f42995a);
                        if (cVar == null || cVar.f42995a != null) {
                            z = false;
                        }
                        C11138c0.this.f42986j.execute(new C11144a(z));
                        return;
                    }
                    if (cVar.f42996b != null) {
                        d.mo36952b(cVar.f42996b);
                    }
                    if (cVar.f42997c != null) {
                        d.mo36954d(cVar.f42997c);
                    }
                    C12271a aVar2 = cVar.f42998d;
                    if (aVar2 != null) {
                        d.mo36953c(aVar2);
                    }
                }
                this.f43001a.mo35131c(d.mo36951a());
                if (cVar == null || cVar.f42995a != null) {
                    z = false;
                }
                f = C11138c0.this.f42986j;
                aVar = new C11144a(z);
            } catch (IOException e) {
                C12276a1.C12282e eVar = this.f43001a;
                C12335j1 j1Var = C12335j1.f45621u;
                eVar.mo35130b(j1Var.mo37030q("Unable to resolve host " + C11138c0.this.f42982f).mo37029p(e));
                if (cVar == null || cVar.f42995a != null) {
                    z = false;
                }
                f = C11138c0.this.f42986j;
                aVar = new C11144a(z);
            } catch (Throwable th) {
                if (cVar == null || cVar.f42995a != null) {
                    z = false;
                }
                C11138c0.this.f42986j.execute(new C11144a(z));
                throw th;
            }
            f.execute(aVar);
        }
    }

    /* renamed from: io.grpc.internal.c0$f */
    /* compiled from: DnsNameResolver */
    public interface C11145f {
        /* renamed from: a */
        List<String> mo34997a(String str) throws Exception;
    }

    /* renamed from: io.grpc.internal.c0$g */
    /* compiled from: DnsNameResolver */
    interface C11146g {
        /* renamed from: a */
        C11145f mo34998a();

        /* renamed from: b */
        Throwable mo34999b();
    }

    static {
        Class<C11138c0> cls = C11138c0.class;
        f42969s = Logger.getLogger(cls.getName());
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        f42971u = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        f42972v = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        f42973w = property3;
        f42974x = Boolean.parseBoolean(property);
        f42975y = Boolean.parseBoolean(property2);
        f42976z = Boolean.parseBoolean(property3);
        f42967A = m55144v(cls.getClassLoader());
    }

    protected C11138c0(String str, String str2, C12276a1.C12278b bVar, C11183f2.C11187d<Executor> dVar, C6441r rVar, boolean z) {
        C6431n.m37562o(bVar, "args");
        this.f42984h = dVar;
        URI create = URI.create("//" + ((String) C6431n.m37562o(str2, MediationMetaData.KEY_NAME)));
        boolean z2 = true;
        C6431n.m37557j(create.getHost() != null, "Invalid DNS name: %s", str2);
        this.f42981e = (String) C6431n.m37563p(create.getAuthority(), "nameUri (%s) doesn't have an authority", create);
        this.f42982f = create.getHost();
        if (create.getPort() == -1) {
            this.f42983g = bVar.mo36924a();
        } else {
            this.f42983g = create.getPort();
        }
        this.f42977a = (C12322g1) C6431n.m37562o(bVar.mo36926c(), "proxyDetector");
        this.f42985i = m55142s(z);
        this.f42987k = (C6441r) C6431n.m37562o(rVar, "stopwatch");
        this.f42986j = (C12359n1) C6431n.m37562o(bVar.mo36928e(), "syncContext");
        Executor b = bVar.mo36925b();
        this.f42990n = b;
        this.f42991o = b != null ? false : z2;
        this.f42992p = (C12276a1.C12286h) C6431n.m37562o(bVar.mo36927d(), "serviceConfigParser");
    }

    /* renamed from: A */
    private List<C12406x> m55127A() {
        try {
            List<InetAddress> a = this.f42979c.mo34994a(this.f42982f);
            ArrayList arrayList = new ArrayList(a.size());
            for (InetAddress inetSocketAddress : a) {
                arrayList.add(new C12406x((SocketAddress) new InetSocketAddress(inetSocketAddress, this.f42983g)));
            }
            return Collections.unmodifiableList(arrayList);
        } catch (Exception e) {
            C6445u.m37608f(e);
            throw new RuntimeException(e);
        } catch (Throwable th) {
            if (e != null) {
                f42969s.log(Level.FINE, "Address resolution failure", e);
            }
            throw th;
        }
    }

    /* renamed from: B */
    private C12276a1.C12280c m55128B() {
        List<String> emptyList = Collections.emptyList();
        C11145f u = mo34993u();
        if (u != null) {
            try {
                emptyList = u.mo34997a("_grpc_config." + this.f42982f);
            } catch (Exception e) {
                f42969s.log(Level.FINE, "ServiceConfig resolution failure", e);
            }
        }
        if (!emptyList.isEmpty()) {
            C12276a1.C12280c x = m55146x(emptyList, this.f42978b, m55141r());
            if (x == null) {
                return null;
            }
            if (x.mo36940d() != null) {
                return C12276a1.C12280c.m58964b(x.mo36940d());
            }
            return this.f42992p.mo34981a((Map) x.mo36939c());
        }
        f42969s.log(Level.FINE, "No TXT records found for {0}", new Object[]{this.f42982f});
        return null;
    }

    /* renamed from: C */
    protected static boolean m55129C(boolean z, boolean z2, String str) {
        if (!z) {
            return false;
        }
        if ("localhost".equalsIgnoreCase(str)) {
            return z2;
        }
        if (str.contains(":")) {
            return false;
        }
        boolean z3 = true;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt != '.') {
                z3 &= charAt >= '0' && charAt <= '9';
            }
        }
        return true ^ z3;
    }

    /* renamed from: m */
    private boolean m55137m() {
        if (this.f42988l) {
            long j = this.f42985i;
            return j == 0 || (j > 0 && this.f42987k.mo21858d(TimeUnit.NANOSECONDS) > this.f42985i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public C12406x m55138n() throws IOException {
        C12318f1 a = this.f42977a.mo35298a(InetSocketAddress.createUnresolved(this.f42982f, this.f42983g));
        if (a != null) {
            return new C12406x((SocketAddress) a);
        }
        return null;
    }

    /* renamed from: p */
    private static final List<String> m55139p(Map<String, ?> map) {
        return C11135b1.m55114g(map, "clientLanguage");
    }

    /* renamed from: q */
    private static final List<String> m55140q(Map<String, ?> map) {
        return C11135b1.m55114g(map, "clientHostname");
    }

    /* renamed from: r */
    private static String m55141r() {
        if (f42968B == null) {
            try {
                f42968B = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e) {
                throw new RuntimeException(e);
            }
        }
        return f42968B;
    }

    /* renamed from: s */
    private static long m55142s(boolean z) {
        if (z) {
            return 0;
        }
        String property = System.getProperty("networkaddress.cache.ttl");
        long j = 30;
        if (property != null) {
            try {
                j = Long.parseLong(property);
            } catch (NumberFormatException unused) {
                f42969s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
            }
        }
        return j > 0 ? TimeUnit.SECONDS.toNanos(j) : j;
    }

    /* renamed from: t */
    private static final Double m55143t(Map<String, ?> map) {
        return C11135b1.m55115h(map, "percentage");
    }

    /* renamed from: v */
    static C11146g m55144v(ClassLoader classLoader) {
        try {
            try {
                try {
                    C11146g gVar = (C11146g) Class.forName("io.grpc.internal.z0", true, classLoader).asSubclass(C11146g.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                    if (gVar.mo34999b() == null) {
                        return gVar;
                    }
                    f42969s.log(Level.FINE, "JndiResourceResolverFactory not available, skipping.", gVar.mo34999b());
                    return null;
                } catch (Exception e) {
                    f42969s.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", e);
                    return null;
                }
            } catch (Exception e2) {
                f42969s.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", e2);
                return null;
            }
        } catch (ClassNotFoundException e3) {
            f42969s.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", e3);
            return null;
        } catch (ClassCastException e4) {
            f42969s.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", e4);
            return null;
        }
    }

    /* renamed from: w */
    static Map<String, ?> m55145w(Map<String, ?> map, Random random, String str) {
        boolean z;
        boolean z2;
        for (Map.Entry next : map.entrySet()) {
            C6448w.m37612a(f42970t.contains(next.getKey()), "Bad key: %s", next);
        }
        List<String> p = m55139p(map);
        if (p != null && !p.isEmpty()) {
            Iterator<String> it = p.iterator();
            while (true) {
                if (it.hasNext()) {
                    if ("java".equalsIgnoreCase(it.next())) {
                        z2 = true;
                        break;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
            if (!z2) {
                return null;
            }
        }
        Double t = m55143t(map);
        if (t != null) {
            int intValue = t.intValue();
            C6448w.m37612a(intValue >= 0 && intValue <= 100, "Bad percentage: %s", t);
            if (random.nextInt(100) >= intValue) {
                return null;
            }
        }
        List<String> q = m55140q(map);
        if (q != null && !q.isEmpty()) {
            Iterator<String> it2 = q.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().equals(str)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                return null;
            }
        }
        Map<String, ?> j = C11135b1.m55117j(map, "serviceConfig");
        if (j != null) {
            return j;
        }
        throw new C6449x(String.format("key '%s' missing in '%s'", new Object[]{map, "serviceConfig"}));
    }

    /* renamed from: x */
    static C12276a1.C12280c m55146x(List<String> list, Random random, String str) {
        try {
            Map<String, ?> map = null;
            for (Map w : m55147y(list)) {
                try {
                    map = m55145w(w, random, str);
                    if (map != null) {
                        break;
                    }
                } catch (RuntimeException e) {
                    return C12276a1.C12280c.m58964b(C12335j1.f45608h.mo37030q("failed to pick service config choice").mo37029p(e));
                }
            }
            if (map == null) {
                return null;
            }
            return C12276a1.C12280c.m58963a(map);
        } catch (IOException | RuntimeException e2) {
            return C12276a1.C12280c.m58964b(C12335j1.f45608h.mo37030q("failed to parse TXT records").mo37029p(e2));
        }
    }

    /* renamed from: y */
    static List<Map<String, ?>> m55147y(List<String> list) throws IOException {
        ArrayList arrayList = new ArrayList();
        for (String next : list) {
            if (!next.startsWith("grpc_config=")) {
                f42969s.log(Level.FINE, "Ignoring non service config {0}", new Object[]{next});
            } else {
                Object a = C11111a1.m55072a(next.substring(12));
                if (a instanceof List) {
                    arrayList.addAll(C11135b1.m55108a((List) a));
                } else {
                    throw new ClassCastException("wrong type " + a);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: z */
    private void m55148z() {
        if (!this.f42993q && !this.f42989m && m55137m()) {
            this.f42993q = true;
            this.f42990n.execute(new C11143e(this.f42994r));
        }
    }

    /* renamed from: a */
    public String mo34988a() {
        return this.f42981e;
    }

    /* renamed from: b */
    public void mo34989b() {
        C6431n.m37568u(this.f42994r != null, "not started");
        m55148z();
    }

    /* renamed from: c */
    public void mo34990c() {
        if (!this.f42989m) {
            this.f42989m = true;
            Executor executor = this.f42990n;
            if (executor != null && this.f42991o) {
                this.f42990n = (Executor) C11183f2.m55284f(this.f42984h, executor);
            }
        }
    }

    /* renamed from: d */
    public void mo34991d(C12276a1.C12282e eVar) {
        C6431n.m37568u(this.f42994r == null, "already started");
        if (this.f42991o) {
            this.f42990n = (Executor) C11183f2.m55283d(this.f42984h);
        }
        this.f42994r = (C12276a1.C12282e) C6431n.m37562o(eVar, "listener");
        m55148z();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C11141c mo34992o(boolean z) {
        C11141c cVar = new C11141c();
        try {
            List unused = cVar.f42996b = m55127A();
        } catch (Exception e) {
            if (!z) {
                C12335j1 j1Var = C12335j1.f45621u;
                C12335j1 unused2 = cVar.f42995a = j1Var.mo37030q("Unable to resolve host " + this.f42982f).mo37029p(e);
                return cVar;
            }
        }
        if (f42976z) {
            C12276a1.C12280c unused3 = cVar.f42997c = m55128B();
        }
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        r1 = f42967A;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p264io.grpc.internal.C11138c0.C11145f mo34993u() {
        /*
            r3 = this;
            boolean r0 = f42974x
            boolean r1 = f42975y
            java.lang.String r2 = r3.f42982f
            boolean r0 = m55129C(r0, r1, r2)
            if (r0 != 0) goto L_0x000e
            r0 = 0
            return r0
        L_0x000e:
            java.util.concurrent.atomic.AtomicReference<io.grpc.internal.c0$f> r0 = r3.f42980d
            java.lang.Object r0 = r0.get()
            io.grpc.internal.c0$f r0 = (p264io.grpc.internal.C11138c0.C11145f) r0
            if (r0 != 0) goto L_0x0020
            io.grpc.internal.c0$g r1 = f42967A
            if (r1 == 0) goto L_0x0020
            io.grpc.internal.c0$f r0 = r1.mo34998a()
        L_0x0020:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11138c0.mo34993u():io.grpc.internal.c0$f");
    }
}
