package p113p2;

import android.util.Pair;
import java.io.IOException;
import p037e2.C4216m;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5953m0;
import p161w3.C5961r;
import p177z1.C6249m2;

/* renamed from: p2.d */
/* compiled from: WavHeaderReader */
final class C5267d {

    /* renamed from: p2.d$a */
    /* compiled from: WavHeaderReader */
    private static final class C5268a {

        /* renamed from: a */
        public final int f27168a;

        /* renamed from: b */
        public final long f27169b;

        private C5268a(int i, long j) {
            this.f27168a = i;
            this.f27169b = j;
        }

        /* renamed from: a */
        public static C5268a m32512a(C4216m mVar, C5918a0 a0Var) throws IOException {
            mVar.mo17563p(a0Var.mo20551d(), 0, 8);
            a0Var.mo20546O(0);
            return new C5268a(a0Var.mo20560m(), a0Var.mo20566s());
        }
    }

    /* renamed from: a */
    public static boolean m32507a(C4216m mVar) throws IOException {
        C5918a0 a0Var = new C5918a0(8);
        int i = C5268a.m32512a(mVar, a0Var).f27168a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        mVar.mo17563p(a0Var.mo20551d(), 0, 4);
        a0Var.mo20546O(0);
        int m = a0Var.mo20560m();
        if (m == 1463899717) {
            return true;
        }
        C5961r.m35209c("WavHeaderReader", "Unsupported form type: " + m);
        return false;
    }

    /* renamed from: b */
    public static C5266c m32508b(C4216m mVar) throws IOException {
        byte[] bArr;
        C5918a0 a0Var = new C5918a0(16);
        C5268a d = m32510d(1718449184, mVar, a0Var);
        C5917a.m34873f(d.f27169b >= 16);
        mVar.mo17563p(a0Var.mo20551d(), 0, 16);
        a0Var.mo20546O(0);
        int u = a0Var.mo20568u();
        int u2 = a0Var.mo20568u();
        int t = a0Var.mo20567t();
        int t2 = a0Var.mo20567t();
        int u3 = a0Var.mo20568u();
        int u4 = a0Var.mo20568u();
        int i = ((int) d.f27169b) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            mVar.mo17563p(bArr2, 0, i);
            bArr = bArr2;
        } else {
            bArr = C5953m0.f29115f;
        }
        mVar.mo17561k((int) (mVar.mo17557f() - mVar.mo17554c()));
        return new C5266c(u, u2, t, t2, u3, u4, bArr);
    }

    /* renamed from: c */
    public static long m32509c(C4216m mVar) throws IOException {
        C5918a0 a0Var = new C5918a0(8);
        C5268a a = C5268a.m32512a(mVar, a0Var);
        if (a.f27168a != 1685272116) {
            mVar.mo17560j();
            return -1;
        }
        mVar.mo17558g(8);
        a0Var.mo20546O(0);
        mVar.mo17563p(a0Var.mo20551d(), 0, 8);
        long q = a0Var.mo20564q();
        mVar.mo17561k(((int) a.f27169b) + 8);
        return q;
    }

    /* renamed from: d */
    private static C5268a m32510d(int i, C4216m mVar, C5918a0 a0Var) throws IOException {
        C5268a a = C5268a.m32512a(mVar, a0Var);
        while (a.f27168a != i) {
            C5961r.m35215i("WavHeaderReader", "Ignoring unknown WAV chunk: " + a.f27168a);
            long j = a.f27169b + 8;
            if (j <= 2147483647L) {
                mVar.mo17561k((int) j);
                a = C5268a.m32512a(mVar, a0Var);
            } else {
                throw C6249m2.m36664d("Chunk is too large (~2GB+) to skip; id: " + a.f27168a);
            }
        }
        return a;
    }

    /* renamed from: e */
    public static Pair<Long, Long> m32511e(C4216m mVar) throws IOException {
        mVar.mo17560j();
        C5268a d = m32510d(1684108385, mVar, new C5918a0(8));
        mVar.mo17561k(8);
        return Pair.create(Long.valueOf(mVar.mo17554c()), Long.valueOf(d.f27169b));
    }
}
