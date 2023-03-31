package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import androidx.core.view.C0957y;
import androidx.core.widget.C0998n;
import p048g.C4288a;
import p055h.C4411a;

/* renamed from: androidx.appcompat.widget.s */
/* compiled from: AppCompatMultiAutoCompleteTextView */
public class C0551s extends MultiAutoCompleteTextView implements C0957y, C0998n {

    /* renamed from: d */
    private static final int[] f1795d = {16843126};

    /* renamed from: a */
    private final C0481e f1796a;

    /* renamed from: b */
    private final C0466c0 f1797b;

    /* renamed from: c */
    private final C0518m f1798c;

    public C0551s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4288a.f23776p);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2569a(C0518m mVar) {
        KeyListener keyListener = getKeyListener();
        if (mVar.mo2436b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a = mVar.mo2435a(keyListener);
            if (a != keyListener) {
                super.setKeyListener(a);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0481e eVar = this.f1796a;
        if (eVar != null) {
            eVar.mo2211b();
        }
        C0466c0 c0Var = this.f1797b;
        if (c0Var != null) {
            c0Var.mo2087b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0481e eVar = this.f1796a;
        if (eVar != null) {
            return eVar.mo2212c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0481e eVar = this.f1796a;
        if (eVar != null) {
            return eVar.mo2213d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1797b.mo2094j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1797b.mo2095k();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f1798c.mo2438d(C0532o.m2599a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0481e eVar = this.f1796a;
        if (eVar != null) {
            eVar.mo2215f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0481e eVar = this.f1796a;
        if (eVar != null) {
            eVar.mo2216g(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0466c0 c0Var = this.f1797b;
        if (c0Var != null) {
            c0Var.mo2100p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0466c0 c0Var = this.f1797b;
        if (c0Var != null) {
            c0Var.mo2100p();
        }
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C4411a.m29346b(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f1798c.mo2439e(z);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1798c.mo2435a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0481e eVar = this.f1796a;
        if (eVar != null) {
            eVar.mo2218i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0481e eVar = this.f1796a;
        if (eVar != null) {
            eVar.mo2219j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1797b.mo2107w(colorStateList);
        this.f1797b.mo2087b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1797b.mo2108x(mode);
        this.f1797b.mo2087b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0466c0 c0Var = this.f1797b;
        if (c0Var != null) {
            c0Var.mo2101q(context, i);
        }
    }

    public C0551s(Context context, AttributeSet attributeSet, int i) {
        super(C0569x0.m2725b(context), attributeSet, i);
        C0564v0.m2713a(this, getContext());
        C0452a1 v = C0452a1.m2210v(getContext(), attributeSet, f1795d, i, 0);
        if (v.mo2060s(0)) {
            setDropDownBackgroundDrawable(v.mo2048g(0));
        }
        v.mo2061w();
        C0481e eVar = new C0481e(this);
        this.f1796a = eVar;
        eVar.mo2214e(attributeSet, i);
        C0466c0 c0Var = new C0466c0(this);
        this.f1797b = c0Var;
        c0Var.mo2097m(attributeSet, i);
        c0Var.mo2087b();
        C0518m mVar = new C0518m(this);
        this.f1798c = mVar;
        mVar.mo2437c(attributeSet, i);
        mo2569a(mVar);
    }
}
