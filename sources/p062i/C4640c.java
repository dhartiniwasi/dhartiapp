package p062i;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.C0732a;

/* renamed from: i.c */
/* compiled from: DrawableWrapper */
public class C4640c extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    private Drawable f25135a;

    public C4640c(Drawable drawable) {
        mo18284b(drawable);
    }

    /* renamed from: a */
    public Drawable mo18283a() {
        return this.f25135a;
    }

    /* renamed from: b */
    public void mo18284b(Drawable drawable) {
        Drawable drawable2 = this.f25135a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f25135a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f25135a.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f25135a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f25135a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f25135a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f25135a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f25135a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f25135a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f25135a.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f25135a.getPadding(rect);
    }

    public int[] getState() {
        return this.f25135a.getState();
    }

    public Region getTransparentRegion() {
        return this.f25135a.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C0732a.m3370h(this.f25135a);
    }

    public boolean isStateful() {
        return this.f25135a.isStateful();
    }

    public void jumpToCurrentState() {
        this.f25135a.jumpToCurrentState();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f25135a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f25135a.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f25135a.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C0732a.m3372j(this.f25135a, z);
    }

    public void setChangingConfigurations(int i) {
        this.f25135a.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f25135a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f25135a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f25135a.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C0732a.m3373k(this.f25135a, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0732a.m3374l(this.f25135a, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f25135a.setState(iArr);
    }

    public void setTint(int i) {
        C0732a.m3376n(this.f25135a, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0732a.m3377o(this.f25135a, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C0732a.m3378p(this.f25135a, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f25135a.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
