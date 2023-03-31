package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: com.google.android.material.appbar.c */
/* compiled from: ViewOffsetBehavior */
class C7583c<V extends View> extends CoordinatorLayout.C0603c<V> {

    /* renamed from: a */
    private C7584d f33282a;

    /* renamed from: b */
    private int f33283b = 0;

    /* renamed from: c */
    private int f33284c = 0;

    public C7583c() {
    }

    /* renamed from: E */
    public int mo24851E() {
        C7584d dVar = this.f33282a;
        if (dVar != null) {
            return dVar.mo24875b();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo24868F(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.mo2728C(v, i);
    }

    /* renamed from: G */
    public boolean mo24852G(int i) {
        C7584d dVar = this.f33282a;
        if (dVar != null) {
            return dVar.mo24878e(i);
        }
        this.f33283b = i;
        return false;
    }

    /* renamed from: l */
    public boolean mo2793l(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo24868F(coordinatorLayout, v, i);
        if (this.f33282a == null) {
            this.f33282a = new C7584d(v);
        }
        this.f33282a.mo24876c();
        this.f33282a.mo24874a();
        int i2 = this.f33283b;
        if (i2 != 0) {
            this.f33282a.mo24878e(i2);
            this.f33283b = 0;
        }
        int i3 = this.f33284c;
        if (i3 == 0) {
            return true;
        }
        this.f33282a.mo24877d(i3);
        this.f33284c = 0;
        return true;
    }

    public C7583c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
