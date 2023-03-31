package p004a2;

import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import p014b2.C1624e;
import p015b3.C1748q;
import p015b3.C1759t;
import p015b3.C1772x;
import p021c2.C1846e;
import p021c2.C1852i;
import p079k3.C4864b;
import p079k3.C4868e;
import p127r2.C5432a;
import p161w3.C5917a;
import p161w3.C5948l;
import p167x3.C6076z;
import p177z1.C6214e2;
import p177z1.C6259o;
import p177z1.C6265q2;
import p177z1.C6266q3;
import p177z1.C6272r1;
import p177z1.C6280t2;
import p177z1.C6282u2;
import p177z1.C6290v3;
import p177z1.C6300z1;
import p182a7.C6425j;

/* renamed from: a2.c */
/* compiled from: AnalyticsListener */
public interface C0016c {

    /* renamed from: a2.c$a */
    /* compiled from: AnalyticsListener */
    public static final class C0017a {

        /* renamed from: a */
        public final long f36a;

        /* renamed from: b */
        public final C6266q3 f37b;

        /* renamed from: c */
        public final int f38c;

        /* renamed from: d */
        public final C1772x.C1774b f39d;

        /* renamed from: e */
        public final long f40e;

        /* renamed from: f */
        public final C6266q3 f41f;

        /* renamed from: g */
        public final int f42g;

        /* renamed from: h */
        public final C1772x.C1774b f43h;

        /* renamed from: i */
        public final long f44i;

        /* renamed from: j */
        public final long f45j;

        public C0017a(long j, C6266q3 q3Var, int i, C1772x.C1774b bVar, long j2, C6266q3 q3Var2, int i2, C1772x.C1774b bVar2, long j3, long j4) {
            this.f36a = j;
            this.f37b = q3Var;
            this.f38c = i;
            this.f39d = bVar;
            this.f40e = j2;
            this.f41f = q3Var2;
            this.f42g = i2;
            this.f43h = bVar2;
            this.f44i = j3;
            this.f45j = j4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0017a.class != obj.getClass()) {
                return false;
            }
            C0017a aVar = (C0017a) obj;
            if (this.f36a == aVar.f36a && this.f38c == aVar.f38c && this.f40e == aVar.f40e && this.f42g == aVar.f42g && this.f44i == aVar.f44i && this.f45j == aVar.f45j && C6425j.m37541a(this.f37b, aVar.f37b) && C6425j.m37541a(this.f39d, aVar.f39d) && C6425j.m37541a(this.f41f, aVar.f41f) && C6425j.m37541a(this.f43h, aVar.f43h)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return C6425j.m37542b(Long.valueOf(this.f36a), this.f37b, Integer.valueOf(this.f38c), this.f39d, Long.valueOf(this.f40e), this.f41f, Integer.valueOf(this.f42g), this.f43h, Long.valueOf(this.f44i), Long.valueOf(this.f45j));
        }
    }

    /* renamed from: a2.c$b */
    /* compiled from: AnalyticsListener */
    public static final class C0018b {

        /* renamed from: a */
        private final C5948l f46a;

        /* renamed from: b */
        private final SparseArray<C0017a> f47b;

        public C0018b(C5948l lVar, SparseArray<C0017a> sparseArray) {
            this.f46a = lVar;
            SparseArray<C0017a> sparseArray2 = new SparseArray<>(lVar.mo20636c());
            for (int i = 0; i < lVar.mo20636c(); i++) {
                int b = lVar.mo20635b(i);
                sparseArray2.append(b, (C0017a) C5917a.m34872e(sparseArray.get(b)));
            }
            this.f47b = sparseArray2;
        }

        /* renamed from: a */
        public boolean mo134a(int i) {
            return this.f46a.mo20634a(i);
        }

        /* renamed from: b */
        public int mo135b(int i) {
            return this.f46a.mo20635b(i);
        }

        /* renamed from: c */
        public C0017a mo136c(int i) {
            return (C0017a) C5917a.m34872e(this.f47b.get(i));
        }

        /* renamed from: d */
        public int mo137d() {
            return this.f46a.mo20636c();
        }
    }

    @Deprecated
    /* renamed from: A */
    void mo58A(C0017a aVar, int i, C1846e eVar);

    /* renamed from: B */
    void mo59B(C0017a aVar, C1624e eVar);

    /* renamed from: C */
    void mo60C(C0017a aVar, C6290v3 v3Var);

    /* renamed from: D */
    void mo61D(C0017a aVar);

    /* renamed from: E */
    void mo62E(C0017a aVar);

    /* renamed from: F */
    void mo63F(C0017a aVar, C5432a aVar2);

    @Deprecated
    /* renamed from: G */
    void mo64G(C0017a aVar, String str, long j);

    /* renamed from: H */
    void mo65H(C0017a aVar, boolean z, int i);

    @Deprecated
    /* renamed from: I */
    void mo66I(C0017a aVar, boolean z, int i);

    /* renamed from: J */
    void mo67J(C0017a aVar, C4868e eVar);

    /* renamed from: K */
    void mo68K(C0017a aVar, String str, long j, long j2);

    @Deprecated
    /* renamed from: L */
    void mo69L(C0017a aVar, int i, String str, long j);

    /* renamed from: M */
    void mo70M(C0017a aVar, C6076z zVar);

    /* renamed from: N */
    void mo71N(C0017a aVar, int i, long j, long j2);

    /* renamed from: O */
    void mo72O(C0017a aVar, long j);

    /* renamed from: P */
    void mo73P(C0017a aVar, int i);

