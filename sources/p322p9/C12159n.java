package p322p9;

import java.util.EnumMap;
import java.util.Map;
import p212d9.C9909a;
import p212d9.C9918j;
import p212d9.C9922n;
import p212d9.C9923o;
import p212d9.C9924p;
import p248h9.C10475a;

/* renamed from: p9.n */
/* compiled from: UPCEANExtension5Support */
final class C12159n {

    /* renamed from: c */
    private static final int[] f45239c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a */
    private final int[] f45240a = new int[4];

    /* renamed from: b */
    private final StringBuilder f45241b = new StringBuilder();

    C12159n() {
    }

    /* renamed from: a */
    private int m58404a(C10475a aVar, int[] iArr, StringBuilder sb) throws C9918j {
        int[] iArr2 = this.f45240a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int g = aVar.mo33560g();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 5 && i < g; i3++) {
            int i4 = C12161p.m58412i(aVar, iArr2, i, C12161p.f45249h);
            sb.append((char) ((i4 % 10) + 48));
            for (int i5 : iArr2) {
                i += i5;
            }
            if (i4 >= 10) {
                i2 |= 1 << (4 - i3);
            }
            if (i3 != 4) {
                i = aVar.mo33559f(aVar.mo33557e(i));
            }
        }
        if (sb.length() == 5) {
            if (m58406d(sb.toString()) == m58405c(i2)) {
                return i;
            }
            throw C9918j.m50862a();
        }
        throw C9918j.m50862a();
    }

    /* renamed from: c */
    private static int m58405c(int i) throws C9918j {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f45239c[i2]) {
                return i2;
            }
        }
        throw C9918j.m50862a();
    }

    /* renamed from: d */
    private static int m58406d(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            i += charSequence.charAt(i2) - '0';
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            i3 += charSequence.charAt(i4) - '0';
        }
        return (i3 * 3) % 10;
    }

    /* renamed from: e */
    private static String m58407e(String str) {
        String str2;
        char charAt = str.charAt(0);
        String str3 = "";
        if (charAt == '0') {
            str3 = "£";
        } else if (charAt == '5') {
            str3 = "$";
        } else if (charAt == '9') {
            if ("90000".equals(str)) {
                return null;
            }
            if ("99991".equals(str)) {
                return "0.00";
            }
            if ("99990".equals(str)) {
                return "Used";
            }
        }
        int parseInt = Integer.parseInt(str.substring(1));
        String valueOf = String.valueOf(parseInt / 100);
        int i = parseInt % 100;
        if (i < 10) {
            str2 = "0" + i;
        } else {
            str2 = String.valueOf(i);
        }
        return str3 + valueOf + '.' + str2;
    }

    /* renamed from: f */
    private static Map<C9923o, Object> m58408f(String str) {
        String e;
        if (str.length() != 5 || (e = m58407e(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(C9923o.class);
        enumMap.put(C9923o.SUGGESTED_PRICE, e);
        return enumMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C9922n mo36678b(int i, C10475a aVar, int[] iArr) throws C9918j {
        StringBuilder sb = this.f45241b;
        sb.setLength(0);
        int a = m58404a(aVar, iArr, sb);
        String sb2 = sb.toString();
        Map<C9923o, Object> f = m58408f(sb2);
        float f2 = (float) i;
        C9922n nVar = new C9922n(sb2, (byte[]) null, new C9924p[]{new C9924p(((float) (iArr[0] + iArr[1])) / 2.0f, f2), new C9924p((float) a, f2)}, C9909a.UPC_EAN_EXTENSION);
        if (f != null) {
            nVar.mo32477g(f);
        }
        return nVar;
    }
}
