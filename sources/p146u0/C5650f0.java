package p146u0;

import android.view.View;

/* renamed from: u0.f0 */
/* compiled from: ViewUtilsApi22 */
class C5650f0 extends C5648e0 {

    /* renamed from: h */
    private static boolean f28330h = true;

    C5650f0() {
    }

    /* renamed from: e */
    public void mo19978e(View view, int i, int i2, int i3, int i4) {
        if (f28330h) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f28330h = false;
            }
        }
    }
}
