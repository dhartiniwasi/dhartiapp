package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.C0835a0;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.d */
/* compiled from: FastScroller */
class C1396d extends RecyclerView.C1349n implements RecyclerView.C1358s {

    /* renamed from: D */
    private static final int[] f3963D = {16842919};

    /* renamed from: E */
    private static final int[] f3964E = new int[0];

    /* renamed from: A */
    int f3965A;

    /* renamed from: B */
    private final Runnable f3966B;

    /* renamed from: C */
    private final RecyclerView.C1359t f3967C;

    /* renamed from: a */
    private final int f3968a;

    /* renamed from: b */
    private final int f3969b;

    /* renamed from: c */
    final StateListDrawable f3970c;

    /* renamed from: d */
    final Drawable f3971d;

    /* renamed from: e */
    private final int f3972e;

    /* renamed from: f */
    private final int f3973f;

    /* renamed from: g */
    private final StateListDrawable f3974g;

    /* renamed from: h */
    private final Drawable f3975h;

    /* renamed from: i */
    private final int f3976i;

    /* renamed from: j */
    private final int f3977j;

    /* renamed from: k */
    int f3978k;

    /* renamed from: l */
    int f3979l;

    /* renamed from: m */
    float f3980m;

    /* renamed from: n */
    int f3981n;

    /* renamed from: o */
    int f3982o;

    /* renamed from: p */
    float f3983p;

    /* renamed from: q */
    private int f3984q = 0;

    /* renamed from: r */
    private int f3985r = 0;

    /* renamed from: s */
    private RecyclerView f3986s;

    /* renamed from: t */
    private boolean f3987t = false;

    /* renamed from: u */
    private boolean f3988u = false;

    /* renamed from: v */
    private int f3989v = 0;

    /* renamed from: w */
    private int f3990w = 0;

    /* renamed from: x */
    private final int[] f3991x = new int[2];

    /* renamed from: y */
    private final int[] f3992y = new int[2];

    /* renamed from: z */
    final ValueAnimator f3993z;

    /* renamed from: androidx.recyclerview.widget.d$a */
    /* compiled from: FastScroller */
    class C1397a implements Runnable {
        C1397a() {
        }

        public void run() {
            C1396d.this.mo5449q(500);
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    /* compiled from: FastScroller */
    class C1398b extends RecyclerView.C1359t {
        C1398b() {
        }

        /* renamed from: b */
        public void mo5224b(RecyclerView recyclerView, int i, int i2) {
            C1396d.this.mo5447B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$c */
    /* compiled from: FastScroller */
    private class C1399c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f3996a = false;

        C1399c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f3996a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f3996a) {
                this.f3996a = false;
            } else if (((Float) C1396d.this.f3993z.getAnimatedValue()).floatValue() == 0.0f) {
                C1396d dVar = C1396d.this;
                dVar.f3965A = 0;
                dVar.mo5453y(0);
            } else {
                C1396d dVar2 = C1396d.this;
                dVar2.f3965A = 2;
                dVar2.mo5452v();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d */
    /* compiled from: FastScroller */
    private class C1400d implements ValueAnimator.AnimatorUpdateListener {
        C1400d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C1396d.this.f3970c.setAlpha(floatValue);
            C1396d.this.f3971d.setAlpha(floatValue);
            C1396d.this.mo5452v();
        }
    }

    C1396d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f3993z = ofFloat;
        this.f3965A = 0;
        this.f3966B = new C1397a();
        this.f3967C = new C1398b();
        this.f3970c = stateListDrawable;
        this.f3971d = drawable;
        this.f3974g = stateListDrawable2;
        this.f3975h = drawable2;
        this.f3972e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f3973f = Math.max(i, drawable.getIntrinsicWidth());
        this.f3976i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f3977j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f3968a = i2;
        this.f3969b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C1399c());
        ofFloat.addUpdateListener(new C1400d());
        mo5448j(recyclerView);
    }

    /* renamed from: C */
    private void m6511C(float f) {
        int[] p = m6517p();
        float max = Math.max((float) p[0], Math.min((float) p[1], f));
        if (Math.abs(((float) this.f3979l) - max) >= 2.0f) {
            int x = m6521x(this.f3980m, max, p, this.f3986s.computeVerticalScrollRange(), this.f3986s.computeVerticalScrollOffset(), this.f3985r);
            if (x != 0) {
                this.f3986s.scrollBy(0, x);
            }
            this.f3980m = max;
        }
    }

