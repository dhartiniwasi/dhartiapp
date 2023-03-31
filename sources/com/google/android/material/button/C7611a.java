package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.C0732a;
import androidx.core.view.C0835a0;
import com.google.android.material.internal.C7710h;
import p227f6.C10126b;
import p227f6.C10135k;
import p283l6.C11758a;
import p346s6.C12456c;
import p355t6.C12535a;
import p355t6.C12538b;
import p375v6.C12822g;
import p375v6.C12829k;
import p375v6.C12844n;

/* renamed from: com.google.android.material.button.a */
/* compiled from: MaterialButtonHelper */
class C7611a {

    /* renamed from: s */
    private static final boolean f33420s = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: a */
    private final MaterialButton f33421a;

    /* renamed from: b */
    private C12829k f33422b;

    /* renamed from: c */
    private int f33423c;

    /* renamed from: d */
    private int f33424d;

    /* renamed from: e */
    private int f33425e;

    /* renamed from: f */
    private int f33426f;

    /* renamed from: g */
    private int f33427g;

    /* renamed from: h */
    private int f33428h;

    /* renamed from: i */
    private PorterDuff.Mode f33429i;

    /* renamed from: j */
    private ColorStateList f33430j;

    /* renamed from: k */
    private ColorStateList f33431k;

    /* renamed from: l */
    private ColorStateList f33432l;

    /* renamed from: m */
    private Drawable f33433m;

    /* renamed from: n */
    private boolean f33434n = false;

    /* renamed from: o */
    private boolean f33435o = false;

    /* renamed from: p */
    private boolean f33436p = false;

    /* renamed from: q */
    private boolean f33437q;

    /* renamed from: r */
    private LayerDrawable f33438r;

    C7611a(MaterialButton materialButton, C12829k kVar) {
        this.f33421a = materialButton;
        this.f33422b = kVar;
    }

    /* renamed from: A */
    private void m42324A(C12829k kVar) {
        if (mo25018d() != null) {
            mo25018d().setShapeAppearanceModel(kVar);
        }
        if (m42329l() != null) {
            m42329l().setShapeAppearanceModel(kVar);
        }
        if (mo25017c() != null) {
            mo25017c().setShapeAppearanceModel(kVar);
        }
    }

    /* renamed from: C */
    private void m42325C() {
        C12822g d = mo25018d();
        C12822g l = m42329l();
        if (d != null) {
            d.mo37751Z((float) this.f33428h, this.f33431k);
            if (l != null) {
                l.mo37750Y((float) this.f33428h, this.f33434n ? C11758a.m57062c(this.f33421a, C10126b.colorSurface) : 0);
            }
        }
    }

    /* renamed from: D */
    private InsetDrawable m42326D(Drawable drawable) {
        return new InsetDrawable(drawable, this.f33423c, this.f33425e, this.f33424d, this.f33426f);
    }

