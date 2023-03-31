package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: androidx.core.widget.d */
/* compiled from: CompoundButtonCompat */
public final class C0972d {

    /* renamed from: a */
    private static Field f2694a;

    /* renamed from: b */
    private static boolean f2695b;

    /* renamed from: androidx.core.widget.d$a */
    /* compiled from: CompoundButtonCompat */
    static class C0973a {
        /* renamed from: a */
        static ColorStateList m4416a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        /* renamed from: b */
        static PorterDuff.Mode m4417b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        /* renamed from: c */
        static void m4418c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        /* renamed from: d */
        static void m4419d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* renamed from: androidx.core.widget.d$b */
    /* compiled from: CompoundButtonCompat */
    static class C0974b {
        /* renamed from: a */
        static Drawable m4420a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    /* renamed from: a */
    public static Drawable m4412a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0974b.m4420a(compoundButton);
        }
        if (!f2695b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f2694a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
            }
            f2695b = true;
        }
        Field field = f2694a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                f2694a = null;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static ColorStateList m4413b(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0973a.m4416a(compoundButton);
        }
        if (compoundButton instanceof C0997m) {
            return ((C0997m) compoundButton).getSupportButtonTintList();
        }
        return null;
    }

    /* renamed from: c */
    public static void m4414c(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0973a.m4418c(compoundButton, colorStateList);
        } else if (compoundButton instanceof C0997m) {
            ((C0997m) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* renamed from: d */
    public static void m4415d(CompoundButton compoundButton, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0973a.m4419d(compoundButton, mode);
        } else if (compoundButton instanceof C0997m) {
            ((C0997m) compoundButton).setSupportButtonTintMode(mode);
        }
    }
}
