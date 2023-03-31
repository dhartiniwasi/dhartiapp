package com.google.android.gms.internal.ads;

import android.util.Base64;

/* renamed from: com.google.android.gms.internal.ads.ed */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2322ed {
    /* renamed from: a */
    public static String m12035a(byte[] bArr, boolean z) {
        return Base64.encodeToString(bArr, true != z ? 2 : 11);
    }

    /* renamed from: b */
    public static byte[] m12036b(String str, boolean z) throws IllegalArgumentException {
        byte[] decode = Base64.decode(str, true != z ? 2 : 11);
        if (decode.length != 0 || str.length() <= 0) {
            return decode;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }
}
