package p191b8;

import com.google.protobuf.C8153i;
import com.startapp.C8843b4;
import java.math.RoundingMode;
import java.util.Arrays;

/* renamed from: b8.g */
/* compiled from: OrderedCodeWriter */
public class C6725g {

    /* renamed from: c */
    private static final byte[][] f31221c = {new byte[]{0, 0}, new byte[]{C8843b4.f36445d, 0}, new byte[]{-64, 0}, new byte[]{-32, 0}, new byte[]{-16, 0}, new byte[]{-8, 0}, new byte[]{-4, 0}, new byte[]{-2, 0}, new byte[]{-1, 0}, new byte[]{-1, C8843b4.f36445d}, new byte[]{-1, -64}};

    /* renamed from: a */
    private byte[] f31222a = new byte[1024];

    /* renamed from: b */
    private int f31223b = 0;

    /* renamed from: b */
    private void m38601b(int i) {
        int i2 = i + this.f31223b;
        byte[] bArr = this.f31222a;
        if (i2 > bArr.length) {
            int length = bArr.length * 2;
            if (length >= i2) {
                i2 = length;
            }
            this.f31222a = Arrays.copyOf(bArr, i2);
        }
    }

    /* renamed from: d */
    private int m38602d(long j) {
        if (j < 0) {
            j = ~j;
        }
        return C6723f.m38600a((64 - Long.numberOfLeadingZeros(j)) + 1, 7, RoundingMode.UP);
    }

    /* renamed from: e */
    private int m38603e(long j) {
        return C6723f.m38600a(64 - Long.numberOfLeadingZeros(j), 8, RoundingMode.UP);
    }

    /* renamed from: f */
    private void m38604f(byte b) {
        if (b == 0) {
            m38606l((byte) 0);
            m38606l((byte) -1);
        } else if (b == -1) {
            m38606l((byte) -1);
            m38606l((byte) 0);
        } else {
            m38606l(b);
        }
    }

    /* renamed from: g */
    private void m38605g(byte b) {
        if (b == 0) {
            m38607m((byte) 0);
            m38607m((byte) -1);
        } else if (b == -1) {
            m38607m((byte) -1);
            m38607m((byte) 0);
        } else {
            m38607m(b);
        }
    }

    /* renamed from: l */
    private void m38606l(byte b) {
        m38601b(1);
        byte[] bArr = this.f31222a;
        int i = this.f31223b;
        this.f31223b = i + 1;
        bArr[i] = b;
    }

    /* renamed from: m */
    private void m38607m(byte b) {
        m38601b(1);
        byte[] bArr = this.f31222a;
        int i = this.f31223b;
        this.f31223b = i + 1;
        bArr[i] = (byte) (~b);
    }

    /* renamed from: p */
    private void m38608p() {
        m38606l((byte) 0);
        m38606l((byte) 1);
    }

    /* renamed from: q */
    private void m38609q() {
        m38607m((byte) 0);
        m38607m((byte) 1);
    }

    /* renamed from: a */
    public byte[] mo22628a() {
        return Arrays.copyOf(this.f31222a, this.f31223b);
    }

    /* renamed from: c */
    public void mo22629c(byte[] bArr) {
        m38601b(bArr.length);
        for (byte b : bArr) {
            byte[] bArr2 = this.f31222a;
            int i = this.f31223b;
            this.f31223b = i + 1;
            bArr2[i] = b;
        }
    }

    /* renamed from: h */
    public void mo22630h(C8153i iVar) {
        for (int i = 0; i < iVar.size(); i++) {
            m38604f(iVar.mo26887i(i));
        }
        m38608p();
    }

    /* renamed from: i */
    public void mo22631i(C8153i iVar) {
        for (int i = 0; i < iVar.size(); i++) {
            m38605g(iVar.mo26887i(i));
        }
        m38609q();
    }

