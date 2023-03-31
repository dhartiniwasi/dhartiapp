package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class tk3 {

    /* renamed from: g */
    private static final byte[] f18030g = new byte[0];

    /* renamed from: a */
    private final sk3 f18031a;

    /* renamed from: b */
    private final BigInteger f18032b;

    /* renamed from: c */
    private final byte[] f18033c;

    /* renamed from: d */
    private final byte[] f18034d;

    /* renamed from: e */
    private final byte[] f18035e;

    /* renamed from: f */
    private BigInteger f18036f = BigInteger.ZERO;

    private tk3(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, sk3 sk3) {
        this.f18035e = bArr;
        this.f18033c = bArr2;
        this.f18034d = bArr3;
        this.f18032b = bigInteger;
        this.f18031a = sk3;
    }

    /* renamed from: c */
    static tk3 m21059c(byte[] bArr, byte[] bArr2, wk3 wk3, rk3 rk3, sk3 sk3, byte[] bArr3) throws GeneralSecurityException {
        rk3 rk32 = rk3;
        byte[] b = gl3.m13380b(wk3.mo10835d(), rk3.mo13833c(), sk3.mo13293d());
        byte[] bArr4 = gl3.f9962l;
        byte[] bArr5 = f18030g;
        byte[] c = gu3.m13540c(gl3.f9951a, rk32.mo13835e(bArr4, bArr5, "psk_id_hash", b), rk32.mo13835e(bArr4, bArr3, "info_hash", b));
        rk3 rk33 = rk3;
        byte[] e = rk32.mo13835e(bArr2, bArr5, "secret", b);
        byte[] bArr6 = c;
        byte[] bArr7 = b;
        byte[] d = rk33.mo13834d(e, bArr6, "key", bArr7, sk3.zza());
        byte[] d2 = rk33.mo13834d(e, bArr6, "base_nonce", bArr7, 12);
        BigInteger bigInteger = BigInteger.ONE;
        return new tk3(bArr, d, d2, bigInteger.shiftLeft(96).subtract(bigInteger), sk3);
    }

    /* renamed from: d */
    private final synchronized byte[] m21060d() throws GeneralSecurityException {
        byte[] d;
        byte[] bArr = this.f18034d;
        byte[] byteArray = this.f18036f.toByteArray();
        int length = byteArray.length;
        if (length != 12) {
            if (length > 13) {
                throw new GeneralSecurityException("integer too large");
            } else if (length != 13) {
                byte[] bArr2 = new byte[12];
                System.arraycopy(byteArray, 0, bArr2, 12 - length, length);
                byteArray = bArr2;
            } else if (byteArray[0] == 0) {
                byteArray = Arrays.copyOfRange(byteArray, 1, 13);
            } else {
                throw new GeneralSecurityException("integer too large");
            }
        }
        d = gu3.m13541d(bArr, byteArray);
        if (this.f18036f.compareTo(this.f18032b) < 0) {
            this.f18036f = this.f18036f.add(BigInteger.ONE);
        } else {
            throw new GeneralSecurityException("message limit reached");
        }
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final byte[] mo14320a() {
        return this.f18035e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final byte[] mo14321b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.f18031a.mo13292a(this.f18033c, m21060d(), bArr, bArr2);
    }
}
