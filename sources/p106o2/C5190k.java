package p106o2;

import p014b2.C1621c0;
import p030d2.C4035m;
import p037e2.C4200e0;
import p037e2.C4217n;
import p106o2.C5183i0;
import p161w3.C5917a;
import p161w3.C5918a0;
import p177z1.C6272r1;

/* renamed from: o2.k */
/* compiled from: DtsReader */
public final class C5190k implements C5193m {

    /* renamed from: a */
    private final C5918a0 f26849a = new C5918a0(new byte[18]);

    /* renamed from: b */
    private final String f26850b;

    /* renamed from: c */
    private String f26851c;

    /* renamed from: d */
    private C4200e0 f26852d;

    /* renamed from: e */
    private int f26853e = 0;

    /* renamed from: f */
    private int f26854f;

    /* renamed from: g */
    private int f26855g;

    /* renamed from: h */
    private long f26856h;

    /* renamed from: i */
    private C6272r1 f26857i;

    /* renamed from: j */
    private int f26858j;

    /* renamed from: k */
    private long f26859k = -9223372036854775807L;

    public C5190k(String str) {
        this.f26850b = str;
    }

    /* renamed from: f */
    private boolean m32238f(C5918a0 a0Var, byte[] bArr, int i) {
        int min = Math.min(a0Var.mo20548a(), i - this.f26854f);
        a0Var.mo20557j(bArr, this.f26854f, min);
        int i2 = this.f26854f + min;
        this.f26854f = i2;
        return i2 == i;
    }

    /* renamed from: g */
    private void m32239g() {
        byte[] d = this.f26849a.mo20551d();
        if (this.f26857i == null) {
            C6272r1 g = C1621c0.m7443g(d, this.f26851c, this.f26850b, (C4035m) null);
            this.f26857i = g;
            this.f26852d.mo6845e(g);
        }
        this.f26858j = C1621c0.m7437a(d);
        this.f26856h = (long) ((int) ((((long) C1621c0.m7442f(d)) * 1000000) / ((long) this.f26857i.f30225H)));
    }

    /* renamed from: h */
    private boolean m32240h(C5918a0 a0Var) {
        while (a0Var.mo20548a() > 0) {
            int i = this.f26855g << 8;
            this.f26855g = i;
            int C = i | a0Var.mo20534C();
            this.f26855g = C;
            if (C1621c0.m7440d(C)) {
                byte[] d = this.f26849a.mo20551d();
                int i2 = this.f26855g;
                d[0] = (byte) ((i2 >> 24) & 255);
                d[1] = (byte) ((i2 >> 16) & 255);
                d[2] = (byte) ((i2 >> 8) & 255);
                d[3] = (byte) (i2 & 255);
                this.f26854f = 4;
                this.f26855g = 0;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo19147a(C5918a0 a0Var) {
        C5917a.m34875h(this.f26852d);
        while (a0Var.mo20548a() > 0) {
            int i = this.f26853e;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(a0Var.mo20548a(), this.f26858j - this.f26854f);
                        this.f26852d.mo6843d(a0Var, min);
                        int i2 = this.f26854f + min;
                        this.f26854f = i2;
                        int i3 = this.f26858j;
                        if (i2 == i3) {
                            long j = this.f26859k;
                            if (j != -9223372036854775807L) {
                                this.f26852d.mo6838a(j, 1, i3, 0, (C4200e0.C4201a) null);
                                this.f26859k += this.f26856h;
                            }
                            this.f26853e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (m32238f(a0Var, this.f26849a.mo20551d(), 18)) {
                    m32239g();
                    this.f26849a.mo20546O(0);
                    this.f26852d.mo6843d(this.f26849a, 18);
                    this.f26853e = 2;
                }
            } else if (m32240h(a0Var)) {
                this.f26853e = 1;
            }
        }
    }

    /* renamed from: b */
    public void mo19148b() {
        this.f26853e = 0;
        this.f26854f = 0;
        this.f26855g = 0;
        this.f26859k = -9223372036854775807L;
    }

    /* renamed from: c */
    public void mo19149c() {
    }

    /* renamed from: d */
    public void mo19150d(C4217n nVar, C5183i0.C5187d dVar) {
        dVar.mo19164a();
        this.f26851c = dVar.mo19165b();
        this.f26852d = nVar.mo6778f(dVar.mo19166c(), 1);
    }

    /* renamed from: e */
    public void mo19151e(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f26859k = j;
        }
    }
}
