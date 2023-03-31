package p202cb;

import com.google.android.gms.ads.InterstitialAd;
import com.unity3d.scar.adapter.common.C9700g;
import p179z3.C6327d;
import p179z3.C6344n;
import p389wa.C12938b;

/* renamed from: cb.c */
/* compiled from: ScarInterstitialAdListener */
public class C6845c {

    /* renamed from: a */
    private InterstitialAd f31498a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C9700g f31499b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C12938b f31500c;

    /* renamed from: d */
    private C6327d f31501d = new C6846a();

    /* renamed from: cb.c$a */
    /* compiled from: ScarInterstitialAdListener */
    class C6846a extends C6327d {
        C6846a() {
        }

        /* renamed from: f */
        public void mo7698f() {
            C6845c.this.f31499b.onAdClosed();
        }

        /* renamed from: g */
        public void mo7699g(C6344n nVar) {
            C6845c.this.f31499b.onAdFailedToLoad(nVar.mo21633a(), nVar.toString());
        }

        /* renamed from: j */
        public void mo7700j() {
            C6845c.this.f31499b.onAdLoaded();
            if (C6845c.this.f31500c != null) {
                C6845c.this.f31500c.onAdLoaded();
            }
        }

        /* renamed from: k */
        public void mo7701k() {
            C6845c.this.f31499b.onAdOpened();
        }

        public void onAdClicked() {
            C6845c.this.f31499b.onAdClicked();
        }
    }

    public C6845c(InterstitialAd interstitialAd, C9700g gVar) {
        this.f31498a = interstitialAd;
        this.f31499b = gVar;
    }

    /* renamed from: c */
    public C6327d mo22953c() {
        return this.f31501d;
    }

    /* renamed from: d */
    public void mo22954d(C12938b bVar) {
        this.f31500c = bVar;
    }
}
