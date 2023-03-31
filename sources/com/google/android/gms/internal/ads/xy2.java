package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;
import p060h4.C4596v;
import p115p4.C5315w;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class xy2 {
    /* renamed from: a */
    public static void m23609a(lf3 lf3, yy2 yy2, ny2 ny2) {
        m23615g(lf3, yy2, ny2, false);
    }

    /* renamed from: b */
    public static void m23610b(lf3 lf3, yy2 yy2, ny2 ny2) {
        m23615g(lf3, yy2, ny2, true);
    }

    /* renamed from: c */
    public static void m23611c(lf3 lf3, yy2 yy2, ny2 ny2) {
        if (((Boolean) x00.f19923c.mo13438e()).booleanValue()) {
            cf3.m10920r(se3.m20287D(lf3), new wy2(yy2, ny2), dn0.f8330f);
        }
    }

    /* renamed from: d */
    public static void m23612d(lf3 lf3, ny2 ny2) {
        if (((Boolean) x00.f19923c.mo13438e()).booleanValue()) {
            cf3.m10920r(se3.m20287D(lf3), new uy2(ny2), dn0.f8330f);
        }
    }

    /* renamed from: e */
    public static boolean m23613e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) C4596v.m30088c().mo12227b(C2679nz.f14250A7), str);
    }

    /* renamed from: f */
    public static int m23614f(et2 et2) {
        int d = C5315w.m32641d(et2) - 1;
        return (d == 0 || d == 1) ? 7 : 23;
    }

    /* renamed from: g */
    private static void m23615g(lf3 lf3, yy2 yy2, ny2 ny2, boolean z) {
        if (((Boolean) x00.f19923c.mo13438e()).booleanValue()) {
            cf3.m10920r(se3.m20287D(lf3), new vy2(yy2, ny2, z), dn0.f8330f);
        }
    }
}
