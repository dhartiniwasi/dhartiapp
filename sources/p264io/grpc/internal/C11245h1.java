package p264io.grpc.internal;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import p182a7.C6431n;
import p264io.grpc.internal.C11166e0;
import p343rc.C12276a1;
import p343rc.C12287b;
import p343rc.C12297c1;
import p343rc.C12302d0;
import p343rc.C12307e;
import p343rc.C12322g1;
import p343rc.C12323h;
import p343rc.C12364o;
import p343rc.C12399u0;
import p343rc.C12400v;
import p343rc.C12402v0;

/* renamed from: io.grpc.internal.h1 */
/* compiled from: ManagedChannelImplBuilder */
public final class C11245h1 extends C12402v0<C11245h1> {

    /* renamed from: H */
    private static final Logger f43278H = Logger.getLogger(C11245h1.class.getName());

    /* renamed from: I */
    static final long f43279I = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: J */
    static final long f43280J = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: K */
    private static final C11327p1<? extends Executor> f43281K = C11240g2.m55467c(C11335r0.f43547u);

    /* renamed from: L */
    private static final C12400v f43282L = C12400v.m59294c();

    /* renamed from: M */
    private static final C12364o f43283M = C12364o.m59179a();

    /* renamed from: A */
    private boolean f43284A;

    /* renamed from: B */
    private boolean f43285B;

    /* renamed from: C */
    private boolean f43286C;

    /* renamed from: D */
    private boolean f43287D;

    /* renamed from: E */
    private boolean f43288E;

    /* renamed from: F */
    private final C11248c f43289F;

    /* renamed from: G */
    private final C11247b f43290G;

    /* renamed from: a */
    C11327p1<? extends Executor> f43291a;

    /* renamed from: b */
    C11327p1<? extends Executor> f43292b;

    /* renamed from: c */
    private final List<C12323h> f43293c;

    /* renamed from: d */
    final C12297c1 f43294d;

    /* renamed from: e */
    C12276a1.C12281d f43295e;

    /* renamed from: f */
    final String f43296f;

    /* renamed from: g */
    final C12287b f43297g;

    /* renamed from: h */
    private final SocketAddress f43298h;

    /* renamed from: i */
    String f43299i;

    /* renamed from: j */
    String f43300j;

    /* renamed from: k */
    String f43301k;

    /* renamed from: l */
    boolean f43302l;

    /* renamed from: m */
    C12400v f43303m;

    /* renamed from: n */
    C12364o f43304n;

    /* renamed from: o */
    long f43305o;

    /* renamed from: p */
    int f43306p;

    /* renamed from: q */
    int f43307q;

    /* renamed from: r */
    long f43308r;

    /* renamed from: s */
    long f43309s;

    /* renamed from: t */
    boolean f43310t;

    /* renamed from: u */
    C12302d0 f43311u;

    /* renamed from: v */
    int f43312v;

    /* renamed from: w */
    Map<String, ?> f43313w;

    /* renamed from: x */
    boolean f43314x;

    /* renamed from: y */
    C12322g1 f43315y;

    /* renamed from: z */
    private boolean f43316z;

    /* renamed from: io.grpc.internal.h1$b */
    /* compiled from: ManagedChannelImplBuilder */
    public interface C11247b {
        /* renamed from: a */
        int mo35187a();
    }

    /* renamed from: io.grpc.internal.h1$c */
    /* compiled from: ManagedChannelImplBuilder */
    public interface C11248c {
        /* renamed from: a */
        C11358t mo35188a();
    }

    /* renamed from: io.grpc.internal.h1$d */
    /* compiled from: ManagedChannelImplBuilder */
    private static final class C11249d implements C11247b {
        private C11249d() {
        }

        /* renamed from: a */
        public int mo35187a() {
            return 443;
        }
    }

    public C11245h1(String str, C11248c cVar, C11247b bVar) {
        this(str, (C12307e) null, (C12287b) null, cVar, bVar);
    }

