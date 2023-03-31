package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p053g4.C4390a;
import p053g4.C4401l;
import p060h4.C4470a;
import p066i4.C4678r;
import p067i5.C4700n;
import p088l5.C4954a;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public interface vs0 extends C4470a, qh1, ms0, q80, tt0, xt0, e90, C2894tr, bu0, C4401l, eu0, fu0, ap0, gu0 {
    /* renamed from: A */
    WebView mo12086A();

    /* renamed from: C */
    void mo8451C(String str, gr0 gr0);

    /* renamed from: E */
    void mo8453E(st0 st0);

    /* renamed from: I */
    C2488it mo12087I();

    /* renamed from: O0 */
    void mo12088O0();

    /* renamed from: P0 */
    ls2 mo12089P0();

    /* renamed from: Q0 */
    void mo12090Q0(boolean z);

    /* renamed from: R0 */
    void mo12091R0();

    /* renamed from: S */
    void mo12092S();

    /* renamed from: S0 */
    void mo12093S0();

    /* renamed from: T0 */
    void mo12094T0(boolean z);

    /* renamed from: U0 */
    void mo12095U0(e20 e20);

    /* renamed from: V0 */
    void mo12096V0(int i);

    /* renamed from: W0 */
    void mo12097W0(is2 is2, ls2 ls2);

    /* renamed from: X */
    Activity mo8461X();

    /* renamed from: X0 */
    boolean mo12098X0();

    /* renamed from: Y */
    a00 mo8462Y();

    /* renamed from: Y0 */
    void mo12099Y0();

    /* renamed from: Z0 */
    void mo12100Z0(mu0 mu0);

    /* renamed from: a1 */
    String mo12101a1();

    /* renamed from: b0 */
    vm0 mo10299b0();

    /* renamed from: b1 */
    void mo12102b1(boolean z);

    /* renamed from: c0 */
    C4390a mo8466c0();

    /* renamed from: c1 */
    void mo12103c1(String str, e60 e60);

    boolean canGoBack();

    /* renamed from: d0 */
    st0 mo8467d0();

    /* renamed from: d1 */
    void mo12105d1(String str, e60 e60);

    void destroy();

    /* renamed from: e1 */
    boolean mo12107e1();

    /* renamed from: f0 */
    ku0 mo12108f0();

    /* renamed from: f1 */
    void mo12109f1(boolean z);

    /* renamed from: g1 */
    void mo12110g1(C4678r rVar);

    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    /* renamed from: h1 */
    void mo12112h1();

    /* renamed from: i */
    C4678r mo12113i();

    /* renamed from: i0 */
    is2 mo12114i0();

    /* renamed from: i1 */
    void mo12115i1(String str, String str2, String str3);

    /* renamed from: j1 */
    void mo12116j1(C4954a aVar);

    /* renamed from: k1 */
    void mo12117k1();

    /* renamed from: l */
    boolean mo12118l();

    /* renamed from: l1 */
    void mo12119l1(boolean z);

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    /* renamed from: m */
    C4678r mo12123m();

    /* renamed from: m1 */
    C4954a mo12124m1();

    void measure(int i, int i2);

    /* renamed from: n */
    mu0 mo9698n();

    /* renamed from: n1 */
    void mo12125n1(C2488it itVar);

    /* renamed from: o */
    Context mo12126o();

    /* renamed from: o1 */
    void mo12127o1(String str, C4700n nVar);

    void onPause();

    void onResume();

    /* renamed from: p1 */
    void mo12130p1(c20 c20);

    /* renamed from: q */
    boolean mo12131q();

    /* renamed from: q1 */
    boolean mo12132q1();

    /* renamed from: r */
    C2955ve mo10015r();

    /* renamed from: r1 */
    void mo12133r1(int i);

    /* renamed from: s */
    boolean mo12134s();

    /* renamed from: s1 */
    lf3 mo12135s1();

    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    /* renamed from: t1 */
    void mo12140t1(Context context);

    /* renamed from: u */
    WebViewClient mo12141u();

    /* renamed from: u1 */
    void mo12142u1(C4678r rVar);

    /* renamed from: v1 */
    void mo12143v1();

    /* renamed from: w */
    View mo10647w();

    /* renamed from: w1 */
    void mo12144w1(boolean z);

    /* renamed from: x1 */
    boolean mo12145x1(boolean z, int i);

    /* renamed from: y */
    e20 mo12146y();
}
