package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.z0 */
/* compiled from: TintResources */
class C0573z0 extends C0550r0 {

    /* renamed from: b */
    private final WeakReference<Context> f1881b;

    public C0573z0(Context context, Resources resources) {
        super(resources);
        this.f1881b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable a = mo2568a(i);
        Context context = (Context) this.f1881b.get();
        if (!(a == null || context == null)) {
            C0541q0.m2634h().mo2555x(context, i, a);
        }
        return a;
    }
}
