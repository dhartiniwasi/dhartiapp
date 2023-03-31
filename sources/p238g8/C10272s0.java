package p238g8;

import com.google.protobuf.C8153i;
import java.util.HashMap;
import java.util.Map;
import p008a8.C6480n;
import p211d8.C9888l;
import p247h8.C10432b;
import p320p7.C12130e;

/* renamed from: g8.s0 */
/* compiled from: TargetState */
final class C10272s0 {

    /* renamed from: a */
    private int f40824a = 0;

    /* renamed from: b */
    private final Map<C9888l, C6480n.C6481a> f40825b = new HashMap();

    /* renamed from: c */
    private boolean f40826c = true;

    /* renamed from: d */
    private C8153i f40827d = C8153i.f34908b;

    /* renamed from: e */
    private boolean f40828e = false;

    /* renamed from: g8.s0$a */
    /* compiled from: TargetState */
    static /* synthetic */ class C10273a {

        /* renamed from: a */
        static final /* synthetic */ int[] f40829a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                a8.n$a[] r0 = p008a8.C6480n.C6481a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f40829a = r0
                a8.n$a r1 = p008a8.C6480n.C6481a.ADDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f40829a     // Catch:{ NoSuchFieldError -> 0x001d }
                a8.n$a r1 = p008a8.C6480n.C6481a.MODIFIED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f40829a     // Catch:{ NoSuchFieldError -> 0x0028 }
                a8.n$a r1 = p008a8.C6480n.C6481a.REMOVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p238g8.C10272s0.C10273a.<clinit>():void");
        }
    }

    C10272s0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33039a(C9888l lVar, C6480n.C6481a aVar) {
        this.f40826c = true;
        this.f40825b.put(lVar, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo33040b() {
        this.f40826c = false;
        this.f40825b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo33041c() {
        return this.f40826c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo33042d() {
        return this.f40828e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo33043e() {
        return this.f40824a != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo33044f() {
        this.f40826c = true;
        this.f40828e = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo33045g() {
        this.f40824a++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo33046h() {
        this.f40824a--;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo33047i(C9888l lVar) {
        this.f40826c = true;
        this.f40825b.remove(lVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C10270r0 mo33048j() {
        C12130e<C9888l> j = C9888l.m50695j();
        C12130e<C9888l> j2 = C9888l.m50695j();
        C12130e<C9888l> j3 = C9888l.m50695j();
        C12130e<C9888l> eVar = j;
        C12130e<C9888l> eVar2 = j2;
        C12130e<C9888l> eVar3 = j3;
        for (Map.Entry next : this.f40825b.entrySet()) {
            C9888l lVar = (C9888l) next.getKey();
            C6480n.C6481a aVar = (C6480n.C6481a) next.getValue();
            int i = C10273a.f40829a[aVar.ordinal()];
            if (i == 1) {
                eVar = eVar.mo36638f(lVar);
            } else if (i == 2) {
                eVar2 = eVar2.mo36638f(lVar);
            } else if (i == 3) {
                eVar3 = eVar3.mo36638f(lVar);
            } else {
                throw C10432b.m52645a("Encountered invalid change type: %s", aVar);
            }
        }
        return new C10270r0(this.f40827d, this.f40828e, eVar, eVar2, eVar3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo33049k(C8153i iVar) {
        if (!iVar.isEmpty()) {
            this.f40826c = true;
            this.f40827d = iVar;
        }
    }
}
