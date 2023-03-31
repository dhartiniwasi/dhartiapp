package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C0490f;
import androidx.core.graphics.drawable.C0732a;
import androidx.core.view.C0835a0;
import androidx.core.widget.C0986j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p055h.C4411a;
import p227f6.C10126b;
import p227f6.C10134j;
import p375v6.C12826h;
import p375v6.C12829k;
import p375v6.C12844n;

public class MaterialButton extends C0490f implements Checkable, C12844n {

    /* renamed from: x */
    private static final int[] f33405x = {16842911};

    /* renamed from: y */
    private static final int[] f33406y = {16842912};

    /* renamed from: z */
    private static final int f33407z = C10134j.Widget_MaterialComponents_Button;

    /* renamed from: d */
    private final C7611a f33408d;

    /* renamed from: e */
    private final LinkedHashSet<C7609a> f33409e;

    /* renamed from: f */
    private C7610b f33410f;

    /* renamed from: g */
    private PorterDuff.Mode f33411g;

    /* renamed from: h */
    private ColorStateList f33412h;

    /* renamed from: i */
    private Drawable f33413i;

    /* renamed from: r */
    private int f33414r;

    /* renamed from: s */
    private int f33415s;

    /* renamed from: t */
    private int f33416t;

    /* renamed from: u */
    private boolean f33417u;

    /* renamed from: v */
    private boolean f33418v;

