package p037e2;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p127r2.C5432a;
import p148u2.C5709a;
import p161w3.C5918a0;
import p161w3.C5953m0;
import p161w3.C5961r;
import p177z1.C6249m2;
import p178z2.C6319a;

/* renamed from: e2.h0 */
/* compiled from: VorbisUtil */
public final class C4205h0 {

    /* renamed from: e2.h0$a */
    /* compiled from: VorbisUtil */
    private static final class C4206a {

        /* renamed from: a */
        public final int f23522a;

        /* renamed from: b */
        public final int f23523b;

        /* renamed from: c */
        public final long[] f23524c;

        /* renamed from: d */
        public final int f23525d;

        /* renamed from: e */
        public final boolean f23526e;

        public C4206a(int i, int i2, long[] jArr, int i3, boolean z) {
            this.f23522a = i;
            this.f23523b = i2;
            this.f23524c = jArr;
            this.f23525d = i3;
            this.f23526e = z;
        }
    }

    /* renamed from: e2.h0$b */
    /* compiled from: VorbisUtil */
    public static final class C4207b {

        /* renamed from: a */
        public final String f23527a;

        /* renamed from: b */
        public final String[] f23528b;

        /* renamed from: c */
        public final int f23529c;

        public C4207b(String str, String[] strArr, int i) {
            this.f23527a = str;
            this.f23528b = strArr;
            this.f23529c = i;
        }
    }

    /* renamed from: e2.h0$c */
    /* compiled from: VorbisUtil */
    public static final class C4208c {

        /* renamed from: a */
        public final boolean f23530a;

        /* renamed from: b */
        public final int f23531b;

        /* renamed from: c */
        public final int f23532c;

        /* renamed from: d */
        public final int f23533d;

        public C4208c(boolean z, int i, int i2, int i3) {
            this.f23530a = z;
            this.f23531b = i;
            this.f23532c = i2;
            this.f23533d = i3;
        }
    }

    /* renamed from: e2.h0$d */
    /* compiled from: VorbisUtil */
    public static final class C4209d {

        /* renamed from: a */
        public final int f23534a;

        /* renamed from: b */
        public final int f23535b;

        /* renamed from: c */
        public final int f23536c;

        /* renamed from: d */
        public final int f23537d;

        /* renamed from: e */
        public final int f23538e;

        /* renamed from: f */
        public final int f23539f;

        /* renamed from: g */
        public final int f23540g;

        /* renamed from: h */
        public final int f23541h;

        /* renamed from: i */
        public final boolean f23542i;

        /* renamed from: j */
        public final byte[] f23543j;

        public C4209d(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, byte[] bArr) {
            this.f23534a = i;
            this.f23535b = i2;
            this.f23536c = i3;
            this.f23537d = i4;
            this.f23538e = i5;
            this.f23539f = i6;
            this.f23540g = i7;
            this.f23541h = i8;
            this.f23542i = z;
            this.f23543j = bArr;
        }
    }

    /* renamed from: a */
    public static int m28424a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: b */
    private static long m28425b(long j, long j2) {
        return (long) Math.floor(Math.pow((double) j, 1.0d / ((double) j2)));
    }

