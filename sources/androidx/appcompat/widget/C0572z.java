package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.C0732a;
import androidx.core.view.C0835a0;
import p048g.C4297j;

/* renamed from: androidx.appcompat.widget.z */
/* compiled from: AppCompatSeekBarHelper */
class C0572z extends C0559u {

    /* renamed from: d */
    private final SeekBar f1875d;

    /* renamed from: e */
    private Drawable f1876e;

    /* renamed from: f */
    private ColorStateList f1877f = null;

    /* renamed from: g */
    private PorterDuff.Mode f1878g = null;

    /* renamed from: h */
    private boolean f1879h = false;

    /* renamed from: i */
    private boolean f1880i = false;

    C0572z(SeekBar seekBar) {
        super(seekBar);
        this.f1875d = seekBar;
    }

    /* renamed from: f */
    private void m2727f() {
        Drawable drawable = this.f1876e;
        if (drawable == null) {
            return;
        }
        if (this.f1879h || this.f1880i) {
            Drawable r = C0732a.m3380r(drawable.mutate());
            this.f1876e = r;
            if (this.f1879h) {
                C0732a.m3377o(r, this.f1877f);
            }
            if (this.f1880i) {
                C0732a.m3378p(this.f1876e, this.f1878g);
            }
            if (this.f1876e.isStateful()) {
                this.f1876e.setState(this.f1875d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2617c(AttributeSet attributeSet, int i) {
        super.mo2617c(attributeSet, i);
        Context context = this.f1875d.getContext();
        int[] iArr = C4297j.f24017T;
        C0452a1 v = C0452a1.m2210v(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.f1875d;
        C0835a0.m3737l0(seekBar, seekBar.getContext(), iArr, attributeSet, v.mo2059r(), i, 0);
        Drawable h = v.mo2049h(C4297j.f24021U);
        if (h != null) {
            this.f1875d.setThumb(h);
        }
        mo2661j(v.mo2048g(C4297j.f24025V));
        int i2 = C4297j.f24033X;
        if (v.mo2060s(i2)) {
            this.f1878g = C0500i0.m2467d(v.mo2052k(i2, -1), this.f1878g);
            this.f1880i = true;
        }
        int i3 = C4297j.f24029W;
        if (v.mo2060s(i3)) {
            this.f1877f = v.mo2044c(i3);
            this.f1879h = true;
        }
        v.mo2061w();
        m2727f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2658g(Canvas canvas) {
        if (this.f1876e != null) {
            int max = this.f1875d.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1876e.getIntrinsicWidth();
                int intrinsicHeight = this.f1876e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f1876e.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f1875d.getWidth() - this.f1875d.getPaddingLeft()) - this.f1875d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f1875d.getPaddingLeft(), (float) (this.f1875d.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1876e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2659h() {
        Drawable drawable = this.f1876e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1875d.getDrawableState())) {
            this.f1875d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo2660i() {
        Drawable drawable = this.f1876e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo2661j(Drawable drawable) {
        Drawable drawable2 = this.f1876e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1876e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1875d);
            C0732a.m3375m(drawable, C0835a0.m3682B(this.f1875d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1875d.getDrawableState());
            }
            m2727f();
        }
        this.f1875d.invalidate();
    }
}
