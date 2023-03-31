package p232fb;

import com.unity3d.scar.adapter.common.C9700g;
import p080k4.C4883a;
import p080k4.C4884b;
import p179z3.C6321a;
import p179z3.C6343m;
import p179z3.C6344n;
import p389wa.C12938b;

/* renamed from: fb.d */
/* compiled from: ScarInterstitialAdListener */
public class C10168d extends C10166b {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C10167c f40570b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C9700g f40571c;

    /* renamed from: d */
    private final C4884b f40572d = new C10169a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C6343m f40573e = new C10170b();

    /* renamed from: fb.d$a */
    /* compiled from: ScarInterstitialAdListener */
    class C10169a extends C4884b {
        C10169a() {
        }

        /* renamed from: d */
        public void mo7703d(C6344n nVar) {
            super.mo7703d(nVar);
            C10168d.this.f40571c.onAdFailedToLoad(nVar.mo21633a(), nVar.toString());
        }

        /* renamed from: f */
        public void mo7704e(C4883a aVar) {
            super.mo7704e(aVar);
            C10168d.this.f40571c.onAdLoaded();
            aVar.mo13162c(C10168d.this.f40573e);
            C10168d.this.f40570b.mo32842d(aVar);
            C12938b bVar = C10168d.this.f40569a;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }
    }

    /* renamed from: fb.d$b */
    /* compiled from: ScarInterstitialAdListener */
    class C10170b extends C6343m {
        C10170b() {
        }

        /* renamed from: b */
        public void mo7705b() {
            super.mo7705b();
            C10168d.this.f40571c.onAdClosed();
        }

        /* renamed from: c */
        public void mo21711c(C6321a aVar) {
            super.mo21711c(aVar);
            C10168d.this.f40571c.onAdFailedToShow(aVar.mo21633a(), aVar.toString());
        }

        /* renamed from: d */
        public void mo21712d() {
            super.mo21712d();
            C10168d.this.f40571c.onAdImpression();
        }

        /* renamed from: e */
        public void mo7706e() {
            super.mo7706e();
            C10168d.this.f40571c.onAdOpened();
        }
    }

    public C10168d(C9700g gVar, C10167c cVar) {
        this.f40571c = gVar;
        this.f40570b = cVar;
    }

    /* renamed from: e */
    public C4884b mo32844e() {
        return this.f40572d;
    }
}
