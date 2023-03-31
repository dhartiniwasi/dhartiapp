package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.bf */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2213bf {

    /* renamed from: a */
    private static Cipher f7225a;

    /* renamed from: b */
    private static final Object f7226b = new Object();

    /* renamed from: c */
    private static final Object f7227c = new Object();

    public C2213bf(SecureRandom secureRandom) {
    }

    /* renamed from: c */
    private static final Cipher m10335c() throws NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher cipher;
        synchronized (f7227c) {
            if (f7225a == null) {
                f7225a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f7225a;
        }
        return cipher;
    }

    /* renamed from: a */
    public final String mo8761a(byte[] bArr, byte[] bArr2) throws C2176af {
        byte[] doFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f7226b) {
                m10335c().init(1, secretKeySpec, (SecureRandom) null);
                doFinal = m10335c().doFinal(bArr2);
                iv = m10335c().getIV();
            }
            int length2 = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            byte[] bArr3 = new byte[length2];
            allocate.get(bArr3);
            return C2322ed.m12035a(bArr3, false);
        } catch (NoSuchAlgorithmException e) {
            throw new C2176af(this, e);
        } catch (InvalidKeyException e2) {
            throw new C2176af(this, e2);
        } catch (IllegalBlockSizeException e3) {
            throw new C2176af(this, e3);
        } catch (NoSuchPaddingException e4) {
            throw new C2176af(this, e4);
        } catch (BadPaddingException e5) {
            throw new C2176af(this, e5);
        }
    }

    /* renamed from: b */
    public final byte[] mo8762b(byte[] bArr, String str) throws C2176af {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] b = C2322ed.m12036b(str, false);
            int length2 = b.length;
            if (length2 > 16) {
                ByteBuffer allocate = ByteBuffer.allocate(length2);
                allocate.put(b);
                allocate.flip();
                byte[] bArr2 = new byte[16];
                byte[] bArr3 = new byte[(length2 - 16)];
                allocate.get(bArr2);
                allocate.get(bArr3);
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (f7226b) {
                    m10335c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                    doFinal = m10335c().doFinal(bArr3);
                }
                return doFinal;
            }
            throw new C2176af(this);
        } catch (NoSuchAlgorithmException e) {
            throw new C2176af(this, e);
        } catch (InvalidKeyException e2) {
            throw new C2176af(this, e2);
        } catch (IllegalBlockSizeException e3) {
            throw new C2176af(this, e3);
        } catch (NoSuchPaddingException e4) {
            throw new C2176af(this, e4);
        } catch (BadPaddingException e5) {
            throw new C2176af(this, e5);
        } catch (InvalidAlgorithmParameterException e6) {
            throw new C2176af(this, e6);
        } catch (IllegalArgumentException e7) {
            throw new C2176af(this, e7);
        }
    }
}
