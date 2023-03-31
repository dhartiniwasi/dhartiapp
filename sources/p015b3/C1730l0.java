package p015b3;

import android.os.Looper;
import p004a2.C0079u1;
import p015b3.C1704f0;
import p015b3.C1723k0;
import p015b3.C1772x;
import p030d2.C4001b0;
import p030d2.C4033l;
import p030d2.C4052y;
import p037e2.C4210i;
import p037e2.C4221r;
import p155v3.C5789b;
import p155v3.C5804g0;
import p155v3.C5828l;
import p155v3.C5840p0;
import p155v3.C5853x;
import p161w3.C5917a;
import p177z1.C6266q3;
import p177z1.C6300z1;

/* renamed from: b3.l0 */
/* compiled from: ProgressiveMediaSource */
public final class C1730l0 extends C1687a implements C1723k0.C1725b {

    /* renamed from: A */
    private C5840p0 f5114A;

    /* renamed from: h */
    private final C6300z1 f5115h;

    /* renamed from: i */
    private final C6300z1.C6311h f5116i;

    /* renamed from: r */
    private final C5828l.C5829a f5117r;

    /* renamed from: s */
    private final C1704f0.C1705a f5118s;

    /* renamed from: t */
    private final C4052y f5119t;

    /* renamed from: u */
    private final C5804g0 f5120u;

    /* renamed from: v */
    private final int f5121v;

    /* renamed from: w */
    private boolean f5122w;

    /* renamed from: x */
    private long f5123x;

    /* renamed from: y */
    private boolean f5124y;

    /* renamed from: z */
    private boolean f5125z;

    /* renamed from: b3.l0$a */
    /* compiled from: ProgressiveMediaSource */
    class C1731a extends C1739o {
        C1731a(C1730l0 l0Var, C6266q3 q3Var) {
            super(q3Var);
        }

        /* renamed from: k */
        public C6266q3.C6268b mo6711k(int i, C6266q3.C6268b bVar, boolean z) {
            super.mo6711k(i, bVar, z);
            bVar.f30189f = true;
            return bVar;
        }

        /* renamed from: s */
        public C6266q3.C6270d mo6712s(int i, C6266q3.C6270d dVar, long j) {
            super.mo6712s(i, dVar, j);
            dVar.f30210t = true;
            return dVar;
        }
    }

    /* renamed from: b3.l0$b */
    /* compiled from: ProgressiveMediaSource */
    public static final class C1732b implements C1772x.C1773a {

        /* renamed from: a */
        private final C5828l.C5829a f5126a;

        /* renamed from: b */
        private C1704f0.C1705a f5127b;

        /* renamed from: c */
        private C4001b0 f5128c;

        /* renamed from: d */
        private C5804g0 f5129d;

        /* renamed from: e */
        private int f5130e;

        /* renamed from: f */
        private String f5131f;

        /* renamed from: g */
        private Object f5132g;

        public C1732b(C5828l.C5829a aVar) {
            this(aVar, (C4221r) new C4210i());
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static /* synthetic */ C1704f0 m8132c(C4221r rVar, C0079u1 u1Var) {
            return new C1692c(rVar);
        }

        /* renamed from: b */
        public C1730l0 mo6791b(C6300z1 z1Var) {
            C5917a.m34872e(z1Var.f30391b);
            C6300z1.C6311h hVar = z1Var.f30391b;
            boolean z = true;
            boolean z2 = hVar.f30463i == null && this.f5132g != null;
            if (hVar.f30460f != null || this.f5131f == null) {
                z = false;
            }
            if (z2 && z) {
                z1Var = z1Var.mo21584b().mo21591e(this.f5132g).mo21588b(this.f5131f).mo21587a();
            } else if (z2) {
                z1Var = z1Var.mo21584b().mo21591e(this.f5132g).mo21587a();
            } else if (z) {
                z1Var = z1Var.mo21584b().mo21588b(this.f5131f).mo21587a();
            }
            C6300z1 z1Var2 = z1Var;
            return new C1730l0(z1Var2, this.f5126a, this.f5127b, this.f5128c.mo17162a(z1Var2), this.f5129d, this.f5130e, (C1731a) null);
        }

        public C1732b(C5828l.C5829a aVar, C4221r rVar) {
            this(aVar, (C1704f0.C1705a) new C1735m0(rVar));
        }

        public C1732b(C5828l.C5829a aVar, C1704f0.C1705a aVar2) {
            this(aVar, aVar2, new C4033l(), new C5853x(), 1048576);
        }

        public C1732b(C5828l.C5829a aVar, C1704f0.C1705a aVar2, C4001b0 b0Var, C5804g0 g0Var, int i) {
            this.f5126a = aVar;
            this.f5127b = aVar2;
            this.f5128c = b0Var;
            this.f5129d = g0Var;
            this.f5130e = i;
        }
    }

