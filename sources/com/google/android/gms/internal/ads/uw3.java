package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class uw3 extends zw3 {

    /* renamed from: d */
    final byte[] f18765d;

    /* renamed from: e */
    final int f18766e;

    /* renamed from: f */
    int f18767f;

    /* renamed from: g */
    int f18768g;

    uw3(int i) {
        super((yw3) null);
        if (i >= 0) {
            byte[] bArr = new byte[Math.max(i, 20)];
            this.f18765d = bArr;
            this.f18766e = bArr.length;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final void mo14632I(byte b) {
        byte[] bArr = this.f18765d;
        int i = this.f18767f;
        this.f18767f = i + 1;
        bArr[i] = b;
        this.f18768g++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final void mo14633J(int i) {
        byte[] bArr = this.f18765d;
        int i2 = this.f18767f;
        int i3 = i2 + 1;
        this.f18767f = i3;
        bArr[i2] = (byte) (i & 255);
        int i4 = i3 + 1;
        this.f18767f = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i4 + 1;
        this.f18767f = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.f18767f = i5 + 1;
        bArr[i5] = (byte) ((i >> 24) & 255);
        this.f18768g += 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final void mo14634K(long j) {
        byte[] bArr = this.f18765d;
        int i = this.f18767f;
        int i2 = i + 1;
        this.f18767f = i2;
        bArr[i] = (byte) ((int) (j & 255));
        int i3 = i2 + 1;
        this.f18767f = i3;
        bArr[i2] = (byte) ((int) ((j >> 8) & 255));
        int i4 = i3 + 1;
        this.f18767f = i4;
        bArr[i3] = (byte) ((int) ((j >> 16) & 255));
        int i5 = i4 + 1;
        this.f18767f = i5;
        bArr[i4] = (byte) ((int) (255 & (j >> 24)));
        int i6 = i5 + 1;
        this.f18767f = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i6 + 1;
        this.f18767f = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i7 + 1;
        this.f18767f = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.f18767f = i8 + 1;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        this.f18768g += 8;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final void mo14635L(int i) {
        if (zw3.f21504c) {
            long j = (long) this.f18767f;
            while ((i & -128) != 0) {
                byte[] bArr = this.f18765d;
                int i2 = this.f18767f;
                this.f18767f = i2 + 1;
                y04.m23675y(bArr, (long) i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            byte[] bArr2 = this.f18765d;
            int i3 = this.f18767f;
            this.f18767f = i3 + 1;
            y04.m23675y(bArr2, (long) i3, (byte) i);
            this.f18768g += (int) (((long) this.f18767f) - j);
            return;
        }
        while ((i & -128) != 0) {
            byte[] bArr3 = this.f18765d;
            int i4 = this.f18767f;
            this.f18767f = i4 + 1;
            bArr3[i4] = (byte) ((i & 127) | 128);
            this.f18768g++;
            i >>>= 7;
        }
        byte[] bArr4 = this.f18765d;
        int i5 = this.f18767f;
        this.f18767f = i5 + 1;
        bArr4[i5] = (byte) i;
        this.f18768g++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final void mo14636M(long j) {
        if (zw3.f21504c) {
            long j2 = (long) this.f18767f;
            while ((j & -128) != 0) {
                byte[] bArr = this.f18765d;
                int i = this.f18767f;
                this.f18767f = i + 1;
                y04.m23675y(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.f18765d;
            int i2 = this.f18767f;
            this.f18767f = i2 + 1;
            y04.m23675y(bArr2, (long) i2, (byte) ((int) j));
            this.f18768g += (int) (((long) this.f18767f) - j2);
            return;
        }
        while ((j & -128) != 0) {
            byte[] bArr3 = this.f18765d;
            int i3 = this.f18767f;
            this.f18767f = i3 + 1;
            bArr3[i3] = (byte) ((((int) j) & 127) | 128);
            this.f18768g++;
            j >>>= 7;
        }
        byte[] bArr4 = this.f18765d;
        int i4 = this.f18767f;
        this.f18767f = i4 + 1;
        bArr4[i4] = (byte) ((int) j);
        this.f18768g++;
    }

    /* renamed from: q */
    public final int mo14637q() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
