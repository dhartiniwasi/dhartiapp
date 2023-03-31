package p146u0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: u0.v */
/* compiled from: ViewGroupOverlayApi18 */
class C5686v implements C5687w {

    /* renamed from: a */
    private final ViewGroupOverlay f28434a;

    C5686v(ViewGroup viewGroup) {
        this.f28434a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public void mo19920a(Drawable drawable) {
        this.f28434a.add(drawable);
    }

    /* renamed from: b */
    public void mo19921b(Drawable drawable) {
        this.f28434a.remove(drawable);
    }

    /* renamed from: c */
    public void mo20060c(View view) {
        this.f28434a.add(view);
    }

    /* renamed from: d */
    public void mo20061d(View view) {
        this.f28434a.remove(view);
    }
}
