package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.C0957y;
import androidx.core.widget.C0999o;

/* renamed from: androidx.appcompat.widget.r */
/* compiled from: AppCompatImageView */
public class C0549r extends ImageView implements C0957y, C0999o {

    /* renamed from: a */
    private final C0481e f1791a;

    /* renamed from: b */
    private final C0540q f1792b;

    /* renamed from: c */
    private boolean f1793c;

    public C0549r(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0481e eVar = this.f1791a;
        if (eVar != null) {
            eVar.mo2211b();
        }
        C0540q qVar = this.f1792b;
        if (qVar != null) {
            qVar.mo2539c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0481e eVar = this.f1791a;
        if (eVar != null) {
            return eVar.mo2212c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0481e eVar = this.f1791a;
        if (eVar != null) {
            return eVar.mo2213d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0540q qVar = this.f1792b;
        if (qVar != null) {
            return qVar.mo2540d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0540q qVar = this.f1792b;
        if (qVar != null) {
            return qVar.mo2541e();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f1792b.mo2542f() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0481e eVar = this.f1791a;
        if (eVar != null) {
            eVar.mo2215f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0481e eVar = this.f1791a;
        if (eVar != null) {
            eVar.mo2216g(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0540q qVar = this.f1792b;
        if (qVar != null) {
            qVar.mo2539c();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        C0540q qVar = this.f1792b;
        if (!(qVar == null || drawable == null || this.f1793c)) {
            qVar.mo2544h(drawable);
        }
        super.setImageDrawable(drawable);
        C0540q qVar2 = this.f1792b;
        if (qVar2 != null) {
            qVar2.mo2539c();
            if (!this.f1793c) {
                this.f1792b.mo2538b();
            }
        }
    }

    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f1793c = true;
    }

    public void setImageResource(int i) {
        C0540q qVar = this.f1792b;
        if (qVar != null) {
            qVar.mo2545i(i);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0540q qVar = this.f1792b;
        if (qVar != null) {
            qVar.mo2539c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0481e eVar = this.f1791a;
        if (eVar != null) {
            eVar.mo2218i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0481e eVar = this.f1791a;
        if (eVar != null) {
            eVar.mo2219j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0540q qVar = this.f1792b;
        if (qVar != null) {
            qVar.mo2546j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0540q qVar = this.f1792b;
        if (qVar != null) {
            qVar.mo2547k(mode);
        }
    }

    public C0549r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0549r(Context context, AttributeSet attributeSet, int i) {
        super(C0569x0.m2725b(context), attributeSet, i);
        this.f1793c = false;
        C0564v0.m2713a(this, getContext());
        C0481e eVar = new C0481e(this);
        this.f1791a = eVar;
        eVar.mo2214e(attributeSet, i);
        C0540q qVar = new C0540q(this);
        this.f1792b = qVar;
        qVar.mo2543g(attributeSet, i);
    }
}
