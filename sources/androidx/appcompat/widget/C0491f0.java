package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import androidx.core.view.C0957y;
import androidx.core.widget.C0998n;

/* renamed from: androidx.appcompat.widget.f0 */
/* compiled from: AppCompatToggleButton */
public class C0491f0 extends ToggleButton implements C0957y, C0998n {

    /* renamed from: a */
    private final C0481e f1612a;

    /* renamed from: b */
    private final C0466c0 f1613b;

    /* renamed from: c */
    private C0521n f1614c;

    public C0491f0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842827);
    }

    private C0521n getEmojiTextViewHelper() {
        if (this.f1614c == null) {
            this.f1614c = new C0521n(this);
        }
        return this.f1614c;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0481e eVar = this.f1612a;
        if (eVar != null) {
            eVar.mo2211b();
        }
        C0466c0 c0Var = this.f1613b;
        if (c0Var != null) {
            c0Var.mo2087b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0481e eVar = this.f1612a;
        if (eVar != null) {
            return eVar.mo2212c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0481e eVar = this.f1612a;
        if (eVar != null) {
            return eVar.mo2213d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1613b.mo2094j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1613b.mo2095k();
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo2482c(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0481e eVar = this.f1612a;
        if (eVar != null) {
            eVar.mo2215f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0481e eVar = this.f1612a;
        if (eVar != null) {
            eVar.mo2216g(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0466c0 c0Var = this.f1613b;
        if (c0Var != null) {
            c0Var.mo2100p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0466c0 c0Var = this.f1613b;
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
        C0481e eVar = this.f1612a;
        if (eVar != null) {
            eVar.mo2218i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0481e eVar = this.f1612a;
        if (eVar != null) {
            eVar.mo2219j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1613b.mo2107w(colorStateList);
        this.f1613b.mo2087b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1613b.mo2108x(mode);
        this.f1613b.mo2087b();
    }

    public C0491f0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0564v0.m2713a(this, getContext());
        C0481e eVar = new C0481e(this);
        this.f1612a = eVar;
        eVar.mo2214e(attributeSet, i);
        C0466c0 c0Var = new C0466c0(this);
        this.f1613b = c0Var;
        c0Var.mo2097m(attributeSet, i);
        getEmojiTextViewHelper().mo2481b(attributeSet, i);
    }
}
