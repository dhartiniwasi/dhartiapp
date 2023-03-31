package com.startapp.sdk.ads.list3d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Adapter;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.startapp.C8837b0;
import com.startapp.C9577u2;
import com.startapp.C9580u5;
import com.startapp.C9598v5;
import java.util.LinkedList;

/* compiled from: Sta */
public class List3DView extends AdapterView<Adapter> {

    /* renamed from: a */
    public Adapter f38335a;

    /* renamed from: b */
    public int f38336b = 0;

    /* renamed from: c */
    public int f38337c;

    /* renamed from: d */
    public int f38338d;

    /* renamed from: e */
    public int f38339e;

    /* renamed from: f */
    public int f38340f;

    /* renamed from: g */
    public int f38341g;

    /* renamed from: h */
    public int f38342h;

    /* renamed from: i */
    public int f38343i;

    /* renamed from: j */
    public int f38344j;

    /* renamed from: k */
    public VelocityTracker f38345k;

    /* renamed from: l */
    public C9577u2 f38346l;

    /* renamed from: m */
    public Runnable f38347m;

    /* renamed from: n */
    public final LinkedList<View> f38348n = new LinkedList<>();

    /* renamed from: o */
    public Runnable f38349o;

    /* renamed from: p */
    public Rect f38350p;

    /* renamed from: q */
    public Camera f38351q;

    /* renamed from: r */
    public Matrix f38352r;

    /* renamed from: s */
    public Paint f38353s;

    /* renamed from: t */
    public int f38354t = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: u */
    public boolean f38355u = false;

    /* renamed from: v */
    public boolean f38356v = false;

    /* renamed from: w */
    public boolean f38357w = false;

    /* renamed from: x */
    public boolean f38358x = false;

