package p117q;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import p110p.C5244b;
import p110p.C5245c;

/* renamed from: q.h */
/* compiled from: RoundRectDrawableWithShadow */
class C5341h extends Drawable {

    /* renamed from: q */
    private static final double f27377q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r */
    static C5342a f27378r;

    /* renamed from: a */
    private final int f27379a;

    /* renamed from: b */
    private Paint f27380b;

    /* renamed from: c */
    private Paint f27381c;

    /* renamed from: d */
    private Paint f27382d;

    /* renamed from: e */
    private final RectF f27383e;

    /* renamed from: f */
    private float f27384f;

    /* renamed from: g */
    private Path f27385g;

    /* renamed from: h */
    private float f27386h;

    /* renamed from: i */
    private float f27387i;

    /* renamed from: j */
    private float f27388j;

    /* renamed from: k */
    private ColorStateList f27389k;

    /* renamed from: l */
    private boolean f27390l = true;

    /* renamed from: m */
    private final int f27391m;

    /* renamed from: n */
    private final int f27392n;

    /* renamed from: o */
    private boolean f27393o = true;

    /* renamed from: p */
    private boolean f27394p = false;

    /* renamed from: q.h$a */
    /* compiled from: RoundRectDrawableWithShadow */
    interface C5342a {
        /* renamed from: a */
        void mo19330a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    C5341h(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f27391m = resources.getColor(C5244b.cardview_shadow_start_color);
        this.f27392n = resources.getColor(C5244b.cardview_shadow_end_color);
        this.f27379a = resources.getDimensionPixelSize(C5245c.cardview_compat_inset_shadow);
        this.f27380b = new Paint(5);
        m32746n(colorStateList);
        Paint paint = new Paint(5);
        this.f27381c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f27384f = (float) ((int) (f + 0.5f));
        this.f27383e = new RectF();
        Paint paint2 = new Paint(this.f27381c);
        this.f27382d = paint2;
        paint2.setAntiAlias(false);
        m32747s(f2, f3);
    }

    /* renamed from: a */
    private void m32741a(Rect rect) {
        float f = this.f27386h;
        float f2 = 1.5f * f;
        this.f27383e.set(((float) rect.left) + f, ((float) rect.top) + f2, ((float) rect.right) - f, ((float) rect.bottom) - f2);
        m32742b();
    }

