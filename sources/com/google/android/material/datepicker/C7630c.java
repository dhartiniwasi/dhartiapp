package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import p227f6.C10126b;
import p227f6.C10135k;
import p346s6.C12455b;
import p346s6.C12456c;

/* renamed from: com.google.android.material.datepicker.c */
/* compiled from: CalendarStyle */
final class C7630c {

    /* renamed from: a */
    final C7629b f33563a;

    /* renamed from: b */
    final C7629b f33564b;

    /* renamed from: c */
    final C7629b f33565c;

    /* renamed from: d */
    final C7629b f33566d;

    /* renamed from: e */
    final C7629b f33567e;

    /* renamed from: f */
    final C7629b f33568f;

    /* renamed from: g */
    final C7629b f33569g;

    /* renamed from: h */
    final Paint f33570h;

    C7630c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C12455b.m59418c(context, C10126b.materialCalendarStyle, C7636h.class.getCanonicalName()), C10135k.f40255D1);
        this.f33563a = C7629b.m42561a(context, obtainStyledAttributes.getResourceId(C10135k.f40270G1, 0));
        this.f33569g = C7629b.m42561a(context, obtainStyledAttributes.getResourceId(C10135k.f40260E1, 0));
        this.f33564b = C7629b.m42561a(context, obtainStyledAttributes.getResourceId(C10135k.f40265F1, 0));
        this.f33565c = C7629b.m42561a(context, obtainStyledAttributes.getResourceId(C10135k.f40275H1, 0));
        ColorStateList a = C12456c.m59420a(context, obtainStyledAttributes, C10135k.f40280I1);
        this.f33566d = C7629b.m42561a(context, obtainStyledAttributes.getResourceId(C10135k.f40290K1, 0));
        this.f33567e = C7629b.m42561a(context, obtainStyledAttributes.getResourceId(C10135k.f40285J1, 0));
        this.f33568f = C7629b.m42561a(context, obtainStyledAttributes.getResourceId(C10135k.f40295L1, 0));
        Paint paint = new Paint();
        this.f33570h = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
