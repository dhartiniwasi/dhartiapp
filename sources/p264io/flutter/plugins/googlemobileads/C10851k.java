package p264io.flutter.plugins.googlemobileads;

import android.util.Log;
import java.lang.ref.WeakReference;
import p006a4.C0098c;
import p006a4.C0099d;
import p006a4.C0100e;
import p179z3.C6344n;
import p264io.flutter.plugins.googlemobileads.C10826e;

/* renamed from: io.flutter.plugins.googlemobileads.k */
/* compiled from: FlutterAdManagerInterstitialAd */
class C10851k extends C10826e.C10830d {

    /* renamed from: b */
    private final C10813a f42340b;

    /* renamed from: c */
    private final String f42341c;

    /* renamed from: d */
    private final C10843i f42342d;

    /* renamed from: e */
    private C0098c f42343e;

    /* renamed from: f */
    private final C10838h f42344f;

    /* renamed from: io.flutter.plugins.googlemobileads.k$a */
    /* compiled from: FlutterAdManagerInterstitialAd */
    private static final class C10852a extends C0099d implements C0100e {

        /* renamed from: a */
        private final WeakReference<C10851k> f42345a;

        C10852a(C10851k kVar) {
            this.f42345a = new WeakReference<>(kVar);
        }

        /* renamed from: c */
        public void mo248c(String str, String str2) {
            if (this.f42345a.get() != null) {
                ((C10851k) this.f42345a.get()).mo34556h(str, str2);
            }
        }

        /* renamed from: d */
        public void mo7703d(C6344n nVar) {
            if (this.f42345a.get() != null) {
                ((C10851k) this.f42345a.get()).mo34554f(nVar);
            }
        }

        /* renamed from: f */
        public void mo7704e(C0098c cVar) {
            if (this.f42345a.get() != null) {
                ((C10851k) this.f42345a.get()).mo34555g(cVar);
            }
        }
    }

    public C10851k(int i, C10813a aVar, String str, C10843i iVar, C10838h hVar) {
        super(i);
        this.f42340b = aVar;
        this.f42341c = str;
        this.f42342d = iVar;
        this.f42344f = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo34477a() {
        this.f42343e = null;
    }

    /* renamed from: c */
    public void mo34482c(boolean z) {
        C0098c cVar = this.f42343e;
        if (cVar == null) {
            Log.e("FltGAMInterstitialAd", "The interstitial wasn't loaded yet.");
        } else {
            cVar.mo13163d(z);
        }
    }

    /* renamed from: d */
    public void mo34483d() {
        if (this.f42343e == null) {
            Log.e("FltGAMInterstitialAd", "The interstitial wasn't loaded yet.");
        } else if (this.f42340b.mo34452f() == null) {
            Log.e("FltGAMInterstitialAd", "Tried to show interstitial before activity was bound to the plugin.");
        } else {
            this.f42343e.mo13162c(new C10869s(this.f42340b, this.f42276a));
            this.f42343e.mo13165f(this.f42340b.mo34452f());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo34553e() {
        C10838h hVar = this.f42344f;
        String str = this.f42341c;
        hVar.mo34529b(str, this.f42342d.mo34541k(str), new C10852a(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo34554f(C6344n nVar) {
        this.f42340b.mo34456k(this.f42276a, new C10826e.C10829c(nVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo34555g(C0098c cVar) {
        this.f42343e = cVar;
        cVar.mo247h(new C10852a(this));
        cVar.mo13164e(new C10815a0(this.f42340b, this));
        this.f42340b.mo34458m(this.f42276a, cVar.mo13161a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo34556h(String str, String str2) {
        this.f42340b.mo34462q(this.f42276a, str, str2);
    }
}
