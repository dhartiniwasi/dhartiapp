package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.C0723b;
import androidx.core.graphics.drawable.C0732a;
import androidx.core.text.C0804a;
import com.google.android.material.internal.C7706f;
import com.google.android.material.internal.C7709g;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p055h.C4411a;
import p227f6.C10135k;
import p236g6.C10215h;
import p245h6.C10406a;
import p301n6.C11929a;
import p346s6.C12456c;
import p346s6.C12457d;
import p355t6.C12538b;
import p375v6.C12822g;

/* renamed from: com.google.android.material.chip.a */
/* compiled from: ChipDrawable */
public class C7622a extends C12822g implements Drawable.Callback, C7706f.C7708b {

    /* renamed from: U0 */
    private static final int[] f33480U0 = {16842910};

    /* renamed from: V0 */
    private static final ShapeDrawable f33481V0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0 */
    private int f33482A0;

    /* renamed from: B0 */
    private int f33483B0;

    /* renamed from: C0 */
    private int f33484C0;

    /* renamed from: D0 */
    private int f33485D0;

    /* renamed from: E */
    private ColorStateList f33486E;

    /* renamed from: E0 */
    private int f33487E0;

    /* renamed from: F */
    private ColorStateList f33488F;

    /* renamed from: F0 */
    private boolean f33489F0;

    /* renamed from: G */
    private float f33490G;

    /* renamed from: G0 */
    private int f33491G0;

    /* renamed from: H */
    private float f33492H;

    /* renamed from: H0 */
    private int f33493H0 = 255;

    /* renamed from: I */
    private ColorStateList f33494I;

    /* renamed from: I0 */
    private ColorFilter f33495I0;

    /* renamed from: J */
    private float f33496J;

    /* renamed from: J0 */
    private PorterDuffColorFilter f33497J0;

    /* renamed from: K */
    private ColorStateList f33498K;

    /* renamed from: K0 */
    private ColorStateList f33499K0;

    /* renamed from: L */
    private CharSequence f33500L;

    /* renamed from: L0 */
    private PorterDuff.Mode f33501L0 = PorterDuff.Mode.SRC_IN;

    /* renamed from: M */
    private boolean f33502M;

    /* renamed from: M0 */
    private int[] f33503M0;

    /* renamed from: N */
    private Drawable f33504N;

    /* renamed from: N0 */
    private boolean f33505N0;

    /* renamed from: O */
    private ColorStateList f33506O;

    /* renamed from: O0 */
    private ColorStateList f33507O0;

    /* renamed from: P */
    private float f33508P;

    /* renamed from: P0 */
    private WeakReference<C7623a> f33509P0 = new WeakReference<>((Object) null);

    /* renamed from: Q */
    private boolean f33510Q;

    /* renamed from: Q0 */
    private TextUtils.TruncateAt f33511Q0;

    /* renamed from: R */
    private boolean f33512R;

    /* renamed from: R0 */
    private boolean f33513R0;

    /* renamed from: S */
    private Drawable f33514S;

    /* renamed from: S0 */
    private int f33515S0;

    /* renamed from: T0 */
    private boolean f33516T0;

    /* renamed from: a0 */
    private Drawable f33517a0;

    /* renamed from: b0 */
    private ColorStateList f33518b0;

    /* renamed from: c0 */
    private float f33519c0;

    /* renamed from: d0 */
    private CharSequence f33520d0;

    /* renamed from: e0 */
    private boolean f33521e0;

    /* renamed from: f0 */
    private boolean f33522f0;

    /* renamed from: g0 */
    private Drawable f33523g0;

    /* renamed from: h0 */
    private C10215h f33524h0;

    /* renamed from: i0 */
    private C10215h f33525i0;

    /* renamed from: j0 */
    private float f33526j0;

    /* renamed from: k0 */
    private float f33527k0;

    /* renamed from: l0 */
    private float f33528l0;

    /* renamed from: m0 */
    private float f33529m0;

    /* renamed from: n0 */
    private float f33530n0;

    /* renamed from: o0 */
    private float f33531o0;

    /* renamed from: p0 */
    private float f33532p0;

    /* renamed from: q0 */
    private float f33533q0;

    /* renamed from: r0 */
    private final Context f33534r0;

    /* renamed from: s0 */
    private final Paint f33535s0 = new Paint(1);

    /* renamed from: t0 */
    private final Paint f33536t0;

    /* renamed from: u0 */
    private final Paint.FontMetrics f33537u0 = new Paint.FontMetrics();

    /* renamed from: v0 */
    private final RectF f33538v0 = new RectF();

    /* renamed from: w0 */
    private final PointF f33539w0 = new PointF();

    /* renamed from: x0 */
    private final Path f33540x0 = new Path();

    /* renamed from: y0 */
    private final C7706f f33541y0;

    /* renamed from: z0 */
    private int f33542z0;

    /* renamed from: com.google.android.material.chip.a$a */
    /* compiled from: ChipDrawable */
    public interface C7623a {
        /* renamed from: a */
        void mo25074a();
    }

