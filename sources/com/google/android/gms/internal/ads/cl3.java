package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class cl3 {

    /* renamed from: a */
    public byte[] f7812a;

    /* renamed from: b */
    public byte[] f7813b;

    /* renamed from: c */
    public int f7814c;

    /* renamed from: d */
    public int[] f7815d;

    /* renamed from: e */
    public int[] f7816e;

    /* renamed from: f */
    public int f7817f;

    /* renamed from: g */
    public int f7818g;

    /* renamed from: h */
    public int f7819h;

    /* renamed from: i */
    private final MediaCodec.CryptoInfo f7820i;

    /* renamed from: j */
    private final bk3 f7821j;

    public cl3() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f7820i = cryptoInfo;
        this.f7821j = gb2.f9812a >= 24 ? new bk3(cryptoInfo, (aj3) null) : null;
    }

    /* renamed from: a */
    public final MediaCodec.CryptoInfo mo9208a() {
        return this.f7820i;
    }

    /* renamed from: b */
    public final void mo9209b(int i) {
        if (i != 0) {
            if (this.f7815d == null) {
                int[] iArr = new int[1];
                this.f7815d = iArr;
                this.f7820i.numBytesOfClearData = iArr;
            }
            int[] iArr2 = this.f7815d;
            iArr2[0] = iArr2[0] + i;
        }
    }

    /* renamed from: c */
    public final void mo9210c(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f7817f = i;
        this.f7815d = iArr;
        this.f7816e = iArr2;
        this.f7813b = bArr;
        this.f7812a = bArr2;
        this.f7814c = i2;
        this.f7818g = i3;
        this.f7819h = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.f7820i;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (gb2.f9812a >= 24) {
            bk3 bk3 = this.f7821j;
            Objects.requireNonNull(bk3);
            bk3.m10449a(bk3, i3, i4);
        }
    }
}
