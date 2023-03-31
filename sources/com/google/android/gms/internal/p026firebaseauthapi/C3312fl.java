package com.google.android.gms.internal.p026firebaseauthapi;

import com.startapp.C8843b4;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.fl */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3312fl implements C3758t5 {

    /* renamed from: e */
    private static final ThreadLocal f22026e = new C3246dl();

    /* renamed from: f */
    private static final ThreadLocal f22027f = new C3279el();

    /* renamed from: a */
    private final byte[] f22028a;

    /* renamed from: b */
    private final byte[] f22029b;

    /* renamed from: c */
    private final SecretKeySpec f22030c;

    /* renamed from: d */
    private final int f22031d;

    public C3312fl(byte[] bArr, int i) throws GeneralSecurityException {
        if (!C3201c9.m25322a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        } else if (i == 12 || i == 16) {
            this.f22031d = i;
            C3544mm.m26217b(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.f22030c = secretKeySpec;
            Cipher cipher = (Cipher) f22026e.get();
            cipher.init(1, secretKeySpec);
            byte[] c = m25585c(cipher.doFinal(new byte[16]));
            this.f22028a = c;
            this.f22029b = m25585c(c);
        } else {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
    }

    /* renamed from: c */
    private static byte[] m25585c(byte[] bArr) {
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
    private final byte[] m25586d(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws IllegalBlockSizeException, BadPaddingException {
        byte[] bArr2;
        int length;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(m25587e(bArr3, this.f22028a));
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
            bArr2 = m25587e(copyOfRange, this.f22028a);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f22029b, 16);
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
        return cipher.doFinal(m25587e(doFinal, bArr2));
    }

    /* renamed from: e */
    private static byte[] m25587e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    /* renamed from: a */
    public final byte[] mo15791a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = (length - this.f22031d) - 16;
        if (i >= 0) {
            Cipher cipher = (Cipher) f22026e.get();
            cipher.init(1, this.f22030c);
            Cipher cipher2 = cipher;
            byte[] d = m25586d(cipher2, 0, bArr, 0, this.f22031d);
            byte[] d2 = m25586d(cipher2, 1, bArr2, 0, 0);
            byte[] d3 = m25586d(cipher, 2, bArr, this.f22031d, i);
            int i2 = length - 16;
            byte b = 0;
            for (int i3 = 0; i3 < 16; i3++) {
                b = (byte) (b | (((bArr[i2 + i3] ^ d2[i3]) ^ d[i3]) ^ d3[i3]));
            }
            if (b == 0) {
                Cipher cipher3 = (Cipher) f22027f.get();
                cipher3.init(1, this.f22030c, new IvParameterSpec(d));
                return cipher3.doFinal(bArr, this.f22031d, i);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: b */
    public final byte[] mo15792b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
