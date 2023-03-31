package p391wc;

import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Locale;
import p336qe.C12231c;

/* renamed from: wc.a */
/* compiled from: HttpUrl */
public final class C12942a {

    /* renamed from: e */
    private static final char[] f47186e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    private final String f47187a;

    /* renamed from: b */
    private final String f47188b;

    /* renamed from: c */
    private final int f47189c;

    /* renamed from: d */
    private final String f47190d;

    /* renamed from: wc.a$b */
    /* compiled from: HttpUrl */
    public static final class C12944b {

        /* renamed from: a */
        String f47191a;

        /* renamed from: b */
        String f47192b;

        /* renamed from: c */
        int f47193c = -1;

        /* renamed from: b */
        private static String m61117b(String str, int i, int i2) {
            String d = C12942a.m61113d(str, i, i2, false);
            if (!d.startsWith("[") || !d.endsWith("]")) {
                return m61121f(d);
            }
            InetAddress e = m61120e(d, 1, d.length() - 1);
            if (e == null) {
                return null;
            }
            byte[] address = e.getAddress();
            if (address.length == 16) {
                return m61122i(address);
            }
            throw new AssertionError();
        }

        /* renamed from: c */
        private static boolean m61118c(String str) {
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        private static boolean m61119d(String str, int i, int i2, byte[] bArr, int i3) {
            int i4 = i3;
            while (i < i2) {
                if (i4 == bArr.length) {
                    return false;
                }
                if (i4 != i3) {
                    if (str.charAt(i) != '.') {
                        return false;
                    }
                    i++;
                }
                int i5 = i;
                int i6 = 0;
                while (i5 < i2) {
                    char charAt = str.charAt(i5);
                    if (charAt < '0' || charAt > '9') {
                        break;
                    } else if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                        return false;
                    } else {
                        i5++;
                    }
                }
                if (i5 - i == 0) {
                    return false;
                }
                bArr[i4] = (byte) i6;
                i4++;
                i = i5;
            }
            if (i4 != i3 + 4) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        private static InetAddress m61120e(String str, int i, int i2) {
            byte[] bArr = new byte[16];
            int i3 = 0;
            int i4 = -1;
            int i5 = -1;
            while (true) {
                if (i >= i2) {
                    break;
                } else if (i3 == 16) {
                    return null;
                } else {
                    int i6 = i + 2;
                    if (i6 > i2 || !str.regionMatches(i, "::", 0, 2)) {
                        if (i3 != 0) {
                            if (str.regionMatches(i, ":", 0, 1)) {
                                i++;
                            } else if (!str.regionMatches(i, ".", 0, 1) || !m61119d(str, i5, i2, bArr, i3 - 2)) {
                                return null;
                            } else {
                                i3 += 2;
                            }
                        }
                        i5 = i;
                    } else if (i4 != -1) {
                        return null;
                    } else {
                        i3 += 2;
                        i4 = i3;
                        if (i6 == i2) {
                            break;
                        }
                        i5 = i6;
                    }
                    i = i5;
                    int i7 = 0;
                    while (i < i2) {
                        int a = C12942a.m61111a(str.charAt(i));
                        if (a == -1) {
                            break;
                        }
                        i7 = (i7 << 4) + a;
                        i++;
                    }
                    int i8 = i - i5;
                    if (i8 == 0 || i8 > 4) {
                        return null;
                    }
                    int i9 = i3 + 1;
                    bArr[i3] = (byte) ((i7 >>> 8) & 255);
                    i3 = i9 + 1;
                    bArr[i9] = (byte) (i7 & 255);
                }
            }
            if (i3 != 16) {
                if (i4 == -1) {
                    return null;
                }
                int i10 = i3 - i4;
                System.arraycopy(bArr, i4, bArr, 16 - i10, i10);
                Arrays.fill(bArr, i4, (16 - i3) + i4, (byte) 0);
            }
            try {
                return InetAddress.getByAddress(bArr);
            } catch (UnknownHostException unused) {
                throw new AssertionError();
            }
        }

        /* renamed from: f */
        private static String m61121f(String str) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (!lowerCase.isEmpty() && !m61118c(lowerCase)) {
                    return lowerCase;
                }
                return null;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: i */
        private static String m61122i(byte[] bArr) {
            int i = 0;
            int i2 = -1;
            int i3 = 0;
            int i4 = 0;
            while (i3 < bArr.length) {
                int i5 = i3;
                while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                    i5 += 2;
                }
                int i6 = i5 - i3;
                if (i6 > i4) {
                    i2 = i3;
                    i4 = i6;
                }
                i3 = i5 + 2;
            }
            C12231c cVar = new C12231c();
            while (i < bArr.length) {
                if (i == i2) {
                    cVar.mo36787a0(58);
                    i += i4;
                    if (i == 16) {
                        cVar.mo36787a0(58);
                    }
                } else {
                    if (i > 0) {
                        cVar.mo36787a0(58);
                    }
                    cVar.mo36768G0((long) (((bArr[i] & 255) << 8) | (bArr[i + 1] & 255)));
                    i += 2;
                }
            }
            return cVar.mo36766F();
        }

