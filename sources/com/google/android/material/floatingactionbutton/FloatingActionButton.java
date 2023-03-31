package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0509k;
import androidx.appcompat.widget.C0540q;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0732a;
import androidx.core.util.C0831h;
import androidx.core.view.C0835a0;
import androidx.core.view.C0957y;
import androidx.core.widget.C0999o;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.C7679a;
import com.google.android.material.internal.C7700b;
import com.google.android.material.internal.C7711i;
import java.util.List;
import p227f6.C10128d;
import p227f6.C10134j;
import p227f6.C10135k;
import p236g6.C10215h;
import p236g6.C10218k;
import p319p6.C12122a;
import p365u6.C12697b;
import p375v6.C12829k;
import p375v6.C12844n;
import p385w6.C12908a;

@CoordinatorLayout.C0604d(Behavior.class)
public class FloatingActionButton extends C7711i implements C0957y, C0999o, C12122a, C12844n {

    /* renamed from: x */
    private static final int f33682x = C10134j.Widget_Design_FloatingActionButton;

    /* renamed from: b */
    private ColorStateList f33683b;

    /* renamed from: c */
    private PorterDuff.Mode f33684c;

    /* renamed from: d */
    private ColorStateList f33685d;

    /* renamed from: e */
    private PorterDuff.Mode f33686e;

    /* renamed from: f */
    private ColorStateList f33687f;

    /* renamed from: g */
    private int f33688g;

    /* renamed from: h */
    private int f33689h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f33690i;

    /* renamed from: r */
    private int f33691r;

    /* renamed from: s */
    boolean f33692s;

    /* renamed from: t */
    final Rect f33693t;

    /* renamed from: u */
    private final Rect f33694u;

    /* renamed from: v */
    private final C0540q f33695v;

    /* renamed from: w */
    private C7679a f33696w;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        /* renamed from: E */
        public /* bridge */ /* synthetic */ boolean mo25575E(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.mo2783b(coordinatorLayout, floatingActionButton, rect);
        }

        /* renamed from: H */
        public /* bridge */ /* synthetic */ boolean mo25576H(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.mo2789h(coordinatorLayout, floatingActionButton, view);
        }

        /* renamed from: I */
        public /* bridge */ /* synthetic */ boolean mo25577I(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            return super.mo2793l(coordinatorLayout, floatingActionButton, i);
        }

