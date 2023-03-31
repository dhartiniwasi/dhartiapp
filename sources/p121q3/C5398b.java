package p121q3;

import java.util.Collections;
import java.util.List;
import p079k3.C4864b;
import p079k3.C4874h;
import p161w3.C5917a;
import p161w3.C5953m0;

/* renamed from: q3.b */
/* compiled from: SubripSubtitle */
final class C5398b implements C4874h {

    /* renamed from: a */
    private final C4864b[] f27618a;

    /* renamed from: b */
    private final long[] f27619b;

    public C5398b(C4864b[] bVarArr, long[] jArr) {
        this.f27618a = bVarArr;
        this.f27619b = jArr;
    }

    /* renamed from: a */
    public int mo18648a(long j) {
        int e = C5953m0.m35128e(this.f27619b, j, false, false);
        if (e < this.f27619b.length) {
            return e;
        }
        return -1;
    }

    /* renamed from: b */
    public long mo18649b(int i) {
        boolean z = true;
        C5917a.m34868a(i >= 0);
        if (i >= this.f27619b.length) {
            z = false;
        }
        C5917a.m34868a(z);
        return this.f27619b[i];
    }

    /* renamed from: c */
    public List<C4864b> mo18650c(long j) {
        int i = C5953m0.m35136i(this.f27619b, j, true, false);
        if (i != -1) {
            C4864b[] bVarArr = this.f27618a;
            if (bVarArr[i] != C4864b.f25757z) {
                return Collections.singletonList(bVarArr[i]);
            }
        }
        return Collections.emptyList();
    }

    /* renamed from: j */
    public int mo18651j() {
        return this.f27619b.length;
    }
}
