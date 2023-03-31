package p177z1;

import android.os.Bundle;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import p014b2.C1624e;
import p079k3.C4864b;
import p079k3.C4868e;
import p127r2.C5432a;
import p161w3.C5948l;
import p167x3.C6076z;
import p177z1.C6224h;
import p182a7.C6425j;

/* renamed from: z1.u2 */
/* compiled from: Player */
public interface C6282u2 {

    /* renamed from: z1.u2$b */
    /* compiled from: Player */
    public static final class C6284b implements C6224h {

        /* renamed from: b */
        public static final C6284b f30337b = new C6285a().mo21550e();

        /* renamed from: c */
        public static final C6224h.C6225a<C6284b> f30338c = C13433v2.f47774a;
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C5948l f30339a;

        /* renamed from: z1.u2$b$a */
        /* compiled from: Player */
        public static final class C6285a {

            /* renamed from: b */
            private static final int[] f30340b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

            /* renamed from: a */
            private final C5948l.C5950b f30341a = new C5948l.C5950b();

            /* renamed from: a */
            public C6285a mo21546a(int i) {
                this.f30341a.mo20639a(i);
                return this;
            }

            /* renamed from: b */
            public C6285a mo21547b(C6284b bVar) {
                this.f30341a.mo20640b(bVar.f30339a);
                return this;
            }

            /* renamed from: c */
            public C6285a mo21548c(int... iArr) {
                this.f30341a.mo20641c(iArr);
                return this;
            }

            /* renamed from: d */
            public C6285a mo21549d(int i, boolean z) {
                this.f30341a.mo20642d(i, z);
                return this;
            }

            /* renamed from: e */
            public C6284b mo21550e() {
                return new C6284b(this.f30341a.mo20643e());
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static C6284b m37049c(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(m37050d(0));
            if (integerArrayList == null) {
                return f30337b;
            }
            C6285a aVar = new C6285a();
            for (int i = 0; i < integerArrayList.size(); i++) {
                aVar.mo21546a(integerArrayList.get(i).intValue());
            }
            return aVar.mo21550e();
        }

        /* renamed from: d */
        private static String m37050d(int i) {
            return Integer.toString(i, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6284b)) {
                return false;
            }
            return this.f30339a.equals(((C6284b) obj).f30339a);
        }

        public int hashCode() {
            return this.f30339a.hashCode();
        }

        private C6284b(C5948l lVar) {
            this.f30339a = lVar;
        }
    }

    /* renamed from: z1.u2$c */
    /* compiled from: Player */
    public static final class C6286c {

        /* renamed from: a */
        private final C5948l f30342a;

        public C6286c(C5948l lVar) {
            this.f30342a = lVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6286c)) {
                return false;
            }
            return this.f30342a.equals(((C6286c) obj).f30342a);
        }

