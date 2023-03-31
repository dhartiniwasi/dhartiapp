package p322p9;

import com.pichillilorenzo.flutter_inappwebview.C8710R;
import p212d9.C9909a;
import p212d9.C9914f;
import p212d9.C9918j;
import p248h9.C10475a;

/* renamed from: p9.q */
/* compiled from: UPCEReader */
public final class C12162q extends C12161p {

    /* renamed from: j */
    static final int[] f45253j = {56, 52, 50, 49, 44, 38, 35, 42, 41, 37};

    /* renamed from: k */
    private static final int[] f45254k = {1, 1, 1, 1, 1, 1};

    /* renamed from: l */
    private static final int[][] f45255l = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: i */
    private final int[] f45256i = new int[4];

    /* renamed from: q */
    public static String m58422q(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c = cArr[5];
        switch (c) {
            case '0':
            case '1':
            case C8710R.styleable.AppCompatTheme_colorAccent:
                sb.append(cArr, 0, 2);
                sb.append(c);
                sb.append("0000");
                sb.append(cArr, 2, 3);
                break;
            case C8710R.styleable.AppCompatTheme_colorBackgroundFloating:
                sb.append(cArr, 0, 3);
                sb.append("00000");
                sb.append(cArr, 3, 2);
                break;
            case C8710R.styleable.AppCompatTheme_colorButtonNormal:
                sb.append(cArr, 0, 4);
                sb.append("00000");
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append("0000");
                sb.append(c);
                break;
        }
        sb.append(str.charAt(7));
        return sb.toString();
    }

    /* renamed from: r */
    private static void m58423r(StringBuilder sb, int i) throws C9918j {
        for (int i2 = 0; i2 <= 1; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (i == f45255l[i2][i3]) {
                    sb.insert(0, (char) (i2 + 48));
                    sb.append((char) (i3 + 48));
                    return;
                }
            }
        }
        throw C9918j.m50862a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo36680g(String str) throws C9914f {
        return super.mo36680g(m58422q(str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int[] mo36681j(C10475a aVar, int i) throws C9918j {
        return C12161p.m58413m(aVar, i, true, f45254k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public int mo36673k(C10475a aVar, int[] iArr, StringBuilder sb) throws C9918j {
        int[] iArr2 = this.f45256i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int g = aVar.mo33560g();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 6 && i < g; i3++) {
            int i4 = C12161p.m58412i(aVar, iArr2, i, C12161p.f45249h);
            sb.append((char) ((i4 % 10) + 48));
            for (int i5 : iArr2) {
                i += i5;
            }
            if (i4 >= 10) {
                i2 |= 1 << (5 - i3);
            }
        }
        m58423r(sb, i2);
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C9909a mo36674p() {
        return C9909a.UPC_E;
    }
}
