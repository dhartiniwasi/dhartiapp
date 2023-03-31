package p355t6;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* renamed from: t6.b */
/* compiled from: RippleUtils */
public class C12538b {

    /* renamed from: a */
    public static final boolean f46034a = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: b */
    private static final int[] f46035b = {16842919};

    /* renamed from: c */
    private static final int[] f46036c = {16843623, 16842908};

    /* renamed from: d */
    private static final int[] f46037d = {16842908};

    /* renamed from: e */
    private static final int[] f46038e = {16843623};

    /* renamed from: f */
    private static final int[] f46039f = {16842913, 16842919};

    /* renamed from: g */
    private static final int[] f46040g = {16842913, 16843623, 16842908};

    /* renamed from: h */
    private static final int[] f46041h = {16842913, 16842908};

    /* renamed from: i */
    private static final int[] f46042i = {16842913, 16843623};

    /* renamed from: j */
    private static final int[] f46043j = {16842913};

    /* renamed from: k */
    private static final int[] f46044k = {16842910, 16842919};

    /* renamed from: l */
    static final String f46045l = C12538b.class.getSimpleName();

    private C12538b() {
    }

    /* renamed from: a */
    public static ColorStateList m59728a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f46044k, 0)) != 0) {
            Log.w(f46045l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* renamed from: b */
    public static boolean m59729b(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
