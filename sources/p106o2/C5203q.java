package p106o2;

import com.startapp.C8843b4;
import java.util.Collections;
import p037e2.C4200e0;
import p037e2.C4217n;
import p106o2.C5183i0;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5920b0;
import p161w3.C5929e;
import p161w3.C5953m0;
import p161w3.C5961r;
import p161w3.C5970w;
import p177z1.C6272r1;

/* renamed from: o2.q */
/* compiled from: H265Reader */
public final class C5203q implements C5193m {

    /* renamed from: a */
    private final C5172d0 f26965a;

    /* renamed from: b */
    private String f26966b;

    /* renamed from: c */
    private C4200e0 f26967c;

    /* renamed from: d */
    private C5204a f26968d;

    /* renamed from: e */
    private boolean f26969e;

    /* renamed from: f */
    private final boolean[] f26970f = new boolean[3];

    /* renamed from: g */
    private final C5208u f26971g = new C5208u(32, 128);

    /* renamed from: h */
    private final C5208u f26972h = new C5208u(33, 128);

    /* renamed from: i */
    private final C5208u f26973i = new C5208u(34, 128);

    /* renamed from: j */
    private final C5208u f26974j = new C5208u(39, 128);

    /* renamed from: k */
    private final C5208u f26975k = new C5208u(40, 128);

    /* renamed from: l */
    private long f26976l;

    /* renamed from: m */
    private long f26977m = -9223372036854775807L;

    /* renamed from: n */
    private final C5918a0 f26978n = new C5918a0();

    /* renamed from: o2.q$a */
    /* compiled from: H265Reader */
    private static final class C5204a {

        /* renamed from: a */
        private final C4200e0 f26979a;

        /* renamed from: b */
        private long f26980b;

        /* renamed from: c */
        private boolean f26981c;

        /* renamed from: d */
        private int f26982d;

        /* renamed from: e */
        private long f26983e;

        /* renamed from: f */
        private boolean f26984f;

        /* renamed from: g */
        private boolean f26985g;

        /* renamed from: h */
        private boolean f26986h;

        /* renamed from: i */
        private boolean f26987i;

        /* renamed from: j */
        private boolean f26988j;

        /* renamed from: k */
        private long f26989k;

        /* renamed from: l */
        private long f26990l;

        /* renamed from: m */
        private boolean f26991m;

        public C5204a(C4200e0 e0Var) {
            this.f26979a = e0Var;
        }

        /* renamed from: b */
        private static boolean m32316b(int i) {
            return (32 <= i && i <= 35) || i == 39;
        }

        /* renamed from: c */
        private static boolean m32317c(int i) {
            return i < 32 || i == 40;
        }

        /* renamed from: d */
        private void m32318d(int i) {
            long j = this.f26990l;
            if (j != -9223372036854775807L) {
                boolean z = this.f26991m;
                this.f26979a.mo6838a(j, z ? 1 : 0, (int) (this.f26980b - this.f26989k), i, (C4200e0.C4201a) null);
            }
        }

        /* renamed from: a */
        public void mo19190a(long j, int i, boolean z) {
            if (this.f26988j && this.f26985g) {
                this.f26991m = this.f26981c;
                this.f26988j = false;
            } else if (this.f26986h || this.f26985g) {
                if (z && this.f26987i) {
                    m32318d(i + ((int) (j - this.f26980b)));
                }
                this.f26989k = this.f26980b;
                this.f26990l = this.f26983e;
                this.f26991m = this.f26981c;
                this.f26987i = true;
            }
        }

        /* renamed from: e */
        public void mo19191e(byte[] bArr, int i, int i2) {
            if (this.f26984f) {
                int i3 = this.f26982d;
                int i4 = (i + 2) - i3;
                if (i4 < i2) {
                    this.f26985g = (bArr[i4] & C8843b4.f36445d) != 0;
                    this.f26984f = false;
                    return;
                }
                this.f26982d = i3 + (i2 - i);
            }
        }

