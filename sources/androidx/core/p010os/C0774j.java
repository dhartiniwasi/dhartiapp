package androidx.core.p010os;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: androidx.core.os.j */
/* compiled from: LocaleListCompatWrapper */
final class C0774j implements C0775k {

    /* renamed from: c */
    private static final Locale[] f2333c = new Locale[0];

    /* renamed from: d */
    private static final Locale f2334d = new Locale("en", "XA");

    /* renamed from: e */
    private static final Locale f2335e = new Locale("ar", "XB");

    /* renamed from: f */
    private static final Locale f2336f = C0772i.m3525b("en-Latn");

    /* renamed from: a */
    private final Locale[] f2337a;

    /* renamed from: b */
    private final String f2338b;

    C0774j(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f2337a = f2333c;
            this.f2338b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < localeArr.length) {
            Locale locale = localeArr[i];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    m3531b(sb, locale2);
                    if (i < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
                i++;
            } else {
                throw new NullPointerException("list[" + i + "] is null");
            }
        }
        this.f2337a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f2338b = sb.toString();
    }

    /* renamed from: b */
    static void m3531b(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append('-');
            sb.append(locale.getCountry());
        }
    }

    /* renamed from: a */
    public Object mo3148a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0774j)) {
            return false;
        }
        Locale[] localeArr = ((C0774j) obj).f2337a;
        if (this.f2337a.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.f2337a;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    public Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f2337a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public int hashCode() {
        int i = 1;
        for (Locale hashCode : this.f2337a) {
            i = (i * 31) + hashCode.hashCode();
        }
        return i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f2337a;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < this.f2337a.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