    /* synthetic */ C1730l0(C6300z1 z1Var, C5828l.C5829a aVar, C1704f0.C1705a aVar2, C4052y yVar, C5804g0 g0Var, int i, C1731a aVar3) {
        this(z1Var, aVar, aVar2, yVar, g0Var, i);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [b3.l0$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8121F() {
        /*
            r9 = this;
            b3.u0 r8 = new b3.u0
            long r1 = r9.f5123x
            boolean r3 = r9.f5124y
            boolean r5 = r9.f5125z
            z1.z1 r7 = r9.f5115h
            r4 = 0
            r6 = 0
            r0 = r8
            r0.<init>(r1, r3, r4, r5, r6, r7)
            boolean r0 = r9.f5122w
            if (r0 == 0) goto L_0x001a
            b3.l0$a r0 = new b3.l0$a
            r0.<init>(r9, r8)
            r8 = r0
        L_0x001a:
            r9.mo6652D(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p015b3.C1730l0.m8121F():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo6651C(C5840p0 p0Var) {
        this.f5114A = p0Var;
        this.f5119t.mo17207H();
        this.f5119t.mo17210c((Looper) C5917a.m34872e(Looper.myLooper()), mo6649A());
        m8121F();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo6653E() {
        this.f5119t.mo17208a();
    }

    /* renamed from: d */
    public void mo6707d(C1765u uVar) {
        ((C1723k0) uVar).mo6777e0();
    }

    /* renamed from: g */
    public void mo6788g(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.f5123x;
        }
        if (this.f5122w || this.f5123x != j || this.f5124y != z || this.f5125z != z2) {
            this.f5123x = j;
            this.f5124y = z;
            this.f5125z = z2;
            this.f5122w = false;
            m8121F();
        }
    }

    /* renamed from: i */
    public C6300z1 mo6708i() {
        return this.f5115h;
    }

    /* renamed from: k */
    public C1765u mo6709k(C1772x.C1774b bVar, C5789b bVar2, long j) {
        C5828l a = this.f5117r.mo20353a();
        C5840p0 p0Var = this.f5114A;
        if (p0Var != null) {
            a.mo6818n(p0Var);
        }
        return new C1723k0(this.f5116i.f30455a, a, this.f5118s.mo6733a(mo6649A()), this.f5119t, mo6665u(bVar), this.f5120u, mo6667w(bVar), this, bVar2, this.f5116i.f30460f, this.f5121v);
    }

    /* renamed from: l */
    public void mo6710l() {
    }

    private C1730l0(C6300z1 z1Var, C5828l.C5829a aVar, C1704f0.C1705a aVar2, C4052y yVar, C5804g0 g0Var, int i) {
        this.f5116i = (C6300z1.C6311h) C5917a.m34872e(z1Var.f30391b);
        this.f5115h = z1Var;
        this.f5117r = aVar;
        this.f5118s = aVar2;
        this.f5119t = yVar;
        this.f5120u = g0Var;
        this.f5121v = i;
        this.f5122w = true;
        this.f5123x = -9223372036854775807L;
    }
}
