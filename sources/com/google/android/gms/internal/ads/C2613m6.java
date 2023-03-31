package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.m6 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2613m6 {

    /* renamed from: e */
    private static final byte[] f13226e = {0, 0, 1};

    /* renamed from: a */
    private boolean f13227a;

    /* renamed from: b */
    public int f13228b;

    /* renamed from: c */
    public int f13229c;

    /* renamed from: d */
    public byte[] f13230d = new byte[128];

    public C2613m6(int i) {
    }

    /* renamed from: a */
    public final void mo12283a(byte[] bArr, int i, int i2) {
        if (this.f13227a) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f13230d;
            int length = bArr2.length;
            int i4 = this.f13228b + i3;
            if (length < i4) {
                this.f13230d = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f13230d, this.f13228b, i3);
            this.f13228b += i3;
        }
    }

    /* renamed from: b */
    public final void mo12284b() {
        this.f13227a = false;
        this.f13228b = 0;
        this.f13229c = 0;
    }

    /* renamed from: c */
    public final boolean mo12285c(int i, int i2) {
        if (this.f13227a) {
            int i3 = this.f13228b - i2;
            this.f13228b = i3;
            if (this.f13229c == 0 && i == 181) {
                this.f13229c = i3;
            } else {
                this.f13227a = false;
                return true;
            }
        } else if (i == 179) {
            this.f13227a = true;
        }
        mo12283a(f13226e, 0, 3);
        return false;
    }
}
