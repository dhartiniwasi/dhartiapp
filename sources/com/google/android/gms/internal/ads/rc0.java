package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import p023c4.C1865f;
import p033d5.C4141r;
import p087l4.C4937i;
import p087l4.C4942n;
import p087l4.C4944p;
import p087l4.C4950v;
import p179z3.C6321a;
import p179z3.C6355x;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class rc0 implements C4937i, C4942n, C4944p {

    /* renamed from: a */
    private final wb0 f16909a;

    /* renamed from: b */
    private C4950v f16910b;

    /* renamed from: c */
    private C1865f f16911c;

    public rc0(wb0 wb0) {
        this.f16909a = wb0;
    }

    /* renamed from: a */
    public final void mo13757a(MediationBannerAdapter mediationBannerAdapter) {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        pm0.m18662b("Adapter called onAdClosed.");
        try {
            this.f16909a.mo11356T();
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: b */
    public final void mo13758b(MediationNativeAdapter mediationNativeAdapter) {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        pm0.m18662b("Adapter called onAdOpened.");
        try {
            this.f16909a.mo11361b0();
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: c */
    public final void mo13759c(MediationInterstitialAdapter mediationInterstitialAdapter, C6321a aVar) {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        int a = aVar.mo21633a();
        String c = aVar.mo21635c();
        String b = aVar.mo21634b();
        pm0.m18662b("Adapter called onAdFailedToLoad with error. ErrorCode: " + a + ". ErrorMessage: " + c + ". ErrorDomain: " + b);
        try {
            this.f16909a.mo11366u3(aVar.mo21636d());
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: d */
    public final void mo13760d(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        pm0.m18662b("Adapter called onAdFailedToLoad with error " + i + ".");
        try {
            this.f16909a.mo11362f0(i);
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: e */
    public final void mo13761e(MediationBannerAdapter mediationBannerAdapter) {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        pm0.m18662b("Adapter called onAdClicked.");
        try {
            this.f16909a.mo11359a();
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: f */
    public final void mo13762f(MediationNativeAdapter mediationNativeAdapter) {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        pm0.m18662b("Adapter called onAdClosed.");
        try {
            this.f16909a.mo11356T();
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: g */
    public final void mo13763g(MediationBannerAdapter mediationBannerAdapter) {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        pm0.m18662b("Adapter called onAdLoaded.");
        try {
            this.f16909a.mo11357Y();
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: h */
    public final void mo13764h(MediationNativeAdapter mediationNativeAdapter, C6321a aVar) {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        int a = aVar.mo21633a();
        String c = aVar.mo21635c();
        String b = aVar.mo21634b();
        pm0.m18662b("Adapter called onAdFailedToLoad with error. ErrorCode: " + a + ". ErrorMessage: " + c + ". ErrorDomain: " + b);
        try {
            this.f16909a.mo11366u3(aVar.mo21636d());
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: i */
    public final void mo13765i(MediationNativeAdapter mediationNativeAdapter, C1865f fVar, String str) {
        if (fVar instanceof k30) {
            try {
                this.f16909a.mo11365t2(((k30) fVar).mo11558b(), str);
            } catch (RemoteException e) {
                pm0.m18669i("#007 Could not call remote method.", e);
            }
        } else {
            pm0.m18667g("Unexpected native custom template ad type.");
        }
    }

    /* renamed from: j */
    public final void mo13766j(MediationNativeAdapter mediationNativeAdapter) {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        C4950v vVar = this.f16910b;
        if (this.f16911c == null) {
            if (vVar == null) {
                pm0.m18669i("#007 Could not call remote method.", (Throwable) null);
                return;
            } else if (!vVar.mo18811l()) {
                pm0.m18662b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        pm0.m18662b("Adapter called onAdClicked.");
        try {
            this.f16909a.mo11359a();
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: k */
    public final void mo13767k(MediationNativeAdapter mediationNativeAdapter, C4950v vVar) {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        pm0.m18662b("Adapter called onAdLoaded.");
        this.f16910b = vVar;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            C6355x xVar = new C6355x();
            xVar.mo21737c(new hc0());
            if (vVar != null && vVar.mo18817r()) {
                vVar.mo18799K(xVar);
            }
        }
        try {
            this.f16909a.mo11357Y();
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: l */
    public final void mo13768l(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        pm0.m18662b("Adapter called onAdLoaded.");
        try {
            this.f16909a.mo11357Y();
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: m */
    public final void mo13769m(MediationBannerAdapter mediationBannerAdapter) {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        pm0.m18662b("Adapter called onAdOpened.");
        try {
            this.f16909a.mo11361b0();
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: n */
    public final void mo13770n(MediationBannerAdapter mediationBannerAdapter, C6321a aVar) {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        int a = aVar.mo21633a();
        String c = aVar.mo21635c();
        String b = aVar.mo21634b();
        pm0.m18662b("Adapter called onAdFailedToLoad with error. ErrorCode: " + a + ". ErrorMessage: " + c + ". ErrorDomain: " + b);
        try {
            this.f16909a.mo11366u3(aVar.mo21636d());
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: o */
    public final void mo13771o(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        pm0.m18662b("Adapter called onAdClosed.");
        try {
            this.f16909a.mo11356T();
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: p */
    public final void mo13772p(MediationNativeAdapter mediationNativeAdapter, C1865f fVar) {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        pm0.m18662b("Adapter called onAdLoaded with template id ".concat(String.valueOf(fVar.mo7105a())));
        this.f16911c = fVar;
        try {
            this.f16909a.mo11357Y();
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: q */
    public final void mo13773q(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        pm0.m18662b("Adapter called onAppEvent.");
        try {
            this.f16909a.mo11358Z4(str, str2);
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: r */
    public final void mo13774r(MediationNativeAdapter mediationNativeAdapter) {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        C4950v vVar = this.f16910b;
        if (this.f16911c == null) {
            if (vVar == null) {
                pm0.m18669i("#007 Could not call remote method.", (Throwable) null);
                return;
            } else if (!vVar.mo18812m()) {
                pm0.m18662b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        pm0.m18662b("Adapter called onAdImpression.");
        try {
            this.f16909a.mo8705c0();
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: s */
    public final void mo13775s(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        pm0.m18662b("Adapter called onAdOpened.");
        try {
            this.f16909a.mo11361b0();
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: t */
    public final C1865f mo13776t() {
        return this.f16911c;
    }

    /* renamed from: u */
    public final C4950v mo13777u() {
        return this.f16910b;
    }
}
