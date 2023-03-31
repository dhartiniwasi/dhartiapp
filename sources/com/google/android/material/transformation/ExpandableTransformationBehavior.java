package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public AnimatorSet f34034b;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    class C7761a extends AnimatorListenerAdapter {
        C7761a() {
        }

        public void onAnimationEnd(Animator animator) {
            AnimatorSet unused = ExpandableTransformationBehavior.this.f34034b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public boolean mo25963H(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.f34034b;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet J = mo25965J(view, view2, z, z3);
        this.f34034b = J;
        J.addListener(new C7761a());
        this.f34034b.start();
        if (!z2) {
            this.f34034b.end();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public abstract AnimatorSet mo25965J(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
