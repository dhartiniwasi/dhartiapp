package p236g6;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: g6.i */
/* compiled from: MotionTiming */
public class C10216i {

    /* renamed from: a */
    private long f40665a = 0;

    /* renamed from: b */
    private long f40666b = 300;

    /* renamed from: c */
    private TimeInterpolator f40667c = null;

    /* renamed from: d */
    private int f40668d = 0;

    /* renamed from: e */
    private int f40669e = 1;

    public C10216i(long j, long j2) {
        this.f40665a = j;
        this.f40666b = j2;
    }

    /* renamed from: b */
    static C10216i m51732b(ValueAnimator valueAnimator) {
        C10216i iVar = new C10216i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m51733f(valueAnimator));
        iVar.f40668d = valueAnimator.getRepeatCount();
        iVar.f40669e = valueAnimator.getRepeatMode();
        return iVar;
    }

    /* renamed from: f */
    private static TimeInterpolator m51733f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return C10208a.f40651b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return C10208a.f40652c;
        }
        return interpolator instanceof DecelerateInterpolator ? C10208a.f40653d : interpolator;
    }

    /* renamed from: a */
    public void mo32900a(Animator animator) {
        animator.setStartDelay(mo32901c());
        animator.setDuration(mo32902d());
        animator.setInterpolator(mo32903e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(mo32905g());
            valueAnimator.setRepeatMode(mo32906h());
        }
    }

    /* renamed from: c */
    public long mo32901c() {
        return this.f40665a;
    }

    /* renamed from: d */
    public long mo32902d() {
        return this.f40666b;
    }

    /* renamed from: e */
    public TimeInterpolator mo32903e() {
        TimeInterpolator timeInterpolator = this.f40667c;
        return timeInterpolator != null ? timeInterpolator : C10208a.f40651b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10216i)) {
            return false;
        }
        C10216i iVar = (C10216i) obj;
        if (mo32901c() == iVar.mo32901c() && mo32902d() == iVar.mo32902d() && mo32905g() == iVar.mo32905g() && mo32906h() == iVar.mo32906h()) {
            return mo32903e().getClass().equals(iVar.mo32903e().getClass());
        }
        return false;
    }

    /* renamed from: g */
    public int mo32905g() {
        return this.f40668d;
    }

    /* renamed from: h */
    public int mo32906h() {
        return this.f40669e;
    }

    public int hashCode() {
        return (((((((((int) (mo32901c() ^ (mo32901c() >>> 32))) * 31) + ((int) (mo32902d() ^ (mo32902d() >>> 32)))) * 31) + mo32903e().getClass().hashCode()) * 31) + mo32905g()) * 31) + mo32906h();
    }

    public String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + mo32901c() + " duration: " + mo32902d() + " interpolator: " + mo32903e().getClass() + " repeatCount: " + mo32905g() + " repeatMode: " + mo32906h() + "}\n";
    }

    public C10216i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f40665a = j;
        this.f40666b = j2;
        this.f40667c = timeInterpolator;
    }
}
