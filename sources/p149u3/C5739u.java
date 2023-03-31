package p149u3;

import android.util.Pair;
import java.util.Arrays;
import p015b3.C1772x;
import p015b3.C1776x0;
import p015b3.C1780z0;
import p161w3.C5953m0;
import p177z1.C6217e3;
import p177z1.C6220f3;
import p177z1.C6223g3;
import p177z1.C6264q;
import p177z1.C6266q3;

/* renamed from: u3.u */
/* compiled from: MappingTrackSelector */
public abstract class C5739u extends C5717b0 {

    /* renamed from: c */
    private C5740a f28649c;

    /* renamed from: u3.u$a */
    /* compiled from: MappingTrackSelector */
    public static final class C5740a {

        /* renamed from: a */
        private final int f28650a;

        /* renamed from: b */
        private final String[] f28651b;

        /* renamed from: c */
        private final int[] f28652c;

        /* renamed from: d */
        private final C1780z0[] f28653d;

        /* renamed from: e */
        private final int[] f28654e;

        /* renamed from: f */
        private final int[][][] f28655f;

        /* renamed from: g */
        private final C1780z0 f28656g;

        C5740a(String[] strArr, int[] iArr, C1780z0[] z0VarArr, int[] iArr2, int[][][] iArr3, C1780z0 z0Var) {
            this.f28651b = strArr;
            this.f28652c = iArr;
            this.f28653d = z0VarArr;
            this.f28655f = iArr3;
            this.f28654e = iArr2;
            this.f28656g = z0Var;
            this.f28650a = iArr.length;
        }

        /* renamed from: a */
        public int mo20218a(int i, int i2, boolean z) {
            int i3 = this.f28653d[i].mo6903b(i2).f5280a;
            int[] iArr = new int[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                int g = mo20224g(i, i2, i5);
                if (g == 4 || (z && g == 3)) {
                    iArr[i4] = i5;
                    i4++;
                }
            }
            return mo20219b(i, i2, Arrays.copyOf(iArr, i4));
        }

        /* renamed from: b */
        public int mo20219b(int i, int i2, int[] iArr) {
            int i3 = 0;
            String str = null;
            boolean z = false;
            int i4 = 0;
            int i5 = 16;
            while (i3 < iArr.length) {
                String str2 = this.f28653d[i].mo6903b(i2).mo6897b(iArr[i3]).f30243t;
                int i6 = i4 + 1;
                if (i4 == 0) {
                    str = str2;
                } else {
                    z |= !C5953m0.m35124c(str, str2);
                }
                i5 = Math.min(i5, C6217e3.m36427d(this.f28655f[i][i2][i3]));
                i3++;
                i4 = i6;
            }
            return z ? Math.min(i5, this.f28654e[i]) : i5;
        }

        /* renamed from: c */
        public int mo20220c(int i, int i2, int i3) {
            return this.f28655f[i][i2][i3];
        }

        /* renamed from: d */
        public int mo20221d() {
            return this.f28650a;
        }

        /* renamed from: e */
        public int mo20222e(int i) {
            return this.f28652c[i];
        }

        /* renamed from: f */
        public C1780z0 mo20223f(int i) {
            return this.f28653d[i];
        }

        /* renamed from: g */
        public int mo20224g(int i, int i2, int i3) {
            return C6217e3.m36429f(mo20220c(i, i2, i3));
        }

        /* renamed from: h */
        public C1780z0 mo20225h() {
            return this.f28656g;
        }
    }

    /* renamed from: i */
    private static int m34269i(C6220f3[] f3VarArr, C1776x0 x0Var, int[] iArr, boolean z) throws C6264q {
        int length = f3VarArr.length;
        int i = 0;
        boolean z2 = true;
        for (int i2 = 0; i2 < f3VarArr.length; i2++) {
            C6220f3 f3Var = f3VarArr[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < x0Var.f5280a; i4++) {
                i3 = Math.max(i3, C6217e3.m36429f(f3Var.mo18664a(x0Var.mo6897b(i4))));
            }
            boolean z3 = iArr[i2] == 0;
            if (i3 > i || (i3 == i && z && !z2 && z3)) {
                length = i2;
                z2 = z3;
                i = i3;
            }
        }
        return length;
    }

