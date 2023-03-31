package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.g */
/* compiled from: LinearSmoothScroller */
public class C1406g extends RecyclerView.C1367z {

    /* renamed from: i */
    protected final LinearInterpolator f4023i = new LinearInterpolator();

    /* renamed from: j */
    protected final DecelerateInterpolator f4024j = new DecelerateInterpolator();

    /* renamed from: k */
    protected PointF f4025k;

    /* renamed from: l */
    private final DisplayMetrics f4026l;

    /* renamed from: m */
    private boolean f4027m = false;

    /* renamed from: n */
    private float f4028n;

    /* renamed from: o */
    protected int f4029o = 0;

    /* renamed from: p */
    protected int f4030p = 0;

    public C1406g(Context context) {
        this.f4026l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: A */
    private float m6555A() {
        if (!this.f4027m) {
            this.f4028n = mo5478v(this.f4026l);
            this.f4027m = true;
        }
        return this.f4028n;
    }

    /* renamed from: y */
    private int m6556y(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public int mo5473B() {
        PointF pointF = this.f4025k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo5474C(RecyclerView.C1367z.C1368a aVar) {
        PointF a = mo5279a(mo5284f());
        if (a == null || (a.x == 0.0f && a.y == 0.0f)) {
            aVar.mo5298b(mo5284f());
            mo5296r();
            return;
        }
        mo5287i(a);
        this.f4025k = a;
        this.f4029o = (int) (a.x * 10000.0f);
        this.f4030p = (int) (a.y * 10000.0f);
        aVar.mo5300d((int) (((float) this.f4029o) * 1.2f), (int) (((float) this.f4030p) * 1.2f), (int) (((float) mo5480x(10000)) * 1.2f), this.f4023i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo5290l(int i, int i2, RecyclerView.C1330a0 a0Var, RecyclerView.C1367z.C1368a aVar) {
        if (mo5281c() == 0) {
            mo5296r();
            return;
        }
        this.f4029o = m6556y(this.f4029o, i);
        int y = m6556y(this.f4030p, i2);
        this.f4030p = y;
        if (this.f4029o == 0 && y == 0) {
            mo5474C(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo5291m() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo5292n() {
        this.f4030p = 0;
        this.f4029o = 0;
        this.f4025k = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo5293o(View view, RecyclerView.C1330a0 a0Var, RecyclerView.C1367z.C1368a aVar) {
        int t = mo5476t(view, mo5481z());
        int u = mo5477u(view, mo5473B());
        int w = mo5479w((int) Math.sqrt((double) ((t * t) + (u * u))));
        if (w > 0) {
            aVar.mo5300d(-t, -u, w, this.f4024j);
        }
    }

    /* renamed from: s */
    public int mo5475s(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    /* renamed from: t */
    public int mo5476t(View view, int i) {
        RecyclerView.C1350o e = mo5283e();
        if (e == null || !e.mo4758k()) {
            return 0;
        }
        RecyclerView.C1355p pVar = (RecyclerView.C1355p) view.getLayoutParams();
        return mo5475s(e.mo5143Q(view) - pVar.leftMargin, e.mo5147T(view) + pVar.rightMargin, e.mo5166e0(), e.mo5187o0() - e.mo5168f0(), i);
    }

    /* renamed from: u */
    public int mo5477u(View view, int i) {
        RecyclerView.C1350o e = mo5283e();
        if (e == null || !e.mo4759l()) {
            return 0;
        }
        RecyclerView.C1355p pVar = (RecyclerView.C1355p) view.getLayoutParams();
        return mo5475s(e.mo5148U(view) - pVar.topMargin, e.mo5140O(view) + pVar.bottomMargin, e.mo5170g0(), e.mo5151W() - e.mo5164d0(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public float mo5478v(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public int mo5479w(int i) {
        return (int) Math.ceil(((double) mo5480x(i)) / 0.3356d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public int mo5480x(int i) {
        return (int) Math.ceil((double) (((float) Math.abs(i)) * m6555A()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int mo5481z() {
        PointF pointF = this.f4025k;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
