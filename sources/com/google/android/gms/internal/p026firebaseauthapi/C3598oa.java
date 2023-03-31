package com.google.android.gms.internal.p026firebaseauthapi;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.oa */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3598oa {

    /* renamed from: a */
    public static final byte[] f22445a = m26363c(1, 0);

    /* renamed from: b */
    public static final byte[] f22446b = m26363c(2, 32);

    /* renamed from: c */
    public static final byte[] f22447c = m26363c(2, 16);

    /* renamed from: d */
    public static final byte[] f22448d = m26363c(2, 17);

    /* renamed from: e */
    public static final byte[] f22449e = m26363c(2, 18);

    /* renamed from: f */
    public static final byte[] f22450f = m26363c(2, 1);

    /* renamed from: g */
    public static final byte[] f22451g = m26363c(2, 2);

    /* renamed from: h */
    public static final byte[] f22452h = m26363c(2, 3);

    /* renamed from: i */
    public static final byte[] f22453i = m26363c(2, 1);

    /* renamed from: j */
    public static final byte[] f22454j = m26363c(2, 2);

    /* renamed from: k */
    public static final byte[] f22455k = m26363c(2, 3);

    /* renamed from: l */
    public static final byte[] f22456l = new byte[0];

    /* renamed from: m */
    private static final byte[] f22457m = "KEM".getBytes(StandardCharsets.UTF_8);

    /* renamed from: n */
    private static final byte[] f22458n = "HPKE".getBytes(StandardCharsets.UTF_8);

    /* renamed from: o */
    private static final byte[] f22459o = "HPKE-v1".getBytes(StandardCharsets.UTF_8);

    /* renamed from: a */
    static void m26361a(C3933yi yiVar) throws GeneralSecurityException {
        if (yiVar.mo17081E() == 2 || yiVar.mo17081E() == 1) {
            throw new GeneralSecurityException("Invalid KEM param: ".concat(C3738si.m26923a(yiVar.mo17081E())));
        }
        String str = "UNRECOGNIZED";
        if (yiVar.mo17080D() == 2 || yiVar.mo17080D() == 1) {
            int D = yiVar.mo17080D();
            if (D == 2) {
                str = "KDF_UNKNOWN";
            } else if (D == 3) {
                str = "HKDF_SHA256";
            } else if (D == 4) {
                str = "HKDF_SHA384";
            } else if (D == 5) {
                str = "HKDF_SHA512";
            }
            throw new GeneralSecurityException("Invalid KDF param: ".concat(str));
        } else if (yiVar.mo17079C() == 2 || yiVar.mo17079C() == 1) {
            int C = yiVar.mo17079C();
            if (C == 2) {
                str = "AEAD_UNKNOWN";
            } else if (C == 3) {
                str = "AES_128_GCM";
            } else if (C == 4) {
                str = "AES_256_GCM";
            } else if (C == 5) {
                str = "CHACHA20_POLY1305";
            }
            throw new GeneralSecurityException("Invalid AEAD param: ".concat(str));
        }
    }

    /* renamed from: b */
    static byte[] m26362b(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        return C3411il.m25823c(f22458n, bArr, bArr2, bArr3);
    }

    /* renamed from: c */
    public static byte[] m26363c(int i, int i2) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ((i2 >> (((i - i3) - 1) * 8)) & 255);
        }
        return bArr;
    }

    /* renamed from: d */
    static byte[] m26364d(byte[] bArr) throws GeneralSecurityException {
        return C3411il.m25823c(f22457m, bArr);
    }

    /* renamed from: e */
    static byte[] m26365e(String str, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return C3411il.m25823c(f22459o, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }

    /* renamed from: f */
    static byte[] m26366f(String str, byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        return C3411il.m25823c(m26363c(2, i), f22459o, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }

    /* renamed from: g */
    static int m26367g(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        if (i2 == 4) {
            return 3;
        }
        throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
    }
}
