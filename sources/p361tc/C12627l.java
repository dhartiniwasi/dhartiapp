package p361tc;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import p264io.grpc.internal.C11137c;
import p264io.grpc.internal.C11380v1;
import p336qe.C12231c;

/* renamed from: tc.l */
/* compiled from: OkHttpReadableBuffer */
class C12627l extends C11137c {

    /* renamed from: a */
    private final C12231c f46366a;

    C12627l(C12231c cVar) {
        this.f46366a = cVar;
    }

    /* renamed from: b */
    private void m60103b() throws EOFException {
    }

    /* renamed from: A0 */
    public void mo35269A0(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int read = this.f46366a.read(bArr, i, i2);
            if (read != -1) {
                i2 -= read;
                i += read;
            } else {
                throw new IndexOutOfBoundsException("EOF trying to read " + i2 + " bytes");
            }
        }
    }

    /* renamed from: P */
    public C11380v1 mo35270P(int i) {
        C12231c cVar = new C12231c();
        cVar.mo35694k1(this.f46366a, (long) i);
        return new C12627l(cVar);
    }

    public void close() {
        this.f46366a.mo36786a();
    }

    /* renamed from: k */
    public int mo35271k() {
        return (int) this.f46366a.mo36771I();
    }

    /* renamed from: l1 */
    public void mo35272l1(OutputStream outputStream, int i) throws IOException {
        this.f46366a.mo36819u0(outputStream, (long) i);
    }

    public int readUnsignedByte() {
        try {
            m60103b();
            return this.f46366a.readByte() & 255;
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }

    public void skipBytes(int i) {
        try {
            this.f46366a.skip((long) i);
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }

    /* renamed from: z1 */
    public void mo35276z1(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }
}
