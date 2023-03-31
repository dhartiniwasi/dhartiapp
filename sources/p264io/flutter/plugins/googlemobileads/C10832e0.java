package p264io.flutter.plugins.googlemobileads;

import android.util.Log;
import java.lang.ref.WeakReference;
import p129r4.C5454a;
import p129r4.C5455b;
import p136s4.C5481a;
import p136s4.C5482b;
import p179z3.C6344n;
import p179z3.C6349s;
import p264io.flutter.plugins.googlemobileads.C10823d0;
import p264io.flutter.plugins.googlemobileads.C10826e;

/* renamed from: io.flutter.plugins.googlemobileads.e0 */
/* compiled from: FlutterRewardedInterstitialAd */
class C10832e0 extends C10826e.C10830d {

    /* renamed from: b */
    private final C10813a f42298b;

    /* renamed from: c */
    private final String f42299c;

    /* renamed from: d */
    private final C10838h f42300d;

    /* renamed from: e */
    private final C10853l f42301e;

    /* renamed from: f */
    private final C10843i f42302f;

    /* renamed from: g */
    C5481a f42303g;

    /* renamed from: io.flutter.plugins.googlemobileads.e0$a */
    /* compiled from: FlutterRewardedInterstitialAd */
    private static final class C10833a extends C5482b implements C5454a, C6349s {

        /* renamed from: a */
        private final WeakReference<C10832e0> f42304a;

        C10833a(C10832e0 e0Var) {
            this.f42304a = new WeakReference<>(e0Var);
        }

        /* renamed from: a */
        public void mo12728a(C5455b bVar) {
            if (this.f42304a.get() != null) {
                ((C10832e0) this.f42304a.get()).mo34519i(bVar);
            }
        }

        /* renamed from: b */
        public void mo19755b() {
            if (this.f42304a.get() != null) {
                ((C10832e0) this.f42304a.get()).mo34518h();
            }
        }

        /* renamed from: d */
        public void mo7703d(C6344n nVar) {
            if (this.f42304a.get() != null) {
                ((C10832e0) this.f42304a.get()).mo34516f(nVar);
            }
        }

        /* renamed from: f */
        public void mo7704e(C5481a aVar) {
            if (this.f42304a.get() != null) {
                ((C10832e0) this.f42304a.get()).mo34517g(aVar);
            }
        }
    }

    public C10832e0(int i, C10813a aVar, String str, C10853l lVar, C10838h hVar) {
        super(i);
        this.f42298b = aVar;
        this.f42299c = str;
        this.f42301e = lVar;
        this.f42302f = null;
        this.f42300d = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo34477a() {
        this.f42303g = null;
    }

    /* renamed from: c */
    public void mo34482c(boolean z) {
        C5481a aVar = this.f42303g;
        if (aVar == null) {
            Log.e("FlutterRIAd", "Error setting immersive mode in rewarded interstitial ad - the rewarded interstitial ad wasn't loaded yet.");
        } else {
            aVar.mo9191e(z);
        }
    }

    /* renamed from: d */
    public void mo34483d() {
        if (this.f42303g == null) {
            Log.e("FlutterRIAd", "Error showing rewarded interstitial - the rewarded interstitial ad wasn't loaded yet.");
        } else if (this.f42298b.mo34452f() == null) {
            Log.e("FlutterRIAd", "Tried to show rewarded interstitial ad before activity was bound to the plugin.");
        } else {
            this.f42303g.mo9190d(new C10869s(this.f42298b, this.f42276a));
            this.f42303g.mo9192f(new C10833a(this));
            this.f42303g.mo9195i(this.f42298b.mo34452f(), new C10833a(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo34515e() {
        C10833a aVar = new C10833a(this);
        C10853l lVar = this.f42301e;
        if (lVar != null) {
            C10838h hVar = this.f42300d;
            String str = this.f42299c;
            hVar.mo34537j(str, lVar.mo34558b(str), aVar);
            return;
        }
        C10843i iVar = this.f42302f;
        if (iVar != null) {
            C10838h hVar2 = this.f42300d;
            String str2 = this.f42299c;
            hVar2.mo34532e(str2, iVar.mo34541k(str2), aVar);
            return;
        }
        Log.e("FlutterRIAd", "A null or invalid ad request was provided.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo34516f(C6344n nVar) {
        this.f42298b.mo34456k(this.f42276a, new C10826e.C10829c(nVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo34517g(C5481a aVar) {
        this.f42303g = aVar;
        aVar.mo9193g(new C10815a0(this.f42298b, this));
        this.f42298b.mo34458m(this.f42276a, aVar.mo9189a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo34518h() {
        this.f42298b.mo34459n(this.f42276a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo34519i(C5455b bVar) {
        this.f42298b.mo34466u(this.f42276a, new C10823d0.C10825b(Integer.valueOf(bVar.mo14016a()), bVar.getType()));
    }

    /* renamed from: j */
    public void mo34520j(C10835f0 f0Var) {
        C5481a aVar = this.f42303g;
        if (aVar != null) {
            aVar.mo9194h(f0Var.mo34522a());
        } else {
            Log.e("FlutterRIAd", "RewardedInterstitialAd is null in setServerSideVerificationOptions");
        }
    }

    public C10832e0(int i, C10813a aVar, String str, C10843i iVar, C10838h hVar) {
        super(i);
        this.f42298b = aVar;
        this.f42299c = str;
        this.f42302f = iVar;
        this.f42301e = null;
        this.f42300d = hVar;
    }
}
