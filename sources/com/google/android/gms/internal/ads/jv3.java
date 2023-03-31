package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class jv3 {

    /* renamed from: a */
    private static final ThreadLocal f11806a = new iv3();

    /* renamed from: a */
    public static byte[] m15081a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f11806a.get()).nextBytes(bArr);
        return bArr;
    }
}
