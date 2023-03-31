package p199c7;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import p182a7.C6431n;
import p210d7.C9872b;

/* renamed from: c7.b */
/* compiled from: ByteStreams */
public final class C6771b {

    /* renamed from: a */
    private static final OutputStream f31294a = new C6772a();

    /* renamed from: c7.b$a */
    /* compiled from: ByteStreams */
    class C6772a extends OutputStream {
        C6772a() {
        }

        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        public void write(int i) {
        }

        public void write(byte[] bArr) {
            C6431n.m37561n(bArr);
        }

        public void write(byte[] bArr, int i, int i2) {
            C6431n.m37561n(bArr);
            C6431n.m37566s(i, i2 + i, bArr.length);
        }
    }

    /* renamed from: a */
    private static byte[] m38711a(Queue<byte[]> queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] remove = queue.remove();
        if (remove.length == i) {
            return remove;
        }
        int length = i - remove.length;
        byte[] copyOf = Arrays.copyOf(remove, i);
        while (length > 0) {
            byte[] remove2 = queue.remove();
            int min = Math.min(length, remove2.length);
            System.arraycopy(remove2, 0, copyOf, i - length, min);
            length -= min;
        }
        return copyOf;
    }

    /* renamed from: b */
    public static long m38712b(InputStream inputStream, OutputStream outputStream) throws IOException {
        C6431n.m37561n(inputStream);
        C6431n.m37561n(outputStream);
        byte[] c = m38713c();
        long j = 0;
        while (true) {
            int read = inputStream.read(c);
            if (read == -1) {
                return j;
            }
            outputStream.write(c, 0, read);
            j += (long) read;
        }
    }

    /* renamed from: c */
    static byte[] m38713c() {
        return new byte[8192];
    }

    /* renamed from: d */
    public static byte[] m38714d(InputStream inputStream) throws IOException {
        C6431n.m37561n(inputStream);
        return m38715e(inputStream, new ArrayDeque(20), 0);
    }

    /* renamed from: e */
    private static byte[] m38715e(InputStream inputStream, Queue<byte[]> queue, int i) throws IOException {
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i) * 2));
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i2 = 0;
            while (i2 < min2) {
                int read = inputStream.read(bArr, i2, min2 - i2);
                if (read == -1) {
                    return m38711a(queue, i);
                }
                i2 += read;
                i += read;
            }
            min = C9872b.m50644e(min, min < 4096 ? 4 : 2);
        }
        if (inputStream.read() == -1) {
            return m38711a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
