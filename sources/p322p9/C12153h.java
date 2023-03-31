package p322p9;

import java.util.Map;
import p212d9.C9909a;
import p212d9.C9913e;
import p212d9.C9914f;
import p212d9.C9918j;
import p212d9.C9922n;
import p212d9.C9924p;
import p248h9.C10475a;

/* renamed from: p9.h */
/* compiled from: ITFReader */
public final class C12153h extends C12156k {

    /* renamed from: b */
    private static final int[] f45229b = {6, 8, 10, 12, 14};

    /* renamed from: c */
    private static final int[] f45230c = {1, 1, 1, 1};

    /* renamed from: d */
    private static final int[] f45231d = {1, 1, 3};

    /* renamed from: e */
    static final int[][] f45232e = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a */
    private int f45233a = -1;

    /* renamed from: g */
    private static int m58379g(int[] iArr) throws C9918j {
        int length = f45232e.length;
        float f = 0.38f;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            float d = C12156k.m58390d(iArr, f45232e[i2], 0.78f);
            if (d < f) {
                i = i2;
                f = d;
            }
        }
        if (i >= 0) {
            return i;
        }
        throw C9918j.m50862a();
    }

    /* renamed from: h */
    private int[] m58380h(C10475a aVar) throws C9918j {
        aVar.mo33563j();
        try {
            int[] k = m58383k(aVar, m58384l(aVar), f45231d);
            m58385m(aVar, k[0]);
            int i = k[0];
            k[0] = aVar.mo33560g() - k[1];
            k[1] = aVar.mo33560g() - i;
            return k;
        } finally {
            aVar.mo33563j();
        }
    }

    /* renamed from: i */
    private static void m58381i(C10475a aVar, int i, int i2, StringBuilder sb) throws C9918j {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i < i2) {
            C12156k.m58391e(aVar, i, iArr);
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 * 2;
                iArr2[i3] = iArr[i4];
                iArr3[i3] = iArr[i4 + 1];
            }
            sb.append((char) (m58379g(iArr2) + 48));
            sb.append((char) (m58379g(iArr3) + 48));
            for (int i5 = 0; i5 < 10; i5++) {
                i += iArr[i5];
            }
        }
    }

    /* renamed from: j */
    private int[] m58382j(C10475a aVar) throws C9918j {
        int[] k = m58383k(aVar, m58384l(aVar), f45230c);
        this.f45233a = (k[1] - k[0]) / 4;
        m58385m(aVar, k[0]);
        return k;
    }

    /* renamed from: k */
    private static int[] m58383k(C10475a aVar, int i, int[] iArr) throws C9918j {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int g = aVar.mo33560g();
        int i2 = i;
        boolean z = false;
        int i3 = 0;
        while (i < g) {
            if (aVar.mo33554c(i) ^ z) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                int i4 = length - 1;
                if (i3 != i4) {
                    i3++;
                } else if (C12156k.m58390d(iArr2, iArr, 0.78f) < 0.38f) {
                    return new int[]{i2, i};
                } else {
                    i2 += iArr2[0] + iArr2[1];
                    int i5 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i4] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                z = !z;
            }
            i++;
        }
        throw C9918j.m50862a();
    }

    /* renamed from: l */
    private static int m58384l(C10475a aVar) throws C9918j {
        int g = aVar.mo33560g();
        int e = aVar.mo33557e(0);
        if (e != g) {
            return e;
        }
        throw C9918j.m50862a();
    }

    /* renamed from: m */
    private void m58385m(C10475a aVar, int i) throws C9918j {
        int i2 = this.f45233a * 10;
        if (i2 >= i) {
            i2 = i;
        }
        int i3 = i - 1;
        while (i2 > 0 && i3 >= 0 && !aVar.mo33554c(i3)) {
            i2--;
            i3--;
        }
        if (i2 != 0) {
            throw C9918j.m50862a();
        }
    }

    /* renamed from: b */
    public C9922n mo36672b(int i, C10475a aVar, Map<C9913e, ?> map) throws C9914f, C9918j {
        boolean z;
        int[] j = m58382j(aVar);
        int[] h = m58380h(aVar);
        StringBuilder sb = new StringBuilder(20);
        m58381i(aVar, j[1], h[0], sb);
        String sb2 = sb.toString();
        int[] iArr = map != null ? (int[]) map.get(C9913e.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = f45229b;
        }
        int length = sb2.length();
        int length2 = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length2) {
                z = false;
                break;
            }
            int i4 = iArr[i2];
            if (length == i4) {
                z = true;
                break;
            }
            if (i4 > i3) {
                i3 = i4;
            }
            i2++;
        }
        if (!z && length > i3) {
            z = true;
        }
        if (z) {
            float f = (float) i;
            return new C9922n(sb2, (byte[]) null, new C9924p[]{new C9924p((float) j[1], f), new C9924p((float) h[0], f)}, C9909a.ITF);
        }
        throw C9914f.m50845a();
    }
}
