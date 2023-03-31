package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0371i;
import androidx.appcompat.view.menu.C0385n;
import androidx.appcompat.widget.C0479d1;
import androidx.appcompat.widget.C0519m0;
import androidx.core.content.res.C0707h;
import androidx.core.graphics.drawable.C0732a;
import androidx.core.view.C0832a;
import androidx.core.view.C0835a0;
import androidx.core.view.accessibility.C0862c;
import androidx.core.widget.C0986j;
import p048g.C4288a;
import p227f6.C10128d;
import p227f6.C10129e;
import p227f6.C10130f;
import p227f6.C10132h;

public class NavigationMenuItemView extends C7702d implements C0385n.C0386a {

    /* renamed from: N */
    private static final int[] f33768N = {16842912};

    /* renamed from: D */
    private int f33769D;

    /* renamed from: E */
    private boolean f33770E;

    /* renamed from: F */
    boolean f33771F;

    /* renamed from: G */
    private final CheckedTextView f33772G;

    /* renamed from: H */
    private FrameLayout f33773H;

    /* renamed from: I */
    private C0371i f33774I;

    /* renamed from: J */
    private ColorStateList f33775J;

    /* renamed from: K */
    private boolean f33776K;

    /* renamed from: L */
    private Drawable f33777L;

    /* renamed from: M */
    private final C0832a f33778M;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    class C7697a extends C0832a {
        C7697a() {
        }

        /* renamed from: g */
        public void mo3231g(View view, C0862c cVar) {
            super.mo3231g(view, cVar);
            cVar.mo3291V(NavigationMenuItemView.this.f33771F);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: B */
    private void m42873B() {
        if (m42875D()) {
            this.f33772G.setVisibility(8);
            FrameLayout frameLayout = this.f33773H;
            if (frameLayout != null) {
                C0519m0.C0520a aVar = (C0519m0.C0520a) frameLayout.getLayoutParams();
                aVar.width = -1;
                this.f33773H.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f33772G.setVisibility(0);
        FrameLayout frameLayout2 = this.f33773H;
        if (frameLayout2 != null) {
            C0519m0.C0520a aVar2 = (C0519m0.C0520a) frameLayout2.getLayoutParams();
            aVar2.width = -2;
            this.f33773H.setLayoutParams(aVar2);
        }
    }

    /* renamed from: C */
    private StateListDrawable m42874C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C4288a.f23783w, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f33768N, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    /* renamed from: D */
    private boolean m42875D() {
        return this.f33774I.getTitle() == null && this.f33774I.getIcon() == null && this.f33774I.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f33773H == null) {
                this.f33773H = (FrameLayout) ((ViewStub) findViewById(C10130f.design_menu_item_action_area_stub)).inflate();
            }
            this.f33773H.removeAllViews();
            this.f33773H.addView(view);
        }
    }

    /* renamed from: d */
    public boolean mo1176d() {
        return false;
    }

    /* renamed from: e */
    public void mo1177e(C0371i iVar, int i) {
        this.f33774I = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            C0835a0.m3749r0(this, m42874C());
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.getTitle());
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.getContentDescription());
        C0479d1.m2358a(this, iVar.getTooltipText());
        m42873B();
    }

    public C0371i getItemData() {
        return this.f33774I;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0371i iVar = this.f33774I;
        if (iVar != null && iVar.isCheckable() && this.f33774I.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, f33768N);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f33771F != z) {
            this.f33771F = z;
            this.f33778M.mo3235l(this.f33772G, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f33772G.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f33776K) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0732a.m3380r(drawable).mutate();
                C0732a.m3377o(drawable, this.f33775J);
            }
            int i = this.f33769D;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f33770E) {
            if (this.f33777L == null) {
                Drawable d = C0707h.m3258d(getResources(), C10129e.navigation_empty_icon, getContext().getTheme());
                this.f33777L = d;
                if (d != null) {
                    int i2 = this.f33769D;
                    d.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f33777L;
        }
        C0986j.m4460i(this.f33772G, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i) {
        this.f33772G.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f33769D = i;
    }

    /* access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        this.f33775J = colorStateList;
        this.f33776K = colorStateList != null;
        C0371i iVar = this.f33774I;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f33772G.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f33770E = z;
    }

    public void setTextAppearance(int i) {
        C0986j.m4465n(this.f33772G, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f33772G.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f33772G.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C7697a aVar = new C7697a();
        this.f33778M = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C10132h.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C10128d.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C10130f.design_menu_item_text);
        this.f33772G = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C0835a0.m3741n0(checkedTextView, aVar);
    }
}
