package p146u0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0835a0;

/* renamed from: u0.d */
/* compiled from: Fade */
public class C5639d extends C5658j0 {

    /* renamed from: u0.d$a */
    /* compiled from: Fade */
    class C5640a extends C5674n {

        /* renamed from: a */
        final /* synthetic */ View f28309a;

        C5640a(View view) {
            this.f28309a = view;
        }

        /* renamed from: d */
        public void mo19955d(C5666m mVar) {
            C5636c0.m33745g(this.f28309a, 1.0f);
            C5636c0.m33739a(this.f28309a);
            mVar.mo20009S(this);
        }
    }

    /* renamed from: u0.d$b */
    /* compiled from: Fade */
    private static class C5641b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f28311a;

        /* renamed from: b */
        private boolean f28312b = false;

        C5641b(View view) {
            this.f28311a = view;
        }

        public void onAnimationEnd(Animator animator) {
            C5636c0.m33745g(this.f28311a, 1.0f);
            if (this.f28312b) {
                this.f28311a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (C0835a0.m3701N(this.f28311a) && this.f28311a.getLayerType() == 0) {
                this.f28312b = true;
                this.f28311a.setLayerType(2, (Paint) null);
            }
        }
    }

    public C5639d(int i) {
        mo19988m0(i);
    }

    /* renamed from: n0 */
    private Animator m33753n0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C5636c0.m33745g(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C5636c0.f28307b, new float[]{f2});
        ofFloat.addListener(new C5641b(view));
        mo20015a(new C5640a(view));
        return ofFloat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = (java.lang.Float) r1.f28427a.get("android:fade:transitionAlpha");
     */
    /* renamed from: o0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float m33754o0(p146u0.C5683s r1, float r2) {
        /*
            if (r1 == 0) goto L_0x0012
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f28427a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0012
            float r2 = r1.floatValue()
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p146u0.C5639d.m33754o0(u0.s, float):float");
    }

    /* renamed from: i0 */
    public Animator mo19967i0(ViewGroup viewGroup, View view, C5683s sVar, C5683s sVar2) {
        float f = 0.0f;
        float o0 = m33754o0(sVar, 0.0f);
        if (o0 != 1.0f) {
            f = o0;
        }
        return m33753n0(view, f, 1.0f);
    }

    /* renamed from: j */
    public void mo19924j(C5683s sVar) {
        super.mo19924j(sVar);
        sVar.f28427a.put("android:fade:transitionAlpha", Float.valueOf(C5636c0.m33741c(sVar.f28428b)));
    }

    /* renamed from: k0 */
    public Animator mo19968k0(ViewGroup viewGroup, View view, C5683s sVar, C5683s sVar2) {
        C5636c0.m33743e(view);
        return m33753n0(view, m33754o0(sVar, 1.0f), 0.0f);
    }
}
