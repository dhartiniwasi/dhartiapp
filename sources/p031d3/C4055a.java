package p031d3;

import p155v3.C5828l;
import p155v3.C5837p;
import p161w3.C5917a;
import p177z1.C6272r1;

/* renamed from: d3.a */
/* compiled from: BaseMediaChunk */
public abstract class C4055a extends C4072n {

    /* renamed from: k */
    public final long f23135k;

    /* renamed from: l */
    public final long f23136l;

    /* renamed from: m */
    private C4057c f23137m;

    /* renamed from: n */
    private int[] f23138n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4055a(C5828l lVar, C5837p pVar, C6272r1 r1Var, int i, Object obj, long j, long j2, long j3, long j4, long j5) {
        super(lVar, pVar, r1Var, i, obj, j, j2, j5);
        this.f23135k = j3;
        this.f23136l = j4;
    }

    /* renamed from: i */
    public final int mo17261i(int i) {
        return ((int[]) C5917a.m34875h(this.f23138n))[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final C4057c mo17262j() {
        return (C4057c) C5917a.m34875h(this.f23137m);
    }

    /* renamed from: k */
    public void mo17263k(C4057c cVar) {
        this.f23137m = cVar;
        this.f23138n = cVar.mo17269a();
    }
}
