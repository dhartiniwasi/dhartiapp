package com.google.android.gms.internal.p026firebaseauthapi;

import com.startapp.C8843b4;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.le */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3503le {
    /* renamed from: a */
    public static byte[] m26101a(byte[] bArr) {
        int length = bArr.length;
        if (length < 16) {
            byte[] copyOf = Arrays.copyOf(bArr, 16);
            copyOf[length] = C8843b4.f36445d;
            return copyOf;
        }
        throw new IllegalArgumentException("x must be smaller than a block.");
    }

    /* renamed from: b */
    public static byte[] m26102b(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            for (int i = 0; i < 16; i++) {
                byte b = bArr[i];
                byte b2 = (byte) ((b + b) & 254);
                bArr2[i] = b2;
                if (i < 15) {
                    bArr2[i] = (byte) (((bArr[i + 1] >> 7) & 1) | b2);
                }
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }
}
