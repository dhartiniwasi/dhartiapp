package p146u0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: u0.a0 */
/* compiled from: ViewOverlayApi18 */
class C5621a0 implements C5623b0 {

    /* renamed from: a */
    private final ViewOverlay f28268a;

    C5621a0(View view) {
        this.f28268a = view.getOverlay();
    }

    /* renamed from: a */
    public void mo19920a(Drawable drawable) {
        this.f28268a.add(drawable);
    }

    /* renamed from: b */
    public void mo19921b(Drawable drawable) {
        this.f28268a.remove(drawable);
    }
}