        /* renamed from: f */
        public void mo19192f() {
            this.f26984f = false;
            this.f26985g = false;
            this.f26986h = false;
            this.f26987i = false;
            this.f26988j = false;
        }

        /* renamed from: g */
        public void mo19193g(long j, int i, int i2, long j2, boolean z) {
            boolean z2 = false;
            this.f26985g = false;
            this.f26986h = false;
            this.f26983e = j2;
            this.f26982d = 0;
            this.f26980b = j;
            if (!m32317c(i2)) {
                if (this.f26987i && !this.f26988j) {
                    if (z) {
                        m32318d(i);
                    }
                    this.f26987i = false;
                }
                if (m32316b(i2)) {
                    this.f26986h = !this.f26988j;
                    this.f26988j = true;
                }
            }
            boolean z3 = i2 >= 16 && i2 <= 21;
            this.f26981c = z3;
            if (z3 || i2 <= 9) {
                z2 = true;
            }
            this.f26984f = z2;
        }
    }

    public C5203q(C5172d0 d0Var) {
        this.f26965a = d0Var;
    }

    /* renamed from: f */
    private void m32304f() {
        C5917a.m34875h(this.f26967c);
        C5953m0.m35138j(this.f26968d);
    }

    /* renamed from: g */
    private void m32305g(long j, int i, int i2, long j2) {
        this.f26968d.mo19190a(j, i, this.f26969e);
        if (!this.f26969e) {
            this.f26971g.mo19195b(i2);
            this.f26972h.mo19195b(i2);
            this.f26973i.mo19195b(i2);
            if (this.f26971g.mo19196c() && this.f26972h.mo19196c() && this.f26973i.mo19196c()) {
                this.f26967c.mo6845e(m32307i(this.f26966b, this.f26971g, this.f26972h, this.f26973i));
                this.f26969e = true;
            }
        }
        if (this.f26974j.mo19195b(i2)) {
            C5208u uVar = this.f26974j;
            this.f26978n.mo20544M(this.f26974j.f27034d, C5970w.m35274q(uVar.f27034d, uVar.f27035e));
            this.f26978n.mo20547P(5);
            this.f26965a.mo19155a(j2, this.f26978n);
        }
        if (this.f26975k.mo19195b(i2)) {
            C5208u uVar2 = this.f26975k;
            this.f26978n.mo20544M(this.f26975k.f27034d, C5970w.m35274q(uVar2.f27034d, uVar2.f27035e));
            this.f26978n.mo20547P(5);
            this.f26965a.mo19155a(j2, this.f26978n);
        }
    }

    /* renamed from: h */
    private void m32306h(byte[] bArr, int i, int i2) {
        this.f26968d.mo19191e(bArr, i, i2);
        if (!this.f26969e) {
            this.f26971g.mo19194a(bArr, i, i2);
            this.f26972h.mo19194a(bArr, i, i2);
            this.f26973i.mo19194a(bArr, i, i2);
        }
        this.f26974j.mo19194a(bArr, i, i2);
        this.f26975k.mo19194a(bArr, i, i2);
    }

