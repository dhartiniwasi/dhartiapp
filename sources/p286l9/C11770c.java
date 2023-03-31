package p286l9;

import java.io.UnsupportedEncodingException;
import java.util.Collection;
import p212d9.C9914f;
import p248h9.C10477c;

/* renamed from: l9.c */
/* compiled from: DecodedBitStreamParser */
final class C11770c {

    /* renamed from: a */
    private static final char[] f44393a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* renamed from: b */
    private static final char[] f44394b;

    /* renamed from: c */
    private static final char[] f44395c = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /* renamed from: d */
    private static final char[] f44396d;

    /* renamed from: e */
    private static final char[] f44397e = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};

    /* renamed from: l9.c$a */
    /* compiled from: DecodedBitStreamParser */
    static /* synthetic */ class C11771a {

        /* renamed from: a */
        static final /* synthetic */ int[] f44398a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                l9.c$b[] r0 = p286l9.C11770c.C11772b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44398a = r0
                l9.c$b r1 = p286l9.C11770c.C11772b.C40_ENCODE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f44398a     // Catch:{ NoSuchFieldError -> 0x001d }
                l9.c$b r1 = p286l9.C11770c.C11772b.TEXT_ENCODE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f44398a     // Catch:{ NoSuchFieldError -> 0x0028 }
                l9.c$b r1 = p286l9.C11770c.C11772b.ANSIX12_ENCODE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f44398a     // Catch:{ NoSuchFieldError -> 0x0033 }
                l9.c$b r1 = p286l9.C11770c.C11772b.EDIFACT_ENCODE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f44398a     // Catch:{ NoSuchFieldError -> 0x003e }
                l9.c$b r1 = p286l9.C11770c.C11772b.BASE256_ENCODE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p286l9.C11770c.C11771a.<clinit>():void");
        }
    }

    /* renamed from: l9.c$b */
    /* compiled from: DecodedBitStreamParser */
    private enum C11772b {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
        f44394b = cArr;
        f44396d = cArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p248h9.C10479e m57087a(byte[] r8) throws p212d9.C9914f {
        /*
            h9.c r0 = new h9.c
            r0.<init>(r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 100
            r1.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 0
            r2.<init>(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 1
            r3.<init>(r4)
            l9.c$b r5 = p286l9.C11770c.C11772b.ASCII_ENCODE
        L_0x001a:
            l9.c$b r6 = p286l9.C11770c.C11772b.ASCII_ENCODE
            if (r5 != r6) goto L_0x0023
            l9.c$b r5 = m57089c(r0, r1, r2)
            goto L_0x0052
        L_0x0023:
            int[] r7 = p286l9.C11770c.C11771a.f44398a
            int r5 = r5.ordinal()
            r5 = r7[r5]
            if (r5 == r4) goto L_0x004e
            r7 = 2
            if (r5 == r7) goto L_0x004a
            r7 = 3
            if (r5 == r7) goto L_0x0046
            r7 = 4
            if (r5 == r7) goto L_0x0042
            r7 = 5
            if (r5 != r7) goto L_0x003d
            m57090d(r0, r1, r3)
            goto L_0x0051
        L_0x003d:
            d9.f r8 = p212d9.C9914f.m50845a()
            throw r8
        L_0x0042:
            m57092f(r0, r1)
            goto L_0x0051
        L_0x0046:
            m57088b(r0, r1)
            goto L_0x0051
        L_0x004a:
            m57093g(r0, r1)
            goto L_0x0051
        L_0x004e:
            m57091e(r0, r1)
        L_0x0051:
            r5 = r6
        L_0x0052:
            l9.c$b r6 = p286l9.C11770c.C11772b.PAD_ENCODE
            if (r5 == r6) goto L_0x005c
            int r6 = r0.mo33585a()
            if (r6 > 0) goto L_0x001a
        L_0x005c:
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0065
            r1.append(r2)
        L_0x0065:
            h9.e r0 = new h9.e
            java.lang.String r1 = r1.toString()
            boolean r2 = r3.isEmpty()
            r4 = 0
            if (r2 == 0) goto L_0x0073
            r3 = r4
        L_0x0073:
            r0.<init>(r8, r1, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p286l9.C11770c.m57087a(byte[]):h9.e");
    }

    /* renamed from: b */
    private static void m57088b(C10477c cVar, StringBuilder sb) throws C9914f {
        int d;
        int[] iArr = new int[3];
        while (cVar.mo33585a() != 8 && (d = cVar.mo33588d(8)) != 254) {
            m57094h(d, cVar.mo33588d(8), iArr);
            for (int i = 0; i < 3; i++) {
                int i2 = iArr[i];
                if (i2 == 0) {
                    sb.append(13);
                } else if (i2 == 1) {
                    sb.append('*');
                } else if (i2 == 2) {
                    sb.append('>');
                } else if (i2 == 3) {
                    sb.append(' ');
                } else if (i2 < 14) {
                    sb.append((char) (i2 + 44));
                } else if (i2 < 40) {
                    sb.append((char) (i2 + 51));
                } else {
                    throw C9914f.m50845a();
                }
            }
            if (cVar.mo33585a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: c */
    private static C11772b m57089c(C10477c cVar, StringBuilder sb, StringBuilder sb2) throws C9914f {
        boolean z = false;
        do {
            int d = cVar.mo33588d(8);
            if (d == 0) {
                throw C9914f.m50845a();
            } else if (d <= 128) {
                if (z) {
                    d += 128;
                }
                sb.append((char) (d - 1));
                return C11772b.ASCII_ENCODE;
            } else if (d == 129) {
                return C11772b.PAD_ENCODE;
            } else {
                if (d <= 229) {
                    int i = d - 130;
                    if (i < 10) {
                        sb.append('0');
                    }
                    sb.append(i);
                } else if (d == 230) {
                    return C11772b.C40_ENCODE;
                } else {
                    if (d == 231) {
                        return C11772b.BASE256_ENCODE;
                    }
                    if (d == 232) {
                        sb.append(29);
                    } else if (!(d == 233 || d == 234)) {
                        if (d == 235) {
                            z = true;
                        } else if (d == 236) {
                            sb.append("[)>\u001e05\u001d");
                            sb2.insert(0, "\u001e\u0004");
                        } else if (d == 237) {
                            sb.append("[)>\u001e06\u001d");
                            sb2.insert(0, "\u001e\u0004");
                        } else if (d == 238) {
                            return C11772b.ANSIX12_ENCODE;
                        } else {
                            if (d == 239) {
                                return C11772b.TEXT_ENCODE;
                            }
                            if (d == 240) {
                                return C11772b.EDIFACT_ENCODE;
                            }
                            if (!(d == 241 || d < 242 || (d == 254 && cVar.mo33585a() == 0))) {
                                throw C9914f.m50845a();
                            }
                        }
                    }
                }
            }
        } while (cVar.mo33585a() > 0);
        return C11772b.ASCII_ENCODE;
    }

    /* renamed from: d */
    private static void m57090d(C10477c cVar, StringBuilder sb, Collection<byte[]> collection) throws C9914f {
        int c = cVar.mo33587c() + 1;
        int i = c + 1;
        int i2 = m57095i(cVar.mo33588d(8), c);
        if (i2 == 0) {
            i2 = cVar.mo33585a() / 8;
        } else if (i2 >= 250) {
            i2 = ((i2 - 249) * 250) + m57095i(cVar.mo33588d(8), i);
            i++;
        }
        if (i2 >= 0) {
            byte[] bArr = new byte[i2];
            int i3 = 0;
            while (i3 < i2) {
                if (cVar.mo33585a() >= 8) {
                    bArr[i3] = (byte) m57095i(cVar.mo33588d(8), i);
                    i3++;
                    i++;
                } else {
                    throw C9914f.m50845a();
                }
            }
            collection.add(bArr);
            try {
                sb.append(new String(bArr, "ISO8859_1"));
            } catch (UnsupportedEncodingException e) {
                throw new IllegalStateException("Platform does not support required encoding: " + e);
            }
        } else {
            throw C9914f.m50845a();
        }
    }

    /* renamed from: e */
    private static void m57091e(C10477c cVar, StringBuilder sb) throws C9914f {
        int d;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (cVar.mo33585a() != 8 && (d = cVar.mo33588d(8)) != 254) {
            m57094h(d, cVar.mo33588d(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            char[] cArr = f44394b;
                            if (i3 < cArr.length) {
                                char c = cArr[i3];
                                if (z) {
                                    sb.append((char) (c + 128));
                                } else {
                                    sb.append(c);
                                }
                            } else if (i3 == 27) {
                                sb.append(29);
                            } else if (i3 == 30) {
                                z = true;
                            } else {
                                throw C9914f.m50845a();
                            }
                            i = 0;
                        } else if (i != 3) {
                            throw C9914f.m50845a();
                        } else if (z) {
                            sb.append((char) (i3 + 224));
                        } else {
                            sb.append((char) (i3 + 96));
                            i = 0;
                        }
                    } else if (z) {
                        sb.append((char) (i3 + 128));
                    } else {
                        sb.append((char) i3);
                        i = 0;
                    }
                    z = false;
                    i = 0;
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr2 = f44393a;
                    if (i3 < cArr2.length) {
                        char c2 = cArr2[i3];
                        if (z) {
                            sb.append((char) (c2 + 128));
                            z = false;
                        } else {
                            sb.append(c2);
                        }
                    } else {
                        throw C9914f.m50845a();
                    }
                }
            }
            if (cVar.mo33585a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: f */
    private static void m57092f(C10477c cVar, StringBuilder sb) {
        while (cVar.mo33585a() > 16) {
            for (int i = 0; i < 4; i++) {
                int d = cVar.mo33588d(6);
                if (d == 31) {
                    int b = 8 - cVar.mo33586b();
                    if (b != 8) {
                        cVar.mo33588d(b);
                        return;
                    }
                    return;
                }
                if ((d & 32) == 0) {
                    d |= 64;
                }
                sb.append((char) d);
            }
            if (cVar.mo33585a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: g */
    private static void m57093g(C10477c cVar, StringBuilder sb) throws C9914f {
        int d;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (cVar.mo33585a() != 8 && (d = cVar.mo33588d(8)) != 254) {
            m57094h(d, cVar.mo33588d(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            char[] cArr = f44396d;
                            if (i3 < cArr.length) {
                                char c = cArr[i3];
                                if (z) {
                                    sb.append((char) (c + 128));
                                } else {
                                    sb.append(c);
                                }
                            } else if (i3 == 27) {
                                sb.append(29);
                            } else if (i3 == 30) {
                                z = true;
                            } else {
                                throw C9914f.m50845a();
                            }
                            i = 0;
                        } else if (i == 3) {
                            char[] cArr2 = f44397e;
                            if (i3 < cArr2.length) {
                                char c2 = cArr2[i3];
                                if (z) {
                                    sb.append((char) (c2 + 128));
                                } else {
                                    sb.append(c2);
                                    i = 0;
                                }
                            } else {
                                throw C9914f.m50845a();
                            }
                        } else {
                            throw C9914f.m50845a();
                        }
                    } else if (z) {
                        sb.append((char) (i3 + 128));
                    } else {
                        sb.append((char) i3);
                        i = 0;
                    }
                    z = false;
                    i = 0;
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr3 = f44395c;
                    if (i3 < cArr3.length) {
                        char c3 = cArr3[i3];
                        if (z) {
                            sb.append((char) (c3 + 128));
                            z = false;
                        } else {
                            sb.append(c3);
                        }
                    } else {
                        throw C9914f.m50845a();
                    }
                }
            }
            if (cVar.mo33585a() <= 0) {
                return;
            }
        }
    }

    /* renamed from: h */
    private static void m57094h(int i, int i2, int[] iArr) {
        int i3 = ((i << 8) + i2) - 1;
        int i4 = i3 / 1600;
        iArr[0] = i4;
        int i5 = i3 - (i4 * 1600);
        int i6 = i5 / 40;
        iArr[1] = i6;
        iArr[2] = i5 - (i6 * 40);
    }

    /* renamed from: i */
    private static int m57095i(int i, int i2) {
        int i3 = i - (((i2 * 149) % 255) + 1);
        return i3 >= 0 ? i3 : i3 + 256;
    }
}