    /* renamed from: j */
    private static int[] m34270j(C6220f3 f3Var, C1776x0 x0Var) throws C6264q {
        int[] iArr = new int[x0Var.f5280a];
        for (int i = 0; i < x0Var.f5280a; i++) {
            iArr[i] = f3Var.mo18664a(x0Var.mo6897b(i));
        }
        return iArr;
    }

    /* renamed from: k */
    private static int[] m34271k(C6220f3[] f3VarArr) throws C6264q {
        int length = f3VarArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = f3VarArr[i].mo19504o();
        }
        return iArr;
    }

    /* renamed from: e */
    public final void mo20137e(Object obj) {
        this.f28649c = (C5740a) obj;
    }

    /* renamed from: g */
    public final C5720c0 mo20139g(C6220f3[] f3VarArr, C1780z0 z0Var, C1772x.C1774b bVar, C6266q3 q3Var) throws C6264q {
        int[] iArr;
        C6220f3[] f3VarArr2 = f3VarArr;
        C1780z0 z0Var2 = z0Var;
        int[] iArr2 = new int[(f3VarArr2.length + 1)];
        int length = f3VarArr2.length + 1;
        C1776x0[][] x0VarArr = new C1776x0[length][];
        int[][][] iArr3 = new int[(f3VarArr2.length + 1)][][];
        for (int i = 0; i < length; i++) {
            int i2 = z0Var2.f5296a;
            x0VarArr[i] = new C1776x0[i2];
            iArr3[i] = new int[i2][];
        }
        int[] k = m34271k(f3VarArr);
        for (int i3 = 0; i3 < z0Var2.f5296a; i3++) {
            C1776x0 b = z0Var2.mo6903b(i3);
            int i4 = m34269i(f3VarArr, b, iArr2, b.f5282c == 5);
            if (i4 == f3VarArr2.length) {
                iArr = new int[b.f5280a];
            } else {
                iArr = m34270j(f3VarArr2[i4], b);
            }
            int i5 = iArr2[i4];
            x0VarArr[i4][i5] = b;
            iArr3[i4][i5] = iArr;
            iArr2[i4] = iArr2[i4] + 1;
        }
        C1780z0[] z0VarArr = new C1780z0[f3VarArr2.length];
        String[] strArr = new String[f3VarArr2.length];
        int[] iArr4 = new int[f3VarArr2.length];
        for (int i6 = 0; i6 < f3VarArr2.length; i6++) {
            int i7 = iArr2[i6];
            z0VarArr[i6] = new C1780z0((C1776x0[]) C5953m0.m35081G0(x0VarArr[i6], i7));
            iArr3[i6] = (int[][]) C5953m0.m35081G0(iArr3[i6], i7);
            strArr[i6] = f3VarArr2[i6].mo6482b();
            iArr4[i6] = f3VarArr2[i6].mo21220g();
        }
        C5740a aVar = new C5740a(strArr, iArr4, z0VarArr, k, iArr3, new C1780z0((C1776x0[]) C5953m0.m35081G0(x0VarArr[f3VarArr2.length], iArr2[f3VarArr2.length])));
        Pair<C6223g3[], C5735s[]> l = mo20166l(aVar, iArr3, k, bVar, q3Var);
        return new C5720c0((C6223g3[]) l.first, (C5735s[]) l.second, C5716a0.m34078b(aVar, (C5741v[]) l.second), aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract Pair<C6223g3[], C5735s[]> mo20166l(C5740a aVar, int[][][] iArr, int[] iArr2, C1772x.C1774b bVar, C6266q3 q3Var) throws C6264q;
}
