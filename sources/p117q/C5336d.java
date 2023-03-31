package p117q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import p117q.C5341h;

/* renamed from: q.d */
/* compiled from: CardViewBaseImpl */
class C5336d implements C5339f {

    /* renamed from: a */
    final RectF f27364a = new RectF();

    /* renamed from: q.d$a */
    /* compiled from: CardViewBaseImpl */
    class C5337a implements C5341h.C5342a {
        C5337a() {
        }

        /* renamed from: a */
        public void mo19330a(Canvas canvas, RectF rectF, float f, Paint paint) {
            Canvas canvas2 = canvas;
            RectF rectF2 = rectF;
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                C5336d.this.f27364a.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas2.translate(rectF2.left + f3, rectF2.top + f3);
                Paint paint2 = paint;
                canvas.drawArc(C5336d.this.f27364a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C5336d.this.f27364a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(height, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C5336d.this.f27364a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C5336d.this.f27364a, 180.0f, 90.0f, true, paint2);
                canvas2.restoreToCount(save);
                float f5 = rectF2.top;
                canvas.drawRect((rectF2.left + f3) - 1.0f, f5, (rectF2.right - f3) + 1.0f, f5 + f3, paint2);
                float f6 = rectF2.bottom;
                Canvas canvas3 = canvas;
                canvas3.drawRect((rectF2.left + f3) - 1.0f, f6 - f3, (rectF2.right - f3) + 1.0f, f6, paint2);
            }
            canvas.drawRect(rectF2.left, rectF2.top + f, rectF2.right, rectF2.bottom - f, paint);
        }
    }

    C5336d() {
    }

    /* renamed from: o */
    private C5341h m32693o(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new C5341h(context.getResources(), colorStateList, f, f2, f3);
    }

    /* renamed from: p */
    private C5341h m32694p(C5338e eVar) {
        return (C5341h) eVar.mo19327g();
    }

    /* renamed from: a */
    public void mo19331a(C5338e eVar) {
    }

    /* renamed from: b */
    public float mo19332b(C5338e eVar) {
        return m32694p(eVar).mo19371k();
    }

    /* renamed from: c */
    public void mo19333c(C5338e eVar, float f) {
        m32694p(eVar).mo19377p(f);
        mo19345q(eVar);
    }

    /* renamed from: d */
    public float mo19334d(C5338e eVar) {
        return m32694p(eVar).mo19364g();
    }

    /* renamed from: e */
    public void mo19335e(C5338e eVar) {
        m32694p(eVar).mo19373m(eVar.mo19325e());
        mo19345q(eVar);
    }

    /* renamed from: f */
    public float mo19336f(C5338e eVar) {
        return m32694p(eVar).mo19372l();
    }

    /* renamed from: g */
    public float mo19337g(C5338e eVar) {
        return m32694p(eVar).mo19368i();
    }

    /* renamed from: h */
    public float mo19338h(C5338e eVar) {
        return m32694p(eVar).mo19370j();
    }

    /* renamed from: i */
    public ColorStateList mo19339i(C5338e eVar) {
        return m32694p(eVar).mo19363f();
    }

    /* renamed from: j */
    public void mo19340j(C5338e eVar, float f) {
        m32694p(eVar).mo19379r(f);
    }

    /* renamed from: k */
    public void mo19329k() {
        C5341h.f27378r = new C5337a();
    }

    /* renamed from: l */
    public void mo19341l(C5338e eVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C5341h o = m32693o(context, colorStateList, f, f2, f3);
        o.mo19373m(eVar.mo19325e());
        eVar.mo19324d(o);
        mo19345q(eVar);
    }

    /* renamed from: m */
    public void mo19342m(C5338e eVar, ColorStateList colorStateList) {
        m32694p(eVar).mo19374o(colorStateList);
    }

    /* renamed from: n */
    public void mo19343n(C5338e eVar, float f) {
        m32694p(eVar).mo19378q(f);
        mo19345q(eVar);
    }

    /* renamed from: q */
    public void mo19345q(C5338e eVar) {
        Rect rect = new Rect();
        m32694p(eVar).mo19367h(rect);
        eVar.mo19323c((int) Math.ceil((double) mo19332b(eVar)), (int) Math.ceil((double) mo19338h(eVar)));
        eVar.mo19322b(rect.left, rect.top, rect.right, rect.bottom);
    }
}
