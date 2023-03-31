package p160w2;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p127r2.C5432a;
import p127r2.C5439e;
import p127r2.C5442h;
import p161w3.C5918a0;
import p161w3.C5953m0;
import p161w3.C5961r;
import p161w3.C5980z;
import p182a7.C6408b;

/* renamed from: w2.h */
/* compiled from: Id3Decoder */
public final class C5903h extends C5442h {

    /* renamed from: b */
    public static final C5904a f29027b = C12902g.f47108a;

    /* renamed from: a */
    private final C5904a f29028a;

    /* renamed from: w2.h$a */
    /* compiled from: Id3Decoder */
    public interface C5904a {
        /* renamed from: a */
        boolean mo20496a(int i, int i2, int i3, int i4, int i5);
    }

    /* renamed from: w2.h$b */
    /* compiled from: Id3Decoder */
    private static final class C5905b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f29029a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean f29030b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final int f29031c;

        public C5905b(int i, boolean z, int i2) {
            this.f29029a = i;
            this.f29030b = z;
            this.f29031c = i2;
        }
    }

    public C5903h() {
        this((C5904a) null);
    }

    /* renamed from: A */
    private static int m34822A(C5918a0 a0Var, int i) {
        byte[] d = a0Var.mo20551d();
        int e = a0Var.mo20552e();
        int i2 = e;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= e + i) {
                return i;
            }
            if ((d[i2] & 255) == 255 && d[i3] == 0) {
                System.arraycopy(d, i2 + 2, d, i3, (i - (i2 - e)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        if ((r10 & 1) != 0) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0086, code lost:
        if ((r10 & 128) != 0) goto L_0x008b;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m34823B(p161w3.C5918a0 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.mo20552e()
        L_0x0008:
            int r3 = r18.mo20548a()     // Catch:{ all -> 0x00af }
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00ab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0022
            int r7 = r18.mo20560m()     // Catch:{ all -> 0x00af }
            long r8 = r18.mo20536E()     // Catch:{ all -> 0x00af }
            int r10 = r18.mo20540I()     // Catch:{ all -> 0x00af }
            goto L_0x002c
        L_0x0022:
            int r7 = r18.mo20537F()     // Catch:{ all -> 0x00af }
            int r8 = r18.mo20537F()     // Catch:{ all -> 0x00af }
            long r8 = (long) r8
            r10 = 0
        L_0x002c:
            r11 = 0
            if (r7 != 0) goto L_0x003a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x003a
            if (r10 != 0) goto L_0x003a
            r1.mo20546O(r2)
            return r4
        L_0x003a:
            r7 = 4
            if (r0 != r7) goto L_0x006b
            if (r21 != 0) goto L_0x006b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x004b
            r1.mo20546O(r2)
            return r6
        L_0x004b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L_0x006b:
            if (r0 != r7) goto L_0x007b
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0073
            r3 = 1
            goto L_0x0074
        L_0x0073:
            r3 = 0
        L_0x0074:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x0079
            goto L_0x008b
        L_0x0079:
            r4 = 0
            goto L_0x008b
        L_0x007b:
            if (r0 != r3) goto L_0x0089
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0083
            r3 = 1
            goto L_0x0084
        L_0x0083:
            r3 = 0
        L_0x0084:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0079
            goto L_0x008b
        L_0x0089:
            r3 = 0
            goto L_0x0079
        L_0x008b:
            if (r4 == 0) goto L_0x008f
            int r3 = r3 + 4
        L_0x008f:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0098
            r1.mo20546O(r2)
            return r6
        L_0x0098:
            int r3 = r18.mo20548a()     // Catch:{ all -> 0x00af }
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a5
            r1.mo20546O(r2)
            return r6
        L_0x00a5:
            int r3 = (int) r8
            r1.mo20547P(r3)     // Catch:{ all -> 0x00af }
            goto L_0x0008
        L_0x00ab:
            r1.mo20546O(r2)
            return r4
        L_0x00af:
            r0 = move-exception
            r1.mo20546O(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p160w2.C5903h.m34823B(w3.a0, int, int, boolean):boolean");
    }

    /* renamed from: d */
    private static byte[] m34825d(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return C5953m0.f29115f;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    /* renamed from: f */
    private static C5891a m34826f(C5918a0 a0Var, int i, int i2) throws UnsupportedEncodingException {
        int i3;
        String str;
        int C = a0Var.mo20534C();
        String v = m34842v(C);
        int i4 = i - 1;
        byte[] bArr = new byte[i4];
        a0Var.mo20557j(bArr, 0, i4);
        if (i2 == 2) {
            str = "image/" + C6408b.m37506e(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            i3 = 2;
        } else {
            i3 = m34845y(bArr, 0);
            String e = C6408b.m37506e(new String(bArr, 0, i3, "ISO-8859-1"));
            if (e.indexOf(47) == -1) {
                str = "image/" + e;
            } else {
                str = e;
            }
        }
        int i5 = i3 + 2;
        int x = m34844x(bArr, i5, C);
        return new C5891a(str, new String(bArr, i5, x - i5, v), bArr[i3 + 1] & 255, m34825d(bArr, x + m34841u(C), i4));
    }

    /* renamed from: g */
    private static C5893b m34827g(C5918a0 a0Var, int i, String str) {
        byte[] bArr = new byte[i];
        a0Var.mo20557j(bArr, 0, i);
        return new C5893b(str, bArr);
    }

    /* renamed from: h */
    private static C5895c m34828h(C5918a0 a0Var, int i, int i2, boolean z, int i3, C5904a aVar) throws UnsupportedEncodingException {
        C5918a0 a0Var2 = a0Var;
        int e = a0Var.mo20552e();
        int y = m34845y(a0Var.mo20551d(), e);
        String str = new String(a0Var.mo20551d(), e, y - e, "ISO-8859-1");
        a0Var.mo20546O(y + 1);
        int m = a0Var.mo20560m();
        int m2 = a0Var.mo20560m();
        long E = a0Var.mo20536E();
        long j = E == 4294967295L ? -1 : E;
        long E2 = a0Var.mo20536E();
        long j2 = E2 == 4294967295L ? -1 : E2;
        ArrayList arrayList = new ArrayList();
        int i4 = e + i;
        while (a0Var.mo20552e() < i4) {
            C5906i k = m34831k(i2, a0Var, z, i3, aVar);
            if (k != null) {
                arrayList.add(k);
            }
        }
        return new C5895c(str, m, m2, j, j2, (C5906i[]) arrayList.toArray(new C5906i[0]));
    }

    /* renamed from: i */
    private static C5897d m34829i(C5918a0 a0Var, int i, int i2, boolean z, int i3, C5904a aVar) throws UnsupportedEncodingException {
        C5918a0 a0Var2 = a0Var;
        int e = a0Var.mo20552e();
        int y = m34845y(a0Var.mo20551d(), e);
        String str = new String(a0Var.mo20551d(), e, y - e, "ISO-8859-1");
        a0Var2.mo20546O(y + 1);
        int C = a0Var.mo20534C();
        boolean z2 = (C & 2) != 0;
        boolean z3 = (C & 1) != 0;
        int C2 = a0Var.mo20534C();
        String[] strArr = new String[C2];
        for (int i4 = 0; i4 < C2; i4++) {
            int e2 = a0Var.mo20552e();
            int y2 = m34845y(a0Var.mo20551d(), e2);
            strArr[i4] = new String(a0Var.mo20551d(), e2, y2 - e2, "ISO-8859-1");
            a0Var2.mo20546O(y2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = e + i;
        while (a0Var.mo20552e() < i5) {
            C5906i k = m34831k(i2, a0Var2, z, i3, aVar);
            if (k != null) {
                arrayList.add(k);
            }
        }
        return new C5897d(str, z2, z3, strArr, (C5906i[]) arrayList.toArray(new C5906i[0]));
    }

    /* renamed from: j */
    private static C5899e m34830j(C5918a0 a0Var, int i) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int C = a0Var.mo20534C();
        String v = m34842v(C);
        byte[] bArr = new byte[3];
        a0Var.mo20557j(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        a0Var.mo20557j(bArr2, 0, i2);
        int x = m34844x(bArr2, 0, C);
        String str2 = new String(bArr2, 0, x, v);
        int u = x + m34841u(C);
        return new C5899e(str, str2, m34836p(bArr2, u, m34844x(bArr2, u, C), v));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0190, code lost:
        if (r13 == 67) goto L_0x0192;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p160w2.C5906i m34831k(int r19, p161w3.C5918a0 r20, boolean r21, int r22, p160w2.C5903h.C5904a r23) {
        /*
            r0 = r19
            r7 = r20
            int r8 = r20.mo20534C()
            int r9 = r20.mo20534C()
            int r10 = r20.mo20534C()
            r11 = 3
            if (r0 < r11) goto L_0x0019
            int r1 = r20.mo20534C()
            r13 = r1
            goto L_0x001a
        L_0x0019:
            r13 = 0
        L_0x001a:
            r14 = 4
            if (r0 != r14) goto L_0x003c
            int r1 = r20.mo20538G()
            if (r21 != 0) goto L_0x003a
            r2 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r1 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 7
            r2 = r2 | r3
            int r3 = r1 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 14
            r2 = r2 | r3
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 21
            r1 = r1 | r2
        L_0x003a:
            r15 = r1
            goto L_0x0048
        L_0x003c:
            if (r0 != r11) goto L_0x0043
            int r1 = r20.mo20538G()
            goto L_0x003a
        L_0x0043:
            int r1 = r20.mo20537F()
            goto L_0x003a
        L_0x0048:
            if (r0 < r11) goto L_0x0050
            int r1 = r20.mo20540I()
            r6 = r1
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            r16 = 0
            if (r8 != 0) goto L_0x0067
            if (r9 != 0) goto L_0x0067
            if (r10 != 0) goto L_0x0067
            if (r13 != 0) goto L_0x0067
            if (r15 != 0) goto L_0x0067
            if (r6 != 0) goto L_0x0067
            int r0 = r20.mo20553f()
            r7.mo20546O(r0)
            return r16
        L_0x0067:
            int r1 = r20.mo20552e()
            int r5 = r1 + r15
            int r1 = r20.mo20553f()
            java.lang.String r4 = "Id3Decoder"
            if (r5 <= r1) goto L_0x0082
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            p161w3.C5961r.m35215i(r4, r0)
            int r0 = r20.mo20553f()
            r7.mo20546O(r0)
            return r16
        L_0x0082:
            if (r23 == 0) goto L_0x009a
            r1 = r23
            r2 = r19
            r3 = r8
            r12 = r4
            r4 = r9
            r14 = r5
            r5 = r10
            r18 = r6
            r6 = r13
            boolean r1 = r1.mo20496a(r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x009e
            r7.mo20546O(r14)
            return r16
        L_0x009a:
            r12 = r4
            r14 = r5
            r18 = r6
        L_0x009e:
            r1 = 1
            if (r0 != r11) goto L_0x00bc
            r2 = r18
            r3 = r2 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x00a9
            r3 = 1
            goto L_0x00aa
        L_0x00a9:
            r3 = 0
        L_0x00aa:
            r4 = r2 & 64
            if (r4 == 0) goto L_0x00b0
            r4 = 1
            goto L_0x00b1
        L_0x00b0:
            r4 = 0
        L_0x00b1:
            r2 = r2 & 32
            if (r2 == 0) goto L_0x00b7
            r2 = 1
            goto L_0x00b8
        L_0x00b7:
            r2 = 0
        L_0x00b8:
            r17 = r3
            r6 = 0
            goto L_0x00f2
        L_0x00bc:
            r2 = r18
            r3 = 4
            if (r0 != r3) goto L_0x00ec
            r3 = r2 & 64
            if (r3 == 0) goto L_0x00c7
            r3 = 1
            goto L_0x00c8
        L_0x00c7:
            r3 = 0
        L_0x00c8:
            r4 = r2 & 8
            if (r4 == 0) goto L_0x00ce
            r4 = 1
            goto L_0x00cf
        L_0x00ce:
            r4 = 0
        L_0x00cf:
            r5 = r2 & 4
            if (r5 == 0) goto L_0x00d5
            r5 = 1
            goto L_0x00d6
        L_0x00d5:
            r5 = 0
        L_0x00d6:
            r6 = r2 & 2
            if (r6 == 0) goto L_0x00dc
            r6 = 1
            goto L_0x00dd
        L_0x00dc:
            r6 = 0
        L_0x00dd:
            r2 = r2 & r1
            if (r2 == 0) goto L_0x00e3
            r17 = 1
            goto L_0x00e5
        L_0x00e3:
            r17 = 0
        L_0x00e5:
            r2 = r3
            r3 = r17
            r17 = r4
            r4 = r5
            goto L_0x00f2
        L_0x00ec:
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r17 = 0
        L_0x00f2:
            if (r17 != 0) goto L_0x0225
            if (r4 == 0) goto L_0x00f8
            goto L_0x0225
        L_0x00f8:
            if (r2 == 0) goto L_0x00ff
            int r15 = r15 + -1
            r7.mo20547P(r1)
        L_0x00ff:
            if (r3 == 0) goto L_0x0107
            int r15 = r15 + -4
            r1 = 4
            r7.mo20547P(r1)
        L_0x0107:
            if (r6 == 0) goto L_0x010d
            int r15 = m34822A(r7, r15)
        L_0x010d:
            r1 = 84
            r2 = 2
            r3 = 88
            if (r8 != r1) goto L_0x0122
            if (r9 != r3) goto L_0x0122
            if (r10 != r3) goto L_0x0122
            if (r0 == r2) goto L_0x011c
            if (r13 != r3) goto L_0x0122
        L_0x011c:
            w2.m r1 = m34838r(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0122:
            if (r8 != r1) goto L_0x0131
            java.lang.String r1 = m34843w(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            w2.m r1 = m34837q(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x012e:
            r0 = move-exception
            goto L_0x0221
        L_0x0131:
            r4 = 87
            if (r8 != r4) goto L_0x0143
            if (r9 != r3) goto L_0x0143
            if (r10 != r3) goto L_0x0143
            if (r0 == r2) goto L_0x013d
            if (r13 != r3) goto L_0x0143
        L_0x013d:
            w2.n r1 = m34840t(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0143:
            if (r8 != r4) goto L_0x014f
            java.lang.String r1 = m34843w(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            w2.n r1 = m34839s(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x014f:
            r3 = 73
            r4 = 80
            if (r8 != r4) goto L_0x0165
            r5 = 82
            if (r9 != r5) goto L_0x0165
            if (r10 != r3) goto L_0x0165
            r5 = 86
            if (r13 != r5) goto L_0x0165
            w2.l r1 = m34835o(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0165:
            r5 = 71
            r6 = 79
            if (r8 != r5) goto L_0x017d
            r5 = 69
            if (r9 != r5) goto L_0x017d
            if (r10 != r6) goto L_0x017d
            r5 = 66
            if (r13 == r5) goto L_0x0177
            if (r0 != r2) goto L_0x017d
        L_0x0177:
            w2.f r1 = m34832l(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x017d:
            r5 = 65
            r11 = 67
            if (r0 != r2) goto L_0x018a
            if (r8 != r4) goto L_0x0198
            if (r9 != r3) goto L_0x0198
            if (r10 != r11) goto L_0x0198
            goto L_0x0192
        L_0x018a:
            if (r8 != r5) goto L_0x0198
            if (r9 != r4) goto L_0x0198
            if (r10 != r3) goto L_0x0198
            if (r13 != r11) goto L_0x0198
        L_0x0192:
            w2.a r1 = m34826f(r7, r15, r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0198:
            r3 = 77
            if (r8 != r11) goto L_0x01a9
            if (r9 != r6) goto L_0x01a9
            if (r10 != r3) goto L_0x01a9
            if (r13 == r3) goto L_0x01a4
            if (r0 != r2) goto L_0x01a9
        L_0x01a4:
            w2.e r1 = m34830j(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01a9:
            if (r8 != r11) goto L_0x01c3
            r2 = 72
            if (r9 != r2) goto L_0x01c3
            if (r10 != r5) goto L_0x01c3
            if (r13 != r4) goto L_0x01c3
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            w2.c r1 = m34828h(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01c3:
            if (r8 != r11) goto L_0x01db
            if (r9 != r1) goto L_0x01db
            if (r10 != r6) goto L_0x01db
            if (r13 != r11) goto L_0x01db
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            w2.d r1 = m34829i(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01db:
            if (r8 != r3) goto L_0x01ea
            r2 = 76
            if (r9 != r2) goto L_0x01ea
            if (r10 != r2) goto L_0x01ea
            if (r13 != r1) goto L_0x01ea
            w2.k r1 = m34834n(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01ea:
            java.lang.String r1 = m34843w(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            w2.b r1 = m34827g(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
        L_0x01f2:
            if (r1 != 0) goto L_0x0214
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            r2.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r3 = "Failed to decode frame: id="
            r2.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r0 = m34843w(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r0 = ", frameSize="
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            r2.append(r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r0 = r2.toString()     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            p161w3.C5961r.m35215i(r12, r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
        L_0x0214:
            r7.mo20546O(r14)
            return r1
        L_0x0218:
            java.lang.String r0 = "Unsupported character encoding"
            p161w3.C5961r.m35215i(r12, r0)     // Catch:{ all -> 0x012e }
            r7.mo20546O(r14)
            return r16
        L_0x0221:
            r7.mo20546O(r14)
            throw r0
        L_0x0225:
            java.lang.String r0 = "Skipping unsupported compressed or encrypted frame"
            p161w3.C5961r.m35215i(r12, r0)
            r7.mo20546O(r14)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: p160w2.C5903h.m34831k(int, w3.a0, boolean, int, w2.h$a):w2.i");
    }

    /* renamed from: l */
    private static C5901f m34832l(C5918a0 a0Var, int i) throws UnsupportedEncodingException {
        int C = a0Var.mo20534C();
        String v = m34842v(C);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        a0Var.mo20557j(bArr, 0, i2);
        int y = m34845y(bArr, 0);
        String str = new String(bArr, 0, y, "ISO-8859-1");
        int i3 = y + 1;
        int x = m34844x(bArr, i3, C);
        String p = m34836p(bArr, i3, x, v);
        int u = x + m34841u(C);
        int x2 = m34844x(bArr, u, C);
        return new C5901f(str, p, m34836p(bArr, u, x2, v), m34825d(bArr, x2 + m34841u(C), i2));
    }

    /* renamed from: m */
    private static C5905b m34833m(C5918a0 a0Var) {
        if (a0Var.mo20548a() < 10) {
            C5961r.m35215i("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int F = a0Var.mo20537F();
        boolean z = false;
        if (F != 4801587) {
            C5961r.m35215i("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", new Object[]{Integer.valueOf(F)}));
            return null;
        }
        int C = a0Var.mo20534C();
        a0Var.mo20547P(1);
        int C2 = a0Var.mo20534C();
        int B = a0Var.mo20533B();
        if (C == 2) {
            if ((C2 & 64) != 0) {
                C5961r.m35215i("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (C == 3) {
            if ((C2 & 64) != 0) {
                int m = a0Var.mo20560m();
                a0Var.mo20547P(m);
                B -= m + 4;
            }
        } else if (C == 4) {
            if ((C2 & 64) != 0) {
                int B2 = a0Var.mo20533B();
                a0Var.mo20547P(B2 - 4);
                B -= B2;
            }
            if ((C2 & 16) != 0) {
                B -= 10;
            }
        } else {
            C5961r.m35215i("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + C);
            return null;
        }
        if (C < 4 && (C2 & 128) != 0) {
            z = true;
        }
        return new C5905b(C, z, B);
    }

    /* renamed from: n */
    private static C5909k m34834n(C5918a0 a0Var, int i) {
        int I = a0Var.mo20540I();
        int F = a0Var.mo20537F();
        int F2 = a0Var.mo20537F();
        int C = a0Var.mo20534C();
        int C2 = a0Var.mo20534C();
        C5980z zVar = new C5980z();
        zVar.mo20681m(a0Var);
        int i2 = ((i - 10) * 8) / (C + C2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int h = zVar.mo20676h(C);
            int h2 = zVar.mo20676h(C2);
            iArr[i3] = h;
            iArr2[i3] = h2;
        }
        return new C5909k(I, F, F2, iArr, iArr2);
    }

    /* renamed from: o */
    private static C5911l m34835o(C5918a0 a0Var, int i) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        a0Var.mo20557j(bArr, 0, i);
        int y = m34845y(bArr, 0);
        return new C5911l(new String(bArr, 0, y, "ISO-8859-1"), m34825d(bArr, y + 1, i));
    }

    /* renamed from: p */
    private static String m34836p(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    /* renamed from: q */
    private static C5913m m34837q(C5918a0 a0Var, int i, String str) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int C = a0Var.mo20534C();
        String v = m34842v(C);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        a0Var.mo20557j(bArr, 0, i2);
        return new C5913m(str, (String) null, new String(bArr, 0, m34844x(bArr, 0, C), v));
    }

    /* renamed from: r */
    private static C5913m m34838r(C5918a0 a0Var, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int C = a0Var.mo20534C();
        String v = m34842v(C);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        a0Var.mo20557j(bArr, 0, i2);
        int x = m34844x(bArr, 0, C);
        String str = new String(bArr, 0, x, v);
        int u = x + m34841u(C);
        return new C5913m("TXXX", str, m34836p(bArr, u, m34844x(bArr, u, C), v));
    }

    /* renamed from: s */
    private static C5915n m34839s(C5918a0 a0Var, int i, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        a0Var.mo20557j(bArr, 0, i);
        return new C5915n(str, (String) null, new String(bArr, 0, m34845y(bArr, 0), "ISO-8859-1"));
    }

    /* renamed from: t */
    private static C5915n m34840t(C5918a0 a0Var, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int C = a0Var.mo20534C();
        String v = m34842v(C);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        a0Var.mo20557j(bArr, 0, i2);
        int x = m34844x(bArr, 0, C);
        String str = new String(bArr, 0, x, v);
        int u = x + m34841u(C);
        return new C5915n("WXXX", str, m34836p(bArr, u, m34845y(bArr, u), "ISO-8859-1"));
    }

    /* renamed from: u */
    private static int m34841u(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: v */
    private static String m34842v(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    /* renamed from: w */
    private static String m34843w(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    /* renamed from: x */
    private static int m34844x(byte[] bArr, int i, int i2) {
        int y = m34845y(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return y;
        }
        while (y < bArr.length - 1) {
            if ((y - i) % 2 == 0 && bArr[y + 1] == 0) {
                return y;
            }
            y = m34845y(bArr, y + 1);
        }
        return bArr.length;
    }

    /* renamed from: y */
    private static int m34845y(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static /* synthetic */ boolean m34846z(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C5432a mo19711b(C5439e eVar, ByteBuffer byteBuffer) {
        return mo20495e(byteBuffer.array(), byteBuffer.limit());
    }

    /* renamed from: e */
    public C5432a mo20495e(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        C5918a0 a0Var = new C5918a0(bArr, i);
        C5905b m = m34833m(a0Var);
        if (m == null) {
            return null;
        }
        int e = a0Var.mo20552e();
        int i2 = m.f29029a == 2 ? 6 : 10;
        int b = m.f29031c;
        if (m.f29030b) {
            b = m34822A(a0Var, m.f29031c);
        }
        a0Var.mo20545N(e + b);
        boolean z = false;
        if (!m34823B(a0Var, m.f29029a, i2, false)) {
            if (m.f29029a != 4 || !m34823B(a0Var, 4, i2, true)) {
                C5961r.m35215i("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + m.f29029a);
                return null;
            }
            z = true;
        }
        while (a0Var.mo20548a() >= i2) {
            C5906i k = m34831k(m.f29029a, a0Var, z, i2, this.f29028a);
            if (k != null) {
                arrayList.add(k);
            }
        }
        return new C5432a((List<? extends C5432a.C5434b>) arrayList);
    }

    public C5903h(C5904a aVar) {
        this.f29028a = aVar;
    }
}
