package com.google.firebase.messaging;

import androidx.recyclerview.widget.RecyclerView;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* renamed from: com.google.firebase.messaging.b */
/* compiled from: ByteStreams */
final class C8016b {
    /* renamed from: a */
    private static byte[] m44160a(Queue<byte[]> queue, int i) {
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
    public static InputStream m44161b(InputStream inputStream, long j) {
        return new C8017a(inputStream, j);
    }

    /* renamed from: c */
    private static int m44162c(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j < -2147483648L ? RecyclerView.UNDEFINED_DURATION : (int) j;
    }

    /* renamed from: d */
    public static byte[] m44163d(InputStream inputStream) throws IOException {
        return m44164e(inputStream, new ArrayDeque(20), 0);
    }

    /* renamed from: e */
    private static byte[] m44164e(InputStream inputStream, Queue<byte[]> queue, int i) throws IOException {
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i) * 2));
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i2 = 0;
            while (i2 < min2) {
                int read = inputStream.read(bArr, i2, min2 - i2);
                if (read == -1) {
                    return m44160a(queue, i);
                }
                i2 += read;
                i += read;
            }
            min = m44162c(((long) min) * ((long) (min < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return m44160a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: com.google.firebase.messaging.b$a */
    /* compiled from: ByteStreams */
    private static final class C8017a extends FilterInputStream {

        /* renamed from: a */
        private long f34624a;

        /* renamed from: b */
        private long f34625b = -1;

        C8017a(InputStream inputStream, long j) {
            super(inputStream);
            this.f34624a = j;
        }

        public int available() throws IOException {
            return (int) Math.min((long) this.in.available(), this.f34624a);
        }

        public synchronized void mark(int i) {
            this.in.mark(i);
            this.f34625b = this.f34624a;
        }

        public int read() throws IOException {
            if (this.f34624a == 0) {
                return -1;
            }
            int read = this.in.read();
            if (read != -1) {
                this.f34624a--;
            }
            return read;
        }

        public synchronized void reset() throws IOException {
            if (!this.in.markSupported()) {
                throw new IOException("Mark not supported");
            } else if (this.f34625b != -1) {
                this.in.reset();
                this.f34624a = this.f34625b;
            } else {
                throw new IOException("Mark not set");
            }
        }

        public long skip(long j) throws IOException {
            long skip = this.in.skip(Math.min(j, this.f34624a));
            this.f34624a -= skip;
            return skip;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            long j = this.f34624a;
            if (j == 0) {
                return -1;
            }
            int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
            if (read != -1) {
                this.f34624a -= (long) read;
            }
            return read;
        }
    }
}
