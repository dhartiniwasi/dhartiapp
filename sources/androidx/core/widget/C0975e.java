package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* renamed from: androidx.core.widget.e */
/* compiled from: EdgeEffectCompat */
public final class C0975e {

    /* renamed from: androidx.core.widget.e$a */
    /* compiled from: EdgeEffectCompat */
    static class C0976a {
        /* renamed from: a */
        static void m4425a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    /* renamed from: androidx.core.widget.e$b */
    /* compiled from: EdgeEffectCompat */
    private static class C0977b {
        /* renamed from: a */
        public static EdgeEffect m4426a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        /* renamed from: b */
        public static float m4427b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        /* renamed from: c */
        public static float m4428c(EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }
    }

    /* renamed from: a */
    public static EdgeEffect m4421a(Context context, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C0977b.m4426a(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    /* renamed from: b */
    public static float m4422b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C0977b.m4427b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: c */
    public static void m4423c(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0976a.m4425a(edgeEffect, f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }

    /* renamed from: d */
    public static float m4424d(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C0977b.m4428c(edgeEffect, f, f2);
        }
        m4423c(edgeEffect, f, f2);
        return f;
    }
}
