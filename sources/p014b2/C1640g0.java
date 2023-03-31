package p014b2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: b2.g0 */
/* compiled from: OpusUtil */
public class C1640g0 {
    /* renamed from: a */
    public static List<byte[]> m7536a(byte[] bArr) {
        long e = m7540e((long) m7539d(bArr));
        long e2 = m7540e(3840);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(m7537b(e));
        arrayList.add(m7537b(e2));
        return arrayList;
    }

    /* renamed from: b */
    private static byte[] m7537b(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }

    /* renamed from: c */
    public static int m7538c(byte[] bArr) {
        return bArr[9] & 255;
    }

    /* renamed from: d */
    private static int m7539d(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    /* renamed from: e */
    private static long m7540e(long j) {
        return (j * 1000000000) / 48000;
    }
}
