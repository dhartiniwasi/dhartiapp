package p067i5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p081k5.C4888c;

/* renamed from: i5.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C4687a {
    @Deprecated
    /* renamed from: a */
    public static byte[] m30364a(Context context, String str) throws PackageManager.NameNotFoundException {
        MessageDigest b;
        PackageInfo f = C4888c.m31075a(context).mo18673f(str, 64);
        Signature[] signatureArr = f.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (b = m30365b("SHA1")) == null) {
            return null;
        }
        return b.digest(f.signatures[0].toByteArray());
    }

    /* renamed from: b */
    public static MessageDigest m30365b(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
