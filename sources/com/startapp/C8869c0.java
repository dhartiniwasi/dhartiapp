package com.startapp;

import android.net.LinkProperties;
import android.net.NetworkCapabilities;

/* renamed from: com.startapp.c0 */
/* compiled from: Sta */
public class C8869c0 {
    /* renamed from: a */
    public static String m48419a(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities != null) {
            try {
                return m48420a(networkCapabilities.toString(), "Capabilities:").replaceAll("&", ",").toLowerCase();
            } catch (Throwable th) {
                C9632x2.m50510a(th);
            }
        }
        return "";
    }

    /* renamed from: b */
    public static int m48421b(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities != null) {
            try {
                return Integer.parseInt(m48420a(networkCapabilities.toString(), "Specifier:").replaceAll("<", "").replaceAll(">", ""));
            } catch (Throwable th) {
                C9632x2.m50510a(th);
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static String m48418a(LinkProperties linkProperties) {
        if (linkProperties == null) {
            return "";
        }
        try {
            String a = m48420a(linkProperties.toString().replaceAll("\\[ ", "\\[").replaceAll(" \\]", "\\]"), "PcscfAddresses:");
            if (a.isEmpty()) {
                return "";
            }
            String replace = a.replace("[", "").replace("]", "");
            if (replace.lastIndexOf(",") == replace.length() - 1) {
                replace = replace.substring(0, replace.length() - 1);
            }
            return replace;
        } catch (Throwable th) {
            C9632x2.m50510a(th);
            return "";
        }
    }

    /* renamed from: a */
    private static String m48420a(String str, String str2) throws Exception {
        String substring = str.substring(str.indexOf(str2));
        String replaceAll = substring.replaceAll(str2 + " ", "");
        return replaceAll.substring(0, replaceAll.contains(" ") ? replaceAll.indexOf(" ") : replaceAll.length() - 1);
    }
}
