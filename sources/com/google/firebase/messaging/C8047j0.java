package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.firebase.messaging.j0 */
/* compiled from: NotificationParams */
public class C8047j0 {

    /* renamed from: a */
    private final Bundle f34694a;

    public C8047j0(Bundle bundle) {
        Objects.requireNonNull(bundle, JsonStorageKeyNames.DATA_KEY);
        this.f34694a = new Bundle(bundle);
    }

    /* renamed from: d */
    private static int m44309d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    /* renamed from: s */
    private static boolean m44310s(String str) {
        return str.startsWith("google.c.a.") || str.equals("from");
    }

    /* renamed from: t */
    public static boolean m44311t(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(m44313v("gcm.n.e")));
    }

    /* renamed from: u */
    private static boolean m44312u(String str) {
        return str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.");
    }

    /* renamed from: v */
    private static String m44313v(String str) {
        if (!str.startsWith("gcm.n.")) {
            return str;
        }
        return str.replace("gcm.n.", "gcm.notification.");
    }

    /* renamed from: w */
    private String m44314w(String str) {
        if (!this.f34694a.containsKey(str) && str.startsWith("gcm.n.")) {
            String v = m44313v(str);
            if (this.f34694a.containsKey(v)) {
                return v;
            }
        }
        return str;
    }

    /* renamed from: z */
    private static String m44315z(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    /* renamed from: a */
    public boolean mo26649a(String str) {
        String p = mo26663p(str);
        return "1".equals(p) || Boolean.parseBoolean(p);
    }

    /* renamed from: b */
    public Integer mo26650b(String str) {
        String p = mo26663p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(p));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + m44315z(str) + "(" + p + ") into an int");
            return null;
        }
    }

    /* renamed from: c */
    public JSONArray mo26651c(String str) {
        String p = mo26663p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return new JSONArray(p);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + m44315z(str) + ": " + p + ", falling back to default");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int[] mo26652e() {
        JSONArray c = mo26651c("gcm.n.light_settings");
        if (c == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (c.length() == 3) {
                iArr[0] = m44309d(c.optString(0));
                iArr[1] = c.optInt(1);
                iArr[2] = c.optInt(2);
                return iArr;
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + c + ". Skipping setting LightSettings");
            return null;
        } catch (IllegalArgumentException e) {
            Log.w("NotificationParams", "LightSettings is invalid: " + c + ". " + e.getMessage() + ". Skipping setting LightSettings");
            return null;
        }
    }

    /* renamed from: f */
    public Uri mo26653f() {
        String p = mo26663p("gcm.n.link_android");
        if (TextUtils.isEmpty(p)) {
            p = mo26663p("gcm.n.link");
        }
        if (!TextUtils.isEmpty(p)) {
            return Uri.parse(p);
        }
        return null;
    }

    /* renamed from: g */
    public Object[] mo26654g(String str) {
        JSONArray c = mo26651c(str + "_loc_args");
        if (c == null) {
            return null;
        }
        int length = c.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = c.optString(i);
        }
        return strArr;
    }

    /* renamed from: h */
    public String mo26655h(String str) {
        return mo26663p(str + "_loc_key");
    }

    /* renamed from: i */
    public String mo26656i(Resources resources, String str, String str2) {
        String h = mo26655h(str2);
        if (TextUtils.isEmpty(h)) {
            return null;
        }
        int identifier = resources.getIdentifier(h, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", m44315z(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] g = mo26654g(str2);
        if (g == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, g);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + m44315z(str2) + ": " + Arrays.toString(g) + " Default value will be used.", e);
            return null;
        }
    }

    /* renamed from: j */
    public Long mo26657j(String str) {
        String p = mo26663p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(p));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + m44315z(str) + "(" + p + ") into a long");
            return null;
        }
    }

    /* renamed from: k */
    public String mo26658k() {
        return mo26663p("gcm.n.android_channel_id");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Integer mo26659l() {
        Integer b = mo26650b("gcm.n.notification_count");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= 0) {
            return b;
        }
        Log.w("FirebaseMessaging", "notificationCount is invalid: " + b + ". Skipping setting notificationCount.");
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public Integer mo26660m() {
        Integer b = mo26650b("gcm.n.notification_priority");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= -2 && b.intValue() <= 2) {
            return b;
        }
        Log.w("FirebaseMessaging", "notificationPriority is invalid " + b + ". Skipping setting notificationPriority.");
        return null;
    }

    /* renamed from: n */
    public String mo26661n(Resources resources, String str, String str2) {
        String p = mo26663p(str2);
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        return mo26656i(resources, str, str2);
    }

    /* renamed from: o */
    public String mo26662o() {
        String p = mo26663p("gcm.n.sound2");
        return TextUtils.isEmpty(p) ? mo26663p("gcm.n.sound") : p;
    }

    /* renamed from: p */
    public String mo26663p(String str) {
        return this.f34694a.getString(m44314w(str));
    }

    /* renamed from: q */
    public long[] mo26664q() {
        JSONArray c = mo26651c("gcm.n.vibrate_timings");
        if (c == null) {
            return null;
        }
        try {
            if (c.length() > 1) {
                int length = c.length();
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = c.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + c + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Integer mo26665r() {
        Integer b = mo26650b("gcm.n.visibility");
        if (b == null) {
            return null;
        }
        if (b.intValue() >= -1 && b.intValue() <= 1) {
            return b;
        }
        Log.w("NotificationParams", "visibility is invalid: " + b + ". Skipping setting visibility.");
        return null;
    }

    /* renamed from: x */
    public Bundle mo26666x() {
        Bundle bundle = new Bundle(this.f34694a);
        for (String str : this.f34694a.keySet()) {
            if (!m44310s(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* renamed from: y */
    public Bundle mo26667y() {
        Bundle bundle = new Bundle(this.f34694a);
        for (String str : this.f34694a.keySet()) {
            if (m44312u(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
