package p406y9;

/* renamed from: y9.f */
/* compiled from: ErrorCorrectionLevel */
public enum C13235f {
    L(1),
    M(0),
    Q(3),
    H(2);
    

    /* renamed from: f */
    private static final C13235f[] f47496f = null;

    /* renamed from: a */
    private final int f47498a;

    static {
        C13235f fVar;
        C13235f fVar2;
        C13235f fVar3;
        C13235f fVar4;
        f47496f = new C13235f[]{fVar2, fVar, fVar4, fVar3};
    }

    private C13235f(int i) {
        this.f47498a = i;
    }

    /* renamed from: a */
    public static C13235f m62045a(int i) {
        if (i >= 0) {
            C13235f[] fVarArr = f47496f;
            if (i < fVarArr.length) {
                return fVarArr[i];
            }
        }
        throw new IllegalArgumentException();
    }
}