        /* renamed from: g */
        public /* bridge */ /* synthetic */ void mo2788g(CoordinatorLayout.C0606f fVar) {
            super.mo2788g(fVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    class C7675a implements C7679a.C7689j {

        /* renamed from: a */
        final /* synthetic */ C7676b f33700a;

        C7675a(C7676b bVar) {
            this.f33700a = bVar;
        }

        /* renamed from: a */
        public void mo25578a() {
            this.f33700a.mo24915b(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo25579b() {
            this.f33700a.mo24914a(FloatingActionButton.this);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public static abstract class C7676b {
        /* renamed from: a */
        public void mo24914a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo24915b(FloatingActionButton floatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    private class C7677c implements C12697b {
        C7677c() {
        }

        /* renamed from: a */
        public void mo25580a(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        /* renamed from: b */
        public void mo25581b(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f33693t.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f33690i, i2 + FloatingActionButton.this.f33690i, i3 + FloatingActionButton.this.f33690i, i4 + FloatingActionButton.this.f33690i);
        }

        /* renamed from: c */
        public boolean mo25582c() {
            return FloatingActionButton.this.f33692s;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$d */
    class C7678d<T extends FloatingActionButton> implements C7679a.C7688i {

        /* renamed from: a */
        private final C10218k<T> f33703a;

        C7678d(C10218k<T> kVar) {
            this.f33703a = kVar;
        }

        /* renamed from: a */
        public void mo25583a() {
            this.f33703a.mo32910b(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo25584b() {
            this.f33703a.mo32909a(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C7678d) && ((C7678d) obj).f33703a.equals(this.f33703a);
        }

        public int hashCode() {
            return this.f33703a.hashCode();
        }
    }

    private C7679a getImpl() {
        if (this.f33696w == null) {
            this.f33696w = m42736h();
        }
        return this.f33696w;
    }

    /* renamed from: h */
    private C7679a m42736h() {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C7692b(this, new C7677c());
        }
        return new C7679a(this, new C7677c());
    }

    /* renamed from: k */
    private int m42737k(int i) {
        int i2 = this.f33689h;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i != 1) {
                return resources.getDimensionPixelSize(C10128d.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(C10128d.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return m42737k(1);
        } else {
            return m42737k(0);
        }
    }

    /* renamed from: p */
    private void m42738p(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f33693t;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* renamed from: q */
    private void m42739q() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f33685d;
            if (colorStateList == null) {
                C0732a.m3365c(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f33686e;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C0509k.m2500e(colorForState, mode));
        }
    }

    /* renamed from: r */
    private static int m42740r(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: u */
    private C7679a.C7689j m42741u(C7676b bVar) {
        if (bVar == null) {
            return null;
        }
        return new C7675a(bVar);
    }

    /* renamed from: a */
    public boolean mo25507a() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo25589C(getDrawableState());
    }

    /* renamed from: e */
    public void mo25509e(Animator.AnimatorListener animatorListener) {
        getImpl().mo25615d(animatorListener);
    }

    /* renamed from: f */
    public void mo25510f(Animator.AnimatorListener animatorListener) {
        getImpl().mo25616e(animatorListener);
    }

    /* renamed from: g */
    public void mo25511g(C10218k<? extends FloatingActionButton> kVar) {
        getImpl().mo25617f(new C7678d(kVar));
    }

    public ColorStateList getBackgroundTintList() {
        return this.f33683b;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f33684c;
    }

    public float getCompatElevation() {
        return getImpl().mo25619m();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().mo25622p();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().mo25624s();
    }

    public Drawable getContentBackground() {
        return getImpl().mo25618j();
    }

    public int getCustomSize() {
        return this.f33689h;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public C10215h getHideMotionSpec() {
        return getImpl().mo25621o();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f33687f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f33687f;
    }

    public C12829k getShapeAppearanceModel() {
        return (C12829k) C0831h.m3662f(getImpl().mo25625t());
    }

    public C10215h getShowMotionSpec() {
        return getImpl().mo25626u();
    }

    public int getSize() {
        return this.f33688g;
    }

    /* access modifiers changed from: package-private */
    public int getSizeDimension() {
        return m42737k(this.f33688g);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f33685d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f33686e;
    }

    public boolean getUseCompatPadding() {
        return this.f33692s;
    }

    @Deprecated
    /* renamed from: i */
    public boolean mo25528i(Rect rect) {
        if (!C0835a0.m3705R(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m42738p(rect);
        return true;
    }

    /* renamed from: j */
    public void mo25529j(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m42738p(rect);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo25630y();
    }

    /* renamed from: l */
    public void mo25531l(C7676b bVar) {
        mo25532m(bVar, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo25532m(C7676b bVar, boolean z) {
        getImpl().mo25627v(m42741u(bVar), z);
    }

    /* renamed from: n */
    public boolean mo25533n() {
        return getImpl().mo25628w();
    }

    /* renamed from: o */
    public boolean mo25534o() {
        return getImpl().mo25629x();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().mo25631z();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().mo25588B();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f33690i = (sizeDimension - this.f33691r) / 2;
        getImpl().mo25613b0();
        int min = Math.min(m42740r(sizeDimension, i), m42740r(sizeDimension, i2));
        Rect rect = this.f33693t;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C12908a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C12908a aVar = (C12908a) parcelable;
        super.onRestoreInstanceState(aVar.mo20873a());
        Bundle bundle = (Bundle) C0831h.m3662f(aVar.f47116c.get("expandableWidgetHelper"));
        throw null;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        new C12908a(onSaveInstanceState);
        throw null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !mo25528i(this.f33694u) || this.f33694u.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* renamed from: s */
    public void mo25541s(C7676b bVar) {
        mo25574t(bVar, true);
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f33683b != colorStateList) {
            this.f33683b = colorStateList;
            getImpl().mo25596J(colorStateList);
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f33684c != mode) {
            this.f33684c = mode;
            getImpl().mo25597K(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().mo25598L(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().mo25601O(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().mo25603Q(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i != this.f33689h) {
            this.f33689h = i;
            requestLayout();
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().mo25614c0(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().mo25620n()) {
            getImpl().mo25599M(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        throw null;
    }

    public void setHideMotionSpec(C10215h hVar) {
        getImpl().mo25600N(hVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C10215h.m51725c(getContext(), i));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().mo25612a0();
            if (this.f33685d != null) {
                m42739q();
            }
        }
    }

    public void setImageResource(int i) {
        this.f33695v.mo2545i(i);
        m42739q();
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().mo25593G();
    }

    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().mo25593G();
    }

    public void setShadowPaddingEnabled(boolean z) {
        getImpl().mo25605S(z);
    }

    public void setShapeAppearanceModel(C12829k kVar) {
        getImpl().mo25606T(kVar);
    }

    public void setShowMotionSpec(C10215h hVar) {
        getImpl().mo25607U(hVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C10215h.m51725c(getContext(), i));
    }

    public void setSize(int i) {
        this.f33689h = 0;
        if (i != this.f33688g) {
            this.f33688g = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f33685d != colorStateList) {
            this.f33685d = colorStateList;
            m42739q();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f33686e != mode) {
            this.f33686e = mode;
            m42739q();
        }
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().mo25594H();
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().mo25594H();
    }

    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().mo25594H();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f33692s != z) {
            this.f33692s = z;
            getImpl().mo25587A();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo25574t(C7676b bVar, boolean z) {
        getImpl().mo25610Y(m42741u(bVar), z);
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.C0603c<T> {

        /* renamed from: a */
        private Rect f33697a;

        /* renamed from: b */
        private C7676b f33698b;

        /* renamed from: c */
        private boolean f33699c;

        public BaseBehavior() {
            this.f33699c = true;
        }

        /* renamed from: F */
        private static boolean m42754F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0606f) {
                return ((CoordinatorLayout.C0606f) layoutParams).mo2816f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: G */
        private void m42755G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            int i;
            Rect rect = floatingActionButton.f33693t;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.C0606f fVar = (CoordinatorLayout.C0606f) floatingActionButton.getLayoutParams();
                int i2 = 0;
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - fVar.rightMargin) {
                    i = rect.right;
                } else {
                    i = floatingActionButton.getLeft() <= fVar.leftMargin ? -rect.left : 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - fVar.bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= fVar.topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    C0835a0.m3712Y(floatingActionButton, i2);
                }
                if (i != 0) {
                    C0835a0.m3711X(floatingActionButton, i);
                }
            }
        }

        /* renamed from: J */
        private boolean m42756J(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.C0606f fVar = (CoordinatorLayout.C0606f) floatingActionButton.getLayoutParams();
            if (this.f33699c && fVar.mo2815e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: K */
        private boolean m42757K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!m42756J(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f33697a == null) {
                this.f33697a = new Rect();
            }
            Rect rect = this.f33697a;
            C7700b.m42928a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.mo25532m(this.f33698b, false);
                return true;
            }
            floatingActionButton.mo25574t(this.f33698b, false);
            return true;
        }

        /* renamed from: L */
        private boolean m42758L(View view, FloatingActionButton floatingActionButton) {
            if (!m42756J(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C0606f) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.mo25532m(this.f33698b, false);
                return true;
            }
            floatingActionButton.mo25574t(this.f33698b, false);
            return true;
        }

        /* renamed from: E */
        public boolean mo2783b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f33693t;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: H */
        public boolean mo2789h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m42757K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!m42754F(view)) {
                return false;
            } else {
                m42758L(view, floatingActionButton);
                return false;
            }
        }

        /* renamed from: I */
        public boolean mo2793l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> l = coordinatorLayout.mo2752l(floatingActionButton);
            int size = l.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = l.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m42754F(view) && m42758L(view, floatingActionButton)) {
                        break;
                    }
                } else if (m42757K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo2728C(floatingActionButton, i);
            m42755G(coordinatorLayout, floatingActionButton);
            return true;
        }

        /* renamed from: g */
        public void mo2788g(CoordinatorLayout.C0606f fVar) {
            if (fVar.f1992h == 0) {
                fVar.f1992h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10135k.f40324R0);
            this.f33699c = obtainStyledAttributes.getBoolean(C10135k.f40329S0, true);
            obtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f33687f != colorStateList) {
            this.f33687f = colorStateList;
            getImpl().mo25604R(this.f33687f);
        }
    }
}
