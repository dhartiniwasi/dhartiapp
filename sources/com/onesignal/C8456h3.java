package com.onesignal;

import android.view.animation.Interpolator;

/* renamed from: com.onesignal.h3 */
/* compiled from: OneSignalBounceInterpolator */
class C8456h3 implements Interpolator {

    /* renamed from: a */
    private double f35659a = 1.0d;

    /* renamed from: b */
    private double f35660b = 10.0d;

    C8456h3(double d, double d2) {
        this.f35659a = d;
        this.f35660b = d2;
    }

    public float getInterpolation(float f) {
        return (float) ((Math.pow(2.718281828459045d, ((double) (-f)) / this.f35659a) * -1.0d * Math.cos(this.f35660b * ((double) f))) + 1.0d);
    }
}
