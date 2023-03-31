package p114p3;

import java.util.Collections;
import java.util.List;
import p079k3.C4864b;
import p079k3.C4874h;
import p161w3.C5917a;
import p161w3.C5953m0;

/* renamed from: p3.d */
/* compiled from: SsaSubtitle */
final class C5275d implements C4874h {

    /* renamed from: a */
    private final List<List<C4864b>> f27213a;

    /* renamed from: b */
    private final List<Long> f27214b;

    public C5275d(List<List<C4864b>> list, List<Long> list2) {
        this.f27213a = list;
        this.f27214b = list2;
    }

    /* renamed from: a */
    public int mo18648a(long j) {
        int d = C5953m0.m35126d(this.f27214b, Long.valueOf(j), false, false);
        if (d < this.f27214b.size()) {
            return d;
        }
        return -1;
    }

    /* renamed from: b */
    public long mo18649b(int i) {
        boolean z = true;
        C5917a.m34868a(i >= 0);
        if (i >= this.f27214b.size()) {
            z = false;
        }
        C5917a.m34868a(z);
        return this.f27214b.get(i).longValue();
    }

    /* renamed from: c */
    public List<C4864b> mo18650c(long j) {
        int f = C5953m0.m35130f(this.f27214b, Long.valueOf(j), true, false);
        if (f == -1) {
            return Collections.emptyList();
        }
        return this.f27213a.get(f);
    }

    /* renamed from: j */
    public int mo18651j() {
        return this.f27214b.size();
    }
}
