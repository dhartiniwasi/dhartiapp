package p106o2;

import p014b2.C1618c;
import p037e2.C4200e0;
import p037e2.C4217n;
import p106o2.C5183i0;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5980z;
import p177z1.C6272r1;

/* renamed from: o2.f */
/* compiled from: Ac4Reader */
public final class C5176f implements C5193m {

    /* renamed from: a */
    private final C5980z f26751a;

    /* renamed from: b */
    private final C5918a0 f26752b;

    /* renamed from: c */
    private final String f26753c;

    /* renamed from: d */
    private String f26754d;

    /* renamed from: e */
    private C4200e0 f26755e;

    /* renamed from: f */
    private int f26756f;

    /* renamed from: g */
    private int f26757g;

    /* renamed from: h */
    private boolean f26758h;

    /* renamed from: i */
    private boolean f26759i;

    /* renamed from: j */
    private long f26760j;

    /* renamed from: k */
    private C6272r1 f26761k;

    /* renamed from: l */
    private int f26762l;

    /* renamed from: m */
    private long f26763m;

    public C5176f() {
        this((String) null);
    }

    /* renamed from: f */
    private boolean m32135f(C5918a0 a0Var, byte[] bArr, int i) {
        int min = Math.min(a0Var.mo20548a(), i - this.f26757g);
        a0Var.mo20557j(bArr, this.f26757g, min);
        int i2 = this.f26757g + min;
        this.f26757g = i2;
        return i2 == i;
    }

    /* renamed from: g */
    private void m32136g() {
        this.f26751a.mo20684p(0);
        C1618c.C1620b d = C1618c.m7434d(this.f26751a);
        C6272r1 r1Var = this.f26761k;
        if (r1Var == null || d.f4645c != r1Var.f30224G || d.f4644b != r1Var.f30225H || !"audio/ac4".equals(r1Var.f30243t)) {
            C6272r1 E = new C6272r1.C6274b().mo21505S(this.f26754d).mo21517e0("audio/ac4").mo21494H(d.f4645c).mo21518f0(d.f4644b).mo21508V(this.f26753c).mo21491E();
            this.f26761k = E;
            this.f26755e.mo6845e(E);
        }
        this.f26762l = d.f4646d;
        this.f26760j = (((long) d.f4647e) * 1000000) / ((long) this.f26761k.f30225H);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m32137h(p161w3.C5918a0 r6) {
        /*
            r5 = this;
        L_0x0000:
            int r0 = r6.mo20548a()
            r1 = 0
            if (r0 <= 0) goto L_0x0031
            boolean r0 = r5.f26758h
            r2 = 172(0xac, float:2.41E-43)
            r3 = 1
            if (r0 != 0) goto L_0x0018
            int r0 = r6.mo20534C()
            if (r0 != r2) goto L_0x0015
            r1 = 1
        L_0x0015:
            r5.f26758h = r1
            goto L_0x0000
        L_0x0018:
            int r0 = r6.mo20534C()
            if (r0 != r2) goto L_0x0020
            r2 = 1
            goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            r5.f26758h = r2
            r2 = 64
            r4 = 65
            if (r0 == r2) goto L_0x002b
            if (r0 != r4) goto L_0x0000
        L_0x002b:
            if (r0 != r4) goto L_0x002e
            r1 = 1
        L_0x002e:
            r5.f26759i = r1
            return r3
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p106o2.C5176f.m32137h(w3.a0):boolean");
    }

    /* renamed from: a */
    public void mo19147a(C5918a0 a0Var) {
        C5917a.m34875h(this.f26755e);
        while (a0Var.mo20548a() > 0) {
            int i = this.f26756f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(a0Var.mo20548a(), this.f26762l - this.f26757g);
                        this.f26755e.mo6843d(a0Var, min);
                        int i2 = this.f26757g + min;
                        this.f26757g = i2;
                        int i3 = this.f26762l;
                        if (i2 == i3) {
                            long j = this.f26763m;
                            if (j != -9223372036854775807L) {
                                this.f26755e.mo6838a(j, 1, i3, 0, (C4200e0.C4201a) null);
                                this.f26763m += this.f26760j;
                            }
                            this.f26756f = 0;
                        }
                    }
                } else if (m32135f(a0Var, this.f26752b.mo20551d(), 16)) {
                    m32136g();
                    this.f26752b.mo20546O(0);
                    this.f26755e.mo6843d(this.f26752b, 16);
                    this.f26756f = 2;
                }
            } else if (m32137h(a0Var)) {
                this.f26756f = 1;
                this.f26752b.mo20551d()[0] = -84;
                this.f26752b.mo20551d()[1] = (byte) (this.f26759i ? 65 : 64);
                this.f26757g = 2;
            }
        }
    }

    /* renamed from: b */
    public void mo19148b() {
        this.f26756f = 0;
        this.f26757g = 0;
        this.f26758h = false;
        this.f26759i = false;
        this.f26763m = -9223372036854775807L;
    }

    /* renamed from: c */
    public void mo19149c() {
    }

    /* renamed from: d */
    public void mo19150d(C4217n nVar, C5183i0.C5187d dVar) {
        dVar.mo19164a();
        this.f26754d = dVar.mo19165b();
        this.f26755e = nVar.mo6778f(dVar.mo19166c(), 1);
    }

    /* renamed from: e */
    public void mo19151e(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f26763m = j;
        }
    }

    public C5176f(String str) {
        C5980z zVar = new C5980z(new byte[16]);
        this.f26751a = zVar;
        this.f26752b = new C5918a0(zVar.f29188a);
        this.f26756f = 0;
        this.f26757g = 0;
        this.f26758h = false;
        this.f26759i = false;
        this.f26763m = -9223372036854775807L;
        this.f26753c = str;
    }
}
