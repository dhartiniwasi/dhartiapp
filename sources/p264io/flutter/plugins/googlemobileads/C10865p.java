package p264io.flutter.plugins.googlemobileads;

import android.util.Log;
import java.lang.ref.WeakReference;
import p016b4.C1781a;
import p179z3.C6344n;
import p264io.flutter.plugins.googlemobileads.C10826e;
import p325pc.C12167c;

/* renamed from: io.flutter.plugins.googlemobileads.p */
/* compiled from: FlutterAppOpenAd */
class C10865p extends C10826e.C10830d {

    /* renamed from: b */
    private final C10813a f42380b;

    /* renamed from: c */
    private final String f42381c;

    /* renamed from: d */
    private final int f42382d;

    /* renamed from: e */
    private final C10853l f42383e;

    /* renamed from: f */
    private final C10843i f42384f;

    /* renamed from: g */
    private C1781a f42385g;

    /* renamed from: h */
    private final C10838h f42386h;

    /* renamed from: io.flutter.plugins.googlemobileads.p$a */
    /* compiled from: FlutterAppOpenAd */
    private static final class C10866a extends C1781a.C1782a {

        /* renamed from: a */
        private final WeakReference<C10865p> f42387a;

        C10866a(C10865p pVar) {
            this.f42387a = new WeakReference<>(pVar);
        }

        /* renamed from: d */
        public void mo7703d(C6344n nVar) {
            if (this.f42387a.get() != null) {
                ((C10865p) this.f42387a.get()).m54231i(nVar);
            }
        }

        /* renamed from: f */
        public void mo7704e(C1781a aVar) {
            if (this.f42387a.get() != null) {
                ((C10865p) this.f42387a.get()).m54232j(aVar);
            }
        }
    }

    C10865p(int i, int i2, C10813a aVar, String str, C10853l lVar, C10843i iVar, C10838h hVar) {
        super(i);
        C12167c.m58442b((lVar == null && iVar == null) ? false : true, "One of request and adManagerAdRequest must be non-null.");
        this.f42380b = aVar;
        this.f42382d = i2;
        this.f42381c = str;
        this.f42383e = lVar;
        this.f42384f = iVar;
        this.f42386h = hVar;
    }

    /* renamed from: g */
    private int m54230g() {
        int i = this.f42382d;
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        Log.e("FlutterAppOpenAd", "Passed unknown app open orientation: " + this.f42382d);
        return 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m54231i(C6344n nVar) {
        this.f42380b.mo34456k(this.f42276a, new C10826e.C10829c(nVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m54232j(C1781a aVar) {
        this.f42385g = aVar;
        aVar.mo6910f(new C10815a0(this.f42380b, this));
        this.f42380b.mo34458m(this.f42276a, aVar.mo6907a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo34477a() {
        this.f42385g = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo34482c(boolean z) {
        C1781a aVar = this.f42385g;
        if (aVar == null) {
            Log.w("FlutterAppOpenAd", "Tried to set immersive mode on app open ad before it was loaded");
        } else {
            aVar.mo6909e(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo34483d() {
        if (this.f42385g == null) {
            Log.w("FlutterAppOpenAd", "Tried to show app open ad before it was loaded");
        } else if (this.f42380b.mo34452f() == null) {
            Log.e("FlutterAppOpenAd", "Tried to show app open ad before activity was bound to the plugin.");
        } else {
            this.f42385g.mo6908d(new C10869s(this.f42380b, this.f42276a));
            this.f42385g.mo6911g(this.f42380b.mo34452f());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo34597h() {
        C10853l lVar = this.f42383e;
        if (lVar != null) {
            C10838h hVar = this.f42386h;
            String str = this.f42381c;
            hVar.mo34533f(str, lVar.mo34558b(str), m54230g(), new C10866a(this));
            return;
        }
        C10843i iVar = this.f42384f;
        if (iVar != null) {
            C10838h hVar2 = this.f42386h;
            String str2 = this.f42381c;
            hVar2.mo34528a(str2, iVar.mo34541k(str2), m54230g(), new C10866a(this));
        }
    }
}
