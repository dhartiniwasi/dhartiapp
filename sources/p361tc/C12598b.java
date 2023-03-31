package p361tc;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p182a7.C6431n;
import p336qe.C12231c;
import p336qe.C12235f;
import p361tc.C12622j;
import p381vc.C12870a;
import p381vc.C12873c;
import p381vc.C12874d;
import p381vc.C12886i;

/* renamed from: tc.b */
/* compiled from: ExceptionHandlingFrameWriter */
final class C12598b implements C12873c {

    /* renamed from: d */
    private static final Logger f46184d = Logger.getLogger(C12615i.class.getName());

    /* renamed from: a */
    private final C12599a f46185a;

    /* renamed from: b */
    private final C12873c f46186b;

    /* renamed from: c */
    private final C12622j f46187c = new C12622j(Level.FINE, (Class<?>) C12615i.class);

    /* renamed from: tc.b$a */
    /* compiled from: ExceptionHandlingFrameWriter */
    interface C12599a {
        /* renamed from: e */
        void mo37452e(Throwable th);
    }

    C12598b(C12599a aVar, C12873c cVar) {
        this.f46185a = (C12599a) C6431n.m37562o(aVar, "transportExceptionHandler");
        this.f46186b = (C12873c) C6431n.m37562o(cVar, "frameWriter");
    }

    /* renamed from: a */
    static Level m59906a(Throwable th) {
        if (th.getClass().equals(IOException.class)) {
            return Level.FINE;
        }
        return Level.INFO;
    }

    /* renamed from: L0 */
    public void mo37443L0(boolean z, int i, C12231c cVar, int i2) {
        this.f46187c.mo37502b(C12622j.C12623a.OUTBOUND, i, cVar.mo36802j(), i2, z);
        try {
            this.f46186b.mo37443L0(z, i, cVar, i2);
        } catch (IOException e) {
            this.f46185a.mo37452e(e);
        }
    }

    /* renamed from: O0 */
    public void mo37444O0(int i, C12870a aVar, byte[] bArr) {
        this.f46187c.mo37503c(C12622j.C12623a.OUTBOUND, i, aVar, C12235f.m58767r(bArr));
        try {
            this.f46186b.mo37444O0(i, aVar, bArr);
            this.f46186b.flush();
        } catch (IOException e) {
            this.f46185a.mo37452e(e);
        }
    }

    /* renamed from: S0 */
    public void mo37445S0(C12886i iVar) {
        this.f46187c.mo37509i(C12622j.C12623a.OUTBOUND, iVar);
        try {
            this.f46186b.mo37445S0(iVar);
        } catch (IOException e) {
            this.f46185a.mo37452e(e);
        }
    }

    /* renamed from: b0 */
    public void mo37446b0() {
        try {
            this.f46186b.mo37446b0();
        } catch (IOException e) {
            this.f46185a.mo37452e(e);
        }
    }

    /* renamed from: b1 */
    public void mo37439b1(C12886i iVar) {
        this.f46187c.mo37510j(C12622j.C12623a.OUTBOUND);
        try {
            this.f46186b.mo37439b1(iVar);
        } catch (IOException e) {
            this.f46185a.mo37452e(e);
        }
    }

    /* renamed from: c */
    public void mo37447c(int i, long j) {
        this.f46187c.mo37511k(C12622j.C12623a.OUTBOUND, i, j);
        try {
            this.f46186b.mo37447c(i, j);
        } catch (IOException e) {
            this.f46185a.mo37452e(e);
        }
    }

    public void close() {
        try {
            this.f46186b.close();
        } catch (IOException e) {
            f46184d.log(m59906a(e), "Failed closing connection", e);
        }
    }

    public void flush() {
        try {
            this.f46186b.flush();
        } catch (IOException e) {
            this.f46185a.mo37452e(e);
        }
    }

    /* renamed from: i */
    public void mo37440i(boolean z, int i, int i2) {
        if (z) {
            this.f46187c.mo37506f(C12622j.C12623a.OUTBOUND, (4294967295L & ((long) i2)) | (((long) i) << 32));
        } else {
            this.f46187c.mo37505e(C12622j.C12623a.OUTBOUND, (4294967295L & ((long) i2)) | (((long) i) << 32));
        }
        try {
            this.f46186b.mo37440i(z, i, i2);
        } catch (IOException e) {
            this.f46185a.mo37452e(e);
        }
    }

    /* renamed from: r */
    public void mo37441r(int i, C12870a aVar) {
        this.f46187c.mo37508h(C12622j.C12623a.OUTBOUND, i, aVar);
        try {
            this.f46186b.mo37441r(i, aVar);
        } catch (IOException e) {
            this.f46185a.mo37452e(e);
        }
    }

    /* renamed from: t1 */
    public int mo37450t1() {
        return this.f46186b.mo37450t1();
    }

    /* renamed from: w1 */
    public void mo37451w1(boolean z, boolean z2, int i, int i2, List<C12874d> list) {
        try {
            this.f46186b.mo37451w1(z, z2, i, i2, list);
        } catch (IOException e) {
            this.f46185a.mo37452e(e);
        }
    }
}
