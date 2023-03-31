package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.C0835a0;
import androidx.core.widget.C0978f;
import p048g.C4297j;
import p055h.C4411a;

/* renamed from: androidx.appcompat.widget.q */
/* compiled from: AppCompatImageHelper */
public class C0540q {

    /* renamed from: a */
    private final ImageView f1776a;

    /* renamed from: b */
    private C0571y0 f1777b;

    /* renamed from: c */
    private C0571y0 f1778c;

    /* renamed from: d */
    private C0571y0 f1779d;

    /* renamed from: e */
    private int f1780e = 0;

    public C0540q(ImageView imageView) {
        this.f1776a = imageView;
    }

    /* renamed from: a */
    private boolean m2615a(Drawable drawable) {
        if (this.f1779d == null) {
            this.f1779d = new C0571y0();
        }
        C0571y0 y0Var = this.f1779d;
        y0Var.mo2657a();
        ColorStateList a = C0978f.m4429a(this.f1776a);
        if (a != null) {
            y0Var.f1874d = true;
            y0Var.f1871a = a;
        }
        PorterDuff.Mode b = C0978f.m4430b(this.f1776a);
        if (b != null) {
            y0Var.f1873c = true;
            y0Var.f1872b = b;
        }
        if (!y0Var.f1874d && !y0Var.f1873c) {
            return false;
        }
        C0509k.m2502i(drawable, y0Var, this.f1776a.getDrawableState());
        return true;
    }

    /* renamed from: l */
    private boolean m2616l() {
        int i = Build.VERSION.SDK_INT;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f1777b != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2538b() {
        if (this.f1776a.getDrawable() != null) {
            this.f1776a.getDrawable().setLevel(this.f1780e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2539c() {
        Drawable drawable = this.f1776a.getDrawable();
        if (drawable != null) {
            C0500i0.m2465b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!m2616l() || !m2615a(drawable)) {
            C0571y0 y0Var = this.f1778c;
            if (y0Var != null) {
                C0509k.m2502i(drawable, y0Var, this.f1776a.getDrawableState());
                return;
            }
            C0571y0 y0Var2 = this.f1777b;
            if (y0Var2 != null) {
                C0509k.m2502i(drawable, y0Var2, this.f1776a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ColorStateList mo2540d() {
        C0571y0 y0Var = this.f1778c;
        if (y0Var != null) {
            return y0Var.f1871a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public PorterDuff.Mode mo2541e() {
        C0571y0 y0Var = this.f1778c;
        if (y0Var != null) {
            return y0Var.f1872b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo2542f() {
        return Build.VERSION.SDK_INT < 21 || !(this.f1776a.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: g */
    public void mo2543g(AttributeSet attributeSet, int i) {
        int n;
        Context context = this.f1776a.getContext();
        int[] iArr = C4297j.f24001P;
        C0452a1 v = C0452a1.m2210v(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.f1776a;
        C0835a0.m3737l0(imageView, imageView.getContext(), iArr, attributeSet, v.mo2059r(), i, 0);
        try {
            Drawable drawable = this.f1776a.getDrawable();
            if (!(drawable != null || (n = v.mo2055n(C4297j.f24005Q, -1)) == -1 || (drawable = C4411a.m29346b(this.f1776a.getContext(), n)) == null)) {
                this.f1776a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0500i0.m2465b(drawable);
            }
            int i2 = C4297j.f24009R;
            if (v.mo2060s(i2)) {
                C0978f.m4431c(this.f1776a, v.mo2044c(i2));
            }
            int i3 = C4297j.f24013S;
            if (v.mo2060s(i3)) {
                C0978f.m4432d(this.f1776a, C0500i0.m2467d(v.mo2052k(i3, -1), (PorterDuff.Mode) null));
            }
        } finally {
            v.mo2061w();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2544h(Drawable drawable) {
        this.f1780e = drawable.getLevel();
    }

    /* renamed from: i */
    public void mo2545i(int i) {
        if (i != 0) {
            Drawable b = C4411a.m29346b(this.f1776a.getContext(), i);
            if (b != null) {
                C0500i0.m2465b(b);
            }
            this.f1776a.setImageDrawable(b);
        } else {
            this.f1776a.setImageDrawable((Drawable) null);
        }
        mo2539c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo2546j(ColorStateList colorStateList) {
        if (this.f1778c == null) {
            this.f1778c = new C0571y0();
        }
        C0571y0 y0Var = this.f1778c;
        y0Var.f1871a = colorStateList;
        y0Var.f1874d = true;
        mo2539c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo2547k(PorterDuff.Mode mode) {
        if (this.f1778c == null) {
            this.f1778c = new C0571y0();
        }
        C0571y0 y0Var = this.f1778c;
        y0Var.f1872b = mode;
        y0Var.f1873c = true;
        mo2539c();
    }
}
