package p025c8;

import java.util.Comparator;
import p211d8.C9888l;
import p247h8.C10449g0;

/* renamed from: c8.e */
/* compiled from: DocumentReference */
class C6786e {

    /* renamed from: c */
    static final Comparator<C6786e> f31325c = C1889d.f5528a;

    /* renamed from: d */
    static final Comparator<C6786e> f31326d = C1885c.f5516a;

    /* renamed from: a */
    private final C9888l f31327a;

    /* renamed from: b */
    private final int f31328b;

    public C6786e(C9888l lVar, int i) {
        this.f31327a = lVar;
        this.f31328b = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ int m38846e(C6786e eVar, C6786e eVar2) {
        int b = eVar.f31327a.compareTo(eVar2.f31327a);
        if (b != 0) {
            return b;
        }
        return C10449g0.m52712l(eVar.f31328b, eVar2.f31328b);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ int m38847f(C6786e eVar, C6786e eVar2) {
        int l = C10449g0.m52712l(eVar.f31328b, eVar2.f31328b);
        if (l != 0) {
            return l;
        }
        return eVar.f31327a.compareTo(eVar2.f31327a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo22779c() {
        return this.f31328b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C9888l mo22780d() {
        return this.f31327a;
    }
}
