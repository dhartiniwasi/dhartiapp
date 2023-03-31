package p146u0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: u0.h0 */
/* compiled from: ViewUtilsApi29 */
class C5654h0 extends C5652g0 {
    C5654h0() {
    }

    /* renamed from: c */
    public float mo19972c(View view) {
        return view.getTransitionAlpha();
    }

    /* renamed from: e */
    public void mo19978e(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    /* renamed from: f */
    public void mo19974f(View view, float f) {
        view.setTransitionAlpha(f);
    }

    /* renamed from: g */
    public void mo19980g(View view, int i) {
        view.setTransitionVisibility(i);
    }

    /* renamed from: h */
    public void mo19976h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* renamed from: i */
    public void mo19977i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
