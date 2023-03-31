package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p053g4.C4390a;
import p053g4.C4401l;
import p053g4.C4409t;
import p060h4.C4584t;
import p060h4.C4596v;
import p066i4.C4669i;
import p066i4.C4678r;
import p067i5.C4699m;
import p067i5.C4700n;
import p073j4.C4751b2;
import p073j4.C4762e1;
import p073j4.C4774h1;
import p073j4.C4788l1;
import p073j4.C4794n1;
import p073j4.C4811t0;
import p073j4.C4818v1;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class pt0 extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, vs0 {

    /* renamed from: m0 */
    public static final /* synthetic */ int f15986m0 = 0;

    /* renamed from: A */
    private boolean f15987A;

    /* renamed from: B */
    private boolean f15988B;

    /* renamed from: C */
    private boolean f15989C;

    /* renamed from: D */
    private Boolean f15990D;

    /* renamed from: E */
    private boolean f15991E = true;

    /* renamed from: F */
    private final String f15992F = "";

    /* renamed from: G */
    private st0 f15993G;

    /* renamed from: H */
    private boolean f15994H;

    /* renamed from: I */
    private boolean f15995I;

    /* renamed from: J */
    private e20 f15996J;

    /* renamed from: K */
    private c20 f15997K;

    /* renamed from: L */
    private C2488it f15998L;

    /* renamed from: M */
    private int f15999M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public int f16000N;

    /* renamed from: O */
    private C3124zz f16001O;

    /* renamed from: P */
    private final C3124zz f16002P;

    /* renamed from: Q */
    private C3124zz f16003Q;

    /* renamed from: R */
    private final a00 f16004R;

    /* renamed from: S */
    private int f16005S;

    /* renamed from: a */
    private final lu0 f16006a;

    /* renamed from: a0 */
    private int f16007a0;

    /* renamed from: b */
    private final C2955ve f16008b;

    /* renamed from: b0 */
    private int f16009b0;

    /* renamed from: c */
    private final n00 f16010c;

    /* renamed from: c0 */
    private C4678r f16011c0;

    /* renamed from: d */
    private final vm0 f16012d;

    /* renamed from: d0 */
    private boolean f16013d0;

    /* renamed from: e */
    private C4401l f16014e;

    /* renamed from: e0 */
    private final C4788l1 f16015e0;

    /* renamed from: f */
    private final C4390a f16016f;

    /* renamed from: f0 */
    private int f16017f0 = -1;

    /* renamed from: g */
    private final DisplayMetrics f16018g;

    /* renamed from: g0 */
    private int f16019g0 = -1;

    /* renamed from: h */
    private final float f16020h;

    /* renamed from: h0 */
    private int f16021h0 = -1;

    /* renamed from: i */
    private is2 f16022i;

    /* renamed from: i0 */
    private int f16023i0 = -1;

    /* renamed from: j0 */
    private Map f16024j0;

    /* renamed from: k0 */
    private final WindowManager f16025k0;

    /* renamed from: l0 */
    private final C2971vu f16026l0;

    /* renamed from: r */
    private ls2 f16027r;

    /* renamed from: s */
    private boolean f16028s = false;

    /* renamed from: t */
    private boolean f16029t = false;

    /* renamed from: u */
    private ct0 f16030u;

    /* renamed from: v */
    private C4678r f16031v;

    /* renamed from: w */
    private C4954a f16032w;

    /* renamed from: x */
    private mu0 f16033x;

    /* renamed from: y */
    private final String f16034y;

    /* renamed from: z */
    private boolean f16035z;

    protected pt0(lu0 lu0, mu0 mu0, String str, boolean z, boolean z2, C2955ve veVar, n00 n00, vm0 vm0, c00 c00, C4401l lVar, C4390a aVar, C2971vu vuVar, is2 is2, ls2 ls2) {
        super(lu0);
        ls2 ls22;
        this.f16006a = lu0;
        this.f16033x = mu0;
        this.f16034y = str;
        this.f15988B = z;
        this.f16008b = veVar;
        this.f16010c = n00;
        this.f16012d = vm0;
        this.f16014e = lVar;
        this.f16016f = aVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f16025k0 = windowManager;
        C4409t.m29326r();
        DisplayMetrics O = C4751b2.m30597O(windowManager);
        this.f16018g = O;
        this.f16020h = O.density;
        this.f16026l0 = vuVar;
        this.f16022i = is2;
        this.f16027r = ls2;
        this.f16015e0 = new C4788l1(lu0.mo12147a(), this, this, (ViewTreeObserver.OnScrollChangedListener) null);
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            pm0.m18665e("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(C4409t.m29326r().mo18438z(lu0, vm0.f19150a));
        C4409t.m29326r();
        Context context = getContext();
        C4762e1.m30653a(context, new C4818v1(settings, context));
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        m18781F0();
        addJavascriptInterface(new wt0(this, new vt0(this), (byte[]) null), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        m18789N0();
        a00 a00 = new a00(new c00(true, "make_wv", this.f16034y));
        this.f16004R = a00;
        a00.mo8152a().mo8999c((c00) null);
        if (!(!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14274D1)).booleanValue() || (ls22 = this.f16027r) == null || ls22.f12930b == null)) {
            a00.mo8152a().mo9000d("gqi", this.f16027r.f12930b);
        }
        a00.mo8152a();
        C3124zz f = c00.m10654f();
        this.f16002P = f;
        a00.mo8153b("native:view_create", f);
        this.f16003Q = null;
        this.f16001O = null;
        C4774h1.m30668a().mo18462b(lu0);
        C4409t.m29325q().mo15123q();
    }

    /* renamed from: F0 */
    private final synchronized void m18781F0() {
        is2 is2 = this.f16022i;
        if (is2 != null) {
            if (is2.f10997o0) {
                pm0.m18662b("Disabling hardware acceleration on an overlay.");
                m18783H0();
                return;
            }
        }
        if (!this.f15988B) {
            if (!this.f16033x.mo12442i()) {
                pm0.m18662b("Enabling hardware acceleration on an AdView.");
                m18785J0();
                return;
            }
        }
        pm0.m18662b("Enabling hardware acceleration on an overlay.");
        m18785J0();
    }

    /* renamed from: G0 */
    private final synchronized void m18782G0() {
        if (!this.f16013d0) {
            this.f16013d0 = true;
            C4409t.m29325q().mo15122p();
        }
    }

    /* renamed from: H0 */
    private final synchronized void m18783H0() {
        if (!this.f15989C) {
            setLayerType(1, (Paint) null);
        }
        this.f15989C = true;
    }

    /* renamed from: I0 */
    private final void m18784I0(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z ? "0" : "1");
        mo9081R("onAdVisibilityChanged", hashMap);
    }

    /* renamed from: J0 */
    private final synchronized void m18785J0() {
        if (this.f15989C) {
            setLayerType(0, (Paint) null);
        }
        this.f15989C = false;
    }

    /* renamed from: K0 */
    private final synchronized void m18786K0(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th) {
            C4409t.m29325q().mo15126t(th, "AdWebViewImpl.loadUrlUnsafe");
            pm0.m18668h("Could not call loadUrl in destroy(). ", th);
        }
    }

    /* renamed from: L0 */
    private final void m18787L0() {
        C2939uz.m21908a(this.f16004R.mo8152a(), this.f16002P, "aeh2");
    }

    /* renamed from: M0 */
    private final synchronized void m18788M0() {
        Map map = this.f16024j0;
        if (map != null) {
            for (gr0 a : map.values()) {
                a.mo256a();
            }
        }
        this.f16024j0 = null;
    }

    /* renamed from: N0 */
    private final void m18789N0() {
        a00 a00 = this.f16004R;
        if (a00 != null) {
            c00 a = a00.mo8152a();
            C2865sz f = C4409t.m29325q().mo15115f();
            if (f != null) {
                f.mo14172f(a);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        mo13365D0(java.lang.Boolean.FALSE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001a */
    /* renamed from: y1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m18792y1() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.xl0 r0 = p053g4.C4409t.m29325q()     // Catch:{ all -> 0x0023 }
            java.lang.Boolean r0 = r0.mo15119k()     // Catch:{ all -> 0x0023 }
            r2.f15990D = r0     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "(function(){})()"
            r1 = 0
            r2.evaluateJavascript(r0, r1)     // Catch:{ IllegalStateException -> 0x001a }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ IllegalStateException -> 0x001a }
            r2.mo13365D0(r0)     // Catch:{ IllegalStateException -> 0x001a }
            monitor-exit(r2)
            return
        L_0x001a:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0023 }
            r2.mo13365D0(r0)     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            return
        L_0x0021:
            monitor-exit(r2)
            return
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pt0.m18792y1():void");
    }

    /* renamed from: A */
    public final WebView mo12086A() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A0 */
    public final synchronized void mo13362A0(String str, ValueCallback valueCallback) {
        if (!mo12132q1()) {
            evaluateJavascript(str, (ValueCallback) null);
        } else {
            pm0.m18667g("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B0 */
    public final void mo13363B0(String str) {
        if (C4699m.m30413d()) {
            if (mo13379x0() == null) {
                m18792y1();
            }
            if (mo13379x0().booleanValue()) {
                mo13362A0(str, (ValueCallback) null);
            } else {
                mo13364C0("javascript:".concat(str));
            }
        } else {
            mo13364C0("javascript:".concat(str));
        }
    }

    /* renamed from: C */
    public final synchronized void mo8451C(String str, gr0 gr0) {
        if (this.f16024j0 == null) {
            this.f16024j0 = new HashMap();
        }
        this.f16024j0.put(str, gr0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C0 */
    public final synchronized void mo13364C0(String str) {
        if (!mo12132q1()) {
            loadUrl(str);
        } else {
            pm0.m18667g("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: D */
    public final synchronized gr0 mo8452D(String str) {
        Map map = this.f16024j0;
        if (map == null) {
            return null;
        }
        return (gr0) map.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D0 */
    public final void mo13365D0(Boolean bool) {
        synchronized (this) {
            this.f15990D = bool;
        }
        C4409t.m29325q().mo15127u(bool);
    }

    /* renamed from: E */
    public final synchronized void mo8453E(st0 st0) {
        if (this.f15993G != null) {
            pm0.m18664d("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f15993G = st0;
        }
    }

    /* renamed from: E0 */
    public final boolean mo13366E0() {
        int i;
        int i2;
        boolean z = false;
        if (!this.f16030u.mo9320u() && !this.f16030u.mo9307f()) {
            return false;
        }
        C4584t.m30036b();
        DisplayMetrics displayMetrics = this.f16018g;
        int w = im0.m14416w(displayMetrics, displayMetrics.widthPixels);
        C4584t.m30036b();
        DisplayMetrics displayMetrics2 = this.f16018g;
        int w2 = im0.m14416w(displayMetrics2, displayMetrics2.heightPixels);
        Activity a = this.f16006a.mo12147a();
        if (a == null || a.getWindow() == null) {
            i2 = w;
            i = w2;
        } else {
            C4409t.m29326r();
            int[] n = C4751b2.m30619n(a);
            C4584t.m30036b();
            int w3 = im0.m14416w(this.f16018g, n[0]);
            C4584t.m30036b();
            i = im0.m14416w(this.f16018g, n[1]);
            i2 = w3;
        }
        int i3 = this.f16019g0;
        if (i3 == w && this.f16017f0 == w2 && this.f16021h0 == i2 && this.f16023i0 == i) {
            return false;
        }
        if (!(i3 == w && this.f16017f0 == w2)) {
            z = true;
        }
        this.f16019g0 = w;
        this.f16017f0 = w2;
        this.f16021h0 = i2;
        this.f16023i0 = i;
        new le0(this, "").mo11986e(w, w2, i2, i, this.f16018g.density, this.f16025k0.getDefaultDisplay().getRotation());
        return z;
    }

    /* renamed from: F */
    public final synchronized void mo8454F(int i) {
        this.f16005S = i;
    }

    /* renamed from: I */
    public final synchronized C2488it mo12087I() {
        return this.f15998L;
    }

    /* renamed from: L */
    public final void mo8455L(int i) {
    }

    /* renamed from: N */
    public final void mo8416N(C2857sr srVar) {
        boolean z;
        synchronized (this) {
            z = srVar.f17627j;
            this.f15994H = z;
        }
        m18784I0(z);
    }

    /* renamed from: O0 */
    public final void mo12088O0() {
        if (this.f16001O == null) {
            C2939uz.m21908a(this.f16004R.mo8152a(), this.f16002P, "aes2");
            this.f16004R.mo8152a();
            C3124zz f = c00.m10654f();
            this.f16001O = f;
            this.f16004R.mo8153b("native:view_show", f);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(MediationMetaData.KEY_VERSION, this.f16012d.f19150a);
        mo9081R("onshow", hashMap);
    }

    /* renamed from: P0 */
    public final ls2 mo12089P0() {
        return this.f16027r;
    }

    /* renamed from: Q */
    public final void mo8456Q(int i) {
        this.f16007a0 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0016, code lost:
        return;
     */
    /* renamed from: Q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo12090Q0(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f15999M     // Catch:{ all -> 0x0017 }
            r1 = 1
            if (r1 == r3) goto L_0x0007
            r1 = -1
        L_0x0007:
            int r0 = r0 + r1
            r2.f15999M = r0     // Catch:{ all -> 0x0017 }
            if (r0 > 0) goto L_0x0015
            i4.r r3 = r2.f16031v     // Catch:{ all -> 0x0017 }
            if (r3 == 0) goto L_0x0015
            r3.mo18349C()     // Catch:{ all -> 0x0017 }
            monitor-exit(r2)
            return
        L_0x0015:
            monitor-exit(r2)
            return
        L_0x0017:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pt0.mo12090Q0(boolean):void");
    }

    /* renamed from: R */
    public final void mo9081R(String str, Map map) {
        try {
            mo9084a(str, C4584t.m30036b().mo11160k(map));
        } catch (JSONException unused) {
            pm0.m18667g("Could not convert parameters to JSON.");
        }
    }

    /* renamed from: R0 */
    public final synchronized void mo12091R0() {
        C4794n1.m30693k("Destroying WebView!");
        m18782G0();
        C4751b2.f25403i.post(new ot0(this));
    }

    /* renamed from: S */
    public final void mo12092S() {
        m18787L0();
        HashMap hashMap = new HashMap(1);
        hashMap.put(MediationMetaData.KEY_VERSION, this.f16012d.f19150a);
        mo9081R("onhide", hashMap);
    }

    /* renamed from: S0 */
    public final void mo12093S0() {
        throw null;
    }

    /* renamed from: T */
    public final int mo8457T() {
        return this.f16009b0;
    }

    /* renamed from: T0 */
    public final synchronized void mo12094T0(boolean z) {
        if (z) {
            setBackgroundColor(0);
        }
        C4678r rVar = this.f16031v;
        if (rVar != null) {
            rVar.mo18356Q6(z);
        }
    }

    /* renamed from: U */
    public final synchronized int mo8458U() {
        return this.f16005S;
    }

    /* renamed from: U0 */
    public final synchronized void mo12095U0(e20 e20) {
        this.f15996J = e20;
    }

    /* renamed from: V */
    public final int mo8459V() {
        return getMeasuredHeight();
    }

    /* renamed from: V0 */
    public final synchronized void mo12096V0(int i) {
        C4678r rVar = this.f16031v;
        if (rVar != null) {
            rVar.mo18355P6(i);
        }
    }

    /* renamed from: W */
    public final int mo8460W() {
        return getMeasuredWidth();
    }

    /* renamed from: W0 */
    public final void mo12097W0(is2 is2, ls2 ls2) {
        this.f16022i = is2;
        this.f16027r = ls2;
    }

    /* renamed from: X */
    public final Activity mo8461X() {
        return this.f16006a.mo12147a();
    }

    /* renamed from: X0 */
    public final synchronized boolean mo12098X0() {
        return this.f15988B;
    }

    /* renamed from: Y */
    public final a00 mo8462Y() {
        return this.f16004R;
    }

    /* renamed from: Y0 */
    public final void mo12099Y0() {
        if (this.f16003Q == null) {
            this.f16004R.mo8152a();
            C3124zz f = c00.m10654f();
            this.f16003Q = f;
            this.f16004R.mo8153b("native:view_load", f);
        }
    }

    /* renamed from: Z0 */
    public final synchronized void mo12100Z0(mu0 mu0) {
        this.f16033x = mu0;
        requestLayout();
    }

    /* renamed from: a */
    public final void mo9084a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        pm0.m18662b("Dispatching AFMA event: ".concat(sb.toString()));
        mo13363B0(sb.toString());
    }

    /* renamed from: a0 */
    public final C3124zz mo8463a0() {
        return this.f16002P;
    }

    /* renamed from: a1 */
    public final synchronized String mo12101a1() {
        return this.f16034y;
    }

    /* renamed from: b0 */
    public final vm0 mo10299b0() {
        return this.f16012d;
    }

    /* renamed from: b1 */
    public final synchronized void mo12102b1(boolean z) {
        this.f15991E = z;
    }

    /* renamed from: c */
    public final int mo8465c() {
        return this.f16007a0;
    }

    /* renamed from: c0 */
    public final C4390a mo8466c0() {
        return this.f16016f;
    }

    /* renamed from: c1 */
    public final void mo12103c1(String str, e60 e60) {
        ct0 ct0 = this.f16030u;
        if (ct0 != null) {
            ct0.mo9303c(str, e60);
        }
    }

    /* renamed from: d0 */
    public final synchronized st0 mo8467d0() {
        return this.f15993G;
    }

    /* renamed from: d1 */
    public final void mo12105d1(String str, e60 e60) {
        ct0 ct0 = this.f16030u;
        if (ct0 != null) {
            ct0.mo9309h0(str, e60);
        }
    }

    public final synchronized void destroy() {
        m18789N0();
        this.f16015e0.mo18471a();
        C4678r rVar = this.f16031v;
        if (rVar != null) {
            rVar.mo18361d();
            this.f16031v.mo8767Z();
            this.f16031v = null;
        }
        this.f16032w = null;
        this.f16030u.mo9311k0();
        this.f15998L = null;
        this.f16014e = null;
        setOnClickListener((View.OnClickListener) null);
        setOnTouchListener((View.OnTouchListener) null);
        if (!this.f15987A) {
            C4409t.m29307A().mo15498i(this);
            m18788M0();
            this.f15987A = true;
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14736x8)).booleanValue()) {
                C4794n1.m30693k("Initiating WebView self destruct sequence in 3...");
                C4794n1.m30693k("Loading blank page in WebView, 2...");
                m18786K0("about:blank");
                return;
            }
            C4794n1.m30693k("Destroying the WebView immediately...");
            mo12091R0();
        }
    }

    /* renamed from: e0 */
    public final synchronized void mo8522e0() {
        C4401l lVar = this.f16014e;
        if (lVar != null) {
            lVar.mo8522e0();
        }
    }

    /* renamed from: e1 */
    public final boolean mo12107e1() {
        return false;
    }

    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (mo12132q1()) {
            pm0.m18669i("#004 The webview is destroyed. Ignoring action.", (Throwable) null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue((Object) null);
                return;
            }
            return;
        }
        super.evaluateJavascript(str, valueCallback);
    }

    /* renamed from: f */
    public final void mo9087f(String str) {
        throw null;
    }

    /* renamed from: f0 */
    public final /* synthetic */ ku0 mo12108f0() {
        return this.f16030u;
    }

    /* renamed from: f1 */
    public final void mo12109f1(boolean z) {
        this.f16030u.mo9288N(z);
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.f15987A) {
                    this.f16030u.mo9311k0();
                    C4409t.m29307A().mo15498i(this);
                    m18788M0();
                    m18782G0();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    /* renamed from: g */
    public final synchronized String mo8468g() {
        ls2 ls2 = this.f16027r;
        if (ls2 == null) {
            return null;
        }
        return ls2.f12930b;
    }

    /* renamed from: g1 */
    public final synchronized void mo12110g1(C4678r rVar) {
        this.f16011c0 = rVar;
    }

    /* renamed from: h */
    public final void mo9272h() {
        ct0 ct0 = this.f16030u;
        if (ct0 != null) {
            ct0.mo9272h();
        }
    }

    /* renamed from: h0 */
    public final void mo8470h0(int i) {
        this.f16009b0 = i;
    }

    /* renamed from: h1 */
    public final void mo12112h1() {
        setBackgroundColor(0);
    }

    /* renamed from: i */
    public final synchronized C4678r mo12113i() {
        return this.f16011c0;
    }

    /* renamed from: i0 */
    public final is2 mo12114i0() {
        return this.f16022i;
    }

    /* renamed from: i1 */
    public final synchronized void mo12115i1(String str, String str2, String str3) {
        String str4;
        if (!mo12132q1()) {
            String[] strArr = new String[1];
            String str5 = (String) C4596v.m30088c().mo12227b(C2679nz.f14372N);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(MediationMetaData.KEY_VERSION, str5);
                jSONObject.put("sdk", "Google Mobile Ads");
                jSONObject.put("sdkVersion", "12.4.51-000");
                str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e) {
                pm0.m18668h("Unable to build MRAID_ENV", e);
                str4 = null;
            }
            strArr[0] = str4;
            super.loadDataWithBaseURL(str, cu0.m11196a(str2, strArr), "text/html", "UTF-8", (String) null);
            return;
        }
        pm0.m18667g("#004 The webview is destroyed. Ignoring action.");
    }

    /* renamed from: j */
    public final synchronized String mo8471j() {
        return this.f15992F;
    }

    /* renamed from: j1 */
    public final synchronized void mo12116j1(C4954a aVar) {
        this.f16032w = aVar;
    }

    /* renamed from: k */
    public final void mo9089k(String str, String str2) {
        mo13363B0(str + "(" + str2 + ");");
    }

    /* renamed from: k0 */
    public final po0 mo8472k0() {
        return null;
    }

    /* renamed from: k1 */
    public final void mo12117k1() {
        this.f16015e0.mo18472b();
    }

    /* renamed from: l */
    public final synchronized boolean mo12118l() {
        return this.f16035z;
    }

    /* renamed from: l0 */
    public final void mo8473l0(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z ? "0" : "1");
        hashMap.put("duration", Long.toString(j));
        mo9081R("onCacheAccessComplete", hashMap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        return;
     */
    /* renamed from: l1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo12119l1(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f15988B     // Catch:{ all -> 0x003a }
            r2.f15988B = r3     // Catch:{ all -> 0x003a }
            r2.m18781F0()     // Catch:{ all -> 0x003a }
            if (r3 == r0) goto L_0x0038
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14382O     // Catch:{ all -> 0x003a }
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x003a }
            java.lang.Object r0 = r1.mo12227b(r0)     // Catch:{ all -> 0x003a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x003a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.mu0 r0 = r2.f16033x     // Catch:{ all -> 0x003a }
            boolean r0 = r0.mo12442i()     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x0038
        L_0x0024:
            com.google.android.gms.internal.ads.le0 r0 = new com.google.android.gms.internal.ads.le0     // Catch:{ all -> 0x003a }
            java.lang.String r1 = ""
            r0.<init>(r2, r1)     // Catch:{ all -> 0x003a }
            r1 = 1
            if (r1 == r3) goto L_0x0031
            java.lang.String r3 = "default"
            goto L_0x0033
        L_0x0031:
            java.lang.String r3 = "expanded"
        L_0x0033:
            r0.mo11988g(r3)     // Catch:{ all -> 0x003a }
            monitor-exit(r2)
            return
        L_0x0038:
            monitor-exit(r2)
            return
        L_0x003a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pt0.mo12119l1(boolean):void");
    }

    public final synchronized void loadData(String str, String str2, String str3) {
        if (!mo12132q1()) {
            super.loadData(str, str2, str3);
        } else {
            pm0.m18667g("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!mo12132q1()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            pm0.m18667g("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadUrl(String str) {
        if (!mo12132q1()) {
            try {
                super.loadUrl(str);
            } catch (Throwable th) {
                C4409t.m29325q().mo15126t(th, "AdWebViewImpl.loadUrl");
                pm0.m18668h("Could not call loadUrl. ", th);
            }
        } else {
            pm0.m18667g("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: m */
    public final synchronized C4678r mo12123m() {
        return this.f16031v;
    }

    /* renamed from: m0 */
    public final synchronized void mo8474m0() {
        c20 c20 = this.f15997K;
        if (c20 != null) {
            C4751b2.f25403i.post(new wp1((yp1) c20));
        }
    }

    /* renamed from: m1 */
    public final synchronized C4954a mo12124m1() {
        return this.f16032w;
    }

    /* renamed from: n */
    public final synchronized mu0 mo9698n() {
        return this.f16033x;
    }

    /* renamed from: n0 */
    public final void mo8941n0(boolean z, int i, boolean z2) {
        this.f16030u.mo9294U(z, i, z2);
    }

    /* renamed from: n1 */
    public final synchronized void mo12125n1(C2488it itVar) {
        this.f15998L = itVar;
    }

    /* renamed from: o */
    public final Context mo12126o() {
        return this.f16006a.mo12148b();
    }

    /* renamed from: o0 */
    public final void mo8942o0(C4811t0 t0Var, o42 o42, gv1 gv1, ux2 ux2, String str, String str2, int i) {
        this.f16030u.mo9293T(t0Var, o42, gv1, ux2, str, str2, 14);
    }

    /* renamed from: o1 */
    public final void mo12127o1(String str, C4700n nVar) {
        ct0 ct0 = this.f16030u;
        if (ct0 != null) {
            ct0.mo9304d(str, nVar);
        }
    }

    public final void onAdClicked() {
        ct0 ct0 = this.f16030u;
        if (ct0 != null) {
            ct0.onAdClicked();
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!mo12132q1()) {
            this.f16015e0.mo18473c();
        }
        boolean z = this.f15994H;
        ct0 ct0 = this.f16030u;
        if (ct0 != null && ct0.mo9307f()) {
            if (!this.f15995I) {
                this.f16030u.mo9321x();
                this.f16030u.mo9322z();
                this.f15995I = true;
            }
            mo13366E0();
            z = true;
        }
        m18784I0(z);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        ct0 ct0;
        synchronized (this) {
            if (!mo12132q1()) {
                this.f16015e0.mo18474d();
            }
            super.onDetachedFromWindow();
            if (this.f15995I && (ct0 = this.f16030u) != null && ct0.mo9307f() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.f16030u.mo9321x();
                this.f16030u.mo9322z();
                this.f15995I = false;
            }
        }
        m18784I0(false);
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            C4409t.m29326r();
            C4751b2.m30615j(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            pm0.m18662b("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (!mo12132q1()) {
            if (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
            }
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final void onGlobalLayout() {
        boolean E0 = mo13366E0();
        C4678r m = mo12123m();
        if (m != null && E0) {
            m.mo18360c0();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01bb A[SYNTHETIC, Splitter:B:111:0x01bb] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.mo12132q1()     // Catch:{ all -> 0x01e1 }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r8.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x000d:
            boolean r0 = r8.isInEditMode()     // Catch:{ all -> 0x01e1 }
            if (r0 != 0) goto L_0x01dc
            boolean r0 = r8.f15988B     // Catch:{ all -> 0x01e1 }
            if (r0 != 0) goto L_0x01dc
            com.google.android.gms.internal.ads.mu0 r0 = r8.f16033x     // Catch:{ all -> 0x01e1 }
            boolean r0 = r0.mo12439f()     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x0021
            goto L_0x01dc
        L_0x0021:
            com.google.android.gms.internal.ads.mu0 r0 = r8.f16033x     // Catch:{ all -> 0x01e1 }
            boolean r0 = r0.mo12441h()     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x002e
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x002e:
            com.google.android.gms.internal.ads.mu0 r0 = r8.f16033x     // Catch:{ all -> 0x01e1 }
            boolean r0 = r0.mo12443j()     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x0095
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14473X2     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.internal.ads.lz r2 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x01e1 }
            java.lang.Object r0 = r2.mo12227b(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01e1 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x004d
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x004d:
            com.google.android.gms.internal.ads.st0 r0 = r8.mo8467d0()     // Catch:{ all -> 0x01e1 }
            r2 = 0
            if (r0 == 0) goto L_0x0059
            float r0 = r0.mo10789a()     // Catch:{ all -> 0x01e1 }
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0063
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x0063:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01e1 }
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01e1 }
            float r2 = (float) r10     // Catch:{ all -> 0x01e1 }
            float r2 = r2 * r0
            int r2 = (int) r2     // Catch:{ all -> 0x01e1 }
            float r3 = (float) r9     // Catch:{ all -> 0x01e1 }
            float r3 = r3 / r0
            int r3 = (int) r3     // Catch:{ all -> 0x01e1 }
            if (r10 != 0) goto L_0x007e
            if (r3 == 0) goto L_0x007d
            float r10 = (float) r3     // Catch:{ all -> 0x01e1 }
            float r10 = r10 * r0
            int r2 = (int) r10     // Catch:{ all -> 0x01e1 }
            r1 = r9
            r10 = r3
            goto L_0x0088
        L_0x007d:
            r10 = 0
        L_0x007e:
            if (r9 != 0) goto L_0x0087
            if (r2 == 0) goto L_0x0088
            float r9 = (float) r2     // Catch:{ all -> 0x01e1 }
            float r9 = r9 / r0
            int r3 = (int) r9     // Catch:{ all -> 0x01e1 }
            r1 = r2
            goto L_0x0088
        L_0x0087:
            r1 = r9
        L_0x0088:
            int r9 = java.lang.Math.min(r2, r1)     // Catch:{ all -> 0x01e1 }
            int r10 = java.lang.Math.min(r3, r10)     // Catch:{ all -> 0x01e1 }
            r8.setMeasuredDimension(r9, r10)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x0095:
            com.google.android.gms.internal.ads.mu0 r0 = r8.f16033x     // Catch:{ all -> 0x01e1 }
            boolean r0 = r0.mo12440g()     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x00de
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14531d3     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x01e1 }
            java.lang.Object r0 = r1.mo12227b(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01e1 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x00b4
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x00b4:
            com.google.android.gms.internal.ads.nt0 r0 = new com.google.android.gms.internal.ads.nt0     // Catch:{ all -> 0x01e1 }
            r0.<init>(r8)     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = "/contentHeight"
            r8.mo12105d1(r1, r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r8.mo13363B0(r0)     // Catch:{ all -> 0x01e1 }
            android.util.DisplayMetrics r0 = r8.f16018g     // Catch:{ all -> 0x01e1 }
            float r0 = r0.density     // Catch:{ all -> 0x01e1 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01e1 }
            int r1 = r8.f16000N     // Catch:{ all -> 0x01e1 }
            r2 = -1
            if (r1 == r2) goto L_0x00d5
            float r10 = (float) r1     // Catch:{ all -> 0x01e1 }
            float r10 = r10 * r0
            int r10 = (int) r10     // Catch:{ all -> 0x01e1 }
            goto L_0x00d9
        L_0x00d5:
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01e1 }
        L_0x00d9:
            r8.setMeasuredDimension(r9, r10)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x00de:
            com.google.android.gms.internal.ads.mu0 r0 = r8.f16033x     // Catch:{ all -> 0x01e1 }
            boolean r0 = r0.mo12442i()     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x00f1
            android.util.DisplayMetrics r9 = r8.f16018g     // Catch:{ all -> 0x01e1 }
            int r10 = r9.widthPixels     // Catch:{ all -> 0x01e1 }
            int r9 = r9.heightPixels     // Catch:{ all -> 0x01e1 }
            r8.setMeasuredDimension(r10, r9)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x00f1:
            int r0 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01e1 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01e1 }
            int r2 = android.view.View.MeasureSpec.getMode(r10)     // Catch:{ all -> 0x01e1 }
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01e1 }
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r5) goto L_0x0111
            if (r0 != r4) goto L_0x010d
            goto L_0x0111
        L_0x010d:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0112
        L_0x0111:
            r0 = r9
        L_0x0112:
            if (r2 == r5) goto L_0x0116
            if (r2 != r4) goto L_0x0117
        L_0x0116:
            r3 = r10
        L_0x0117:
            com.google.android.gms.internal.ads.mu0 r2 = r8.f16033x     // Catch:{ all -> 0x01e1 }
            int r4 = r2.f13505c     // Catch:{ all -> 0x01e1 }
            r5 = 1
            if (r4 > r0) goto L_0x0125
            int r2 = r2.f13504b     // Catch:{ all -> 0x01e1 }
            if (r2 <= r3) goto L_0x0123
            goto L_0x0125
        L_0x0123:
            r2 = 0
            goto L_0x0126
        L_0x0125:
            r2 = 1
        L_0x0126:
            com.google.android.gms.internal.ads.ez r4 = com.google.android.gms.internal.ads.C2679nz.f14752z4     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.internal.ads.lz r6 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x01e1 }
            java.lang.Object r4 = r6.mo12227b(r4)     // Catch:{ all -> 0x01e1 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01e1 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01e1 }
            if (r4 == 0) goto L_0x0154
            com.google.android.gms.internal.ads.mu0 r4 = r8.f16033x     // Catch:{ all -> 0x01e1 }
            int r6 = r4.f13505c     // Catch:{ all -> 0x01e1 }
            float r7 = r8.f16020h     // Catch:{ all -> 0x01e1 }
            float r6 = (float) r6     // Catch:{ all -> 0x01e1 }
            float r6 = r6 / r7
            float r0 = (float) r0     // Catch:{ all -> 0x01e1 }
            float r0 = r0 / r7
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0152
            int r0 = r4.f13504b     // Catch:{ all -> 0x01e1 }
            float r0 = (float) r0     // Catch:{ all -> 0x01e1 }
            float r0 = r0 / r7
            float r3 = (float) r3     // Catch:{ all -> 0x01e1 }
            float r3 = r3 / r7
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0152
            r0 = 1
            goto L_0x0153
        L_0x0152:
            r0 = 0
        L_0x0153:
            r2 = r2 & r0
        L_0x0154:
            r0 = 8
            if (r2 == 0) goto L_0x01bb
            com.google.android.gms.internal.ads.mu0 r2 = r8.f16033x     // Catch:{ all -> 0x01e1 }
            int r3 = r2.f13505c     // Catch:{ all -> 0x01e1 }
            float r4 = r8.f16020h     // Catch:{ all -> 0x01e1 }
            int r2 = r2.f13504b     // Catch:{ all -> 0x01e1 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e1 }
            r6.<init>()     // Catch:{ all -> 0x01e1 }
            java.lang.String r7 = "Not enough space to show ad. Needs "
            r6.append(r7)     // Catch:{ all -> 0x01e1 }
            float r3 = (float) r3     // Catch:{ all -> 0x01e1 }
            float r3 = r3 / r4
            int r3 = (int) r3     // Catch:{ all -> 0x01e1 }
            r6.append(r3)     // Catch:{ all -> 0x01e1 }
            java.lang.String r3 = "x"
            r6.append(r3)     // Catch:{ all -> 0x01e1 }
            float r2 = (float) r2     // Catch:{ all -> 0x01e1 }
            float r2 = r2 / r4
            int r2 = (int) r2     // Catch:{ all -> 0x01e1 }
            r6.append(r2)     // Catch:{ all -> 0x01e1 }
            java.lang.String r2 = " dp, but only has "
            r6.append(r2)     // Catch:{ all -> 0x01e1 }
            float r9 = (float) r9     // Catch:{ all -> 0x01e1 }
            float r9 = r9 / r4
            int r9 = (int) r9     // Catch:{ all -> 0x01e1 }
            r6.append(r9)     // Catch:{ all -> 0x01e1 }
            java.lang.String r9 = "x"
            r6.append(r9)     // Catch:{ all -> 0x01e1 }
            float r9 = (float) r10     // Catch:{ all -> 0x01e1 }
            float r9 = r9 / r4
            int r9 = (int) r9     // Catch:{ all -> 0x01e1 }
            r6.append(r9)     // Catch:{ all -> 0x01e1 }
            java.lang.String r9 = " dp."
            r6.append(r9)     // Catch:{ all -> 0x01e1 }
            java.lang.String r9 = r6.toString()     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.internal.ads.pm0.m18667g(r9)     // Catch:{ all -> 0x01e1 }
            int r9 = r8.getVisibility()     // Catch:{ all -> 0x01e1 }
            if (r9 == r0) goto L_0x01a7
            r9 = 4
            r8.setVisibility(r9)     // Catch:{ all -> 0x01e1 }
        L_0x01a7:
            r8.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01e1 }
            boolean r9 = r8.f16028s     // Catch:{ all -> 0x01e1 }
            if (r9 != 0) goto L_0x01b9
            com.google.android.gms.internal.ads.vu r9 = r8.f16026l0     // Catch:{ all -> 0x01e1 }
            r10 = 10001(0x2711, float:1.4014E-41)
            r9.mo14820c(r10)     // Catch:{ all -> 0x01e1 }
            r8.f16028s = r5     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x01b9:
            monitor-exit(r8)
            return
        L_0x01bb:
            int r9 = r8.getVisibility()     // Catch:{ all -> 0x01e1 }
            if (r9 == r0) goto L_0x01c4
            r8.setVisibility(r1)     // Catch:{ all -> 0x01e1 }
        L_0x01c4:
            boolean r9 = r8.f16029t     // Catch:{ all -> 0x01e1 }
            if (r9 != 0) goto L_0x01d1
            com.google.android.gms.internal.ads.vu r9 = r8.f16026l0     // Catch:{ all -> 0x01e1 }
            r10 = 10002(0x2712, float:1.4016E-41)
            r9.mo14820c(r10)     // Catch:{ all -> 0x01e1 }
            r8.f16029t = r5     // Catch:{ all -> 0x01e1 }
        L_0x01d1:
            com.google.android.gms.internal.ads.mu0 r9 = r8.f16033x     // Catch:{ all -> 0x01e1 }
            int r10 = r9.f13505c     // Catch:{ all -> 0x01e1 }
            int r9 = r9.f13504b     // Catch:{ all -> 0x01e1 }
            r8.setMeasuredDimension(r10, r9)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x01dc:
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x01e1:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pt0.onMeasure(int, int):void");
    }

    public final void onPause() {
        if (!mo12132q1()) {
            try {
                super.onPause();
            } catch (Exception e) {
                pm0.m18665e("Could not pause webview.", e);
            }
        }
    }

    public final void onResume() {
        if (!mo12132q1()) {
            try {
                super.onResume();
            } catch (Exception e) {
                pm0.m18665e("Could not resume webview.", e);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f16030u.mo9307f() || this.f16030u.mo9305e()) {
            C2955ve veVar = this.f16008b;
            if (veVar != null) {
                veVar.mo14738d(motionEvent);
            }
            n00 n00 = this.f16010c;
            if (n00 != null) {
                n00.mo12475b(motionEvent);
            }
        } else {
            synchronized (this) {
                e20 e20 = this.f15996J;
                if (e20 != null) {
                    e20.mo9783a(motionEvent);
                }
            }
        }
        if (mo12132q1()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public final void mo8475p(boolean z) {
        this.f16030u.mo9299a(false);
    }

    /* renamed from: p0 */
    public final void mo8943p0(boolean z, int i, String str, String str2, boolean z2) {
        this.f16030u.mo9306e0(z, i, str, str2, z2);
    }

    /* renamed from: p1 */
    public final synchronized void mo12130p1(c20 c20) {
        this.f15997K = c20;
    }

    /* renamed from: q */
    public final synchronized boolean mo12131q() {
        return this.f15991E;
    }

    /* renamed from: q0 */
    public final synchronized void mo8523q0() {
        C4401l lVar = this.f16014e;
        if (lVar != null) {
            lVar.mo8523q0();
        }
    }

    /* renamed from: q1 */
    public final synchronized boolean mo12132q1() {
        return this.f15987A;
    }

    /* renamed from: r */
    public final C2955ve mo10015r() {
        return this.f16008b;
    }

    /* renamed from: r1 */
    public final void mo12133r1(int i) {
        if (i == 0) {
            C2939uz.m21908a(this.f16004R.mo8152a(), this.f16002P, "aebb2");
        }
        m18787L0();
        this.f16004R.mo8152a();
        this.f16004R.mo8152a().mo9000d("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put(MediationMetaData.KEY_VERSION, this.f16012d.f19150a);
        mo9081R("onhide", hashMap);
    }

    /* renamed from: s */
    public final synchronized boolean mo12134s() {
        return this.f15999M > 0;
    }

    /* renamed from: s0 */
    public final void mo8944s0(C4669i iVar, boolean z) {
        this.f16030u.mo9292R(iVar, z);
    }

    /* renamed from: s1 */
    public final lf3 mo12135s1() {
        n00 n00 = this.f16010c;
        if (n00 == null) {
            return cf3.m10911i((Object) null);
        }
        return n00.mo12474a();
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof ct0) {
            this.f16030u = (ct0) webViewClient;
        }
    }

    public final void stopLoading() {
        if (!mo12132q1()) {
            try {
                super.stopLoading();
            } catch (Exception e) {
                pm0.m18665e("Could not stop loading webview.", e);
            }
        }
    }

    /* renamed from: t */
    public final void mo8477t() {
        C4678r m = mo12123m();
        if (m != null) {
            m.mo18359b();
        }
    }

    /* renamed from: t0 */
    public final void mo9090t0(String str, JSONObject jSONObject) {
        mo9089k(str, jSONObject.toString());
    }

    /* renamed from: t1 */
    public final void mo12140t1(Context context) {
        this.f16006a.setBaseContext(context);
        this.f16015e0.mo18475e(this.f16006a.mo12147a());
    }

    /* renamed from: u */
    public final WebViewClient mo12141u() {
        return this.f16030u;
    }

    /* renamed from: u1 */
    public final synchronized void mo12142u1(C4678r rVar) {
        this.f16031v = rVar;
    }

    /* renamed from: v1 */
    public final void mo12143v1() {
        throw null;
    }

    /* renamed from: w */
    public final View mo10647w() {
        return this;
    }

    /* renamed from: w0 */
    public final ct0 mo13378w0() {
        return this.f16030u;
    }

    /* renamed from: w1 */
    public final synchronized void mo12144w1(boolean z) {
        C4678r rVar = this.f16031v;
        if (rVar != null) {
            rVar.mo18354O6(this.f16030u.mo9320u(), z);
        } else {
            this.f16035z = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x0 */
    public final synchronized Boolean mo13379x0() {
        return this.f15990D;
    }

    /* renamed from: x1 */
    public final boolean mo12145x1(boolean z, int i) {
        destroy();
        this.f16026l0.mo14819b(new mt0(z, i));
        this.f16026l0.mo14820c(10003);
        return true;
    }

    /* renamed from: y */
    public final synchronized e20 mo12146y() {
        return this.f15996J;
    }

    /* renamed from: z */
    public final void mo8945z(boolean z, int i, String str, boolean z2) {
        this.f16030u.mo9300a0(z, i, str, z2);
    }
}
