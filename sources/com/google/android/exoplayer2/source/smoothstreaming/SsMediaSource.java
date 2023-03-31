package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.source.smoothstreaming.C2033a;
import com.google.android.exoplayer2.source.smoothstreaming.C2036b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p005a3.C0092b;
import p005a3.C0093c;
import p015b3.C1687a;
import p015b3.C1700e0;
import p015b3.C1712i;
import p015b3.C1729l;
import p015b3.C1748q;
import p015b3.C1759t;
import p015b3.C1765u;
import p015b3.C1767u0;
import p015b3.C1772x;
import p030d2.C4001b0;
import p030d2.C4033l;
import p030d2.C4052y;
import p072j3.C4734a;
import p072j3.C4737b;
import p155v3.C5789b;
import p155v3.C5804g0;
import p155v3.C5810h0;
import p155v3.C5820i0;
import p155v3.C5823j0;
import p155v3.C5828l;
import p155v3.C5840p0;
import p155v3.C5853x;
import p161w3.C5917a;
import p161w3.C5953m0;
import p177z1.C6260o1;
import p177z1.C6300z1;
import p254i3.C10546a;

public final class SsMediaSource extends C1687a implements C5810h0.C5812b<C5823j0<C4734a>> {

    /* renamed from: A */
    private final C5823j0.C5824a<? extends C4734a> f5895A;

    /* renamed from: B */
    private final ArrayList<C2038c> f5896B;

    /* renamed from: C */
    private C5828l f5897C;

    /* renamed from: D */
    private C5810h0 f5898D;

    /* renamed from: E */
    private C5820i0 f5899E;

    /* renamed from: F */
    private C5840p0 f5900F;

    /* renamed from: G */
    private long f5901G;

    /* renamed from: H */
    private C4734a f5902H;

    /* renamed from: I */
    private Handler f5903I;

    /* renamed from: h */
    private final boolean f5904h;

    /* renamed from: i */
    private final Uri f5905i;

    /* renamed from: r */
    private final C6300z1.C6311h f5906r;

    /* renamed from: s */
    private final C6300z1 f5907s;

    /* renamed from: t */
    private final C5828l.C5829a f5908t;

    /* renamed from: u */
    private final C2036b.C2037a f5909u;

    /* renamed from: v */
    private final C1712i f5910v;

    /* renamed from: w */
    private final C4052y f5911w;

    /* renamed from: x */
    private final C5804g0 f5912x;

    /* renamed from: y */
    private final long f5913y;

    /* renamed from: z */
    private final C1700e0.C1701a f5914z;

    public static final class Factory implements C1772x.C1773a {

        /* renamed from: a */
        private final C2036b.C2037a f5915a;

        /* renamed from: b */
        private final C5828l.C5829a f5916b;

        /* renamed from: c */
        private C1712i f5917c;

        /* renamed from: d */
        private C4001b0 f5918d;

        /* renamed from: e */
        private C5804g0 f5919e;

        /* renamed from: f */
        private long f5920f;

        /* renamed from: g */
        private C5823j0.C5824a<? extends C4734a> f5921g;

        public Factory(C5828l.C5829a aVar) {
            this(new C2033a.C2034a(aVar), aVar);
        }

        /* renamed from: a */
        public SsMediaSource mo7795a(C6300z1 z1Var) {
            C5917a.m34872e(z1Var.f30391b);
            C5823j0.C5824a aVar = this.f5921g;
            if (aVar == null) {
                aVar = new C4737b();
            }
            List<C0093c> list = z1Var.f30391b.f30459e;
            return new SsMediaSource(z1Var, (C4734a) null, this.f5916b, !list.isEmpty() ? new C0092b(aVar, list) : aVar, this.f5915a, this.f5917c, this.f5918d.mo17162a(z1Var), this.f5919e, this.f5920f);
        }

        public Factory(C2036b.C2037a aVar, C5828l.C5829a aVar2) {
            this.f5915a = (C2036b.C2037a) C5917a.m34872e(aVar);
            this.f5916b = aVar2;
            this.f5918d = new C4033l();
            this.f5919e = new C5853x();
            this.f5920f = 30000;
            this.f5917c = new C1729l();
        }
    }