    /* renamed from: a */
    public C12399u0 mo34948a() {
        return new C11253i1(new C11195g1(this, this.f43289F.mo35188a(), new C11166e0.C11167a(), C11240g2.m55467c(C11335r0.f43547u), C11335r0.f43549w, mo35186f(), C11287l2.f43399a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo35185e() {
        return this.f43290G.mo35187a();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cc  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<p343rc.C12323h> mo35186f() {
        /*
            r13 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<rc.h> r1 = r13.f43293c
            r0.<init>(r1)
            java.util.List r1 = p343rc.C12324h0.m59076a()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0014
            r0.addAll(r1)
            r1 = 1
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            java.lang.String r4 = "getClientInterceptor"
            r5 = 0
            java.lang.String r6 = "Unable to apply census stats"
            if (r1 != 0) goto L_0x008b
            boolean r7 = r13.f43316z
            if (r7 == 0) goto L_0x008b
            java.lang.String r7 = "io.grpc.census.InternalCensusStatsAccessor"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            r8 = 4
            java.lang.Class[] r9 = new java.lang.Class[r8]     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            java.lang.Class r10 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            r9[r3] = r10     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            r9[r2] = r10     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            r11 = 2
            r9[r11] = r10     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            r12 = 3
            r9[r12] = r10     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            java.lang.reflect.Method r7 = r7.getDeclaredMethod(r4, r9)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            boolean r9 = r13.f43284A     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            r8[r3] = r9     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            boolean r9 = r13.f43285B     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            r8[r2] = r9     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            boolean r2 = r13.f43286C     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            r8[r11] = r2     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            boolean r2 = r13.f43287D     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            r8[r12] = r2     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            java.lang.Object r2 = r7.invoke(r5, r8)     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            rc.h r2 = (p343rc.C12323h) r2     // Catch:{ ClassNotFoundException -> 0x007d, NoSuchMethodException -> 0x0074, IllegalAccessException -> 0x006b, InvocationTargetException -> 0x0062 }
            goto L_0x0086
        L_0x0062:
            r2 = move-exception
            java.util.logging.Logger r7 = f43278H
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            r7.log(r8, r6, r2)
            goto L_0x0085
        L_0x006b:
            r2 = move-exception
            java.util.logging.Logger r7 = f43278H
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            r7.log(r8, r6, r2)
            goto L_0x0085
        L_0x0074:
            r2 = move-exception
            java.util.logging.Logger r7 = f43278H
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            r7.log(r8, r6, r2)
            goto L_0x0085
        L_0x007d:
            r2 = move-exception
            java.util.logging.Logger r7 = f43278H
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            r7.log(r8, r6, r2)
        L_0x0085:
            r2 = r5
        L_0x0086:
            if (r2 == 0) goto L_0x008b
            r0.add(r3, r2)
        L_0x008b:
            if (r1 != 0) goto L_0x00cf
            boolean r1 = r13.f43288E
            if (r1 == 0) goto L_0x00cf
            java.lang.String r1 = "io.grpc.census.InternalCensusTracingAccessor"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x00c2, NoSuchMethodException -> 0x00b9, IllegalAccessException -> 0x00b0, InvocationTargetException -> 0x00a7 }
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x00c2, NoSuchMethodException -> 0x00b9, IllegalAccessException -> 0x00b0, InvocationTargetException -> 0x00a7 }
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r4, r2)     // Catch:{ ClassNotFoundException -> 0x00c2, NoSuchMethodException -> 0x00b9, IllegalAccessException -> 0x00b0, InvocationTargetException -> 0x00a7 }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x00c2, NoSuchMethodException -> 0x00b9, IllegalAccessException -> 0x00b0, InvocationTargetException -> 0x00a7 }
            java.lang.Object r1 = r1.invoke(r5, r2)     // Catch:{ ClassNotFoundException -> 0x00c2, NoSuchMethodException -> 0x00b9, IllegalAccessException -> 0x00b0, InvocationTargetException -> 0x00a7 }
            rc.h r1 = (p343rc.C12323h) r1     // Catch:{ ClassNotFoundException -> 0x00c2, NoSuchMethodException -> 0x00b9, IllegalAccessException -> 0x00b0, InvocationTargetException -> 0x00a7 }
            r5 = r1
            goto L_0x00ca
        L_0x00a7:
            r1 = move-exception
            java.util.logging.Logger r2 = f43278H
            java.util.logging.Level r4 = java.util.logging.Level.FINE
            r2.log(r4, r6, r1)
            goto L_0x00ca
        L_0x00b0:
            r1 = move-exception
            java.util.logging.Logger r2 = f43278H
            java.util.logging.Level r4 = java.util.logging.Level.FINE
            r2.log(r4, r6, r1)
            goto L_0x00ca
        L_0x00b9:
            r1 = move-exception
            java.util.logging.Logger r2 = f43278H
            java.util.logging.Level r4 = java.util.logging.Level.FINE
            r2.log(r4, r6, r1)
            goto L_0x00ca
        L_0x00c2:
            r1 = move-exception
            java.util.logging.Logger r2 = f43278H
            java.util.logging.Level r4 = java.util.logging.Level.FINE
            r2.log(r4, r6, r1)
        L_0x00ca:
            if (r5 == 0) goto L_0x00cf
            r0.add(r3, r5)
        L_0x00cf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11245h1.mo35186f():java.util.List");
    }

    public C11245h1(String str, C12307e eVar, C12287b bVar, C11248c cVar, C11247b bVar2) {
        C11327p1<? extends Executor> p1Var = f43281K;
        this.f43291a = p1Var;
        this.f43292b = p1Var;
        this.f43293c = new ArrayList();
        C12297c1 d = C12297c1.m59022d();
        this.f43294d = d;
        this.f43295e = d.mo36989c();
        this.f43301k = "pick_first";
        this.f43303m = f43282L;
        this.f43304n = f43283M;
        this.f43305o = f43279I;
        this.f43306p = 5;
        this.f43307q = 5;
        this.f43308r = 16777216;
        this.f43309s = 1048576;
        this.f43310t = true;
        this.f43311u = C12302d0.m59038g();
        this.f43314x = true;
        this.f43316z = true;
        this.f43284A = true;
        this.f43285B = true;
        this.f43286C = false;
        this.f43287D = true;
        this.f43288E = true;
        this.f43296f = (String) C6431n.m37562o(str, "target");
        this.f43297g = bVar;
        this.f43289F = (C11248c) C6431n.m37562o(cVar, "clientTransportFactoryBuilder");
        this.f43298h = null;
        if (bVar2 != null) {
            this.f43290G = bVar2;
        } else {
            this.f43290G = new C11249d();
        }
    }
}
