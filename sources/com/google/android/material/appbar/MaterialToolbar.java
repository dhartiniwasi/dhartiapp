package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C0835a0;
import com.google.android.material.internal.C7709g;
import p227f6.C10126b;
import p227f6.C10134j;
import p375v6.C12822g;
import p375v6.C12826h;

public class MaterialToolbar extends Toolbar {

    /* renamed from: g0 */
    private static final int f33267g0 = C10134j.Widget_MaterialComponents_Toolbar;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C10126b.f40229A);
    }

    /* renamed from: R */
    private void m42139R(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C12822g gVar = new C12822g();
            gVar.mo37745T(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.mo37741L(context);
            gVar.mo37744S(C0835a0.m3756v(this));
            C0835a0.m3749r0(this, gVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C12826h.m60625e(this);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C12826h.m60624d(this, f);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(C7709g.m42957f(context, attributeSet, i, f33267g0), attributeSet, i);
        m42139R(getContext());
    }
}
