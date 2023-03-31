package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import p060h4.C4541l4;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ap2 implements up2 {

    /* renamed from: a */
    private final up2 f6716a;

    /* renamed from: b */
    private final up2 f6717b;

    /* renamed from: c */
    private final nv2 f6718c;

    /* renamed from: d */
    private final String f6719d;

    /* renamed from: e */
    private e91 f6720e;

    /* renamed from: f */
    private final Executor f6721f;

    public ap2(up2 up2, up2 up22, nv2 nv2, String str, Executor executor) {
        this.f6716a = up2;
        this.f6717b = up22;
        this.f6718c = nv2;
        this.f6719d = str;
        this.f6721f = executor;
    }

    /* renamed from: g */
    private final lf3 m9915g(zu2 zu2, wp2 wp2) {
        e91 e91 = zu2.f21280a;
        this.f6720e = e91;
        if (zu2.f21282c != null) {
            if (e91.mo9827T() != null) {
                zu2.f21282c.mo14682f().mo11781e(zu2.f21280a.mo9827T());
            }
            return cf3.m10911i(zu2.f21282c);
        }
        e91.mo9830d().mo8240k(zu2.f21281b);
        return ((kp2) this.f6716a).mo11757d(wp2, (tp2) null, zu2.f21280a);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ lf3 mo8486a(wp2 wp2, tp2 tp2, Object obj) {
        return mo8491f(wp2, tp2, (e91) null);
    }

    /* renamed from: c */
    public final synchronized e91 mo8487b() {
        return this.f6720e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ lf3 mo8489d(wp2 wp2, zo2 zo2, tp2 tp2, e91 e91, fp2 fp2) throws Exception {
        if (fp2 != null) {
            zo2 zo22 = new zo2(zo2.f21209a, zo2.f21210b, zo2.f21211c, zo2.f21212d, zo2.f21213e, zo2.f21214f, fp2.f9389a);
            if (fp2.f9391c != null) {
                this.f6720e = null;
                this.f6718c.mo12719e(zo22);
                return m9915g(fp2.f9391c, wp2);
            }
            lf3 a = this.f6718c.mo12718a(zo22);
            if (a != null) {
                this.f6720e = null;
                return cf3.m10916n(a, new wo2(this), this.f6721f);
            }
            this.f6718c.mo12719e(zo22);
            wp2 = new wp2(wp2.f19736b, fp2.f9390b);
        }
        lf3 d = ((kp2) this.f6716a).mo11757d(wp2, tp2, e91);
        this.f6720e = e91;
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ lf3 mo8490e(kv2 kv2) throws Exception {
        mv2 mv2;
        if (kv2 == null || kv2.f12307a == null || (mv2 = kv2.f12308b) == null) {
            throw new cz1(1, "Empty prefetch");
        }
        C2601lv G = C2824rv.m20046G();
        C2527jv G2 = C2564kv.m15626G();
        G2.mo11522u(2);
        G2.mo11520r(C2712ov.m18100I());
        G.mo12153p(G2);
        kv2.f12307a.f21280a.mo9830d().mo8232c().mo10152F((C2824rv) G.mo13423m());
        return m9915g(kv2.f12307a, ((zo2) mv2).f21210b);
    }

    /* renamed from: f */
    public final synchronized lf3 mo8491f(wp2 wp2, tp2 tp2, e91 e91) {
        wp2 wp22 = wp2;
        tp2 tp22 = tp2;
        synchronized (this) {
            d91 a = tp22.mo9632a(wp22.f19736b);
            a.mo9467j(new bp2(this.f6719d));
            e91 e912 = (e91) a.mo9466U();
            e912.mo9829c();
            e912.mo9829c();
            C4541l4 l4Var = e912.mo9829c().f8933d;
            if (l4Var.f24883A == null) {
                if (l4Var.f24888F == null) {
                    et2 c = e912.mo9829c();
                    tp2 tp23 = tp2;
                    wp2 wp23 = wp2;
                    lf3 n = cf3.m10916n(se3.m20287D(((gp2) this.f6717b).mo10603d(wp22, tp22, e912)), new xo2(this, wp2, new zo2(tp23, wp23, c.f8933d, c.f8935f, this.f6721f, c.f8939j, (bv2) null), tp2, e912), this.f6721f);
                    return n;
                }
            }
            this.f6720e = e912;
            lf3 d = ((kp2) this.f6716a).mo11757d(wp22, tp22, e912);
            return d;
        }
    }
}
