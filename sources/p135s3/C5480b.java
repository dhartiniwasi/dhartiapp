package p135s3;

import java.util.Collections;
import java.util.List;
import p079k3.C4864b;
import p079k3.C4874h;
import p161w3.C5917a;

/* renamed from: s3.b */
/* compiled from: Tx3gSubtitle */
final class C5480b implements C4874h {

    /* renamed from: b */
    public static final C5480b f27825b = new C5480b();

    /* renamed from: a */
    private final List<C4864b> f27826a;

    public C5480b(C4864b bVar) {
        this.f27826a = Collections.singletonList(bVar);
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
        return j >= 0 ? this.f27826a : Collections.emptyList();
    }

    /* renamed from: j */
    public int mo18651j() {
        return 1;
    }

    private C5480b() {
        this.f27826a = Collections.emptyList();
    }
}
