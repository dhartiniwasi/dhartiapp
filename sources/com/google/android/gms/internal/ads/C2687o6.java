package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.o6 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2687o6 {

    /* renamed from: f */
    private static final byte[] f14900f = {0, 0, 1};

    /* renamed from: a */
    private boolean f14901a;

    /* renamed from: b */
    private int f14902b;

    /* renamed from: c */
    public int f14903c;

    /* renamed from: d */
    public int f14904d;

    /* renamed from: e */
    public byte[] f14905e = new byte[128];

    public C2687o6(int i) {
    }

    /* renamed from: a */
    public final void mo12835a(byte[] bArr, int i, int i2) {
        if (this.f14901a) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f14905e;
            int length = bArr2.length;
            int i4 = this.f14903c + i3;
            if (length < i4) {
                this.f14905e = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f14905e, this.f14903c, i3);
            this.f14903c += i3;
        }
    }

    /* renamed from: b */
    public final void mo12836b() {
        this.f14901a = false;
        this.f14903c = 0;
        this.f14902b = 0;
    }

    /* renamed from: c */
    public final boolean mo12837c(int i, int i2) {
        int i3 = this.f14902b;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i == 179 || i == 181) {
                            this.f14903c -= i2;
                            this.f14901a = false;
                            return true;
                        }
                    } else if ((i & 240) != 32) {
                        ot1.m18060e("H263Reader", "Unexpected start code value");
                        mo12836b();
                    } else {
                        this.f14904d = this.f14903c;
                        this.f14902b = 4;
                    }
                } else if (i > 31) {
                    ot1.m18060e("H263Reader", "Unexpected start code value");
                    mo12836b();
                } else {
                    this.f14902b = 3;
                }
            } else if (i != 181) {
                ot1.m18060e("H263Reader", "Unexpected start code value");
                mo12836b();
            } else {
                this.f14902b = 2;
            }
        } else if (i == 176) {
            this.f14902b = 1;
            this.f14901a = true;
        }
        mo12835a(f14900f, 0, 3);
        return false;
    }
}
