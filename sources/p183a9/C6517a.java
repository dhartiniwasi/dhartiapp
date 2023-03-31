package p183a9;

import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import p414z8.C13474a;

/* renamed from: a9.a */
/* compiled from: JsonReader */
public class C6517a implements Closeable {

    /* renamed from: a */
    private final Reader f30917a;

    /* renamed from: b */
    private boolean f30918b = false;

    /* renamed from: c */
    private final char[] f30919c = new char[1024];

    /* renamed from: d */
    private int f30920d = 0;

    /* renamed from: e */
    private int f30921e = 0;

    /* renamed from: f */
    private int f30922f = 0;

    /* renamed from: g */
    private int f30923g = 0;

    /* renamed from: h */
    int f30924h = 0;

    /* renamed from: i */
    private long f30925i;

    /* renamed from: r */
    private int f30926r;

    /* renamed from: s */
    private String f30927s;

    /* renamed from: t */
    private int[] f30928t;

    /* renamed from: u */
    private int f30929u;

    /* renamed from: v */
    private String[] f30930v;

    /* renamed from: w */
    private int[] f30931w;

    /* renamed from: a9.a$a */
    /* compiled from: JsonReader */
    class C6518a extends C13474a {
        C6518a() {
        }
    }

    static {
        C13474a.f47841a = new C6518a();
    }

    public C6517a(Reader reader) {
        int[] iArr = new int[32];
        this.f30928t = iArr;
        this.f30929u = 0;
        this.f30929u = 0 + 1;
        iArr[0] = 6;
        this.f30930v = new String[32];
        this.f30931w = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f30917a = reader;
    }

