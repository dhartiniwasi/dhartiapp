package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import p375v6.C12822g;
import p375v6.C12829k;

/* renamed from: com.google.android.material.textfield.c */
/* compiled from: CutoutDrawable */
class C7739c extends C12822g {

    /* renamed from: E */
    private final Paint f33966E;

    /* renamed from: F */
    private final RectF f33967F;

    /* renamed from: G */
    private int f33968G;

    C7739c() {
        this((C12829k) null);
    }

    /* renamed from: g0 */
    private void m43058g0(Canvas canvas) {
        if (!m43062n0(getCallback())) {
            canvas.restoreToCount(this.f33968G);
        }
    }

    /* renamed from: h0 */
    private void m43059h0(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (m43062n0(callback)) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, (Paint) null);
                return;
            }
            return;
        }
        m43060j0(canvas);
    }

    /* renamed from: j0 */
    private void m43060j0(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f33968G = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null);
            return;
        }
        this.f33968G = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null, 31);
    }

    /* renamed from: m0 */
    private void m43061m0() {
        this.f33966E.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f33966E.setColor(-1);
        this.f33966E.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* renamed from: n0 */
    private boolean m43062n0(Drawable.Callback callback) {
        return callback instanceof View;
    }

    public void draw(Canvas canvas) {
        m43059h0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f33967F, this.f33966E);
        m43058g0(canvas);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public boolean mo25915f0() {
        return !this.f33967F.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public void mo25916i0() {
        mo25917k0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public void mo25917k0(float f, float f2, float f3, float f4) {
        RectF rectF = this.f33967F;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public void mo25918l0(RectF rectF) {
        mo25917k0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7739c(C12829k kVar) {
        super(kVar == null ? new C12829k() : kVar);
        this.f33966E = new Paint(1);
        m43061m0();
        this.f33967F = new RectF();
    }
}
