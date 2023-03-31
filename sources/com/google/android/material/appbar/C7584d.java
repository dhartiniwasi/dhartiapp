package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.C0835a0;

/* renamed from: com.google.android.material.appbar.d */
/* compiled from: ViewOffsetHelper */
class C7584d {

    /* renamed from: a */
    private final View f33285a;

    /* renamed from: b */
    private int f33286b;

    /* renamed from: c */
    private int f33287c;

    /* renamed from: d */
    private int f33288d;

    /* renamed from: e */
    private int f33289e;

    /* renamed from: f */
    private boolean f33290f = true;

    /* renamed from: g */
    private boolean f33291g = true;

    public C7584d(View view) {
        this.f33285a = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo24874a() {
        View view = this.f33285a;
        C0835a0.m3712Y(view, this.f33288d - (view.getTop() - this.f33286b));
        View view2 = this.f33285a;
        C0835a0.m3711X(view2, this.f33289e - (view2.getLeft() - this.f33287c));
    }

    /* renamed from: b */
    public int mo24875b() {
        return this.f33288d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo24876c() {
        this.f33286b = this.f33285a.getTop();
        this.f33287c = this.f33285a.getLeft();
    }

    /* renamed from: d */
    public boolean mo24877d(int i) {
        if (!this.f33291g || this.f33289e == i) {
            return false;
        }
        this.f33289e = i;
        mo24874a();
        return true;
    }

    /* renamed from: e */
    public boolean mo24878e(int i) {
        if (!this.f33290f || this.f33288d == i) {
            return false;
        }
        this.f33288d = i;
        mo24874a();
        return true;
    }
}
