package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0835a0;
import androidx.core.view.C0901e;
import androidx.core.view.C0922k0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p151v.C5753a;

/* renamed from: com.google.android.material.appbar.b */
/* compiled from: HeaderScrollingViewBehavior */
abstract class C7582b extends C7583c<View> {

    /* renamed from: d */
    final Rect f33278d = new Rect();

    /* renamed from: e */
    final Rect f33279e = new Rect();

    /* renamed from: f */
    private int f33280f = 0;

    /* renamed from: g */
    private int f33281g;

    public C7582b() {
    }

    /* renamed from: N */
    private static int m42152N(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo24868F(CoordinatorLayout coordinatorLayout, View view, int i) {
        View H = mo24853H(coordinatorLayout.mo2752l(view));
        if (H != null) {
            CoordinatorLayout.C0606f fVar = (CoordinatorLayout.C0606f) view.getLayoutParams();
            Rect rect = this.f33278d;
            rect.set(coordinatorLayout.getPaddingLeft() + fVar.leftMargin, H.getBottom() + fVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - fVar.rightMargin, ((coordinatorLayout.getHeight() + H.getBottom()) - coordinatorLayout.getPaddingBottom()) - fVar.bottomMargin);
            C0922k0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C0835a0.m3762y(coordinatorLayout) && !C0835a0.m3762y(view)) {
                rect.left += lastWindowInsets.mo3417i();
                rect.right -= lastWindowInsets.mo3418j();
            }
            Rect rect2 = this.f33279e;
            C0901e.m4083a(m42152N(fVar.f1987c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int I = mo24869I(H);
            view.layout(rect2.left, rect2.top - I, rect2.right, rect2.bottom - I);
            this.f33280f = rect2.top - H.getBottom();
            return;
        }
        super.mo24868F(coordinatorLayout, view, i);
        this.f33280f = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public abstract View mo24853H(List<View> list);

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final int mo24869I(View view) {
        if (this.f33281g == 0) {
            return 0;
        }
        float J = mo24854J(view);
        int i = this.f33281g;
        return C5753a.m34335b((int) (J * ((float) i)), 0, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public float mo24854J(View view) {
        return 1.0f;
    }

    /* renamed from: K */
    public final int mo24870K() {
        return this.f33281g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public int mo24855L(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final int mo24871M() {
        return this.f33280f;
    }

    /* renamed from: O */
    public final void mo24872O(int i) {
        this.f33281g = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public boolean mo24873P() {
        return false;
    }

    /* renamed from: m */
    public boolean mo2794m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View H;
        C0922k0 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (H = mo24853H(coordinatorLayout.mo2752l(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (C0835a0.m3762y(H) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.mo3419k() + lastWindowInsets.mo3415h();
        }
        int L = size + mo24855L(H);
        int measuredHeight = H.getMeasuredHeight();
        if (mo24873P()) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            L -= measuredHeight;
        }
        coordinatorLayout.mo2729D(view, i, i2, View.MeasureSpec.makeMeasureSpec(L, i5 == -1 ? 1073741824 : RecyclerView.UNDEFINED_DURATION), i4);
        return true;
    }

    public C7582b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
