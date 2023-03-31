package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.google.android.material.datepicker.r */
/* compiled from: UtcDates */
class C7667r {
    /* renamed from: a */
    static long m42684a(long j) {
        Calendar k = m42694k();
        k.setTimeInMillis(j);
        return m42687d(k).getTimeInMillis();
    }

    /* renamed from: b */
    static DateFormat m42685b(Locale locale) {
        return m42686c("MMMEd", locale);
    }

    /* renamed from: c */
    private static DateFormat m42686c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m42693j());
        return instanceForSkeleton;
    }

    /* renamed from: d */
    static Calendar m42687d(Calendar calendar) {
        Calendar l = m42695l(calendar);
        Calendar k = m42694k();
        k.set(l.get(1), l.get(2), l.get(5));
        return k;
    }

    /* renamed from: e */
    private static java.text.DateFormat m42688e(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(m42691h());
        return dateInstance;
    }

    /* renamed from: f */
    static java.text.DateFormat m42689f(Locale locale) {
        return m42688e(0, locale);
    }

    /* renamed from: g */
    private static SimpleDateFormat m42690g(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(m42691h());
        return simpleDateFormat;
    }

    /* renamed from: h */
    private static TimeZone m42691h() {
        return TimeZone.getTimeZone("UTC");
    }

    /* renamed from: i */
    static Calendar m42692i() {
        return m42687d(Calendar.getInstance());
    }

    /* renamed from: j */
    private static android.icu.util.TimeZone m42693j() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    /* renamed from: k */
    static Calendar m42694k() {
        return m42695l((Calendar) null);
    }

    /* renamed from: l */
    static Calendar m42695l(Calendar calendar) {
        Calendar instance = Calendar.getInstance(m42691h());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    /* renamed from: m */
    static DateFormat m42696m(Locale locale) {
        return m42686c("yMMMEd", locale);
    }

    /* renamed from: n */
    static SimpleDateFormat m42697n() {
        return m42698o(Locale.getDefault());
    }

    /* renamed from: o */
    private static SimpleDateFormat m42698o(Locale locale) {
        return m42690g("MMMM, yyyy", locale);
    }
}
