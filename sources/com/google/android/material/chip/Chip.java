package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.C0493g;
import androidx.core.view.C0832a;
import androidx.core.view.C0835a0;
import androidx.core.view.accessibility.C0862c;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.AdError;
import com.google.android.material.chip.C7622a;
import com.google.android.material.internal.C7709g;
import com.google.android.material.internal.C7710h;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import p175z.C6170a;
import p227f6.C10126b;
import p227f6.C10133i;
import p227f6.C10134j;
import p227f6.C10135k;
import p236g6.C10215h;
import p346s6.C12456c;
import p346s6.C12457d;
import p346s6.C12461f;
import p355t6.C12538b;
import p375v6.C12826h;
import p375v6.C12829k;
import p375v6.C12844n;

public class Chip extends C0493g implements C7622a.C7623a, C12844n {
    /* access modifiers changed from: private */

    /* renamed from: C */
    public static final Rect f33447C = new Rect();

    /* renamed from: D */
    private static final int[] f33448D = {16842913};

    /* renamed from: E */
    private static final int[] f33449E = {16842911};

    /* renamed from: A */
    private final RectF f33450A;

    /* renamed from: B */
    private final C12461f f33451B;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C7622a f33452e;

    /* renamed from: f */
    private InsetDrawable f33453f;

    /* renamed from: g */
    private RippleDrawable f33454g;

    /* renamed from: h */
    private View.OnClickListener f33455h;

    /* renamed from: i */
    private CompoundButton.OnCheckedChangeListener f33456i;

    /* renamed from: r */
    private boolean f33457r;

    /* renamed from: s */
    private boolean f33458s;

    /* renamed from: t */
    private boolean f33459t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f33460u;

    /* renamed from: v */
    private boolean f33461v;

    /* renamed from: w */
    private int f33462w;

    /* renamed from: x */
    private int f33463x;

    /* renamed from: y */
    private final C7616c f33464y;

    /* renamed from: z */
    private final Rect f33465z;

    /* renamed from: com.google.android.material.chip.Chip$a */
    class C7614a extends C12461f {
        C7614a() {
        }

        /* renamed from: a */
        public void mo25210a(int i) {
        }

