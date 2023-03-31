package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.C0835a0;
import androidx.recyclerview.widget.RecyclerView;
import p048g.C4293f;
import p048g.C4297j;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    private boolean f1234a;

    /* renamed from: b */
    private View f1235b;

    /* renamed from: c */
    private View f1236c;

    /* renamed from: d */
    private View f1237d;

    /* renamed from: e */
    Drawable f1238e;

    /* renamed from: f */
    Drawable f1239f;

    /* renamed from: g */
    Drawable f1240g;

    /* renamed from: h */
    boolean f1241h;

    /* renamed from: i */
    boolean f1242i;

    /* renamed from: r */
    private int f1243r;

    /* renamed from: androidx.appcompat.widget.ActionBarContainer$a */
    private static class C0394a {
        /* renamed from: a */
        public static void m1973a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0835a0.m3749r0(this, new C0453b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4297j.f24045a);
        this.f1238e = obtainStyledAttributes.getDrawable(C4297j.f24050b);
        this.f1239f = obtainStyledAttributes.getDrawable(C4297j.f24060d);
        this.f1243r = obtainStyledAttributes.getDimensionPixelSize(C4297j.f24090j, -1);
        boolean z = true;
        if (getId() == C4293f.f23863H) {
            this.f1241h = true;
            this.f1240g = obtainStyledAttributes.getDrawable(C4297j.f24055c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1241h ? !(this.f1238e == null && this.f1239f == null) : this.f1240g != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    private int m1971a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    private boolean m1972b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1238e;
        if (drawable != null && drawable.isStateful()) {
            this.f1238e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1239f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1239f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1240g;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f1240g.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f1235b;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1238e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1239f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1240g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1236c = findViewById(C4293f.f23872a);
        this.f1237d = findViewById(C4293f.f23877f);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1234a || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f1235b;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            int i5 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - i5, i3, measuredHeight - i5);
        }
        if (this.f1241h) {
            Drawable drawable2 = this.f1240g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f1238e != null) {
                if (this.f1236c.getVisibility() == 0) {
                    this.f1238e.setBounds(this.f1236c.getLeft(), this.f1236c.getTop(), this.f1236c.getRight(), this.f1236c.getBottom());
                } else {
                    View view2 = this.f1237d;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f1238e.setBounds(0, 0, 0, 0);
                    } else {
                        this.f1238e.setBounds(this.f1237d.getLeft(), this.f1237d.getTop(), this.f1237d.getRight(), this.f1237d.getBottom());
                    }
                }
                z3 = true;
            }
            this.f1242i = z4;
            if (!z4 || (drawable = this.f1239f) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f1236c == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i4 = this.f1243r) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i2)), RecyclerView.UNDEFINED_DURATION);
        }
        super.onMeasure(i, i2);
        if (this.f1236c != null) {
            int mode = View.MeasureSpec.getMode(i2);
            View view = this.f1235b;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!m1972b(this.f1236c)) {
                    i3 = m1971a(this.f1236c);
                } else {
                    i3 = !m1972b(this.f1237d) ? m1971a(this.f1237d) : 0;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(i3 + m1971a(this.f1235b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1238e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1238e);
        }
        this.f1238e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1236c;
            if (view != null) {
                this.f1238e.setBounds(view.getLeft(), this.f1236c.getTop(), this.f1236c.getRight(), this.f1236c.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1241h ? !(this.f1238e == null && this.f1239f == null) : this.f1240g != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            C0394a.m1973a(this);
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1240g;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1240g);
        }
        this.f1240g = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1241h && (drawable2 = this.f1240g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1241h ? this.f1238e == null && this.f1239f == null : this.f1240g == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            C0394a.m1973a(this);
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1239f;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f1239f);
        }
        this.f1239f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1242i && (drawable2 = this.f1239f) != null) {
                drawable2.setBounds(this.f1235b.getLeft(), this.f1235b.getTop(), this.f1235b.getRight(), this.f1235b.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1241h ? !(this.f1238e == null && this.f1239f == null) : this.f1240g != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            C0394a.m1973a(this);
        }
    }

    public void setTabContainer(C0554t0 t0Var) {
        View view = this.f1235b;
        if (view != null) {
            removeView(view);
        }
        this.f1235b = t0Var;
        if (t0Var != null) {
            addView(t0Var);
            ViewGroup.LayoutParams layoutParams = t0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            t0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f1234a = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f1238e;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f1239f;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f1240g;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f1238e && !this.f1241h) || (drawable == this.f1239f && this.f1242i) || ((drawable == this.f1240g && this.f1241h) || super.verifyDrawable(drawable));
    }
}
