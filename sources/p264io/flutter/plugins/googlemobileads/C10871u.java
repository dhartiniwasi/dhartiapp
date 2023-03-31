package p264io.flutter.plugins.googlemobileads;

import android.util.Log;
import java.lang.ref.WeakReference;
import p080k4.C4883a;
import p080k4.C4884b;
import p179z3.C6344n;
import p264io.flutter.plugins.googlemobileads.C10826e;

/* renamed from: io.flutter.plugins.googlemobileads.u */
/* compiled from: FlutterInterstitialAd */
class C10871u extends C10826e.C10830d {

    /* renamed from: b */
    private final C10813a f42398b;

    /* renamed from: c */
    private final String f42399c;

    /* renamed from: d */
    private final C10853l f42400d;

    /* renamed from: e */
    private C4883a f42401e;

    /* renamed from: f */
    private final C10838h f42402f;

    /* renamed from: io.flutter.plugins.googlemobileads.u$a */
    /* compiled from: FlutterInterstitialAd */
    private static final class C10872a extends C4884b {

        /* renamed from: a */
        private final WeakReference<C10871u> f42403a;

        C10872a(C10871u uVar) {
            this.f42403a = new WeakReference<>(uVar);
        }

        /* renamed from: d */
        public void mo7703d(C6344n nVar) {
            if (this.f42403a.get() != null) {
                ((C10871u) this.f42403a.get()).mo34602f(nVar);
            }
        }

        /* renamed from: f */
        public void mo7704e(C4883a aVar) {
            if (this.f42403a.get() != null) {
                ((C10871u) this.f42403a.get()).mo34603g(aVar);
            }
        }
    }

    public C10871u(int i, C10813a aVar, String str, C10853l lVar, C10838h hVar) {
        super(i);
        this.f42398b = aVar;
        this.f42399c = str;
        this.f42400d = lVar;
        this.f42402f = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo34477a() {
        this.f42401e = null;
    }

    /* renamed from: c */
    public void mo34482c(boolean z) {
        C4883a aVar = this.f42401e;
        if (aVar == null) {
            Log.e("FlutterInterstitialAd", "Error setting immersive mode in interstitial ad - the interstitial ad wasn't loaded yet.");
        } else {
            aVar.mo13163d(z);
        }
    }

    /* renamed from: d */
    public void mo34483d() {
        if (this.f42401e == null) {
            Log.e("FlutterInterstitialAd", "Error showing interstitial - the interstitial ad wasn't loaded yet.");
        } else if (this.f42398b.mo34452f() == null) {
            Log.e("FlutterInterstitialAd", "Tried to show interstitial before activity was bound to the plugin.");
        } else {
            this.f42401e.mo13162c(new C10869s(this.f42398b, this.f42276a));
            this.f42401e.mo13165f(this.f42398b.mo34452f());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo34601e() {
        String str;
        C10853l lVar;
        if (this.f42398b != null && (str = this.f42399c) != null && (lVar = this.f42400d) != null) {
            this.f42402f.mo34534g(str, lVar.mo34558b(str), new C10872a(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo34602f(C6344n nVar) {
        this.f42398b.mo34456k(this.f42276a, new C10826e.C10829c(nVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo34603g(C4883a aVar) {
        this.f42401e = aVar;
        aVar.mo13164e(new C10815a0(this.f42398b, this));
        this.f42398b.mo34458m(this.f42276a, aVar.mo13161a());
    }
}
