package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.j */
/* compiled from: OrientationHelper */
public abstract class C1410j {

    /* renamed from: a */
    protected final RecyclerView.C1350o f4034a;

    /* renamed from: b */
    private int f4035b;

    /* renamed from: c */
    final Rect f4036c;

    /* renamed from: androidx.recyclerview.widget.j$a */
    /* compiled from: OrientationHelper */
    static class C1411a extends C1410j {
        C1411a(RecyclerView.C1350o oVar) {
            super(oVar, (C1411a) null);
        }

        /* renamed from: d */
        public int mo5488d(View view) {
            return this.f4034a.mo5147T(view) + ((RecyclerView.C1355p) view.getLayoutParams()).rightMargin;
        }

        /* renamed from: e */
        public int mo5489e(View view) {
            RecyclerView.C1355p pVar = (RecyclerView.C1355p) view.getLayoutParams();
            return this.f4034a.mo5146S(view) + pVar.leftMargin + pVar.rightMargin;
        }

        /* renamed from: f */
        public int mo5490f(View view) {
            RecyclerView.C1355p pVar = (RecyclerView.C1355p) view.getLayoutParams();
            return this.f4034a.mo5145R(view) + pVar.topMargin + pVar.bottomMargin;
        }

        /* renamed from: g */
        public int mo5491g(View view) {
            return this.f4034a.mo5143Q(view) - ((RecyclerView.C1355p) view.getLayoutParams()).leftMargin;
        }

        /* renamed from: h */
        public int mo5492h() {
            return this.f4034a.mo5187o0();
        }

        /* renamed from: i */
        public int mo5493i() {
            return this.f4034a.mo5187o0() - this.f4034a.mo5168f0();
        }

        /* renamed from: j */
        public int mo5494j() {
            return this.f4034a.mo5168f0();
        }

        /* renamed from: k */
        public int mo5495k() {
            return this.f4034a.mo5189p0();
        }

        /* renamed from: l */
        public int mo5496l() {
            return this.f4034a.mo5152X();
        }

        /* renamed from: m */
        public int mo5497m() {
            return this.f4034a.mo5166e0();
        }

        /* renamed from: n */
        public int mo5498n() {
            return (this.f4034a.mo5187o0() - this.f4034a.mo5166e0()) - this.f4034a.mo5168f0();
        }

        /* renamed from: p */
        public int mo5500p(View view) {
            this.f4034a.mo5185n0(view, true, this.f4036c);
            return this.f4036c.right;
        }

        /* renamed from: q */
        public int mo5501q(View view) {
            this.f4034a.mo5185n0(view, true, this.f4036c);
            return this.f4036c.left;
        }

        /* renamed from: r */
        public void mo5502r(int i) {
            this.f4034a.mo5120C0(i);
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$b */
    /* compiled from: OrientationHelper */
    static class C1412b extends C1410j {
        C1412b(RecyclerView.C1350o oVar) {
            super(oVar, (C1411a) null);
        }

        /* renamed from: d */
        public int mo5488d(View view) {
            return this.f4034a.mo5140O(view) + ((RecyclerView.C1355p) view.getLayoutParams()).bottomMargin;
        }

        /* renamed from: e */
        public int mo5489e(View view) {
            RecyclerView.C1355p pVar = (RecyclerView.C1355p) view.getLayoutParams();
            return this.f4034a.mo5145R(view) + pVar.topMargin + pVar.bottomMargin;
        }

        /* renamed from: f */
        public int mo5490f(View view) {
            RecyclerView.C1355p pVar = (RecyclerView.C1355p) view.getLayoutParams();
            return this.f4034a.mo5146S(view) + pVar.leftMargin + pVar.rightMargin;
        }

        /* renamed from: g */
        public int mo5491g(View view) {
            return this.f4034a.mo5148U(view) - ((RecyclerView.C1355p) view.getLayoutParams()).topMargin;
        }

        /* renamed from: h */
        public int mo5492h() {
            return this.f4034a.mo5151W();
        }

        /* renamed from: i */
        public int mo5493i() {
            return this.f4034a.mo5151W() - this.f4034a.mo5164d0();
        }

        /* renamed from: j */
        public int mo5494j() {
            return this.f4034a.mo5164d0();
        }

        /* renamed from: k */
        public int mo5495k() {
            return this.f4034a.mo5152X();
        }

        /* renamed from: l */
        public int mo5496l() {
            return this.f4034a.mo5189p0();
        }

        /* renamed from: m */
        public int mo5497m() {
            return this.f4034a.mo5170g0();
        }

        /* renamed from: n */
        public int mo5498n() {
            return (this.f4034a.mo5151W() - this.f4034a.mo5170g0()) - this.f4034a.mo5164d0();
        }

        /* renamed from: p */
        public int mo5500p(View view) {
            this.f4034a.mo5185n0(view, true, this.f4036c);
            return this.f4036c.bottom;
        }

        /* renamed from: q */
        public int mo5501q(View view) {
            this.f4034a.mo5185n0(view, true, this.f4036c);
            return this.f4036c.top;
        }

        /* renamed from: r */
        public void mo5502r(int i) {
            this.f4034a.mo5121D0(i);
        }
    }

    /* synthetic */ C1410j(RecyclerView.C1350o oVar, C1411a aVar) {
        this(oVar);
    }

    /* renamed from: a */
    public static C1410j m6587a(RecyclerView.C1350o oVar) {
        return new C1411a(oVar);
    }

    /* renamed from: b */
    public static C1410j m6588b(RecyclerView.C1350o oVar, int i) {
        if (i == 0) {
            return m6587a(oVar);
        }
        if (i == 1) {
            return m6589c(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: c */
    public static C1410j m6589c(RecyclerView.C1350o oVar) {
        return new C1412b(oVar);
    }

    /* renamed from: d */
    public abstract int mo5488d(View view);

    /* renamed from: e */
    public abstract int mo5489e(View view);

    /* renamed from: f */
    public abstract int mo5490f(View view);

    /* renamed from: g */
    public abstract int mo5491g(View view);

    /* renamed from: h */
    public abstract int mo5492h();

    /* renamed from: i */
    public abstract int mo5493i();

    /* renamed from: j */
    public abstract int mo5494j();

    /* renamed from: k */
    public abstract int mo5495k();

    /* renamed from: l */
    public abstract int mo5496l();

    /* renamed from: m */
    public abstract int mo5497m();

    /* renamed from: n */
    public abstract int mo5498n();

    /* renamed from: o */
    public int mo5499o() {
        if (Integer.MIN_VALUE == this.f4035b) {
            return 0;
        }
        return mo5498n() - this.f4035b;
    }

    /* renamed from: p */
    public abstract int mo5500p(View view);

    /* renamed from: q */
    public abstract int mo5501q(View view);

    /* renamed from: r */
    public abstract void mo5502r(int i);

    /* renamed from: s */
    public void mo5503s() {
        this.f4035b = mo5498n();
    }

    private C1410j(RecyclerView.C1350o oVar) {
        this.f4035b = RecyclerView.UNDEFINED_DURATION;
        this.f4036c = new Rect();
        this.f4034a = oVar;
    }
}
