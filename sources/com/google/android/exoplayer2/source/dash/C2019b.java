package com.google.android.exoplayer2.source.dash;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.source.dash.C2017a;
import com.google.android.exoplayer2.source.dash.C2026e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p004a2.C0079u1;
import p015b3.C1700e0;
import p015b3.C1712i;
import p015b3.C1736n;
import p015b3.C1749q0;
import p015b3.C1752r0;
import p015b3.C1765u;
import p015b3.C1776x0;
import p015b3.C1780z0;
import p030d2.C4048w;
import p030d2.C4052y;
import p031d3.C4065i;
import p038e3.C4233b;
import p045f3.C4255a;
import p045f3.C4257c;
import p045f3.C4260e;
import p045f3.C4261f;
import p045f3.C4262g;
import p045f3.C4265j;
import p149u3.C5735s;
import p155v3.C5789b;
import p155v3.C5804g0;
import p155v3.C5820i0;
import p155v3.C5840p0;
import p161w3.C5953m0;
import p177z1.C6229i3;
import p177z1.C6272r1;
import p219e7.C9998d;

/* renamed from: com.google.android.exoplayer2.source.dash.b */
/* compiled from: DashMediaPeriod */
final class C2019b implements C1765u, C1752r0.C1753a<C4065i<C2017a>>, C4065i.C4067b<C2017a> {

    /* renamed from: G */
    private static final Pattern f5784G = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: H */
    private static final Pattern f5785H = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: A */
    private C4065i<C2017a>[] f5786A = m8815D(0);

    /* renamed from: B */
    private C2025d[] f5787B = new C2025d[0];

    /* renamed from: C */
    private C1752r0 f5788C;

    /* renamed from: D */
    private C4257c f5789D;

    /* renamed from: E */
    private int f5790E;

    /* renamed from: F */
    private List<C4261f> f5791F;

    /* renamed from: a */
    final int f5792a;

    /* renamed from: b */
    private final C2017a.C2018a f5793b;

    /* renamed from: c */
    private final C5840p0 f5794c;

    /* renamed from: d */
    private final C4052y f5795d;

    /* renamed from: e */
    private final C5804g0 f5796e;

    /* renamed from: f */
    private final C4233b f5797f;

    /* renamed from: g */
    private final long f5798g;

    /* renamed from: h */
    private final C5820i0 f5799h;

    /* renamed from: i */
    private final C5789b f5800i;

    /* renamed from: r */
    private final C1780z0 f5801r;

    /* renamed from: s */
    private final C2020a[] f5802s;

    /* renamed from: t */
    private final C1712i f5803t;

    /* renamed from: u */
    private final C2026e f5804u;

    /* renamed from: v */
    private final IdentityHashMap<C4065i<C2017a>, C2026e.C2029c> f5805v = new IdentityHashMap<>();

    /* renamed from: w */
    private final C1700e0.C1701a f5806w;

    /* renamed from: x */
    private final C4048w.C4049a f5807x;

    /* renamed from: y */
    private final C0079u1 f5808y;

    /* renamed from: z */
    private C1765u.C1766a f5809z;

    /* renamed from: com.google.android.exoplayer2.source.dash.b$a */
    /* compiled from: DashMediaPeriod */
    private static final class C2020a {

        /* renamed from: a */
        public final int[] f5810a;

        /* renamed from: b */
        public final int f5811b;

        /* renamed from: c */
        public final int f5812c;

        /* renamed from: d */
        public final int f5813d;

        /* renamed from: e */
        public final int f5814e;

        /* renamed from: f */
        public final int f5815f;

        /* renamed from: g */
        public final int f5816g;

        private C2020a(int i, int i2, int[] iArr, int i3, int i4, int i5, int i6) {
            this.f5811b = i;
            this.f5810a = iArr;
            this.f5812c = i2;
            this.f5814e = i3;
            this.f5815f = i4;
            this.f5816g = i5;
            this.f5813d = i6;
        }

        /* renamed from: a */
        public static C2020a m8847a(int[] iArr, int i) {
            return new C2020a(3, 1, iArr, i, -1, -1, -1);
        }

