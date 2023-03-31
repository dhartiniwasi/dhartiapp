package p322p9;

import com.pichillilorenzo.flutter_inappwebview.C8710R;
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

/* renamed from: p9.c */
/* compiled from: Code39Reader */
public final class C12148c extends C12156k {

    /* renamed from: e */
    static final int[] f45213e;

    /* renamed from: f */
    static final int f45214f;

    /* renamed from: a */
    private final boolean f45215a;

    /* renamed from: b */
    private final boolean f45216b;

    /* renamed from: c */
    private final StringBuilder f45217c;

    /* renamed from: d */
    private final int[] f45218d;

    static {
        int[] iArr = {52, 289, 97, 352, 49, 304, C8710R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 148, 168, 162, 138, 42};
        f45213e = iArr;
        f45214f = iArr[39];
    }

    public C12148c() {
        this(false);
    }

    /* renamed from: g */
    private static String m58359g(CharSequence charSequence) throws C9914f {
        char c;
        int i;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt == '+' || charAt == '$' || charAt == '%' || charAt == '/') {
                i2++;
                char charAt2 = charSequence.charAt(i2);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt != '/') {
                                c = 0;
                            } else if (charAt2 >= 'A' && charAt2 <= 'O') {
                                i = charAt2 - ' ';
                            } else if (charAt2 == 'Z') {
                                c = ':';
                            } else {
                                throw C9914f.m50845a();
                            }
                            sb.append(c);
                        } else if (charAt2 < 'A' || charAt2 > 'Z') {
                            throw C9914f.m50845a();
                        } else {
                            i = charAt2 + ' ';
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i = charAt2 - '&';
                    } else if (charAt2 < 'F' || charAt2 > 'W') {
                        throw C9914f.m50845a();
                    } else {
                        i = charAt2 - 11;
                    }
                } else if (charAt2 < 'A' || charAt2 > 'Z') {
                    throw C9914f.m50845a();
                } else {
                    i = charAt2 - '@';
                }
                c = (char) i;
                sb.append(c);
            } else {
                sb.append(charAt);
            }
            i2++;
        }
        return sb.toString();
    }

    /* renamed from: h */
    private static int[] m58360h(C10475a aVar, int[] iArr) throws C9918j {
        int g = aVar.mo33560g();
        int e = aVar.mo33557e(0);
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
                } else if (m58362j(iArr) != f45214f || !aVar.mo33561h(Math.max(0, i - ((e - i) / 2)), i, false)) {
                    i += iArr[0] + iArr[1];
                    int i4 = length - 2;
                    System.arraycopy(iArr, 2, iArr, 0, i4);
                    iArr[i4] = 0;
                    iArr[i3] = 0;
                    i2--;
                } else {
                    return new int[]{i, e};
                }
                iArr[i2] = 1;
                z = !z;
            }
            e++;
        }
        throw C9918j.m50862a();
    }

    /* renamed from: i */
    private static char m58361i(int i) throws C9918j {
        int i2 = 0;
        while (true) {
            int[] iArr = f45213e;
            if (i2 >= iArr.length) {
                throw C9918j.m50862a();
            } else if (iArr[i2] == i) {
                return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".charAt(i2);
            } else {
                i2++;
            }
        }
    }

    /* renamed from: j */
    private static int m58362j(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i5 |= 1 << ((length - 1) - i7);
                    i4++;
                    i6 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i2) {
                        i4--;
                        if ((i10 << 1) >= i6) {
                            return -1;
                        }
                    }
                }
                return i5;
            } else if (i4 <= 3) {
                return -1;
            } else {
                i = i2;
            }
        }
    }

    /* renamed from: b */
    public C9922n mo36672b(int i, C10475a aVar, Map<C9913e, ?> map) throws C9918j, C9912d, C9914f {
        String str;
        int[] iArr = this.f45218d;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f45217c;
        sb.setLength(0);
        int[] h = m58360h(aVar, iArr);
        int e = aVar.mo33557e(h[1]);
        int g = aVar.mo33560g();
        while (true) {
            C12156k.m58391e(aVar, e, iArr);
            int j = m58362j(iArr);
            if (j >= 0) {
                char i2 = m58361i(j);
                sb.append(i2);
                int i3 = e;
                for (int i4 : iArr) {
                    i3 += i4;
                }
                int e2 = aVar.mo33557e(i3);
                if (i2 == '*') {
                    sb.setLength(sb.length() - 1);
                    int i5 = 0;
                    for (int i6 : iArr) {
                        i5 += i6;
                    }
                    int i7 = (e2 - e) - i5;
                    if (e2 == g || (i7 << 1) >= i5) {
                        if (this.f45215a) {
                            int length = sb.length() - 1;
                            int i8 = 0;
                            for (int i9 = 0; i9 < length; i9++) {
                                i8 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f45217c.charAt(i9));
                            }
                            if (sb.charAt(length) == "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i8 % 43)) {
                                sb.setLength(length);
                            } else {
                                throw C9912d.m50844a();
                            }
                        }
                        if (sb.length() != 0) {
                            if (this.f45216b) {
                                str = m58359g(sb);
                            } else {
                                str = sb.toString();
                            }
                            float f = (float) i;
                            return new C9922n(str, (byte[]) null, new C9924p[]{new C9924p(((float) (h[1] + h[0])) / 2.0f, f), new C9924p(((float) e) + (((float) i5) / 2.0f), f)}, C9909a.CODE_39);
                        }
                        throw C9918j.m50862a();
                    }
                    throw C9918j.m50862a();
                }
                e = e2;
            } else {
                throw C9918j.m50862a();
            }
        }
    }

    public C12148c(boolean z) {
        this(z, false);
    }

    public C12148c(boolean z, boolean z2) {
        this.f45215a = z;
        this.f45216b = z2;
        this.f45217c = new StringBuilder(20);
        this.f45218d = new int[9];
    }
}
