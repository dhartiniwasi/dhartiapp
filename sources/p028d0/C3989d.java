package p028d0;

import android.view.animation.Interpolator;

/* renamed from: d0.d */
/* compiled from: LookupTableInterpolator */
abstract class C3989d implements Interpolator {

    /* renamed from: a */
    private final float[] f23008a;

    /* renamed from: b */
    private final float f23009b;

    protected C3989d(float[] fArr) {
        this.f23008a = fArr;
        this.f23009b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f23008a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.f23009b;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.f23008a;
        return fArr2[min] + (f3 * (fArr2[min + 1] - fArr2[min]));
    }
}