    static {
        C6260o1.m36802a("goog.exo.smoothstreaming");
    }

    /* renamed from: J */
    private void m8941J() {
        C1767u0 u0Var;
        for (int i = 0; i < this.f5896B.size(); i++) {
            this.f5896B.get(i).mo7801u(this.f5902H);
        }
        long j = Long.MIN_VALUE;
        long j2 = Long.MAX_VALUE;
        for (C4734a.C4736b bVar : this.f5902H.f25338f) {
            if (bVar.f25354k > 0) {
                j2 = Math.min(j2, bVar.mo18399e(0));
                j = Math.max(j, bVar.mo18399e(bVar.f25354k - 1) + bVar.mo18397c(bVar.f25354k - 1));
            }
        }
        if (j2 == Long.MAX_VALUE) {
            long j3 = this.f5902H.f25336d ? -9223372036854775807L : 0;
            C4734a aVar = this.f5902H;
            boolean z = aVar.f25336d;
            u0Var = new C1767u0(j3, 0, 0, 0, true, z, z, aVar, this.f5907s);
        } else {
            C4734a aVar2 = this.f5902H;
            if (aVar2.f25336d) {
                long j4 = aVar2.f25340h;
                if (j4 != -9223372036854775807L && j4 > 0) {
                    j2 = Math.max(j2, j - j4);
                }
                long j5 = j2;
                long j6 = j - j5;
                long B0 = j6 - C5953m0.m35071B0(this.f5913y);
                if (B0 < 5000000) {
                    B0 = Math.min(5000000, j6 / 2);
                }
                u0Var = new C1767u0(-9223372036854775807L, j6, j5, B0, true, true, true, this.f5902H, this.f5907s);
            } else {
                long j7 = aVar2.f25339g;
                long j8 = j7 != -9223372036854775807L ? j7 : j - j2;
                u0Var = new C1767u0(j2 + j8, j8, j2, 0, true, false, false, this.f5902H, this.f5907s);
            }
        }
        mo6652D(u0Var);
    }