    /* renamed from: i */
    private static C6272r1 m32307i(String str, C5208u uVar, C5208u uVar2, C5208u uVar3) {
        C5208u uVar4 = uVar;
        C5208u uVar5 = uVar2;
        C5208u uVar6 = uVar3;
        int i = uVar4.f27035e;
        byte[] bArr = new byte[(uVar5.f27035e + i + uVar6.f27035e)];
        System.arraycopy(uVar4.f27034d, 0, bArr, 0, i);
        System.arraycopy(uVar5.f27034d, 0, bArr, uVar4.f27035e, uVar5.f27035e);
        System.arraycopy(uVar6.f27034d, 0, bArr, uVar4.f27035e + uVar5.f27035e, uVar6.f27035e);
        C5920b0 b0Var = new C5920b0(uVar5.f27034d, 0, uVar5.f27035e);
        b0Var.mo20582l(44);
        int e = b0Var.mo20577e(3);
        b0Var.mo20581k();
        int e2 = b0Var.mo20577e(2);
        boolean d = b0Var.mo20576d();
        int e3 = b0Var.mo20577e(5);
        int i2 = 0;
        for (int i3 = 0; i3 < 32; i3++) {
            if (b0Var.mo20576d()) {
                i2 |= 1 << i3;
            }
        }
        int[] iArr = new int[6];
        for (int i4 = 0; i4 < 6; i4++) {
            iArr[i4] = b0Var.mo20577e(8);
        }
        int e4 = b0Var.mo20577e(8);
        int i5 = 0;
        for (int i6 = 0; i6 < e; i6++) {
            if (b0Var.mo20576d()) {
                i5 += 89;
            }
            if (b0Var.mo20576d()) {
                i5 += 8;
            }
        }
        b0Var.mo20582l(i5);
        if (e > 0) {
            b0Var.mo20582l((8 - e) * 2);
        }
        b0Var.mo20579h();
        int h = b0Var.mo20579h();
        if (h == 3) {
            b0Var.mo20581k();
        }
        int h2 = b0Var.mo20579h();
        int h3 = b0Var.mo20579h();
        if (b0Var.mo20576d()) {
            int h4 = b0Var.mo20579h();
            int h5 = b0Var.mo20579h();
            int h6 = b0Var.mo20579h();
            int h7 = b0Var.mo20579h();
            h2 -= ((h == 1 || h == 2) ? 2 : 1) * (h4 + h5);
            h3 -= (h == 1 ? 2 : 1) * (h6 + h7);
        }
        b0Var.mo20579h();
        b0Var.mo20579h();
        int h8 = b0Var.mo20579h();
        for (int i7 = b0Var.mo20576d() ? 0 : e; i7 <= e; i7++) {
            b0Var.mo20579h();
            b0Var.mo20579h();
            b0Var.mo20579h();
        }
        b0Var.mo20579h();
        b0Var.mo20579h();
        b0Var.mo20579h();
        b0Var.mo20579h();
        b0Var.mo20579h();
        b0Var.mo20579h();
        if (b0Var.mo20576d() && b0Var.mo20576d()) {
            m32308j(b0Var);
        }
        b0Var.mo20582l(2);
        if (b0Var.mo20576d()) {
            b0Var.mo20582l(8);
            b0Var.mo20579h();
            b0Var.mo20579h();
            b0Var.mo20581k();
        }
        m32309k(b0Var);
        if (b0Var.mo20576d()) {
            for (int i8 = 0; i8 < b0Var.mo20579h(); i8++) {
                b0Var.mo20582l(h8 + 4 + 1);
            }
        }
        b0Var.mo20582l(2);
        float f = 1.0f;
        if (b0Var.mo20576d()) {
            if (b0Var.mo20576d()) {
                int e5 = b0Var.mo20577e(8);
                if (e5 == 255) {
                    int e6 = b0Var.mo20577e(16);
                    int e7 = b0Var.mo20577e(16);
                    if (!(e6 == 0 || e7 == 0)) {
                        f = ((float) e6) / ((float) e7);
                    }
                } else {
                    float[] fArr = C5970w.f29151b;
                    if (e5 < fArr.length) {
                        f = fArr[e5];
                    } else {
                        C5961r.m35215i("H265Reader", "Unexpected aspect_ratio_idc value: " + e5);
                    }
                }
            }
            if (b0Var.mo20576d()) {
                b0Var.mo20581k();
            }
            if (b0Var.mo20576d()) {
                b0Var.mo20582l(4);
                if (b0Var.mo20576d()) {
                    b0Var.mo20582l(24);
                }
            }
            if (b0Var.mo20576d()) {
                b0Var.mo20579h();
                b0Var.mo20579h();
            }
            b0Var.mo20581k();
            if (b0Var.mo20576d()) {
                h3 *= 2;
            }
        }
        return new C6272r1.C6274b().mo21505S(str).mo21517e0("video/hevc").mo21495I(C5929e.m34966c(e2, d, e3, i2, iArr, e4)).mo21522j0(h2).mo21503Q(h3).mo21513a0(f).mo21506T(Collections.singletonList(bArr)).mo21491E();
    }