    /* renamed from: k */
    private void m6512k() {
        this.f3986s.removeCallbacks(this.f3966B);
    }

    /* renamed from: l */
    private void m6513l() {
        this.f3986s.removeItemDecoration(this);
        this.f3986s.removeOnItemTouchListener(this);
        this.f3986s.removeOnScrollListener(this.f3967C);
        m6512k();
    }

    /* renamed from: m */
    private void m6514m(Canvas canvas) {
        int i = this.f3985r;
        int i2 = this.f3976i;
        int i3 = i - i2;
        int i4 = this.f3982o;
        int i5 = this.f3981n;
        int i6 = i4 - (i5 / 2);
        this.f3974g.setBounds(0, 0, i5, i2);
        this.f3975h.setBounds(0, 0, this.f3984q, this.f3977j);
        canvas.translate(0.0f, (float) i3);
        this.f3975h.draw(canvas);
        canvas.translate((float) i6, 0.0f);
        this.f3974g.draw(canvas);
        canvas.translate((float) (-i6), (float) (-i3));
    }

    /* renamed from: n */
    private void m6515n(Canvas canvas) {
        int i = this.f3984q;
        int i2 = this.f3972e;
        int i3 = i - i2;
        int i4 = this.f3979l;
        int i5 = this.f3978k;
        int i6 = i4 - (i5 / 2);
        this.f3970c.setBounds(0, 0, i2, i5);
        this.f3971d.setBounds(0, 0, this.f3973f, this.f3985r);
        if (m6519s()) {
            this.f3971d.draw(canvas);
            canvas.translate((float) this.f3972e, (float) i6);
            canvas.scale(-1.0f, 1.0f);
            this.f3970c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            canvas.translate((float) (-this.f3972e), (float) (-i6));
            return;
        }
        canvas.translate((float) i3, 0.0f);
        this.f3971d.draw(canvas);
        canvas.translate(0.0f, (float) i6);
        this.f3970c.draw(canvas);
        canvas.translate((float) (-i3), (float) (-i6));
    }

    /* renamed from: o */
    private int[] m6516o() {
        int[] iArr = this.f3992y;
        int i = this.f3969b;
        iArr[0] = i;
        iArr[1] = this.f3984q - i;
        return iArr;
    }

    /* renamed from: p */
    private int[] m6517p() {
        int[] iArr = this.f3991x;
        int i = this.f3969b;
        iArr[0] = i;
        iArr[1] = this.f3985r - i;
        return iArr;
    }

    /* renamed from: r */
    private void m6518r(float f) {
        int[] o = m6516o();
        float max = Math.max((float) o[0], Math.min((float) o[1], f));
        if (Math.abs(((float) this.f3982o) - max) >= 2.0f) {
            int x = m6521x(this.f3983p, max, o, this.f3986s.computeHorizontalScrollRange(), this.f3986s.computeHorizontalScrollOffset(), this.f3984q);
            if (x != 0) {
                this.f3986s.scrollBy(x, 0);
            }
            this.f3983p = max;
        }
    }

    /* renamed from: s */
    private boolean m6519s() {
        return C0835a0.m3682B(this.f3986s) == 1;
    }

    /* renamed from: w */
    private void m6520w(int i) {
        m6512k();
        this.f3986s.postDelayed(this.f3966B, (long) i);
    }

