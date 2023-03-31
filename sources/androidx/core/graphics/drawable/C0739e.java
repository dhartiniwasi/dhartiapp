package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: androidx.core.graphics.drawable.e */
/* compiled from: WrappedDrawableApi21 */
class C0739e extends C0738d {

    /* renamed from: h */
    private static Method f2293h;

    C0739e(Drawable drawable) {
        super(drawable);
        m3405g();
    }

    /* renamed from: g */
    private void m3405g() {
        if (f2293h == null) {
            try {
                f2293h = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo3075c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f2292f;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public Rect getDirtyBounds() {
        return this.f2292f.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.f2292f.getOutline(outline);
    }

    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f2292f;
        if (!(drawable == null || (method = f2293h) == null)) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    public void setHotspot(float f, float f2) {
        this.f2292f.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f2292f.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i) {
        if (mo3075c()) {
            super.setTint(i);
        } else {
            this.f2292f.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (mo3075c()) {
            super.setTintList(colorStateList);
        } else {
            this.f2292f.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (mo3075c()) {
            super.setTintMode(mode);
        } else {
            this.f2292f.setTintMode(mode);
        }
    }

    C0739e(C0740f fVar, Resources resources) {
        super(fVar, resources);
        m3405g();
    }
}
