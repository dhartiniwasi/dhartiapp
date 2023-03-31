package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import androidx.core.app.C0665o;
import androidx.core.content.res.C0707h;
import androidx.core.p010os.C0759a;
import androidx.core.p010os.C0768g;
import androidx.core.util.C0825c;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: androidx.core.content.a */
/* compiled from: ContextCompat */
public class C0681a {

    /* renamed from: a */
    private static final Object f2203a = new Object();

    /* renamed from: b */
    private static final Object f2204b = new Object();

    /* renamed from: c */
    private static TypedValue f2205c;

    /* renamed from: androidx.core.content.a$a */
    /* compiled from: ContextCompat */
    static class C0682a {
        /* renamed from: a */
        static void m3159a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        /* renamed from: b */
        static void m3160b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* renamed from: androidx.core.content.a$b */
    /* compiled from: ContextCompat */
    static class C0683b {
        /* renamed from: a */
        static File[] m3161a(Context context) {
            return context.getExternalCacheDirs();
        }

        /* renamed from: b */
        static File[] m3162b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        /* renamed from: c */
        static File[] m3163c(Context context) {
            return context.getObbDirs();
        }
    }

    /* renamed from: androidx.core.content.a$c */
    /* compiled from: ContextCompat */
    static class C0684c {
        /* renamed from: a */
        static File m3164a(Context context) {
            return context.getCodeCacheDir();
        }

        /* renamed from: b */
        static Drawable m3165b(Context context, int i) {
            return context.getDrawable(i);
        }

        /* renamed from: c */
        static File m3166c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* renamed from: androidx.core.content.a$d */
    /* compiled from: ContextCompat */
    static class C0685d {
        /* renamed from: a */
        static int m3167a(Context context, int i) {
            return context.getColor(i);
        }

        /* renamed from: b */
        static <T> T m3168b(Context context, Class<T> cls) {
            return context.getSystemService(cls);
        }

        /* renamed from: c */
        static String m3169c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* renamed from: androidx.core.content.a$e */
    /* compiled from: ContextCompat */
    static class C0686e {
        /* renamed from: a */
        static Context m3170a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        /* renamed from: b */
        static File m3171b(Context context) {
            return context.getDataDir();
        }

        /* renamed from: c */
        static boolean m3172c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* renamed from: androidx.core.content.a$f */
    /* compiled from: ContextCompat */
    static class C0687f {
        /* renamed from: a */
        static Intent m3173a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            if ((i & 4) != 0 && str == null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, C0681a.m3155k(context), handler);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1);
        }

        /* renamed from: b */
        static ComponentName m3174b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* renamed from: androidx.core.content.a$g */
    /* compiled from: ContextCompat */
    static class C0688g {
        /* renamed from: a */
        static Executor m3175a(Context context) {
            return context.getMainExecutor();
        }
    }

    /* renamed from: a */
    public static int m3145a(Context context, String str) {
        C0825c.m3646e(str, "permission must be non-null");
        if (C0759a.m3507d() || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return C0665o.m3094e(context).mo2965a() ? 0 : -1;
    }

    /* renamed from: b */
    public static Context m3146b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0686e.m3170a(context);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        return r4;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.io.File m3147c(java.io.File r4) {
        /*
            java.lang.Object r0 = f2204b
            monitor-enter(r0)
            boolean r1 = r4.exists()     // Catch:{ all -> 0x002d }
            if (r1 != 0) goto L_0x002b
            boolean r1 = r4.mkdirs()     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return r4
        L_0x0011:
            java.lang.String r1 = "ContextCompat"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x002d }
            r2.<init>()     // Catch:{ all -> 0x002d }
            java.lang.String r3 = "Unable to create files subdir "
            r2.append(r3)     // Catch:{ all -> 0x002d }
            java.lang.String r3 = r4.getPath()     // Catch:{ all -> 0x002d }
            r2.append(r3)     // Catch:{ all -> 0x002d }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x002d }
            android.util.Log.w(r1, r2)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return r4
        L_0x002d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.C0681a.m3147c(java.io.File):java.io.File");
    }

    /* renamed from: d */
    public static int m3148d(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0685d.m3167a(context, i);
        }
        return context.getResources().getColor(i);
    }

    /* renamed from: e */
    public static ColorStateList m3149e(Context context, int i) {
        return C0707h.m3257c(context.getResources(), i, context.getTheme());
    }

    /* renamed from: f */
    public static Drawable m3150f(Context context, int i) {
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            return C0684c.m3165b(context, i);
        }
        if (i3 >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (f2203a) {
            if (f2205c == null) {
                f2205c = new TypedValue();
            }
            context.getResources().getValue(i, f2205c, true);
            i2 = f2205c.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    /* renamed from: g */
    public static File[] m3151g(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0683b.m3161a(context);
        }
        return new File[]{context.getExternalCacheDir()};
    }

    /* renamed from: h */
    public static File[] m3152h(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0683b.m3162b(context, str);
        }
        return new File[]{context.getExternalFilesDir(str)};
    }

    /* renamed from: i */
    public static Executor m3153i(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0688g.m3175a(context);
        }
        return C0768g.m3521a(new Handler(context.getMainLooper()));
    }

    /* renamed from: j */
    public static File m3154j(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0684c.m3166c(context);
        }
        return m3147c(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    /* renamed from: k */
    static String m3155k(Context context) {
        String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (C0693c.m3183b(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    /* renamed from: l */
    public static boolean m3156l(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0682a.m3159a(context, intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    /* renamed from: m */
    public static void m3157m(Context context, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0682a.m3160b(context, intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    /* renamed from: n */
    public static void m3158n(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            C0687f.m3174b(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
