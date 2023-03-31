package p161w3;

/* renamed from: w3.b0 */
/* compiled from: ParsableNalUnitBitArray */
public final class C5920b0 {

    /* renamed from: a */
    private byte[] f29051a;

    /* renamed from: b */
    private int f29052b;

    /* renamed from: c */
    private int f29053c;

    /* renamed from: d */
    private int f29054d;

    public C5920b0(byte[] bArr, int i, int i2) {
        mo20580i(bArr, i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f29052b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m34921a() {
        /*
            r2 = this;
            int r0 = r2.f29053c
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f29052b
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f29054d
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
        throw new UnsupportedOperationException("Method not decompiled: p161w3.C5920b0.m34921a():void");
    }

    /* renamed from: f */
    private int m34922f() {
        int i = 0;
        int i2 = 0;
        while (!mo20576d()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo20577e(i2);
        }
        return i3 + i;
    }

    /* renamed from: j */
    private boolean m34923j(int i) {
        if (2 <= i && i < this.f29052b) {
            byte[] bArr = this.f29051a;
            return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i - 1] == 0;
        }
    }

    /* renamed from: b */
    public boolean mo20574b(int i) {
        int i2 = this.f29053c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f29054d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f29052b) {
                int i6 = this.f29052b;
            } else if (m34923j(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i62 = this.f29052b;
        if (i4 < i62) {
            return true;
        }
        if (i4 == i62 && i5 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo20575c() {
        int i = this.f29053c;
        int i2 = this.f29054d;
        int i3 = 0;
        while (this.f29053c < this.f29052b && !mo20576d()) {
            i3++;
        }
        boolean z = this.f29053c == this.f29052b;
        this.f29053c = i;
        this.f29054d = i2;
        if (z || !mo20574b((i3 * 2) + 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public boolean mo20576d() {
        boolean z = (this.f29051a[this.f29053c] & (128 >> this.f29054d)) != 0;
        mo20581k();
        return z;
    }

    /* renamed from: e */
    public int mo20577e(int i) {
        int i2;
        int i3;
        this.f29054d += i;
        int i4 = 0;
        while (true) {
            i2 = this.f29054d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f29054d = i5;
            byte[] bArr = this.f29051a;
            int i6 = this.f29053c;
            i4 |= (bArr[i6] & 255) << i5;
            if (!m34923j(i6 + 1)) {
                i3 = 1;
            }
            this.f29053c = i6 + i3;
        }
        byte[] bArr2 = this.f29051a;
        int i7 = this.f29053c;
        int i8 = (-1 >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f29054d = 0;
            if (!m34923j(i7 + 1)) {
                i3 = 1;
            }
            this.f29053c = i7 + i3;
        }
        m34921a();
        return i8;
    }

    /* renamed from: g */
    public int mo20578g() {
        int f = m34922f();
        return (f % 2 == 0 ? -1 : 1) * ((f + 1) / 2);
    }

    /* renamed from: h */
    public int mo20579h() {
        return m34922f();
    }

    /* renamed from: i */
    public void mo20580i(byte[] bArr, int i, int i2) {
        this.f29051a = bArr;
        this.f29053c = i;
        this.f29052b = i2;
        this.f29054d = 0;
        m34921a();
    }

    /* renamed from: k */
    public void mo20581k() {
        int i = 1;
        int i2 = this.f29054d + 1;
        this.f29054d = i2;
        if (i2 == 8) {
            this.f29054d = 0;
            int i3 = this.f29053c;
            if (m34923j(i3 + 1)) {
                i = 2;
            }
            this.f29053c = i3 + i;
        }
        m34921a();
    }

    /* renamed from: l */
    public void mo20582l(int i) {
        int i2 = this.f29053c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f29053c = i4;
        int i5 = this.f29054d + (i - (i3 * 8));
        this.f29054d = i5;
        if (i5 > 7) {
            this.f29053c = i4 + 1;
            this.f29054d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f29053c) {
                m34921a();
                return;
            } else if (m34923j(i2)) {
                this.f29053c++;
                i2 += 2;
            }
        }
    }
}
