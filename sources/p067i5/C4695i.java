package p067i5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import p180z4.C6378j;

/* renamed from: i5.i */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C4695i {

    /* renamed from: a */
    private static Boolean f25253a;

    /* renamed from: b */
    private static Boolean f25254b;

    /* renamed from: c */
    private static Boolean f25255c;

    /* renamed from: d */
    private static Boolean f25256d;

    /* renamed from: e */
    private static Boolean f25257e;

    /* renamed from: f */
    private static Boolean f25258f;

    /* renamed from: a */
    public static boolean m30392a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f25257e == null) {
            boolean z = false;
            if (C4699m.m30418i() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            f25257e = Boolean.valueOf(z);
        }
        return f25257e.booleanValue();
    }

    /* renamed from: b */
    public static boolean m30393b(Context context) {
        if (f25258f == null) {
            boolean z = false;
            if (C4699m.m30421l() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z = true;
            }
            f25258f = Boolean.valueOf(z);
        }
        return f25258f.booleanValue();
    }

    /* renamed from: c */
    public static boolean m30394c(Context context) {
        if (f25255c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z = true;
            }
            f25255c = Boolean.valueOf(z);
        }
        return f25255c.booleanValue();
    }

    /* renamed from: d */
    public static boolean m30395d(Context context) {
        return m30399h(context);
    }

    /* renamed from: e */
    public static boolean m30396e() {
        int i = C6378j.f30617a;
        return "user".equals(Build.TYPE);
    }

    /* renamed from: f */
    public static boolean m30397f(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f25253a == null) {
            boolean z = false;
            if (C4699m.m30414e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            f25253a = Boolean.valueOf(z);
        }
        return f25253a.booleanValue();
    }

    /* renamed from: g */
    public static boolean m30398g(Context context) {
        if (m30397f(context) && !C4699m.m30417h()) {
            return true;
        }
        if (m30399h(context)) {
            return !C4699m.m30418i() || C4699m.m30421l();
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m30399h(Context context) {
        if (f25254b == null) {
            boolean z = false;
            if (C4699m.m30415f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            f25254b = Boolean.valueOf(z);
        }
        return f25254b.booleanValue();
    }

    /* renamed from: i */
    public static boolean m30400i(Context context) {
        if (f25256d == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            f25256d = Boolean.valueOf(z);
        }
        return f25256d.booleanValue();
    }
}
