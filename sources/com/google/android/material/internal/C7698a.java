package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.core.text.C0814e;
import androidx.core.view.C0835a0;
import androidx.core.view.C0901e;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import p151v.C5753a;
import p236g6.C10208a;
import p346s6.C12453a;
import p346s6.C12457d;

/* renamed from: com.google.android.material.internal.a */
/* compiled from: CollapsingTextHelper */
public final class C7698a {

    /* renamed from: V */
    private static final boolean f33780V = (Build.VERSION.SDK_INT < 18);

    /* renamed from: W */
    private static final Paint f33781W = null;

    /* renamed from: A */
    private boolean f33782A;

    /* renamed from: B */
    private Bitmap f33783B;

    /* renamed from: C */
    private Paint f33784C;

    /* renamed from: D */
    private float f33785D;

    /* renamed from: E */
    private float f33786E;

    /* renamed from: F */
    private float f33787F;

    /* renamed from: G */
    private float f33788G;

    /* renamed from: H */
    private int[] f33789H;

    /* renamed from: I */
    private boolean f33790I;

    /* renamed from: J */
    private final TextPaint f33791J;

    /* renamed from: K */
    private final TextPaint f33792K;

    /* renamed from: L */
    private TimeInterpolator f33793L;

    /* renamed from: M */
    private TimeInterpolator f33794M;

    /* renamed from: N */
    private float f33795N;

    /* renamed from: O */
    private float f33796O;

    /* renamed from: P */
    private float f33797P;

    /* renamed from: Q */
    private ColorStateList f33798Q;

    /* renamed from: R */
    private float f33799R;

    /* renamed from: S */
    private float f33800S;

    /* renamed from: T */
    private float f33801T;

    /* renamed from: U */
    private ColorStateList f33802U;

    /* renamed from: a */
    private final View f33803a;

    /* renamed from: b */
    private boolean f33804b;

    /* renamed from: c */
    private float f33805c;

    /* renamed from: d */
    private final Rect f33806d;

    /* renamed from: e */
    private final Rect f33807e;

    /* renamed from: f */
    private final RectF f33808f;

    /* renamed from: g */
    private int f33809g = 16;

    /* renamed from: h */
    private int f33810h = 16;

    /* renamed from: i */
    private float f33811i = 15.0f;

    /* renamed from: j */
    private float f33812j = 15.0f;

    /* renamed from: k */
    private ColorStateList f33813k;

    /* renamed from: l */
    private ColorStateList f33814l;

    /* renamed from: m */
    private float f33815m;

    /* renamed from: n */
    private float f33816n;

    /* renamed from: o */
    private float f33817o;

    /* renamed from: p */
    private float f33818p;

    /* renamed from: q */
    private float f33819q;

    /* renamed from: r */
    private float f33820r;

    /* renamed from: s */
    private Typeface f33821s;

    /* renamed from: t */
    private Typeface f33822t;

    /* renamed from: u */
    private Typeface f33823u;

    /* renamed from: v */
    private C12453a f33824v;

    /* renamed from: w */
    private C12453a f33825w;

    /* renamed from: x */
    private CharSequence f33826x;

    /* renamed from: y */
    private CharSequence f33827y;

    /* renamed from: z */
    private boolean f33828z;

    /* renamed from: com.google.android.material.internal.a$a */
    /* compiled from: CollapsingTextHelper */
    class C7699a implements C12453a.C12454a {
        C7699a() {
        }

        /* renamed from: a */
        public void mo25716a(Typeface typeface) {
            C7698a.this.mo25693G(typeface);
        }
    }

    public C7698a(View view) {
        this.f33803a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f33791J = textPaint;
        this.f33792K = new TextPaint(textPaint);
        this.f33807e = new Rect();
        this.f33806d = new Rect();
        this.f33808f = new RectF();
    }

