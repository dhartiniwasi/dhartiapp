package com.google.firebase.messaging;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.C0651l;
import androidx.core.content.C0681a;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.firebase.messaging.c */
/* compiled from: CommonNotificationBuilder */
public final class C8020c {

    /* renamed from: a */
    private static final AtomicInteger f34636a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: com.google.firebase.messaging.c$a */
    /* compiled from: CommonNotificationBuilder */
    public static class C8021a {

        /* renamed from: a */
        public final C0651l.C0659e f34637a;

        /* renamed from: b */
        public final String f34638b;

        /* renamed from: c */
        public final int f34639c;

        C8021a(C0651l.C0659e eVar, String str, int i) {
            this.f34637a = eVar;
            this.f34638b = str;
            this.f34639c = i;
        }
    }

    /* renamed from: a */
    private static PendingIntent m44187a(Context context, C8047j0 j0Var, String str, PackageManager packageManager) {
        Intent f = m44192f(str, j0Var, packageManager);
        if (f == null) {
            return null;
        }
        f.addFlags(67108864);
        f.putExtras(j0Var.mo26667y());
        if (m44203q(j0Var)) {
            f.putExtra("gcm.n.analytics_data", j0Var.mo26666x());
        }
        return PendingIntent.getActivity(context, m44193g(), f, m44198l(1073741824));
    }

    /* renamed from: b */
    private static PendingIntent m44188b(Context context, Context context2, C8047j0 j0Var) {
        if (!m44203q(j0Var)) {
            return null;
        }
        return m44189c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(j0Var.mo26666x()));
    }

    /* renamed from: c */
    private static PendingIntent m44189c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, m44193g(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context2, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), m44198l(1073741824));
    }

    /* renamed from: d */
    public static C8021a m44190d(Context context, Context context2, C8047j0 j0Var, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        C0651l.C0659e eVar = new C0651l.C0659e(context2, str);
        String n = j0Var.mo26661n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(n)) {
            eVar.mo2944q(n);
        }
        String n2 = j0Var.mo26661n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(n2)) {
            eVar.mo2943p(n2);
            eVar.mo2924I(new C0651l.C0657c().mo2915m(n2));
        }
        eVar.mo2922G(m44199m(packageManager, resources, packageName, j0Var.mo26663p("gcm.n.icon"), bundle));
        Uri n3 = m44200n(packageName, j0Var, resources);
        if (n3 != null) {
            eVar.mo2923H(n3);
        }
        eVar.mo2942o(m44187a(context, j0Var, packageName, packageManager));
        PendingIntent b = m44188b(context, context2, j0Var);
        if (b != null) {
            eVar.mo2946s(b);
        }
        Integer h = m44194h(context2, j0Var.mo26663p("gcm.n.color"), bundle);
        if (h != null) {
            eVar.mo2940m(h.intValue());
        }
        eVar.mo2938k(!j0Var.mo26649a("gcm.n.sticky"));
        eVar.mo2952z(j0Var.mo26649a("gcm.n.local_only"));
        String p = j0Var.mo26663p("gcm.n.ticker");
        if (p != null) {
            eVar.mo2926K(p);
        }
        Integer m = j0Var.mo26660m();
        if (m != null) {
            eVar.mo2919D(m.intValue());
        }
        Integer r = j0Var.mo26665r();
        if (r != null) {
            eVar.mo2928M(r.intValue());
        }
        Integer l = j0Var.mo26659l();
        if (l != null) {
            eVar.mo2916A(l.intValue());
        }
        Long j = j0Var.mo26657j("gcm.n.event_time");
        if (j != null) {
            eVar.mo2921F(true);
            eVar.mo2929N(j.longValue());
        }
        long[] q = j0Var.mo26664q();
        if (q != null) {
            eVar.mo2927L(q);
        }
        int[] e = j0Var.mo26652e();
        if (e != null) {
            eVar.mo2951y(e[0], e[1], e[2]);
        }
        eVar.mo2945r(m44195i(j0Var));
        return new C8021a(eVar, m44201o(j0Var), 0);
    }

    /* renamed from: e */
    static C8021a m44191e(Context context, C8047j0 j0Var) {
        Bundle j = m44196j(context.getPackageManager(), context.getPackageName());
        return m44190d(context, context, j0Var, m44197k(context, j0Var.mo26658k(), j), j);
    }

    /* renamed from: f */
    private static Intent m44192f(String str, C8047j0 j0Var, PackageManager packageManager) {
        String p = j0Var.mo26663p("gcm.n.click_action");
        if (!TextUtils.isEmpty(p)) {
            Intent intent = new Intent(p);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f = j0Var.mo26653f();
        if (f != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(f);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    /* renamed from: g */
    private static int m44193g() {
        return f34636a.incrementAndGet();
    }

    /* renamed from: h */
    private static Integer m44194h(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return Integer.valueOf(C0681a.m3148d(context, i));
            } catch (Resources.NotFoundException unused2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }

    /* renamed from: i */
    private static int m44195i(C8047j0 j0Var) {
        boolean a = j0Var.mo26649a("gcm.n.default_sound");
        if (j0Var.mo26649a("gcm.n.default_vibrate_timings")) {
            a |= true;
        }
        return j0Var.mo26649a("gcm.n.default_light_settings") ? a | true ? 1 : 0 : a ? 1 : 0;
    }

    /* renamed from: j */
    private static Bundle m44196j(PackageManager packageManager, String str) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (!(applicationInfo == null || (bundle = applicationInfo.metaData) == null)) {
                return bundle;
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
        }
        return Bundle.EMPTY;
    }

    /* renamed from: k */
    public static String m44197k(Context context, String str, Bundle bundle) {
        String str2;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string)) {
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            } else if (notificationManager.getNotificationChannel(string) != null) {
                return string;
            } else {
                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    str2 = "Misc";
                } else {
                    str2 = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", str2, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: l */
    private static int m44198l(int i) {
        return Build.VERSION.SDK_INT >= 23 ? i | 67108864 : i;
    }

    /* renamed from: m */
    private static int m44199m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && m44202p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && m44202p(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !m44202p(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
            }
        }
        if (i == 0 || !m44202p(resources, i)) {
            return 17301651;
        }
        return i;
    }

    /* renamed from: n */
    private static Uri m44200n(String str, C8047j0 j0Var, Resources resources) {
        String o = j0Var.mo26662o();
        if (TextUtils.isEmpty(o)) {
            return null;
        }
        if ("default".equals(o) || resources.getIdentifier(o, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + o);
    }

    /* renamed from: o */
    private static String m44201o(C8047j0 j0Var) {
        String p = j0Var.mo26663p("gcm.n.tag");
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    /* renamed from: p */
    private static boolean m44202p(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, (Resources.Theme) null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i + ", treating it as an invalid icon");
            return false;
        }
    }

    /* renamed from: q */
    static boolean m44203q(C8047j0 j0Var) {
        return j0Var.mo26649a("google.c.a.e");
    }
}
