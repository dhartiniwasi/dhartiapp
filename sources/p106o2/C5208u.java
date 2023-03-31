package p106o2;

import java.util.Arrays;
import p161w3.C5917a;

/* renamed from: o2.u */
/* compiled from: NalUnitTargetBuffer */
final class C5208u {

    /* renamed from: a */
    private final int f27031a;

    /* renamed from: b */
    private boolean f27032b;

    /* renamed from: c */
    private boolean f27033c;

    /* renamed from: d */
    public byte[] f27034d;

    /* renamed from: e */
    public int f27035e;

    public C5208u(int i, int i2) {
        this.f27031a = i;
        byte[] bArr = new byte[(i2 + 3)];
        this.f27034d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public void mo19194a(byte[] bArr, int i, int i2) {
        if (this.f27032b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f27034d;
            int length = bArr2.length;
            int i4 = this.f27035e;
            if (length < i4 + i3) {
                this.f27034d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f27034d, this.f27035e, i3);
            this.f27035e += i3;
        }
    }

    /* renamed from: b */
    public boolean mo19195b(int i) {
        if (!this.f27032b) {
            return false;
        }
        this.f27035e -= i;
        this.f27032b = false;
        this.f27033c = true;
        return true;
    }

    /* renamed from: c */
    public boolean mo19196c() {
        return this.f27033c;
    }

    /* renamed from: d */
    public void mo19197d() {
        this.f27032b = false;
        this.f27033c = false;
    }

    /* renamed from: e */
    public void mo19198e(int i) {
        boolean z = true;
        C5917a.m34873f(!this.f27032b);
        if (i != this.f27031a) {
            z = false;
        }
        this.f27032b = z;
        if (z) {
            this.f27035e = 3;
            this.f27033c = false;
        }
    }
}