    public List3DView(Context context, AttributeSet attributeSet, String str, String str2) {
        super(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final boolean mo30126a() {
        int i = C8837b0.f36438a;
        return Build.VERSION.SDK_INT >= 12;
    }

    /* renamed from: b */
    public int mo30127b(int i, int i2) {
        if (this.f38350p == null) {
            this.f38350p = new Rect();
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            getChildAt(i3).getHitRect(this.f38350p);
            if (this.f38350p.contains(i, i2)) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public final int mo30129c(View view) {
        return (int) ((((float) view.getMeasuredHeight()) * 0.35000002f) / 2.0f);
    }

    /* renamed from: d */
    public int mo30130d(View view) {
        return view.getTop() - mo30129c(view);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        Bitmap drawingCache = view.getDrawingCache();
        if (drawingCache == null) {
            return super.drawChild(canvas, view, j);
        }
        int top = view.getTop();
        int left = view.getLeft();
        int width = view.getWidth() / 2;
        int height = view.getHeight() / 2;
        float height2 = (float) (getHeight() / 2);
        float f = (((float) (top + height)) - height2) / height2;
        float cos = (float) (1.0d - ((1.0d - Math.cos((double) f)) * 0.15000000596046448d));
        float f2 = (((float) this.f38342h) - (f * 20.0f)) % 90.0f;
        if (f2 < 0.0f) {
            f2 += 90.0f;
        }
        float f3 = f2;
        if (f3 < 45.0f) {
            Canvas canvas2 = canvas;
            Bitmap bitmap = drawingCache;
            int i = top;
            int i2 = left;
            int i3 = width;
            int i4 = height;
            float f4 = cos;
            mo30124a(canvas2, bitmap, i, i2, i3, i4, f4, f3 - 90.0f);
            mo30124a(canvas2, bitmap, i, i2, i3, i4, f4, f3);
            return false;
        }
        Canvas canvas3 = canvas;
        Bitmap bitmap2 = drawingCache;
        int i5 = top;
        int i6 = left;
        int i7 = width;
        int i8 = height;
        float f5 = cos;
        mo30124a(canvas3, bitmap2, i5, i6, i7, i8, f5, f3);
        mo30124a(canvas3, bitmap2, i5, i6, i7, i8, f5, f3 - 90.0f);
        return false;
    }

    public Adapter getAdapter() {
        return this.f38335a;
    }

    public View getSelectedView() {
        return null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f38347m);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f38355u && this.f38335a != null) {
            if (getChildCount() == 0) {
                if (this.f38357w) {
                    this.f38340f = getHeight() / 3;
                }
                this.f38344j = -1;
                mo30123a(this.f38340f, 0);
            } else {
                int d = (this.f38340f + this.f38341g) - mo30130d(getChildAt(0));
                int childCount = getChildCount();
                if (this.f38344j != this.f38335a.getCount() - 1 && childCount > 1) {
                    View childAt = getChildAt(0);
                    while (childAt != null && mo30120a(childAt) + d < 0) {
                        removeViewInLayout(childAt);
                        childCount--;
                        this.f38348n.addLast(childAt);
                        this.f38343i++;
                        this.f38341g = mo30128b(childAt) + this.f38341g;
                        childAt = childCount > 1 ? getChildAt(0) : null;
                    }
                }
                if (this.f38343i != 0 && childCount > 1) {
                    View childAt2 = getChildAt(childCount - 1);
                    while (childAt2 != null && mo30130d(childAt2) + d > getHeight()) {
                        removeViewInLayout(childAt2);
                        childCount--;
                        this.f38348n.addLast(childAt2);
                        this.f38344j--;
                        childAt2 = childCount > 1 ? getChildAt(childCount - 1) : null;
                    }
                }
                mo30123a(mo30120a(getChildAt(getChildCount() - 1)), d);
                int d2 = mo30130d(getChildAt(0));
                while (d2 + d > 0 && (i5 = this.f38343i) > 0) {
                    int i6 = i5 - 1;
                    this.f38343i = i6;
                    View view = this.f38335a.getView(i6, this.f38348n.size() != 0 ? this.f38348n.removeFirst() : null, this);
                    mo30125a(view, 1);
                    int b = mo30128b(view);
                    d2 -= b;
                    this.f38341g -= b;
                }
            }
            int i7 = this.f38340f + this.f38341g;
            float width = ((float) getWidth()) * 0.0f;
            float height = 1.0f / (((float) getHeight()) * 0.9f);
            for (int i8 = 0; i8 < getChildCount(); i8++) {
                View childAt3 = getChildAt(i8);
                int sin = (int) (Math.sin(((double) height) * 6.283185307179586d * ((double) i7)) * ((double) width));
                int measuredWidth = childAt3.getMeasuredWidth();
                int measuredHeight = childAt3.getMeasuredHeight();
                int width2 = ((getWidth() - measuredWidth) / 2) + sin;
                int c = mo30129c(childAt3);
                int i9 = i7 + c;
                childAt3.layout(width2, i9, measuredWidth + width2, i9 + measuredHeight);
                i7 += (c * 2) + measuredHeight;
            }
            if (this.f38357w && !this.f38358x) {
                this.f38358x = true;
                dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 0, 0.0f, 0.0f, 0));
                postDelayed(new C9580u5(this), 5);
            }
            invalidate();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r1 <= (r0 + 10)) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r6.getChildCount()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            int r0 = r7.getAction()
            r2 = 1
            if (r0 == 0) goto L_0x0097
            r1 = 0
            r3 = 2
            if (r0 == r2) goto L_0x0059
            if (r0 == r3) goto L_0x001a
            r6.mo30121a((float) r1)
            goto L_0x00f9
        L_0x001a:
            int r0 = r6.f38336b
            if (r0 != r2) goto L_0x0043
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            int r4 = r6.f38337c
            int r5 = r4 + -10
            if (r0 < r5) goto L_0x003c
            int r4 = r4 + 10
            if (r0 > r4) goto L_0x003c
            int r0 = r6.f38338d
            int r4 = r0 + -10
            if (r1 < r4) goto L_0x003c
            int r0 = r0 + 10
            if (r1 <= r0) goto L_0x0043
        L_0x003c:
            java.lang.Runnable r0 = r6.f38349o
            r6.removeCallbacks(r0)
            r6.f38336b = r3
        L_0x0043:
            int r0 = r6.f38336b
            if (r0 != r3) goto L_0x00f9
            android.view.VelocityTracker r0 = r6.f38345k
            r0.addMovement(r7)
            float r7 = r7.getY()
            int r7 = (int) r7
            int r0 = r6.f38338d
            int r7 = r7 - r0
            r6.mo30122a((int) r7)
            goto L_0x00f9
        L_0x0059:
            int r0 = r6.f38336b
            if (r0 != r2) goto L_0x007f
            float r0 = r7.getX()
            int r0 = (int) r0
            float r7 = r7.getY()
            int r7 = (int) r7
            int r7 = r6.mo30127b(r0, r7)
            r0 = -1
            if (r7 == r0) goto L_0x0093
            android.view.View r0 = r6.getChildAt(r7)
            int r3 = r6.f38343i
            int r3 = r3 + r7
            android.widget.Adapter r7 = r6.f38335a
            long r4 = r7.getItemId(r3)
            r6.performItemClick(r0, r3, r4)
            goto L_0x0093
        L_0x007f:
            if (r0 != r3) goto L_0x0093
            android.view.VelocityTracker r0 = r6.f38345k
            r0.addMovement(r7)
            android.view.VelocityTracker r7 = r6.f38345k
            r0 = 1000(0x3e8, float:1.401E-42)
            r7.computeCurrentVelocity(r0)
            android.view.VelocityTracker r7 = r6.f38345k
            float r1 = r7.getYVelocity()
        L_0x0093:
            r6.mo30121a((float) r1)
            goto L_0x00f9
        L_0x0097:
            boolean r0 = r6.mo30126a()
            if (r0 == 0) goto L_0x00b9
            r3 = 1500(0x5dc, double:7.41E-321)
            int r0 = com.startapp.C8837b0.f36438a
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 12
            if (r0 < r5) goto L_0x00b9
            android.view.ViewPropertyAnimator r0 = r6.animate()
            r5 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r5)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r3)
            r3 = 0
            r0.setListener(r3)
        L_0x00b9:
            java.lang.Runnable r0 = r6.f38347m
            r6.removeCallbacks(r0)
            float r0 = r7.getX()
            int r0 = (int) r0
            r6.f38337c = r0
            float r0 = r7.getY()
            int r0 = (int) r0
            r6.f38338d = r0
            android.view.View r0 = r6.getChildAt(r1)
            int r0 = r6.mo30130d(r0)
            int r1 = r6.f38341g
            int r0 = r0 - r1
            r6.f38339e = r0
            java.lang.Runnable r0 = r6.f38349o
            if (r0 != 0) goto L_0x00e4
            com.startapp.w5 r0 = new com.startapp.w5
            r0.<init>(r6)
            r6.f38349o = r0
        L_0x00e4:
            java.lang.Runnable r0 = r6.f38349o
            int r1 = android.view.ViewConfiguration.getLongPressTimeout()
            long r3 = (long) r1
            r6.postDelayed(r0, r3)
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f38345k = r0
            r0.addMovement(r7)
            r6.f38336b = r2
        L_0x00f9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.list3d.List3DView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAdapter(Adapter adapter) {
        if (mo30126a() && this.f38356v) {
            int i = C8837b0.f36438a;
            if (Build.VERSION.SDK_INT >= 11) {
                setAlpha(0.0f);
            }
        }
        this.f38335a = adapter;
        removeAllViewsInLayout();
        requestLayout();
    }

    public void setDynamics(C9577u2 u2Var) {
        C9577u2 u2Var2 = this.f38346l;
        if (u2Var2 != null) {
            float f = u2Var2.f39241a;
            float f2 = u2Var2.f39242b;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            u2Var.f39242b = f2;
            u2Var.f39241a = f;
            u2Var.f39245e = currentAnimationTimeMillis;
        }
        this.f38346l = u2Var;
    }

    public void setFade(boolean z) {
        this.f38356v = z;
    }

    public void setHint(boolean z) {
        this.f38357w = z;
    }

    public void setSelection(int i) {
        throw new UnsupportedOperationException();
    }

    public void setStarted() {
        this.f38355u = true;
    }

    public void setTag(String str) {
    }

    /* renamed from: a */
    public final void mo30124a(Canvas canvas, Bitmap bitmap, int i, int i2, int i3, int i4, float f, float f2) {
        if (this.f38351q == null) {
            this.f38351q = new Camera();
        }
        this.f38351q.save();
        this.f38351q.translate(0.0f, 0.0f, (float) i4);
        this.f38351q.rotateX(f2);
        float f3 = (float) (-i4);
        this.f38351q.translate(0.0f, 0.0f, f3);
        if (this.f38352r == null) {
            this.f38352r = new Matrix();
        }
        this.f38351q.getMatrix(this.f38352r);
        this.f38351q.restore();
        this.f38352r.preTranslate((float) (-i3), f3);
        this.f38352r.postScale(f, f);
        this.f38352r.postTranslate((float) (i2 + i3), (float) (i + i4));
        if (this.f38353s == null) {
            Paint paint = new Paint();
            this.f38353s = paint;
            paint.setAntiAlias(true);
            this.f38353s.setFilterBitmap(true);
        }
        Paint paint2 = this.f38353s;
        double cos = Math.cos((((double) f2) * 3.141592653589793d) / 180.0d);
        int i5 = ((int) (cos * 200.0d)) + 55;
        int pow = (int) (Math.pow(cos, 200.0d) * 70.0d);
        if (i5 > 255) {
            i5 = 255;
        }
        if (pow > 255) {
            pow = 255;
        }
        paint2.setColorFilter(new LightingColorFilter(Color.rgb(i5, i5, i5), Color.rgb(pow, pow, pow)));
        canvas.drawBitmap(bitmap, this.f38352r, this.f38353s);
    }

    /* renamed from: b */
    public final int mo30128b(View view) {
        return (mo30129c(view) * 2) + view.getMeasuredHeight();
    }

    /* renamed from: a */
    public final void mo30121a(float f) {
        VelocityTracker velocityTracker = this.f38345k;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f38345k = null;
            removeCallbacks(this.f38349o);
            if (this.f38347m == null) {
                this.f38347m = new C9598v5(this);
            }
            C9577u2 u2Var = this.f38346l;
            if (u2Var != null) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                u2Var.f39242b = f;
                u2Var.f39241a = (float) this.f38340f;
                u2Var.f39245e = currentAnimationTimeMillis;
                post(this.f38347m);
            }
            this.f38336b = 0;
        }
    }

    /* renamed from: a */
    public void mo30122a(int i) {
        int i2;
        int i3 = this.f38339e + i;
        this.f38340f = i3;
        int height = (-(i3 * 270)) / getHeight();
        this.f38342h = height;
        int i4 = height % 90;
        if (i4 < 45) {
            i2 = (getHeight() * (-(height - i4))) / 270;
        } else {
            i2 = (getHeight() * (-((height + 90) - i4))) / 270;
        }
        if (this.f38354t == Integer.MIN_VALUE && this.f38344j == this.f38335a.getCount() - 1 && mo30120a(getChildAt(getChildCount() - 1)) < getHeight()) {
            this.f38354t = i2;
        }
        if (i2 > 0) {
            i2 = 0;
        } else {
            int i5 = this.f38354t;
            if (i2 < i5) {
                i2 = i5;
            }
        }
        C9577u2 u2Var = this.f38346l;
        float f = (float) i2;
        u2Var.f39243c = f;
        u2Var.f39244d = f;
        requestLayout();
    }

    /* renamed from: a */
    public final void mo30123a(int i, int i2) {
        while (i + i2 < getHeight() && this.f38344j < this.f38335a.getCount() - 1) {
            int i3 = this.f38344j + 1;
            this.f38344j = i3;
            View view = this.f38335a.getView(i3, this.f38348n.size() != 0 ? this.f38348n.removeFirst() : null, this);
            mo30125a(view, 0);
            i += mo30128b(view);
        }
    }

    /* renamed from: a */
    public final void mo30125a(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        int i2 = i == 1 ? 0 : -1;
        view.setDrawingCacheEnabled(true);
        addViewInLayout(view, i2, layoutParams, true);
        view.measure(((int) (((float) getWidth()) * 0.85f)) | 1073741824, 0);
    }

    /* renamed from: a */
    public final int mo30120a(View view) {
        return mo30129c(view) + view.getBottom();
    }
}
