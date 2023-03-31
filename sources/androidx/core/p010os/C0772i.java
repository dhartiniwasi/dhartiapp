package androidx.core.p010os;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* renamed from: androidx.core.os.i */
/* compiled from: LocaleListCompat */
public final class C0772i {

    /* renamed from: b */
    private static final C0772i f2331b = m3524a(new Locale[0]);

    /* renamed from: a */
    private final C0775k f2332a;

    /* renamed from: androidx.core.os.i$a */
    /* compiled from: LocaleListCompat */
    static class C0773a {
        /* renamed from: a */
        static LocaleList m3528a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        /* renamed from: b */
        static LocaleList m3529b() {
            return LocaleList.getAdjustedDefault();
        }

        /* renamed from: c */
        static LocaleList m3530c() {
            return LocaleList.getDefault();
        }
    }

    private C0772i(C0775k kVar) {
        this.f2332a = kVar;
    }

    /* renamed from: a */
    public static C0772i m3524a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return m3526d(C0773a.m3528a(localeArr));
        }
        return new C0772i(new C0774j(localeArr));
    }

    /* renamed from: b */
    static Locale m3525b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (!str.contains("_")) {
            return new Locale(str);
        } else {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    /* renamed from: d */
    public static C0772i m3526d(LocaleList localeList) {
        return new C0772i(new C0776l(localeList));
    }

    /* renamed from: c */
    public Locale mo3144c(int i) {
        return this.f2332a.get(i);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0772i) && this.f2332a.equals(((C0772i) obj).f2332a);
    }

    public int hashCode() {
        return this.f2332a.hashCode();
    }

    public String toString() {
        return this.f2332a.toString();
    }
}
