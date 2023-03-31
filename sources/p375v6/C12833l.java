package p375v6;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: v6.l */
/* compiled from: ShapeAppearancePathProvider */
public class C12833l {

    /* renamed from: a */
    private final C12836m[] f46899a = new C12836m[4];

    /* renamed from: b */
    private final Matrix[] f46900b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f46901c = new Matrix[4];

    /* renamed from: d */
    private final PointF f46902d = new PointF();

    /* renamed from: e */
    private final C12836m f46903e = new C12836m();

    /* renamed from: f */
    private final float[] f46904f = new float[2];

    /* renamed from: g */
    private final float[] f46905g = new float[2];

    /* renamed from: v6.l$a */
    /* compiled from: ShapeAppearancePathProvider */
    public interface C12834a {
        /* renamed from: a */
        void mo37770a(C12836m mVar, Matrix matrix, int i);

        /* renamed from: b */
        void mo37771b(C12836m mVar, Matrix matrix, int i);
    }

    /* renamed from: v6.l$b */
    /* compiled from: ShapeAppearancePathProvider */
    static final class C12835b {

        /* renamed from: a */
        public final C12829k f46906a;

        /* renamed from: b */
        public final Path f46907b;

        /* renamed from: c */
        public final RectF f46908c;

        /* renamed from: d */
        public final C12834a f46909d;

        /* renamed from: e */
        public final float f46910e;

        C12835b(C12829k kVar, float f, RectF rectF, C12834a aVar, Path path) {
            this.f46909d = aVar;
            this.f46906a = kVar;
            this.f46910e = f;
            this.f46908c = rectF;
            this.f46907b = path;
        }
    }

    public C12833l() {
        for (int i = 0; i < 4; i++) {
            this.f46899a[i] = new C12836m();
            this.f46900b[i] = new Matrix();
            this.f46901c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    private float m60685a(int i) {
        return (float) ((i + 1) * 90);
    }

    /* renamed from: b */
    private void m60686b(C12835b bVar, int i) {
        this.f46904f[0] = this.f46899a[i].mo37818j();
        this.f46904f[1] = this.f46899a[i].mo37819k();
        this.f46900b[i].mapPoints(this.f46904f);
        if (i == 0) {
            Path path = bVar.f46907b;
            float[] fArr = this.f46904f;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = bVar.f46907b;
            float[] fArr2 = this.f46904f;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f46899a[i].mo37814d(this.f46900b[i], bVar.f46907b);
        C12834a aVar = bVar.f46909d;
        if (aVar != null) {
            aVar.mo37771b(this.f46899a[i], this.f46900b[i], i);
        }
    }

    /* renamed from: c */
    private void m60687c(C12835b bVar, int i) {
        int i2 = (i + 1) % 4;
        this.f46904f[0] = this.f46899a[i].mo37816h();
        this.f46904f[1] = this.f46899a[i].mo37817i();
        this.f46900b[i].mapPoints(this.f46904f);
        this.f46905g[0] = this.f46899a[i2].mo37818j();
        this.f46905g[1] = this.f46899a[i2].mo37819k();
        this.f46900b[i2].mapPoints(this.f46905g);
        float[] fArr = this.f46904f;
        float f = fArr[0];
        float[] fArr2 = this.f46905g;
        float max = Math.max(((float) Math.hypot((double) (f - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
        float i3 = m60691i(bVar.f46908c, i);
        this.f46903e.mo37821m(0.0f, 0.0f);
        m60692j(i, bVar.f46906a).mo24929a(max, i3, bVar.f46910e, this.f46903e);
        this.f46903e.mo37814d(this.f46901c[i], bVar.f46907b);
        C12834a aVar = bVar.f46909d;
        if (aVar != null) {
            aVar.mo37770a(this.f46903e, this.f46901c[i], i);
        }
    }

    /* renamed from: f */
    private void m60688f(int i, RectF rectF, PointF pointF) {
        if (i == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    /* renamed from: g */
    private C12818c m60689g(int i, C12829k kVar) {
        if (i == 1) {
            return kVar.mo37781l();
        }
        if (i == 2) {
            return kVar.mo37779j();
        }
        if (i != 3) {
            return kVar.mo37788t();
        }
        return kVar.mo37786r();
    }

    /* renamed from: h */
    private C12819d m60690h(int i, C12829k kVar) {
        if (i == 1) {
            return kVar.mo37780k();
        }
        if (i == 2) {
            return kVar.mo37778i();
        }
        if (i != 3) {
            return kVar.mo37787s();
        }
        return kVar.mo37785q();
    }

    /* renamed from: i */
    private float m60691i(RectF rectF, int i) {
        float[] fArr = this.f46904f;
        C12836m[] mVarArr = this.f46899a;
        fArr[0] = mVarArr[i].f46913c;
        fArr[1] = mVarArr[i].f46914d;
        this.f46900b[i].mapPoints(fArr);
        if (i == 1 || i == 3) {
            return Math.abs(rectF.centerX() - this.f46904f[0]);
        }
        return Math.abs(rectF.centerY() - this.f46904f[1]);
    }

    /* renamed from: j */
    private C12821f m60692j(int i, C12829k kVar) {
        if (i == 1) {
            return kVar.mo37777h();
        }
        if (i == 2) {
            return kVar.mo37782n();
        }
        if (i != 3) {
            return kVar.mo37783o();
        }
        return kVar.mo37784p();
    }

    /* renamed from: k */
    private void m60693k(C12835b bVar, int i) {
        m60690h(i, bVar.f46906a).mo37733b(this.f46899a[i], 90.0f, bVar.f46910e, bVar.f46908c, m60689g(i, bVar.f46906a));
        float a = m60685a(i);
        this.f46900b[i].reset();
        m60688f(i, bVar.f46908c, this.f46902d);
        Matrix matrix = this.f46900b[i];
        PointF pointF = this.f46902d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f46900b[i].preRotate(a);
    }

    /* renamed from: l */
    private void m60694l(int i) {
        this.f46904f[0] = this.f46899a[i].mo37816h();
        this.f46904f[1] = this.f46899a[i].mo37817i();
        this.f46900b[i].mapPoints(this.f46904f);
        float a = m60685a(i);
        this.f46901c[i].reset();
        Matrix matrix = this.f46901c[i];
        float[] fArr = this.f46904f;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f46901c[i].preRotate(a);
    }

    /* renamed from: d */
    public void mo37811d(C12829k kVar, float f, RectF rectF, Path path) {
        mo37812e(kVar, f, rectF, (C12834a) null, path);
    }

    /* renamed from: e */
    public void mo37812e(C12829k kVar, float f, RectF rectF, C12834a aVar, Path path) {
        path.rewind();
        C12835b bVar = new C12835b(kVar, f, rectF, aVar, path);
        for (int i = 0; i < 4; i++) {
            m60693k(bVar, i);
            m60694l(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m60686b(bVar, i2);
            m60687c(bVar, i2);
        }
        path.close();
    }
}
