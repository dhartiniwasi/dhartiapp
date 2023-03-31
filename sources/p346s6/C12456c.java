package p346s6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import androidx.appcompat.widget.C0452a1;
import p055h.C4411a;

/* renamed from: s6.c */
/* compiled from: MaterialResources */
public class C12456c {
    /* renamed from: a */
    public static ColorStateList m59420a(Context context, TypedArray typedArray, int i) {
        int color;
        int resourceId;
        ColorStateList a;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (a = C4411a.m29345a(context, resourceId)) != null) {
            return a;
        }
        if (Build.VERSION.SDK_INT > 15 || (color = typedArray.getColor(i, -1)) == -1) {
            return typedArray.getColorStateList(i);
        }
        return ColorStateList.valueOf(color);
    }

    /* renamed from: b */
    public static ColorStateList m59421b(Context context, C0452a1 a1Var, int i) {
        int b;
        int n;
        ColorStateList a;
        if (a1Var.mo2060s(i) && (n = a1Var.mo2055n(i, 0)) != 0 && (a = C4411a.m29345a(context, n)) != null) {
            return a;
        }
        if (Build.VERSION.SDK_INT > 15 || (b = a1Var.mo2043b(i, -1)) == -1) {
            return a1Var.mo2044c(i);
        }
        return ColorStateList.valueOf(b);
    }

    /* renamed from: c */
    public static int m59422c(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* renamed from: d */
    public static Drawable m59423d(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable b;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (b = C4411a.m29346b(context, resourceId)) == null) {
            return typedArray.getDrawable(i);
        }
        return b;
    }

    /* renamed from: e */
    static int m59424e(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    /* renamed from: f */
    public static C12457d m59425f(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new C12457d(context, resourceId);
    }
}
