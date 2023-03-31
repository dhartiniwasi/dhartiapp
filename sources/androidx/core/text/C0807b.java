package androidx.core.text;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: androidx.core.text.b */
/* compiled from: ICUCompat */
public final class C0807b {

    /* renamed from: a */
    private static Method f2410a;

    /* renamed from: b */
    private static Method f2411b;

    /* renamed from: androidx.core.text.b$a */
    /* compiled from: ICUCompat */
    static class C0808a {
        /* renamed from: a */
        static String m3612a(Locale locale) {
            return locale.getScript();
        }
    }

    /* renamed from: androidx.core.text.b$b */
    /* compiled from: ICUCompat */
    static class C0809b {
        /* renamed from: a */
        static ULocale m3613a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        /* renamed from: b */
        static ULocale m3614b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        /* renamed from: c */
        static String m3615c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    static {
        Class<String> cls = String.class;
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            try {
                Class<?> cls2 = Class.forName("libcore.icu.ICU");
                f2410a = cls2.getMethod("getScript", new Class[]{cls});
                f2411b = cls2.getMethod("addLikelySubtags", new Class[]{cls});
            } catch (Exception e) {
                f2410a = null;
                f2411b = null;
                Log.w("ICUCompat", e);
            }
        } else if (i < 24) {
            try {
                f2411b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    /* renamed from: a */
    private static String m3609a(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = f2411b;
            if (method != null) {
                return (String) method.invoke((Object) null, new Object[]{locale2});
            }
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return locale2;
    }

    /* renamed from: b */
    private static String m3610b(String str) {
        try {
            Method method = f2410a;
            if (method != null) {
                return (String) method.invoke((Object) null, new Object[]{str});
            }
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
        }
        return null;
    }

    /* renamed from: c */
    public static String m3611c(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return C0809b.m3615c(C0809b.m3613a(C0809b.m3614b(locale)));
        }
        if (i >= 21) {
            try {
                return C0808a.m3612a((Locale) f2411b.invoke((Object) null, new Object[]{locale}));
            } catch (InvocationTargetException e) {
                Log.w("ICUCompat", e);
                return C0808a.m3612a(locale);
            } catch (IllegalAccessException e2) {
                Log.w("ICUCompat", e2);
                return C0808a.m3612a(locale);
            }
        } else {
            String a = m3609a(locale);
            if (a != null) {
                return m3610b(a);
            }
            return null;
        }
    }
}
