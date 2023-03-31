package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.C0835a0;
import p048g.C4297j;

/* renamed from: androidx.appcompat.widget.e */
/* compiled from: AppCompatBackgroundHelper */
class C0481e {

    /* renamed from: a */
    private final View f1588a;

    /* renamed from: b */
    private final C0509k f1589b;

    /* renamed from: c */
    private int f1590c = -1;

    /* renamed from: d */
    private C0571y0 f1591d;

    /* renamed from: e */
    private C0571y0 f1592e;

    /* renamed from: f */
    private C0571y0 f1593f;

    C0481e(View view) {
        this.f1588a = view;
        this.f1589b = C0509k.m2499b();
    }

    /* renamed from: a */
    private boolean m2360a(Drawable drawable) {
        if (this.f1593f == null) {
            this.f1593f = new C0571y0();
        }
        C0571y0 y0Var = this.f1593f;
        y0Var.mo2657a();
        ColorStateList r = C0835a0.m3748r(this.f1588a);
        if (r != null) {
            y0Var.f1874d = true;
            y0Var.f1871a = r;
        }
        PorterDuff.Mode s = C0835a0.m3750s(this.f1588a);
        if (s != null) {
            y0Var.f1873c = true;
            y0Var.f1872b = s;
        }
        if (!y0Var.f1874d && !y0Var.f1873c) {
            return false;
        }
        C0509k.m2502i(drawable, y0Var, this.f1588a.getDrawableState());
        return true;
    }

    /* renamed from: k */
    private boolean m2361k() {
        int i = Build.VERSION.SDK_INT;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f1591d != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2211b() {
        Drawable background = this.f1588a.getBackground();
        if (background == null) {
            return;
        }
        if (!m2361k() || !m2360a(background)) {
            C0571y0 y0Var = this.f1592e;
            if (y0Var != null) {
                C0509k.m2502i(background, y0Var, this.f1588a.getDrawableState());
                return;
            }
            C0571y0 y0Var2 = this.f1591d;
            if (y0Var2 != null) {
                C0509k.m2502i(background, y0Var2, this.f1588a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList mo2212c() {
        C0571y0 y0Var = this.f1592e;
        if (y0Var != null) {
            return y0Var.f1871a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode mo2213d() {
        C0571y0 y0Var = this.f1592e;
        if (y0Var != null) {
            return y0Var.f1872b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2214e(AttributeSet attributeSet, int i) {
        Context context = this.f1588a.getContext();
        int[] iArr = C4297j.f24169y3;
        C0452a1 v = C0452a1.m2210v(context, attributeSet, iArr, i, 0);
        View view = this.f1588a;
        C0835a0.m3737l0(view, view.getContext(), iArr, attributeSet, v.mo2059r(), i, 0);
        try {
            int i2 = C4297j.f24174z3;
            if (v.mo2060s(i2)) {
                this.f1590c = v.mo2055n(i2, -1);
                ColorStateList f = this.f1589b.mo2401f(this.f1588a.getContext(), this.f1590c);
                if (f != null) {
                    mo2217h(f);
                }
            }
            int i3 = C4297j.f23939A3;
            if (v.mo2060s(i3)) {
                C0835a0.m3751s0(this.f1588a, v.mo2044c(i3));
            }
            int i4 = C4297j.f23944B3;
            if (v.mo2060s(i4)) {
                C0835a0.m3753t0(this.f1588a, C0500i0.m2467d(v.mo2052k(i4, -1), (PorterDuff.Mode) null));
            }
        } finally {
            v.mo2061w();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2215f(Drawable drawable) {
        this.f1590c = -1;
        mo2217h((ColorStateList) null);
        mo2211b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2216g(int i) {
        this.f1590c = i;
        C0509k kVar = this.f1589b;
        mo2217h(kVar != null ? kVar.mo2401f(this.f1588a.getContext(), i) : null);
        mo2211b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2217h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1591d == null) {
                this.f1591d = new C0571y0();
            }
            C0571y0 y0Var = this.f1591d;
            y0Var.f1871a = colorStateList;
            y0Var.f1874d = true;
        } else {
            this.f1591d = null;
        }
        mo2211b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo2218i(ColorStateList colorStateList) {
        if (this.f1592e == null) {
            this.f1592e = new C0571y0();
        }
        C0571y0 y0Var = this.f1592e;
        y0Var.f1871a = colorStateList;
        y0Var.f1874d = true;
        mo2211b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo2219j(PorterDuff.Mode mode) {
        if (this.f1592e == null) {
            this.f1592e = new C0571y0();
        }
        C0571y0 y0Var = this.f1592e;
        y0Var.f1872b = mode;
        y0Var.f1873c = true;
        mo2211b();
    }
}