        public int hashCode() {
            return this.f30342a.hashCode();
        }
    }

    /* renamed from: z1.u2$d */
    /* compiled from: Player */
    public interface C6287d {
        @Deprecated
        /* renamed from: A */
        void mo140A(boolean z);

        @Deprecated
        /* renamed from: B */
        void mo141B(int i);

        /* renamed from: C */
        void mo142C(C6266q3 q3Var, int i);

        /* renamed from: D */
        void mo143D(boolean z);

        @Deprecated
        /* renamed from: F */
        void mo146F();

        /* renamed from: H */
        void mo149H(C6282u2 u2Var, C6286c cVar);

        /* renamed from: I */
        void mo150I(float f);

        /* renamed from: K */
        void mo151K(int i);

        /* renamed from: O */
        void mo153O(boolean z);

        /* renamed from: R */
        void mo156R(C1624e eVar);

        /* renamed from: S */
        void mo157S(C6290v3 v3Var);

        /* renamed from: U */
        void mo159U(C6265q2 q2Var);

        /* renamed from: X */
        void mo162X(C6288e eVar, C6288e eVar2, int i);

        /* renamed from: Z */
        void mo165Z(int i, boolean z);

        @Deprecated
        /* renamed from: a0 */
        void mo166a0(boolean z, int i);

        /* renamed from: b */
        void mo167b(boolean z);

        /* renamed from: b0 */
        void mo168b0(C6300z1 z1Var, int i);

        /* renamed from: c0 */
        void mo169c0(C6284b bVar);

        /* renamed from: d0 */
        void mo170d0();

        /* renamed from: e0 */
        void mo171e0(C6265q2 q2Var);

        /* renamed from: g */
        void mo173g(C6280t2 t2Var);

        /* renamed from: h0 */
        void mo175h0(C6214e2 e2Var);

        /* renamed from: j */
        void mo177j(C4868e eVar);

        /* renamed from: j0 */
        void mo178j0(boolean z, int i);

        /* renamed from: l0 */
        void mo180l0(C6259o oVar);

        /* renamed from: m0 */
        void mo181m0(int i, int i2);

        /* renamed from: o */
        void mo182o(C5432a aVar);

        /* renamed from: p */
        void mo184p(C6076z zVar);

        /* renamed from: p0 */
        void mo185p0(boolean z);

        @Deprecated
        /* renamed from: s */
        void mo186s(List<C4864b> list);

        /* renamed from: y0 */
        void mo187y0(int i);

        /* renamed from: z */
        void mo188z(int i);
    }

    /* renamed from: z1.u2$e */
    /* compiled from: Player */
    public static final class C6288e implements C6224h {

        /* renamed from: s */
        public static final C6224h.C6225a<C6288e> f30343s = C13438x2.f47779a;

        /* renamed from: a */
        public final Object f30344a;
        @Deprecated

        /* renamed from: b */
        public final int f30345b;

        /* renamed from: c */
        public final int f30346c;

        /* renamed from: d */
        public final C6300z1 f30347d;

        /* renamed from: e */
        public final Object f30348e;

        /* renamed from: f */
        public final int f30349f;

        /* renamed from: g */
        public final long f30350g;

        /* renamed from: h */
        public final long f30351h;

        /* renamed from: i */
        public final int f30352i;

        /* renamed from: r */
        public final int f30353r;

        public C6288e(Object obj, int i, C6300z1 z1Var, Object obj2, int i2, long j, long j2, int i3, int i4) {
            this.f30344a = obj;
            this.f30345b = i;
            this.f30346c = i;
            this.f30347d = z1Var;
            this.f30348e = obj2;
            this.f30349f = i2;
            this.f30350g = j;
            this.f30351h = j2;
            this.f30352i = i3;
            this.f30353r = i4;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static C6288e m37089b(Bundle bundle) {
            C6300z1 z1Var;
            int i = bundle.getInt(m37090c(0), -1);
            Bundle bundle2 = bundle.getBundle(m37090c(1));
            if (bundle2 == null) {
                z1Var = null;
            } else {
                z1Var = C6300z1.f30389r.mo6454a(bundle2);
            }
            return new C6288e((Object) null, i, z1Var, (Object) null, bundle.getInt(m37090c(2), -1), bundle.getLong(m37090c(3), -9223372036854775807L), bundle.getLong(m37090c(4), -9223372036854775807L), bundle.getInt(m37090c(5), -1), bundle.getInt(m37090c(6), -1));
        }

        /* renamed from: c */
        private static String m37090c(int i) {
            return Integer.toString(i, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C6288e.class != obj.getClass()) {
                return false;
            }
            C6288e eVar = (C6288e) obj;
            if (this.f30346c == eVar.f30346c && this.f30349f == eVar.f30349f && this.f30350g == eVar.f30350g && this.f30351h == eVar.f30351h && this.f30352i == eVar.f30352i && this.f30353r == eVar.f30353r && C6425j.m37541a(this.f30344a, eVar.f30344a) && C6425j.m37541a(this.f30348e, eVar.f30348e) && C6425j.m37541a(this.f30347d, eVar.f30347d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return C6425j.m37542b(this.f30344a, Integer.valueOf(this.f30346c), this.f30347d, this.f30348e, Integer.valueOf(this.f30349f), Long.valueOf(this.f30350g), Long.valueOf(this.f30351h), Integer.valueOf(this.f30352i), Integer.valueOf(this.f30353r));
        }
    }

    /* renamed from: A */
    int mo21154A();

    /* renamed from: B */
    boolean mo21238B();

    /* renamed from: C */
    int mo21155C();

    /* renamed from: D */
    C6266q3 mo21156D();

    /* renamed from: E */
    boolean mo21157E();

    /* renamed from: G */
    boolean mo21239G();

    /* renamed from: H */
    void mo21159H();

    /* renamed from: K0 */
    int mo21161K0();

    /* renamed from: N */
    int mo21162N();

    /* renamed from: Q */
    void mo21163Q(int i);

    /* renamed from: a */
    void mo21168a();

    /* renamed from: b */
    void mo21169b(Surface surface);

    /* renamed from: c */
    void mo21171c(C6280t2 t2Var);

    /* renamed from: d */
    boolean mo21174d();

    /* renamed from: e */
    C6280t2 mo21176e();

    /* renamed from: g */
    long mo21178g();

    long getCurrentPosition();

    long getDuration();

    /* renamed from: h */
    void mo21182h(int i, long j);

    /* renamed from: i */
    boolean mo21183i();

    /* renamed from: j */
    void mo21185j(boolean z);

    /* renamed from: k */
    int mo21186k();

    /* renamed from: l */
    void mo21187l(C6287d dVar);

    /* renamed from: m */
    boolean mo21244m();

    /* renamed from: n */
    int mo21188n();

    /* renamed from: o */
    int mo21245o();

    /* renamed from: p */
    C6265q2 mo21189p();

    /* renamed from: q */
    void mo21190q(boolean z);

    /* renamed from: r */
    long mo21191r();

    /* renamed from: s */
    long mo21192s();

    void setVolume(float f);

    void stop();

    /* renamed from: t */
    boolean mo21246t();

    /* renamed from: t0 */
    void mo21247t0(long j);

    /* renamed from: u */
    void mo21248u();

    /* renamed from: w */
    C6290v3 mo21196w();

    /* renamed from: y */
    boolean mo21249y();

    /* renamed from: z */
    int mo21198z();
}
