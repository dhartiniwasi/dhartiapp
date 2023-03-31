package p021c2;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: c2.a */
/* compiled from: Buffer */
public abstract class C1840a {

    /* renamed from: a */
    private int f5404a;

    /* renamed from: k */
    public final void mo7028k(int i) {
        this.f5404a = i | this.f5404a;
    }

    /* renamed from: n */
    public void mo7029n() {
        this.f5404a = 0;
    }

    /* renamed from: o */
    public final void mo7030o(int i) {
        this.f5404a = (~i) & this.f5404a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final boolean mo7031p(int i) {
        return (this.f5404a & i) == i;
    }

    /* renamed from: q */
    public final boolean mo7032q() {
        return mo7031p(268435456);
    }

    /* renamed from: r */
    public final boolean mo7033r() {
        return mo7031p(RecyclerView.UNDEFINED_DURATION);
    }

    /* renamed from: s */
    public final boolean mo7034s() {
        return mo7031p(4);
    }

    /* renamed from: t */
    public final boolean mo7035t() {
        return mo7031p(134217728);
    }

    /* renamed from: u */
    public final boolean mo7036u() {
        return mo7031p(1);
    }

    /* renamed from: v */
    public final void mo7037v(int i) {
        this.f5404a = i;
    }
}
