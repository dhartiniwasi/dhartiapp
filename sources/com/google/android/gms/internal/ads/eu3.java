package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class eu3 implements og3 {

    /* renamed from: c */
    private static final Collection f8948c = Arrays.asList(new Integer[]{64});

    /* renamed from: d */
    private static final byte[] f8949d = new byte[16];

    /* renamed from: a */
    private final ev3 f8950a;

    /* renamed from: b */
    private final byte[] f8951b;

    public eu3(byte[] bArr) throws GeneralSecurityException {
        if (tj3.m21050a(1)) {
            Collection collection = f8948c;
            int length = bArr.length;
            if (collection.contains(Integer.valueOf(length))) {
                int i = length >> 1;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i);
                this.f8951b = Arrays.copyOfRange(bArr, i, length);
                this.f8950a = new ev3(copyOfRange);
                return;
            }
            throw new InvalidKeyException("invalid key size: " + length + " bytes; key must have 64 bytes");
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }

    /* renamed from: a */
    public final byte[] mo10016a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3;
        if (bArr.length <= 2147483631) {
            Cipher cipher = (Cipher) su3.f17666e.mo14144a("AES/CTR/NoPadding");
            byte[][] bArr4 = {bArr2, bArr};
            byte[] a = this.f8950a.mo10018a(f8949d, 16);
            for (int i = 0; i <= 0; i++) {
                byte[] bArr5 = bArr4[i];
                if (bArr5 == null) {
                    bArr5 = new byte[0];
                }
                a = gu3.m13541d(fu3.m12852b(a), this.f8950a.mo10018a(bArr5, 16));
            }
            byte[] bArr6 = bArr4[1];
            int length = bArr6.length;
            if (length >= 16) {
                int length2 = a.length;
                if (length >= length2) {
                    int i2 = length - length2;
                    bArr3 = Arrays.copyOf(bArr6, length);
                    for (int i3 = 0; i3 < a.length; i3++) {
                        int i4 = i2 + i3;
                        bArr3[i4] = (byte) (bArr3[i4] ^ a[i3]);
                    }
                } else {
                    throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                }
            } else {
                bArr3 = gu3.m13541d(fu3.m12851a(bArr6), fu3.m12852b(a));
            }
            byte[] a2 = this.f8950a.mo10018a(bArr3, 16);
            byte[] bArr7 = (byte[]) a2.clone();
            bArr7[8] = (byte) (bArr7[8] & Byte.MAX_VALUE);
            bArr7[12] = (byte) (bArr7[12] & Byte.MAX_VALUE);
            cipher.init(1, new SecretKeySpec(this.f8951b, "AES"), new IvParameterSpec(bArr7));
            return gu3.m13540c(a2, cipher.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
