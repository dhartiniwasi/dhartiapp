package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.z7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7281z7 extends C6926d8 {

    /* renamed from: f */
    private final int f32230f;

    C7281z7(byte[] bArr, int i, int i2) {
        super(bArr);
        C6977g8.m40060q(0, i2, bArr.length);
        this.f32230f = i2;
    }

    /* renamed from: b */
    public final byte mo23323b(int i) {
        int i2 = this.f32230f;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f31644e[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final byte mo23324c(int i) {
        return this.f31644e[i];
    }

    /* renamed from: f */
    public final int mo23326f() {
        return this.f32230f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final int mo23332v() {
        return 0;
    }
}
