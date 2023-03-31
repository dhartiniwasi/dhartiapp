package p264io.grpc.internal;

/* renamed from: io.grpc.internal.m */
/* compiled from: CallTracer */
final class C11289m {

    /* renamed from: f */
    static final C11291b f43400f = new C11290a();

    /* renamed from: a */
    private final C11287l2 f43401a;

    /* renamed from: b */
    private final C11168e1 f43402b = C11182f1.m55279a();

    /* renamed from: c */
    private final C11168e1 f43403c = C11182f1.m55279a();

    /* renamed from: d */
    private final C11168e1 f43404d = C11182f1.m55279a();

    /* renamed from: e */
    private volatile long f43405e;

    /* renamed from: io.grpc.internal.m$a */
    /* compiled from: CallTracer */
    class C11290a implements C11291b {
        C11290a() {
        }

        /* renamed from: a */
        public C11289m mo35091a() {
            return new C11289m(C11287l2.f43399a);
        }
    }

    /* renamed from: io.grpc.internal.m$b */
    /* compiled from: CallTracer */
    public interface C11291b {
        /* renamed from: a */
        C11289m mo35091a();
    }

    C11289m(C11287l2 l2Var) {
        this.f43401a = l2Var;
    }

    /* renamed from: a */
    public void mo35247a(boolean z) {
        if (z) {
            this.f43403c.mo35039a(1);
        } else {
            this.f43404d.mo35039a(1);
        }
    }

    /* renamed from: b */
    public void mo35248b() {
        this.f43402b.mo35039a(1);
        this.f43405e = this.f43401a.mo35246a();
    }
}
