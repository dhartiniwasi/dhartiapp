package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.util.C0831h;
import p028d0.C3987b;

/* renamed from: androidx.swiperefreshlayout.widget.b */
/* compiled from: CircularProgressDrawable */
public class C1467b extends Drawable implements Animatable {

    /* renamed from: g */
    private static final Interpolator f4200g = new LinearInterpolator();

    /* renamed from: h */
    private static final Interpolator f4201h = new C3987b();

    /* renamed from: i */
    private static final int[] f4202i = {-16777216};

    /* renamed from: a */
    private final C1470c f4203a;

    /* renamed from: b */
    private float f4204b;

    /* renamed from: c */
    private Resources f4205c;

    /* renamed from: d */
    private Animator f4206d;

    /* renamed from: e */
    float f4207e;

    /* renamed from: f */
    boolean f4208f;

    /* renamed from: androidx.swiperefreshlayout.widget.b$a */
    /* compiled from: CircularProgressDrawable */
    class C1468a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C1470c f4209a;

        C1468a(C1470c cVar) {
            this.f4209a = cVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C1467b.this.mo5672n(floatValue, this.f4209a);
            C1467b.this.mo5660b(floatValue, this.f4209a, false);
            C1467b.this.invalidateSelf();
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$b */
    /* compiled from: CircularProgressDrawable */
    class C1469b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C1470c f4211a;

        C1469b(C1470c cVar) {
            this.f4211a = cVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
            C1467b.this.mo5660b(1.0f, this.f4211a, true);
            this.f4211a.mo5682A();
            this.f4211a.mo5694l();
            C1467b bVar = C1467b.this;
            if (bVar.f4208f) {
                bVar.f4208f = false;
                animator.cancel();
                animator.setDuration(1332);
                animator.start();
                this.f4211a.mo5706x(false);
                return;
            }
            bVar.f4207e += 1.0f;
        }

        public void onAnimationStart(Animator animator) {
            C1467b.this.f4207e = 0.0f;
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$c */
    /* compiled from: CircularProgressDrawable */
    private static class C1470c {

        /* renamed from: a */
        final RectF f4213a = new RectF();

        /* renamed from: b */
        final Paint f4214b;

        /* renamed from: c */
        final Paint f4215c;

        /* renamed from: d */
        final Paint f4216d;

        /* renamed from: e */
        float f4217e;

        /* renamed from: f */
        float f4218f;

        /* renamed from: g */
        float f4219g;

        /* renamed from: h */
        float f4220h;

        /* renamed from: i */
        int[] f4221i;

        /* renamed from: j */
        int f4222j;

        /* renamed from: k */
        float f4223k;

        /* renamed from: l */
        float f4224l;

        /* renamed from: m */
        float f4225m;

        /* renamed from: n */
        boolean f4226n;

        /* renamed from: o */
        Path f4227o;

        /* renamed from: p */
        float f4228p;

        /* renamed from: q */
        float f4229q;

        /* renamed from: r */
        int f4230r;

        /* renamed from: s */
        int f4231s;

        /* renamed from: t */
        int f4232t;

        /* renamed from: u */
        int f4233u;

        C1470c() {
            Paint paint = new Paint();
            this.f4214b = paint;
            Paint paint2 = new Paint();
            this.f4215c = paint2;
            Paint paint3 = new Paint();
            this.f4216d = paint3;
            this.f4217e = 0.0f;
            this.f4218f = 0.0f;
            this.f4219g = 0.0f;
            this.f4220h = 5.0f;
            this.f4228p = 1.0f;
            this.f4232t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public void mo5682A() {
            this.f4223k = this.f4217e;
            this.f4224l = this.f4218f;
            this.f4225m = this.f4219g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5683a(Canvas canvas, Rect rect) {
            RectF rectF = this.f4213a;
            float f = this.f4229q;
            float f2 = (this.f4220h / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.f4230r) * this.f4228p) / 2.0f, this.f4220h / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f2, ((float) rect.centerY()) - f2, ((float) rect.centerX()) + f2, ((float) rect.centerY()) + f2);
            float f3 = this.f4217e;
            float f4 = this.f4219g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f4218f + f4) * 360.0f) - f5;
            this.f4214b.setColor(this.f4233u);
            this.f4214b.setAlpha(this.f4232t);
            float f7 = this.f4220h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f4216d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.f4214b);
            mo5684b(canvas, f5, f6, rectF);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5684b(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f4226n) {
                Path path = this.f4227o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f4227o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f4227o.moveTo(0.0f, 0.0f);
                this.f4227o.lineTo(((float) this.f4230r) * this.f4228p, 0.0f);
                Path path3 = this.f4227o;
                float f3 = this.f4228p;
                path3.lineTo((((float) this.f4230r) * f3) / 2.0f, ((float) this.f4231s) * f3);
                this.f4227o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) this.f4230r) * this.f4228p) / 2.0f), rectF.centerY() + (this.f4220h / 2.0f));
                this.f4227o.close();
                this.f4215c.setColor(this.f4233u);
                this.f4215c.setAlpha(this.f4232t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f4227o, this.f4215c);
                canvas.restore();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo5685c() {
            return this.f4232t;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public float mo5686d() {
            return this.f4218f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo5687e() {
            return this.f4221i[mo5688f()];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public int mo5688f() {
            return (this.f4222j + 1) % this.f4221i.length;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public float mo5689g() {
            return this.f4217e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo5690h() {
            return this.f4221i[this.f4222j];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public float mo5691i() {
            return this.f4224l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public float mo5692j() {
            return this.f4225m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public float mo5693k() {
            return this.f4223k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo5694l() {
            mo5702t(mo5688f());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo5695m() {
            this.f4223k = 0.0f;
            this.f4224l = 0.0f;
            this.f4225m = 0.0f;
            mo5707y(0.0f);
            mo5704v(0.0f);
            mo5705w(0.0f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public void mo5696n(int i) {
            this.f4232t = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo5697o(float f, float f2) {
            this.f4230r = (int) f;
            this.f4231s = (int) f2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo5698p(float f) {
            if (f != this.f4228p) {
                this.f4228p = f;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo5699q(float f) {
            this.f4229q = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo5700r(int i) {
            this.f4233u = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo5701s(ColorFilter colorFilter) {
            this.f4214b.setColorFilter(colorFilter);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo5702t(int i) {
            this.f4222j = i;
            this.f4233u = this.f4221i[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo5703u(int[] iArr) {
            this.f4221i = iArr;
            mo5702t(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo5704v(float f) {
            this.f4218f = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public void mo5705w(float f) {
            this.f4219g = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public void mo5706x(boolean z) {
            if (this.f4226n != z) {
                this.f4226n = z;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public void mo5707y(float f) {
            this.f4217e = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public void mo5708z(float f) {
            this.f4220h = f;
            this.f4214b.setStrokeWidth(f);
        }
    }

    public C1467b(Context context) {
        this.f4205c = ((Context) C0831h.m3662f(context)).getResources();
        C1470c cVar = new C1470c();
        this.f4203a = cVar;
        cVar.mo5703u(f4202i);
        mo5670k(2.5f);
        m6848m();
    }

    /* renamed from: a */
    private void m6844a(float f, C1470c cVar) {
        mo5672n(f, cVar);
        cVar.mo5707y(cVar.mo5693k() + (((cVar.mo5691i() - 0.01f) - cVar.mo5693k()) * f));
        cVar.mo5704v(cVar.mo5691i());
        cVar.mo5705w(cVar.mo5692j() + ((((float) (Math.floor((double) (cVar.mo5692j() / 0.8f)) + 1.0d)) - cVar.mo5692j()) * f));
    }

    /* renamed from: c */
    private int m6845c(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) (((float) (((i2 >> 24) & 255) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f))) << 8) | (i6 + ((int) (f * ((float) ((i2 & 255) - i6)))));
    }

    /* renamed from: h */
    private void m6846h(float f) {
        this.f4204b = f;
    }

    /* renamed from: i */
    private void m6847i(float f, float f2, float f3, float f4) {
        C1470c cVar = this.f4203a;
        float f5 = this.f4205c.getDisplayMetrics().density;
        cVar.mo5708z(f2 * f5);
        cVar.mo5699q(f * f5);
        cVar.mo5702t(0);
        cVar.mo5697o(f3 * f5, f4 * f5);
    }

    /* renamed from: m */
    private void m6848m() {
        C1470c cVar = this.f4203a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C1468a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f4200g);
        ofFloat.addListener(new C1469b(cVar));
        this.f4206d = ofFloat;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5660b(float f, C1470c cVar, boolean z) {
        float f2;
        float f3;
        if (this.f4208f) {
            m6844a(f, cVar);
        } else if (f != 1.0f || z) {
            float j = cVar.mo5692j();
            if (f < 0.5f) {
                f2 = cVar.mo5693k();
                f3 = (f4201h.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f2;
            } else {
                float k = cVar.mo5693k() + 0.79f;
                float f4 = k;
                f2 = k - (((1.0f - f4201h.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f3 = f4;
            }
            cVar.mo5707y(f2);
            cVar.mo5704v(f3);
            cVar.mo5705w(j + (0.20999998f * f));
            m6846h((f + this.f4207e) * 216.0f);
        }
    }

    /* renamed from: d */
    public void mo5661d(boolean z) {
        this.f4203a.mo5706x(z);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f4204b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f4203a.mo5683a(canvas, bounds);
        canvas.restore();
    }

    /* renamed from: e */
    public void mo5663e(float f) {
        this.f4203a.mo5698p(f);
        invalidateSelf();
    }

    /* renamed from: f */
    public void mo5664f(int... iArr) {
        this.f4203a.mo5703u(iArr);
        this.f4203a.mo5702t(0);
        invalidateSelf();
    }

    /* renamed from: g */
    public void mo5665g(float f) {
        this.f4203a.mo5705w(f);
        invalidateSelf();
    }

    public int getAlpha() {
        return this.f4203a.mo5685c();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f4206d.isRunning();
    }

    /* renamed from: j */
    public void mo5669j(float f, float f2) {
        this.f4203a.mo5707y(f);
        this.f4203a.mo5704v(f2);
        invalidateSelf();
    }

    /* renamed from: k */
    public void mo5670k(float f) {
        this.f4203a.mo5708z(f);
        invalidateSelf();
    }

    /* renamed from: l */
    public void mo5671l(int i) {
        if (i == 0) {
            m6847i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m6847i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo5672n(float f, C1470c cVar) {
        if (f > 0.75f) {
            cVar.mo5700r(m6845c((f - 0.75f) / 0.25f, cVar.mo5690h(), cVar.mo5687e()));
        } else {
            cVar.mo5700r(cVar.mo5690h());
        }
    }

    public void setAlpha(int i) {
        this.f4203a.mo5696n(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f4203a.mo5701s(colorFilter);
        invalidateSelf();
    }

    public void start() {
        this.f4206d.cancel();
        this.f4203a.mo5682A();
        if (this.f4203a.mo5686d() != this.f4203a.mo5689g()) {
            this.f4208f = true;
            this.f4206d.setDuration(666);
            this.f4206d.start();
            return;
        }
        this.f4203a.mo5702t(0);
        this.f4203a.mo5695m();
        this.f4206d.setDuration(1332);
        this.f4206d.start();
    }

    public void stop() {
        this.f4206d.cancel();
        m6846h(0.0f);
        this.f4203a.mo5706x(false);
        this.f4203a.mo5702t(0);
        this.f4203a.mo5695m();
        invalidateSelf();
    }
}
