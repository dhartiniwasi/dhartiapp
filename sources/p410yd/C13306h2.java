package p410yd;

import p272jd.C11570g;

/* renamed from: yd.h2 */
/* compiled from: Unconfined.kt */
public final class C13306h2 extends C13282d0 {

    /* renamed from: b */
    public static final C13306h2 f47627b = new C13306h2();

    private C13306h2() {
    }

    /* renamed from: H */
    public void mo35925H(C11570g gVar, Runnable runnable) {
        C13320k2 k2Var = (C13320k2) gVar.get(C13320k2.f47633b);
        if (k2Var != null) {
            k2Var.f47634a = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    /* renamed from: I */
    public boolean mo35954I(C11570g gVar) {
        return false;
    }

    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
