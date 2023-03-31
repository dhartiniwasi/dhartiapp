package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.graphics.C0744f;
import androidx.core.text.C0810c;
import androidx.core.view.C0957y;
import androidx.core.widget.C0967b;
import androidx.core.widget.C0986j;
import androidx.core.widget.C0998n;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p055h.C4411a;

/* renamed from: androidx.appcompat.widget.d0 */
/* compiled from: AppCompatTextView */
public class C0478d0 extends TextView implements C0957y, C0998n, C0967b {

    /* renamed from: a */
    private final C0481e f1582a;

    /* renamed from: b */
    private final C0466c0 f1583b;

    /* renamed from: c */
    private final C0455b0 f1584c;

    /* renamed from: d */
    private C0521n f1585d;

    /* renamed from: e */
    private boolean f1586e;

    /* renamed from: f */
    private Future<C0810c> f1587f;

    public C0478d0(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: c */
    private void m2357c() {
        Future<C0810c> future = this.f1587f;
        if (future != null) {
            try {
                this.f1587f = null;
                C0986j.m4464m(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    private C0521n getEmojiTextViewHelper() {
        if (this.f1585d == null) {
            this.f1585d = new C0521n(this);
        }
        return this.f1585d;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0481e eVar = this.f1582a;
        if (eVar != null) {
            eVar.mo2211b();
        }
        C0466c0 c0Var = this.f1583b;
        if (c0Var != null) {
            c0Var.mo2087b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C0967b.f2691j) {
            return super.getAutoSizeMaxTextSize();
        }
        C0466c0 c0Var = this.f1583b;
        if (c0Var != null) {
            return c0Var.mo2089e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C0967b.f2691j) {
            return super.getAutoSizeMinTextSize();
        }
        C0466c0 c0Var = this.f1583b;
        if (c0Var != null) {
            return c0Var.mo2090f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C0967b.f2691j) {
            return super.getAutoSizeStepGranularity();
        }
        C0466c0 c0Var = this.f1583b;
        if (c0Var != null) {
            return c0Var.mo2091g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C0967b.f2691j) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0466c0 c0Var = this.f1583b;
        return c0Var != null ? c0Var.mo2092h() : new int[0];
    }

    public int getAutoSizeTextType() {
        if (!C0967b.f2691j) {
            C0466c0 c0Var = this.f1583b;
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

    public int getFirstBaselineToTopHeight() {
        return C0986j.m4453b(this);
    }

    public int getLastBaselineToBottomHeight() {
        return C0986j.m4454c(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0481e eVar = this.f1582a;
        if (eVar != null) {
            return eVar.mo2212c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0481e eVar = this.f1582a;
        if (eVar != null) {
            return eVar.mo2213d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1583b.mo2094j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1583b.mo2095k();
    }

    public CharSequence getText() {
        m2357c();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        C0455b0 b0Var;
        if (Build.VERSION.SDK_INT >= 28 || (b0Var = this.f1584c) == null) {
            return super.getTextClassifier();
        }
        return b0Var.mo2067a();
    }

    public C0810c.C0811a getTextMetricsParamsCompat() {
        return C0986j.m4457f(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1583b.mo2102r(this, onCreateInputConnection, editorInfo);
        return C0532o.m2599a(onCreateInputConnection, editorInfo, this);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0466c0 c0Var = this.f1583b;
        if (c0Var != null) {
            c0Var.mo2099o(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        m2357c();
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0466c0 c0Var = this.f1583b;
        if (c0Var != null && !C0967b.f2691j && c0Var.mo2096l()) {
            this.f1583b.mo2088c();
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
        C0466c0 c0Var = this.f1583b;
        if (c0Var != null) {
            c0Var.mo2104t(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (C0967b.f2691j) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0466c0 c0Var = this.f1583b;
        if (c0Var != null) {
            c0Var.mo2105u(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0967b.f2691j) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0466c0 c0Var = this.f1583b;
        if (c0Var != null) {
            c0Var.mo2106v(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0481e eVar = this.f1582a;
        if (eVar != null) {
            eVar.mo2215f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0481e eVar = this.f1582a;
        if (eVar != null) {
            eVar.mo2216g(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0466c0 c0Var = this.f1583b;
        if (c0Var != null) {
            c0Var.mo2100p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0466c0 c0Var = this.f1583b;
        if (c0Var != null) {
            c0Var.mo2100p();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0466c0 c0Var = this.f1583b;
        if (c0Var != null) {
            c0Var.mo2100p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0466c0 c0Var = this.f1583b;
        if (c0Var != null) {
            c0Var.mo2100p();
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

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C0986j.m4461j(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C0986j.m4462k(this, i);
        }
    }

    public void setLineHeight(int i) {
        C0986j.m4463l(this, i);
    }

    public void setPrecomputedText(C0810c cVar) {
        C0986j.m4464m(this, cVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0481e eVar = this.f1582a;
        if (eVar != null) {
            eVar.mo2218i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0481e eVar = this.f1582a;
        if (eVar != null) {
            eVar.mo2219j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1583b.mo2107w(colorStateList);
        this.f1583b.mo2087b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1583b.mo2108x(mode);
        this.f1583b.mo2087b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0466c0 c0Var = this.f1583b;
        if (c0Var != null) {
            c0Var.mo2101q(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0455b0 b0Var;
        if (Build.VERSION.SDK_INT >= 28 || (b0Var = this.f1584c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            b0Var.mo2068b(textClassifier);
        }
    }

    public void setTextFuture(Future<C0810c> future) {
        this.f1587f = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0810c.C0811a aVar) {
        C0986j.m4466o(this, aVar);
    }

    public void setTextSize(int i, float f) {
        if (C0967b.f2691j) {
            super.setTextSize(i, f);
            return;
        }
        C0466c0 c0Var = this.f1583b;
        if (c0Var != null) {
            c0Var.mo2086A(i, f);
        }
    }

    public void setTypeface(Typeface typeface, int i) {
        if (!this.f1586e) {
            Typeface typeface2 = null;
            if (typeface != null && i > 0) {
                typeface2 = C0744f.m3423a(getContext(), typeface, i);
            }
            this.f1586e = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i);
            } finally {
                this.f1586e = false;
            }
        }
    }

    public C0478d0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public C0478d0(Context context, AttributeSet attributeSet, int i) {
        super(C0569x0.m2725b(context), attributeSet, i);
        this.f1586e = false;
        C0564v0.m2713a(this, getContext());
        C0481e eVar = new C0481e(this);
        this.f1582a = eVar;
        eVar.mo2214e(attributeSet, i);
        C0466c0 c0Var = new C0466c0(this);
        this.f1583b = c0Var;
        c0Var.mo2097m(attributeSet, i);
        c0Var.mo2087b();
        this.f1584c = new C0455b0(this);
        getEmojiTextViewHelper().mo2481b(attributeSet, i);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b = i != 0 ? C4411a.m29346b(context, i) : null;
        Drawable b2 = i2 != 0 ? C4411a.m29346b(context, i2) : null;
        Drawable b3 = i3 != 0 ? C4411a.m29346b(context, i3) : null;
        if (i4 != 0) {
            drawable = C4411a.m29346b(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b, b2, b3, drawable);
        C0466c0 c0Var = this.f1583b;
        if (c0Var != null) {
            c0Var.mo2100p();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b = i != 0 ? C4411a.m29346b(context, i) : null;
        Drawable b2 = i2 != 0 ? C4411a.m29346b(context, i2) : null;
        Drawable b3 = i3 != 0 ? C4411a.m29346b(context, i3) : null;
        if (i4 != 0) {
            drawable = C4411a.m29346b(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(b, b2, b3, drawable);
        C0466c0 c0Var = this.f1583b;
        if (c0Var != null) {
            c0Var.mo2100p();
        }
    }
}
