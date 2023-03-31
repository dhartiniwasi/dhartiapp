package p106o2;

import java.io.IOException;
import p037e2.C4190a0;
import p037e2.C4192b0;
import p037e2.C4215l;
import p037e2.C4216m;
import p037e2.C4217n;
import p037e2.C4221r;
import p106o2.C5183i0;
import p161w3.C5918a0;

/* renamed from: o2.e */
/* compiled from: Ac4Extractor */
public final class C5173e implements C4215l {

    /* renamed from: d */
    public static final C4221r f26743d = C12011d.f44976b;

    /* renamed from: a */
    private final C5176f f26744a = new C5176f();

    /* renamed from: b */
    private final C5918a0 f26745b = new C5918a0(16384);

    /* renamed from: c */
    private boolean f26746c;

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ C4215l[] m32126f() {
        return new C4215l[]{new C5173e()};
    }

    /* renamed from: a */
    public void mo17579a() {
    }

    /* renamed from: c */
    public void mo17580c(long j, long j2) {
        this.f26746c = false;
        this.f26744a.mo19148b();
    }

    /* renamed from: d */
    public void mo17581d(C4217n nVar) {
        this.f26744a.mo19150d(nVar, new C5183i0.C5187d(0, 1));
        nVar.mo6782n();
        nVar.mo6781l(new C4192b0.C4194b(-9223372036854775807L));
    }

    /* renamed from: e */
    public int mo17582e(C4216m mVar, C4190a0 a0Var) throws IOException {
        int read = mVar.read(this.f26745b.mo20551d(), 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.f26745b.mo20546O(0);
        this.f26745b.mo20545N(read);
        if (!this.f26746c) {
            this.f26744a.mo19151e(0, 4);
            this.f26746c = true;
        }
        this.f26744a.mo19147a(this.f26745b);
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        if ((r4 - r3) < 8192) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0048, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        r9.mo17560j();
        r4 = r4 + 1;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo17583h(p037e2.C4216m r9) throws java.io.IOException {
        /*
            r8 = this;
            w3.a0 r0 = new w3.a0
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.mo20551d()
            r9.mo17563p(r4, r2, r1)
            r0.mo20546O(r2)
            int r4 = r0.mo20537F()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L_0x0065
            r9.mo17560j()
            r9.mo17558g(r3)
            r4 = r3
        L_0x0023:
            r1 = 0
        L_0x0024:
            byte[] r5 = r0.mo20551d()
            r6 = 7
            r9.mo17563p(r5, r2, r6)
            r0.mo20546O(r2)
            int r5 = r0.mo20540I()
            r6 = 44096(0xac40, float:6.1792E-41)
            if (r5 == r6) goto L_0x004d
            r6 = 44097(0xac41, float:6.1793E-41)
            if (r5 == r6) goto L_0x004d
            r9.mo17560j()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L_0x0049
            return r2
        L_0x0049:
            r9.mo17558g(r4)
            goto L_0x0023
        L_0x004d:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L_0x0053
            return r6
        L_0x0053:
            byte[] r6 = r0.mo20551d()
            int r5 = p014b2.C1618c.m7435e(r6, r5)
            r6 = -1
            if (r5 != r6) goto L_0x005f
            return r2
        L_0x005f:
            int r5 = r5 + -7
            r9.mo17558g(r5)
            goto L_0x0024
        L_0x0065:
            r4 = 3
            r0.mo20547P(r4)
            int r4 = r0.mo20533B()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r9.mo17558g(r4)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: p106o2.C5173e.mo17583h(e2.m):boolean");
    }
}
