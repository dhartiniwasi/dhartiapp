package p264io.grpc.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p182a7.C6431n;
import p182a7.C6436q;
import p182a7.C6441r;
import p182a7.C6444t;
import p228f7.C10142f;
import p264io.grpc.internal.C11183f2;
import p264io.grpc.internal.C11274k2;
import p264io.grpc.internal.C11333r;
import p343rc.C12292c;
import p343rc.C12318f1;
import p343rc.C12322g1;
import p343rc.C12334j0;
import p343rc.C12335j1;
import p343rc.C12340k;
import p343rc.C12354m0;
import p343rc.C12376r0;
import p343rc.C12411y0;
import p343rc.C12423z0;

/* renamed from: io.grpc.internal.r0 */
/* compiled from: GrpcUtil */
public final class C11335r0 {

    /* renamed from: a */
    private static final Logger f43527a = Logger.getLogger(C11335r0.class.getName());

    /* renamed from: b */
    private static final Set<C12335j1.C12337b> f43528b = Collections.unmodifiableSet(EnumSet.of(C12335j1.C12337b.OK, new C12335j1.C12337b[]{C12335j1.C12337b.INVALID_ARGUMENT, C12335j1.C12337b.NOT_FOUND, C12335j1.C12337b.ALREADY_EXISTS, C12335j1.C12337b.FAILED_PRECONDITION, C12335j1.C12337b.ABORTED, C12335j1.C12337b.OUT_OF_RANGE, C12335j1.C12337b.DATA_LOSS}));

    /* renamed from: c */
    public static final Charset f43529c = Charset.forName("US-ASCII");

    /* renamed from: d */
    public static final C12411y0.C12418g<Long> f43530d = C12411y0.C12418g.m59361e("grpc-timeout", new C11344i());

    /* renamed from: e */
    public static final C12411y0.C12418g<String> f43531e;

    /* renamed from: f */
    public static final C12411y0.C12418g<byte[]> f43532f = C12354m0.m59157b("grpc-accept-encoding", new C11342g((C11336a) null));

    /* renamed from: g */
    public static final C12411y0.C12418g<String> f43533g;

    /* renamed from: h */
    public static final C12411y0.C12418g<byte[]> f43534h = C12354m0.m59157b("accept-encoding", new C11342g((C11336a) null));

    /* renamed from: i */
    static final C12411y0.C12418g<String> f43535i;

    /* renamed from: j */
    public static final C12411y0.C12418g<String> f43536j;

    /* renamed from: k */
    public static final C12411y0.C12418g<String> f43537k;

    /* renamed from: l */
    public static final C12411y0.C12418g<String> f43538l;

    /* renamed from: m */
    public static final C6436q f43539m = C6436q.m37578d(',').mo21851h();

    /* renamed from: n */
    public static final long f43540n;

    /* renamed from: o */
    public static final long f43541o = TimeUnit.HOURS.toNanos(2);

    /* renamed from: p */
    public static final long f43542p;

    /* renamed from: q */
    public static final C12322g1 f43543q = new C11372u1();

    /* renamed from: r */
    public static final C12322g1 f43544r = new C11336a();

