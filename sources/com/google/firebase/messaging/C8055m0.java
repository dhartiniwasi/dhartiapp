package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import androidx.window.layout.C1524d;
import java.util.concurrent.Executor;
import p067i5.C4699m;
import p218e6.C9975i;
import p218e6.C9977j;
import p218e6.C9980l;

/* renamed from: com.google.firebase.messaging.m0 */
/* compiled from: ProxyNotificationInitializer */
final class C8055m0 {
    /* renamed from: b */
    private static boolean m44366b(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    /* renamed from: c */
    static void m44367c(Context context) {
        if (!C8057n0.m44372b(context)) {
            m44369e(C1524d.f4372a, context, m44370f(context));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m44368d(Context context, boolean z, C9977j jVar) {
        try {
            if (!m44366b(context)) {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                return;
            }
            C8057n0.m44373c(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                notificationManager.setNotificationDelegate((String) null);
            }
            jVar.mo32546e(null);
        } finally {
            jVar.mo32546e(null);
        }
    }

    /* renamed from: e */
    static C9975i<Void> m44369e(Executor executor, Context context, boolean z) {
        if (!C4699m.m30420k()) {
            return C9980l.m51031e(null);
        }
        C9977j jVar = new C9977j();
        executor.execute(new C8053l0(context, z, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: f */
    private static boolean m44370f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
