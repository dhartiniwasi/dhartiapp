package p149u3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p015b3.C1772x;
import p015b3.C1776x0;
import p031d3.C4072n;
import p031d3.C4073o;
import p149u3.C5735s;
import p155v3.C5798f;
import p161w3.C5923d;
import p161w3.C5953m0;
import p161w3.C5961r;
import p177z1.C6266q3;
import p177z1.C6272r1;
import p190b7.C6618b0;
import p190b7.C6685q;
import p190b7.C6696t;
import p190b7.C6702v;

/* renamed from: u3.a */
/* compiled from: AdaptiveTrackSelection */
public class C5713a extends C5719c {

    /* renamed from: h */
    private final C5798f f28506h;

    /* renamed from: i */
    private final long f28507i;

    /* renamed from: j */
    private final long f28508j;

    /* renamed from: k */
    private final long f28509k;

    /* renamed from: l */
    private final int f28510l;

    /* renamed from: m */
    private final int f28511m;

    /* renamed from: n */
    private final float f28512n;

    /* renamed from: o */
    private final float f28513o;

    /* renamed from: p */
    private final C6685q<C5714a> f28514p;

    /* renamed from: q */
    private final C5923d f28515q;

    /* renamed from: r */
    private float f28516r;

    /* renamed from: s */
    private int f28517s;

    /* renamed from: t */
    private int f28518t;

    /* renamed from: u */
    private long f28519u;

    /* renamed from: v */
    private C4072n f28520v;

    /* renamed from: u3.a$a */
    /* compiled from: AdaptiveTrackSelection */
    public static final class C5714a {

        /* renamed from: a */
        public final long f28521a;

        /* renamed from: b */
        public final long f28522b;

