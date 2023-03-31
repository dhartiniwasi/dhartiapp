package p236g6;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: g6.e */
/* compiled from: DrawableAlphaProperty */
public class C10212e extends Property<Drawable, Integer> {

    /* renamed from: b */
    public static final Property<Drawable, Integer> f40657b = new C10212e();

    /* renamed from: a */
    private final WeakHashMap<Drawable, Integer> f40658a = new WeakHashMap<>();

    private C10212e() {
        super(Integer.class, "drawableAlphaCompat");
    }

    /* renamed from: a */
    public Integer get(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.f40658a.containsKey(drawable)) {
            return this.f40658a.get(drawable);
        }
        return 255;
    }

    /* renamed from: b */
    public void set(Drawable drawable, Integer num) {
        if (Build.VERSION.SDK_INT < 19) {
            this.f40658a.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
