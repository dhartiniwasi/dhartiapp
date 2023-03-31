package androidx.appcompat.widget;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.C0737c;
import p062i.C4640c;

/* renamed from: androidx.appcompat.widget.i0 */
/* compiled from: DrawableUtils */
public class C0500i0 {

    /* renamed from: a */
    private static final int[] f1649a = {16842912};

    /* renamed from: b */
    private static final int[] f1650b = new int[0];

    /* renamed from: c */
    public static final Rect f1651c = new Rect();

    /* renamed from: a */
    public static boolean m2464a(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            return true;
        }
        if (i < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (i < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (i < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState instanceof DrawableContainer.DrawableContainerState) {
                for (Drawable a : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                    if (!m2464a(a)) {
                        return false;
                    }
                }
            }
        } else if (drawable instanceof C0737c) {
            return m2464a(((C0737c) drawable).mo3074b());
        } else {
            if (drawable instanceof C4640c) {
                return m2464a(((C4640c) drawable).mo18283a());
            }
            if (drawable instanceof ScaleDrawable) {
                return m2464a(((ScaleDrawable) drawable).getDrawable());
            }
        }
        return true;
    }

    /* renamed from: b */
    static void m2465b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) {
            m2466c(drawable);
        } else if (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            m2466c(drawable);
        }
    }

    /* renamed from: c */
    private static void m2466c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1649a);
        } else {
            drawable.setState(f1650b);
        }
        drawable.setState(state);
    }

    /* renamed from: d */
    public static PorterDuff.Mode m2467d(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
