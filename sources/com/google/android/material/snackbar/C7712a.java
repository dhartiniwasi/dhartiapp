package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.C7717e;

/* renamed from: com.google.android.material.snackbar.a */
/* compiled from: BaseTransientBottomBar */
public class C7712a {

    /* renamed from: a */
    private C7717e.C7719b f33865a;

    public C7712a(SwipeDismissBehavior<?> swipeDismissBehavior) {
        swipeDismissBehavior.mo24885K(0.1f);
        swipeDismissBehavior.mo24884J(0.6f);
        swipeDismissBehavior.mo24886L(0);
    }

    /* renamed from: a */
    public boolean mo25753a(View view) {
        return view instanceof C7715d;
    }

    /* renamed from: b */
    public void mo25754b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                C7717e.m42976b().mo25770f(this.f33865a);
            }
        } else if (coordinatorLayout.mo2775v(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            C7717e.m42976b().mo25769e(this.f33865a);
        }
    }
}
