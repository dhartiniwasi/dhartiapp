package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.C0519m0;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import p227f6.C10135k;

/* renamed from: com.google.android.material.internal.d */
/* compiled from: ForegroundLinearLayout */
public class C7702d extends C0519m0 {

    /* renamed from: A */
    private int f33835A;

    /* renamed from: B */
    protected boolean f33836B;

    /* renamed from: C */
    boolean f33837C;

    /* renamed from: x */
    private Drawable f33838x;

    /* renamed from: y */
    private final Rect f33839y;

    /* renamed from: z */
    private final Rect f33840z;

    public C7702d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f33838x;
        if (drawable != null) {
            if (this.f33837C) {
                this.f33837C = false;
                Rect rect = this.f33839y;
                Rect rect2 = this.f33840z;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f33836B) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f33835A, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f33838x;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f33838x;
        if (drawable != null && drawable.isStateful()) {
            this.f33838x.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f33838x;
    }

    public int getForegroundGravity() {
        return this.f33835A;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f33838x;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f33837C = z | this.f33837C;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f33837C = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f33838x;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f33838x);
            }
            this.f33838x = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f33835A == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f33835A != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & C8710R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i |= 48;
            }
            this.f33835A = i;
            if (i == 119 && this.f33838x != null) {
                this.f33838x.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f33838x;
    }

    public C7702d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33839y = new Rect();
        this.f33840z = new Rect();
        this.f33835A = 119;
        this.f33836B = true;
        this.f33837C = false;
        TypedArray k = C7709g.m42962k(context, attributeSet, C10135k.f40359Y0, i, 0, new int[0]);
        this.f33835A = k.getInt(C10135k.f40370a1, this.f33835A);
        Drawable drawable = k.getDrawable(C10135k.f40364Z0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f33836B = k.getBoolean(C10135k.f40376b1, true);
        k.recycle();
    }
}
