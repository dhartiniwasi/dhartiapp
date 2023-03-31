package p264io.flutter.plugins.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import com.google.firebase.messaging.C8059o0;
import com.google.firebase.messaging.FirebaseMessaging;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: io.flutter.plugins.firebase.messaging.g */
/* compiled from: FlutterFirebaseMessagingUtils */
class C10798g {
    /* renamed from: a */
    static FirebaseMessaging m54013a(Map<String, Object> map) {
        return FirebaseMessaging.m44112r();
    }

    /* renamed from: b */
    static C8059o0 m54014b(Map<String, Object> map) {
        Object obj = map.get("message");
        Objects.requireNonNull(obj);
        Map map2 = (Map) obj;
        Object obj2 = map2.get("to");
        Objects.requireNonNull(obj2);
        C8059o0.C8061b bVar = new C8059o0.C8061b((String) obj2);
        String str = (String) map2.get("collapseKey");
        String str2 = (String) map2.get("messageId");
        String str3 = (String) map2.get("messageType");
        Integer num = (Integer) map2.get("ttl");
        Map map3 = (Map) map2.get(JsonStorageKeyNames.DATA_KEY);
        if (str != null) {
            bVar.mo26700b(str);
        }
        if (str3 != null) {
            bVar.mo26703e(str3);
        }
        if (str2 != null) {
            bVar.mo26702d(str2);
        }
        if (num != null) {
            bVar.mo26704f(num.intValue());
        }
        if (map3 != null) {
            bVar.mo26701c(map3);
        }
        return bVar.mo26699a();
    }

    /* renamed from: c */
    static Map<String, Object> m54015c(Map<String, Object> map) {
        Object obj = map.get("message");
        Objects.requireNonNull(obj);
        Map map2 = (Map) obj;
        if (map2.get("notification") == null) {
            return null;
        }
        return (Map) map2.get("notification");
    }

    /* renamed from: d */
    static boolean m54016d(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if ((keyguardManager != null && keyguardManager.isKeyguardLocked()) || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        String packageName = context.getPackageName();
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.importance == 100 && next.processName.equals(packageName)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    private static Map<String, Object> m54017e(C8059o0.C8062c cVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (cVar.mo26719p() != null) {
            hashMap.put("title", cVar.mo26719p());
        }
        if (cVar.mo26721r() != null) {
            hashMap.put("titleLocKey", cVar.mo26721r());
        }
        if (cVar.mo26720q() != null) {
            hashMap.put("titleLocArgs", Arrays.asList(cVar.mo26720q()));
        }
        if (cVar.mo26705a() != null) {
            hashMap.put("body", cVar.mo26705a());
        }
        if (cVar.mo26707c() != null) {
            hashMap.put("bodyLocKey", cVar.mo26707c());
        }
        if (cVar.mo26706b() != null) {
            hashMap.put("bodyLocArgs", Arrays.asList(cVar.mo26706b()));
        }
        if (cVar.mo26708d() != null) {
            hashMap2.put("channelId", cVar.mo26708d());
        }
        if (cVar.mo26709e() != null) {
            hashMap2.put("clickAction", cVar.mo26709e());
        }
        if (cVar.mo26710f() != null) {
            hashMap2.put("color", cVar.mo26710f());
        }
        if (cVar.mo26711g() != null) {
            hashMap2.put("smallIcon", cVar.mo26711g());
        }
        if (cVar.mo26712h() != null) {
            hashMap2.put("imageUrl", cVar.mo26712h().toString());
        }
        if (cVar.mo26713i() != null) {
            hashMap2.put("link", cVar.mo26713i().toString());
        }
        if (cVar.mo26714k() != null) {
            hashMap2.put("count", cVar.mo26714k());
        }
        if (cVar.mo26715l() != null) {
            hashMap2.put("priority", cVar.mo26715l());
        }
        if (cVar.mo26716m() != null) {
            hashMap2.put("sound", cVar.mo26716m());
        }
        if (cVar.mo26718o() != null) {
            hashMap2.put("ticker", cVar.mo26718o());
        }
        if (cVar.mo26722s() != null) {
            hashMap2.put("visibility", cVar.mo26722s());
        }
        if (cVar.mo26717n() != null) {
            hashMap2.put("tag", cVar.mo26717n());
        }
        hashMap.put(MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID, hashMap2);
        return hashMap;
    }

    /* renamed from: f */
    static Map<String, Object> m54018f(C8059o0 o0Var) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (o0Var.mo26687I1() != null) {
            hashMap.put("collapseKey", o0Var.mo26687I1());
        }
        if (o0Var.mo26689K1() != null) {
            hashMap.put("from", o0Var.mo26689K1());
        }
        if (o0Var.mo26695R1() != null) {
            hashMap.put("to", o0Var.mo26695R1());
        }
        if (o0Var.mo26690L1() != null) {
            hashMap.put("messageId", o0Var.mo26690L1());
        }
        if (o0Var.mo26691N1() != null) {
            hashMap.put("messageType", o0Var.mo26691N1());
        }
        if (o0Var.mo26688J1().size() > 0) {
            for (Map.Entry next : o0Var.mo26688J1().entrySet()) {
                hashMap2.put((String) next.getKey(), next.getValue());
            }
        }
        hashMap.put(JsonStorageKeyNames.DATA_KEY, hashMap2);
        hashMap.put("ttl", Integer.valueOf(o0Var.mo26696S1()));
        hashMap.put("sentTime", Long.valueOf(o0Var.mo26694Q1()));
        if (o0Var.mo26692O1() != null) {
            hashMap.put("notification", m54017e(o0Var.mo26692O1()));
        }
        return hashMap;
    }
}
