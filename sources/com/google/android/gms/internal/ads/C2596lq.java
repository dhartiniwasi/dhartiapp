package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lq */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2596lq {

    /* renamed from: a */
    public byte[] f12877a;

    /* renamed from: b */
    private int f12878b;

    /* renamed from: c */
    private int f12879c;

    /* renamed from: d */
    private int f12880d;

    public C2596lq(byte[] bArr, int i) {
        this.f12877a = bArr;
        this.f12880d = i;
    }

    /* renamed from: a */
    public final int mo12058a(int i) {
        int i2;
        int i3;
        byte b;
        byte b2;
        int i4 = i >> 3;
        boolean z = false;
        byte b3 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = this.f12879c;
            if (i6 != 0) {
                byte[] bArr = this.f12877a;
                int i7 = this.f12878b;
                b2 = ((bArr[i7 + 1] & 255) >>> (8 - i6)) | ((bArr[i7] & 255) << i6);
            } else {
                b2 = this.f12877a[this.f12878b];
            }
            i -= 8;
            b3 |= (255 & b2) << i;
            this.f12878b++;
        }
        if (i > 0) {
            int i8 = this.f12879c + i;
            byte b4 = (byte) (255 >> (8 - i));
            if (i8 > 8) {
                byte[] bArr2 = this.f12877a;
                int i9 = this.f12878b;
                int i10 = i9 + 1;
                b = (b4 & (((255 & bArr2[i10]) >> (16 - i8)) | ((bArr2[i9] & 255) << (i8 - 8)))) | b3;
                this.f12878b = i10;
            } else {
                byte[] bArr3 = this.f12877a;
                int i11 = this.f12878b;
                b = (b4 & ((255 & bArr3[i11]) >> (8 - i8))) | b3;
                if (i8 == 8) {
                    this.f12878b = i11 + 1;
                }
            }
            b3 = b;
            this.f12879c = i8 % 8;
        }
        int i12 = this.f12878b;
        if (i12 >= 0 && (i2 = this.f12879c) >= 0 && (i12 < (i3 = this.f12880d) || (i12 == i3 && i2 == 0))) {
            z = true;
        }
        C2335eq.m12245e(z);
        return b3;
    }
}
