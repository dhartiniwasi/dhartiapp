package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.h */
/* compiled from: LinearSnapHelper */
public class C1407h extends C1417n {

    /* renamed from: d */
    private C1410j f4031d;

    /* renamed from: e */
    private C1410j f4032e;

    /* renamed from: m */
    private float m6570m(RecyclerView.C1350o oVar, C1410j jVar) {
        int max;
        int J = oVar.mo5133J();
        if (J == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = RecyclerView.UNDEFINED_DURATION;
        for (int i3 = 0; i3 < J; i3++) {
            View I = oVar.mo5132I(i3);
            int h0 = oVar.mo5173h0(I);
            if (h0 != -1) {
                if (h0 < i) {
                    view = I;
                    i = h0;
                }
                if (h0 > i2) {
                    view2 = I;
                    i2 = h0;
                }
            }
        }
        if (view == null || view2 == null || (max = Math.max(jVar.mo5488d(view), jVar.mo5488d(view2)) - Math.min(jVar.mo5491g(view), jVar.mo5491g(view2))) == 0) {
            return 1.0f;
        }
        return (((float) max) * 1.0f) / ((float) ((i2 - i) + 1));
    }

    /* renamed from: n */
    private int m6571n(RecyclerView.C1350o oVar, View view, C1410j jVar) {
        return (jVar.mo5491g(view) + (jVar.mo5489e(view) / 2)) - (jVar.mo5497m() + (jVar.mo5498n() / 2));
    }

    /* renamed from: o */
    private int m6572o(RecyclerView.C1350o oVar, C1410j jVar, int i, int i2) {
        int[] d = mo5525d(i, i2);
        float m = m6570m(oVar, jVar);
        if (m <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(d[0]) > Math.abs(d[1]) ? d[0] : d[1])) / m);
    }

    /* renamed from: p */
    private View m6573p(RecyclerView.C1350o oVar, C1410j jVar) {
        int J = oVar.mo5133J();
        View view = null;
        if (J == 0) {
            return null;
        }
        int m = jVar.mo5497m() + (jVar.mo5498n() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < J; i2++) {
            View I = oVar.mo5132I(i2);
            int abs = Math.abs((jVar.mo5491g(I) + (jVar.mo5489e(I) / 2)) - m);
            if (abs < i) {
                view = I;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: q */
    private C1410j m6574q(RecyclerView.C1350o oVar) {
        C1410j jVar = this.f4032e;
        if (jVar == null || jVar.f4034a != oVar) {
            this.f4032e = C1410j.m6587a(oVar);
        }
        return this.f4032e;
    }

    /* renamed from: r */
    private C1410j m6575r(RecyclerView.C1350o oVar) {
        C1410j jVar = this.f4031d;
        if (jVar == null || jVar.f4034a != oVar) {
            this.f4031d = C1410j.m6589c(oVar);
        }
        return this.f4031d;
    }

    /* renamed from: c */
    public int[] mo5482c(RecyclerView.C1350o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.mo4758k()) {
            iArr[0] = m6571n(oVar, view, m6574q(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.mo4759l()) {
            iArr[1] = m6571n(oVar, view, m6575r(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: h */
    public View mo5483h(RecyclerView.C1350o oVar) {
        if (oVar.mo4759l()) {
            return m6573p(oVar, m6575r(oVar));
        }
        if (oVar.mo4758k()) {
            return m6573p(oVar, m6574q(oVar));
        }
        return null;
    }

    /* renamed from: i */
    public int mo5484i(RecyclerView.C1350o oVar, int i, int i2) {
        int Y;
        View h;
        int h0;
        int i3;
        PointF a;
        int i4;
        int i5;
        if (!(oVar instanceof RecyclerView.C1367z.C1369b) || (Y = oVar.mo5153Y()) == 0 || (h = mo5483h(oVar)) == null || (h0 = oVar.mo5173h0(h)) == -1 || (a = ((RecyclerView.C1367z.C1369b) oVar).mo4751a(i3)) == null) {
            return -1;
        }
        int i6 = 0;
        if (oVar.mo4758k()) {
            i4 = m6572o(oVar, m6574q(oVar), i, 0);
            if (a.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (oVar.mo4759l()) {
            i5 = m6572o(oVar, m6575r(oVar), 0, i2);
            if (a.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (oVar.mo4759l()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i7 = h0 + i4;
        if (i7 >= 0) {
            i6 = i7;
        }
        return i6 >= Y ? Y - 1 : i6;
    }
}
