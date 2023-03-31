package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* renamed from: com.google.android.gms.internal.ads.lk */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2590lk {

    /* renamed from: a */
    public byte[] f12823a;

    /* renamed from: b */
    public byte[] f12824b;

    /* renamed from: c */
    public int f12825c;

    /* renamed from: d */
    public int[] f12826d;

    /* renamed from: e */
    public int[] f12827e;

    /* renamed from: f */
    public int f12828f;

    /* renamed from: g */
    private final MediaCodec.CryptoInfo f12829g;

    /* renamed from: h */
    private final C2553kk f12830h;

    public C2590lk() {
        int i = C2893tq.f18208a;
        C2553kk kkVar = null;
        MediaCodec.CryptoInfo cryptoInfo = i >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.f12829g = cryptoInfo;
        this.f12830h = i >= 24 ? new C2553kk(cryptoInfo, (C2516jk) null) : kkVar;
    }

    /* renamed from: a */
    public final MediaCodec.CryptoInfo mo12038a() {
        return this.f12829g;
    }

    /* renamed from: b */
    public final void mo12039b(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2) {
        this.f12828f = i;
        this.f12826d = iArr;
        this.f12827e = iArr2;
        this.f12824b = bArr;
        this.f12823a = bArr2;
        this.f12825c = 1;
        int i3 = C2893tq.f18208a;
        if (i3 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.f12829g;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = 1;
            if (i3 >= 24) {
                C2553kk.m15446a(this.f12830h, 0, 0);
            }
        }
    }
}
