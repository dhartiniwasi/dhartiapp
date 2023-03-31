package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0835a0;
import java.util.List;
import p319p6.C12122a;

public abstract class ExpandableBehavior extends CoordinatorLayout.C0603c<View> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f34029a = 0;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    class C7760a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ View f34030a;

        /* renamed from: b */
        final /* synthetic */ int f34031b;

        /* renamed from: c */
        final /* synthetic */ C12122a f34032c;

        C7760a(View view, int i, C12122a aVar) {
            this.f34030a = view;
            this.f34031b = i;
            this.f34032c = aVar;
        }

        public boolean onPreDraw() {
            this.f34030a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f34029a == this.f34031b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                C12122a aVar = this.f34032c;
                expandableBehavior.mo25963H((View) aVar, this.f34030a, aVar.mo25507a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    /* renamed from: F */
    private boolean m43153F(boolean z) {
        if (z) {
            int i = this.f34029a;
            return i == 0 || i == 2;
        } else if (this.f34029a == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public C12122a mo25962G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> l = coordinatorLayout.mo2752l(view);
        int size = l.size();
        for (int i = 0; i < size; i++) {
            View view2 = l.get(i);
            if (mo2786e(coordinatorLayout, view, view2)) {
                return (C12122a) view2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public abstract boolean mo25963H(View view, View view2, boolean z, boolean z2);

    /* renamed from: e */
    public abstract boolean mo2786e(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* renamed from: h */
    public boolean mo2789h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        C12122a aVar = (C12122a) view2;
        if (!m43153F(aVar.mo25507a())) {
            return false;
        }
        this.f34029a = aVar.mo25507a() ? 1 : 2;
        return mo25963H((View) aVar, view, aVar.mo25507a(), true);
    }

    /* renamed from: l */
    public boolean mo2793l(CoordinatorLayout coordinatorLayout, View view, int i) {
        C12122a G;
        if (C0835a0.m3705R(view) || (G = mo25962G(coordinatorLayout, view)) == null || !m43153F(G.mo25507a())) {
            return false;
        }
        int i2 = G.mo25507a() ? 1 : 2;
        this.f34029a = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new C7760a(view, i2, G));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
