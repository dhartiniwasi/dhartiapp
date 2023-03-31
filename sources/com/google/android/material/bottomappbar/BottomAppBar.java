package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0732a;
import androidx.core.view.C0835a0;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p169y.C6079a;
import p227f6.C10128d;
import p227f6.C10134j;
import p236g6.C10218k;
import p375v6.C12822g;
import p375v6.C12826h;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.C0602b {

    /* renamed from: u0 */
    private static final int f33314u0 = C10134j.Widget_MaterialComponents_BottomAppBar;

    /* renamed from: g0 */
    private final int f33315g0;

    /* renamed from: h0 */
    private final C12822g f33316h0;

    /* renamed from: i0 */
    private Animator f33317i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public Animator f33318j0;

    /* renamed from: k0 */
    private int f33319k0;

    /* renamed from: l0 */
    private int f33320l0;

    /* renamed from: m0 */
    private boolean f33321m0;

    /* renamed from: n0 */
    private int f33322n0;

    /* renamed from: o0 */
    private ArrayList<C7597f> f33323o0;

    /* renamed from: p0 */
    private boolean f33324p0;

    /* renamed from: q0 */
    private Behavior f33325q0;

    /* renamed from: r0 */
    private int f33326r0;

    /* renamed from: s0 */
    AnimatorListenerAdapter f33327s0;

    /* renamed from: t0 */
    C10218k<FloatingActionButton> f33328t0;

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    class C7591a extends AnimatorListenerAdapter {
        C7591a() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m42217h0();
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m42218i0();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    class C7592b extends FloatingActionButton.C7676b {

        /* renamed from: a */
        final /* synthetic */ int f33335a;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b$a */
        class C7593a extends FloatingActionButton.C7676b {
            C7593a() {
            }

            /* renamed from: b */
            public void mo24915b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.m42217h0();
            }
        }

        C7592b(int i) {
            this.f33335a = i;
        }

        /* renamed from: a */
        public void mo24914a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.m42221m0(this.f33335a));
            floatingActionButton.mo25541s(new C7593a());
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    class C7594c extends AnimatorListenerAdapter {
        C7594c() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m42217h0();
            Animator unused = BottomAppBar.this.f33318j0 = null;
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m42218i0();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    class C7595d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f33339a;

        /* renamed from: b */
        final /* synthetic */ ActionMenuView f33340b;

        /* renamed from: c */
        final /* synthetic */ int f33341c;

        /* renamed from: d */
        final /* synthetic */ boolean f33342d;

        C7595d(ActionMenuView actionMenuView, int i, boolean z) {
            this.f33340b = actionMenuView;
            this.f33341c = i;
            this.f33342d = z;
        }

        public void onAnimationCancel(Animator animator) {
            this.f33339a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f33339a) {
                BottomAppBar.this.m42227t0(this.f33340b, this.f33341c, this.f33342d);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e */
    class C7596e extends AnimatorListenerAdapter {
        C7596e() {
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f33327s0.onAnimationStart(animator);
            FloatingActionButton S = BottomAppBar.this.m42219j0();
            if (S != null) {
                S.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$f */
    interface C7597f {
        /* renamed from: a */
        void mo24921a(BottomAppBar bottomAppBar);

        /* renamed from: b */
        void mo24922b(BottomAppBar bottomAppBar);
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g */
    static class C7598g extends C6079a {
        public static final Parcelable.Creator<C7598g> CREATOR = new C7599a();

        /* renamed from: c */
        int f33345c;

        /* renamed from: d */
        boolean f33346d;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g$a */
        static class C7599a implements Parcelable.ClassLoaderCreator<C7598g> {
            C7599a() {
            }

            /* renamed from: a */
            public C7598g createFromParcel(Parcel parcel) {
                return new C7598g(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C7598g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C7598g(parcel, classLoader);
            }

            /* renamed from: c */
            public C7598g[] newArray(int i) {
                return new C7598g[i];
            }
        }

        public C7598g(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f33345c);
            parcel.writeInt(this.f33346d ? 1 : 0);
        }

        public C7598g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f33345c = parcel.readInt();
            this.f33346d = parcel.readInt() != 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m42213c0(FloatingActionButton floatingActionButton) {
        floatingActionButton.mo25509e(this.f33327s0);
        floatingActionButton.mo25510f(new C7596e());
        floatingActionButton.mo25511g(this.f33328t0);
    }

    /* renamed from: d0 */
    private void m42214d0() {
        Animator animator = this.f33318j0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f33317i0;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* renamed from: f0 */
    private void m42215f0(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m42219j0(), "translationX", new float[]{m42221m0(i)});
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    /* renamed from: g0 */
    private void m42216g0(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
            if (Math.abs(actionMenuView.getTranslationX() - ((float) mo24898l0(actionMenuView, i, z))) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                ofFloat2.addListener(new C7595d(actionMenuView, i, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public int getBottomInset() {
        return this.f33326r0;
    }

    /* access modifiers changed from: private */
    public float getFabTranslationX() {
        return m42221m0(this.f33319k0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().mo24930b();
    }

    private C7600a getTopEdgeTreatment() {
        return (C7600a) this.f33316h0.mo37735B().mo37784p();
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public void m42217h0() {
        ArrayList<C7597f> arrayList;
        int i = this.f33322n0 - 1;
        this.f33322n0 = i;
        if (i == 0 && (arrayList = this.f33323o0) != null) {
            Iterator<C7597f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo24922b(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public void m42218i0() {
        ArrayList<C7597f> arrayList;
        int i = this.f33322n0;
        this.f33322n0 = i + 1;
        if (i == 0 && (arrayList = this.f33323o0) != null) {
            Iterator<C7597f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo24921a(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public FloatingActionButton m42219j0() {
        View k0 = m42220k0();
        if (k0 instanceof FloatingActionButton) {
            return (FloatingActionButton) k0;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View m42220k0() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.mo2753m(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x0018
        L_0x002c:
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.m42220k0():android.view.View");
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public float m42221m0(int i) {
        int i2 = 1;
        boolean z = C0835a0.m3682B(this) == 1;
        if (i != 1) {
            return 0.0f;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - this.f33315g0;
        if (z) {
            i2 = -1;
        }
        return (float) (measuredWidth * i2);
    }

    /* renamed from: n0 */
    private boolean m42222n0() {
        FloatingActionButton j0 = m42219j0();
        return j0 != null && j0.mo25534o();
    }

    /* renamed from: o0 */
    private void m42223o0(int i, boolean z) {
        if (C0835a0.m3705R(this)) {
            Animator animator = this.f33318j0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!m42222n0()) {
                i = 0;
                z = false;
            }
            m42216g0(i, z, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f33318j0 = animatorSet;
            animatorSet.addListener(new C7594c());
            this.f33318j0.start();
        }
    }

    /* renamed from: p0 */
    private void m42224p0(int i) {
        if (this.f33319k0 != i && C0835a0.m3705R(this)) {
            Animator animator = this.f33317i0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f33320l0 == 1) {
                m42215f0(i, arrayList);
            } else {
                mo24890e0(i, arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f33317i0 = animatorSet;
            animatorSet.addListener(new C7591a());
            this.f33317i0.start();
        }
    }

    /* renamed from: q0 */
    private void m42225q0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!m42222n0()) {
                m42227t0(actionMenuView, 0, false);
            } else {
                m42227t0(actionMenuView, this.f33319k0, this.f33324p0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public void m42226r0() {
        getTopEdgeTreatment().mo24938j(getFabTranslationX());
        View k0 = m42220k0();
        this.f33316h0.mo37746U((!this.f33324p0 || !m42222n0()) ? 0.0f : 1.0f);
        if (k0 != null) {
            k0.setTranslationY(getFabTranslationY());
            k0.setTranslationX(getFabTranslationX());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public void m42227t0(ActionMenuView actionMenuView, int i, boolean z) {
        actionMenuView.setTranslationX((float) mo24898l0(actionMenuView, i, z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public void mo24890e0(int i, List<Animator> list) {
        FloatingActionButton j0 = m42219j0();
        if (j0 != null && !j0.mo25533n()) {
            m42218i0();
            j0.mo25531l(new C7592b(i));
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.f33316h0.mo37736D();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().mo24930b();
    }

    public int getFabAlignmentMode() {
        return this.f33319k0;
    }

    public int getFabAnimationMode() {
        return this.f33320l0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().mo24931c();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().mo24932d();
    }

    public boolean getHideOnScroll() {
        return this.f33321m0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public int mo24898l0(ActionMenuView actionMenuView, int i, boolean z) {
        boolean z2 = C0835a0.m3682B(this) == 1;
        int measuredWidth = z2 ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.C0430e) && (((Toolbar.C0430e) childAt.getLayoutParams()).f731a & 8388615) == 8388611) {
                if (z2) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                } else {
                    measuredWidth = Math.max(measuredWidth, childAt.getRight());
                }
            }
        }
        int right = measuredWidth - (z2 ? actionMenuView.getRight() : actionMenuView.getLeft());
        if (i != 1 || !z) {
            return 0;
        }
        return right;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C12826h.m60626f(this, this.f33316h0);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m42214d0();
            m42226r0();
        }
        m42225q0();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C7598g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C7598g gVar = (C7598g) parcelable;
        super.onRestoreInstanceState(gVar.mo20873a());
        this.f33319k0 = gVar.f33345c;
        this.f33324p0 = gVar.f33346d;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C7598g gVar = new C7598g(super.onSaveInstanceState());
        gVar.f33345c = this.f33319k0;
        gVar.f33346d = this.f33324p0;
        return gVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public boolean mo24900s0(int i) {
        float f = (float) i;
        if (f == getTopEdgeTreatment().mo24933e()) {
            return false;
        }
        getTopEdgeTreatment().mo24937i(f);
        this.f33316h0.invalidateSelf();
        return true;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C0732a.m3377o(this.f33316h0, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().mo24934f(f);
            this.f33316h0.invalidateSelf();
            m42226r0();
        }
    }

    public void setElevation(float f) {
        this.f33316h0.mo37744S(f);
        getBehavior().mo24879G(this, this.f33316h0.mo37734A() - this.f33316h0.mo37769z());
    }

    public void setFabAlignmentMode(int i) {
        m42224p0(i);
        m42223o0(i, this.f33324p0);
        this.f33319k0 = i;
    }

    public void setFabAnimationMode(int i) {
        this.f33320l0 = i;
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().mo24935g(f);
            this.f33316h0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().mo24936h(f);
            this.f33316h0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f33321m0 = z;
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public Behavior getBehavior() {
        if (this.f33325q0 == null) {
            this.f33325q0 = new Behavior();
        }
        return this.f33325q0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final Rect f33329e = new Rect();
        /* access modifiers changed from: private */

        /* renamed from: f */
        public WeakReference<BottomAppBar> f33330f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f33331g;

        /* renamed from: h */
        private final View.OnLayoutChangeListener f33332h = new C7590a();

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        class C7590a implements View.OnLayoutChangeListener {
            C7590a() {
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f33330f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.mo25529j(Behavior.this.f33329e);
                int height = Behavior.this.f33329e.height();
                bottomAppBar.mo24900s0(height);
                CoordinatorLayout.C0606f fVar = (CoordinatorLayout.C0606f) view.getLayoutParams();
                if (Behavior.this.f33331g == 0) {
                    int dimensionPixelOffset = bottomAppBar.getResources().getDimensionPixelOffset(C10128d.mtrl_bottomappbar_fab_bottom_margin);
                    fVar.bottomMargin = bottomAppBar.getBottomInset() + (dimensionPixelOffset - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                }
            }
        }

        public Behavior() {
        }

        /* renamed from: M */
        public boolean mo2793l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.f33330f = new WeakReference<>(bottomAppBar);
            View V = bottomAppBar.m42220k0();
            if (V != null && !C0835a0.m3705R(V)) {
                CoordinatorLayout.C0606f fVar = (CoordinatorLayout.C0606f) V.getLayoutParams();
                fVar.f1988d = 49;
                this.f33331g = fVar.bottomMargin;
                if (V instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) V;
                    floatingActionButton.addOnLayoutChangeListener(this.f33332h);
                    bottomAppBar.m42213c0(floatingActionButton);
                }
                bottomAppBar.m42226r0();
            }
            coordinatorLayout.mo2728C(bottomAppBar, i);
            return super.mo2793l(coordinatorLayout, bottomAppBar, i);
        }

        /* renamed from: N */
        public boolean mo2778A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.mo2778A(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }
}
