package p264io.grpc.internal;

/* renamed from: io.grpc.internal.c */
/* compiled from: AbstractReadableBuffer */
public abstract class C11137c implements C11380v1 {
    /* renamed from: K0 */
    public void mo34982K0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo34983a(int i) {
        if (mo35271k() < i) {
            throw new IndexOutOfBoundsException();
        }
    }

    public void close() {
    }

    public boolean markSupported() {
        return false;
    }

    public final int readInt() {
        mo34983a(4);
        return (readUnsignedByte() << 24) | (readUnsignedByte() << 16) | (readUnsignedByte() << 8) | readUnsignedByte();
    }

    public void reset() {
        throw new UnsupportedOperationException();
    }
}
