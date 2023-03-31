package p025c8;

import java.util.Map;
import p211d8.C9885i;
import p211d8.C9886j;
import p211d8.C9888l;
import p320p7.C12126c;

/* renamed from: c8.m */
/* compiled from: LocalDocumentsResult */
public final class C6808m {

    /* renamed from: a */
    private final int f31388a;

    /* renamed from: b */
    private final C12126c<C9888l, C9885i> f31389b;

    C6808m(int i, C12126c<C9888l, C9885i> cVar) {
        this.f31388a = i;
        this.f31389b = cVar;
    }

    /* renamed from: a */
    public static C6808m m39042a(int i, Map<C9888l, C6776b1> map) {
        C12126c<C9888l, C9885i> a = C9886j.m50690a();
        for (Map.Entry next : map.entrySet()) {
            a = a.mo36618k((C9888l) next.getKey(), ((C6776b1) next.getValue()).mo22724a());
        }
        return new C6808m(i, a);
    }

    /* renamed from: b */
    public int mo22852b() {
        return this.f31388a;
    }

    /* renamed from: c */
    public C12126c<C9888l, C9885i> mo22853c() {
        return this.f31389b;
    }
}
