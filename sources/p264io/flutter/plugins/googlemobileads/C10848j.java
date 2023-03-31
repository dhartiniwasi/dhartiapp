package p264io.flutter.plugins.googlemobileads;

import android.view.ViewGroup;
import java.util.List;
import p006a4.C0097b;
import p006a4.C0100e;
import p179z3.C6337h;
import p264io.flutter.plugin.platform.C10731f;
import p325pc.C12167c;

/* renamed from: io.flutter.plugins.googlemobileads.j */
/* compiled from: FlutterAdManagerBannerAd */
class C10848j extends C10826e implements C10836g {

    /* renamed from: b */
    protected final C10813a f42333b;

    /* renamed from: c */
    private final String f42334c;

    /* renamed from: d */
    private final List<C10855m> f42335d;

    /* renamed from: e */
    private final C10843i f42336e;

    /* renamed from: f */
    private final C10819c f42337f;

    /* renamed from: g */
    protected C0097b f42338g;

    /* renamed from: io.flutter.plugins.googlemobileads.j$a */
    /* compiled from: FlutterAdManagerBannerAd */
    class C10849a implements C0100e {
        C10849a() {
        }

        /* renamed from: c */
        public void mo248c(String str, String str2) {
            C10848j jVar = C10848j.this;
            jVar.f42333b.mo34462q(jVar.f42276a, str, str2);
        }
    }

    public C10848j(int i, C10813a aVar, String str, List<C10855m> list, C10843i iVar, C10819c cVar) {
        super(i);
        C12167c.m58441a(aVar);
        C12167c.m58441a(str);
        C12167c.m58441a(list);
        C12167c.m58441a(iVar);
        this.f42333b = aVar;
        this.f42334c = str;
        this.f42335d = list;
        this.f42336e = iVar;
        this.f42337f = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo34477a() {
        C0097b bVar = this.f42338g;
        if (bVar != null) {
            bVar.mo21695a();
            this.f42338g = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C10731f mo34478b() {
        C0097b bVar = this.f42338g;
        if (bVar == null) {
            return null;
        }
        return new C10818b0(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C10855m mo34550c() {
        C0097b bVar = this.f42338g;
        if (bVar == null || bVar.getAdSize() == null) {
            return null;
        }
        return new C10855m(this.f42338g.getAdSize());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo34551d() {
        C0097b a = this.f42337f.mo34474a();
        this.f42338g = a;
        if (this instanceof C10821d) {
            a.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
        this.f42338g.setAdUnitId(this.f42334c);
        this.f42338g.setAppEventListener(new C10849a());
        C6337h[] hVarArr = new C6337h[this.f42335d.size()];
        for (int i = 0; i < this.f42335d.size(); i++) {
            hVarArr[i] = this.f42335d.get(i).mo34585a();
        }
        this.f42338g.setAdSizes(hVarArr);
        this.f42338g.setAdListener(new C10868r(this.f42276a, this.f42333b, this));
        this.f42338g.mo237e(this.f42336e.mo34541k(this.f42334c));
    }

    public void onAdLoaded() {
        C0097b bVar = this.f42338g;
        if (bVar != null) {
            this.f42333b.mo34458m(this.f42276a, bVar.getResponseInfo());
        }
    }
}
