package p161w3;

import java.nio.charset.Charset;
import java.util.Arrays;
import p182a7.C6415d;

/* renamed from: w3.a0 */
/* compiled from: ParsableByteArray */
public final class C5918a0 {

    /* renamed from: a */
    private byte[] f29047a;

    /* renamed from: b */
    private int f29048b;

    /* renamed from: c */
    private int f29049c;

    public C5918a0() {
        this.f29047a = C5953m0.f29115f;
    }

    /* renamed from: A */
    public String mo20532A(int i, Charset charset) {
        String str = new String(this.f29047a, this.f29048b, i, charset);
        this.f29048b += i;
        return str;
    }

    /* renamed from: B */
    public int mo20533B() {
        return (mo20534C() << 21) | (mo20534C() << 14) | (mo20534C() << 7) | mo20534C();
    }

    /* renamed from: C */
    public int mo20534C() {
        byte[] bArr = this.f29047a;
        int i = this.f29048b;
        this.f29048b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: D */
    public int mo20535D() {
        byte[] bArr = this.f29047a;
        int i = this.f29048b;
        int i2 = i + 1;
        this.f29048b = i2;
        int i3 = i2 + 1;
        this.f29048b = i3;
        byte b = (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
        this.f29048b = i3 + 2;
        return b;
    }

    /* renamed from: E */
    public long mo20536E() {
        byte[] bArr = this.f29047a;
        int i = this.f29048b;
        int i2 = i + 1;
        this.f29048b = i2;
        int i3 = i2 + 1;
        this.f29048b = i3;
        int i4 = i3 + 1;
        this.f29048b = i4;
        this.f29048b = i4 + 1;
        return ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i2]) & 255) << 16) | ((((long) bArr[i3]) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    /* renamed from: F */
    public int mo20537F() {
        byte[] bArr = this.f29047a;
        int i = this.f29048b;
        int i2 = i + 1;
        this.f29048b = i2;
        int i3 = i2 + 1;
        this.f29048b = i3;
        byte b = ((bArr[i] & 255) << 16) | ((bArr[i2] & 255) << 8);
        this.f29048b = i3 + 1;
        return (bArr[i3] & 255) | b;
    }

    /* renamed from: G */
    public int mo20538G() {
        int m = mo20560m();
        if (m >= 0) {
            return m;
        }
        throw new IllegalStateException("Top bit not zero: " + m);
    }

    /* renamed from: H */
    public long mo20539H() {
        long v = mo20569v();
        if (v >= 0) {
            return v;
        }
        throw new IllegalStateException("Top bit not zero: " + v);
    }

    /* renamed from: I */
    public int mo20540I() {
        byte[] bArr = this.f29047a;
        int i = this.f29048b;
        int i2 = i + 1;
        this.f29048b = i2;
        this.f29048b = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    /* renamed from: J */
    public long mo20541J() {
        int i;
        int i2;
        long j = (long) this.f29047a[this.f29048b];
        int i3 = 7;
        while (true) {
            i = 1;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 != 0) {
            while (i < i2) {
                byte b = this.f29047a[this.f29048b + i];
                if ((b & 192) == 128) {
                    j = (j << 6) | ((long) (b & 63));
                    i++;
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
                }
            }
            this.f29048b += i2;
            return j;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
    }

    /* renamed from: K */
    public void mo20542K(int i) {
        mo20544M(mo20549b() < i ? new byte[i] : this.f29047a, i);
    }

    /* renamed from: L */
    public void mo20543L(byte[] bArr) {
        mo20544M(bArr, bArr.length);
    }

    /* renamed from: M */
    public void mo20544M(byte[] bArr, int i) {
        this.f29047a = bArr;
        this.f29049c = i;
        this.f29048b = 0;
    }

    /* renamed from: N */
    public void mo20545N(int i) {
        C5917a.m34868a(i >= 0 && i <= this.f29047a.length);
        this.f29049c = i;
    }

    /* renamed from: O */
    public void mo20546O(int i) {
        C5917a.m34868a(i >= 0 && i <= this.f29049c);
        this.f29048b = i;
    }

    /* renamed from: P */
    public void mo20547P(int i) {
        mo20546O(this.f29048b + i);
    }

    /* renamed from: a */
    public int mo20548a() {
        return this.f29049c - this.f29048b;
    }

    /* renamed from: b */
    public int mo20549b() {
        return this.f29047a.length;
    }

    /* renamed from: c */
    public void mo20550c(int i) {
        if (i > mo20549b()) {
            this.f29047a = Arrays.copyOf(this.f29047a, i);
        }
    }

    /* renamed from: d */
    public byte[] mo20551d() {
        return this.f29047a;
    }

    /* renamed from: e */
    public int mo20552e() {
        return this.f29048b;
    }

    /* renamed from: f */
    public int mo20553f() {
        return this.f29049c;
    }

    /* renamed from: g */
    public char mo20554g() {
        byte[] bArr = this.f29047a;
        int i = this.f29048b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: h */
    public int mo20555h() {
        return this.f29047a[this.f29048b] & 255;
    }

    /* renamed from: i */
    public void mo20556i(C5980z zVar, int i) {
        mo20557j(zVar.f29188a, 0, i);
        zVar.mo20684p(0);
    }

    /* renamed from: j */
    public void mo20557j(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f29047a, this.f29048b, bArr, i, i2);
        this.f29048b += i2;
    }

    /* renamed from: k */
    public String mo20558k(char c) {
        if (mo20548a() == 0) {
            return null;
        }
        int i = this.f29048b;
        while (i < this.f29049c && this.f29047a[i] != c) {
            i++;
        }
        byte[] bArr = this.f29047a;
        int i2 = this.f29048b;
        String E = C5953m0.m35076E(bArr, i2, i - i2);
        this.f29048b = i;
        if (i < this.f29049c) {
            this.f29048b = i + 1;
        }
        return E;
    }

    /* renamed from: l */
    public double mo20559l() {
        return Double.longBitsToDouble(mo20569v());
    }

    /* renamed from: m */
    public int mo20560m() {
        byte[] bArr = this.f29047a;
        int i = this.f29048b;
        int i2 = i + 1;
        this.f29048b = i2;
        int i3 = i2 + 1;
        this.f29048b = i3;
        byte b = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        int i4 = i3 + 1;
        this.f29048b = i4;
        byte b2 = b | ((bArr[i3] & 255) << 8);
        this.f29048b = i4 + 1;
        return (bArr[i4] & 255) | b2;
    }

    /* renamed from: n */
    public int mo20561n() {
        byte[] bArr = this.f29047a;
        int i = this.f29048b;
        int i2 = i + 1;
        this.f29048b = i2;
        int i3 = i2 + 1;
        this.f29048b = i3;
        byte b = (((bArr[i] & 255) << 24) >> 8) | ((bArr[i2] & 255) << 8);
        this.f29048b = i3 + 1;
        return (bArr[i3] & 255) | b;
    }

    /* renamed from: o */
    public String mo20562o() {
        if (mo20548a() == 0) {
            return null;
        }
        int i = this.f29048b;
        while (i < this.f29049c && !C5953m0.m35161u0(this.f29047a[i])) {
            i++;
        }
        int i2 = this.f29048b;
        if (i - i2 >= 3) {
            byte[] bArr = this.f29047a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.f29048b = i2 + 3;
            }
        }
        byte[] bArr2 = this.f29047a;
        int i3 = this.f29048b;
        String E = C5953m0.m35076E(bArr2, i3, i - i3);
        this.f29048b = i;
        int i4 = this.f29049c;
        if (i == i4) {
            return E;
        }
        byte[] bArr3 = this.f29047a;
        if (bArr3[i] == 13) {
            int i5 = i + 1;
            this.f29048b = i5;
            if (i5 == i4) {
                return E;
            }
        }
        int i6 = this.f29048b;
        if (bArr3[i6] == 10) {
            this.f29048b = i6 + 1;
        }
        return E;
    }

    /* renamed from: p */
    public int mo20563p() {
        byte[] bArr = this.f29047a;
        int i = this.f29048b;
        int i2 = i + 1;
        this.f29048b = i2;
        int i3 = i2 + 1;
        this.f29048b = i3;
        byte b = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i4 = i3 + 1;
        this.f29048b = i4;
        byte b2 = b | ((bArr[i3] & 255) << 16);
        this.f29048b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | b2;
    }

    /* renamed from: q */
    public long mo20564q() {
        byte[] bArr = this.f29047a;
        int i = this.f29048b;
        int i2 = i + 1;
        this.f29048b = i2;
        int i3 = i2 + 1;
        this.f29048b = i3;
        int i4 = i3 + 1;
        this.f29048b = i4;
        int i5 = i4 + 1;
        this.f29048b = i5;
        int i6 = i5 + 1;
        this.f29048b = i6;
        int i7 = i6 + 1;
        this.f29048b = i7;
        int i8 = i7 + 1;
        this.f29048b = i8;
        this.f29048b = i8 + 1;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 40) | ((((long) bArr[i7]) & 255) << 48) | ((((long) bArr[i8]) & 255) << 56);
    }

    /* renamed from: r */
    public short mo20565r() {
        byte[] bArr = this.f29047a;
        int i = this.f29048b;
        int i2 = i + 1;
        this.f29048b = i2;
        this.f29048b = i2 + 1;
        return (short) (((bArr[i2] & 255) << 8) | (bArr[i] & 255));
    }

    /* renamed from: s */
    public long mo20566s() {
        byte[] bArr = this.f29047a;
        int i = this.f29048b;
        int i2 = i + 1;
        this.f29048b = i2;
        int i3 = i2 + 1;
        this.f29048b = i3;
        int i4 = i3 + 1;
        this.f29048b = i4;
        this.f29048b = i4 + 1;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    /* renamed from: t */
    public int mo20567t() {
        int p = mo20563p();
        if (p >= 0) {
            return p;
        }
        throw new IllegalStateException("Top bit not zero: " + p);
    }

    /* renamed from: u */
    public int mo20568u() {
        byte[] bArr = this.f29047a;
        int i = this.f29048b;
        int i2 = i + 1;
        this.f29048b = i2;
        this.f29048b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: v */
    public long mo20569v() {
        byte[] bArr = this.f29047a;
        int i = this.f29048b;
        int i2 = i + 1;
        this.f29048b = i2;
        int i3 = i2 + 1;
        this.f29048b = i3;
        int i4 = i3 + 1;
        this.f29048b = i4;
        int i5 = i4 + 1;
        this.f29048b = i5;
        int i6 = i5 + 1;
        this.f29048b = i6;
        int i7 = i6 + 1;
        this.f29048b = i7;
        int i8 = i7 + 1;
        this.f29048b = i8;
        this.f29048b = i8 + 1;
        return ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40) | ((((long) bArr[i4]) & 255) << 32) | ((((long) bArr[i5]) & 255) << 24) | ((((long) bArr[i6]) & 255) << 16) | ((((long) bArr[i7]) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    /* renamed from: w */
    public String mo20570w() {
        return mo20558k(0);
    }

    /* renamed from: x */
    public String mo20571x(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f29048b;
        int i3 = (i2 + i) - 1;
        String E = C5953m0.m35076E(this.f29047a, i2, (i3 >= this.f29049c || this.f29047a[i3] != 0) ? i : i - 1);
        this.f29048b += i;
        return E;
    }

    /* renamed from: y */
    public short mo20572y() {
        byte[] bArr = this.f29047a;
        int i = this.f29048b;
        int i2 = i + 1;
        this.f29048b = i2;
        this.f29048b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: z */
    public String mo20573z(int i) {
        return mo20532A(i, C6415d.f30664c);
    }

    public C5918a0(int i) {
        this.f29047a = new byte[i];
        this.f29049c = i;
    }

    public C5918a0(byte[] bArr) {
        this.f29047a = bArr;
        this.f29049c = bArr.length;
    }

    public C5918a0(byte[] bArr, int i) {
        this.f29047a = bArr;
        this.f29049c = i;
    }
}
