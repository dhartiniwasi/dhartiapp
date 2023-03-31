package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CheckedTextView;
import java.lang.reflect.Field;

/* renamed from: androidx.core.widget.c */
/* compiled from: CheckedTextViewCompat */
public final class C0968c {

    /* renamed from: androidx.core.widget.c$a */
    /* compiled from: CheckedTextViewCompat */
    private static class C0969a {

        /* renamed from: a */
        private static Field f2692a;

        /* renamed from: b */
        private static boolean f2693b;

        /* renamed from: a */
        static Drawable m4408a(CheckedTextView checkedTextView) {
            if (!f2693b) {
                try {
                    Field declaredField = CheckedTextView.class.getDeclaredField("mCheckMarkDrawable");
                    f2692a = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.i("CheckedTextViewCompat", "Failed to retrieve mCheckMarkDrawable field", e);
                }
                f2693b = true;
            }
            Field field = f2692a;
            if (field != null) {
                try {
                    return (Drawable) field.get(checkedTextView);
                } catch (IllegalAccessException e2) {
                    Log.i("CheckedTextViewCompat", "Failed to get check mark drawable via reflection", e2);
                    f2692a = null;
                }
            }
            return null;
        }
    }

    /* renamed from: androidx.core.widget.c$b */
    /* compiled from: CheckedTextViewCompat */
    private static class C0970b {
        /* renamed from: a */
        static Drawable m4409a(CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    /* renamed from: androidx.core.widget.c$c */
    /* compiled from: CheckedTextViewCompat */
    private static class C0971c {
        /* renamed from: a */
        static void m4410a(CheckedTextView checkedTextView, ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        /* renamed from: b */
        static void m4411b(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    /* renamed from: a */
    public static Drawable m4405a(CheckedTextView checkedTextView) {
        if (Build.VERSION.SDK_INT >= 16) {
            return C0970b.m4409a(checkedTextView);
        }
        return C0969a.m4408a(checkedTextView);
    }

    /* renamed from: b */
    public static void m4406b(CheckedTextView checkedTextView, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0971c.m4410a(checkedTextView, colorStateList);
        } else if (checkedTextView instanceof C0996l) {
            ((C0996l) checkedTextView).setSupportCheckMarkTintList(colorStateList);
        }
    }

    /* renamed from: c */
    public static void m4407c(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0971c.m4411b(checkedTextView, mode);
        } else if (checkedTextView instanceof C0996l) {
            ((C0996l) checkedTextView).setSupportCheckMarkTintMode(mode);
        }
    }
}