    /* renamed from: j */
    private static void m32308j(C5920b0 b0Var) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (!b0Var.mo20576d()) {
                    b0Var.mo20579h();
                } else {
                    int min = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        b0Var.mo20578g();
                    }
                    for (int i4 = 0; i4 < min; i4++) {
                        b0Var.mo20578g();
                    }
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    /* renamed from: k */
    private static void m32309k(C5920b0 b0Var) {
        int h = b0Var.mo20579h();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < h; i2++) {
            if (i2 != 0) {
                z = b0Var.mo20576d();
            }
            if (z) {
                b0Var.mo20581k();
                b0Var.mo20579h();
                for (int i3 = 0; i3 <= i; i3++) {
                    if (b0Var.mo20576d()) {
                        b0Var.mo20581k();
                    }
                }
            } else {
                int h2 = b0Var.mo20579h();
                int h3 = b0Var.mo20579h();
                int i4 = h2 + h3;
                for (int i5 = 0; i5 < h2; i5++) {
                    b0Var.mo20579h();
                    b0Var.mo20581k();
                }
                for (int i6 = 0; i6 < h3; i6++) {
                    b0Var.mo20579h();
                    b0Var.mo20581k();
                }
                i = i4;
            }
        }
    }

    /* renamed from: l */
    private void m32310l(long j, int i, int i2, long j2) {
        this.f26968d.mo19193g(j, i, i2, j2, this.f26969e);
        if (!this.f26969e) {
            this.f26971g.mo19198e(i2);
            this.f26972h.mo19198e(i2);
            this.f26973i.mo19198e(i2);
        }
        this.f26974j.mo19198e(i2);
        this.f26975k.mo19198e(i2);
    }

    /* renamed from: a */
    public void mo19147a(C5918a0 a0Var) {
        m32304f();
        while (a0Var.mo20548a() > 0) {
            int e = a0Var.mo20552e();
            int f = a0Var.mo20553f();
            byte[] d = a0Var.mo20551d();
            this.f26976l += (long) a0Var.mo20548a();
            this.f26967c.mo6843d(a0Var, a0Var.mo20548a());
            while (true) {
                if (e < f) {
                    int c = C5970w.m35260c(d, e, f, this.f26970f);
                    if (c == f) {
                        m32306h(d, e, f);
                        return;
                    }
                    int e2 = C5970w.m35262e(d, c);
                    int i = c - e;
                    if (i > 0) {
                        m32306h(d, e, c);
                    }
                    int i2 = f - c;
                    long j = this.f26976l - ((long) i2);
                    int i3 = i < 0 ? -i : 0;
                    long j2 = j;
                    int i4 = i2;
                    m32305g(j2, i4, i3, this.f26977m);
                    m32310l(j2, i4, e2, this.f26977m);
                    e = c + 3;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo19148b() {
        this.f26976l = 0;
        this.f26977m = -9223372036854775807L;
        C5970w.m35258a(this.f26970f);
        this.f26971g.mo19197d();
        this.f26972h.mo19197d();
        this.f26973i.mo19197d();
        this.f26974j.mo19197d();
        this.f26975k.mo19197d();
        C5204a aVar = this.f26968d;
        if (aVar != null) {
            aVar.mo19192f();
        }
    }

    /* renamed from: c */
    public void mo19149c() {
    }

    /* renamed from: d */
    public void mo19150d(C4217n nVar, C5183i0.C5187d dVar) {
        dVar.mo19164a();
        this.f26966b = dVar.mo19165b();
        C4200e0 f = nVar.mo6778f(dVar.mo19166c(), 2);
        this.f26967c = f;
        this.f26968d = new C5204a(f);
        this.f26965a.mo19156b(nVar, dVar);
    }

    /* renamed from: e */
    public void mo19151e(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f26977m = j;
        }
    }
}
