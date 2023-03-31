package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.graphics.drawable.a */
/* compiled from: DrawableCompat */
public final class C0732a {

    /* renamed from: a */
    private static Method f2282a;

    /* renamed from: b */
    private static boolean f2283b;

    /* renamed from: c */
    private static Method f2284c;

    /* renamed from: d */
    private static boolean f2285d;

    /* renamed from: androidx.core.graphics.drawable.a$a */
    /* compiled from: DrawableCompat */
    static class C0733a {
        /* renamed from: a */
        static int m3381a(Drawable drawable) {
            return drawable.getAlpha();
        }

        /* renamed from: b */
        static Drawable m3382b(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
            return drawableContainerState.getChild(i);
        }

        /* renamed from: c */
        static Drawable m3383c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        /* renamed from: d */
        static boolean m3384d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        /* renamed from: e */
        static void m3385e(Drawable drawable, boolean z) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: androidx.core.graphics.drawable.a$b */
    /* compiled from: DrawableCompat */
    static class C0734b {
        /* renamed from: a */
        static void m3386a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        /* renamed from: b */
        static boolean m3387b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        /* renamed from: c */
        static ColorFilter m3388c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        /* renamed from: d */
        static void m3389d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        /* renamed from: e */
        static void m3390e(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        /* renamed from: f */
        static void m3391f(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }

        /* renamed from: g */
        static void m3392g(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        /* renamed from: h */
        static void m3393h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        /* renamed from: i */
        static void m3394i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* renamed from: androidx.core.graphics.drawable.a$c */
    /* compiled from: DrawableCompat */
    static class C0735c {
        /* renamed from: a */
        static int m3395a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        /* renamed from: b */
        static boolean m3396b(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }
    }

    /* renamed from: a */
    public static void m3363a(Drawable drawable, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0734b.m3386a(drawable, theme);
        }
    }

    /* renamed from: b */
    public static boolean m3364b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0734b.m3387b(drawable);
        }
        return false;
    }

    /* renamed from: c */
    public static void m3365c(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            drawable.clearColorFilter();
        } else if (i >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                m3365c(C0733a.m3383c((InsetDrawable) drawable));
            } else if (drawable instanceof C0737c) {
                m3365c(((C0737c) drawable).mo3074b());
            } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
                int childCount = drawableContainerState.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    Drawable b = C0733a.m3382b(drawableContainerState, i2);
                    if (b != null) {
                        m3365c(b);
                    }
                }
            }
        } else {
            drawable.clearColorFilter();
        }
    }

    /* renamed from: d */
    public static int m3366d(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0733a.m3381a(drawable);
        }
        return 0;
    }

    /* renamed from: e */
    public static ColorFilter m3367e(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0734b.m3388c(drawable);
        }
        return null;
    }

    /* renamed from: f */
    public static int m3368f(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return C0735c.m3395a(drawable);
        }
        if (i >= 17) {
            if (!f2285d) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    f2284c = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
                }
                f2285d = true;
            }
            Method method = f2284c;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception e2) {
                    Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e2);
                    f2284c = null;
                }
            }
        }
        return 0;
    }

    /* renamed from: g */
    public static void m3369g(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        if (Build.VERSION.SDK_INT >= 21) {
            C0734b.m3389d(drawable, resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    /* renamed from: h */
    public static boolean m3370h(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0733a.m3384d(drawable);
        }
        return false;
    }

    @Deprecated
    /* renamed from: i */
    public static void m3371i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: j */
    public static void m3372j(Drawable drawable, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            C0733a.m3385e(drawable, z);
        }
    }

    /* renamed from: k */
    public static void m3373k(Drawable drawable, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0734b.m3390e(drawable, f, f2);
        }
    }

    /* renamed from: l */
    public static void m3374l(Drawable drawable, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0734b.m3391f(drawable, i, i2, i3, i4);
        }
    }

    /* renamed from: m */
    public static boolean m3375m(Drawable drawable, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return C0735c.m3396b(drawable, i);
        }
        if (i2 >= 17) {
            if (!f2283b) {
                Class<Drawable> cls = Drawable.class;
                try {
                    Method declaredMethod = cls.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                    f2282a = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
                }
                f2283b = true;
            }
            Method method = f2282a;
            if (method != null) {
                try {
                    method.invoke(drawable, new Object[]{Integer.valueOf(i)});
                    return true;
                } catch (Exception e2) {
                    Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                    f2282a = null;
                }
            }
        }
        return false;
    }

    /* renamed from: n */
    public static void m3376n(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0734b.m3392g(drawable, i);
        } else if (drawable instanceof C0736b) {
            ((C0736b) drawable).setTint(i);
        }
    }

    /* renamed from: o */
    public static void m3377o(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0734b.m3393h(drawable, colorStateList);
        } else if (drawable instanceof C0736b) {
            ((C0736b) drawable).setTintList(colorStateList);
        }
    }

    /* renamed from: p */
    public static void m3378p(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0734b.m3394i(drawable, mode);
        } else if (drawable instanceof C0736b) {
            ((C0736b) drawable).setTintMode(mode);
        }
    }

    /* renamed from: q */
    public static <T extends Drawable> T m3379q(Drawable drawable) {
        return drawable instanceof C0737c ? ((C0737c) drawable).mo3074b() : drawable;
    }

    /* renamed from: r */
    public static Drawable m3380r(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return drawable;
        }
        return i >= 21 ? !(drawable instanceof C0736b) ? new C0739e(drawable) : drawable : !(drawable instanceof C0736b) ? new C0738d(drawable) : drawable;
    }
}
