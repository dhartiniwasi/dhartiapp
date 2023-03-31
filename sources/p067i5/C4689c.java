package p067i5;

import android.util.Base64;

/* renamed from: i5.c */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C4689c {
    /* renamed from: a */
    public static byte[] m30369a(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 10);
    }

    /* renamed from: b */
    public static byte[] m30370b(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    /* renamed from: c */
    public static String m30371c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    /* renamed from: d */
    public static String m30372d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }

    /* renamed from: e */
    public static String m30373e(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
