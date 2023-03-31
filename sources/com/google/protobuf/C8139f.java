package com.google.protobuf;

import com.google.protobuf.C8119d0;
import com.google.protobuf.C8260z;
import java.io.IOException;
import java.util.Objects;

/* renamed from: com.google.protobuf.f */
/* compiled from: ArrayDecoders */
final class C8139f {

    /* renamed from: com.google.protobuf.f$a */
    /* compiled from: ArrayDecoders */
    static /* synthetic */ class C8140a {

        /* renamed from: a */
        static final /* synthetic */ int[] f34871a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.b2$b[] r0 = com.google.protobuf.C8105b2.C8107b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f34871a = r0
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f34871a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f34871a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f34871a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f34871a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f34871a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.UINT32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f34871a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f34871a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f34871a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.FIXED32     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f34871a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f34871a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.BOOL     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f34871a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.SINT32     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f34871a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.SINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f34871a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.ENUM     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f34871a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.BYTES     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f34871a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.STRING     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f34871a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.GROUP     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f34871a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8139f.C8140a.<clinit>():void");
        }
    }

    /* renamed from: com.google.protobuf.f$b */
    /* compiled from: ArrayDecoders */
    static final class C8141b {

        /* renamed from: a */
        public int f34872a;

        /* renamed from: b */
        public long f34873b;

        /* renamed from: c */
        public Object f34874c;

        /* renamed from: d */
        public final C8210q f34875d;

        C8141b(C8210q qVar) {
            Objects.requireNonNull(qVar);
            this.f34875d = qVar;
        }
    }

    /* renamed from: A */
    static int m44700A(int i, byte[] bArr, int i2, int i3, C8119d0.C8130j<?> jVar, C8141b bVar) {
        C8114c0 c0Var = (C8114c0) jVar;
        int I = m44708I(bArr, i2, bVar);
        c0Var.mo26815S(C8167j.m44839b(bVar.f34872a));
        while (I < i3) {
            int I2 = m44708I(bArr, I, bVar);
            if (i != bVar.f34872a) {
                break;
            }
            I = m44708I(bArr, I2, bVar);
            c0Var.mo26815S(C8167j.m44839b(bVar.f34872a));
        }
        return I;
    }

    /* renamed from: B */
    static int m44701B(int i, byte[] bArr, int i2, int i3, C8119d0.C8130j<?> jVar, C8141b bVar) {
        C8193m0 m0Var = (C8193m0) jVar;
        int L = m44711L(bArr, i2, bVar);
        m0Var.mo27162j(C8167j.m44840c(bVar.f34873b));
        while (L < i3) {
            int I = m44708I(bArr, L, bVar);
            if (i != bVar.f34872a) {
                break;
            }
            L = m44711L(bArr, I, bVar);
            m0Var.mo27162j(C8167j.m44840c(bVar.f34873b));
        }
        return L;
    }

    /* renamed from: C */
    static int m44702C(byte[] bArr, int i, C8141b bVar) throws C8135e0 {
        int I = m44708I(bArr, i, bVar);
        int i2 = bVar.f34872a;
        if (i2 < 0) {
            throw C8135e0.m44688g();
        } else if (i2 == 0) {
            bVar.f34874c = "";
            return I;
        } else {
            bVar.f34874c = new String(bArr, I, i2, C8119d0.f34855b);
            return I + i2;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044 A[EDGE_INSN: B:21:0x0044->B:17:0x0044 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    /* renamed from: D */
    static int m44703D(int r4, byte[] r5, int r6, int r7, com.google.protobuf.C8119d0.C8130j<?> r8, com.google.protobuf.C8139f.C8141b r9) throws com.google.protobuf.C8135e0 {
        /*
            int r6 = m44708I(r5, r6, r9)
            int r0 = r9.f34872a
            if (r0 < 0) goto L_0x0045
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0010
            r8.add(r1)
            goto L_0x001b
        L_0x0010:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.protobuf.C8119d0.f34855b
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
        L_0x001a:
            int r6 = r6 + r0
        L_0x001b:
            if (r6 >= r7) goto L_0x0044
            int r0 = m44708I(r5, r6, r9)
            int r2 = r9.f34872a
            if (r4 == r2) goto L_0x0026
            goto L_0x0044
        L_0x0026:
            int r6 = m44708I(r5, r0, r9)
            int r0 = r9.f34872a
            if (r0 < 0) goto L_0x003f
            if (r0 != 0) goto L_0x0034
            r8.add(r1)
            goto L_0x001b
        L_0x0034:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.protobuf.C8119d0.f34855b
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
            goto L_0x001a
        L_0x003f:
            com.google.protobuf.e0 r4 = com.google.protobuf.C8135e0.m44688g()
            throw r4
        L_0x0044:
            return r6
        L_0x0045:
            com.google.protobuf.e0 r4 = com.google.protobuf.C8135e0.m44688g()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8139f.m44703D(int, byte[], int, int, com.google.protobuf.d0$j, com.google.protobuf.f$b):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        r2 = r7 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (com.google.protobuf.C8094a2.m44518t(r6, r7, r2) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r9.add(new java.lang.String(r6, r7, r0, com.google.protobuf.C8119d0.f34855b));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        throw com.google.protobuf.C8135e0.m44685d();
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0059 A[EDGE_INSN: B:28:0x0059->B:23:0x0059 ?: BREAK  , SYNTHETIC] */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m44704E(int r5, byte[] r6, int r7, int r8, com.google.protobuf.C8119d0.C8130j<?> r9, com.google.protobuf.C8139f.C8141b r10) throws com.google.protobuf.C8135e0 {
        /*
            int r7 = m44708I(r6, r7, r10)
            int r0 = r10.f34872a
            if (r0 < 0) goto L_0x005f
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0010
            r9.add(r1)
            goto L_0x0023
        L_0x0010:
            int r2 = r7 + r0
            boolean r3 = com.google.protobuf.C8094a2.m44518t(r6, r7, r2)
            if (r3 == 0) goto L_0x005a
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.protobuf.C8119d0.f34855b
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
        L_0x0022:
            r7 = r2
        L_0x0023:
            if (r7 >= r8) goto L_0x0059
            int r0 = m44708I(r6, r7, r10)
            int r2 = r10.f34872a
            if (r5 == r2) goto L_0x002e
            goto L_0x0059
        L_0x002e:
            int r7 = m44708I(r6, r0, r10)
            int r0 = r10.f34872a
            if (r0 < 0) goto L_0x0054
            if (r0 != 0) goto L_0x003c
            r9.add(r1)
            goto L_0x0023
        L_0x003c:
            int r2 = r7 + r0
            boolean r3 = com.google.protobuf.C8094a2.m44518t(r6, r7, r2)
            if (r3 == 0) goto L_0x004f
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.protobuf.C8119d0.f34855b
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
            goto L_0x0022
        L_0x004f:
            com.google.protobuf.e0 r5 = com.google.protobuf.C8135e0.m44685d()
            throw r5
        L_0x0054:
            com.google.protobuf.e0 r5 = com.google.protobuf.C8135e0.m44688g()
            throw r5
        L_0x0059:
            return r7
        L_0x005a:
            com.google.protobuf.e0 r5 = com.google.protobuf.C8135e0.m44685d()
            throw r5
        L_0x005f:
            com.google.protobuf.e0 r5 = com.google.protobuf.C8135e0.m44688g()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8139f.m44704E(int, byte[], int, int, com.google.protobuf.d0$j, com.google.protobuf.f$b):int");
    }

    /* renamed from: F */
    static int m44705F(byte[] bArr, int i, C8141b bVar) throws C8135e0 {
        int I = m44708I(bArr, i, bVar);
        int i2 = bVar.f34872a;
        if (i2 < 0) {
            throw C8135e0.m44688g();
        } else if (i2 == 0) {
            bVar.f34874c = "";
            return I;
        } else {
            bVar.f34874c = C8094a2.m44506h(bArr, I, i2);
            return I + i2;
        }
    }

    /* renamed from: G */
    static int m44706G(int i, byte[] bArr, int i2, int i3, C8250w1 w1Var, C8141b bVar) throws C8135e0 {
        if (C8105b2.m44580a(i) != 0) {
            int b = C8105b2.m44581b(i);
            if (b == 0) {
                int L = m44711L(bArr, i2, bVar);
                w1Var.mo27356n(i, Long.valueOf(bVar.f34873b));
                return L;
            } else if (b == 1) {
                w1Var.mo27356n(i, Long.valueOf(m44725j(bArr, i2)));
                return i2 + 8;
            } else if (b == 2) {
                int I = m44708I(bArr, i2, bVar);
                int i4 = bVar.f34872a;
                if (i4 < 0) {
                    throw C8135e0.m44688g();
                } else if (i4 <= bArr.length - I) {
                    if (i4 == 0) {
                        w1Var.mo27356n(i, C8153i.f34908b);
                    } else {
                        w1Var.mo27356n(i, C8153i.m44778r(bArr, I, i4));
                    }
                    return I + i4;
                } else {
                    throw C8135e0.m44692m();
                }
            } else if (b == 3) {
                C8250w1 k = C8250w1.m45722k();
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int I2 = m44708I(bArr, i2, bVar);
                    int i7 = bVar.f34872a;
                    if (i7 == i5) {
                        i6 = i7;
                        i2 = I2;
                        break;
                    }
                    i6 = i7;
                    i2 = m44706G(i7, bArr, I2, i3, k, bVar);
                }
                if (i2 > i3 || i6 != i5) {
                    throw C8135e0.m44689h();
                }
                w1Var.mo27356n(i, k);
                return i2;
            } else if (b == 5) {
                w1Var.mo27356n(i, Integer.valueOf(m44723h(bArr, i2)));
                return i2 + 4;
            } else {
                throw C8135e0.m44684c();
            }
        } else {
            throw C8135e0.m44684c();
        }
    }

    /* renamed from: H */
    static int m44707H(int i, byte[] bArr, int i2, C8141b bVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            bVar.f34872a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            bVar.f34872a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            bVar.f34872a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            bVar.f34872a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                bVar.f34872a = i11;
                return i12;
            }
        }
    }

    /* renamed from: I */
    static int m44708I(byte[] bArr, int i, C8141b bVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m44707H(b, bArr, i2, bVar);
        }
        bVar.f34872a = b;
        return i2;
    }

    /* renamed from: J */
    static int m44709J(int i, byte[] bArr, int i2, int i3, C8119d0.C8130j<?> jVar, C8141b bVar) {
        C8114c0 c0Var = (C8114c0) jVar;
        int I = m44708I(bArr, i2, bVar);
        c0Var.mo26815S(bVar.f34872a);
        while (I < i3) {
            int I2 = m44708I(bArr, I, bVar);
            if (i != bVar.f34872a) {
                break;
            }
            I = m44708I(bArr, I2, bVar);
            c0Var.mo26815S(bVar.f34872a);
        }
        return I;
    }

    /* renamed from: K */
    static int m44710K(long j, byte[] bArr, int i, C8141b bVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i3 = 7;
        while (b < 0) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            i3 += 7;
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i3;
            byte b3 = b2;
            i2 = i4;
            b = b3;
        }
        bVar.f34873b = j2;
        return i2;
    }

    /* renamed from: L */
    static int m44711L(byte[] bArr, int i, C8141b bVar) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j < 0) {
            return m44710K(j, bArr, i2, bVar);
        }
        bVar.f34873b = j;
        return i2;
    }

    /* renamed from: M */
    static int m44712M(int i, byte[] bArr, int i2, int i3, C8119d0.C8130j<?> jVar, C8141b bVar) {
        C8193m0 m0Var = (C8193m0) jVar;
        int L = m44711L(bArr, i2, bVar);
        m0Var.mo27162j(bVar.f34873b);
        while (L < i3) {
            int I = m44708I(bArr, L, bVar);
            if (i != bVar.f34872a) {
                break;
            }
            L = m44711L(bArr, I, bVar);
            m0Var.mo27162j(bVar.f34873b);
        }
        return L;
    }

    /* renamed from: N */
    static int m44713N(Object obj, C8202n1 n1Var, byte[] bArr, int i, int i2, int i3, C8141b bVar) throws IOException {
        int h0 = ((C8255y0) n1Var).mo27391h0(obj, bArr, i, i2, i3, bVar);
        bVar.f34874c = obj;
        return h0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m44714O(java.lang.Object r6, com.google.protobuf.C8202n1 r7, byte[] r8, int r9, int r10, com.google.protobuf.C8139f.C8141b r11) throws java.io.IOException {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = m44707H(r9, r8, r0, r11)
            int r9 = r11.f34872a
        L_0x000c:
            r3 = r0
            if (r9 < 0) goto L_0x001e
            int r10 = r10 - r3
            if (r9 > r10) goto L_0x001e
            int r9 = r9 + r3
            r0 = r7
            r1 = r6
            r2 = r8
            r4 = r9
            r5 = r11
            r0.mo27202f(r1, r2, r3, r4, r5)
            r11.f34874c = r6
            return r9
        L_0x001e:
            com.google.protobuf.e0 r6 = com.google.protobuf.C8135e0.m44692m()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8139f.m44714O(java.lang.Object, com.google.protobuf.n1, byte[], int, int, com.google.protobuf.f$b):int");
    }

    /* renamed from: P */
    static int m44715P(int i, byte[] bArr, int i2, int i3, C8141b bVar) throws C8135e0 {
        if (C8105b2.m44580a(i) != 0) {
            int b = C8105b2.m44581b(i);
            if (b == 0) {
                return m44711L(bArr, i2, bVar);
            }
            if (b == 1) {
                return i2 + 8;
            }
            if (b == 2) {
                return m44708I(bArr, i2, bVar) + bVar.f34872a;
            }
            if (b == 3) {
                int i4 = (i & -8) | 4;
                int i5 = 0;
                while (i2 < i3) {
                    i2 = m44708I(bArr, i2, bVar);
                    i5 = bVar.f34872a;
                    if (i5 == i4) {
                        break;
                    }
                    i2 = m44715P(i5, bArr, i2, i3, bVar);
                }
                if (i2 <= i3 && i5 == i4) {
                    return i2;
                }
                throw C8135e0.m44689h();
            } else if (b == 5) {
                return i2 + 4;
            } else {
                throw C8135e0.m44684c();
            }
        } else {
            throw C8135e0.m44684c();
        }
    }

    /* renamed from: a */
    static int m44716a(int i, byte[] bArr, int i2, int i3, C8119d0.C8130j<?> jVar, C8141b bVar) {
        C8144g gVar = (C8144g) jVar;
        int L = m44711L(bArr, i2, bVar);
        gVar.mo26905j(bVar.f34873b != 0);
        while (L < i3) {
            int I = m44708I(bArr, L, bVar);
            if (i != bVar.f34872a) {
                break;
            }
            L = m44711L(bArr, I, bVar);
            gVar.mo26905j(bVar.f34873b != 0);
        }
        return L;
    }

    /* renamed from: b */
    static int m44717b(byte[] bArr, int i, C8141b bVar) throws C8135e0 {
        int I = m44708I(bArr, i, bVar);
        int i2 = bVar.f34872a;
        if (i2 < 0) {
            throw C8135e0.m44688g();
        } else if (i2 > bArr.length - I) {
            throw C8135e0.m44692m();
        } else if (i2 == 0) {
            bVar.f34874c = C8153i.f34908b;
            return I;
        } else {
            bVar.f34874c = C8153i.m44778r(bArr, I, i2);
            return I + i2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x004d A[EDGE_INSN: B:30:0x004d->B:22:0x004d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m44718c(int r2, byte[] r3, int r4, int r5, com.google.protobuf.C8119d0.C8130j<?> r6, com.google.protobuf.C8139f.C8141b r7) throws com.google.protobuf.C8135e0 {
        /*
            int r4 = m44708I(r3, r4, r7)
            int r0 = r7.f34872a
            if (r0 < 0) goto L_0x0053
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L_0x004e
            if (r0 != 0) goto L_0x0014
            com.google.protobuf.i r0 = com.google.protobuf.C8153i.f34908b
            r6.add(r0)
            goto L_0x001c
        L_0x0014:
            com.google.protobuf.i r1 = com.google.protobuf.C8153i.m44778r(r3, r4, r0)
            r6.add(r1)
        L_0x001b:
            int r4 = r4 + r0
        L_0x001c:
            if (r4 >= r5) goto L_0x004d
            int r0 = m44708I(r3, r4, r7)
            int r1 = r7.f34872a
            if (r2 == r1) goto L_0x0027
            goto L_0x004d
        L_0x0027:
            int r4 = m44708I(r3, r0, r7)
            int r0 = r7.f34872a
            if (r0 < 0) goto L_0x0048
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L_0x0043
            if (r0 != 0) goto L_0x003b
            com.google.protobuf.i r0 = com.google.protobuf.C8153i.f34908b
            r6.add(r0)
            goto L_0x001c
        L_0x003b:
            com.google.protobuf.i r1 = com.google.protobuf.C8153i.m44778r(r3, r4, r0)
            r6.add(r1)
            goto L_0x001b
        L_0x0043:
            com.google.protobuf.e0 r2 = com.google.protobuf.C8135e0.m44692m()
            throw r2
        L_0x0048:
            com.google.protobuf.e0 r2 = com.google.protobuf.C8135e0.m44688g()
            throw r2
        L_0x004d:
            return r4
        L_0x004e:
            com.google.protobuf.e0 r2 = com.google.protobuf.C8135e0.m44692m()
            throw r2
        L_0x0053:
            com.google.protobuf.e0 r2 = com.google.protobuf.C8135e0.m44688g()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8139f.m44718c(int, byte[], int, int, com.google.protobuf.d0$j, com.google.protobuf.f$b):int");
    }

    /* renamed from: d */
    static double m44719d(byte[] bArr, int i) {
        return Double.longBitsToDouble(m44725j(bArr, i));
    }

    /* renamed from: e */
    static int m44720e(int i, byte[] bArr, int i2, int i3, C8119d0.C8130j<?> jVar, C8141b bVar) {
        C8198n nVar = (C8198n) jVar;
        nVar.mo27183i(m44719d(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int I = m44708I(bArr, i4, bVar);
            if (i != bVar.f34872a) {
                break;
            }
            nVar.mo27183i(m44719d(bArr, I));
            i4 = I + 8;
        }
        return i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0225, code lost:
        r10 = r10 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0230, code lost:
        r10 = r10 + 8;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m44721f(int r8, byte[] r9, int r10, int r11, com.google.protobuf.C8260z.C8263c<?, ?> r12, com.google.protobuf.C8260z.C8265e<?, ?> r13, com.google.protobuf.C8245v1<com.google.protobuf.C8250w1, com.google.protobuf.C8250w1> r14, com.google.protobuf.C8139f.C8141b r15) throws java.io.IOException {
        /*
            com.google.protobuf.v<com.google.protobuf.z$d> r0 = r12.extensions
            int r2 = r8 >>> 3
            com.google.protobuf.z$d r8 = r13.f35204b
            boolean r8 = r8.mo27312g()
            if (r8 == 0) goto L_0x00ed
            com.google.protobuf.z$d r8 = r13.f35204b
            boolean r8 = r8.mo27316m()
            if (r8 == 0) goto L_0x00ed
            int[] r8 = com.google.protobuf.C8139f.C8140a.f34871a
            com.google.protobuf.b2$b r11 = r13.mo27450a()
            int r11 = r11.ordinal()
            r8 = r8[r11]
            switch(r8) {
                case 1: goto L_0x00dd;
                case 2: goto L_0x00cd;
                case 3: goto L_0x00bd;
                case 4: goto L_0x00bd;
                case 5: goto L_0x00ad;
                case 6: goto L_0x00ad;
                case 7: goto L_0x009d;
                case 8: goto L_0x009d;
                case 9: goto L_0x008d;
                case 10: goto L_0x008d;
                case 11: goto L_0x007d;
                case 12: goto L_0x006d;
                case 13: goto L_0x005d;
                case 14: goto L_0x0040;
                default: goto L_0x0023;
            }
        L_0x0023:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Type cannot be packed: "
            r9.append(r10)
            com.google.protobuf.z$d r10 = r13.f35204b
            com.google.protobuf.b2$b r10 = r10.mo27313h()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x0040:
            com.google.protobuf.c0 r8 = new com.google.protobuf.c0
            r8.<init>()
            int r9 = m44740y(r9, r10, r8, r15)
            com.google.protobuf.z$d r10 = r13.f35204b
            com.google.protobuf.d0$d r4 = r10.mo27448b()
            r5 = 0
            r1 = r12
            r3 = r8
            r6 = r14
            com.google.protobuf.C8209p1.m45545z(r1, r2, r3, r4, r5, r6)
            com.google.protobuf.z$d r10 = r13.f35204b
            r0.mo27310y(r10, r8)
            goto L_0x0244
        L_0x005d:
            com.google.protobuf.m0 r8 = new com.google.protobuf.m0
            r8.<init>()
            int r9 = m44739x(r9, r10, r8, r15)
            com.google.protobuf.z$d r10 = r13.f35204b
            r0.mo27310y(r10, r8)
            goto L_0x0244
        L_0x006d:
            com.google.protobuf.c0 r8 = new com.google.protobuf.c0
            r8.<init>()
            int r9 = m44738w(r9, r10, r8, r15)
            com.google.protobuf.z$d r10 = r13.f35204b
            r0.mo27310y(r10, r8)
            goto L_0x0244
        L_0x007d:
            com.google.protobuf.g r8 = new com.google.protobuf.g
            r8.<init>()
            int r9 = m44733r(r9, r10, r8, r15)
            com.google.protobuf.z$d r10 = r13.f35204b
            r0.mo27310y(r10, r8)
            goto L_0x0244
        L_0x008d:
            com.google.protobuf.c0 r8 = new com.google.protobuf.c0
            r8.<init>()
            int r9 = m44735t(r9, r10, r8, r15)
            com.google.protobuf.z$d r10 = r13.f35204b
            r0.mo27310y(r10, r8)
            goto L_0x0244
        L_0x009d:
            com.google.protobuf.m0 r8 = new com.google.protobuf.m0
            r8.<init>()
            int r9 = m44736u(r9, r10, r8, r15)
            com.google.protobuf.z$d r10 = r13.f35204b
            r0.mo27310y(r10, r8)
            goto L_0x0244
        L_0x00ad:
            com.google.protobuf.c0 r8 = new com.google.protobuf.c0
            r8.<init>()
            int r9 = m44740y(r9, r10, r8, r15)
            com.google.protobuf.z$d r10 = r13.f35204b
            r0.mo27310y(r10, r8)
            goto L_0x0244
        L_0x00bd:
            com.google.protobuf.m0 r8 = new com.google.protobuf.m0
            r8.<init>()
            int r9 = m44741z(r9, r10, r8, r15)
            com.google.protobuf.z$d r10 = r13.f35204b
            r0.mo27310y(r10, r8)
            goto L_0x0244
        L_0x00cd:
            com.google.protobuf.x r8 = new com.google.protobuf.x
            r8.<init>()
            int r9 = m44737v(r9, r10, r8, r15)
            com.google.protobuf.z$d r10 = r13.f35204b
            r0.mo27310y(r10, r8)
            goto L_0x0244
        L_0x00dd:
            com.google.protobuf.n r8 = new com.google.protobuf.n
            r8.<init>()
            int r9 = m44734s(r9, r10, r8, r15)
            com.google.protobuf.z$d r10 = r13.f35204b
            r0.mo27310y(r10, r8)
            goto L_0x0244
        L_0x00ed:
            com.google.protobuf.b2$b r8 = r13.mo27450a()
            com.google.protobuf.b2$b r1 = com.google.protobuf.C8105b2.C8107b.ENUM
            r3 = 0
            if (r8 != r1) goto L_0x0116
            int r10 = m44708I(r9, r10, r15)
            com.google.protobuf.z$d r8 = r13.f35204b
            com.google.protobuf.d0$d r8 = r8.mo27448b()
            int r9 = r15.f34872a
            com.google.protobuf.d0$c r8 = r8.mo26873a(r9)
            if (r8 != 0) goto L_0x010e
            int r8 = r15.f34872a
            com.google.protobuf.C8209p1.m45500L(r12, r2, r8, r3, r14)
            return r10
        L_0x010e:
            int r8 = r15.f34872a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            goto L_0x0232
        L_0x0116:
            int[] r8 = com.google.protobuf.C8139f.C8140a.f34871a
            com.google.protobuf.b2$b r12 = r13.mo27450a()
            int r12 = r12.ordinal()
            r8 = r8[r12]
            switch(r8) {
                case 1: goto L_0x0228;
                case 2: goto L_0x021d;
                case 3: goto L_0x0212;
                case 4: goto L_0x0212;
                case 5: goto L_0x0207;
                case 6: goto L_0x0207;
                case 7: goto L_0x01fe;
                case 8: goto L_0x01fe;
                case 9: goto L_0x01f5;
                case 10: goto L_0x01f5;
                case 11: goto L_0x01e1;
                case 12: goto L_0x01d2;
                case 13: goto L_0x01c3;
                case 14: goto L_0x01bb;
                case 15: goto L_0x01b3;
                case 16: goto L_0x01ab;
                case 17: goto L_0x0164;
                case 18: goto L_0x0127;
                default: goto L_0x0125;
            }
        L_0x0125:
            goto L_0x0232
        L_0x0127:
            com.google.protobuf.i1 r8 = com.google.protobuf.C8166i1.m44835a()
            com.google.protobuf.v0 r12 = r13.mo27451b()
            java.lang.Class r12 = r12.getClass()
            com.google.protobuf.n1 r2 = r8.mo26961c(r12)
            boolean r8 = r13.mo27453d()
            if (r8 == 0) goto L_0x0149
            int r8 = m44731p(r2, r9, r10, r11, r15)
            com.google.protobuf.z$d r9 = r13.f35204b
            java.lang.Object r10 = r15.f34874c
            r0.mo27295a(r9, r10)
            goto L_0x0163
        L_0x0149:
            com.google.protobuf.z$d r8 = r13.f35204b
            java.lang.Object r8 = r0.mo27301i(r8)
            if (r8 != 0) goto L_0x015a
            java.lang.Object r8 = r2.mo27205i()
            com.google.protobuf.z$d r12 = r13.f35204b
            r0.mo27310y(r12, r8)
        L_0x015a:
            r1 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r15
            int r8 = m44714O(r1, r2, r3, r4, r5, r6)
        L_0x0163:
            return r8
        L_0x0164:
            int r8 = r2 << 3
            r6 = r8 | 4
            com.google.protobuf.i1 r8 = com.google.protobuf.C8166i1.m44835a()
            com.google.protobuf.v0 r12 = r13.mo27451b()
            java.lang.Class r12 = r12.getClass()
            com.google.protobuf.n1 r2 = r8.mo26961c(r12)
            boolean r8 = r13.mo27453d()
            if (r8 == 0) goto L_0x0190
            r1 = r2
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r6
            r6 = r15
            int r8 = m44729n(r1, r2, r3, r4, r5, r6)
            com.google.protobuf.z$d r9 = r13.f35204b
            java.lang.Object r10 = r15.f34874c
            r0.mo27295a(r9, r10)
            goto L_0x01aa
        L_0x0190:
            com.google.protobuf.z$d r8 = r13.f35204b
            java.lang.Object r8 = r0.mo27301i(r8)
            if (r8 != 0) goto L_0x01a1
            java.lang.Object r8 = r2.mo27205i()
            com.google.protobuf.z$d r12 = r13.f35204b
            r0.mo27310y(r12, r8)
        L_0x01a1:
            r1 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r7 = r15
            int r8 = m44713N(r1, r2, r3, r4, r5, r6, r7)
        L_0x01aa:
            return r8
        L_0x01ab:
            int r10 = m44702C(r9, r10, r15)
            java.lang.Object r3 = r15.f34874c
            goto L_0x0232
        L_0x01b3:
            int r10 = m44717b(r9, r10, r15)
            java.lang.Object r3 = r15.f34874c
            goto L_0x0232
        L_0x01bb:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Shouldn't reach here."
            r8.<init>(r9)
            throw r8
        L_0x01c3:
            int r10 = m44711L(r9, r10, r15)
            long r8 = r15.f34873b
            long r8 = com.google.protobuf.C8167j.m44840c(r8)
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            goto L_0x0232
        L_0x01d2:
            int r10 = m44708I(r9, r10, r15)
            int r8 = r15.f34872a
            int r8 = com.google.protobuf.C8167j.m44839b(r8)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            goto L_0x0232
        L_0x01e1:
            int r10 = m44711L(r9, r10, r15)
            long r8 = r15.f34873b
            r11 = 0
            int r14 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r14 == 0) goto L_0x01ef
            r8 = 1
            goto L_0x01f0
        L_0x01ef:
            r8 = 0
        L_0x01f0:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)
            goto L_0x0232
        L_0x01f5:
            int r8 = m44723h(r9, r10)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            goto L_0x0225
        L_0x01fe:
            long r8 = m44725j(r9, r10)
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            goto L_0x0230
        L_0x0207:
            int r10 = m44708I(r9, r10, r15)
            int r8 = r15.f34872a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            goto L_0x0232
        L_0x0212:
            int r10 = m44711L(r9, r10, r15)
            long r8 = r15.f34873b
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            goto L_0x0232
        L_0x021d:
            float r8 = m44727l(r9, r10)
            java.lang.Float r3 = java.lang.Float.valueOf(r8)
        L_0x0225:
            int r10 = r10 + 4
            goto L_0x0232
        L_0x0228:
            double r8 = m44719d(r9, r10)
            java.lang.Double r3 = java.lang.Double.valueOf(r8)
        L_0x0230:
            int r10 = r10 + 8
        L_0x0232:
            boolean r8 = r13.mo27453d()
            if (r8 == 0) goto L_0x023e
            com.google.protobuf.z$d r8 = r13.f35204b
            r0.mo27295a(r8, r3)
            goto L_0x0243
        L_0x023e:
            com.google.protobuf.z$d r8 = r13.f35204b
            r0.mo27310y(r8, r3)
        L_0x0243:
            r9 = r10
        L_0x0244:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8139f.m44721f(int, byte[], int, int, com.google.protobuf.z$c, com.google.protobuf.z$e, com.google.protobuf.v1, com.google.protobuf.f$b):int");
    }

    /* renamed from: g */
    static int m44722g(int i, byte[] bArr, int i2, int i3, Object obj, C8243v0 v0Var, C8245v1<C8250w1, C8250w1> v1Var, C8141b bVar) throws IOException {
        C8260z.C8265e a = bVar.f34875d.mo27220a(v0Var, i >>> 3);
        if (a == null) {
            return m44706G(i, bArr, i2, i3, C8255y0.m45857x(obj), bVar);
        }
        C8260z.C8263c cVar = (C8260z.C8263c) obj;
        cVar.mo27446a0();
        return m44721f(i, bArr, i2, i3, cVar, a, v1Var, bVar);
    }

    /* renamed from: h */
    static int m44723h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: i */
    static int m44724i(int i, byte[] bArr, int i2, int i3, C8119d0.C8130j<?> jVar, C8141b bVar) {
        C8114c0 c0Var = (C8114c0) jVar;
        c0Var.mo26815S(m44723h(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int I = m44708I(bArr, i4, bVar);
            if (i != bVar.f34872a) {
                break;
            }
            c0Var.mo26815S(m44723h(bArr, I));
            i4 = I + 4;
        }
        return i4;
    }

    /* renamed from: j */
    static long m44725j(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: k */
    static int m44726k(int i, byte[] bArr, int i2, int i3, C8119d0.C8130j<?> jVar, C8141b bVar) {
        C8193m0 m0Var = (C8193m0) jVar;
        m0Var.mo27162j(m44725j(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int I = m44708I(bArr, i4, bVar);
            if (i != bVar.f34872a) {
                break;
            }
            m0Var.mo27162j(m44725j(bArr, I));
            i4 = I + 8;
        }
        return i4;
    }

    /* renamed from: l */
    static float m44727l(byte[] bArr, int i) {
        return Float.intBitsToFloat(m44723h(bArr, i));
    }

    /* renamed from: m */
    static int m44728m(int i, byte[] bArr, int i2, int i3, C8119d0.C8130j<?> jVar, C8141b bVar) {
        C8251x xVar = (C8251x) jVar;
        xVar.mo27364i(m44727l(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int I = m44708I(bArr, i4, bVar);
            if (i != bVar.f34872a) {
                break;
            }
            xVar.mo27364i(m44727l(bArr, I));
            i4 = I + 4;
        }
        return i4;
    }

    /* renamed from: n */
    static int m44729n(C8202n1 n1Var, byte[] bArr, int i, int i2, int i3, C8141b bVar) throws IOException {
        Object i4 = n1Var.mo27205i();
        int N = m44713N(i4, n1Var, bArr, i, i2, i3, bVar);
        n1Var.mo27199c(i4);
        bVar.f34874c = i4;
        return N;
    }

    /* renamed from: o */
    static int m44730o(C8202n1 n1Var, int i, byte[] bArr, int i2, int i3, C8119d0.C8130j<?> jVar, C8141b bVar) throws IOException {
        int i4 = (i & -8) | 4;
        int n = m44729n(n1Var, bArr, i2, i3, i4, bVar);
        jVar.add(bVar.f34874c);
        while (n < i3) {
            int I = m44708I(bArr, n, bVar);
            if (i != bVar.f34872a) {
                break;
            }
            n = m44729n(n1Var, bArr, I, i3, i4, bVar);
            jVar.add(bVar.f34874c);
        }
        return n;
    }

    /* renamed from: p */
    static int m44731p(C8202n1 n1Var, byte[] bArr, int i, int i2, C8141b bVar) throws IOException {
        Object i3 = n1Var.mo27205i();
        int O = m44714O(i3, n1Var, bArr, i, i2, bVar);
        n1Var.mo27199c(i3);
        bVar.f34874c = i3;
        return O;
    }

    /* renamed from: q */
    static int m44732q(C8202n1<?> n1Var, int i, byte[] bArr, int i2, int i3, C8119d0.C8130j<?> jVar, C8141b bVar) throws IOException {
        int p = m44731p(n1Var, bArr, i2, i3, bVar);
        jVar.add(bVar.f34874c);
        while (p < i3) {
            int I = m44708I(bArr, p, bVar);
            if (i != bVar.f34872a) {
                break;
            }
            p = m44731p(n1Var, bArr, I, i3, bVar);
            jVar.add(bVar.f34874c);
        }
        return p;
    }

    /* renamed from: r */
    static int m44733r(byte[] bArr, int i, C8119d0.C8130j<?> jVar, C8141b bVar) throws IOException {
        C8144g gVar = (C8144g) jVar;
        int I = m44708I(bArr, i, bVar);
        int i2 = bVar.f34872a + I;
        while (I < i2) {
            I = m44711L(bArr, I, bVar);
            gVar.mo26905j(bVar.f34873b != 0);
        }
        if (I == i2) {
            return I;
        }
        throw C8135e0.m44692m();
    }

    /* renamed from: s */
    static int m44734s(byte[] bArr, int i, C8119d0.C8130j<?> jVar, C8141b bVar) throws IOException {
        C8198n nVar = (C8198n) jVar;
        int I = m44708I(bArr, i, bVar);
        int i2 = bVar.f34872a + I;
        while (I < i2) {
            nVar.mo27183i(m44719d(bArr, I));
            I += 8;
        }
        if (I == i2) {
            return I;
        }
        throw C8135e0.m44692m();
    }

    /* renamed from: t */
    static int m44735t(byte[] bArr, int i, C8119d0.C8130j<?> jVar, C8141b bVar) throws IOException {
        C8114c0 c0Var = (C8114c0) jVar;
        int I = m44708I(bArr, i, bVar);
        int i2 = bVar.f34872a + I;
        while (I < i2) {
            c0Var.mo26815S(m44723h(bArr, I));
            I += 4;
        }
        if (I == i2) {
            return I;
        }
        throw C8135e0.m44692m();
    }

    /* renamed from: u */
    static int m44736u(byte[] bArr, int i, C8119d0.C8130j<?> jVar, C8141b bVar) throws IOException {
        C8193m0 m0Var = (C8193m0) jVar;
        int I = m44708I(bArr, i, bVar);
        int i2 = bVar.f34872a + I;
        while (I < i2) {
            m0Var.mo27162j(m44725j(bArr, I));
            I += 8;
        }
        if (I == i2) {
            return I;
        }
        throw C8135e0.m44692m();
    }

    /* renamed from: v */
    static int m44737v(byte[] bArr, int i, C8119d0.C8130j<?> jVar, C8141b bVar) throws IOException {
        C8251x xVar = (C8251x) jVar;
        int I = m44708I(bArr, i, bVar);
        int i2 = bVar.f34872a + I;
        while (I < i2) {
            xVar.mo27364i(m44727l(bArr, I));
            I += 4;
        }
        if (I == i2) {
            return I;
        }
        throw C8135e0.m44692m();
    }

    /* renamed from: w */
    static int m44738w(byte[] bArr, int i, C8119d0.C8130j<?> jVar, C8141b bVar) throws IOException {
        C8114c0 c0Var = (C8114c0) jVar;
        int I = m44708I(bArr, i, bVar);
        int i2 = bVar.f34872a + I;
        while (I < i2) {
            I = m44708I(bArr, I, bVar);
            c0Var.mo26815S(C8167j.m44839b(bVar.f34872a));
        }
        if (I == i2) {
            return I;
        }
        throw C8135e0.m44692m();
    }

    /* renamed from: x */
    static int m44739x(byte[] bArr, int i, C8119d0.C8130j<?> jVar, C8141b bVar) throws IOException {
        C8193m0 m0Var = (C8193m0) jVar;
        int I = m44708I(bArr, i, bVar);
        int i2 = bVar.f34872a + I;
        while (I < i2) {
            I = m44711L(bArr, I, bVar);
            m0Var.mo27162j(C8167j.m44840c(bVar.f34873b));
        }
        if (I == i2) {
            return I;
        }
        throw C8135e0.m44692m();
    }

    /* renamed from: y */
    static int m44740y(byte[] bArr, int i, C8119d0.C8130j<?> jVar, C8141b bVar) throws IOException {
        C8114c0 c0Var = (C8114c0) jVar;
        int I = m44708I(bArr, i, bVar);
        int i2 = bVar.f34872a + I;
        while (I < i2) {
            I = m44708I(bArr, I, bVar);
            c0Var.mo26815S(bVar.f34872a);
        }
        if (I == i2) {
            return I;
        }
        throw C8135e0.m44692m();
    }

    /* renamed from: z */
    static int m44741z(byte[] bArr, int i, C8119d0.C8130j<?> jVar, C8141b bVar) throws IOException {
        C8193m0 m0Var = (C8193m0) jVar;
        int I = m44708I(bArr, i, bVar);
        int i2 = bVar.f34872a + I;
        while (I < i2) {
            I = m44711L(bArr, I, bVar);
            m0Var.mo27162j(bVar.f34873b);
        }
        if (I == i2) {
            return I;
        }
        throw C8135e0.m44692m();
    }
}
