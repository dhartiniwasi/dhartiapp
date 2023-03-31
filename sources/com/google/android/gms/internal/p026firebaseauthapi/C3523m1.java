package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.m1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
abstract class C3523m1 extends C3688r1 {

    /* renamed from: d */
    final byte[] f22344d;

    /* renamed from: e */
    final int f22345e;

    /* renamed from: f */
    int f22346f;

    /* renamed from: g */
    int f22347g;

    C3523m1(int i) {
        super((C3655q1) null);
        if (i >= 0) {
            byte[] bArr = new byte[Math.max(i, 20)];
            this.f22344d = bArr;
            this.f22345e = bArr.length;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final void mo16353I(byte b) {
        byte[] bArr = this.f22344d;
        int i = this.f22346f;
        this.f22346f = i + 1;
        bArr[i] = b;
        this.f22347g++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final void mo16354J(int i) {
        byte[] bArr = this.f22344d;
        int i2 = this.f22346f;
        int i3 = i2 + 1;
        this.f22346f = i3;
        bArr[i2] = (byte) (i & 255);
        int i4 = i3 + 1;
        this.f22346f = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i4 + 1;
        this.f22346f = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.f22346f = i5 + 1;
        bArr[i5] = (byte) ((i >> 24) & 255);
        this.f22347g += 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final void mo16355K(long j) {
        byte[] bArr = this.f22344d;
        int i = this.f22346f;
        int i2 = i + 1;
        this.f22346f = i2;
        bArr[i] = (byte) ((int) (j & 255));
        int i3 = i2 + 1;
        this.f22346f = i3;
        bArr[i2] = (byte) ((int) ((j >> 8) & 255));
        int i4 = i3 + 1;
        this.f22346f = i4;
        bArr[i3] = (byte) ((int) ((j >> 16) & 255));
        int i5 = i4 + 1;
        this.f22346f = i5;
        bArr[i4] = (byte) ((int) (255 & (j >> 24)));
        int i6 = i5 + 1;
        this.f22346f = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i6 + 1;
        this.f22346f = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i7 + 1;
        this.f22346f = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.f22346f = i8 + 1;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        this.f22347g += 8;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final void mo16356L(int i) {
        if (C3688r1.f22600c) {
            long j = (long) this.f22346f;
            while ((i & -128) != 0) {
                byte[] bArr = this.f22344d;
                int i2 = this.f22346f;
                this.f22346f = i2 + 1;
                C3197c5.m25311s(bArr, (long) i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            byte[] bArr2 = this.f22344d;
            int i3 = this.f22346f;
            this.f22346f = i3 + 1;
            C3197c5.m25311s(bArr2, (long) i3, (byte) i);
            this.f22347g += (int) (((long) this.f22346f) - j);
            return;
        }
        while ((i & -128) != 0) {
            byte[] bArr3 = this.f22344d;
            int i4 = this.f22346f;
            this.f22346f = i4 + 1;
            bArr3[i4] = (byte) ((i & 127) | 128);
            this.f22347g++;
            i >>>= 7;
        }
        byte[] bArr4 = this.f22344d;
        int i5 = this.f22346f;
        this.f22346f = i5 + 1;
        bArr4[i5] = (byte) i;
        this.f22347g++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final void mo16357M(long j) {
        if (C3688r1.f22600c) {
            long j2 = (long) this.f22346f;
            while ((j & -128) != 0) {
                byte[] bArr = this.f22344d;
                int i = this.f22346f;
                this.f22346f = i + 1;
                C3197c5.m25311s(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.f22344d;
            int i2 = this.f22346f;
            this.f22346f = i2 + 1;
            C3197c5.m25311s(bArr2, (long) i2, (byte) ((int) j));
            this.f22347g += (int) (((long) this.f22346f) - j2);
            return;
        }
        while ((j & -128) != 0) {
            byte[] bArr3 = this.f22344d;
            int i3 = this.f22346f;
            this.f22346f = i3 + 1;
            bArr3[i3] = (byte) ((((int) j) & 127) | 128);
            this.f22347g++;
            j >>>= 7;
        }
        byte[] bArr4 = this.f22344d;
        int i4 = this.f22346f;
        this.f22346f = i4 + 1;
        bArr4[i4] = (byte) ((int) j);
        this.f22347g++;
    }

    /* renamed from: q */
    public final int mo16358q() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
