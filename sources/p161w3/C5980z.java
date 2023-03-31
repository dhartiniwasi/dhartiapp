package p161w3;

import java.nio.charset.Charset;

/* renamed from: w3.z */
/* compiled from: ParsableBitArray */
public final class C5980z {

    /* renamed from: a */
    public byte[] f29188a;

    /* renamed from: b */
    private int f29189b;

    /* renamed from: c */
    private int f29190c;

    /* renamed from: d */
    private int f29191d;

    public C5980z() {
        this.f29188a = C5953m0.f29115f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f29191d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m35288a() {
        /*
            r2 = this;
            int r0 = r2.f29189b
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f29191d
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f29190c
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            p161w3.C5917a.m34873f(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p161w3.C5980z.m35288a():void");
    }

    /* renamed from: b */
    public int mo20670b() {
        return ((this.f29191d - this.f29189b) * 8) - this.f29190c;
    }

    /* renamed from: c */
    public void mo20671c() {
        if (this.f29190c != 0) {
            this.f29190c = 0;
            this.f29189b++;
            m35288a();
        }
    }

    /* renamed from: d */
    public int mo20672d() {
        C5917a.m34873f(this.f29190c == 0);
        return this.f29189b;
    }

    /* renamed from: e */
    public int mo20673e() {
        return (this.f29189b * 8) + this.f29190c;
    }

    /* renamed from: f */
    public void mo20674f(int i, int i2) {
        if (i2 < 32) {
            i &= (1 << i2) - 1;
        }
        int min = Math.min(8 - this.f29190c, i2);
        int i3 = this.f29190c;
        int i4 = (8 - i3) - min;
        byte[] bArr = this.f29188a;
        int i5 = this.f29189b;
        bArr[i5] = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        int i6 = i2 - min;
        bArr[i5] = (byte) (((i >>> i6) << i4) | bArr[i5]);
        int i7 = i5 + 1;
        while (i6 > 8) {
            this.f29188a[i7] = (byte) (i >>> (i6 - 8));
            i6 -= 8;
            i7++;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.f29188a;
        bArr2[i7] = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = (byte) (((i & ((1 << i6) - 1)) << i8) | bArr2[i7]);
        mo20686r(i2);
        m35288a();
    }

    /* renamed from: g */
    public boolean mo20675g() {
        boolean z = (this.f29188a[this.f29189b] & (128 >> this.f29190c)) != 0;
        mo20685q();
        return z;
    }

    /* renamed from: h */
    public int mo20676h(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f29190c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f29190c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f29190c = i4;
            byte[] bArr = this.f29188a;
            int i5 = this.f29189b;
            this.f29189b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f29188a;
        int i6 = this.f29189b;
        int i7 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f29190c = 0;
            this.f29189b = i6 + 1;
        }
        m35288a();
        return i7;
    }

    /* renamed from: i */
    public void mo20677i(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.f29188a;
            int i4 = this.f29189b;
            int i5 = i4 + 1;
            this.f29189b = i5;
            byte b = bArr2[i4];
            int i6 = this.f29190c;
            bArr[i] = (byte) (b << i6);
            bArr[i] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | bArr[i]);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 != 0) {
            bArr[i3] = (byte) (bArr[i3] & (255 >> i7));
            int i8 = this.f29190c;
            if (i8 + i7 > 8) {
                byte b2 = bArr[i3];
                byte[] bArr3 = this.f29188a;
                int i9 = this.f29189b;
                this.f29189b = i9 + 1;
                bArr[i3] = (byte) (b2 | ((bArr3[i9] & 255) << i8));
                this.f29190c = i8 - 8;
            }
            int i10 = this.f29190c + i7;
            this.f29190c = i10;
            byte[] bArr4 = this.f29188a;
            int i11 = this.f29189b;
            bArr[i3] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i3]);
            if (i10 == 8) {
                this.f29190c = 0;
                this.f29189b = i11 + 1;
            }
            m35288a();
        }
    }

    /* renamed from: j */
    public long mo20678j(int i) {
        if (i <= 32) {
            return C5953m0.m35113W0(mo20676h(i));
        }
        return C5953m0.m35111V0(mo20676h(i - 32), mo20676h(32));
    }

    /* renamed from: k */
    public void mo20679k(byte[] bArr, int i, int i2) {
        C5917a.m34873f(this.f29190c == 0);
        System.arraycopy(this.f29188a, this.f29189b, bArr, i, i2);
        this.f29189b += i2;
        m35288a();
    }

    /* renamed from: l */
    public String mo20680l(int i, Charset charset) {
        byte[] bArr = new byte[i];
        mo20679k(bArr, 0, i);
        return new String(bArr, charset);
    }

    /* renamed from: m */
    public void mo20681m(C5918a0 a0Var) {
        mo20683o(a0Var.mo20551d(), a0Var.mo20553f());
        mo20684p(a0Var.mo20552e() * 8);
    }

    /* renamed from: n */
    public void mo20682n(byte[] bArr) {
        mo20683o(bArr, bArr.length);
    }

    /* renamed from: o */
    public void mo20683o(byte[] bArr, int i) {
        this.f29188a = bArr;
        this.f29189b = 0;
        this.f29190c = 0;
        this.f29191d = i;
    }

    /* renamed from: p */
    public void mo20684p(int i) {
        int i2 = i / 8;
        this.f29189b = i2;
        this.f29190c = i - (i2 * 8);
        m35288a();
    }

    /* renamed from: q */
    public void mo20685q() {
        int i = this.f29190c + 1;
        this.f29190c = i;
        if (i == 8) {
            this.f29190c = 0;
            this.f29189b++;
        }
        m35288a();
    }

    /* renamed from: r */
    public void mo20686r(int i) {
        int i2 = i / 8;
        int i3 = this.f29189b + i2;
        this.f29189b = i3;
        int i4 = this.f29190c + (i - (i2 * 8));
        this.f29190c = i4;
        if (i4 > 7) {
            this.f29189b = i3 + 1;
            this.f29190c = i4 - 8;
        }
        m35288a();
    }

    /* renamed from: s */
    public void mo20687s(int i) {
        C5917a.m34873f(this.f29190c == 0);
        this.f29189b += i;
        m35288a();
    }

    public C5980z(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public C5980z(byte[] bArr, int i) {
        this.f29188a = bArr;
        this.f29191d = i;
    }
}
