package p144t5;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: t5.z0 */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class C5614z0 {

    /* renamed from: a */
    private static String f28263a;

    /* renamed from: a */
    public static synchronized String m33700a(Context context) {
        String str;
        String str2;
        synchronized (C5614z0.class) {
            if (f28263a == null) {
                ContentResolver contentResolver = context.getContentResolver();
                if (contentResolver == null) {
                    str2 = null;
                } else {
                    str2 = Settings.Secure.getString(contentResolver, "android_id");
                }
                if (str2 == null || m33701b()) {
                    str2 = "emulator";
                }
                f28263a = m33702c(str2);
            }
            str = f28263a;
        }
        return str;
    }

    /* renamed from: b */
    public static boolean m33701b() {
        String str = Build.FINGERPRINT;
        if (str.startsWith("generic") || str.startsWith("unknown")) {
            return true;
        }
        String str2 = Build.MODEL;
        if (str2.contains("google_sdk") || str2.contains("Emulator") || str2.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion")) {
            return true;
        }
        return (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || "google_sdk".equals(Build.PRODUCT);
    }

    /* renamed from: c */
    private static String m33702c(String str) {
        int i = 0;
        while (i < 3) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(str.getBytes());
                return String.format("%032X", new Object[]{new BigInteger(1, instance.digest())});
            } catch (NoSuchAlgorithmException unused) {
                i++;
            } catch (ArithmeticException unused2) {
                return "";
            }
        }
        return "";
    }
}
