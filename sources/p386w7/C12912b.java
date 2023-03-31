package p386w7;

import java.io.OutputStream;

/* renamed from: w7.b */
/* compiled from: LengthCountingOutputStream */
final class C12912b extends OutputStream {

    /* renamed from: a */
    private long f47121a = 0;

    C12912b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo37945a() {
        return this.f47121a;
    }

    public void write(int i) {
        this.f47121a++;
    }

    public void write(byte[] bArr) {
        this.f47121a += (long) bArr.length;
    }

    public void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f47121a += (long) i2;
    }
}
