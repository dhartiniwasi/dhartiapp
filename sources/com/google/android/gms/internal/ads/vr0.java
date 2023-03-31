package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class vr0 implements ql2 {

    /* renamed from: a */
    private final ql2 f19212a;

    /* renamed from: b */
    private final long f19213b;

    /* renamed from: c */
    private final ql2 f19214c;

    /* renamed from: d */
    private long f19215d;

    /* renamed from: e */
    private Uri f19216e;

    vr0(ql2 ql2, int i, ql2 ql22) {
        this.f19212a = ql2;
        this.f19213b = (long) i;
        this.f19214c = ql22;
    }

    /* renamed from: a */
    public final Map mo8790a() {
        return xa3.m23155e();
    }

    /* renamed from: b */
    public final void mo8791b() throws IOException {
        this.f19212a.mo8791b();
        this.f19214c.mo8791b();
    }

    /* renamed from: c */
    public final int mo8792c(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.f19215d;
        long j2 = this.f19213b;
        if (j < j2) {
            int c = this.f19212a.mo8792c(bArr, i, (int) Math.min((long) i2, j2 - j));
            long j3 = this.f19215d + ((long) c);
            this.f19215d = j3;
            i3 = c;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < this.f19213b) {
            return i3;
        }
        int c2 = this.f19214c.mo8792c(bArr, i + i3, i2 - i3);
        this.f19215d += (long) c2;
        return i3 + c2;
    }

    /* renamed from: e */
    public final Uri mo8793e() {
        return this.f19216e;
    }

    /* renamed from: f */
    public final long mo8794f(wq2 wq2) throws IOException {
        wq2 wq22;
        wq2 wq23 = wq2;
        this.f19216e = wq23.f19753a;
        long j = wq23.f19758f;
        long j2 = this.f19213b;
        wq2 wq24 = null;
        if (j >= j2) {
            wq22 = null;
        } else {
            long j3 = wq23.f19759g;
            wq22 = new wq2(wq23.f19753a, (byte[]) null, j, j, j3 != -1 ? Math.min(j3, j2 - j) : j2 - j, (String) null, 0);
        }
        long j4 = wq23.f19759g;
        if (j4 == -1 || wq23.f19758f + j4 > this.f19213b) {
            long max = Math.max(this.f19213b, wq23.f19758f);
            long j5 = wq23.f19759g;
            wq24 = new wq2(wq23.f19753a, (byte[]) null, max, max, j5 != -1 ? Math.min(j5, (wq23.f19758f + j5) - this.f19213b) : -1, (String) null, 0);
        }
        long j6 = 0;
        long f = wq22 != null ? this.f19212a.mo8794f(wq22) : 0;
        if (wq24 != null) {
            j6 = this.f19214c.mo8794f(wq24);
        }
        this.f19215d = wq23.f19758f;
        if (f == -1 || j6 == -1) {
            return -1;
        }
        return f + j6;
    }

    /* renamed from: k */
    public final void mo8795k(ve3 ve3) {
    }
}
