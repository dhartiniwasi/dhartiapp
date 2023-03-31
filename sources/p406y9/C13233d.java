package p406y9;

import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Map;
import p212d9.C9913e;
import p212d9.C9914f;
import p248h9.C10477c;
import p248h9.C10478d;
import p248h9.C10486l;

/* renamed from: y9.d */
/* compiled from: DecodedBitStreamParser */
final class C13233d {

    /* renamed from: a */
    private static final char[] f47490a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ea A[LOOP:0: B:1:0x001d->B:59:0x00ea, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c9 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p248h9.C10479e m62034a(byte[] r17, p406y9.C13239j r18, p406y9.C13235f r19, java.util.Map<p212d9.C9913e, ?> r20) throws p212d9.C9914f {
        /*
            r0 = r18
            h9.c r7 = new h9.c
            r8 = r17
            r7.<init>(r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r1 = 50
            r9.<init>(r1)
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 1
            r10.<init>(r11)
            r1 = 0
            r2 = -1
            r13 = 0
            r14 = -1
            r15 = -1
            r16 = 0
        L_0x001d:
            int r1 = r7.mo33585a()     // Catch:{ IllegalArgumentException -> 0x00ed }
            r2 = 4
            if (r1 >= r2) goto L_0x0028
            y9.h r1 = p406y9.C13237h.TERMINATOR     // Catch:{ IllegalArgumentException -> 0x00ed }
        L_0x0026:
            r6 = r1
            goto L_0x0031
        L_0x0028:
            int r1 = r7.mo33588d(r2)     // Catch:{ IllegalArgumentException -> 0x00ed }
            y9.h r1 = p406y9.C13237h.m62051a(r1)     // Catch:{ IllegalArgumentException -> 0x00ed }
            goto L_0x0026
        L_0x0031:
            y9.h r5 = p406y9.C13237h.TERMINATOR     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r6 == r5) goto L_0x00c5
            y9.h r1 = p406y9.C13237h.FNC1_FIRST_POSITION     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r6 == r1) goto L_0x00c1
            y9.h r1 = p406y9.C13237h.FNC1_SECOND_POSITION     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r6 != r1) goto L_0x003f
            goto L_0x00c1
        L_0x003f:
            y9.h r1 = p406y9.C13237h.STRUCTURED_APPEND     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r6 != r1) goto L_0x005e
            int r1 = r7.mo33585a()     // Catch:{ IllegalArgumentException -> 0x00ed }
            r2 = 16
            if (r1 < r2) goto L_0x0059
            r1 = 8
            int r2 = r7.mo33588d(r1)     // Catch:{ IllegalArgumentException -> 0x00ed }
            int r1 = r7.mo33588d(r1)     // Catch:{ IllegalArgumentException -> 0x00ed }
            r15 = r1
            r14 = r2
            goto L_0x00c5
        L_0x0059:
            d9.f r0 = p212d9.C9914f.m50845a()     // Catch:{ IllegalArgumentException -> 0x00ed }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00ed }
        L_0x005e:
            y9.h r1 = p406y9.C13237h.ECI     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r6 != r1) goto L_0x0073
            int r1 = m62040g(r7)     // Catch:{ IllegalArgumentException -> 0x00ed }
            h9.d r16 = p248h9.C10478d.m52820a(r1)     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r16 == 0) goto L_0x006e
            goto L_0x00c5
        L_0x006e:
            d9.f r0 = p212d9.C9914f.m50845a()     // Catch:{ IllegalArgumentException -> 0x00ed }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00ed }
        L_0x0073:
            y9.h r1 = p406y9.C13237h.HANZI     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r6 != r1) goto L_0x0089
            int r1 = r7.mo33588d(r2)     // Catch:{ IllegalArgumentException -> 0x00ed }
            int r2 = r6.mo38333b(r0)     // Catch:{ IllegalArgumentException -> 0x00ed }
            int r2 = r7.mo33588d(r2)     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r1 != r11) goto L_0x00c5
            m62037d(r7, r9, r2)     // Catch:{ IllegalArgumentException -> 0x00ed }
            goto L_0x00c5
        L_0x0089:
            int r1 = r6.mo38333b(r0)     // Catch:{ IllegalArgumentException -> 0x00ed }
            int r3 = r7.mo33588d(r1)     // Catch:{ IllegalArgumentException -> 0x00ed }
            y9.h r1 = p406y9.C13237h.NUMERIC     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r6 != r1) goto L_0x0099
            m62039f(r7, r9, r3)     // Catch:{ IllegalArgumentException -> 0x00ed }
            goto L_0x00c5
        L_0x0099:
            y9.h r1 = p406y9.C13237h.ALPHANUMERIC     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r6 != r1) goto L_0x00a1
            m62035b(r7, r9, r3, r13)     // Catch:{ IllegalArgumentException -> 0x00ed }
            goto L_0x00c5
        L_0x00a1:
            y9.h r1 = p406y9.C13237h.BYTE     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r6 != r1) goto L_0x00b2
            r1 = r7
            r2 = r9
            r4 = r16
            r11 = r5
            r5 = r10
            r12 = r6
            r6 = r20
            m62036c(r1, r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x00ed }
            goto L_0x00c7
        L_0x00b2:
            r11 = r5
            r12 = r6
            y9.h r1 = p406y9.C13237h.KANJI     // Catch:{ IllegalArgumentException -> 0x00ed }
            if (r12 != r1) goto L_0x00bc
            m62038e(r7, r9, r3)     // Catch:{ IllegalArgumentException -> 0x00ed }
            goto L_0x00c7
        L_0x00bc:
            d9.f r0 = p212d9.C9914f.m50845a()     // Catch:{ IllegalArgumentException -> 0x00ed }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00ed }
        L_0x00c1:
            r11 = r5
            r12 = r6
            r13 = 1
            goto L_0x00c7
        L_0x00c5:
            r11 = r5
            r12 = r6
        L_0x00c7:
            if (r12 != r11) goto L_0x00ea
            h9.e r7 = new h9.e
            java.lang.String r2 = r9.toString()
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x00d7
            r3 = 0
            goto L_0x00d8
        L_0x00d7:
            r3 = r10
        L_0x00d8:
            if (r19 != 0) goto L_0x00dc
            r4 = 0
            goto L_0x00e1
        L_0x00dc:
            java.lang.String r0 = r19.toString()
            r4 = r0
        L_0x00e1:
            r0 = r7
            r1 = r17
            r5 = r14
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        L_0x00ea:
            r11 = 1
            goto L_0x001d
        L_0x00ed:
            d9.f r0 = p212d9.C9914f.m50845a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p406y9.C13233d.m62034a(byte[], y9.j, y9.f, java.util.Map):h9.e");
    }

    /* renamed from: b */
    private static void m62035b(C10477c cVar, StringBuilder sb, int i, boolean z) throws C9914f {
        while (i > 1) {
            if (cVar.mo33585a() >= 11) {
                int d = cVar.mo33588d(11);
                sb.append(m62041h(d / 45));
                sb.append(m62041h(d % 45));
                i -= 2;
            } else {
                throw C9914f.m50845a();
            }
        }
        if (i == 1) {
            if (cVar.mo33585a() >= 6) {
                sb.append(m62041h(cVar.mo33588d(6)));
            } else {
                throw C9914f.m50845a();
            }
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i2 = length + 1;
                        if (sb.charAt(i2) == '%') {
                            sb.deleteCharAt(i2);
                        }
                    }
                    sb.setCharAt(length, 29);
                }
            }
        }
    }

    /* renamed from: c */
    private static void m62036c(C10477c cVar, StringBuilder sb, int i, C10478d dVar, Collection<byte[]> collection, Map<C9913e, ?> map) throws C9914f {
        String str;
        if ((i << 3) <= cVar.mo33585a()) {
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) cVar.mo33588d(8);
            }
            if (dVar == null) {
                str = C10486l.m52858a(bArr, map);
            } else {
                str = dVar.name();
            }
            try {
                sb.append(new String(bArr, str));
                collection.add(bArr);
            } catch (UnsupportedEncodingException unused) {
                throw C9914f.m50845a();
            }
        } else {
            throw C9914f.m50845a();
        }
    }

    /* renamed from: d */
    private static void m62037d(C10477c cVar, StringBuilder sb, int i) throws C9914f {
        if (i * 13 <= cVar.mo33585a()) {
            byte[] bArr = new byte[(i * 2)];
            int i2 = 0;
            while (i > 0) {
                int d = cVar.mo33588d(13);
                int i3 = (d % 96) | ((d / 96) << 8);
                int i4 = i3 + (i3 < 959 ? 41377 : 42657);
                bArr[i2] = (byte) (i4 >> 8);
                bArr[i2 + 1] = (byte) i4;
                i2 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, "GB2312"));
            } catch (UnsupportedEncodingException unused) {
                throw C9914f.m50845a();
            }
        } else {
            throw C9914f.m50845a();
        }
    }

    /* renamed from: e */
    private static void m62038e(C10477c cVar, StringBuilder sb, int i) throws C9914f {
        if (i * 13 <= cVar.mo33585a()) {
            byte[] bArr = new byte[(i * 2)];
            int i2 = 0;
            while (i > 0) {
                int d = cVar.mo33588d(13);
                int i3 = (d % 192) | ((d / 192) << 8);
                int i4 = i3 + (i3 < 7936 ? 33088 : 49472);
                bArr[i2] = (byte) (i4 >> 8);
                bArr[i2 + 1] = (byte) i4;
                i2 += 2;
                i--;
            }
            try {
                sb.append(new String(bArr, "SJIS"));
            } catch (UnsupportedEncodingException unused) {
                throw C9914f.m50845a();
            }
        } else {
            throw C9914f.m50845a();
        }
    }

    /* renamed from: f */
    private static void m62039f(C10477c cVar, StringBuilder sb, int i) throws C9914f {
        while (i >= 3) {
            if (cVar.mo33585a() >= 10) {
                int d = cVar.mo33588d(10);
                if (d < 1000) {
                    sb.append(m62041h(d / 100));
                    sb.append(m62041h((d / 10) % 10));
                    sb.append(m62041h(d % 10));
                    i -= 3;
                } else {
                    throw C9914f.m50845a();
                }
            } else {
                throw C9914f.m50845a();
            }
        }
        if (i == 2) {
            if (cVar.mo33585a() >= 7) {
                int d2 = cVar.mo33588d(7);
                if (d2 < 100) {
                    sb.append(m62041h(d2 / 10));
                    sb.append(m62041h(d2 % 10));
                    return;
                }
                throw C9914f.m50845a();
            }
            throw C9914f.m50845a();
        } else if (i != 1) {
        } else {
            if (cVar.mo33585a() >= 4) {
                int d3 = cVar.mo33588d(4);
                if (d3 < 10) {
                    sb.append(m62041h(d3));
                    return;
                }
                throw C9914f.m50845a();
            }
            throw C9914f.m50845a();
        }
    }

    /* renamed from: g */
    private static int m62040g(C10477c cVar) throws C9914f {
        int d = cVar.mo33588d(8);
        if ((d & 128) == 0) {
            return d & 127;
        }
        if ((d & 192) == 128) {
            return cVar.mo33588d(8) | ((d & 63) << 8);
        }
        if ((d & 224) == 192) {
            return cVar.mo33588d(16) | ((d & 31) << 16);
        }
        throw C9914f.m50845a();
    }

    /* renamed from: h */
    private static char m62041h(int i) throws C9914f {
        char[] cArr = f47490a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw C9914f.m50845a();
    }
}
