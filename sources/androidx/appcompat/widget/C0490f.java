package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.view.C0957y;
import androidx.core.widget.C0967b;
import androidx.core.widget.C0986j;
import androidx.core.widget.C0998n;
import p048g.C4288a;

/* renamed from: androidx.appcompat.widget.f */
/* compiled from: AppCompatButton */
public class C0490f extends Button implements C0957y, C0967b, C0998n {

    /* renamed from: a */
    private final C0481e f1609a;

    /* renamed from: b */
    private final C0466c0 f1610b;

    /* renamed from: c */
    private C0521n f1611c;

    public C0490f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4288a.f23777q);
    }

    private C0521n getEmojiTextViewHelper() {
        if (this.f1611c == null) {
            this.f1611c = new C0521n(this);
        }
        return this.f1611c;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0481e eVar = this.f1609a;
        if (eVar != null) {
            eVar.mo2211b();
        }
        C0466c0 c0Var = this.f1610b;
        if (c0Var != null) {
            c0Var.mo2087b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C0967b.f2691j) {
            return super.getAutoSizeMaxTextSize();
        }
        C0466c0 c0Var = this.f1610b;
        if (c0Var != null) {
            return c0Var.mo2089e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C0967b.f2691j) {
            return super.getAutoSizeMinTextSize();
        }
        C0466c0 c0Var = this.f1610b;
        if (c0Var != null) {
            return c0Var.mo2090f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C0967b.f2691j) {
            return super.getAutoSizeStepGranularity();
        }
        C0466c0 c0Var = this.f1610b;
        if (c0Var != null) {
            return c0Var.mo2091g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C0967b.f2691j) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0466c0 c0Var = this.f1610b;
        return c0Var != null ? c0Var.mo2092h() : new int[0];
    }

    public int getAutoSizeTextType() {
        if (!C0967b.f2691j) {
            C0466c0 c0Var = this.f1610b;
            if (c0Var != null) {
                return c0Var.mo2093i();
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0986j.m4467p(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0481e eVar = this.f1609a;
        if (eVar != null) {
            return eVar.mo2212c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0481e eVar = this.f1609a;
        if (eVar != null) {
            return eVar.mo2213d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1610b.mo2094j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1610b.mo2095k();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0466c0 c0Var = this.f1610b;
        if (c0Var != null) {
            c0Var.mo2099o(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0466c0 c0Var = this.f1610b;
        if (c0Var != null && !C0967b.f2691j && c0Var.mo2096l()) {
            this.f1610b.mo2088c();
        }
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo2482c(z);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (C0967b.f2691j) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0466c0 c0Var = this.f1610b;
        if (c0Var != null) {
            c0Var.mo2104t(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (C0967b.f2691j) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0466c0 c0Var = this.f1610b;
        if (c0Var != null) {
            c0Var.mo2105u(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0967b.f2691j) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0466c0 c0Var = this.f1610b;
        if (c0Var != null) {
            c0Var.mo2106v(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0481e eVar = this.f1609a;
        if (eVar != null) {
            eVar.mo2215f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0481e eVar = this.f1609a;
        if (eVar != null) {
            eVar.mo2216g(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0986j.m4468q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo2483d(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().mo2480a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C0466c0 c0Var = this.f1610b;
        if (c0Var != null) {
            c0Var.mo2103s(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0481e eVar = this.f1609a;
        if (eVar != null) {
            eVar.mo2218i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0481e eVar = this.f1609a;
        if (eVar != null) {
            eVar.mo2219j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1610b.mo2107w(colorStateList);
        this.f1610b.mo2087b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1610b.mo2108x(mode);
        this.f1610b.mo2087b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0466c0 c0Var = this.f1610b;
        if (c0Var != null) {
            c0Var.mo2101q(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (C0967b.f2691j) {
            super.setTextSize(i, f);
            return;
        }
        C0466c0 c0Var = this.f1610b;
        if (c0Var != null) {
            c0Var.mo2086A(i, f);
        }
    }

    public C0490f(Context context, AttributeSet attributeSet, int i) {
        super(C0569x0.m2725b(context), attributeSet, i);
        C0564v0.m2713a(this, getContext());
        C0481e eVar = new C0481e(this);
        this.f1609a = eVar;
        eVar.mo2214e(attributeSet, i);
        C0466c0 c0Var = new C0466c0(this);
        this.f1610b = c0Var;
        c0Var.mo2097m(attributeSet, i);
        c0Var.mo2087b();
        getEmojiTextViewHelper().mo2481b(attributeSet, i);
    }
}
