package p079k3;

import java.util.List;
import p021c2.C1850h;
import p161w3.C5917a;

/* renamed from: k3.m */
/* compiled from: SubtitleOutputBuffer */
public abstract class C4880m extends C1850h implements C4874h {

    /* renamed from: d */
    private C4874h f25807d;

    /* renamed from: e */
    private long f25808e;

    /* renamed from: a */
    public int mo18648a(long j) {
        return ((C4874h) C5917a.m34872e(this.f25807d)).mo18648a(j - this.f25808e);
    }

    /* renamed from: b */
    public long mo18649b(int i) {
        return ((C4874h) C5917a.m34872e(this.f25807d)).mo18649b(i) + this.f25808e;
    }

    /* renamed from: c */
    public List<C4864b> mo18650c(long j) {
        return ((C4874h) C5917a.m34872e(this.f25807d)).mo18650c(j - this.f25808e);
    }

    /* renamed from: j */
    public int mo18651j() {
        return ((C4874h) C5917a.m34872e(this.f25807d)).mo18651j();
    }

    /* renamed from: n */
    public void mo7029n() {
        super.mo7029n();
        this.f25807d = null;
    }

    /* renamed from: x */
    public void mo18659x(long j, C4874h hVar, long j2) {
        this.f5438b = j;
        this.f25807d = hVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f25808e = j;
    }
}
