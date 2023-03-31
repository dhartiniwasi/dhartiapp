package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.installations.C7998c;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.concurrent.ExecutionException;
import p084l1.C4902b;
import p084l1.C4903c;
import p084l1.C4907g;
import p218e6.C9980l;
import p246h7.C10412f;
import p256i7.C10548a;
import p348s8.C12463a;
import p348s8.C12468b;

/* renamed from: com.google.firebase.messaging.h0 */
/* compiled from: MessagingAnalytics */
public class C8041h0 {
    /* renamed from: A */
    public static boolean m44269A(Intent intent) {
        if (intent == null || m44289r(intent)) {
            return false;
        }
        return m44272a();
    }

    /* renamed from: B */
    public static boolean m44270B(Intent intent) {
        if (intent == null || m44289r(intent)) {
            return false;
        }
        return m44271C(intent.getExtras());
    }

    /* renamed from: C */
    public static boolean m44271C(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    /* renamed from: a */
    static boolean m44272a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            C10412f.m52582o();
            Context m = C10412f.m52582o().mo33469m();
            SharedPreferences sharedPreferences = m.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = m.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(m.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("delivery_metrics_exported_to_big_query_enabled"))) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* renamed from: b */
    static C12463a m44273b(C12463a.C12465b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        C12463a.C12464a h = C12463a.m59444p().mo37241m(m44287p(extras)).mo37233e(bVar).mo37234f(m44277f(extras)).mo37237i(m44284m()).mo37239k(C12463a.C12467d.ANDROID).mo37236h(m44282k(extras));
        String h2 = m44279h(extras);
        if (h2 != null) {
            h.mo37235g(h2);
        }
        String o = m44286o(extras);
        if (o != null) {
            h.mo37240l(o);
        }
        String c = m44274c(extras);
        if (c != null) {
            h.mo37231c(c);
        }
        String i = m44280i(extras);
        if (i != null) {
            h.mo37230b(i);
        }
        String e = m44276e(extras);
        if (e != null) {
            h.mo37232d(e);
        }
        long n = m44285n(extras);
        if (n > 0) {
            h.mo37238j(n);
        }
        return h.mo37229a();
    }

    /* renamed from: c */
    static String m44274c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    /* renamed from: d */
    static String m44275d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    /* renamed from: e */
    static String m44276e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    /* renamed from: f */
    static String m44277f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) C9980l.m51027a(C7998c.m44051q(C10412f.m52582o()).getId());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    static String m44278g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    /* renamed from: h */
    static String m44279h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    /* renamed from: i */
    static String m44280i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    /* renamed from: j */
    static String m44281j(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    /* renamed from: k */
    static C12463a.C12466c m44282k(Bundle bundle) {
        if (bundle == null || !C8047j0.m44311t(bundle)) {
            return C12463a.C12466c.DATA_MESSAGE;
        }
        return C12463a.C12466c.DISPLAY_NOTIFICATION;
    }

    /* renamed from: l */
    static String m44283l(Bundle bundle) {
        return (bundle == null || !C8047j0.m44311t(bundle)) ? JsonStorageKeyNames.DATA_KEY : "display";
    }

    /* renamed from: m */
    static String m44284m() {
        return C10412f.m52582o().mo33469m().getPackageName();
    }

    /* renamed from: n */
    static long m44285n(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e) {
                Log.w("FirebaseMessaging", "error parsing project number", e);
            }
        }
        C10412f o = C10412f.m52582o();
        String f = o.mo33471r().mo33484f();
        if (f != null) {
            try {
                return Long.parseLong(f);
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e2);
            }
        }
        String c = o.mo33471r().mo33480c();
        if (!c.startsWith("1:")) {
            try {
                return Long.parseLong(c);
            } catch (NumberFormatException e3) {
                Log.w("FirebaseMessaging", "error parsing app ID", e3);
                return 0;
            }
        } else {
            String[] split = c.split(":");
            if (split.length < 2) {
                return 0;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e4) {
                Log.w("FirebaseMessaging", "error parsing app ID", e4);
                return 0;
            }
        }
    }

    /* renamed from: o */
    static String m44286o(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    /* renamed from: p */
    static int m44287p(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    /* renamed from: q */
    static String m44288q(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    /* renamed from: r */
    private static boolean m44289r(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    /* renamed from: s */
    public static void m44290s(Intent intent) {
        m44295x("_nd", intent.getExtras());
    }

    /* renamed from: t */
    public static void m44291t(Intent intent) {
        m44295x("_nf", intent.getExtras());
    }

    /* renamed from: u */
    public static void m44292u(Bundle bundle) {
        m44297z(bundle);
        m44295x("_no", bundle);
    }

    /* renamed from: v */
    public static void m44293v(Intent intent) {
        if (m44270B(intent)) {
            m44295x("_nr", intent.getExtras());
        }
        if (m44269A(intent)) {
            m44294w(C12463a.C12465b.MESSAGE_DELIVERED, intent, FirebaseMessaging.m44115w());
        }
    }

    /* renamed from: w */
    private static void m44294w(C12463a.C12465b bVar, Intent intent, C4907g gVar) {
        if (gVar == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        C12463a b = m44273b(bVar, intent);
        if (b != null) {
            try {
                gVar.mo18733a("FCM_CLIENT_EVENT_LOGGING", C12468b.class, C4902b.m31123b("proto"), C8036g0.f34676a).mo18732a(C4903c.m31125d(C12468b.m59476b().mo37245b(b).mo37244a()));
            } catch (RuntimeException e) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e);
            }
        }
    }

    /* renamed from: x */
    static void m44295x(String str, Bundle bundle) {
        try {
            C10412f.m52582o();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String d = m44275d(bundle);
            if (d != null) {
                bundle2.putString("_nmid", d);
            }
            String e = m44276e(bundle);
            if (e != null) {
                bundle2.putString("_nmn", e);
            }
            String i = m44280i(bundle);
            if (!TextUtils.isEmpty(i)) {
                bundle2.putString("label", i);
            }
            String g = m44278g(bundle);
            if (!TextUtils.isEmpty(g)) {
                bundle2.putString("message_channel", g);
            }
            String o = m44286o(bundle);
            if (o != null) {
                bundle2.putString("_nt", o);
            }
            String j = m44281j(bundle);
            if (j != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(j));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e2);
                }
            }
            String q = m44288q(bundle);
            if (q != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(q));
                } catch (NumberFormatException e3) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e3);
                }
            }
            String l = m44283l(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", l);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            C10548a aVar = (C10548a) C10412f.m52582o().mo33468k(C10548a.class);
            if (aVar != null) {
                aVar.mo33743a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* renamed from: y */
    static void m44296y(boolean z) {
        C10412f.m52582o().mo33469m().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", z).apply();
    }

    /* renamed from: z */
    private static void m44297z(Bundle bundle) {
        if (bundle != null) {
            if ("1".equals(bundle.getString("google.c.a.tc"))) {
                C10548a aVar = (C10548a) C10412f.m52582o().mo33468k(C10548a.class);
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                }
                if (aVar != null) {
                    String string = bundle.getString("google.c.a.c_id");
                    aVar.mo33744b("fcm", "_ln", string);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("source", "Firebase");
                    bundle2.putString("medium", "notification");
                    bundle2.putString("campaign", string);
                    aVar.mo33743a("fcm", "_cmp", bundle2);
                    return;
                }
                Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
            }
        }
    }
}