    /* renamed from: x */
    private int m6521x(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: z */
    private void m6522z() {
        this.f3986s.addItemDecoration(this);
        this.f3986s.addOnItemTouchListener(this);
        this.f3986s.addOnScrollListener(this.f3967C);
    }

    /* renamed from: A */
    public void mo5446A() {
        int i = this.f3965A;
        if (i != 0) {
            if (i == 3) {
                this.f3993z.cancel();
            } else {
                return;
            }
        }
        this.f3965A = 1;
        ValueAnimator valueAnimator = this.f3993z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f3993z.setDuration(500);
        this.f3993z.setStartDelay(0);
        this.f3993z.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo5447B(int i, int i2) {
        int computeVerticalScrollRange = this.f3986s.computeVerticalScrollRange();
        int i3 = this.f3985r;
        this.f3987t = computeVerticalScrollRange - i3 > 0 && i3 >= this.f3968a;
        int computeHorizontalScrollRange = this.f3986s.computeHorizontalScrollRange();
        int i4 = this.f3984q;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= this.f3968a;
        this.f3988u = z;
        boolean z2 = this.f3987t;
        if (z2 || z) {
            if (z2) {
                float f = (float) i3;
                this.f3979l = (int) ((f * (((float) i2) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f3978k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f3988u) {
                float f2 = (float) i4;
                this.f3982o = (int) ((f2 * (((float) i) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f3981n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = this.f3989v;
            if (i5 == 0 || i5 == 1) {
                mo5453y(1);
            }
        } else if (this.f3989v != 0) {
            mo5453y(0);
        }
    }

    /* renamed from: a */
    public void mo5220a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f3989v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean u = mo5451u(motionEvent.getX(), motionEvent.getY());
                boolean t = mo5450t(motionEvent.getX(), motionEvent.getY());
                if (u || t) {
                    if (t) {
                        this.f3990w = 1;
                        this.f3983p = (float) ((int) motionEvent.getX());
                    } else if (u) {
                        this.f3990w = 2;
                        this.f3980m = (float) ((int) motionEvent.getY());
                    }
                    mo5453y(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f3989v == 2) {
                this.f3980m = 0.0f;
                this.f3983p = 0.0f;
                mo5453y(1);
                this.f3990w = 0;
            } else if (motionEvent.getAction() == 2 && this.f3989v == 2) {
                mo5446A();
                if (this.f3990w == 1) {
                    m6518r(motionEvent.getX());
                }
                if (this.f3990w == 2) {
                    m6511C(motionEvent.getY());
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo5221b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f3989v;
        if (i == 1) {
            boolean u = mo5451u(motionEvent.getX(), motionEvent.getY());
            boolean t = mo5450t(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!u && !t) {
                return false;
            }
            if (t) {
                this.f3990w = 1;
                this.f3983p = (float) ((int) motionEvent.getX());
            } else if (u) {
                this.f3990w = 2;
                this.f3980m = (float) ((int) motionEvent.getY());
            }
            mo5453y(2);
        } else if (i == 2) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public void mo5222c(boolean z) {
    }

    /* renamed from: i */
    public void mo5113i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1330a0 a0Var) {
        if (this.f3984q != this.f3986s.getWidth() || this.f3985r != this.f3986s.getHeight()) {
            this.f3984q = this.f3986s.getWidth();
            this.f3985r = this.f3986s.getHeight();
            mo5453y(0);
        } else if (this.f3965A != 0) {
            if (this.f3987t) {
                m6515n(canvas);
            }
            if (this.f3988u) {
                m6514m(canvas);
            }
        }
    }

    /* renamed from: j */
    public void mo5448j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3986s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m6513l();
            }
            this.f3986s = recyclerView;
            if (recyclerView != null) {
                m6522z();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo5449q(int i) {
        int i2 = this.f3965A;
        if (i2 == 1) {
            this.f3993z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f3965A = 3;
        ValueAnimator valueAnimator = this.f3993z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f3993z.setDuration((long) i);
        this.f3993z.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo5450t(float f, float f2) {
        if (f2 >= ((float) (this.f3985r - this.f3976i))) {
            int i = this.f3982o;
            int i2 = this.f3981n;
            return f >= ((float) (i - (i2 / 2))) && f <= ((float) (i + (i2 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo5451u(float f, float f2) {
        if (!m6519s() ? f >= ((float) (this.f3984q - this.f3972e)) : f <= ((float) (this.f3972e / 2))) {
            int i = this.f3979l;
            int i2 = this.f3978k;
            return f2 >= ((float) (i - (i2 / 2))) && f2 <= ((float) (i + (i2 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo5452v() {
        this.f3986s.invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo5453y(int i) {
        if (i == 2 && this.f3989v != 2) {
            this.f3970c.setState(f3963D);
            m6512k();
        }
        if (i == 0) {
            mo5452v();
        } else {
            mo5446A();
        }
        if (this.f3989v == 2 && i != 2) {
            this.f3970c.setState(f3964E);
            m6520w(1200);
        } else if (i == 1) {
            m6520w(1500);
        }
        this.f3989v = i;
    }
}
