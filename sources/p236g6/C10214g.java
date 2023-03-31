package p236g6;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: g6.g */
/* compiled from: MatrixEvaluator */
public class C10214g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f40660a = new float[9];

    /* renamed from: b */
    private final float[] f40661b = new float[9];

    /* renamed from: c */
    private final Matrix f40662c = new Matrix();

    /* renamed from: a */
    public Matrix mo25637a(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f40660a);
        matrix2.getValues(this.f40661b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f40661b;
            float f2 = fArr[i];
            float[] fArr2 = this.f40660a;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
        }
        this.f40662c.setValues(this.f40661b);
        return this.f40662c;
    }
}
