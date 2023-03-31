package p146u0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: u0.e0 */
/* compiled from: ViewUtilsApi21 */
class C5648e0 extends C5642d0 {

    /* renamed from: f */
    private static boolean f28328f = true;

    /* renamed from: g */
    private static boolean f28329g = true;

    C5648e0() {
    }

    /* renamed from: h */
    public void mo19976h(View view, Matrix matrix) {
        if (f28328f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f28328f = false;
            }
        }
    }

    /* renamed from: i */
    public void mo19977i(View view, Matrix matrix) {
        if (f28329g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f28329g = false;
            }
        }
    }
}
