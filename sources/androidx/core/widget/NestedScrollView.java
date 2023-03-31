package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.C0832a;
import androidx.core.view.C0835a0;
import androidx.core.view.C0947o;
import androidx.core.view.C0948p;
import androidx.core.view.C0950r;
import androidx.core.view.C0952t;
import androidx.core.view.accessibility.C0862c;
import androidx.core.view.accessibility.C0870e;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p138t.C5490a;

public class NestedScrollView extends FrameLayout implements C0950r, C0947o {

    /* renamed from: J */
    private static final float f2630J = ((float) (Math.log(0.78d) / Math.log(0.9d)));

    /* renamed from: K */
    private static final C0959a f2631K = new C0959a();

    /* renamed from: L */
    private static final int[] f2632L = {16843130};

    /* renamed from: A */
    private final int[] f2633A;

    /* renamed from: B */
    private final int[] f2634B;

    /* renamed from: C */
    private int f2635C;

    /* renamed from: D */
    private int f2636D;

    /* renamed from: E */
    private C0962d f2637E;

    /* renamed from: F */
    private final C0952t f2638F;

    /* renamed from: G */
    private final C0948p f2639G;

    /* renamed from: H */
    private float f2640H;

    /* renamed from: I */
    private C0961c f2641I;

    /* renamed from: a */
    private final float f2642a;

    /* renamed from: b */
    private long f2643b;

    /* renamed from: c */
    private final Rect f2644c;

    /* renamed from: d */
    private OverScroller f2645d;

    /* renamed from: e */
    public EdgeEffect f2646e;

    /* renamed from: f */
    public EdgeEffect f2647f;

    /* renamed from: g */
    private int f2648g;

    /* renamed from: h */
    private boolean f2649h;

    /* renamed from: i */
    private boolean f2650i;

    /* renamed from: r */
    private View f2651r;

    /* renamed from: s */
    private boolean f2652s;

    /* renamed from: t */
    private VelocityTracker f2653t;

    /* renamed from: u */
    private boolean f2654u;

    /* renamed from: v */
    private boolean f2655v;

    /* renamed from: w */
    private int f2656w;

    /* renamed from: x */
    private int f2657x;

    /* renamed from: y */
    private int f2658y;

