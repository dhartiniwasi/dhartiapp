package p264io.grpc.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: io.grpc.internal.v1 */
/* compiled from: ReadableBuffer */
public interface C11380v1 extends Closeable {
    /* renamed from: A0 */
    void mo35269A0(byte[] bArr, int i, int i2);

    /* renamed from: K0 */
    void mo34982K0();

    /* renamed from: P */
    C11380v1 mo35270P(int i);

    void close();

    /* renamed from: k */
    int mo35271k();

    /* renamed from: l1 */
    void mo35272l1(OutputStream outputStream, int i) throws IOException;

    boolean markSupported();

    int readUnsignedByte();

    void reset();

    void skipBytes(int i);

    /* renamed from: z1 */
    void mo35276z1(ByteBuffer byteBuffer);
}
