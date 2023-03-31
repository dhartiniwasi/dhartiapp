package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.view.C0339d;
import androidx.appcompat.widget.C0452a1;
import p227f6.C10126b;
import p227f6.C10135k;

/* renamed from: com.google.android.material.internal.g */
/* compiled from: ThemeEnforcement */
public final class C7709g {

    /* renamed from: a */
    private static final int[] f33855a = {C10126b.f40233h};

    /* renamed from: b */
    private static final int[] f33856b = {C10126b.colorPrimaryVariant};

    /* renamed from: c */
    private static final int[] f33857c = {16842752, C10126b.f40236z};

    /* renamed from: d */
    private static final int[] f33858d = {C10126b.materialThemeOverlay};

    /* renamed from: a */
    public static void m42952a(Context context) {
        m42956e(context, f33855a, "Theme.AppCompat");
    }

    /* renamed from: b */
    private static void m42953b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10135k.f40433k4, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C10135k.f40445m4, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C10126b.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m42954c(context);
            }
        }
        m42952a(context);
    }

    /* renamed from: c */
    public static void m42954c(Context context) {
        m42956e(context, f33856b, "Theme.MaterialComponents");
    }

    /* renamed from: d */
    private static void m42955d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10135k.f40433k4, i, i2);
        boolean z2 = false;
        if (!obtainStyledAttributes.getBoolean(C10135k.f40451n4, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            if (obtainStyledAttributes.getResourceId(C10135k.f40439l4, -1) != -1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = m42958g(context, attributeSet, iArr, i, i2, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: e */
    private static void m42956e(Context context, int[] iArr, String str) {
        if (!m42959h(context, iArr)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
        }
    }

    /* renamed from: f */
    public static Context m42957f(Context context, AttributeSet attributeSet, int i, int i2) {
        int j = m42961j(context, attributeSet, i, i2);
        if (j == 0) {
            return context;
        }
        if ((context instanceof C0339d) && ((C0339d) context).mo1116c() == j) {
            return context;
        }
        C0339d dVar = new C0339d(context, j);
        int i3 = m42960i(dVar, attributeSet);
        return i3 != 0 ? new C0339d((Context) dVar, i3) : dVar;
    }

    /* renamed from: g */
    private static boolean m42958g(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int resourceId : iArr2) {
            if (obtainStyledAttributes.getResourceId(resourceId, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: h */
    private static boolean m42959h(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: i */
    private static int m42960i(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f33857c);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    /* renamed from: j */
    private static int m42961j(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f33858d, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: k */
    public static TypedArray m42962k(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m42953b(context, attributeSet, i, i2);
        m42955d(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: l */
    public static C0452a1 m42963l(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m42953b(context, attributeSet, i, i2);
        m42955d(context, attributeSet, iArr, i, i2, iArr2);
        return C0452a1.m2210v(context, attributeSet, iArr, i, i2);
    }
}
