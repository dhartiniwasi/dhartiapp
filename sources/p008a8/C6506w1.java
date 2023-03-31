package p008a8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p008a8.C6501u0;
import p008a8.C6514y1;
import p211d8.C9885i;
import p211d8.C9888l;
import p211d8.C9890n;
import p238g8.C10270r0;
import p247h8.C10432b;
import p247h8.C10449g0;
import p320p7.C12126c;
import p320p7.C12130e;

/* renamed from: a8.w1 */
/* compiled from: View */
public class C6506w1 {

    /* renamed from: a */
    private final C6452b1 f30885a;

    /* renamed from: b */
    private C6514y1.C6515a f30886b = C6514y1.C6515a.NONE;

    /* renamed from: c */
    private boolean f30887c;

    /* renamed from: d */
    private C9890n f30888d;

    /* renamed from: e */
    private C12130e<C9888l> f30889e;

    /* renamed from: f */
    private C12130e<C9888l> f30890f;

    /* renamed from: g */
    private C12130e<C9888l> f30891g;

    /* renamed from: a8.w1$a */
    /* compiled from: View */
    static /* synthetic */ class C6507a {

        /* renamed from: a */
        static final /* synthetic */ int[] f30892a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                a8.n$a[] r0 = p008a8.C6480n.C6481a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30892a = r0
                a8.n$a r1 = p008a8.C6480n.C6481a.ADDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30892a     // Catch:{ NoSuchFieldError -> 0x001d }
                a8.n$a r1 = p008a8.C6480n.C6481a.MODIFIED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30892a     // Catch:{ NoSuchFieldError -> 0x0028 }
                a8.n$a r1 = p008a8.C6480n.C6481a.METADATA     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30892a     // Catch:{ NoSuchFieldError -> 0x0033 }
                a8.n$a r1 = p008a8.C6480n.C6481a.REMOVED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p008a8.C6506w1.C6507a.<clinit>():void");
        }
    }

    /* renamed from: a8.w1$b */
    /* compiled from: View */
    public static class C6508b {

        /* renamed from: a */
        final C9890n f30893a;

        /* renamed from: b */
        final C6482o f30894b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final boolean f30895c;

        /* renamed from: d */
        final C12130e<C9888l> f30896d;

        /* synthetic */ C6508b(C9890n nVar, C6482o oVar, C12130e eVar, boolean z, C6507a aVar) {
            this(nVar, oVar, eVar, z);
        }

        /* renamed from: b */
        public boolean mo22079b() {
            return this.f30895c;
        }

        private C6508b(C9890n nVar, C6482o oVar, C12130e<C9888l> eVar, boolean z) {
            this.f30893a = nVar;
            this.f30894b = oVar;
            this.f30896d = eVar;
            this.f30895c = z;
        }
    }

    public C6506w1(C6452b1 b1Var, C12130e<C9888l> eVar) {
        this.f30885a = b1Var;
        this.f30888d = C9890n.m50707f(b1Var.mo21874c());
        this.f30889e = eVar;
        this.f30890f = C9888l.m50695j();
        this.f30891g = C9888l.m50695j();
    }

    /* renamed from: e */
    private void m37943e(C10270r0 r0Var) {
        if (r0Var != null) {
            Iterator<C9888l> it = r0Var.mo33032b().iterator();
            while (it.hasNext()) {
                this.f30889e = this.f30889e.mo36638f(it.next());
            }
            Iterator<C9888l> it2 = r0Var.mo33033c().iterator();
            while (it2.hasNext()) {
                C9888l next = it2.next();
                C10432b.m52648d(this.f30889e.contains(next), "Modified document %s not found in view.", next);
            }
            Iterator<C9888l> it3 = r0Var.mo33034d().iterator();
            while (it3.hasNext()) {
                this.f30889e = this.f30889e.mo36644j(it3.next());
            }
            this.f30887c = r0Var.mo33037f();
        }
    }

    /* renamed from: f */
    private static int m37944f(C6480n nVar) {
        int i = C6507a.f30892a[nVar.mo22008c().ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (!(i == 2 || i == 3)) {
                if (i == 4) {
                    return 0;
                }
                throw new IllegalArgumentException("Unknown change type: " + nVar.mo22008c());
            }
        }
        return i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ int m37945k(C6480n nVar, C6480n nVar2) {
        int l = C10449g0.m52712l(m37944f(nVar), m37944f(nVar2));
        nVar.mo22008c().compareTo(nVar2.mo22008c());
        if (l != 0) {
            return l;
        }
        return this.f30885a.mo21874c().compare(nVar.mo22007b(), nVar2.mo22007b());
    }

    /* renamed from: l */
    private boolean m37946l(C9888l lVar) {
        C9885i i;
        if (!this.f30889e.contains(lVar) && (i = this.f30888d.mo32397i(lVar)) != null && !i.mo32373d()) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private boolean m37947m(C9885i iVar, C9885i iVar2) {
        return iVar.mo32373d() && iVar2.mo32372c() && !iVar2.mo32373d();
    }

    /* renamed from: n */
    private List<C6501u0> m37948n() {
        if (!this.f30887c) {
            return Collections.emptyList();
        }
        C12130e<C9888l> eVar = this.f30890f;
        this.f30890f = C9888l.m50695j();
        Iterator<C9885i> it = this.f30888d.iterator();
        while (it.hasNext()) {
            C9885i next = it.next();
            if (m37946l(next.getKey())) {
                this.f30890f = this.f30890f.mo36638f(next.getKey());
            }
        }
        ArrayList arrayList = new ArrayList(eVar.size() + this.f30890f.size());
        Iterator<C9888l> it2 = eVar.iterator();
        while (it2.hasNext()) {
            C9888l next2 = it2.next();
            if (!this.f30890f.contains(next2)) {
                arrayList.add(new C6501u0(C6501u0.C6502a.REMOVED, next2));
            }
        }
        Iterator<C9888l> it3 = this.f30890f.iterator();
        while (it3.hasNext()) {
            C9888l next3 = it3.next();
            if (!eVar.contains(next3)) {
                arrayList.add(new C6501u0(C6501u0.C6502a.ADDED, next3));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public C6512x1 mo22072b(C6508b bVar) {
        return mo22073c(bVar, (C10270r0) null);
    }

    /* renamed from: c */
    public C6512x1 mo22073c(C6508b bVar, C10270r0 r0Var) {
        boolean z;
        C6508b bVar2 = bVar;
        C10270r0 r0Var2 = r0Var;
        C10432b.m52648d(!bVar.f30895c, "Cannot apply changes that need a refill", new Object[0]);
        C9890n nVar = this.f30888d;
        this.f30888d = bVar2.f30893a;
        this.f30891g = bVar2.f30896d;
        List<C6480n> b = bVar2.f30894b.mo22013b();
        Collections.sort(b, new C0148v1(this));
        m37943e(r0Var2);
        List<C6501u0> n = m37948n();
        C6514y1.C6515a aVar = this.f30890f.size() == 0 && this.f30887c ? C6514y1.C6515a.SYNCED : C6514y1.C6515a.LOCAL;
        boolean z2 = aVar != this.f30886b;
        this.f30886b = aVar;
        C6514y1 y1Var = null;
        if (b.size() != 0 || z2) {
            boolean z3 = aVar == C6514y1.C6515a.LOCAL;
            if (r0Var2 != null && !r0Var.mo33035e().isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            y1Var = new C6514y1(this.f30885a, bVar2.f30893a, nVar, b, z3, bVar2.f30896d, z2, false, z);
        }
        return new C6512x1(y1Var, n);
    }

    /* renamed from: d */
    public C6512x1 mo22074d(C6516z0 z0Var) {
        if (!this.f30887c || z0Var != C6516z0.OFFLINE) {
            return new C6512x1((C6514y1) null, Collections.emptyList());
        }
        this.f30887c = false;
        return mo22072b(new C6508b(this.f30888d, new C6482o(), this.f30891g, false, (C6507a) null));
    }

    /* renamed from: g */
    public C6508b mo22075g(C12126c<C9888l, C9885i> cVar) {
        return mo22076h(cVar, (C6508b) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f4, code lost:
        if (r0.f30885a.mo21874c().compare(r6, r4) > 0) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0102, code lost:
        if (r0.f30885a.mo21874c().compare(r6, r7) < 0) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0131, code lost:
        if (r7 == null) goto L_0x0120;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x015f A[SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p008a8.C6506w1.C6508b mo22076h(p320p7.C12126c<p211d8.C9888l, p211d8.C9885i> r19, p008a8.C6506w1.C6508b r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            if (r1 == 0) goto L_0x0009
            a8.o r2 = r1.f30894b
            goto L_0x000e
        L_0x0009:
            a8.o r2 = new a8.o
            r2.<init>()
        L_0x000e:
            r5 = r2
            if (r1 == 0) goto L_0x0014
            d8.n r2 = r1.f30893a
            goto L_0x0016
        L_0x0014:
            d8.n r2 = r0.f30888d
        L_0x0016:
            if (r1 == 0) goto L_0x001b
            p7.e<d8.l> r3 = r1.f30896d
            goto L_0x001d
        L_0x001b:
            p7.e<d8.l> r3 = r0.f30891g
        L_0x001d:
            a8.b1 r4 = r0.f30885a
            a8.b1$a r4 = r4.mo21885l()
            a8.b1$a r6 = p008a8.C6452b1.C6453a.LIMIT_TO_FIRST
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x003f
            int r4 = r2.size()
            long r7 = (long) r4
            a8.b1 r4 = r0.f30885a
            long r9 = r4.mo21884k()
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x003f
            d8.i r4 = r2.mo32401k()
            goto L_0x0040
        L_0x003f:
            r4 = 0
        L_0x0040:
            a8.b1 r7 = r0.f30885a
            a8.b1$a r7 = r7.mo21885l()
            a8.b1$a r8 = p008a8.C6452b1.C6453a.LIMIT_TO_LAST
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0062
            int r7 = r2.size()
            long r7 = (long) r7
            a8.b1 r9 = r0.f30885a
            long r9 = r9.mo21884k()
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0062
            d8.i r7 = r2.mo32400j()
            goto L_0x0063
        L_0x0062:
            r7 = 0
        L_0x0063:
            java.util.Iterator r8 = r19.iterator()
            r11 = r2
            r10 = 0
        L_0x0069:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x0163
            java.lang.Object r12 = r8.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r14 = r12.getKey()
            d8.l r14 = (p211d8.C9888l) r14
            d8.i r15 = r2.mo32397i(r14)
            a8.b1 r6 = r0.f30885a
            java.lang.Object r16 = r12.getValue()
            r13 = r16
            d8.i r13 = (p211d8.C9885i) r13
            boolean r6 = r6.mo21896v(r13)
            if (r6 == 0) goto L_0x0096
            java.lang.Object r6 = r12.getValue()
            d8.i r6 = (p211d8.C9885i) r6
            goto L_0x0097
        L_0x0096:
            r6 = 0
        L_0x0097:
            if (r15 == 0) goto L_0x00a7
            p7.e<d8.l> r12 = r0.f30891g
            d8.l r13 = r15.getKey()
            boolean r12 = r12.contains(r13)
            if (r12 == 0) goto L_0x00a7
            r12 = 1
            goto L_0x00a8
        L_0x00a7:
            r12 = 0
        L_0x00a8:
            if (r6 == 0) goto L_0x00c4
            boolean r13 = r6.mo32373d()
            if (r13 != 0) goto L_0x00c2
            p7.e<d8.l> r13 = r0.f30891g
            d8.l r9 = r6.getKey()
            boolean r9 = r13.contains(r9)
            if (r9 == 0) goto L_0x00c4
            boolean r9 = r6.mo32372c()
            if (r9 == 0) goto L_0x00c4
        L_0x00c2:
            r9 = 1
            goto L_0x00c5
        L_0x00c4:
            r9 = 0
        L_0x00c5:
            if (r15 == 0) goto L_0x0111
            if (r6 == 0) goto L_0x0111
            d8.t r13 = r15.getData()
            r17 = r2
            d8.t r2 = r6.getData()
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x0105
            boolean r2 = r0.m37947m(r15, r6)
            if (r2 != 0) goto L_0x0135
            a8.n$a r2 = p008a8.C6480n.C6481a.MODIFIED
            a8.n r2 = p008a8.C6480n.m37801a(r2, r6)
            r5.mo22012a(r2)
            if (r4 == 0) goto L_0x00f6
            a8.b1 r2 = r0.f30885a
            java.util.Comparator r2 = r2.mo21874c()
            int r2 = r2.compare(r6, r4)
            if (r2 > 0) goto L_0x0133
        L_0x00f6:
            if (r7 == 0) goto L_0x0120
            a8.b1 r2 = r0.f30885a
            java.util.Comparator r2 = r2.mo21874c()
            int r2 = r2.compare(r6, r7)
            if (r2 >= 0) goto L_0x0120
            goto L_0x0133
        L_0x0105:
            if (r12 == r9) goto L_0x0135
            a8.n$a r2 = p008a8.C6480n.C6481a.METADATA
            a8.n r2 = p008a8.C6480n.m37801a(r2, r6)
            r5.mo22012a(r2)
            goto L_0x0120
        L_0x0111:
            r17 = r2
            if (r15 != 0) goto L_0x0122
            if (r6 == 0) goto L_0x0122
            a8.n$a r2 = p008a8.C6480n.C6481a.ADDED
            a8.n r2 = p008a8.C6480n.m37801a(r2, r6)
            r5.mo22012a(r2)
        L_0x0120:
            r13 = 1
            goto L_0x0136
        L_0x0122:
            if (r15 == 0) goto L_0x0135
            if (r6 != 0) goto L_0x0135
            a8.n$a r2 = p008a8.C6480n.C6481a.REMOVED
            a8.n r2 = p008a8.C6480n.m37801a(r2, r15)
            r5.mo22012a(r2)
            if (r4 != 0) goto L_0x0133
            if (r7 == 0) goto L_0x0120
        L_0x0133:
            r10 = 1
            goto L_0x0120
        L_0x0135:
            r13 = 0
        L_0x0136:
            if (r13 == 0) goto L_0x015f
            if (r6 == 0) goto L_0x0156
            d8.n r11 = r11.mo32394c(r6)
            boolean r2 = r6.mo32373d()
            if (r2 == 0) goto L_0x014d
            d8.l r2 = r6.getKey()
            p7.e r2 = r3.mo36638f(r2)
            goto L_0x015e
        L_0x014d:
            d8.l r2 = r6.getKey()
            p7.e r2 = r3.mo36644j(r2)
            goto L_0x015e
        L_0x0156:
            d8.n r11 = r11.mo32403q(r14)
            p7.e r2 = r3.mo36644j(r14)
        L_0x015e:
            r3 = r2
        L_0x015f:
            r2 = r17
            goto L_0x0069
        L_0x0163:
            a8.b1 r2 = r0.f30885a
            boolean r2 = r2.mo21889p()
            if (r2 == 0) goto L_0x01b0
            int r2 = r11.size()
            long r6 = (long) r2
            a8.b1 r2 = r0.f30885a
            long r8 = r2.mo21884k()
        L_0x0176:
            long r6 = r6 - r8
            r8 = 0
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x01b0
            a8.b1 r2 = r0.f30885a
            a8.b1$a r2 = r2.mo21885l()
            a8.b1$a r4 = p008a8.C6452b1.C6453a.LIMIT_TO_FIRST
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0190
            d8.i r2 = r11.mo32401k()
            goto L_0x0194
        L_0x0190:
            d8.i r2 = r11.mo32400j()
        L_0x0194:
            d8.l r4 = r2.getKey()
            d8.n r11 = r11.mo32403q(r4)
            d8.l r4 = r2.getKey()
            p7.e r3 = r3.mo36644j(r4)
            a8.n$a r4 = p008a8.C6480n.C6481a.REMOVED
            a8.n r2 = p008a8.C6480n.m37801a(r4, r2)
            r5.mo22012a(r2)
            r8 = 1
            goto L_0x0176
        L_0x01b0:
            r6 = r3
            r4 = r11
            if (r10 == 0) goto L_0x01ba
            if (r1 != 0) goto L_0x01b7
            goto L_0x01ba
        L_0x01b7:
            r1 = 0
            r13 = 0
            goto L_0x01bc
        L_0x01ba:
            r1 = 0
            r13 = 1
        L_0x01bc:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "View was refilled using docs that themselves needed refilling."
            p247h8.C10432b.m52648d(r13, r2, r1)
            a8.w1$b r1 = new a8.w1$b
            r8 = 0
            r3 = r1
            r7 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p008a8.C6506w1.mo22076h(p7.c, a8.w1$b):a8.w1$b");
    }

    /* renamed from: i */
    public C6514y1.C6515a mo22077i() {
        return this.f30886b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C12130e<C9888l> mo22078j() {
        return this.f30889e;
    }
}
