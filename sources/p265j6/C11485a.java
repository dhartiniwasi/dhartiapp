package p265j6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;
import p265j6.C11489d;

/* renamed from: j6.a */
/* compiled from: CircularRevealCompat */
public final class C11485a {

    /* renamed from: j6.a$a */
    /* compiled from: CircularRevealCompat */
    static class C11486a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C11489d f43904a;

        C11486a(C11489d dVar) {
            this.f43904a = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f43904a.mo35473b();
        }

        public void onAnimationStart(Animator animator) {
            this.f43904a.mo35472a();
        }
    }

    /* renamed from: a */
    public static Animator m56224a(C11489d dVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(dVar, C11489d.C11492c.f43908a, C11489d.C11491b.f43906b, new C11489d.C11494e[]{new C11489d.C11494e(f, f2, f3)});
        if (Build.VERSION.SDK_INT < 21) {
            return ofObject;
        }
        C11489d.C11494e revealInfo = dVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) dVar, (int) f, (int) f2, revealInfo.f43912c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    /* renamed from: b */
    public static Animator.AnimatorListener m56225b(C11489d dVar) {
        return new C11486a(dVar);
    }
}
