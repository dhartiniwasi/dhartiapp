package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import p053g4.C4409t;
import p060h4.C4470a;
import p060h4.C4623z2;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ew1 implements tc1, C4470a, w91, qa1, ra1, lb1, z91, C3106zh, lx2 {

    /* renamed from: a */
    private final List f8961a;

    /* renamed from: b */
    private final sv1 f8962b;

    /* renamed from: c */
    private long f8963c;

    public ew1(sv1 sv1, su0 su0) {
        this.f8962b = sv1;
        this.f8961a = Collections.singletonList(su0);
    }

    /* renamed from: p */
    private final void m12282p(Class cls, String str, Object... objArr) {
        this.f8962b.mo14146a(this.f8961a, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    /* renamed from: W */
    public final void mo8333W() {
        m12282p(w91.class, "onAdClosed", new Object[0]);
    }

    /* renamed from: Y */
    public final void mo8334Y() {
        m12282p(w91.class, "onAdOpened", new Object[0]);
    }

    /* renamed from: Z */
    public final void mo9822Z() {
        m12282p(qa1.class, "onAdImpression", new Object[0]);
    }

    /* renamed from: a */
    public final void mo8191a(ex2 ex2, String str) {
        m12282p(dx2.class, "onTaskStarted", str);
    }

    /* renamed from: a0 */
    public final void mo10019a0() {
        long b = C4409t.m29310b().mo18371b();
        long j = this.f8963c;
        C4794n1.m30693k("Ad Request Latency : " + (b - j));
        m12282p(lb1.class, "onAdLoaded", new Object[0]);
    }

    /* renamed from: c */
    public final void mo9006c(Context context) {
        m12282p(ra1.class, "onPause", context);
    }

    /* renamed from: c0 */
    public final void mo8335c0() {
        m12282p(w91.class, "onAdLeftApplication", new Object[0]);
    }

    /* renamed from: d */
    public final void mo8192d(ex2 ex2, String str) {
        m12282p(dx2.class, "onTaskCreated", str);
    }

    /* renamed from: e */
    public final void mo9007e(Context context) {
        m12282p(ra1.class, "onDestroy", context);
    }

    /* renamed from: e0 */
    public final void mo8336e0() {
        m12282p(w91.class, "onRewardedVideoStarted", new Object[0]);
    }

    /* renamed from: f */
    public final void mo9008f(Context context) {
        m12282p(ra1.class, "onResume", context);
    }

    /* renamed from: g */
    public final void mo9420g(C4623z2 z2Var) {
        m12282p(z91.class, "onAdFailedToLoad", Integer.valueOf(z2Var.f25062a), z2Var.f25063b, z2Var.f25064c);
    }

    /* renamed from: h */
    public final void mo8193h(ex2 ex2, String str) {
        m12282p(dx2.class, "onTaskSucceeded", str);
    }

    /* renamed from: j */
    public final void mo8337j(oh0 oh0, String str, String str2) {
        m12282p(w91.class, "onRewarded", oh0, str, str2);
    }

    /* renamed from: k */
    public final void mo8194k(ex2 ex2, String str, Throwable th) {
        m12282p(dx2.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    public final void onAdClicked() {
        m12282p(C4470a.class, "onAdClicked", new Object[0]);
    }

    /* renamed from: t */
    public final void mo10020t(us2 us2) {
    }

    /* renamed from: v */
    public final void mo10021v(yg0 yg0) {
        this.f8963c = C4409t.m29310b().mo18371b();
        m12282p(tc1.class, "onAdRequest", new Object[0]);
    }

    /* renamed from: x */
    public final void mo8338x() {
        m12282p(w91.class, "onRewardedVideoCompleted", new Object[0]);
    }

    /* renamed from: z */
    public final void mo10022z(String str, String str2) {
        m12282p(C3106zh.class, "onAppEvent", str, str2);
    }
}
