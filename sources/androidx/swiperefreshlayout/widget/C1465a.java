package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.C0835a0;
import p132s0.C5472a;

/* renamed from: androidx.swiperefreshlayout.widget.a */
/* compiled from: CircleImageView */
class C1465a extends ImageView {

    /* renamed from: a */
    private Animation.AnimationListener f4194a;

    /* renamed from: b */
    private int f4195b;

    /* renamed from: c */
    private int f4196c;

    /* renamed from: androidx.swiperefreshlayout.widget.a$a */
    /* compiled from: CircleImageView */
    private static class C1466a extends OvalShape {

        /* renamed from: a */
        private Paint f4197a = new Paint();

        /* renamed from: b */
        private int f4198b;

        /* renamed from: c */
        private C1465a f4199c;

        C1466a(C1465a aVar, int i) {
            this.f4199c = aVar;
            this.f4198b = i;
            m6843a((int) rect().width());
        }

        /* renamed from: a */
        private void m6843a(int i) {
            float f = (float) (i / 2);
            this.f4197a.setShader(new RadialGradient(f, f, (float) this.f4198b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = this.f4199c.getWidth() / 2;
            float f = (float) width;
            float height = (float) (this.f4199c.getHeight() / 2);
            canvas.drawCircle(f, height, f, this.f4197a);
            canvas.drawCircle(f, height, (float) (width - this.f4198b), paint);
        }

        /* access modifiers changed from: protected */
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            m6843a((int) f);
        }
    }

    C1465a(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int) (1.75f * f);
        int i2 = (int) (0.0f * f);
        this.f4195b = (int) (3.5f * f);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(C5472a.f27814f);
        this.f4196c = obtainStyledAttributes.getColor(C5472a.f27815g, -328966);
        obtainStyledAttributes.recycle();
        if (m6841a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C0835a0.m3757v0(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C1466a(this, this.f4195b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f4195b, (float) i2, (float) i, 503316480);
            int i3 = this.f4195b;
            setPadding(i3, i3, i3, i3);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f4196c);
        C0835a0.m3749r0(this, shapeDrawable);
    }

    /* renamed from: a */
    private boolean m6841a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    /* renamed from: b */
    public void mo5653b(Animation.AnimationListener animationListener) {
        this.f4194a = animationListener;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f4194a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f4194a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m6841a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f4195b * 2), getMeasuredHeight() + (this.f4195b * 2));
        }
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
            this.f4196c = i;
        }
    }
}