        /* renamed from: a */
        public C12942a mo37990a() {
            if (this.f47191a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f47192b != null) {
                return new C12942a(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public int mo37991g() {
            int i = this.f47193c;
            return i != -1 ? i : C12942a.m61112b(this.f47191a);
        }

        /* renamed from: h */
        public C12944b mo37992h(String str) {
            if (str != null) {
                String b = m61117b(str, 0, str.length());
                if (b != null) {
                    this.f47192b = b;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: " + str);
            }
            throw new IllegalArgumentException("host == null");
        }

        /* renamed from: j */
        public C12944b mo37993j(int i) {
            if (i <= 0 || i > 65535) {
                throw new IllegalArgumentException("unexpected port: " + i);
            }
            this.f47193c = i;
            return this;
        }

        /* renamed from: k */
        public C12944b mo37994k(String str) {
            if (str != null) {
                if (str.equalsIgnoreCase("http")) {
                    this.f47191a = "http";
                } else if (str.equalsIgnoreCase("https")) {
                    this.f47191a = "https";
                } else {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
                return this;
            }
            throw new IllegalArgumentException("scheme == null");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f47191a);
            sb.append("://");
            if (this.f47192b.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f47192b);
                sb.append(']');
            } else {
                sb.append(this.f47192b);
            }
            int g = mo37991g();
            if (g != C12942a.m61112b(this.f47191a)) {
                sb.append(':');
                sb.append(g);
            }
            return sb.toString();
        }
    }

    /* renamed from: a */
    static int m61111a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: b */
    public static int m61112b(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* renamed from: d */
    static String m61113d(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                C12231c cVar = new C12231c();
                cVar.mo36824y0(str, i, i3);
                m61114e(cVar, str, i3, i2, z);
                return cVar.mo36766F();
            }
        }
        return str.substring(i, i2);
    }

    /* renamed from: e */
    static void m61114e(C12231c cVar, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int a = m61111a(str.charAt(i + 1));
                int a2 = m61111a(str.charAt(i3));
                if (!(a == -1 || a2 == -1)) {
                    cVar.mo36787a0((a << 4) + a2);
                    i = i3;
                    i += Character.charCount(codePointAt);
                }
            } else if (codePointAt == 43 && z) {
                cVar.mo36787a0(32);
                i += Character.charCount(codePointAt);
            }
            cVar.mo36763B0(codePointAt);
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: c */
    public String mo37985c() {
        return this.f47188b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C12942a) && ((C12942a) obj).f47190d.equals(this.f47190d);
    }

    /* renamed from: f */
    public int mo37987f() {
        return this.f47189c;
    }

    public int hashCode() {
        return this.f47190d.hashCode();
    }

    public String toString() {
        return this.f47190d;
    }

    private C12942a(C12944b bVar) {
        this.f47187a = bVar.f47191a;
        this.f47188b = bVar.f47192b;
        this.f47189c = bVar.mo37991g();
        this.f47190d = bVar.toString();
    }
}
