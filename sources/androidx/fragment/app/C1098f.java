package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.p010os.C0763e;
import androidx.core.view.C0956x;
import androidx.fragment.app.C1148x;
import p019c0.C1833a;
import p019c0.C1834b;

/* renamed from: androidx.fragment.app.f */
/* compiled from: FragmentAnim */
class C1098f {

    /* renamed from: androidx.fragment.app.f$a */
    /* compiled from: FragmentAnim */
    class C1099a implements C0763e.C0765b {

        /* renamed from: a */
        final /* synthetic */ Fragment f3009a;

        C1099a(Fragment fragment) {
            this.f3009a = fragment;
        }

        /* renamed from: a */
        public void mo3142a() {
            if (this.f3009a.mo3822l() != null) {
                View l = this.f3009a.mo3822l();
                this.f3009a.mo3844r1((View) null);
                l.clearAnimation();
            }
            this.f3009a.mo3851t1((Animator) null);
        }
    }

    /* renamed from: androidx.fragment.app.f$b */
    /* compiled from: FragmentAnim */
    class C1100b implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3010a;

        /* renamed from: b */
        final /* synthetic */ Fragment f3011b;

        /* renamed from: c */
        final /* synthetic */ C1148x.C1155g f3012c;

        /* renamed from: d */
        final /* synthetic */ C0763e f3013d;

        /* renamed from: androidx.fragment.app.f$b$a */
        /* compiled from: FragmentAnim */
        class C1101a implements Runnable {
            C1101a() {
            }

            public void run() {
                if (C1100b.this.f3011b.mo3822l() != null) {
                    C1100b.this.f3011b.mo3844r1((View) null);
                    C1100b bVar = C1100b.this;
                    bVar.f3012c.mo4179a(bVar.f3011b, bVar.f3013d);
                }
            }
        }

        C1100b(ViewGroup viewGroup, Fragment fragment, C1148x.C1155g gVar, C0763e eVar) {
            this.f3010a = viewGroup;
            this.f3011b = fragment;
            this.f3012c = gVar;
            this.f3013d = eVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f3010a.post(new C1101a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.fragment.app.f$c */
    /* compiled from: FragmentAnim */
    class C1102c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3015a;

        /* renamed from: b */
        final /* synthetic */ View f3016b;

        /* renamed from: c */
        final /* synthetic */ Fragment f3017c;

        /* renamed from: d */
        final /* synthetic */ C1148x.C1155g f3018d;

        /* renamed from: e */
        final /* synthetic */ C0763e f3019e;

        C1102c(ViewGroup viewGroup, View view, Fragment fragment, C1148x.C1155g gVar, C0763e eVar) {
            this.f3015a = viewGroup;
            this.f3016b = view;
            this.f3017c = fragment;
            this.f3018d = gVar;
            this.f3019e = eVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3015a.endViewTransition(this.f3016b);
            Animator m = this.f3017c.mo3825m();
            this.f3017c.mo3851t1((Animator) null);
            if (m != null && this.f3015a.indexOfChild(this.f3016b) < 0) {
                this.f3018d.mo4179a(this.f3017c, this.f3019e);
            }
        }
    }

    /* renamed from: a */
    static void m4935a(Fragment fragment, C1103d dVar, C1148x.C1155g gVar) {
        View view = fragment.f2818P;
        ViewGroup viewGroup = fragment.f2817O;
        viewGroup.startViewTransition(view);
        C0763e eVar = new C0763e();
        eVar.mo3141c(new C1099a(fragment));
        gVar.mo4180b(fragment, eVar);
        if (dVar.f3020a != null) {
            C1104e eVar2 = new C1104e(dVar.f3020a, viewGroup, view);
            fragment.mo3844r1(fragment.f2818P);
            eVar2.setAnimationListener(new C1100b(viewGroup, fragment, gVar, eVar));
            fragment.f2818P.startAnimation(eVar2);
            return;
        }
        Animator animator = dVar.f3021b;
        fragment.mo3851t1(animator);
        animator.addListener(new C1102c(viewGroup, view, fragment, gVar, eVar));
        animator.setTarget(fragment.f2818P);
        animator.start();
    }

    /* renamed from: b */
    private static int m4936b(Fragment fragment, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return fragment.mo3748E();
            }
            return fragment.mo3751F();
        } else if (z) {
            return fragment.mo3839q();
        } else {
            return fragment.mo3849t();
        }
    }

    /* renamed from: c */
    static C1103d m4937c(Context context, Fragment fragment, boolean z, boolean z2) {
        int A = fragment.mo3736A();
        int b = m4936b(fragment, z, z2);
        boolean z3 = false;
        fragment.mo3847s1(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.f2817O;
        if (viewGroup != null) {
            int i = C1834b.f5383c;
            if (viewGroup.getTag(i) != null) {
                fragment.f2817O.setTag(i, (Object) null);
            }
        }
        ViewGroup viewGroup2 = fragment.f2817O;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation n0 = fragment.mo3829n0(A, z, b);
        if (n0 != null) {
            return new C1103d(n0);
        }
        Animator o0 = fragment.mo3832o0(A, z, b);
        if (o0 != null) {
            return new C1103d(o0);
        }
        if (b == 0 && A != 0) {
            b = m4938d(A, z);
        }
        if (b != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(b));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, b);
                    if (loadAnimation != null) {
                        return new C1103d(loadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, b);
                    if (loadAnimator != null) {
                        return new C1103d(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, b);
                        if (loadAnimation2 != null) {
                            return new C1103d(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    private static int m4938d(int i, boolean z) {
        if (i == 4097) {
            return z ? C1833a.f5379e : C1833a.f5380f;
        }
        if (i == 4099) {
            return z ? C1833a.f5377c : C1833a.f5378d;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? C1833a.f5375a : C1833a.f5376b;
    }

    /* renamed from: androidx.fragment.app.f$d */
    /* compiled from: FragmentAnim */
    static class C1103d {

        /* renamed from: a */
        public final Animation f3020a;

        /* renamed from: b */
        public final Animator f3021b;

        C1103d(Animation animation) {
            this.f3020a = animation;
            this.f3021b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        C1103d(Animator animator) {
            this.f3020a = null;
            this.f3021b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.f$e */
    /* compiled from: FragmentAnim */
    static class C1104e extends AnimationSet implements Runnable {

        /* renamed from: a */
        private final ViewGroup f3022a;

        /* renamed from: b */
        private final View f3023b;

        /* renamed from: c */
        private boolean f3024c;

        /* renamed from: d */
        private boolean f3025d;

        /* renamed from: e */
        private boolean f3026e = true;

        C1104e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f3022a = viewGroup;
            this.f3023b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f3026e = true;
            if (this.f3024c) {
                return !this.f3025d;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f3024c = true;
                C0956x.m4317a(this.f3022a, this);
            }
            return true;
        }

        public void run() {
            if (this.f3024c || !this.f3026e) {
                this.f3022a.endViewTransition(this.f3023b);
                this.f3025d = true;
                return;
            }
            this.f3026e = false;
            this.f3022a.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f3026e = true;
            if (this.f3024c) {
                return !this.f3025d;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f3024c = true;
                C0956x.m4317a(this.f3022a, this);
            }
            return true;
        }
    }
}
