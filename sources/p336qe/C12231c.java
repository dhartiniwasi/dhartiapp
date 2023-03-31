package p336qe;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* renamed from: qe.c */
/* compiled from: Buffer */
public final class C12231c implements C12234e, C12233d, Cloneable, ByteChannel {

    /* renamed from: c */
    private static final byte[] f45376c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: a */
    C12248p f45377a;

    /* renamed from: b */
    long f45378b;

    /* renamed from: qe.c$a */
    /* compiled from: Buffer */
    class C12232a extends OutputStream {
        C12232a() {
        }

        public void close() {
        }

        public void flush() {
        }

        public String toString() {
            return C12231c.this + ".outputStream()";
        }

        public void write(int i) {
            C12231c.this.mo36787a0((byte) i);
        }

        public void write(byte[] bArr, int i, int i2) {
            C12231c.this.mo36816s(bArr, i, i2);
        }
    }

    /* renamed from: B */
    public C12235f mo36762B(long j) throws EOFException {
        return new C12235f(mo36785Z0(j));
    }

    /* renamed from: B0 */
    public C12231c mo36763B0(int i) {
        if (i < 128) {
            mo36787a0(i);
        } else if (i < 2048) {
            mo36787a0((i >> 6) | 192);
            mo36787a0((i & 63) | 128);
        } else if (i < 65536) {
            if (i < 55296 || i > 57343) {
                mo36787a0((i >> 12) | 224);
                mo36787a0(((i >> 6) & 63) | 128);
                mo36787a0((i & 63) | 128);
            } else {
                mo36787a0(63);
            }
        } else if (i <= 1114111) {
            mo36787a0((i >> 18) | 240);
            mo36787a0(((i >> 12) & 63) | 128);
            mo36787a0(((i >> 6) & 63) | 128);
            mo36787a0((i & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
        return this;
    }

    /* renamed from: D */
    public String mo36764D(long j, Charset charset) throws EOFException {
        C12255v.m58892b(this.f45378b, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        } else if (j == 0) {
            return "";
        } else {
            C12248p pVar = this.f45377a;
            int i = pVar.f45412b;
            if (((long) i) + j > ((long) pVar.f45413c)) {
                return new String(mo36785Z0(j), charset);
            }
            String str = new String(pVar.f45411a, i, (int) j, charset);
            int i2 = (int) (((long) pVar.f45412b) + j);
            pVar.f45412b = i2;
            this.f45378b -= j;
            if (i2 == pVar.f45413c) {
                this.f45377a = pVar.mo36877b();
                C12249q.m58859a(pVar);
            }
            return str;
        }
    }

    /* renamed from: E1 */
    public long mo36765E1(byte b) {
        return mo36807n(b, 0, Long.MAX_VALUE);
    }

    /* renamed from: F */
    public String mo36766F() {
        try {
            return mo36764D(this.f45378b, C12255v.f45426a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: G */
    public String mo36767G(long j) throws EOFException {
        return mo36764D(j, C12255v.f45426a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        if (r8 != r9) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
        r15.f45377a = r6.mo36877b();
        p336qe.C12249q.m58859a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
        r6.f45412b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009f, code lost:
        if (r1 != false) goto L_0x00a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0076 A[SYNTHETIC] */
    /* renamed from: G1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo36769G1() {
        /*
            r15 = this;
            long r0 = r15.f45378b
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00ac
            r0 = 0
            r4 = r2
            r1 = 0
        L_0x000b:
            qe.p r6 = r15.f45377a
            byte[] r7 = r6.f45411a
            int r8 = r6.f45412b
            int r9 = r6.f45413c
        L_0x0013:
            if (r8 >= r9) goto L_0x0091
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0022
            r11 = 57
            if (r10 > r11) goto L_0x0022
            int r11 = r10 + -48
            goto L_0x003a
        L_0x0022:
            r11 = 97
            if (r10 < r11) goto L_0x002f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x002f
            int r11 = r10 + -97
        L_0x002c:
            int r11 = r11 + 10
            goto L_0x003a
        L_0x002f:
            r11 = 65
            if (r10 < r11) goto L_0x0072
            r11 = 70
            if (r10 > r11) goto L_0x0072
            int r11 = r10 + -65
            goto L_0x002c
        L_0x003a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x004a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0013
        L_0x004a:
            qe.c r0 = new qe.c
            r0.<init>()
            qe.c r0 = r0.mo36768G0(r4)
            qe.c r0 = r0.mo36787a0(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.mo36766F()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0072:
            if (r0 == 0) goto L_0x0076
            r1 = 1
            goto L_0x0091
        L_0x0076:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0091:
            if (r8 != r9) goto L_0x009d
            qe.p r7 = r6.mo36877b()
            r15.f45377a = r7
            p336qe.C12249q.m58859a(r6)
            goto L_0x009f
        L_0x009d:
            r6.f45412b = r8
        L_0x009f:
            if (r1 != 0) goto L_0x00a5
            qe.p r6 = r15.f45377a
            if (r6 != 0) goto L_0x000b
        L_0x00a5:
            long r1 = r15.f45378b
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f45378b = r1
            return r4
        L_0x00ac:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p336qe.C12231c.mo36769G1():long");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public String mo36770H(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (mo36806m(j2) == 13) {
                String G = mo36767G(j2);
                skip(2);
                return G;
            }
        }
        String G2 = mo36767G(j);
        skip(1);
        return G2;
    }

    /* renamed from: I */
    public final long mo36771I() {
        return this.f45378b;
    }

    /* renamed from: K */
    public final C12235f mo36773K() {
        long j = this.f45378b;
        if (j <= 2147483647L) {
            return mo36774L((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f45378b);
    }

    /* renamed from: L */
    public final C12235f mo36774L(int i) {
        if (i == 0) {
            return C12235f.f45381e;
        }
        return new C12250r(this, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public C12248p mo36776Q(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        C12248p pVar = this.f45377a;
        if (pVar == null) {
            C12248p b = C12249q.m58860b();
            this.f45377a = b;
            b.f45417g = b;
            b.f45416f = b;
            return b;
        }
        C12248p pVar2 = pVar.f45417g;
        return (pVar2.f45413c + i > 8192 || !pVar2.f45415e) ? pVar2.mo36878c(C12249q.m58860b()) : pVar2;
    }

    /* renamed from: S */
    public C12231c mo36777S(C12235f fVar) {
        if (fVar != null) {
            fVar.mo36833C(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    /* renamed from: U */
    public C12231c mo36792e1(byte[] bArr) {
        if (bArr != null) {
            return mo36816s(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: V */
    public byte[] mo36779V() {
        try {
            return mo36785Z0(this.f45378b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: W */
    public C12231c mo36780W() {
        return this;
    }

    /* renamed from: W0 */
    public String mo36781W0() throws EOFException {
        return mo36805l0(Long.MAX_VALUE);
    }

    /* renamed from: X0 */
    public int mo36782X0() {
        return C12255v.m58893c(readInt());
    }

    /* renamed from: Y */
    public C12231c mo36816s(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            C12255v.m58892b((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                C12248p Q = mo36776Q(1);
                int min = Math.min(i3 - i, 8192 - Q.f45413c);
                System.arraycopy(bArr, i, Q.f45411a, Q.f45413c, min);
                i += min;
                Q.f45413c += min;
            }
            this.f45378b += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: Z */
    public boolean mo36784Z() {
        return this.f45378b == 0;
    }

    /* renamed from: Z0 */
    public byte[] mo36785Z0(long j) throws EOFException {
        C12255v.m58892b(this.f45378b, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    /* renamed from: a */
    public final void mo36786a() {
        try {
            skip(this.f45378b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public C12231c clone() {
        C12231c cVar = new C12231c();
        if (this.f45378b == 0) {
            return cVar;
        }
        C12248p d = this.f45377a.mo36879d();
        cVar.f45377a = d;
        d.f45417g = d;
        d.f45416f = d;
        C12248p pVar = this.f45377a;
        while (true) {
            pVar = pVar.f45416f;
            if (pVar != this.f45377a) {
                cVar.f45377a.f45417g.mo36878c(pVar.mo36879d());
            } else {
                cVar.f45378b = this.f45378b;
                return cVar;
            }
        }
    }

    /* renamed from: c0 */
    public long mo36789c0(C12252t tVar) throws IOException {
        if (tVar != null) {
            long j = 0;
            while (true) {
                long z = tVar.mo33810z(this, 8192);
                if (z == -1) {
                    return j;
                }
                j += z;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public void close() {
    }

    /* renamed from: d0 */
    public C12231c mo36787a0(int i) {
        C12248p Q = mo36776Q(1);
        byte[] bArr = Q.f45411a;
        int i2 = Q.f45413c;
        Q.f45413c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f45378b++;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12231c)) {
            return false;
        }
        C12231c cVar = (C12231c) obj;
        long j = this.f45378b;
        if (j != cVar.f45378b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C12248p pVar = this.f45377a;
        C12248p pVar2 = cVar.f45377a;
        int i = pVar.f45412b;
        int i2 = pVar2.f45412b;
        while (j2 < this.f45378b) {
            long min = (long) Math.min(pVar.f45413c - i, pVar2.f45413c - i2);
            int i3 = 0;
            while (((long) i3) < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (pVar.f45411a[i] != pVar2.f45411a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == pVar.f45413c) {
                pVar = pVar.f45416f;
                i = pVar.f45412b;
            }
            if (i2 == pVar2.f45413c) {
                pVar2 = pVar2.f45416f;
                i2 = pVar2.f45412b;
            }
            j2 += min;
        }
        return true;
    }

    /* renamed from: f */
    public final long mo36794f() {
        long j = this.f45378b;
        if (j == 0) {
            return 0;
        }
        C12248p pVar = this.f45377a.f45417g;
        int i = pVar.f45413c;
        return (i >= 8192 || !pVar.f45415e) ? j : j - ((long) (i - pVar.f45412b));
    }

    /* renamed from: f0 */
    public C12231c mo36768G0(long j) {
        if (j == 0) {
            return mo36787a0(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C12248p Q = mo36776Q(numberOfTrailingZeros);
        byte[] bArr = Q.f45411a;
        int i = Q.f45413c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f45376c[(int) (15 & j)];
            j >>>= 4;
        }
        Q.f45413c += numberOfTrailingZeros;
        this.f45378b += (long) numberOfTrailingZeros;
        return this;
    }

    public void flush() {
    }

    /* renamed from: g */
    public final C12231c mo36796g(C12231c cVar, long j, long j2) {
        if (cVar != null) {
            C12255v.m58892b(this.f45378b, j, j2);
            if (j2 == 0) {
                return this;
            }
            cVar.f45378b += j2;
            C12248p pVar = this.f45377a;
            while (true) {
                int i = pVar.f45413c;
                int i2 = pVar.f45412b;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                pVar = pVar.f45416f;
            }
            while (j2 > 0) {
                C12248p d = pVar.mo36879d();
                int i3 = (int) (((long) d.f45412b) + j);
                d.f45412b = i3;
                d.f45413c = Math.min(i3 + ((int) j2), d.f45413c);
                C12248p pVar2 = cVar.f45377a;
                if (pVar2 == null) {
                    d.f45417g = d;
                    d.f45416f = d;
                    cVar.f45377a = d;
                } else {
                    pVar2.f45417g.mo36878c(d);
                }
                j2 -= (long) (d.f45413c - d.f45412b);
                pVar = pVar.f45416f;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    /* renamed from: h */
    public C12231c mo36803j0() {
        return this;
    }

    public int hashCode() {
        C12248p pVar = this.f45377a;
        if (pVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = pVar.f45413c;
            for (int i3 = pVar.f45412b; i3 < i2; i3++) {
                i = (i * 31) + pVar.f45411a[i3];
            }
            pVar = pVar.f45416f;
        } while (pVar != this.f45377a);
        return i;
    }

    /* renamed from: i0 */
    public C12231c mo36775O(int i) {
        C12248p Q = mo36776Q(4);
        byte[] bArr = Q.f45411a;
        int i2 = Q.f45413c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        Q.f45413c = i5 + 1;
        this.f45378b += 4;
        return this;
    }

    /* renamed from: i1 */
    public short mo36800i1() {
        return C12255v.m58894d(readShort());
    }

    public boolean isOpen() {
        return true;
    }

    /* renamed from: j */
    public C12231c mo36802j() {
        return this;
    }

    /* renamed from: k0 */
    public C12231c mo36772J(int i) {
        C12248p Q = mo36776Q(2);
        byte[] bArr = Q.f45411a;
        int i2 = Q.f45413c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        Q.f45413c = i3 + 1;
        this.f45378b += 2;
        return this;
    }

    /* renamed from: k1 */
    public void mo35694k1(C12231c cVar, long j) {
        int i;
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (cVar != this) {
            C12255v.m58892b(cVar.f45378b, 0, j);
            while (j > 0) {
                C12248p pVar = cVar.f45377a;
                if (j < ((long) (pVar.f45413c - pVar.f45412b))) {
                    C12248p pVar2 = this.f45377a;
                    C12248p pVar3 = pVar2 != null ? pVar2.f45417g : null;
                    if (pVar3 != null && pVar3.f45415e) {
                        long j2 = ((long) pVar3.f45413c) + j;
                        if (pVar3.f45414d) {
                            i = 0;
                        } else {
                            i = pVar3.f45412b;
                        }
                        if (j2 - ((long) i) <= 8192) {
                            pVar.mo36881f(pVar3, (int) j);
                            cVar.f45378b -= j;
                            this.f45378b += j;
                            return;
                        }
                    }
                    cVar.f45377a = pVar.mo36880e((int) j);
                }
                C12248p pVar4 = cVar.f45377a;
                long j3 = (long) (pVar4.f45413c - pVar4.f45412b);
                cVar.f45377a = pVar4.mo36877b();
                C12248p pVar5 = this.f45377a;
                if (pVar5 == null) {
                    this.f45377a = pVar4;
                    pVar4.f45417g = pVar4;
                    pVar4.f45416f = pVar4;
                } else {
                    pVar5.f45417g.mo36878c(pVar4).mo36876a();
                }
                cVar.f45378b -= j3;
                this.f45378b += j3;
                j -= j3;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    /* renamed from: l0 */
    public String mo36805l0(long j) throws EOFException {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long n = mo36807n((byte) 10, 0, j2);
            if (n != -1) {
                return mo36770H(n);
            }
            if (j2 < mo36771I() && mo36806m(j2 - 1) == 13 && mo36806m(j2) == 10) {
                return mo36770H(j2);
            }
            C12231c cVar = new C12231c();
            mo36796g(cVar, 0, Math.min(32, mo36771I()));
            throw new EOFException("\\n not found: limit=" + Math.min(mo36771I(), j) + " content=" + cVar.mo36823x().mo36840q() + 8230);
        }
        throw new IllegalArgumentException("limit < 0: " + j);
    }

    /* renamed from: m */
    public final byte mo36806m(long j) {
        int i;
        C12255v.m58892b(this.f45378b, j, 1);
        long j2 = this.f45378b;
        if (j2 - j > j) {
            C12248p pVar = this.f45377a;
            while (true) {
                int i2 = pVar.f45413c;
                int i3 = pVar.f45412b;
                long j3 = (long) (i2 - i3);
                if (j < j3) {
                    return pVar.f45411a[i3 + ((int) j)];
                }
                j -= j3;
                pVar = pVar.f45416f;
            }
        } else {
            long j4 = j - j2;
            C12248p pVar2 = this.f45377a;
            do {
                pVar2 = pVar2.f45417g;
                int i4 = pVar2.f45413c;
                i = pVar2.f45412b;
                j4 += (long) (i4 - i);
            } while (j4 < 0);
            return pVar2.f45411a[i + ((int) j4)];
        }
    }

    /* renamed from: n */
    public long mo36807n(byte b, long j, long j2) {
        C12248p pVar;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.f45378b), Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j4 = this.f45378b;
        long j5 = j2 > j4 ? j4 : j2;
        if (j == j5 || (pVar = this.f45377a) == null) {
            return -1;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                pVar = pVar.f45417g;
                j4 -= (long) (pVar.f45413c - pVar.f45412b);
            }
        } else {
            while (true) {
                long j6 = ((long) (pVar.f45413c - pVar.f45412b)) + j3;
                if (j6 >= j) {
                    break;
                }
                pVar = pVar.f45416f;
                j3 = j6;
            }
            j4 = j3;
        }
        long j7 = j;
        while (j4 < j5) {
            byte[] bArr = pVar.f45411a;
            int min = (int) Math.min((long) pVar.f45413c, (((long) pVar.f45412b) + j5) - j4);
            for (int i = (int) ((((long) pVar.f45412b) + j7) - j4); i < min; i++) {
                if (bArr[i] == b) {
                    return ((long) (i - pVar.f45412b)) + j4;
                }
            }
            byte b2 = b;
            j4 += (long) (pVar.f45413c - pVar.f45412b);
            pVar = pVar.f45416f;
            j7 = j4;
        }
        return -1;
    }

    /* renamed from: o */
    public C12253u mo33809o() {
        return C12253u.f45422d;
    }

    /* renamed from: p */
    public OutputStream mo36808p() {
        return new C12232a();
    }

    /* renamed from: r0 */
    public C12231c mo36809r0(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(C12255v.f45426a)) {
            return mo36824y0(str, i, i2);
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            return mo36816s(bytes, 0, bytes.length);
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        C12255v.m58892b((long) bArr.length, (long) i, (long) i2);
        C12248p pVar = this.f45377a;
        if (pVar == null) {
            return -1;
        }
        int min = Math.min(i2, pVar.f45413c - pVar.f45412b);
        System.arraycopy(pVar.f45411a, pVar.f45412b, bArr, i, min);
        int i3 = pVar.f45412b + min;
        pVar.f45412b = i3;
        this.f45378b -= (long) min;
        if (i3 == pVar.f45413c) {
            this.f45377a = pVar.mo36877b();
            C12249q.m58859a(pVar);
        }
        return min;
    }

    public byte readByte() {
        long j = this.f45378b;
        if (j != 0) {
            C12248p pVar = this.f45377a;
            int i = pVar.f45412b;
            int i2 = pVar.f45413c;
            int i3 = i + 1;
            byte b = pVar.f45411a[i];
            this.f45378b = j - 1;
            if (i3 == i2) {
                this.f45377a = pVar.mo36877b();
                C12249q.m58859a(pVar);
            } else {
                pVar.f45412b = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    public void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    public int readInt() {
        long j = this.f45378b;
        if (j >= 4) {
            C12248p pVar = this.f45377a;
            int i = pVar.f45412b;
            int i2 = pVar.f45413c;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = pVar.f45411a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            this.f45378b = j - 4;
            if (i6 == i2) {
                this.f45377a = pVar.mo36877b();
                C12249q.m58859a(pVar);
            } else {
                pVar.f45412b = i6;
            }
            return b3;
        }
        throw new IllegalStateException("size < 4: " + this.f45378b);
    }

    public short readShort() {
        long j = this.f45378b;
        if (j >= 2) {
            C12248p pVar = this.f45377a;
            int i = pVar.f45412b;
            int i2 = pVar.f45413c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = pVar.f45411a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.f45378b = j - 2;
            if (i4 == i2) {
                this.f45377a = pVar.mo36877b();
                C12249q.m58859a(pVar);
            } else {
                pVar.f45412b = i4;
            }
            return (short) b;
        }
        throw new IllegalStateException("size < 2: " + this.f45378b);
    }

    public void skip(long j) throws EOFException {
        while (j > 0) {
            C12248p pVar = this.f45377a;
            if (pVar != null) {
                int min = (int) Math.min(j, (long) (pVar.f45413c - pVar.f45412b));
                long j2 = (long) min;
                this.f45378b -= j2;
                j -= j2;
                C12248p pVar2 = this.f45377a;
                int i = pVar2.f45412b + min;
                pVar2.f45412b = i;
                if (i == pVar2.f45413c) {
                    this.f45377a = pVar2.mo36877b();
                    C12249q.m58859a(pVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public String toString() {
        return mo36773K().toString();
    }

    /* renamed from: u0 */
    public final C12231c mo36819u0(OutputStream outputStream, long j) throws IOException {
        if (outputStream != null) {
            C12255v.m58892b(this.f45378b, 0, j);
            C12248p pVar = this.f45377a;
            while (j > 0) {
                int min = (int) Math.min(j, (long) (pVar.f45413c - pVar.f45412b));
                outputStream.write(pVar.f45411a, pVar.f45412b, min);
                int i = pVar.f45412b + min;
                pVar.f45412b = i;
                long j2 = (long) min;
                this.f45378b -= j2;
                j -= j2;
                if (i == pVar.f45413c) {
                    C12248p b = pVar.mo36877b();
                    this.f45377a = b;
                    C12249q.m58859a(pVar);
                    pVar = b;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    /* renamed from: v0 */
    public C12231c mo36821w0(String str) {
        return mo36824y0(str, 0, str.length());
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                C12248p Q = mo36776Q(1);
                int min = Math.min(i, 8192 - Q.f45413c);
                byteBuffer.get(Q.f45411a, Q.f45413c, min);
                i -= min;
                Q.f45413c += min;
            }
            this.f45378b += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: x */
    public C12235f mo36823x() {
        return new C12235f(mo36779V());
    }

    /* renamed from: y0 */
    public C12231c mo36824y0(String str, int i, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    C12248p Q = mo36776Q(1);
                    byte[] bArr = Q.f45411a;
                    int i3 = Q.f45413c - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                    while (i4 < min) {
                        char charAt2 = str.charAt(i4);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i4 + i3] = (byte) charAt2;
                        i4++;
                    }
                    int i5 = Q.f45413c;
                    int i6 = (i3 + i4) - i5;
                    Q.f45413c = i5 + i6;
                    this.f45378b += (long) i6;
                    i = i4;
                } else {
                    if (charAt < 2048) {
                        mo36787a0((charAt >> 6) | 192);
                        mo36787a0((charAt & '?') | 128);
                    } else if (charAt < 55296 || charAt > 57343) {
                        mo36787a0((charAt >> 12) | 224);
                        mo36787a0(((charAt >> 6) & 63) | 128);
                        mo36787a0((charAt & '?') | 128);
                    } else {
                        int i7 = i + 1;
                        char charAt3 = i7 < i2 ? str.charAt(i7) : 0;
                        if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            mo36787a0(63);
                            i = i7;
                        } else {
                            int i8 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 0;
                            mo36787a0((i8 >> 18) | 240);
                            mo36787a0(((i8 >> 12) & 63) | 128);
                            mo36787a0(((i8 >> 6) & 63) | 128);
                            mo36787a0((i8 & 63) | 128);
                            i += 2;
                        }
                    }
                    i++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
    }

    /* renamed from: y1 */
    public void mo36825y1(long j) throws EOFException {
        if (this.f45378b < j) {
            throw new EOFException();
        }
    }

    /* renamed from: z */
    public long mo33810z(C12231c cVar, long j) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j >= 0) {
            long j2 = this.f45378b;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            cVar.mo35694k1(this, j);
            return j;
        } else {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        C12248p pVar = this.f45377a;
        if (pVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), pVar.f45413c - pVar.f45412b);
        byteBuffer.put(pVar.f45411a, pVar.f45412b, min);
        int i = pVar.f45412b + min;
        pVar.f45412b = i;
        this.f45378b -= (long) min;
        if (i == pVar.f45413c) {
            this.f45377a = pVar.mo36877b();
            C12249q.m58859a(pVar);
        }
        return min;
    }
}
