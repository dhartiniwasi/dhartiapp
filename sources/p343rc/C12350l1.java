package p343rc;

/* renamed from: rc.l1 */
/* compiled from: StatusRuntimeException */
public class C12350l1 extends RuntimeException {

    /* renamed from: a */
    private final C12335j1 f45660a;

    /* renamed from: b */
    private final C12411y0 f45661b;

    /* renamed from: c */
    private final boolean f45662c;

    public C12350l1(C12335j1 j1Var) {
        this(j1Var, (C12411y0) null);
    }

    /* renamed from: a */
    public final C12335j1 mo37053a() {
        return this.f45660a;
    }

    public synchronized Throwable fillInStackTrace() {
        return this.f45662c ? super.fillInStackTrace() : this;
    }

    public C12350l1(C12335j1 j1Var, C12411y0 y0Var) {
        this(j1Var, y0Var, true);
    }

    C12350l1(C12335j1 j1Var, C12411y0 y0Var, boolean z) {
        super(C12335j1.m59101g(j1Var), j1Var.mo37025l());
        this.f45660a = j1Var;
        this.f45661b = y0Var;
        this.f45662c = z;
        fillInStackTrace();
    }
}
