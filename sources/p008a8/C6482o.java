package p008a8;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import p008a8.C6480n;
import p211d8.C9888l;
import p247h8.C10432b;

/* renamed from: a8.o */
/* compiled from: DocumentViewChangeSet */
public class C6482o {

    /* renamed from: a */
    private final TreeMap<C9888l, C6480n> f30808a = new TreeMap<>();

    /* renamed from: a */
    public void mo22012a(C6480n nVar) {
        C9888l key = nVar.mo22007b().getKey();
        C6480n nVar2 = this.f30808a.get(key);
        if (nVar2 == null) {
            this.f30808a.put(key, nVar);
            return;
        }
        C6480n.C6481a c = nVar2.mo22008c();
        C6480n.C6481a c2 = nVar.mo22008c();
        C6480n.C6481a aVar = C6480n.C6481a.ADDED;
        if (c2 != aVar && c == C6480n.C6481a.METADATA) {
            this.f30808a.put(key, nVar);
        } else if (c2 != C6480n.C6481a.METADATA || c == C6480n.C6481a.REMOVED) {
            C6480n.C6481a aVar2 = C6480n.C6481a.MODIFIED;
            if (c2 == aVar2 && c == aVar2) {
                this.f30808a.put(key, C6480n.m37801a(aVar2, nVar.mo22007b()));
            } else if (c2 == aVar2 && c == aVar) {
                this.f30808a.put(key, C6480n.m37801a(aVar, nVar.mo22007b()));
            } else {
                C6480n.C6481a aVar3 = C6480n.C6481a.REMOVED;
                if (c2 == aVar3 && c == aVar) {
                    this.f30808a.remove(key);
                } else if (c2 == aVar3 && c == aVar2) {
                    this.f30808a.put(key, C6480n.m37801a(aVar3, nVar2.mo22007b()));
                } else if (c2 == aVar && c == aVar3) {
                    this.f30808a.put(key, C6480n.m37801a(aVar2, nVar.mo22007b()));
                } else {
                    throw C10432b.m52645a("Unsupported combination of changes %s after %s", c2, c);
                }
            }
        } else {
            this.f30808a.put(key, C6480n.m37801a(c, nVar.mo22007b()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public List<C6480n> mo22013b() {
        return new ArrayList(this.f30808a.values());
    }
}
