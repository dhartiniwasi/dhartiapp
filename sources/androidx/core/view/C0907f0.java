package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: androidx.core.view.f0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0907f0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C0919j0 f2556a;

    /* renamed from: b */
    public final /* synthetic */ View f2557b;

    public /* synthetic */ C0907f0(C0919j0 j0Var, View view) {
        this.f2556a = j0Var;
        this.f2557b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f2556a.mo1086a(this.f2557b);
    }
}
