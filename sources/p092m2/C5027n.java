package p092m2;

import java.io.IOException;
import p037e2.C4216m;
import p161w3.C5918a0;

/* renamed from: m2.n */
/* compiled from: Sniffer */
final class C5027n {

    /* renamed from: a */
    private static final int[] f26338a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: a */
    private static boolean m31725a(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 : f26338a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m31726b(C4216m mVar) throws IOException {
        return m31727c(mVar, true, false);
    }

    /* renamed from: c */
    private static boolean m31727c(C4216m mVar, boolean z, boolean z2) throws IOException {
        boolean z3;
        C4216m mVar2 = mVar;
        long b = mVar.mo17553b();
        long j = 4096;
        long j2 = -1;
        int i = (b > -1 ? 1 : (b == -1 ? 0 : -1));
        if (i != 0 && b <= 4096) {
            j = b;
        }
        int i2 = (int) j;
        C5918a0 a0Var = new C5918a0(64);
        boolean z4 = false;
        int i3 = 0;
        boolean z5 = false;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            a0Var.mo20542K(8);
            if (!mVar2.mo17556e(a0Var.mo20551d(), z4 ? 1 : 0, 8, true)) {
                break;
            }
            long E = a0Var.mo20536E();
            int m = a0Var.mo20560m();
            int i4 = 16;
            if (E == 1) {
                mVar2.mo17563p(a0Var.mo20551d(), 8, 8);
                a0Var.mo20545N(16);
                E = a0Var.mo20569v();
            } else {
                if (E == 0) {
                    long b2 = mVar.mo17553b();
                    if (b2 != j2) {
                        E = (b2 - mVar.mo17557f()) + ((long) 8);
                    }
                }
                i4 = 8;
            }
            long j3 = (long) i4;
            if (E < j3) {
                return z4;
            }
            i3 += i4;
            if (m == 1836019574) {
                i2 += (int) E;
                if (i != 0 && ((long) i2) > b) {
                    i2 = (int) b;
                }
                j2 = -1;
            } else if (m == 1836019558 || m == 1836475768) {
                z3 = true;
            } else {
                long j4 = b;
                int i5 = i3;
                if ((((long) i3) + E) - j3 >= ((long) i2)) {
                    break;
                }
                int i6 = (int) (E - j3);
                i3 = i5 + i6;
                if (m != 1718909296) {
                    boolean z6 = z2;
                    if (i6 != 0) {
                        mVar2.mo17558g(i6);
                    }
                } else if (i6 < 8) {
                    return false;
                } else {
                    a0Var.mo20542K(i6);
                    mVar2.mo17563p(a0Var.mo20551d(), 0, i6);
                    int i7 = i6 / 4;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= i7) {
                            boolean z7 = z2;
                            break;
                        }
                        if (i8 == 1) {
                            a0Var.mo20547P(4);
                            boolean z8 = z2;
                        } else if (m31725a(a0Var.mo20560m(), z2)) {
                            z5 = true;
                            break;
                        }
                        i8++;
                    }
                    if (!z5) {
                        return false;
                    }
                }
                b = j4;
                j2 = -1;
                z4 = false;
            }
        }
        z3 = false;
        return z5 && z == z3;
    }

    /* renamed from: d */
    public static boolean m31728d(C4216m mVar, boolean z) throws IOException {
        return m31727c(mVar, false, z);
    }
}
