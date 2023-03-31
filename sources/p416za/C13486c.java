package p416za;

import com.google.android.gms.ads.InterstitialAd;
import com.unity3d.scar.adapter.common.C9700g;
import p179z3.C6327d;
import p389wa.C12938b;

/* renamed from: za.c */
/* compiled from: ScarInterstitialAdListener */
public class C13486c {

    /* renamed from: a */
    private InterstitialAd f47872a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C9700g f47873b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C12938b f47874c;

    /* renamed from: d */
    private C6327d f47875d = new C13487a();

    /* renamed from: za.c$a */
    /* compiled from: ScarInterstitialAdListener */
    class C13487a extends C6327d {
        C13487a() {
        }

        /* renamed from: f */
        public void mo7698f() {
            C13486c.this.f47873b.onAdClosed();
        }

        /* renamed from: j */
        public void mo7700j() {
            C13486c.this.f47873b.onAdLoaded();
            if (C13486c.this.f47874c != null) {
                C13486c.this.f47874c.onAdLoaded();
            }
        }

        /* renamed from: k */
        public void mo7701k() {
            C13486c.this.f47873b.onAdOpened();
        }

        public void onAdClicked() {
            C13486c.this.f47873b.onAdClicked();
        }
    }

    public C13486c(InterstitialAd interstitialAd, C9700g gVar) {
        this.f47872a = interstitialAd;
        this.f47873b = gVar;
    }

    /* renamed from: c */
    public C6327d mo38616c() {
        return this.f47875d;
    }

    /* renamed from: d */
    public void mo38617d(C12938b bVar) {
        this.f47874c = bVar;
    }
}
