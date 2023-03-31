package androidx.core.p010os;

import android.os.Build;
import java.util.Locale;

/* renamed from: androidx.core.os.a */
/* compiled from: BuildCompat */
public class C0759a {
    /* renamed from: a */
    protected static boolean m3504a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        if (str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0) {
            return true;
        }
        return false;
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m3505b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @Deprecated
    /* renamed from: c */
    public static boolean m3506c() {
        int i = Build.VERSION.SDK_INT;
        return i >= 31 || (i >= 30 && m3504a("S", Build.VERSION.CODENAME));
    }

    /* renamed from: d */
    public static boolean m3507d() {
        int i = Build.VERSION.SDK_INT;
        return i >= 33 || (i >= 32 && m3504a("Tiramisu", Build.VERSION.CODENAME));
    }
}
