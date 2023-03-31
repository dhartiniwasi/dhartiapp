package p413z7;

import com.google.firebase.firestore.C7913h0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p211d8.C9885i;
import p211d8.C9886j;
import p211d8.C9888l;
import p211d8.C9899s;
import p247h8.C10472x;
import p320p7.C12126c;
import p320p7.C12130e;

/* renamed from: z7.d */
/* compiled from: BundleLoader */
public class C13467d {

    /* renamed from: a */
    private final C13464a f47811a;

    /* renamed from: b */
    private final C13468e f47812b;

    /* renamed from: c */
    private final List<C13473j> f47813c = new ArrayList();

    /* renamed from: d */
    private final Map<C9888l, C13471h> f47814d = new HashMap();

    /* renamed from: e */
    private C12126c<C9888l, C9899s> f47815e = C9886j.m50691b();

    /* renamed from: f */
    private long f47816f;

    /* renamed from: g */
    private C13471h f47817g;

    public C13467d(C13464a aVar, C13468e eVar) {
        this.f47811a = aVar;
        this.f47812b = eVar;
    }

    /* renamed from: c */
    private Map<String, C12130e<C9888l>> m62499c() {
        HashMap hashMap = new HashMap();
        for (C13473j b : this.f47813c) {
            hashMap.put(b.mo38590b(), C9888l.m50695j());
        }
        for (C13471h next : this.f47814d.values()) {
            for (String next2 : next.mo38581c()) {
                hashMap.put(next2, ((C12130e) hashMap.get(next2)).mo36638f(next.mo38580b()));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public C7913h0 mo38562a(C13466c cVar, long j) {
        C10472x.m52784a(!(cVar instanceof C13468e), "Unexpected bundle metadata element.", new Object[0]);
        int size = this.f47815e.size();
        if (cVar instanceof C13473j) {
            this.f47813c.add((C13473j) cVar);
        } else if (cVar instanceof C13471h) {
            C13471h hVar = (C13471h) cVar;
            this.f47814d.put(hVar.mo38580b(), hVar);
            this.f47817g = hVar;
            if (!hVar.mo38579a()) {
                this.f47815e = this.f47815e.mo36618k(hVar.mo38580b(), C9899s.m50751q(hVar.mo38580b(), hVar.mo38582d()).mo32425u(hVar.mo38582d()));
                this.f47817g = null;
            }
        } else if (cVar instanceof C13465b) {
            C13465b bVar = (C13465b) cVar;
            if (this.f47817g == null || !bVar.mo38559b().equals(this.f47817g.mo38580b())) {
                throw new IllegalArgumentException("The document being added does not match the stored metadata.");
            }
            this.f47815e = this.f47815e.mo36618k(bVar.mo38559b(), bVar.mo38558a().mo32425u(this.f47817g.mo38582d()));
            this.f47817g = null;
        }
        this.f47816f += j;
        if (size != this.f47815e.size()) {
            return new C7913h0(this.f47815e.size(), this.f47812b.mo38568e(), this.f47816f, this.f47812b.mo38567d(), (Exception) null, C7913h0.C7914a.RUNNING);
        }
        return null;
    }

    /* renamed from: b */
    public C12126c<C9888l, C9885i> mo38563b() {
        C10472x.m52784a(this.f47817g == null, "Bundled documents end with a document metadata element instead of a document.", new Object[0]);
        C10472x.m52784a(this.f47812b.mo38564a() != null, "Bundle ID must be set", new Object[0]);
        C10472x.m52784a(this.f47815e.size() == this.f47812b.mo38568e(), "Expected %s documents, but loaded %s.", Integer.valueOf(this.f47812b.mo38568e()), Integer.valueOf(this.f47815e.size()));
        C12126c<C9888l, C9885i> a = this.f47811a.mo22831a(this.f47815e, this.f47812b.mo38564a());
        Map<String, C12130e<C9888l>> c = m62499c();
        for (C13473j next : this.f47813c) {
            this.f47811a.mo22832b(next, c.get(next.mo38590b()));
        }
        this.f47811a.mo22833c(this.f47812b);
        return a;
    }
}
