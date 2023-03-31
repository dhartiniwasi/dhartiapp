package p264io.flutter.embedding.engine.mutatorsstack;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;

@Keep
/* renamed from: io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack */
public class FlutterMutatorsStack {
    private List<Path> finalClippingPaths = new ArrayList();
    private Matrix finalMatrix = new Matrix();
    private List<C10698a> mutators = new ArrayList();

    /* renamed from: io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack$b */
    public enum C10699b {
        CLIP_RECT,
        CLIP_RRECT,
        CLIP_PATH,
        TRANSFORM,
        OPACITY
    }

    public List<Path> getFinalClippingPaths() {
        return this.finalClippingPaths;
    }

    public Matrix getFinalMatrix() {
        return this.finalMatrix;
    }

    public List<C10698a> getMutators() {
        return this.mutators;
    }

    public void pushClipRRect(int i, int i2, int i3, int i4, float[] fArr) {
        Rect rect = new Rect(i, i2, i3, i4);
        this.mutators.add(new C10698a(rect, fArr));
        Path path = new Path();
        path.addRoundRect(new RectF(rect), fArr, Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushClipRect(int i, int i2, int i3, int i4) {
        Rect rect = new Rect(i, i2, i3, i4);
        this.mutators.add(new C10698a(rect));
        Path path = new Path();
        path.addRect(new RectF(rect), Path.Direction.CCW);
        path.transform(this.finalMatrix);
        this.finalClippingPaths.add(path);
    }

    public void pushTransform(float[] fArr) {
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        C10698a aVar = new C10698a(matrix);
        this.mutators.add(aVar);
        this.finalMatrix.preConcat(aVar.mo34132a());
    }

    /* renamed from: io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack$a */
    public class C10698a {

        /* renamed from: a */
        private Matrix f41925a;

        /* renamed from: b */
        private Rect f41926b;

        /* renamed from: c */
        private float[] f41927c;

        /* renamed from: d */
        private C10699b f41928d;

        public C10698a(Rect rect) {
            this.f41928d = C10699b.CLIP_RECT;
            this.f41926b = rect;
        }

        /* renamed from: a */
        public Matrix mo34132a() {
            return this.f41925a;
        }

        public C10698a(Rect rect, float[] fArr) {
            this.f41928d = C10699b.CLIP_RRECT;
            this.f41926b = rect;
            this.f41927c = fArr;
        }

        public C10698a(Matrix matrix) {
            this.f41928d = C10699b.TRANSFORM;
            this.f41925a = matrix;
        }
    }
}