    /* renamed from: H */
    private int m37987H(boolean z) throws IOException {
        char[] cArr = this.f30919c;
        int i = this.f30920d;
        int i2 = this.f30921e;
        while (true) {
            if (i == i2) {
                this.f30920d = i;
                if (m37999p(1)) {
                    i = this.f30920d;
                    i2 = this.f30921e;
                } else if (!z) {
                    return -1;
                } else {
                    throw new EOFException("End of input" + mo22111x());
                }
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == 10) {
                this.f30922f++;
                this.f30923g = i3;
            } else if (!(c == ' ' || c == 13 || c == 9)) {
                if (c == '/') {
                    this.f30920d = i3;
                    if (i3 == i2) {
                        this.f30920d = i3 - 1;
                        boolean p = m37999p(2);
                        this.f30920d++;
                        if (!p) {
                            return c;
                        }
                    }
                    m37995f();
                    int i4 = this.f30920d;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f30920d = i4 + 1;
                        if (m37994d0("*/")) {
                            i = this.f30920d + 2;
                            i2 = this.f30921e;
                        } else {
                            throw m37998i0("Unterminated comment");
                        }
                    } else if (c2 != '/') {
                        return c;
                    } else {
                        this.f30920d = i4 + 1;
                        m37996f0();
                        i = this.f30920d;
                        i2 = this.f30921e;
                    }
                } else if (c == '#') {
                    this.f30920d = i3;
                    m37995f();
                    m37996f0();
                    i = this.f30920d;
                    i2 = this.f30921e;
                } else {
                    this.f30920d = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        if (r1 != null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        r1.append(r0, r3, r2 - r3);
        r9.f30920d = r2;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m37988K(char r10) throws java.io.IOException {
        /*
            r9 = this;
            char[] r0 = r9.f30919c
            r1 = 0
        L_0x0003:
            int r2 = r9.f30920d
            int r3 = r9.f30921e
        L_0x0007:
            r4 = r3
            r3 = r2
        L_0x0009:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L_0x005c
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L_0x0028
            r9.f30920d = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L_0x0020
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L_0x0020:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L_0x0028:
            r8 = 92
            if (r2 != r8) goto L_0x004f
            r9.f30920d = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L_0x0040
            int r1 = r7 + 1
            int r1 = r1 * 2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r2.<init>(r1)
            r1 = r2
        L_0x0040:
            r1.append(r0, r3, r7)
            char r2 = r9.m37993c0()
            r1.append(r2)
            int r2 = r9.f30920d
            int r3 = r9.f30921e
            goto L_0x0007
        L_0x004f:
            r5 = 10
            if (r2 != r5) goto L_0x005a
            int r2 = r9.f30922f
            int r2 = r2 + r6
            r9.f30922f = r2
            r9.f30923g = r7
        L_0x005a:
            r2 = r7
            goto L_0x0009
        L_0x005c:
            if (r1 != 0) goto L_0x006c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L_0x006c:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r9.f30920d = r2
            boolean r2 = r9.m37999p(r6)
            if (r2 == 0) goto L_0x007a
            goto L_0x0003
        L_0x007a:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.m37998i0(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p183a9.C6517a.m37988K(char):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        m37995f();
     */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m37989Q() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = 0
        L_0x0003:
            int r3 = r6.f30920d
            int r4 = r3 + r2
            int r5 = r6.f30921e
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.f30919c
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005c
            r4 = 10
            if (r3 == r4) goto L_0x005c
            r4 = 12
            if (r3 == r4) goto L_0x005c
            r4 = 13
            if (r3 == r4) goto L_0x005c
            r4 = 32
            if (r3 == r4) goto L_0x005c
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005c
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 58
            if (r3 == r4) goto L_0x005c
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005c;
                case 92: goto L_0x004a;
                case 93: goto L_0x005c;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r6.m37995f()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.f30919c
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.m37999p(r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0003
        L_0x005c:
            r0 = r2
            goto L_0x007e
        L_0x005e:
            if (r1 != 0) goto L_0x006b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L_0x006b:
            char[] r3 = r6.f30919c
            int r4 = r6.f30920d
            r1.append(r3, r4, r2)
            int r3 = r6.f30920d
            int r3 = r3 + r2
            r6.f30920d = r3
            r2 = 1
            boolean r2 = r6.m37999p(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r1 != 0) goto L_0x008a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f30919c
            int r3 = r6.f30920d
            r1.<init>(r2, r3, r0)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.f30919c
            int r3 = r6.f30920d
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L_0x0095:
            int r2 = r6.f30920d
            int r2 = r2 + r0
            r6.f30920d = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p183a9.C6517a.m37989Q():java.lang.String");
    }

    /* renamed from: U */
    private int m37990U() throws IOException {
        String str;
        String str2;
        int i;
        char c = this.f30919c[this.f30920d];
        if (c == 't' || c == 'T') {
            i = 5;
            str2 = "true";
            str = "TRUE";
        } else if (c == 'f' || c == 'F') {
            i = 6;
            str2 = "false";
            str = "FALSE";
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            i = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.f30920d + i2 >= this.f30921e && !m37999p(i2 + 1)) {
                return 0;
            }
            char c2 = this.f30919c[this.f30920d + i2];
            if (c2 != str2.charAt(i2) && c2 != str.charAt(i2)) {
                return 0;
            }
        }
        if ((this.f30920d + length < this.f30921e || m37999p(length + 1)) && m38001w(this.f30919c[this.f30920d + length])) {
            return 0;
        }
        this.f30920d += length;
        this.f30924h = i;
        return i;
    }

    /* renamed from: X */
    private int m37991X() throws IOException {
        char c;
        char[] cArr = this.f30919c;
        int i = this.f30920d;
        int i2 = this.f30921e;
        int i3 = 0;
        int i4 = 0;
        char c2 = 0;
        boolean z = true;
        long j = 0;
        boolean z2 = false;
        while (true) {
            if (i + i4 == i2) {
                if (i4 == cArr.length) {
                    return i3;
                }
                if (!m37999p(i4 + 1)) {
                    break;
                }
                i = this.f30920d;
                i2 = this.f30921e;
            }
            c = cArr[i + i4];
            if (c == '+') {
                i3 = 0;
                if (c2 != 5) {
                    return 0;
                }
            } else if (c == 'E' || c == 'e') {
                i3 = 0;
                if (c2 != 2 && c2 != 4) {
                    return 0;
                }
                c2 = 5;
                i4++;
            } else {
                if (c == '-') {
                    i3 = 0;
                    if (c2 == 0) {
                        c2 = 1;
                        z2 = true;
                    } else if (c2 != 5) {
                        return 0;
                    }
                } else if (c == '.') {
                    i3 = 0;
                    if (c2 != 2) {
                        return 0;
                    }
                    c2 = 3;
                } else if (c >= '0' && c <= '9') {
                    if (c2 == 1 || c2 == 0) {
                        j = (long) (-(c - '0'));
                        i3 = 0;
                        c2 = 2;
                    } else {
                        if (c2 == 2) {
                            if (j == 0) {
                                return 0;
                            }
                            long j2 = (10 * j) - ((long) (c - '0'));
                            int i5 = (j > -922337203685477580L ? 1 : (j == -922337203685477580L ? 0 : -1));
                            z &= i5 > 0 || (i5 == 0 && j2 < j);
                            j = j2;
                        } else if (c2 == 3) {
                            i3 = 0;
                            c2 = 4;
                        } else if (c2 == 5 || c2 == 6) {
                            i3 = 0;
                            c2 = 7;
                        }
                        i3 = 0;
                    }
                }
                i4++;
            }
            c2 = 6;
            i4++;
        }
        if (m38001w(c)) {
            return 0;
        }
        if (c2 == 2 && z && ((j != Long.MIN_VALUE || z2) && (j != 0 || !z2))) {
            if (!z2) {
                j = -j;
            }
            this.f30925i = j;
            this.f30920d += i4;
            this.f30924h = 15;
            return 15;
        } else if (c2 != 2 && c2 != 4 && c2 != 7) {
            return 0;
        } else {
            this.f30926r = i4;
            this.f30924h = 16;
            return 16;
        }
    }

    /* renamed from: Y */
    private void m37992Y(int i) {
        int i2 = this.f30929u;
        int[] iArr = this.f30928t;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.f30928t = Arrays.copyOf(iArr, i3);
            this.f30931w = Arrays.copyOf(this.f30931w, i3);
            this.f30930v = (String[]) Arrays.copyOf(this.f30930v, i3);
        }
        int[] iArr2 = this.f30928t;
        int i4 = this.f30929u;
        this.f30929u = i4 + 1;
        iArr2[i4] = i;
    }

    /* renamed from: c0 */
    private char m37993c0() throws IOException {
        int i;
        int i2;
        if (this.f30920d != this.f30921e || m37999p(1)) {
            char[] cArr = this.f30919c;
            int i3 = this.f30920d;
            int i4 = i3 + 1;
            this.f30920d = i4;
            char c = cArr[i3];
            if (c == 10) {
                this.f30922f++;
                this.f30923g = i4;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return 8;
                }
                if (c == 'f') {
                    return 12;
                }
                if (c == 'n') {
                    return 10;
                }
                if (c == 'r') {
                    return 13;
                }
                if (c == 't') {
                    return 9;
                }
                if (c != 'u') {
                    throw m37998i0("Invalid escape sequence");
                } else if (i4 + 4 <= this.f30921e || m37999p(4)) {
                    char c2 = 0;
                    int i5 = this.f30920d;
                    int i6 = i5 + 4;
                    while (i5 < i6) {
                        char c3 = this.f30919c[i5];
                        char c4 = (char) (c2 << 4);
                        if (c3 < '0' || c3 > '9') {
                            if (c3 >= 'a' && c3 <= 'f') {
                                i = c3 - 'a';
                            } else if (c3 < 'A' || c3 > 'F') {
                                throw new NumberFormatException("\\u" + new String(this.f30919c, this.f30920d, 4));
                            } else {
                                i = c3 - 'A';
                            }
                            i2 = i + 10;
                        } else {
                            i2 = c3 - '0';
                        }
                        c2 = (char) (c4 + i2);
                        i5++;
                    }
                    this.f30920d += 4;
                    return c2;
                } else {
                    throw m37998i0("Unterminated escape sequence");
                }
            }
            return c;
        }
        throw m37998i0("Unterminated escape sequence");
    }

    /* renamed from: d0 */
    private boolean m37994d0(String str) throws IOException {
        int length = str.length();
        while (true) {
            int i = 0;
            if (this.f30920d + length > this.f30921e && !m37999p(length)) {
                return false;
            }
            char[] cArr = this.f30919c;
            int i2 = this.f30920d;
            if (cArr[i2] == 10) {
                this.f30922f++;
                this.f30923g = i2 + 1;
            } else {
                while (i < length) {
                    if (this.f30919c[this.f30920d + i] == str.charAt(i)) {
                        i++;
                    }
                }
                return true;
            }
            this.f30920d++;
        }
    }

    /* renamed from: f */
    private void m37995f() throws IOException {
        if (!this.f30918b) {
            throw m37998i0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: f0 */
    private void m37996f0() throws IOException {
        char c;
        do {
            if (this.f30920d < this.f30921e || m37999p(1)) {
                char[] cArr = this.f30919c;
                int i = this.f30920d;
                int i2 = i + 1;
                this.f30920d = i2;
                c = cArr[i];
                if (c == 10) {
                    this.f30922f++;
                    this.f30923g = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != 13);
    }

    /* renamed from: g */
    private void m37997g() throws IOException {
        m37987H(true);
        int i = this.f30920d - 1;
        this.f30920d = i;
        if (i + 5 <= this.f30921e || m37999p(5)) {
            int i2 = this.f30920d;
            char[] cArr = this.f30919c;
            if (cArr[i2] == ')' && cArr[i2 + 1] == ']' && cArr[i2 + 2] == '}' && cArr[i2 + 3] == '\'' && cArr[i2 + 4] == 10) {
                this.f30920d = i2 + 5;
            }
        }
    }

    /* renamed from: i0 */
    private IOException m37998i0(String str) throws IOException {
        throw new C6520c(str + mo22111x());
    }

    /* renamed from: p */
    private boolean m37999p(int i) throws IOException {
        int i2;
        int i3;
        char[] cArr = this.f30919c;
        int i4 = this.f30923g;
        int i5 = this.f30920d;
        this.f30923g = i4 - i5;
        int i6 = this.f30921e;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f30921e = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f30921e = 0;
        }
        this.f30920d = 0;
        do {
            Reader reader = this.f30917a;
            int i8 = this.f30921e;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.f30921e + read;
            this.f30921e = i2;
            if (this.f30922f == 0 && (i3 = this.f30923g) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f30920d++;
                this.f30923g = i3 + 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    /* renamed from: q */
    private String m38000q(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (true) {
            int i2 = this.f30929u;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.f30928t[i];
            if (i3 == 1 || i3 == 2) {
                int i4 = this.f30931w[i];
                if (z && i4 > 0 && i == i2 - 1) {
                    i4--;
                }
                sb.append('[');
                sb.append(i4);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String[] strArr = this.f30930v;
                if (strArr[i] != null) {
                    sb.append(strArr[i]);
                }
            }
            i++;
        }
    }

    /* renamed from: w */
    private boolean m38001w(char c) throws IOException {
        if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (!(c == '/' || c == '=')) {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case C8710R.styleable.AppCompatTheme_radioButtonStyle /*91*/:
                        case C8710R.styleable.AppCompatTheme_ratingBarStyleIndicator /*93*/:
                            return false;
                        case C8710R.styleable.AppCompatTheme_ratingBarStyle /*92*/:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m37995f();
        return false;
    }

    /* renamed from: D */
    public boolean mo22096D() throws IOException {
        int i = this.f30924h;
        if (i == 0) {
            i = mo22106h();
        }
        if (i == 5) {
            this.f30924h = 0;
            int[] iArr = this.f30931w;
            int i2 = this.f30929u - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f30924h = 0;
            int[] iArr2 = this.f30931w;
            int i3 = this.f30929u - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + mo22101S() + mo22111x());
        }
    }

    /* renamed from: F */
    public double mo22097F() throws IOException {
        int i = this.f30924h;
        if (i == 0) {
            i = mo22106h();
        }
        if (i == 15) {
            this.f30924h = 0;
            int[] iArr = this.f30931w;
            int i2 = this.f30929u - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f30925i;
        }
        if (i == 16) {
            this.f30927s = new String(this.f30919c, this.f30920d, this.f30926r);
            this.f30920d += this.f30926r;
        } else if (i == 8 || i == 9) {
            this.f30927s = m37988K(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.f30927s = m37989Q();
        } else if (i != 11) {
            throw new IllegalStateException("Expected a double but was " + mo22101S() + mo22111x());
        }
        this.f30924h = 11;
        double parseDouble = Double.parseDouble(this.f30927s);
        if (this.f30918b || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f30927s = null;
            this.f30924h = 0;
            int[] iArr2 = this.f30931w;
            int i3 = this.f30929u - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        throw new C6520c("JSON forbids NaN and infinities: " + parseDouble + mo22111x());
    }

    /* renamed from: G */
    public String mo22098G() throws IOException {
        String str;
        int i = this.f30924h;
        if (i == 0) {
            i = mo22106h();
        }
        if (i == 14) {
            str = m37989Q();
        } else if (i == 12) {
            str = m37988K('\'');
        } else if (i == 13) {
            str = m37988K('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + mo22101S() + mo22111x());
        }
        this.f30924h = 0;
        this.f30930v[this.f30929u - 1] = str;
        return str;
    }

    /* renamed from: I */
    public void mo22099I() throws IOException {
        int i = this.f30924h;
        if (i == 0) {
            i = mo22106h();
        }
        if (i == 7) {
            this.f30924h = 0;
            int[] iArr = this.f30931w;
            int i2 = this.f30929u - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + mo22101S() + mo22111x());
    }

    /* renamed from: L */
    public String mo22100L() throws IOException {
        String str;
        int i = this.f30924h;
        if (i == 0) {
            i = mo22106h();
        }
        if (i == 10) {
            str = m37989Q();
        } else if (i == 8) {
            str = m37988K('\'');
        } else if (i == 9) {
            str = m37988K('\"');
        } else if (i == 11) {
            str = this.f30927s;
            this.f30927s = null;
        } else if (i == 15) {
            str = Long.toString(this.f30925i);
        } else if (i == 16) {
            str = new String(this.f30919c, this.f30920d, this.f30926r);
            this.f30920d += this.f30926r;
        } else {
            throw new IllegalStateException("Expected a string but was " + mo22101S() + mo22111x());
        }
        this.f30924h = 0;
        int[] iArr = this.f30931w;
        int i2 = this.f30929u - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: S */
    public C6519b mo22101S() throws IOException {
        int i = this.f30924h;
        if (i == 0) {
            i = mo22106h();
        }
        switch (i) {
            case 1:
                return C6519b.BEGIN_OBJECT;
            case 2:
                return C6519b.END_OBJECT;
            case 3:
                return C6519b.BEGIN_ARRAY;
            case 4:
                return C6519b.END_ARRAY;
            case 5:
            case 6:
                return C6519b.BOOLEAN;
            case 7:
                return C6519b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C6519b.STRING;
            case 12:
            case 13:
            case 14:
                return C6519b.NAME;
            case 15:
            case 16:
                return C6519b.NUMBER;
            case 17:
                return C6519b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: Y0 */
    public String mo22102Y0() {
        return m38000q(false);
    }

    /* renamed from: a */
    public void mo22103a() throws IOException {
        int i = this.f30924h;
        if (i == 0) {
            i = mo22106h();
        }
        if (i == 3) {
            m37992Y(1);
            this.f30931w[this.f30929u - 1] = 0;
            this.f30924h = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + mo22101S() + mo22111x());
    }

    /* renamed from: b */
    public void mo22104b() throws IOException {
        int i = this.f30924h;
        if (i == 0) {
            i = mo22106h();
        }
        if (i == 1) {
            m37992Y(3);
            this.f30924h = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + mo22101S() + mo22111x());
    }

    public void close() throws IOException {
        this.f30924h = 0;
        this.f30928t[0] = 8;
        this.f30929u = 1;
        this.f30917a.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo22106h() throws IOException {
        int H;
        int[] iArr = this.f30928t;
        int i = this.f30929u;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int H2 = m37987H(true);
            if (H2 != 44) {
                if (H2 == 59) {
                    m37995f();
                } else if (H2 == 93) {
                    this.f30924h = 4;
                    return 4;
                } else {
                    throw m37998i0("Unterminated array");
                }
            }
        } else if (i2 == 3 || i2 == 5) {
            iArr[i - 1] = 4;
            if (i2 == 5 && (H = m37987H(true)) != 44) {
                if (H == 59) {
                    m37995f();
                } else if (H == 125) {
                    this.f30924h = 2;
                    return 2;
                } else {
                    throw m37998i0("Unterminated object");
                }
            }
            int H3 = m37987H(true);
            if (H3 == 34) {
                this.f30924h = 13;
                return 13;
            } else if (H3 == 39) {
                m37995f();
                this.f30924h = 12;
                return 12;
            } else if (H3 != 125) {
                m37995f();
                this.f30920d--;
                if (m38001w((char) H3)) {
                    this.f30924h = 14;
                    return 14;
                }
                throw m37998i0("Expected name");
            } else if (i2 != 5) {
                this.f30924h = 2;
                return 2;
            } else {
                throw m37998i0("Expected name");
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            int H4 = m37987H(true);
            if (H4 != 58) {
                if (H4 == 61) {
                    m37995f();
                    if (this.f30920d < this.f30921e || m37999p(1)) {
                        char[] cArr = this.f30919c;
                        int i3 = this.f30920d;
                        if (cArr[i3] == '>') {
                            this.f30920d = i3 + 1;
                        }
                    }
                } else {
                    throw m37998i0("Expected ':'");
                }
            }
        } else if (i2 == 6) {
            if (this.f30918b) {
                m37997g();
            }
            this.f30928t[this.f30929u - 1] = 7;
        } else if (i2 == 7) {
            if (m37987H(false) == -1) {
                this.f30924h = 17;
                return 17;
            }
            m37995f();
            this.f30920d--;
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int H5 = m37987H(true);
        if (H5 == 34) {
            this.f30924h = 9;
            return 9;
        } else if (H5 != 39) {
            if (!(H5 == 44 || H5 == 59)) {
                if (H5 == 91) {
                    this.f30924h = 3;
                    return 3;
                } else if (H5 != 93) {
                    if (H5 != 123) {
                        this.f30920d--;
                        int U = m37990U();
                        if (U != 0) {
                            return U;
                        }
                        int X = m37991X();
                        if (X != 0) {
                            return X;
                        }
                        if (m38001w(this.f30919c[this.f30920d])) {
                            m37995f();
                            this.f30924h = 10;
                            return 10;
                        }
                        throw m37998i0("Expected value");
                    }
                    this.f30924h = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.f30924h = 4;
                    return 4;
                }
            }
            if (i2 == 1 || i2 == 2) {
                m37995f();
                this.f30920d--;
                this.f30924h = 7;
                return 7;
            }
            throw m37998i0("Unexpected value");
        } else {
            m37995f();
            this.f30924h = 8;
            return 8;
        }
    }

    /* renamed from: m */
    public void mo22107m() throws IOException {
        int i = this.f30924h;
        if (i == 0) {
            i = mo22106h();
        }
        if (i == 4) {
            int i2 = this.f30929u - 1;
            this.f30929u = i2;
            int[] iArr = this.f30931w;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f30924h = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + mo22101S() + mo22111x());
    }

    /* renamed from: n */
    public void mo22108n() throws IOException {
        int i = this.f30924h;
        if (i == 0) {
            i = mo22106h();
        }
        if (i == 2) {
            int i2 = this.f30929u - 1;
            this.f30929u = i2;
            this.f30930v[i2] = null;
            int[] iArr = this.f30931w;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f30924h = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + mo22101S() + mo22111x());
    }

    /* renamed from: t */
    public boolean mo22109t() throws IOException {
        int i = this.f30924h;
        if (i == 0) {
            i = mo22106h();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }

    public String toString() {
        return getClass().getSimpleName() + mo22111x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public String mo22111x() {
        return " at line " + (this.f30922f + 1) + " column " + ((this.f30920d - this.f30923g) + 1) + " path " + mo22102Y0();
    }
}
