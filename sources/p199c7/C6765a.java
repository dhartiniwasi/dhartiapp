package p199c7;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import p182a7.C6425j;
import p182a7.C6431n;
import p210d7.C9872b;

/* renamed from: c7.a */
/* compiled from: BaseEncoding */
public abstract class C6765a {

    /* renamed from: a */
    private static final C6765a f31278a = new C6768c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: b */
    private static final C6765a f31279b = new C6768c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* renamed from: c */
    private static final C6765a f31280c = new C6770e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* renamed from: d */
    private static final C6765a f31281d = new C6770e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* renamed from: e */
    private static final C6765a f31282e = new C6767b("base16()", "0123456789ABCDEF");

    /* renamed from: c7.a$a */
    /* compiled from: BaseEncoding */
    private static final class C6766a {

        /* renamed from: a */
        private final String f31283a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final char[] f31284b;

        /* renamed from: c */
        final int f31285c;

        /* renamed from: d */
        final int f31286d;

        /* renamed from: e */
        final int f31287e;

        /* renamed from: f */
        final int f31288f;

        /* renamed from: g */
        private final byte[] f31289g;

        /* renamed from: h */
        private final boolean[] f31290h;

        C6766a(String str, char[] cArr) {
            this.f31283a = (String) C6431n.m37561n(str);
            this.f31284b = (char[]) C6431n.m37561n(cArr);
            try {
                int d = C9872b.m50643d(cArr.length, RoundingMode.UNNECESSARY);
                this.f31286d = d;
                int min = Math.min(8, Integer.lowestOneBit(d));
                try {
                    this.f31287e = 8 / min;
                    this.f31288f = d / min;
                    this.f31285c = cArr.length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i = 0; i < cArr.length; i++) {
                        char c = cArr[i];
                        C6431n.m37553f(c < 128, "Non-ASCII character: %s", c);
                        C6431n.m37553f(bArr[c] == -1, "Duplicate character: %s", c);
                        bArr[c] = (byte) i;
                    }
                    this.f31289g = bArr;
                    boolean[] zArr = new boolean[this.f31287e];
                    for (int i2 = 0; i2 < this.f31288f; i2++) {
                        zArr[C9872b.m50640a(i2 * 8, this.f31286d, RoundingMode.CEILING)] = true;
                    }
                    this.f31290h = zArr;
                } catch (ArithmeticException e) {
                    String str2 = new String(cArr);
                    throw new IllegalArgumentException(str2.length() != 0 ? "Illegal alphabet ".concat(str2) : new String("Illegal alphabet "), e);
                }
            } catch (ArithmeticException e2) {
                int length = cArr.length;
                StringBuilder sb = new StringBuilder(35);
                sb.append("Illegal alphabet length ");
                sb.append(length);
                throw new IllegalArgumentException(sb.toString(), e2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo22697b(char c) throws C6769d {
            if (c > 127) {
                String valueOf = String.valueOf(Integer.toHexString(c));
                throw new C6769d(valueOf.length() != 0 ? "Unrecognized character: 0x".concat(valueOf) : new String("Unrecognized character: 0x"));
            }
            byte b = this.f31289g[c];
            if (b != -1) {
                return b;
            }
            if (c <= ' ' || c == 127) {
                String valueOf2 = String.valueOf(Integer.toHexString(c));
                throw new C6769d(valueOf2.length() != 0 ? "Unrecognized character: 0x".concat(valueOf2) : new String("Unrecognized character: 0x"));
            }
            StringBuilder sb = new StringBuilder(25);
            sb.append("Unrecognized character: ");
            sb.append(c);
            throw new C6769d(sb.toString());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public char mo22698c(int i) {
            return this.f31284b[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo22699d(int i) {
            return this.f31290h[i % this.f31287e];
        }

        /* renamed from: e */
        public boolean mo22700e(char c) {
            byte[] bArr = this.f31289g;
            return c < bArr.length && bArr[c] != -1;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C6766a) {
                return Arrays.equals(this.f31284b, ((C6766a) obj).f31284b);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f31284b);
        }

        public String toString() {
            return this.f31283a;
        }
    }

    /* renamed from: c7.a$b */
    /* compiled from: BaseEncoding */
    static final class C6767b extends C6770e {

        /* renamed from: h */
        final char[] f31291h;

        C6767b(String str, String str2) {
            this(new C6766a(str, str2.toCharArray()));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo22689d(byte[] bArr, CharSequence charSequence) throws C6769d {
            C6431n.m37561n(bArr);
            if (charSequence.length() % 2 != 1) {
                int i = 0;
                int i2 = 0;
                while (i < charSequence.length()) {
                    bArr[i2] = (byte) ((this.f31292f.mo22697b(charSequence.charAt(i)) << 4) | this.f31292f.mo22697b(charSequence.charAt(i + 1)));
                    i += 2;
                    i2++;
                }
                return i2;
            }
            int length = charSequence.length();
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid input length ");
            sb.append(length);
            throw new C6769d(sb.toString());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo22692g(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            C6431n.m37561n(appendable);
            C6431n.m37566s(i, i + i2, bArr.length);
            for (int i3 = 0; i3 < i2; i3++) {
                byte b = bArr[i + i3] & 255;
                appendable.append(this.f31291h[b]);
                appendable.append(this.f31291h[b | 256]);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public C6765a mo22704n(C6766a aVar, Character ch) {
            return new C6767b(aVar);
        }

        private C6767b(C6766a aVar) {
            super(aVar, (Character) null);
            this.f31291h = new char[512];
            C6431n.m37551d(aVar.f31284b.length == 16);
            for (int i = 0; i < 256; i++) {
                this.f31291h[i] = aVar.mo22698c(i >>> 4);
                this.f31291h[i | 256] = aVar.mo22698c(i & 15);
            }
        }
    }

    /* renamed from: c7.a$c */
    /* compiled from: BaseEncoding */
    static final class C6768c extends C6770e {
        C6768c(String str, String str2, Character ch) {
            this(new C6766a(str, str2.toCharArray()), ch);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo22689d(byte[] bArr, CharSequence charSequence) throws C6769d {
            C6431n.m37561n(bArr);
            CharSequence l = mo22696l(charSequence);
            if (this.f31292f.mo22699d(l.length())) {
                int i = 0;
                int i2 = 0;
                while (i < l.length()) {
                    int i3 = i + 1;
                    int i4 = i3 + 1;
                    int b = (this.f31292f.mo22697b(l.charAt(i)) << 18) | (this.f31292f.mo22697b(l.charAt(i3)) << 12);
                    int i5 = i2 + 1;
                    bArr[i2] = (byte) (b >>> 16);
                    if (i4 < l.length()) {
                        int i6 = i4 + 1;
                        int b2 = b | (this.f31292f.mo22697b(l.charAt(i4)) << 6);
                        i2 = i5 + 1;
                        bArr[i5] = (byte) ((b2 >>> 8) & 255);
                        if (i6 < l.length()) {
                            i4 = i6 + 1;
                            i5 = i2 + 1;
                            bArr[i2] = (byte) ((b2 | this.f31292f.mo22697b(l.charAt(i6))) & 255);
                        } else {
                            i = i6;
                        }
                    }
                    i2 = i5;
                    i = i4;
                }
                return i2;
            }
            int length = l.length();
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid input length ");
            sb.append(length);
            throw new C6769d(sb.toString());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo22692g(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            C6431n.m37561n(appendable);
            int i3 = i + i2;
            C6431n.m37566s(i, i3, bArr.length);
            while (i2 >= 3) {
                int i4 = i + 1;
                int i5 = i4 + 1;
                byte b = ((bArr[i] & 255) << 16) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                appendable.append(this.f31292f.mo22698c(b >>> 18));
                appendable.append(this.f31292f.mo22698c((b >>> 12) & 63));
                appendable.append(this.f31292f.mo22698c((b >>> 6) & 63));
                appendable.append(this.f31292f.mo22698c(b & 63));
                i2 -= 3;
                i = i5 + 1;
            }
            if (i < i3) {
                mo22707m(appendable, bArr, i, i3 - i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public C6765a mo22704n(C6766a aVar, Character ch) {
            return new C6768c(aVar, ch);
        }

        private C6768c(C6766a aVar, Character ch) {
            super(aVar, ch);
            C6431n.m37551d(aVar.f31284b.length == 64);
        }
    }

    /* renamed from: c7.a$d */
    /* compiled from: BaseEncoding */
    public static final class C6769d extends IOException {
        C6769d(String str) {
            super(str);
        }
    }

    /* renamed from: c7.a$e */
    /* compiled from: BaseEncoding */
    static class C6770e extends C6765a {

        /* renamed from: f */
        final C6766a f31292f;

        /* renamed from: g */
        final Character f31293g;

        C6770e(String str, String str2, Character ch) {
            this(new C6766a(str, str2.toCharArray()), ch);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo22689d(byte[] bArr, CharSequence charSequence) throws C6769d {
            C6766a aVar;
            C6431n.m37561n(bArr);
            CharSequence l = mo22696l(charSequence);
            if (this.f31292f.mo22699d(l.length())) {
                int i = 0;
                int i2 = 0;
                while (i < l.length()) {
                    long j = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        aVar = this.f31292f;
                        if (i3 >= aVar.f31287e) {
                            break;
                        }
                        j <<= aVar.f31286d;
                        if (i + i3 < l.length()) {
                            j |= (long) this.f31292f.mo22697b(l.charAt(i4 + i));
                            i4++;
                        }
                        i3++;
                    }
                    int i5 = aVar.f31288f;
                    int i6 = (i5 * 8) - (i4 * aVar.f31286d);
                    int i7 = (i5 - 1) * 8;
                    while (i7 >= i6) {
                        bArr[i2] = (byte) ((int) ((j >>> i7) & 255));
                        i7 -= 8;
                        i2++;
                    }
                    i += this.f31292f.f31287e;
                }
                return i2;
            }
            int length = l.length();
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid input length ");
            sb.append(length);
            throw new C6769d(sb.toString());
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C6770e)) {
                return false;
            }
            C6770e eVar = (C6770e) obj;
            if (!this.f31292f.equals(eVar.f31292f) || !C6425j.m37541a(this.f31293g, eVar.f31293g)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo22692g(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            C6431n.m37561n(appendable);
            C6431n.m37566s(i, i + i2, bArr.length);
            int i3 = 0;
            while (i3 < i2) {
                mo22707m(appendable, bArr, i + i3, Math.min(this.f31292f.f31288f, i2 - i3));
                i3 += this.f31292f.f31288f;
            }
        }

        public int hashCode() {
            return this.f31292f.hashCode() ^ C6425j.m37542b(this.f31293g);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public int mo22693i(int i) {
            return (int) (((((long) this.f31292f.f31286d) * ((long) i)) + 7) / 8);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public int mo22694j(int i) {
            C6766a aVar = this.f31292f;
            return aVar.f31287e * C9872b.m50640a(i, aVar.f31288f, RoundingMode.CEILING);
        }

        /* renamed from: k */
        public C6765a mo22695k() {
            return this.f31293g == null ? this : mo22704n(this.f31292f, (Character) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public CharSequence mo22696l(CharSequence charSequence) {
            C6431n.m37561n(charSequence);
            Character ch = this.f31293g;
            if (ch == null) {
                return charSequence;
            }
            char charValue = ch.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == charValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo22707m(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            C6431n.m37561n(appendable);
            C6431n.m37566s(i, i + i2, bArr.length);
            int i3 = 0;
            C6431n.m37551d(i2 <= this.f31292f.f31288f);
            long j = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                j = (j | ((long) (bArr[i + i4] & 255))) << 8;
            }
            int i5 = ((i2 + 1) * 8) - this.f31292f.f31286d;
            while (i3 < i2 * 8) {
                C6766a aVar = this.f31292f;
                appendable.append(aVar.mo22698c(((int) (j >>> (i5 - i3))) & aVar.f31285c));
                i3 += this.f31292f.f31286d;
            }
            if (this.f31293g != null) {
                while (i3 < this.f31292f.f31288f * 8) {
                    appendable.append(this.f31293g.charValue());
                    i3 += this.f31292f.f31286d;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public C6765a mo22704n(C6766a aVar, Character ch) {
            return new C6770e(aVar, ch);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.f31292f.toString());
            if (8 % this.f31292f.f31286d != 0) {
                if (this.f31293g == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.f31293g);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        C6770e(C6766a aVar, Character ch) {
            this.f31292f = (C6766a) C6431n.m37561n(aVar);
            C6431n.m37557j(ch == null || !aVar.mo22700e(ch.charValue()), "Padding character %s was already in alphabet", ch);
            this.f31293g = ch;
        }
    }

    C6765a() {
    }

    /* renamed from: a */
    public static C6765a m38680a() {
        return f31278a;
    }

    /* renamed from: h */
    private static byte[] m38681h(byte[] bArr, int i) {
        if (i == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    /* renamed from: b */
    public final byte[] mo22687b(CharSequence charSequence) {
        try {
            return mo22688c(charSequence);
        } catch (C6769d e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final byte[] mo22688c(CharSequence charSequence) throws C6769d {
        CharSequence l = mo22696l(charSequence);
        byte[] bArr = new byte[mo22693i(l.length())];
        return m38681h(bArr, mo22689d(bArr, l));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract int mo22689d(byte[] bArr, CharSequence charSequence) throws C6769d;

    /* renamed from: e */
    public String mo22690e(byte[] bArr) {
        return mo22691f(bArr, 0, bArr.length);
    }

    /* renamed from: f */
    public final String mo22691f(byte[] bArr, int i, int i2) {
        C6431n.m37566s(i, i + i2, bArr.length);
        StringBuilder sb = new StringBuilder(mo22694j(i2));
        try {
            mo22692g(sb, bArr, i, i2);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract void mo22692g(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract int mo22693i(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract int mo22694j(int i);

    /* renamed from: k */
    public abstract C6765a mo22695k();

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public abstract CharSequence mo22696l(CharSequence charSequence);
}
