package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.q3 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2759q3 {

    /* renamed from: d */
    private static final long[] f16160d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    private final byte[] f16161a = new byte[8];

    /* renamed from: b */
    private int f16162b;

    /* renamed from: c */
    private int f16163c;

    /* renamed from: b */
    public static int m19049b(int i) {
        int i2 = 0;
        while (i2 < 8) {
            int i3 = ((f16160d[i2] & ((long) i)) > 0 ? 1 : ((f16160d[i2] & ((long) i)) == 0 ? 0 : -1));
            i2++;
            if (i3 != 0) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static long m19050c(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f16160d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* renamed from: a */
    public final int mo13465a() {
        return this.f16163c;
    }

    /* renamed from: d */
    public final long mo13466d(rn4 rn4, boolean z, boolean z2, int i) throws IOException {
        if (this.f16162b == 0) {
            if (!rn4.mo9984g(this.f16161a, 0, 1, z)) {
                return -1;
            }
            int b = m19049b(this.f16161a[0] & 255);
            this.f16163c = b;
            if (b != -1) {
                this.f16162b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f16163c;
        if (i2 > i) {
            this.f16162b = 0;
            return -2;
        }
        if (i2 != 1) {
            ((fn4) rn4).mo9984g(this.f16161a, 1, i2 - 1, false);
        }
        this.f16162b = 0;
        return m19050c(this.f16161a, this.f16163c, z2);
    }

    /* renamed from: e */
    public final void mo13467e() {
        this.f16162b = 0;
        this.f16163c = 0;
    }
}
