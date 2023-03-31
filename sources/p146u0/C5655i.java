package p146u0;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* renamed from: u0.i */
/* compiled from: PropertyValuesHolderUtils */
class C5655i {
    /* renamed from: a */
    static PropertyValuesHolder m33801a(Property<?, PointF> property, Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
        }
        return PropertyValuesHolder.ofFloat(new C5653h(property, path), new float[]{0.0f, 1.0f});
    }
}
