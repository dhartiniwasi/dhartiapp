package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p236g6.C10209b;
import p236g6.C10216i;

public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final C10216i f34055c = new C10216i(75, 150);

    /* renamed from: d */
    private final C10216i f34056d = new C10216i(0, 150);

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    class C7767a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f34057a;

        /* renamed from: b */
        final /* synthetic */ View f34058b;

        C7767a(boolean z, View view) {
            this.f34057a = z;
            this.f34058b = view;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f34057a) {
                this.f34058b.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f34057a) {
                this.f34058b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    /* renamed from: K */
    private void m43187K(View view, boolean z, boolean z2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        C10216i iVar = z ? this.f34055c : this.f34056d;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f});
        }
        iVar.mo32900a(objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: D */
    public boolean mo2781D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.mo2781D(coordinatorLayout, view, motionEvent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public AnimatorSet mo25965J(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        m43187K(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C10209b.m51713a(animatorSet, arrayList);
        animatorSet.addListener(new C7767a(z, view2));
        return animatorSet;
    }

    /* renamed from: e */
    public boolean mo2786e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
