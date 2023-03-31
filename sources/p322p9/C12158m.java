package p322p9;

import java.util.EnumMap;
import java.util.Map;
import p212d9.C9909a;
import p212d9.C9918j;
import p212d9.C9922n;
import p212d9.C9923o;
import p212d9.C9924p;
import p248h9.C10475a;

/* renamed from: p9.m */
/* compiled from: UPCEANExtension2Support */
final class C12158m {

    /* renamed from: a */
    private final int[] f45237a = new int[4];

    /* renamed from: b */
    private final StringBuilder f45238b = new StringBuilder();

    C12158m() {
    }

    /* renamed from: a */
    private int m58401a(C10475a aVar, int[] iArr, StringBuilder sb) throws C9918j {
        int[] iArr2 = this.f45237a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int g = aVar.mo33560g();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 2 && i < g; i3++) {
            int i4 = C12161p.m58412i(aVar, iArr2, i, C12161p.f45249h);
            sb.append((char) ((i4 % 10) + 48));
            for (int i5 : iArr2) {
                i += i5;
            }
            if (i4 >= 10) {
                i2 |= 1 << (1 - i3);
            }
            if (i3 != 1) {
                i = aVar.mo33559f(aVar.mo33557e(i));
            }
        }
        if (sb.length() != 2) {
            throw C9918j.m50862a();
        } else if (Integer.parseInt(sb.toString()) % 4 == i2) {
            return i;
        } else {
            throw C9918j.m50862a();
        }
    }

    /* renamed from: c */
    private static Map<C9923o, Object> m58402c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(C9923o.class);
        enumMap.put(C9923o.ISSUE_NUMBER, Integer.valueOf(str));
        return enumMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C9922n mo36677b(int i, C10475a aVar, int[] iArr) throws C9918j {
        StringBuilder sb = this.f45238b;
        sb.setLength(0);
        int a = m58401a(aVar, iArr, sb);
        String sb2 = sb.toString();
        Map<C9923o, Object> c = m58402c(sb2);
        float f = (float) i;
        C9922n nVar = new C9922n(sb2, (byte[]) null, new C9924p[]{new C9924p(((float) (iArr[0] + iArr[1])) / 2.0f, f), new C9924p((float) a, f)}, C9909a.UPC_EAN_EXTENSION);
        if (c != null) {
            nVar.mo32477g(c);
        }
        return nVar;
    }
}
