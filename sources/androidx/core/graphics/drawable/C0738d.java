package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.core.graphics.drawable.d */
/* compiled from: WrappedDrawableApi14 */
class C0738d extends Drawable implements Drawable.Callback, C0737c, C0736b {

    /* renamed from: g */
    static final PorterDuff.Mode f2286g = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    private int f2287a;

    /* renamed from: b */
    private PorterDuff.Mode f2288b;

    /* renamed from: c */
    private boolean f2289c;

    /* renamed from: d */
    C0740f f2290d;

    /* renamed from: e */
    private boolean f2291e;

    /* renamed from: f */
    Drawable f2292f;

    C0738d(C0740f fVar, Resources resources) {
        this.f2290d = fVar;
        m3400e(resources);
    }

    /* renamed from: d */
    private C0740f m3399d() {
        return new C0740f(this.f2290d);
    }

    /* renamed from: e */
    private void m3400e(Resources resources) {
        Drawable.ConstantState constantState;
        C0740f fVar = this.f2290d;
        if (fVar != null && (constantState = fVar.f2295b) != null) {
            mo3073a(constantState.newDrawable(resources));
        }
    }

    /* renamed from: f */
    private boolean m3401f(int[] iArr) {
        if (!mo3075c()) {
            return false;
        }
        C0740f fVar = this.f2290d;
        ColorStateList colorStateList = fVar.f2296c;
        PorterDuff.Mode mode = fVar.f2297d;
        if (colorStateList == null || mode == null) {
            this.f2289c = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f2289c && colorForState == this.f2287a && mode == this.f2288b)) {
                setColorFilter(colorForState, mode);
                this.f2287a = colorForState;
                this.f2288b = mode;
                this.f2289c = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo3073a(Drawable drawable) {
        Drawable drawable2 = this.f2292f;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f2292f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C0740f fVar = this.f2290d;
            if (fVar != null) {
                fVar.f2295b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* renamed from: b */
    public final Drawable mo3074b() {
        return this.f2292f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo3075c() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.f2292f.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C0740f fVar = this.f2290d;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.f2292f.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        C0740f fVar = this.f2290d;
        if (fVar == null || !fVar.mo3112a()) {
            return null;
        }
        this.f2290d.f2294a = getChangingConfigurations();
        return this.f2290d;
    }

    public Drawable getCurrent() {
        return this.f2292f.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f2292f.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f2292f.getIntrinsicWidth();
    }

    public int getLayoutDirection() {
        return C0732a.m3368f(this.f2292f);
    }

    public int getMinimumHeight() {
        return this.f2292f.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f2292f.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f2292f.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f2292f.getPadding(rect);
    }

    public int[] getState() {
        return this.f2292f.getState();
    }

    public Region getTransparentRegion() {
        return this.f2292f.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C0732a.m3370h(this.f2292f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f2290d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.mo3075c()
            if (r0 == 0) goto L_0x000d
            androidx.core.graphics.drawable.f r0 = r1.f2290d
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.f2296c
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.f2292f
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.C0738d.isStateful():boolean");
    }

    public void jumpToCurrentState() {
        this.f2292f.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f2291e && super.mutate() == this) {
            this.f2290d = m3399d();
            Drawable drawable = this.f2292f;
            if (drawable != null) {
                drawable.mutate();
            }
            C0740f fVar = this.f2290d;
            if (fVar != null) {
                Drawable drawable2 = this.f2292f;
                fVar.f2295b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f2291e = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2292f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return C0732a.m3375m(this.f2292f, i);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f2292f.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f2292f.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C0732a.m3372j(this.f2292f, z);
    }

    public void setChangingConfigurations(int i) {
        this.f2292f.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2292f.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f2292f.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f2292f.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return m3401f(iArr) || this.f2292f.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f2290d.f2296c = colorStateList;
        m3401f(getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f2290d.f2297d = mode;
        m3401f(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f2292f.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    C0738d(Drawable drawable) {
        this.f2290d = m3399d();
        mo3073a(drawable);
    }
}
