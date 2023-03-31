package p322p9;

import java.util.Arrays;
import java.util.Map;
import p212d9.C9909a;
import p212d9.C9912d;
import p212d9.C9913e;
import p212d9.C9914f;
import p212d9.C9918j;
import p212d9.C9922n;
import p212d9.C9924p;
import p248h9.C10475a;

/* renamed from: p9.d */
/* compiled from: Code93Reader */
public final class C12149d extends C12156k {

    /* renamed from: c */
    private static final char[] f45219c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: d */
    static final int[] f45220d;

    /* renamed from: e */
    private static final int f45221e;

    /* renamed from: a */
    private final StringBuilder f45222a = new StringBuilder(20);

    /* renamed from: b */
    private final int[] f45223b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f45220d = iArr;
        f45221e = iArr[47];
    }

    /* renamed from: g */
    private static void m58364g(CharSequence charSequence) throws C9912d {
        int length = charSequence.length();
        m58365h(charSequence, length - 2, 20);
        m58365h(charSequence, length - 1, 15);
    }

    /* renamed from: h */
    private static void m58365h(CharSequence charSequence, int i, int i2) throws C9912d {
        int i3 = 0;
        int i4 = 1;
        for (int i5 = i - 1; i5 >= 0; i5--) {
            i3 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i5)) * i4;
            i4++;
            if (i4 > i2) {
                i4 = 1;
            }
        }
        if (charSequence.charAt(i) != f45219c[i3 % 47]) {
            throw C9912d.m50844a();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m58366i(java.lang.CharSequence r9) throws p212d9.C9914f {
        /*
            int r0 = r9.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = 0
            r3 = 0
        L_0x000b:
            if (r3 >= r0) goto L_0x009f
            char r4 = r9.charAt(r3)
            r5 = 97
            if (r4 < r5) goto L_0x0098
            r5 = 100
            if (r4 > r5) goto L_0x0098
            int r5 = r0 + -1
            if (r3 >= r5) goto L_0x0093
            int r3 = r3 + 1
            char r5 = r9.charAt(r3)
            r6 = 79
            r7 = 90
            r8 = 65
            switch(r4) {
                case 97: goto L_0x0082;
                case 98: goto L_0x004c;
                case 99: goto L_0x003b;
                case 100: goto L_0x002f;
                default: goto L_0x002c;
            }
        L_0x002c:
            r4 = 0
            goto L_0x008f
        L_0x002f:
            if (r5 < r8) goto L_0x0036
            if (r5 > r7) goto L_0x0036
            int r5 = r5 + 32
            goto L_0x0088
        L_0x0036:
            d9.f r9 = p212d9.C9914f.m50845a()
            throw r9
        L_0x003b:
            if (r5 < r8) goto L_0x0042
            if (r5 > r6) goto L_0x0042
            int r5 = r5 + -32
            goto L_0x0088
        L_0x0042:
            if (r5 != r7) goto L_0x0047
            r4 = 58
            goto L_0x008f
        L_0x0047:
            d9.f r9 = p212d9.C9914f.m50845a()
            throw r9
        L_0x004c:
            if (r5 < r8) goto L_0x0055
            r4 = 69
            if (r5 > r4) goto L_0x0055
            int r5 = r5 + -38
            goto L_0x0088
        L_0x0055:
            r4 = 70
            if (r5 < r4) goto L_0x0060
            r4 = 74
            if (r5 > r4) goto L_0x0060
            int r5 = r5 + -11
            goto L_0x0088
        L_0x0060:
            r4 = 75
            if (r5 < r4) goto L_0x0069
            if (r5 > r6) goto L_0x0069
            int r5 = r5 + 16
            goto L_0x0088
        L_0x0069:
            r4 = 80
            if (r5 < r4) goto L_0x0074
            r4 = 83
            if (r5 > r4) goto L_0x0074
            int r5 = r5 + 43
            goto L_0x0088
        L_0x0074:
            r4 = 84
            if (r5 < r4) goto L_0x007d
            if (r5 > r7) goto L_0x007d
            r4 = 127(0x7f, float:1.78E-43)
            goto L_0x008f
        L_0x007d:
            d9.f r9 = p212d9.C9914f.m50845a()
            throw r9
        L_0x0082:
            if (r5 < r8) goto L_0x008a
            if (r5 > r7) goto L_0x008a
            int r5 = r5 + -64
        L_0x0088:
            char r4 = (char) r5
            goto L_0x008f
        L_0x008a:
            d9.f r9 = p212d9.C9914f.m50845a()
            throw r9
        L_0x008f:
            r1.append(r4)
            goto L_0x009b
        L_0x0093:
            d9.f r9 = p212d9.C9914f.m50845a()
            throw r9
        L_0x0098:
            r1.append(r4)
        L_0x009b:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x009f:
            java.lang.String r9 = r1.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p322p9.C12149d.m58366i(java.lang.CharSequence):java.lang.String");
    }

    /* renamed from: j */
    private int[] m58367j(C10475a aVar) throws C9918j {
        int g = aVar.mo33560g();
        int e = aVar.mo33557e(0);
        Arrays.fill(this.f45223b, 0);
        int[] iArr = this.f45223b;
        int length = iArr.length;
        int i = e;
        boolean z = false;
        int i2 = 0;
        while (e < g) {
            if (aVar.mo33554c(e) ^ z) {
                iArr[i2] = iArr[i2] + 1;
            } else {
                int i3 = length - 1;
                if (i2 != i3) {
                    i2++;
                } else if (m58369l(iArr) == f45221e) {
                    return new int[]{i, e};
                } else {
                    i += iArr[0] + iArr[1];
                    int i4 = length - 2;
                    System.arraycopy(iArr, 2, iArr, 0, i4);
                    iArr[i4] = 0;
                    iArr[i3] = 0;
                    i2--;
                }
                iArr[i2] = 1;
                z = !z;
            }
            e++;
        }
        throw C9918j.m50862a();
    }

    /* renamed from: k */
    private static char m58368k(int i) throws C9918j {
        int i2 = 0;
        while (true) {
            int[] iArr = f45220d;
            if (i2 >= iArr.length) {
                throw C9918j.m50862a();
            } else if (iArr[i2] == i) {
                return f45219c[i2];
            } else {
                i2++;
            }
        }
    }

    /* renamed from: l */
    private static int m58369l(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int round = Math.round((((float) iArr[i4]) * 9.0f) / ((float) i));
            if (round <= 0 || round > 4) {
                return -1;
            }
            if ((i4 & 1) == 0) {
                for (int i5 = 0; i5 < round; i5++) {
                    i3 = (i3 << 1) | 1;
                }
            } else {
                i3 <<= round;
            }
        }
        return i3;
    }

    /* renamed from: b */
    public C9922n mo36672b(int i, C10475a aVar, Map<C9913e, ?> map) throws C9918j, C9912d, C9914f {
        int[] j = m58367j(aVar);
        int e = aVar.mo33557e(j[1]);
        int g = aVar.mo33560g();
        int[] iArr = this.f45223b;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f45222a;
        sb.setLength(0);
        while (true) {
            C12156k.m58391e(aVar, e, iArr);
            int l = m58369l(iArr);
            if (l >= 0) {
                char k = m58368k(l);
                sb.append(k);
                int i2 = e;
                for (int i3 : iArr) {
                    i2 += i3;
                }
                int e2 = aVar.mo33557e(i2);
                if (k == '*') {
                    sb.deleteCharAt(sb.length() - 1);
                    int i4 = 0;
                    for (int i5 : iArr) {
                        i4 += i5;
                    }
                    if (e2 == g || !aVar.mo33554c(e2)) {
                        throw C9918j.m50862a();
                    } else if (sb.length() >= 2) {
                        m58364g(sb);
                        sb.setLength(sb.length() - 2);
                        float f = (float) i;
                        return new C9922n(m58366i(sb), (byte[]) null, new C9924p[]{new C9924p(((float) (j[1] + j[0])) / 2.0f, f), new C9924p(((float) e) + (((float) i4) / 2.0f), f)}, C9909a.CODE_93);
                    } else {
                        throw C9918j.m50862a();
                    }
                } else {
                    e = e2;
                }
            } else {
                throw C9918j.m50862a();
            }
        }
    }
}
