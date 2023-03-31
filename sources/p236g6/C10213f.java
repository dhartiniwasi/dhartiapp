package p236g6;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: g6.f */
/* compiled from: ImageMatrixProperty */
public class C10213f extends Property<ImageView, Matrix> {

    /* renamed from: a */
    private final Matrix f40659a = new Matrix();

    public C10213f() {
        super(Matrix.class, "imageMatrixProperty");
    }

    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.f40659a.set(imageView.getImageMatrix());
        return this.f40659a;
    }

    /* renamed from: b */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
