package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0478d0;
import p227f6.C10126b;
import p227f6.C10135k;
import p346s6.C12455b;
import p346s6.C12456c;

public class MaterialTextView extends C0478d0 {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* renamed from: f */
    private void m43147f(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, C10135k.f40407g2);
        int i2 = m43150i(getContext(), obtainStyledAttributes, C10135k.f40413h2, C10135k.f40419i2);
        obtainStyledAttributes.recycle();
        if (i2 >= 0) {
            setLineHeight(i2);
        }
    }

    /* renamed from: g */
    private static boolean m43148g(Context context) {
        return C12455b.m59417b(context, C10126b.textAppearanceLineHeightEnabled, true);
    }

    /* renamed from: h */
    private static int m43149h(Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C10135k.f40425j2, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C10135k.f40431k2, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: i */
    private static int m43150i(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = C12456c.m59422c(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    /* renamed from: j */
    private static boolean m43151j(Context context, Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C10135k.f40425j2, i, i2);
        int i3 = m43150i(context, obtainStyledAttributes, C10135k.f40437l2, C10135k.f40443m2);
        obtainStyledAttributes.recycle();
        if (i3 != -1) {
            return true;
        }
        return false;
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (m43148g(context)) {
            m43147f(context.getTheme(), i);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        int h;
        if (m43148g(context)) {
            Resources.Theme theme = context.getTheme();
            if (!m43151j(context, theme, attributeSet, i, i2) && (h = m43149h(theme, attributeSet, i, i2)) != -1) {
                m43147f(theme, h);
            }
        }
    }
}
