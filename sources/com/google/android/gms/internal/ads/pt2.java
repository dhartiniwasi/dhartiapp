package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class pt2 {
    /* renamed from: a */
    public static Bundle m18893a(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        return bundle2 == null ? new Bundle() : bundle2;
    }

    /* renamed from: b */
    public static void m18894b(Bundle bundle, String str, Bundle bundle2) {
        if (bundle2 != null) {
            bundle.putBundle(str, bundle2);
        }
    }

    /* renamed from: c */
    public static void m18895c(Bundle bundle, String str, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    /* renamed from: d */
    public static void m18896d(Bundle bundle, String str, List list) {
        if (list != null) {
            bundle.putStringArrayList(str, new ArrayList(list));
        }
    }

    /* renamed from: e */
    public static void m18897e(Bundle bundle, String str, int i, boolean z) {
        if (z) {
            bundle.putInt(str, i);
        }
    }

    /* renamed from: f */
    public static void m18898f(Bundle bundle, String str, String str2, boolean z) {
        if (z) {
            bundle.putString(str, str2);
        }
    }

    /* renamed from: g */
    public static void m18899g(Bundle bundle, String str, boolean z, boolean z2) {
        if (z2) {
            bundle.putBoolean(str, z);
        }
    }
}
