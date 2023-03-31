package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.google.android.material.internal.C7701c;
import com.google.android.material.internal.C7709g;
import p227f6.C10126b;
import p227f6.C10134j;
import p227f6.C10135k;

public class ChipGroup extends C7701c {

    /* renamed from: d */
    private int f33469d;

    /* renamed from: e */
    private int f33470e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f33471f;

    /* renamed from: g */
    private C7620d f33472g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C7618b f33473h;

    /* renamed from: i */
    private C7621e f33474i;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f33475r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f33476s;

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    private class C7618b implements CompoundButton.OnCheckedChangeListener {
        private C7618b() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!ChipGroup.this.f33476s) {
                int id = compoundButton.getId();
                if (z) {
                    if (!(ChipGroup.this.f33475r == -1 || ChipGroup.this.f33475r == id || !ChipGroup.this.f33471f)) {
                        ChipGroup chipGroup = ChipGroup.this;
                        chipGroup.m42401k(chipGroup.f33475r, false);
                    }
                    ChipGroup.this.setCheckedId(id);
                } else if (ChipGroup.this.f33475r == id) {
                    ChipGroup.this.setCheckedId(-1);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    public static class C7619c extends ViewGroup.MarginLayoutParams {
        public C7619c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C7619c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C7619c(int i, int i2) {
            super(i, i2);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    public interface C7620d {
        /* renamed from: a */
        void mo25242a(ChipGroup chipGroup, int i);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$e */
    private class C7621e implements ViewGroup.OnHierarchyChangeListener {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public ViewGroup.OnHierarchyChangeListener f33478a;

        private C7621e() {
        }

        public void onChildViewAdded(View view, View view2) {
            int i;
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    if (Build.VERSION.SDK_INT >= 17) {
                        i = View.generateViewId();
                    } else {
                        i = view2.hashCode();
                    }
                    view2.setId(i);
                }
                ((Chip) view2).setOnCheckedChangeListenerInternal(ChipGroup.this.f33473h);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f33478a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal((CompoundButton.OnCheckedChangeListener) null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f33478a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C10126b.chipGroupStyle);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m42401k(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.f33476s = true;
            ((Chip) findViewById).setChecked(z);
            this.f33476s = false;
        }
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int i) {
        this.f33475r = i;
        C7620d dVar = this.f33472g;
        if (dVar != null && this.f33471f) {
            dVar.mo25242a(this, i);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.f33475r;
                if (i2 != -1 && this.f33471f) {
                    m42401k(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public boolean mo25214b() {
        return super.mo25214b();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C7619c);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C7619c(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C7619c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.f33471f) {
            return this.f33475r;
        }
        return -1;
    }

    public int getChipSpacingHorizontal() {
        return this.f33469d;
    }

    public int getChipSpacingVertical() {
        return this.f33470e;
    }

    /* renamed from: j */
    public void mo25222j() {
        this.f33476s = true;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.f33476s = false;
        setCheckedId(-1);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f33475r;
        if (i != -1) {
            m42401k(i, true);
            setCheckedId(this.f33475r);
        }
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f33469d != i) {
            this.f33469d = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f33470e != i) {
            this.f33470e = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(C7620d dVar) {
        this.f33472g = dVar;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        ViewGroup.OnHierarchyChangeListener unused = this.f33474i.f33478a = onHierarchyChangeListener;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        if (this.f33471f != z) {
            this.f33471f = z;
            mo25222j();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33473h = new C7618b();
        this.f33474i = new C7621e();
        this.f33475r = -1;
        this.f33476s = false;
        TypedArray k = C7709g.m42962k(context, attributeSet, C10135k.f40508y0, i, C10134j.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = k.getDimensionPixelOffset(C10135k.f40239A0, 0);
        setChipSpacingHorizontal(k.getDimensionPixelOffset(C10135k.f40244B0, dimensionPixelOffset));
        setChipSpacingVertical(k.getDimensionPixelOffset(C10135k.f40249C0, dimensionPixelOffset));
        setSingleLine(k.getBoolean(C10135k.f40254D0, false));
        setSingleSelection(k.getBoolean(C10135k.f40259E0, false));
        int resourceId = k.getResourceId(C10135k.f40513z0, -1);
        if (resourceId != -1) {
            this.f33475r = resourceId;
        }
        k.recycle();
        super.setOnHierarchyChangeListener(this.f33474i);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C7619c(layoutParams);
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
