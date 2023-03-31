package com.startapp;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* renamed from: com.startapp.t9 */
/* compiled from: Sta */
public class C9557t9 {

    /* renamed from: a */
    private static final String f39194a = "t9";

    /* renamed from: a */
    public static String m50364a(String str) {
        String str2;
        try {
            str2 = InetAddress.getByName(str).getCanonicalHostName();
        } catch (UnknownHostException e) {
            C9632x2.m50512b(e);
            str2 = null;
        }
        if (str2 != null && !str2.equals(str) && str2.contains("cloudfront")) {
            String[] split = str2.split("\\.");
            if (split.length > 0) {
                return m50365b(split[1]);
            }
        }
        return "";
    }

    /* renamed from: b */
    public static String m50365b(String str) {
        return (str == null || str.length() <= 2) ? "" : str.substring(0, 3);
    }
}
