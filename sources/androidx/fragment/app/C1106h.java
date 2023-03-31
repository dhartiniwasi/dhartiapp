package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.C0835a0;
import androidx.core.view.C0922k0;
import java.util.ArrayList;
import p019c0.C1835c;

/* renamed from: androidx.fragment.app.h */
/* compiled from: FragmentContainerView */
public final class C1106h extends FrameLayout {

    /* renamed from: a */
    private ArrayList<View> f3027a;

    /* renamed from: b */
    private ArrayList<View> f3028b;

    /* renamed from: c */
    private View.OnApplyWindowInsetsListener f3029c;

    /* renamed from: d */
    private boolean f3030d = true;

    C1106h(Context context, AttributeSet attributeSet, C1114n nVar) {
        super(context, attributeSet);
        String str;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1835c.f5391h);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(C1835c.f5392i) : classAttribute;
        String string = obtainStyledAttributes.getString(C1835c.f5393j);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment h0 = nVar.mo4144h0(id);
        if (classAttribute != null && h0 == null) {
            if (id <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment a = nVar.mo4162q0().mo4064a(context.getClassLoader(), classAttribute);
            a.mo3866y0(context, attributeSet, (Bundle) null);
            nVar.mo4154l().mo4295o(true).mo4289c(this, a, string).mo3886i();
        }
        nVar.mo4124T0(this);
    }

    /* renamed from: a */
    private void m4943a(View view) {
        ArrayList<View> arrayList = this.f3028b;
        if (arrayList != null && arrayList.contains(view)) {
            if (this.f3027a == null) {
                this.f3027a = new ArrayList<>();
            }
            this.f3027a.add(view);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (C1114n.m5033z0(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    /* access modifiers changed from: protected */
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        if (C1114n.m5033z0(view) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C0922k0 k0Var;
        C0922k0 u = C0922k0.m4160u(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f3029c;
        if (onApplyWindowInsetsListener != null) {
            k0Var = C0922k0.m4160u(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            k0Var = C0835a0.m3713Z(this, u);
        }
        if (!k0Var.mo3421n()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                C0835a0.m3728h(getChildAt(i), k0Var);
            }
        }
        return windowInsets;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f3030d && this.f3027a != null) {
            for (int i = 0; i < this.f3027a.size(); i++) {
                super.drawChild(canvas, this.f3027a.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList<View> arrayList;
        if (!this.f3030d || (arrayList = this.f3027a) == null || arrayList.size() <= 0 || !this.f3027a.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f3028b;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f3027a;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f3030d = true;
            }
        }
        super.endViewTransition(view);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m4943a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        if (z) {
            m4943a(view);
        }
        super.removeDetachedView(view, z);
    }

    public void removeView(View view) {
        m4943a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i) {
        m4943a(getChildAt(i));
        super.removeViewAt(i);
    }

    public void removeViewInLayout(View view) {
        m4943a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m4943a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m4943a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    /* access modifiers changed from: package-private */
    public void setDrawDisappearingViewsLast(boolean z) {
        this.f3030d = z;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            super.setLayoutTransition(layoutTransition);
            return;
        }
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f3029c = onApplyWindowInsetsListener;
    }

    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f3028b == null) {
                this.f3028b = new ArrayList<>();
            }
            this.f3028b.add(view);
        }
        super.startViewTransition(view);
    }
}
