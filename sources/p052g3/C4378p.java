package p052g3;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p015b3.C1700e0;
import p015b3.C1743p0;
import p015b3.C1748q;
import p015b3.C1749q0;
import p015b3.C1752r0;
import p015b3.C1759t;
import p015b3.C1776x0;
import p015b3.C1780z0;
import p021c2.C1848g;
import p030d2.C4035m;
import p030d2.C4048w;
import p030d2.C4052y;
import p031d3.C4060f;
import p037e2.C4192b0;
import p037e2.C4198d0;
import p037e2.C4200e0;
import p037e2.C4214k;
import p037e2.C4217n;
import p052g3.C4366f;
import p127r2.C5432a;
import p141t2.C5507a;
import p141t2.C5509b;
import p149u3.C5716a0;
import p155v3.C5789b;
import p155v3.C5794c0;
import p155v3.C5804g0;
import p155v3.C5810h0;
import p155v3.C5819i;
import p160w2.C5911l;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5953m0;
import p161w3.C5961r;
import p161w3.C5967v;
import p177z1.C6229i3;
import p177z1.C6249m2;
import p177z1.C6272r1;
import p177z1.C6279s1;
import p190b7.C6685q;
import p190b7.C6696t;

/* renamed from: g3.p */
/* compiled from: HlsSampleStreamWrapper */
final class C4378p implements C5810h0.C5812b<C4060f>, C5810h0.C5816f, C1752r0, C4217n, C1743p0.C1747d {

