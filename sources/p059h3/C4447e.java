package p059h3;

import java.util.List;
import p005a3.C0092b;
import p005a3.C0093c;
import p155v3.C5823j0;

/* renamed from: h3.e */
/* compiled from: FilteringHlsPlaylistParserFactory */
public final class C4447e implements C4463k {

    /* renamed from: a */
    private final C4463k f24692a;

    /* renamed from: b */
    private final List<C0093c> f24693b;

    public C4447e(C4463k kVar, List<C0093c> list) {
        this.f24692a = kVar;
        this.f24693b = list;
    }

    /* renamed from: a */
    public C5823j0.C5824a<C4459i> mo17970a(C4456h hVar, C4449g gVar) {
        return new C0092b(this.f24692a.mo17970a(hVar, gVar), this.f24693b);
    }

    /* renamed from: b */
    public C5823j0.C5824a<C4459i> mo17971b() {
        return new C0092b(this.f24692a.mo17971b(), this.f24693b);
    }
}