        /* renamed from: b */
        public static C2020a m8848b(int[] iArr, int i) {
            return new C2020a(5, 1, iArr, i, -1, -1, -1);
        }

        /* renamed from: c */
        public static C2020a m8849c(int i) {
            return new C2020a(5, 2, new int[0], -1, -1, -1, i);
        }

        /* renamed from: d */
        public static C2020a m8850d(int i, int[] iArr, int i2, int i3, int i4) {
            return new C2020a(i, 0, iArr, i2, i3, i4, -1);
        }
    }

    public C2019b(int i, C4257c cVar, C4233b bVar, int i2, C2017a.C2018a aVar, C5840p0 p0Var, C4052y yVar, C4048w.C4049a aVar2, C5804g0 g0Var, C1700e0.C1701a aVar3, long j, C5820i0 i0Var, C5789b bVar2, C1712i iVar, C2026e.C2028b bVar3, C0079u1 u1Var) {
        C5789b bVar4 = bVar2;
        C1712i iVar2 = iVar;
        this.f5792a = i;
        this.f5789D = cVar;
        this.f5797f = bVar;
        this.f5790E = i2;
        this.f5793b = aVar;
        this.f5794c = p0Var;
        this.f5795d = yVar;
        this.f5807x = aVar2;
        this.f5796e = g0Var;
        this.f5806w = aVar3;
        this.f5798g = j;
        this.f5799h = i0Var;
        this.f5800i = bVar4;
        this.f5803t = iVar2;
        this.f5808y = u1Var;
        this.f5804u = new C2026e(cVar, bVar3, bVar4);
        this.f5788C = iVar2.mo6743a(this.f5786A);
        C4262g d = cVar.mo17624d(i2);
        List<C4261f> list = d.f23685d;
        this.f5791F = list;
        Pair<C1780z0, C2020a[]> q = m8823q(yVar, d.f23684c, list);
        this.f5801r = (C1780z0) q.first;
        this.f5802s = (C2020a[]) q.second;
    }

    /* renamed from: A */
    private int[] m8812A(C5735s[] sVarArr) {
        int[] iArr = new int[sVarArr.length];
        for (int i = 0; i < sVarArr.length; i++) {
            if (sVarArr[i] != null) {
                iArr[i] = this.f5801r.mo6904c(sVarArr[i].mo20142a());
            } else {
                iArr[i] = -1;
            }
        }
        return iArr;
    }

