package p322p9;

import java.util.Arrays;
import java.util.Map;
import p212d9.C9909a;
import p212d9.C9912d;
import p212d9.C9913e;
import p212d9.C9914f;
import p212d9.C9918j;
import p212d9.C9921m;
import p212d9.C9922n;
import p212d9.C9923o;
import p212d9.C9924p;
import p212d9.C9925q;
import p248h9.C10475a;

/* renamed from: p9.p */
/* compiled from: UPCEANReader */
public abstract class C12161p extends C12156k {

    /* renamed from: d */
    static final int[] f45245d = {1, 1, 1};

    /* renamed from: e */
    static final int[] f45246e = {1, 1, 1, 1, 1};

    /* renamed from: f */
    static final int[] f45247f = {1, 1, 1, 1, 1, 1};

    /* renamed from: g */
    static final int[][] f45248g;

    /* renamed from: h */
    static final int[][] f45249h;

    /* renamed from: a */
    private final StringBuilder f45250a = new StringBuilder(20);

    /* renamed from: b */
    private final C12160o f45251b = new C12160o();

    /* renamed from: c */
    private final C12152g f45252c = new C12152g();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f45248g = iArr;
        int[][] iArr2 = new int[20][];
        f45249h = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f45248g[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            f45249h[i] = iArr4;
        }
    }

    protected C12161p() {
    }

    /* renamed from: h */
    static boolean m58411h(CharSequence charSequence) throws C9914f {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt < 0 || charAt > 9) {
                throw C9914f.m50845a();
            }
            i += charAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw C9914f.m50845a();
            }
            i3 += charAt2;
        }
        if (i3 % 10 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    static int m58412i(C10475a aVar, int[] iArr, int i, int[][] iArr2) throws C9918j {
        C12156k.m58391e(aVar, i, iArr);
        int length = iArr2.length;
        float f = 0.48f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float d = C12156k.m58390d(iArr, iArr2[i3], 0.7f);
            if (d < f) {
                i2 = i3;
                f = d;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw C9918j.m50862a();
    }

    /* renamed from: m */
    static int[] m58413m(C10475a aVar, int i, boolean z, int[] iArr) throws C9918j {
        return m58414n(aVar, i, z, iArr, new int[iArr.length]);
    }

    /* renamed from: n */
    private static int[] m58414n(C10475a aVar, int i, boolean z, int[] iArr, int[] iArr2) throws C9918j {
        int g = aVar.mo33560g();
        int f = z ? aVar.mo33559f(i) : aVar.mo33557e(i);
        int length = iArr.length;
        boolean z2 = z;
        int i2 = 0;
        int i3 = f;
        while (f < g) {
            if (aVar.mo33554c(f) ^ z2) {
                iArr2[i2] = iArr2[i2] + 1;
            } else {
                int i4 = length - 1;
                if (i2 != i4) {
                    i2++;
                } else if (C12156k.m58390d(iArr2, iArr, 0.7f) < 0.48f) {
                    return new int[]{i3, f};
                } else {
                    i3 += iArr2[0] + iArr2[1];
                    int i5 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i4] = 0;
                    i2--;
                }
                iArr2[i2] = 1;
                z2 = !z2;
            }
            f++;
        }
        throw C9918j.m50862a();
    }

    /* renamed from: o */
    static int[] m58415o(C10475a aVar) throws C9918j {
        int[] iArr = new int[f45245d.length];
        int[] iArr2 = null;
        boolean z = false;
        int i = 0;
        while (!z) {
            int[] iArr3 = f45245d;
            Arrays.fill(iArr, 0, iArr3.length, 0);
            iArr2 = m58414n(aVar, i, false, iArr3, iArr);
            int i2 = iArr2[0];
            int i3 = iArr2[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                z = aVar.mo33561h(i4, i2, false);
            }
            i = i3;
        }
        return iArr2;
    }

    /* renamed from: b */
    public C9922n mo36672b(int i, C10475a aVar, Map<C9913e, ?> map) throws C9918j, C9912d, C9914f {
        return mo36676l(i, aVar, m58415o(aVar), map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo36680g(String str) throws C9914f {
        return m58411h(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int[] mo36681j(C10475a aVar, int i) throws C9918j {
        return m58413m(aVar, i, false, f45245d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract int mo36673k(C10475a aVar, int[] iArr, StringBuilder sb) throws C9918j;

    /* renamed from: l */
    public C9922n mo36676l(int i, C10475a aVar, int[] iArr, Map<C9913e, ?> map) throws C9918j, C9912d, C9914f {
        C9925q qVar;
        int i2;
        String c;
        int[] iArr2 = null;
        if (map == null) {
            qVar = null;
        } else {
            qVar = (C9925q) map.get(C9913e.NEED_RESULT_POINT_CALLBACK);
        }
        boolean z = true;
        if (qVar != null) {
            qVar.mo32485a(new C9924p(((float) (iArr[0] + iArr[1])) / 2.0f, (float) i));
        }
        StringBuilder sb = this.f45250a;
        sb.setLength(0);
        int k = mo36673k(aVar, iArr, sb);
        if (qVar != null) {
            qVar.mo32485a(new C9924p((float) k, (float) i));
        }
        int[] j = mo36681j(aVar, k);
        if (qVar != null) {
            qVar.mo32485a(new C9924p(((float) (j[0] + j[1])) / 2.0f, (float) i));
        }
        int i3 = j[1];
        int i4 = (i3 - j[0]) + i3;
        if (i4 >= aVar.mo33560g() || !aVar.mo33561h(i3, i4, false)) {
            throw C9918j.m50862a();
        }
        String sb2 = sb.toString();
        if (sb2.length() < 8) {
            throw C9914f.m50845a();
        } else if (mo36680g(sb2)) {
            C9909a p = mo36674p();
            float f = (float) i;
            C9922n nVar = new C9922n(sb2, (byte[]) null, new C9924p[]{new C9924p(((float) (iArr[1] + iArr[0])) / 2.0f, f), new C9924p(((float) (j[1] + j[0])) / 2.0f, f)}, p);
            try {
                C9922n a = this.f45251b.mo36679a(i, aVar, j[1]);
                nVar.mo32478h(C9923o.UPC_EAN_EXTENSION, a.mo32476f());
                nVar.mo32477g(a.mo32474d());
                nVar.mo32471a(a.mo32475e());
                i2 = a.mo32476f().length();
            } catch (C9921m unused) {
                i2 = 0;
            }
            if (map != null) {
                iArr2 = (int[]) map.get(C9913e.ALLOWED_EAN_EXTENSIONS);
            }
            if (iArr2 != null) {
                int length = iArr2.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        z = false;
                        break;
                    } else if (i2 == iArr2[i5]) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (!z) {
                    throw C9918j.m50862a();
                }
            }
            if ((p == C9909a.EAN_13 || p == C9909a.UPC_A) && (c = this.f45252c.mo36675c(sb2)) != null) {
                nVar.mo32478h(C9923o.POSSIBLE_COUNTRY, c);
            }
            return nVar;
        } else {
            throw C9912d.m50844a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public abstract C9909a mo36674p();
}
