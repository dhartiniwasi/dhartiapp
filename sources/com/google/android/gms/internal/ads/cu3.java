package com.google.android.gms.internal.ads;

import com.startapp.C8843b4;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class cu3 implements ig3 {

    /* renamed from: e */
    private static final ThreadLocal f7952e = new au3();

    /* renamed from: f */
    private static final ThreadLocal f7953f = new bu3();

    /* renamed from: a */
    private final byte[] f7954a;

    /* renamed from: b */
    private final byte[] f7955b;

    /* renamed from: c */
    private final SecretKeySpec f7956c;

    /* renamed from: d */
    private final int f7957d;

    public cu3(byte[] bArr, int i) throws GeneralSecurityException {
        if (!tj3.m21050a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        } else if (i == 12 || i == 16) {
            this.f7957d = i;
            lv3.m16238a(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.f7956c = secretKeySpec;
            Cipher cipher = (Cipher) f7952e.get();
            cipher.init(1, secretKeySpec);
            byte[] c = m11200c(cipher.doFinal(new byte[16]));
            this.f7954a = c;
            this.f7955b = m11200c(c);
        } else {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
    }

    /* renamed from: c */
    private static byte[] m11200c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            byte b = bArr[i];
            int i2 = i + 1;
            bArr2[i] = (byte) (((b + b) ^ ((bArr[i2] & 255) >>> 7)) & 255);
            i = i2;
        }
        byte b2 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b2 + b2));
        return bArr2;
    }

    /* renamed from: d */
    private final byte[] m11201d(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws IllegalBlockSizeException, BadPaddingException {
        byte[] bArr2;
        int length;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(m11202e(bArr3, this.f7954a));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i4 = 0;
        int i5 = 0;
        while (i3 - i5 > 16) {
            for (int i6 = 0; i6 < 16; i6++) {
                doFinal[i6] = (byte) (doFinal[i6] ^ bArr[(i2 + i5) + i6]);
            }
            doFinal = cipher.doFinal(doFinal);
            i5 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i5 + i2, i2 + i3);
        if (copyOfRange.length == 16) {
            bArr2 = m11202e(copyOfRange, this.f7954a);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f7955b, 16);
            while (true) {
                length = copyOfRange.length;
                if (i4 >= length) {
                    break;
                }
                copyOf[i4] = (byte) (copyOf[i4] ^ copyOfRange[i4]);
                i4++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ C8843b4.f36445d);
            bArr2 = copyOf;
        }
        return cipher.doFinal(m11202e(doFinal, bArr2));
    }

    /* renamed from: e */
    private static byte[] m11202e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    /* renamed from: a */
    public final byte[] mo9175a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = (length - this.f7957d) - 16;
        if (i >= 0) {
            Cipher cipher = (Cipher) f7952e.get();
            cipher.init(1, this.f7956c);
            byte[] d = m11201d(cipher, 0, bArr, 0, this.f7957d);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] bArr3 = bArr2;
            byte[] d2 = m11201d(cipher, 1, bArr3, 0, bArr3.length);
            byte[] d3 = m11201d(cipher, 2, bArr, this.f7957d, i);
            int i2 = length - 16;
            byte b = 0;
            for (int i3 = 0; i3 < 16; i3++) {
                b = (byte) (b | (((bArr[i2 + i3] ^ d2[i3]) ^ d[i3]) ^ d3[i3]));
            }
            if (b == 0) {
                Cipher cipher2 = (Cipher) f7953f.get();
                cipher2.init(1, this.f7956c, new IvParameterSpec(d));
                return cipher2.doFinal(bArr, this.f7957d, i);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: b */
    public final byte[] mo9176b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f7957d;
        if (length <= (Integer.MAX_VALUE - i) - 16) {
            byte[] bArr3 = new byte[(i + length + 16)];
            byte[] a = jv3.m15081a(i);
            System.arraycopy(a, 0, bArr3, 0, this.f7957d);
            Cipher cipher = (Cipher) f7952e.get();
            cipher.init(1, this.f7956c);
            Cipher cipher2 = cipher;
            byte[] d = m11201d(cipher2, 0, a, 0, a.length);
            byte[] d2 = m11201d(cipher2, 1, bArr2, 0, 0);
            Cipher cipher3 = (Cipher) f7953f.get();
            cipher3.init(1, this.f7956c, new IvParameterSpec(d));
            cipher3.doFinal(bArr, 0, length, bArr3, this.f7957d);
            byte[] d3 = m11201d(cipher, 2, bArr3, this.f7957d, length);
            int i2 = length + this.f7957d;
            for (int i3 = 0; i3 < 16; i3++) {
                bArr3[i2 + i3] = (byte) ((d2[i3] ^ d[i3]) ^ d3[i3]);
            }
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
