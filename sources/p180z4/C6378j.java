package p180z4;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import p033d5.C4141r;
import p067i5.C4695i;
import p067i5.C4699m;
import p067i5.C4704r;
import p081k5.C4888c;

/* renamed from: z4.j */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C6378j {
    @Deprecated

    /* renamed from: a */
    public static final int f30617a = 12451000;

    /* renamed from: b */
    static final AtomicBoolean f30618b = new AtomicBoolean();

    /* renamed from: c */
    private static boolean f30619c = false;

    /* renamed from: d */
    static boolean f30620d = false;

    /* renamed from: e */
    private static final AtomicBoolean f30621e = new AtomicBoolean();

    @Deprecated
    /* renamed from: a */
    public static void m37452a(Context context) {
        if (!f30618b.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException unused) {
            }
        }
    }

    @Deprecated
    /* renamed from: b */
    public static void m37453b(Context context, int i) throws C6374h, C6372g {
        int j = C6370f.m37437h().mo21777j(context, i);
        if (j != 0) {
            Intent d = C6370f.m37437h().mo21773d(context, j, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + j);
            if (d == null) {
                throw new C6372g(j);
            }
            throw new C6374h(j, "Google Play Services not available", d);
        }
    }

    @Deprecated
    /* renamed from: c */
    public static int m37454c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    /* renamed from: d */
    public static String m37455d(int i) {
        return C6362b.m37398N1(i);
    }

    /* renamed from: e */
    public static Context m37456e(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static Resources m37457f(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static boolean m37458g(Context context) {
        if (!f30620d) {
            try {
                PackageInfo f = C4888c.m31075a(context).mo18673f("com.google.android.gms", 64);
                C6380k.m37466a(context);
                if (f == null || C6380k.m37468e(f, false) || !C6380k.m37468e(f, true)) {
                    f30619c = false;
                } else {
                    f30619c = true;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
            } finally {
                f30620d = true;
            }
        }
        return f30619c || !C4695i.m30396e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009a  */
    @java.lang.Deprecated
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m37459h(android.content.Context r10, int r11) {
        /*
            java.lang.String r0 = "GooglePlayServicesUtil"
            android.content.res.Resources r1 = r10.getResources()     // Catch:{ all -> 0x000c }
            int r2 = p180z4.C6382l.f30626a     // Catch:{ all -> 0x000c }
            r1.getString(r2)     // Catch:{ all -> 0x000c }
            goto L_0x0011
        L_0x000c:
            java.lang.String r1 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r0, r1)
        L_0x0011:
            java.lang.String r1 = r10.getPackageName()
            java.lang.String r2 = "com.google.android.gms"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x003d
            java.util.concurrent.atomic.AtomicBoolean r1 = f30621e
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x0026
            goto L_0x003d
        L_0x0026:
            int r1 = p033d5.C4086b1.m28029a(r10)
            if (r1 == 0) goto L_0x0037
            int r3 = f30617a
            if (r1 != r3) goto L_0x0031
            goto L_0x003d
        L_0x0031:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r10.<init>(r1)
            throw r10
        L_0x0037:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r10.<init>()
            throw r10
        L_0x003d:
            boolean r1 = p067i5.C4695i.m30398g(r10)
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x004d
            boolean r1 = p067i5.C4695i.m30400i(r10)
            if (r1 != 0) goto L_0x004d
            r1 = 1
            goto L_0x004e
        L_0x004d:
            r1 = 0
        L_0x004e:
            if (r11 < 0) goto L_0x0052
            r5 = 1
            goto L_0x0053
        L_0x0052:
            r5 = 0
        L_0x0053:
            p033d5.C4141r.m28211a(r5)
            java.lang.String r5 = r10.getPackageName()
            android.content.pm.PackageManager r6 = r10.getPackageManager()
            r7 = 9
            if (r1 == 0) goto L_0x007c
            java.lang.String r8 = "com.android.vending"
            r9 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r8 = r6.getPackageInfo(r8, r9)     // Catch:{ NameNotFoundException -> 0x006b }
            goto L_0x007d
        L_0x006b:
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires the Google Play Store, but it is missing."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
        L_0x0078:
            r3 = 9
            goto L_0x0133
        L_0x007c:
            r8 = 0
        L_0x007d:
            r9 = 64
            android.content.pm.PackageInfo r9 = r6.getPackageInfo(r2, r9)     // Catch:{ NameNotFoundException -> 0x0126 }
            p180z4.C6380k.m37466a(r10)
            boolean r10 = p180z4.C6380k.m37468e(r9, r3)
            if (r10 != 0) goto L_0x009a
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play services, but their signature is invalid."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            goto L_0x0078
        L_0x009a:
            if (r1 == 0) goto L_0x00b3
            p033d5.C4141r.m28221k(r8)
            boolean r10 = p180z4.C6380k.m37468e(r8, r3)
            if (r10 != 0) goto L_0x00b3
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play Store, but its signature is invalid."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            goto L_0x0078
        L_0x00b3:
            if (r1 == 0) goto L_0x00d3
            if (r8 == 0) goto L_0x00d3
            android.content.pm.Signature[] r10 = r8.signatures
            r10 = r10[r4]
            android.content.pm.Signature[] r1 = r9.signatures
            r1 = r1[r4]
            boolean r10 = r10.equals(r1)
            if (r10 != 0) goto L_0x00d3
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
            goto L_0x0078
        L_0x00d3:
            int r10 = r9.versionCode
            int r10 = p067i5.C4706t.m30432a(r10)
            int r1 = p067i5.C4706t.m30432a(r11)
            if (r10 >= r1) goto L_0x0107
            int r10 = r9.versionCode
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Google Play services out of date for "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = ".  Requires "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r11 = " but found "
            r1.append(r11)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            android.util.Log.w(r0, r10)
            r3 = 2
            goto L_0x0133
        L_0x0107:
            android.content.pm.ApplicationInfo r10 = r9.applicationInfo
            if (r10 != 0) goto L_0x011f
            android.content.pm.ApplicationInfo r10 = r6.getApplicationInfo(r2, r4)     // Catch:{ NameNotFoundException -> 0x0110 }
            goto L_0x011f
        L_0x0110:
            r10 = move-exception
            java.lang.String r11 = java.lang.String.valueOf(r5)
            java.lang.String r1 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r11 = r11.concat(r1)
            android.util.Log.wtf(r0, r11, r10)
            goto L_0x0133
        L_0x011f:
            boolean r10 = r10.enabled
            if (r10 != 0) goto L_0x0125
            r3 = 3
            goto L_0x0133
        L_0x0125:
            return r4
        L_0x0126:
            java.lang.String r10 = java.lang.String.valueOf(r5)
            java.lang.String r11 = " requires Google Play services, but they are missing."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r0, r10)
        L_0x0133:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p180z4.C6378j.m37459h(android.content.Context, int):int");
    }

    @Deprecated
    /* renamed from: i */
    public static boolean m37460i(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return m37464m(context, "com.google.android.gms");
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m37461j(Context context) {
        if (!C4699m.m30412c()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        C4141r.m28221k(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    /* renamed from: k */
    public static boolean m37462k(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @Deprecated
    /* renamed from: l */
    public static boolean m37463l(Context context, int i, String str) {
        return C4704r.m30428b(context, i, str);
    }

    /* renamed from: m */
    static boolean m37464m(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (C4699m.m30415f()) {
            try {
                for (PackageInstaller.SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(appPackageName.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (equals) {
                return applicationInfo.enabled;
            }
            return applicationInfo.enabled && !m37461j(context);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }
}