    /* renamed from: a */
    private Drawable m42327a() {
        C12822g gVar = new C12822g(this.f33422b);
        gVar.mo37741L(this.f33421a.getContext());
        C0732a.m3377o(gVar, this.f33430j);
        PorterDuff.Mode mode = this.f33429i;
        if (mode != null) {
            C0732a.m3378p(gVar, mode);
        }
        gVar.mo37751Z((float) this.f33428h, this.f33431k);
        C12822g gVar2 = new C12822g(this.f33422b);
        gVar2.setTint(0);
        gVar2.mo37750Y((float) this.f33428h, this.f33434n ? C11758a.m57062c(this.f33421a, C10126b.colorSurface) : 0);
        if (f33420s) {
            C12822g gVar3 = new C12822g(this.f33422b);
            this.f33433m = gVar3;
            C0732a.m3376n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(C12538b.m59728a(this.f33432l), m42326D(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f33433m);
            this.f33438r = rippleDrawable;
            return rippleDrawable;
        }
        C12535a aVar = new C12535a(this.f33422b);
        this.f33433m = aVar;
        C0732a.m3377o(aVar, C12538b.m59728a(this.f33432l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f33433m});
        this.f33438r = layerDrawable;
        return m42326D(layerDrawable);
    }

    /* renamed from: e */
    private C12822g m42328e(boolean z) {
        LayerDrawable layerDrawable = this.f33438r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (f33420s) {
            return (C12822g) ((LayerDrawable) ((InsetDrawable) this.f33438r.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
        }
        return (C12822g) this.f33438r.getDrawable(z ^ true ? 1 : 0);
    }

    /* renamed from: l */
    private C12822g m42329l() {
        return m42328e(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo25015B(int i, int i2) {
        Drawable drawable = this.f33433m;
        if (drawable != null) {
            drawable.setBounds(this.f33423c, this.f33425e, i2 - this.f33424d, i - this.f33426f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo25016b() {
        return this.f33427g;
    }

    /* renamed from: c */
    public C12844n mo25017c() {
        LayerDrawable layerDrawable = this.f33438r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f33438r.getNumberOfLayers() > 2) {
            return (C12844n) this.f33438r.getDrawable(2);
        }
        return (C12844n) this.f33438r.getDrawable(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C12822g mo25018d() {
        return m42328e(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ColorStateList mo25019f() {
        return this.f33432l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C12829k mo25020g() {
        return this.f33422b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public ColorStateList mo25021h() {
        return this.f33431k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo25022i() {
        return this.f33428h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList mo25023j() {
        return this.f33430j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public PorterDuff.Mode mo25024k() {
        return this.f33429i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo25025m() {
        return this.f33435o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo25026n() {
        return this.f33437q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo25027o(TypedArray typedArray) {
        this.f33423c = typedArray.getDimensionPixelOffset(C10135k.f40430k1, 0);
        this.f33424d = typedArray.getDimensionPixelOffset(C10135k.f40436l1, 0);
        this.f33425e = typedArray.getDimensionPixelOffset(C10135k.f40442m1, 0);
        this.f33426f = typedArray.getDimensionPixelOffset(C10135k.f40448n1, 0);
        int i = C10135k.f40472r1;
        if (typedArray.hasValue(i)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i, -1);
            this.f33427g = dimensionPixelSize;
            mo25033u(this.f33422b.mo37791w((float) dimensionPixelSize));
            this.f33436p = true;
        }
        this.f33428h = typedArray.getDimensionPixelSize(C10135k.f40245B1, 0);
        this.f33429i = C7710h.m42966c(typedArray.getInt(C10135k.f40466q1, -1), PorterDuff.Mode.SRC_IN);
        this.f33430j = C12456c.m59420a(this.f33421a.getContext(), typedArray, C10135k.f40460p1);
        this.f33431k = C12456c.m59420a(this.f33421a.getContext(), typedArray, C10135k.f40240A1);
        this.f33432l = C12456c.m59420a(this.f33421a.getContext(), typedArray, C10135k.f40514z1);
        this.f33437q = typedArray.getBoolean(C10135k.f40454o1, false);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(C10135k.f40478s1, 0);
        int G = C0835a0.m3692G(this.f33421a);
        int paddingTop = this.f33421a.getPaddingTop();
        int F = C0835a0.m3690F(this.f33421a);
        int paddingBottom = this.f33421a.getPaddingBottom();
        this.f33421a.setInternalBackground(m42327a());
        C12822g d = mo25018d();
        if (d != null) {
            d.mo37744S((float) dimensionPixelSize2);
        }
        C0835a0.m3681A0(this.f33421a, G + this.f33423c, paddingTop + this.f33425e, F + this.f33424d, paddingBottom + this.f33426f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo25028p(int i) {
        if (mo25018d() != null) {
            mo25018d().setTint(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo25029q() {
        this.f33435o = true;
        this.f33421a.setSupportBackgroundTintList(this.f33430j);
        this.f33421a.setSupportBackgroundTintMode(this.f33429i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo25030r(boolean z) {
        this.f33437q = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo25031s(int i) {
        if (!this.f33436p || this.f33427g != i) {
            this.f33427g = i;
            this.f33436p = true;
            mo25033u(this.f33422b.mo37791w((float) i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo25032t(ColorStateList colorStateList) {
        if (this.f33432l != colorStateList) {
            this.f33432l = colorStateList;
            boolean z = f33420s;
            if (z && (this.f33421a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f33421a.getBackground()).setColor(C12538b.m59728a(colorStateList));
            } else if (!z && (this.f33421a.getBackground() instanceof C12535a)) {
                ((C12535a) this.f33421a.getBackground()).setTintList(C12538b.m59728a(colorStateList));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo25033u(C12829k kVar) {
        this.f33422b = kVar;
        m42324A(kVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo25034v(boolean z) {
        this.f33434n = z;
        m42325C();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo25035w(ColorStateList colorStateList) {
        if (this.f33431k != colorStateList) {
            this.f33431k = colorStateList;
            m42325C();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo25036x(int i) {
        if (this.f33428h != i) {
            this.f33428h = i;
            m42325C();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo25037y(ColorStateList colorStateList) {
        if (this.f33430j != colorStateList) {
            this.f33430j = colorStateList;
            if (mo25018d() != null) {
                C0732a.m3377o(mo25018d(), this.f33430j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo25038z(PorterDuff.Mode mode) {
        if (this.f33429i != mode) {
            this.f33429i = mode;
            if (mo25018d() != null && this.f33429i != null) {
                C0732a.m3378p(mo25018d(), this.f33429i);
            }
        }
    }
}
