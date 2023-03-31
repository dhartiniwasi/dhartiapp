package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class lq0 implements C2669np {

    /* renamed from: a */
    private final C2669np f12881a;

    /* renamed from: b */
    private final long f12882b;

    /* renamed from: c */
    private final C2669np f12883c;

    /* renamed from: d */
    private long f12884d;

    /* renamed from: e */
    private Uri f12885e;

    lq0(C2669np npVar, int i, C2669np npVar2) {
        this.f12881a = npVar;
        this.f12882b = (long) i;
        this.f12883c = npVar2;
    }

    /* renamed from: b */
    public final void mo12051b() throws IOException {
        this.f12881a.mo12051b();
        this.f12883c.mo12051b();
    }

    /* renamed from: c */
    public final int mo12052c(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.f12884d;
        long j2 = this.f12882b;
        if (j < j2) {
            int c = this.f12881a.mo12052c(bArr, i, (int) Math.min((long) i2, j2 - j));
            long j3 = this.f12884d + ((long) c);
            this.f12884d = j3;
            i3 = c;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < this.f12882b) {
            return i3;
        }
        int c2 = this.f12883c.mo12052c(bArr, i + i3, i2 - i3);
        this.f12884d += (long) c2;
        return i3 + c2;
    }

    /* renamed from: d */
    public final long mo12053d(C2744pp ppVar) throws IOException {
        C2744pp ppVar2;
        C2744pp ppVar3 = ppVar;
        this.f12885e = ppVar3.f15941a;
        long j = ppVar3.f15943c;
        long j2 = this.f12882b;
        C2744pp ppVar4 = null;
        if (j >= j2) {
            ppVar2 = null;
        } else {
            long j3 = ppVar3.f15944d;
            ppVar2 = new C2744pp(ppVar3.f15941a, (byte[]) null, j, j, j3 != -1 ? Math.min(j3, j2 - j) : j2 - j, (String) null, 0);
        }
        long j4 = ppVar3.f15944d;
        if (j4 == -1 || ppVar3.f15943c + j4 > this.f12882b) {
            long max = Math.max(this.f12882b, ppVar3.f15943c);
            long j5 = ppVar3.f15944d;
            ppVar4 = new C2744pp(ppVar3.f15941a, (byte[]) null, max, max, j5 != -1 ? Math.min(j5, (ppVar3.f15943c + j5) - this.f12882b) : -1, (String) null, 0);
        }
        long j6 = 0;
        long d = ppVar2 != null ? this.f12881a.mo12053d(ppVar2) : 0;
        if (ppVar4 != null) {
            j6 = this.f12883c.mo12053d(ppVar4);
        }
        this.f12884d = ppVar3.f15943c;
        if (j6 == -1) {
            return -1;
        }
        return d + j6;
    }

    /* renamed from: e */
    public final Uri mo12054e() {
        return this.f12885e;
    }
}
