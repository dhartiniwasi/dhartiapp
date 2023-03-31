package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.s */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2829s {

    /* renamed from: a */
    private final byte[] f17153a = new byte[10];

    /* renamed from: b */
    private boolean f17154b;

    /* renamed from: c */
    private int f17155c;

    /* renamed from: d */
    private long f17156d;

    /* renamed from: e */
    private int f17157e;

    /* renamed from: f */
    private int f17158f;

    /* renamed from: g */
    private int f17159g;

    /* renamed from: a */
    public final void mo13911a(C2792r rVar, C2755q qVar) {
        if (this.f17155c > 0) {
            rVar.mo8824f(this.f17156d, this.f17157e, this.f17158f, this.f17159g, qVar);
            this.f17155c = 0;
        }
    }

    /* renamed from: b */
    public final void mo13912b() {
        this.f17154b = false;
        this.f17155c = 0;
    }

    /* renamed from: c */
    public final void mo13913c(C2792r rVar, long j, int i, int i2, int i3, C2755q qVar) {
        if (this.f17159g > i2 + i3) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        } else if (this.f17154b) {
            int i4 = this.f17155c;
            int i5 = i4 + 1;
            this.f17155c = i5;
            if (i4 == 0) {
                this.f17156d = j;
                this.f17157e = i;
                this.f17158f = 0;
            }
            this.f17158f += i2;
            this.f17159g = i3;
            if (i5 >= 16) {
                mo13911a(rVar, qVar);
            }
        }
    }

    /* renamed from: d */
    public final void mo13914d(rn4 rn4) throws IOException {
        if (!this.f17154b) {
            rn4.mo9988l(this.f17153a, 0, 10);
            rn4.mo9981W();
            byte[] bArr = this.f17153a;
            int i = qm4.f16478g;
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
                this.f17154b = true;
            }
        }
    }
}
