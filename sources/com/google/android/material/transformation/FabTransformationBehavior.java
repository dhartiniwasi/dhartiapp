package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0835a0;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.util.ArrayList;
import java.util.List;
import p227f6.C10130f;
import p236g6.C10208a;
import p236g6.C10209b;
import p236g6.C10210c;
import p236g6.C10211d;
import p236g6.C10212e;
import p236g6.C10215h;
import p236g6.C10216i;
import p236g6.C10217j;
import p265j6.C11485a;
import p265j6.C11488c;
import p265j6.C11489d;
import p328q6.C12190a;
import p394x6.C12975a;
import p394x6.C12976b;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f34036c = new Rect();

    /* renamed from: d */
    private final RectF f34037d = new RectF();

    /* renamed from: e */
    private final RectF f34038e = new RectF();

    /* renamed from: f */
    private final int[] f34039f = new int[2];

    /* renamed from: g */
    private float f34040g;

    /* renamed from: h */
    private float f34041h;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    class C7762a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f34042a;

        /* renamed from: b */
        final /* synthetic */ View f34043b;

        /* renamed from: c */
        final /* synthetic */ View f34044c;

        C7762a(boolean z, View view, View view2) {
            this.f34042a = z;
            this.f34043b = view;
            this.f34044c = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f34042a) {
                this.f34043b.setVisibility(4);
                this.f34044c.setAlpha(1.0f);
                this.f34044c.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f34042a) {
                this.f34043b.setVisibility(0);
                this.f34044c.setAlpha(0.0f);
                this.f34044c.setVisibility(4);
            }
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    class C7763b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f34046a;

        C7763b(View view) {
            this.f34046a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f34046a.invalidate();
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    class C7764c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C11489d f34048a;

        /* renamed from: b */
        final /* synthetic */ Drawable f34049b;

        C7764c(C11489d dVar, Drawable drawable) {
            this.f34048a = dVar;
            this.f34049b = drawable;
        }

        public void onAnimationEnd(Animator animator) {
            this.f34048a.setCircularRevealOverlayDrawable((Drawable) null);
        }

        public void onAnimationStart(Animator animator) {
            this.f34048a.setCircularRevealOverlayDrawable(this.f34049b);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    class C7765d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C11489d f34051a;

        C7765d(C11489d dVar) {
            this.f34051a = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            C11489d.C11494e revealInfo = this.f34051a.getRevealInfo();
            revealInfo.f43912c = Float.MAX_VALUE;
            this.f34051a.setRevealInfo(revealInfo);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    protected static class C7766e {

        /* renamed from: a */
        public C10215h f34053a;

        /* renamed from: b */
        public C10217j f34054b;

        protected C7766e() {
        }
    }

    public FabTransformationBehavior() {
    }

    /* renamed from: K */
    private ViewGroup m43162K(View view) {
        View findViewById = view.findViewById(C10130f.mtrl_child_content_container);
        if (findViewById != null) {
            return m43182f0(findViewById);
        }
        if ((view instanceof C12976b) || (view instanceof C12975a)) {
            return m43182f0(((ViewGroup) view).getChildAt(0));
        }
        return m43182f0(view);
    }

    /* renamed from: L */
    private void m43163L(View view, C7766e eVar, C10216i iVar, C10216i iVar2, float f, float f2, float f3, float f4, RectF rectF) {
        float S = m43170S(eVar, iVar, f, f3);
        float S2 = m43170S(eVar, iVar2, f2, f4);
        Rect rect = this.f34036c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f34037d;
        rectF2.set(rect);
        RectF rectF3 = this.f34038e;
        m43171T(view, rectF3);
        rectF3.offset(S, S2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: M */
    private void m43164M(View view, RectF rectF) {
        m43171T(view, rectF);
        rectF.offset(this.f34040g, this.f34041h);
    }

    /* renamed from: N */
    private Pair<C10216i, C10216i> m43165N(float f, float f2, boolean z, C7766e eVar) {
        C10216i iVar;
        C10216i iVar2;
        int i;
        if (f == 0.0f || f2 == 0.0f) {
            iVar2 = eVar.f34053a.mo32892e("translationXLinear");
            iVar = eVar.f34053a.mo32892e("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || i <= 0)) {
            iVar2 = eVar.f34053a.mo32892e("translationXCurveDownwards");
            iVar = eVar.f34053a.mo32892e("translationYCurveDownwards");
        } else {
            iVar2 = eVar.f34053a.mo32892e("translationXCurveUpwards");
            iVar = eVar.f34053a.mo32892e("translationYCurveUpwards");
        }
        return new Pair<>(iVar2, iVar);
    }

    /* renamed from: O */
    private float m43166O(View view, View view2, C10217j jVar) {
        RectF rectF = this.f34037d;
        RectF rectF2 = this.f34038e;
        m43164M(view, rectF);
        m43171T(view2, rectF2);
        rectF2.offset(-m43168Q(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: P */
    private float m43167P(View view, View view2, C10217j jVar) {
        RectF rectF = this.f34037d;
        RectF rectF2 = this.f34038e;
        m43164M(view, rectF);
        m43171T(view2, rectF2);
        rectF2.offset(0.0f, -m43169R(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: Q */
    private float m43168Q(View view, View view2, C10217j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f34037d;
        RectF rectF2 = this.f34038e;
        m43164M(view, rectF);
        m43171T(view2, rectF2);
        int i = jVar.f40670a & 7;
        if (i == 1) {
            f3 = rectF2.centerX();
            f2 = rectF.centerX();
        } else if (i == 3) {
            f3 = rectF2.left;
            f2 = rectF.left;
        } else if (i != 5) {
            f = 0.0f;
            return f + jVar.f40671b;
        } else {
            f3 = rectF2.right;
            f2 = rectF.right;
        }
        f = f3 - f2;
        return f + jVar.f40671b;
    }

    /* renamed from: R */
    private float m43169R(View view, View view2, C10217j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f34037d;
        RectF rectF2 = this.f34038e;
        m43164M(view, rectF);
        m43171T(view2, rectF2);
        int i = jVar.f40670a & C8710R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        if (i == 16) {
            f3 = rectF2.centerY();
            f2 = rectF.centerY();
        } else if (i == 48) {
            f3 = rectF2.top;
            f2 = rectF.top;
        } else if (i != 80) {
            f = 0.0f;
            return f + jVar.f40672c;
        } else {
            f3 = rectF2.bottom;
            f2 = rectF.bottom;
        }
        f = f3 - f2;
        return f + jVar.f40672c;
    }

    /* renamed from: S */
    private float m43170S(C7766e eVar, C10216i iVar, float f, float f2) {
        long c = iVar.mo32901c();
        long d = iVar.mo32902d();
        C10216i e = eVar.f34053a.mo32892e("expansion");
        return C10208a.m51712a(f, f2, iVar.mo32903e().getInterpolation(((float) (((e.mo32901c() + e.mo32902d()) + 17) - c)) / ((float) d)));
    }

    /* renamed from: T */
    private void m43171T(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f34039f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* renamed from: U */
    private void m43172U(View view, View view2, boolean z, boolean z2, C7766e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup K;
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if ((!(view2 instanceof C11489d) || C11488c.f43905a != 0) && (K = m43162K(view2)) != null) {
                if (z) {
                    if (!z2) {
                        C10211d.f40656a.set(K, Float.valueOf(0.0f));
                    }
                    objectAnimator = ObjectAnimator.ofFloat(K, C10211d.f40656a, new float[]{1.0f});
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(K, C10211d.f40656a, new float[]{0.0f});
                }
                eVar.f34053a.mo32892e("contentFade").mo32900a(objectAnimator);
                list.add(objectAnimator);
            }
        }
    }

    /* renamed from: V */
    private void m43173V(View view, View view2, boolean z, boolean z2, C7766e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof C11489d) {
            C11489d dVar = (C11489d) view2;
            int d0 = m43181d0(view);
            int i = 16777215 & d0;
            if (z) {
                if (!z2) {
                    dVar.setCircularRevealScrimColor(d0);
                }
                objectAnimator = ObjectAnimator.ofInt(dVar, C11489d.C11493d.f43909a, new int[]{i});
            } else {
                objectAnimator = ObjectAnimator.ofInt(dVar, C11489d.C11493d.f43909a, new int[]{d0});
            }
            objectAnimator.setEvaluator(C10210c.m51714b());
            eVar.f34053a.mo32892e("color").mo32900a(objectAnimator);
            list.add(objectAnimator);
        }
    }

    /* renamed from: W */
    private void m43174W(View view, View view2, boolean z, C7766e eVar, List<Animator> list) {
        float Q = m43168Q(view, view2, eVar.f34054b);
        float R = m43169R(view, view2, eVar.f34054b);
        Pair<C10216i, C10216i> N = m43165N(Q, R, z, eVar);
        C10216i iVar = (C10216i) N.first;
        C10216i iVar2 = (C10216i) N.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            Q = this.f34040g;
        }
        fArr[0] = Q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            R = this.f34041h;
        }
        fArr2[0] = R;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        iVar.mo32900a(ofFloat);
        iVar2.mo32900a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    /* renamed from: X */
    private void m43175X(View view, View view2, boolean z, boolean z2, C7766e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float v = C0835a0.m3756v(view2) - C0835a0.m3756v(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-v);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-v});
        }
        eVar.f34053a.mo32892e("elevation").mo32900a(objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: Y */
    private void m43176Y(View view, View view2, boolean z, boolean z2, C7766e eVar, float f, float f2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        View view3 = view;
        View view4 = view2;
        C7766e eVar2 = eVar;
        if (view4 instanceof C11489d) {
            C11489d dVar = (C11489d) view4;
            float O = m43166O(view3, view4, eVar2.f34054b);
            float P = m43167P(view3, view4, eVar2.f34054b);
            ((FloatingActionButton) view3).mo25528i(this.f34036c);
            float width = ((float) this.f34036c.width()) / 2.0f;
            C10216i e = eVar2.f34053a.mo32892e("expansion");
            if (z) {
                if (!z2) {
                    dVar.setRevealInfo(new C11489d.C11494e(O, P, width));
                }
                if (z2) {
                    width = dVar.getRevealInfo().f43912c;
                }
                animator = C11485a.m56224a(dVar, O, P, C12190a.m58478b(O, P, 0.0f, 0.0f, f, f2));
                animator.addListener(new C7765d(dVar));
                m43179b0(view2, e.mo32901c(), (int) O, (int) P, width, list);
            } else {
                float f3 = dVar.getRevealInfo().f43912c;
                Animator a = C11485a.m56224a(dVar, O, P, width);
                int i = (int) O;
                int i2 = (int) P;
                View view5 = view2;
                m43179b0(view5, e.mo32901c(), i, i2, f3, list);
                long c = e.mo32901c();
                long d = e.mo32902d();
                long f4 = eVar2.f34053a.mo32894f();
                m43178a0(view5, c, d, f4, i, i2, width, list);
                animator = a;
            }
            e.mo32900a(animator);
            list.add(animator);
            list2.add(C11485a.m56225b(dVar));
        }
    }

    /* renamed from: Z */
    private void m43177Z(View view, View view2, boolean z, boolean z2, C7766e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof C11489d) && (view instanceof ImageView)) {
            C11489d dVar = (C11489d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, C10212e.f40657b, new int[]{0});
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, C10212e.f40657b, new int[]{255});
                }
                objectAnimator.addUpdateListener(new C7763b(view2));
                eVar.f34053a.mo32892e("iconFade").mo32900a(objectAnimator);
                list.add(objectAnimator);
                list2.add(new C7764c(dVar, drawable));
            }
        }
    }

    /* renamed from: a0 */
    private void m43178a0(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 < j3) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
                createCircularReveal.setStartDelay(j4);
                createCircularReveal.setDuration(j3 - j4);
                list.add(createCircularReveal);
            }
        }
    }

    /* renamed from: b0 */
    private void m43179b0(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: c0 */
    private void m43180c0(View view, View view2, boolean z, boolean z2, C7766e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        View view3 = view;
        View view4 = view2;
        boolean z3 = z;
        C7766e eVar2 = eVar;
        List<Animator> list3 = list;
        float Q = m43168Q(view3, view4, eVar2.f34054b);
        float R = m43169R(view3, view4, eVar2.f34054b);
        Pair<C10216i, C10216i> N = m43165N(Q, R, z3, eVar2);
        C10216i iVar = (C10216i) N.first;
        C10216i iVar2 = (C10216i) N.second;
        if (z3) {
            if (!z2) {
                view4.setTranslationX(-Q);
                view4.setTranslationY(-R);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{0.0f});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{0.0f});
            m43163L(view2, eVar, iVar, iVar2, -Q, -R, 0.0f, 0.0f, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{-Q});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{-R});
        }
        iVar.mo32900a(objectAnimator2);
        iVar2.mo32900a(objectAnimator);
        list3.add(objectAnimator2);
        list3.add(objectAnimator);
    }

    /* renamed from: d0 */
    private int m43181d0(View view) {
        ColorStateList r = C0835a0.m3748r(view);
        if (r != null) {
            return r.getColorForState(view.getDrawableState(), r.getDefaultColor());
        }
        return 0;
    }

    /* renamed from: f0 */
    private ViewGroup m43182f0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public AnimatorSet mo25965J(View view, View view2, boolean z, boolean z2) {
        boolean z3 = z;
        C7766e e0 = mo25967e0(view2.getContext(), z3);
        if (z3) {
            this.f34040g = view.getTranslationX();
            this.f34041h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            m43175X(view, view2, z, z2, e0, arrayList, arrayList2);
        }
        RectF rectF = this.f34037d;
        View view3 = view;
        View view4 = view2;
        boolean z4 = z;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        m43180c0(view3, view4, z4, z2, e0, arrayList3, arrayList4, rectF);
        float width = rectF.width();
        float height = rectF.height();
        m43174W(view3, view4, z4, e0, arrayList);
        boolean z5 = z2;
        C7766e eVar = e0;
        m43177Z(view3, view4, z4, z5, eVar, arrayList3, arrayList4);
        m43176Y(view3, view4, z4, z5, eVar, width, height, arrayList, arrayList2);
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        m43173V(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        m43172U(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        AnimatorSet animatorSet = new AnimatorSet();
        C10209b.m51713a(animatorSet, arrayList);
        animatorSet.addListener(new C7762a(z3, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    /* renamed from: e */
    public boolean mo2786e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public abstract C7766e mo25967e0(Context context, boolean z);

    /* renamed from: g */
    public void mo2788g(CoordinatorLayout.C0606f fVar) {
        if (fVar.f1992h == 0) {
            fVar.f1992h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
