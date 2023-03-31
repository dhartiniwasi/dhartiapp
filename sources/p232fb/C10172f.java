package p232fb;

import com.unity3d.scar.adapter.common.C9701h;
import p129r4.C5455b;
import p129r4.C5456c;
import p129r4.C5457d;
import p179z3.C6321a;
import p179z3.C6343m;
import p179z3.C6344n;
import p179z3.C6349s;
import p389wa.C12938b;

/* renamed from: fb.f */
/* compiled from: ScarRewardedAdListener */
public class C10172f extends C10166b {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C10171e f40576b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C9701h f40577c;

    /* renamed from: d */
    private final C5457d f40578d = new C10173a();

    /* renamed from: e */
    private final C6349s f40579e = new C10174b();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C6343m f40580f = new C10175c();

    /* renamed from: fb.f$a */
    /* compiled from: ScarRewardedAdListener */
    class C10173a extends C5457d {
        C10173a() {
        }

        /* renamed from: d */
        public void mo7703d(C6344n nVar) {
            super.mo7703d(nVar);
            C10172f.this.f40577c.onAdFailedToLoad(nVar.mo21633a(), nVar.toString());
        }

        /* renamed from: f */
        public void mo7704e(C5456c cVar) {
            super.mo7704e(cVar);
            C10172f.this.f40577c.onAdLoaded();
            cVar.mo13805d(C10172f.this.f40580f);
            C10172f.this.f40576b.mo32842d(cVar);
            C12938b bVar = C10172f.this.f40569a;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
        }
    }

    /* renamed from: fb.f$b */
    /* compiled from: ScarRewardedAdListener */
    class C10174b implements C6349s {
        C10174b() {
        }

        /* renamed from: a */
        public void mo12728a(C5455b bVar) {
            C10172f.this.f40577c.onUserEarnedReward();
        }
    }

    /* renamed from: fb.f$c */
    /* compiled from: ScarRewardedAdListener */
    class C10175c extends C6343m {
        C10175c() {
        }

        /* renamed from: b */
        public void mo7705b() {
            super.mo7705b();
            C10172f.this.f40577c.onAdClosed();
        }

        /* renamed from: c */
        public void mo21711c(C6321a aVar) {
            super.mo21711c(aVar);
            C10172f.this.f40577c.onAdFailedToShow(aVar.mo21633a(), aVar.toString());
        }

        /* renamed from: d */
        public void mo21712d() {
            super.mo21712d();
            C10172f.this.f40577c.onAdImpression();
        }

        /* renamed from: e */
        public void mo7706e() {
            super.mo7706e();
            C10172f.this.f40577c.onAdOpened();
        }
    }

    public C10172f(C9701h hVar, C10171e eVar) {
        this.f40577c = hVar;
        this.f40576b = eVar;
    }

    /* renamed from: e */
    public C5457d mo32846e() {
        return this.f40578d;
    }

    /* renamed from: f */
    public C6349s mo32847f() {
        return this.f40579e;
    }
}
