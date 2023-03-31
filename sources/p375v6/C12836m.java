package p375v6;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p365u6.C12696a;

/* renamed from: v6.m */
/* compiled from: ShapePath */
public class C12836m {
    @Deprecated

    /* renamed from: a */
    public float f46911a;
    @Deprecated

    /* renamed from: b */
    public float f46912b;
    @Deprecated

    /* renamed from: c */
    public float f46913c;
    @Deprecated

    /* renamed from: d */
    public float f46914d;
    @Deprecated

    /* renamed from: e */
    public float f46915e;
    @Deprecated

    /* renamed from: f */
    public float f46916f;

    /* renamed from: g */
    private final List<C12842f> f46917g = new ArrayList();

    /* renamed from: h */
    private final List<C12843g> f46918h = new ArrayList();

    /* renamed from: v6.m$a */
    /* compiled from: ShapePath */
    class C12837a extends C12843g {

        /* renamed from: b */
        final /* synthetic */ List f46919b;

        /* renamed from: c */
        final /* synthetic */ Matrix f46920c;

        C12837a(List list, Matrix matrix) {
            this.f46919b = list;
            this.f46920c = matrix;
        }

        /* renamed from: a */
        public void mo37823a(Matrix matrix, C12696a aVar, int i, Canvas canvas) {
            for (C12843g a : this.f46919b) {
                a.mo37823a(this.f46920c, aVar, i, canvas);
            }
        }
    }

    /* renamed from: v6.m$b */
    /* compiled from: ShapePath */
    static class C12838b extends C12843g {

        /* renamed from: b */
        private final C12840d f46922b;

        public C12838b(C12840d dVar) {
            this.f46922b = dVar;
        }

        /* renamed from: a */
        public void mo37823a(Matrix matrix, C12696a aVar, int i, Canvas canvas) {
            float h = this.f46922b.m60734m();
            float i2 = this.f46922b.m60735n();
            aVar.mo37568a(canvas, matrix, new RectF(this.f46922b.m60732k(), this.f46922b.m60736o(), this.f46922b.m60733l(), this.f46922b.m60731j()), i, h, i2);
        }
    }

    /* renamed from: v6.m$c */
    /* compiled from: ShapePath */
    static class C12839c extends C12843g {

        /* renamed from: b */
        private final C12841e f46923b;

        /* renamed from: c */
        private final float f46924c;

        /* renamed from: d */
        private final float f46925d;

        public C12839c(C12841e eVar, float f, float f2) {
            this.f46923b = eVar;
            this.f46924c = f;
            this.f46925d = f2;
        }

