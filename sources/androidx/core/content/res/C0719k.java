package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.core.content.res.k */
/* compiled from: TypedArrayUtils */
public class C0719k {
    /* renamed from: a */
    public static boolean m3285a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        if (!m3294j(xmlPullParser, str)) {
            return z;
        }
        return typedArray.getBoolean(i, z);
    }

    /* renamed from: b */
    public static int m3286b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m3294j(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getColor(i, i2);
    }

    /* renamed from: c */
    public static ColorStateList m3287c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (!m3294j(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        int i2 = typedValue.type;
        if (i2 == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index " + i + ": " + typedValue);
        } else if (i2 < 28 || i2 > 31) {
            return C0696c.m3211d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
        } else {
            return m3288d(typedValue);
        }
    }

    /* renamed from: d */
    private static ColorStateList m3288d(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: e */
    public static C0697d m3289e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        if (m3294j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return C0697d.m3217b(typedValue.data);
            }
            C0697d g = C0697d.m3220g(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (g != null) {
                return g;
            }
        }
        return C0697d.m3217b(i2);
    }

    /* renamed from: f */
    public static float m3290f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        if (!m3294j(xmlPullParser, str)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    /* renamed from: g */
    public static int m3291g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m3294j(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }

    /* renamed from: h */
    public static int m3292h(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m3294j(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getResourceId(i, i2);
    }

    /* renamed from: i */
    public static String m3293i(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m3294j(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    /* renamed from: j */
    public static boolean m3294j(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: k */
    public static TypedArray m3295k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: l */
    public static TypedValue m3296l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m3294j(xmlPullParser, str)) {
            return null;
        }
        return typedArray.peekValue(i);
    }
}
