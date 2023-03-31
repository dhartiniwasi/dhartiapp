package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: androidx.core.view.g0 */
/* compiled from: ViewPropertyAnimatorCompat */
public final class C0909g0 {

    /* renamed from: a */
    private final WeakReference<View> f2560a;

    /* renamed from: b */
    Runnable f2561b = null;

    /* renamed from: c */
    Runnable f2562c = null;

    /* renamed from: d */
    int f2563d = -1;

    /* renamed from: androidx.core.view.g0$a */
    /* compiled from: ViewPropertyAnimatorCompat */
    class C0910a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0915h0 f2564a;

        /* renamed from: b */
        final /* synthetic */ View f2565b;

        C0910a(C0915h0 h0Var, View view) {
            this.f2564a = h0Var;
            this.f2565b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f2564a.mo1971a(this.f2565b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f2564a.mo992b(this.f2565b);
        }

        public void onAnimationStart(Animator animator) {
            this.f2564a.mo993c(this.f2565b);
        }
    }

    /* renamed from: androidx.core.view.g0$b */
    /* compiled from: ViewPropertyAnimatorCompat */
    static class C0911b {
        /* renamed from: a */
        static ViewPropertyAnimator m4124a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    /* renamed from: androidx.core.view.g0$c */
    /* compiled from: ViewPropertyAnimatorCompat */
    static class C0912c implements C0915h0 {

        /* renamed from: a */
        C0909g0 f2567a;

        /* renamed from: b */
        boolean f2568b;

        C0912c(C0909g0 g0Var) {
            this.f2567a = g0Var;
        }

        /* renamed from: a */
        public void mo1971a(View view) {
            Object tag = view.getTag(2113929216);
            C0915h0 h0Var = tag instanceof C0915h0 ? (C0915h0) tag : null;
            if (h0Var != null) {
                h0Var.mo1971a(view);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.core.view.h0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo992b(android.view.View r4) {
            /*
                r3 = this;
                androidx.core.view.g0 r0 = r3.f2567a
                int r0 = r0.f2563d
                r1 = -1
                r2 = 0
                if (r0 <= r1) goto L_0x000f
                r4.setLayerType(r0, r2)
                androidx.core.view.g0 r0 = r3.f2567a
                r0.f2563d = r1
            L_0x000f:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 16
                if (r0 >= r1) goto L_0x0019
                boolean r0 = r3.f2568b
                if (r0 != 0) goto L_0x0039
            L_0x0019:
                androidx.core.view.g0 r0 = r3.f2567a
                java.lang.Runnable r1 = r0.f2562c
                if (r1 == 0) goto L_0x0024
                r0.f2562c = r2
                r1.run()
            L_0x0024:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r1 = r0 instanceof androidx.core.view.C0915h0
                if (r1 == 0) goto L_0x0031
                r2 = r0
                androidx.core.view.h0 r2 = (androidx.core.view.C0915h0) r2
            L_0x0031:
                if (r2 == 0) goto L_0x0036
                r2.mo992b(r4)
            L_0x0036:
                r4 = 1
                r3.f2568b = r4
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.C0909g0.C0912c.mo992b(android.view.View):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.core.view.h0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo993c(android.view.View r4) {
            /*
                r3 = this;
                r0 = 0
                r3.f2568b = r0
                androidx.core.view.g0 r0 = r3.f2567a
                int r0 = r0.f2563d
                r1 = 0
                r2 = -1
                if (r0 <= r2) goto L_0x000f
                r0 = 2
                r4.setLayerType(r0, r1)
            L_0x000f:
                androidx.core.view.g0 r0 = r3.f2567a
                java.lang.Runnable r2 = r0.f2561b
                if (r2 == 0) goto L_0x001a
                r0.f2561b = r1
                r2.run()
            L_0x001a:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r2 = r0 instanceof androidx.core.view.C0915h0
                if (r2 == 0) goto L_0x0027
                r1 = r0
                androidx.core.view.h0 r1 = (androidx.core.view.C0915h0) r1
            L_0x0027:
                if (r1 == 0) goto L_0x002c
                r1.mo993c(r4)
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.C0909g0.C0912c.mo993c(android.view.View):void");
        }
    }

    C0909g0(View view) {
        this.f2560a = new WeakReference<>(view);
    }

    /* renamed from: i */
    private void m4113i(View view, C0915h0 h0Var) {
        if (h0Var != null) {
            view.animate().setListener(new C0910a(h0Var, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    /* renamed from: b */
    public C0909g0 mo3385b(float f) {
        View view = (View) this.f2560a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: c */
    public void mo3386c() {
        View view = (View) this.f2560a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: d */
    public long mo3387d() {
        View view = (View) this.f2560a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    /* renamed from: f */
    public C0909g0 mo3388f(long j) {
        View view = (View) this.f2560a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: g */
    public C0909g0 mo3389g(Interpolator interpolator) {
        View view = (View) this.f2560a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: h */
    public C0909g0 mo3390h(C0915h0 h0Var) {
        View view = (View) this.f2560a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                m4113i(view, h0Var);
            } else {
                view.setTag(2113929216, h0Var);
                m4113i(view, new C0912c(this));
            }
        }
        return this;
    }

    /* renamed from: j */
    public C0909g0 mo3391j(long j) {
        View view = (View) this.f2560a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: k */
    public C0909g0 mo3392k(C0919j0 j0Var) {
        View view = (View) this.f2560a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            C0907f0 f0Var = null;
            if (j0Var != null) {
                f0Var = new C0907f0(j0Var, view);
            }
            C0911b.m4124a(view.animate(), f0Var);
        }
        return this;
    }

    /* renamed from: l */
    public void mo3393l() {
        View view = (View) this.f2560a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: m */
    public C0909g0 mo3394m(float f) {
        View view = (View) this.f2560a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
