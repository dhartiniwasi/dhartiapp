package androidx.core.view;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: androidx.core.view.h */
/* compiled from: MarginLayoutParamsCompat */
public final class C0913h {

    /* renamed from: androidx.core.view.h$a */
    /* compiled from: MarginLayoutParamsCompat */
    static class C0914a {
        /* renamed from: a */
        static int m4130a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getLayoutDirection();
        }

        /* renamed from: b */
        static int m4131b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginEnd();
        }

        /* renamed from: c */
        static int m4132c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.getMarginStart();
        }

        /* renamed from: d */
        static boolean m4133d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.isMarginRelative();
        }

        /* renamed from: e */
        static void m4134e(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.resolveLayoutDirection(i);
        }

        /* renamed from: f */
        static void m4135f(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setLayoutDirection(i);
        }

        /* renamed from: g */
        static void m4136g(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginEnd(i);
        }

        /* renamed from: h */
        static void m4137h(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.setMarginStart(i);
        }
    }

    /* renamed from: a */
    public static int m4128a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (Build.VERSION.SDK_INT >= 17) {
            return C0914a.m4131b(marginLayoutParams);
        }
        return marginLayoutParams.rightMargin;
    }

    /* renamed from: b */
    public static int m4129b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (Build.VERSION.SDK_INT >= 17) {
            return C0914a.m4132c(marginLayoutParams);
        }
        return marginLayoutParams.leftMargin;
    }
}
