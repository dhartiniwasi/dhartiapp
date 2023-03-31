package p300me;

import java.io.IOException;
import p253he.C10543e;
import p336qe.C12235f;

/* renamed from: me.e */
/* compiled from: Http2 */
public final class C11894e {

    /* renamed from: a */
    static final C12235f f44675a = C12235f.m58766o("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    private static final String[] f44676b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c */
    static final String[] f44677c = new String[64];

    /* renamed from: d */
    static final String[] f44678d = new String[256];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f44678d;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = C10543e.m53055p("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = f44677c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i3 = 0; i3 < 1; i3++) {
            int i4 = iArr[i3];
            String[] strArr3 = f44677c;
            strArr3[i4 | 8] = strArr3[i4] + "|PADDED";
        }
        String[] strArr4 = f44677c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 < 1; i7++) {
                int i8 = iArr[i7];
                String[] strArr5 = f44677c;
                int i9 = i8 | i6;
                strArr5[i9] = strArr5[i8] + '|' + strArr5[i6];
                strArr5[i9 | 8] = strArr5[i8] + '|' + strArr5[i6] + "|PADDED";
            }
        }
        while (true) {
            String[] strArr6 = f44677c;
            if (i < strArr6.length) {
                if (strArr6[i] == null) {
                    strArr6[i] = f44678d[i];
                }
                i++;
            } else {
                return;
            }
        }
    }

    private C11894e() {
    }

    /* renamed from: a */
    static String m57430a(byte b, byte b2) {
        if (b2 == 0) {
            return "";
        }
        if (!(b == 2 || b == 3)) {
            if (b == 4 || b == 6) {
                if (b2 == 1) {
                    return "ACK";
                }
                return f44678d[b2];
            } else if (!(b == 7 || b == 8)) {
                String[] strArr = f44677c;
                String str = b2 < strArr.length ? strArr[b2] : f44678d[b2];
                if (b != 5 || (b2 & 4) == 0) {
                    return (b != 0 || (b2 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED");
                }
                return str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return f44678d[b2];
    }

    /* renamed from: b */
    static String m57431b(boolean z, int i, int i2, byte b, byte b2) {
        String[] strArr = f44676b;
        String p = b < strArr.length ? strArr[b] : C10543e.m53055p("0x%02x", Byte.valueOf(b));
        String a = m57430a(b, b2);
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = p;
        objArr[4] = a;
        return C10543e.m53055p("%s 0x%08x %5d %-13s %s", objArr);
    }

    /* renamed from: c */
    static IllegalArgumentException m57432c(String str, Object... objArr) {
        throw new IllegalArgumentException(C10543e.m53055p(str, objArr));
    }

    /* renamed from: d */
    static IOException m57433d(String str, Object... objArr) throws IOException {
        throw new IOException(C10543e.m53055p(str, objArr));
    }
}
