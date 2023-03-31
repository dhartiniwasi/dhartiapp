package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class y34 {
    /* renamed from: a */
    static HashSet m23753a(int i) {
        return new HashSet(m23756d(i));
    }

    /* renamed from: b */
    public static LinkedHashMap m23754b(int i) {
        return new LinkedHashMap(m23756d(i));
    }

    /* renamed from: c */
    public static List m23755c(int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        return new ArrayList(i);
    }

    /* renamed from: d */
    private static int m23756d(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }
}
