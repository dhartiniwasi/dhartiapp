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

/* renamed from: o2.b */
/* compiled from: Ac3Extractor */
public final class C5168b implements C4215l {

    /* renamed from: d */
    public static final C4221r f26719d = C12010a.f44975b;

    /* renamed from: a */
    private final C5170c f26720a = new C5170c();

    /* renamed from: b */
    private final C5918a0 f26721b = new C5918a0(2786);

    /* renamed from: c */
    private boolean f26722c;

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ C4215l[] m32104f() {
        return new C4215l[]{new C5168b()};
    }

    /* renamed from: a */
    public void mo17579a() {
    }

    /* renamed from: c */
    public void mo17580c(long j, long j2) {
        this.f26722c = false;
        this.f26720a.mo19148b();
    }

    /* renamed from: d */
    public void mo17581d(C4217n nVar) {
        this.f26720a.mo19150d(nVar, new C5183i0.C5187d(0, 1));
        nVar.mo6782n();
        nVar.mo6781l(new C4192b0.C4194b(-9223372036854775807L));
    }

    /* renamed from: e */
    public int mo17582e(C4216m mVar, C4190a0 a0Var) throws IOException {
        int read = mVar.read(this.f26721b.mo20551d(), 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.f26721b.mo20546O(0);
        this.f26721b.mo20545N(read);
        if (!this.f26722c) {
            this.f26720a.mo19151e(0, 4);
            this.f26722c = true;
        }
        this.f26720a.mo19147a(this.f26721b);
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        r8.mo17560j();
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0040, code lost:
        if ((r4 - r3) < 8192) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        return false;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo17583h(p037e2.C4216m r8) throws java.io.IOException {
        /*
            r7 = this;
            w3.a0 r0 = new w3.a0
            r1 = 10
            r0.<init>((int) r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.mo20551d()
            r8.mo17563p(r4, r2, r1)
            r0.mo20546O(r2)
            int r4 = r0.mo20537F()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L_0x005f
            r8.mo17560j()
            r8.mo17558g(r3)
            r4 = r3
        L_0x0023:
            r1 = 0
        L_0x0024:
            byte[] r5 = r0.mo20551d()
            r6 = 6
            r8.mo17563p(r5, r2, r6)
            r0.mo20546O(r2)
            int r5 = r0.mo20540I()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r5 == r6) goto L_0x0047
            r8.mo17560j()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L_0x0043
            return r2
        L_0x0043:
            r8.mo17558g(r4)
            goto L_0x0023
        L_0x0047:
            r5 = 1
            int r1 = r1 + r5
            r6 = 4
            if (r1 < r6) goto L_0x004d
            return r5
        L_0x004d:
            byte[] r5 = r0.mo20551d()
            int r5 = p014b2.C1613b.m7413f(r5)
            r6 = -1
            if (r5 != r6) goto L_0x0059
            return r2
        L_0x0059:
            int r5 = r5 + -6
            r8.mo17558g(r5)
            goto L_0x0024
        L_0x005f:
            r4 = 3
            r0.mo20547P(r4)
            int r4 = r0.mo20533B()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r8.mo17558g(r4)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: p106o2.C5168b.mo17583h(e2.m):boolean");
    }
}
