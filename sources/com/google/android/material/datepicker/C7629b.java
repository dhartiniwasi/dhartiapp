package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import androidx.core.util.C0831h;
import androidx.core.view.C0835a0;
import p227f6.C10135k;
import p346s6.C12456c;
import p375v6.C12822g;
import p375v6.C12829k;

/* renamed from: com.google.android.material.datepicker.b */
/* compiled from: CalendarItemStyle */
final class C7629b {

    /* renamed from: a */
    private final Rect f33557a;

    /* renamed from: b */
    private final ColorStateList f33558b;

    /* renamed from: c */
    private final ColorStateList f33559c;

    /* renamed from: d */
    private final ColorStateList f33560d;

    /* renamed from: e */
    private final int f33561e;

    /* renamed from: f */
    private final C12829k f33562f;

    private C7629b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C12829k kVar, Rect rect) {
        C0831h.m3659c(rect.left);
        C0831h.m3659c(rect.top);
        C0831h.m3659c(rect.right);
        C0831h.m3659c(rect.bottom);
        this.f33557a = rect;
        this.f33558b = colorStateList2;
        this.f33559c = colorStateList;
        this.f33560d = colorStateList3;
        this.f33561e = i;
        this.f33562f = kVar;
    }

    /* renamed from: a */
    static C7629b m42561a(Context context, int i) {
        C0831h.m3657a(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C10135k.f40300M1);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(C10135k.f40305N1, 0), obtainStyledAttributes.getDimensionPixelOffset(C10135k.f40315P1, 0), obtainStyledAttributes.getDimensionPixelOffset(C10135k.f40310O1, 0), obtainStyledAttributes.getDimensionPixelOffset(C10135k.f40320Q1, 0));
        ColorStateList a = C12456c.m59420a(context, obtainStyledAttributes, C10135k.f40325R1);
        ColorStateList a2 = C12456c.m59420a(context, obtainStyledAttributes, C10135k.f40350W1);
        ColorStateList a3 = C12456c.m59420a(context, obtainStyledAttributes, C10135k.f40340U1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C10135k.f40345V1, 0);
        C12829k m = C12829k.m60630b(context, obtainStyledAttributes.getResourceId(C10135k.f40330S1, 0), obtainStyledAttributes.getResourceId(C10135k.f40335T1, 0)).mo37798m();
        obtainStyledAttributes.recycle();
        return new C7629b(a, a2, a3, dimensionPixelSize, m, rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo25390b() {
        return this.f33557a.bottom;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo25391c() {
        return this.f33557a.top;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo25392d(TextView textView) {
        C12822g gVar = new C12822g();
        C12822g gVar2 = new C12822g();
        gVar.setShapeAppearanceModel(this.f33562f);
        gVar2.setShapeAppearanceModel(this.f33562f);
        gVar.mo37745T(this.f33559c);
        gVar.mo37751Z((float) this.f33561e, this.f33560d);
        textView.setTextColor(this.f33558b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f33558b.withAlpha(30), gVar, gVar2) : gVar;
        Rect rect = this.f33557a;
        C0835a0.m3749r0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