    /* renamed from: B */
    private static boolean m8813B(List<C4255a> list, int[] iArr) {
        for (int i : iArr) {
            List<C4265j> list2 = list.get(i).f23639c;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (!list2.get(i2).f23700e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: C */
    private static int m8814C(int i, List<C4255a> list, int[][] iArr, boolean[] zArr, C6272r1[][] r1VarArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (m8813B(list, iArr[i3])) {
                zArr[i3] = true;
                i2++;
            }
            r1VarArr[i3] = m8827x(list, iArr[i3]);
            if (r1VarArr[i3].length != 0) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: D */
    private static C4065i<C2017a>[] m8815D(int i) {
        return new C4065i[i];
    }

    /* renamed from: F */
    private static C6272r1[] m8816F(C4260e eVar, Pattern pattern, C6272r1 r1Var) {
        String str = eVar.f23675b;
        if (str == null) {
            return new C6272r1[]{r1Var};
        }
        String[] Q0 = C5953m0.m35101Q0(str, ";");
        C6272r1[] r1VarArr = new C6272r1[Q0.length];
        for (int i = 0; i < Q0.length; i++) {
            Matcher matcher = pattern.matcher(Q0[i]);
            if (!matcher.matches()) {
                return new C6272r1[]{r1Var};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            C6272r1.C6274b b = r1Var.mo21483b();
            r1VarArr[i] = b.mo21505S(r1Var.f30232a + ":" + parseInt).mo21492F(parseInt).mo21508V(matcher.group(2)).mo21491E();
        }
        return r1VarArr;
    }

    /* renamed from: H */
    private void m8817H(C5735s[] sVarArr, boolean[] zArr, C1749q0[] q0VarArr) {
        for (int i = 0; i < sVarArr.length; i++) {
            if (sVarArr[i] == null || !zArr[i]) {
                if (q0VarArr[i] instanceof C4065i) {
                    q0VarArr[i].mo17290O(this);
                } else if (q0VarArr[i] instanceof C4065i.C4066a) {
                    q0VarArr[i].mo17295c();
                }
                q0VarArr[i] = null;
            }
        }
    }

    /* renamed from: I */
    private void m8818I(C5735s[] sVarArr, C1749q0[] q0VarArr, int[] iArr) {
        boolean z;
        for (int i = 0; i < sVarArr.length; i++) {
            if ((q0VarArr[i] instanceof C1736n) || (q0VarArr[i] instanceof C4065i.C4066a)) {
                int z2 = m8829z(i, iArr);
                if (z2 == -1) {
                    z = q0VarArr[i] instanceof C1736n;
                } else {
                    z = (q0VarArr[i] instanceof C4065i.C4066a) && q0VarArr[i].f23196a == q0VarArr[z2];
                }
                if (!z) {
                    if (q0VarArr[i] instanceof C4065i.C4066a) {
                        q0VarArr[i].mo17295c();
                    }
                    q0VarArr[i] = null;
                }
            }
        }
    }

    /* renamed from: J */
    private void m8819J(C5735s[] sVarArr, C1749q0[] q0VarArr, boolean[] zArr, long j, int[] iArr) {
        for (int i = 0; i < sVarArr.length; i++) {
            C5735s sVar = sVarArr[i];
            if (sVar != null) {
                if (q0VarArr[i] == null) {
                    zArr[i] = true;
                    C2020a aVar = this.f5802s[iArr[i]];
                    int i2 = aVar.f5812c;
                    if (i2 == 0) {
                        q0VarArr[i] = m8822o(aVar, sVar, j);
                    } else if (i2 == 2) {
                        q0VarArr[i] = new C2025d(this.f5791F.get(aVar.f5813d), sVar.mo20142a().mo6897b(0), this.f5789D.f23650d);
                    }
                } else if (q0VarArr[i] instanceof C4065i) {
                    ((C2017a) q0VarArr[i].mo17284C()).mo7745d(sVar);
                }
            }
        }
        for (int i3 = 0; i3 < sVarArr.length; i3++) {
            if (q0VarArr[i3] == null && sVarArr[i3] != null) {
                C2020a aVar2 = this.f5802s[iArr[i3]];
                if (aVar2.f5812c == 1) {
                    int z = m8829z(i3, iArr);
                    if (z == -1) {
                        q0VarArr[i3] = new C1736n();
                    } else {
                        q0VarArr[i3] = q0VarArr[z].mo17292R(j, aVar2.f5811b);
                    }
                }
            }
        }
    }

    /* renamed from: j */
    private static void m8820j(List<C4261f> list, C1776x0[] x0VarArr, C2020a[] aVarArr, int i) {
        int i2 = 0;
        while (i2 < list.size()) {
            C4261f fVar = list.get(i2);
            C6272r1 E = new C6272r1.C6274b().mo21505S(fVar.mo17677a()).mo21517e0("application/x-emsg").mo21491E();
            x0VarArr[i] = new C1776x0(fVar.mo17677a() + ":" + i2, E);
            aVarArr[i] = C2020a.m8849c(i2);
            i2++;
            i++;
        }
    }

    /* renamed from: n */
    private static int m8821n(C4052y yVar, List<C4255a> list, int[][] iArr, int i, boolean[] zArr, C6272r1[][] r1VarArr, C1776x0[] x0VarArr, C2020a[] aVarArr) {
        String str;
        int i2;
        int i3;
        List<C4255a> list2 = list;
        int i4 = i;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i4) {
            int[] iArr2 = iArr[i5];
            ArrayList arrayList = new ArrayList();
            for (int i7 : iArr2) {
                arrayList.addAll(list2.get(i7).f23639c);
            }
            int size = arrayList.size();
            C6272r1[] r1VarArr2 = new C6272r1[size];
            for (int i8 = 0; i8 < size; i8++) {
                C6272r1 r1Var = ((C4265j) arrayList.get(i8)).f23697b;
                r1VarArr2[i8] = r1Var.mo21484c(yVar.mo17212e(r1Var));
            }
            C4052y yVar2 = yVar;
            C4255a aVar = list2.get(iArr2[0]);
            int i9 = aVar.f23637a;
            if (i9 != -1) {
                str = Integer.toString(i9);
            } else {
                str = "unset:" + i5;
            }
            int i10 = i6 + 1;
            if (zArr[i5]) {
                i2 = i10 + 1;
            } else {
                i2 = i10;
                i10 = -1;
            }
            if (r1VarArr[i5].length != 0) {
                i3 = i2 + 1;
            } else {
                i3 = i2;
                i2 = -1;
            }
            x0VarArr[i6] = new C1776x0(str, r1VarArr2);
            aVarArr[i6] = C2020a.m8850d(aVar.f23638b, iArr2, i6, i10, i2);
            if (i10 != -1) {
                String str2 = str + ":emsg";
                x0VarArr[i10] = new C1776x0(str2, new C6272r1.C6274b().mo21505S(str2).mo21517e0("application/x-emsg").mo21491E());
                aVarArr[i10] = C2020a.m8848b(iArr2, i6);
            }
            if (i2 != -1) {
                x0VarArr[i2] = new C1776x0(str + ":cc", r1VarArr[i5]);
                aVarArr[i2] = C2020a.m8847a(iArr2, i6);
            }
            i5++;
            i6 = i3;
        }
        return i6;
    }

    /* renamed from: o */
    private C4065i<C2017a> m8822o(C2020a aVar, C5735s sVar, long j) {
        int i;
        C1776x0 x0Var;
        C1776x0 x0Var2;
        int i2;
        C4065i<C2017a> iVar;
        C2020a aVar2 = aVar;
        int i3 = aVar2.f5815f;
        boolean z = i3 != -1;
        C2026e.C2029c cVar = null;
        if (z) {
            x0Var = this.f5801r.mo6903b(i3);
            i = 1;
        } else {
            x0Var = null;
            i = 0;
        }
        int i4 = aVar2.f5816g;
        boolean z2 = i4 != -1;
        if (z2) {
            x0Var2 = this.f5801r.mo6903b(i4);
            i += x0Var2.f5280a;
        } else {
            x0Var2 = null;
        }
        C6272r1[] r1VarArr = new C6272r1[i];
        int[] iArr = new int[i];
        if (z) {
            r1VarArr[0] = x0Var.mo6897b(0);
            iArr[0] = 5;
            i2 = 1;
        } else {
            i2 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z2) {
            for (int i5 = 0; i5 < x0Var2.f5280a; i5++) {
                r1VarArr[i2] = x0Var2.mo6897b(i5);
                iArr[i2] = 3;
                arrayList.add(r1VarArr[i2]);
                i2++;
            }
        }
        if (this.f5789D.f23650d && z) {
            cVar = this.f5804u.mo7781k();
        }
        C2026e.C2029c cVar2 = cVar;
        C2017a a = this.f5793b.mo7747a(this.f5799h, this.f5789D, this.f5797f, this.f5790E, aVar2.f5810a, sVar, aVar2.f5811b, this.f5798g, z, arrayList, cVar2, this.f5794c, this.f5808y);
        C4065i<C2017a> iVar2 = r1;
        C2026e.C2029c cVar3 = cVar2;
        C4065i<C2017a> iVar3 = new C4065i<>(aVar2.f5811b, iArr, r1VarArr, a, this, this.f5800i, j, this.f5795d, this.f5807x, this.f5796e, this.f5806w);
        synchronized (this) {
            iVar = iVar2;
            this.f5805v.put(iVar, cVar3);
        }
        return iVar;
    }

    /* renamed from: q */
    private static Pair<C1780z0, C2020a[]> m8823q(C4052y yVar, List<C4255a> list, List<C4261f> list2) {
        int[][] y = m8828y(list);
        int length = y.length;
        boolean[] zArr = new boolean[length];
        C6272r1[][] r1VarArr = new C6272r1[length][];
        int C = m8814C(length, list, y, zArr, r1VarArr) + length + list2.size();
        C1776x0[] x0VarArr = new C1776x0[C];
        C2020a[] aVarArr = new C2020a[C];
        m8820j(list2, x0VarArr, aVarArr, m8821n(yVar, list, y, length, zArr, r1VarArr, x0VarArr, aVarArr));
        return Pair.create(new C1780z0(x0VarArr), aVarArr);
    }

    /* renamed from: u */
    private static C4260e m8824u(List<C4260e> list) {
        return m8825v(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    /* renamed from: v */
    private static C4260e m8825v(List<C4260e> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            C4260e eVar = list.get(i);
            if (str.equals(eVar.f23674a)) {
                return eVar;
            }
        }
        return null;
    }

    /* renamed from: w */
    private static C4260e m8826w(List<C4260e> list) {
        return m8825v(list, "http://dashif.org/guidelines/trickmode");
    }

    /* renamed from: x */
    private static C6272r1[] m8827x(List<C4255a> list, int[] iArr) {
        for (int i : iArr) {
            C4255a aVar = list.get(i);
            List<C4260e> list2 = list.get(i).f23640d;
            int i2 = 0;
            while (i2 < list2.size()) {
                C4260e eVar = list2.get(i2);
                if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f23674a)) {
                    return m8816F(eVar, f5784G, new C6272r1.C6274b().mo21517e0("application/cea-608").mo21505S(aVar.f23637a + ":cea608").mo21491E());
                } else if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f23674a)) {
                    return m8816F(eVar, f5785H, new C6272r1.C6274b().mo21517e0("application/cea-708").mo21505S(aVar.f23637a + ":cea708").mo21491E());
                } else {
                    i2++;
                }
            }
        }
        return new C6272r1[0];
    }

    /* renamed from: y */
    private static int[][] m8828y(List<C4255a> list) {
        int i;
        C4260e u;
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i2 = 0; i2 < size; i2++) {
            sparseIntArray.put(list.get(i2).f23637a, i2);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i2));
            arrayList.add(arrayList2);
            sparseArray.put(i2, arrayList2);
        }
        for (int i3 = 0; i3 < size; i3++) {
            C4255a aVar = list.get(i3);
            C4260e w = m8826w(aVar.f23641e);
            if (w == null) {
                w = m8826w(aVar.f23642f);
            }
            if (w == null || (i = sparseIntArray.get(Integer.parseInt(w.f23675b), -1)) == -1) {
                i = i3;
            }
            if (i == i3 && (u = m8824u(aVar.f23642f)) != null) {
                for (String parseInt : C5953m0.m35101Q0(u.f23675b, ",")) {
                    int i4 = sparseIntArray.get(Integer.parseInt(parseInt), -1);
                    if (i4 != -1) {
                        i = Math.min(i, i4);
                    }
                }
            }
            if (i != i3) {
                List list2 = (List) sparseArray.get(i3);
                List list3 = (List) sparseArray.get(i);
                list3.addAll(list2);
                sparseArray.put(i3, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i5 = 0; i5 < size2; i5++) {
            iArr[i5] = C9998d.m51076k((Collection) arrayList.get(i5));
            Arrays.sort(iArr[i5]);
        }
        return iArr;
    }

    /* renamed from: z */
    private int m8829z(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        int i3 = this.f5802s[i2].f5814e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && this.f5802s[i5].f5812c == 0) {
                return i4;
            }
        }
        return -1;
    }

    /* renamed from: E */
    public void mo6684f(C4065i<C2017a> iVar) {
        this.f5809z.mo6684f(this);
    }

    /* renamed from: G */
    public void mo7749G() {
        this.f5804u.mo7784o();
        for (C4065i<C2017a> O : this.f5786A) {
            O.mo17290O(this);
        }
        this.f5809z = null;
    }

    /* renamed from: K */
    public void mo7750K(C4257c cVar, int i) {
        this.f5789D = cVar;
        this.f5790E = i;
        this.f5804u.mo7785q(cVar);
        C4065i<C2017a>[] iVarArr = this.f5786A;
        if (iVarArr != null) {
            for (C4065i<C2017a> C : iVarArr) {
                C.mo17284C().mo7746e(cVar, i);
            }
            this.f5809z.mo6684f(this);
        }
        this.f5791F = cVar.mo17624d(i).f23685d;
        for (C2025d dVar : this.f5787B) {
            Iterator<C4261f> it = this.f5791F.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C4261f next = it.next();
                if (next.mo17677a().equals(dVar.mo7776a())) {
                    boolean z = true;
                    int e = cVar.mo17625e() - 1;
                    if (!cVar.f23650d || i != e) {
                        z = false;
                    }
                    dVar.mo7778d(next, z);
                }
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo7751a(C4065i<C2017a> iVar) {
        C2026e.C2029c remove = this.f5805v.remove(iVar);
        if (remove != null) {
            remove.mo7789n();
        }
    }

    /* renamed from: c */
    public long mo6681c(long j, C6229i3 i3Var) {
        for (C4065i<C2017a> iVar : this.f5786A) {
            if (iVar.f23178a == 2) {
                return iVar.mo17293c(j, i3Var);
            }
        }
        return j;
    }

    /* renamed from: d */
    public long mo6682d() {
        return this.f5788C.mo6682d();
    }

    /* renamed from: e */
    public boolean mo6683e(long j) {
        return this.f5788C.mo6683e(j);
    }

    /* renamed from: g */
    public long mo6685g() {
        return this.f5788C.mo6685g();
    }

    /* renamed from: h */
    public void mo6686h(long j) {
        this.f5788C.mo6686h(j);
    }

    /* renamed from: i */
    public long mo6687i(C5735s[] sVarArr, boolean[] zArr, C1749q0[] q0VarArr, boolean[] zArr2, long j) {
        int[] A = m8812A(sVarArr);
        m8817H(sVarArr, zArr, q0VarArr);
        m8818I(sVarArr, q0VarArr, A);
        m8819J(sVarArr, q0VarArr, zArr2, j, A);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C4065i iVar : q0VarArr) {
            if (iVar instanceof C4065i) {
                arrayList.add(iVar);
            } else if (iVar instanceof C2025d) {
                arrayList2.add((C2025d) iVar);
            }
        }
        C4065i<C2017a>[] D = m8815D(arrayList.size());
        this.f5786A = D;
        arrayList.toArray(D);
        C2025d[] dVarArr = new C2025d[arrayList2.size()];
        this.f5787B = dVarArr;
        arrayList2.toArray(dVarArr);
        this.f5788C = this.f5803t.mo6743a(this.f5786A);
        return j;
    }

    public boolean isLoading() {
        return this.f5788C.isLoading();
    }

    /* renamed from: k */
    public void mo6690k() throws IOException {
        this.f5799h.mo7740b();
    }

    /* renamed from: m */
    public long mo6691m(long j) {
        for (C4065i<C2017a> Q : this.f5786A) {
            Q.mo17291Q(j);
        }
        for (C2025d c : this.f5787B) {
            c.mo7777c(j);
        }
        return j;
    }

    /* renamed from: p */
    public long mo6694p() {
        return -9223372036854775807L;
    }

    /* renamed from: r */
    public void mo6695r(C1765u.C1766a aVar, long j) {
        this.f5809z = aVar;
        aVar.mo6680b(this);
    }

    /* renamed from: s */
    public C1780z0 mo6696s() {
        return this.f5801r;
    }

    /* renamed from: t */
    public void mo6697t(long j, boolean z) {
        for (C4065i<C2017a> t : this.f5786A) {
            t.mo17294t(j, z);
        }
    }
}
