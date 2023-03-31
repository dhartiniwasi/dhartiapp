package p052g3;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import p004a2.C0079u1;
import p015b3.C1700e0;
import p015b3.C1712i;
import p015b3.C1749q0;
import p015b3.C1752r0;
import p015b3.C1765u;
import p015b3.C1776x0;
import p015b3.C1780z0;
import p030d2.C4035m;
import p030d2.C4048w;
import p030d2.C4052y;
import p052g3.C4378p;
import p059h3.C4456h;
import p059h3.C4464l;
import p127r2.C5432a;
import p149u3.C5735s;
import p155v3.C5789b;
import p155v3.C5804g0;
import p155v3.C5840p0;
import p161w3.C5917a;
import p161w3.C5953m0;
import p161w3.C5967v;
import p177z1.C6229i3;
import p177z1.C6272r1;
import p219e7.C9998d;

/* renamed from: g3.k */
/* compiled from: HlsMediaPeriod */
public final class C4376k implements C1765u, C4378p.C4380b, C4464l.C4466b {

    /* renamed from: A */
    private C1780z0 f24383A;

    /* renamed from: B */
    private C4378p[] f24384B = new C4378p[0];

    /* renamed from: C */
    private C4378p[] f24385C = new C4378p[0];

    /* renamed from: D */
    private int[][] f24386D = new int[0][];

    /* renamed from: E */
    private int f24387E;

    /* renamed from: F */
    private C1752r0 f24388F;

    /* renamed from: a */
    private final C4373h f24389a;

    /* renamed from: b */
    private final C4464l f24390b;

    /* renamed from: c */
    private final C4372g f24391c;

    /* renamed from: d */
    private final C5840p0 f24392d;

    /* renamed from: e */
    private final C4052y f24393e;

    /* renamed from: f */
    private final C4048w.C4049a f24394f;

    /* renamed from: g */
    private final C5804g0 f24395g;

    /* renamed from: h */
    private final C1700e0.C1701a f24396h;

    /* renamed from: i */
    private final C5789b f24397i;

    /* renamed from: r */
    private final IdentityHashMap<C1749q0, Integer> f24398r = new IdentityHashMap<>();

    /* renamed from: s */
    private final C4388s f24399s = new C4388s();

    /* renamed from: t */
    private final C1712i f24400t;

    /* renamed from: u */
    private final boolean f24401u;

    /* renamed from: v */
    private final int f24402v;

    /* renamed from: w */
    private final boolean f24403w;

    /* renamed from: x */
    private final C0079u1 f24404x;

    /* renamed from: y */
    private C1765u.C1766a f24405y;

    /* renamed from: z */
    private int f24406z;

    public C4376k(C4373h hVar, C4464l lVar, C4372g gVar, C5840p0 p0Var, C4052y yVar, C4048w.C4049a aVar, C5804g0 g0Var, C1700e0.C1701a aVar2, C5789b bVar, C1712i iVar, boolean z, int i, boolean z2, C0079u1 u1Var) {
        this.f24389a = hVar;
        this.f24390b = lVar;
        this.f24391c = gVar;
        this.f24392d = p0Var;
        this.f24393e = yVar;
        this.f24394f = aVar;
        this.f24395g = g0Var;
        this.f24396h = aVar2;
        this.f24397i = bVar;
        this.f24400t = iVar;
        this.f24401u = z;
        this.f24402v = i;
        this.f24403w = z2;
        this.f24404x = u1Var;
        this.f24388F = iVar.mo6743a(new C1752r0[0]);
    }

