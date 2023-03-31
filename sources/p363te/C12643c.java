package p363te;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: te.c */
/* compiled from: LimitAdClickUtils */
public class C12643c {

    /* renamed from: a */
    private static int f46390a;

    /* renamed from: a */
    private static long m60154a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    private static SharedPreferences m60155b(Context context) {
        return context.getSharedPreferences("ads_limit", 0);
    }

    /* renamed from: c */
    public static void m60156c(Context context) {
        f46390a = m60157d(context);
    }

    /* renamed from: d */
    private static int m60157d(Context context) {
        long j = m60155b(context).getLong("last_time_clicked", -1);
        if (j < 0) {
            return 0;
        }
        if (m60154a() - j < 86400000) {
            return 1;
        }
        m60155b(context).edit().putBoolean("is_blocked", false).apply();
        return 0;
    }

    /* renamed from: e */
    public static boolean m60158e(Context context) {
        f46390a++;
        m60155b(context).edit().putLong("last_time_clicked", m60154a()).apply();
        if (f46390a != 2) {
            return true;
        }
        m60155b(context).edit().putBoolean("is_blocked", true).apply();
        return false;
    }

    /* renamed from: f */
    public static boolean m60159f(Context context) {
        return m60155b(context).getBoolean("is_blocked", false);
    }
}
