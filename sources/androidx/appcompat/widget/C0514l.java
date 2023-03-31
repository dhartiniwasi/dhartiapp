package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.view.C0835a0;
import androidx.core.view.C0886c;
import androidx.core.view.C0955w;
import androidx.core.view.C0957y;
import androidx.core.widget.C0986j;
import androidx.core.widget.C0993k;
import androidx.core.widget.C0998n;
import p048g.C4288a;
import p157w.C5861a;
import p157w.C5863c;

/* renamed from: androidx.appcompat.widget.l */
/* compiled from: AppCompatEditText */
public class C0514l extends EditText implements C0957y, C0955w, C0998n {

    /* renamed from: a */
    private final C0481e f1690a;

    /* renamed from: b */
    private final C0466c0 f1691b;

    /* renamed from: c */
    private final C0455b0 f1692c;

    /* renamed from: d */
    private final C0993k f1693d;

    /* renamed from: e */
    private final C0518m f1694e;

    public C0514l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4288a.f23749B);
    }

    /* renamed from: a */
    public C0886c mo2409a(C0886c cVar) {
        return this.f1693d.mo3496a(this, cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2410b(C0518m mVar) {
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
        C0481e eVar = this.f1690a;
        if (eVar != null) {
            eVar.mo2211b();
        }
        C0466c0 c0Var = this.f1691b;
        if (c0Var != null) {
            c0Var.mo2087b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0986j.m4467p(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0481e eVar = this.f1690a;
        if (eVar != null) {
            return eVar.mo2212c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0481e eVar = this.f1690a;
        if (eVar != null) {
            return eVar.mo2213d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1691b.mo2094j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1691b.mo2095k();
    }

    public TextClassifier getTextClassifier() {
        C0455b0 b0Var;
        if (Build.VERSION.SDK_INT >= 28 || (b0Var = this.f1692c) == null) {
            return super.getTextClassifier();
        }
        return b0Var.mo2067a();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] E;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1691b.mo2102r(this, onCreateInputConnection, editorInfo);
        InputConnection a = C0532o.m2599a(onCreateInputConnection, editorInfo, this);
        if (!(a == null || Build.VERSION.SDK_INT > 30 || (E = C0835a0.m3688E(this)) == null)) {
            C5861a.m34738d(editorInfo, E);
            a = C5863c.m34746c(this, a, editorInfo);
        }
        return this.f1694e.mo2438d(a, editorInfo);
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        if (C0567x.m2719a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public boolean onTextContextMenuItem(int i) {
        if (C0567x.m2720b(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0481e eVar = this.f1690a;
        if (eVar != null) {
            eVar.mo2215f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0481e eVar = this.f1690a;
        if (eVar != null) {
            eVar.mo2216g(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0466c0 c0Var = this.f1691b;
        if (c0Var != null) {
            c0Var.mo2100p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0466c0 c0Var = this.f1691b;
        if (c0Var != null) {
            c0Var.mo2100p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0986j.m4468q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f1694e.mo2439e(z);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1694e.mo2435a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0481e eVar = this.f1690a;
        if (eVar != null) {
            eVar.mo2218i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0481e eVar = this.f1690a;
        if (eVar != null) {
            eVar.mo2219j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1691b.mo2107w(colorStateList);
        this.f1691b.mo2087b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1691b.mo2108x(mode);
        this.f1691b.mo2087b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0466c0 c0Var = this.f1691b;
        if (c0Var != null) {
            c0Var.mo2101q(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0455b0 b0Var;
        if (Build.VERSION.SDK_INT >= 28 || (b0Var = this.f1692c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            b0Var.mo2068b(textClassifier);
        }
    }

    public C0514l(Context context, AttributeSet attributeSet, int i) {
        super(C0569x0.m2725b(context), attributeSet, i);
        C0564v0.m2713a(this, getContext());
        C0481e eVar = new C0481e(this);
        this.f1690a = eVar;
        eVar.mo2214e(attributeSet, i);
        C0466c0 c0Var = new C0466c0(this);
        this.f1691b = c0Var;
        c0Var.mo2097m(attributeSet, i);
        c0Var.mo2087b();
        this.f1692c = new C0455b0(this);
        this.f1693d = new C0993k();
        C0518m mVar = new C0518m(this);
        this.f1694e = mVar;
        mVar.mo2437c(attributeSet, i);
        mo2410b(mVar);
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}
