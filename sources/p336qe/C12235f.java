package p336qe;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: qe.f */
/* compiled from: ByteString */
public class C12235f implements Serializable, Comparable<C12235f> {

    /* renamed from: d */
    static final char[] f45380d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: e */
    public static final C12235f f45381e = m58767r(new byte[0]);

    /* renamed from: a */
    final byte[] f45382a;

    /* renamed from: b */
    transient int f45383b;

    /* renamed from: c */
    transient String f45384c;

    C12235f(byte[] bArr) {
        this.f45382a = bArr;
    }

    /* renamed from: b */
    static int m58762b(String str, int i) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 == i) {
                return i2;
            }
            int codePointAt = str.codePointAt(i2);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    /* renamed from: j */
    public static C12235f m58763j(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        } else if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((m58764k(str.charAt(i2)) << 4) + m58764k(str.charAt(i2 + 1)));
            }
            return m58767r(bArr);
        } else {
            throw new IllegalArgumentException("Unexpected hex string: " + str);
        }
    }

    /* renamed from: k */
    private static int m58764k(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                throw new IllegalArgumentException("Unexpected hex digit: " + c);
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: n */
    private C12235f m58765n(String str) {
        try {
            return m58767r(MessageDigest.getInstance(str).digest(this.f45382a));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: o */
    public static C12235f m58766o(String str) {
        if (str != null) {
            C12235f fVar = new C12235f(str.getBytes(C12255v.f45426a));
            fVar.f45384c = str;
            return fVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    /* renamed from: r */
    public static C12235f m58767r(byte... bArr) {
        if (bArr != null) {
            return new C12235f((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    /* renamed from: A */
    public byte[] mo36831A() {
        return (byte[]) this.f45382a.clone();
    }

    /* renamed from: B */
    public String mo36832B() {
        String str = this.f45384c;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f45382a, C12255v.f45426a);
        this.f45384c = str2;
        return str2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo36833C(C12231c cVar) {
        byte[] bArr = this.f45382a;
        cVar.mo36816s(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public String mo36834a() {
        return C12230b.m58684a(this.f45382a);
    }

    /* renamed from: c */
    public int compareTo(C12235f fVar) {
        int w = mo36846w();
        int w2 = fVar.mo36846w();
        int min = Math.min(w, w2);
        int i = 0;
        while (i < min) {
            byte p = mo36839p(i) & 255;
            byte p2 = fVar.mo36839p(i) & 255;
            if (p == p2) {
                i++;
            } else if (p < p2) {
                return -1;
            } else {
                return 1;
            }
        }
        if (w == w2) {
            return 0;
        }
        if (w < w2) {
            return -1;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C12235f) {
            C12235f fVar = (C12235f) obj;
            int w = fVar.mo36846w();
            byte[] bArr = this.f45382a;
            if (w != bArr.length || !fVar.mo36842t(0, bArr, 0, bArr.length)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.f45383b;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f45382a);
        this.f45383b = hashCode;
        return hashCode;
    }

    /* renamed from: p */
    public byte mo36839p(int i) {
        return this.f45382a[i];
    }

    /* renamed from: q */
    public String mo36840q() {
        byte[] bArr = this.f45382a;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f45380d;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: s */
    public boolean mo36841s(int i, C12235f fVar, int i2, int i3) {
        return fVar.mo36842t(i2, this.f45382a, i, i3);
    }

    /* renamed from: t */
    public boolean mo36842t(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.f45382a;
            return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C12255v.m58891a(bArr2, i, bArr, i2, i3);
        }
    }

    public String toString() {
        if (this.f45382a.length == 0) {
            return "[size=0]";
        }
        String B = mo36832B();
        int b = m58762b(B, 64);
        if (b != -1) {
            String replace = B.substring(0, b).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (b < B.length()) {
                return "[size=" + this.f45382a.length + " text=" + replace + "…]";
            }
            return "[text=" + replace + "]";
        } else if (this.f45382a.length <= 64) {
            return "[hex=" + mo36840q() + "]";
        } else {
            return "[size=" + this.f45382a.length + " hex=" + mo36848y(0, 64).mo36840q() + "…]";
        }
    }

    /* renamed from: u */
    public C12235f mo36844u() {
        return m58765n("SHA-1");
    }

    /* renamed from: v */
    public C12235f mo36845v() {
        return m58765n("SHA-256");
    }

    /* renamed from: w */
    public int mo36846w() {
        return this.f45382a.length;
    }

    /* renamed from: x */
    public final boolean mo36847x(C12235f fVar) {
        return mo36841s(0, fVar, 0, fVar.mo36846w());
    }

    /* renamed from: y */
    public C12235f mo36848y(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.f45382a;
            if (i2 <= bArr.length) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i == 0 && i2 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(bArr, i, bArr2, 0, i3);
                    return new C12235f(bArr2);
                }
            } else {
                throw new IllegalArgumentException("endIndex > length(" + this.f45382a.length + ")");
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    /* renamed from: z */
    public C12235f mo36849z() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f45382a;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b < 65 || b > 90) {
                i++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i2] = (byte) (b2 + 32);
                    }
                }
                return new C12235f(bArr2);
            }
        }
    }
}
