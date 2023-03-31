package p368u9;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import p212d9.C9914f;
import p248h9.C10478d;
import p248h9.C10479e;
import p358t9.C12555c;

/* renamed from: u9.e */
/* compiled from: DecodedBitStreamParser */
final class C12714e {

    /* renamed from: a */
    private static final char[] f46499a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* renamed from: b */
    private static final char[] f46500b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: c */
    private static final Charset f46501c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    private static final BigInteger[] f46502d;

    /* renamed from: u9.e$a */
    /* compiled from: DecodedBitStreamParser */
    static /* synthetic */ class C12715a {

        /* renamed from: a */
        static final /* synthetic */ int[] f46503a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                u9.e$b[] r0 = p368u9.C12714e.C12716b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f46503a = r0
                u9.e$b r1 = p368u9.C12714e.C12716b.ALPHA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f46503a     // Catch:{ NoSuchFieldError -> 0x001d }
                u9.e$b r1 = p368u9.C12714e.C12716b.LOWER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f46503a     // Catch:{ NoSuchFieldError -> 0x0028 }
                u9.e$b r1 = p368u9.C12714e.C12716b.MIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f46503a     // Catch:{ NoSuchFieldError -> 0x0033 }
                u9.e$b r1 = p368u9.C12714e.C12716b.PUNCT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f46503a     // Catch:{ NoSuchFieldError -> 0x003e }
                u9.e$b r1 = p368u9.C12714e.C12716b.ALPHA_SHIFT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f46503a     // Catch:{ NoSuchFieldError -> 0x0049 }
                u9.e$b r1 = p368u9.C12714e.C12716b.PUNCT_SHIFT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p368u9.C12714e.C12715a.<clinit>():void");
        }
    }

    /* renamed from: u9.e$b */
    /* compiled from: DecodedBitStreamParser */
    private enum C12716b {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f46502d = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900);
        bigIntegerArr[1] = valueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f46502d;
            if (i < bigIntegerArr2.length) {
                bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(valueOf);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static int m60283a(int i, int[] iArr, Charset charset, int i2, StringBuilder sb) {
        int i3;
        long j;
        int i4;
        int i5;
        int i6 = i;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i7 = 922;
        int i8 = 923;
        int i9 = 928;
        int i10 = 902;
        long j2 = 900;
        if (i6 == 901) {
            int[] iArr2 = new int[6];
            int i11 = i2 + 1;
            int i12 = iArr[i2];
            boolean z = false;
            loop0:
            while (true) {
                i4 = 0;
                long j3 = 0;
                while (i3 < iArr[0] && !z) {
                    int i13 = i4 + 1;
                    iArr2[i4] = i12;
                    j3 = (j3 * j) + ((long) i12);
                    int i14 = i3 + 1;
                    i12 = iArr[i3];
                    if (i12 == 900 || i12 == 901 || i12 == 902 || i12 == 924 || i12 == 928 || i12 == i8 || i12 == i7) {
                        i3 = i14 - 1;
                        i4 = i13;
                        i7 = 922;
                        i8 = 923;
                        j = 900;
                        z = true;
                    } else if (i13 % 5 != 0 || i13 <= 0) {
                        i3 = i14;
                        i4 = i13;
                        i7 = 922;
                        i8 = 923;
                        j = 900;
                    } else {
                        int i15 = 0;
                        while (i15 < 6) {
                            byteArrayOutputStream.write((byte) ((int) (j3 >> ((5 - i15) * 8))));
                            i15++;
                            i7 = 922;
                            i8 = 923;
                        }
                        i11 = i14;
                        j2 = 900;
                    }
                }
            }
            if (i3 != iArr[0] || i12 >= 900) {
                i5 = i4;
            } else {
                i5 = i4 + 1;
                iArr2[i4] = i12;
            }
            for (int i16 = 0; i16 < i5; i16++) {
                byteArrayOutputStream.write((byte) iArr2[i16]);
            }
        } else if (i6 == 924) {
            int i17 = i2;
            boolean z2 = false;
            int i18 = 0;
            long j4 = 0;
            while (i17 < iArr[0] && !z2) {
                int i19 = i17 + 1;
                int i20 = iArr[i17];
                if (i20 < 900) {
                    i18++;
                    j4 = (j4 * 900) + ((long) i20);
                    i17 = i19;
                } else {
                    if (i20 != 900 && i20 != 901 && i20 != i10 && i20 != 924 && i20 != i9) {
                        if (!(i20 == 923 || i20 == 922)) {
                            i17 = i19;
                        }
                    }
                    i17 = i19 - 1;
                    z2 = true;
                }
                if (i18 % 5 == 0 && i18 > 0) {
                    for (int i21 = 0; i21 < 6; i21++) {
                        byteArrayOutputStream.write((byte) ((int) (j4 >> ((5 - i21) * 8))));
                    }
                    i18 = 0;
                    j4 = 0;
                }
                i9 = 928;
                i10 = 902;
            }
            i3 = i17;
        } else {
            i3 = i2;
        }
        sb.append(new String(byteArrayOutputStream.toByteArray(), charset));
        return i3;
    }

    /* renamed from: b */
    static C10479e m60284b(int[] iArr, String str) throws C9914f {
        int i;
        StringBuilder sb = new StringBuilder(iArr.length << 1);
        Charset charset = f46501c;
        int i2 = iArr[1];
        C12555c cVar = new C12555c();
        int i3 = 2;
        while (i3 < iArr[0]) {
            if (i2 != 913) {
                switch (i2) {
                    case 900:
                        i = m60289g(iArr, i3, sb);
                        break;
                    case 901:
                        i = m60283a(i2, iArr, charset, i3, sb);
                        break;
                    case 902:
                        i = m60288f(iArr, i3, sb);
                        break;
                    default:
                        switch (i2) {
                            case 922:
                            case 923:
                                throw C9914f.m50845a();
                            case 924:
                                break;
                            case 925:
                                i = i3 + 1;
                                break;
                            case 926:
                                i = i3 + 2;
                                break;
                            case 927:
                                i = i3 + 1;
                                charset = Charset.forName(C10478d.m52820a(iArr[i3]).name());
                                break;
                            case 928:
                                i = m60286d(iArr, i3, cVar);
                                break;
                            default:
                                i = m60289g(iArr, i3 - 1, sb);
                                break;
                        }
                        i = m60283a(i2, iArr, charset, i3, sb);
                        break;
                }
            } else {
                i = i3 + 1;
                sb.append((char) iArr[i3]);
            }
            if (i < iArr.length) {
                i3 = i + 1;
                i2 = iArr[i];
            } else {
                throw C9914f.m50845a();
            }
        }
        if (sb.length() != 0) {
            C10479e eVar = new C10479e((byte[]) null, sb.toString(), (List<byte[]>) null, str);
            eVar.mo33601m(cVar);
            return eVar;
        }
        throw C9914f.m50845a();
    }

    /* renamed from: c */
    private static String m60285c(int[] iArr, int i) throws C9914f {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigInteger = bigInteger.add(f46502d[(i - i2) - 1].multiply(BigInteger.valueOf((long) iArr[i2])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw C9914f.m50845a();
    }

    /* renamed from: d */
    private static int m60286d(int[] iArr, int i, C12555c cVar) throws C9914f {
        if (i + 2 <= iArr[0]) {
            int[] iArr2 = new int[2];
            int i2 = 0;
            while (i2 < 2) {
                iArr2[i2] = iArr[i];
                i2++;
                i++;
            }
            cVar.mo37378d(Integer.parseInt(m60285c(iArr2, 2)));
            StringBuilder sb = new StringBuilder();
            int g = m60289g(iArr, i, sb);
            cVar.mo37375a(sb.toString());
            if (iArr[g] == 923) {
                int i3 = g + 1;
                int[] iArr3 = new int[(iArr[0] - i3)];
                boolean z = false;
                int i4 = 0;
                while (i3 < iArr[0] && !z) {
                    int i5 = i3 + 1;
                    int i6 = iArr[i3];
                    if (i6 < 900) {
                        iArr3[i4] = i6;
                        i3 = i5;
                        i4++;
                    } else if (i6 == 922) {
                        cVar.mo37376b(true);
                        i3 = i5 + 1;
                        z = true;
                    } else {
                        throw C9914f.m50845a();
                    }
                }
                cVar.mo37377c(Arrays.copyOf(iArr3, i4));
                return i3;
            } else if (iArr[g] != 922) {
                return g;
            } else {
                cVar.mo37376b(true);
                return g + 1;
            }
        } else {
            throw C9914f.m50845a();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b6, code lost:
        r10 = 0;
        r15 = r3;
        r3 = r1;
        r1 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d7, code lost:
        r10 = (char) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00f9, code lost:
        if (r10 == 0) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00fb, code lost:
        r0.append(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00fe, code lost:
        r5 = r5 + 1;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m60287e(int[] r16, int[] r17, int r18, java.lang.StringBuilder r19) {
        /*
            r0 = r19
            u9.e$b r1 = p368u9.C12714e.C12716b.ALPHA
            r2 = 0
            r4 = r18
            r3 = r1
            r5 = 0
        L_0x0009:
            if (r5 >= r4) goto L_0x0102
            r6 = r16[r5]
            int[] r7 = p368u9.C12714e.C12715a.f46503a
            int r8 = r1.ordinal()
            r7 = r7[r8]
            r8 = 28
            r9 = 27
            r10 = 32
            r11 = 913(0x391, float:1.28E-42)
            r12 = 900(0x384, float:1.261E-42)
            r13 = 29
            r14 = 26
            switch(r7) {
                case 1: goto L_0x00d3;
                case 2: goto L_0x00aa;
                case 3: goto L_0x0076;
                case 4: goto L_0x0058;
                case 5: goto L_0x0044;
                case 6: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x00f8
        L_0x0028:
            if (r6 >= r13) goto L_0x002f
            char[] r1 = f46499a
            char r10 = r1[r6]
            goto L_0x0049
        L_0x002f:
            if (r6 != r13) goto L_0x0035
            u9.e$b r1 = p368u9.C12714e.C12716b.ALPHA
            goto L_0x00f8
        L_0x0035:
            if (r6 != r11) goto L_0x003e
            r1 = r17[r5]
            char r1 = (char) r1
            r0.append(r1)
            goto L_0x0055
        L_0x003e:
            if (r6 != r12) goto L_0x0055
            u9.e$b r1 = p368u9.C12714e.C12716b.ALPHA
            goto L_0x00f8
        L_0x0044:
            if (r6 >= r14) goto L_0x004c
            int r6 = r6 + 65
            char r10 = (char) r6
        L_0x0049:
            r1 = r3
            goto L_0x00f9
        L_0x004c:
            if (r6 != r14) goto L_0x004f
            goto L_0x0049
        L_0x004f:
            if (r6 != r12) goto L_0x0055
            u9.e$b r1 = p368u9.C12714e.C12716b.ALPHA
            goto L_0x00f8
        L_0x0055:
            r1 = r3
            goto L_0x00f8
        L_0x0058:
            if (r6 >= r13) goto L_0x0060
            char[] r7 = f46499a
            char r10 = r7[r6]
            goto L_0x00f9
        L_0x0060:
            if (r6 != r13) goto L_0x0066
            u9.e$b r1 = p368u9.C12714e.C12716b.ALPHA
            goto L_0x00f8
        L_0x0066:
            if (r6 != r11) goto L_0x0070
            r6 = r17[r5]
            char r6 = (char) r6
            r0.append(r6)
            goto L_0x00f8
        L_0x0070:
            if (r6 != r12) goto L_0x00f8
            u9.e$b r1 = p368u9.C12714e.C12716b.ALPHA
            goto L_0x00f8
        L_0x0076:
            r7 = 25
            if (r6 >= r7) goto L_0x0080
            char[] r7 = f46500b
            char r10 = r7[r6]
            goto L_0x00f9
        L_0x0080:
            if (r6 != r7) goto L_0x0086
            u9.e$b r1 = p368u9.C12714e.C12716b.PUNCT
            goto L_0x00f8
        L_0x0086:
            if (r6 != r14) goto L_0x008a
            goto L_0x00f9
        L_0x008a:
            if (r6 != r9) goto L_0x0090
            u9.e$b r1 = p368u9.C12714e.C12716b.LOWER
            goto L_0x00f8
        L_0x0090:
            if (r6 != r8) goto L_0x0096
            u9.e$b r1 = p368u9.C12714e.C12716b.ALPHA
            goto L_0x00f8
        L_0x0096:
            if (r6 != r13) goto L_0x009b
            u9.e$b r3 = p368u9.C12714e.C12716b.PUNCT_SHIFT
            goto L_0x00b6
        L_0x009b:
            if (r6 != r11) goto L_0x00a5
            r6 = r17[r5]
            char r6 = (char) r6
            r0.append(r6)
            goto L_0x00f8
        L_0x00a5:
            if (r6 != r12) goto L_0x00f8
            u9.e$b r1 = p368u9.C12714e.C12716b.ALPHA
            goto L_0x00f8
        L_0x00aa:
            if (r6 >= r14) goto L_0x00af
            int r6 = r6 + 97
            goto L_0x00d7
        L_0x00af:
            if (r6 != r14) goto L_0x00b2
            goto L_0x00f9
        L_0x00b2:
            if (r6 != r9) goto L_0x00bb
            u9.e$b r3 = p368u9.C12714e.C12716b.ALPHA_SHIFT
        L_0x00b6:
            r10 = 0
            r15 = r3
            r3 = r1
            r1 = r15
            goto L_0x00f9
        L_0x00bb:
            if (r6 != r8) goto L_0x00c0
            u9.e$b r1 = p368u9.C12714e.C12716b.MIXED
            goto L_0x00f8
        L_0x00c0:
            if (r6 != r13) goto L_0x00c5
            u9.e$b r3 = p368u9.C12714e.C12716b.PUNCT_SHIFT
            goto L_0x00b6
        L_0x00c5:
            if (r6 != r11) goto L_0x00ce
            r6 = r17[r5]
            char r6 = (char) r6
            r0.append(r6)
            goto L_0x00f8
        L_0x00ce:
            if (r6 != r12) goto L_0x00f8
            u9.e$b r1 = p368u9.C12714e.C12716b.ALPHA
            goto L_0x00f8
        L_0x00d3:
            if (r6 >= r14) goto L_0x00d9
            int r6 = r6 + 65
        L_0x00d7:
            char r10 = (char) r6
            goto L_0x00f9
        L_0x00d9:
            if (r6 != r14) goto L_0x00dc
            goto L_0x00f9
        L_0x00dc:
            if (r6 != r9) goto L_0x00e1
            u9.e$b r1 = p368u9.C12714e.C12716b.LOWER
            goto L_0x00f8
        L_0x00e1:
            if (r6 != r8) goto L_0x00e6
            u9.e$b r1 = p368u9.C12714e.C12716b.MIXED
            goto L_0x00f8
        L_0x00e6:
            if (r6 != r13) goto L_0x00eb
            u9.e$b r3 = p368u9.C12714e.C12716b.PUNCT_SHIFT
            goto L_0x00b6
        L_0x00eb:
            if (r6 != r11) goto L_0x00f4
            r6 = r17[r5]
            char r6 = (char) r6
            r0.append(r6)
            goto L_0x00f8
        L_0x00f4:
            if (r6 != r12) goto L_0x00f8
            u9.e$b r1 = p368u9.C12714e.C12716b.ALPHA
        L_0x00f8:
            r10 = 0
        L_0x00f9:
            if (r10 == 0) goto L_0x00fe
            r0.append(r10)
        L_0x00fe:
            int r5 = r5 + 1
            goto L_0x0009
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p368u9.C12714e.m60287e(int[], int[], int, java.lang.StringBuilder):void");
    }

    /* renamed from: f */
    private static int m60288f(int[] iArr, int i, StringBuilder sb) throws C9914f {
        int[] iArr2 = new int[15];
        boolean z = false;
        int i2 = 0;
        while (i < iArr[0] && !z) {
            int i3 = i + 1;
            int i4 = iArr[i];
            if (i3 == iArr[0]) {
                z = true;
            }
            if (i4 < 900) {
                iArr2[i2] = i4;
                i2++;
            } else if (i4 == 900 || i4 == 901 || i4 == 924 || i4 == 928 || i4 == 923 || i4 == 922) {
                i3--;
                z = true;
            }
            if ((i2 % 15 == 0 || i4 == 902 || z) && i2 > 0) {
                sb.append(m60285c(iArr2, i2));
                i2 = 0;
            }
            i = i3;
        }
        return i;
    }

    /* renamed from: g */
    private static int m60289g(int[] iArr, int i, StringBuilder sb) {
        int[] iArr2 = new int[((iArr[0] - i) << 1)];
        int[] iArr3 = new int[((iArr[0] - i) << 1)];
        boolean z = false;
        int i2 = 0;
        while (i < iArr[0] && !z) {
            int i3 = i + 1;
            int i4 = iArr[i];
            if (i4 < 900) {
                iArr2[i2] = i4 / 30;
                iArr2[i2 + 1] = i4 % 30;
                i2 += 2;
            } else if (i4 != 913) {
                if (i4 != 928) {
                    switch (i4) {
                        case 900:
                            iArr2[i2] = 900;
                            i2++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i4) {
                                case 922:
                                case 923:
                                case 924:
                                    break;
                            }
                    }
                }
                i = i3 - 1;
                z = true;
            } else {
                iArr2[i2] = 913;
                i = i3 + 1;
                iArr3[i2] = iArr[i3];
                i2++;
            }
            i = i3;
        }
        m60287e(iArr2, iArr3, i2, sb);
        return i;
    }
}
