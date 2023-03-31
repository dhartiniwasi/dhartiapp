package p052g3;

import java.io.IOException;
import p037e2.C4190a0;
import p037e2.C4215l;
import p037e2.C4216m;
import p037e2.C4217n;
import p085l2.C4912f;
import p092m2.C5017g;
import p106o2.C5168b;
import p106o2.C5173e;
import p106o2.C5178h;
import p106o2.C5179h0;
import p161w3.C5917a;
import p161w3.C5940i0;
import p177z1.C6272r1;

/* renamed from: g3.b */
/* compiled from: BundledHlsMediaChunkExtractor */
public final class C4361b implements C4375j {

    /* renamed from: d */
    private static final C4190a0 f24312d = new C4190a0();

    /* renamed from: a */
    final C4215l f24313a;

    /* renamed from: b */
    private final C6272r1 f24314b;

    /* renamed from: c */
    private final C5940i0 f24315c;

    public C4361b(C4215l lVar, C6272r1 r1Var, C5940i0 i0Var) {
        this.f24313a = lVar;
        this.f24314b = r1Var;
        this.f24315c = i0Var;
    }

    /* renamed from: a */
    public void mo17798a() {
        this.f24313a.mo17580c(0, 0);
    }

    /* renamed from: b */
    public boolean mo17799b(C4216m mVar) throws IOException {
        return this.f24313a.mo17582e(mVar, f24312d) == 0;
    }

    /* renamed from: c */
    public boolean mo17800c() {
        C4215l lVar = this.f24313a;
        return (lVar instanceof C5178h) || (lVar instanceof C5168b) || (lVar instanceof C5173e) || (lVar instanceof C4912f);
    }

    /* renamed from: d */
    public void mo17801d(C4217n nVar) {
        this.f24313a.mo17581d(nVar);
    }

    /* renamed from: e */
    public boolean mo17802e() {
        C4215l lVar = this.f24313a;
        return (lVar instanceof C5179h0) || (lVar instanceof C5017g);
    }

    /* renamed from: f */
    public C4375j mo17803f() {
        C4215l lVar;
        C5917a.m34873f(!mo17802e());
        C4215l lVar2 = this.f24313a;
        if (lVar2 instanceof C4389t) {
            lVar = new C4389t(this.f24314b.f30234c, this.f24315c);
        } else if (lVar2 instanceof C5178h) {
            lVar = new C5178h();
        } else if (lVar2 instanceof C5168b) {
            lVar = new C5168b();
        } else if (lVar2 instanceof C5173e) {
            lVar = new C5173e();
        } else if (lVar2 instanceof C4912f) {
            lVar = new C4912f();
        } else {
            throw new IllegalStateException("Unexpected extractor type for recreation: " + this.f24313a.getClass().getSimpleName());
        }
        return new C4361b(lVar, this.f24314b, this.f24315c);
    }
}
