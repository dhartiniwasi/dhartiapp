package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.google.firebase.messaging.n0 */
/* compiled from: ProxyNotificationPreferences */
final class C8057n0 {
    /* renamed from: a */
    private static SharedPreferences m44371a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    /* renamed from: b */
    static boolean m44372b(Context context) {
        return m44371a(context).getBoolean("proxy_notification_initialized", false);
    }

    /* renamed from: c */
    static void m44373c(Context context, boolean z) {
        SharedPreferences.Editor edit = m44371a(context).edit();
        edit.putBoolean("proxy_notification_initialized", z);
        edit.apply();
    }
}
