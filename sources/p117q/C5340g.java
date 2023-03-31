package p117q;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: q.g */
/* compiled from: RoundRectDrawable */
class C5340g extends Drawable {

    /* renamed from: a */
    private float f27366a;

    /* renamed from: b */
    private final Paint f27367b;

    /* renamed from: c */
    private final RectF f27368c;

    /* renamed from: d */
    private final Rect f27369d;

    /* renamed from: e */
    private float f27370e;

    /* renamed from: f */
    private boolean f27371f = false;

    /* renamed from: g */
    private boolean f27372g = true;

    /* renamed from: h */
    private ColorStateList f27373h;

    /* renamed from: i */
    private PorterDuffColorFilter f27374i;

    /* renamed from: j */
    private ColorStateList f27375j;

    /* renamed from: k */
    private PorterDuff.Mode f27376k = PorterDuff.Mode.SRC_IN;

    C5340g(ColorStateList colorStateList, float f) {
        this.f27366a = f;
        this.f27367b = new Paint(5);
        m32733e(colorStateList);
        this.f27368c = new RectF();
        this.f27369d = new Rect();
    }

    /* renamed from: a */
    private PorterDuffColorFilter m32732a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: e */
    private void m32733e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f27373h = colorStateList;
        this.f27367b.setColor(colorStateList.getColorForState(getState(), this.f27373h.getDefaultColor()));
    }

    /* renamed from: i */
    private void m32734i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f27368c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f27369d.set(rect);
        if (this.f27371f) {
            float d = C5341h.m32744d(this.f27370e, this.f27366a, this.f27372g);
            this.f27369d.inset((int) Math.ceil((double) C5341h.m32743c(this.f27370e, this.f27366a, this.f27372g)), (int) Math.ceil((double) d));
            this.f27368c.set(this.f27369d);
        }
    }

    /* renamed from: b */
    public ColorStateList mo19346b() {
        return this.f27373h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo19347c() {
        return this.f27370e;
    }

    /* renamed from: d */
    public float mo19348d() {
        return this.f27366a;
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f27367b;
        if (this.f27374i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f27374i);
            z = true;
        }
        RectF rectF = this.f27368c;
        float f = this.f27366a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    /* renamed from: f */
    public void mo19350f(ColorStateList colorStateList) {
        m32733e(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo19351g(float f, boolean z, boolean z2) {
        if (f != this.f27370e || this.f27371f != z || this.f27372g != z2) {
            this.f27370e = f;
            this.f27371f = z;
            this.f27372g = z2;
            m32734i((Rect) null);
            invalidateSelf();
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f27369d, this.f27366a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo19354h(float f) {
        if (f != this.f27366a) {
            this.f27366a = f;
            m32734i((Rect) null);
            invalidateSelf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f27373h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f27375j
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f27373h
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p117q.C5340g.isStateful():boolean");
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m32734i(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f27373h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f27367b.getColor();
        if (z) {
            this.f27367b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f27375j;
        if (colorStateList2 == null || (mode = this.f27376k) == null) {
            return z;
        }
        this.f27374i = m32732a(colorStateList2, mode);
        return true;
    }

    public void setAlpha(int i) {
        this.f27367b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f27367b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f27375j = colorStateList;
        this.f27374i = m32732a(colorStateList, this.f27376k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f27376k = mode;
        this.f27374i = m32732a(this.f27375j, mode);
        invalidateSelf();
    }
}