    /* renamed from: K */
    private void m8942K() {
        if (this.f5902H.f25336d) {
            this.f5903I.postDelayed(new C10546a(this), Math.max(0, (this.f5901G + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public void m8943L() {
        if (!this.f5898D.mo20336i()) {
            C5823j0 j0Var = new C5823j0(this.f5897C, this.f5905i, 4, this.f5895A);
            this.f5914z.mo6731z(new C1748q(j0Var.f28845a, j0Var.f28846b, this.f5898D.mo20341n(j0Var, this, this.f5912x.mo20332d(j0Var.f28847c))), j0Var.f28847c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo6651C(C5840p0 p0Var) {
        this.f5900F = p0Var;
        this.f5911w.mo17207H();
        this.f5911w.mo17210c(Looper.myLooper(), mo6649A());
        if (this.f5904h) {
            this.f5899E = new C5820i0.C5821a();
            m8941J();
            return;
        }
        this.f5897C = this.f5908t.mo20353a();
        C5810h0 h0Var = new C5810h0("SsMediaSource");
        this.f5898D = h0Var;
        this.f5899E = h0Var;
        this.f5903I = C5953m0.m35164w();
        m8943L();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo6653E() {
        this.f5902H = this.f5904h ? this.f5902H : null;
        this.f5897C = null;
        this.f5901G = 0;
        C5810h0 h0Var = this.f5898D;
        if (h0Var != null) {
            h0Var.mo20339l();
            this.f5898D = null;
        }
        Handler handler = this.f5903I;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f5903I = null;
        }
        this.f5911w.mo17208a();
    }

    /* renamed from: G */
    public void mo6784q(C5823j0<C4734a> j0Var, long j, long j2, boolean z) {
        C5823j0<C4734a> j0Var2 = j0Var;
        C1748q qVar = new C1748q(j0Var2.f28845a, j0Var2.f28846b, j0Var.mo20352f(), j0Var.mo20350d(), j, j2, j0Var.mo20349a());
        this.f5912x.mo20330b(j0Var2.f28845a);
        this.f5914z.mo6722q(qVar, j0Var2.f28847c);
    }

    /* renamed from: H */
    public void mo6780j(C5823j0<C4734a> j0Var, long j, long j2) {
        C5823j0<C4734a> j0Var2 = j0Var;
        C1748q qVar = new C1748q(j0Var2.f28845a, j0Var2.f28846b, j0Var.mo20352f(), j0Var.mo20350d(), j, j2, j0Var.mo20349a());
        this.f5912x.mo20330b(j0Var2.f28845a);
        this.f5914z.mo6725t(qVar, j0Var2.f28847c);
        this.f5902H = j0Var.mo20351e();
        this.f5901G = j - j2;
        m8941J();
        m8942K();
    }

    /* renamed from: I */
    public C5810h0.C5813c mo6783o(C5823j0<C4734a> j0Var, long j, long j2, IOException iOException, int i) {
        C5810h0.C5813c cVar;
        C5823j0<C4734a> j0Var2 = j0Var;
        IOException iOException2 = iOException;
        C1748q qVar = new C1748q(j0Var2.f28845a, j0Var2.f28846b, j0Var.mo20352f(), j0Var.mo20350d(), j, j2, j0Var.mo20349a());
        long c = this.f5912x.mo20331c(new C5804g0.C5807c(qVar, new C1759t(j0Var2.f28847c), iOException2, i));
        if (c == -9223372036854775807L) {
            cVar = C5810h0.f28824g;
        } else {
            cVar = C5810h0.m34569h(false, c);
        }
        boolean z = !cVar.mo20342c();
        this.f5914z.mo6729x(qVar, j0Var2.f28847c, iOException2, z);
        if (z) {
            this.f5912x.mo20330b(j0Var2.f28845a);
        }
        return cVar;
    }

    /* renamed from: d */
    public void mo6707d(C1765u uVar) {
        ((C2038c) uVar).mo7800q();
        this.f5896B.remove(uVar);
    }

    /* renamed from: i */
    public C6300z1 mo6708i() {
        return this.f5907s;
    }

    /* renamed from: k */
    public C1765u mo6709k(C1772x.C1774b bVar, C5789b bVar2, long j) {
        C1700e0.C1701a w = mo6667w(bVar);
        C2038c cVar = new C2038c(this.f5902H, this.f5909u, this.f5900F, this.f5910v, this.f5911w, mo6665u(bVar), this.f5912x, w, this.f5899E, bVar2);
        this.f5896B.add(cVar);
        return cVar;
    }

    /* renamed from: l */
    public void mo6710l() throws IOException {
        this.f5899E.mo7740b();
    }

    private SsMediaSource(C6300z1 z1Var, C4734a aVar, C5828l.C5829a aVar2, C5823j0.C5824a<? extends C4734a> aVar3, C2036b.C2037a aVar4, C1712i iVar, C4052y yVar, C5804g0 g0Var, long j) {
        Uri uri;
        boolean z = false;
        C5917a.m34873f(aVar == null || !aVar.f25336d);
        this.f5907s = z1Var;
        C6300z1.C6311h hVar = (C6300z1.C6311h) C5917a.m34872e(z1Var.f30391b);
        this.f5906r = hVar;
        this.f5902H = aVar;
        if (hVar.f30455a.equals(Uri.EMPTY)) {
            uri = null;
        } else {
            uri = C5953m0.m35070B(hVar.f30455a);
        }
        this.f5905i = uri;
        this.f5908t = aVar2;
        this.f5895A = aVar3;
        this.f5909u = aVar4;
        this.f5910v = iVar;
        this.f5911w = yVar;
        this.f5912x = g0Var;
        this.f5913y = j;
        this.f5914z = mo6667w((C1772x.C1774b) null);
        this.f5904h = aVar != null ? true : z;
        this.f5896B = new ArrayList<>();
    }
}