    /* renamed from: n0 */
    private static final Set<Integer> f24410n0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{1, 2, 5})));

    /* renamed from: A */
    private final ArrayList<C4377l> f24411A;

    /* renamed from: B */
    private final Map<String, C4035m> f24412B;

    /* renamed from: C */
    private C4060f f24413C;

    /* renamed from: D */
    private C4382d[] f24414D;

    /* renamed from: E */
    private int[] f24415E = new int[0];

    /* renamed from: F */
    private Set<Integer> f24416F;

    /* renamed from: G */
    private SparseIntArray f24417G;

    /* renamed from: H */
    private C4200e0 f24418H;

    /* renamed from: I */
    private int f24419I;

    /* renamed from: J */
    private int f24420J;

    /* renamed from: K */
    private boolean f24421K;

    /* renamed from: L */
    private boolean f24422L;

    /* renamed from: M */
    private int f24423M;

    /* renamed from: N */
    private C6272r1 f24424N;

    /* renamed from: O */
    private C6272r1 f24425O;

    /* renamed from: P */
    private boolean f24426P;

    /* renamed from: Q */
    private C1780z0 f24427Q;

    /* renamed from: R */
    private Set<C1776x0> f24428R;

    /* renamed from: S */
    private int[] f24429S;

    /* renamed from: a */
    private final String f24430a;

    /* renamed from: a0 */
    private int f24431a0;

    /* renamed from: b */
    private final int f24432b;

    /* renamed from: b0 */
    private boolean f24433b0;

    /* renamed from: c */
    private final C4380b f24434c;

    /* renamed from: c0 */
    private boolean[] f24435c0;

    /* renamed from: d */
    private final C4366f f24436d;

    /* renamed from: d0 */
    private boolean[] f24437d0;

    /* renamed from: e */
    private final C5789b f24438e;

    /* renamed from: e0 */
    private long f24439e0;

    /* renamed from: f */
    private final C6272r1 f24440f;

    /* renamed from: f0 */
    private long f24441f0;

    /* renamed from: g */
    private final C4052y f24442g;

    /* renamed from: g0 */
    private boolean f24443g0;

    /* renamed from: h */
    private final C4048w.C4049a f24444h;

    /* renamed from: h0 */
    private boolean f24445h0;

    /* renamed from: i */
    private final C5804g0 f24446i;

    /* renamed from: i0 */
    private boolean f24447i0;

    /* renamed from: j0 */
    private boolean f24448j0;

    /* renamed from: k0 */
    private long f24449k0;

    /* renamed from: l0 */
    private C4035m f24450l0;

    /* renamed from: m0 */
    private C4374i f24451m0;

    /* renamed from: r */
    private final C5810h0 f24452r = new C5810h0("Loader:HlsSampleStreamWrapper");

    /* renamed from: s */
    private final C1700e0.C1701a f24453s;

    /* renamed from: t */
    private final int f24454t;

    /* renamed from: u */
    private final C4366f.C4368b f24455u = new C4366f.C4368b();

    /* renamed from: v */
    private final ArrayList<C4374i> f24456v;

    /* renamed from: w */
    private final List<C4374i> f24457w;

    /* renamed from: x */
    private final Runnable f24458x;

    /* renamed from: y */
    private final Runnable f24459y;

    /* renamed from: z */
    private final Handler f24460z;

    /* renamed from: g3.p$b */
    /* compiled from: HlsSampleStreamWrapper */
    public interface C4380b extends C1752r0.C1753a<C4378p> {
        /* renamed from: l */
        void mo17840l(Uri uri);

        void onPrepared();
    }

    /* renamed from: g3.p$c */
    /* compiled from: HlsSampleStreamWrapper */
    private static class C4381c implements C4200e0 {

        /* renamed from: g */
        private static final C6272r1 f24461g = new C6272r1.C6274b().mo21517e0("application/id3").mo21491E();

        /* renamed from: h */
        private static final C6272r1 f24462h = new C6272r1.C6274b().mo21517e0("application/x-emsg").mo21491E();

        /* renamed from: a */
        private final C5509b f24463a = new C5509b();

        /* renamed from: b */
        private final C4200e0 f24464b;

        /* renamed from: c */
        private final C6272r1 f24465c;

        /* renamed from: d */
        private C6272r1 f24466d;

        /* renamed from: e */
        private byte[] f24467e;

        /* renamed from: f */
        private int f24468f;

        public C4381c(C4200e0 e0Var, int i) {
            this.f24464b = e0Var;
            if (i == 1) {
                this.f24465c = f24461g;
            } else if (i == 3) {
                this.f24465c = f24462h;
            } else {
                throw new IllegalArgumentException("Unknown metadataType: " + i);
            }
            this.f24467e = new byte[0];
            this.f24468f = 0;
        }

        /* renamed from: g */
        private boolean m29185g(C5507a aVar) {
            C6272r1 c0 = aVar.mo17875c0();
            return c0 != null && C5953m0.m35124c(this.f24465c.f30243t, c0.f30243t);
        }

        /* renamed from: h */
        private void m29186h(int i) {
            byte[] bArr = this.f24467e;
            if (bArr.length < i) {
                this.f24467e = Arrays.copyOf(bArr, i + (i / 2));
            }
        }

        /* renamed from: i */
        private C5918a0 m29187i(int i, int i2) {
            int i3 = this.f24468f - i2;
            C5918a0 a0Var = new C5918a0(Arrays.copyOfRange(this.f24467e, i3 - i, i3));
            byte[] bArr = this.f24467e;
            System.arraycopy(bArr, i3, bArr, 0, i2);
            this.f24468f = i2;
            return a0Var;
        }

        /* renamed from: a */
        public void mo6838a(long j, int i, int i2, int i3, C4200e0.C4201a aVar) {
            C5917a.m34872e(this.f24466d);
            C5918a0 i4 = m29187i(i2, i3);
            if (!C5953m0.m35124c(this.f24466d.f30243t, this.f24465c.f30243t)) {
                if ("application/x-emsg".equals(this.f24466d.f30243t)) {
                    C5507a c = this.f24463a.mo19790c(i4);
                    if (!m29185g(c)) {
                        C5961r.m35215i("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", new Object[]{this.f24465c.f30243t, c.mo17875c0()}));
                        return;
                    }
                    i4 = new C5918a0((byte[]) C5917a.m34872e(c.mo17880u1()));
                } else {
                    C5961r.m35215i("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f24466d.f30243t);
                    return;
                }
            }
            int a = i4.mo20548a();
            this.f24464b.mo6843d(i4, a);
            this.f24464b.mo6838a(j, i, a, i3, aVar);
        }

        /* renamed from: b */
        public /* synthetic */ int mo6840b(C5819i iVar, int i, boolean z) {
            return C4198d0.m28382a(this, iVar, i, z);
        }

        /* renamed from: c */
        public int mo6842c(C5819i iVar, int i, boolean z, int i2) throws IOException {
            m29186h(this.f24468f + i);
            int read = iVar.read(this.f24467e, this.f24468f, i);
            if (read != -1) {
                this.f24468f += read;
                return read;
            } else if (z) {
                return -1;
            } else {
                throw new EOFException();
            }
        }

        /* renamed from: d */
        public /* synthetic */ void mo6843d(C5918a0 a0Var, int i) {
            C4198d0.m28383b(this, a0Var, i);
        }

        /* renamed from: e */
        public void mo6845e(C6272r1 r1Var) {
            this.f24466d = r1Var;
            this.f24464b.mo6845e(this.f24465c);
        }

        /* renamed from: f */
        public void mo6847f(C5918a0 a0Var, int i, int i2) {
            m29186h(this.f24468f + i);
            a0Var.mo20557j(this.f24467e, this.f24468f, i);
            this.f24468f += i;
        }
    }

    /* renamed from: g3.p$d */
    /* compiled from: HlsSampleStreamWrapper */
    private static final class C4382d extends C1743p0 {

        /* renamed from: H */
        private final Map<String, C4035m> f24469H;

        /* renamed from: I */
        private C4035m f24470I;

        /* renamed from: h0 */
        private C5432a m29194h0(C5432a aVar) {
            if (aVar == null) {
                return null;
            }
            int d = aVar.mo19696d();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= d) {
                    i2 = -1;
                    break;
                }
                C5432a.C5434b c = aVar.mo19695c(i2);
                if ((c instanceof C5911l) && "com.apple.streaming.transportStreamTimestamp".equals(((C5911l) c).f29041b)) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return aVar;
            }
            if (d == 1) {
                return null;
            }
            C5432a.C5434b[] bVarArr = new C5432a.C5434b[(d - 1)];
            while (i < d) {
                if (i != i2) {
                    bVarArr[i < i2 ? i : i - 1] = aVar.mo19695c(i);
                }
                i++;
            }
            return new C5432a(bVarArr);
        }

        /* renamed from: a */
        public void mo6838a(long j, int i, int i2, int i3, C4200e0.C4201a aVar) {
            super.mo6838a(j, i, i2, i3, aVar);
        }

        /* renamed from: i0 */
        public void mo17872i0(C4035m mVar) {
            this.f24470I = mVar;
            mo6826I();
        }

        /* renamed from: j0 */
        public void mo17873j0(C4374i iVar) {
            mo6848f0(iVar.f24367k);
        }

        /* renamed from: w */
        public C6272r1 mo6855w(C6272r1 r1Var) {
            C4035m mVar;
            C4035m mVar2 = this.f24470I;
            if (mVar2 == null) {
                mVar2 = r1Var.f30246w;
            }
            if (!(mVar2 == null || (mVar = this.f24469H.get(mVar2.f23114c)) == null)) {
                mVar2 = mVar;
            }
            C5432a h0 = m29194h0(r1Var.f30241r);
            if (!(mVar2 == r1Var.f30246w && h0 == r1Var.f30241r)) {
                r1Var = r1Var.mo21483b().mo21499M(mVar2).mo21510X(h0).mo21491E();
            }
            return super.mo6855w(r1Var);
        }

        private C4382d(C5789b bVar, C4052y yVar, C4048w.C4049a aVar, Map<String, C4035m> map) {
            super(bVar, yVar, aVar);
            this.f24469H = map;
        }
    }

    public C4378p(String str, int i, C4380b bVar, C4366f fVar, Map<String, C4035m> map, C5789b bVar2, long j, C6272r1 r1Var, C4052y yVar, C4048w.C4049a aVar, C5804g0 g0Var, C1700e0.C1701a aVar2, int i2) {
        this.f24430a = str;
        this.f24432b = i;
        this.f24434c = bVar;
        this.f24436d = fVar;
        this.f24412B = map;
        this.f24438e = bVar2;
        this.f24440f = r1Var;
        this.f24442g = yVar;
        this.f24444h = aVar;
        this.f24446i = g0Var;
        this.f24453s = aVar2;
        this.f24454t = i2;
        Set<Integer> set = f24410n0;
        this.f24416F = new HashSet(set.size());
        this.f24417G = new SparseIntArray(set.size());
        this.f24414D = new C4382d[0];
        this.f24437d0 = new boolean[0];
        this.f24435c0 = new boolean[0];
        ArrayList<C4374i> arrayList = new ArrayList<>();
        this.f24456v = arrayList;
        this.f24457w = Collections.unmodifiableList(arrayList);
        this.f24411A = new ArrayList<>();
        this.f24458x = new C10207o(this);
        this.f24459y = new C10206n(this);
        this.f24460z = C5953m0.m35164w();
        this.f24439e0 = j;
        this.f24441f0 = j;
    }

    /* renamed from: B */
    private static C4214k m29120B(int i, int i2) {
        C5961r.m35215i("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i2);
        return new C4214k();
    }

    /* renamed from: C */
    private C1743p0 m29121C(int i, int i2) {
        int length = this.f24414D.length;
        boolean z = true;
        if (!(i2 == 1 || i2 == 2)) {
            z = false;
        }
        C4382d dVar = new C4382d(this.f24438e, this.f24442g, this.f24444h, this.f24412B);
        dVar.mo6841b0(this.f24439e0);
        if (z) {
            dVar.mo17872i0(this.f24450l0);
        }
        dVar.mo6839a0(this.f24449k0);
        C4374i iVar = this.f24451m0;
        if (iVar != null) {
            dVar.mo17873j0(iVar);
        }
        dVar.mo6844d0(this);
        int i3 = length + 1;
        int[] copyOf = Arrays.copyOf(this.f24415E, i3);
        this.f24415E = copyOf;
        copyOf[length] = i;
        this.f24414D = (C4382d[]) C5953m0.m35077E0(this.f24414D, dVar);
        boolean[] copyOf2 = Arrays.copyOf(this.f24437d0, i3);
        this.f24437d0 = copyOf2;
        copyOf2[length] = z;
        this.f24433b0 = copyOf2[length] | this.f24433b0;
        this.f24416F.add(Integer.valueOf(i2));
        this.f24417G.append(i2, length);
        if (m29130L(i2) > m29130L(this.f24419I)) {
            this.f24420J = length;
            this.f24419I = i2;
        }
        this.f24435c0 = Arrays.copyOf(this.f24435c0, i3);
        return dVar;
    }

    /* renamed from: D */
    private C1780z0 m29122D(C1776x0[] x0VarArr) {
        for (int i = 0; i < x0VarArr.length; i++) {
            C1776x0 x0Var = x0VarArr[i];
            C6272r1[] r1VarArr = new C6272r1[x0Var.f5280a];
            for (int i2 = 0; i2 < x0Var.f5280a; i2++) {
                C6272r1 b = x0Var.mo6897b(i2);
                r1VarArr[i2] = b.mo21484c(this.f24442g.mo17212e(b));
            }
            x0VarArr[i] = new C1776x0(x0Var.f5281b, r1VarArr);
        }
        return new C1780z0(x0VarArr);
    }

    /* renamed from: E */
    private static C6272r1 m29123E(C6272r1 r1Var, C6272r1 r1Var2, boolean z) {
        String str;
        String str2;
        if (r1Var == null) {
            return r1Var2;
        }
        int k = C5967v.m35247k(r1Var2.f30243t);
        if (C5953m0.m35088K(r1Var.f30240i, k) == 1) {
            str2 = C5953m0.m35090L(r1Var.f30240i, k);
            str = C5967v.m35243g(str2);
        } else {
            str2 = C5967v.m35240d(r1Var.f30240i, r1Var2.f30243t);
            str = r1Var2.f30243t;
        }
        C6272r1.C6274b I = r1Var2.mo21483b().mo21505S(r1Var.f30232a).mo21507U(r1Var.f30233b).mo21508V(r1Var.f30234c).mo21519g0(r1Var.f30235d).mo21515c0(r1Var.f30236e).mo21493G(z ? r1Var.f30237f : -1).mo21512Z(z ? r1Var.f30238g : -1).mo21495I(str2);
        if (k == 2) {
            I.mo21522j0(r1Var.f30248y).mo21503Q(r1Var.f30249z).mo21502P(r1Var.f30218A);
        }
        if (str != null) {
            I.mo21517e0(str);
        }
        int i = r1Var.f30224G;
        if (i != -1 && k == 1) {
            I.mo21494H(i);
        }
        C5432a aVar = r1Var.f30241r;
        if (aVar != null) {
            C5432a aVar2 = r1Var2.f30241r;
            if (aVar2 != null) {
                aVar = aVar2.mo19694b(aVar);
            }
            I.mo21510X(aVar);
        }
        return I.mo21491E();
    }

    /* renamed from: F */
    private void m29124F(int i) {
        C5917a.m34873f(!this.f24452r.mo20337j());
        while (true) {
            if (i >= this.f24456v.size()) {
                i = -1;
                break;
            } else if (m29145z(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            long j = m29128J().f23169h;
            C4374i G = m29125G(i);
            if (this.f24456v.isEmpty()) {
                this.f24441f0 = this.f24439e0;
            } else {
                ((C4374i) C6696t.m38506c(this.f24456v)).mo17835o();
            }
            this.f24447i0 = false;
            this.f24453s.mo6716D(this.f24419I, G.f23168g, j);
        }
    }

    /* renamed from: G */
    private C4374i m29125G(int i) {
        C4374i iVar = this.f24456v.get(i);
        ArrayList<C4374i> arrayList = this.f24456v;
        C5953m0.m35093M0(arrayList, i, arrayList.size());
        for (int i2 = 0; i2 < this.f24414D.length; i2++) {
            this.f24414D[i2].mo6854u(iVar.mo17833m(i2));
        }
        return iVar;
    }

    /* renamed from: H */
    private boolean m29126H(C4374i iVar) {
        int i = iVar.f24367k;
        int length = this.f24414D.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f24435c0[i2] && this.f24414D[i2].mo6830Q() == i) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: I */
    private static boolean m29127I(C6272r1 r1Var, C6272r1 r1Var2) {
        String str = r1Var.f30243t;
        String str2 = r1Var2.f30243t;
        int k = C5967v.m35247k(str);
        if (k != 3) {
            if (k == C5967v.m35247k(str2)) {
                return true;
            }
            return false;
        } else if (!C5953m0.m35124c(str, str2)) {
            return false;
        } else {
            if (("application/cea-608".equals(str) || "application/cea-708".equals(str)) && r1Var.f30229L != r1Var2.f30229L) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: J */
    private C4374i m29128J() {
        ArrayList<C4374i> arrayList = this.f24456v;
        return arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: K */
    private C4200e0 m29129K(int i, int i2) {
        C5917a.m34868a(f24410n0.contains(Integer.valueOf(i2)));
        int i3 = this.f24417G.get(i2, -1);
        if (i3 == -1) {
            return null;
        }
        if (this.f24416F.add(Integer.valueOf(i2))) {
            this.f24415E[i3] = i;
        }
        if (this.f24415E[i3] == i) {
            return this.f24414D[i3];
        }
        return m29120B(i, i2);
    }

    /* renamed from: L */
    private static int m29130L(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    /* renamed from: M */
    private void m29131M(C4374i iVar) {
        this.f24451m0 = iVar;
        this.f24424N = iVar.f23165d;
        this.f24441f0 = -9223372036854775807L;
        this.f24456v.add(iVar);
        C6685q.C6686a r = C6685q.m38441r();
        for (C4382d G : this.f24414D) {
            r.mo22506a(Integer.valueOf(G.mo6825G()));
        }
        iVar.mo17834n(this, r.mo22547h());
        for (C4382d dVar : this.f24414D) {
            dVar.mo17873j0(iVar);
            if (iVar.f24370n) {
                dVar.mo6849g0();
            }
        }
    }

    /* renamed from: N */
    private static boolean m29132N(C4060f fVar) {
        return fVar instanceof C4374i;
    }

    /* renamed from: O */
    private boolean m29133O() {
        return this.f24441f0 != -9223372036854775807L;
    }

    /* renamed from: R */
    private void m29134R() {
        int i = this.f24427Q.f5296a;
        int[] iArr = new int[i];
        this.f24429S = iArr;
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = 0;
            while (true) {
                C4382d[] dVarArr = this.f24414D;
                if (i3 >= dVarArr.length) {
                    break;
                } else if (m29127I((C6272r1) C5917a.m34875h(dVarArr[i3].mo6824F()), this.f24427Q.mo6903b(i2).mo6897b(0))) {
                    this.f24429S[i2] = i3;
                    break;
                } else {
                    i3++;
                }
            }
        }
        Iterator<C4377l> it = this.f24411A.iterator();
        while (it.hasNext()) {
            it.next().mo17844a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public void m29135S() {
        if (!this.f24426P && this.f24429S == null && this.f24421K) {
            C4382d[] dVarArr = this.f24414D;
            int length = dVarArr.length;
            int i = 0;
            while (i < length) {
                if (dVarArr[i].mo6824F() != null) {
                    i++;
                } else {
                    return;
                }
            }
            if (this.f24427Q != null) {
                m29134R();
                return;
            }
            m29144y();
            m29139k0();
            this.f24434c.onPrepared();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m29136b0() {
        this.f24421K = true;
        m29135S();
    }

    /* renamed from: f0 */
    private void m29137f0() {
        for (C4382d W : this.f24414D) {
            W.mo6835W(this.f24443g0);
        }
        this.f24443g0 = false;
    }

    /* renamed from: g0 */
    private boolean m29138g0(long j) {
        int length = this.f24414D.length;
        for (int i = 0; i < length; i++) {
            if (!this.f24414D[i].mo6837Z(j, false) && (this.f24437d0[i] || !this.f24433b0)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k0 */
    private void m29139k0() {
        this.f24422L = true;
    }

    /* renamed from: p0 */
    private void m29140p0(C1749q0[] q0VarArr) {
        this.f24411A.clear();
        for (C4377l lVar : q0VarArr) {
            if (lVar != null) {
                this.f24411A.add(lVar);
            }
        }
    }

    /* renamed from: w */
    private void m29143w() {
        C5917a.m34873f(this.f24422L);
        C5917a.m34872e(this.f24427Q);
        C5917a.m34872e(this.f24428R);
    }

    /* renamed from: y */
    private void m29144y() {
        C6272r1 r1Var;
        C6272r1 r1Var2;
        int length = this.f24414D.length;
        boolean z = false;
        int i = 0;
        int i2 = -2;
        int i3 = -1;
        while (true) {
            int i4 = 2;
            if (i >= length) {
                break;
            }
            String str = ((C6272r1) C5917a.m34875h(this.f24414D[i].mo6824F())).f30243t;
            if (!C5967v.m35255s(str)) {
                if (C5967v.m35251o(str)) {
                    i4 = 1;
                } else {
                    i4 = C5967v.m35254r(str) ? 3 : -2;
                }
            }
            if (m29130L(i4) > m29130L(i2)) {
                i3 = i;
                i2 = i4;
            } else if (i4 == i2 && i3 != -1) {
                i3 = -1;
            }
            i++;
        }
        C1776x0 j = this.f24436d.mo17816j();
        int i5 = j.f5280a;
        this.f24431a0 = -1;
        this.f24429S = new int[length];
        for (int i6 = 0; i6 < length; i6++) {
            this.f24429S[i6] = i6;
        }
        C1776x0[] x0VarArr = new C1776x0[length];
        int i7 = 0;
        while (i7 < length) {
            C6272r1 r1Var3 = (C6272r1) C5917a.m34875h(this.f24414D[i7].mo6824F());
            if (i7 == i3) {
                C6272r1[] r1VarArr = new C6272r1[i5];
                for (int i8 = 0; i8 < i5; i8++) {
                    C6272r1 b = j.mo6897b(i8);
                    if (i2 == 1 && (r1Var2 = this.f24440f) != null) {
                        b = b.mo21489j(r1Var2);
                    }
                    if (i5 == 1) {
                        r1Var = r1Var3.mo21489j(b);
                    } else {
                        r1Var = m29123E(b, r1Var3, true);
                    }
                    r1VarArr[i8] = r1Var;
                }
                x0VarArr[i7] = new C1776x0(this.f24430a, r1VarArr);
                this.f24431a0 = i7;
            } else {
                C6272r1 r1Var4 = (i2 != 2 || !C5967v.m35251o(r1Var3.f30243t)) ? null : this.f24440f;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f24430a);
                sb.append(":muxed:");
                sb.append(i7 < i3 ? i7 : i7 - 1);
                x0VarArr[i7] = new C1776x0(sb.toString(), m29123E(r1Var4, r1Var3, false));
            }
            i7++;
        }
        this.f24427Q = m29122D(x0VarArr);
        if (this.f24428R == null) {
            z = true;
        }
        C5917a.m34873f(z);
        this.f24428R = Collections.emptySet();
    }

    /* renamed from: z */
    private boolean m29145z(int i) {
        for (int i2 = i; i2 < this.f24456v.size(); i2++) {
            if (this.f24456v.get(i2).f24370n) {
                return false;
            }
        }
        C4374i iVar = this.f24456v.get(i);
        for (int i3 = 0; i3 < this.f24414D.length; i3++) {
            if (this.f24414D[i3].mo6822C() > iVar.mo17833m(i3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: A */
    public void mo17846A() {
        if (!this.f24422L) {
            mo6683e(this.f24439e0);
        }
    }

    /* renamed from: P */
    public boolean mo17847P(int i) {
        return !m29133O() && this.f24414D[i].mo6828K(this.f24447i0);
    }

    /* renamed from: Q */
    public boolean mo17848Q() {
        return this.f24419I == 2;
    }

    /* renamed from: T */
    public void mo17849T() throws IOException {
        this.f24452r.mo7740b();
        this.f24436d.mo17819n();
    }

    /* renamed from: U */
    public void mo17850U(int i) throws IOException {
        mo17849T();
        this.f24414D[i].mo6829N();
    }

    /* renamed from: V */
    public void mo6784q(C4060f fVar, long j, long j2, boolean z) {
        C4060f fVar2 = fVar;
        this.f24413C = null;
        C1748q qVar = new C1748q(fVar2.f23162a, fVar2.f23163b, fVar.mo17281f(), fVar.mo17280e(), j, j2, fVar.mo17278a());
        this.f24446i.mo20330b(fVar2.f23162a);
        this.f24453s.mo6723r(qVar, fVar2.f23164c, this.f24432b, fVar2.f23165d, fVar2.f23166e, fVar2.f23167f, fVar2.f23168g, fVar2.f23169h);
        if (!z) {
            if (m29133O() || this.f24423M == 0) {
                m29137f0();
            }
            if (this.f24423M > 0) {
                this.f24434c.mo6684f(this);
            }
        }
    }

    /* renamed from: W */
    public void mo6780j(C4060f fVar, long j, long j2) {
        C4060f fVar2 = fVar;
        this.f24413C = null;
        this.f24436d.mo17821p(fVar2);
        C1748q qVar = new C1748q(fVar2.f23162a, fVar2.f23163b, fVar.mo17281f(), fVar.mo17280e(), j, j2, fVar.mo17278a());
        this.f24446i.mo20330b(fVar2.f23162a);
        this.f24453s.mo6726u(qVar, fVar2.f23164c, this.f24432b, fVar2.f23165d, fVar2.f23166e, fVar2.f23167f, fVar2.f23168g, fVar2.f23169h);
        if (!this.f24422L) {
            mo6683e(this.f24439e0);
        } else {
            this.f24434c.mo6684f(this);
        }
    }

    /* renamed from: X */
    public C5810h0.C5813c mo6783o(C4060f fVar, long j, long j2, IOException iOException, int i) {
        C5810h0.C5813c cVar;
        int i2;
        C4060f fVar2 = fVar;
        IOException iOException2 = iOException;
        boolean N = m29132N(fVar);
        if (N && !((C4374i) fVar2).mo17836q() && (iOException2 instanceof C5794c0) && ((i2 = ((C5794c0) iOException2).f28789d) == 410 || i2 == 404)) {
            return C5810h0.f28821d;
        }
        long a = fVar.mo17278a();
        C1748q qVar = new C1748q(fVar2.f23162a, fVar2.f23163b, fVar.mo17281f(), fVar.mo17280e(), j, j2, a);
        C5804g0.C5807c cVar2 = new C5804g0.C5807c(qVar, new C1759t(fVar2.f23164c, this.f24432b, fVar2.f23165d, fVar2.f23166e, fVar2.f23167f, C5953m0.m35117Y0(fVar2.f23168g), C5953m0.m35117Y0(fVar2.f23169h)), iOException2, i);
        C5804g0.C5806b a2 = this.f24446i.mo20329a(C5716a0.m34079c(this.f24436d.mo17817k()), cVar2);
        boolean z = false;
        boolean m = (a2 == null || a2.f28809a != 2) ? false : this.f24436d.mo17818m(fVar2, a2.f28810b);
        if (m) {
            if (N && a == 0) {
                ArrayList<C4374i> arrayList = this.f24456v;
                if (arrayList.remove(arrayList.size() - 1) == fVar2) {
                    z = true;
                }
                C5917a.m34873f(z);
                if (this.f24456v.isEmpty()) {
                    this.f24441f0 = this.f24439e0;
                } else {
                    ((C4374i) C6696t.m38506c(this.f24456v)).mo17835o();
                }
            }
            cVar = C5810h0.f28823f;
        } else {
            long c = this.f24446i.mo20331c(cVar2);
            if (c != -9223372036854775807L) {
                cVar = C5810h0.m34569h(false, c);
            } else {
                cVar = C5810h0.f28824g;
            }
        }
        C5810h0.C5813c cVar3 = cVar;
        boolean z2 = !cVar3.mo20342c();
        this.f24453s.mo6728w(qVar, fVar2.f23164c, this.f24432b, fVar2.f23165d, fVar2.f23166e, fVar2.f23167f, fVar2.f23168g, fVar2.f23169h, iOException, z2);
        if (z2) {
            this.f24413C = null;
            this.f24446i.mo20330b(fVar2.f23162a);
        }
        if (m) {
            if (!this.f24422L) {
                mo6683e(this.f24439e0);
            } else {
                this.f24434c.mo6684f(this);
            }
        }
        return cVar3;
    }

    /* renamed from: Y */
    public void mo17854Y() {
        this.f24416F.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r6 = r4.f24446i.mo20329a(p149u3.C5716a0.m34079c(r4.f24436d.mo17817k()), r6);
     */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo17855Z(android.net.Uri r5, p155v3.C5804g0.C5807c r6, boolean r7) {
        /*
            r4 = this;
            g3.f r0 = r4.f24436d
            boolean r0 = r0.mo17820o(r5)
            r1 = 1
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 != 0) goto L_0x002b
            v3.g0 r7 = r4.f24446i
            g3.f r0 = r4.f24436d
            u3.s r0 = r0.mo17817k()
            v3.g0$a r0 = p149u3.C5716a0.m34079c(r0)
            v3.g0$b r6 = r7.mo20329a(r0, r6)
            if (r6 == 0) goto L_0x002b
            int r7 = r6.f28809a
            r0 = 2
            if (r7 != r0) goto L_0x002b
            long r6 = r6.f28810b
            goto L_0x002c
        L_0x002b:
            r6 = r2
        L_0x002c:
            g3.f r0 = r4.f24436d
            boolean r5 = r0.mo17822q(r5, r6)
            if (r5 == 0) goto L_0x0039
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p052g3.C4378p.mo17855Z(android.net.Uri, v3.g0$c, boolean):boolean");
    }

    /* renamed from: a */
    public void mo6772a() {
        for (C4382d T : this.f24414D) {
            T.mo6833T();
        }
    }

    /* renamed from: a0 */
    public void mo17856a0() {
        if (!this.f24456v.isEmpty()) {
            C4374i iVar = (C4374i) C6696t.m38506c(this.f24456v);
            int c = this.f24436d.mo17813c(iVar);
            if (c == 1) {
                iVar.mo17837v();
            } else if (c == 2 && !this.f24447i0 && this.f24452r.mo20337j()) {
                this.f24452r.mo20334f();
            }
        }
    }

    /* renamed from: b */
    public void mo6774b(C6272r1 r1Var) {
        this.f24460z.post(this.f24458x);
    }

    /* renamed from: c */
    public long mo17857c(long j, C6229i3 i3Var) {
        return this.f24436d.mo17812b(j, i3Var);
    }

    /* renamed from: c0 */
    public void mo17858c0(C1776x0[] x0VarArr, int i, int... iArr) {
        this.f24427Q = m29122D(x0VarArr);
        this.f24428R = new HashSet();
        for (int b : iArr) {
            this.f24428R.add(this.f24427Q.mo6903b(b));
        }
        this.f24431a0 = i;
        Handler handler = this.f24460z;
        C4380b bVar = this.f24434c;
        Objects.requireNonNull(bVar);
        handler.post(new C10205m(bVar));
        m29139k0();
    }

    /* renamed from: d */
    public long mo6682d() {
        if (m29133O()) {
            return this.f24441f0;
        }
        if (this.f24447i0) {
            return Long.MIN_VALUE;
        }
        return m29128J().f23169h;
    }

    /* renamed from: d0 */
    public int mo17859d0(int i, C6279s1 s1Var, C1848g gVar, int i2) {
        C6272r1 r1Var;
        if (m29133O()) {
            return -3;
        }
        int i3 = 0;
        if (!this.f24456v.isEmpty()) {
            int i4 = 0;
            while (i4 < this.f24456v.size() - 1 && m29126H(this.f24456v.get(i4))) {
                i4++;
            }
            C5953m0.m35093M0(this.f24456v, 0, i4);
            C4374i iVar = this.f24456v.get(0);
            C6272r1 r1Var2 = iVar.f23165d;
            if (!r1Var2.equals(this.f24425O)) {
                this.f24453s.mo6720i(this.f24432b, r1Var2, iVar.f23166e, iVar.f23167f, iVar.f23168g);
            }
            this.f24425O = r1Var2;
        }
        if (!this.f24456v.isEmpty() && !this.f24456v.get(0).mo17836q()) {
            return -3;
        }
        int S = this.f24414D[i].mo6832S(s1Var, gVar, i2, this.f24447i0);
        if (S == -5) {
            C6272r1 r1Var3 = (C6272r1) C5917a.m34872e(s1Var.f30328b);
            if (i == this.f24420J) {
                int Q = this.f24414D[i].mo6830Q();
                while (i3 < this.f24456v.size() && this.f24456v.get(i3).f24367k != Q) {
                    i3++;
                }
                if (i3 < this.f24456v.size()) {
                    r1Var = this.f24456v.get(i3).f23165d;
                } else {
                    r1Var = (C6272r1) C5917a.m34872e(this.f24424N);
                }
                r1Var3 = r1Var3.mo21489j(r1Var);
            }
            s1Var.f30328b = r1Var3;
        }
        return S;
    }

    /* renamed from: e */
    public boolean mo6683e(long j) {
        long j2;
        List<C4374i> list;
        if (this.f24447i0 || this.f24452r.mo20337j() || this.f24452r.mo20336i()) {
            return false;
        }
        if (m29133O()) {
            list = Collections.emptyList();
            j2 = this.f24441f0;
            for (C4382d b0 : this.f24414D) {
                b0.mo6841b0(this.f24441f0);
            }
        } else {
            list = this.f24457w;
            C4374i J = m29128J();
            if (J.mo17297h()) {
                j2 = J.f23169h;
            } else {
                j2 = Math.max(this.f24439e0, J.f23168g);
            }
        }
        List<C4374i> list2 = list;
        long j3 = j2;
        this.f24455u.mo17828a();
        this.f24436d.mo17814e(j, j3, list2, this.f24422L || !list2.isEmpty(), this.f24455u);
        C4366f.C4368b bVar = this.f24455u;
        boolean z = bVar.f24343b;
        C4060f fVar = bVar.f24342a;
        Uri uri = bVar.f24344c;
        if (z) {
            this.f24441f0 = -9223372036854775807L;
            this.f24447i0 = true;
            return true;
        } else if (fVar == null) {
            if (uri != null) {
                this.f24434c.mo17840l(uri);
            }
            return false;
        } else {
            if (m29132N(fVar)) {
                m29131M((C4374i) fVar);
            }
            this.f24413C = fVar;
            this.f24453s.mo6713A(new C1748q(fVar.f23162a, fVar.f23163b, this.f24452r.mo20341n(fVar, this, this.f24446i.mo20332d(fVar.f23164c))), fVar.f23164c, this.f24432b, fVar.f23165d, fVar.f23166e, fVar.f23167f, fVar.f23168g, fVar.f23169h);
            return true;
        }
    }

    /* renamed from: e0 */
    public void mo17860e0() {
        if (this.f24422L) {
            for (C4382d R : this.f24414D) {
                R.mo6831R();
            }
        }
        this.f24452r.mo20340m(this);
        this.f24460z.removeCallbacksAndMessages((Object) null);
        this.f24426P = true;
        this.f24411A.clear();
    }

    /* renamed from: f */
    public C4200e0 mo6778f(int i, int i2) {
        C4200e0 e0Var;
        if (!f24410n0.contains(Integer.valueOf(i2))) {
            int i3 = 0;
            while (true) {
                C4200e0[] e0VarArr = this.f24414D;
                if (i3 >= e0VarArr.length) {
                    e0Var = null;
                    break;
                } else if (this.f24415E[i3] == i) {
                    e0Var = e0VarArr[i3];
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            e0Var = m29129K(i, i2);
        }
        if (e0Var == null) {
            if (this.f24448j0) {
                return m29120B(i, i2);
            }
            e0Var = m29121C(i, i2);
        }
        if (i2 != 5) {
            return e0Var;
        }
        if (this.f24418H == null) {
            this.f24418H = new C4381c(e0Var, this.f24454t);
        }
        return this.f24418H;
    }

    /* renamed from: g */
    public long mo6685g() {
        if (this.f24447i0) {
            return Long.MIN_VALUE;
        }
        if (m29133O()) {
            return this.f24441f0;
        }
        long j = this.f24439e0;
        C4374i J = m29128J();
        if (!J.mo17297h()) {
            if (this.f24456v.size() > 1) {
                ArrayList<C4374i> arrayList = this.f24456v;
                J = arrayList.get(arrayList.size() - 2);
            } else {
                J = null;
            }
        }
        if (J != null) {
            j = Math.max(j, J.f23169h);
        }
        if (this.f24421K) {
            for (C4382d z : this.f24414D) {
                j = Math.max(j, z.mo6858z());
            }
        }
        return j;
    }

    /* renamed from: h */
    public void mo6686h(long j) {
        if (!this.f24452r.mo20336i() && !m29133O()) {
            if (this.f24452r.mo20337j()) {
                C5917a.m34872e(this.f24413C);
                if (this.f24436d.mo17826v(j, this.f24413C, this.f24457w)) {
                    this.f24452r.mo20334f();
                    return;
                }
                return;
            }
            int size = this.f24457w.size();
            while (size > 0 && this.f24436d.mo17813c(this.f24457w.get(size - 1)) == 2) {
                size--;
            }
            if (size < this.f24457w.size()) {
                m29124F(size);
            }
            int h = this.f24436d.mo17815h(j, this.f24457w);
            if (h < this.f24456v.size()) {
                m29124F(h);
            }
        }
    }

    /* renamed from: h0 */
    public boolean mo17861h0(long j, boolean z) {
        this.f24439e0 = j;
        if (m29133O()) {
            this.f24441f0 = j;
            return true;
        }
        if (this.f24421K && !z && m29138g0(j)) {
            return false;
        }
        this.f24441f0 = j;
        this.f24447i0 = false;
        this.f24456v.clear();
        if (this.f24452r.mo20337j()) {
            if (this.f24421K) {
                for (C4382d r : this.f24414D) {
                    r.mo6852r();
                }
            }
            this.f24452r.mo20334f();
        } else {
            this.f24452r.mo20335g();
            m29137f0();
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0131  */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo17862i0(p149u3.C5735s[] r20, boolean[] r21, p015b3.C1749q0[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            r12 = r24
            r19.m29143w()
            int r3 = r0.f24423M
            r14 = 0
            r4 = 0
        L_0x000f:
            int r5 = r1.length
            r6 = 0
            r15 = 1
            if (r4 >= r5) goto L_0x002f
            r5 = r2[r4]
            g3.l r5 = (p052g3.C4377l) r5
            if (r5 == 0) goto L_0x002c
            r7 = r1[r4]
            if (r7 == 0) goto L_0x0022
            boolean r7 = r21[r4]
            if (r7 != 0) goto L_0x002c
        L_0x0022:
            int r7 = r0.f24423M
            int r7 = r7 - r15
            r0.f24423M = r7
            r5.mo17845d()
            r2[r4] = r6
        L_0x002c:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x002f:
            if (r26 != 0) goto L_0x0041
            boolean r4 = r0.f24445h0
            if (r4 == 0) goto L_0x0038
            if (r3 != 0) goto L_0x003f
            goto L_0x0041
        L_0x0038:
            long r3 = r0.f24439e0
            int r5 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r3 = 0
            goto L_0x0042
        L_0x0041:
            r3 = 1
        L_0x0042:
            g3.f r4 = r0.f24436d
            u3.s r4 = r4.mo17817k()
            r16 = r3
            r11 = r4
            r3 = 0
        L_0x004c:
            int r5 = r1.length
            if (r3 >= r5) goto L_0x00a3
            r5 = r1[r3]
            if (r5 != 0) goto L_0x0054
            goto L_0x00a0
        L_0x0054:
            b3.z0 r7 = r0.f24427Q
            b3.x0 r8 = r5.mo20142a()
            int r7 = r7.mo6904c(r8)
            int r8 = r0.f24431a0
            if (r7 != r8) goto L_0x0068
            g3.f r8 = r0.f24436d
            r8.mo17825u(r5)
            r11 = r5
        L_0x0068:
            r5 = r2[r3]
            if (r5 != 0) goto L_0x00a0
            int r5 = r0.f24423M
            int r5 = r5 + r15
            r0.f24423M = r5
            g3.l r5 = new g3.l
            r5.<init>(r0, r7)
            r2[r3] = r5
            r23[r3] = r15
            int[] r5 = r0.f24429S
            if (r5 == 0) goto L_0x00a0
            r5 = r2[r3]
            g3.l r5 = (p052g3.C4377l) r5
            r5.mo17844a()
            if (r16 != 0) goto L_0x00a0
            g3.p$d[] r5 = r0.f24414D
            int[] r8 = r0.f24429S
            r7 = r8[r7]
            r5 = r5[r7]
            boolean r7 = r5.mo6837Z(r12, r15)
            if (r7 != 0) goto L_0x009d
            int r5 = r5.mo6822C()
            if (r5 == 0) goto L_0x009d
            r5 = 1
            goto L_0x009e
        L_0x009d:
            r5 = 0
        L_0x009e:
            r16 = r5
        L_0x00a0:
            int r3 = r3 + 1
            goto L_0x004c
        L_0x00a3:
            int r1 = r0.f24423M
            if (r1 != 0) goto L_0x00da
            g3.f r1 = r0.f24436d
            r1.mo17823r()
            r0.f24425O = r6
            r0.f24443g0 = r15
            java.util.ArrayList<g3.i> r1 = r0.f24456v
            r1.clear()
            v3.h0 r1 = r0.f24452r
            boolean r1 = r1.mo20337j()
            if (r1 == 0) goto L_0x00d5
            boolean r1 = r0.f24421K
            if (r1 == 0) goto L_0x00ce
            g3.p$d[] r1 = r0.f24414D
            int r3 = r1.length
        L_0x00c4:
            if (r14 >= r3) goto L_0x00ce
            r4 = r1[r14]
            r4.mo6852r()
            int r14 = r14 + 1
            goto L_0x00c4
        L_0x00ce:
            v3.h0 r1 = r0.f24452r
            r1.mo20334f()
            goto L_0x0140
        L_0x00d5:
            r19.m29137f0()
            goto L_0x0140
        L_0x00da:
            java.util.ArrayList<g3.i> r1 = r0.f24456v
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x012d
            boolean r1 = p161w3.C5953m0.m35124c(r11, r4)
            if (r1 != 0) goto L_0x012d
            boolean r1 = r0.f24445h0
            if (r1 != 0) goto L_0x0124
            r3 = 0
            int r1 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x00f3
            long r3 = -r12
        L_0x00f3:
            r6 = r3
            g3.i r1 = r19.m29128J()
            g3.f r3 = r0.f24436d
            d3.o[] r17 = r3.mo17811a(r1, r12)
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List<g3.i> r10 = r0.f24457w
            r3 = r11
            r4 = r24
            r18 = r11
            r11 = r17
            r3.mo17829h(r4, r6, r8, r10, r11)
            g3.f r3 = r0.f24436d
            b3.x0 r3 = r3.mo17816j()
            z1.r1 r1 = r1.f23165d
            int r1 = r3.mo6898c(r1)
            int r3 = r18.mo20154o()
            if (r3 == r1) goto L_0x0122
            goto L_0x0124
        L_0x0122:
            r1 = 0
            goto L_0x0125
        L_0x0124:
            r1 = 1
        L_0x0125:
            if (r1 == 0) goto L_0x012d
            r0.f24443g0 = r15
            r1 = 1
            r16 = 1
            goto L_0x012f
        L_0x012d:
            r1 = r26
        L_0x012f:
            if (r16 == 0) goto L_0x0140
            r0.mo17861h0(r12, r1)
        L_0x0134:
            int r1 = r2.length
            if (r14 >= r1) goto L_0x0140
            r1 = r2[r14]
            if (r1 == 0) goto L_0x013d
            r23[r14] = r15
        L_0x013d:
            int r14 = r14 + 1
            goto L_0x0134
        L_0x0140:
            r0.m29140p0(r2)
            r0.f24445h0 = r15
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: p052g3.C4378p.mo17862i0(u3.s[], boolean[], b3.q0[], boolean[], long, boolean):boolean");
    }

    public boolean isLoading() {
        return this.f24452r.mo20337j();
    }

    /* renamed from: j0 */
    public void mo17863j0(C4035m mVar) {
        if (!C5953m0.m35124c(this.f24450l0, mVar)) {
            this.f24450l0 = mVar;
            int i = 0;
            while (true) {
                C4382d[] dVarArr = this.f24414D;
                if (i < dVarArr.length) {
                    if (this.f24437d0[i]) {
                        dVarArr[i].mo17872i0(mVar);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: k */
    public void mo17864k() throws IOException {
        mo17849T();
        if (this.f24447i0 && !this.f24422L) {
            throw C6249m2.m36661a("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    /* renamed from: l */
    public void mo6781l(C4192b0 b0Var) {
    }

    /* renamed from: l0 */
    public void mo17865l0(boolean z) {
        this.f24436d.mo17824t(z);
    }

    /* renamed from: m0 */
    public void mo17866m0(long j) {
        if (this.f24449k0 != j) {
            this.f24449k0 = j;
            for (C4382d a0 : this.f24414D) {
                a0.mo6839a0(j);
            }
        }
    }

    /* renamed from: n */
    public void mo6782n() {
        this.f24448j0 = true;
        this.f24460z.post(this.f24459y);
    }

    /* renamed from: n0 */
    public int mo17867n0(int i, long j) {
        if (m29133O()) {
            return 0;
        }
        C4382d dVar = this.f24414D[i];
        int E = dVar.mo6823E(j, this.f24447i0);
        C4374i iVar = (C4374i) C6696t.m38507d(this.f24456v, null);
        if (iVar != null && !iVar.mo17836q()) {
            E = Math.min(E, iVar.mo17833m(i) - dVar.mo6822C());
        }
        dVar.mo6846e0(E);
        return E;
    }

    /* renamed from: o0 */
    public void mo17868o0(int i) {
        m29143w();
        C5917a.m34872e(this.f24429S);
        int i2 = this.f24429S[i];
        C5917a.m34873f(this.f24435c0[i2]);
        this.f24435c0[i2] = false;
    }

    /* renamed from: s */
    public C1780z0 mo17869s() {
        m29143w();
        return this.f24427Q;
    }

    /* renamed from: t */
    public void mo17870t(long j, boolean z) {
        if (this.f24421K && !m29133O()) {
            int length = this.f24414D.length;
            for (int i = 0; i < length; i++) {
                this.f24414D[i].mo6851q(j, z, this.f24435c0[i]);
            }
        }
    }

    /* renamed from: x */
    public int mo17871x(int i) {
        m29143w();
        C5917a.m34872e(this.f24429S);
        int i2 = this.f24429S[i];
        if (i2 != -1) {
            boolean[] zArr = this.f24435c0;
            if (zArr[i2]) {
                return -2;
            }
            zArr[i2] = true;
            return i2;
        } else if (this.f24428R.contains(this.f24427Q.mo6903b(i))) {
            return -3;
        } else {
            return -2;
        }
    }
}
