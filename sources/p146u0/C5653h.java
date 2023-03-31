package p146u0;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: u0.h */
/* compiled from: PathProperty */
class C5653h<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f28332a;

    /* renamed from: b */
    private final PathMeasure f28333b;

    /* renamed from: c */
    private final float f28334c;

    /* renamed from: d */
    private final float[] f28335d = new float[2];

    /* renamed from: e */
    private final PointF f28336e = new PointF();

    /* renamed from: f */
    private float f28337f;

    C5653h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f28332a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f28333b = pathMeasure;
        this.f28334c = pathMeasure.getLength();
    }

    /* renamed from: a */
    public Float get(T t) {
        return Float.valueOf(this.f28337f);
    }

    /* renamed from: b */
    public void set(T t, Float f) {
        this.f28337f = f.floatValue();
        this.f28333b.getPosTan(this.f28334c * f.floatValue(), this.f28335d, (float[]) null);
        PointF pointF = this.f28336e;
        float[] fArr = this.f28335d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f28332a.set(t, pointF);
    }
}
