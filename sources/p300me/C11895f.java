package p300me;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p253he.C10540b;
import p253he.C10543e;
import p300me.C11913h;
import p309ne.C12008f;
import p336qe.C12231c;
import p336qe.C12233d;
import p336qe.C12234e;
import p336qe.C12235f;

/* renamed from: me.f */
/* compiled from: Http2Connection */
public final class C11895f implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: H */
    public static final ExecutorService f44679H = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C10543e.m53035H("OkHttp Http2Connection", true));

    /* renamed from: A */
    long f44680A;

    /* renamed from: B */
    C11925m f44681B = new C11925m();

    /* renamed from: C */
    final C11925m f44682C;

    /* renamed from: D */
    final Socket f44683D;

    /* renamed from: E */
    final C11920j f44684E;

    /* renamed from: F */
    final C11908l f44685F;

    /* renamed from: G */
    final Set<Integer> f44686G;

    /* renamed from: a */
    final boolean f44687a;

    /* renamed from: b */
    final C11905j f44688b;

    /* renamed from: c */
    final Map<Integer, C11916i> f44689c = new LinkedHashMap();

    /* renamed from: d */
    final String f44690d;

    /* renamed from: e */
    int f44691e;

    /* renamed from: f */
    int f44692f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f44693g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final ScheduledExecutorService f44694h;

    /* renamed from: i */
    private final ExecutorService f44695i;

    /* renamed from: r */
    final C11923l f44696r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public long f44697s = 0;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public long f44698t = 0;

    /* renamed from: u */
    private long f44699u = 0;

    /* renamed from: v */
    private long f44700v = 0;

    /* renamed from: w */
    private long f44701w = 0;

    /* renamed from: x */
    private long f44702x = 0;

    /* renamed from: y */
    private long f44703y = 0;

    /* renamed from: z */
    long f44704z = 0;

    /* renamed from: me.f$a */
    /* compiled from: Http2Connection */
    class C11896a extends C10540b {

        /* renamed from: b */
        final /* synthetic */ int f44705b;

        /* renamed from: c */
        final /* synthetic */ C11889b f44706c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11896a(String str, Object[] objArr, int i, C11889b bVar) {
            super(str, objArr);
            this.f44705b = i;
            this.f44706c = bVar;
        }

        /* renamed from: a */
        public void mo33250a() {
            try {
                C11895f.this.mo36175y0(this.f44705b, this.f44706c);
            } catch (IOException e) {
                C11895f.this.m57434D(e);
            }
        }
    }

    /* renamed from: me.f$b */
    /* compiled from: Http2Connection */
    class C11897b extends C10540b {

        /* renamed from: b */
        final /* synthetic */ int f44708b;

        /* renamed from: c */
        final /* synthetic */ long f44709c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11897b(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            this.f44708b = i;
            this.f44709c = j;
        }

        /* renamed from: a */
        public void mo33250a() {
            try {
                C11895f.this.f44684E.mo36218c(this.f44708b, this.f44709c);
            } catch (IOException e) {
                C11895f.this.m57434D(e);
            }
        }
    }

    /* renamed from: me.f$c */
    /* compiled from: Http2Connection */
    class C11898c extends C10540b {
        C11898c(String str, Object... objArr) {
            super(str, objArr);
        }

        /* renamed from: a */
        public void mo33250a() {
            C11895f.this.mo36173v0(false, 2, 0);
        }
    }

    /* renamed from: me.f$d */
    /* compiled from: Http2Connection */
    class C11899d extends C10540b {

        /* renamed from: b */
        final /* synthetic */ int f44712b;

        /* renamed from: c */
        final /* synthetic */ List f44713c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11899d(String str, Object[] objArr, int i, List list) {
            super(str, objArr);
            this.f44712b = i;
            this.f44713c = list;
        }

        /* renamed from: a */
        public void mo33250a() {
            if (C11895f.this.f44696r.mo36233b(this.f44712b, this.f44713c)) {
                try {
                    C11895f.this.f44684E.mo36226n(this.f44712b, C11889b.CANCEL);
                    synchronized (C11895f.this) {
                        C11895f.this.f44686G.remove(Integer.valueOf(this.f44712b));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* renamed from: me.f$e */
    /* compiled from: Http2Connection */
    class C11900e extends C10540b {

        /* renamed from: b */
        final /* synthetic */ int f44715b;

        /* renamed from: c */
        final /* synthetic */ List f44716c;

        /* renamed from: d */
        final /* synthetic */ boolean f44717d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11900e(String str, Object[] objArr, int i, List list, boolean z) {
            super(str, objArr);
            this.f44715b = i;
            this.f44716c = list;
            this.f44717d = z;
        }

        /* renamed from: a */
        public void mo33250a() {
            boolean c = C11895f.this.f44696r.mo36234c(this.f44715b, this.f44716c, this.f44717d);
            if (c) {
                try {
                    C11895f.this.f44684E.mo36226n(this.f44715b, C11889b.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (c || this.f44717d) {
                synchronized (C11895f.this) {
                    C11895f.this.f44686G.remove(Integer.valueOf(this.f44715b));
                }
            }
        }
    }

    /* renamed from: me.f$f */
    /* compiled from: Http2Connection */
    class C11901f extends C10540b {

        /* renamed from: b */
        final /* synthetic */ int f44719b;

        /* renamed from: c */
        final /* synthetic */ C12231c f44720c;

        /* renamed from: d */
        final /* synthetic */ int f44721d;

        /* renamed from: e */
        final /* synthetic */ boolean f44722e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11901f(String str, Object[] objArr, int i, C12231c cVar, int i2, boolean z) {
            super(str, objArr);
            this.f44719b = i;
            this.f44720c = cVar;
            this.f44721d = i2;
            this.f44722e = z;
        }

        /* renamed from: a */
        public void mo33250a() {
            try {
                boolean d = C11895f.this.f44696r.mo36235d(this.f44719b, this.f44720c, this.f44721d, this.f44722e);
                if (d) {
                    C11895f.this.f44684E.mo36226n(this.f44719b, C11889b.CANCEL);
                }
                if (d || this.f44722e) {
                    synchronized (C11895f.this) {
                        C11895f.this.f44686G.remove(Integer.valueOf(this.f44719b));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: me.f$g */
    /* compiled from: Http2Connection */
    class C11902g extends C10540b {

        /* renamed from: b */
        final /* synthetic */ int f44724b;

        /* renamed from: c */
        final /* synthetic */ C11889b f44725c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11902g(String str, Object[] objArr, int i, C11889b bVar) {
            super(str, objArr);
            this.f44724b = i;
            this.f44725c = bVar;
        }

        /* renamed from: a */
        public void mo33250a() {
            C11895f.this.f44696r.mo36232a(this.f44724b, this.f44725c);
            synchronized (C11895f.this) {
                C11895f.this.f44686G.remove(Integer.valueOf(this.f44724b));
            }
        }
    }

    /* renamed from: me.f$h */
    /* compiled from: Http2Connection */
    public static class C11903h {

        /* renamed from: a */
        Socket f44727a;

        /* renamed from: b */
        String f44728b;

        /* renamed from: c */
        C12234e f44729c;

        /* renamed from: d */
        C12233d f44730d;

        /* renamed from: e */
        C11905j f44731e = C11905j.f44736a;

        /* renamed from: f */
        C11923l f44732f = C11923l.f44807a;

        /* renamed from: g */
        boolean f44733g;

        /* renamed from: h */
        int f44734h;

        public C11903h(boolean z) {
            this.f44733g = z;
        }

        /* renamed from: a */
        public C11895f mo36176a() {
            return new C11895f(this);
        }

        /* renamed from: b */
        public C11903h mo36177b(C11905j jVar) {
            this.f44731e = jVar;
            return this;
        }

        /* renamed from: c */
        public C11903h mo36178c(int i) {
            this.f44734h = i;
            return this;
        }

        /* renamed from: d */
        public C11903h mo36179d(Socket socket, String str, C12234e eVar, C12233d dVar) {
            this.f44727a = socket;
            this.f44728b = str;
            this.f44729c = eVar;
            this.f44730d = dVar;
            return this;
        }
    }

    /* renamed from: me.f$i */
    /* compiled from: Http2Connection */
    final class C11904i extends C10540b {
        C11904i() {
            super("OkHttp %s ping", C11895f.this.f44690d);
        }

        /* renamed from: a */
        public void mo33250a() {
            boolean z;
            synchronized (C11895f.this) {
                if (C11895f.this.f44698t < C11895f.this.f44697s) {
                    z = true;
                } else {
                    C11895f.m57441h(C11895f.this);
                    z = false;
                }
            }
            if (z) {
                C11895f.this.m57434D((IOException) null);
            } else {
                C11895f.this.mo36173v0(false, 1, 0);
            }
        }
    }

    /* renamed from: me.f$j */
    /* compiled from: Http2Connection */
    public static abstract class C11905j {

        /* renamed from: a */
        public static final C11905j f44736a = new C11906a();

        /* renamed from: me.f$j$a */
        /* compiled from: Http2Connection */
        class C11906a extends C11905j {
            C11906a() {
            }

            /* renamed from: b */
            public void mo35702b(C11916i iVar) throws IOException {
                iVar.mo36197d(C11889b.REFUSED_STREAM, (IOException) null);
            }
        }

        /* renamed from: a */
        public void mo35701a(C11895f fVar) {
        }

        /* renamed from: b */
        public abstract void mo35702b(C11916i iVar) throws IOException;
    }

    /* renamed from: me.f$k */
    /* compiled from: Http2Connection */
    final class C11907k extends C10540b {

        /* renamed from: b */
        final boolean f44737b;

        /* renamed from: c */
        final int f44738c;

        /* renamed from: d */
        final int f44739d;

        C11907k(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", C11895f.this.f44690d, Integer.valueOf(i), Integer.valueOf(i2));
            this.f44737b = z;
            this.f44738c = i;
            this.f44739d = i2;
        }

        /* renamed from: a */
        public void mo33250a() {
            C11895f.this.mo36173v0(this.f44737b, this.f44738c, this.f44739d);
        }
    }

    /* renamed from: me.f$l */
    /* compiled from: Http2Connection */
    class C11908l extends C10540b implements C11913h.C11915b {

        /* renamed from: b */
        final C11913h f44741b;

        /* renamed from: me.f$l$a */
        /* compiled from: Http2Connection */
        class C11909a extends C10540b {

            /* renamed from: b */
            final /* synthetic */ C11916i f44743b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C11909a(String str, Object[] objArr, C11916i iVar) {
                super(str, objArr);
                this.f44743b = iVar;
            }

            /* renamed from: a */
            public void mo33250a() {
                try {
                    C11895f.this.f44688b.mo35702b(this.f44743b);
                } catch (IOException e) {
                    C12008f l = C12008f.m57887l();
                    l.mo36363s(4, "Http2Connection.Listener failure for " + C11895f.this.f44690d, e);
                    try {
                        this.f44743b.mo36197d(C11889b.PROTOCOL_ERROR, e);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* renamed from: me.f$l$b */
        /* compiled from: Http2Connection */
        class C11910b extends C10540b {

            /* renamed from: b */
            final /* synthetic */ boolean f44745b;

            /* renamed from: c */
            final /* synthetic */ C11925m f44746c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C11910b(String str, Object[] objArr, boolean z, C11925m mVar) {
                super(str, objArr);
                this.f44745b = z;
                this.f44746c = mVar;
            }

            /* renamed from: a */
            public void mo33250a() {
                C11908l.this.mo36180b(this.f44745b, this.f44746c);
            }
        }

        /* renamed from: me.f$l$c */
        /* compiled from: Http2Connection */
        class C11911c extends C10540b {
            C11911c(String str, Object... objArr) {
                super(str, objArr);
            }

            /* renamed from: a */
            public void mo33250a() {
                C11895f fVar = C11895f.this;
                fVar.f44688b.mo35701a(fVar);
            }
        }

        C11908l(C11913h hVar) {
            super("OkHttp %s", C11895f.this.f44690d);
            this.f44741b = hVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo33250a() {
            C11889b bVar;
            C11889b bVar2 = C11889b.INTERNAL_ERROR;
            e = null;
            try {
                this.f44741b.mo36193f(this);
                while (this.f44741b.mo36191b(false, this)) {
                }
                bVar = C11889b.NO_ERROR;
                try {
                    C11895f.this.mo36174x(bVar, C11889b.CANCEL, (IOException) null);
                } catch (IOException e) {
                    e = e;
                    try {
                        C11889b bVar3 = C11889b.PROTOCOL_ERROR;
                        C11895f.this.mo36174x(bVar3, bVar3, e);
                        C10543e.m53045f(this.f44741b);
                    } catch (Throwable th) {
                        th = th;
                        C11895f.this.mo36174x(bVar, bVar2, e);
                        C10543e.m53045f(this.f44741b);
                        throw th;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                bVar = bVar2;
                C11889b bVar32 = C11889b.PROTOCOL_ERROR;
                C11895f.this.mo36174x(bVar32, bVar32, e);
                C10543e.m53045f(this.f44741b);
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                C11895f.this.mo36174x(bVar, bVar2, e);
                C10543e.m53045f(this.f44741b);
                throw th;
            }
            C10543e.m53045f(this.f44741b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo36180b(boolean z, C11925m mVar) {
            C11916i[] iVarArr;
            long j;
            synchronized (C11895f.this.f44684E) {
                synchronized (C11895f.this) {
                    int d = C11895f.this.f44682C.mo36239d();
                    if (z) {
                        C11895f.this.f44682C.mo36236a();
                    }
                    C11895f.this.f44682C.mo36243h(mVar);
                    int d2 = C11895f.this.f44682C.mo36239d();
                    iVarArr = null;
                    if (d2 == -1 || d2 == d) {
                        j = 0;
                    } else {
                        j = (long) (d2 - d);
                        if (!C11895f.this.f44689c.isEmpty()) {
                            iVarArr = (C11916i[]) C11895f.this.f44689c.values().toArray(new C11916i[C11895f.this.f44689c.size()]);
                        }
                    }
                }
                try {
                    C11895f fVar = C11895f.this;
                    fVar.f44684E.mo36215a(fVar.f44682C);
                } catch (IOException e) {
                    C11895f.this.m57434D(e);
                }
            }
            if (iVarArr != null) {
                for (C11916i iVar : iVarArr) {
                    synchronized (iVar) {
                        iVar.mo36194a(j);
                    }
                }
            }
            C11895f.f44679H.execute(new C11911c("OkHttp %s settings", C11895f.this.f44690d));
        }

        /* renamed from: c */
        public void mo36181c(int i, long j) {
            if (i == 0) {
                synchronized (C11895f.this) {
                    C11895f fVar = C11895f.this;
                    fVar.f44680A += j;
                    fVar.notifyAll();
                }
                return;
            }
            C11916i F = C11895f.this.mo36154F(i);
            if (F != null) {
                synchronized (F) {
                    F.mo36194a(j);
                }
            }
        }

        /* renamed from: i */
        public void mo36182i(boolean z, int i, int i2) {
            if (z) {
                synchronized (C11895f.this) {
                    if (i == 1) {
                        try {
                            C11895f.m57439f(C11895f.this);
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else if (i == 2) {
                        C11895f.m57446t(C11895f.this);
                    } else if (i == 3) {
                        C11895f.m57447w(C11895f.this);
                        C11895f.this.notifyAll();
                    }
                }
                return;
            }
            try {
                C11895f.this.f44694h.execute(new C11907k(true, i, i2));
            } catch (RejectedExecutionException unused) {
            }
        }

        /* renamed from: j */
        public void mo36183j() {
        }

        /* renamed from: k */
        public void mo36184k(boolean z, int i, C12234e eVar, int i2) throws IOException {
            if (C11895f.this.mo36162Y(i)) {
                C11895f.this.mo36158L(i, eVar, i2, z);
                return;
            }
            C11916i F = C11895f.this.mo36154F(i);
            if (F == null) {
                C11895f.this.mo36152B0(i, C11889b.PROTOCOL_ERROR);
                long j = (long) i2;
                C11895f.this.mo36170r0(j);
                eVar.skip(j);
                return;
            }
            F.mo36205m(eVar, i2);
            if (z) {
                F.mo36206n(C10543e.f41562c, true);
            }
        }

        /* renamed from: l */
        public void mo36185l(int i, int i2, int i3, boolean z) {
        }

        /* renamed from: m */
        public void mo36186m(int i, int i2, List<C11890c> list) {
            C11895f.this.mo36160U(i2, list);
        }

        /* renamed from: n */
        public void mo36187n(int i, C11889b bVar, C12235f fVar) {
            C11916i[] iVarArr;
            fVar.mo36846w();
            synchronized (C11895f.this) {
                iVarArr = (C11916i[]) C11895f.this.f44689c.values().toArray(new C11916i[C11895f.this.f44689c.size()]);
                boolean unused = C11895f.this.f44693g = true;
            }
            for (C11916i iVar : iVarArr) {
                if (iVar.mo36199g() > i && iVar.mo36202j()) {
                    iVar.mo36207o(C11889b.REFUSED_STREAM);
                    C11895f.this.mo36163c0(iVar.mo36199g());
                }
            }
        }

        /* renamed from: o */
        public void mo36188o(boolean z, int i, int i2, List<C11890c> list) {
            if (C11895f.this.mo36162Y(i)) {
                C11895f.this.mo36159S(i, list, z);
                return;
            }
            synchronized (C11895f.this) {
                C11916i F = C11895f.this.mo36154F(i);
                if (F != null) {
                    F.mo36206n(C10543e.m53037J(list), z);
                } else if (!C11895f.this.f44693g) {
                    C11895f fVar = C11895f.this;
                    if (i > fVar.f44691e) {
                        if (i % 2 != fVar.f44692f % 2) {
                            int i3 = i;
                            C11916i iVar = new C11916i(i3, C11895f.this, false, z, C10543e.m53037J(list));
                            C11895f fVar2 = C11895f.this;
                            fVar2.f44691e = i;
                            fVar2.f44689c.put(Integer.valueOf(i), iVar);
                            C11895f.f44679H.execute(new C11909a("OkHttp %s stream %d", new Object[]{C11895f.this.f44690d, Integer.valueOf(i)}, iVar));
                        }
                    }
                }
            }
        }

        /* renamed from: p */
        public void mo36189p(int i, C11889b bVar) {
            if (C11895f.this.mo36162Y(i)) {
                C11895f.this.mo36161X(i, bVar);
                return;
            }
            C11916i c0 = C11895f.this.mo36163c0(i);
            if (c0 != null) {
                c0.mo36207o(bVar);
            }
        }

        /* renamed from: q */
        public void mo36190q(boolean z, C11925m mVar) {
            try {
                C11895f.this.f44694h.execute(new C11910b("OkHttp %s ACK Settings", new Object[]{C11895f.this.f44690d}, z, mVar));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    static {
        Class<C11895f> cls = C11895f.class;
    }

    C11895f(C11903h hVar) {
        C11903h hVar2 = hVar;
        C11925m mVar = new C11925m();
        this.f44682C = mVar;
        this.f44686G = new LinkedHashSet();
        this.f44696r = hVar2.f44732f;
        boolean z = hVar2.f44733g;
        this.f44687a = z;
        this.f44688b = hVar2.f44731e;
        int i = z ? 1 : 2;
        this.f44692f = i;
        if (z) {
            this.f44692f = i + 2;
        }
        if (z) {
            this.f44681B.mo36244i(7, 16777216);
        }
        String str = hVar2.f44728b;
        this.f44690d = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, C10543e.m53035H(C10543e.m53055p("OkHttp %s Writer", str), false));
        this.f44694h = scheduledThreadPoolExecutor;
        if (hVar2.f44734h != 0) {
            C11904i iVar = new C11904i();
            int i2 = hVar2.f44734h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, (long) i2, (long) i2, TimeUnit.MILLISECONDS);
        }
        this.f44695i = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C10543e.m53035H(C10543e.m53055p("OkHttp %s Push Observer", str), true));
        mVar.mo36244i(7, 65535);
        mVar.mo36244i(5, 16384);
        this.f44680A = (long) mVar.mo36239d();
        this.f44683D = hVar2.f44727a;
        this.f44684E = new C11920j(hVar2.f44730d, z);
        this.f44685F = new C11908l(new C11913h(hVar2.f44729c, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public void m57434D(IOException iOException) {
        C11889b bVar = C11889b.PROTOCOL_ERROR;
        mo36174x(bVar, bVar, iOException);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p300me.C11916i m57435I(int r11, java.util.List<p300me.C11890c> r12, boolean r13) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            me.j r7 = r10.f44684E
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0076 }
            int r0 = r10.f44692f     // Catch:{ all -> 0x0073 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0013
            me.b r0 = p300me.C11889b.REFUSED_STREAM     // Catch:{ all -> 0x0073 }
            r10.mo36166f0(r0)     // Catch:{ all -> 0x0073 }
        L_0x0013:
            boolean r0 = r10.f44693g     // Catch:{ all -> 0x0073 }
            if (r0 != 0) goto L_0x006d
            int r8 = r10.f44692f     // Catch:{ all -> 0x0073 }
            int r0 = r8 + 2
            r10.f44692f = r0     // Catch:{ all -> 0x0073 }
            me.i r9 = new me.i     // Catch:{ all -> 0x0073 }
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0073 }
            if (r13 == 0) goto L_0x003a
            long r0 = r10.f44680A     // Catch:{ all -> 0x0073 }
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x003a
            long r0 = r9.f44769b     // Catch:{ all -> 0x0073 }
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r13 = 0
            goto L_0x003b
        L_0x003a:
            r13 = 1
        L_0x003b:
            boolean r0 = r9.mo36203k()     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x004a
            java.util.Map<java.lang.Integer, me.i> r0 = r10.f44689c     // Catch:{ all -> 0x0073 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0073 }
            r0.put(r1, r9)     // Catch:{ all -> 0x0073 }
        L_0x004a:
            monitor-exit(r10)     // Catch:{ all -> 0x0073 }
            if (r11 != 0) goto L_0x0053
            me.j r11 = r10.f44684E     // Catch:{ all -> 0x0076 }
            r11.mo36223h(r6, r8, r12)     // Catch:{ all -> 0x0076 }
            goto L_0x005c
        L_0x0053:
            boolean r0 = r10.f44687a     // Catch:{ all -> 0x0076 }
            if (r0 != 0) goto L_0x0065
            me.j r0 = r10.f44684E     // Catch:{ all -> 0x0076 }
            r0.mo36225m(r11, r8, r12)     // Catch:{ all -> 0x0076 }
        L_0x005c:
            monitor-exit(r7)     // Catch:{ all -> 0x0076 }
            if (r13 == 0) goto L_0x0064
            me.j r11 = r10.f44684E
            r11.flush()
        L_0x0064:
            return r9
        L_0x0065:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0076 }
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch:{ all -> 0x0076 }
            throw r11     // Catch:{ all -> 0x0076 }
        L_0x006d:
            me.a r11 = new me.a     // Catch:{ all -> 0x0073 }
            r11.<init>()     // Catch:{ all -> 0x0073 }
            throw r11     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0073 }
            throw r11     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r11 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0076 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p300me.C11895f.m57435I(int, java.util.List, boolean):me.i");
    }

    /* renamed from: Q */
    private synchronized void m57436Q(C10540b bVar) {
        if (!this.f44693g) {
            this.f44695i.execute(bVar);
        }
    }

    /* renamed from: f */
    static /* synthetic */ long m57439f(C11895f fVar) {
        long j = fVar.f44698t;
        fVar.f44698t = 1 + j;
        return j;
    }

    /* renamed from: h */
    static /* synthetic */ long m57441h(C11895f fVar) {
        long j = fVar.f44697s;
        fVar.f44697s = 1 + j;
        return j;
    }

    /* renamed from: t */
    static /* synthetic */ long m57446t(C11895f fVar) {
        long j = fVar.f44700v;
        fVar.f44700v = 1 + j;
        return j;
    }

    /* renamed from: w */
    static /* synthetic */ long m57447w(C11895f fVar) {
        long j = fVar.f44702x;
        fVar.f44702x = 1 + j;
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B0 */
    public void mo36152B0(int i, C11889b bVar) {
        try {
            this.f44694h.execute(new C11896a("OkHttp %s stream %d", new Object[]{this.f44690d, Integer.valueOf(i)}, i, bVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E0 */
    public void mo36153E0(int i, long j) {
        try {
            this.f44694h.execute(new C11897b("OkHttp Window Update %s stream %d", new Object[]{this.f44690d, Integer.valueOf(i)}, i, j));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public synchronized C11916i mo36154F(int i) {
        return this.f44689c.get(Integer.valueOf(i));
    }

    /* renamed from: G */
    public synchronized boolean mo36155G(long j) {
        if (this.f44693g) {
            return false;
        }
        if (this.f44700v >= this.f44699u || j < this.f44703y) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public synchronized int mo36156H() {
        return this.f44682C.mo36240e(Integer.MAX_VALUE);
    }

    /* renamed from: K */
    public C11916i mo36157K(List<C11890c> list, boolean z) throws IOException {
        return m57435I(0, list, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo36158L(int i, C12234e eVar, int i2, boolean z) throws IOException {
        C12231c cVar = new C12231c();
        long j = (long) i2;
        eVar.mo36825y1(j);
        eVar.mo33810z(cVar, j);
        if (cVar.mo36771I() == j) {
            m57436Q(new C11901f("OkHttp %s Push Data[%s]", new Object[]{this.f44690d, Integer.valueOf(i)}, i, cVar, i2, z));
            return;
        }
        throw new IOException(cVar.mo36771I() + " != " + i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo36159S(int i, List<C11890c> list, boolean z) {
        try {
            m57436Q(new C11900e("OkHttp %s Push Headers[%s]", new Object[]{this.f44690d, Integer.valueOf(i)}, i, list, z));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo36160U(int i, List<C11890c> list) {
        synchronized (this) {
            if (this.f44686G.contains(Integer.valueOf(i))) {
                mo36152B0(i, C11889b.PROTOCOL_ERROR);
                return;
            }
            this.f44686G.add(Integer.valueOf(i));
            try {
                m57436Q(new C11899d("OkHttp %s Push Request[%s]", new Object[]{this.f44690d, Integer.valueOf(i)}, i, list));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo36161X(int i, C11889b bVar) {
        m57436Q(new C11902g("OkHttp %s Push Reset[%s]", new Object[]{this.f44690d, Integer.valueOf(i)}, i, bVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public boolean mo36162Y(int i) {
        return i != 0 && (i & 1) == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public synchronized C11916i mo36163c0(int i) {
        C11916i remove;
        remove = this.f44689c.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    public void close() {
        mo36174x(C11889b.NO_ERROR, C11889b.CANCEL, (IOException) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void mo36165d0() {
        synchronized (this) {
            long j = this.f44700v;
            long j2 = this.f44699u;
            if (j >= j2) {
                this.f44699u = j2 + 1;
                this.f44703y = System.nanoTime() + 1000000000;
                try {
                    this.f44694h.execute(new C11898c("OkHttp %s ping", this.f44690d));
                } catch (RejectedExecutionException unused) {
                }
            }
        }
    }

    /* renamed from: f0 */
    public void mo36166f0(C11889b bVar) throws IOException {
        synchronized (this.f44684E) {
            synchronized (this) {
                if (!this.f44693g) {
                    this.f44693g = true;
                    int i = this.f44691e;
                    this.f44684E.mo36222g(i, bVar, C10543e.f41560a);
                }
            }
        }
    }

    public void flush() throws IOException {
        this.f44684E.flush();
    }

    /* renamed from: i0 */
    public void mo36168i0() throws IOException {
        mo36169k0(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public void mo36169k0(boolean z) throws IOException {
        if (z) {
            this.f44684E.mo36217b0();
            this.f44684E.mo36227p(this.f44681B);
            int d = this.f44681B.mo36239d();
            if (d != 65535) {
                this.f44684E.mo36218c(0, (long) (d - 65535));
            }
        }
        new Thread(this.f44685F).start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r0 */
    public synchronized void mo36170r0(long j) {
        long j2 = this.f44704z + j;
        this.f44704z = j2;
        if (j2 >= ((long) (this.f44681B.mo36239d() / 2))) {
            mo36153E0(0, this.f44704z);
            this.f44704z = 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.f44684E.mo36228t1());
        r6 = (long) r3;
        r8.f44680A -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0058 */
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36171t0(int r9, boolean r10, p336qe.C12231c r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            me.j r12 = r8.f44684E
            r12.mo36214L0(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0067
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.f44680A     // Catch:{ InterruptedException -> 0x0058 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0030
            java.util.Map<java.lang.Integer, me.i> r3 = r8.f44689c     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0058 }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x0058 }
            if (r3 == 0) goto L_0x0028
            r8.wait()     // Catch:{ InterruptedException -> 0x0058 }
            goto L_0x0012
        L_0x0028:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0058 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0058 }
            throw r9     // Catch:{ InterruptedException -> 0x0058 }
        L_0x0030:
            long r3 = java.lang.Math.min(r12, r3)     // Catch:{ all -> 0x0056 }
            int r4 = (int) r3     // Catch:{ all -> 0x0056 }
            me.j r3 = r8.f44684E     // Catch:{ all -> 0x0056 }
            int r3 = r3.mo36228t1()     // Catch:{ all -> 0x0056 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0056 }
            long r4 = r8.f44680A     // Catch:{ all -> 0x0056 }
            long r6 = (long) r3     // Catch:{ all -> 0x0056 }
            long r4 = r4 - r6
            r8.f44680A = r4     // Catch:{ all -> 0x0056 }
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            long r12 = r12 - r6
            me.j r4 = r8.f44684E
            if (r10 == 0) goto L_0x0051
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0051
            r5 = 1
            goto L_0x0052
        L_0x0051:
            r5 = 0
        L_0x0052:
            r4.mo36214L0(r5, r9, r11, r3)
            goto L_0x000d
        L_0x0056:
            r9 = move-exception
            goto L_0x0065
        L_0x0058:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0056 }
            r9.interrupt()     // Catch:{ all -> 0x0056 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0056 }
            r9.<init>()     // Catch:{ all -> 0x0056 }
            throw r9     // Catch:{ all -> 0x0056 }
        L_0x0065:
            monitor-exit(r8)     // Catch:{ all -> 0x0056 }
            throw r9
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p300me.C11895f.mo36171t0(int, boolean, qe.c, long):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public void mo36172u0(int i, boolean z, List<C11890c> list) throws IOException {
        this.f44684E.mo36223h(z, i, list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public void mo36173v0(boolean z, int i, int i2) {
        try {
            this.f44684E.mo36224i(z, i, i2);
        } catch (IOException e) {
            m57434D(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x003a */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36174x(p300me.C11889b r4, p300me.C11889b r5, java.io.IOException r6) {
        /*
            r3 = this;
            r3.mo36166f0(r4)     // Catch:{ IOException -> 0x0003 }
        L_0x0003:
            r4 = 0
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, me.i> r0 = r3.f44689c     // Catch:{ all -> 0x004a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0026
            java.util.Map<java.lang.Integer, me.i> r4 = r3.f44689c     // Catch:{ all -> 0x004a }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x004a }
            java.util.Map<java.lang.Integer, me.i> r0 = r3.f44689c     // Catch:{ all -> 0x004a }
            int r0 = r0.size()     // Catch:{ all -> 0x004a }
            me.i[] r0 = new p300me.C11916i[r0]     // Catch:{ all -> 0x004a }
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch:{ all -> 0x004a }
            me.i[] r4 = (p300me.C11916i[]) r4     // Catch:{ all -> 0x004a }
            java.util.Map<java.lang.Integer, me.i> r0 = r3.f44689c     // Catch:{ all -> 0x004a }
            r0.clear()     // Catch:{ all -> 0x004a }
        L_0x0026:
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0035
            int r0 = r4.length
            r1 = 0
        L_0x002b:
            if (r1 >= r0) goto L_0x0035
            r2 = r4[r1]
            r2.mo36197d(r5, r6)     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            int r1 = r1 + 1
            goto L_0x002b
        L_0x0035:
            me.j r4 = r3.f44684E     // Catch:{ IOException -> 0x003a }
            r4.close()     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            java.net.Socket r4 = r3.f44683D     // Catch:{ IOException -> 0x003f }
            r4.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            java.util.concurrent.ScheduledExecutorService r4 = r3.f44694h
            r4.shutdown()
            java.util.concurrent.ExecutorService r4 = r3.f44695i
            r4.shutdown()
            return
        L_0x004a:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p300me.C11895f.mo36174x(me.b, me.b, java.io.IOException):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public void mo36175y0(int i, C11889b bVar) throws IOException {
        this.f44684E.mo36226n(i, bVar);
    }
}