    /* renamed from: s */
    public static final C12292c.C12293a<Boolean> f43545s = C12292c.C12293a.m59009b("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final C12340k f43546t = new C11337b();

    /* renamed from: u */
    public static final C11183f2.C11187d<Executor> f43547u = new C11338c();

    /* renamed from: v */
    public static final C11183f2.C11187d<ScheduledExecutorService> f43548v = new C11339d();

    /* renamed from: w */
    public static final C6444t<C6441r> f43549w = new C11340e();

    /* renamed from: io.grpc.internal.r0$a */
    /* compiled from: GrpcUtil */
    class C11336a implements C12322g1 {
        C11336a() {
        }

        /* renamed from: a */
        public C12318f1 mo35298a(SocketAddress socketAddress) {
            return null;
        }
    }

    /* renamed from: io.grpc.internal.r0$b */
    /* compiled from: GrpcUtil */
    class C11337b extends C12340k {
        C11337b() {
        }
    }

    /* renamed from: io.grpc.internal.r0$c */
    /* compiled from: GrpcUtil */
    class C11338c implements C11183f2.C11187d<Executor> {
        C11338c() {
        }

        /* renamed from: c */
        public void mo35068b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        /* renamed from: d */
        public Executor mo35067a() {
            return Executors.newCachedThreadPool(C11335r0.m55802i("grpc-default-executor-%d", true));
        }

        public String toString() {
            return "grpc-default-executor";
        }
    }

    /* renamed from: io.grpc.internal.r0$d */
    /* compiled from: GrpcUtil */
    class C11339d implements C11183f2.C11187d<ScheduledExecutorService> {
        C11339d() {
        }

        /* renamed from: c */
        public void mo35068b(ScheduledExecutorService scheduledExecutorService) {
            scheduledExecutorService.shutdown();
        }

        /* renamed from: d */
        public ScheduledExecutorService mo35067a() {
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, C11335r0.m55802i("grpc-timer-%d", true));
            try {
                newScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", new Class[]{Boolean.TYPE}).invoke(newScheduledThreadPool, new Object[]{Boolean.TRUE});
            } catch (NoSuchMethodException unused) {
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
            return Executors.unconfigurableScheduledExecutorService(newScheduledThreadPool);
        }
    }

    /* renamed from: io.grpc.internal.r0$e */
    /* compiled from: GrpcUtil */
    class C11340e implements C6444t<C6441r> {
        C11340e() {
        }

        /* renamed from: a */
        public C6441r get() {
            return C6441r.m37595c();
        }
    }

    /* renamed from: io.grpc.internal.r0$f */
    /* compiled from: GrpcUtil */
    class C11341f implements C11351s {

        /* renamed from: a */
        final /* synthetic */ C12340k.C12341a f43550a;

        /* renamed from: b */
        final /* synthetic */ C11351s f43551b;

        C11341f(C12340k.C12341a aVar, C11351s sVar) {
            this.f43550a = aVar;
            this.f43551b = sVar;
        }

        /* renamed from: b */
        public C11329q mo34932b(C12423z0<?, ?> z0Var, C12411y0 y0Var, C12292c cVar, C12340k[] kVarArr) {
            C12340k a = this.f43550a.mo35452a(C12340k.C12342b.m59135a().mo37044b(cVar).mo37043a(), y0Var);
            C6431n.m37568u(kVarArr[kVarArr.length - 1] == C11335r0.f43546t, "lb tracer already assigned");
            kVarArr[kVarArr.length - 1] = a;
            return this.f43551b.mo34932b(z0Var, y0Var, cVar, kVarArr);
        }

        /* renamed from: f */
        public C12334j0 mo34935f() {
            return this.f43551b.mo34935f();
        }
    }

    /* renamed from: io.grpc.internal.r0$g */
    /* compiled from: GrpcUtil */
    private static final class C11342g implements C12354m0.C12355a<byte[]> {
        private C11342g() {
        }

        /* renamed from: c */
        public byte[] mo35306b(byte[] bArr) {
            return bArr;
        }

        /* renamed from: d */
        public byte[] mo35305a(byte[] bArr) {
            return bArr;
        }

        /* synthetic */ C11342g(C11336a aVar) {
            this();
        }
    }

    /* renamed from: io.grpc.internal.r0$h */
    /* compiled from: GrpcUtil */
    public enum C11343h {
        NO_ERROR(0, r1),
        PROTOCOL_ERROR(1, r4),
        INTERNAL_ERROR(2, r4),
        FLOW_CONTROL_ERROR(3, r4),
        SETTINGS_TIMEOUT(4, r4),
        STREAM_CLOSED(5, r4),
        FRAME_SIZE_ERROR(6, r4),
        REFUSED_STREAM(7, r1),
        CANCEL(8, C12335j1.f45607g),
        COMPRESSION_ERROR(9, r4),
        CONNECT_ERROR(10, r4),
        ENHANCE_YOUR_CALM(11, C12335j1.f45615o.mo37030q("Bandwidth exhausted")),
        INADEQUATE_SECURITY(12, C12335j1.f45613m.mo37030q("Permission denied as protocol is not secure enough to call")),
        HTTP_1_1_REQUIRED(13, C12335j1.f45608h);
        

        /* renamed from: y */
        private static final C11343h[] f43566y = null;

        /* renamed from: a */
        private final int f43568a;

        /* renamed from: b */
        private final C12335j1 f43569b;

        static {
            f43566y = m55825a();
        }

        private C11343h(int i, C12335j1 j1Var) {
            this.f43568a = i;
            String str = "HTTP/2 error code: " + name();
            if (j1Var.mo37027n() != null) {
                str = str + " (" + j1Var.mo37027n() + ")";
            }
            this.f43569b = j1Var.mo37030q(str);
        }

        /* renamed from: a */
        private static C11343h[] m55825a() {
            C11343h[] values = values();
            C11343h[] hVarArr = new C11343h[(((int) values[values.length - 1].mo35309b()) + 1)];
            for (C11343h hVar : values) {
                hVarArr[(int) hVar.mo35309b()] = hVar;
            }
            return hVarArr;
        }

        /* renamed from: c */
        public static C11343h m55826c(long j) {
            C11343h[] hVarArr = f43566y;
            if (j >= ((long) hVarArr.length) || j < 0) {
                return null;
            }
            return hVarArr[(int) j];
        }

        /* renamed from: k */
        public static C12335j1 m55827k(long j) {
            C11343h c = m55826c(j);
            if (c != null) {
                return c.mo35310j();
            }
            C12335j1 h = C12335j1.m59102h(INTERNAL_ERROR.mo35310j().mo37026m().mo37033c());
            return h.mo37030q("Unrecognized HTTP/2 error code: " + j);
        }

        /* renamed from: b */
        public long mo35309b() {
            return (long) this.f43568a;
        }

        /* renamed from: j */
        public C12335j1 mo35310j() {
            return this.f43569b;
        }
    }

    /* renamed from: io.grpc.internal.r0$i */
    /* compiled from: GrpcUtil */
    static class C11344i implements C12411y0.C12415d<Long> {
        C11344i() {
        }

        /* renamed from: c */
        public Long mo35312b(String str) {
            C6431n.m37552e(str.length() > 0, "empty timeout");
            C6431n.m37552e(str.length() <= 9, "bad timeout format");
            long parseLong = Long.parseLong(str.substring(0, str.length() - 1));
            char charAt = str.charAt(str.length() - 1);
            if (charAt == 'H') {
                return Long.valueOf(TimeUnit.HOURS.toNanos(parseLong));
            }
            if (charAt == 'M') {
                return Long.valueOf(TimeUnit.MINUTES.toNanos(parseLong));
            }
            if (charAt == 'S') {
                return Long.valueOf(TimeUnit.SECONDS.toNanos(parseLong));
            }
            if (charAt == 'u') {
                return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(parseLong));
            }
            if (charAt == 'm') {
                return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(parseLong));
            }
            if (charAt == 'n') {
                return Long.valueOf(parseLong);
            }
            throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", new Object[]{Character.valueOf(charAt)}));
        }

