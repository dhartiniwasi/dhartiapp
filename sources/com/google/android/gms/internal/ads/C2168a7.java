package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.a7 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2168a7 {

    /* renamed from: a */
    private final int f6438a;

    /* renamed from: b */
    private boolean f6439b;

    /* renamed from: c */
    private boolean f6440c;

    /* renamed from: d */
    public byte[] f6441d;

    /* renamed from: e */
    public int f6442e;

    public C2168a7(int i, int i2) {
        this.f6438a = i;
        byte[] bArr = new byte[131];
        this.f6441d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public final void mo8225a(byte[] bArr, int i, int i2) {
        if (this.f6439b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f6441d;
            int length = bArr2.length;
            int i4 = this.f6442e + i3;
            if (length < i4) {
                this.f6441d = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f6441d, this.f6442e, i3);
            this.f6442e += i3;
        }
    }

    /* renamed from: b */
    public final void mo8226b() {
        this.f6439b = false;
        this.f6440c = false;
    }

    /* renamed from: c */
    public final void mo8227c(int i) {
        boolean z = true;
        v91.m22052f(!this.f6439b);
        if (i != this.f6438a) {
            z = false;
        }
        this.f6439b = z;
        if (z) {
            this.f6442e = 3;
            this.f6440c = false;
        }
    }

    /* renamed from: d */
    public final boolean mo8228d(int i) {
        if (!this.f6439b) {
            return false;
        }
        this.f6442e -= i;
        this.f6439b = false;
        this.f6440c = true;
        return true;
    }

    /* renamed from: e */
    public final boolean mo8229e() {
        return this.f6440c;
    }
}
