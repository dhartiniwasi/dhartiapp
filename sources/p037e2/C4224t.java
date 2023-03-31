package p037e2;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import p037e2.C4227v;
import p127r2.C5432a;
import p148u2.C5709a;
import p160w2.C5903h;
import p161w3.C5918a0;
import p161w3.C5980z;
import p177z1.C6249m2;
import p190b7.C6685q;

/* renamed from: e2.t */
/* compiled from: FlacMetadataReader */
public final class C4224t {

    /* renamed from: e2.t$a */
    /* compiled from: FlacMetadataReader */
    public static final class C4225a {

        /* renamed from: a */
        public C4227v f23566a;

        public C4225a(C4227v vVar) {
            this.f23566a = vVar;
        }
    }

    /* renamed from: a */
    public static boolean m28500a(C4216m mVar) throws IOException {
        C5918a0 a0Var = new C5918a0(4);
        mVar.mo17563p(a0Var.mo20551d(), 0, 4);
        if (a0Var.mo20536E() == 1716281667) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static int m28501b(C4216m mVar) throws IOException {
        mVar.mo17560j();
        C5918a0 a0Var = new C5918a0(2);
        mVar.mo17563p(a0Var.mo20551d(), 0, 2);
        int I = a0Var.mo20540I();
        if ((I >> 2) == 16382) {
            mVar.mo17560j();
            return I;
        }
        mVar.mo17560j();
        throw C6249m2.m36661a("First frame does not start with sync code.", (Throwable) null);
    }

    /* renamed from: c */
    public static C5432a m28502c(C4216m mVar, boolean z) throws IOException {
        C5432a a = new C4231y().mo17595a(mVar, z ? null : C5903h.f29027b);
        if (a == null || a.mo19696d() == 0) {
            return null;
        }
        return a;
    }

    /* renamed from: d */
    public static C5432a m28503d(C4216m mVar, boolean z) throws IOException {
        mVar.mo17560j();
        long f = mVar.mo17557f();
        C5432a c = m28502c(mVar, z);
        mVar.mo17561k((int) (mVar.mo17557f() - f));
        return c;
    }

    /* renamed from: e */
    public static boolean m28504e(C4216m mVar, C4225a aVar) throws IOException {
        mVar.mo17560j();
        C5980z zVar = new C5980z(new byte[4]);
        mVar.mo17563p(zVar.f29188a, 0, 4);
        boolean g = zVar.mo20675g();
        int h = zVar.mo20676h(7);
        int h2 = zVar.mo20676h(24) + 4;
        if (h == 0) {
            aVar.f23566a = m28507h(mVar);
        } else {
            C4227v vVar = aVar.f23566a;
            if (vVar == null) {
                throw new IllegalArgumentException();
            } else if (h == 3) {
                aVar.f23566a = vVar.mo17585b(m28505f(mVar, h2));
            } else if (h == 4) {
                aVar.f23566a = vVar.mo17586c(m28509j(mVar, h2));
            } else if (h == 6) {
                C5918a0 a0Var = new C5918a0(h2);
                mVar.readFully(a0Var.mo20551d(), 0, h2);
                a0Var.mo20547P(4);
                aVar.f23566a = vVar.mo17584a(C6685q.m38446y(C5709a.m34042a(a0Var)));
            } else {
                mVar.mo17561k(h2);
            }
        }
        return g;
    }

    /* renamed from: f */
    private static C4227v.C4228a m28505f(C4216m mVar, int i) throws IOException {
        C5918a0 a0Var = new C5918a0(i);
        mVar.readFully(a0Var.mo20551d(), 0, i);
        return m28506g(a0Var);
    }

    /* renamed from: g */
    public static C4227v.C4228a m28506g(C5918a0 a0Var) {
        a0Var.mo20547P(1);
        int F = a0Var.mo20537F();
        long e = ((long) a0Var.mo20552e()) + ((long) F);
        int i = F / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long v = a0Var.mo20569v();
            if (v == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = v;
            jArr2[i2] = a0Var.mo20569v();
            a0Var.mo20547P(2);
            i2++;
        }
        a0Var.mo20547P((int) (e - ((long) a0Var.mo20552e())));
        return new C4227v.C4228a(jArr, jArr2);
    }

    /* renamed from: h */
    private static C4227v m28507h(C4216m mVar) throws IOException {
        byte[] bArr = new byte[38];
        mVar.readFully(bArr, 0, 38);
        return new C4227v(bArr, 4);
    }

    /* renamed from: i */
    public static void m28508i(C4216m mVar) throws IOException {
        C5918a0 a0Var = new C5918a0(4);
        mVar.readFully(a0Var.mo20551d(), 0, 4);
        if (a0Var.mo20536E() != 1716281667) {
            throw C6249m2.m36661a("Failed to read FLAC stream marker.", (Throwable) null);
        }
    }

    /* renamed from: j */
    private static List<String> m28509j(C4216m mVar, int i) throws IOException {
        C5918a0 a0Var = new C5918a0(i);
        mVar.readFully(a0Var.mo20551d(), 0, i);
        a0Var.mo20547P(4);
        return Arrays.asList(C4205h0.m28433j(a0Var, false, false).f23528b);
    }
}
