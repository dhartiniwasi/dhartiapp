package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p053g4.C4390a;
import p053g4.C4409t;
import p060h4.C4596v;
import p066i4.C4669i;
import p066i4.C4678r;
import p067i5.C4700n;
import p073j4.C4751b2;
import p073j4.C4752c;
import p073j4.C4811t0;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class lt0 extends FrameLayout implements vs0 {

    /* renamed from: a */
    private final vs0 f12942a;

    /* renamed from: b */
    private final po0 f12943b;

    /* renamed from: c */
    private final AtomicBoolean f12944c = new AtomicBoolean();

    public lt0(vs0 vs0) {
        super(vs0.getContext());
        this.f12942a = vs0;
        this.f12943b = new po0(vs0.mo12126o(), this, this);
        addView((View) vs0);
    }

    /* renamed from: A */
    public final WebView mo12086A() {
        return (WebView) this.f12942a;
    }

    /* renamed from: C */
    public final void mo8451C(String str, gr0 gr0) {
        this.f12942a.mo8451C(str, gr0);
    }

    /* renamed from: D */
    public final gr0 mo8452D(String str) {
        return this.f12942a.mo8452D(str);
    }

    /* renamed from: E */
    public final void mo8453E(st0 st0) {
        this.f12942a.mo8453E(st0);
    }

    /* renamed from: F */
    public final void mo8454F(int i) {
        this.f12942a.mo8454F(i);
    }

    /* renamed from: I */
    public final C2488it mo12087I() {
        return this.f12942a.mo12087I();
    }

    /* renamed from: L */
    public final void mo8455L(int i) {
        this.f12943b.mo13318f(i);
    }

    /* renamed from: N */
    public final void mo8416N(C2857sr srVar) {
        this.f12942a.mo8416N(srVar);
    }

    /* renamed from: O0 */
    public final void mo12088O0() {
        this.f12942a.mo12088O0();
    }

    /* renamed from: P0 */
    public final ls2 mo12089P0() {
        return this.f12942a.mo12089P0();
    }

    /* renamed from: Q */
    public final void mo8456Q(int i) {
        this.f12942a.mo8456Q(i);
    }

    /* renamed from: Q0 */
    public final void mo12090Q0(boolean z) {
        this.f12942a.mo12090Q0(z);
    }

    /* renamed from: R */
    public final void mo9081R(String str, Map map) {
        this.f12942a.mo9081R(str, map);
    }

    /* renamed from: R0 */
    public final void mo12091R0() {
        this.f12943b.mo13316d();
        this.f12942a.mo12091R0();
    }

    /* renamed from: S */
    public final void mo12092S() {
        this.f12942a.mo12092S();
    }

    /* renamed from: S0 */
    public final void mo12093S0() {
        TextView textView = new TextView(getContext());
        C4409t.m29326r();
        textView.setText(C4751b2.m30601S());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    /* renamed from: T */
    public final int mo8457T() {
        return this.f12942a.mo8457T();
    }

    /* renamed from: T0 */
    public final void mo12094T0(boolean z) {
        this.f12942a.mo12094T0(z);
    }

    /* renamed from: U */
    public final int mo8458U() {
        return this.f12942a.mo8458U();
    }

    /* renamed from: U0 */
    public final void mo12095U0(e20 e20) {
        this.f12942a.mo12095U0(e20);
    }

    /* renamed from: V */
    public final int mo8459V() {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14482Y2)).booleanValue()) {
            return this.f12942a.getMeasuredHeight();
        }
        return getMeasuredHeight();
    }

    /* renamed from: V0 */
    public final void mo12096V0(int i) {
        this.f12942a.mo12096V0(i);
    }

    /* renamed from: W */
    public final int mo8460W() {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14482Y2)).booleanValue()) {
            return this.f12942a.getMeasuredWidth();
        }
        return getMeasuredWidth();
    }

    /* renamed from: W0 */
    public final void mo12097W0(is2 is2, ls2 ls2) {
        this.f12942a.mo12097W0(is2, ls2);
    }

    /* renamed from: X */
    public final Activity mo8461X() {
        return this.f12942a.mo8461X();
    }

    /* renamed from: X0 */
    public final boolean mo12098X0() {
        return this.f12942a.mo12098X0();
    }

    /* renamed from: Y */
    public final a00 mo8462Y() {
        return this.f12942a.mo8462Y();
    }

    /* renamed from: Y0 */
    public final void mo12099Y0() {
        this.f12942a.mo12099Y0();
    }

    /* renamed from: Z0 */
    public final void mo12100Z0(mu0 mu0) {
        this.f12942a.mo12100Z0(mu0);
    }

    /* renamed from: a */
    public final void mo9084a(String str, JSONObject jSONObject) {
        this.f12942a.mo9084a(str, jSONObject);
    }

    /* renamed from: a0 */
    public final C3124zz mo8463a0() {
        return this.f12942a.mo8463a0();
    }

    /* renamed from: a1 */
    public final String mo12101a1() {
        return this.f12942a.mo12101a1();
    }

    /* renamed from: b0 */
    public final vm0 mo10299b0() {
        return this.f12942a.mo10299b0();
    }

    /* renamed from: b1 */
    public final void mo12102b1(boolean z) {
        this.f12942a.mo12102b1(z);
    }

    /* renamed from: c */
    public final int mo8465c() {
        return this.f12942a.mo8465c();
    }

    /* renamed from: c0 */
    public final C4390a mo8466c0() {
        return this.f12942a.mo8466c0();
    }

    /* renamed from: c1 */
    public final void mo12103c1(String str, e60 e60) {
        this.f12942a.mo12103c1(str, e60);
    }

    public final boolean canGoBack() {
        return this.f12942a.canGoBack();
    }

    /* renamed from: d0 */
    public final st0 mo8467d0() {
        return this.f12942a.mo8467d0();
    }

    /* renamed from: d1 */
    public final void mo12105d1(String str, e60 e60) {
        this.f12942a.mo12105d1(str, e60);
    }

    public final void destroy() {
        C4954a m1 = mo12124m1();
        if (m1 != null) {
            b53 b53 = C4751b2.f25403i;
            b53.post(new jt0(m1));
            vs0 vs0 = this.f12942a;
            vs0.getClass();
            b53.postDelayed(new kt0(vs0), (long) ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14572h4)).intValue());
            return;
        }
        this.f12942a.destroy();
    }

    /* renamed from: e0 */
    public final void mo8522e0() {
        this.f12942a.mo8522e0();
    }

    /* renamed from: e1 */
    public final boolean mo12107e1() {
        return this.f12944c.get();
    }

    /* renamed from: f */
    public final void mo9087f(String str) {
        ((pt0) this.f12942a).mo13363B0(str);
    }

    /* renamed from: f0 */
    public final ku0 mo12108f0() {
        return ((pt0) this.f12942a).mo13378w0();
    }

    /* renamed from: f1 */
    public final void mo12109f1(boolean z) {
        this.f12942a.mo12109f1(z);
    }

    /* renamed from: g */
    public final String mo8468g() {
        return this.f12942a.mo8468g();
    }

    /* renamed from: g1 */
    public final void mo12110g1(C4678r rVar) {
        this.f12942a.mo12110g1(rVar);
    }

    public final void goBack() {
        this.f12942a.goBack();
    }

    /* renamed from: h */
    public final void mo9272h() {
        vs0 vs0 = this.f12942a;
        if (vs0 != null) {
            vs0.mo9272h();
        }
    }

    /* renamed from: h0 */
    public final void mo8470h0(int i) {
        this.f12942a.mo8470h0(i);
    }

    /* renamed from: h1 */
    public final void mo12112h1() {
        setBackgroundColor(0);
        this.f12942a.setBackgroundColor(0);
    }

    /* renamed from: i */
    public final C4678r mo12113i() {
        return this.f12942a.mo12113i();
    }

    /* renamed from: i0 */
    public final is2 mo12114i0() {
        return this.f12942a.mo12114i0();
    }

    /* renamed from: i1 */
    public final void mo12115i1(String str, String str2, String str3) {
        this.f12942a.mo12115i1(str, str2, (String) null);
    }

    /* renamed from: j */
    public final String mo8471j() {
        return this.f12942a.mo8471j();
    }

    /* renamed from: j1 */
    public final void mo12116j1(C4954a aVar) {
        this.f12942a.mo12116j1(aVar);
    }

    /* renamed from: k */
    public final void mo9089k(String str, String str2) {
        this.f12942a.mo9089k("window.inspectorInfo", str2);
    }

    /* renamed from: k0 */
    public final po0 mo8472k0() {
        return this.f12943b;
    }

    /* renamed from: k1 */
    public final void mo12117k1() {
        this.f12942a.mo12117k1();
    }

    /* renamed from: l */
    public final boolean mo12118l() {
        return this.f12942a.mo12118l();
    }

    /* renamed from: l0 */
    public final void mo8473l0(boolean z, long j) {
        this.f12942a.mo8473l0(z, j);
    }

    /* renamed from: l1 */
    public final void mo12119l1(boolean z) {
        this.f12942a.mo12119l1(z);
    }

    public final void loadData(String str, String str2, String str3) {
        this.f12942a.loadData(str, "text/html", str3);
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f12942a.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", (String) null);
    }

    public final void loadUrl(String str) {
        this.f12942a.loadUrl(str);
    }

    /* renamed from: m */
    public final C4678r mo12123m() {
        return this.f12942a.mo12123m();
    }

    /* renamed from: m0 */
    public final void mo8474m0() {
        this.f12942a.mo8474m0();
    }

    /* renamed from: m1 */
    public final C4954a mo12124m1() {
        return this.f12942a.mo12124m1();
    }

    /* renamed from: n */
    public final mu0 mo9698n() {
        return this.f12942a.mo9698n();
    }

    /* renamed from: n0 */
    public final void mo8941n0(boolean z, int i, boolean z2) {
        this.f12942a.mo8941n0(z, i, z2);
    }

    /* renamed from: n1 */
    public final void mo12125n1(C2488it itVar) {
        this.f12942a.mo12125n1(itVar);
    }

    /* renamed from: o */
    public final Context mo12126o() {
        return this.f12942a.mo12126o();
    }

    /* renamed from: o0 */
    public final void mo8942o0(C4811t0 t0Var, o42 o42, gv1 gv1, ux2 ux2, String str, String str2, int i) {
        this.f12942a.mo8942o0(t0Var, o42, gv1, ux2, str, str2, 14);
    }

    /* renamed from: o1 */
    public final void mo12127o1(String str, C4700n nVar) {
        this.f12942a.mo12127o1(str, nVar);
    }

    public final void onAdClicked() {
        vs0 vs0 = this.f12942a;
        if (vs0 != null) {
            vs0.onAdClicked();
        }
    }

    public final void onPause() {
        this.f12943b.mo13317e();
        this.f12942a.onPause();
    }

    public final void onResume() {
        this.f12942a.onResume();
    }

    /* renamed from: p */
    public final void mo8475p(boolean z) {
        this.f12942a.mo8475p(false);
    }

    /* renamed from: p0 */
    public final void mo8943p0(boolean z, int i, String str, String str2, boolean z2) {
        this.f12942a.mo8943p0(z, i, str, str2, z2);
    }

    /* renamed from: p1 */
    public final void mo12130p1(c20 c20) {
        this.f12942a.mo12130p1(c20);
    }

    /* renamed from: q */
    public final boolean mo12131q() {
        return this.f12942a.mo12131q();
    }

    /* renamed from: q0 */
    public final void mo8523q0() {
        this.f12942a.mo8523q0();
    }

    /* renamed from: q1 */
    public final boolean mo12132q1() {
        return this.f12942a.mo12132q1();
    }

    /* renamed from: r */
    public final C2955ve mo10015r() {
        return this.f12942a.mo10015r();
    }

    /* renamed from: r1 */
    public final void mo12133r1(int i) {
        this.f12942a.mo12133r1(i);
    }

    /* renamed from: s */
    public final boolean mo12134s() {
        return this.f12942a.mo12134s();
    }

    /* renamed from: s0 */
    public final void mo8944s0(C4669i iVar, boolean z) {
        this.f12942a.mo8944s0(iVar, z);
    }

    /* renamed from: s1 */
    public final lf3 mo12135s1() {
        return this.f12942a.mo12135s1();
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f12942a.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f12942a.setOnTouchListener(onTouchListener);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f12942a.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f12942a.setWebViewClient(webViewClient);
    }

    /* renamed from: t */
    public final void mo8477t() {
        this.f12942a.mo8477t();
    }

    /* renamed from: t0 */
    public final void mo9090t0(String str, JSONObject jSONObject) {
        ((pt0) this.f12942a).mo9089k(str, jSONObject.toString());
    }

    /* renamed from: t1 */
    public final void mo12140t1(Context context) {
        this.f12942a.mo12140t1(context);
    }

    /* renamed from: u */
    public final WebViewClient mo12141u() {
        return this.f12942a.mo12141u();
    }

    /* renamed from: u1 */
    public final void mo12142u1(C4678r rVar) {
        this.f12942a.mo12142u1(rVar);
    }

    /* renamed from: v1 */
    public final void mo12143v1() {
        vs0 vs0 = this.f12942a;
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(C4409t.m29328t().mo18442e()));
        hashMap.put("app_volume", String.valueOf(C4409t.m29328t().mo18439a()));
        pt0 pt0 = (pt0) vs0;
        hashMap.put("device_volume", String.valueOf(C4752c.m30638b(pt0.getContext())));
        pt0.mo9081R("volume", hashMap);
    }

    /* renamed from: w */
    public final View mo10647w() {
        return this;
    }

    /* renamed from: w1 */
    public final void mo12144w1(boolean z) {
        this.f12942a.mo12144w1(z);
    }

    /* renamed from: x1 */
    public final boolean mo12145x1(boolean z, int i) {
        if (!this.f12944c.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14293F0)).booleanValue()) {
            return false;
        }
        if (this.f12942a.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.f12942a.getParent()).removeView((View) this.f12942a);
        }
        this.f12942a.mo12145x1(z, i);
        return true;
    }

    /* renamed from: y */
    public final e20 mo12146y() {
        return this.f12942a.mo12146y();
    }

    /* renamed from: z */
    public final void mo8945z(boolean z, int i, String str, boolean z2) {
        this.f12942a.mo8945z(z, i, str, z2);
    }
}
