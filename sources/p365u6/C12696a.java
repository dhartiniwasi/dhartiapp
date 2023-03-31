package p365u6;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.core.graphics.C0723b;

/* renamed from: u6.a */
/* compiled from: ShadowRenderer */
public class C12696a {

    /* renamed from: h */
    private static final int[] f46459h = new int[3];

    /* renamed from: i */
    private static final float[] f46460i = {0.0f, 0.5f, 1.0f};

    /* renamed from: j */
    private static final int[] f46461j = new int[4];

    /* renamed from: k */
    private static final float[] f46462k = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    private final Paint f46463a;

    /* renamed from: b */
    private final Paint f46464b;

    /* renamed from: c */
    private final Paint f46465c;

    /* renamed from: d */
    private int f46466d;

    /* renamed from: e */
    private int f46467e;

    /* renamed from: f */
    private int f46468f;

    /* renamed from: g */
    private final Path f46469g;

    public C12696a() {
        this(-16777216);
    }

    /* renamed from: a */
    public void mo37568a(Canvas canvas, Matrix matrix, RectF rectF, int i, float f, float f2) {
        RectF rectF2 = rectF;
        int i2 = i;
        float f3 = f2;
        boolean z = f3 < 0.0f;
        Path path = this.f46469g;
        if (z) {
            int[] iArr = f46461j;
            iArr[0] = 0;
            iArr[1] = this.f46468f;
            iArr[2] = this.f46467e;
            iArr[3] = this.f46466d;
            float f4 = f;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF2, f, f3);
            path.close();
            float f5 = (float) (-i2);
            rectF2.inset(f5, f5);
            int[] iArr2 = f46461j;
            iArr2[0] = 0;
            iArr2[1] = this.f46466d;
            iArr2[2] = this.f46467e;
            iArr2[3] = this.f46468f;
        }
        float width = 1.0f - (((float) i2) / (rectF.width() / 2.0f));
        float[] fArr = f46462k;
        fArr[1] = width;
        fArr[2] = ((1.0f - width) / 2.0f) + width;
        this.f46464b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, f46461j, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        } else {
            Canvas canvas2 = canvas;
        }
        canvas.drawArc(rectF, f, f2, true, this.f46464b);
        canvas.restore();
    }

    /* renamed from: b */
    public void mo37569b(Canvas canvas, Matrix matrix, RectF rectF, int i) {
        rectF.bottom += (float) i;
        rectF.offset(0.0f, (float) (-i));
        int[] iArr = f46459h;
        iArr[0] = this.f46468f;
        iArr[1] = this.f46467e;
        iArr[2] = this.f46466d;
        Paint paint = this.f46465c;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, f46460i, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f46465c);
        canvas.restore();
    }

    /* renamed from: c */
    public Paint mo37570c() {
        return this.f46463a;
    }

    /* renamed from: d */
    public void mo37571d(int i) {
        this.f46466d = C0723b.m3315f(i, 68);
        this.f46467e = C0723b.m3315f(i, 20);
        this.f46468f = C0723b.m3315f(i, 0);
    }

    public C12696a(int i) {
        this.f46469g = new Path();
        mo37571d(i);
        Paint paint = new Paint(4);
        this.f46464b = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f46463a = paint2;
        paint2.setColor(this.f46466d);
        this.f46465c = new Paint(paint);
    }
}
