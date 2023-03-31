package p025c8;

import java.util.ArrayList;
import p008a8.C6480n;
import p008a8.C6514y1;
import p211d8.C9888l;
import p320p7.C12130e;

/* renamed from: c8.j0 */
/* compiled from: LocalViewChanges */
public final class C6800j0 {

    /* renamed from: a */
    private final int f31367a;

    /* renamed from: b */
    private final boolean f31368b;

    /* renamed from: c */
    private final C12130e<C9888l> f31369c;

    /* renamed from: d */
    private final C12130e<C9888l> f31370d;

    /* renamed from: c8.j0$a */
    /* compiled from: LocalViewChanges */
    static /* synthetic */ class C6801a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31371a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                a8.n$a[] r0 = p008a8.C6480n.C6481a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31371a = r0
                a8.n$a r1 = p008a8.C6480n.C6481a.ADDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31371a     // Catch:{ NoSuchFieldError -> 0x001d }
                a8.n$a r1 = p008a8.C6480n.C6481a.REMOVED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p025c8.C6800j0.C6801a.<clinit>():void");
        }
    }

    public C6800j0(int i, boolean z, C12130e<C9888l> eVar, C12130e<C9888l> eVar2) {
        this.f31367a = i;
        this.f31368b = z;
        this.f31369c = eVar;
        this.f31370d = eVar2;
    }

    /* renamed from: a */
    public static C6800j0 m38998a(int i, C6514y1 y1Var) {
        C12130e eVar = new C12130e(new ArrayList(), C9888l.m50693a());
        C12130e eVar2 = new C12130e(new ArrayList(), C9888l.m50693a());
        for (C6480n next : y1Var.mo22085d()) {
            int i2 = C6801a.f31371a[next.mo22008c().ordinal()];
            if (i2 == 1) {
                eVar = eVar.mo36638f(next.mo22007b().getKey());
            } else if (i2 == 2) {
                eVar2 = eVar2.mo36638f(next.mo22007b().getKey());
            }
        }
        return new C6800j0(i, y1Var.mo22094k(), eVar, eVar2);
    }

    /* renamed from: b */
    public C12130e<C9888l> mo22846b() {
        return this.f31369c;
    }

    /* renamed from: c */
    public C12130e<C9888l> mo22847c() {
        return this.f31370d;
    }

    /* renamed from: d */
    public int mo22848d() {
        return this.f31367a;
    }

    /* renamed from: e */
    public boolean mo22849e() {
        return this.f31368b;
    }
}
