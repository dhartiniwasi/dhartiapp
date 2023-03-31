package p146u0;

import android.view.View;

/* renamed from: u0.d0 */
/* compiled from: ViewUtilsApi19 */
class C5642d0 extends C5656i0 {

    /* renamed from: e */
    private static boolean f28313e = true;

    C5642d0() {
    }

    /* renamed from: a */
    public void mo19971a(View view) {
    }

    /* renamed from: c */
    public float mo19972c(View view) {
        if (f28313e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f28313e = false;
            }
        }
        return view.getAlpha();
    }

    /* renamed from: d */
    public void mo19973d(View view) {
    }

    /* renamed from: f */
    public void mo19974f(View view, float f) {
        if (f28313e) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f28313e = false;
            }
        }
        view.setAlpha(f);
    }
}
