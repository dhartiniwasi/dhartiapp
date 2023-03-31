package p264io.grpc.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
import p182a7.C6415d;
import p199c7.C6765a;
import p343rc.C12354m0;
import p343rc.C12411y0;

/* renamed from: io.grpc.internal.m2 */
/* compiled from: TransportFrameUtil */
public final class C11298m2 {

    /* renamed from: a */
    private static final Logger f43424a = Logger.getLogger(C11298m2.class.getName());

    /* renamed from: b */
    private static final byte[] f43425b = "-bin".getBytes(C6415d.f30662a);

    private C11298m2() {
    }

    /* renamed from: a */
    private static boolean m55653a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i = length; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i - length]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m55654b(byte[] bArr) {
        for (byte b : bArr) {
            if (b < 32 || b > 126) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static byte[][] m55655c(byte[][] bArr, int i) {
        ArrayList arrayList = new ArrayList(bArr.length + 10);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(bArr[i2]);
        }
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            byte[] bArr3 = bArr[i + 1];
            if (!m55653a(bArr2, f43425b)) {
                arrayList.add(bArr2);
                arrayList.add(bArr3);
            } else {
                int i3 = 0;
                for (int i4 = 0; i4 <= bArr3.length; i4++) {
                    if (i4 == bArr3.length || bArr3[i4] == 44) {
                        byte[] b = C6765a.m38680a().mo22687b(new String(bArr3, i3, i4 - i3, C6415d.f30662a));
                        arrayList.add(bArr2);
                        arrayList.add(b);
                        i3 = i4 + 1;
                    }
                }
            }
            i += 2;
        }
        return (byte[][]) arrayList.toArray(new byte[0][]);
    }

    /* renamed from: d */
    public static byte[][] m55656d(C12411y0 y0Var) {
        byte[][] d = C12354m0.m59159d(y0Var);
        if (d == null) {
            return new byte[0][];
        }
        int i = 0;
        for (int i2 = 0; i2 < d.length; i2 += 2) {
            byte[] bArr = d[i2];
            byte[] bArr2 = d[i2 + 1];
            if (m55653a(bArr, f43425b)) {
                d[i] = bArr;
                d[i + 1] = C12354m0.f45673b.mo22690e(bArr2).getBytes(C6415d.f30662a);
            } else if (m55654b(bArr2)) {
                d[i] = bArr;
                d[i + 1] = bArr2;
            } else {
                String str = new String(bArr, C6415d.f30662a);
                Logger logger = f43424a;
                logger.warning("Metadata key=" + str + ", value=" + Arrays.toString(bArr2) + " contains invalid ASCII characters");
            }
            i += 2;
        }
        if (i == d.length) {
            return d;
        }
        return (byte[][]) Arrays.copyOfRange(d, 0, i);
    }

    /* renamed from: e */
    public static byte[][] m55657e(byte[][] bArr) {
        for (int i = 0; i < bArr.length; i += 2) {
            byte[] bArr2 = bArr[i];
            int i2 = i + 1;
            byte[] bArr3 = bArr[i2];
            if (m55653a(bArr2, f43425b)) {
                for (byte b : bArr3) {
                    if (b == 44) {
                        return m55655c(bArr, i);
                    }
                }
                bArr[i2] = C6765a.m38680a().mo22687b(new String(bArr3, C6415d.f30662a));
            }
        }
        return bArr;
    }
}
