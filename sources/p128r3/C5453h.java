package p128r3;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import p079k3.C4864b;
import p079k3.C4874h;
import p161w3.C5953m0;

/* renamed from: r3.h */
/* compiled from: TtmlSubtitle */
final class C5453h implements C4874h {

    /* renamed from: a */
    private final C5449d f27771a;

    /* renamed from: b */
    private final long[] f27772b;

    /* renamed from: c */
    private final Map<String, C5452g> f27773c;

    /* renamed from: d */
    private final Map<String, C5450e> f27774d;

    /* renamed from: e */
    private final Map<String, String> f27775e;

    public C5453h(C5449d dVar, Map<String, C5452g> map, Map<String, C5450e> map2, Map<String, String> map3) {
        this.f27771a = dVar;
        this.f27774d = map2;
        this.f27775e = map3;
        this.f27773c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f27772b = dVar.mo19716j();
    }

    /* renamed from: a */
    public int mo18648a(long j) {
        int e = C5953m0.m35128e(this.f27772b, j, false, false);
        if (e < this.f27772b.length) {
            return e;
        }
        return -1;
    }

    /* renamed from: b */
    public long mo18649b(int i) {
        return this.f27772b[i];
    }

    /* renamed from: c */
    public List<C4864b> mo18650c(long j) {
        return this.f27771a.mo19715h(j, this.f27773c, this.f27774d, this.f27775e);
    }

    /* renamed from: j */
    public int mo18651j() {
        return this.f27772b.length;
    }
}
