package p264io.grpc.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import p182a7.C6419h;
import p182a7.C6431n;

/* renamed from: io.grpc.internal.o0 */
/* compiled from: ForwardingReadableBuffer */
public abstract class C11308o0 implements C11380v1 {

    /* renamed from: a */
    private final C11380v1 f43450a;

    protected C11308o0(C11380v1 v1Var) {
        this.f43450a = (C11380v1) C6431n.m37562o(v1Var, "buf");
    }

    /* renamed from: A0 */
    public void mo35269A0(byte[] bArr, int i, int i2) {
        this.f43450a.mo35269A0(bArr, i, i2);
    }

    /* renamed from: K0 */
    public void mo34982K0() {
        this.f43450a.mo34982K0();
    }

    /* renamed from: P */
    public C11380v1 mo35270P(int i) {
        return this.f43450a.mo35270P(i);
    }

    /* renamed from: k */
    public int mo35271k() {
        return this.f43450a.mo35271k();
    }

    /* renamed from: l1 */
    public void mo35272l1(OutputStream outputStream, int i) throws IOException {
        this.f43450a.mo35272l1(outputStream, i);
    }

    public boolean markSupported() {
        return this.f43450a.markSupported();
    }

    public int readUnsignedByte() {
        return this.f43450a.readUnsignedByte();
    }

    public void reset() {
        this.f43450a.reset();
    }

    public void skipBytes(int i) {
        this.f43450a.skipBytes(i);
    }

    public String toString() {
        return C6419h.m37528c(this).mo21842d("delegate", this.f43450a).toString();
    }

    /* renamed from: z1 */
    public void mo35276z1(ByteBuffer byteBuffer) {
        this.f43450a.mo35276z1(byteBuffer);
    }
}
