package p264io.flutter.plugins.googlemobileads;

import android.util.Log;
import com.google.android.gms.ads.nativead.C2043a;
import com.google.android.gms.ads.nativead.NativeAdView;
import java.util.Map;
import p108o4.C5220b;
import p264io.flutter.plugin.platform.C10731f;
import p264io.flutter.plugins.googlemobileads.C10839h0;

/* renamed from: io.flutter.plugins.googlemobileads.w */
/* compiled from: FlutterNativeAd */
class C10874w extends C10826e {

    /* renamed from: b */
    private final C10813a f42404b;

    /* renamed from: c */
    private final String f42405c;

    /* renamed from: d */
    private final C10839h0.C10842c f42406d;

    /* renamed from: e */
    private final C10838h f42407e;

    /* renamed from: f */
    private C10853l f42408f;

    /* renamed from: g */
    private C10843i f42409g;

    /* renamed from: h */
    private Map<String, Object> f42410h;

    /* renamed from: i */
    private NativeAdView f42411i;

    /* renamed from: j */
    private final C10878z f42412j;

    /* renamed from: io.flutter.plugins.googlemobileads.w$a */
    /* compiled from: FlutterNativeAd */
    static class C10875a {

        /* renamed from: a */
        private C10813a f42413a;

        /* renamed from: b */
        private String f42414b;

        /* renamed from: c */
        private C10839h0.C10842c f42415c;

        /* renamed from: d */
        private C10853l f42416d;

        /* renamed from: e */
        private C10843i f42417e;

        /* renamed from: f */
        private Map<String, Object> f42418f;

        /* renamed from: g */
        private Integer f42419g;

        /* renamed from: h */
        private C10878z f42420h;

        /* renamed from: i */
        private C10838h f42421i;

        C10875a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C10874w mo34615a() {
            if (this.f42413a == null) {
                throw new IllegalStateException("AdInstanceManager cannot be null.");
            } else if (this.f42414b == null) {
                throw new IllegalStateException("AdUnitId cannot be null.");
            } else if (this.f42415c != null) {
                C10853l lVar = this.f42416d;
                if (lVar == null && this.f42417e == null) {
                    throw new IllegalStateException("adRequest or addManagerRequest must be non-null.");
                } else if (lVar == null) {
                    return new C10874w(this.f42419g.intValue(), this.f42413a, this.f42414b, this.f42415c, this.f42417e, this.f42421i, this.f42418f, this.f42420h);
                } else {
                    return new C10874w(this.f42419g.intValue(), this.f42413a, this.f42414b, this.f42415c, this.f42416d, this.f42421i, this.f42418f, this.f42420h);
                }
            } else {
                throw new IllegalStateException("NativeAdFactory cannot be null.");
            }
        }

        /* renamed from: b */
        public C10875a mo34616b(C10839h0.C10842c cVar) {
            this.f42415c = cVar;
            return this;
        }

        /* renamed from: c */
        public C10875a mo34617c(C10843i iVar) {
            this.f42417e = iVar;
            return this;
        }

        /* renamed from: d */
        public C10875a mo34618d(String str) {
            this.f42414b = str;
            return this;
        }

        /* renamed from: e */
        public C10875a mo34619e(Map<String, Object> map) {
            this.f42418f = map;
            return this;
        }

        /* renamed from: f */
        public C10875a mo34620f(C10838h hVar) {
            this.f42421i = hVar;
            return this;
        }

        /* renamed from: g */
        public C10875a mo34621g(int i) {
            this.f42419g = Integer.valueOf(i);
            return this;
        }

        /* renamed from: h */
        public C10875a mo34622h(C10813a aVar) {
            this.f42413a = aVar;
            return this;
        }

        /* renamed from: i */
        public C10875a mo34623i(C10878z zVar) {
            this.f42420h = zVar;
            return this;
        }

        /* renamed from: j */
        public C10875a mo34624j(C10853l lVar) {
            this.f42416d = lVar;
            return this;
        }
    }

    protected C10874w(int i, C10813a aVar, String str, C10839h0.C10842c cVar, C10853l lVar, C10838h hVar, Map<String, Object> map, C10878z zVar) {
        super(i);
        this.f42404b = aVar;
        this.f42405c = str;
        this.f42406d = cVar;
        this.f42408f = lVar;
        this.f42407e = hVar;
        this.f42410h = map;
        this.f42412j = zVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo34477a() {
        NativeAdView nativeAdView = this.f42411i;
        if (nativeAdView != null) {
            nativeAdView.mo7871a();
            this.f42411i = null;
        }
    }

    /* renamed from: b */
    public C10731f mo34478b() {
        NativeAdView nativeAdView = this.f42411i;
        if (nativeAdView == null) {
            return null;
        }
        return new C10818b0(nativeAdView);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo34613c() {
        C5220b bVar;
        C10877y yVar = new C10877y(this);
        C10876x xVar = new C10876x(this.f42276a, this.f42404b);
        C10878z zVar = this.f42412j;
        if (zVar == null) {
            bVar = new C5220b.C5221a().mo19209a();
        } else {
            bVar = zVar.mo34625a();
        }
        C5220b bVar2 = bVar;
        C10853l lVar = this.f42408f;
        if (lVar != null) {
            C10838h hVar = this.f42407e;
            String str = this.f42405c;
            hVar.mo34535h(str, yVar, bVar2, xVar, lVar.mo34558b(str));
            return;
        }
        C10843i iVar = this.f42409g;
        if (iVar != null) {
            this.f42407e.mo34530c(this.f42405c, yVar, bVar2, xVar, iVar.mo34541k(this.f42405c));
            return;
        }
        Log.e("FlutterNativeAd", "A null or invalid ad request was provided.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo34614d(C2043a aVar) {
        this.f42411i = this.f42406d.mo27481a(aVar, this.f42410h);
        aVar.mo7915k(new C10815a0(this.f42404b, this));
        this.f42404b.mo34458m(this.f42276a, aVar.mo7912h());
    }

    protected C10874w(int i, C10813a aVar, String str, C10839h0.C10842c cVar, C10843i iVar, C10838h hVar, Map<String, Object> map, C10878z zVar) {
        super(i);
        this.f42404b = aVar;
        this.f42405c = str;
        this.f42406d = cVar;
        this.f42409g = iVar;
        this.f42407e = hVar;
        this.f42410h = map;
        this.f42412j = zVar;
    }
}
