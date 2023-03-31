package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class gl3 {

    /* renamed from: a */
    public static final byte[] f9951a = m13381c(1, 0);

    /* renamed from: b */
    public static final byte[] f9952b = m13381c(2, 32);

    /* renamed from: c */
    public static final byte[] f9953c = m13381c(2, 16);

    /* renamed from: d */
    public static final byte[] f9954d = m13381c(2, 17);

    /* renamed from: e */
    public static final byte[] f9955e = m13381c(2, 18);

    /* renamed from: f */
    public static final byte[] f9956f = m13381c(2, 1);

    /* renamed from: g */
    public static final byte[] f9957g = m13381c(2, 2);

    /* renamed from: h */
    public static final byte[] f9958h = m13381c(2, 3);

    /* renamed from: i */
    public static final byte[] f9959i = m13381c(2, 1);

    /* renamed from: j */
    public static final byte[] f9960j = m13381c(2, 2);

    /* renamed from: k */
    public static final byte[] f9961k = m13381c(2, 3);

    /* renamed from: l */
    public static final byte[] f9962l = new byte[0];

    /* renamed from: m */
    private static final byte[] f9963m = "KEM".getBytes(StandardCharsets.UTF_8);

    /* renamed from: n */
    private static final byte[] f9964n = "HPKE".getBytes(StandardCharsets.UTF_8);

    /* renamed from: o */
    private static final byte[] f9965o = "HPKE-v1".getBytes(StandardCharsets.UTF_8);

    /* renamed from: a */
    static void m13379a(xr3 xr3) throws GeneralSecurityException {
        if (xr3.mo15236L() == 2 || xr3.mo15236L() == 1) {
            throw new GeneralSecurityException("Invalid KEM param: ".concat(rr3.m20011a(xr3.mo15236L())));
        }
        String str = "UNRECOGNIZED";
        if (xr3.mo15235K() == 2 || xr3.mo15235K() == 1) {
            int K = xr3.mo15235K();
            if (K == 2) {
                str = "KDF_UNKNOWN";
            } else if (K == 3) {
                str = "HKDF_SHA256";
            } else if (K == 4) {
                str = "HKDF_SHA384";
            } else if (K == 5) {
                str = "HKDF_SHA512";
            }
            throw new GeneralSecurityException("Invalid KDF param: ".concat(str));
        } else if (xr3.mo15234J() == 2 || xr3.mo15234J() == 1) {
            int J = xr3.mo15234J();
            if (J == 2) {
                str = "AEAD_UNKNOWN";
            } else if (J == 3) {
                str = "AES_128_GCM";
            } else if (J == 4) {
                str = "AES_256_GCM";
            } else if (J == 5) {
                str = "CHACHA20_POLY1305";
            }
            throw new GeneralSecurityException("Invalid AEAD param: ".concat(str));
        }
    }

    /* renamed from: b */
    static byte[] m13380b(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        return gu3.m13540c(f9964n, bArr, bArr2, bArr3);
    }

    /* renamed from: c */
    public static byte[] m13381c(int i, int i2) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ((i2 >> (((i - i3) - 1) * 8)) & 255);
        }
        return bArr;
    }

    /* renamed from: d */
    static byte[] m13382d(byte[] bArr) throws GeneralSecurityException {
        return gu3.m13540c(f9963m, bArr);
    }

    /* renamed from: e */
    static byte[] m13383e(String str, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return gu3.m13540c(f9965o, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }

    /* renamed from: f */
    static byte[] m13384f(String str, byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        return gu3.m13540c(m13381c(2, i), f9965o, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }
}
