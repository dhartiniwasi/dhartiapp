package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.ql */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2777ql {

    /* renamed from: d */
    private static final long[] f16448d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    private final byte[] f16449a = new byte[8];

    /* renamed from: b */
    private int f16450b;

    /* renamed from: c */
    private int f16451c;

    /* renamed from: b */
    public static int m19260b(int i) {
        int i2 = 0;
        while (i2 < 8) {
            int i3 = ((f16448d[i2] & ((long) i)) > 0 ? 1 : ((f16448d[i2] & ((long) i)) == 0 ? 0 : -1));
            i2++;
            if (i3 != 0) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static long m19261c(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f16448d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* renamed from: a */
    public final int mo13556a() {
        return this.f16451c;
    }

    /* renamed from: d */
    public final void mo13557d() {
        this.f16450b = 0;
        this.f16451c = 0;
    }

    /* renamed from: e */
    public final long mo13558e(C2924uk ukVar, boolean z, boolean z2, int i) throws IOException, InterruptedException {
        if (this.f16450b == 0) {
            if (!ukVar.mo14528h(this.f16449a, 0, 1, z)) {
                return -1;
            }
            int b = m19260b(this.f16449a[0] & 255);
            this.f16451c = b;
            if (b != -1) {
                this.f16450b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f16451c;
        if (i2 > i) {
            this.f16450b = 0;
            return -2;
        }
        if (i2 != 1) {
            ukVar.mo14528h(this.f16449a, 1, i2 - 1, false);
        }
        this.f16450b = 0;
        return m19261c(this.f16449a, this.f16451c, z2);
    }
}
