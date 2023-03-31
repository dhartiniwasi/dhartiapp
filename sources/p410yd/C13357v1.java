package p410yd;

import kotlin.jvm.internal.C11669k;

/* renamed from: yd.v1 */
/* compiled from: JobSupport.kt */
public abstract class C13357v1 extends C13364x implements C13368y0, C13319k1 {

    /* renamed from: d */
    public C13360w1 f47677d;

    /* renamed from: b */
    public boolean mo38390b() {
        return true;
    }

    public void dispose() {
        mo38493y().mo38508i0(this);
    }

    /* renamed from: e */
    public C13267a2 mo38391e() {
        return null;
    }

    public String toString() {
        return C13333o0.m62287a(this) + '@' + C13333o0.m62288b(this) + "[job@" + C13333o0.m62288b(mo38493y()) + ']';
    }

    /* renamed from: y */
    public final C13360w1 mo38493y() {
        C13360w1 w1Var = this.f47677d;
        if (w1Var != null) {
            return w1Var;
        }
        C11669k.m56797o("job");
        return null;
    }

    /* renamed from: z */
    public final void mo38494z(C13360w1 w1Var) {
        this.f47677d = w1Var;
    }
}
