package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.z0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3947z0 extends C3193c1 {

    /* renamed from: f */
    private final int f22975f;

    C3947z0(byte[] bArr, int i, int i2) {
        super(bArr);
        C3325g1.m25612s(0, i2, bArr.length);
        this.f22975f = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final int mo15871B() {
        return 0;
    }

    /* renamed from: b */
    public final byte mo15872b(int i) {
        int i2 = this.f22975f;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f21797e[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final byte mo15873c(int i) {
        return this.f21797e[i];
    }

    /* renamed from: f */
    public final int mo15875f() {
        return this.f22975f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo15876i(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f21797e, 0, bArr, 0, i3);
    }
}
