package p264io.grpc.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import p182a7.C6431n;
import p343rc.C12371q0;

/* renamed from: io.grpc.internal.w1 */
/* compiled from: ReadableBuffers */
public final class C11384w1 {

    /* renamed from: a */
    private static final C11380v1 f43656a = new C11387c(new byte[0]);

    /* renamed from: io.grpc.internal.w1$a */
    /* compiled from: ReadableBuffers */
    class C11385a extends C11308o0 {
        C11385a(C11380v1 v1Var) {
            super(v1Var);
        }

        public void close() {
        }
    }

    /* renamed from: io.grpc.internal.w1$c */
    /* compiled from: ReadableBuffers */
    private static class C11387c extends C11137c {

        /* renamed from: a */
        int f43658a;

        /* renamed from: b */
        final int f43659b;

        /* renamed from: c */
        final byte[] f43660c;

        /* renamed from: d */
        int f43661d;

        C11387c(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        /* renamed from: A0 */
        public void mo35269A0(byte[] bArr, int i, int i2) {
            System.arraycopy(this.f43660c, this.f43658a, bArr, i, i2);
            this.f43658a += i2;
        }

        /* renamed from: K0 */
        public void mo34982K0() {
            this.f43661d = this.f43658a;
        }

        /* renamed from: b */
        public C11387c mo35270P(int i) {
            mo34983a(i);
            int i2 = this.f43658a;
            this.f43658a = i2 + i;
            return new C11387c(this.f43660c, i2, i);
        }

        /* renamed from: k */
        public int mo35271k() {
            return this.f43659b - this.f43658a;
        }

        /* renamed from: l1 */
        public void mo35272l1(OutputStream outputStream, int i) throws IOException {
            mo34983a(i);
            outputStream.write(this.f43660c, this.f43658a, i);
            this.f43658a += i;
        }

        public boolean markSupported() {
            return true;
        }

        public int readUnsignedByte() {
            mo34983a(1);
            byte[] bArr = this.f43660c;
            int i = this.f43658a;
            this.f43658a = i + 1;
            return bArr[i] & 255;
        }

        public void reset() {
            int i = this.f43661d;
            if (i != -1) {
                this.f43658a = i;
                return;
            }
            throw new InvalidMarkException();
        }

        public void skipBytes(int i) {
            mo34983a(i);
            this.f43658a += i;
        }

        /* renamed from: z1 */
        public void mo35276z1(ByteBuffer byteBuffer) {
            C6431n.m37562o(byteBuffer, "dest");
            int remaining = byteBuffer.remaining();
            mo34983a(remaining);
            byteBuffer.put(this.f43660c, this.f43658a, remaining);
            this.f43658a += remaining;
        }

        C11387c(byte[] bArr, int i, int i2) {
            this.f43661d = -1;
            boolean z = true;
            C6431n.m37552e(i >= 0, "offset must be >= 0");
            C6431n.m37552e(i2 >= 0, "length must be >= 0");
            int i3 = i2 + i;
            C6431n.m37552e(i3 > bArr.length ? false : z, "offset + length exceeds array boundary");
            this.f43660c = (byte[]) C6431n.m37562o(bArr, "bytes");
            this.f43658a = i;
            this.f43659b = i3;
        }
    }

    /* renamed from: a */
    public static C11380v1 m55968a() {
        return f43656a;
    }

    /* renamed from: b */
    public static C11380v1 m55969b(C11380v1 v1Var) {
        return new C11385a(v1Var);
    }

    /* renamed from: c */
    public static InputStream m55970c(C11380v1 v1Var, boolean z) {
        if (!z) {
            v1Var = m55969b(v1Var);
        }
        return new C11386b(v1Var);
    }

    /* renamed from: d */
    public static byte[] m55971d(C11380v1 v1Var) {
        C6431n.m37562o(v1Var, "buffer");
        int k = v1Var.mo35271k();
        byte[] bArr = new byte[k];
        v1Var.mo35269A0(bArr, 0, k);
        return bArr;
    }

    /* renamed from: e */
    public static String m55972e(C11380v1 v1Var, Charset charset) {
        C6431n.m37562o(charset, "charset");
        return new String(m55971d(v1Var), charset);
    }

    /* renamed from: f */
    public static C11380v1 m55973f(byte[] bArr, int i, int i2) {
        return new C11387c(bArr, i, i2);
    }

    /* renamed from: io.grpc.internal.w1$b */
    /* compiled from: ReadableBuffers */
    private static final class C11386b extends InputStream implements C12371q0 {

        /* renamed from: a */
        private C11380v1 f43657a;

        public C11386b(C11380v1 v1Var) {
            this.f43657a = (C11380v1) C6431n.m37562o(v1Var, "buffer");
        }

        public int available() throws IOException {
            return this.f43657a.mo35271k();
        }

        public void close() throws IOException {
            this.f43657a.close();
        }

        public void mark(int i) {
            this.f43657a.mo34982K0();
        }

        public boolean markSupported() {
            return this.f43657a.markSupported();
        }

        public int read() {
            if (this.f43657a.mo35271k() == 0) {
                return -1;
            }
            return this.f43657a.readUnsignedByte();
        }

        public void reset() throws IOException {
            this.f43657a.reset();
        }

        public long skip(long j) throws IOException {
            int min = (int) Math.min((long) this.f43657a.mo35271k(), j);
            this.f43657a.skipBytes(min);
            return (long) min;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (this.f43657a.mo35271k() == 0) {
                return -1;
            }
            int min = Math.min(this.f43657a.mo35271k(), i2);
            this.f43657a.mo35269A0(bArr, i, min);
            return min;
        }
    }
}
