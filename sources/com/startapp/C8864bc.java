package com.startapp;

import com.facebook.ads.AdError;
import java.lang.Comparable;
import java.util.regex.Pattern;

/* renamed from: com.startapp.bc */
/* compiled from: Sta */
public class C8864bc<T extends Comparable<T>> implements Comparable<C8864bc<T>> {

    /* renamed from: c */
    public static Pattern f36545c = Pattern.compile("\\d{2}:\\d{2}:\\d{2}(.\\d{3})?");

    /* renamed from: d */
    public static Pattern f36546d = Pattern.compile("((\\d{1,2})|(100))%");

    /* renamed from: a */
    public final String f36547a;

    /* renamed from: b */
    public final T f36548b;

    public C8864bc(String str, T t) {
        this.f36547a = str;
        this.f36548b = t;
    }

    /* renamed from: a */
    public static boolean m48411a(String str) {
        return f36545c.matcher(str).matches();
    }

    /* renamed from: b */
    public static Integer m48412b(String str) {
        String[] split = str.split(":");
        if (split.length != 3) {
            return null;
        }
        try {
            return Integer.valueOf((Integer.parseInt(split[1]) * 60 * AdError.NETWORK_ERROR_CODE) + (Integer.parseInt(split[0]) * 60 * 60 * AdError.NETWORK_ERROR_CODE) + ((int) (Float.parseFloat(split[2]) * 1000.0f)));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public int compareTo(Object obj) {
        return this.f36548b.compareTo(((C8864bc) obj).f36548b);
    }
}