        /* renamed from: d */
        public String mo35311a(Long l) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (l.longValue() < 0) {
                throw new IllegalArgumentException("Timeout too small");
            } else if (l.longValue() < 100000000) {
                return l + "n";
            } else if (l.longValue() < 100000000000L) {
                return timeUnit.toMicros(l.longValue()) + "u";
            } else if (l.longValue() < 100000000000000L) {
                return timeUnit.toMillis(l.longValue()) + "m";
            } else if (l.longValue() < 100000000000000000L) {
                return timeUnit.toSeconds(l.longValue()) + "S";
            } else if (l.longValue() < 6000000000000000000L) {
                return timeUnit.toMinutes(l.longValue()) + "M";
            } else {
                return timeUnit.toHours(l.longValue()) + "H";
            }
        }
    }

    static {
        C12411y0.C12415d<String> dVar = C12411y0.f45761e;
        f43531e = C12411y0.C12418g.m59361e("grpc-encoding", dVar);
        f43533g = C12411y0.C12418g.m59361e("content-encoding", dVar);
        f43535i = C12411y0.C12418g.m59361e("content-length", dVar);
        f43536j = C12411y0.C12418g.m59361e("content-type", dVar);
        f43537k = C12411y0.C12418g.m59361e("te", dVar);
        f43538l = C12411y0.C12418g.m59361e("user-agent", dVar);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f43540n = timeUnit.toNanos(20);
        f43542p = timeUnit.toNanos(20);
    }

    private C11335r0() {
    }

    /* renamed from: b */
    public static URI m55795b(String str) {
        C6431n.m37562o(str, "authority");
        try {
            return new URI((String) null, str, (String) null, (String) null, (String) null);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Invalid authority: " + str, e);
        }
    }

    /* renamed from: c */
    public static String m55796c(String str) {
        URI b = m55795b(str);
        boolean z = true;
        C6431n.m37557j(b.getHost() != null, "No host in authority '%s'", str);
        if (b.getUserInfo() != null) {
            z = false;
        }
        C6431n.m37557j(z, "Userinfo must not be present on authority: '%s'", str);
        return str;
    }

    /* renamed from: d */
    static void m55797d(C11274k2.C11275a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next != null) {
                m55798e(next);
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public static void m55798e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                f43527a.log(Level.WARNING, "exception caught in closeQuietly", e);
            }
        }
    }

    /* renamed from: f */
    public static C12340k[] m55799f(C12292c cVar, C12411y0 y0Var, int i, boolean z) {
        List<C12340k.C12341a> i2 = cVar.mo36964i();
        int size = i2.size() + 1;
        C12340k[] kVarArr = new C12340k[size];
        C12340k.C12342b a = C12340k.C12342b.m59135a().mo37044b(cVar).mo37046d(i).mo37045c(z).mo37043a();
        for (int i3 = 0; i3 < i2.size(); i3++) {
            kVarArr[i3] = i2.get(i3).mo35452a(a, y0Var);
        }
        kVarArr[size - 1] = f43546t;
        return kVarArr;
    }

    /* renamed from: g */
    public static String m55800g(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-");
        sb.append(str);
        sb.append('/');
        sb.append("1.50.2");
        return sb.toString();
    }

    /* renamed from: h */
    public static String m55801h(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    /* renamed from: i */
    public static ThreadFactory m55802i(String str, boolean z) {
        return new C10142f().mo32791e(z).mo32792f(str).mo32790b();
    }

    /* renamed from: j */
    static C11351s m55803j(C12376r0.C12382e eVar, boolean z) {
        C12376r0.C12386h c = eVar.mo37104c();
        C11351s a = c != null ? ((C11304n2) c.mo35165d()).mo35262a() : null;
        if (a != null) {
            C12340k.C12341a b = eVar.mo37103b();
            if (b == null) {
                return a;
            }
            return new C11341f(b, a);
        }
        if (!eVar.mo37102a().mo37028o()) {
            if (eVar.mo37105d()) {
                return new C11194g0(m55807n(eVar.mo37102a()), C11333r.C11334a.DROPPED);
            }
            if (!z) {
                return new C11194g0(m55807n(eVar.mo37102a()), C11333r.C11334a.PROCESSED);
            }
        }
        return null;
    }

    /* renamed from: k */
    private static C12335j1.C12337b m55804k(int i) {
        if (i >= 100 && i < 200) {
            return C12335j1.C12337b.INTERNAL;
        }
        if (i != 400) {
            if (i == 401) {
                return C12335j1.C12337b.UNAUTHENTICATED;
            }
            if (i == 403) {
                return C12335j1.C12337b.PERMISSION_DENIED;
            }
            if (i == 404) {
                return C12335j1.C12337b.UNIMPLEMENTED;
            }
            if (i != 429) {
                if (i != 431) {
                    switch (i) {
                        case 502:
                        case 503:
                        case 504:
                            break;
                        default:
                            return C12335j1.C12337b.UNKNOWN;
                    }
                }
            }
            return C12335j1.C12337b.UNAVAILABLE;
        }
        return C12335j1.C12337b.INTERNAL;
    }

    /* renamed from: l */
    public static C12335j1 m55805l(int i) {
        C12335j1 b = m55804k(i).mo37032b();
        return b.mo37030q("HTTP status code " + i);
    }

    /* renamed from: m */
    public static boolean m55806m(String str) {
        char charAt;
        if (str == null || 16 > str.length()) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith("application/grpc")) {
            return false;
        }
        if (lowerCase.length() == 16 || (charAt = lowerCase.charAt(16)) == '+' || charAt == ';') {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static C12335j1 m55807n(C12335j1 j1Var) {
        C6431n.m37551d(j1Var != null);
        if (!f43528b.contains(j1Var.mo37026m())) {
            return j1Var;
        }
        C12335j1 j1Var2 = C12335j1.f45620t;
        return j1Var2.mo37030q("Inappropriate status code from control plane: " + j1Var.mo37026m() + " " + j1Var.mo37027n()).mo37029p(j1Var.mo37025l());
    }

    /* renamed from: o */
    public static boolean m55808o(C12292c cVar) {
        return !Boolean.TRUE.equals(cVar.mo36963h(f43545s));
    }
}
