package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jq */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2522jq {
    /* renamed from: a */
    public static boolean m15004a(String str) {
        return "audio".equals(m15006c(str));
    }

    /* renamed from: b */
    public static boolean m15005b(String str) {
        return "video".equals(m15006c(str));
    }

    /* renamed from: c */
    private static String m15006c(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        throw new IllegalArgumentException("Invalid mime type: ".concat(str));
    }
}
