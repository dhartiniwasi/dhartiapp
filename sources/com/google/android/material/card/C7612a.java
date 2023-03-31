package com.google.android.material.card;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import p055h.C4411a;
import p117q.C5331a;
import p227f6.C10126b;
import p227f6.C10134j;
import p375v6.C12829k;
import p375v6.C12844n;

/* renamed from: com.google.android.material.card.a */
/* compiled from: MaterialCardView */
public class C7612a extends C5331a implements Checkable, C12844n {

    /* renamed from: v */
    private static final int[] f33439v = {16842911};

    /* renamed from: w */
    private static final int[] f33440w = {16842912};

    /* renamed from: x */
    private static final int[] f33441x = {C10126b.state_dragged};

    /* renamed from: y */
    private static final int f33442y = C10134j.Widget_MaterialComponents_CardView;

    /* renamed from: r */
    private boolean f33443r;

    /* renamed from: s */
    private boolean f33444s;

    /* renamed from: t */
    private boolean f33445t;

    /* renamed from: u */
    private C7613a f33446u;

    /* renamed from: com.google.android.material.card.a$a */
    /* compiled from: MaterialCardView */
    public interface C7613a {
        /* renamed from: a */
        void mo25073a(C7612a aVar, boolean z);
    }

    /* renamed from: g */
    private void m42355g() {
        if (Build.VERSION.SDK_INT > 26) {
            throw null;
        }
    }

    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
        throw null;
    }

    public int getContentPaddingBottom() {
        throw null;
    }

    public int getContentPaddingLeft() {
        throw null;
    }

    public int getContentPaddingRight() {
        throw null;
    }

    public int getContentPaddingTop() {
        throw null;
    }

    public float getProgress() {
        throw null;
    }

    public float getRadius() {
        throw null;
    }

    public ColorStateList getRippleColor() {
        throw null;
    }

    public C12829k getShapeAppearanceModel() {
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        throw null;
    }

    public int getStrokeWidth() {
        throw null;
    }

    /* renamed from: h */
    public boolean mo25048h() {
        return false;
    }

    /* renamed from: i */
    public boolean mo25049i() {
        return this.f33445t;
    }

    public boolean isChecked() {
        return this.f33444s;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (mo25048h()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f33439v);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f33440w);
        }
        if (mo25049i()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f33441x);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C5331a.class.getName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C5331a.class.getName());
        accessibilityNodeInfo.setCheckable(mo25048h());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        getMeasuredWidth();
        getMeasuredHeight();
        throw null;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f33443r) {
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList.valueOf(i);
        throw null;
    }

    public void setCardElevation(float f) {
        super.setCardElevation(f);
        throw null;
    }

    public void setCheckable(boolean z) {
        throw null;
    }

    public void setChecked(boolean z) {
        if (this.f33444s != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        throw null;
    }

    public void setCheckedIconResource(int i) {
        C4411a.m29346b(getContext(), i);
        throw null;
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        throw null;
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        throw null;
    }

    public void setDragged(boolean z) {
        if (this.f33445t != z) {
            this.f33445t = z;
            refreshDrawableState();
            m42355g();
            invalidate();
        }
    }

    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        throw null;
    }

    public void setOnCheckedChangeListener(C7613a aVar) {
        this.f33446u = aVar;
    }

    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        throw null;
    }

    public void setProgress(float f) {
        throw null;
    }

    public void setRadius(float f) {
        super.setRadius(f);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setRippleColorResource(int i) {
        C4411a.m29345a(getContext(), i);
        throw null;
    }

    public void setShapeAppearanceModel(C12829k kVar) {
        throw null;
    }

    public void setStrokeColor(int i) {
        ColorStateList.valueOf(i);
        throw null;
    }

    public void setStrokeWidth(int i) {
        throw null;
    }

    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        throw null;
    }

    public void toggle() {
        if (mo25048h() && isEnabled()) {
            this.f33444s = !this.f33444s;
            refreshDrawableState();
            m42355g();
            C7613a aVar = this.f33446u;
            if (aVar != null) {
                aVar.mo25073a(this, this.f33444s);
            }
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        throw null;
    }
}
