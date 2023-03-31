package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.google.android.gms.internal.ads.na */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2654na {
    /* renamed from: a */
    public static long m16987a(String str) {
        try {
            return m16990d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                C2208ba.m10260d("Unable to parse dateStr: %s, falling back to 0", str);
                return 0;
            }
            C2208ba.m10259c(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    /* renamed from: b */
    public static C3023x8 m16988b(C2542k9 k9Var) {
        long j;
        long j2;
        boolean z;
        long j3;
        long j4;
        long j5;
        C2542k9 k9Var2 = k9Var;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = k9Var2.f11967c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long a = str != null ? m16987a(str) : 0;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i2 = 0;
            j2 = 0;
            j = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            z = false;
            j2 = 0;
            j = 0;
        }
        String str3 = (String) map.get("Expires");
        long a2 = str3 != null ? m16987a(str3) : 0;
        String str4 = (String) map.get("Last-Modified");
        long a3 = str4 != null ? m16987a(str4) : 0;
        String str5 = (String) map.get("ETag");
        if (z) {
            j4 = currentTimeMillis + (j2 * 1000);
            if (i != 0) {
                j5 = j4;
            } else {
                Long.signum(j);
                j5 = (j * 1000) + j4;
            }
            j3 = j5;
        } else {
            j3 = 0;
            if (a <= 0 || a2 < a) {
                j4 = 0;
            } else {
                j4 = currentTimeMillis + (a2 - a);
                j3 = j4;
            }
        }
        C3023x8 x8Var = new C3023x8();
        x8Var.f20023a = k9Var2.f11966b;
        x8Var.f20024b = str5;
        x8Var.f20028f = j4;
        x8Var.f20027e = j3;
        x8Var.f20025c = a;
        x8Var.f20026d = a3;
        x8Var.f20029g = map;
        x8Var.f20030h = k9Var2.f11968d;
        return x8Var;
    }

    /* renamed from: c */
    static String m16989c(long j) {
        return m16990d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    /* renamed from: d */
    private static SimpleDateFormat m16990d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
