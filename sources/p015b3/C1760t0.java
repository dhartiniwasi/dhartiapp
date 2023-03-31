package p015b3;

import android.net.Uri;
import java.util.ArrayList;
import p015b3.C1765u;
import p015b3.C1772x;
import p021c2.C1848g;
import p155v3.C5789b;
import p155v3.C5840p0;
import p161w3.C5917a;
import p161w3.C5953m0;
import p177z1.C6229i3;
import p177z1.C6272r1;
import p177z1.C6279s1;
import p177z1.C6300z1;

/* renamed from: b3.t0 */
/* compiled from: SilenceMediaSource */
public final class C1760t0 extends C1687a {
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final C6272r1 f5242r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final C6300z1 f5243s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final byte[] f5244t = new byte[(C5953m0.m35127d0(2, 2) * 1024)];

    /* renamed from: h */
    private final long f5245h;

    /* renamed from: i */
    private final C6300z1 f5246i;

    /* renamed from: b3.t0$b */
    /* compiled from: SilenceMediaSource */
    public static final class C1762b {

        /* renamed from: a */
        private long f5247a;

        /* renamed from: b */
        private Object f5248b;

        /* renamed from: a */
        public C1760t0 mo6881a() {
            C5917a.m34873f(this.f5247a > 0);
            return new C1760t0(this.f5247a, C1760t0.f5243s.mo21584b().mo21591e(this.f5248b).mo21587a());
        }

        /* renamed from: b */
        public C1762b mo6882b(long j) {
            this.f5247a = j;
            return this;
        }

        /* renamed from: c */
        public C1762b mo6883c(Object obj) {
            this.f5248b = obj;
            return this;
        }
    }

    /* renamed from: b3.t0$c */
    /* compiled from: SilenceMediaSource */
    private static final class C1763c implements C1765u {

        /* renamed from: c */
        private static final C1780z0 f5249c = new C1780z0(new C1776x0(C1760t0.f5242r));

        /* renamed from: a */
        private final long f5250a;

        /* renamed from: b */
        private final ArrayList<C1749q0> f5251b = new ArrayList<>();

        public C1763c(long j) {
            this.f5250a = j;
        }

        /* renamed from: a */
        private long m8332a(long j) {
            return C5953m0.m35154r(j, 0, this.f5250a);
        }

        /* renamed from: c */
        public long mo6681c(long j, C6229i3 i3Var) {
            return m8332a(j);
        }

        /* renamed from: d */
        public long mo6682d() {
            return Long.MIN_VALUE;
        }

        /* renamed from: e */
        public boolean mo6683e(long j) {
            return false;
        }

        /* renamed from: g */
        public long mo6685g() {
            return Long.MIN_VALUE;
        }

        /* renamed from: h */
        public void mo6686h(long j) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo6687i(p149u3.C5735s[] r5, boolean[] r6, p015b3.C1749q0[] r7, boolean[] r8, long r9) {
            /*
                r4 = this;
                long r9 = r4.m8332a(r9)
                r0 = 0
            L_0x0005:
                int r1 = r5.length
                if (r0 >= r1) goto L_0x003d
                r1 = r7[r0]
                if (r1 == 0) goto L_0x001e
                r1 = r5[r0]
                if (r1 == 0) goto L_0x0014
                boolean r1 = r6[r0]
                if (r1 != 0) goto L_0x001e
            L_0x0014:
                java.util.ArrayList<b3.q0> r1 = r4.f5251b
                r2 = r7[r0]
                r1.remove(r2)
                r1 = 0
                r7[r0] = r1
            L_0x001e:
                r1 = r7[r0]
                if (r1 != 0) goto L_0x003a
                r1 = r5[r0]
                if (r1 == 0) goto L_0x003a
                b3.t0$d r1 = new b3.t0$d
                long r2 = r4.f5250a
                r1.<init>(r2)
                r1.mo6884a(r9)
                java.util.ArrayList<b3.q0> r2 = r4.f5251b
                r2.add(r1)
                r7[r0] = r1
                r1 = 1
                r8[r0] = r1
            L_0x003a:
                int r0 = r0 + 1
                goto L_0x0005
            L_0x003d:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p015b3.C1760t0.C1763c.mo6687i(u3.s[], boolean[], b3.q0[], boolean[], long):long");
        }

        public boolean isLoading() {
            return false;
        }

        /* renamed from: k */
        public void mo6690k() {
        }

        /* renamed from: m */
        public long mo6691m(long j) {
            long a = m8332a(j);
            for (int i = 0; i < this.f5251b.size(); i++) {
                ((C1764d) this.f5251b.get(i)).mo6884a(a);
            }
            return a;
        }

        /* renamed from: p */
        public long mo6694p() {
            return -9223372036854775807L;
        }

        /* renamed from: r */
        public void mo6695r(C1765u.C1766a aVar, long j) {
            aVar.mo6680b(this);
        }

        /* renamed from: s */
        public C1780z0 mo6696s() {
            return f5249c;
        }

        /* renamed from: t */
        public void mo6697t(long j, boolean z) {
        }
    }

