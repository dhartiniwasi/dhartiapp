package p078k2;

import java.io.IOException;
import p037e2.C4216m;

/* renamed from: k2.g */
/* compiled from: VarintReader */
final class C4863g {

    /* renamed from: d */
    private static final long[] f25752d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    private final byte[] f25753a = new byte[8];

    /* renamed from: b */
    private int f25754b;

    /* renamed from: c */
    private int f25755c;

    /* renamed from: a */
    public static long m30967a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f25752d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* renamed from: c */
    public static int m30968c(int i) {
        int i2 = 0;
        while (true) {
            long[] jArr = f25752d;
            if (i2 >= jArr.length) {
                return -1;
            }
            if ((jArr[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
            i2++;
        }
    }

    /* renamed from: b */
    public int mo18618b() {
        return this.f25755c;
    }

    /* renamed from: d */
    public long mo18619d(C4216m mVar, boolean z, boolean z2, int i) throws IOException {
        if (this.f25754b == 0) {
            if (!mVar.mo17555d(this.f25753a, 0, 1, z)) {
                return -1;
            }
            int c = m30968c(this.f25753a[0] & 255);
            this.f25755c = c;
            if (c != -1) {
                this.f25754b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f25755c;
        if (i2 > i) {
            this.f25754b = 0;
            return -2;
        }
        if (i2 != 1) {
            mVar.readFully(this.f25753a, 1, i2 - 1);
        }
        this.f25754b = 0;
        return m30967a(this.f25753a, this.f25755c, z2);
    }

    /* renamed from: e */
    public void mo18620e() {
        this.f25754b = 0;
        this.f25755c = 0;
    }
}
