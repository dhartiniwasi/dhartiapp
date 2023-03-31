package p146u0;

import android.os.Build;
import android.view.View;

/* renamed from: u0.g0 */
/* compiled from: ViewUtilsApi23 */
class C5652g0 extends C5650f0 {

    /* renamed from: i */
    private static boolean f28331i = true;

    C5652g0() {
    }

    /* renamed from: g */
    public void mo19980g(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo19980g(view, i);
        } else if (f28331i) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f28331i = false;
            }
        }
    }
}
