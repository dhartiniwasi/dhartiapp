package p065i2;

import p037e2.C4200e0;
import p065i2.C4653e;
import p161w3.C5918a0;
import p161w3.C5970w;
import p167x3.C6052a;
import p177z1.C6249m2;
import p177z1.C6272r1;

/* renamed from: i2.f */
/* compiled from: VideoTagPayloadReader */
final class C4655f extends C4653e {

    /* renamed from: b */
    private final C5918a0 f25182b = new C5918a0(C5970w.f29150a);

    /* renamed from: c */
    private final C5918a0 f25183c = new C5918a0(4);

    /* renamed from: d */
    private int f25184d;

    /* renamed from: e */
    private boolean f25185e;

    /* renamed from: f */
    private boolean f25186f;

    /* renamed from: g */
    private int f25187g;

    public C4655f(C4200e0 e0Var) {
        super(e0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo18326b(C5918a0 a0Var) throws C4653e.C4654a {
        int C = a0Var.mo20534C();
        int i = (C >> 4) & 15;
        int i2 = C & 15;
        if (i2 == 7) {
            this.f25187g = i;
            return i != 5;
        }
        throw new C4653e.C4654a("Video format not supported: " + i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo18327c(C5918a0 a0Var, long j) throws C6249m2 {
        int C = a0Var.mo20534C();
        long n = j + (((long) a0Var.mo20561n()) * 1000);
        if (C == 0 && !this.f25185e) {
            C5918a0 a0Var2 = new C5918a0(new byte[a0Var.mo20548a()]);
            a0Var.mo20557j(a0Var2.mo20551d(), 0, a0Var.mo20548a());
            C6052a b = C6052a.m35496b(a0Var2);
            this.f25184d = b.f29326b;
            this.f25181a.mo6845e(new C6272r1.C6274b().mo21517e0("video/avc").mo21495I(b.f29330f).mo21522j0(b.f29327c).mo21503Q(b.f29328d).mo21513a0(b.f29329e).mo21506T(b.f29325a).mo21491E());
            this.f25185e = true;
            return false;
        } else if (C != 1 || !this.f25185e) {
            return false;
        } else {
            int i = this.f25187g == 1 ? 1 : 0;
            if (!this.f25186f && i == 0) {
                return false;
            }
            byte[] d = this.f25183c.mo20551d();
            d[0] = 0;
            d[1] = 0;
            d[2] = 0;
            int i2 = 4 - this.f25184d;
            int i3 = 0;
            while (a0Var.mo20548a() > 0) {
                a0Var.mo20557j(this.f25183c.mo20551d(), i2, this.f25184d);
                this.f25183c.mo20546O(0);
                int G = this.f25183c.mo20538G();
                this.f25182b.mo20546O(0);
                this.f25181a.mo6843d(this.f25182b, 4);
                this.f25181a.mo6843d(a0Var, G);
                i3 = i3 + 4 + G;
            }
            this.f25181a.mo6838a(n, i, i3, 0, (C4200e0.C4201a) null);
            this.f25186f = true;
            return true;
        }
    }
}
