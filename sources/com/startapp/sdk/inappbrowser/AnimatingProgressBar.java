package com.startapp.sdk.inappbrowser;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ProgressBar;

/* compiled from: Sta */
public class AnimatingProgressBar extends ProgressBar {

    /* renamed from: c */
    public static final Interpolator f39112c = new AccelerateDecelerateInterpolator();

    /* renamed from: a */
    public ValueAnimator f39113a;

    /* renamed from: b */
    public boolean f39114b = false;

    /* renamed from: com.startapp.sdk.inappbrowser.AnimatingProgressBar$a */
    /* compiled from: Sta */
    public class C9524a implements ValueAnimator.AnimatorUpdateListener {
        public C9524a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            AnimatingProgressBar.super.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public AnimatingProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z = false;
        this.f39114b = Build.VERSION.SDK_INT >= 11 ? true : z;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f39113a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public void setProgress(int i) {
        if (!this.f39114b) {
            super.setProgress(i);
            return;
        }
        ValueAnimator valueAnimator = this.f39113a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (getProgress() >= i) {
                return;
            }
        } else {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{getProgress(), i});
            this.f39113a = ofInt;
            ofInt.setInterpolator(f39112c);
            this.f39113a.addUpdateListener(new C9524a());
        }
        this.f39113a.setIntValues(new int[]{getProgress(), i});
        this.f39113a.start();
    }

    /* renamed from: a */
    public void mo31192a() {
        super.setProgress(0);
        ValueAnimator valueAnimator = this.f39113a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
