package p220e8;

import com.google.protobuf.C8153i;
import java.util.List;
import p211d8.C9886j;
import p211d8.C9888l;
import p211d8.C9905w;
import p247h8.C10432b;
import p320p7.C12126c;

/* renamed from: e8.h */
/* compiled from: MutationBatchResult */
public final class C10011h {

    /* renamed from: a */
    private final C10010g f39969a;

    /* renamed from: b */
    private final C9905w f39970b;

    /* renamed from: c */
    private final List<C10012i> f39971c;

    /* renamed from: d */
    private final C8153i f39972d;

    /* renamed from: e */
    private final C12126c<C9888l, C9905w> f39973e;

    private C10011h(C10010g gVar, C9905w wVar, List<C10012i> list, C8153i iVar, C12126c<C9888l, C9905w> cVar) {
        this.f39969a = gVar;
        this.f39970b = wVar;
        this.f39971c = list;
        this.f39972d = iVar;
        this.f39973e = cVar;
    }

    /* renamed from: a */
    public static C10011h m51123a(C10010g gVar, C9905w wVar, List<C10012i> list, C8153i iVar) {
        C10432b.m52648d(gVar.mo32614h().size() == list.size(), "Mutations sent %d must equal results received %d", Integer.valueOf(gVar.mo32614h().size()), Integer.valueOf(list.size()));
        C12126c<C9888l, C9905w> c = C9886j.m50692c();
        List<C10009f> h = gVar.mo32614h();
        C12126c<C9888l, C9905w> cVar = c;
        for (int i = 0; i < h.size(); i++) {
            cVar = cVar.mo36618k(h.get(i).mo32598g(), list.get(i).mo32623b());
        }
        return new C10011h(gVar, wVar, list, iVar, cVar);
    }

    /* renamed from: b */
    public C10010g mo32617b() {
        return this.f39969a;
    }

    /* renamed from: c */
    public C9905w mo32618c() {
        return this.f39970b;
    }

    /* renamed from: d */
    public C12126c<C9888l, C9905w> mo32619d() {
        return this.f39973e;
    }

    /* renamed from: e */
    public List<C10012i> mo32620e() {
        return this.f39971c;
    }

    /* renamed from: f */
    public C8153i mo32621f() {
        return this.f39972d;
    }
}
