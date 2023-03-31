package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.C0835a0;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p053g4.C4391b;
import p053g4.C4409t;
import p060h4.C4470a;
import p060h4.C4596v;
import p066i4.C4661c0;
import p066i4.C4665e0;
import p066i4.C4669i;
import p066i4.C4678r;
import p066i4.C4679s;
import p066i4.C4680t;
import p067i5.C4700n;
import p073j4.C4751b2;
import p073j4.C4794n1;
import p073j4.C4811t0;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class ct0 extends WebViewClient implements ku0 {

    /* renamed from: K */
    public static final /* synthetic */ int f7895K = 0;

    /* renamed from: A */
    private C4391b f7896A;

    /* renamed from: B */
    private ee0 f7897B;

    /* renamed from: C */
    protected nj0 f7898C;

    /* renamed from: D */
    private rz2 f7899D;

    /* renamed from: E */
    private boolean f7900E;

    /* renamed from: F */
    private boolean f7901F;

    /* renamed from: G */
    private int f7902G;

    /* renamed from: H */
    private boolean f7903H;

    /* renamed from: I */
    private final HashSet f7904I;

    /* renamed from: J */
    private View.OnAttachStateChangeListener f7905J;

    /* renamed from: a */
    private final vs0 f7906a;

    /* renamed from: b */
    private final C2971vu f7907b;

    /* renamed from: c */
    private final HashMap f7908c = new HashMap();

    /* renamed from: d */
    private final Object f7909d = new Object();

    /* renamed from: e */
    private C4470a f7910e;

    /* renamed from: f */
    private C4680t f7911f;

    /* renamed from: g */
    private iu0 f7912g;

    /* renamed from: h */
    private ju0 f7913h;

    /* renamed from: i */
    private y40 f7914i;

    /* renamed from: r */
    private a50 f7915r;

    /* renamed from: s */
    private qh1 f7916s;

    /* renamed from: t */
    private boolean f7917t;

    /* renamed from: u */
    private boolean f7918u;

    /* renamed from: v */
    private boolean f7919v;

    /* renamed from: w */
    private boolean f7920w;

    /* renamed from: x */
    private boolean f7921x;

    /* renamed from: y */
    private C4665e0 f7922y;

    /* renamed from: z */
    private ke0 f7923z;

    public ct0(vs0 vs0, C2971vu vuVar, boolean z) {
        ke0 ke0 = new ke0(vs0, vs0.mo12126o(), new C3012wy(vs0.getContext()));
        this.f7907b = vuVar;
        this.f7906a = vs0;
        this.f7919v = z;
        this.f7923z = ke0;
        this.f7897B = null;
        this.f7904I = new HashSet(Arrays.asList(((String) C4596v.m30088c().mo12227b(C2679nz.f14337J4)).split(",")));
    }

    /* renamed from: g */
    private static WebResourceResponse m11091g() {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14273D0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* renamed from: j */
    private final WebResourceResponse m11092j(String str, Map map) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i <= 20) {
                    URLConnection openConnection = url.openConnection();
                    openConnection.setConnectTimeout(10000);
                    openConnection.setReadTimeout(10000);
                    for (Map.Entry entry : map.entrySet()) {
                        openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    if (openConnection instanceof HttpURLConnection) {
                        httpURLConnection = (HttpURLConnection) openConnection;
                        C4409t.m29326r().mo18431B(this.f7906a.getContext(), this.f7906a.mo10299b0().f19150a, false, httpURLConnection, false, 60000);
                        om0 om0 = new om0((String) null);
                        om0.mo12977c(httpURLConnection, (byte[]) null);
                        int responseCode = httpURLConnection.getResponseCode();
                        om0.mo12979e(httpURLConnection, responseCode);
                        if (responseCode < 300 || responseCode >= 400) {
                            C4409t.m29326r();
                            WebResourceResponse m = C4751b2.m30618m(httpURLConnection);
                        } else {
                            String headerField = httpURLConnection.getHeaderField("Location");
                            if (headerField == null) {
                                throw new IOException("Missing Location header in redirect");
                            } else if (headerField.startsWith("tel:")) {
                                TrafficStats.clearThreadStatsTag();
                                return null;
                            } else {
                                URL url2 = new URL(url, headerField);
                                String protocol = url2.getProtocol();
                                if (protocol == null) {
                                    pm0.m18667g("Protocol is null");
                                    WebResourceResponse g = m11091g();
                                    TrafficStats.clearThreadStatsTag();
                                    return g;
                                } else if (protocol.equals("http") || protocol.equals("https")) {
                                    pm0.m18662b("Redirecting to " + headerField);
                                    httpURLConnection.disconnect();
                                    url = url2;
                                } else {
                                    pm0.m18667g("Unsupported scheme: " + protocol);
                                    return m11091g();
                                }
                            }
                        }
                    } else {
                        throw new IOException("Invalid protocol.");
                    }
                } else {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
            }
            C4409t.m29326r();
            WebResourceResponse m2 = C4751b2.m30618m(httpURLConnection);
            TrafficStats.clearThreadStatsTag();
            return m2;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m11093k(Map map, List list, String str) {
        if (C4794n1.m30695m()) {
            C4794n1.m30693k("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                C4794n1.m30693k("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((e60) it.next()).mo8220a(this.f7906a, map);
        }
    }

    /* renamed from: p */
    private final void m11094p() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f7905J;
        if (onAttachStateChangeListener != null) {
            ((View) this.f7906a).removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public final void m11095t(View view, nj0 nj0, int i) {
        if (nj0.mo11126V() && i > 0) {
            nj0.mo11129c(view);
            if (nj0.mo11126V()) {
                C4751b2.f25403i.postDelayed(new ys0(this, view, nj0, i), 100);
            }
        }
    }

    /* renamed from: v */
    private static final boolean m11096v(boolean z, vs0 vs0) {
        return z && !vs0.mo9698n().mo12442i() && !vs0.mo12101a1().equals("interstitial_mb");
    }

    /* renamed from: B */
    public final void mo9281B(int i, int i2) {
        ee0 ee0 = this.f7897B;
        if (ee0 != null) {
            ee0.mo9893k(i, i2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final WebResourceResponse mo9282D(String str, Map map) {
        C2302du b;
        try {
            if (((Boolean) f10.f9074a.mo13438e()).booleanValue()) {
                if (this.f7899D != null && "oda".equals(Uri.parse(str).getScheme())) {
                    this.f7899D.mo13909c(str, (yy2) null);
                    return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
                }
            }
            String c = uk0.m21685c(str, this.f7906a.getContext(), this.f7903H);
            if (!c.equals(str)) {
                return m11092j(c, map);
            }
            C2451hu I1 = C2451hu.m14045I1(Uri.parse(str));
            if (I1 != null && (b = C4409t.m29313e().mo9351b(I1)) != null && b.mo9694M1()) {
                return new WebResourceResponse("", "", b.mo9692K1());
            }
            if (!om0.m17944l() || !((Boolean) a10.f6368b.mo13438e()).booleanValue()) {
                return null;
            }
            return m11092j(str, map);
        } catch (Exception | NoClassDefFoundError e) {
            C4409t.m29325q().mo15126t(e, "AdWebViewClient.interceptRequest");
            return m11091g();
        }
    }

    /* renamed from: G */
    public final void mo9283G(iu0 iu0) {
        this.f7912g = iu0;
    }

    /* renamed from: H */
    public final void mo9284H(boolean z) {
        synchronized (this.f7909d) {
            this.f7921x = z;
        }
    }

    /* renamed from: J */
    public final void mo9285J(int i, int i2, boolean z) {
        ke0 ke0 = this.f7923z;
        if (ke0 != null) {
            ke0.mo11662h(i, i2);
        }
        ee0 ee0 = this.f7897B;
        if (ee0 != null) {
            ee0.mo9892j(i, i2, false);
        }
    }

    /* renamed from: K */
    public final void mo9286K() {
        synchronized (this.f7909d) {
            this.f7917t = false;
            this.f7919v = true;
            dn0.f8329e.execute(new xs0(this));
        }
    }

    /* renamed from: M */
    public final void mo9287M() {
        if (this.f7912g != null && ((this.f7900E && this.f7902G <= 0) || this.f7901F || this.f7918u)) {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14274D1)).booleanValue() && this.f7906a.mo8462Y() != null) {
                C2939uz.m21908a(this.f7906a.mo8462Y().mo8152a(), this.f7906a.mo8463a0(), "awfllc");
            }
            iu0 iu0 = this.f7912g;
            boolean z = false;
            if (!this.f7901F && !this.f7918u) {
                z = true;
            }
            iu0.mo10295b(z);
            this.f7912g = null;
        }
        this.f7906a.mo12099Y0();
    }

    /* renamed from: N */
    public final void mo9288N(boolean z) {
        this.f7903H = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final /* synthetic */ void mo9289O() {
        this.f7906a.mo12117k1();
        C4678r m = this.f7906a.mo12123m();
        if (m != null) {
            m.mo18363q();
        }
    }

    /* renamed from: P */
    public final void mo9290P(ju0 ju0) {
        this.f7913h = ju0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final /* synthetic */ void mo9291Q(View view, nj0 nj0, int i) {
        m11095t(view, nj0, i - 1);
    }

    /* renamed from: R */
    public final void mo9292R(C4669i iVar, boolean z) {
        qh1 qh1;
        boolean X0 = this.f7906a.mo12098X0();
        boolean v = m11096v(X0, this.f7906a);
        boolean z2 = true;
        if (!v && z) {
            z2 = false;
        }
        C4470a aVar = v ? null : this.f7910e;
        C4680t tVar = X0 ? null : this.f7911f;
        C4665e0 e0Var = this.f7922y;
        vm0 b0 = this.f7906a.mo10299b0();
        vs0 vs0 = this.f7906a;
        if (z2) {
            qh1 = null;
        } else {
            qh1 = this.f7916s;
        }
        mo9295V(new AdOverlayInfoParcel(iVar, aVar, tVar, e0Var, b0, vs0, qh1));
    }

    /* renamed from: T */
    public final void mo9293T(C4811t0 t0Var, o42 o42, gv1 gv1, ux2 ux2, String str, String str2, int i) {
        vs0 vs0 = this.f7906a;
        mo9295V(new AdOverlayInfoParcel(vs0, vs0.mo10299b0(), t0Var, o42, gv1, ux2, str, str2, 14));
    }

    /* renamed from: U */
    public final void mo9294U(boolean z, int i, boolean z2) {
        qh1 qh1;
        boolean v = m11096v(this.f7906a.mo12098X0(), this.f7906a);
        boolean z3 = true;
        if (!v && z2) {
            z3 = false;
        }
        C4470a aVar = v ? null : this.f7910e;
        C4680t tVar = this.f7911f;
        C4665e0 e0Var = this.f7922y;
        vs0 vs0 = this.f7906a;
        vm0 b0 = vs0.mo10299b0();
        if (z3) {
            qh1 = null;
        } else {
            qh1 = this.f7916s;
        }
        mo9295V(new AdOverlayInfoParcel(aVar, tVar, e0Var, vs0, z, i, b0, qh1));
    }

    /* renamed from: V */
    public final void mo9295V(AdOverlayInfoParcel adOverlayInfoParcel) {
        C4669i iVar;
        ee0 ee0 = this.f7897B;
        boolean l = ee0 != null ? ee0.mo9894l() : false;
        C4409t.m29319k();
        C4679s.m30352a(this.f7906a.getContext(), adOverlayInfoParcel, !l);
        nj0 nj0 = this.f7898C;
        if (nj0 != null) {
            String str = adOverlayInfoParcel.f5969t;
            if (str == null && (iVar = adOverlayInfoParcel.f5958a) != null) {
                str = iVar.f25200b;
            }
            nj0.mo11125M(str);
        }
    }

    /* renamed from: W */
    public final void mo9296W() {
        C2971vu vuVar = this.f7907b;
        if (vuVar != null) {
            vuVar.mo14820c(10005);
        }
        this.f7901F = true;
        mo9287M();
        this.f7906a.destroy();
    }

    /* renamed from: X */
    public final void mo9297X() {
        synchronized (this.f7909d) {
        }
        this.f7902G++;
        mo9287M();
    }

    /* renamed from: Z */
    public final void mo9298Z() {
        this.f7902G--;
        mo9287M();
    }

    /* renamed from: a */
    public final void mo9299a(boolean z) {
        this.f7917t = false;
    }

    /* renamed from: a0 */
    public final void mo9300a0(boolean z, int i, String str, boolean z2) {
        C4470a aVar;
        bt0 bt0;
        qh1 qh1;
        boolean X0 = this.f7906a.mo12098X0();
        boolean v = m11096v(X0, this.f7906a);
        boolean z3 = true;
        if (!v && z2) {
            z3 = false;
        }
        if (v) {
            aVar = null;
        } else {
            aVar = this.f7910e;
        }
        if (X0) {
            bt0 = null;
        } else {
            bt0 = new bt0(this.f7906a, this.f7911f);
        }
        y40 y40 = this.f7914i;
        a50 a50 = this.f7915r;
        C4665e0 e0Var = this.f7922y;
        vs0 vs0 = this.f7906a;
        vm0 b0 = vs0.mo10299b0();
        if (z3) {
            qh1 = null;
        } else {
            qh1 = this.f7916s;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel(aVar, bt0, y40, a50, e0Var, vs0, z, i, str, b0, qh1);
        mo9295V(adOverlayInfoParcel);
    }

    /* renamed from: b */
    public final C4391b mo9301b() {
        return this.f7896A;
    }

    /* renamed from: b0 */
    public final void mo9302b0() {
        nj0 nj0 = this.f7898C;
        if (nj0 != null) {
            WebView A = this.f7906a.mo12086A();
            if (C0835a0.m3704Q(A)) {
                m11095t(A, nj0, 10);
                return;
            }
            m11094p();
            zs0 zs0 = new zs0(this, nj0);
            this.f7905J = zs0;
            ((View) this.f7906a).addOnAttachStateChangeListener(zs0);
        }
    }

    /* renamed from: c */
    public final void mo9303c(String str, e60 e60) {
        synchronized (this.f7909d) {
            List list = (List) this.f7908c.get(str);
            if (list != null) {
                list.remove(e60);
            }
        }
    }

    /* renamed from: d */
    public final void mo9304d(String str, C4700n nVar) {
        synchronized (this.f7909d) {
            List<e60> list = (List) this.f7908c.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (e60 e60 : list) {
                    if (nVar.apply(e60)) {
                        arrayList.add(e60);
                    }
                }
                list.removeAll(arrayList);
            }
        }
    }

    /* renamed from: e */
    public final boolean mo9305e() {
        boolean z;
        synchronized (this.f7909d) {
            z = this.f7921x;
        }
        return z;
    }

    /* renamed from: e0 */
    public final void mo9306e0(boolean z, int i, String str, String str2, boolean z2) {
        C4470a aVar;
        bt0 bt0;
        qh1 qh1;
        boolean X0 = this.f7906a.mo12098X0();
        boolean v = m11096v(X0, this.f7906a);
        boolean z3 = true;
        if (!v && z2) {
            z3 = false;
        }
        if (v) {
            aVar = null;
        } else {
            aVar = this.f7910e;
        }
        if (X0) {
            bt0 = null;
        } else {
            bt0 = new bt0(this.f7906a, this.f7911f);
        }
        y40 y40 = this.f7914i;
        a50 a50 = this.f7915r;
        C4665e0 e0Var = this.f7922y;
        vs0 vs0 = this.f7906a;
        vm0 b0 = vs0.mo10299b0();
        if (z3) {
            qh1 = null;
        } else {
            qh1 = this.f7916s;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel(aVar, (C4680t) bt0, y40, a50, e0Var, vs0, z, i, str, str2, b0, qh1);
        mo9295V(adOverlayInfoParcel);
    }

    /* renamed from: f */
    public final boolean mo9307f() {
        boolean z;
        synchronized (this.f7909d) {
            z = this.f7920w;
        }
        return z;
    }

    /* renamed from: g0 */
    public final void mo9308g0(C4470a aVar, y40 y40, C4680t tVar, a50 a50, C4665e0 e0Var, boolean z, h60 h60, C4391b bVar, me0 me0, nj0 nj0, o42 o42, rz2 rz2, gv1 gv1, ux2 ux2, f60 f60, qh1 qh1, x60 x60, r60 r60) {
        y40 y402 = y40;
        a50 a502 = a50;
        h60 h602 = h60;
        me0 me02 = me0;
        nj0 nj02 = nj0;
        o42 o422 = o42;
        rz2 rz22 = rz2;
        f60 f602 = f60;
        qh1 qh12 = qh1;
        x60 x602 = x60;
        r60 r602 = r60;
        C4391b bVar2 = bVar == null ? new C4391b(this.f7906a.getContext(), nj02, (lg0) null) : bVar;
        this.f7897B = new ee0(this.f7906a, me02);
        this.f7898C = nj02;
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14353L0)).booleanValue()) {
            mo9309h0("/adMetadata", new x40(y402));
        }
        if (a502 != null) {
            mo9309h0("/appEvent", new z40(a502));
        }
        mo9309h0("/backButton", d60.f8087j);
        mo9309h0("/refresh", d60.f8088k);
        mo9309h0("/canOpenApp", d60.f8079b);
        mo9309h0("/canOpenURLs", d60.f8078a);
        mo9309h0("/canOpenIntents", d60.f8080c);
        mo9309h0("/close", d60.f8081d);
        mo9309h0("/customClose", d60.f8082e);
        mo9309h0("/instrument", d60.f8091n);
        mo9309h0("/delayPageLoaded", d60.f8093p);
        mo9309h0("/delayPageClosed", d60.f8094q);
        mo9309h0("/getLocationInfo", d60.f8095r);
        mo9309h0("/log", d60.f8084g);
        mo9309h0("/mraid", new m60(bVar2, this.f7897B, me02));
        ke0 ke0 = this.f7923z;
        if (ke0 != null) {
            mo9309h0("/mraidLoaded", ke0);
        }
        q60 q60 = r4;
        C4391b bVar3 = bVar2;
        q60 q602 = new q60(bVar2, this.f7897B, o42, gv1, ux2);
        mo9309h0("/open", q60);
        mo9309h0("/precache", new hr0());
        mo9309h0("/touch", d60.f8086i);
        mo9309h0("/video", d60.f8089l);
        mo9309h0("/videoMeta", d60.f8090m);
        if (o422 == null || rz22 == null) {
            mo9309h0("/click", d60.m11324a(qh1));
            mo9309h0("/httpTrack", d60.f8083f);
        } else {
            mo9309h0("/click", new lt2(qh12, rz22, o422));
            mo9309h0("/httpTrack", new kt2(rz22, o422));
        }
        if (C4409t.m29324p().mo14043z(this.f7906a.getContext())) {
            mo9309h0("/logScionEvent", new l60(this.f7906a.getContext()));
        }
        if (h602 != null) {
            mo9309h0("/setInterstitialProperties", new g60(h602, (byte[]) null));
        }
        if (f602 != null) {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14290E7)).booleanValue()) {
                mo9309h0("/inspectorNetworkExtras", f602);
            }
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14478X7)).booleanValue() && x602 != null) {
            mo9309h0("/shareSheet", x602);
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14506a8)).booleanValue() && r602 != null) {
            mo9309h0("/inspectorOutOfContextTest", r602);
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14451U8)).booleanValue()) {
            mo9309h0("/bindPlayStoreOverlay", d60.f8098u);
            mo9309h0("/presentPlayStoreOverlay", d60.f8099v);
            mo9309h0("/expandPlayStoreOverlay", d60.f8100w);
            mo9309h0("/collapsePlayStoreOverlay", d60.f8101x);
            mo9309h0("/closePlayStoreOverlay", d60.f8102y);
        }
        this.f7910e = aVar;
        this.f7911f = tVar;
        this.f7914i = y40;
        this.f7915r = a50;
        this.f7922y = e0Var;
        this.f7896A = bVar3;
        this.f7916s = qh12;
        this.f7917t = z;
        this.f7899D = rz22;
    }

    /* renamed from: h */
    public final void mo9272h() {
        qh1 qh1 = this.f7916s;
        if (qh1 != null) {
            qh1.mo9272h();
        }
    }

    /* renamed from: h0 */
    public final void mo9309h0(String str, e60 e60) {
        synchronized (this.f7909d) {
            List list = (List) this.f7908c.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.f7908c.put(str, list);
            }
            list.add(e60);
        }
    }

    /* renamed from: j0 */
    public final void mo9310j0(Uri uri) {
        String path = uri.getPath();
        List list = (List) this.f7908c.get(path);
        if (path == null || list == null) {
            C4794n1.m30693k("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14398P5)).booleanValue() && C4409t.m29325q().mo15115f() != null) {
                dn0.f8325a.execute(new ws0((path == null || path.length() < 2) ? "null" : path.substring(1)));
                return;
            }
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14327I4)).booleanValue() && this.f7904I.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14347K4)).intValue()) {
                C4794n1.m30693k("Parsing gmsg query params on BG thread: ".concat(path));
                cf3.m10920r(C4409t.m29326r().mo18437y(uri), new at0(this, list, path, uri), dn0.f8329e);
                return;
            }
        }
        C4409t.m29326r();
        m11093k(C4751b2.m30617l(uri), list, path);
    }

    /* renamed from: k0 */
    public final void mo9311k0() {
        nj0 nj0 = this.f7898C;
        if (nj0 != null) {
            nj0.mo11127a();
            this.f7898C = null;
        }
        m11094p();
        synchronized (this.f7909d) {
            this.f7908c.clear();
            this.f7910e = null;
            this.f7911f = null;
            this.f7912g = null;
            this.f7913h = null;
            this.f7914i = null;
            this.f7915r = null;
            this.f7917t = false;
            this.f7919v = false;
            this.f7920w = false;
            this.f7922y = null;
            this.f7896A = null;
            this.f7923z = null;
            ee0 ee0 = this.f7897B;
            if (ee0 != null) {
                ee0.mo9890h(true);
                this.f7897B = null;
            }
            this.f7899D = null;
        }
    }

    public final void onAdClicked() {
        C4470a aVar = this.f7910e;
        if (aVar != null) {
            aVar.onAdClicked();
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        C4794n1.m30693k("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            mo9310j0(parse);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r1.zza();
        r0.f7913h = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        mo9287M();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r0.f7900E = true;
        r1 = r0.f7913h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
        /*
            r0 = this;
            java.lang.Object r1 = r0.f7909d
            monitor-enter(r1)
            com.google.android.gms.internal.ads.vs0 r2 = r0.f7906a     // Catch:{ all -> 0x0029 }
            boolean r2 = r2.mo12132q1()     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = "Blank page loaded, 1..."
            p073j4.C4794n1.m30693k(r2)     // Catch:{ all -> 0x0029 }
            com.google.android.gms.internal.ads.vs0 r2 = r0.f7906a     // Catch:{ all -> 0x0029 }
            r2.mo12091R0()     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            return
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            r1 = 1
            r0.f7900E = r1
            com.google.android.gms.internal.ads.ju0 r1 = r0.f7913h
            if (r1 == 0) goto L_0x0025
            r1.zza()
            r1 = 0
            r0.f7913h = r1
        L_0x0025:
            r0.mo9287M()
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ct0.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f7918u = true;
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f7906a.mo12145x1(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    /* renamed from: r0 */
    public final void mo9316r0(boolean z) {
        synchronized (this.f7909d) {
            this.f7920w = true;
        }
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return mo9282D(str, Collections.emptyMap());
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case C8710R.styleable.AppCompatTheme_listPreferredItemPaddingStart /*85*/:
            case 86:
            case C8710R.styleable.AppCompatTheme_panelMenuListTheme /*87*/:
            case C8710R.styleable.AppCompatTheme_panelMenuListWidth /*88*/:
            case C8710R.styleable.AppCompatTheme_popupMenuStyle /*89*/:
            case C8710R.styleable.AppCompatTheme_popupWindowStyle /*90*/:
            case C8710R.styleable.AppCompatTheme_radioButtonStyle /*91*/:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C4794n1.m30693k("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            if (this.f7917t && webView == this.f7906a.mo12086A()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    C4470a aVar = this.f7910e;
                    if (aVar != null) {
                        aVar.onAdClicked();
                        nj0 nj0 = this.f7898C;
                        if (nj0 != null) {
                            nj0.mo11125M(str);
                        }
                        this.f7910e = null;
                    }
                    qh1 qh1 = this.f7916s;
                    if (qh1 != null) {
                        qh1.mo9272h();
                        this.f7916s = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.f7906a.mo12086A().willNotDraw()) {
                try {
                    C2955ve r = this.f7906a.mo10015r();
                    if (r != null && r.mo14740f(parse)) {
                        Context context = this.f7906a.getContext();
                        vs0 vs0 = this.f7906a;
                        parse = r.mo14735a(parse, context, (View) vs0, vs0.mo8461X());
                    }
                } catch (C2992we unused) {
                    pm0.m18667g("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                C4391b bVar = this.f7896A;
                if (bVar == null || bVar.mo17898c()) {
                    mo9292R(new C4669i("android.intent.action.VIEW", parse.toString(), (String) null, (String) null, (String) null, (String) null, (String) null, (C4661c0) null), true);
                } else {
                    this.f7896A.mo17897b(str);
                }
            } else {
                pm0.m18667g("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            }
        } else {
            mo9310j0(parse);
        }
        return true;
    }

    /* renamed from: u */
    public final boolean mo9320u() {
        boolean z;
        synchronized (this.f7909d) {
            z = this.f7919v;
        }
        return z;
    }

    /* renamed from: x */
    public final ViewTreeObserver.OnGlobalLayoutListener mo9321x() {
        synchronized (this.f7909d) {
        }
        return null;
    }

    /* renamed from: z */
    public final ViewTreeObserver.OnScrollChangedListener mo9322z() {
        synchronized (this.f7909d) {
        }
        return null;
    }
}
