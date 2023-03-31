package p033d5;

/* renamed from: d5.s */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C4144s {

    /* renamed from: b */
    private static C4144s f23390b;

    /* renamed from: c */
    private static final C4147t f23391c = new C4147t(0, false, false, 0, 0);

    /* renamed from: a */
    private C4147t f23392a;

    private C4144s() {
    }

    /* renamed from: b */
    public static synchronized C4144s m28227b() {
        C4144s sVar;
        synchronized (C4144s.class) {
            if (f23390b == null) {
                f23390b = new C4144s();
            }
            sVar = f23390b;
        }
        return sVar;
    }

    /* renamed from: a */
    public C4147t mo17459a() {
        return this.f23392a;
    }

    /* renamed from: c */
    public final synchronized void mo17460c(C4147t tVar) {
        if (tVar == null) {
            this.f23392a = f23391c;
            return;
        }
        C4147t tVar2 = this.f23392a;
        if (tVar2 == null || tVar2.mo17467M1() < tVar.mo17467M1()) {
            this.f23392a = tVar;
        }
    }
}