    /* renamed from: b3.t0$d */
    /* compiled from: SilenceMediaSource */
    private static final class C1764d implements C1749q0 {

        /* renamed from: a */
        private final long f5252a;

        /* renamed from: b */
        private boolean f5253b;

        /* renamed from: c */
        private long f5254c;

        public C1764d(long j) {
            this.f5252a = C1760t0.m8321K(j);
            mo6884a(0);
        }

        /* renamed from: a */
        public void mo6884a(long j) {
            this.f5254c = C5953m0.m35154r(C1760t0.m8321K(j), 0, this.f5252a);
        }

        /* renamed from: b */
        public void mo6700b() {
        }

        /* renamed from: f */
        public int mo6701f(C6279s1 s1Var, C1848g gVar, int i) {
            if (!this.f5253b || (i & 2) != 0) {
                s1Var.f30328b = C1760t0.f5242r;
                this.f5253b = true;
                return -5;
            }
            long j = this.f5252a;
            long j2 = this.f5254c;
            long j3 = j - j2;
            if (j3 == 0) {
                gVar.mo7028k(4);
                return -4;
            }
            gVar.f5432e = C1760t0.m8322L(j2);
            gVar.mo7028k(1);
            int min = (int) Math.min((long) C1760t0.f5244t.length, j3);
            if ((i & 4) == 0) {
                gVar.mo7050x(min);
                gVar.f5430c.put(C1760t0.f5244t, 0, min);
            }
            if ((i & 1) == 0) {
                this.f5254c += (long) min;
            }
            return -4;
        }

        public boolean isReady() {
            return true;
        }

        /* renamed from: l */
        public int mo6703l(long j) {
            long j2 = this.f5254c;
            mo6884a(j);
            return (int) ((this.f5254c - j2) / ((long) C1760t0.f5244t.length));
        }
    }

    static {
        C6272r1 E = new C6272r1.C6274b().mo21517e0("audio/raw").mo21494H(2).mo21518f0(44100).mo21511Y(2).mo21491E();
        f5242r = E;
        f5243s = new C6300z1.C6303c().mo21589c("SilenceMediaSource").mo21592f(Uri.EMPTY).mo21590d(E.f30243t).mo21587a();
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public static long m8321K(long j) {
        return ((long) C5953m0.m35127d0(2, 2)) * ((j * 44100) / 1000000);
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public static long m8322L(long j) {
        return ((j / ((long) C5953m0.m35127d0(2, 2))) * 1000000) / 44100;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo6651C(C5840p0 p0Var) {
        mo6652D(new C1767u0(this.f5245h, true, false, false, (Object) null, this.f5246i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo6653E() {
    }

    /* renamed from: d */
    public void mo6707d(C1765u uVar) {
    }

    /* renamed from: i */
    public C6300z1 mo6708i() {
        return this.f5246i;
    }

    /* renamed from: k */
    public C1765u mo6709k(C1772x.C1774b bVar, C5789b bVar2, long j) {
        return new C1763c(this.f5245h);
    }

    /* renamed from: l */
    public void mo6710l() {
    }

    private C1760t0(long j, C6300z1 z1Var) {
        C5917a.m34868a(j >= 0);
        this.f5245h = j;
        this.f5246i = z1Var;
    }
}