    private C7622a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo37741L(context);
        this.f33534r0 = context;
        C7706f fVar = new C7706f(this);
        this.f33541y0 = fVar;
        this.f33500L = "";
        fVar.mo25738e().density = context.getResources().getDisplayMetrics().density;
        this.f33536t0 = null;
        int[] iArr = f33480U0;
        setState(iArr);
        mo25302b2(iArr);
        this.f33513R0 = true;
        if (C12538b.f46034a) {
            f33481V0.setTint(-1);
        }
    }

    /* renamed from: C2 */
    private boolean m42406C2() {
        return this.f33522f0 && this.f33523g0 != null && this.f33489F0;
    }

    /* renamed from: D2 */
    private boolean m42407D2() {
        return this.f33502M && this.f33504N != null;
    }

    /* renamed from: E2 */
    private boolean m42408E2() {
        return this.f33512R && this.f33514S != null;
    }

    /* renamed from: F2 */
    private void m42409F2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    /* renamed from: G2 */
    private void m42410G2() {
        this.f33507O0 = this.f33505N0 ? C12538b.m59728a(this.f33498K) : null;
    }

    /* renamed from: H2 */
    private void m42411H2() {
        this.f33517a0 = new RippleDrawable(C12538b.m59728a(mo25292X0()), this.f33514S, f33481V0);
    }

    /* renamed from: R1 */
    private void m42412R1(ColorStateList colorStateList) {
        if (this.f33486E != colorStateList) {
            this.f33486E = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: d1 */
    private ColorFilter m42413d1() {
        ColorFilter colorFilter = this.f33495I0;
        return colorFilter != null ? colorFilter : this.f33497J0;
    }

    /* renamed from: f0 */
    private void m42414f0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            C0732a.m3375m(drawable, C0732a.m3368f(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f33514S) {
                if (drawable.isStateful()) {
                    drawable.setState(mo25279Q0());
                }
                C0732a.m3377o(drawable, this.f33518b0);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.f33504N;
            if (drawable == drawable2 && this.f33510Q) {
                C0732a.m3377o(drawable2, this.f33506O);
            }
        }
    }

    /* renamed from: f1 */
    private static boolean m42415f1(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g0 */
    private void m42416g0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m42407D2() || m42406C2()) {
            float f = this.f33526j0 + this.f33527k0;
            if (C0732a.m3368f(this) == 0) {
                float f2 = ((float) rect.left) + f;
                rectF.left = f2;
                rectF.right = f2 + this.f33508P;
            } else {
                float f3 = ((float) rect.right) - f;
                rectF.right = f3;
                rectF.left = f3 - this.f33508P;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f33508P;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: i0 */
    private void m42417i0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (m42408E2()) {
            float f = this.f33533q0 + this.f33532p0 + this.f33519c0 + this.f33531o0 + this.f33530n0;
            if (C0732a.m3368f(this) == 0) {
                rectF.right = ((float) rect.right) - f;
            } else {
                rectF.left = ((float) rect.left) + f;
            }
        }
    }

    /* renamed from: j0 */
    private void m42418j0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m42408E2()) {
            float f = this.f33533q0 + this.f33532p0;
            if (C0732a.m3368f(this) == 0) {
                float f2 = ((float) rect.right) - f;
                rectF.right = f2;
                rectF.left = f2 - this.f33519c0;
            } else {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + this.f33519c0;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f33519c0;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: j1 */
    private static boolean m42419j1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: k0 */
    private void m42420k0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m42408E2()) {
            float f = this.f33533q0 + this.f33532p0 + this.f33519c0 + this.f33531o0 + this.f33530n0;
            if (C0732a.m3368f(this) == 0) {
                float f2 = (float) rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = (float) i;
                rectF.right = ((float) i) + f;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: k1 */
    private static boolean m42421k1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r0.f45804b;
     */
    /* renamed from: l1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m42422l1(p346s6.C12457d r0) {
        /*
            if (r0 == 0) goto L_0x000e
            android.content.res.ColorStateList r0 = r0.f45804b
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C7622a.m42422l1(s6.d):boolean");
    }

    /* renamed from: m0 */
    private void m42423m0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f33500L != null) {
            float h0 = this.f33526j0 + mo25318h0() + this.f33529m0;
            float l0 = this.f33533q0 + mo25327l0() + this.f33530n0;
            if (C0732a.m3368f(this) == 0) {
                rectF.left = ((float) rect.left) + h0;
                rectF.right = ((float) rect.right) - l0;
            } else {
                rectF.left = ((float) rect.left) + l0;
                rectF.right = ((float) rect.right) - h0;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: m1 */
    private void m42424m1(AttributeSet attributeSet, int i, int i2) {
        TypedArray k = C7709g.m42962k(this.f33534r0, attributeSet, C10135k.f40288K, i, i2, new int[0]);
        this.f33516T0 = k.hasValue(C10135k.f40488u0);
        m42412R1(C12456c.m59420a(this.f33534r0, k, C10135k.f40411h0));
        mo25354v1(C12456c.m59420a(this.f33534r0, k, C10135k.f40338U));
        mo25266J1(k.getDimension(C10135k.f40381c0, 0.0f));
        int i3 = C10135k.f40343V;
        if (k.hasValue(i3)) {
            mo25358x1(k.getDimension(i3, 0.0f));
        }
        mo25274N1(C12456c.m59420a(this.f33534r0, k, C10135k.f40399f0));
        mo25278P1(k.getDimension(C10135k.f40405g0, 0.0f));
        mo25333o2(C12456c.m59420a(this.f33534r0, k, C10135k.f40483t0));
        mo25350t2(k.getText(C10135k.f40313P));
        mo25352u2(C12456c.m59425f(this.f33534r0, k, C10135k.f40293L));
        int i4 = k.getInt(C10135k.f40303N, 0);
        if (i4 == 1) {
            mo25311g2(TextUtils.TruncateAt.START);
        } else if (i4 == 2) {
            mo25311g2(TextUtils.TruncateAt.MIDDLE);
        } else if (i4 == 3) {
            mo25311g2(TextUtils.TruncateAt.END);
        }
        mo25264I1(k.getBoolean(C10135k.f40375b0, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null)) {
            mo25264I1(k.getBoolean(C10135k.f40358Y, false));
        }
        mo25249B1(C12456c.m59423d(this.f33534r0, k, C10135k.f40353X));
        int i5 = C10135k.f40369a0;
        if (k.hasValue(i5)) {
            mo25258F1(C12456c.m59420a(this.f33534r0, k, i5));
        }
        mo25254D1(k.getDimension(C10135k.f40363Z, 0.0f));
        mo25308e2(k.getBoolean(C10135k.f40453o0, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null)) {
            mo25308e2(k.getBoolean(C10135k.f40423j0, false));
        }
        mo25283S1(C12456c.m59423d(this.f33534r0, k, C10135k.f40417i0));
        mo25304c2(C12456c.m59420a(this.f33534r0, k, C10135k.f40447n0));
        mo25293X1(k.getDimension(C10135k.f40435l0, 0.0f));
        mo25337p1(k.getBoolean(C10135k.f40318Q, false));
        mo25351u1(k.getBoolean(C10135k.f40333T, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null)) {
            mo25351u1(k.getBoolean(C10135k.f40328S, false));
        }
        mo25341r1(C12456c.m59423d(this.f33534r0, k, C10135k.f40323R));
        mo25342r2(C10215h.m51724b(this.f33534r0, k, C10135k.f40493v0));
        mo25320h2(C10215h.m51724b(this.f33534r0, k, C10135k.f40465q0));
        mo25270L1(k.getDimension(C10135k.f40393e0, 0.0f));
        mo25328l2(k.getDimension(C10135k.f40477s0, 0.0f));
        mo25325j2(k.getDimension(C10135k.f40471r0, 0.0f));
        mo25361y2(k.getDimension(C10135k.f40503x0, 0.0f));
        mo25357w2(k.getDimension(C10135k.f40498w0, 0.0f));
        mo25297Z1(k.getDimension(C10135k.f40441m0, 0.0f));
        mo25287U1(k.getDimension(C10135k.f40429k0, 0.0f));
        mo25362z1(k.getDimension(C10135k.f40348W, 0.0f));
        mo25331n2(k.getDimensionPixelSize(C10135k.f40308O, Integer.MAX_VALUE));
        k.recycle();
    }

    /* renamed from: n0 */
    private float m42425n0() {
        this.f33541y0.mo25738e().getFontMetrics(this.f33537u0);
        Paint.FontMetrics fontMetrics = this.f33537u0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x014a  */
    /* renamed from: o1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m42426o1(int[] r7, int[] r8) {
        /*
            r6 = this;
            boolean r0 = super.onStateChange(r7)
            android.content.res.ColorStateList r1 = r6.f33486E
            r2 = 0
            if (r1 == 0) goto L_0x0010
            int r3 = r6.f33542z0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            int r3 = r6.f33542z0
            r4 = 1
            if (r3 == r1) goto L_0x0019
            r6.f33542z0 = r1
            r0 = 1
        L_0x0019:
            android.content.res.ColorStateList r3 = r6.f33488F
            if (r3 == 0) goto L_0x0024
            int r5 = r6.f33482A0
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            int r5 = r6.f33482A0
            if (r5 == r3) goto L_0x002c
            r6.f33482A0 = r3
            r0 = 1
        L_0x002c:
            int r1 = p283l6.C11758a.m57064e(r1, r3)
            int r3 = r6.f33483B0
            if (r3 == r1) goto L_0x0036
            r3 = 1
            goto L_0x0037
        L_0x0036:
            r3 = 0
        L_0x0037:
            android.content.res.ColorStateList r5 = r6.mo37766w()
            if (r5 != 0) goto L_0x003f
            r5 = 1
            goto L_0x0040
        L_0x003f:
            r5 = 0
        L_0x0040:
            r3 = r3 | r5
            if (r3 == 0) goto L_0x004d
            r6.f33483B0 = r1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            r6.mo37745T(r0)
            r0 = 1
        L_0x004d:
            android.content.res.ColorStateList r1 = r6.f33494I
            if (r1 == 0) goto L_0x0058
            int r3 = r6.f33484C0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0059
        L_0x0058:
            r1 = 0
        L_0x0059:
            int r3 = r6.f33484C0
            if (r3 == r1) goto L_0x0060
            r6.f33484C0 = r1
            r0 = 1
        L_0x0060:
            android.content.res.ColorStateList r1 = r6.f33507O0
            if (r1 == 0) goto L_0x0073
            boolean r1 = p355t6.C12538b.m59729b(r7)
            if (r1 == 0) goto L_0x0073
            android.content.res.ColorStateList r1 = r6.f33507O0
            int r3 = r6.f33485D0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x0074
        L_0x0073:
            r1 = 0
        L_0x0074:
            int r3 = r6.f33485D0
            if (r3 == r1) goto L_0x007f
            r6.f33485D0 = r1
            boolean r1 = r6.f33505N0
            if (r1 == 0) goto L_0x007f
            r0 = 1
        L_0x007f:
            com.google.android.material.internal.f r1 = r6.f33541y0
            s6.d r1 = r1.mo25737d()
            if (r1 == 0) goto L_0x00a0
            com.google.android.material.internal.f r1 = r6.f33541y0
            s6.d r1 = r1.mo25737d()
            android.content.res.ColorStateList r1 = r1.f45804b
            if (r1 == 0) goto L_0x00a0
            com.google.android.material.internal.f r1 = r6.f33541y0
            s6.d r1 = r1.mo25737d()
            android.content.res.ColorStateList r1 = r1.f45804b
            int r3 = r6.f33487E0
            int r1 = r1.getColorForState(r7, r3)
            goto L_0x00a1
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            int r3 = r6.f33487E0
            if (r3 == r1) goto L_0x00a8
            r6.f33487E0 = r1
            r0 = 1
        L_0x00a8:
            int[] r1 = r6.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            boolean r1 = m42415f1(r1, r3)
            if (r1 == 0) goto L_0x00bb
            boolean r1 = r6.f33521e0
            if (r1 == 0) goto L_0x00bb
            r1 = 1
            goto L_0x00bc
        L_0x00bb:
            r1 = 0
        L_0x00bc:
            boolean r3 = r6.f33489F0
            if (r3 == r1) goto L_0x00d6
            android.graphics.drawable.Drawable r3 = r6.f33523g0
            if (r3 == 0) goto L_0x00d6
            float r0 = r6.mo25318h0()
            r6.f33489F0 = r1
            float r1 = r6.mo25318h0()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00d5
            r0 = 1
            r1 = 1
            goto L_0x00d7
        L_0x00d5:
            r0 = 1
        L_0x00d6:
            r1 = 0
        L_0x00d7:
            android.content.res.ColorStateList r3 = r6.f33499K0
            if (r3 == 0) goto L_0x00e2
            int r5 = r6.f33491G0
            int r3 = r3.getColorForState(r7, r5)
            goto L_0x00e3
        L_0x00e2:
            r3 = 0
        L_0x00e3:
            int r5 = r6.f33491G0
            if (r5 == r3) goto L_0x00f4
            r6.f33491G0 = r3
            android.content.res.ColorStateList r0 = r6.f33499K0
            android.graphics.PorterDuff$Mode r3 = r6.f33501L0
            android.graphics.PorterDuffColorFilter r0 = p301n6.C11929a.m57610a(r6, r0, r3)
            r6.f33497J0 = r0
            goto L_0x00f5
        L_0x00f4:
            r4 = r0
        L_0x00f5:
            android.graphics.drawable.Drawable r0 = r6.f33504N
            boolean r0 = m42421k1(r0)
            if (r0 == 0) goto L_0x0104
            android.graphics.drawable.Drawable r0 = r6.f33504N
            boolean r0 = r0.setState(r7)
            r4 = r4 | r0
        L_0x0104:
            android.graphics.drawable.Drawable r0 = r6.f33523g0
            boolean r0 = m42421k1(r0)
            if (r0 == 0) goto L_0x0113
            android.graphics.drawable.Drawable r0 = r6.f33523g0
            boolean r0 = r0.setState(r7)
            r4 = r4 | r0
        L_0x0113:
            android.graphics.drawable.Drawable r0 = r6.f33514S
            boolean r0 = m42421k1(r0)
            if (r0 == 0) goto L_0x0130
            int r0 = r7.length
            int r3 = r8.length
            int r0 = r0 + r3
            int[] r0 = new int[r0]
            int r3 = r7.length
            java.lang.System.arraycopy(r7, r2, r0, r2, r3)
            int r7 = r7.length
            int r3 = r8.length
            java.lang.System.arraycopy(r8, r2, r0, r7, r3)
            android.graphics.drawable.Drawable r7 = r6.f33514S
            boolean r7 = r7.setState(r0)
            r4 = r4 | r7
        L_0x0130:
            boolean r7 = p355t6.C12538b.f46034a
            if (r7 == 0) goto L_0x0143
            android.graphics.drawable.Drawable r7 = r6.f33517a0
            boolean r7 = m42421k1(r7)
            if (r7 == 0) goto L_0x0143
            android.graphics.drawable.Drawable r7 = r6.f33517a0
            boolean r7 = r7.setState(r8)
            r4 = r4 | r7
        L_0x0143:
            if (r4 == 0) goto L_0x0148
            r6.invalidateSelf()
        L_0x0148:
            if (r1 == 0) goto L_0x014d
            r6.mo25330n1()
        L_0x014d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.C7622a.m42426o1(int[], int[]):boolean");
    }

    /* renamed from: p0 */
    private boolean m42427p0() {
        return this.f33522f0 && this.f33523g0 != null && this.f33521e0;
    }

    /* renamed from: q0 */
    public static C7622a m42428q0(Context context, AttributeSet attributeSet, int i, int i2) {
        C7622a aVar = new C7622a(context, attributeSet, i, i2);
        aVar.m42424m1(attributeSet, i, i2);
        return aVar;
    }

    /* renamed from: r0 */
    private void m42429r0(Canvas canvas, Rect rect) {
        if (m42406C2()) {
            m42416g0(rect, this.f33538v0);
            RectF rectF = this.f33538v0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f33523g0.setBounds(0, 0, (int) this.f33538v0.width(), (int) this.f33538v0.height());
            this.f33523g0.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: s0 */
    private void m42430s0(Canvas canvas, Rect rect) {
        if (!this.f33516T0) {
            this.f33535s0.setColor(this.f33482A0);
            this.f33535s0.setStyle(Paint.Style.FILL);
            this.f33535s0.setColorFilter(m42413d1());
            this.f33538v0.set(rect);
            canvas.drawRoundRect(this.f33538v0, mo25251C0(), mo25251C0(), this.f33535s0);
        }
    }

    /* renamed from: t0 */
    private void m42431t0(Canvas canvas, Rect rect) {
        if (m42407D2()) {
            m42416g0(rect, this.f33538v0);
            RectF rectF = this.f33538v0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f33504N.setBounds(0, 0, (int) this.f33538v0.width(), (int) this.f33538v0.height());
            this.f33504N.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: u0 */
    private void m42432u0(Canvas canvas, Rect rect) {
        if (this.f33496J > 0.0f && !this.f33516T0) {
            this.f33535s0.setColor(this.f33484C0);
            this.f33535s0.setStyle(Paint.Style.STROKE);
            if (!this.f33516T0) {
                this.f33535s0.setColorFilter(m42413d1());
            }
            RectF rectF = this.f33538v0;
            float f = this.f33496J;
            rectF.set(((float) rect.left) + (f / 2.0f), ((float) rect.top) + (f / 2.0f), ((float) rect.right) - (f / 2.0f), ((float) rect.bottom) - (f / 2.0f));
            float f2 = this.f33492H - (this.f33496J / 2.0f);
            canvas.drawRoundRect(this.f33538v0, f2, f2, this.f33535s0);
        }
    }

    /* renamed from: v0 */
    private void m42433v0(Canvas canvas, Rect rect) {
        if (!this.f33516T0) {
            this.f33535s0.setColor(this.f33542z0);
            this.f33535s0.setStyle(Paint.Style.FILL);
            this.f33538v0.set(rect);
            canvas.drawRoundRect(this.f33538v0, mo25251C0(), mo25251C0(), this.f33535s0);
        }
    }

    /* renamed from: w0 */
    private void m42434w0(Canvas canvas, Rect rect) {
        if (m42408E2()) {
            m42418j0(rect, this.f33538v0);
            RectF rectF = this.f33538v0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f33514S.setBounds(0, 0, (int) this.f33538v0.width(), (int) this.f33538v0.height());
            if (C12538b.f46034a) {
                this.f33517a0.setBounds(this.f33514S.getBounds());
                this.f33517a0.jumpToCurrentState();
                this.f33517a0.draw(canvas);
            } else {
                this.f33514S.draw(canvas);
            }
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: x0 */
    private void m42435x0(Canvas canvas, Rect rect) {
        this.f33535s0.setColor(this.f33485D0);
        this.f33535s0.setStyle(Paint.Style.FILL);
        this.f33538v0.set(rect);
        if (!this.f33516T0) {
            canvas.drawRoundRect(this.f33538v0, mo25251C0(), mo25251C0(), this.f33535s0);
            return;
        }
        mo37754g(new RectF(rect), this.f33540x0);
        super.mo37760o(canvas, this.f33535s0, this.f33540x0, mo37764t());
    }

    /* renamed from: y0 */
    private void m42436y0(Canvas canvas, Rect rect) {
        Paint paint = this.f33536t0;
        if (paint != null) {
            paint.setColor(C0723b.m3315f(-16777216, 127));
            canvas.drawRect(rect, this.f33536t0);
            if (m42407D2() || m42406C2()) {
                m42416g0(rect, this.f33538v0);
                canvas.drawRect(this.f33538v0, this.f33536t0);
            }
            if (this.f33500L != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.f33536t0);
            }
            if (m42408E2()) {
                m42418j0(rect, this.f33538v0);
                canvas.drawRect(this.f33538v0, this.f33536t0);
            }
            this.f33536t0.setColor(C0723b.m3315f(-65536, 127));
            m42417i0(rect, this.f33538v0);
            canvas.drawRect(this.f33538v0, this.f33536t0);
            this.f33536t0.setColor(C0723b.m3315f(-16711936, 127));
            m42420k0(rect, this.f33538v0);
            canvas.drawRect(this.f33538v0, this.f33536t0);
        }
    }

    /* renamed from: z0 */
    private void m42437z0(Canvas canvas, Rect rect) {
        if (this.f33500L != null) {
            Paint.Align o0 = mo25332o0(rect, this.f33539w0);
            m42423m0(rect, this.f33538v0);
            if (this.f33541y0.mo25737d() != null) {
                this.f33541y0.mo25738e().drawableState = getState();
                this.f33541y0.mo25743j(this.f33534r0);
            }
            this.f33541y0.mo25738e().setTextAlign(o0);
            int i = 0;
            boolean z = Math.round(this.f33541y0.mo25739f(mo25296Z0().toString())) > Math.round(this.f33538v0.width());
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.f33538v0);
            }
            CharSequence charSequence = this.f33500L;
            if (z && this.f33511Q0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f33541y0.mo25738e(), this.f33538v0.width(), this.f33511Q0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f33539w0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f33541y0.mo25738e());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: A0 */
    public Drawable mo25245A0() {
        return this.f33523g0;
    }

    /* renamed from: A1 */
    public void mo25246A1(int i) {
        mo25362z1(this.f33534r0.getResources().getDimension(i));
    }

    /* renamed from: A2 */
    public void mo25247A2(boolean z) {
        if (this.f33505N0 != z) {
            this.f33505N0 = z;
            m42410G2();
            onStateChange(getState());
        }
    }

    /* renamed from: B0 */
    public ColorStateList mo25248B0() {
        return this.f33488F;
    }

    /* renamed from: B1 */
    public void mo25249B1(Drawable drawable) {
        Drawable E0 = mo25255E0();
        if (E0 != drawable) {
            float h0 = mo25318h0();
            this.f33504N = drawable != null ? C0732a.m3380r(drawable).mutate() : null;
            float h02 = mo25318h0();
            m42409F2(E0);
            if (m42407D2()) {
                m42414f0(this.f33504N);
            }
            invalidateSelf();
            if (h0 != h02) {
                mo25330n1();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B2 */
    public boolean mo25250B2() {
        return this.f33513R0;
    }

    /* renamed from: C0 */
    public float mo25251C0() {
        return this.f33516T0 ? mo37737E() : this.f33492H;
    }

    /* renamed from: C1 */
    public void mo25252C1(int i) {
        mo25249B1(C4411a.m29346b(this.f33534r0, i));
    }

    /* renamed from: D0 */
    public float mo25253D0() {
        return this.f33533q0;
    }

    /* renamed from: D1 */
    public void mo25254D1(float f) {
        if (this.f33508P != f) {
            float h0 = mo25318h0();
            this.f33508P = f;
            float h02 = mo25318h0();
            invalidateSelf();
            if (h0 != h02) {
                mo25330n1();
            }
        }
    }

    /* renamed from: E0 */
    public Drawable mo25255E0() {
        Drawable drawable = this.f33504N;
        if (drawable != null) {
            return C0732a.m3379q(drawable);
        }
        return null;
    }

    /* renamed from: E1 */
    public void mo25256E1(int i) {
        mo25254D1(this.f33534r0.getResources().getDimension(i));
    }

    /* renamed from: F0 */
    public float mo25257F0() {
        return this.f33508P;
    }

    /* renamed from: F1 */
    public void mo25258F1(ColorStateList colorStateList) {
        this.f33510Q = true;
        if (this.f33506O != colorStateList) {
            this.f33506O = colorStateList;
            if (m42407D2()) {
                C0732a.m3377o(this.f33504N, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: G0 */
    public ColorStateList mo25259G0() {
        return this.f33506O;
    }

    /* renamed from: G1 */
    public void mo25260G1(int i) {
        mo25258F1(C4411a.m29345a(this.f33534r0, i));
    }

    /* renamed from: H0 */
    public float mo25261H0() {
        return this.f33490G;
    }

    /* renamed from: H1 */
    public void mo25262H1(int i) {
        mo25264I1(this.f33534r0.getResources().getBoolean(i));
    }

    /* renamed from: I0 */
    public float mo25263I0() {
        return this.f33526j0;
    }

    /* renamed from: I1 */
    public void mo25264I1(boolean z) {
        if (this.f33502M != z) {
            boolean D2 = m42407D2();
            this.f33502M = z;
            boolean D22 = m42407D2();
            if (D2 != D22) {
                if (D22) {
                    m42414f0(this.f33504N);
                } else {
                    m42409F2(this.f33504N);
                }
                invalidateSelf();
                mo25330n1();
            }
        }
    }

    /* renamed from: J0 */
    public ColorStateList mo25265J0() {
        return this.f33494I;
    }

    /* renamed from: J1 */
    public void mo25266J1(float f) {
        if (this.f33490G != f) {
            this.f33490G = f;
            invalidateSelf();
            mo25330n1();
        }
    }

    /* renamed from: K0 */
    public float mo25267K0() {
        return this.f33496J;
    }

    /* renamed from: K1 */
    public void mo25268K1(int i) {
        mo25266J1(this.f33534r0.getResources().getDimension(i));
    }

    /* renamed from: L0 */
    public Drawable mo25269L0() {
        Drawable drawable = this.f33514S;
        if (drawable != null) {
            return C0732a.m3379q(drawable);
        }
        return null;
    }

    /* renamed from: L1 */
    public void mo25270L1(float f) {
        if (this.f33526j0 != f) {
            this.f33526j0 = f;
            invalidateSelf();
            mo25330n1();
        }
    }

    /* renamed from: M0 */
    public CharSequence mo25271M0() {
        return this.f33520d0;
    }

    /* renamed from: M1 */
    public void mo25272M1(int i) {
        mo25270L1(this.f33534r0.getResources().getDimension(i));
    }

    /* renamed from: N0 */
    public float mo25273N0() {
        return this.f33532p0;
    }

    /* renamed from: N1 */
    public void mo25274N1(ColorStateList colorStateList) {
        if (this.f33494I != colorStateList) {
            this.f33494I = colorStateList;
            if (this.f33516T0) {
                mo37752a0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: O0 */
    public float mo25275O0() {
        return this.f33519c0;
    }

    /* renamed from: O1 */
    public void mo25276O1(int i) {
        mo25274N1(C4411a.m29345a(this.f33534r0, i));
    }

    /* renamed from: P0 */
    public float mo25277P0() {
        return this.f33531o0;
    }

    /* renamed from: P1 */
    public void mo25278P1(float f) {
        if (this.f33496J != f) {
            this.f33496J = f;
            this.f33535s0.setStrokeWidth(f);
            if (this.f33516T0) {
                super.mo37753b0(f);
            }
            invalidateSelf();
        }
    }

    /* renamed from: Q0 */
    public int[] mo25279Q0() {
        return this.f33503M0;
    }

    /* renamed from: Q1 */
    public void mo25280Q1(int i) {
        mo25278P1(this.f33534r0.getResources().getDimension(i));
    }

    /* renamed from: R0 */
    public ColorStateList mo25281R0() {
        return this.f33518b0;
    }

    /* renamed from: S0 */
    public void mo25282S0(RectF rectF) {
        m42420k0(getBounds(), rectF);
    }

    /* renamed from: S1 */
    public void mo25283S1(Drawable drawable) {
        Drawable L0 = mo25269L0();
        if (L0 != drawable) {
            float l0 = mo25327l0();
            this.f33514S = drawable != null ? C0732a.m3380r(drawable).mutate() : null;
            if (C12538b.f46034a) {
                m42411H2();
            }
            float l02 = mo25327l0();
            m42409F2(L0);
            if (m42408E2()) {
                m42414f0(this.f33514S);
            }
            invalidateSelf();
            if (l0 != l02) {
                mo25330n1();
            }
        }
    }

    /* renamed from: T0 */
    public TextUtils.TruncateAt mo25284T0() {
        return this.f33511Q0;
    }

    /* renamed from: T1 */
    public void mo25285T1(CharSequence charSequence) {
        if (this.f33520d0 != charSequence) {
            this.f33520d0 = C0804a.m3590c().mo3187h(charSequence);
            invalidateSelf();
        }
    }

    /* renamed from: U0 */
    public C10215h mo25286U0() {
        return this.f33525i0;
    }

    /* renamed from: U1 */
    public void mo25287U1(float f) {
        if (this.f33532p0 != f) {
            this.f33532p0 = f;
            invalidateSelf();
            if (m42408E2()) {
                mo25330n1();
            }
        }
    }

    /* renamed from: V0 */
    public float mo25288V0() {
        return this.f33528l0;
    }

    /* renamed from: V1 */
    public void mo25289V1(int i) {
        mo25287U1(this.f33534r0.getResources().getDimension(i));
    }

    /* renamed from: W0 */
    public float mo25290W0() {
        return this.f33527k0;
    }

    /* renamed from: W1 */
    public void mo25291W1(int i) {
        mo25283S1(C4411a.m29346b(this.f33534r0, i));
    }

    /* renamed from: X0 */
    public ColorStateList mo25292X0() {
        return this.f33498K;
    }

    /* renamed from: X1 */
    public void mo25293X1(float f) {
        if (this.f33519c0 != f) {
            this.f33519c0 = f;
            invalidateSelf();
            if (m42408E2()) {
                mo25330n1();
            }
        }
    }

    /* renamed from: Y0 */
    public C10215h mo25294Y0() {
        return this.f33524h0;
    }

    /* renamed from: Y1 */
    public void mo25295Y1(int i) {
        mo25293X1(this.f33534r0.getResources().getDimension(i));
    }

    /* renamed from: Z0 */
    public CharSequence mo25296Z0() {
        return this.f33500L;
    }

    /* renamed from: Z1 */
    public void mo25297Z1(float f) {
        if (this.f33531o0 != f) {
            this.f33531o0 = f;
            invalidateSelf();
            if (m42408E2()) {
                mo25330n1();
            }
        }
    }

    /* renamed from: a */
    public void mo25298a() {
        mo25330n1();
        invalidateSelf();
    }

    /* renamed from: a1 */
    public C12457d mo25299a1() {
        return this.f33541y0.mo25737d();
    }

    /* renamed from: a2 */
    public void mo25300a2(int i) {
        mo25297Z1(this.f33534r0.getResources().getDimension(i));
    }

    /* renamed from: b1 */
    public float mo25301b1() {
        return this.f33530n0;
    }

    /* renamed from: b2 */
    public boolean mo25302b2(int[] iArr) {
        if (Arrays.equals(this.f33503M0, iArr)) {
            return false;
        }
        this.f33503M0 = iArr;
        if (m42408E2()) {
            return m42426o1(getState(), iArr);
        }
        return false;
    }

    /* renamed from: c1 */
    public float mo25303c1() {
        return this.f33529m0;
    }

    /* renamed from: c2 */
    public void mo25304c2(ColorStateList colorStateList) {
        if (this.f33518b0 != colorStateList) {
            this.f33518b0 = colorStateList;
            if (m42408E2()) {
                C0732a.m3377o(this.f33514S, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: d2 */
    public void mo25305d2(int i) {
        mo25304c2(C4411a.m29345a(this.f33534r0, i));
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i = 0;
            int i2 = this.f33493H0;
            if (i2 < 255) {
                i = C10406a.m52564a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i2);
            }
            m42433v0(canvas, bounds);
            m42430s0(canvas, bounds);
            if (this.f33516T0) {
                super.draw(canvas);
            }
            m42432u0(canvas, bounds);
            m42435x0(canvas, bounds);
            m42431t0(canvas, bounds);
            m42429r0(canvas, bounds);
            if (this.f33513R0) {
                m42437z0(canvas, bounds);
            }
            m42434w0(canvas, bounds);
            m42436y0(canvas, bounds);
            if (this.f33493H0 < 255) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: e1 */
    public boolean mo25307e1() {
        return this.f33505N0;
    }

    /* renamed from: e2 */
    public void mo25308e2(boolean z) {
        if (this.f33512R != z) {
            boolean E2 = m42408E2();
            this.f33512R = z;
            boolean E22 = m42408E2();
            if (E2 != E22) {
                if (E22) {
                    m42414f0(this.f33514S);
                } else {
                    m42409F2(this.f33514S);
                }
                invalidateSelf();
                mo25330n1();
            }
        }
    }

    /* renamed from: f2 */
    public void mo25309f2(C7623a aVar) {
        this.f33509P0 = new WeakReference<>(aVar);
    }

    /* renamed from: g1 */
    public boolean mo25310g1() {
        return this.f33521e0;
    }

    /* renamed from: g2 */
    public void mo25311g2(TextUtils.TruncateAt truncateAt) {
        this.f33511Q0 = truncateAt;
    }

    public int getAlpha() {
        return this.f33493H0;
    }

    public ColorFilter getColorFilter() {
        return this.f33495I0;
    }

    public int getIntrinsicHeight() {
        return (int) this.f33490G;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f33526j0 + mo25318h0() + this.f33529m0 + this.f33541y0.mo25739f(mo25296Z0().toString()) + this.f33530n0 + mo25327l0() + this.f33533q0), this.f33515S0);
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        if (this.f33516T0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f33492H);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f33492H);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public float mo25318h0() {
        if (m42407D2() || m42406C2()) {
            return this.f33527k0 + this.f33508P + this.f33528l0;
        }
        return 0.0f;
    }

    /* renamed from: h1 */
    public boolean mo25319h1() {
        return m42421k1(this.f33514S);
    }

    /* renamed from: h2 */
    public void mo25320h2(C10215h hVar) {
        this.f33525i0 = hVar;
    }

    /* renamed from: i1 */
    public boolean mo25321i1() {
        return this.f33512R;
    }

    /* renamed from: i2 */
    public void mo25322i2(int i) {
        mo25320h2(C10215h.m51725c(this.f33534r0, i));
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isStateful() {
        return m42419j1(this.f33486E) || m42419j1(this.f33488F) || m42419j1(this.f33494I) || (this.f33505N0 && m42419j1(this.f33507O0)) || m42422l1(this.f33541y0.mo25737d()) || m42427p0() || m42421k1(this.f33504N) || m42421k1(this.f33523g0) || m42419j1(this.f33499K0);
    }

    /* renamed from: j2 */
    public void mo25325j2(float f) {
        if (this.f33528l0 != f) {
            float h0 = mo25318h0();
            this.f33528l0 = f;
            float h02 = mo25318h0();
            invalidateSelf();
            if (h0 != h02) {
                mo25330n1();
            }
        }
    }

    /* renamed from: k2 */
    public void mo25326k2(int i) {
        mo25325j2(this.f33534r0.getResources().getDimension(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public float mo25327l0() {
        if (m42408E2()) {
            return this.f33531o0 + this.f33519c0 + this.f33532p0;
        }
        return 0.0f;
    }

    /* renamed from: l2 */
    public void mo25328l2(float f) {
        if (this.f33527k0 != f) {
            float h0 = mo25318h0();
            this.f33527k0 = f;
            float h02 = mo25318h0();
            invalidateSelf();
            if (h0 != h02) {
                mo25330n1();
            }
        }
    }

    /* renamed from: m2 */
    public void mo25329m2(int i) {
        mo25328l2(this.f33534r0.getResources().getDimension(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: n1 */
    public void mo25330n1() {
        C7623a aVar = (C7623a) this.f33509P0.get();
        if (aVar != null) {
            aVar.mo25074a();
        }
    }

    /* renamed from: n2 */
    public void mo25331n2(int i) {
        this.f33515S0 = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public Paint.Align mo25332o0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f33500L != null) {
            float h0 = this.f33526j0 + mo25318h0() + this.f33529m0;
            if (C0732a.m3368f(this) == 0) {
                pointF.x = ((float) rect.left) + h0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = ((float) rect.right) - h0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - m42425n0();
        }
        return align;
    }

    /* renamed from: o2 */
    public void mo25333o2(ColorStateList colorStateList) {
        if (this.f33498K != colorStateList) {
            this.f33498K = colorStateList;
            m42410G2();
            onStateChange(getState());
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m42407D2()) {
            onLayoutDirectionChanged |= C0732a.m3375m(this.f33504N, i);
        }
        if (m42406C2()) {
            onLayoutDirectionChanged |= C0732a.m3375m(this.f33523g0, i);
        }
        if (m42408E2()) {
            onLayoutDirectionChanged |= C0732a.m3375m(this.f33514S, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (m42407D2()) {
            onLevelChange |= this.f33504N.setLevel(i);
        }
        if (m42406C2()) {
            onLevelChange |= this.f33523g0.setLevel(i);
        }
        if (m42408E2()) {
            onLevelChange |= this.f33514S.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.f33516T0) {
            super.onStateChange(iArr);
        }
        return m42426o1(iArr, mo25279Q0());
    }

    /* renamed from: p1 */
    public void mo25337p1(boolean z) {
        if (this.f33521e0 != z) {
            this.f33521e0 = z;
            float h0 = mo25318h0();
            if (!z && this.f33489F0) {
                this.f33489F0 = false;
            }
            float h02 = mo25318h0();
            invalidateSelf();
            if (h0 != h02) {
                mo25330n1();
            }
        }
    }

    /* renamed from: p2 */
    public void mo25338p2(int i) {
        mo25333o2(C4411a.m29345a(this.f33534r0, i));
    }

    /* renamed from: q1 */
    public void mo25339q1(int i) {
        mo25337p1(this.f33534r0.getResources().getBoolean(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q2 */
    public void mo25340q2(boolean z) {
        this.f33513R0 = z;
    }

    /* renamed from: r1 */
    public void mo25341r1(Drawable drawable) {
        if (this.f33523g0 != drawable) {
            float h0 = mo25318h0();
            this.f33523g0 = drawable;
            float h02 = mo25318h0();
            m42409F2(this.f33523g0);
            m42414f0(this.f33523g0);
            invalidateSelf();
            if (h0 != h02) {
                mo25330n1();
            }
        }
    }

    /* renamed from: r2 */
    public void mo25342r2(C10215h hVar) {
        this.f33524h0 = hVar;
    }

    /* renamed from: s1 */
    public void mo25343s1(int i) {
        mo25341r1(C4411a.m29346b(this.f33534r0, i));
    }

    /* renamed from: s2 */
    public void mo25344s2(int i) {
        mo25342r2(C10215h.m51725c(this.f33534r0, i));
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.f33493H0 != i) {
            this.f33493H0 = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f33495I0 != colorFilter) {
            this.f33495I0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f33499K0 != colorStateList) {
            this.f33499K0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f33501L0 != mode) {
            this.f33501L0 = mode;
            this.f33497J0 = C11929a.m57610a(this, this.f33499K0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m42407D2()) {
            visible |= this.f33504N.setVisible(z, z2);
        }
        if (m42406C2()) {
            visible |= this.f33523g0.setVisible(z, z2);
        }
        if (m42408E2()) {
            visible |= this.f33514S.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: t1 */
    public void mo25349t1(int i) {
        mo25351u1(this.f33534r0.getResources().getBoolean(i));
    }

    /* renamed from: t2 */
    public void mo25350t2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.f33500L, charSequence)) {
            this.f33500L = charSequence;
            this.f33541y0.mo25742i(true);
            invalidateSelf();
            mo25330n1();
        }
    }

    /* renamed from: u1 */
    public void mo25351u1(boolean z) {
        if (this.f33522f0 != z) {
            boolean C2 = m42406C2();
            this.f33522f0 = z;
            boolean C22 = m42406C2();
            if (C2 != C22) {
                if (C22) {
                    m42414f0(this.f33523g0);
                } else {
                    m42409F2(this.f33523g0);
                }
                invalidateSelf();
                mo25330n1();
            }
        }
    }

    /* renamed from: u2 */
    public void mo25352u2(C12457d dVar) {
        this.f33541y0.mo25741h(dVar, this.f33534r0);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v1 */
    public void mo25354v1(ColorStateList colorStateList) {
        if (this.f33488F != colorStateList) {
            this.f33488F = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: v2 */
    public void mo25355v2(int i) {
        mo25352u2(new C12457d(this.f33534r0, i));
    }

    /* renamed from: w1 */
    public void mo25356w1(int i) {
        mo25354v1(C4411a.m29345a(this.f33534r0, i));
    }

    /* renamed from: w2 */
    public void mo25357w2(float f) {
        if (this.f33530n0 != f) {
            this.f33530n0 = f;
            invalidateSelf();
            mo25330n1();
        }
    }

    @Deprecated
    /* renamed from: x1 */
    public void mo25358x1(float f) {
        if (this.f33492H != f) {
            this.f33492H = f;
            setShapeAppearanceModel(mo37735B().mo37791w(f));
        }
    }

    /* renamed from: x2 */
    public void mo25359x2(int i) {
        mo25357w2(this.f33534r0.getResources().getDimension(i));
    }

    @Deprecated
    /* renamed from: y1 */
    public void mo25360y1(int i) {
        mo25358x1(this.f33534r0.getResources().getDimension(i));
    }

    /* renamed from: y2 */
    public void mo25361y2(float f) {
        if (this.f33529m0 != f) {
            this.f33529m0 = f;
            invalidateSelf();
            mo25330n1();
        }
    }

    /* renamed from: z1 */
    public void mo25362z1(float f) {
        if (this.f33533q0 != f) {
            this.f33533q0 = f;
            invalidateSelf();
            mo25330n1();
        }
    }

    /* renamed from: z2 */
    public void mo25363z2(int i) {
        mo25361y2(this.f33534r0.getResources().getDimension(i));
    }
}
