package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: k */
    private final C7712a f33860k = new C7712a(this);

    /* renamed from: E */
    public boolean mo24883E(View view) {
        return this.f33860k.mo25753a(view);
    }

    /* renamed from: k */
    public boolean mo2792k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f33860k.mo25754b(coordinatorLayout, view, motionEvent);
        return super.mo2792k(coordinatorLayout, view, motionEvent);
    }
}