    /* renamed from: c */
    public static C5432a m28426c(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String[] R0 = C5953m0.m35103R0(str, "=");
            if (R0.length != 2) {
                C5961r.m35215i("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (R0[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(C5709a.m34042a(new C5918a0(Base64.decode(R0[1], 0))));
                } catch (RuntimeException e) {
                    C5961r.m35216j("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new C6319a(R0[0], R0[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C5432a((List<? extends C5432a.C5434b>) arrayList);
    }

    /* renamed from: d */
    private static C4206a m28427d(C4204g0 g0Var) throws C6249m2 {
        if (g0Var.mo17572d(24) == 5653314) {
            int d = g0Var.mo17572d(16);
            int d2 = g0Var.mo17572d(24);
            long[] jArr = new long[d2];
            boolean c = g0Var.mo17571c();
            long j = 0;
            if (!c) {
                boolean c2 = g0Var.mo17571c();
                for (int i = 0; i < d2; i++) {
                    if (!c2) {
                        jArr[i] = (long) (g0Var.mo17572d(5) + 1);
                    } else if (g0Var.mo17571c()) {
                        jArr[i] = (long) (g0Var.mo17572d(5) + 1);
                    } else {
                        jArr[i] = 0;
                    }
                }
            } else {
                int d3 = g0Var.mo17572d(5) + 1;
                int i2 = 0;
                while (i2 < d2) {
                    int d4 = g0Var.mo17572d(m28424a(d2 - i2));
                    for (int i3 = 0; i3 < d4 && i2 < d2; i3++) {
                        jArr[i2] = (long) d3;
                        i2++;
                    }
                    d3++;
                }
            }
            int d5 = g0Var.mo17572d(4);
            if (d5 <= 2) {
                if (d5 == 1 || d5 == 2) {
                    g0Var.mo17573e(32);
                    g0Var.mo17573e(32);
                    int d6 = g0Var.mo17572d(4) + 1;
                    g0Var.mo17573e(1);
                    if (d5 != 1) {
                        j = ((long) d2) * ((long) d);
                    } else if (d != 0) {
                        j = m28425b((long) d2, (long) d);
                    }
                    g0Var.mo17573e((int) (j * ((long) d6)));
                }
                return new C4206a(d, d2, jArr, d5, c);
            }
            throw C6249m2.m36661a("lookup type greater than 2 not decodable: " + d5, (Throwable) null);
        }
        throw C6249m2.m36661a("expected code book to start with [0x56, 0x43, 0x42] at " + g0Var.mo17570b(), (Throwable) null);
    }

    /* renamed from: e */
    private static void m28428e(C4204g0 g0Var) throws C6249m2 {
        int d = g0Var.mo17572d(6) + 1;
        for (int i = 0; i < d; i++) {
            int d2 = g0Var.mo17572d(16);
            if (d2 == 0) {
                g0Var.mo17573e(8);
                g0Var.mo17573e(16);
                g0Var.mo17573e(16);
                g0Var.mo17573e(6);
                g0Var.mo17573e(8);
                int d3 = g0Var.mo17572d(4) + 1;
                for (int i2 = 0; i2 < d3; i2++) {
                    g0Var.mo17573e(8);
                }
            } else if (d2 == 1) {
                int d4 = g0Var.mo17572d(5);
                int i3 = -1;
                int[] iArr = new int[d4];
                for (int i4 = 0; i4 < d4; i4++) {
                    iArr[i4] = g0Var.mo17572d(4);
                    if (iArr[i4] > i3) {
                        i3 = iArr[i4];
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = g0Var.mo17572d(3) + 1;
                    int d5 = g0Var.mo17572d(2);
                    if (d5 > 0) {
                        g0Var.mo17573e(8);
                    }
                    for (int i7 = 0; i7 < (1 << d5); i7++) {
                        g0Var.mo17573e(8);
                    }
                }
                g0Var.mo17573e(2);
                int d6 = g0Var.mo17572d(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < d4; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        g0Var.mo17573e(d6);
                        i9++;
                    }
                }
            } else {
                throw C6249m2.m36661a("floor type greater than 1 not decodable: " + d2, (Throwable) null);
            }
        }
    }

    /* renamed from: f */
    private static void m28429f(int i, C4204g0 g0Var) throws C6249m2 {
        int d = g0Var.mo17572d(6) + 1;
        for (int i2 = 0; i2 < d; i2++) {
            int d2 = g0Var.mo17572d(16);
            if (d2 != 0) {
                C5961r.m35209c("VorbisUtil", "mapping type other than 0 not supported: " + d2);
            } else {
                int d3 = g0Var.mo17571c() ? g0Var.mo17572d(4) + 1 : 1;
                if (g0Var.mo17571c()) {
                    int d4 = g0Var.mo17572d(8) + 1;
                    for (int i3 = 0; i3 < d4; i3++) {
                        int i4 = i - 1;
                        g0Var.mo17573e(m28424a(i4));
                        g0Var.mo17573e(m28424a(i4));
                    }
                }
                if (g0Var.mo17572d(2) == 0) {
                    if (d3 > 1) {
                        for (int i5 = 0; i5 < i; i5++) {
                            g0Var.mo17573e(4);
                        }
                    }
                    for (int i6 = 0; i6 < d3; i6++) {
                        g0Var.mo17573e(8);
                        g0Var.mo17573e(8);
                        g0Var.mo17573e(8);
                    }
                } else {
                    throw C6249m2.m36661a("to reserved bits must be zero after mapping coupling steps", (Throwable) null);
                }
            }
        }
    }

    /* renamed from: g */
    private static C4208c[] m28430g(C4204g0 g0Var) {
        int d = g0Var.mo17572d(6) + 1;
        C4208c[] cVarArr = new C4208c[d];
        for (int i = 0; i < d; i++) {
            cVarArr[i] = new C4208c(g0Var.mo17571c(), g0Var.mo17572d(16), g0Var.mo17572d(16), g0Var.mo17572d(8));
        }
        return cVarArr;
    }

    /* renamed from: h */
    private static void m28431h(C4204g0 g0Var) throws C6249m2 {
        int d = g0Var.mo17572d(6) + 1;
        int i = 0;
        while (i < d) {
            if (g0Var.mo17572d(16) <= 2) {
                g0Var.mo17573e(24);
                g0Var.mo17573e(24);
                g0Var.mo17573e(24);
                int d2 = g0Var.mo17572d(6) + 1;
                g0Var.mo17573e(8);
                int[] iArr = new int[d2];
                for (int i2 = 0; i2 < d2; i2++) {
                    iArr[i2] = ((g0Var.mo17571c() ? g0Var.mo17572d(5) : 0) * 8) + g0Var.mo17572d(3);
                }
                for (int i3 = 0; i3 < d2; i3++) {
                    for (int i4 = 0; i4 < 8; i4++) {
                        if ((iArr[i3] & (1 << i4)) != 0) {
                            g0Var.mo17573e(8);
                        }
                    }
                }
                i++;
            } else {
                throw C6249m2.m36661a("residueType greater than 2 is not decodable", (Throwable) null);
            }
        }
    }

    /* renamed from: i */
    public static C4207b m28432i(C5918a0 a0Var) throws C6249m2 {
        return m28433j(a0Var, true, true);
    }

    /* renamed from: j */
    public static C4207b m28433j(C5918a0 a0Var, boolean z, boolean z2) throws C6249m2 {
        if (z) {
            m28436m(3, a0Var, false);
        }
        String z3 = a0Var.mo20573z((int) a0Var.mo20566s());
        int length = 11 + z3.length();
        long s = a0Var.mo20566s();
        String[] strArr = new String[((int) s)];
        int i = length + 4;
        for (int i2 = 0; ((long) i2) < s; i2++) {
            strArr[i2] = a0Var.mo20573z((int) a0Var.mo20566s());
            i = i + 4 + strArr[i2].length();
        }
        if (!z2 || (a0Var.mo20534C() & 1) != 0) {
            return new C4207b(z3, strArr, i + 1);
        }
        throw C6249m2.m36661a("framing bit expected to be set", (Throwable) null);
    }

    /* renamed from: k */
    public static C4209d m28434k(C5918a0 a0Var) throws C6249m2 {
        boolean z = true;
        m28436m(1, a0Var, false);
        int t = a0Var.mo20567t();
        int C = a0Var.mo20534C();
        int t2 = a0Var.mo20567t();
        int p = a0Var.mo20563p();
        if (p <= 0) {
            p = -1;
        }
        int p2 = a0Var.mo20563p();
        if (p2 <= 0) {
            p2 = -1;
        }
        int p3 = a0Var.mo20563p();
        if (p3 <= 0) {
            p3 = -1;
        }
        int C2 = a0Var.mo20534C();
        int pow = (int) Math.pow(2.0d, (double) (C2 & 15));
        int pow2 = (int) Math.pow(2.0d, (double) ((C2 & 240) >> 4));
        if ((a0Var.mo20534C() & 1) <= 0) {
            z = false;
        }
        return new C4209d(t, C, t2, p, p2, p3, pow, pow2, z, Arrays.copyOf(a0Var.mo20551d(), a0Var.mo20553f()));
    }

    /* renamed from: l */
    public static C4208c[] m28435l(C5918a0 a0Var, int i) throws C6249m2 {
        int i2 = 0;
        m28436m(5, a0Var, false);
        int C = a0Var.mo20534C() + 1;
        C4204g0 g0Var = new C4204g0(a0Var.mo20551d());
        g0Var.mo17573e(a0Var.mo20552e() * 8);
        for (int i3 = 0; i3 < C; i3++) {
            m28427d(g0Var);
        }
        int d = g0Var.mo17572d(6) + 1;
        while (i2 < d) {
            if (g0Var.mo17572d(16) == 0) {
                i2++;
            } else {
                throw C6249m2.m36661a("placeholder of time domain transforms not zeroed out", (Throwable) null);
            }
        }
        m28428e(g0Var);
        m28431h(g0Var);
        m28429f(i, g0Var);
        C4208c[] g = m28430g(g0Var);
        if (g0Var.mo17571c()) {
            return g;
        }
        throw C6249m2.m36661a("framing bit after modes not set as expected", (Throwable) null);
    }

    /* renamed from: m */
    public static boolean m28436m(int i, C5918a0 a0Var, boolean z) throws C6249m2 {
        if (a0Var.mo20548a() < 7) {
            if (z) {
                return false;
            }
            throw C6249m2.m36661a("too short header: " + a0Var.mo20548a(), (Throwable) null);
        } else if (a0Var.mo20534C() != i) {
            if (z) {
                return false;
            }
            throw C6249m2.m36661a("expected header type " + Integer.toHexString(i), (Throwable) null);
        } else if (a0Var.mo20534C() == 118 && a0Var.mo20534C() == 111 && a0Var.mo20534C() == 114 && a0Var.mo20534C() == 98 && a0Var.mo20534C() == 105 && a0Var.mo20534C() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw C6249m2.m36661a("expected characters 'vorbis'", (Throwable) null);
        }
    }
}
