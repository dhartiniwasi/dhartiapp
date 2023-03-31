package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class cw3 extends fw3 {

    /* renamed from: f */
    private final int f7969f;

    /* renamed from: g */
    private final int f7970g;

    cw3(byte[] bArr, int i, int i2) {
        super(bArr);
        jw3.m15083C(i, i + i2, bArr.length);
        this.f7969f = i;
        this.f7970g = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public final int mo9358R() {
        return this.f7969f;
    }

    /* renamed from: k */
    public final byte mo9359k(int i) {
        jw3.m15091c(i, this.f7970g);
        return this.f9568e[this.f7969f + i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final byte mo9360l(int i) {
        return this.f9568e[this.f7969f + i];
    }

    /* renamed from: q */
    public final int mo9361q() {
        return this.f7970g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo9362r(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f9568e, this.f7969f + i, bArr, i2, i3);
    }
}
