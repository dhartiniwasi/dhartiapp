package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.C0723b;
import p048g.C4297j;

/* renamed from: androidx.appcompat.widget.v0 */
/* compiled from: ThemeUtils */
public class C0564v0 {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f1855a = new ThreadLocal<>();

    /* renamed from: b */
    static final int[] f1856b = {-16842910};

    /* renamed from: c */
    static final int[] f1857c = {16842908};

    /* renamed from: d */
    static final int[] f1858d = {16843518};

    /* renamed from: e */
    static final int[] f1859e = {16842919};

    /* renamed from: f */
    static final int[] f1860f = {16842912};

    /* renamed from: g */
    static final int[] f1861g = {16842913};

    /* renamed from: h */
    static final int[] f1862h = {-16842919, -16842908};

    /* renamed from: i */
    static final int[] f1863i = new int[0];

    /* renamed from: j */
    private static final int[] f1864j = new int[1];

    /* renamed from: a */
    public static void m2713a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C4297j.f24166y0);
        try {
            if (!obtainStyledAttributes.hasValue(C4297j.f23951D0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m2714b(Context context, int i) {
        ColorStateList e = m2717e(context, i);
        if (e != null && e.isStateful()) {
            return e.getColorForState(f1856b, e.getDefaultColor());
        }
        TypedValue f = m2718f();
        context.getTheme().resolveAttribute(16842803, f, true);
        return m2716d(context, i, f.getFloat());
    }

    /* renamed from: c */
    public static int m2715c(Context context, int i) {
        int[] iArr = f1864j;
        iArr[0] = i;
        C0452a1 u = C0452a1.m2209u(context, (AttributeSet) null, iArr);
        try {
            return u.mo2043b(0, 0);
        } finally {
            u.mo2061w();
        }
    }

    /* renamed from: d */
    static int m2716d(Context context, int i, float f) {
        int c = m2715c(context, i);
        return C0723b.m3315f(c, Math.round(((float) Color.alpha(c)) * f));
    }

    /* renamed from: e */
    public static ColorStateList m2717e(Context context, int i) {
        int[] iArr = f1864j;
        iArr[0] = i;
        C0452a1 u = C0452a1.m2209u(context, (AttributeSet) null, iArr);
        try {
            return u.mo2044c(0);
        } finally {
            u.mo2061w();
        }
    }

    /* renamed from: f */
    private static TypedValue m2718f() {
        ThreadLocal<TypedValue> threadLocal = f1855a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
