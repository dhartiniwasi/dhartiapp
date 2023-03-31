package p177z1;

import p177z1.C6266q3;

/* renamed from: z1.e */
/* compiled from: BasePlayer */
public abstract class C6213e implements C6282u2 {

    /* renamed from: a */
    protected final C6266q3.C6270d f29854a = new C6266q3.C6270d();

    protected C6213e() {
    }

    /* renamed from: M */
    private int m36341M() {
        int K0 = mo21161K0();
        if (K0 == 1) {
            return 0;
        }
        return K0;
    }

    /* renamed from: B */
    public final boolean mo21238B() {
        C6266q3 D = mo21156D();
        return !D.mo21451u() && D.mo21450r(mo21154A(), this.f29854a).f30207i;
    }

    /* renamed from: G */
    public final boolean mo21239G() {
        C6266q3 D = mo21156D();
        return !D.mo21451u() && D.mo21450r(mo21154A(), this.f29854a).mo21480h();
    }

    /* renamed from: J */
    public final long mo21240J() {
        C6266q3 D = mo21156D();
        if (D.mo21451u()) {
            return -9223372036854775807L;
        }
        return D.mo21450r(mo21154A(), this.f29854a).mo21478f();
    }

    /* renamed from: K */
    public final int mo21241K() {
        C6266q3 D = mo21156D();
        if (D.mo21451u()) {
            return -1;
        }
        return D.mo6811i(mo21154A(), m36341M(), mo21157E());
    }

    /* renamed from: L */
    public final int mo21242L() {
        C6266q3 D = mo21156D();
        if (D.mo21451u()) {
            return -1;
        }
        return D.mo6812p(mo21154A(), m36341M(), mo21157E());
    }

    /* renamed from: O */
    public final void mo21243O(int i) {
        mo21182h(i, -9223372036854775807L);
    }

    /* renamed from: m */
    public final boolean mo21244m() {
        return mo21242L() != -1;
    }

    /* renamed from: o */
    public final int mo21245o() {
        return mo21156D().mo6761t();
    }

    /* renamed from: t */
    public final boolean mo21246t() {
        C6266q3 D = mo21156D();
        return !D.mo21451u() && D.mo21450r(mo21154A(), this.f29854a).f30206h;
    }

    /* renamed from: t0 */
    public final void mo21247t0(long j) {
        mo21182h(mo21154A(), j);
    }

    /* renamed from: u */
    public final void mo21248u() {
        int K = mo21241K();
        if (K != -1) {
            mo21243O(K);
        }
    }

    /* renamed from: y */
    public final boolean mo21249y() {
        return mo21241K() != -1;
    }
}
