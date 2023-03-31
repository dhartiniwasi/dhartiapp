package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: androidx.core.graphics.drawable.f */
/* compiled from: WrappedDrawableState */
final class C0740f extends Drawable.ConstantState {

    /* renamed from: a */
    int f2294a;

    /* renamed from: b */
    Drawable.ConstantState f2295b;

    /* renamed from: c */
    ColorStateList f2296c = null;

    /* renamed from: d */
    PorterDuff.Mode f2297d = C0738d.f2286g;

    C0740f(C0740f fVar) {
        if (fVar != null) {
            this.f2294a = fVar.f2294a;
            this.f2295b = fVar.f2295b;
            this.f2296c = fVar.f2296c;
            this.f2297d = fVar.f2297d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3112a() {
        return this.f2295b != null;
    }

    public int getChangingConfigurations() {
        int i = this.f2294a;
        Drawable.ConstantState constantState = this.f2295b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return newDrawable((Resources) null);
    }

    public Drawable newDrawable(Resources resources) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C0739e(this, resources);
        }
        return new C0738d(this, resources);
    }
}
