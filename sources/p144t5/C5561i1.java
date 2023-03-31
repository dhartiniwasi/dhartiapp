package p144t5;

/* renamed from: t5.i1 */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class C5561i1<T> implements C5569k1<T> {

    /* renamed from: a */
    private C5579n1<T> f28120a;

    /* renamed from: a */
    public static <T> void m33624a(C5579n1<T> n1Var, C5579n1<T> n1Var2) {
        C5561i1 i1Var = (C5561i1) n1Var;
        if (i1Var.f28120a == null) {
            i1Var.f28120a = n1Var2;
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: d */
    public final T mo19832d() {
        C5579n1<T> n1Var = this.f28120a;
        if (n1Var != null) {
            return n1Var.mo19832d();
        }
        throw new IllegalStateException();
    }
}