    /* renamed from: b */
    private void m32742b() {
        float f = this.f27384f;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f27387i;
        rectF2.inset(-f2, -f2);
        Path path = this.f27385g;
        if (path == null) {
            this.f27385g = new Path();
        } else {
            path.reset();
        }
        this.f27385g.setFillType(Path.FillType.EVEN_ODD);
        this.f27385g.moveTo(-this.f27384f, 0.0f);
        this.f27385g.rLineTo(-this.f27387i, 0.0f);
        this.f27385g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f27385g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f27385g.close();
        float f3 = this.f27384f;
        float f4 = f3 / (this.f27387i + f3);
        Paint paint = this.f27381c;
        float f5 = this.f27384f + this.f27387i;
        int i = this.f27391m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f5, new int[]{i, i, this.f27392n}, new float[]{0.0f, f4, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f27382d;
        float f6 = this.f27384f;
        float f7 = this.f27387i;
        int i2 = this.f27391m;
        paint2.setShader(new LinearGradient(0.0f, (-f6) + f7, 0.0f, (-f6) - f7, new int[]{i2, i2, this.f27392n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f27382d.setAntiAlias(false);
    }

    /* renamed from: c */
    static float m32743c(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - f27377q) * ((double) f2))) : f;
    }

    /* renamed from: d */
    static float m32744d(float f, float f2, boolean z) {
        return z ? (float) (((double) (f * 1.5f)) + ((1.0d - f27377q) * ((double) f2))) : f * 1.5f;
    }

    /* renamed from: e */
    private void m32745e(Canvas canvas) {
        float f = this.f27384f;
        float f2 = (-f) - this.f27387i;
        float f3 = f + ((float) this.f27379a) + (this.f27388j / 2.0f);
        float f4 = f3 * 2.0f;
        boolean z = this.f27383e.width() - f4 > 0.0f;
        boolean z2 = this.f27383e.height() - f4 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f27383e;
        canvas.translate(rectF.left + f3, rectF.top + f3);
        canvas.drawPath(this.f27385g, this.f27381c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f27383e.width() - f4, -this.f27384f, this.f27382d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f27383e;
        canvas.translate(rectF2.right - f3, rectF2.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f27385g, this.f27381c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f27383e.width() - f4, (-this.f27384f) + this.f27387i, this.f27382d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f27383e;
        canvas.translate(rectF3.left + f3, rectF3.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f27385g, this.f27381c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f27383e.height() - f4, -this.f27384f, this.f27382d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f27383e;
        canvas.translate(rectF4.right - f3, rectF4.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f27385g, this.f27381c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f27383e.height() - f4, -this.f27384f, this.f27382d);
        }
        canvas.restoreToCount(save4);
    }

    /* renamed from: n */
    private void m32746n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f27389k = colorStateList;
        this.f27380b.setColor(colorStateList.getColorForState(getState(), this.f27389k.getDefaultColor()));
    }

    /* renamed from: s */
    private void m32747s(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        } else if (f2 >= 0.0f) {
            float t = (float) m32748t(f);
            float t2 = (float) m32748t(f2);
            if (t > t2) {
                if (!this.f27394p) {
                    this.f27394p = true;
                }
                t = t2;
            }
            if (this.f27388j != t || this.f27386h != t2) {
                this.f27388j = t;
                this.f27386h = t2;
                this.f27387i = (float) ((int) ((t * 1.5f) + ((float) this.f27379a) + 0.5f));
                this.f27390l = true;
                invalidateSelf();
            }
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
    }

    /* renamed from: t */
    private int m32748t(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    public void draw(Canvas canvas) {
        if (this.f27390l) {
            m32741a(getBounds());
            this.f27390l = false;
        }
        canvas.translate(0.0f, this.f27388j / 2.0f);
        m32745e(canvas);
        canvas.translate(0.0f, (-this.f27388j) / 2.0f);
        f27378r.mo19330a(canvas, this.f27383e, this.f27384f, this.f27380b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ColorStateList mo19363f() {
        return this.f27389k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public float mo19364g() {
        return this.f27384f;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m32744d(this.f27386h, this.f27384f, this.f27393o));
        int ceil2 = (int) Math.ceil((double) m32743c(this.f27386h, this.f27384f, this.f27393o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo19367h(Rect rect) {
        getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public float mo19368i() {
        return this.f27386h;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f27389k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public float mo19370j() {
        float f = this.f27386h;
        return (Math.max(f, this.f27384f + ((float) this.f27379a) + ((f * 1.5f) / 2.0f)) * 2.0f) + (((this.f27386h * 1.5f) + ((float) this.f27379a)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public float mo19371k() {
        float f = this.f27386h;
        return (Math.max(f, this.f27384f + ((float) this.f27379a) + (f / 2.0f)) * 2.0f) + ((this.f27386h + ((float) this.f27379a)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public float mo19372l() {
        return this.f27388j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo19373m(boolean z) {
        this.f27393o = z;
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo19374o(ColorStateList colorStateList) {
        m32746n(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f27390l = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f27389k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f27380b.getColor() == colorForState) {
            return false;
        }
        this.f27380b.setColor(colorForState);
        this.f27390l = true;
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo19377p(float f) {
        if (f >= 0.0f) {
            float f2 = (float) ((int) (f + 0.5f));
            if (this.f27384f != f2) {
                this.f27384f = f2;
                this.f27390l = true;
                invalidateSelf();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo19378q(float f) {
        m32747s(this.f27388j, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo19379r(float f) {
        m32747s(f, this.f27386h);
    }

    public void setAlpha(int i) {
        this.f27380b.setAlpha(i);
        this.f27381c.setAlpha(i);
        this.f27382d.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f27380b.setColorFilter(colorFilter);
    }
}
