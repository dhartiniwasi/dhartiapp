package p264io.grpc.internal;

import p182a7.C6431n;

/* renamed from: io.grpc.internal.o2 */
/* compiled from: TransportTracer */
public final class C11310o2 {

    /* renamed from: l */
    private static final C11312b f43452l = new C11312b(C11287l2.f43399a);

    /* renamed from: a */
    private final C11287l2 f43453a;

    /* renamed from: b */
    private long f43454b;

    /* renamed from: c */
    private long f43455c;

    /* renamed from: d */
    private long f43456d;

    /* renamed from: e */
    private long f43457e;

    /* renamed from: f */
    private long f43458f;

    /* renamed from: g */
    private C11313c f43459g;

    /* renamed from: h */
    private long f43460h;

    /* renamed from: i */
    private long f43461i;

    /* renamed from: j */
    private final C11168e1 f43462j;

    /* renamed from: k */
    private volatile long f43463k;

    /* renamed from: io.grpc.internal.o2$b */
    /* compiled from: TransportTracer */
    public static final class C11312b {

        /* renamed from: a */
        private final C11287l2 f43464a;

        public C11312b(C11287l2 l2Var) {
            this.f43464a = l2Var;
        }

        /* renamed from: a */
        public C11310o2 mo35283a() {
            return new C11310o2(this.f43464a);
        }
    }

    /* renamed from: io.grpc.internal.o2$c */
    /* compiled from: TransportTracer */
    public interface C11313c {
    }

    /* renamed from: a */
    public static C11312b m55703a() {
        return f43452l;
    }

    /* renamed from: b */
    public void mo35277b() {
        this.f43458f++;
    }

    /* renamed from: c */
    public void mo35278c() {
        this.f43454b++;
        this.f43455c = this.f43453a.mo35246a();
    }

    /* renamed from: d */
    public void mo35279d() {
        this.f43462j.mo35039a(1);
        this.f43463k = this.f43453a.mo35246a();
    }

    /* renamed from: e */
    public void mo35280e(int i) {
        if (i != 0) {
            this.f43460h += (long) i;
            this.f43461i = this.f43453a.mo35246a();
        }
    }

    /* renamed from: f */
    public void mo35281f(boolean z) {
        if (z) {
            this.f43456d++;
        } else {
            this.f43457e++;
        }
    }

    /* renamed from: g */
    public void mo35282g(C11313c cVar) {
        this.f43459g = (C11313c) C6431n.m37561n(cVar);
    }

    public C11310o2() {
        this.f43462j = C11182f1.m55279a();
        this.f43453a = C11287l2.f43399a;
    }

    private C11310o2(C11287l2 l2Var) {
        this.f43462j = C11182f1.m55279a();
        this.f43453a = l2Var;
    }
}
