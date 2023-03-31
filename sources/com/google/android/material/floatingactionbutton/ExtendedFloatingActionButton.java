package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0835a0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C7700b;
import java.util.List;
import p227f6.C10134j;
import p227f6.C10135k;
import p236g6.C10215h;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.C0602b {

    /* renamed from: H */
    private static final int f33663H = C10134j.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* renamed from: I */
    static final Property<View, Float> f33664I;

    /* renamed from: J */
    static final Property<View, Float> f33665J;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final Rect f33666A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final C7693c f33667B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public final C7693c f33668C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final C7693c f33669D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public final C7693c f33670E;

    /* renamed from: F */
    private final CoordinatorLayout.C0603c<ExtendedFloatingActionButton> f33671F;

    /* renamed from: G */
    private boolean f33672G;

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    class C7671a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f33678a;

        /* renamed from: b */
        final /* synthetic */ C7693c f33679b;

        /* renamed from: c */
        final /* synthetic */ C7674d f33680c;

        C7671a(C7693c cVar, C7674d dVar) {
            this.f33679b = cVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f33678a = true;
            this.f33679b.mo25645a();
        }

        public void onAnimationEnd(Animator animator) {
            this.f33679b.mo25650f();
            if (!this.f33678a) {
                this.f33679b.mo25653i(this.f33680c);
            }
        }

        public void onAnimationStart(Animator animator) {
            this.f33679b.onAnimationStart(animator);
            this.f33678a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    static class C7672b extends Property<View, Float> {
        C7672b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().width);
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    static class C7673c extends Property<View, Float> {
        C7673c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().height);
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    public static abstract class C7674d {
    }

    static {
        Class<Float> cls = Float.class;
        f33664I = new C7672b(cls, "width");
        f33665J = new C7673c(cls, "height");
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public void m42714m(C7693c cVar, C7674d dVar) {
        if (!cVar.mo25649e()) {
            if (!m42715n()) {
                cVar.mo25646b();
                cVar.mo25653i(dVar);
                return;
            }
            measure(0, 0);
            AnimatorSet g = cVar.mo25651g();
            g.addListener(new C7671a(cVar, dVar));
            for (Animator.AnimatorListener addListener : cVar.mo25652h()) {
                g.addListener(addListener);
            }
            g.start();
        }
    }

    /* renamed from: n */
    private boolean m42715n() {
        return C0835a0.m3705R(this) && !isInEditMode();
    }

    public CoordinatorLayout.C0603c<ExtendedFloatingActionButton> getBehavior() {
        return this.f33671F;
    }

    /* access modifiers changed from: package-private */
    public int getCollapsedSize() {
        return (Math.min(C0835a0.m3692G(this), C0835a0.m3690F(this)) * 2) + getIconSize();
    }

    public C10215h getExtendMotionSpec() {
        return this.f33668C.mo25647c();
    }

    public C10215h getHideMotionSpec() {
        return this.f33670E.mo25647c();
    }

    public C10215h getShowMotionSpec() {
        return this.f33669D.mo25647c();
    }

    public C10215h getShrinkMotionSpec() {
        return this.f33667B.mo25647c();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f33672G && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f33672G = false;
            this.f33667B.mo25646b();
        }
    }

    public void setExtendMotionSpec(C10215h hVar) {
        this.f33668C.mo25648d(hVar);
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(C10215h.m51725c(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.f33672G != z) {
            C7693c cVar = z ? this.f33668C : this.f33667B;
            if (!cVar.mo25649e()) {
                cVar.mo25646b();
            }
        }
    }

    public void setHideMotionSpec(C10215h hVar) {
        this.f33670E.mo25648d(hVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C10215h.m51725c(getContext(), i));
    }

    public void setShowMotionSpec(C10215h hVar) {
        this.f33669D.mo25648d(hVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C10215h.m51725c(getContext(), i));
    }

    public void setShrinkMotionSpec(C10215h hVar) {
        this.f33667B.mo25648d(hVar);
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(C10215h.m51725c(getContext(), i));
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.C0603c<T> {

        /* renamed from: a */
        private Rect f33673a;

        /* renamed from: b */
        private C7674d f33674b;

        /* renamed from: c */
        private C7674d f33675c;

        /* renamed from: d */
        private boolean f33676d;

        /* renamed from: e */
        private boolean f33677e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f33676d = false;
            this.f33677e = true;
        }

        /* renamed from: G */
        private static boolean m42716G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0606f) {
                return ((CoordinatorLayout.C0606f) layoutParams).mo2816f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: H */
        private void m42717H(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            int i;
            Rect l = extendedFloatingActionButton.f33666A;
            if (l != null && l.centerX() > 0 && l.centerY() > 0) {
                CoordinatorLayout.C0606f fVar = (CoordinatorLayout.C0606f) extendedFloatingActionButton.getLayoutParams();
                int i2 = 0;
                if (extendedFloatingActionButton.getRight() >= coordinatorLayout.getWidth() - fVar.rightMargin) {
                    i = l.right;
                } else {
                    i = extendedFloatingActionButton.getLeft() <= fVar.leftMargin ? -l.left : 0;
                }
                if (extendedFloatingActionButton.getBottom() >= coordinatorLayout.getHeight() - fVar.bottomMargin) {
                    i2 = l.bottom;
                } else if (extendedFloatingActionButton.getTop() <= fVar.topMargin) {
                    i2 = -l.top;
                }
                if (i2 != 0) {
                    C0835a0.m3712Y(extendedFloatingActionButton, i2);
                }
                if (i != 0) {
                    C0835a0.m3711X(extendedFloatingActionButton, i);
                }
            }
        }

        /* renamed from: K */
        private boolean m42718K(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.C0606f fVar = (CoordinatorLayout.C0606f) extendedFloatingActionButton.getLayoutParams();
            if ((this.f33676d || this.f33677e) && fVar.mo2815e() == view.getId()) {
                return true;
            }
            return false;
        }

        /* renamed from: M */
        private boolean m42719M(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m42718K(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f33673a == null) {
                this.f33673a = new Rect();
            }
            Rect rect = this.f33673a;
            C7700b.m42928a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                mo25495L(extendedFloatingActionButton);
                return true;
            }
            mo25491E(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: N */
        private boolean m42720N(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m42718K(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C0606f) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                mo25495L(extendedFloatingActionButton);
                return true;
            }
            mo25491E(extendedFloatingActionButton);
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: E */
        public void mo25491E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            C7693c cVar;
            boolean z = this.f33677e;
            C7674d dVar = z ? this.f33675c : this.f33674b;
            if (z) {
                cVar = extendedFloatingActionButton.f33668C;
            } else {
                cVar = extendedFloatingActionButton.f33669D;
            }
            extendedFloatingActionButton.m42714m(cVar, dVar);
        }

        /* renamed from: F */
        public boolean mo2783b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            Rect l = extendedFloatingActionButton.f33666A;
            rect.set(extendedFloatingActionButton.getLeft() + l.left, extendedFloatingActionButton.getTop() + l.top, extendedFloatingActionButton.getRight() - l.right, extendedFloatingActionButton.getBottom() - l.bottom);
            return true;
        }

        /* renamed from: I */
        public boolean mo2789h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m42719M(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (!m42716G(view)) {
                return false;
            } else {
                m42720N(view, extendedFloatingActionButton);
                return false;
            }
        }

        /* renamed from: J */
        public boolean mo2793l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> l = coordinatorLayout.mo2752l(extendedFloatingActionButton);
            int size = l.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = l.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m42716G(view) && m42720N(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (m42719M(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo2728C(extendedFloatingActionButton, i);
            m42717H(coordinatorLayout, extendedFloatingActionButton);
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: L */
        public void mo25495L(ExtendedFloatingActionButton extendedFloatingActionButton) {
            C7693c cVar;
            boolean z = this.f33677e;
            C7674d dVar = z ? this.f33675c : this.f33674b;
            if (z) {
                cVar = extendedFloatingActionButton.f33667B;
            } else {
                cVar = extendedFloatingActionButton.f33670E;
            }
            extendedFloatingActionButton.m42714m(cVar, dVar);
        }

        /* renamed from: g */
        public void mo2788g(CoordinatorLayout.C0606f fVar) {
            if (fVar.f1992h == 0) {
                fVar.f1992h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10135k.f40304N0);
            this.f33676d = obtainStyledAttributes.getBoolean(C10135k.f40309O0, false);
            this.f33677e = obtainStyledAttributes.getBoolean(C10135k.f40314P0, true);
            obtainStyledAttributes.recycle();
        }
    }
}
