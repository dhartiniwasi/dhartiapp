package p037e2;

import com.facebook.ads.AdError;
import java.io.IOException;
import p161w3.C5918a0;
import p161w3.C5953m0;
import p177z1.C6249m2;

/* renamed from: e2.s */
/* compiled from: FlacFrameReader */
public final class C4222s {

    /* renamed from: e2.s$a */
    /* compiled from: FlacFrameReader */
    public static final class C4223a {

        /* renamed from: a */
        public long f23565a;
    }

    /* renamed from: a */
    private static boolean m28490a(C5918a0 a0Var, C4227v vVar, int i) {
        int j = m28499j(a0Var, i);
        return j != -1 && j <= vVar.f23570b;
    }

    /* renamed from: b */
    private static boolean m28491b(C5918a0 a0Var, int i) {
        return a0Var.mo20534C() == C5953m0.m35160u(a0Var.mo20551d(), i, a0Var.mo20552e() - 1, 0);
    }

    /* renamed from: c */
    private static boolean m28492c(C5918a0 a0Var, C4227v vVar, boolean z, C4223a aVar) {
        try {
            long J = a0Var.mo20541J();
            if (!z) {
                J *= (long) vVar.f23570b;
            }
            aVar.f23565a = J;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m28493d(C5918a0 a0Var, C4227v vVar, int i, C4223a aVar) {
        C5918a0 a0Var2 = a0Var;
        C4227v vVar2 = vVar;
        int e = a0Var.mo20552e();
        long E = a0Var.mo20536E();
        long j = E >>> 16;
        if (j != ((long) i)) {
            return false;
        }
        boolean z = (j & 1) == 1;
        int i2 = (int) ((E >> 12) & 15);
        int i3 = (int) ((E >> 8) & 15);
        int i4 = (int) (15 & (E >> 4));
        int i5 = (int) ((E >> 1) & 7);
        boolean z2 = (E & 1) == 1;
        if (!m28496g(i4, vVar2) || !m28495f(i5, vVar2) || z2 || !m28492c(a0Var2, vVar2, z, aVar) || !m28490a(a0Var2, vVar2, i2) || !m28494e(a0Var2, vVar2, i3) || !m28491b(a0Var2, e)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static boolean m28494e(C5918a0 a0Var, C4227v vVar, int i) {
        int i2 = vVar.f23573e;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            if (i == vVar.f23574f) {
                return true;
            }
            return false;
        } else if (i == 12) {
            if (a0Var.mo20534C() * AdError.NETWORK_ERROR_CODE == i2) {
                return true;
            }
            return false;
        } else if (i > 14) {
            return false;
        } else {
            int I = a0Var.mo20540I();
            if (i == 14) {
                I *= 10;
            }
            if (I == i2) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: f */
    private static boolean m28495f(int i, C4227v vVar) {
        return i == 0 || i == vVar.f23577i;
    }

    /* renamed from: g */
    private static boolean m28496g(int i, C4227v vVar) {
        if (i <= 7) {
            return i == vVar.f23575g - 1;
        }
        if (i > 10 || vVar.f23575g != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m28497h(C4216m mVar, C4227v vVar, int i, C4223a aVar) throws IOException {
        long f = mVar.mo17557f();
        byte[] bArr = new byte[2];
        mVar.mo17563p(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            mVar.mo17560j();
            mVar.mo17558g((int) (f - mVar.mo17554c()));
            return false;
        }
        C5918a0 a0Var = new C5918a0(16);
        System.arraycopy(bArr, 0, a0Var.mo20551d(), 0, 2);
        a0Var.mo20545N(C4219o.m28482c(mVar, a0Var.mo20551d(), 2, 14));
        mVar.mo17560j();
        mVar.mo17558g((int) (f - mVar.mo17554c()));
        return m28493d(a0Var, vVar, i, aVar);
    }

    /* renamed from: i */
    public static long m28498i(C4216m mVar, C4227v vVar) throws IOException {
        mVar.mo17560j();
        boolean z = true;
        mVar.mo17558g(1);
        byte[] bArr = new byte[1];
        mVar.mo17563p(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z = false;
        }
        mVar.mo17558g(2);
        int i = z ? 7 : 6;
        C5918a0 a0Var = new C5918a0(i);
        a0Var.mo20545N(C4219o.m28482c(mVar, a0Var.mo20551d(), 0, i));
        mVar.mo17560j();
        C4223a aVar = new C4223a();
        if (m28492c(a0Var, vVar, z, aVar)) {
            return aVar.f23565a;
        }
        throw C6249m2.m36661a((String) null, (Throwable) null);
    }

    /* renamed from: j */
    public static int m28499j(C5918a0 a0Var, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return a0Var.mo20534C() + 1;
            case 7:
                return a0Var.mo20540I() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }
}
