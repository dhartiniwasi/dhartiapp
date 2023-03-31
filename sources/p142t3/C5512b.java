package p142t3;

import java.util.Collections;
import java.util.List;
import p079k3.C4864b;
import p079k3.C4874h;
import p161w3.C5917a;

/* renamed from: t3.b */
/* compiled from: Mp4WebvttSubtitle */
final class C5512b implements C4874h {

    /* renamed from: a */
    private final List<C4864b> f27988a;

    public C5512b(List<C4864b> list) {
        this.f27988a = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public int mo18648a(long j) {
        return j < 0 ? 0 : -1;
    }

    /* renamed from: b */
    public long mo18649b(int i) {
        C5917a.m34868a(i == 0);
        return 0;
    }

    /* renamed from: c */
    public List<C4864b> mo18650c(long j) {
        return j >= 0 ? this.f27988a : Collections.emptyList();
    }

    /* renamed from: j */
    public int mo18651j() {
        return 1;
    }
}