    /* renamed from: w */
    private int f33419w;

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    public interface C7609a {
        /* renamed from: a */
        void mo25013a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    interface C7610b {
        /* renamed from: a */
        void mo25014a(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C10126b.materialButtonStyle);
    }

    /* renamed from: b */
    private boolean m42316b() {
        return C0835a0.m3682B(this) == 1;
    }

    /* renamed from: c */
    private boolean m42317c() {
        C7611a aVar = this.f33408d;
        return aVar != null && !aVar.mo25025m();
    }

    /* renamed from: d */
    private void m42318d(boolean z) {
        if (z) {
            C0986j.m4460i(this, this.f33413i, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            C0986j.m4460i(this, (Drawable) null, (Drawable) null, this.f33413i, (Drawable) null);
        }
    }

    /* renamed from: e */
    private void m42319e(boolean z) {
        Drawable drawable = this.f33413i;
        boolean z2 = false;
        if (drawable != null) {
            Drawable mutate = C0732a.m3380r(drawable).mutate();
            this.f33413i = mutate;
            C0732a.m3377o(mutate, this.f33412h);
            PorterDuff.Mode mode = this.f33411g;
            if (mode != null) {
                C0732a.m3378p(this.f33413i, mode);
            }
            int i = this.f33414r;
            if (i == 0) {
                i = this.f33413i.getIntrinsicWidth();
            }
            int i2 = this.f33414r;
            if (i2 == 0) {
                i2 = this.f33413i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f33413i;
            int i3 = this.f33415s;
            drawable2.setBounds(i3, 0, i + i3, i2);
        }
        int i4 = this.f33419w;
        boolean z3 = i4 == 1 || i4 == 2;
        if (z) {
            m42318d(z3);
            return;
        }
        Drawable[] a = C0986j.m4452a(this);
        Drawable drawable3 = a[0];
        Drawable drawable4 = a[2];
        if ((z3 && drawable3 != this.f33413i) || (!z3 && drawable4 != this.f33413i)) {
            z2 = true;
        }
        if (z2) {
            m42318d(z3);
        }
    }

    /* renamed from: f */
    private void m42320f() {
        if (this.f33413i != null && getLayout() != null) {
            int i = this.f33419w;
            boolean z = true;
            if (i == 1 || i == 3) {
                this.f33415s = 0;
                m42319e(false);
                return;
            }
            TextPaint paint = getPaint();
            String charSequence = getText().toString();
            if (getTransformationMethod() != null) {
                charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
            }
            int min = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
            int i2 = this.f33414r;
            if (i2 == 0) {
                i2 = this.f33413i.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - min) - C0835a0.m3690F(this)) - i2) - this.f33416t) - C0835a0.m3692G(this)) / 2;
            boolean b = m42316b();
            if (this.f33419w != 4) {
                z = false;
            }
            if (b != z) {
                measuredWidth = -measuredWidth;
            }
            if (this.f33415s != measuredWidth) {
                this.f33415s = measuredWidth;
                m42319e(false);
            }
        }
    }

    private String getA11yClassName() {
        return (mo24965a() ? CompoundButton.class : Button.class).getName();
    }

    /* renamed from: a */
    public boolean mo24965a() {
        C7611a aVar = this.f33408d;
        return aVar != null && aVar.mo25026n();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m42317c()) {
            return this.f33408d.mo25016b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f33413i;
    }

    public int getIconGravity() {
        return this.f33419w;
    }

    public int getIconPadding() {
        return this.f33416t;
    }

    public int getIconSize() {
        return this.f33414r;
    }

    public ColorStateList getIconTint() {
        return this.f33412h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f33411g;
    }

    public ColorStateList getRippleColor() {
        if (m42317c()) {
            return this.f33408d.mo25019f();
        }
        return null;
    }

    public C12829k getShapeAppearanceModel() {
        if (m42317c()) {
            return this.f33408d.mo25020g();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m42317c()) {
            return this.f33408d.mo25021h();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m42317c()) {
            return this.f33408d.mo25022i();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (m42317c()) {
            return this.f33408d.mo25023j();
        }
        return super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (m42317c()) {
            return this.f33408d.mo25024k();
        }
        return super.getSupportBackgroundTintMode();
    }

    public boolean isChecked() {
        return this.f33417u;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C12826h.m60626f(this, this.f33408d.mo25018d());
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (mo24965a()) {
            Button.mergeDrawableStates(onCreateDrawableState, f33405x);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f33406y);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(mo24965a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C7611a aVar;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.f33408d) != null) {
            aVar.mo25015B(i4 - i2, i3 - i);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m42320f();
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m42320f();
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        if (m42317c()) {
            this.f33408d.mo25028p(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!m42317c()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
            this.f33408d.mo25029q();
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C4411a.m29346b(getContext(), i) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m42317c()) {
            this.f33408d.mo25030r(z);
        }
    }

    public void setChecked(boolean z) {
        if (mo24965a() && isEnabled() && this.f33417u != z) {
            this.f33417u = z;
            refreshDrawableState();
            if (!this.f33418v) {
                this.f33418v = true;
                Iterator it = this.f33409e.iterator();
                while (it.hasNext()) {
                    ((C7609a) it.next()).mo25013a(this, this.f33417u);
                }
                this.f33418v = false;
            }
        }
    }

    public void setCornerRadius(int i) {
        if (m42317c()) {
            this.f33408d.mo25031s(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m42317c()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        if (m42317c()) {
            this.f33408d.mo25018d().mo37744S(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f33413i != drawable) {
            this.f33413i = drawable;
            m42319e(true);
        }
    }

    public void setIconGravity(int i) {
        if (this.f33419w != i) {
            this.f33419w = i;
            m42320f();
        }
    }

    public void setIconPadding(int i) {
        if (this.f33416t != i) {
            this.f33416t = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C4411a.m29346b(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f33414r != i) {
            this.f33414r = i;
            m42319e(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f33412h != colorStateList) {
            this.f33412h = colorStateList;
            m42319e(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f33411g != mode) {
            this.f33411g = mode;
            m42319e(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C4411a.m29345a(getContext(), i));
    }

    /* access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public void setOnPressedChangeListenerInternal(C7610b bVar) {
        this.f33410f = bVar;
    }

    public void setPressed(boolean z) {
        C7610b bVar = this.f33410f;
        if (bVar != null) {
            bVar.mo25014a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m42317c()) {
            this.f33408d.mo25032t(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (m42317c()) {
            setRippleColor(C4411a.m29345a(getContext(), i));
        }
    }

    public void setShapeAppearanceModel(C12829k kVar) {
        if (m42317c()) {
            this.f33408d.mo25033u(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m42317c()) {
            this.f33408d.mo25034v(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m42317c()) {
            this.f33408d.mo25035w(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (m42317c()) {
            setStrokeColor(C4411a.m29345a(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m42317c()) {
            this.f33408d.mo25036x(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m42317c()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m42317c()) {
            this.f33408d.mo25037y(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m42317c()) {
            this.f33408d.mo25038z(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public void toggle() {
        setChecked(!this.f33417u);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = f33407z
            android.content.Context r9 = com.google.android.material.internal.C7709g.m42957f(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f33409e = r9
            r9 = 0
            r8.f33417u = r9
            r8.f33418v = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = p227f6.C10135k.f40424j1
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.C7709g.m42962k(r0, r1, r2, r3, r4, r5)
            int r1 = p227f6.C10135k.f40494v1
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f33416t = r1
            int r1 = p227f6.C10135k.f40509y1
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.C7710h.m42966c(r1, r2)
            r8.f33411g = r1
            android.content.Context r1 = r8.getContext()
            int r2 = p227f6.C10135k.f40504x1
            android.content.res.ColorStateList r1 = p346s6.C12456c.m59420a(r1, r0, r2)
            r8.f33412h = r1
            android.content.Context r1 = r8.getContext()
            int r2 = p227f6.C10135k.f40484t1
            android.graphics.drawable.Drawable r1 = p346s6.C12456c.m59423d(r1, r0, r2)
            r8.f33413i = r1
            int r1 = p227f6.C10135k.f40489u1
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f33419w = r1
            int r1 = p227f6.C10135k.f40499w1
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f33414r = r1
            v6.k$b r10 = p375v6.C12829k.m60633e(r7, r10, r11, r6)
            v6.k r10 = r10.mo37798m()
            com.google.android.material.button.a r11 = new com.google.android.material.button.a
            r11.<init>(r8, r10)
            r8.f33408d = r11
            r11.mo25027o(r0)
            r0.recycle()
            int r10 = r8.f33416t
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f33413i
            if (r10 == 0) goto L_0x0084
            r9 = 1
        L_0x0084:
            r8.m42319e(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
