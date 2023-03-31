package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.ix */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2492ix {

    /* renamed from: a */
    private static final HashSet f11131a = new HashSet();

    /* renamed from: b */
    private static String f11132b = "media3.common";

    /* renamed from: a */
    public static synchronized String m14582a() {
        String str;
        synchronized (C2492ix.class) {
            str = f11132b;
        }
        return str;
    }

    /* renamed from: b */
    public static synchronized void m14583b(String str) {
        synchronized (C2492ix.class) {
            if (f11131a.add(str)) {
                String str2 = f11132b;
                f11132b = str2 + ", " + str;
            }
        }
    }
}
