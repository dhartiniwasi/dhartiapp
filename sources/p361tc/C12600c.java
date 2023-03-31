package p361tc;

import java.io.IOException;
import java.util.List;
import p182a7.C6431n;
import p336qe.C12231c;
import p381vc.C12870a;
import p381vc.C12873c;
import p381vc.C12874d;
import p381vc.C12886i;

/* renamed from: tc.c */
/* compiled from: ForwardingFrameWriter */
abstract class C12600c implements C12873c {

    /* renamed from: a */
    private final C12873c f46188a;

    public C12600c(C12873c cVar) {
        this.f46188a = (C12873c) C6431n.m37562o(cVar, "delegate");
    }

    /* renamed from: L0 */
    public void mo37443L0(boolean z, int i, C12231c cVar, int i2) throws IOException {
        this.f46188a.mo37443L0(z, i, cVar, i2);
    }

    /* renamed from: O0 */
    public void mo37444O0(int i, C12870a aVar, byte[] bArr) throws IOException {
        this.f46188a.mo37444O0(i, aVar, bArr);
    }

    /* renamed from: S0 */
    public void mo37445S0(C12886i iVar) throws IOException {
        this.f46188a.mo37445S0(iVar);
    }

    /* renamed from: b0 */
    public void mo37446b0() throws IOException {
        this.f46188a.mo37446b0();
    }

    /* renamed from: b1 */
    public void mo37439b1(C12886i iVar) throws IOException {
        this.f46188a.mo37439b1(iVar);
    }

    /* renamed from: c */
    public void mo37447c(int i, long j) throws IOException {
        this.f46188a.mo37447c(i, j);
    }

    public void close() throws IOException {
        this.f46188a.close();
    }

    public void flush() throws IOException {
        this.f46188a.flush();
    }

    /* renamed from: i */
    public void mo37440i(boolean z, int i, int i2) throws IOException {
        this.f46188a.mo37440i(z, i, i2);
    }

    /* renamed from: r */
    public void mo37441r(int i, C12870a aVar) throws IOException {
        this.f46188a.mo37441r(i, aVar);
    }

    /* renamed from: t1 */
    public int mo37450t1() {
        return this.f46188a.mo37450t1();
    }

    /* renamed from: w1 */
    public void mo37451w1(boolean z, boolean z2, int i, int i2, List<C12874d> list) throws IOException {
        this.f46188a.mo37451w1(z, z2, i, i2, list);
    }
}
