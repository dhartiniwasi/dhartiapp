package p264io.grpc.internal;

import java.util.concurrent.atomic.AtomicBoolean;
import p343rc.C12271a;
import p343rc.C12335j1;
import p343rc.C12340k;
import p343rc.C12356m1;
import p343rc.C12411y0;

/* renamed from: io.grpc.internal.i2 */
/* compiled from: StatsTraceContext */
public final class C11255i2 {

    /* renamed from: c */
    public static final C11255i2 f43331c = new C11255i2(new C12356m1[0]);

    /* renamed from: a */
    private final C12356m1[] f43332a;

    /* renamed from: b */
    private final AtomicBoolean f43333b = new AtomicBoolean(false);

    C11255i2(C12356m1[] m1VarArr) {
        this.f43332a = m1VarArr;
    }

    /* renamed from: h */
    public static C11255i2 m55512h(C12340k[] kVarArr, C12271a aVar, C12411y0 y0Var) {
        C11255i2 i2Var = new C11255i2(kVarArr);
        for (C12340k m : kVarArr) {
            m.mo37041m(aVar, y0Var);
        }
        return i2Var;
    }

    /* renamed from: a */
    public void mo35193a() {
        for (C12356m1 m1Var : this.f43332a) {
            ((C12340k) m1Var).mo37038j();
        }
    }

    /* renamed from: b */
    public void mo35194b(C12411y0 y0Var) {
        for (C12356m1 m1Var : this.f43332a) {
            ((C12340k) m1Var).mo37039k(y0Var);
        }
    }

    /* renamed from: c */
    public void mo35195c() {
        for (C12356m1 m1Var : this.f43332a) {
            ((C12340k) m1Var).mo37040l();
        }
    }

    /* renamed from: d */
    public void mo35196d(int i) {
        for (C12356m1 a : this.f43332a) {
            a.mo37055a(i);
        }
    }

    /* renamed from: e */
    public void mo35197e(int i, long j, long j2) {
        for (C12356m1 b : this.f43332a) {
            b.mo37056b(i, j, j2);
        }
    }

    /* renamed from: f */
    public void mo35198f(long j) {
        for (C12356m1 c : this.f43332a) {
            c.mo37057c(j);
        }
    }

    /* renamed from: g */
    public void mo35199g(long j) {
        for (C12356m1 d : this.f43332a) {
            d.mo37058d(j);
        }
    }

    /* renamed from: i */
    public void mo35200i(int i) {
        for (C12356m1 e : this.f43332a) {
            e.mo37059e(i);
        }
    }

    /* renamed from: j */
    public void mo35201j(int i, long j, long j2) {
        for (C12356m1 f : this.f43332a) {
            f.mo37060f(i, j, j2);
        }
    }

    /* renamed from: k */
    public void mo35202k(long j) {
        for (C12356m1 g : this.f43332a) {
            g.mo37061g(j);
        }
    }

    /* renamed from: l */
    public void mo35203l(long j) {
        for (C12356m1 h : this.f43332a) {
            h.mo35455h(j);
        }
    }

    /* renamed from: m */
    public void mo35204m(C12335j1 j1Var) {
        if (this.f43333b.compareAndSet(false, true)) {
            for (C12356m1 i : this.f43332a) {
                i.mo37062i(j1Var);
            }
        }
    }
}
