package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import p060h4.C4491d2;
import p060h4.C4583s4;
import p060h4.C4623z2;
import p066i4.C4680t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zn2 implements z91, wb1, rp2, C4680t, jc1, ma1, qh1 {

    /* renamed from: a */
    private final mu2 f21182a;

    /* renamed from: b */
    private final AtomicReference f21183b = new AtomicReference();

    /* renamed from: c */
    private final AtomicReference f21184c = new AtomicReference();

    /* renamed from: d */
    private final AtomicReference f21185d = new AtomicReference();

    /* renamed from: e */
    private final AtomicReference f21186e = new AtomicReference();

    /* renamed from: f */
    private final AtomicReference f21187f = new AtomicReference();

    /* renamed from: g */
    private final AtomicReference f21188g = new AtomicReference();

    /* renamed from: h */
    private zn2 f21189h = null;

    public zn2(mu2 mu2) {
        this.f21182a = mu2;
    }

    /* renamed from: f */
    public static zn2 m24693f(zn2 zn2) {
        zn2 zn22 = new zn2(zn2.f21182a);
        zn22.f21189h = zn2;
        return zn22;
    }

    /* renamed from: D */
    public final void mo15628D(C2859st stVar) {
        this.f21184c.set(stVar);
    }

    /* renamed from: R */
    public final void mo10490R(C4623z2 z2Var) {
        zn2 zn2 = this.f21189h;
        if (zn2 != null) {
            zn2.mo10490R(z2Var);
        } else {
            ip2.m14473a(this.f21185d, new vn2(z2Var));
        }
    }

    /* renamed from: U */
    public final void mo10491U() {
        zn2 zn2 = this.f21189h;
        if (zn2 != null) {
            zn2.mo10491U();
        } else {
            ip2.m14473a(this.f21186e, yn2.f20719a);
        }
    }

    /* renamed from: W */
    public final void mo15629W() {
        zn2 zn2 = this.f21189h;
        if (zn2 != null) {
            zn2.mo15629W();
            return;
        }
        this.f21182a.mo12444a();
        ip2.m14473a(this.f21184c, kn2.f12180a);
        ip2.m14473a(this.f21185d, ln2.f12854a);
    }

    /* renamed from: a */
    public final void mo8931a() {
        zn2 zn2 = this.f21189h;
        if (zn2 != null) {
            zn2.mo8931a();
        } else {
            ip2.m14473a(this.f21187f, wn2.f19726a);
        }
    }

    /* renamed from: c */
    public final void mo10492c(C4583s4 s4Var) {
        zn2 zn2 = this.f21189h;
        if (zn2 != null) {
            zn2.mo10492c(s4Var);
        } else {
            ip2.m14473a(this.f21188g, new mn2(s4Var));
        }
    }

    /* renamed from: d */
    public final void mo8932d() {
        zn2 zn2 = this.f21189h;
        if (zn2 != null) {
            zn2.mo8932d();
            return;
        }
        ip2.m14473a(this.f21187f, rn2.f17026a);
        ip2.m14473a(this.f21185d, tn2.f18173a);
        ip2.m14473a(this.f21185d, un2.f18646a);
    }

    /* renamed from: e */
    public final void mo11781e(rp2 rp2) {
        this.f21189h = (zn2) rp2;
    }

    /* renamed from: g */
    public final void mo9420g(C4623z2 z2Var) {
        zn2 zn2 = this.f21189h;
        if (zn2 != null) {
            zn2.mo9420g(z2Var);
            return;
        }
        ip2.m14473a(this.f21183b, new jn2(z2Var));
        ip2.m14473a(this.f21183b, new pn2(z2Var));
    }

    /* renamed from: h */
    public final void mo9272h() {
        zn2 zn2 = this.f21189h;
        if (zn2 != null) {
            zn2.mo9272h();
        } else {
            ip2.m14473a(this.f21185d, xn2.f20273a);
        }
    }

    /* renamed from: i5 */
    public final void mo8933i5() {
    }

    /* renamed from: j */
    public final void mo15630j(C2710ot otVar) {
        zn2 zn2 = this.f21189h;
        if (zn2 != null) {
            zn2.mo15630j(otVar);
        } else {
            ip2.m14473a(this.f21183b, new qn2(otVar));
        }
    }

    /* renamed from: k */
    public final void mo15631k(wb1 wb1) {
        this.f21186e.set(wb1);
    }

    /* renamed from: o3 */
    public final void mo8934o3() {
    }

    /* renamed from: p */
    public final void mo8935p(int i) {
        zn2 zn2 = this.f21189h;
        if (zn2 != null) {
            zn2.mo8935p(i);
        } else {
            ip2.m14473a(this.f21187f, new nn2(i));
        }
    }

    /* renamed from: r6 */
    public final void mo8936r6() {
        zn2 zn2 = this.f21189h;
        if (zn2 != null) {
            zn2.mo8936r6();
        } else {
            ip2.m14473a(this.f21187f, on2.f15275a);
        }
    }

    /* renamed from: t */
    public final void mo15632t(C4680t tVar) {
        this.f21187f.set(tVar);
    }

    /* renamed from: v */
    public final void mo15633v(C4491d2 d2Var) {
        this.f21188g.set(d2Var);
    }

    /* renamed from: x */
    public final void mo15634x(C2822rt rtVar) {
        this.f21183b.set(rtVar);
    }

    /* renamed from: z */
    public final void mo15635z(C2970vt vtVar) {
        this.f21185d.set(vtVar);
    }
}
