package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.C0835a0;
import com.google.android.material.internal.C7709g;
import p227f6.C10135k;

/* renamed from: com.google.android.material.snackbar.d */
/* compiled from: BaseTransientBottomBar */
public class C7715d extends FrameLayout {

    /* renamed from: f */
    private static final View.OnTouchListener f33866f = new C7716a();

    /* renamed from: a */
    private C7714c f33867a;

    /* renamed from: b */
    private C7713b f33868b;

    /* renamed from: c */
    private int f33869c;

    /* renamed from: d */
    private final float f33870d;

    /* renamed from: e */
    private final float f33871e;

    /* renamed from: com.google.android.material.snackbar.d$a */
    /* compiled from: BaseTransientBottomBar */
    static class C7716a implements View.OnTouchListener {
        C7716a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    protected C7715d(Context context, AttributeSet attributeSet) {
        super(C7709g.m42957f(context, attributeSet, 0, 0), attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C10135k.f40296L2);
        int i = C10135k.f40321Q2;
        if (obtainStyledAttributes.hasValue(i)) {
            C0835a0.m3757v0(this, (float) obtainStyledAttributes.getDimensionPixelSize(i, 0));
        }
        this.f33869c = obtainStyledAttributes.getInt(C10135k.f40311O2, 0);
        this.f33870d = obtainStyledAttributes.getFloat(C10135k.f40316P2, 1.0f);
        this.f33871e = obtainStyledAttributes.getFloat(C10135k.f40306N2, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f33866f);
        setFocusable(true);
    }

    /* access modifiers changed from: package-private */
    public float getActionTextColorAlpha() {
        return this.f33871e;
    }

    /* access modifiers changed from: package-private */
    public int getAnimationMode() {
        return this.f33869c;
    }

    /* access modifiers changed from: package-private */
    public float getBackgroundOverlayColorAlpha() {
        return this.f33870d;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C7713b bVar = this.f33868b;
        if (bVar != null) {
            bVar.onViewAttachedToWindow(this);
        }
        C0835a0.m3735k0(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C7713b bVar = this.f33868b;
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C7714c cVar = this.f33867a;
        if (cVar != null) {
            cVar.mo25757a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: package-private */
    public void setAnimationMode(int i) {
        this.f33869c = i;
    }

    /* access modifiers changed from: package-private */
    public void setOnAttachStateChangeListener(C7713b bVar) {
        this.f33868b = bVar;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f33866f);
        super.setOnClickListener(onClickListener);
    }

    /* access modifiers changed from: package-private */
    public void setOnLayoutChangeListener(C7714c cVar) {
        this.f33867a = cVar;
    }
}
