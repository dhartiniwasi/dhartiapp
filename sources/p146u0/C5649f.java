package p146u0;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* renamed from: u0.f */
/* compiled from: ObjectAnimatorUtils */
class C5649f {
    /* renamed from: a */
    static <T> ObjectAnimator m33789a(T t, Property<T, PointF> property, Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
        }
        return ObjectAnimator.ofFloat(t, new C5653h(property, path), new float[]{0.0f, 1.0f});
    }
}
