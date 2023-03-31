package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.n */
/* compiled from: SnapHelper */
public abstract class C1417n extends RecyclerView.C1357r {

    /* renamed from: a */
    RecyclerView f4042a;

    /* renamed from: b */
    private Scroller f4043b;

    /* renamed from: c */
    private final RecyclerView.C1359t f4044c = new C1418a();

    /* renamed from: androidx.recyclerview.widget.n$a */
    /* compiled from: SnapHelper */
    class C1418a extends RecyclerView.C1359t {

        /* renamed from: a */
        boolean f4045a = false;

        C1418a() {
        }

        /* renamed from: a */
        public void mo5223a(RecyclerView recyclerView, int i) {
            super.mo5223a(recyclerView, i);
            if (i == 0 && this.f4045a) {
                this.f4045a = false;
                C1417n.this.mo5528l();
            }
        }

        /* renamed from: b */
        public void mo5224b(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f4045a = true;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.n$b */
    /* compiled from: SnapHelper */
    class C1419b extends C1406g {
        C1419b(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public void mo5293o(View view, RecyclerView.C1330a0 a0Var, RecyclerView.C1367z.C1368a aVar) {
            C1417n nVar = C1417n.this;
            RecyclerView recyclerView = nVar.f4042a;
            if (recyclerView != null) {
                int[] c = nVar.mo5482c(recyclerView.getLayoutManager(), view);
                int i = c[0];
                int i2 = c[1];
                int w = mo5479w(Math.max(Math.abs(i), Math.abs(i2)));
                if (w > 0) {
                    aVar.mo5300d(i, i2, w, this.f4024j);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public float mo5478v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    /* renamed from: g */
    private void m6678g() {
        this.f4042a.removeOnScrollListener(this.f4044c);
        this.f4042a.setOnFlingListener((RecyclerView.C1357r) null);
    }

    /* renamed from: j */
    private void m6679j() throws IllegalStateException {
        if (this.f4042a.getOnFlingListener() == null) {
            this.f4042a.addOnScrollListener(this.f4044c);
            this.f4042a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    /* renamed from: k */
    private boolean m6680k(RecyclerView.C1350o oVar, int i, int i2) {
        RecyclerView.C1367z e;
        int i3;
        if (!(oVar instanceof RecyclerView.C1367z.C1369b) || (e = mo5526e(oVar)) == null || (i3 = mo5484i(oVar, i, i2)) == -1) {
            return false;
        }
        e.mo5294p(i3);
        oVar.mo5134J1(e);
        return true;
    }

    /* renamed from: a */
    public boolean mo5219a(int i, int i2) {
        RecyclerView.C1350o layoutManager = this.f4042a.getLayoutManager();
        if (layoutManager == null || this.f4042a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f4042a.getMinFlingVelocity();
        if ((Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m6680k(layoutManager, i, i2)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo5524b(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f4042a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m6678g();
            }
            this.f4042a = recyclerView;
            if (recyclerView != null) {
                m6679j();
                this.f4043b = new Scroller(this.f4042a.getContext(), new DecelerateInterpolator());
                mo5528l();
            }
        }
    }

    /* renamed from: c */
    public abstract int[] mo5482c(RecyclerView.C1350o oVar, View view);

    /* renamed from: d */
    public int[] mo5525d(int i, int i2) {
        this.f4043b.fling(0, 0, i, i2, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        return new int[]{this.f4043b.getFinalX(), this.f4043b.getFinalY()};
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public RecyclerView.C1367z mo5526e(RecyclerView.C1350o oVar) {
        return mo5527f(oVar);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: f */
    public C1406g mo5527f(RecyclerView.C1350o oVar) {
        if (!(oVar instanceof RecyclerView.C1367z.C1369b)) {
            return null;
        }
        return new C1419b(this.f4042a.getContext());
    }

    /* renamed from: h */
    public abstract View mo5483h(RecyclerView.C1350o oVar);

    /* renamed from: i */
    public abstract int mo5484i(RecyclerView.C1350o oVar, int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo5528l() {
        RecyclerView.C1350o layoutManager;
        View h;
        RecyclerView recyclerView = this.f4042a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (h = mo5483h(layoutManager)) != null) {
            int[] c = mo5482c(layoutManager, h);
            if (c[0] != 0 || c[1] != 0) {
                this.f4042a.smoothScrollBy(c[0], c[1]);
            }
        }
    }
}
