package com.google.android.material.datepicker;

import android.os.Build;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.e */
/* compiled from: DateStrings */
class C7632e {
    /* renamed from: a */
    static String m42573a(long j) {
        return m42574b(j, Locale.getDefault());
    }

    /* renamed from: b */
    static String m42574b(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C7667r.m42685b(locale).format(new Date(j));
        }
        return C7667r.m42689f(locale).format(new Date(j));
    }

    /* renamed from: c */
    static String m42575c(long j) {
        return m42576d(j, Locale.getDefault());
    }

    /* renamed from: d */
    static String m42576d(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C7667r.m42696m(locale).format(new Date(j));
        }
        return C7667r.m42689f(locale).format(new Date(j));
    }
}
