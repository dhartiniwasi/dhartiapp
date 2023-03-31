package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import p355t6.C12538b;
import p365u6.C12697b;

/* renamed from: com.google.android.material.floatingactionbutton.b */
/* compiled from: FloatingActionButtonImplLollipop */
class C7692b extends C7679a {
    C7692b(FloatingActionButton floatingActionButton, C12697b bVar) {
        super(floatingActionButton, bVar);
    }

    /* renamed from: e0 */
    private Animator m42846e0(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f33739x, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f33739x, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(C7679a.f33705E);
        return animatorSet;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo25587A() {
        mo25613b0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo25589C(int[] iArr) {
        if (Build.VERSION.SDK_INT != 21) {
            return;
        }
        if (this.f33739x.isEnabled()) {
            this.f33739x.setElevation(this.f33722g);
            if (this.f33739x.isPressed()) {
                this.f33739x.setTranslationZ(this.f33724i);
            } else if (this.f33739x.isFocused() || this.f33739x.isHovered()) {
                this.f33739x.setTranslationZ(this.f33723h);
            } else {
                this.f33739x.setTranslationZ(0.0f);
            }
        } else {
            this.f33739x.setElevation(0.0f);
            this.f33739x.setTranslationZ(0.0f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo25590D(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        if (i == 21) {
            this.f33739x.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C7679a.f33706F, m42846e0(f, f3));
            stateListAnimator.addState(C7679a.f33707G, m42846e0(f, f2));
            stateListAnimator.addState(C7679a.f33708H, m42846e0(f, f2));
            stateListAnimator.addState(C7679a.f33709I, m42846e0(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f33739x, "elevation", new float[]{f}).setDuration(0));
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.f33739x;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f33739x, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C7679a.f33705E);
            stateListAnimator.addState(C7679a.f33710J, animatorSet);
            stateListAnimator.addState(C7679a.f33711K, m42846e0(0.0f, 0.0f));
            this.f33739x.setStateListAnimator(stateListAnimator);
        }
        if (mo25608V()) {
            mo25613b0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean mo25595I() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo25604R(ColorStateList colorStateList) {
        Drawable drawable = this.f33718c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C12538b.m59728a(colorStateList));
        } else {
            super.mo25604R(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public boolean mo25608V() {
        return this.f33740y.mo25582c() || !mo25609X();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo25611Z() {
    }

    /* renamed from: m */
    public float mo25619m() {
        return this.f33739x.getElevation();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo25623r(Rect rect) {
        if (this.f33740y.mo25582c()) {
            super.mo25623r(rect);
        } else if (!mo25609X()) {
            int sizeDimension = (this.f33725j - this.f33739x.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo25630y() {
    }
}
