package p008a8;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p008a8.C6450a1;
import p008a8.C6489q;
import p211d8.C9888l;
import p211d8.C9893q;
import p211d8.C9898r;
import p211d8.C9903u;
import p405y8.C13088b0;

/* renamed from: a8.g1 */
/* compiled from: Target */
public final class C6469g1 {

    /* renamed from: a */
    private String f30752a;

    /* renamed from: b */
    private final List<C6450a1> f30753b;

    /* renamed from: c */
    private final List<C6494r> f30754c;

    /* renamed from: d */
    private final C9903u f30755d;

    /* renamed from: e */
    private final String f30756e;

    /* renamed from: f */
    private final long f30757f;

    /* renamed from: g */
    private final C6473i f30758g;

    /* renamed from: h */
    private final C6473i f30759h;

    /* renamed from: a8.g1$a */
    /* compiled from: Target */
    static /* synthetic */ class C6470a {

        /* renamed from: a */
        static final /* synthetic */ int[] f30760a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                a8.q$b[] r0 = p008a8.C6489q.C6491b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30760a = r0
                a8.q$b r1 = p008a8.C6489q.C6491b.ARRAY_CONTAINS_ANY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30760a     // Catch:{ NoSuchFieldError -> 0x001d }
                a8.q$b r1 = p008a8.C6489q.C6491b.ARRAY_CONTAINS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30760a     // Catch:{ NoSuchFieldError -> 0x0028 }
                a8.q$b r1 = p008a8.C6489q.C6491b.EQUAL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30760a     // Catch:{ NoSuchFieldError -> 0x0033 }
                a8.q$b r1 = p008a8.C6489q.C6491b.IN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f30760a     // Catch:{ NoSuchFieldError -> 0x003e }
                a8.q$b r1 = p008a8.C6489q.C6491b.NOT_IN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f30760a     // Catch:{ NoSuchFieldError -> 0x0049 }
                a8.q$b r1 = p008a8.C6489q.C6491b.NOT_EQUAL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f30760a     // Catch:{ NoSuchFieldError -> 0x0054 }
                a8.q$b r1 = p008a8.C6489q.C6491b.LESS_THAN     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f30760a     // Catch:{ NoSuchFieldError -> 0x0060 }
                a8.q$b r1 = p008a8.C6489q.C6491b.LESS_THAN_OR_EQUAL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f30760a     // Catch:{ NoSuchFieldError -> 0x006c }
                a8.q$b r1 = p008a8.C6489q.C6491b.GREATER_THAN_OR_EQUAL     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f30760a     // Catch:{ NoSuchFieldError -> 0x0078 }
                a8.q$b r1 = p008a8.C6489q.C6491b.GREATER_THAN     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p008a8.C6469g1.C6470a.<clinit>():void");
        }
    }

    public C6469g1(C9903u uVar, String str, List<C6494r> list, List<C6450a1> list2, long j, C6473i iVar, C6473i iVar2) {
        this.f30755d = uVar;
        this.f30756e = str;
        this.f30753b = list2;
        this.f30754c = list;
        this.f30757f = j;
        this.f30758g = iVar;
        this.f30759h = iVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [int] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.util.Pair<p405y8.C13088b0, java.lang.Boolean> m37710b(p211d8.C9893q.C9896c r10, p008a8.C6473i r11) {
        /*
            r9 = this;
            y8.b0 r0 = p211d8.C9907y.f39759c
            d8.r r1 = r10.mo32341c()
            java.util.List r1 = r9.m37712g(r1)
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
            r3 = 1
        L_0x0010:
            boolean r4 = r1.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x0050
            java.lang.Object r4 = r1.next()
            a8.q r4 = (p008a8.C6489q) r4
            y8.b0 r6 = p211d8.C9907y.f39759c
            int[] r7 = p008a8.C6469g1.C6470a.f30760a
            a8.q$b r8 = r4.mo22038h()
            int r8 = r8.ordinal()
            r7 = r7[r8]
            switch(r7) {
                case 3: goto L_0x0042;
                case 4: goto L_0x0042;
                case 5: goto L_0x002e;
                case 6: goto L_0x002e;
                case 7: goto L_0x0035;
                case 8: goto L_0x0035;
                case 9: goto L_0x0042;
                case 10: goto L_0x0030;
                default: goto L_0x002e;
            }
        L_0x002e:
            r5 = 1
            goto L_0x0047
        L_0x0030:
            y8.b0 r6 = r4.mo22040i()
            goto L_0x0047
        L_0x0035:
            y8.b0 r4 = r4.mo22040i()
            y8.b0$c r4 = r4.mo38122x0()
            y8.b0 r6 = p211d8.C9907y.m50823r(r4)
            goto L_0x002e
        L_0x0042:
            y8.b0 r6 = r4.mo22040i()
            goto L_0x002e
        L_0x0047:
            int r4 = p211d8.C9907y.m50800C(r0, r3, r6, r5)
            if (r4 >= 0) goto L_0x0010
            r3 = r5
            r0 = r6
            goto L_0x0010
        L_0x0050:
            if (r11 == 0) goto L_0x008d
        L_0x0052:
            java.util.List<a8.a1> r1 = r9.f30753b
            int r1 = r1.size()
            if (r5 >= r1) goto L_0x008d
            java.util.List<a8.a1> r1 = r9.f30753b
            java.lang.Object r1 = r1.get(r5)
            a8.a1 r1 = (p008a8.C6450a1) r1
            d8.r r1 = r1.mo21865c()
            d8.r r2 = r10.mo32341c()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x008a
            java.util.List r10 = r11.mo21954b()
            java.lang.Object r10 = r10.get(r5)
            y8.b0 r10 = (p405y8.C13088b0) r10
            boolean r1 = r11.mo21955c()
            int r1 = p211d8.C9907y.m50800C(r0, r3, r10, r1)
            if (r1 >= 0) goto L_0x008d
            boolean r3 = r11.mo21955c()
            r0 = r10
            goto L_0x008d
        L_0x008a:
            int r5 = r5 + 1
            goto L_0x0052
        L_0x008d:
            android.util.Pair r10 = new android.util.Pair
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            r10.<init>(r0, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p008a8.C6469g1.m37710b(d8.q$c, a8.i):android.util.Pair");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [int] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.util.Pair<p405y8.C13088b0, java.lang.Boolean> m37711e(p211d8.C9893q.C9896c r10, p008a8.C6473i r11) {
        /*
            r9 = this;
            y8.b0 r0 = p211d8.C9907y.f39761e
            d8.r r1 = r10.mo32341c()
            java.util.List r1 = r9.m37712g(r1)
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
            r3 = 1
        L_0x0010:
            boolean r4 = r1.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x0050
            java.lang.Object r4 = r1.next()
            a8.q r4 = (p008a8.C6489q) r4
            y8.b0 r6 = p211d8.C9907y.f39761e
            int[] r7 = p008a8.C6469g1.C6470a.f30760a
            a8.q$b r8 = r4.mo22038h()
            int r8 = r8.ordinal()
            r7 = r7[r8]
            switch(r7) {
                case 3: goto L_0x0042;
                case 4: goto L_0x0042;
                case 5: goto L_0x002e;
                case 6: goto L_0x002e;
                case 7: goto L_0x003d;
                case 8: goto L_0x0042;
                case 9: goto L_0x0030;
                case 10: goto L_0x0030;
                default: goto L_0x002e;
            }
        L_0x002e:
            r5 = 1
            goto L_0x0047
        L_0x0030:
            y8.b0 r4 = r4.mo22040i()
            y8.b0$c r4 = r4.mo38122x0()
            y8.b0 r6 = p211d8.C9907y.m50824s(r4)
            goto L_0x0047
        L_0x003d:
            y8.b0 r6 = r4.mo22040i()
            goto L_0x0047
        L_0x0042:
            y8.b0 r6 = r4.mo22040i()
            goto L_0x002e
        L_0x0047:
            int r4 = p211d8.C9907y.m50805H(r0, r3, r6, r5)
            if (r4 <= 0) goto L_0x0010
            r3 = r5
            r0 = r6
            goto L_0x0010
        L_0x0050:
            if (r11 == 0) goto L_0x008d
        L_0x0052:
            java.util.List<a8.a1> r1 = r9.f30753b
            int r1 = r1.size()
            if (r5 >= r1) goto L_0x008d
            java.util.List<a8.a1> r1 = r9.f30753b
            java.lang.Object r1 = r1.get(r5)
            a8.a1 r1 = (p008a8.C6450a1) r1
            d8.r r1 = r1.mo21865c()
            d8.r r2 = r10.mo32341c()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x008a
            java.util.List r10 = r11.mo21954b()
            java.lang.Object r10 = r10.get(r5)
            y8.b0 r10 = (p405y8.C13088b0) r10
            boolean r1 = r11.mo21955c()
            int r1 = p211d8.C9907y.m50805H(r0, r3, r10, r1)
            if (r1 <= 0) goto L_0x008d
            boolean r3 = r11.mo21955c()
            r0 = r10
            goto L_0x008d
        L_0x008a:
            int r5 = r5 + 1
            goto L_0x0052
        L_0x008d:
            android.util.Pair r10 = new android.util.Pair
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            r10.<init>(r0, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p008a8.C6469g1.m37711e(d8.q$c, a8.i):android.util.Pair");
    }

    /* renamed from: g */
    private List<C6489q> m37712g(C9898r rVar) {
        ArrayList arrayList = new ArrayList();
        for (C6494r next : this.f30754c) {
            if (next instanceof C6489q) {
                C6489q qVar = (C6489q) next;
                if (qVar.mo22037g().equals(rVar)) {
                    arrayList.add(qVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<C13088b0> mo21932a(C9893q qVar) {
        C9893q.C9896c c = qVar.mo32408c();
        if (c == null) {
            return null;
        }
        for (C6489q next : m37712g(c.mo32341c())) {
            int i = C6470a.f30760a[next.mo22038h().ordinal()];
            if (i == 1) {
                return next.mo22040i().mo38112m0().mo38104g();
            }
            if (i == 2) {
                return Collections.singletonList(next.mo22040i());
            }
        }
        return null;
    }

    /* renamed from: c */
    public String mo21933c() {
        String str;
        String str2 = this.f30752a;
        if (str2 != null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mo21944n().mo32348c());
        if (this.f30756e != null) {
            sb.append("|cg:");
            sb.append(this.f30756e);
        }
        sb.append("|f:");
        for (C6494r a : mo21937h()) {
            sb.append(a.mo21988a());
        }
        sb.append("|ob:");
        for (C6450a1 next : mo21943m()) {
            sb.append(next.mo21865c().mo32348c());
            sb.append(next.mo21864b().equals(C6450a1.C6451a.ASCENDING) ? "asc" : "desc");
        }
        if (mo21948r()) {
            sb.append("|l:");
            sb.append(mo21940j());
        }
        String str3 = "b:";
        if (this.f30758g != null) {
            sb.append("|lb:");
            if (this.f30758g.mo21955c()) {
                str = str3;
            } else {
                str = "a:";
            }
            sb.append(str);
            sb.append(this.f30758g.mo21956d());
        }
        if (this.f30759h != null) {
            sb.append("|ub:");
            if (this.f30759h.mo21955c()) {
                str3 = "a:";
            }
            sb.append(str3);
            sb.append(this.f30759h.mo21956d());
        }
        String sb2 = sb.toString();
        this.f30752a = sb2;
        return sb2;
    }

    /* renamed from: d */
    public String mo21934d() {
        return this.f30756e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6469g1.class != obj.getClass()) {
            return false;
        }
        C6469g1 g1Var = (C6469g1) obj;
        String str = this.f30756e;
        if (str == null ? g1Var.f30756e != null : !str.equals(g1Var.f30756e)) {
            return false;
        }
        if (this.f30757f != g1Var.f30757f || !this.f30753b.equals(g1Var.f30753b) || !this.f30754c.equals(g1Var.f30754c) || !this.f30755d.equals(g1Var.f30755d)) {
            return false;
        }
        C6473i iVar = this.f30758g;
        if (iVar == null ? g1Var.f30758g != null : !iVar.equals(g1Var.f30758g)) {
            return false;
        }
        C6473i iVar2 = this.f30759h;
        C6473i iVar3 = g1Var.f30759h;
        if (iVar2 != null) {
            return iVar2.equals(iVar3);
        }
        if (iVar3 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public C6473i mo21936f() {
        return this.f30759h;
    }

    /* renamed from: h */
    public List<C6494r> mo21937h() {
        return this.f30754c;
    }

    public int hashCode() {
        int hashCode = this.f30753b.hashCode() * 31;
        String str = this.f30756e;
        int i = 0;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j = this.f30757f;
        int hashCode3 = (((((((hashCode + hashCode2) * 31) + this.f30754c.hashCode()) * 31) + this.f30755d.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        C6473i iVar = this.f30758g;
        int hashCode4 = (hashCode3 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        C6473i iVar2 = this.f30759h;
        if (iVar2 != null) {
            i = iVar2.hashCode();
        }
        return hashCode4 + i;
    }

    /* renamed from: i */
    public C6450a1.C6451a mo21939i() {
        List<C6450a1> list = this.f30753b;
        return list.get(list.size() - 1).mo21864b();
    }

    /* renamed from: j */
    public long mo21940j() {
        return this.f30757f;
    }

    /* renamed from: k */
    public C6473i mo21941k(C9893q qVar) {
        Pair<C13088b0, Boolean> pair;
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C9893q.C9896c next : qVar.mo32409e()) {
            if (next.mo32344j().equals(C9893q.C9896c.C9897a.ASCENDING)) {
                pair = m37710b(next, this.f30758g);
            } else {
                pair = m37711e(next, this.f30758g);
            }
            arrayList.add((C13088b0) pair.first);
            z &= ((Boolean) pair.second).booleanValue();
        }
        return new C6473i(arrayList, z);
    }

    /* renamed from: l */
    public Collection<C13088b0> mo21942l(C9893q qVar) {
        C6489q next;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        loop0:
        for (C9893q.C9896c next2 : qVar.mo32409e()) {
            Iterator<C6489q> it = m37712g(next2.mo32341c()).iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    int i = C6470a.f30760a[next.mo22038h().ordinal()];
                    if (i == 3 || i == 4) {
                        linkedHashMap.put(next2.mo32341c(), next.mo22040i());
                    } else if (i == 5 || i == 6) {
                        linkedHashMap.put(next2.mo32341c(), next.mo22040i());
                    }
                }
            }
            linkedHashMap.put(next2.mo32341c(), next.mo22040i());
            return linkedHashMap.values();
        }
        return null;
    }

    /* renamed from: m */
    public List<C6450a1> mo21943m() {
        return this.f30753b;
    }

    /* renamed from: n */
    public C9903u mo21944n() {
        return this.f30755d;
    }

    /* renamed from: o */
    public int mo21945o() {
        HashSet hashSet = new HashSet();
        int i = 0;
        for (C6494r d : this.f30754c) {
            for (C6489q next : d.mo21991d()) {
                if (!next.mo22037g().mo32415y()) {
                    if (next.mo22038h().equals(C6489q.C6491b.ARRAY_CONTAINS) || next.mo22038h().equals(C6489q.C6491b.ARRAY_CONTAINS_ANY)) {
                        i = 1;
                    } else {
                        hashSet.add(next.mo22037g());
                    }
                }
            }
        }
        for (C6450a1 next2 : this.f30753b) {
            if (!next2.mo21865c().mo32415y()) {
                hashSet.add(next2.mo21865c());
            }
        }
        return hashSet.size() + i;
    }

    /* renamed from: p */
    public C6473i mo21946p() {
        return this.f30758g;
    }

    /* renamed from: q */
    public C6473i mo21947q(C9893q qVar) {
        Pair<C13088b0, Boolean> pair;
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C9893q.C9896c next : qVar.mo32409e()) {
            if (next.mo32344j().equals(C9893q.C9896c.C9897a.ASCENDING)) {
                pair = m37711e(next, this.f30759h);
            } else {
                pair = m37710b(next, this.f30759h);
            }
            arrayList.add((C13088b0) pair.first);
            z &= ((Boolean) pair.second).booleanValue();
        }
        return new C6473i(arrayList, z);
    }

    /* renamed from: r */
    public boolean mo21948r() {
        return this.f30757f != -1;
    }

    /* renamed from: s */
    public boolean mo21949s() {
        return C9888l.m50699u(this.f30755d) && this.f30756e == null && this.f30754c.isEmpty();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Query(");
        sb.append(this.f30755d.mo32348c());
        if (this.f30756e != null) {
            sb.append(" collectionGroup=");
            sb.append(this.f30756e);
        }
        if (!this.f30754c.isEmpty()) {
            sb.append(" where ");
            for (int i = 0; i < this.f30754c.size(); i++) {
                if (i > 0) {
                    sb.append(" and ");
                }
                sb.append(this.f30754c.get(i));
            }
        }
        if (!this.f30753b.isEmpty()) {
            sb.append(" order by ");
            for (int i2 = 0; i2 < this.f30753b.size(); i2++) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(this.f30753b.get(i2));
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
