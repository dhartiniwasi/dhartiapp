package p410yd;

/* renamed from: yd.s1 */
/* compiled from: JobSupport.kt */
public class C13348s1 extends C13360w1 implements C13349t {

    /* renamed from: b */
    private final boolean f47667b = m62320u0();

    public C13348s1(C13337p1 p1Var) {
        super(true);
        mo38503T(p1Var);
    }

    /* renamed from: u0 */
    private final boolean m62320u0() {
        C13360w1 y;
        C13340q P = mo38501P();
        C13343r rVar = P instanceof C13343r ? (C13343r) P : null;
        C13360w1 y2 = rVar == null ? null : rVar.mo38493y();
        if (y2 == null) {
            return false;
        }
        while (!y2.mo38480M()) {
            C13340q P2 = y2.mo38501P();
            C13343r rVar2 = P2 instanceof C13343r ? (C13343r) P2 : null;
            if (rVar2 == null) {
                y = null;
                continue;
            } else {
                y = rVar2.mo38493y();
                continue;
            }
            if (y2 == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: M */
    public boolean mo38480M() {
        return this.f47667b;
    }

    /* renamed from: N */
    public boolean mo38481N() {
        return true;
    }
}