    /* renamed from: z */
    private int f2659z;

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    static class C0959a extends C0832a {
        C0959a() {
        }

        /* renamed from: f */
        public void mo3230f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo3230f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C0870e.m4007a(accessibilityEvent, nestedScrollView.getScrollX());
            C0870e.m4008b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        /* renamed from: g */
        public void mo3231g(View view, C0862c cVar) {
            int scrollRange;
            super.mo3231g(view, cVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            cVar.mo3293X(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                cVar.mo3322o0(true);
                if (nestedScrollView.getScrollY() > 0) {
                    cVar.mo3298b(C0862c.C0863a.f2514r);
                    cVar.mo3298b(C0862c.C0863a.f2482C);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    cVar.mo3298b(C0862c.C0863a.f2513q);
                    cVar.mo3298b(C0862c.C0863a.f2484E);
                }
            }
        }

        /* renamed from: j */
        public boolean mo3234j(View view, int i, Bundle bundle) {
            if (super.mo3234j(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.mo3505N(0, max, true);
                    return true;
                } else if (i != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.mo3505N(0, min, true);
            return true;
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    static class C0960b {
        /* renamed from: a */
        static boolean m4366a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    public interface C0961c {
        /* renamed from: a */
        void mo826a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* renamed from: androidx.core.widget.NestedScrollView$d */
    static class C0962d extends View.BaseSavedState {
        public static final Parcelable.Creator<C0962d> CREATOR = new C0963a();

        /* renamed from: a */
        public int f2660a;

        /* renamed from: androidx.core.widget.NestedScrollView$d$a */
        class C0963a implements Parcelable.Creator<C0962d> {
            C0963a() {
            }

            /* renamed from: a */
            public C0962d createFromParcel(Parcel parcel) {
                return new C0962d(parcel);
            }

            /* renamed from: b */
            public C0962d[] newArray(int i) {
                return new C0962d[i];
            }
        }

        C0962d(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f2660a + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2660a);
        }

        C0962d(Parcel parcel) {
            super(parcel);
            this.f2660a = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5490a.f27841c);
    }

    /* renamed from: A */
    private void m4320A(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2659z) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f2648g = (int) motionEvent.getY(i);
            this.f2659z = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f2653t;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: D */
    private void m4321D() {
        VelocityTracker velocityTracker = this.f2653t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2653t = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0061  */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m4322E(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f2646e
            float r0 = androidx.core.widget.C0975e.m4422b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            android.widget.EdgeEffect r0 = r3.f2646e
            float r4 = -r4
            float r4 = androidx.core.widget.C0975e.m4424d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f2646e
            float r5 = androidx.core.widget.C0975e.m4422b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f2646e
            r5.onRelease()
        L_0x002f:
            r1 = r4
            goto L_0x0054
        L_0x0031:
            android.widget.EdgeEffect r0 = r3.f2647f
            float r0 = androidx.core.widget.C0975e.m4422b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0054
            android.widget.EdgeEffect r0 = r3.f2647f
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.C0975e.m4424d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f2647f
            float r5 = androidx.core.widget.C0975e.m4422b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f2647f
            r5.onRelease()
            goto L_0x002f
        L_0x0054:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L_0x0064
            r3.invalidate()
        L_0x0064:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.m4322E(int, float):int");
    }

    /* renamed from: F */
    private void m4323F(boolean z) {
        if (z) {
            mo3506O(2, 1);
        } else {
            mo3507Q(1);
        }
        this.f2636D = getScrollY();
        C0835a0.m3723e0(this);
    }

    /* renamed from: G */
    private boolean m4324G(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View n = m4337n(z2, i2, i3);
        if (n == null) {
            n = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m4334j(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (n != findFocus()) {
            n.requestFocus(i);
        }
        return z;
    }

    /* renamed from: H */
    private void m4325H(View view) {
        view.getDrawingRect(this.f2644c);
        offsetDescendantRectToMyCoords(view, this.f2644c);
        int f = mo3526f(this.f2644c);
        if (f != 0) {
            scrollBy(0, f);
        }
    }

    /* renamed from: I */
    private boolean m4326I(Rect rect, boolean z) {
        int f = mo3526f(rect);
        boolean z2 = f != 0;
        if (z2) {
            if (z) {
                scrollBy(0, f);
            } else {
                mo3503K(0, f);
            }
        }
        return z2;
    }

    /* renamed from: J */
    private boolean m4327J(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        if (m4338q(-i) < C0975e.m4422b(edgeEffect) * ((float) getHeight())) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    private void m4328L(int i, int i2, int i3, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f2643b > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f2645d;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i3);
                m4323F(z);
            } else {
                if (!this.f2645d.isFinished()) {
                    m4330a();
                }
                scrollBy(i, i2);
            }
            this.f2643b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: P */
    private boolean m4329P(MotionEvent motionEvent) {
        boolean z;
        if (C0975e.m4422b(this.f2646e) != 0.0f) {
            C0975e.m4424d(this.f2646e, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z = true;
        } else {
            z = false;
        }
        if (C0975e.m4422b(this.f2647f) == 0.0f) {
            return z;
        }
        C0975e.m4424d(this.f2647f, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    /* renamed from: a */
    private void m4330a() {
        this.f2645d.abortAnimation();
        mo3507Q(1);
    }

    /* renamed from: c */
    private boolean m4331c() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0) {
            return true;
        }
        if (overScrollMode != 1 || getScrollRange() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private boolean m4332d() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static int m4333e(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f2640H == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f2640H = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f2640H;
    }

    /* renamed from: j */
    private void m4334j(int i) {
        if (i == 0) {
            return;
        }
        if (this.f2655v) {
            mo3503K(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    /* renamed from: k */
    private boolean m4335k(int i) {
        if (C0975e.m4422b(this.f2646e) != 0.0f) {
            if (m4327J(this.f2646e, i)) {
                this.f2646e.onAbsorb(i);
            } else {
                mo3539o(-i);
            }
        } else if (C0975e.m4422b(this.f2647f) == 0.0f) {
            return false;
        } else {
            int i2 = -i;
            if (m4327J(this.f2647f, i2)) {
                this.f2647f.onAbsorb(i2);
            } else {
                mo3539o(i2);
            }
        }
        return true;
    }

    /* renamed from: l */
    private void m4336l() {
        this.f2652s = false;
        m4321D();
        mo3507Q(0);
        this.f2646e.onRelease();
        this.f2647f.onRelease();
    }

    /* renamed from: n */
    private View m4337n(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (!z4) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: q */
    private float m4338q(int i) {
        double log = Math.log((double) ((((float) Math.abs(i)) * 0.35f) / (this.f2642a * 0.015f)));
        float f = f2630J;
        return (float) (((double) (this.f2642a * 0.015f)) * Math.exp((((double) f) / (((double) f) - 1.0d)) * log));
    }

    /* renamed from: s */
    private boolean m4339s(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i2 < childAt.getTop() - scrollY || i2 >= childAt.getBottom() - scrollY || i < childAt.getLeft() || i >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    private void m4340t() {
        VelocityTracker velocityTracker = this.f2653t;
        if (velocityTracker == null) {
            this.f2653t = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: u */
    private void m4341u() {
        this.f2645d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2656w = viewConfiguration.getScaledTouchSlop();
        this.f2657x = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2658y = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: v */
    private void m4342v() {
        if (this.f2653t == null) {
            this.f2653t = VelocityTracker.obtain();
        }
    }

    /* renamed from: w */
    private boolean m4343w(View view) {
        return !m4345y(view, 0, getHeight());
    }

    /* renamed from: x */
    private static boolean m4344x(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !m4344x((View) parent, view2)) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    private boolean m4345y(View view, int i, int i2) {
        view.getDrawingRect(this.f2644c);
        offsetDescendantRectToMyCoords(view, this.f2644c);
        return this.f2644c.bottom + i >= getScrollY() && this.f2644c.top - i <= getScrollY() + i2;
    }

    /* renamed from: z */
    private void m4346z(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f2639G.mo3480e(0, scrollY2, 0, i - scrollY2, (int[]) null, i2, iArr);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083 A[ADDED_TO_REGION] */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3501B(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = 0
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = 0
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x0050
            r3 = r2
        L_0x004e:
            r2 = 1
            goto L_0x0055
        L_0x0050:
            if (r3 >= r7) goto L_0x0054
            r3 = r7
            goto L_0x004e
        L_0x0054:
            r2 = 0
        L_0x0055:
            if (r6 <= r1) goto L_0x005a
            r6 = r1
        L_0x0058:
            r1 = 1
            goto L_0x005f
        L_0x005a:
            if (r6 >= r8) goto L_0x005e
            r6 = r8
            goto L_0x0058
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x007e
            boolean r7 = r12.mo3553r(r5)
            if (r7 != 0) goto L_0x007e
            android.widget.OverScroller r7 = r0.f2645d
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L_0x0085
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r4 = 1
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.mo3501B(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* renamed from: C */
    public boolean mo3502C(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f2644c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f2644c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f2644c.top = getScrollY() - height;
            Rect rect2 = this.f2644c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f2644c;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return m4324G(i, i2, i3);
    }

    /* renamed from: K */
    public final void mo3503K(int i, int i2) {
        m4328L(i, i2, 250, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo3504M(int i, int i2, int i3, boolean z) {
        m4328L(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo3505N(int i, int i2, boolean z) {
        mo3504M(i, i2, 250, z);
    }

    /* renamed from: O */
    public boolean mo3506O(int i, int i2) {
        return this.f2639G.mo3488q(i, i2);
    }

    /* renamed from: Q */
    public void mo3507Q(int i) {
        this.f2639G.mo3490s(i);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public boolean mo3512b(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m4345y(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m4334j(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f2644c);
            offsetDescendantRectToMyCoords(findNextFocus, this.f2644c);
            m4334j(mo3526f(this.f2644c));
            findNextFocus.requestFocus(i);
        }
        if (findFocus == null || !findFocus.isFocused() || !m4343w(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (!this.f2645d.isFinished()) {
            this.f2645d.computeScrollOffset();
            int currY = this.f2645d.getCurrY();
            int g = mo3527g(currY - this.f2636D);
            this.f2636D = currY;
            int[] iArr = this.f2634B;
            boolean z = false;
            iArr[1] = 0;
            mo3533h(0, g, iArr, (int[]) null, 1);
            int i = g - this.f2634B[1];
            int scrollRange = getScrollRange();
            if (i != 0) {
                int scrollY = getScrollY();
                mo3501B(0, i, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i2 = i - scrollY2;
                int[] iArr2 = this.f2634B;
                iArr2[1] = 0;
                mo3535i(0, scrollY2, 0, i2, this.f2633A, 1, iArr2);
                i = i2 - this.f2634B[1];
            }
            if (i != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    if (i < 0) {
                        if (this.f2646e.isFinished()) {
                            this.f2646e.onAbsorb((int) this.f2645d.getCurrVelocity());
                        }
                    } else if (this.f2647f.isFinished()) {
                        this.f2647f.onAbsorb((int) this.f2645d.getCurrVelocity());
                    }
                }
                m4330a();
            }
            if (!this.f2645d.isFinished()) {
                C0835a0.m3723e0(this);
            } else {
                mo3507Q(1);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo3536m(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f2639G.mo3476a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f2639G.mo3477b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return mo3533h(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f2639G.mo3481f(i, i2, i3, i4, iArr);
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i2 = 0;
        if (!this.f2646e.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 21 || C0960b.m4366a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i = getPaddingLeft() + 0;
            } else {
                i = 0;
            }
            if (i3 >= 21 && C0960b.m4366a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate((float) i, (float) min);
            this.f2646e.setSize(width, height);
            if (this.f2646e.draw(canvas)) {
                C0835a0.m3723e0(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.f2647f.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 < 21 || C0960b.m4366a(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i2 = 0 + getPaddingLeft();
            }
            if (i4 >= 21 && C0960b.m4366a(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i2 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            this.f2647f.setSize(width2, height2);
            if (this.f2647f.draw(canvas)) {
                C0835a0.m3723e0(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo3526f(Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        int i5 = rect.bottom;
        if (i5 > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i4;
            }
            return Math.min(i2 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        } else if (rect.top >= scrollY || i5 >= i4) {
            return 0;
        } else {
            if (rect.height() > height) {
                i = 0 - (i4 - rect.bottom);
            } else {
                i = 0 - (scrollY - rect.top);
            }
            return Math.max(i, -getScrollY());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo3527g(int i) {
        int height = getHeight();
        if (i > 0 && C0975e.m4422b(this.f2646e) != 0.0f) {
            int round = Math.round((((float) (-height)) / 4.0f) * C0975e.m4424d(this.f2646e, (((float) (-i)) * 4.0f) / ((float) height), 0.5f));
            if (round != i) {
                this.f2646e.finish();
            }
            return i - round;
        } else if (i >= 0 || C0975e.m4422b(this.f2647f) == 0.0f) {
            return i;
        } else {
            float f = (float) height;
            int round2 = Math.round((f / 4.0f) * C0975e.m4424d(this.f2647f, (((float) i) * 4.0f) / f, 0.5f));
            if (round2 != i) {
                this.f2647f.finish();
            }
            return i - round2;
        }
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f2638F.mo3491a();
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* renamed from: h */
    public boolean mo3533h(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f2639G.mo3479d(i, i2, iArr, iArr2, i3);
    }

    public boolean hasNestedScrollingParent() {
        return mo3553r(0);
    }

    /* renamed from: i */
    public void mo3535i(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.f2639G.mo3480e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f2639G.mo3485m();
    }

    /* renamed from: m */
    public boolean mo3536m(KeyEvent keyEvent) {
        this.f2644c.setEmpty();
        int i = 130;
        if (!m4332d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        return false;
                    }
                    if (keyEvent.isShiftPressed()) {
                        i = 33;
                    }
                    mo3502C(i);
                    return false;
                } else if (!keyEvent.isAltPressed()) {
                    return mo3512b(130);
                } else {
                    return mo3552p(130);
                }
            } else if (!keyEvent.isAltPressed()) {
                return mo3512b(33);
            } else {
                return mo3552p(33);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i, int i2) {
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: o */
    public void mo3539o(int i) {
        if (getChildCount() > 0) {
            this.f2645d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, 0, 0);
            m4323F(true);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2650i = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a8 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onGenericMotionEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r1 = 0
            r2 = 8
            if (r0 != r2) goto L_0x00a9
            boolean r0 = r8.f2652s
            if (r0 != 0) goto L_0x00a9
            r0 = 2
            boolean r0 = androidx.core.view.C0946n.m4289a(r9, r0)
            r2 = 0
            if (r0 == 0) goto L_0x001c
            r0 = 9
            float r0 = r9.getAxisValue(r0)
            goto L_0x002c
        L_0x001c:
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = androidx.core.view.C0946n.m4289a(r9, r0)
            if (r0 == 0) goto L_0x002b
            r0 = 26
            float r0 = r9.getAxisValue(r0)
            goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00a9
            float r2 = r8.getVerticalScrollFactorCompat()
            float r0 = r0 * r2
            int r0 = (int) r0
            int r2 = r8.getScrollRange()
            int r3 = r8.getScrollY()
            int r0 = r3 - r0
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 8194(0x2002, float:1.1482E-41)
            r6 = 1
            if (r0 >= 0) goto L_0x0070
            boolean r2 = r8.m4331c()
            if (r2 == 0) goto L_0x0056
            boolean r9 = androidx.core.view.C0946n.m4289a(r9, r5)
            if (r9 != 0) goto L_0x0056
            r9 = 1
            goto L_0x0057
        L_0x0056:
            r9 = 0
        L_0x0057:
            if (r9 == 0) goto L_0x009d
            android.widget.EdgeEffect r9 = r8.f2646e
            float r0 = (float) r0
            float r0 = -r0
            int r2 = r8.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            androidx.core.widget.C0975e.m4424d(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f2646e
            r9.onRelease()
            r8.invalidate()
            r9 = 1
            goto L_0x009e
        L_0x0070:
            if (r0 <= r2) goto L_0x009c
            boolean r7 = r8.m4331c()
            if (r7 == 0) goto L_0x0080
            boolean r9 = androidx.core.view.C0946n.m4289a(r9, r5)
            if (r9 != 0) goto L_0x0080
            r9 = 1
            goto L_0x0081
        L_0x0080:
            r9 = 0
        L_0x0081:
            if (r9 == 0) goto L_0x0099
            android.widget.EdgeEffect r9 = r8.f2647f
            int r0 = r0 - r2
            float r0 = (float) r0
            int r1 = r8.getHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            androidx.core.widget.C0975e.m4424d(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f2647f
            r9.onRelease()
            r8.invalidate()
            r1 = 1
        L_0x0099:
            r9 = r1
            r1 = r2
            goto L_0x009e
        L_0x009c:
            r1 = r0
        L_0x009d:
            r9 = 0
        L_0x009e:
            if (r1 == r3) goto L_0x00a8
            int r9 = r8.getScrollX()
            super.scrollTo(r9, r1)
            return r6
        L_0x00a8:
            return r9
        L_0x00a9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.f2652s) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f2659z;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f2648g) > this.f2656w && (2 & getNestedScrollAxes()) == 0) {
                                this.f2652s = true;
                                this.f2648g = y;
                                m4342v();
                                this.f2653t.addMovement(motionEvent);
                                this.f2635C = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m4320A(motionEvent);
                    }
                }
            }
            this.f2652s = false;
            this.f2659z = -1;
            m4321D();
            if (this.f2645d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C0835a0.m3723e0(this);
            }
            mo3507Q(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (!m4339s((int) motionEvent.getX(), y2)) {
                if (!m4329P(motionEvent) && this.f2645d.isFinished()) {
                    z = false;
                }
                this.f2652s = z;
                m4321D();
            } else {
                this.f2648g = y2;
                this.f2659z = motionEvent.getPointerId(0);
                m4340t();
                this.f2653t.addMovement(motionEvent);
                this.f2645d.computeScrollOffset();
                if (!m4329P(motionEvent) && this.f2645d.isFinished()) {
                    z = false;
                }
                this.f2652s = z;
                mo3506O(2, 0);
            }
        }
        return this.f2652s;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f2649h = false;
        View view = this.f2651r;
        if (view != null && m4344x(view, this)) {
            m4325H(this.f2651r);
        }
        this.f2651r = null;
        if (!this.f2650i) {
            if (this.f2637E != null) {
                scrollTo(getScrollX(), this.f2637E.f2660a);
                this.f2637E = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int e = m4333e(scrollY, paddingTop, i5);
            if (e != scrollY) {
                scrollTo(getScrollX(), e);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2650i = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2654u && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        mo3539o((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        mo3533h(i, i2, iArr, (int[]) null, i3);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m4346z(i4, i5, iArr);
    }

    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.f2638F.mo3493c(view, view2, i, i2);
        mo3506O(2, i2);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View view;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, (View) null, i);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (view != null && !m4343w(view)) {
            return view.requestFocus(i, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0962d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0962d dVar = (C0962d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.f2637E = dVar;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0962d dVar = new C0962d(super.onSaveInstanceState());
        dVar.f2660a = getScrollY();
        return dVar;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C0961c cVar = this.f2641I;
        if (cVar != null) {
            cVar.mo826a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m4345y(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f2644c);
            offsetDescendantRectToMyCoords(findFocus, this.f2644c);
            m4334j(mo3526f(this.f2644c));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public void onStopNestedScroll(View view, int i) {
        this.f2638F.mo3495e(view, i);
        mo3507Q(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x01d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            r23 = this;
            r10 = r23
            r11 = r24
            r23.m4342v()
            int r0 = r24.getActionMasked()
            r12 = 0
            if (r0 != 0) goto L_0x0010
            r10.f2635C = r12
        L_0x0010:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r24)
            int r1 = r10.f2635C
            float r1 = (float) r1
            r2 = 0
            r13.offsetLocation(r2, r1)
            r1 = 2
            r14 = 1
            if (r0 == 0) goto L_0x0230
            r3 = -1
            if (r0 == r14) goto L_0x01df
            if (r0 == r1) goto L_0x0082
            r1 = 3
            if (r0 == r1) goto L_0x0054
            r1 = 5
            if (r0 == r1) goto L_0x0041
            r1 = 6
            if (r0 == r1) goto L_0x002f
            goto L_0x025f
        L_0x002f:
            r23.m4320A(r24)
            int r0 = r10.f2659z
            int r0 = r11.findPointerIndex(r0)
            float r0 = r11.getY(r0)
            int r0 = (int) r0
            r10.f2648g = r0
            goto L_0x025f
        L_0x0041:
            int r0 = r24.getActionIndex()
            float r1 = r11.getY(r0)
            int r1 = (int) r1
            r10.f2648g = r1
            int r0 = r11.getPointerId(r0)
            r10.f2659z = r0
            goto L_0x025f
        L_0x0054:
            boolean r0 = r10.f2652s
            if (r0 == 0) goto L_0x007b
            int r0 = r23.getChildCount()
            if (r0 <= 0) goto L_0x007b
            android.widget.OverScroller r15 = r10.f2645d
            int r16 = r23.getScrollX()
            int r17 = r23.getScrollY()
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r23.getScrollRange()
            boolean r0 = r15.springBack(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x007b
            androidx.core.view.C0835a0.m3723e0(r23)
        L_0x007b:
            r10.f2659z = r3
            r23.m4336l()
            goto L_0x025f
        L_0x0082:
            int r0 = r10.f2659z
            int r15 = r11.findPointerIndex(r0)
            if (r15 != r3) goto L_0x00a9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r0.append(r1)
            int r1 = r10.f2659z
            r0.append(r1)
            java.lang.String r1 = " in onTouchEvent"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NestedScrollView"
            android.util.Log.e(r1, r0)
            goto L_0x025f
        L_0x00a9:
            float r0 = r11.getY(r15)
            int r6 = (int) r0
            int r0 = r10.f2648g
            int r0 = r0 - r6
            float r1 = r11.getX(r15)
            int r1 = r10.m4322E(r0, r1)
            int r0 = r0 - r1
            boolean r1 = r10.f2652s
            if (r1 != 0) goto L_0x00da
            int r1 = java.lang.Math.abs(r0)
            int r2 = r10.f2656w
            if (r1 <= r2) goto L_0x00da
            android.view.ViewParent r1 = r23.getParent()
            if (r1 == 0) goto L_0x00cf
            r1.requestDisallowInterceptTouchEvent(r14)
        L_0x00cf:
            r10.f2652s = r14
            if (r0 <= 0) goto L_0x00d7
            int r1 = r10.f2656w
            int r0 = r0 - r1
            goto L_0x00da
        L_0x00d7:
            int r1 = r10.f2656w
            int r0 = r0 + r1
        L_0x00da:
            r7 = r0
            boolean r0 = r10.f2652s
            if (r0 == 0) goto L_0x025f
            r1 = 0
            int[] r3 = r10.f2634B
            int[] r4 = r10.f2633A
            r5 = 0
            r0 = r23
            r2 = r7
            boolean r0 = r0.mo3533h(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00fc
            int[] r0 = r10.f2634B
            r0 = r0[r14]
            int r7 = r7 - r0
            int r0 = r10.f2635C
            int[] r1 = r10.f2633A
            r1 = r1[r14]
            int r0 = r0 + r1
            r10.f2635C = r0
        L_0x00fc:
            r16 = r7
            int[] r0 = r10.f2633A
            r0 = r0[r14]
            int r6 = r6 - r0
            r10.f2648g = r6
            int r17 = r23.getScrollY()
            int r9 = r23.getScrollRange()
            int r0 = r23.getOverScrollMode()
            if (r0 == 0) goto L_0x011b
            if (r0 != r14) goto L_0x0118
            if (r9 <= 0) goto L_0x0118
            goto L_0x011b
        L_0x0118:
            r18 = 0
            goto L_0x011d
        L_0x011b:
            r18 = 1
        L_0x011d:
            r1 = 0
            r3 = 0
            int r4 = r23.getScrollY()
            r5 = 0
            r7 = 0
            r8 = 0
            r19 = 1
            r0 = r23
            r2 = r16
            r6 = r9
            r22 = r9
            r9 = r19
            boolean r0 = r0.mo3501B(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x013f
            boolean r0 = r10.mo3553r(r12)
            if (r0 != 0) goto L_0x013f
            r8 = 1
            goto L_0x0140
        L_0x013f:
            r8 = 0
        L_0x0140:
            int r0 = r23.getScrollY()
            int r2 = r0 - r17
            int r4 = r16 - r2
            int[] r7 = r10.f2634B
            r7[r14] = r12
            r1 = 0
            r3 = 0
            int[] r5 = r10.f2633A
            r6 = 0
            r0 = r23
            r0.mo3535i(r1, r2, r3, r4, r5, r6, r7)
            int r0 = r10.f2648g
            int[] r1 = r10.f2633A
            r2 = r1[r14]
            int r0 = r0 - r2
            r10.f2648g = r0
            int r0 = r10.f2635C
            r1 = r1[r14]
            int r0 = r0 + r1
            r10.f2635C = r0
            if (r18 == 0) goto L_0x01d5
            int[] r0 = r10.f2634B
            r0 = r0[r14]
            int r0 = r16 - r0
            int r1 = r17 + r0
            if (r1 >= 0) goto L_0x0197
            android.widget.EdgeEffect r1 = r10.f2646e
            int r0 = -r0
            float r0 = (float) r0
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            float r2 = r11.getX(r15)
            int r3 = r23.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            androidx.core.widget.C0975e.m4424d(r1, r0, r2)
            android.widget.EdgeEffect r0 = r10.f2647f
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01c1
            android.widget.EdgeEffect r0 = r10.f2647f
            r0.onRelease()
            goto L_0x01c1
        L_0x0197:
            r2 = r22
            if (r1 <= r2) goto L_0x01c1
            android.widget.EdgeEffect r1 = r10.f2647f
            float r0 = (float) r0
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = r11.getX(r15)
            int r4 = r23.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r2 = r2 - r3
            androidx.core.widget.C0975e.m4424d(r1, r0, r2)
            android.widget.EdgeEffect r0 = r10.f2646e
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01c1
            android.widget.EdgeEffect r0 = r10.f2646e
            r0.onRelease()
        L_0x01c1:
            android.widget.EdgeEffect r0 = r10.f2646e
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x01d1
            android.widget.EdgeEffect r0 = r10.f2647f
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01d5
        L_0x01d1:
            androidx.core.view.C0835a0.m3723e0(r23)
            goto L_0x01d6
        L_0x01d5:
            r12 = r8
        L_0x01d6:
            if (r12 == 0) goto L_0x025f
            android.view.VelocityTracker r0 = r10.f2653t
            r0.clear()
            goto L_0x025f
        L_0x01df:
            android.view.VelocityTracker r0 = r10.f2653t
            r1 = 1000(0x3e8, float:1.401E-42)
            int r4 = r10.f2658y
            float r4 = (float) r4
            r0.computeCurrentVelocity(r1, r4)
            int r1 = r10.f2659z
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r4 = r10.f2657x
            if (r1 < r4) goto L_0x020d
            boolean r1 = r10.m4335k(r0)
            if (r1 != 0) goto L_0x022a
            int r0 = -r0
            float r1 = (float) r0
            boolean r4 = r10.dispatchNestedPreFling(r2, r1)
            if (r4 != 0) goto L_0x022a
            r10.dispatchNestedFling(r2, r1, r14)
            r10.mo3539o(r0)
            goto L_0x022a
        L_0x020d:
            android.widget.OverScroller r15 = r10.f2645d
            int r16 = r23.getScrollX()
            int r17 = r23.getScrollY()
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r23.getScrollRange()
            boolean r0 = r15.springBack(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x022a
            androidx.core.view.C0835a0.m3723e0(r23)
        L_0x022a:
            r10.f2659z = r3
            r23.m4336l()
            goto L_0x025f
        L_0x0230:
            int r0 = r23.getChildCount()
            if (r0 != 0) goto L_0x0237
            return r12
        L_0x0237:
            boolean r0 = r10.f2652s
            if (r0 == 0) goto L_0x0244
            android.view.ViewParent r0 = r23.getParent()
            if (r0 == 0) goto L_0x0244
            r0.requestDisallowInterceptTouchEvent(r14)
        L_0x0244:
            android.widget.OverScroller r0 = r10.f2645d
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x024f
            r23.m4330a()
        L_0x024f:
            float r0 = r24.getY()
            int r0 = (int) r0
            r10.f2648g = r0
            int r0 = r11.getPointerId(r12)
            r10.f2659z = r0
            r10.mo3506O(r1, r12)
        L_0x025f:
            android.view.VelocityTracker r0 = r10.f2653t
            if (r0 == 0) goto L_0x0266
            r0.addMovement(r13)
        L_0x0266:
            r13.recycle()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public boolean mo3552p(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f2644c;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f2644c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f2644c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f2644c;
        return m4324G(i, rect3.top, rect3.bottom);
    }

    /* renamed from: r */
    public boolean mo3553r(int i) {
        return this.f2639G.mo3484l(i);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f2649h) {
            m4325H(view2);
        } else {
            this.f2651r = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m4326I(rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m4321D();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f2649h = true;
        super.requestLayout();
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int e = m4333e(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int e2 = m4333e(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (e != getScrollX() || e2 != getScrollY()) {
                super.scrollTo(e, e2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f2654u) {
            this.f2654u = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f2639G.mo3486n(z);
    }

    public void setOnScrollChangeListener(C0961c cVar) {
        this.f2641I = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f2655v = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return mo3506O(i, 0);
    }

    public void stopNestedScroll() {
        mo3507Q(0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2644c = new Rect();
        this.f2649h = true;
        this.f2650i = false;
        this.f2651r = null;
        this.f2652s = false;
        this.f2655v = true;
        this.f2659z = -1;
        this.f2633A = new int[2];
        this.f2634B = new int[2];
        this.f2646e = C0975e.m4421a(context, attributeSet);
        this.f2647f = C0975e.m4421a(context, attributeSet);
        this.f2642a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        m4341u();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2632L, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f2638F = new C0952t(this);
        this.f2639G = new C0948p(this);
        setNestedScrollingEnabled(true);
        C0835a0.m3741n0(this, f2631K);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        m4346z(i4, i5, (int[]) null);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m4346z(i4, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
