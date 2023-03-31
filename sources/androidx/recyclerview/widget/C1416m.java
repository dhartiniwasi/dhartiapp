package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.m */
/* compiled from: SimpleItemAnimator */
public abstract class C1416m extends RecyclerView.C1344l {

    /* renamed from: g */
    boolean f4041g = true;

    /* renamed from: A */
    public final void mo5508A(RecyclerView.C1336d0 d0Var) {
        mo5516I(d0Var);
        mo5089h(d0Var);
    }

    /* renamed from: B */
    public final void mo5509B(RecyclerView.C1336d0 d0Var) {
        mo5517J(d0Var);
    }

    /* renamed from: C */
    public final void mo5510C(RecyclerView.C1336d0 d0Var, boolean z) {
        mo5518K(d0Var, z);
        mo5089h(d0Var);
    }

    /* renamed from: D */
    public final void mo5511D(RecyclerView.C1336d0 d0Var, boolean z) {
        mo5519L(d0Var, z);
    }

    /* renamed from: E */
    public final void mo5512E(RecyclerView.C1336d0 d0Var) {
        mo5520M(d0Var);
        mo5089h(d0Var);
    }

    /* renamed from: F */
    public final void mo5513F(RecyclerView.C1336d0 d0Var) {
        mo5521N(d0Var);
    }

    /* renamed from: G */
    public final void mo5514G(RecyclerView.C1336d0 d0Var) {
        mo5522O(d0Var);
        mo5089h(d0Var);
    }

    /* renamed from: H */
    public final void mo5515H(RecyclerView.C1336d0 d0Var) {
        mo5523P(d0Var);
    }

    /* renamed from: I */
    public void mo5516I(RecyclerView.C1336d0 d0Var) {
    }

    /* renamed from: J */
    public void mo5517J(RecyclerView.C1336d0 d0Var) {
    }

    /* renamed from: K */
    public void mo5518K(RecyclerView.C1336d0 d0Var, boolean z) {
    }

    /* renamed from: L */
    public void mo5519L(RecyclerView.C1336d0 d0Var, boolean z) {
    }

    /* renamed from: M */
    public void mo5520M(RecyclerView.C1336d0 d0Var) {
    }

    /* renamed from: N */
    public void mo5521N(RecyclerView.C1336d0 d0Var) {
    }

    /* renamed from: O */
    public void mo5522O(RecyclerView.C1336d0 d0Var) {
    }

    /* renamed from: P */
    public void mo5523P(RecyclerView.C1336d0 d0Var) {
    }

    /* renamed from: a */
    public boolean mo5083a(RecyclerView.C1336d0 d0Var, RecyclerView.C1344l.C1347c cVar, RecyclerView.C1344l.C1347c cVar2) {
        int i;
        int i2;
        if (cVar == null || ((i = cVar.f3775a) == (i2 = cVar2.f3775a) && cVar.f3776b == cVar2.f3776b)) {
            return mo5426w(d0Var);
        }
        return mo5428y(d0Var, i, cVar.f3776b, i2, cVar2.f3776b);
    }

    /* renamed from: b */
    public boolean mo5084b(RecyclerView.C1336d0 d0Var, RecyclerView.C1336d0 d0Var2, RecyclerView.C1344l.C1347c cVar, RecyclerView.C1344l.C1347c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f3775a;
        int i4 = cVar.f3776b;
        if (d0Var2.mo5009J()) {
            int i5 = cVar.f3775a;
            i = cVar.f3776b;
            i2 = i5;
        } else {
            i2 = cVar2.f3775a;
            i = cVar2.f3776b;
        }
        return mo5427x(d0Var, d0Var2, i3, i4, i2, i);
    }

    /* renamed from: c */
    public boolean mo5085c(RecyclerView.C1336d0 d0Var, RecyclerView.C1344l.C1347c cVar, RecyclerView.C1344l.C1347c cVar2) {
        int i = cVar.f3775a;
        int i2 = cVar.f3776b;
        View view = d0Var.f3747a;
        int left = cVar2 == null ? view.getLeft() : cVar2.f3775a;
        int top = cVar2 == null ? view.getTop() : cVar2.f3776b;
        if (d0Var.mo5033v() || (i == left && i2 == top)) {
            return mo5429z(d0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo5428y(d0Var, i, i2, left, top);
    }

    /* renamed from: d */
    public boolean mo5086d(RecyclerView.C1336d0 d0Var, RecyclerView.C1344l.C1347c cVar, RecyclerView.C1344l.C1347c cVar2) {
        int i = cVar.f3775a;
        int i2 = cVar2.f3775a;
        if (i == i2 && cVar.f3776b == cVar2.f3776b) {
            mo5512E(d0Var);
            return false;
        }
        return mo5428y(d0Var, i, cVar.f3776b, i2, cVar2.f3776b);
    }

    /* renamed from: f */
    public boolean mo5087f(RecyclerView.C1336d0 d0Var) {
        return !this.f4041g || d0Var.mo5030t();
    }

    /* renamed from: w */
    public abstract boolean mo5426w(RecyclerView.C1336d0 d0Var);

    /* renamed from: x */
    public abstract boolean mo5427x(RecyclerView.C1336d0 d0Var, RecyclerView.C1336d0 d0Var2, int i, int i2, int i3, int i4);

    /* renamed from: y */
    public abstract boolean mo5428y(RecyclerView.C1336d0 d0Var, int i, int i2, int i3, int i4);

    /* renamed from: z */
    public abstract boolean mo5429z(RecyclerView.C1336d0 d0Var);
}