        public C5714a(long j, long j2) {
            this.f28521a = j;
            this.f28522b = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5714a)) {
                return false;
            }
            C5714a aVar = (C5714a) obj;
            if (this.f28521a == aVar.f28521a && this.f28522b == aVar.f28522b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f28521a) * 31) + ((int) this.f28522b);
        }
    }

    /* renamed from: u3.a$b */
    /* compiled from: AdaptiveTrackSelection */
    public static class C5715b implements C5735s.C5737b {

        /* renamed from: a */
        private final int f28523a;

        /* renamed from: b */
        private final int f28524b;

        /* renamed from: c */
        private final int f28525c;

        /* renamed from: d */
        private final int f28526d;

        /* renamed from: e */
        private final int f28527e;

        /* renamed from: f */
        private final float f28528f;

        /* renamed from: g */
        private final float f28529g;

        /* renamed from: h */
        private final C5923d f28530h;

        public C5715b() {
            this(10000, 25000, 25000, 0.7f);
        }

        /* renamed from: a */
        public final C5735s[] mo20131a(C5735s.C5736a[] aVarArr, C5798f fVar, C1772x.C1774b bVar, C6266q3 q3Var) {
            C5735s sVar;
            C6685q x = C5713a.m34054B(aVarArr);
            C5735s[] sVarArr = new C5735s[aVarArr.length];
            for (int i = 0; i < aVarArr.length; i++) {
                C5735s.C5736a aVar = aVarArr[i];
                if (aVar != null) {
                    int[] iArr = aVar.f28645b;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            sVar = new C5738t(aVar.f28644a, iArr[0], aVar.f28646c);
                        } else {
                            sVar = mo20132b(aVar.f28644a, iArr, aVar.f28646c, fVar, (C6685q) x.get(i));
                        }
                        sVarArr[i] = sVar;
                    }
                }
            }
            return sVarArr;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public C5713a mo20132b(C1776x0 x0Var, int[] iArr, int i, C5798f fVar, C6685q<C5714a> qVar) {
            return new C5713a(x0Var, iArr, i, fVar, (long) this.f28523a, (long) this.f28524b, (long) this.f28525c, this.f28526d, this.f28527e, this.f28528f, this.f28529g, qVar, this.f28530h);
        }

        public C5715b(int i, int i2, int i3, float f) {
            this(i, i2, i3, 1279, 719, f, 0.75f, C5923d.f29058a);
        }

        public C5715b(int i, int i2, int i3, int i4, int i5, float f, float f2, C5923d dVar) {
            this.f28523a = i;
            this.f28524b = i2;
            this.f28525c = i3;
            this.f28526d = i4;
            this.f28527e = i5;
            this.f28528f = f;
            this.f28529g = f2;
            this.f28530h = dVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C5713a(C1776x0 x0Var, int[] iArr, int i, C5798f fVar, long j, long j2, long j3, int i2, int i3, float f, float f2, List<C5714a> list, C5923d dVar) {
        super(x0Var, iArr, i);
        C5798f fVar2;
        long j4;
        if (j3 < j) {
            C5961r.m35215i("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            fVar2 = fVar;
            j4 = j;
        } else {
            fVar2 = fVar;
            j4 = j3;
        }
        this.f28506h = fVar2;
        this.f28507i = j * 1000;
        this.f28508j = j2 * 1000;
        this.f28509k = j4 * 1000;
        this.f28510l = i2;
        this.f28511m = i3;
        this.f28512n = f;
        this.f28513o = f2;
        this.f28514p = C6685q.m38443t(list);
        this.f28515q = dVar;
        this.f28516r = 1.0f;
        this.f28518t = 0;
        this.f28519u = -9223372036854775807L;
    }

    /* renamed from: A */
    private int m34053A(long j, long j2) {
        long C = m34055C(j2);
        int i = 0;
        for (int i2 = 0; i2 < this.f28534b; i2++) {
            if (j == Long.MIN_VALUE || !mo20151k(i2, j)) {
                C6272r1 c = mo20144c(i2);
                if (mo20128z(c, c.f30239h, C)) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public static C6685q<C6685q<C5714a>> m34054B(C5735s.C5736a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < aVarArr.length; i++) {
            if (aVarArr[i] == null || aVarArr[i].f28645b.length <= 1) {
                arrayList.add((Object) null);
            } else {
                C6685q.C6686a r = C6685q.m38441r();
                r.mo22506a(new C5714a(0, 0));
                arrayList.add(r);
            }
        }
        long[][] G = m34058G(aVarArr);
        int[] iArr = new int[G.length];
        long[] jArr = new long[G.length];
        for (int i2 = 0; i2 < G.length; i2++) {
            jArr[i2] = G[i2].length == 0 ? 0 : G[i2][0];
        }
        m34063y(arrayList, jArr);
        C6685q<Integer> H = m34059H(G);
        for (int i3 = 0; i3 < H.size(); i3++) {
            int intValue = H.get(i3).intValue();
            int i4 = iArr[intValue] + 1;
            iArr[intValue] = i4;
            jArr[intValue] = G[intValue][i4];
            m34063y(arrayList, jArr);
        }
        for (int i5 = 0; i5 < aVarArr.length; i5++) {
            if (arrayList.get(i5) != null) {
                jArr[i5] = jArr[i5] * 2;
            }
        }
        m34063y(arrayList, jArr);
        C6685q.C6686a r2 = C6685q.m38441r();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            C6685q.C6686a aVar = (C6685q.C6686a) arrayList.get(i6);
            r2.mo22506a(aVar == null ? C6685q.m38445x() : aVar.mo22547h());
        }
        return r2.mo22547h();
    }

    /* renamed from: C */
    private long m34055C(long j) {
        long I = m34060I(j);
        if (this.f28514p.isEmpty()) {
            return I;
        }
        int i = 1;
        while (i < this.f28514p.size() - 1 && this.f28514p.get(i).f28521a < I) {
            i++;
        }
        C5714a aVar = this.f28514p.get(i - 1);
        C5714a aVar2 = this.f28514p.get(i);
        long j2 = aVar.f28521a;
        long j3 = aVar.f28522b;
        return j3 + ((long) ((((float) (I - j2)) / ((float) (aVar2.f28521a - j2))) * ((float) (aVar2.f28522b - j3))));
    }

    /* renamed from: D */
    private long m34056D(List<? extends C4072n> list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        C4072n nVar = (C4072n) C6696t.m38506c(list);
        long j = nVar.f23168g;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = nVar.f23169h;
        if (j2 != -9223372036854775807L) {
            return j2 - j;
        }
        return -9223372036854775807L;
    }

    /* renamed from: F */
    private long m34057F(C4073o[] oVarArr, List<? extends C4072n> list) {
        int i = this.f28517s;
        if (i >= oVarArr.length || !oVarArr[i].next()) {
            for (C4073o oVar : oVarArr) {
                if (oVar.next()) {
                    return oVar.mo7775b() - oVar.mo7774a();
                }
            }
            return m34056D(list);
        }
        C4073o oVar2 = oVarArr[this.f28517s];
        return oVar2.mo7775b() - oVar2.mo7774a();
    }

    /* renamed from: G */
    private static long[][] m34058G(C5735s.C5736a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i = 0; i < aVarArr.length; i++) {
            C5735s.C5736a aVar = aVarArr[i];
            if (aVar == null) {
                jArr[i] = new long[0];
            } else {
                jArr[i] = new long[aVar.f28645b.length];
                int i2 = 0;
                while (true) {
                    int[] iArr = aVar.f28645b;
                    if (i2 >= iArr.length) {
                        break;
                    }
                    jArr[i][i2] = (long) aVar.f28644a.mo6897b(iArr[i2]).f30239h;
                    i2++;
                }
                Arrays.sort(jArr[i]);
            }
        }
        return jArr;
    }

    /* renamed from: H */
    private static C6685q<Integer> m34059H(long[][] jArr) {
        double d;
        long[][] jArr2 = jArr;
        C6702v<K, V> c = C6618b0.m38246a().mo22258a().mo22257c();
        for (int i = 0; i < jArr2.length; i++) {
            if (jArr2[i].length > 1) {
                int length = jArr2[i].length;
                double[] dArr = new double[length];
                int i2 = 0;
                while (true) {
                    double d2 = 0.0d;
                    if (i2 >= jArr2[i].length) {
                        break;
                    }
                    if (jArr2[i][i2] != -1) {
                        d2 = Math.log((double) jArr2[i][i2]);
                    }
                    dArr[i2] = d2;
                    i2++;
                }
                int i3 = length - 1;
                double d3 = dArr[i3] - dArr[0];
                int i4 = 0;
                while (i4 < i3) {
                    double d4 = dArr[i4];
                    i4++;
                    double d5 = (d4 + dArr[i4]) * 0.5d;
                    if (d3 == 0.0d) {
                        d = 1.0d;
                    } else {
                        d = (d5 - dArr[0]) / d3;
                    }
                    c.put(Double.valueOf(d), Integer.valueOf(i));
                }
            }
        }
        return C6685q.m38443t(c.values());
    }

    /* renamed from: I */
    private long m34060I(long j) {
        long g = (long) (((float) this.f28506h.mo20320g()) * this.f28512n);
        long b = this.f28506h.mo20316b();
        if (b == -9223372036854775807L || j == -9223372036854775807L) {
            return (long) (((float) g) / this.f28516r);
        }
        float f = (float) j;
        return (long) ((((float) g) * Math.max((f / this.f28516r) - ((float) b), 0.0f)) / f);
    }

    /* renamed from: J */
    private long m34061J(long j, long j2) {
        if (j == -9223372036854775807L) {
            return this.f28507i;
        }
        if (j2 != -9223372036854775807L) {
            j -= j2;
        }
        return Math.min((long) (((float) j) * this.f28513o), this.f28507i);
    }

    /* renamed from: y */
    private static void m34063y(List<C6685q.C6686a<C5714a>> list, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < list.size(); i++) {
            C6685q.C6686a aVar = list.get(i);
            if (aVar != null) {
                aVar.mo22506a(new C5714a(j, jArr[i]));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public long mo20122E() {
        return this.f28509k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public boolean mo20123K(long j, List<? extends C4072n> list) {
        long j2 = this.f28519u;
        return j2 == -9223372036854775807L || j - j2 >= 1000 || (!list.isEmpty() && !((C4072n) C6696t.m38506c(list)).equals(this.f28520v));
    }

    /* renamed from: f */
    public void mo20124f() {
        this.f28520v = null;
    }

    /* renamed from: h */
    public void mo17829h(long j, long j2, long j3, List<? extends C4072n> list, C4073o[] oVarArr) {
        long b = this.f28515q.mo20586b();
        long F = m34057F(oVarArr, list);
        int i = this.f28518t;
        if (i == 0) {
            this.f28518t = 1;
            this.f28517s = m34053A(b, F);
            return;
        }
        int i2 = this.f28517s;
        int b2 = list.isEmpty() ? -1 : mo20143b(((C4072n) C6696t.m38506c(list)).f23165d);
        if (b2 != -1) {
            i = ((C4072n) C6696t.m38506c(list)).f23166e;
            i2 = b2;
        }
        int A = m34053A(b, F);
        if (!mo20151k(i2, b)) {
            C6272r1 c = mo20144c(i2);
            C6272r1 c2 = mo20144c(A);
            long J = m34061J(j3, F);
            int i3 = c2.f30239h;
            int i4 = c.f30239h;
            if ((i3 > i4 && j2 < J) || (i3 < i4 && j2 >= this.f28508j)) {
                A = i2;
            }
        }
        if (A != i2) {
            i = 3;
        }
        this.f28518t = i;
        this.f28517s = A;
    }

    /* renamed from: i */
    public int mo17830i() {
        return this.f28517s;
    }

    /* renamed from: m */
    public void mo20125m() {
        this.f28519u = -9223372036854775807L;
        this.f28520v = null;
    }

    /* renamed from: n */
    public int mo20126n(long j, List<? extends C4072n> list) {
        int i;
        int i2;
        long b = this.f28515q.mo20586b();
        if (!mo20123K(b, list)) {
            return list.size();
        }
        this.f28519u = b;
        this.f28520v = list.isEmpty() ? null : (C4072n) C6696t.m38506c(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long e0 = C5953m0.m35129e0(((C4072n) list.get(size - 1)).f23168g - j, this.f28516r);
        long E = mo20122E();
        if (e0 < E) {
            return size;
        }
        C6272r1 c = mo20144c(m34053A(b, m34056D(list)));
        for (int i3 = 0; i3 < size; i3++) {
            C4072n nVar = (C4072n) list.get(i3);
            C6272r1 r1Var = nVar.f23165d;
            if (C5953m0.m35129e0(nVar.f23168g - j, this.f28516r) >= E && r1Var.f30239h < c.f30239h && (i = r1Var.f30249z) != -1 && i <= this.f28511m && (i2 = r1Var.f30248y) != -1 && i2 <= this.f28510l && i < c.f30249z) {
                return i3;
            }
        }
        return size;
    }

    /* renamed from: q */
    public int mo17831q() {
        return this.f28518t;
    }

    /* renamed from: r */
    public void mo20127r(float f) {
        this.f28516r = f;
    }

    /* renamed from: s */
    public Object mo17832s() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public boolean mo20128z(C6272r1 r1Var, int i, long j) {
        return ((long) i) <= j;
    }
}
