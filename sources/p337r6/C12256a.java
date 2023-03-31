package p337r6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0563v;
import androidx.core.widget.C0972d;
import p227f6.C10126b;
import p227f6.C10134j;
import p283l6.C11758a;

/* renamed from: r6.a */
/* compiled from: MaterialRadioButton */
public class C12256a extends C0563v {

    /* renamed from: g */
    private static final int f45427g = C10134j.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: h */
    private static final int[][] f45428h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e */
    private ColorStateList f45429e;

    /* renamed from: f */
    private boolean f45430f;

    public C12256a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C10126b.f40235r);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f45429e == null) {
            int c = C11758a.m57062c(this, C10126b.f40231e);
            int c2 = C11758a.m57062c(this, C10126b.colorOnSurface);
            int c3 = C11758a.m57062c(this, C10126b.colorSurface);
            int[][] iArr = f45428h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C11758a.m57065f(c3, c, 1.0f);
            iArr2[1] = C11758a.m57065f(c3, c2, 0.54f);
            iArr2[2] = C11758a.m57065f(c3, c2, 0.38f);
            iArr2[3] = C11758a.m57065f(c3, c2, 0.38f);
            this.f45429e = new ColorStateList(iArr, iArr2);
        }
        return this.f45429e;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f45430f && C0972d.m4413b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f45430f = z;
        if (z) {
            C0972d.m4414c(this, getMaterialThemeColorsTintList());
        } else {
            C0972d.m4414c(this, (ColorStateList) null);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C12256a(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f45427g
            android.content.Context r7 = com.google.android.material.internal.C7709g.m42957f(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            int[] r2 = p227f6.C10135k.f40377b2
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.C7709g.m42962k(r0, r1, r2, r3, r4, r5)
            int r9 = p227f6.C10135k.f40383c2
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f45430f = r7
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p337r6.C12256a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
