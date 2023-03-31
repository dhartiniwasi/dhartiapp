package androidx.core.p010os;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;

/* renamed from: androidx.core.os.f */
/* compiled from: ConfigurationCompat */
public final class C0766f {

    /* renamed from: androidx.core.os.f$a */
    /* compiled from: ConfigurationCompat */
    static class C0767a {
        /* renamed from: a */
        static LocaleList m3520a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    /* renamed from: a */
    public static C0772i m3519a(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0772i.m3526d(C0767a.m3520a(configuration));
        }
        return C0772i.m3524a(configuration.locale);
    }
}
