package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.view.C0957y;
import androidx.core.widget.C0986j;
import androidx.core.widget.C0996l;
import androidx.core.widget.C0998n;
import p048g.C4288a;
import p055h.C4411a;

/* renamed from: androidx.appcompat.widget.h */
/* compiled from: AppCompatCheckedTextView */
public class C0496h extends CheckedTextView implements C0996l, C0957y, C0998n {

    /* renamed from: a */
    private final C0499i f1632a;

    /* renamed from: b */
    private final C0481e f1633b;

    /* renamed from: c */
    private final C0466c0 f1634c;

    /* renamed from: d */
    private C0521n f1635d;

    public C0496h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4288a.f23779s);
    }

    private C0521n getEmojiTextViewHelper() {
        if (this.f1635d == null) {
            this.f1635d = new C0521n(this);
        }
        return this.f1635d;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0466c0 c0Var = this.f1634c;
        if (c0Var != null) {
            c0Var.mo2087b();
        }
        C0481e eVar = this.f1633b;
        if (eVar != null) {
            eVar.mo2211b();
        }
        C0499i iVar = this.f1632a;
        if (iVar != null) {
            iVar.mo2318a();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0986j.m4467p(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0481e eVar = this.f1633b;
        if (eVar != null) {
            return eVar.mo2212c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0481e eVar = this.f1633b;
        if (eVar != null) {
            return eVar.mo2213d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0499i iVar = this.f1632a;
        if (iVar != null) {
            return iVar.mo2319b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0499i iVar = this.f1632a;
        if (iVar != null) {
            return iVar.mo2320c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1634c.mo2094j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1634c.mo2095k();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0532o.m2599a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo2482c(z);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0481e eVar = this.f1633b;
        if (eVar != null) {
            eVar.mo2215f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0481e eVar = this.f1633b;
        if (eVar != null) {
            eVar.mo2216g(i);
        }
    }

    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0499i iVar = this.f1632a;
        if (iVar != null) {
            iVar.mo2322e();
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0466c0 c0Var = this.f1634c;
        if (c0Var != null) {
            c0Var.mo2100p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0466c0 c0Var = this.f1634c;
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

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0481e eVar = this.f1633b;
        if (eVar != null) {
            eVar.mo2218i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0481e eVar = this.f1633b;
        if (eVar != null) {
            eVar.mo2219j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0499i iVar = this.f1632a;
        if (iVar != null) {
            iVar.mo2323f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0499i iVar = this.f1632a;
        if (iVar != null) {
            iVar.mo2324g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1634c.mo2107w(colorStateList);
        this.f1634c.mo2087b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1634c.mo2108x(mode);
        this.f1634c.mo2087b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0466c0 c0Var = this.f1634c;
        if (c0Var != null) {
            c0Var.mo2101q(context, i);
        }
    }

    public C0496h(Context context, AttributeSet attributeSet, int i) {
        super(C0569x0.m2725b(context), attributeSet, i);
        C0564v0.m2713a(this, getContext());
        C0466c0 c0Var = new C0466c0(this);
        this.f1634c = c0Var;
        c0Var.mo2097m(attributeSet, i);
        c0Var.mo2087b();
        C0481e eVar = new C0481e(this);
        this.f1633b = eVar;
        eVar.mo2214e(attributeSet, i);
        C0499i iVar = new C0499i(this);
        this.f1632a = iVar;
        iVar.mo2321d(attributeSet, i);
        getEmojiTextViewHelper().mo2481b(attributeSet, i);
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C4411a.m29346b(getContext(), i));
    }
}
