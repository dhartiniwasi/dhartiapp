package androidx.core.text;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: androidx.core.text.f */
/* compiled from: TextUtilsCompat */
public final class C0821f {

    /* renamed from: a */
    private static final Locale f2437a = new Locale("", "");

    /* renamed from: androidx.core.text.f$a */
    /* compiled from: TextUtilsCompat */
    static class C0822a {
        /* renamed from: a */
        static int m3640a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    /* renamed from: a */
    private static int m3638a(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    /* renamed from: b */
    public static int m3639b(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return C0822a.m3640a(locale);
        }
        if (locale == null || locale.equals(f2437a)) {
            return 0;
        }
        String c = C0807b.m3611c(locale);
        if (c == null) {
            return m3638a(locale);
        }
        return (c.equalsIgnoreCase("Arab") || c.equalsIgnoreCase("Hebr")) ? 1 : 0;
    }
}