    /* renamed from: j */
    public void mo22632j(double d) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        mo22638t(doubleToLongBits ^ (doubleToLongBits < 0 ? -1 : Long.MIN_VALUE));
    }

    /* renamed from: k */
    public void mo22633k(double d) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        mo22639u(doubleToLongBits ^ (doubleToLongBits < 0 ? -1 : Long.MIN_VALUE));
    }

    /* renamed from: n */
    public void mo22634n() {
        m38606l((byte) -1);
        m38606l((byte) -1);
    }

    /* renamed from: o */
    public void mo22635o() {
        m38607m((byte) -1);
        m38607m((byte) -1);
    }

    /* renamed from: r */
    public void mo22636r(long j) {
        int i;
        int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        long j2 = i2 < 0 ? ~j : j;
        if (j2 < 64) {
            m38601b(1);
            byte[] bArr = this.f31222a;
            int i3 = this.f31223b;
            this.f31223b = i3 + 1;
            bArr[i3] = (byte) ((int) (j ^ ((long) f31221c[1][0])));
            return;
        }
        int d = m38602d(j2);
        m38601b(d);
        if (d >= 2) {
            byte b = i2 < 0 ? (byte) -1 : 0;
            int i4 = this.f31223b;
            if (d == 10) {
                i = i4 + 2;
                byte[] bArr2 = this.f31222a;
                bArr2[i4] = b;
                bArr2[i4 + 1] = b;
            } else if (d == 9) {
                i = i4 + 1;
                this.f31222a[i4] = b;
            } else {
                i = i4;
            }
            for (int i5 = (d - 1) + i4; i5 >= i; i5--) {
                this.f31222a[i5] = (byte) ((int) (255 & j));
                j >>= 8;
            }
            byte[] bArr3 = this.f31222a;
            int i6 = this.f31223b;
            byte b2 = bArr3[i6];
            byte[][] bArr4 = f31221c;
            bArr3[i6] = (byte) (b2 ^ bArr4[d][0]);
            int i7 = i6 + 1;
            bArr3[i7] = (byte) (bArr4[d][1] ^ bArr3[i7]);
            this.f31223b = i6 + d;
            return;
        }
        throw new AssertionError(String.format("Invalid length (%d) returned by signedNumLength", new Object[]{Integer.valueOf(d)}));
    }

    /* renamed from: s */
    public void mo22637s(long j) {
        mo22636r(~j);
    }

    /* renamed from: t */
    public void mo22638t(long j) {
        int e = m38603e(j);
        m38601b(e + 1);
        byte[] bArr = this.f31222a;
        int i = this.f31223b;
        int i2 = i + 1;
        this.f31223b = i2;
        bArr[i] = (byte) e;
        int i3 = i2 + e;
        while (true) {
            i3--;
            int i4 = this.f31223b;
            if (i3 >= i4) {
                this.f31222a[i3] = (byte) ((int) (255 & j));
                j >>>= 8;
            } else {
                this.f31223b = i4 + e;
                return;
            }
        }
    }

    /* renamed from: u */
    public void mo22639u(long j) {
        int e = m38603e(j);
        m38601b(e + 1);
        byte[] bArr = this.f31222a;
        int i = this.f31223b;
        int i2 = i + 1;
        this.f31223b = i2;
        bArr[i] = (byte) (~e);
        int i3 = i2 + e;
        while (true) {
            i3--;
            int i4 = this.f31223b;
            if (i3 >= i4) {
                this.f31222a[i3] = (byte) ((int) (~(255 & j)));
                j >>>= 8;
            } else {
                this.f31223b = i4 + e;
                return;
            }
        }
    }

    /* renamed from: v */
    public void mo22640v(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 128) {
                m38604f((byte) charAt);
            } else if (charAt < 2048) {
                m38604f((byte) ((charAt >>> 6) | 960));
                m38604f((byte) ((charAt & '?') | 128));
            } else if (charAt < 55296 || 57343 < charAt) {
                m38604f((byte) ((charAt >>> 12) | 480));
                m38604f((byte) (((charAt >>> 6) & 63) | 128));
                m38604f((byte) ((charAt & '?') | 128));
            } else {
                int codePointAt = Character.codePointAt(charSequence, i);
                i++;
                m38604f((byte) ((codePointAt >>> 18) | 240));
                m38604f((byte) (((codePointAt >>> 12) & 63) | 128));
                m38604f((byte) (((codePointAt >>> 6) & 63) | 128));
                m38604f((byte) ((codePointAt & 63) | 128));
            }
            i++;
        }
        m38608p();
    }

    /* renamed from: w */
    public void mo22641w(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 128) {
                m38605g((byte) charAt);
            } else if (charAt < 2048) {
                m38605g((byte) ((charAt >>> 6) | 960));
                m38605g((byte) ((charAt & '?') | 128));
            } else if (charAt < 55296 || 57343 < charAt) {
                m38605g((byte) ((charAt >>> 12) | 480));
                m38605g((byte) (((charAt >>> 6) & 63) | 128));
                m38605g((byte) ((charAt & '?') | 128));
            } else {
                int codePointAt = Character.codePointAt(charSequence, i);
                i++;
                m38605g((byte) ((codePointAt >>> 18) | 240));
                m38605g((byte) (((codePointAt >>> 12) & 63) | 128));
                m38605g((byte) (((codePointAt >>> 6) & 63) | 128));
                m38605g((byte) ((codePointAt & 63) | 128));
            }
            i++;
        }
        m38609q();
    }
}
