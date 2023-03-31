package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0732a;
import androidx.core.view.C0835a0;
import androidx.core.view.C0922k0;
import androidx.core.view.C0947o;
import java.lang.ref.WeakReference;
import java.util.List;
import p055h.C4411a;
import p151v.C5753a;
import p169y.C6079a;
import p227f6.C10126b;
import p227f6.C10128d;
import p227f6.C10131g;
import p227f6.C10135k;
import p236g6.C10208a;
import p375v6.C12822g;
import p375v6.C12826h;

@CoordinatorLayout.C0604d(Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* renamed from: a */
    private int f33233a;

    /* renamed from: b */
    private int f33234b;

    /* renamed from: c */
    private int f33235c;

    /* renamed from: d */
    private int f33236d;

    /* renamed from: e */
    private boolean f33237e;

    /* renamed from: f */
    private int f33238f;

    /* renamed from: g */
    private C0922k0 f33239g;

    /* renamed from: h */
    private List<C7578b> f33240h;

    /* renamed from: i */
    private boolean f33241i;

    /* renamed from: r */
    private boolean f33242r;

    /* renamed from: s */
    private boolean f33243s;

    /* renamed from: t */
    private boolean f33244t;

    /* renamed from: u */
    private int f33245u;

    /* renamed from: v */
    private WeakReference<View> f33246v;

    /* renamed from: w */
    private ValueAnimator f33247w;

    /* renamed from: x */
    private int[] f33248x;

    /* renamed from: y */
    private Drawable f33249y;

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        /* renamed from: E */
        public /* bridge */ /* synthetic */ int mo24851E() {
            return super.mo24851E();
        }

        /* renamed from: G */
        public /* bridge */ /* synthetic */ boolean mo24852G(int i) {
            return super.mo24852G(i);
        }

        /* renamed from: e0 */
        public /* bridge */ /* synthetic */ boolean mo24835e0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.mo2793l(coordinatorLayout, appBarLayout, i);
        }

        /* renamed from: f0 */
        public /* bridge */ /* synthetic */ boolean mo24836f0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.mo2794m(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        /* renamed from: g0 */
        public /* bridge */ /* synthetic */ void mo24837g0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.mo2798q(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        /* renamed from: h0 */
        public /* bridge */ /* synthetic */ void mo24838h0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.mo2801t(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        /* renamed from: i0 */
        public /* bridge */ /* synthetic */ void mo24839i0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.mo2805x(coordinatorLayout, appBarLayout, parcelable);
        }

        /* renamed from: j0 */
        public /* bridge */ /* synthetic */ Parcelable mo24840j0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.mo2806y(coordinatorLayout, appBarLayout);
        }

        /* renamed from: k0 */
        public /* bridge */ /* synthetic */ boolean mo24841k0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.mo2778A(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        /* renamed from: l0 */
        public /* bridge */ /* synthetic */ void mo24842l0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.mo2780C(coordinatorLayout, appBarLayout, view, i);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends C7582b {
        public ScrollingViewBehavior() {
        }

        /* renamed from: R */
        private static int m42123R(AppBarLayout appBarLayout) {
            CoordinatorLayout.C0603c f = ((CoordinatorLayout.C0606f) appBarLayout.getLayoutParams()).mo2816f();
            if (f instanceof BaseBehavior) {
                return ((BaseBehavior) f).mo24828M();
            }
            return 0;
        }

        /* renamed from: S */
        private void m42124S(View view, View view2) {
            CoordinatorLayout.C0603c f = ((CoordinatorLayout.C0606f) view2.getLayoutParams()).mo2816f();
            if (f instanceof BaseBehavior) {
                C0835a0.m3712Y(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f).f33250k) + mo24871M()) - mo24869I(view2));
            }
        }

        /* renamed from: T */
        private void m42125T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.mo24803j()) {
                    appBarLayout.mo24812p(appBarLayout.mo24813r(view));
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public float mo24854J(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int R = m42123R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + R > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) R) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: L */
        public int mo24855L(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.mo24855L(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Q */
        public AppBarLayout mo24853H(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* renamed from: e */
        public boolean mo2786e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* renamed from: h */
        public boolean mo2789h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m42124S(view, view2);
            m42125T(view, view2);
            return false;
        }

        /* renamed from: l */
        public /* bridge */ /* synthetic */ boolean mo2793l(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.mo2793l(coordinatorLayout, view, i);
        }

        /* renamed from: m */
        public /* bridge */ /* synthetic */ boolean mo2794m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.mo2794m(coordinatorLayout, view, i, i2, i3, i4);
        }

        /* renamed from: w */
        public boolean mo2804w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout Q = mo24853H(coordinatorLayout.mo2752l(view));
            if (Q != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f33278d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    Q.mo24806m(false, !z);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10135k.f40500w2);
            mo24872O(obtainStyledAttributes.getDimensionPixelSize(C10135k.f40505x2, 0));
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    class C7577a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C12822g f33263a;

        C7577a(C12822g gVar) {
            this.f33263a = gVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f33263a.mo37744S(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    public interface C7578b<T extends AppBarLayout> {
        /* renamed from: a */
        void mo24858a(T t, int i);
    }

    /* renamed from: a */
    private void m42050a() {
        WeakReference<View> weakReference = this.f33246v;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f33246v = null;
    }

    /* renamed from: b */
    private View m42051b(View view) {
        int i;
        if (this.f33246v == null && (i = this.f33245u) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f33245u);
            }
            if (findViewById != null) {
                this.f33246v = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f33246v;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: g */
    private boolean m42052g() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C7579c) getChildAt(i).getLayoutParams()).mo24861c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private void m42053i() {
        this.f33234b = -1;
        this.f33235c = -1;
        this.f33236d = -1;
    }

    /* renamed from: n */
    private void m42054n(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.f33238f = i2 | i;
        requestLayout();
    }

    /* renamed from: o */
    private boolean m42055o(boolean z) {
        if (this.f33242r == z) {
            return false;
        }
        this.f33242r = z;
        refreshDrawableState();
        return true;
    }

    /* renamed from: q */
    private boolean m42056q() {
        return this.f33249y != null && getTopInset() > 0;
    }

    /* renamed from: s */
    private boolean m42057s() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8 || C0835a0.m3762y(childAt)) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    private void m42058t(C12822g gVar, boolean z) {
        float dimension = getResources().getDimension(C10128d.design_appbar_elevation);
        float f = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f33247w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, dimension});
        this.f33247w = ofFloat;
        ofFloat.setDuration((long) getResources().getInteger(C10131g.app_bar_elevation_anim_duration));
        this.f33247w.setInterpolator(C10208a.f40650a);
        this.f33247w.addUpdateListener(new C7577a(gVar));
        this.f33247w.start();
    }

    /* renamed from: u */
    private void m42059u() {
        setWillNotDraw(!m42056q());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C7579c generateDefaultLayoutParams() {
        return new C7579c(-1, -2);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C7579c;
    }

    /* renamed from: d */
    public C7579c generateLayoutParams(AttributeSet attributeSet) {
        return new C7579c(getContext(), attributeSet);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (m42056q()) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f33233a));
            this.f33249y.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f33249y;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C7579c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (Build.VERSION.SDK_INT >= 19 && (layoutParams instanceof LinearLayout.LayoutParams)) {
            return new C7579c((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C7579c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C7579c(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo24788f() {
        return this.f33237e;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedPreScrollRange() {
        int i;
        int C;
        int i2 = this.f33235c;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C7579c cVar = (C7579c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = cVar.f33265a;
            if ((i4 & 5) == 5) {
                int i5 = cVar.topMargin + cVar.bottomMargin;
                if ((i4 & 8) != 0) {
                    C = C0835a0.m3684C(childAt);
                } else if ((i4 & 2) != 0) {
                    C = measuredHeight - C0835a0.m3684C(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && C0835a0.m3762y(childAt)) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
                i = i5 + C;
                i = Math.min(i, measuredHeight - getTopInset());
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f33235c = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedScrollRange() {
        int i = this.f33236d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C7579c cVar = (C7579c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + cVar.topMargin + cVar.bottomMargin;
            int i4 = cVar.f33265a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= C0835a0.m3684C(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f33236d = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f33245u;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int C = C0835a0.m3684C(this);
        if (C == 0) {
            int childCount = getChildCount();
            C = childCount >= 1 ? C0835a0.m3684C(getChildAt(childCount - 1)) : 0;
            if (C == 0) {
                return getHeight() / 3;
            }
        }
        return (C * 2) + topInset;
    }

    /* access modifiers changed from: package-private */
    public int getPendingAction() {
        return this.f33238f;
    }

    public Drawable getStatusBarForeground() {
        return this.f33249y;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public final int getTopInset() {
        C0922k0 k0Var = this.f33239g;
        if (k0Var != null) {
            return k0Var.mo3419k();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f33234b;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            C7579c cVar = (C7579c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = cVar.f33265a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + cVar.topMargin + cVar.bottomMargin;
            if (i2 == 0 && C0835a0.m3762y(childAt)) {
                i3 -= getTopInset();
            }
            if ((i4 & 2) != 0) {
                i3 -= C0835a0.m3684C(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f33234b = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo24802h() {
        return getTotalScrollRange() != 0;
    }

    /* renamed from: j */
    public boolean mo24803j() {
        return this.f33244t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo24804k(int i) {
        this.f33233a = i;
        if (!willNotDraw()) {
            C0835a0.m3723e0(this);
        }
        List<C7578b> list = this.f33240h;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C7578b bVar = this.f33240h.get(i2);
                if (bVar != null) {
                    bVar.mo24858a(this, i);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo24805l() {
        this.f33238f = 0;
    }

    /* renamed from: m */
    public void mo24806m(boolean z, boolean z2) {
        m42054n(z, z2, true);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C12826h.m60625e(this);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        if (this.f33248x == null) {
            this.f33248x = new int[4];
        }
        int[] iArr = this.f33248x;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f33242r;
        int i2 = C10126b.state_liftable;
        if (!z) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (!z || !this.f33243s) ? -C10126b.state_lifted : C10126b.state_lifted;
        int i3 = C10126b.state_collapsible;
        if (!z) {
            i3 = -i3;
        }
        iArr[2] = i3;
        iArr[3] = (!z || !this.f33243s) ? -C10126b.state_collapsed : C10126b.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m42050a();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (C0835a0.m3762y(this) && m42057s()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C0835a0.m3712Y(getChildAt(childCount), topInset);
            }
        }
        m42053i();
        this.f33237e = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((C7579c) getChildAt(i5).getLayoutParams()).mo24860b() != null) {
                this.f33237e = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f33249y;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f33241i) {
            if (!this.f33244t && !m42052g()) {
                z2 = false;
            }
            m42055o(z2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && C0835a0.m3762y(this) && m42057s()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C5753a.m34335b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        m42053i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo24812p(boolean z) {
        if (this.f33243s == z) {
            return false;
        }
        this.f33243s = z;
        refreshDrawableState();
        if (!this.f33244t || !(getBackground() instanceof C12822g)) {
            return true;
        }
        m42058t((C12822g) getBackground(), z);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo24813r(View view) {
        View b = m42051b(view);
        if (b != null) {
            view = b;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C12826h.m60624d(this, f);
    }

    public void setExpanded(boolean z) {
        mo24806m(z, C0835a0.m3705R(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f33244t = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f33245u = i;
        m42050a();
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f33249y;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f33249y = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f33249y.setState(getDrawableState());
                }
                C0732a.m3375m(this.f33249y, C0835a0.m3682B(this));
                this.f33249y.setVisible(getVisibility() == 0, false);
                this.f33249y.setCallback(this);
            }
            m42059u();
            C0835a0.m3723e0(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C4411a.m29346b(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C7585e.m42172a(this, f);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f33249y;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f33249y;
    }

    protected static class BaseBehavior<T extends AppBarLayout> extends C7580a<T> {
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f33250k;

        /* renamed from: l */
        private int f33251l;

        /* renamed from: m */
        private ValueAnimator f33252m;

        /* renamed from: n */
        private int f33253n = -1;

        /* renamed from: o */
        private boolean f33254o;

        /* renamed from: p */
        private float f33255p;

        /* renamed from: q */
        private WeakReference<View> f33256q;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        class C7574a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ CoordinatorLayout f33257a;

            /* renamed from: b */
            final /* synthetic */ AppBarLayout f33258b;

            C7574a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f33257a = coordinatorLayout;
                this.f33258b = appBarLayout;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.mo24866P(this.f33257a, this.f33258b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        public BaseBehavior() {
        }

        /* renamed from: S */
        private void m42072S(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int i2;
            int abs = Math.abs(mo24828M() - i);
            float abs2 = Math.abs(f);
            if (abs2 > 0.0f) {
                i2 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i2 = (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            }
            m42073T(coordinatorLayout, t, i, i2);
        }

        /* renamed from: T */
        private void m42073T(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int M = mo24828M();
            if (M == i) {
                ValueAnimator valueAnimator = this.f33252m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f33252m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f33252m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f33252m = valueAnimator3;
                valueAnimator3.setInterpolator(C10208a.f40654e);
                this.f33252m.addUpdateListener(new C7574a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f33252m.setDuration((long) Math.min(i2, 600));
            this.f33252m.setIntValues(new int[]{M, i});
            this.f33252m.start();
        }

        /* renamed from: V */
        private boolean m42074V(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.mo24802h() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        /* renamed from: W */
        private static boolean m42075W(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: X */
        private View m42076X(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof C0947o) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: Y */
        private static View m42077Y(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: Z */
        private int m42078Z(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C7579c cVar = (C7579c) childAt.getLayoutParams();
                if (m42075W(cVar.mo24859a(), 32)) {
                    top -= cVar.topMargin;
                    bottom += cVar.bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: c0 */
        private int m42079c0(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                C7579c cVar = (C7579c) childAt.getLayoutParams();
                Interpolator b = cVar.mo24860b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (b != null) {
                    int a = cVar.mo24859a();
                    if ((a & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + cVar.topMargin + cVar.bottomMargin;
                        if ((a & 2) != 0) {
                            i2 -= C0835a0.m3684C(childAt);
                        }
                    }
                    if (C0835a0.m3762y(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * b.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                    }
                }
            }
            return i;
        }

        /* renamed from: n0 */
        private boolean m42080n0(CoordinatorLayout coordinatorLayout, T t) {
            List<View> m = coordinatorLayout.mo2753m(t);
            int size = m.size();
            int i = 0;
            while (i < size) {
                CoordinatorLayout.C0603c f = ((CoordinatorLayout.C0606f) m.get(i).getLayoutParams()).mo2816f();
                if (!(f instanceof ScrollingViewBehavior)) {
                    i++;
                } else if (((ScrollingViewBehavior) f).mo24870K() != 0) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }

        /* renamed from: o0 */
        private void m42081o0(CoordinatorLayout coordinatorLayout, T t) {
            int M = mo24828M();
            int Z = m42078Z(t, M);
            if (Z >= 0) {
                View childAt = t.getChildAt(Z);
                C7579c cVar = (C7579c) childAt.getLayoutParams();
                int a = cVar.mo24859a();
                if ((a & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (Z == t.getChildCount() - 1) {
                        i2 += t.getTopInset();
                    }
                    if (m42075W(a, 2)) {
                        i2 += C0835a0.m3684C(childAt);
                    } else if (m42075W(a, 5)) {
                        int C = C0835a0.m3684C(childAt) + i2;
                        if (M < C) {
                            i = C;
                        } else {
                            i2 = C;
                        }
                    }
                    if (m42075W(a, 32)) {
                        i += cVar.topMargin;
                        i2 -= cVar.bottomMargin;
                    }
                    if (M < (i2 + i) / 2) {
                        i = i2;
                    }
                    m42072S(coordinatorLayout, t, C5753a.m34335b(i, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: p0 */
        private void m42082p0(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View Y = m42077Y(t, i);
            if (Y != null) {
                int a = ((C7579c) Y.getLayoutParams()).mo24859a();
                boolean z2 = false;
                if ((a & 1) != 0) {
                    int C = C0835a0.m3684C(Y);
                    if (i2 <= 0 || (a & 12) == 0 ? !((a & 2) == 0 || (-i) < (Y.getBottom() - C) - t.getTopInset()) : (-i) >= (Y.getBottom() - C) - t.getTopInset()) {
                        z2 = true;
                    }
                }
                if (t.mo24803j()) {
                    z2 = t.mo24813r(m42076X(coordinatorLayout));
                }
                boolean p = t.mo24812p(z2);
                if (z || (p && m42080n0(coordinatorLayout, t))) {
                    t.jumpDrawablesToCurrentState();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: M */
        public int mo24828M() {
            return mo24851E() + this.f33250k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: U */
        public boolean mo24825H(T t) {
            WeakReference<View> weakReference = this.f33256q;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a0 */
        public int mo24826K(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b0 */
        public int mo24827L(T t) {
            return t.getTotalScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d0 */
        public void mo24829N(CoordinatorLayout coordinatorLayout, T t) {
            m42081o0(coordinatorLayout, t);
            if (t.mo24803j()) {
                t.mo24812p(t.mo24813r(m42076X(coordinatorLayout)));
            }
        }

        /* renamed from: e0 */
        public boolean mo2793l(CoordinatorLayout coordinatorLayout, T t, int i) {
            int i2;
            boolean l = super.mo2793l(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            int i3 = this.f33253n;
            if (i3 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i3);
                int i4 = -childAt.getBottom();
                if (this.f33254o) {
                    i2 = C0835a0.m3684C(childAt) + t.getTopInset();
                } else {
                    i2 = Math.round(((float) childAt.getHeight()) * this.f33255p);
                }
                mo24866P(coordinatorLayout, t, i4 + i2);
            } else if (pendingAction != 0) {
                boolean z = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i5 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        m42072S(coordinatorLayout, t, i5, 0.0f);
                    } else {
                        mo24866P(coordinatorLayout, t, i5);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        m42072S(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        mo24866P(coordinatorLayout, t, 0);
                    }
                }
            }
            t.mo24805l();
            this.f33253n = -1;
            mo24852G(C5753a.m34335b(mo24851E(), -t.getTotalScrollRange(), 0));
            m42082p0(coordinatorLayout, t, mo24851E(), 0, true);
            t.mo24804k(mo24851E());
            return l;
        }

        /* renamed from: f0 */
        public boolean mo2794m(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((CoordinatorLayout.C0606f) t.getLayoutParams()).height != -2) {
                return super.mo2794m(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.mo2729D(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: g0 */
        public void mo2798q(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i5 = i6;
                    i4 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = mo24865O(coordinatorLayout, t, i2, i5, i4);
                }
            }
            if (t.mo24803j()) {
                t.mo24812p(t.mo24813r(view));
            }
        }

        /* renamed from: h0 */
        public void mo2801t(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = mo24865O(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
        }

        /* renamed from: i0 */
        public void mo2805x(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof C7575b) {
                C7575b bVar = (C7575b) parcelable;
                super.mo2805x(coordinatorLayout, t, bVar.mo20873a());
                this.f33253n = bVar.f33260c;
                this.f33255p = bVar.f33261d;
                this.f33254o = bVar.f33262e;
                return;
            }
            super.mo2805x(coordinatorLayout, t, parcelable);
            this.f33253n = -1;
        }

        /* renamed from: j0 */
        public Parcelable mo2806y(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable y = super.mo2806y(coordinatorLayout, t);
            int E = mo24851E();
            int childCount = t.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + E;
                if (childAt.getTop() + E > 0 || bottom < 0) {
                    i++;
                } else {
                    C7575b bVar = new C7575b(y);
                    bVar.f33260c = i;
                    if (bottom == C0835a0.m3684C(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    bVar.f33262e = z;
                    bVar.f33261d = ((float) bottom) / ((float) childAt.getHeight());
                    return bVar;
                }
            }
            return y;
        }

        /* renamed from: k0 */
        public boolean mo2778A(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.mo24803j() || m42074V(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.f33252m) != null) {
                valueAnimator.cancel();
            }
            this.f33256q = null;
            this.f33251l = i2;
            return z;
        }

        /* renamed from: l0 */
        public void mo2780C(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.f33251l == 0 || i == 1) {
                m42081o0(coordinatorLayout, t);
                if (t.mo24803j()) {
                    t.mo24812p(t.mo24813r(view));
                }
            }
            this.f33256q = new WeakReference<>(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m0 */
        public int mo24830Q(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int M = mo24828M();
            int i4 = 0;
            if (i2 == 0 || M < i2 || M > i3) {
                this.f33250k = 0;
            } else {
                int b = C5753a.m34335b(i, i2, i3);
                if (M != b) {
                    int c0 = t.mo24788f() ? m42079c0(t, b) : b;
                    boolean G = mo24852G(c0);
                    i4 = M - b;
                    this.f33250k = b - c0;
                    if (!G && t.mo24788f()) {
                        coordinatorLayout.mo2737f(t);
                    }
                    t.mo24804k(mo24851E());
                    m42082p0(coordinatorLayout, t, b, b < M ? -1 : 1, false);
                }
            }
            return i4;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        protected static class C7575b extends C6079a {
            public static final Parcelable.Creator<C7575b> CREATOR = new C7576a();

            /* renamed from: c */
            int f33260c;

            /* renamed from: d */
            float f33261d;

            /* renamed from: e */
            boolean f33262e;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b$a */
            static class C7576a implements Parcelable.ClassLoaderCreator<C7575b> {
                C7576a() {
                }

                /* renamed from: a */
                public C7575b createFromParcel(Parcel parcel) {
                    return new C7575b(parcel, (ClassLoader) null);
                }

                /* renamed from: b */
                public C7575b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new C7575b(parcel, classLoader);
                }

                /* renamed from: c */
                public C7575b[] newArray(int i) {
                    return new C7575b[i];
                }
            }

            public C7575b(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f33260c = parcel.readInt();
                this.f33261d = parcel.readFloat();
                this.f33262e = parcel.readByte() != 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f33260c);
                parcel.writeFloat(this.f33261d);
                parcel.writeByte(this.f33262e ? (byte) 1 : 0);
            }

            public C7575b(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    public static class C7579c extends LinearLayout.LayoutParams {

        /* renamed from: a */
        int f33265a = 1;

        /* renamed from: b */
        Interpolator f33266b;

        public C7579c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10135k.f40440m);
            this.f33265a = obtainStyledAttributes.getInt(C10135k.f40446n, 0);
            int i = C10135k.f40452o;
            if (obtainStyledAttributes.hasValue(i)) {
                this.f33266b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i, 0));
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public int mo24859a() {
            return this.f33265a;
        }

        /* renamed from: b */
        public Interpolator mo24860b() {
            return this.f33266b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo24861c() {
            int i = this.f33265a;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        public C7579c(int i, int i2) {
            super(i, i2);
        }

        public C7579c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C7579c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C7579c(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
