package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.lang.reflect.Method;

/* renamed from: androidx.core.view.c0 */
/* compiled from: ViewConfigurationCompat */
public final class C0894c0 {

    /* renamed from: a */
    private static Method f2550a;

    /* renamed from: androidx.core.view.c0$a */
    /* compiled from: ViewConfigurationCompat */
    static class C0895a {
        /* renamed from: a */
        static float m4064a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        /* renamed from: b */
        static float m4065b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* renamed from: androidx.core.view.c0$b */
    /* compiled from: ViewConfigurationCompat */
    static class C0896b {
        /* renamed from: a */
        static int m4066a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        /* renamed from: b */
        static boolean m4067b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f2550a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    /* renamed from: a */
    private static float m4059a(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f2550a) != null) {
            try {
                return (float) ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    /* renamed from: b */
    public static float m4060b(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C0895a.m4064a(viewConfiguration);
        }
        return m4059a(viewConfiguration, context);
    }

    /* renamed from: c */
    public static int m4061c(ViewConfiguration viewConfiguration) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0896b.m4066a(viewConfiguration);
        }
        return viewConfiguration.getScaledTouchSlop() / 2;
    }

    /* renamed from: d */
    public static float m4062d(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C0895a.m4065b(viewConfiguration);
        }
        return m4059a(viewConfiguration, context);
    }

    /* renamed from: e */
    public static boolean m4063e(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0896b.m4067b(viewConfiguration);
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        return identifier != 0 && resources.getBoolean(identifier);
    }
}