        /* renamed from: a */
        public void mo37823a(Matrix matrix, C12696a aVar, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (this.f46923b.f46934c - this.f46925d), (double) (this.f46923b.f46933b - this.f46924c)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f46924c, this.f46925d);
            matrix2.preRotate(mo37824c());
            aVar.mo37569b(canvas, matrix2, rectF, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public float mo37824c() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f46923b.f46934c - this.f46925d) / (this.f46923b.f46933b - this.f46924c))));
        }
    }

    /* renamed from: v6.m$d */
    /* compiled from: ShapePath */
    public static class C12840d extends C12842f {

        /* renamed from: h */
        private static final RectF f46926h = new RectF();
        @Deprecated

        /* renamed from: b */
        public float f46927b;
        @Deprecated

        /* renamed from: c */
        public float f46928c;
        @Deprecated

        /* renamed from: d */
        public float f46929d;
        @Deprecated

        /* renamed from: e */
        public float f46930e;
        @Deprecated

        /* renamed from: f */
        public float f46931f;
        @Deprecated

        /* renamed from: g */
        public float f46932g;

        public C12840d(float f, float f2, float f3, float f4) {
            m60738q(f);
            m60742u(f2);
            m60739r(f3);
            m60737p(f4);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public float m60731j() {
            return this.f46930e;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public float m60732k() {
            return this.f46927b;
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public float m60733l() {
            return this.f46929d;
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public float m60734m() {
            return this.f46931f;
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public float m60735n() {
            return this.f46932g;
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public float m60736o() {
            return this.f46928c;
        }

        /* renamed from: p */
        private void m60737p(float f) {
            this.f46930e = f;
        }

        /* renamed from: q */
        private void m60738q(float f) {
            this.f46927b = f;
        }

        /* renamed from: r */
        private void m60739r(float f) {
            this.f46929d = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public void m60740s(float f) {
            this.f46931f = f;
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public void m60741t(float f) {
            this.f46932g = f;
        }

        /* renamed from: u */
        private void m60742u(float f) {
            this.f46928c = f;
        }

        /* renamed from: a */
        public void mo37825a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f46935a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f46926h;
            rectF.set(m60732k(), m60736o(), m60733l(), m60731j());
            path.arcTo(rectF, m60734m(), m60735n(), false);
            path.transform(matrix);
        }
    }

    /* renamed from: v6.m$e */
    /* compiled from: ShapePath */
    public static class C12841e extends C12842f {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public float f46933b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public float f46934c;

        /* renamed from: a */
        public void mo37825a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f46935a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f46933b, this.f46934c);
            path.transform(matrix);
        }
    }

    /* renamed from: v6.m$f */
    /* compiled from: ShapePath */
    public static abstract class C12842f {

        /* renamed from: a */
        protected final Matrix f46935a = new Matrix();

        /* renamed from: a */
        public abstract void mo37825a(Matrix matrix, Path path);
    }

    /* renamed from: v6.m$g */
    /* compiled from: ShapePath */
    static abstract class C12843g {

        /* renamed from: a */
        static final Matrix f46936a = new Matrix();

        C12843g() {
        }

        /* renamed from: a */
        public abstract void mo37823a(Matrix matrix, C12696a aVar, int i, Canvas canvas);

        /* renamed from: b */
        public final void mo37826b(C12696a aVar, int i, Canvas canvas) {
            mo37823a(f46936a, aVar, i, canvas);
        }
    }

    public C12836m() {
        mo37821m(0.0f, 0.0f);
    }

    /* renamed from: b */
    private void m60699b(float f) {
        if (m60701f() != f) {
            float f2 = ((f - m60701f()) + 360.0f) % 360.0f;
            if (f2 <= 180.0f) {
                C12840d dVar = new C12840d(mo37816h(), mo37817i(), mo37816h(), mo37817i());
                dVar.m60740s(m60701f());
                dVar.m60741t(f2);
                this.f46918h.add(new C12838b(dVar));
                m60703o(f);
            }
        }
    }

    /* renamed from: c */
    private void m60700c(C12843g gVar, float f, float f2) {
        m60699b(f);
        this.f46918h.add(gVar);
        m60703o(f2);
    }

    /* renamed from: f */
    private float m60701f() {
        return this.f46915e;
    }

    /* renamed from: g */
    private float m60702g() {
        return this.f46916f;
    }

    /* renamed from: o */
    private void m60703o(float f) {
        this.f46915e = f;
    }

    /* renamed from: p */
    private void m60704p(float f) {
        this.f46916f = f;
    }

    /* renamed from: q */
    private void m60705q(float f) {
        this.f46913c = f;
    }

    /* renamed from: r */
    private void m60706r(float f) {
        this.f46914d = f;
    }

    /* renamed from: s */
    private void m60707s(float f) {
        this.f46911a = f;
    }

    /* renamed from: t */
    private void m60708t(float f) {
        this.f46912b = f;
    }

    /* renamed from: a */
    public void mo37813a(float f, float f2, float f3, float f4, float f5, float f6) {
        C12840d dVar = new C12840d(f, f2, f3, f4);
        dVar.m60740s(f5);
        dVar.m60741t(f6);
        this.f46917g.add(dVar);
        C12838b bVar = new C12838b(dVar);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        m60700c(bVar, f5, z ? (180.0f + f7) % 360.0f : f7);
        double d = (double) f7;
        m60705q(((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))));
        m60706r(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))));
    }

    /* renamed from: d */
    public void mo37814d(Matrix matrix, Path path) {
        int size = this.f46917g.size();
        for (int i = 0; i < size; i++) {
            this.f46917g.get(i).mo37825a(matrix, path);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C12843g mo37815e(Matrix matrix) {
        m60699b(m60702g());
        return new C12837a(new ArrayList(this.f46918h), matrix);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public float mo37816h() {
        return this.f46913c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public float mo37817i() {
        return this.f46914d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public float mo37818j() {
        return this.f46911a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public float mo37819k() {
        return this.f46912b;
    }

    /* renamed from: l */
    public void mo37820l(float f, float f2) {
        C12841e eVar = new C12841e();
        float unused = eVar.f46933b = f;
        float unused2 = eVar.f46934c = f2;
        this.f46917g.add(eVar);
        C12839c cVar = new C12839c(eVar, mo37816h(), mo37817i());
        m60700c(cVar, cVar.mo37824c() + 270.0f, cVar.mo37824c() + 270.0f);
        m60705q(f);
        m60706r(f2);
    }

    /* renamed from: m */
    public void mo37821m(float f, float f2) {
        mo37822n(f, f2, 270.0f, 0.0f);
    }

    /* renamed from: n */
    public void mo37822n(float f, float f2, float f3, float f4) {
        m60707s(f);
        m60708t(f2);
        m60705q(f);
        m60706r(f2);
        m60703o(f3);
        m60704p((f3 + f4) % 360.0f);
        this.f46917g.clear();
        this.f46918h.clear();
    }
}