        /* renamed from: b */
        public void mo25211b(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.f33452e.mo25250B2() ? Chip.this.f33452e.mo25296Z0() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$b */
    class C7615b extends ViewOutlineProvider {
        C7615b() {
        }

        public void getOutline(View view, Outline outline) {
            if (Chip.this.f33452e != null) {
                Chip.this.f33452e.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$c */
    private class C7616c extends C6170a {
        C7616c(Chip chip) {
            super(chip);
        }

        /* access modifiers changed from: protected */
        /* renamed from: B */
        public int mo21049B(float f, float f2) {
            return (!Chip.this.m42371m() || !Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 0 : 1;
        }

        /* access modifiers changed from: protected */
        /* renamed from: C */
        public void mo21050C(List<Integer> list) {
            list.add(0);
            if (Chip.this.m42371m() && Chip.this.mo25117r()) {
                list.add(1);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: J */
        public boolean mo21053J(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.mo25118s();
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: M */
        public void mo21056M(C0862c cVar) {
            cVar.mo3291V(Chip.this.mo25116q());
            cVar.mo3294Y(Chip.this.isClickable());
            if (Chip.this.mo25116q() || Chip.this.isClickable()) {
                cVar.mo3293X(Chip.this.mo25116q() ? "android.widget.CompoundButton" : "android.widget.Button");
            } else {
                cVar.mo3293X("android.view.View");
            }
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                cVar.mo3328s0(text);
            } else {
                cVar.mo3299b0(text);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: N */
        public void mo21057N(int i, C0862c cVar) {
            CharSequence charSequence = "";
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    cVar.mo3299b0(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = C10133i.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    cVar.mo3299b0(context.getString(i2, objArr).trim());
                }
                cVar.mo3289T(Chip.this.getCloseIconTouchBoundsInt());
                cVar.mo3298b(C0862c.C0863a.f2505i);
                cVar.mo3302d0(Chip.this.isEnabled());
                return;
            }
            cVar.mo3299b0(charSequence);
            cVar.mo3289T(Chip.f33447C);
        }

        /* access modifiers changed from: protected */
        /* renamed from: O */
        public void mo21058O(int i, boolean z) {
            if (i == 1) {
                boolean unused = Chip.this.f33460u = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C10126b.chipStyle);
    }

    /* renamed from: A */
    private void m42359A() {
        TextPaint paint = getPaint();
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        C12457d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.mo37211i(getContext(), paint, this.f33451B);
        }
    }

    /* renamed from: B */
    private void m42360B(AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f33450A.setEmpty();
        if (m42371m()) {
            this.f33452e.mo25282S0(this.f33450A);
        }
        return this.f33450A;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f33465z.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f33465z;
    }

    private C12457d getTextAppearance() {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            return aVar.mo25299a1();
        }
        return null;
    }

    /* renamed from: h */
    private void m42367h(C7622a aVar) {
        aVar.mo25309f2(this);
    }

    /* renamed from: i */
    private int[] m42368i() {
        int isEnabled = isEnabled();
        if (this.f33460u) {
            isEnabled++;
        }
        if (this.f33459t) {
            isEnabled++;
        }
        if (this.f33458s) {
            isEnabled++;
        }
        if (isChecked()) {
            isEnabled++;
        }
        int[] iArr = new int[isEnabled];
        int i = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i = 1;
        }
        if (this.f33460u) {
            iArr[i] = 16842908;
            i++;
        }
        if (this.f33459t) {
            iArr[i] = 16843623;
            i++;
        }
        if (this.f33458s) {
            iArr[i] = 16842919;
            i++;
        }
        if (isChecked()) {
            iArr[i] = 16842913;
        }
        return iArr;
    }

    /* renamed from: k */
    private void m42369k() {
        if (getBackgroundDrawable() == this.f33453f && this.f33452e.getCallback() == null) {
            this.f33452e.setCallback(this.f33453f);
        }
    }

    /* renamed from: l */
    private boolean m42370l(MotionEvent motionEvent) {
        Class<C6170a> cls = C6170a.class;
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = cls.getDeclaredField("m");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.f33464y)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = cls.getDeclaredMethod("V", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f33464y, new Object[]{Integer.valueOf(RecyclerView.UNDEFINED_DURATION)});
                    return true;
                }
            } catch (NoSuchMethodException e) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e);
            } catch (IllegalAccessException e2) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e2);
            } catch (InvocationTargetException e3) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e3);
            } catch (NoSuchFieldException e4) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e4);
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public boolean m42371m() {
        C7622a aVar = this.f33452e;
        return (aVar == null || aVar.mo25269L0() == null) ? false : true;
    }

    /* renamed from: n */
    private void m42372n(Context context, AttributeSet attributeSet, int i) {
        TypedArray k = C7709g.m42962k(context, attributeSet, C10135k.f40288K, i, C10134j.Widget_MaterialComponents_Chip_Action, new int[0]);
        this.f33461v = k.getBoolean(C10135k.f40459p0, false);
        this.f33463x = (int) Math.ceil((double) k.getDimension(C10135k.f40387d0, (float) Math.ceil((double) C7710h.m42964a(getContext(), 48))));
        k.recycle();
    }

    /* renamed from: o */
    private void m42373o() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C7615b());
        }
    }

    /* renamed from: p */
    private void m42374p(int i, int i2, int i3, int i4) {
        this.f33453f = new InsetDrawable(this.f33452e, i, i2, i3, i4);
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f33459t != z) {
            this.f33459t = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f33458s != z) {
            this.f33458s = z;
            refreshDrawableState();
        }
    }

    /* renamed from: t */
    private void m42375t() {
        if (this.f33453f != null) {
            this.f33453f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m42378x();
        }
    }

    /* renamed from: v */
    private void m42376v(C7622a aVar) {
        if (aVar != null) {
            aVar.mo25309f2((C7622a.C7623a) null);
        }
    }

    /* renamed from: w */
    private void m42377w() {
        if (Build.VERSION.SDK_INT < 24) {
            if (!m42371m() || !mo25117r()) {
                C0835a0.m3741n0(this, (C0832a) null);
            } else {
                C0835a0.m3741n0(this, this.f33464y);
            }
        }
    }

    /* renamed from: x */
    private void m42378x() {
        if (C12538b.f46034a) {
            m42379y();
            return;
        }
        this.f33452e.mo25247A2(true);
        C0835a0.m3749r0(this, getBackgroundDrawable());
        m42369k();
    }

    /* renamed from: y */
    private void m42379y() {
        this.f33454g = new RippleDrawable(C12538b.m59728a(this.f33452e.mo25292X0()), getBackgroundDrawable(), (Drawable) null);
        this.f33452e.mo25247A2(false);
        C0835a0.m3749r0(this, this.f33454g);
    }

    /* renamed from: z */
    private void m42380z() {
        C7622a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f33452e) != null) {
            C0835a0.m3681A0(this, (int) (this.f33452e.mo25263I0() + this.f33452e.mo25303c1() + this.f33452e.mo25318h0()), getPaddingTop(), (int) (aVar.mo25253D0() + this.f33452e.mo25301b1() + this.f33452e.mo25327l0()), getPaddingBottom());
        }
    }

    /* renamed from: a */
    public void mo25074a() {
        mo25107j(this.f33463x);
        m42378x();
        m42380z();
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return m42370l(motionEvent) || this.f33464y.mo21063v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f33464y.mo21064w(keyEvent) || this.f33464y.mo21048A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C7622a aVar = this.f33452e;
        if ((aVar == null || !aVar.mo25319h1()) ? false : this.f33452e.mo25302b2(m42368i())) {
            invalidate();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f33453f;
        return insetDrawable == null ? this.f33452e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            return aVar.mo25245A0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            return aVar.mo25248B0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            return aVar.mo25251C0();
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f33452e;
    }

    public float getChipEndPadding() {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            return aVar.mo25253D0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            return aVar.mo25255E0();
        }
        return null;
    }

    public float getChipIconSize() {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            return aVar.mo25257F0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            return aVar.mo25259G0();
        }
        return null;
    }

    public float getChipMinHeight() {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            return aVar.mo25261H0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            return aVar.mo25263I0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            return aVar.mo25265J0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            return aVar.mo25267K0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            return aVar.mo25269L0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            return aVar.mo25271M0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            return aVar.mo25273N0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            return aVar.mo25275O0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            return aVar.mo25277P0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            return aVar.mo25281R0();
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            return aVar.mo25284T0();
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.f33464y.mo21048A() == 1 || this.f33464y.mo21065x() == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C10215h getHideMotionSpec() {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            return aVar.mo25286U0();
        }
        return null;
    }

    public float getIconEndPadding() {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            return aVar.mo25288V0();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            return aVar.mo25290W0();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            return aVar.mo25292X0();
        }
        return null;
    }

    public C12829k getShapeAppearanceModel() {
        return this.f33452e.mo37735B();
    }

    public C10215h getShowMotionSpec() {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            return aVar.mo25294Y0();
        }
        return null;
    }

    public float getTextEndPadding() {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            return aVar.mo25301b1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            return aVar.mo25303c1();
        }
        return 0.0f;
    }

    /* renamed from: j */
    public boolean mo25107j(int i) {
        this.f33463x = i;
        int i2 = 0;
        if (!mo25209u()) {
            m42375t();
            return false;
        }
        int max = Math.max(0, i - this.f33452e.getIntrinsicHeight());
        int max2 = Math.max(0, i - this.f33452e.getIntrinsicWidth());
        if (max2 > 0 || max > 0) {
            int i3 = max2 > 0 ? max2 / 2 : 0;
            if (max > 0) {
                i2 = max / 2;
            }
            if (this.f33453f != null) {
                Rect rect = new Rect();
                this.f33453f.getPadding(rect);
                if (rect.top == i2 && rect.bottom == i2 && rect.left == i3 && rect.right == i3) {
                    return true;
                }
            }
            if (Build.VERSION.SDK_INT >= 16) {
                if (getMinHeight() != i) {
                    setMinHeight(i);
                }
                if (getMinWidth() != i) {
                    setMinWidth(i);
                }
            } else {
                setMinHeight(i);
                setMinWidth(i);
            }
            m42374p(i3, i2, i3, i2);
            return true;
        }
        m42375t();
        return false;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C12826h.m60626f(this, this.f33452e);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f33448D);
        }
        if (mo25116q()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f33449E);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.f33464y.mo21052I(z, i, rect);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (mo25116q() || isClickable()) {
            accessibilityNodeInfo.setClassName(mo25116q() ? "android.widget.CompoundButton" : "android.widget.Button");
        } else {
            accessibilityNodeInfo.setClassName("android.view.View");
        }
        accessibilityNodeInfo.setCheckable(mo25116q());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE);
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f33462w != i) {
            this.f33462w = i;
            m42380z();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.f33458s
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r2)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.f33458s
            if (r0 == 0) goto L_0x0034
            r5.mo25118s()
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r5.setCloseIconPressed(r2)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r3)
        L_0x003e:
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x0049
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: q */
    public boolean mo25116q() {
        C7622a aVar = this.f33452e;
        return aVar != null && aVar.mo25310g1();
    }

    /* renamed from: r */
    public boolean mo25117r() {
        C7622a aVar = this.f33452e;
        return aVar != null && aVar.mo25321i1();
    }

    /* renamed from: s */
    public boolean mo25118s() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f33455h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        this.f33464y.mo21061U(1, 1);
        return z;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f33454g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f33454g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25337p1(z);
        }
    }

    public void setCheckableResource(int i) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25339q1(i);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C7622a aVar = this.f33452e;
        if (aVar == null) {
            this.f33457r = z;
        } else if (aVar.mo25310g1()) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z && (onCheckedChangeListener = this.f33456i) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25341r1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25343s1(i);
        }
    }

    public void setCheckedIconVisible(int i) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25349t1(i);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25354v1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25356w1(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25358x1(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25360y1(i);
        }
    }

    public void setChipDrawable(C7622a aVar) {
        C7622a aVar2 = this.f33452e;
        if (aVar2 != aVar) {
            m42376v(aVar2);
            this.f33452e = aVar;
            aVar.mo25340q2(false);
            m42367h(this.f33452e);
            mo25107j(this.f33463x);
            m42378x();
        }
    }

    public void setChipEndPadding(float f) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25362z1(f);
        }
    }

    public void setChipEndPaddingResource(int i) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25246A1(i);
        }
    }

    public void setChipIcon(Drawable drawable) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25249B1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25252C1(i);
        }
    }

    public void setChipIconSize(float f) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25254D1(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25256E1(i);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25258F1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25260G1(i);
        }
    }

    public void setChipIconVisible(int i) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25262H1(i);
        }
    }

    public void setChipMinHeight(float f) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25266J1(f);
        }
    }

    public void setChipMinHeightResource(int i) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25268K1(i);
        }
    }

    public void setChipStartPadding(float f) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25270L1(f);
        }
    }

    public void setChipStartPaddingResource(int i) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25272M1(i);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25274N1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25276O1(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25278P1(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25280Q1(i);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25283S1(drawable);
        }
        m42377w();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25285T1(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25287U1(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25289V1(i);
        }
    }

    public void setCloseIconResource(int i) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25291W1(i);
        }
        m42377w();
    }

    public void setCloseIconSize(float f) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25293X1(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25295Y1(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25297Z1(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25300a2(i);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25304c2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25305d2(i);
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo37744S(f);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f33452e != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                C7622a aVar = this.f33452e;
                if (aVar != null) {
                    aVar.mo25311g2(truncateAt);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f33461v = z;
        mo25107j(this.f33463x);
    }

    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C10215h hVar) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25320h2(hVar);
        }
    }

    public void setHideMotionSpecResource(int i) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25322i2(i);
        }
    }

    public void setIconEndPadding(float f) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25325j2(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25326k2(i);
        }
    }

    public void setIconStartPadding(float f) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25328l2(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25329m2(i);
        }
    }

    public void setLayoutDirection(int i) {
        if (this.f33452e != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i);
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25331n2(i);
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    /* access modifiers changed from: package-private */
    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f33456i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f33455h = onClickListener;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25333o2(colorStateList);
        }
        if (!this.f33452e.mo25307e1()) {
            m42379y();
        }
    }

    public void setRippleColorResource(int i) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25338p2(i);
            if (!this.f33452e.mo25307e1()) {
                m42379y();
            }
        }
    }

    public void setShapeAppearanceModel(C12829k kVar) {
        this.f33452e.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(C10215h hVar) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25342r2(hVar);
        }
    }

    public void setShowMotionSpecResource(int i) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25344s2(i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(aVar.mo25250B2() ? null : charSequence, bufferType);
            C7622a aVar2 = this.f33452e;
            if (aVar2 != null) {
                aVar2.mo25350t2(charSequence);
            }
        }
    }

    public void setTextAppearance(C12457d dVar) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25352u2(dVar);
        }
        m42359A();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25357w2(f);
        }
    }

    public void setTextEndPaddingResource(int i) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25359x2(i);
        }
    }

    public void setTextStartPadding(float f) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25361y2(f);
        }
    }

    public void setTextStartPaddingResource(int i) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25363z2(i);
        }
    }

    /* renamed from: u */
    public boolean mo25209u() {
        return this.f33461v;
    }

    public Chip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33465z = new Rect();
        this.f33450A = new RectF();
        this.f33451B = new C7614a();
        m42360B(attributeSet);
        int i2 = C10134j.Widget_MaterialComponents_Chip_Action;
        C7622a q0 = C7622a.m42428q0(context, attributeSet, i, i2);
        m42372n(context, attributeSet, i);
        setChipDrawable(q0);
        q0.mo37744S(C0835a0.m3756v(this));
        TypedArray k = C7709g.m42962k(context, attributeSet, C10135k.f40288K, i, i2, new int[0]);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            setTextColor(C12456c.m59420a(context, k, C10135k.f40298M));
        }
        boolean hasValue = k.hasValue(C10135k.f40488u0);
        k.recycle();
        C7616c cVar = new C7616c(this);
        this.f33464y = cVar;
        if (i3 >= 24) {
            C0835a0.m3741n0(this, cVar);
        } else {
            m42377w();
        }
        if (!hasValue) {
            m42373o();
        }
        setChecked(this.f33457r);
        setText(q0.mo25296Z0());
        setEllipsize(q0.mo25284T0());
        setIncludeFontPadding(false);
        m42359A();
        if (!this.f33452e.mo25250B2()) {
            setSingleLine();
        }
        setGravity(8388627);
        m42380z();
        if (mo25209u()) {
            setMinHeight(this.f33463x);
        }
        this.f33462w = C0835a0.m3682B(this);
    }

    public void setCloseIconVisible(boolean z) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25308e2(z);
        }
        m42377w();
    }

    public void setCheckedIconVisible(boolean z) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25351u1(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25264I1(z);
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25355v2(i);
        }
        m42359A();
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C7622a aVar = this.f33452e;
        if (aVar != null) {
            aVar.mo25355v2(i);
        }
        m42359A();
    }
}
