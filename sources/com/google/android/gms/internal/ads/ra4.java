package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ra4 implements l84 {

    /* renamed from: a */
    private final wa1 f16896a;

    /* renamed from: b */
    private final dq0 f16897b;

    /* renamed from: c */
    private final fs0 f16898c = new fs0();

    /* renamed from: d */
    private final qa4 f16899d;

    /* renamed from: e */
    private final SparseArray f16900e;

    /* renamed from: f */
    private lq1 f16901f;

    /* renamed from: g */
    private zl0 f16902g;

    /* renamed from: h */
    private fk1 f16903h;

    /* renamed from: i */
    private boolean f16904i;

    public ra4(wa1 wa1) {
        Objects.requireNonNull(wa1);
        this.f16896a = wa1;
        this.f16901f = new lq1(gb2.m13165e(), wa1, v84.f18977a);
        dq0 dq0 = new dq0();
        this.f16897b = dq0;
        this.f16899d = new qa4(dq0);
        this.f16900e = new SparseArray();
    }

    /* renamed from: Z */
    public static /* synthetic */ void m19638Z(ra4 ra4) {
        m84 E = ra4.mo13705E();
        ra4.mo13728c0(E, 1028, new m94(E));
        ra4.f16901f.mo12063e();
    }

    /* renamed from: d0 */
    private final m84 m19639d0(mg4 mg4) {
        gt0 gt0;
        Objects.requireNonNull(this.f16902g);
        if (mg4 == null) {
            gt0 = null;
        } else {
            gt0 = this.f16899d.mo13501a(mg4);
        }
        if (mg4 != null && gt0 != null) {
            return mo13706F(gt0, gt0.mo10608n(mg4.f12629a, this.f16897b).f8361c, mg4);
        }
        int T = this.f16902g.mo9045T();
        gt0 a0 = this.f16902g.mo9053a0();
        if (T >= a0.mo8901c()) {
            a0 = gt0.f10059a;
        }
        return mo13706F(a0, T, (mg4) null);
    }

    /* renamed from: e0 */
    private final m84 m19640e0(int i, mg4 mg4) {
        zl0 zl0 = this.f16902g;
        Objects.requireNonNull(zl0);
        if (mg4 == null) {
            gt0 a0 = zl0.mo9053a0();
            if (i >= a0.mo8901c()) {
                a0 = gt0.f10059a;
            }
            return mo13706F(a0, i, (mg4) null);
        } else if (this.f16899d.mo13501a(mg4) != null) {
            return m19639d0(mg4);
        } else {
            return mo13706F(gt0.f10059a, i, mg4);
        }
    }

    /* renamed from: f0 */
    private final m84 m19641f0() {
        return m19639d0(this.f16899d.mo13504d());
    }

    /* renamed from: g0 */
    private final m84 m19642g0() {
        return m19639d0(this.f16899d.mo13505e());
    }

    /* renamed from: h0 */
    private final m84 m19643h0(gc0 gc0) {
        l30 l30;
        if (!(gc0 instanceof u44) || (l30 = ((u44) gc0).f18382i) == null) {
            return mo13705E();
        }
        return m19639d0(new mg4(l30));
    }

    /* renamed from: A */
    public final void mo11914A(long j) {
        m84 g0 = m19642g0();
        mo13728c0(g0, 1010, new ha4(g0, j));
    }

    /* renamed from: B */
    public final void mo11915B(Object obj, long j) {
        m84 g0 = m19642g0();
        mo13728c0(g0, 26, new la4(g0, obj, j));
    }

    /* renamed from: C */
    public final void mo11916C(C2388g4 g4Var, oz3 oz3) {
        m84 g0 = m19642g0();
        mo13728c0(g0, 1009, new ea4(g0, g4Var, oz3));
    }

    /* renamed from: D */
    public final void mo11917D(o84 o84) {
        this.f16901f.mo12060b(o84);
    }

    /* renamed from: D0 */
    public final void mo13704D0(int i) {
        m84 E = mo13705E();
        mo13728c0(E, 4, new z94(E, i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final m84 mo13705E() {
        return m19639d0(this.f16899d.mo13502b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final m84 mo13706F(gt0 gt0, int i, mg4 mg4) {
        gt0 gt02 = gt0;
        int i2 = i;
        boolean z = true;
        mg4 mg42 = true == gt0.mo10643o() ? null : mg4;
        long zza = this.f16896a.zza();
        if (!gt02.equals(this.f16902g.mo9053a0()) || i2 != this.f16902g.mo9045T()) {
            z = false;
        }
        long j = 0;
        if (mg42 == null || !mg42.mo11883b()) {
            if (z) {
                j = this.f16902g.mo9049X();
            } else if (!gt0.mo10643o()) {
                long j2 = gt02.mo8903e(i2, this.f16898c, 0).f9436k;
                j = gb2.m13176j0(0);
            }
        } else if (z && this.f16902g.mo9054b() == mg42.f12630b && this.f16902g.mo9052a() == mg42.f12631c) {
            j = this.f16902g.mo9051Z();
        }
        return new m84(zza, gt0, i, mg42, j, this.f16902g.mo9053a0(), this.f16902g.mo9045T(), this.f16899d.mo13502b(), this.f16902g.mo9051Z(), this.f16902g.mo9056c0());
    }

    /* renamed from: G */
    public final void mo13707G(boolean z) {
        m84 E = mo13705E();
        mo13728c0(E, 7, new w94(E, z));
    }

    /* renamed from: H */
    public final void mo13708H(int i) {
        m84 E = mo13705E();
        mo13728c0(E, 6, new na4(E, i));
    }

    /* renamed from: I */
    public final void mo13709I(s61 s61) {
        m84 g0 = m19642g0();
        mo13728c0(g0, 25, new ja4(g0, s61));
    }

    /* renamed from: J */
    public final void mo13710J(int i, int i2) {
        m84 g0 = m19642g0();
        mo13728c0(g0, 24, new ma4(g0, i, i2));
    }

    /* renamed from: K */
    public final void mo13711K(p41 p41) {
        m84 E = mo13705E();
        mo13728c0(E, 2, new g94(E, p41));
    }

    /* renamed from: L */
    public final void mo13712L(fe0 fe0) {
        m84 E = mo13705E();
        mo13728c0(E, 12, new u84(E, fe0));
    }

    /* renamed from: M */
    public final void mo13713M(boolean z) {
        m84 E = mo13705E();
        mo13728c0(E, 3, new oa4(E, z));
    }

    /* renamed from: N */
    public final void mo13714N(float f) {
        m84 g0 = m19642g0();
        mo13728c0(g0, 22, new t84(g0, f));
    }

    /* renamed from: O */
    public final void mo13715O(boolean z, int i) {
        m84 E = mo13705E();
        mo13728c0(E, 5, new v94(E, z, i));
    }

    /* renamed from: P */
    public final void mo13716P(gc0 gc0) {
        m84 h0 = m19643h0(gc0);
        mo13728c0(h0, 10, new ca4(h0, gc0));
    }

    /* renamed from: Q */
    public final void mo13717Q(C2453hw hwVar, int i) {
        m84 E = mo13705E();
        mo13728c0(E, 1, new aa4(E, hwVar, i));
    }

    /* renamed from: R */
    public final void mo13718R(ch4 ch4) {
        m84 E = mo13705E();
        mo13728c0(E, 29, new f94(E, ch4));
    }

    /* renamed from: S */
    public final void mo13719S(gc0 gc0) {
        m84 h0 = m19643h0(gc0);
        mo13728c0(h0, 10, new r94(h0, gc0));
    }

    /* renamed from: T */
    public final void mo13720T(wh0 wh0) {
        m84 E = mo13705E();
        mo13728c0(E, 13, new e94(E, wh0));
    }

    /* renamed from: U */
    public final void mo13721U(boolean z, int i) {
        m84 E = mo13705E();
        mo13728c0(E, -1, new p84(E, z, i));
    }

    /* renamed from: V */
    public final void mo13722V(gt0 gt0, int i) {
        qa4 qa4 = this.f16899d;
        zl0 zl0 = this.f16902g;
        Objects.requireNonNull(zl0);
        qa4.mo13508i(zl0);
        m84 E = mo13705E();
        mo13728c0(E, 0, new n94(E, i));
    }

    /* renamed from: W */
    public final void mo13723W(m20 m20) {
        m84 E = mo13705E();
        mo13728c0(E, 14, new da4(E, m20));
    }

    /* renamed from: X */
    public final void mo13724X(yk0 yk0, yk0 yk02, int i) {
        if (i == 1) {
            this.f16904i = false;
            i = 1;
        }
        qa4 qa4 = this.f16899d;
        zl0 zl0 = this.f16902g;
        Objects.requireNonNull(zl0);
        qa4.mo13506g(zl0);
        m84 E = mo13705E();
        mo13728c0(E, 11, new d94(E, i, yk0, yk02));
    }

    /* renamed from: Y */
    public final void mo13725Y(int i, boolean z) {
        m84 E = mo13705E();
        mo13728c0(E, 30, new i94(E, i, z));
    }

    /* renamed from: a */
    public final void mo11909a(int i, mg4 mg4, cg4 cg4, ig4 ig4) {
        m84 e0 = m19640e0(i, mg4);
        mo13728c0(e0, AdError.NO_FILL_ERROR_CODE, new ba4(e0, cg4, ig4));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public final /* synthetic */ void mo13726a0(zl0 zl0, o84 o84, C2197b bVar) {
        o84.mo11214c(zl0, new n84(bVar, this.f16900e));
    }

    /* renamed from: b */
    public final void mo11910b(int i, mg4 mg4, cg4 cg4, ig4 ig4) {
        m84 e0 = m19640e0(i, mg4);
        mo13728c0(e0, AdError.NETWORK_ERROR_CODE, new u94(e0, cg4, ig4));
    }

    /* renamed from: b0 */
    public final void mo13727b0() {
        m84 E = mo13705E();
        mo13728c0(E, -1, new w84(E));
    }

    /* renamed from: c */
    public final void mo11911c(int i, mg4 mg4, ig4 ig4) {
        m84 e0 = m19640e0(i, mg4);
        mo13728c0(e0, 1004, new y84(e0, ig4));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public final void mo13728c0(m84 m84, int i, in1 in1) {
        this.f16900e.put(i, m84);
        lq1 lq1 = this.f16901f;
        lq1.mo12062d(i, in1);
        lq1.mo12061c();
    }

    /* renamed from: d */
    public final void mo11912d(int i, mg4 mg4, cg4 cg4, ig4 ig4) {
        m84 e0 = m19640e0(i, mg4);
        mo13728c0(e0, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, new q94(e0, cg4, ig4));
    }

    /* renamed from: e */
    public final void mo12041e(int i, long j, long j2) {
        m84 d0 = m19639d0(this.f16899d.mo13503c());
        mo13728c0(d0, 1006, new a94(d0, i, j, j2));
    }

    /* renamed from: f */
    public final void mo11918f(String str) {
        m84 g0 = m19642g0();
        mo13728c0(g0, 1012, new pa4(g0, str));
    }

    /* renamed from: g */
    public final void mo11919g(int i, long j) {
        m84 f0 = m19641f0();
        mo13728c0(f0, 1018, new o94(f0, i, j));
    }

    /* renamed from: h */
    public final void mo11920h(ny3 ny3) {
        m84 f0 = m19641f0();
        mo13728c0(f0, 1013, new fa4(f0, ny3));
    }

    /* renamed from: i */
    public final void mo11921i(Exception exc) {
        m84 g0 = m19642g0();
        mo13728c0(g0, 1030, new z84(g0, exc));
    }

    /* renamed from: j */
    public final void mo11922j(String str, long j, long j2) {
        m84 g0 = m19642g0();
        mo13728c0(g0, 1016, new k94(g0, str, j2, j));
    }

    /* renamed from: k */
    public final void mo11923k(C2388g4 g4Var, oz3 oz3) {
        m84 g0 = m19642g0();
        mo13728c0(g0, 1017, new q84(g0, g4Var, oz3));
    }

    /* renamed from: k0 */
    public final void mo13729k0(boolean z) {
        m84 g0 = m19642g0();
        mo13728c0(g0, 23, new x94(g0, z));
    }

    /* renamed from: l */
    public final void mo11924l(o84 o84) {
        this.f16901f.mo12064f(o84);
    }

    /* renamed from: m */
    public final void mo11925m(ny3 ny3) {
        m84 f0 = m19641f0();
        mo13728c0(f0, 1020, new ka4(f0, ny3));
    }

    /* renamed from: n */
    public final void mo11926n() {
        fk1 fk1 = this.f16903h;
        v91.m22048b(fk1);
        fk1.mo9039r(new ga4(this));
    }

    /* renamed from: o */
    public final void mo11927o(String str) {
        m84 g0 = m19642g0();
        mo13728c0(g0, 1019, new r84(g0, str));
    }

    /* renamed from: p */
    public final void mo11928p(ny3 ny3) {
        m84 g0 = m19642g0();
        mo13728c0(g0, 1007, new t94(g0, ny3));
    }

    /* renamed from: q */
    public final void mo11929q() {
        if (!this.f16904i) {
            m84 E = mo13705E();
            this.f16904i = true;
            mo13728c0(E, -1, new ia4(E));
        }
    }

    /* renamed from: r */
    public final void mo11930r(long j, int i) {
        m84 f0 = m19641f0();
        mo13728c0(f0, 1021, new c94(f0, j, i));
    }

    /* renamed from: s */
    public final void mo11931s(List list, mg4 mg4) {
        qa4 qa4 = this.f16899d;
        zl0 zl0 = this.f16902g;
        Objects.requireNonNull(zl0);
        qa4.mo13507h(list, mg4, zl0);
    }

    /* renamed from: t */
    public final void mo11932t(Exception exc) {
        m84 g0 = m19642g0();
        mo13728c0(g0, 1014, new b94(g0, exc));
    }

    /* renamed from: u */
    public final void mo11933u(Exception exc) {
        m84 g0 = m19642g0();
        mo13728c0(g0, 1029, new h94(g0, exc));
    }

    /* renamed from: v */
    public final void mo11934v(int i, long j, long j2) {
        m84 g0 = m19642g0();
        mo13728c0(g0, 1011, new s84(g0, i, j, j2));
    }

    /* renamed from: w */
    public final void mo11935w(ny3 ny3) {
        m84 g0 = m19642g0();
        mo13728c0(g0, 1015, new p94(g0, ny3));
    }

    /* renamed from: x */
    public final void mo11936x(String str, long j, long j2) {
        m84 g0 = m19642g0();
        mo13728c0(g0, 1008, new s94(g0, str, j2, j));
    }

    /* renamed from: y */
    public final void mo11937y(zl0 zl0, Looper looper) {
        boolean z = true;
        if (this.f16902g != null && !this.f16899d.f16324b.isEmpty()) {
            z = false;
        }
        v91.m22052f(z);
        Objects.requireNonNull(zl0);
        this.f16902g = zl0;
        this.f16903h = this.f16896a.mo14878a(looper, (Handler.Callback) null);
        this.f16901f = this.f16901f.mo12059a(looper, new j94(this, zl0));
    }

    /* renamed from: z */
    public final void mo11913z(int i, mg4 mg4, cg4 cg4, ig4 ig4, IOException iOException, boolean z) {
        m84 e0 = m19640e0(i, mg4);
        mo13728c0(e0, 1003, new l94(e0, cg4, ig4, iOException, z));
    }
}
