package p264io.flutter.plugins.googlemobileads;

import p179z3.C6340j;
import p264io.flutter.plugin.platform.C10731f;
import p325pc.C12167c;

/* renamed from: io.flutter.plugins.googlemobileads.q */
/* compiled from: FlutterBannerAd */
class C10867q extends C10826e implements C10836g {

    /* renamed from: b */
    private final C10813a f42388b;

    /* renamed from: c */
    private final String f42389c;

    /* renamed from: d */
    private final C10855m f42390d;

    /* renamed from: e */
    private final C10853l f42391e;

    /* renamed from: f */
    private final C10819c f42392f;

    /* renamed from: g */
    private C6340j f42393g;

    public C10867q(int i, C10813a aVar, String str, C10853l lVar, C10855m mVar, C10819c cVar) {
        super(i);
        C12167c.m58441a(aVar);
        C12167c.m58441a(str);
        C12167c.m58441a(lVar);
        C12167c.m58441a(mVar);
        this.f42388b = aVar;
        this.f42389c = str;
        this.f42391e = lVar;
        this.f42390d = mVar;
        this.f42392f = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo34477a() {
        C6340j jVar = this.f42393g;
        if (jVar != null) {
            jVar.mo21695a();
            this.f42393g = null;
        }
    }

    /* renamed from: b */
    public C10731f mo34478b() {
        C6340j jVar = this.f42393g;
        if (jVar == null) {
            return null;
        }
        return new C10818b0(jVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C10855m mo34599c() {
        C6340j jVar = this.f42393g;
        if (jVar == null || jVar.getAdSize() == null) {
            return null;
        }
        return new C10855m(this.f42393g.getAdSize());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo34600d() {
        C6340j b = this.f42392f.mo34475b();
        this.f42393g = b;
        b.setAdUnitId(this.f42389c);
        this.f42393g.setAdSize(this.f42390d.mo34585a());
        this.f42393g.setOnPaidEventListener(new C10815a0(this.f42388b, this));
        this.f42393g.setAdListener(new C10868r(this.f42276a, this.f42388b, this));
        this.f42393g.mo21696b(this.f42391e.mo34558b(this.f42389c));
    }

    public void onAdLoaded() {
        C6340j jVar = this.f42393g;
        if (jVar != null) {
            this.f42388b.mo34458m(this.f42276a, jVar.getResponseInfo());
        }
    }
}
