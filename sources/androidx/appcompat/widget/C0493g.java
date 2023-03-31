package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.core.view.C0957y;
import androidx.core.widget.C0997m;
import androidx.core.widget.C0998n;
import p048g.C4288a;
import p055h.C4411a;

/* renamed from: androidx.appcompat.widget.g */
/* compiled from: AppCompatCheckBox */
public class C0493g extends CheckBox implements C0997m, C0957y, C0998n {

    /* renamed from: a */
    private final C0502j f1616a;

    /* renamed from: b */
    private final C0481e f1617b;

    /* renamed from: c */
    private final C0466c0 f1618c;

    /* renamed from: d */
    private C0521n f1619d;

    public C0493g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4288a.f23778r);
    }

    private C0521n getEmojiTextViewHelper() {
        if (this.f1619d == null) {
            this.f1619d = new C0521n(this);
        }
        return this.f1619d;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0481e eVar = this.f1617b;
        if (eVar != null) {
            eVar.mo2211b();
        }
        C0466c0 c0Var = this.f1618c;
        if (c0Var != null) {
            c0Var.mo2087b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0502j jVar = this.f1616a;
        return jVar != null ? jVar.mo2370b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0481e eVar = this.f1617b;
        if (eVar != null) {
            return eVar.mo2212c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0481e eVar = this.f1617b;
        if (eVar != null) {
            return eVar.mo2213d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0502j jVar = this.f1616a;
        if (jVar != null) {
            return jVar.mo2371c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0502j jVar = this.f1616a;
        if (jVar != null) {
            return jVar.mo2372d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1618c.mo2094j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1618c.mo2095k();
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo2482c(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0481e eVar = this.f1617b;
        if (eVar != null) {
            eVar.mo2215f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0481e eVar = this.f1617b;
        if (eVar != null) {
            eVar.mo2216g(i);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0502j jVar = this.f1616a;
        if (jVar != null) {
            jVar.mo2374f();
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0466c0 c0Var = this.f1618c;
        if (c0Var != null) {
            c0Var.mo2100p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0466c0 c0Var = this.f1618c;
        if (c0Var != null) {
            c0Var.mo2100p();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo2483d(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().mo2480a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0481e eVar = this.f1617b;
        if (eVar != null) {
            eVar.mo2218i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0481e eVar = this.f1617b;
        if (eVar != null) {
            eVar.mo2219j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0502j jVar = this.f1616a;
        if (jVar != null) {
            jVar.mo2375g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0502j jVar = this.f1616a;
        if (jVar != null) {
            jVar.mo2376h(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1618c.mo2107w(colorStateList);
        this.f1618c.mo2087b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1618c.mo2108x(mode);
        this.f1618c.mo2087b();
    }

    public C0493g(Context context, AttributeSet attributeSet, int i) {
        super(C0569x0.m2725b(context), attributeSet, i);
        C0564v0.m2713a(this, getContext());
        C0502j jVar = new C0502j(this);
        this.f1616a = jVar;
        jVar.mo2373e(attributeSet, i);
        C0481e eVar = new C0481e(this);
        this.f1617b = eVar;
        eVar.mo2214e(attributeSet, i);
        C0466c0 c0Var = new C0466c0(this);
        this.f1618c = c0Var;
        c0Var.mo2097m(attributeSet, i);
        getEmojiTextViewHelper().mo2481b(attributeSet, i);
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C4411a.m29346b(getContext(), i));
    }
}
