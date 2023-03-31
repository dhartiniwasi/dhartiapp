package com.google.protobuf;

import com.google.protobuf.C8105b2;
import com.google.protobuf.C8243v0;
import com.google.protobuf.C8260z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.s */
/* compiled from: ExtensionSchemaLite */
final class C8226s extends C8223r<C8260z.C8264d> {

    /* renamed from: com.google.protobuf.s$a */
    /* compiled from: ExtensionSchemaLite */
    static /* synthetic */ class C8227a {

        /* renamed from: a */
        static final /* synthetic */ int[] f35077a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.b2$b[] r0 = com.google.protobuf.C8105b2.C8107b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35077a = r0
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35077a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f35077a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f35077a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f35077a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f35077a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f35077a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f35077a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f35077a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.UINT32     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f35077a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f35077a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f35077a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.SINT32     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f35077a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.SINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f35077a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.ENUM     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f35077a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.BYTES     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f35077a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.STRING     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f35077a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.GROUP     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f35077a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8226s.C8227a.<clinit>():void");
        }
    }

    C8226s() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo27276a(Map.Entry<?, ?> entry) {
        return ((C8260z.C8264d) entry.getKey()).mo27311f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Object mo27277b(C8210q qVar, C8243v0 v0Var, int i) {
        return qVar.mo27220a(v0Var, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C8240v<C8260z.C8264d> mo27278c(Object obj) {
        return ((C8260z.C8263c) obj).extensions;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C8240v<C8260z.C8264d> mo27279d(Object obj) {
        return ((C8260z.C8263c) obj).mo27446a0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo27280e(C8243v0 v0Var) {
        return v0Var instanceof C8260z.C8263c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo27281f(Object obj) {
        mo27278c(obj).mo27308u();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public <UT, UB> UB mo27282g(Object obj, C8190l1 l1Var, Object obj2, C8210q qVar, C8240v<C8260z.C8264d> vVar, UB ub, C8245v1<UT, UB> v1Var) throws IOException {
        Object i;
        ArrayList arrayList;
        C8260z.C8265e eVar = (C8260z.C8265e) obj2;
        int c = eVar.mo27452c();
        if (!eVar.f35204b.mo27312g() || !eVar.f35204b.mo27316m()) {
            Object obj3 = null;
            if (eVar.mo27450a() != C8105b2.C8107b.ENUM) {
                switch (C8227a.f35077a[eVar.mo27450a().ordinal()]) {
                    case 1:
                        obj3 = Double.valueOf(l1Var.readDouble());
                        break;
                    case 2:
                        obj3 = Float.valueOf(l1Var.readFloat());
                        break;
                    case 3:
                        obj3 = Long.valueOf(l1Var.mo27052M());
                        break;
                    case 4:
                        obj3 = Long.valueOf(l1Var.mo27057b());
                        break;
                    case 5:
                        obj3 = Integer.valueOf(l1Var.mo27047H());
                        break;
                    case 6:
                        obj3 = Long.valueOf(l1Var.mo27058c());
                        break;
                    case 7:
                        obj3 = Integer.valueOf(l1Var.mo27065j());
                        break;
                    case 8:
                        obj3 = Boolean.valueOf(l1Var.mo27066k());
                        break;
                    case 9:
                        obj3 = Integer.valueOf(l1Var.mo27070o());
                        break;
                    case 10:
                        obj3 = Integer.valueOf(l1Var.mo27049J());
                        break;
                    case 11:
                        obj3 = Long.valueOf(l1Var.mo27068m());
                        break;
                    case 12:
                        obj3 = Integer.valueOf(l1Var.mo27079v());
                        break;
                    case 13:
                        obj3 = Long.valueOf(l1Var.mo27081w());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        obj3 = l1Var.mo27045F();
                        break;
                    case 16:
                        obj3 = l1Var.mo27083y();
                        break;
                    case 17:
                        if (!eVar.mo27453d()) {
                            Object i2 = vVar.mo27301i(eVar.f35204b);
                            if (i2 instanceof C8260z) {
                                C8202n1 d = C8166i1.m44835a().mo26962d(i2);
                                if (!((C8260z) i2).mo27417J()) {
                                    Object i3 = d.mo27205i();
                                    d.mo27197a(i3, i2);
                                    vVar.mo27310y(eVar.f35204b, i3);
                                    i2 = i3;
                                }
                                l1Var.mo27064i(i2, d, qVar);
                                return ub;
                            }
                        }
                        obj3 = l1Var.mo27084z(eVar.mo27451b().getClass(), qVar);
                        break;
                    case 18:
                        if (!eVar.mo27453d()) {
                            Object i4 = vVar.mo27301i(eVar.f35204b);
                            if (i4 instanceof C8260z) {
                                C8202n1 d2 = C8166i1.m44835a().mo26962d(i4);
                                if (!((C8260z) i4).mo27417J()) {
                                    Object i5 = d2.mo27205i();
                                    d2.mo27197a(i5, i4);
                                    vVar.mo27310y(eVar.f35204b, i5);
                                    i4 = i5;
                                }
                                l1Var.mo27042C(i4, d2, qVar);
                                return ub;
                            }
                        }
                        obj3 = l1Var.mo27063h(eVar.mo27451b().getClass(), qVar);
                        break;
                }
            } else {
                int H = l1Var.mo27047H();
                if (eVar.f35204b.mo27448b().mo26873a(H) == null) {
                    return C8209p1.m45500L(obj, c, H, ub, v1Var);
                }
                obj3 = Integer.valueOf(H);
            }
            if (eVar.mo27453d()) {
                vVar.mo27295a(eVar.f35204b, obj3);
            } else {
                int i6 = C8227a.f35077a[eVar.mo27450a().ordinal()];
                if ((i6 == 17 || i6 == 18) && (i = vVar.mo27301i(eVar.f35204b)) != null) {
                    obj3 = C8119d0.m44656h(i, obj3);
                }
                vVar.mo27310y(eVar.f35204b, obj3);
            }
        } else {
            switch (C8227a.f35077a[eVar.mo27450a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    l1Var.mo27051L(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    l1Var.mo27046G(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    l1Var.mo27071p(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    l1Var.mo27069n(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    l1Var.mo27073r(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    l1Var.mo27054O(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    l1Var.mo27078u(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    l1Var.mo27082x(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    l1Var.mo27062g(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    l1Var.mo27059d(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    l1Var.mo27072q(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    l1Var.mo27056a(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    l1Var.mo27060e(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    l1Var.mo27076s(arrayList);
                    ub = C8209p1.m45545z(obj, c, arrayList, eVar.f35204b.mo27448b(), ub, v1Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f35204b.mo27313h());
            }
            vVar.mo27310y(eVar.f35204b, arrayList);
        }
        return ub;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo27283h(C8190l1 l1Var, Object obj, C8210q qVar, C8240v<C8260z.C8264d> vVar) throws IOException {
        C8260z.C8265e eVar = (C8260z.C8265e) obj;
        vVar.mo27310y(eVar.f35204b, l1Var.mo27063h(eVar.mo27451b().getClass(), qVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo27284i(C8153i iVar, Object obj, C8210q qVar, C8240v<C8260z.C8264d> vVar) throws IOException {
        C8260z.C8265e eVar = (C8260z.C8265e) obj;
        C8243v0.C8244a i = eVar.mo27451b().mo27320i();
        C8167j B = iVar.mo26878B();
        i.mo27322R0(B, qVar);
        vVar.mo27310y(eVar.f35204b, i.mo27323U0());
        B.mo26971a(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo27285j(C8116c2 c2Var, Map.Entry<?, ?> entry) throws IOException {
        C8260z.C8264d dVar = (C8260z.C8264d) entry.getKey();
        if (dVar.mo27312g()) {
            switch (C8227a.f35077a[dVar.mo27313h().ordinal()]) {
                case 1:
                    C8209p1.m45504P(dVar.mo27311f(), (List) entry.getValue(), c2Var, dVar.mo27316m());
                    return;
                case 2:
                    C8209p1.m45508T(dVar.mo27311f(), (List) entry.getValue(), c2Var, dVar.mo27316m());
                    return;
                case 3:
                    C8209p1.m45511W(dVar.mo27311f(), (List) entry.getValue(), c2Var, dVar.mo27316m());
                    return;
                case 4:
                    C8209p1.m45524e0(dVar.mo27311f(), (List) entry.getValue(), c2Var, dVar.mo27316m());
                    return;
                case 5:
                    C8209p1.m45510V(dVar.mo27311f(), (List) entry.getValue(), c2Var, dVar.mo27316m());
                    return;
                case 6:
                    C8209p1.m45507S(dVar.mo27311f(), (List) entry.getValue(), c2Var, dVar.mo27316m());
                    return;
                case 7:
                    C8209p1.m45506R(dVar.mo27311f(), (List) entry.getValue(), c2Var, dVar.mo27316m());
                    return;
                case 8:
                    C8209p1.m45502N(dVar.mo27311f(), (List) entry.getValue(), c2Var, dVar.mo27316m());
                    return;
                case 9:
                    C8209p1.m45522d0(dVar.mo27311f(), (List) entry.getValue(), c2Var, dVar.mo27316m());
                    return;
                case 10:
                    C8209p1.m45513Y(dVar.mo27311f(), (List) entry.getValue(), c2Var, dVar.mo27316m());
                    return;
                case 11:
                    C8209p1.m45514Z(dVar.mo27311f(), (List) entry.getValue(), c2Var, dVar.mo27316m());
                    return;
                case 12:
                    C8209p1.m45516a0(dVar.mo27311f(), (List) entry.getValue(), c2Var, dVar.mo27316m());
                    return;
                case 13:
                    C8209p1.m45518b0(dVar.mo27311f(), (List) entry.getValue(), c2Var, dVar.mo27316m());
                    return;
                case 14:
                    C8209p1.m45510V(dVar.mo27311f(), (List) entry.getValue(), c2Var, dVar.mo27316m());
                    return;
                case 15:
                    C8209p1.m45503O(dVar.mo27311f(), (List) entry.getValue(), c2Var);
                    return;
                case 16:
                    C8209p1.m45520c0(dVar.mo27311f(), (List) entry.getValue(), c2Var);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        C8209p1.m45509U(dVar.mo27311f(), (List) entry.getValue(), c2Var, C8166i1.m44835a().mo26961c(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        C8209p1.m45512X(dVar.mo27311f(), (List) entry.getValue(), c2Var, C8166i1.m44835a().mo26961c(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            switch (C8227a.f35077a[dVar.mo27313h().ordinal()]) {
                case 1:
                    c2Var.mo26852g(dVar.mo27311f(), ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    c2Var.mo26837G(dVar.mo27311f(), ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    c2Var.mo26862q(dVar.mo27311f(), ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    c2Var.mo26860o(dVar.mo27311f(), ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                    c2Var.mo26868w(dVar.mo27311f(), ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    c2Var.mo26856k(dVar.mo27311f(), ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    c2Var.mo26851f(dVar.mo27311f(), ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    c2Var.mo26863r(dVar.mo27311f(), ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    c2Var.mo26849d(dVar.mo27311f(), ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    c2Var.mo26865t(dVar.mo27311f(), ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    c2Var.mo26871z(dVar.mo27311f(), ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    c2Var.mo26844N(dVar.mo27311f(), ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    c2Var.mo26836F(dVar.mo27311f(), ((Long) entry.getValue()).longValue());
                    return;
                case 14:
                    c2Var.mo26868w(dVar.mo27311f(), ((Integer) entry.getValue()).intValue());
                    return;
                case 15:
                    c2Var.mo26867v(dVar.mo27311f(), (C8153i) entry.getValue());
                    return;
                case 16:
                    c2Var.mo26859n(dVar.mo27311f(), (String) entry.getValue());
                    return;
                case 17:
                    c2Var.mo26864s(dVar.mo27311f(), entry.getValue(), C8166i1.m44835a().mo26961c(entry.getValue().getClass()));
                    return;
                case 18:
                    c2Var.mo26855j(dVar.mo27311f(), entry.getValue(), C8166i1.m44835a().mo26961c(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
    }
}
