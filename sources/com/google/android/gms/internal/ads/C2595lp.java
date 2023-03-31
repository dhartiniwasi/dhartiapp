package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.lp */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2595lp implements C2669np {

    /* renamed from: a */
    private final byte[] f12870a;

    /* renamed from: b */
    private Uri f12871b;

    /* renamed from: c */
    private int f12872c;

    /* renamed from: d */
    private int f12873d;

    public C2595lp(byte[] bArr) {
        Objects.requireNonNull(bArr);
        C2335eq.m12243c(bArr.length > 0);
        this.f12870a = bArr;
    }

    /* renamed from: b */
    public final void mo12051b() throws IOException {
        this.f12871b = null;
    }

    /* renamed from: c */
    public final int mo12052c(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f12873d;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.f12870a, this.f12872c, bArr, i, min);
        this.f12872c += min;
        this.f12873d -= min;
        return min;
    }

    /* renamed from: d */
    public final long mo12053d(C2744pp ppVar) throws IOException {
        this.f12871b = ppVar.f15941a;
        long j = ppVar.f15943c;
        int i = (int) j;
        this.f12872c = i;
        long j2 = ppVar.f15944d;
        long j3 = -1;
        if (j2 == -1) {
            j2 = ((long) this.f12870a.length) - j;
        } else {
            j3 = j2;
        }
        int i2 = (int) j2;
        this.f12873d = i2;
        if (i2 > 0 && i + i2 <= this.f12870a.length) {
            return (long) i2;
        }
        int length = this.f12870a.length;
        throw new IOException("Unsatisfiable range: [" + i + ", " + j3 + "], length: " + length);
    }

    /* renamed from: e */
    public final Uri mo12054e() {
        return this.f12871b;
    }
}
