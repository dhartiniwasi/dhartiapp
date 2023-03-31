package p293m7;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p033d5.C4141r;
import p040e5.C4245e;

/* renamed from: m7.p0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C11849p0 {

    /* renamed from: a */
    static final Map f44565a;

    static {
        HashMap hashMap = new HashMap();
        f44565a = hashMap;
        hashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        hashMap.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        hashMap.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        hashMap.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        hashMap.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    /* renamed from: a */
    public static Status m57313a(Intent intent) {
        C4141r.m28221k(intent);
        C4141r.m28211a(m57316d(intent));
        return (Status) C4245e.m28630b(intent, "com.google.firebase.auth.internal.STATUS", Status.CREATOR);
    }

    /* renamed from: b */
    public static Status m57314b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString("message");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                Map map = f44565a;
                if (map.containsKey(string)) {
                    return C11836l.m57255a(((String) map.get(string)) + ":" + string2);
                }
            }
            return C11836l.m57255a("WEB_INTERNAL_ERROR:" + str);
        } catch (JSONException e) {
            String localizedMessage = e.getLocalizedMessage();
            return C11836l.m57255a("WEB_INTERNAL_ERROR:" + str + "[ " + localizedMessage + " ]");
        }
    }

    /* renamed from: c */
    public static void m57315c(Intent intent, Status status) {
        C4245e.m28633e(status, intent, "com.google.firebase.auth.internal.STATUS");
    }

    /* renamed from: d */
    public static boolean m57316d(Intent intent) {
        C4141r.m28221k(intent);
        return intent.hasExtra("com.google.firebase.auth.internal.STATUS");
    }
}
