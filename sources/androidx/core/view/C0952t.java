package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.core.view.t */
/* compiled from: NestedScrollingParentHelper */
public class C0952t {

    /* renamed from: a */
    private int f2624a;

    /* renamed from: b */
    private int f2625b;

    public C0952t(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int mo3491a() {
        return this.f2624a | this.f2625b;
    }

    /* renamed from: b */
    public void mo3492b(View view, View view2, int i) {
        mo3493c(view, view2, i, 0);
    }

    /* renamed from: c */
    public void mo3493c(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f2625b = i;
        } else {
            this.f2624a = i;
        }
    }

    /* renamed from: d */
    public void mo3494d(View view) {
        mo3495e(view, 0);
    }

    /* renamed from: e */
    public void mo3495e(View view, int i) {
        if (i == 1) {
            this.f2625b = 0;
        } else {
            this.f2624a = 0;
        }
    }
}
