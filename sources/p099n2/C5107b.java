package p099n2;

import java.util.Arrays;
import p037e2.C4192b0;
import p037e2.C4216m;
import p037e2.C4222s;
import p037e2.C4224t;
import p037e2.C4226u;
import p037e2.C4227v;
import p099n2.C5114i;
import p127r2.C5432a;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5953m0;

/* renamed from: n2.b */
/* compiled from: FlacReader */
final class C5107b extends C5114i {

    /* renamed from: n */
    private C4227v f26573n;

    /* renamed from: o */
    private C5108a f26574o;

    /* renamed from: n2.b$a */
    /* compiled from: FlacReader */
    private static final class C5108a implements C5112g {

        /* renamed from: a */
        private C4227v f26575a;

        /* renamed from: b */
        private C4227v.C4228a f26576b;

        /* renamed from: c */
        private long f26577c = -1;

        /* renamed from: d */
        private long f26578d = -1;

        public C5108a(C4227v vVar, C4227v.C4228a aVar) {
            this.f26575a = vVar;
            this.f26576b = aVar;
        }

        /* renamed from: a */
        public C4192b0 mo19066a() {
            C5917a.m34873f(this.f26577c != -1);
            return new C4226u(this.f26575a, this.f26577c);
        }

        /* renamed from: b */
        public long mo19067b(C4216m mVar) {
            long j = this.f26578d;
            if (j < 0) {
                return -1;
            }
            long j2 = -(j + 2);
            this.f26578d = -1;
            return j2;
        }

        /* renamed from: c */
        public void mo19068c(long j) {
            long[] jArr = this.f26576b.f23581a;
            this.f26578d = jArr[C5953m0.m35136i(jArr, j, true, true)];
        }

        /* renamed from: d */
        public void mo19074d(long j) {
            this.f26577c = j;
        }
    }

    C5107b() {
    }

    /* renamed from: n */
    private int m31932n(C5918a0 a0Var) {
        int i = (a0Var.mo20551d()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            a0Var.mo20547P(4);
            a0Var.mo20541J();
        }
        int j = C4222s.m28499j(a0Var, i);
        a0Var.mo20546O(0);
        return j;
    }

    /* renamed from: o */
    private static boolean m31933o(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* renamed from: p */
    public static boolean m31934p(C5918a0 a0Var) {
        return a0Var.mo20548a() >= 5 && a0Var.mo20534C() == 127 && a0Var.mo20536E() == 1179402563;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public long mo19071f(C5918a0 a0Var) {
        if (!m31933o(a0Var.mo20551d())) {
            return -1;
        }
        return (long) m31932n(a0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo19072i(C5918a0 a0Var, long j, C5114i.C5116b bVar) {
        byte[] d = a0Var.mo20551d();
        C4227v vVar = this.f26573n;
        if (vVar == null) {
            C4227v vVar2 = new C4227v(d, 17);
            this.f26573n = vVar2;
            bVar.f26615a = vVar2.mo17589g(Arrays.copyOfRange(d, 9, a0Var.mo20553f()), (C5432a) null);
            return true;
        } else if ((d[0] & Byte.MAX_VALUE) == 3) {
            C4227v.C4228a g = C4224t.m28506g(a0Var);
            C4227v b = vVar.mo17585b(g);
            this.f26573n = b;
            this.f26574o = new C5108a(b, g);
            return true;
        } else if (!m31933o(d)) {
            return true;
        } else {
            C5108a aVar = this.f26574o;
            if (aVar != null) {
                aVar.mo19074d(j);
                bVar.f26616b = this.f26574o;
            }
            C5917a.m34872e(bVar.f26615a);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo19073l(boolean z) {
        super.mo19073l(z);
        if (z) {
            this.f26573n = null;
            this.f26574o = null;
        }
    }
}
