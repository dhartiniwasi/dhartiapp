package p066i4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: i4.u */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C4681u extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C4683w f25241a;

    C4681u(C4683w wVar) {
        this.f25241a = wVar;
    }

    /* renamed from: a */
    private final void m30359a(boolean z) {
        this.f25241a.setClickable(z);
        this.f25241a.f25246a.setClickable(z);
    }

    public final void onAnimationCancel(Animator animator) {
        m30359a(true);
    }

    public final void onAnimationEnd(Animator animator) {
        m30359a(true);
    }

    public final void onAnimationStart(Animator animator) {
        m30359a(false);
    }
}
