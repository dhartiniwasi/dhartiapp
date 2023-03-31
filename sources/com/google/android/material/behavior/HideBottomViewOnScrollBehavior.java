package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p236g6.C10208a;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.C0603c<V> {

    /* renamed from: a */
    private int f33293a = 0;

    /* renamed from: b */
    private int f33294b = 2;

    /* renamed from: c */
    private int f33295c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ViewPropertyAnimator f33296d;

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    class C7586a extends AnimatorListenerAdapter {
        C7586a() {
        }

        public void onAnimationEnd(Animator animator) {
            ViewPropertyAnimator unused = HideBottomViewOnScrollBehavior.this.f33296d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    /* renamed from: F */
    private void m42174F(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f33296d = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C7586a());
    }

    /* renamed from: G */
    public void mo24879G(V v, int i) {
        this.f33295c = i;
        if (this.f33294b == 1) {
            v.setTranslationY((float) (this.f33293a + i));
        }
    }

    /* renamed from: H */
    public void mo24880H(V v) {
        if (this.f33294b != 1) {
            ViewPropertyAnimator viewPropertyAnimator = this.f33296d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f33294b = 1;
            m42174F(v, this.f33293a + this.f33295c, 175, C10208a.f40652c);
        }
    }

    /* renamed from: I */
    public void mo24881I(V v) {
        if (this.f33294b != 2) {
            ViewPropertyAnimator viewPropertyAnimator = this.f33296d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.f33294b = 2;
            m42174F(v, 0, 225, C10208a.f40653d);
        }
    }

    /* renamed from: l */
    public boolean mo2793l(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f33293a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.mo2793l(coordinatorLayout, v, i);
    }

    /* renamed from: r */
    public void mo2799r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        if (i2 > 0) {
            mo24880H(v);
        } else if (i2 < 0) {
            mo24881I(v);
        }
    }

    /* renamed from: z */
    public boolean mo2807z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
