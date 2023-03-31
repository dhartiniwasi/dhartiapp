package p336qe;

import java.io.IOException;
import java.nio.channels.ReadableByteChannel;

/* renamed from: qe.e */
/* compiled from: BufferedSource */
public interface C12234e extends C12252t, ReadableByteChannel {
    /* renamed from: B */
    C12235f mo36762B(long j) throws IOException;

    /* renamed from: E1 */
    long mo36765E1(byte b) throws IOException;

    /* renamed from: G1 */
    long mo36769G1() throws IOException;

    /* renamed from: V */
    byte[] mo36779V() throws IOException;

    /* renamed from: W */
    C12231c mo36780W();

    /* renamed from: W0 */
    String mo36781W0() throws IOException;

    /* renamed from: X0 */
    int mo36782X0() throws IOException;

    /* renamed from: Z */
    boolean mo36784Z() throws IOException;

    /* renamed from: Z0 */
    byte[] mo36785Z0(long j) throws IOException;

    /* renamed from: i1 */
    short mo36800i1() throws IOException;

    @Deprecated
    /* renamed from: j */
    C12231c mo36802j();

    /* renamed from: l0 */
    String mo36805l0(long j) throws IOException;

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    short readShort() throws IOException;

    void skip(long j) throws IOException;

    /* renamed from: y1 */
    void mo36825y1(long j) throws IOException;
}
