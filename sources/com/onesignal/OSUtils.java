package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.core.app.C0637h;
import androidx.core.app.C0665o;
import com.google.android.gms.location.LocationListener;
import com.google.firebase.messaging.FirebaseMessaging;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.location.LocationCallback;
import com.onesignal.C8338d3;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p035e0.C4171a;

class OSUtils {

    /* renamed from: a */
    public static int f35284a = 3;

    /* renamed from: b */
    static final int[] f35285b = {401, 402, 403, 404, 410};

    /* renamed from: com.onesignal.OSUtils$a */
    static /* synthetic */ class C8284a {

        /* renamed from: a */
        static final /* synthetic */ int[] f35286a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.onesignal.OSUtils$b[] r0 = com.onesignal.OSUtils.C8285b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35286a = r0
                com.onesignal.OSUtils$b r1 = com.onesignal.OSUtils.C8285b.DATA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35286a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onesignal.OSUtils$b r1 = com.onesignal.OSUtils.C8285b.HTTPS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f35286a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onesignal.OSUtils$b r1 = com.onesignal.OSUtils.C8285b.HTTP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.OSUtils.C8284a.<clinit>():void");
        }
    }

    /* renamed from: com.onesignal.OSUtils$b */
    public enum C8285b {
        DATA(JsonStorageKeyNames.DATA_KEY),
        HTTPS("https"),
        HTTP("http");
        

        /* renamed from: a */
        private final String f35291a;

        private C8285b(String str) {
            this.f35291a = str;
        }

        /* renamed from: a */
        public static C8285b m46221a(String str) {
            for (C8285b bVar : values()) {
                if (bVar.f35291a.equalsIgnoreCase(str)) {
                    return bVar;
                }
            }
            return null;
        }
    }

    OSUtils() {
    }

    /* renamed from: B */
    static boolean m46169B() {
        return new OSUtils().mo27559e() == 1;
    }

    /* renamed from: C */
    static boolean m46170C() {
        return new OSUtils().mo27559e() == 2;
    }

    /* renamed from: D */
    static boolean m46171D() {
        return m46184Q("com.google.android.gms");
    }

    /* renamed from: E */
    private static boolean m46172E() {
        return HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(C8338d3.f35438f) == 0;
    }

    /* renamed from: F */
    private static boolean m46173F() {
        return m46184Q("com.huawei.hwid");
    }

    /* renamed from: G */
    static boolean m46174G() {
        return new OSUtils().mo27559e() == 13;
    }

    /* renamed from: H */
    static boolean m46175H() {
        return Thread.currentThread().equals(Looper.getMainLooper().getThread());
    }

    /* renamed from: I */
    static boolean m46176I(String str) {
        return !TextUtils.isEmpty(str);
    }

    /* renamed from: J */
    static boolean m46177J(String str) {
        if (str == null) {
            return false;
        }
        return Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$").matcher(str).matches();
    }

    /* renamed from: K */
    static boolean m46178K(String str) {
        return str != null && !str.matches("^[0-9]");
    }

    /* renamed from: L */
    static <T> Set<T> m46179L() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    /* renamed from: M */
    static Set<String> m46180M(JSONArray jSONArray) throws JSONException {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(jSONArray.getString(i));
        }
        return hashSet;
    }

    /* renamed from: N */
    private static void m46181N(Uri uri) {
        C8338d3.f35438f.startActivity(m46183P(uri));
    }

    /* renamed from: O */
    static void m46182O(String str) {
        m46181N(Uri.parse(str.trim()));
    }

    /* renamed from: P */
    static Intent m46183P(Uri uri) {
        Intent intent;
        C8285b a = uri.getScheme() != null ? C8285b.m46221a(uri.getScheme()) : null;
        if (a == null) {
            a = C8285b.HTTP;
            if (!uri.toString().contains("://")) {
                uri = Uri.parse("http://" + uri.toString());
            }
        }
        if (C8284a.f35286a[a.ordinal()] != 1) {
            intent = new Intent("android.intent.action.VIEW", uri);
        } else {
            intent = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER");
            intent.setData(uri);
        }
        intent.addFlags(268435456);
        return intent;
    }

    /* renamed from: Q */
    private static boolean m46184Q(String str) {
        try {
            return C8338d3.f35438f.getPackageManager().getPackageInfo(str, 128).applicationInfo.enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: R */
    static long[] m46185R(JSONObject jSONObject) {
        JSONArray jSONArray;
        try {
            Object opt = jSONObject.opt("vib_pt");
            if (opt instanceof String) {
                jSONArray = new JSONArray((String) opt);
            } else {
                jSONArray = (JSONArray) opt;
            }
            long[] jArr = new long[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                jArr[i] = jSONArray.optLong(i);
            }
            return jArr;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: S */
    static void m46186S(Runnable runnable, int i) {
        new Handler(Looper.getMainLooper()).postDelayed(runnable, (long) i);
    }

    /* renamed from: T */
    static void m46187T(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    /* renamed from: U */
    static boolean m46188U(String str) {
        if (str != null) {
            return false;
        }
        C8338d3.m46492a(C8338d3.C8384r0.INFO, "OneSignal was not initialized, ensure to always initialize OneSignal from the onCreate of your Application class.");
        return true;
    }

    /* renamed from: V */
    public static boolean m46189V(int i) {
        for (int i2 : f35285b) {
            if (i == i2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: W */
    static void m46190W(int i) {
        try {
            Thread.sleep((long) i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: X */
    private boolean m46191X() {
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: Y */
    private boolean m46192Y() {
        if (!m46207r()) {
            return false;
        }
        return m46171D();
    }

    /* renamed from: Z */
    private boolean m46193Z() {
        if (!m46210u() || !m46205p()) {
            return false;
        }
        return m46172E();
    }

    /* renamed from: a */
    static boolean m46194a(Context context) {
        try {
            return C0665o.m3094e(C8338d3.f35438f).mo2965a();
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: b */
    private Integer m46195b(Context context) {
        boolean z = m46215z();
        boolean y = m46214y();
        if (!z && !y) {
            C8338d3.m46492a(C8338d3.C8384r0.FATAL, "Could not find the Android Support Library. Please make sure it has been correctly added to your project.");
            return -3;
        } else if (!z || !y) {
            C8338d3.m46492a(C8338d3.C8384r0.FATAL, "The included Android Support Library is to old or incomplete. Please update to the 26.0.0 revision or newer.");
            return -5;
        } else if (Build.VERSION.SDK_INT < 26 || m46204o(context) < 26 || m46213x()) {
            return null;
        } else {
            C8338d3.m46492a(C8338d3.C8384r0.FATAL, "The included Android Support Library is to old or incomplete. Please update to the 26.0.0 revision or newer.");
            return -5;
        }
    }

    /* renamed from: f */
    static String m46196f(Context context, String str) {
        Bundle h = m46198h(context);
        if (h != null) {
            return h.getString(str);
        }
        return null;
    }

    /* renamed from: g */
    static boolean m46197g(Context context, String str) {
        Bundle h = m46198h(context);
        if (h != null) {
            return h.getBoolean(str);
        }
        return false;
    }

    /* renamed from: h */
    static Bundle m46198h(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e) {
            C8338d3.m46496b(C8338d3.C8384r0.ERROR, "Manifest application info not found", e);
            return null;
        }
    }

    /* renamed from: j */
    static int m46199j(int i, int i2) {
        return new Random().nextInt((i2 + 1) - i) + i;
    }

    /* renamed from: k */
    static String m46200k(Context context, String str, String str2) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, "string", context.getPackageName());
        return identifier != 0 ? resources.getString(identifier) : str2;
    }

    /* renamed from: l */
    static String m46201l(Throwable th) {
        return m46202m(th).getMessage();
    }

    /* renamed from: m */
    static Throwable m46202m(Throwable th) {
        while (th.getCause() != null && th.getCause() != th) {
            th = th.getCause();
        }
        return th;
    }

    /* renamed from: n */
    static Uri m46203n(Context context, String str) {
        int identifier;
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        if (!m46178K(str) || (identifier = resources.getIdentifier(str, "raw", packageName)) == 0) {
            int identifier2 = resources.getIdentifier("onesignal_default_sound", "raw", packageName);
            if (identifier2 == 0) {
                return null;
            }
            return Uri.parse("android.resource://" + packageName + "/" + identifier2);
        }
        return Uri.parse("android.resource://" + packageName + "/" + identifier);
    }

    /* renamed from: o */
    static int m46204o(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 15;
        }
    }

    @Keep
    private static boolean opaqueHasClass(Class<?> cls) {
        return true;
    }

    /* renamed from: p */
    static boolean m46205p() {
        return m46209t() && m46212w();
    }

    /* renamed from: q */
    static boolean m46206q(Activity activity, int i) {
        try {
            return (activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).configChanges & i) != 0;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: r */
    static boolean m46207r() {
        try {
            return opaqueHasClass(FirebaseMessaging.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    /* renamed from: s */
    static boolean m46208s() {
        try {
            return opaqueHasClass(LocationListener.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    /* renamed from: t */
    private static boolean m46209t() {
        try {
            return opaqueHasClass(AGConnectServicesConfig.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    /* renamed from: u */
    private static boolean m46210u() {
        try {
            return opaqueHasClass(HuaweiApiAvailability.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    /* renamed from: v */
    static boolean m46211v() {
        try {
            return opaqueHasClass(LocationCallback.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    /* renamed from: w */
    private static boolean m46212w() {
        try {
            return opaqueHasClass(HmsInstanceId.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    /* renamed from: x */
    private static boolean m46213x() {
        Class<C0637h> cls = C0637h.class;
        return true;
    }

    /* renamed from: y */
    private static boolean m46214y() {
        return true;
    }

    /* renamed from: z */
    private static boolean m46215z() {
        Class<C4171a> cls = C4171a.class;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public int mo27556A(Context context, String str) {
        Integer c;
        int e = mo27559e();
        try {
            UUID.fromString(str);
            if ("b2f7f966-d8cc-11e4-bed1-df8f05be55ba".equals(str) || "5eb5a37e-b458-11e3-ac11-000c2940e62c".equals(str)) {
                C8338d3.m46492a(C8338d3.C8384r0.ERROR, "OneSignal Example AppID detected, please update to your app's id found on OneSignal.com");
            }
            int i = 1;
            if (e == 1 && (c = mo27557c()) != null) {
                i = c.intValue();
            }
            Integer b = m46195b(context);
            return b != null ? b.intValue() : i;
        } catch (Throwable th) {
            C8338d3.m46496b(C8338d3.C8384r0.FATAL, "OneSignal AppId format is invalid.\nExample: 'b2f7f966-d8cc-11e4-bed1-df8f05be55ba'\n", th);
            return -999;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Integer mo27557c() {
        if (m46207r()) {
            return null;
        }
        C8338d3.m46492a(C8338d3.C8384r0.FATAL, "The Firebase FCM library is missing! Please make sure to include it in your project.");
        return -4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo27558d() {
        try {
            String networkOperatorName = ((TelephonyManager) C8338d3.f35438f.getSystemService("phone")).getNetworkOperatorName();
            if ("".equals(networkOperatorName)) {
                return null;
            }
            return networkOperatorName;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo27559e() {
        if (m46191X()) {
            return 2;
        }
        if (m46192Y()) {
            return 1;
        }
        if (m46193Z()) {
            return 13;
        }
        if (!m46171D() && m46173F()) {
            return 13;
        }
        return 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Integer mo27560i() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) C8338d3.f35438f.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return null;
        }
        int type = activeNetworkInfo.getType();
        if (type == 1 || type == 9) {
            return 0;
        }
        return 1;
    }
}
