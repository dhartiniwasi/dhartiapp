package com.google.android.material.appbar;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
import p227f6.C10126b;
import p227f6.C10131g;

/* renamed from: com.google.android.material.appbar.e */
/* compiled from: ViewUtilsLollipop */
class C7585e {

    /* renamed from: a */
    private static final int[] f33292a = {16843848};

    /* renamed from: a */
    static void m42172a(View view, float f) {
        int integer = view.getResources().getInteger(C10131g.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842766, C10126b.state_liftable, -C10126b.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }
}
