package p343rc;

/* renamed from: rc.k1 */
/* compiled from: StatusException */
public class C12345k1 extends Exception {

    /* renamed from: a */
    private final C12335j1 f45656a;

    /* renamed from: b */
    private final C12411y0 f45657b;

    /* renamed from: c */
    private final boolean f45658c;

    public C12345k1(C12335j1 j1Var) {
        this(j1Var, (C12411y0) null);
    }

    /* renamed from: a */
    public final C12335j1 mo37047a() {
        return this.f45656a;
    }

    public synchronized Throwable fillInStackTrace() {
        return this.f45658c ? super.fillInStackTrace() : this;
    }

    public C12345k1(C12335j1 j1Var, C12411y0 y0Var) {
        this(j1Var, y0Var, true);
    }

    C12345k1(C12335j1 j1Var, C12411y0 y0Var, boolean z) {
        super(C12335j1.m59101g(j1Var), j1Var.mo37025l());
        this.f45656a = j1Var;
        this.f45657b = y0Var;
        this.f45658c = z;
        fillInStackTrace();
    }
}
