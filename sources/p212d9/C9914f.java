package p212d9;

/* renamed from: d9.f */
/* compiled from: FormatException */
public final class C9914f extends C9921m {

    /* renamed from: c */
    private static final C9914f f39798c;

    static {
        C9914f fVar = new C9914f();
        f39798c = fVar;
        fVar.setStackTrace(C9921m.f39811b);
    }

    private C9914f() {
    }

    /* renamed from: a */
    public static C9914f m50845a() {
        return C9921m.f39810a ? new C9914f() : f39798c;
    }

    /* renamed from: b */
    public static C9914f m50846b(Throwable th) {
        return C9921m.f39810a ? new C9914f(th) : f39798c;
    }

    private C9914f(Throwable th) {
        super(th);
    }
}