    /* renamed from: n */
    private void m29089n(long j, List<C4456h.C4457a> list, List<C4378p> list2, List<int[]> list3, Map<String, C4035m> map) {
        List<C4456h.C4457a> list4 = list;
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            String str = list4.get(i).f24750d;
            if (!hashSet.add(str)) {
                List<C4378p> list5 = list2;
                List<int[]> list6 = list3;
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z = true;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (C5953m0.m35124c(str, list4.get(i2).f24750d)) {
                        C4456h.C4457a aVar = list4.get(i2);
                        arrayList3.add(Integer.valueOf(i2));
                        arrayList.add(aVar.f24747a);
                        arrayList2.add(aVar.f24748b);
                        z &= C5953m0.m35088K(aVar.f24748b.f30240i, 1) == 1;
                    }
                }
                String str2 = "audio:" + str;
                C4378p u = m29092u(str2, 1, (Uri[]) arrayList.toArray((Uri[]) C5953m0.m35140k(new Uri[0])), (C6272r1[]) arrayList2.toArray(new C6272r1[0]), (C6272r1) null, Collections.emptyList(), map, j);
                list3.add(C9998d.m51076k(arrayList3));
                list2.add(u);
                if (this.f24401u && z) {
                    u.mo17858c0(new C1776x0[]{new C1776x0(str2, (C6272r1[]) arrayList2.toArray(new C6272r1[0]))}, 0, new int[0]);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064 A[ADDED_TO_REGION] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m29090o(p059h3.C4456h r21, long r22, java.util.List<p052g3.C4378p> r24, java.util.List<int[]> r25, java.util.Map<java.lang.String, p030d2.C4035m> r26) {
        /*
            r20 = this;
            r0 = r21
            java.util.List<h3.h$b> r1 = r0.f24738e
            int r1 = r1.size()
            int[] r2 = new int[r1]
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x000e:
            java.util.List<h3.h$b> r7 = r0.f24738e
            int r7 = r7.size()
            r8 = 2
            r9 = 1
            if (r4 >= r7) goto L_0x0047
            java.util.List<h3.h$b> r7 = r0.f24738e
            java.lang.Object r7 = r7.get(r4)
            h3.h$b r7 = (p059h3.C4456h.C4458b) r7
            z1.r1 r7 = r7.f24752b
            int r10 = r7.f30249z
            if (r10 > 0) goto L_0x0040
            java.lang.String r10 = r7.f30240i
            java.lang.String r10 = p161w3.C5953m0.m35090L(r10, r8)
            if (r10 == 0) goto L_0x002f
            goto L_0x0040
        L_0x002f:
            java.lang.String r7 = r7.f30240i
            java.lang.String r7 = p161w3.C5953m0.m35090L(r7, r9)
            if (r7 == 0) goto L_0x003c
            r2[r4] = r9
            int r6 = r6 + 1
            goto L_0x0044
        L_0x003c:
            r7 = -1
            r2[r4] = r7
            goto L_0x0044
        L_0x0040:
            r2[r4] = r8
            int r5 = r5 + 1
        L_0x0044:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x0047:
            if (r5 <= 0) goto L_0x004c
            r1 = r5
            r4 = 1
            goto L_0x0053
        L_0x004c:
            if (r6 >= r1) goto L_0x0052
            int r1 = r1 - r6
            r4 = 0
            r5 = 1
            goto L_0x0054
        L_0x0052:
            r4 = 0
        L_0x0053:
            r5 = 0
        L_0x0054:
            android.net.Uri[] r13 = new android.net.Uri[r1]
            z1.r1[] r6 = new p177z1.C6272r1[r1]
            int[] r7 = new int[r1]
            r10 = 0
            r11 = 0
        L_0x005c:
            java.util.List<h3.h$b> r12 = r0.f24738e
            int r12 = r12.size()
            if (r10 >= r12) goto L_0x0088
            if (r4 == 0) goto L_0x006a
            r12 = r2[r10]
            if (r12 != r8) goto L_0x0085
        L_0x006a:
            if (r5 == 0) goto L_0x0070
            r12 = r2[r10]
            if (r12 == r9) goto L_0x0085
        L_0x0070:
            java.util.List<h3.h$b> r12 = r0.f24738e
            java.lang.Object r12 = r12.get(r10)
            h3.h$b r12 = (p059h3.C4456h.C4458b) r12
            android.net.Uri r14 = r12.f24751a
            r13[r11] = r14
            z1.r1 r12 = r12.f24752b
            r6[r11] = r12
            int r12 = r11 + 1
            r7[r11] = r10
            r11 = r12
        L_0x0085:
            int r10 = r10 + 1
            goto L_0x005c
        L_0x0088:
            r2 = r6[r3]
            java.lang.String r2 = r2.f30240i
            int r5 = p161w3.C5953m0.m35088K(r2, r8)
            int r2 = p161w3.C5953m0.m35088K(r2, r9)
            if (r2 == r9) goto L_0x00a0
            if (r2 != 0) goto L_0x00a8
            java.util.List<h3.h$a> r8 = r0.f24740g
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x00a8
        L_0x00a0:
            if (r5 > r9) goto L_0x00a8
            int r8 = r2 + r5
            if (r8 <= 0) goto L_0x00a8
            r8 = 1
            goto L_0x00a9
        L_0x00a8:
            r8 = 0
        L_0x00a9:
            if (r4 != 0) goto L_0x00af
            if (r2 <= 0) goto L_0x00af
            r12 = 1
            goto L_0x00b0
        L_0x00af:
            r12 = 0
        L_0x00b0:
            java.lang.String r4 = "main"
            z1.r1 r15 = r0.f24743j
            java.util.List<z1.r1> r14 = r0.f24744k
            r10 = r20
            r11 = r4
            r16 = r14
            r14 = r6
            r17 = r26
            r18 = r22
            g3.p r10 = r10.m29092u(r11, r12, r13, r14, r15, r16, r17, r18)
            r11 = r24
            r11.add(r10)
            r11 = r25
            r11.add(r7)
            r7 = r20
            boolean r11 = r7.f24401u
            if (r11 == 0) goto L_0x01bb
            if (r8 == 0) goto L_0x01bb
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            if (r5 <= 0) goto L_0x015c
            z1.r1[] r5 = new p177z1.C6272r1[r1]
            r11 = 0
        L_0x00e0:
            if (r11 >= r1) goto L_0x00ed
            r12 = r6[r11]
            z1.r1 r12 = m29095x(r12)
            r5[r11] = r12
            int r11 = r11 + 1
            goto L_0x00e0
        L_0x00ed:
            b3.x0 r1 = new b3.x0
            r1.<init>(r4, r5)
            r8.add(r1)
            if (r2 <= 0) goto L_0x0128
            z1.r1 r1 = r0.f24743j
            if (r1 != 0) goto L_0x0103
            java.util.List<h3.h$a> r1 = r0.f24740g
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0128
        L_0x0103:
            b3.x0 r1 = new b3.x0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r5 = ":audio"
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            z1.r1[] r5 = new p177z1.C6272r1[r9]
            r6 = r6[r3]
            z1.r1 r11 = r0.f24743j
            z1.r1 r6 = m29093v(r6, r11, r3)
            r5[r3] = r6
            r1.<init>(r2, r5)
            r8.add(r1)
        L_0x0128:
            java.util.List<z1.r1> r0 = r0.f24744k
            if (r0 == 0) goto L_0x0176
            r1 = 0
        L_0x012d:
            int r2 = r0.size()
            if (r1 >= r2) goto L_0x0176
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r5 = ":cc:"
            r2.append(r5)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            b3.x0 r5 = new b3.x0
            z1.r1[] r6 = new p177z1.C6272r1[r9]
            java.lang.Object r11 = r0.get(r1)
            z1.r1 r11 = (p177z1.C6272r1) r11
            r6[r3] = r11
            r5.<init>(r2, r6)
            r8.add(r5)
            int r1 = r1 + 1
            goto L_0x012d
        L_0x015c:
            z1.r1[] r2 = new p177z1.C6272r1[r1]
            r5 = 0
        L_0x015f:
            if (r5 >= r1) goto L_0x016e
            r11 = r6[r5]
            z1.r1 r12 = r0.f24743j
            z1.r1 r11 = m29093v(r11, r12, r9)
            r2[r5] = r11
            int r5 = r5 + 1
            goto L_0x015f
        L_0x016e:
            b3.x0 r0 = new b3.x0
            r0.<init>(r4, r2)
            r8.add(r0)
        L_0x0176:
            b3.x0 r0 = new b3.x0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = ":id3"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            z1.r1[] r2 = new p177z1.C6272r1[r9]
            z1.r1$b r4 = new z1.r1$b
            r4.<init>()
            java.lang.String r5 = "ID3"
            z1.r1$b r4 = r4.mo21505S(r5)
            java.lang.String r5 = "application/id3"
            z1.r1$b r4 = r4.mo21517e0(r5)
            z1.r1 r4 = r4.mo21491E()
            r2[r3] = r4
            r0.<init>(r1, r2)
            r8.add(r0)
            b3.x0[] r1 = new p015b3.C1776x0[r3]
            java.lang.Object[] r1 = r8.toArray(r1)
            b3.x0[] r1 = (p015b3.C1776x0[]) r1
            int[] r2 = new int[r9]
            int r0 = r8.indexOf(r0)
            r2[r3] = r0
            r10.mo17858c0(r1, r3, r2)
        L_0x01bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p052g3.C4376k.m29090o(h3.h, long, java.util.List, java.util.List, java.util.Map):void");
    }

    /* renamed from: q */
    private void m29091q(long j) {
        Map<String, C4035m> map;
        C4456h hVar = (C4456h) C5917a.m34872e(this.f24390b.mo17982h());
        if (this.f24403w) {
            map = m29094w(hVar.f24746m);
        } else {
            map = Collections.emptyMap();
        }
        Map<String, C4035m> map2 = map;
        boolean z = !hVar.f24738e.isEmpty();
        List<C4456h.C4457a> list = hVar.f24740g;
        List<C4456h.C4457a> list2 = hVar.f24741h;
        this.f24406z = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            m29090o(hVar, j, arrayList, arrayList2, map2);
        }
        m29089n(j, list, arrayList, arrayList2, map2);
        this.f24387E = arrayList.size();
        int i = 0;
        while (i < list2.size()) {
            C4456h.C4457a aVar = list2.get(i);
            String str = "subtitle:" + i + ":" + aVar.f24750d;
            int i2 = i;
            C4378p u = m29092u(str, 3, new Uri[]{aVar.f24747a}, new C6272r1[]{aVar.f24748b}, (C6272r1) null, Collections.emptyList(), map2, j);
            ArrayList arrayList3 = arrayList2;
            arrayList3.add(new int[]{i2});
            arrayList.add(u);
            u.mo17858c0(new C1776x0[]{new C1776x0(str, aVar.f24748b)}, 0, new int[0]);
            i = i2 + 1;
            arrayList2 = arrayList3;
        }
        this.f24384B = (C4378p[]) arrayList.toArray(new C4378p[0]);
        this.f24386D = (int[][]) arrayList2.toArray(new int[0][]);
        this.f24406z = this.f24384B.length;
        for (int i3 = 0; i3 < this.f24387E; i3++) {
            this.f24384B[i3].mo17865l0(true);
        }
        for (C4378p A : this.f24384B) {
            A.mo17846A();
        }
        this.f24385C = this.f24384B;
    }

    /* renamed from: u */
    private C4378p m29092u(String str, int i, Uri[] uriArr, C6272r1[] r1VarArr, C6272r1 r1Var, List<C6272r1> list, Map<String, C4035m> map, long j) {
        return new C4378p(str, i, this, new C4366f(this.f24389a, this.f24390b, uriArr, r1VarArr, this.f24391c, this.f24392d, this.f24399s, list, this.f24404x), map, this.f24397i, j, r1Var, this.f24393e, this.f24394f, this.f24395g, this.f24396h, this.f24402v);
    }

    /* renamed from: v */
    private static C6272r1 m29093v(C6272r1 r1Var, C6272r1 r1Var2, boolean z) {
        String str;
        int i;
        String str2;
        int i2;
        int i3;
        C5432a aVar;
        String str3;
        int i4 = -1;
        if (r1Var2 != null) {
            str3 = r1Var2.f30240i;
            aVar = r1Var2.f30241r;
            int i5 = r1Var2.f30224G;
            i2 = r1Var2.f30235d;
            int i6 = r1Var2.f30236e;
            String str4 = r1Var2.f30234c;
            str = r1Var2.f30233b;
            String str5 = str4;
            i = i5;
            i3 = i6;
            str2 = str5;
        } else {
            String L = C5953m0.m35090L(r1Var.f30240i, 1);
            C5432a aVar2 = r1Var.f30241r;
            if (z) {
                int i7 = r1Var.f30224G;
                int i8 = r1Var.f30235d;
                int i9 = r1Var.f30236e;
                str2 = r1Var.f30234c;
                int i10 = i7;
                str3 = L;
                str = r1Var.f30233b;
                i = i10;
                int i11 = i9;
                i2 = i8;
                aVar = aVar2;
                i3 = i11;
            } else {
                str2 = null;
                aVar = aVar2;
                i3 = 0;
                i2 = 0;
                i = -1;
                str3 = L;
                str = null;
            }
        }
        String g = C5967v.m35243g(str3);
        int i12 = z ? r1Var.f30237f : -1;
        if (z) {
            i4 = r1Var.f30238g;
        }
        return new C6272r1.C6274b().mo21505S(r1Var.f30232a).mo21507U(str).mo21497K(r1Var.f30242s).mo21517e0(g).mo21495I(str3).mo21510X(aVar).mo21493G(i12).mo21512Z(i4).mo21494H(i).mo21519g0(i2).mo21515c0(i3).mo21508V(str2).mo21491E();
    }

    /* renamed from: w */
    private static Map<String, C4035m> m29094w(List<C4035m> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i < arrayList.size()) {
            C4035m mVar = list.get(i);
            String str = mVar.f23114c;
            i++;
            int i2 = i;
            while (i2 < arrayList.size()) {
                C4035m mVar2 = (C4035m) arrayList.get(i2);
                if (TextUtils.equals(mVar2.f23114c, str)) {
                    mVar = mVar.mo17233f(mVar2);
                    arrayList.remove(i2);
                } else {
                    i2++;
                }
            }
            hashMap.put(str, mVar);
        }
        return hashMap;
    }

    /* renamed from: x */
    private static C6272r1 m29095x(C6272r1 r1Var) {
        String L = C5953m0.m35090L(r1Var.f30240i, 2);
        return new C6272r1.C6274b().mo21505S(r1Var.f30232a).mo21507U(r1Var.f30233b).mo21497K(r1Var.f30242s).mo21517e0(C5967v.m35243g(L)).mo21495I(L).mo21510X(r1Var.f30241r).mo21493G(r1Var.f30237f).mo21512Z(r1Var.f30238g).mo21522j0(r1Var.f30248y).mo21503Q(r1Var.f30249z).mo21502P(r1Var.f30218A).mo21519g0(r1Var.f30235d).mo21515c0(r1Var.f30236e).mo21491E();
    }

    /* renamed from: a */
    public void mo17838a() {
        for (C4378p a0 : this.f24384B) {
            a0.mo17856a0();
        }
        this.f24405y.mo6684f(this);
    }

    /* renamed from: c */
    public long mo6681c(long j, C6229i3 i3Var) {
        for (C4378p pVar : this.f24385C) {
            if (pVar.mo17848Q()) {
                return pVar.mo17857c(j, i3Var);
            }
        }
        return j;
    }

    /* renamed from: d */
    public long mo6682d() {
        return this.f24388F.mo6682d();
    }

    /* renamed from: e */
    public boolean mo6683e(long j) {
        if (this.f24383A != null) {
            return this.f24388F.mo6683e(j);
        }
        for (C4378p A : this.f24384B) {
            A.mo17846A();
        }
        return false;
    }

    /* renamed from: g */
    public long mo6685g() {
        return this.f24388F.mo6685g();
    }

    /* renamed from: h */
    public void mo6686h(long j) {
        this.f24388F.mo6686h(j);
    }

    /* renamed from: i */
    public long mo6687i(C5735s[] sVarArr, boolean[] zArr, C1749q0[] q0VarArr, boolean[] zArr2, long j) {
        boolean z;
        C5735s[] sVarArr2 = sVarArr;
        C1749q0[] q0VarArr2 = q0VarArr;
        int[] iArr = new int[sVarArr2.length];
        int[] iArr2 = new int[sVarArr2.length];
        for (int i = 0; i < sVarArr2.length; i++) {
            iArr[i] = q0VarArr2[i] == null ? -1 : this.f24398r.get(q0VarArr2[i]).intValue();
            iArr2[i] = -1;
            if (sVarArr2[i] != null) {
                C1776x0 a = sVarArr2[i].mo20142a();
                int i2 = 0;
                while (true) {
                    C4378p[] pVarArr = this.f24384B;
                    if (i2 >= pVarArr.length) {
                        break;
                    } else if (pVarArr[i2].mo17869s().mo6904c(a) != -1) {
                        iArr2[i] = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        this.f24398r.clear();
        int length = sVarArr2.length;
        C1749q0[] q0VarArr3 = new C1749q0[length];
        C1749q0[] q0VarArr4 = new C1749q0[sVarArr2.length];
        C5735s[] sVarArr3 = new C5735s[sVarArr2.length];
        C4378p[] pVarArr2 = new C4378p[this.f24384B.length];
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        while (i4 < this.f24384B.length) {
            for (int i5 = 0; i5 < sVarArr2.length; i5++) {
                C5735s sVar = null;
                q0VarArr4[i5] = iArr[i5] == i4 ? q0VarArr2[i5] : null;
                if (iArr2[i5] == i4) {
                    sVar = sVarArr2[i5];
                }
                sVarArr3[i5] = sVar;
            }
            C4378p pVar = this.f24384B[i4];
            C4378p pVar2 = pVar;
            int i6 = length;
            int i7 = i4;
            int i8 = i3;
            C5735s[] sVarArr4 = sVarArr3;
            C4378p[] pVarArr3 = pVarArr2;
            boolean i0 = pVar.mo17862i0(sVarArr3, zArr, q0VarArr4, zArr2, j, z2);
            int i9 = 0;
            boolean z3 = false;
            while (true) {
                z = true;
                if (i9 >= sVarArr2.length) {
                    break;
                }
                C1749q0 q0Var = q0VarArr4[i9];
                if (iArr2[i9] == i7) {
                    C5917a.m34872e(q0Var);
                    q0VarArr3[i9] = q0Var;
                    this.f24398r.put(q0Var, Integer.valueOf(i7));
                    z3 = true;
                } else if (iArr[i9] == i7) {
                    if (q0Var != null) {
                        z = false;
                    }
                    C5917a.m34873f(z);
                }
                i9++;
            }
            if (z3) {
                pVarArr3[i8] = pVar2;
                i3 = i8 + 1;
                if (i8 == 0) {
                    pVar2.mo17865l0(true);
                    if (!i0) {
                        C4378p[] pVarArr4 = this.f24385C;
                        if (pVarArr4.length != 0 && pVar2 == pVarArr4[0]) {
                        }
                    }
                    this.f24399s.mo17895b();
                    z2 = true;
                } else {
                    if (i7 >= this.f24387E) {
                        z = false;
                    }
                    pVar2.mo17865l0(z);
                }
            } else {
                i3 = i8;
            }
            i4 = i7 + 1;
            pVarArr2 = pVarArr3;
            length = i6;
            sVarArr3 = sVarArr4;
            q0VarArr2 = q0VarArr;
        }
        System.arraycopy(q0VarArr3, 0, q0VarArr2, 0, length);
        C4378p[] pVarArr5 = (C4378p[]) C5953m0.m35081G0(pVarArr2, i3);
        this.f24385C = pVarArr5;
        this.f24388F = this.f24400t.mo6743a(pVarArr5);
        return j;
    }

    public boolean isLoading() {
        return this.f24388F.isLoading();
    }

    /* renamed from: j */
    public boolean mo17839j(Uri uri, C5804g0.C5807c cVar, boolean z) {
        boolean z2 = true;
        for (C4378p Z : this.f24384B) {
            z2 &= Z.mo17855Z(uri, cVar, z);
        }
        this.f24405y.mo6684f(this);
        return z2;
    }

    /* renamed from: k */
    public void mo6690k() throws IOException {
        for (C4378p k : this.f24384B) {
            k.mo17864k();
        }
    }

    /* renamed from: l */
    public void mo17840l(Uri uri) {
        this.f24390b.mo17985l(uri);
    }

    /* renamed from: m */
    public long mo6691m(long j) {
        C4378p[] pVarArr = this.f24385C;
        if (pVarArr.length > 0) {
            boolean h0 = pVarArr[0].mo17861h0(j, false);
            int i = 1;
            while (true) {
                C4378p[] pVarArr2 = this.f24385C;
                if (i >= pVarArr2.length) {
                    break;
                }
                pVarArr2[i].mo17861h0(j, h0);
                i++;
            }
            if (h0) {
                this.f24399s.mo17895b();
            }
        }
        return j;
    }

    public void onPrepared() {
        int i = this.f24406z - 1;
        this.f24406z = i;
        if (i <= 0) {
            int i2 = 0;
            for (C4378p s : this.f24384B) {
                i2 += s.mo17869s().f5296a;
            }
            C1776x0[] x0VarArr = new C1776x0[i2];
            int i3 = 0;
            for (C4378p pVar : this.f24384B) {
                int i4 = pVar.mo17869s().f5296a;
                int i5 = 0;
                while (i5 < i4) {
                    x0VarArr[i3] = pVar.mo17869s().mo6903b(i5);
                    i5++;
                    i3++;
                }
            }
            this.f24383A = new C1780z0(x0VarArr);
            this.f24405y.mo6680b(this);
        }
    }

    /* renamed from: p */
    public long mo6694p() {
        return -9223372036854775807L;
    }

    /* renamed from: r */
    public void mo6695r(C1765u.C1766a aVar, long j) {
        this.f24405y = aVar;
        this.f24390b.mo17978d(this);
        m29091q(j);
    }

    /* renamed from: s */
    public C1780z0 mo6696s() {
        return (C1780z0) C5917a.m34872e(this.f24383A);
    }

    /* renamed from: t */
    public void mo6697t(long j, boolean z) {
        for (C4378p t : this.f24385C) {
            t.mo17870t(j, z);
        }
    }

    /* renamed from: y */
    public void mo6684f(C4378p pVar) {
        this.f24405y.mo6684f(this);
    }

    /* renamed from: z */
    public void mo17843z() {
        this.f24390b.mo17980f(this);
        for (C4378p e0 : this.f24384B) {
            e0.mo17860e0();
        }
        this.f24405y = null;
    }
}
