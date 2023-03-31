package p226ee;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;

/* renamed from: ee.j */
/* compiled from: ViewFinderView */
public class C10123j extends View implements C10120g {

    /* renamed from: x */
    private static final int[] f40212x = {0, 64, 128, 192, 255, 192, 128, 64};

    /* renamed from: a */
    private Rect f40213a;

    /* renamed from: b */
    private int f40214b;

    /* renamed from: c */
    private final int f40215c = getResources().getColor(C10121h.viewfinder_laser);

    /* renamed from: d */
    private final int f40216d = getResources().getColor(C10121h.viewfinder_mask);

    /* renamed from: e */
    private final int f40217e = getResources().getColor(C10121h.viewfinder_border);

    /* renamed from: f */
    private final int f40218f = getResources().getInteger(C10122i.viewfinder_border_width);

    /* renamed from: g */
    private final int f40219g = getResources().getInteger(C10122i.viewfinder_border_length);

    /* renamed from: h */
    protected Paint f40220h;

    /* renamed from: i */
    protected Paint f40221i;

    /* renamed from: r */
    protected Paint f40222r;

    /* renamed from: s */
    protected int f40223s;

    /* renamed from: t */
    protected boolean f40224t;

    /* renamed from: u */
    private boolean f40225u;

    /* renamed from: v */
    private float f40226v;

    /* renamed from: w */
    private int f40227w = 0;

    public C10123j(Context context) {
        super(context);
        m51457e();
    }

    /* renamed from: e */
    private void m51457e() {
        Paint paint = new Paint();
        this.f40220h = paint;
        paint.setColor(this.f40215c);
        this.f40220h.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f40221i = paint2;
        paint2.setColor(this.f40216d);
        Paint paint3 = new Paint();
        this.f40222r = paint3;
        paint3.setColor(this.f40217e);
        this.f40222r.setStyle(Paint.Style.STROKE);
        this.f40222r.setStrokeWidth((float) this.f40218f);
        this.f40222r.setAntiAlias(true);
        this.f40223s = this.f40219g;
    }

    /* renamed from: a */
    public void mo32767a() {
        mo32784f();
        invalidate();
    }

    /* renamed from: b */
    public void mo32781b(Canvas canvas) {
        Rect framingRect = getFramingRect();
        Paint paint = this.f40220h;
        int[] iArr = f40212x;
        paint.setAlpha(iArr[this.f40214b]);
        this.f40214b = (this.f40214b + 1) % iArr.length;
        int height = (framingRect.height() / 2) + framingRect.top;
        canvas.drawRect((float) (framingRect.left + 2), (float) (height - 1), (float) (framingRect.right - 1), (float) (height + 2), this.f40220h);
        postInvalidateDelayed(80, framingRect.left - 10, framingRect.top - 10, framingRect.right + 10, framingRect.bottom + 10);
    }

    /* renamed from: c */
    public void mo32782c(Canvas canvas) {
        Rect framingRect = getFramingRect();
        Path path = new Path();
        path.moveTo((float) framingRect.left, (float) (framingRect.top + this.f40223s));
        path.lineTo((float) framingRect.left, (float) framingRect.top);
        path.lineTo((float) (framingRect.left + this.f40223s), (float) framingRect.top);
        canvas.drawPath(path, this.f40222r);
        path.moveTo((float) framingRect.right, (float) (framingRect.top + this.f40223s));
        path.lineTo((float) framingRect.right, (float) framingRect.top);
        path.lineTo((float) (framingRect.right - this.f40223s), (float) framingRect.top);
        canvas.drawPath(path, this.f40222r);
        path.moveTo((float) framingRect.right, (float) (framingRect.bottom - this.f40223s));
        path.lineTo((float) framingRect.right, (float) framingRect.bottom);
        path.lineTo((float) (framingRect.right - this.f40223s), (float) framingRect.bottom);
        canvas.drawPath(path, this.f40222r);
        path.moveTo((float) framingRect.left, (float) (framingRect.bottom - this.f40223s));
        path.lineTo((float) framingRect.left, (float) framingRect.bottom);
        path.lineTo((float) (framingRect.left + this.f40223s), (float) framingRect.bottom);
        canvas.drawPath(path, this.f40222r);
    }

    /* renamed from: d */
    public void mo32783d(Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        Rect framingRect = getFramingRect();
        float f = (float) width;
        canvas.drawRect(0.0f, 0.0f, f, (float) framingRect.top, this.f40221i);
        canvas.drawRect(0.0f, (float) framingRect.top, (float) framingRect.left, (float) (framingRect.bottom + 1), this.f40221i);
        Canvas canvas2 = canvas;
        float f2 = f;
        canvas2.drawRect((float) (framingRect.right + 1), (float) framingRect.top, f2, (float) (framingRect.bottom + 1), this.f40221i);
        canvas2.drawRect(0.0f, (float) (framingRect.bottom + 1), f2, (float) height, this.f40221i);
    }

    /* renamed from: f */
    public synchronized void mo32784f() {
        int i;
        int i2;
        int i3;
        Point point = new Point(getWidth(), getHeight());
        int a = C10119f.m51455a(getContext());
        if (this.f40224t) {
            if (a != 1) {
                i3 = getHeight();
            } else {
                i3 = getWidth();
            }
            i2 = (int) (((float) i3) * 0.625f);
            i = i2;
        } else if (a != 1) {
            int height = (int) (((float) getHeight()) * 0.625f);
            i = height;
            i2 = (int) (((float) height) * 1.4f);
        } else {
            i2 = (int) (((float) getWidth()) * 0.75f);
            i = (int) (((float) i2) * 0.75f);
        }
        if (i2 > getWidth()) {
            i2 = getWidth() - 50;
        }
        if (i > getHeight()) {
            i = getHeight() - 50;
        }
        int i4 = (point.x - i2) / 2;
        int i5 = (point.y - i) / 2;
        int i6 = this.f40227w;
        this.f40213a = new Rect(i4 + i6, i5 + i6, (i4 + i2) - i6, (i5 + i) - i6);
    }

    public Rect getFramingRect() {
        return this.f40213a;
    }

    public void onDraw(Canvas canvas) {
        if (getFramingRect() != null) {
            mo32783d(canvas);
            mo32782c(canvas);
            if (this.f40225u) {
                mo32781b(canvas);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        mo32784f();
    }

    public void setBorderAlpha(float f) {
        this.f40226v = f;
        this.f40222r.setAlpha((int) (255.0f * f));
    }

    public void setBorderColor(int i) {
        this.f40222r.setColor(i);
    }

    public void setBorderCornerRadius(int i) {
        this.f40222r.setPathEffect(new CornerPathEffect((float) i));
    }

    public void setBorderCornerRounded(boolean z) {
        if (z) {
            this.f40222r.setStrokeJoin(Paint.Join.ROUND);
        } else {
            this.f40222r.setStrokeJoin(Paint.Join.BEVEL);
        }
    }

    public void setBorderLineLength(int i) {
        this.f40223s = i;
    }

    public void setBorderStrokeWidth(int i) {
        this.f40222r.setStrokeWidth((float) i);
    }

    public void setLaserColor(int i) {
        this.f40220h.setColor(i);
    }

    public void setLaserEnabled(boolean z) {
        this.f40225u = z;
    }

    public void setMaskColor(int i) {
        this.f40221i.setColor(i);
    }

    public void setSquareViewFinder(boolean z) {
        this.f40224t = z;
    }

    public void setViewFinderOffset(int i) {
        this.f40227w = i;
    }
}