    /* renamed from: A */
    private static boolean m42880A(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: H */
    private boolean m42881H(Typeface typeface) {
        C12453a aVar = this.f33825w;
        if (aVar != null) {
            aVar.mo37206c();
        }
        if (this.f33821s == typeface) {
            return false;
        }
        this.f33821s = typeface;
        return true;
    }

    /* renamed from: N */
    private boolean m42882N(Typeface typeface) {
        C12453a aVar = this.f33824v;
        if (aVar != null) {
            aVar.mo37206c();
        }
        if (this.f33822t == typeface) {
            return false;
        }
        this.f33822t = typeface;
        return true;
    }

    /* renamed from: P */
    private void m42883P(float f) {
        m42889g(f);
        boolean z = f33780V && this.f33787F != 1.0f;
        this.f33782A = z;
        if (z) {
            m42891j();
        }
        C0835a0.m3723e0(this.f33803a);
    }

    /* renamed from: a */
    private static int m42884a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: b */
    private void m42885b() {
        float f = this.f33788G;
        m42889g(this.f33812j);
        CharSequence charSequence = this.f33827y;
        float f2 = 0.0f;
        float measureText = charSequence != null ? this.f33791J.measureText(charSequence, 0, charSequence.length()) : 0.0f;
        int b = C0901e.m4084b(this.f33810h, this.f33828z ? 1 : 0);
        int i = b & C8710R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        if (i == 48) {
            this.f33816n = ((float) this.f33807e.top) - this.f33791J.ascent();
        } else if (i != 80) {
            this.f33816n = ((float) this.f33807e.centerY()) + (((this.f33791J.descent() - this.f33791J.ascent()) / 2.0f) - this.f33791J.descent());
        } else {
            this.f33816n = (float) this.f33807e.bottom;
        }
        int i2 = b & 8388615;
        if (i2 == 1) {
            this.f33818p = ((float) this.f33807e.centerX()) - (measureText / 2.0f);
        } else if (i2 != 5) {
            this.f33818p = (float) this.f33807e.left;
        } else {
            this.f33818p = ((float) this.f33807e.right) - measureText;
        }
        m42889g(this.f33811i);
        CharSequence charSequence2 = this.f33827y;
        if (charSequence2 != null) {
            f2 = this.f33791J.measureText(charSequence2, 0, charSequence2.length());
        }
        int b2 = C0901e.m4084b(this.f33809g, this.f33828z ? 1 : 0);
        int i3 = b2 & C8710R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        if (i3 == 48) {
            this.f33815m = ((float) this.f33806d.top) - this.f33791J.ascent();
        } else if (i3 != 80) {
            this.f33815m = ((float) this.f33806d.centerY()) + (((this.f33791J.descent() - this.f33791J.ascent()) / 2.0f) - this.f33791J.descent());
        } else {
            this.f33815m = (float) this.f33806d.bottom;
        }
        int i4 = b2 & 8388615;
        if (i4 == 1) {
            this.f33817o = ((float) this.f33806d.centerX()) - (f2 / 2.0f);
        } else if (i4 != 5) {
            this.f33817o = (float) this.f33806d.left;
        } else {
            this.f33817o = ((float) this.f33806d.right) - f2;
        }
        m42890h();
        m42883P(f);
    }

    /* renamed from: d */
    private void m42886d() {
        m42888f(this.f33805c);
    }

    /* renamed from: e */
    private boolean m42887e(CharSequence charSequence) {
        boolean z = true;
        if (C0835a0.m3682B(this.f33803a) != 1) {
            z = false;
        }
        return (z ? C0814e.f2428d : C0814e.f2427c).mo3219a(charSequence, 0, charSequence.length());
    }

    /* renamed from: f */
    private void m42888f(float f) {
        m42896u(f);
        this.f33819q = m42898x(this.f33817o, this.f33818p, f, this.f33793L);
        this.f33820r = m42898x(this.f33815m, this.f33816n, f, this.f33793L);
        m42883P(m42898x(this.f33811i, this.f33812j, f, this.f33794M));
        if (this.f33814l != this.f33813k) {
            this.f33791J.setColor(m42884a(m42893p(), mo25710n(), f));
        } else {
            this.f33791J.setColor(mo25710n());
        }
        this.f33791J.setShadowLayer(m42898x(this.f33799R, this.f33795N, f, (TimeInterpolator) null), m42898x(this.f33800S, this.f33796O, f, (TimeInterpolator) null), m42898x(this.f33801T, this.f33797P, f, (TimeInterpolator) null), m42884a(m42892o(this.f33802U), m42892o(this.f33798Q), f));
        C0835a0.m3723e0(this.f33803a);
    }

    /* renamed from: g */
    private void m42889g(float f) {
        float f2;
        boolean z;
        boolean z2;
        if (this.f33826x != null) {
            float width = (float) this.f33807e.width();
            float width2 = (float) this.f33806d.width();
            boolean z3 = true;
            if (m42897v(f, this.f33812j)) {
                f2 = this.f33812j;
                this.f33787F = 1.0f;
                Typeface typeface = this.f33823u;
                Typeface typeface2 = this.f33821s;
                if (typeface != typeface2) {
                    this.f33823u = typeface2;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                float f3 = this.f33811i;
                Typeface typeface3 = this.f33823u;
                Typeface typeface4 = this.f33822t;
                if (typeface3 != typeface4) {
                    this.f33823u = typeface4;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (m42897v(f, f3)) {
                    this.f33787F = 1.0f;
                } else {
                    this.f33787F = f / this.f33811i;
                }
                float f4 = this.f33812j / this.f33811i;
                width = width2 * f4 > width ? Math.min(width / f4, width2) : width2;
                f2 = f3;
                z = z2;
            }
            if (width > 0.0f) {
                z = this.f33788G != f2 || this.f33790I || z;
                this.f33788G = f2;
                this.f33790I = false;
            }
            if (this.f33827y == null || z) {
                this.f33791J.setTextSize(this.f33788G);
                this.f33791J.setTypeface(this.f33823u);
                TextPaint textPaint = this.f33791J;
                if (this.f33787F == 1.0f) {
                    z3 = false;
                }
                textPaint.setLinearText(z3);
                CharSequence ellipsize = TextUtils.ellipsize(this.f33826x, this.f33791J, width, TextUtils.TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.f33827y)) {
                    this.f33827y = ellipsize;
                    this.f33828z = m42887e(ellipsize);
                }
            }
        }
    }

    /* renamed from: h */
    private void m42890h() {
        Bitmap bitmap = this.f33783B;
        if (bitmap != null) {
            bitmap.recycle();
            this.f33783B = null;
        }
    }

    /* renamed from: j */
    private void m42891j() {
        if (this.f33783B == null && !this.f33806d.isEmpty() && !TextUtils.isEmpty(this.f33827y)) {
            m42888f(0.0f);
            this.f33785D = this.f33791J.ascent();
            this.f33786E = this.f33791J.descent();
            TextPaint textPaint = this.f33791J;
            CharSequence charSequence = this.f33827y;
            int round = Math.round(textPaint.measureText(charSequence, 0, charSequence.length()));
            int round2 = Math.round(this.f33786E - this.f33785D);
            if (round > 0 && round2 > 0) {
                this.f33783B = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(this.f33783B);
                CharSequence charSequence2 = this.f33827y;
                canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, ((float) round2) - this.f33791J.descent(), this.f33791J);
                if (this.f33784C == null) {
                    this.f33784C = new Paint(3);
                }
            }
        }
    }

    /* renamed from: o */
    private int m42892o(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f33789H;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    /* renamed from: p */
    private int m42893p() {
        return m42892o(this.f33813k);
    }

    /* renamed from: s */
    private void m42894s(TextPaint textPaint) {
        textPaint.setTextSize(this.f33812j);
        textPaint.setTypeface(this.f33821s);
    }

    /* renamed from: t */
    private void m42895t(TextPaint textPaint) {
        textPaint.setTextSize(this.f33811i);
        textPaint.setTypeface(this.f33822t);
    }

    /* renamed from: u */
    private void m42896u(float f) {
        this.f33808f.left = m42898x((float) this.f33806d.left, (float) this.f33807e.left, f, this.f33793L);
        this.f33808f.top = m42898x(this.f33815m, this.f33816n, f, this.f33793L);
        this.f33808f.right = m42898x((float) this.f33806d.right, (float) this.f33807e.right, f, this.f33793L);
        this.f33808f.bottom = m42898x((float) this.f33806d.bottom, (float) this.f33807e.bottom, f, this.f33793L);
    }

    /* renamed from: v */
    private static boolean m42897v(float f, float f2) {
        return Math.abs(f - f2) < 0.001f;
    }

    /* renamed from: x */
    private static float m42898x(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C10208a.m51712a(f, f2, f3);
    }

    /* renamed from: B */
    public void mo25688B(int i, int i2, int i3, int i4) {
        if (!m42880A(this.f33807e, i, i2, i3, i4)) {
            this.f33807e.set(i, i2, i3, i4);
            this.f33790I = true;
            mo25714y();
        }
    }

    /* renamed from: C */
    public void mo25689C(Rect rect) {
        mo25688B(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: D */
    public void mo25690D(int i) {
        C12457d dVar = new C12457d(this.f33803a.getContext(), i);
        ColorStateList colorStateList = dVar.f45804b;
        if (colorStateList != null) {
            this.f33814l = colorStateList;
        }
        float f = dVar.f45803a;
        if (f != 0.0f) {
            this.f33812j = f;
        }
        ColorStateList colorStateList2 = dVar.f45811i;
        if (colorStateList2 != null) {
            this.f33798Q = colorStateList2;
        }
        this.f33796O = dVar.f45812j;
        this.f33797P = dVar.f45813k;
        this.f33795N = dVar.f45814l;
        C12453a aVar = this.f33825w;
        if (aVar != null) {
            aVar.mo37206c();
        }
        this.f33825w = new C12453a(new C7699a(), dVar.mo37207e());
        dVar.mo37210h(this.f33803a.getContext(), this.f33825w);
        mo25715z();
    }

    /* renamed from: E */
    public void mo25691E(ColorStateList colorStateList) {
        if (this.f33814l != colorStateList) {
            this.f33814l = colorStateList;
            mo25715z();
        }
    }

    /* renamed from: F */
    public void mo25692F(int i) {
        if (this.f33810h != i) {
            this.f33810h = i;
            mo25715z();
        }
    }

    /* renamed from: G */
    public void mo25693G(Typeface typeface) {
        if (m42881H(typeface)) {
            mo25715z();
        }
    }

    /* renamed from: I */
    public void mo25694I(int i, int i2, int i3, int i4) {
        if (!m42880A(this.f33806d, i, i2, i3, i4)) {
            this.f33806d.set(i, i2, i3, i4);
            this.f33790I = true;
            mo25714y();
        }
    }

    /* renamed from: J */
    public void mo25695J(Rect rect) {
        mo25694I(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: K */
    public void mo25696K(ColorStateList colorStateList) {
        if (this.f33813k != colorStateList) {
            this.f33813k = colorStateList;
            mo25715z();
        }
    }

    /* renamed from: L */
    public void mo25697L(int i) {
        if (this.f33809g != i) {
            this.f33809g = i;
            mo25715z();
        }
    }

    /* renamed from: M */
    public void mo25698M(float f) {
        if (this.f33811i != f) {
            this.f33811i = f;
            mo25715z();
        }
    }

    /* renamed from: O */
    public void mo25699O(float f) {
        float a = C5753a.m34334a(f, 0.0f, 1.0f);
        if (a != this.f33805c) {
            this.f33805c = a;
            m42886d();
        }
    }

    /* renamed from: Q */
    public void mo25700Q(TimeInterpolator timeInterpolator) {
        this.f33793L = timeInterpolator;
        mo25715z();
    }

    /* renamed from: R */
    public final boolean mo25701R(int[] iArr) {
        this.f33789H = iArr;
        if (!mo25713w()) {
            return false;
        }
        mo25715z();
        return true;
    }

    /* renamed from: S */
    public void mo25702S(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f33826x, charSequence)) {
            this.f33826x = charSequence;
            this.f33827y = null;
            m42890h();
            mo25715z();
        }
    }

    /* renamed from: T */
    public void mo25703T(TimeInterpolator timeInterpolator) {
        this.f33794M = timeInterpolator;
        mo25715z();
    }

    /* renamed from: U */
    public void mo25704U(Typeface typeface) {
        boolean H = m42881H(typeface);
        boolean N = m42882N(typeface);
        if (H || N) {
            mo25715z();
        }
    }

    /* renamed from: c */
    public float mo25705c() {
        if (this.f33826x == null) {
            return 0.0f;
        }
        m42894s(this.f33792K);
        TextPaint textPaint = this.f33792K;
        CharSequence charSequence = this.f33826x;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: i */
    public void mo25706i(Canvas canvas) {
        float f;
        int save = canvas.save();
        if (this.f33827y != null && this.f33804b) {
            float f2 = this.f33819q;
            float f3 = this.f33820r;
            boolean z = this.f33782A && this.f33783B != null;
            if (z) {
                f = this.f33785D * this.f33787F;
            } else {
                f = this.f33791J.ascent() * this.f33787F;
                this.f33791J.descent();
            }
            if (z) {
                f3 += f;
            }
            float f4 = f3;
            float f5 = this.f33787F;
            if (f5 != 1.0f) {
                canvas.scale(f5, f5, f2, f4);
            }
            if (z) {
                canvas.drawBitmap(this.f33783B, f2, f4, this.f33784C);
            } else {
                CharSequence charSequence = this.f33827y;
                canvas.drawText(charSequence, 0, charSequence.length(), f2, f4, this.f33791J);
            }
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: k */
    public void mo25707k(RectF rectF) {
        float f;
        boolean e = m42887e(this.f33826x);
        Rect rect = this.f33807e;
        if (!e) {
            f = (float) rect.left;
        } else {
            f = ((float) rect.right) - mo25705c();
        }
        rectF.left = f;
        Rect rect2 = this.f33807e;
        rectF.top = (float) rect2.top;
        rectF.right = !e ? f + mo25705c() : (float) rect2.right;
        rectF.bottom = ((float) this.f33807e.top) + mo25709m();
    }

    /* renamed from: l */
    public ColorStateList mo25708l() {
        return this.f33814l;
    }

    /* renamed from: m */
    public float mo25709m() {
        m42894s(this.f33792K);
        return -this.f33792K.ascent();
    }

    /* renamed from: n */
    public int mo25710n() {
        return m42892o(this.f33814l);
    }

    /* renamed from: q */
    public float mo25711q() {
        m42895t(this.f33792K);
        return -this.f33792K.ascent();
    }

    /* renamed from: r */
    public float mo25712r() {
        return this.f33805c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f33813k;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25713w() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f33814l
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0014
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f33813k
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.C7698a.mo25713w():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo25714y() {
        this.f33804b = this.f33807e.width() > 0 && this.f33807e.height() > 0 && this.f33806d.width() > 0 && this.f33806d.height() > 0;
    }

    /* renamed from: z */
    public void mo25715z() {
        if (this.f33803a.getHeight() > 0 && this.f33803a.getWidth() > 0) {
            m42885b();
            m42886d();
        }
    }
}
