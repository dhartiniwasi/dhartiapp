package p238g8;

import java.util.Map;
import java.util.Set;
import p211d8.C9888l;
import p211d8.C9899s;
import p211d8.C9905w;

/* renamed from: g8.j0 */
/* compiled from: RemoteEvent */
public final class C10247j0 {

    /* renamed from: a */
    private final C9905w f40742a;

    /* renamed from: b */
    private final Map<Integer, C10270r0> f40743b;

    /* renamed from: c */
    private final Set<Integer> f40744c;

    /* renamed from: d */
    private final Map<C9888l, C9899s> f40745d;

    /* renamed from: e */
    private final Set<C9888l> f40746e;

    public C10247j0(C9905w wVar, Map<Integer, C10270r0> map, Set<Integer> set, Map<C9888l, C9899s> map2, Set<C9888l> set2) {
        this.f40742a = wVar;
        this.f40743b = map;
        this.f40744c = set;
        this.f40745d = map2;
        this.f40746e = set2;
    }

    /* renamed from: a */
    public Map<C9888l, C9899s> mo32964a() {
        return this.f40745d;
    }

    /* renamed from: b */
    public Set<C9888l> mo32965b() {
        return this.f40746e;
    }

    /* renamed from: c */
    public C9905w mo32966c() {
        return this.f40742a;
    }

    /* renamed from: d */
    public Map<Integer, C10270r0> mo32967d() {
        return this.f40743b;
    }

    /* renamed from: e */
    public Set<Integer> mo32968e() {
        return this.f40744c;
    }

    public String toString() {
        return "RemoteEvent{snapshotVersion=" + this.f40742a + ", targetChanges=" + this.f40743b + ", targetMismatches=" + this.f40744c + ", documentUpdates=" + this.f40745d + ", resolvedLimboDocuments=" + this.f40746e + '}';
    }
}
