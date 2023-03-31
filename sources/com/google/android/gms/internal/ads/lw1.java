package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class lw1 {

    /* renamed from: a */
    private final a70 f12967a;

    lw1(a70 a70) {
        this.f12967a = a70;
    }

    /* renamed from: s */
    private final void m16241s(kw1 kw1) throws RemoteException {
        String a = kw1.m15642a(kw1);
        pm0.m18666f("Dispatching AFMA event on publisher webview: ".concat(a));
        this.f12967a.mo8230i(a);
    }

    /* renamed from: a */
    public final void mo12158a() throws RemoteException {
        m16241s(new kw1("initialize", (jw1) null));
    }

    /* renamed from: b */
    public final void mo12159b(long j) throws RemoteException {
        kw1 kw1 = new kw1("interstitial", (jw1) null);
        kw1.f12315a = Long.valueOf(j);
        kw1.f12317c = "onAdClicked";
        this.f12967a.mo8230i(kw1.m15642a(kw1));
    }

    /* renamed from: c */
    public final void mo12160c(long j) throws RemoteException {
        kw1 kw1 = new kw1("interstitial", (jw1) null);
        kw1.f12315a = Long.valueOf(j);
        kw1.f12317c = "onAdClosed";
        m16241s(kw1);
    }

    /* renamed from: d */
    public final void mo12161d(long j, int i) throws RemoteException {
        kw1 kw1 = new kw1("interstitial", (jw1) null);
        kw1.f12315a = Long.valueOf(j);
        kw1.f12317c = "onAdFailedToLoad";
        kw1.f12318d = Integer.valueOf(i);
        m16241s(kw1);
    }

    /* renamed from: e */
    public final void mo12162e(long j) throws RemoteException {
        kw1 kw1 = new kw1("interstitial", (jw1) null);
        kw1.f12315a = Long.valueOf(j);
        kw1.f12317c = "onAdLoaded";
        m16241s(kw1);
    }

    /* renamed from: f */
    public final void mo12163f(long j) throws RemoteException {
        kw1 kw1 = new kw1("interstitial", (jw1) null);
        kw1.f12315a = Long.valueOf(j);
        kw1.f12317c = "onNativeAdObjectNotAvailable";
        m16241s(kw1);
    }

    /* renamed from: g */
    public final void mo12164g(long j) throws RemoteException {
        kw1 kw1 = new kw1("interstitial", (jw1) null);
        kw1.f12315a = Long.valueOf(j);
        kw1.f12317c = "onAdOpened";
        m16241s(kw1);
    }

    /* renamed from: h */
    public final void mo12165h(long j) throws RemoteException {
        kw1 kw1 = new kw1("creation", (jw1) null);
        kw1.f12315a = Long.valueOf(j);
        kw1.f12317c = "nativeObjectCreated";
        m16241s(kw1);
    }

    /* renamed from: i */
    public final void mo12166i(long j) throws RemoteException {
        kw1 kw1 = new kw1("creation", (jw1) null);
        kw1.f12315a = Long.valueOf(j);
        kw1.f12317c = "nativeObjectNotCreated";
        m16241s(kw1);
    }

    /* renamed from: j */
    public final void mo12167j(long j) throws RemoteException {
        kw1 kw1 = new kw1("rewarded", (jw1) null);
        kw1.f12315a = Long.valueOf(j);
        kw1.f12317c = "onAdClicked";
        m16241s(kw1);
    }

    /* renamed from: k */
    public final void mo12168k(long j) throws RemoteException {
        kw1 kw1 = new kw1("rewarded", (jw1) null);
        kw1.f12315a = Long.valueOf(j);
        kw1.f12317c = "onRewardedAdClosed";
        m16241s(kw1);
    }

    /* renamed from: l */
    public final void mo12169l(long j, fi0 fi0) throws RemoteException {
        kw1 kw1 = new kw1("rewarded", (jw1) null);
        kw1.f12315a = Long.valueOf(j);
        kw1.f12317c = "onUserEarnedReward";
        kw1.f12319e = fi0.mo9601T();
        kw1.f12320f = Integer.valueOf(fi0.mo9602a());
        m16241s(kw1);
    }

    /* renamed from: m */
    public final void mo12170m(long j, int i) throws RemoteException {
        kw1 kw1 = new kw1("rewarded", (jw1) null);
        kw1.f12315a = Long.valueOf(j);
        kw1.f12317c = "onRewardedAdFailedToLoad";
        kw1.f12318d = Integer.valueOf(i);
        m16241s(kw1);
    }

    /* renamed from: n */
    public final void mo12171n(long j, int i) throws RemoteException {
        kw1 kw1 = new kw1("rewarded", (jw1) null);
        kw1.f12315a = Long.valueOf(j);
        kw1.f12317c = "onRewardedAdFailedToShow";
        kw1.f12318d = Integer.valueOf(i);
        m16241s(kw1);
    }

    /* renamed from: o */
    public final void mo12172o(long j) throws RemoteException {
        kw1 kw1 = new kw1("rewarded", (jw1) null);
        kw1.f12315a = Long.valueOf(j);
        kw1.f12317c = "onAdImpression";
        m16241s(kw1);
    }

    /* renamed from: p */
    public final void mo12173p(long j) throws RemoteException {
        kw1 kw1 = new kw1("rewarded", (jw1) null);
        kw1.f12315a = Long.valueOf(j);
        kw1.f12317c = "onRewardedAdLoaded";
        m16241s(kw1);
    }

    /* renamed from: q */
    public final void mo12174q(long j) throws RemoteException {
        kw1 kw1 = new kw1("rewarded", (jw1) null);
        kw1.f12315a = Long.valueOf(j);
        kw1.f12317c = "onNativeAdObjectNotAvailable";
        m16241s(kw1);
    }

    /* renamed from: r */
    public final void mo12175r(long j) throws RemoteException {
        kw1 kw1 = new kw1("rewarded", (jw1) null);
        kw1.f12315a = Long.valueOf(j);
        kw1.f12317c = "onRewardedAdOpened";
        m16241s(kw1);
    }
}