    /* renamed from: Q */
    void mo74Q(C0017a aVar, int i, long j);

    /* renamed from: R */
    void mo75R(C0017a aVar, C6265q2 q2Var);

    @Deprecated
    /* renamed from: S */
    void mo76S(C0017a aVar);

    @Deprecated
    /* renamed from: U */
    void mo77U(C0017a aVar);

    /* renamed from: V */
    void mo78V(C0017a aVar, int i);

    /* renamed from: X */
    void mo79X(C0017a aVar, C1846e eVar);

    /* renamed from: Y */
    void mo80Y(C0017a aVar, int i, int i2);

    /* renamed from: Z */
    void mo81Z(C0017a aVar, C1748q qVar, C1759t tVar);

    @Deprecated
    /* renamed from: a */
    void mo82a(C0017a aVar, int i);

    /* renamed from: a0 */
    void mo83a0(C0017a aVar);

    @Deprecated
    /* renamed from: b */
    void mo84b(C0017a aVar, C6272r1 r1Var);

    /* renamed from: b0 */
    void mo85b0(C0017a aVar, C6265q2 q2Var);

    @Deprecated
    /* renamed from: c */
    void mo86c(C0017a aVar, boolean z);

    /* renamed from: c0 */
    void mo87c0(C6282u2 u2Var, C0018b bVar);

    /* renamed from: d */
    void mo88d(C0017a aVar, int i);

    /* renamed from: d0 */
    void mo89d0(C0017a aVar, C6282u2.C6284b bVar);

    /* renamed from: e */
    void mo90e(C0017a aVar, C6300z1 z1Var, int i);

    /* renamed from: e0 */
    void mo91e0(C0017a aVar, Exception exc);

    /* renamed from: f */
    void mo92f(C0017a aVar, String str);

    /* renamed from: f0 */
    void mo93f0(C0017a aVar, boolean z);

    /* renamed from: g0 */
    void mo94g0(C0017a aVar, int i, long j, long j2);

    /* renamed from: h */
    void mo95h(C0017a aVar, C1846e eVar);

    /* renamed from: h0 */
    void mo96h0(C0017a aVar);

    /* renamed from: i */
    void mo97i(C0017a aVar, boolean z);

    @Deprecated
    /* renamed from: i0 */
    void mo98i0(C0017a aVar, int i, C6272r1 r1Var);

    /* renamed from: j */
    void mo99j(C0017a aVar, C6282u2.C6288e eVar, C6282u2.C6288e eVar2, int i);

    /* renamed from: k */
    void mo100k(C0017a aVar, C6272r1 r1Var, C1852i iVar);

    /* renamed from: k0 */
    void mo101k0(C0017a aVar);

    /* renamed from: l */
    void mo102l(C0017a aVar, float f);

    /* renamed from: l0 */
    void mo103l0(C0017a aVar, C6272r1 r1Var, C1852i iVar);

    /* renamed from: m */
    void mo104m(C0017a aVar, int i, boolean z);

    @Deprecated
    /* renamed from: m0 */
    void mo105m0(C0017a aVar, int i, C1846e eVar);

    /* renamed from: n */
    void mo106n(C0017a aVar, long j, int i);

    /* renamed from: n0 */
    void mo107n0(C0017a aVar, Exception exc);

    /* renamed from: o */
    void mo108o(C0017a aVar, C1748q qVar, C1759t tVar);

    /* renamed from: o0 */
    void mo109o0(C0017a aVar, int i);

    /* renamed from: p */
    void mo110p(C0017a aVar, int i);

    /* renamed from: p0 */
    void mo111p0(C0017a aVar, C6214e2 e2Var);

    /* renamed from: q */
    void mo112q(C0017a aVar, Exception exc);

    /* renamed from: q0 */
    void mo113q0(C0017a aVar, C1759t tVar);

    /* renamed from: r */
    void mo114r(C0017a aVar, String str, long j, long j2);

    /* renamed from: r0 */
    void mo115r0(C0017a aVar, Exception exc);

    /* renamed from: s */
    void mo116s(C0017a aVar, C1759t tVar);

    /* renamed from: s0 */
    void mo117s0(C0017a aVar, C1748q qVar, C1759t tVar);

    /* renamed from: t */
    void mo118t(C0017a aVar, C1846e eVar);

    @Deprecated
    /* renamed from: t0 */
    void mo119t0(C0017a aVar, int i, int i2, int i3, float f);

    /* renamed from: u */
    void mo120u(C0017a aVar, boolean z);

    /* renamed from: u0 */
    void mo121u0(C0017a aVar, C6259o oVar);

    /* renamed from: v */
    void mo122v(C0017a aVar, C1748q qVar, C1759t tVar, IOException iOException, boolean z);

    /* renamed from: v0 */
    void mo123v0(C0017a aVar, boolean z);

    /* renamed from: w */
    void mo124w(C0017a aVar, String str);

    /* renamed from: w0 */
    void mo125w0(C0017a aVar, Object obj, long j);

    @Deprecated
    /* renamed from: x */
    void mo126x(C0017a aVar);

    /* renamed from: x0 */
    void mo127x0(C0017a aVar, C1846e eVar);

    @Deprecated
    /* renamed from: y */
    void mo128y(C0017a aVar, List<C4864b> list);

    @Deprecated
    /* renamed from: y0 */
    void mo129y0(C0017a aVar, C6272r1 r1Var);

    @Deprecated
    /* renamed from: z */
    void mo130z(C0017a aVar, String str, long j);

    /* renamed from: z0 */
    void mo131z0(C0017a aVar, C6280t2 t2Var);
}
