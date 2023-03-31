package p073j4;

import android.util.Log;
import com.google.android.gms.internal.ads.h10;
import com.google.android.gms.internal.ads.pm0;

/* renamed from: j4.n1 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4794n1 extends pm0 {
    /* renamed from: k */
    public static void m30693k(String str) {
        if (!m30695m()) {
            return;
        }
        if (str == null || str.length() <= 4000) {
            Log.v("Ads", str);
            return;
        }
        boolean z = true;
        for (String str2 : pm0.f15914a.mo13167d(str)) {
            if (z) {
                Log.v("Ads", str2);
            } else {
                Log.v("Ads-cont", str2);
            }
            z = false;
        }
    }

    /* renamed from: l */
    public static void m30694l(String str, Throwable th) {
        if (m30695m()) {
            Log.v("Ads", str, th);
        }
    }

    /* renamed from: m */
    public static boolean m30695m() {
        return pm0.m18670j(2) && ((Boolean) h10.f10147a.mo13438e()).booleanValue();
    }
}
