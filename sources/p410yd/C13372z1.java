package p410yd;

/* renamed from: yd.z1 */
/* compiled from: MainCoroutineDispatcher.kt */
public abstract class C13372z1 extends C13282d0 {
    /* renamed from: L */
    public abstract C13372z1 mo35955L();

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public final String mo38526Q() {
        C13372z1 z1Var;
        C13372z1 c = C13365x0.m62435c();
        if (this == c) {
            return "Dispatchers.Main";
        }
        try {
            z1Var = c.mo35955L();
        } catch (UnsupportedOperationException unused) {
            z1Var = null;
        }
        if (this == z1Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public String toString() {
        String Q = mo38526Q();
        if (Q != null) {
            return Q;
        }
        return C13333o0.m62287a(this) + '@' + C13333o0.m62288b(this);
    }
}
