package p255i6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0493g;
import androidx.core.widget.C0972d;
import p227f6.C10126b;
import p227f6.C10134j;
import p283l6.C11758a;

/* renamed from: i6.a */
/* compiled from: MaterialCheckBox */
public class C10547a extends C0493g {

    /* renamed from: g */
    private static final int f41574g = C10134j.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: h */
    private static final int[][] f41575h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e */
    private ColorStateList f41576e;

    /* renamed from: f */
    private boolean f41577f;

    public C10547a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C10126b.f40230b);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f41576e == null) {
            int[][] iArr = f41575h;
            int[] iArr2 = new int[iArr.length];
            int c = C11758a.m57062c(this, C10126b.f40231e);
            int c2 = C11758a.m57062c(this, C10126b.colorSurface);
            int c3 = C11758a.m57062c(this, C10126b.colorOnSurface);
            iArr2[0] = C11758a.m57065f(c2, c, 1.0f);
            iArr2[1] = C11758a.m57065f(c2, c3, 0.54f);
            iArr2[2] = C11758a.m57065f(c2, c3, 0.38f);
            iArr2[3] = C11758a.m57065f(c2, c3, 0.38f);
            this.f41576e = new ColorStateList(iArr, iArr2);
        }
        return this.f41576e;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f41577f && C0972d.m4413b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f41577f = z;
        if (z) {
            C0972d.m4414c(this, getMaterialThemeColorsTintList());
        } else {
            C0972d.m4414c(this, (ColorStateList) null);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10547a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f41574g
            android.content.Context r8 = com.google.android.material.internal.C7709g.m42957f(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p227f6.C10135k.f40360Y1
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C7709g.m42962k(r0, r1, r2, r3, r4, r5)
            int r10 = p227f6.C10135k.f40365Z1
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x0028
            android.content.res.ColorStateList r8 = p346s6.C12456c.m59420a(r8, r9, r10)
            androidx.core.widget.C0972d.m4414c(r7, r8)
        L_0x0028:
            int r8 = p227f6.C10135k.f40371a2
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f41577f = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p255i6.C10547a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
