package com.startapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.StatFs;
import android.os.SystemClock;
import com.startapp.C8871c2;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.components.C9522y;
import com.startapp.sdk.components.ComponentLocator;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.startapp.z0 */
/* compiled from: Sta */
public abstract class C9671z0 {

    /* renamed from: g0 */
    public static final Collection<Integer> f39482g0;

    /* renamed from: A */
    public String f39483A;

    /* renamed from: B */
    public String f39484B;

    /* renamed from: C */
    public String f39485C;

    /* renamed from: D */
    public String f39486D;

    /* renamed from: E */
    public String f39487E;

    /* renamed from: F */
    public String f39488F;

    /* renamed from: G */
    public String f39489G;

    /* renamed from: H */
    public String f39490H;

    /* renamed from: I */
    public String f39491I;

    /* renamed from: J */
    public String f39492J;

    /* renamed from: K */
    public String f39493K = MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID;

    /* renamed from: L */
    public int f39494L;

    /* renamed from: M */
    public int f39495M;

    /* renamed from: N */
    public float f39496N;

    /* renamed from: O */
    public Boolean f39497O;

    /* renamed from: P */
    public int f39498P = 3;

    /* renamed from: Q */
    public String f39499Q;

    /* renamed from: R */
    public String f39500R;

    /* renamed from: R0 */
    public C9667ye f39501R0;

    /* renamed from: S */
    public int f39502S;

    /* renamed from: T */
    public boolean f39503T;

    /* renamed from: U */
    public boolean f39504U;

    /* renamed from: V */
    public boolean f39505V;

    /* renamed from: W */
    public boolean f39506W;

    /* renamed from: X */
    public String f39507X;

    /* renamed from: Y */
    public String f39508Y;

    /* renamed from: Z */
    public final int f39509Z;

    /* renamed from: a */
    public String f39510a;

    /* renamed from: a0 */
    public Long f39511a0;

    /* renamed from: b */
    public String f39512b;

    /* renamed from: b0 */
    public Integer f39513b0;

    /* renamed from: c */
    public String f39514c = "4.10.8";

    /* renamed from: c0 */
    public Boolean f39515c0;

    /* renamed from: d */
    public Map<String, String> f39516d = new TreeMap();

    /* renamed from: d0 */
    public Boolean f39517d0;

    /* renamed from: e */
    public Map<String, ?> f39518e;

    /* renamed from: e0 */
    public Boolean f39519e0;

    /* renamed from: f */
    public String f39520f;

    /* renamed from: f0 */
    public Boolean f39521f0;

    /* renamed from: g */
    public C9572u f39522g;

    /* renamed from: h */
    public String f39523h;

    /* renamed from: i */
    public String f39524i;

    /* renamed from: j */
    public String f39525j;

    /* renamed from: k */
    public String f39526k;

    /* renamed from: l */
    public String f39527l;

    /* renamed from: m */
    public String f39528m;

    /* renamed from: n */
    public String f39529n;

    /* renamed from: o */
    public String f39530o;

    /* renamed from: p */
    public String f39531p;

    /* renamed from: q */
    public Boolean f39532q;

    /* renamed from: r */
    public Boolean f39533r;

    /* renamed from: s */
    public String f39534s;

    /* renamed from: t */
    public boolean f39535t;

    /* renamed from: u */
    public int f39536u;

    /* renamed from: v */
    public String f39537v;

    /* renamed from: w */
    public String f39538w;

    /* renamed from: x */
    public String f39539x;

    /* renamed from: y */
    public String f39540y;

    /* renamed from: z */
    public String f39541z;

    static {
        ArrayList arrayList = new ArrayList();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            arrayList.add(23);
        }
        if (i >= 26) {
            arrayList.add(22);
        }
        if (i >= 23) {
            arrayList.add(3);
            arrayList.add(4);
            arrayList.add(7);
            arrayList.add(8);
        }
        f39482g0 = Collections.unmodifiableCollection(arrayList);
    }

    public C9671z0(int i) {
        new HashMap();
        this.f39509Z = i;
    }

    /* renamed from: a */
    public void mo31506a(String str) {
        this.f39508Y = str;
    }

    /* renamed from: a */
    public boolean mo30902a() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a6, code lost:
        r0 = r0.getActiveNetworkInfo();
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011b A[SYNTHETIC, Splitter:B:46:0x011b] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29867b(android.content.Context r5, com.startapp.sdk.adsbase.model.AdPreferences r6) {
        /*
            r4 = this;
            com.startapp.u9 r0 = com.startapp.C9584u9.f39253d
            java.lang.String r0 = r0.f39254a
            r4.f39499Q = r0
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r4.f39527l = r0
            java.lang.String r0 = android.os.Build.MODEL
            r4.f39526k = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r4.f39528m = r0
            if (r6 == 0) goto L_0x001e
            java.lang.String r6 = r6.getAge(r5)
            r4.f39520f = r6
        L_0x001e:
            com.startapp.sdk.components.ComponentLocator r6 = com.startapp.sdk.components.ComponentLocator.m50248a((android.content.Context) r5)
            com.startapp.s5<com.startapp.ha> r6 = r6.f39047o
            java.lang.Object r6 = r6.mo29904a()
            com.startapp.ha r6 = (com.startapp.C9007ha) r6
            java.lang.Object r6 = r6.mo29469b()
            com.startapp.ga r6 = (com.startapp.C8985ga) r6
            java.lang.String r6 = r6.f36859a
            r4.f39524i = r6
            int r6 = com.startapp.C8837b0.f36438a
            r6 = 0
            r0 = 0
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch:{ all -> 0x0047 }
            java.lang.String r2 = r5.getPackageName()     // Catch:{ all -> 0x0047 }
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch:{ all -> 0x0047 }
            java.lang.String r1 = r1.versionName     // Catch:{ all -> 0x0047 }
            goto L_0x0048
        L_0x0047:
            r1 = r6
        L_0x0048:
            r4.f39500R = r1
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch:{ all -> 0x0059 }
            java.lang.String r2 = r5.getPackageName()     // Catch:{ all -> 0x0059 }
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r0)     // Catch:{ all -> 0x0059 }
            int r1 = r1.versionCode     // Catch:{ all -> 0x0059 }
            goto L_0x005a
        L_0x0059:
            r1 = 0
        L_0x005a:
            r4.f39502S = r1
            boolean r1 = com.startapp.C8837b0.m48308b((android.content.Context) r5)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4.f39532q = r1
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0083 }
            r2 = 17
            java.lang.String r3 = "adb_enabled"
            if (r1 >= r2) goto L_0x0077
            android.content.ContentResolver r1 = r5.getContentResolver()     // Catch:{ all -> 0x0083 }
            int r1 = android.provider.Settings.Secure.getInt(r1, r3, r0)     // Catch:{ all -> 0x0083 }
            goto L_0x007f
        L_0x0077:
            android.content.ContentResolver r1 = r5.getContentResolver()     // Catch:{ all -> 0x0083 }
            int r1 = android.provider.Settings.Global.getInt(r1, r3, r0)     // Catch:{ all -> 0x0083 }
        L_0x007f:
            if (r1 == 0) goto L_0x0083
            r1 = 1
            goto L_0x0084
        L_0x0083:
            r1 = 0
        L_0x0084:
            r4.f39503T = r1
            boolean r0 = com.startapp.C9261r8.m49230a(r5)     // Catch:{ all -> 0x008b }
            goto L_0x008c
        L_0x008b:
        L_0x008c:
            r4.f39504U = r0
            boolean r0 = com.startapp.C8837b0.m48309c(r5)
            r4.f39505V = r0
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            if (r0 == 0) goto L_0x00bb
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = com.startapp.C8837b0.m48304a((android.content.Context) r5, (java.lang.String) r1)
            if (r1 == 0) goto L_0x00bb
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            if (r0 == 0) goto L_0x00bb
            boolean r1 = r0.isConnected()
            if (r1 == 0) goto L_0x00bb
            boolean r0 = r0.isRoaming()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x00bc
        L_0x00bb:
            r0 = r6
        L_0x00bc:
            r4.f39533r = r0
            boolean r0 = com.startapp.C9605vb.m50480f((android.content.Context) r5)
            r4.f39506W = r0
            android.content.res.Resources r0 = r5.getResources()
            if (r0 == 0) goto L_0x00dc
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            if (r0 == 0) goto L_0x00dc
            int r1 = r0.widthPixels
            r4.f39494L = r1
            int r1 = r0.heightPixels
            r4.f39495M = r1
            float r0 = r0.density
            r4.f39496N = r0
        L_0x00dc:
            com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.m50248a((android.content.Context) r5)
            com.startapp.d6 r1 = r0.mo31179o()
            java.lang.Object r1 = r1.mo29469b()
            com.startapp.c6 r1 = (com.startapp.C8879c6) r1
            java.lang.String r2 = r1.f36584a
            r4.f39529n = r2
            java.lang.String r1 = r1.f36585b
            r4.f39530o = r1
            com.startapp.s5<com.startapp.x4> r1 = r0.f39036d
            java.lang.Object r1 = r1.mo29904a()
            com.startapp.x4 r1 = (com.startapp.C9636x4) r1
            java.lang.Object r1 = r1.mo29469b()
            com.startapp.w4 r1 = (com.startapp.C9617w4) r1
            java.lang.String r1 = r1.f39328a
            r4.f39531p = r1
            com.startapp.sdk.adsbase.e r0 = r0.mo31168d()
            java.lang.String r1 = "USER_CONSENT_PERSONALIZED_ADS_SERVING"
            java.lang.String r1 = r0.getString(r1, r6)
            r4.f39507X = r1
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.f39516d
            java.lang.String r2 = "sharedPrefsWrappers"
            java.lang.String r6 = r0.getString(r2, r6)
            if (r6 != 0) goto L_0x011b
            goto L_0x013a
        L_0x011b:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x013a }
            r0.<init>(r6)     // Catch:{ JSONException -> 0x013a }
            java.util.Iterator r6 = r0.keys()     // Catch:{ JSONException -> 0x013a }
        L_0x0124:
            boolean r2 = r6.hasNext()     // Catch:{ JSONException -> 0x013a }
            if (r2 == 0) goto L_0x013a
            java.lang.Object r2 = r6.next()     // Catch:{ JSONException -> 0x013a }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ JSONException -> 0x013a }
            java.lang.Object r3 = r0.get(r2)     // Catch:{ JSONException -> 0x013a }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ JSONException -> 0x013a }
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x013a }
            goto L_0x0124
        L_0x013a:
            boolean r5 = com.startapp.C9605vb.m50479e((android.content.Context) r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4.f39497O = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C9671z0.mo29867b(android.content.Context, com.startapp.sdk.adsbase.model.AdPreferences):void");
    }

    /* renamed from: c */
    public void mo31508c(Context context) {
        if (!(this.f39512b != null)) {
            C8898d0 c = ComponentLocator.m50248a(context).mo31167c();
            String str = c.f36664c;
            if (str == null) {
                synchronized (c.f36662a) {
                    str = c.f36664c;
                    if (str == null) {
                        str = c.f36663b.getString("c88d4eab540fab77", (String) null);
                    }
                }
            }
            this.f39510a = str;
            String str2 = c.f36665d;
            if (str2 == null) {
                synchronized (c.f36662a) {
                    str2 = c.f36665d;
                    if (str2 == null && (str2 = c.f36663b.getString("2696a7f502faed4b", (String) null)) == null) {
                        str2 = c.f36663b.getString("31721150b470a3b9", (String) null);
                    }
                }
            }
            this.f39512b = str2;
        }
        this.f39523h = context.getPackageName();
    }

    /* renamed from: d */
    public void mo31509d(Context context) {
        NetworkCapabilities networkCapabilities;
        String str = "e105";
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                str = "e100";
            } else if (C8837b0.m48304a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                if (Build.VERSION.SDK_INT >= 23) {
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    if (!(activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null)) {
                        if (!networkCapabilities.hasTransport(1)) {
                            if (networkCapabilities.hasTransport(0)) {
                                str = C9219p7.m49150a(context);
                            }
                        }
                    }
                    str = "e102";
                } else {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                        String typeName = activeNetworkInfo.getTypeName();
                        if (typeName.toLowerCase().compareTo("WIFI".toLowerCase()) != 0) {
                            if (typeName.toLowerCase().compareTo("MOBILE".toLowerCase()) == 0) {
                                str = C9219p7.m49150a(context);
                            }
                        }
                    }
                    str = "e102";
                }
                str = "WIFI";
            }
        } catch (Exception unused) {
        }
        this.f39534s = str;
        String str2 = ComponentLocator.m50248a(context).mo31186v().f39202h;
        this.f39490H = str2;
        this.f39537v = str2;
        int i = -1;
        try {
            C8871c2.C8872a aVar = ComponentLocator.m50248a(context).mo31169e().f36566e;
            if (aVar != null) {
                i = aVar.mo29122a();
            }
        } catch (Throwable th) {
            if (!C9605vb.m50466a(th, (Class<? extends Throwable>) RemoteException.class)) {
                C9023i4.m48681a(th);
            }
        }
        this.f39536u = i;
    }

    /* renamed from: e */
    public void mo31510e(Context context) {
        C9198oa oaVar = (C9198oa) ComponentLocator.m50248a(context).mo31185u().mo29469b();
        if (oaVar.mo29795a(7) == 5) {
            this.f39538w = oaVar.mo29797b(8);
            this.f39539x = oaVar.mo29797b(9);
            this.f39540y = oaVar.mo29797b(15);
            this.f39541z = oaVar.mo29797b(16);
        }
        int a = oaVar.mo29795a(10);
        if (!(a == 0 || a == 2)) {
            this.f39483A = oaVar.mo29797b(11);
            this.f39484B = oaVar.mo29797b(12);
        }
        this.f39485C = oaVar.mo29797b(4);
        this.f39486D = oaVar.mo29797b(3);
        this.f39487E = oaVar.mo29797b(5);
        boolean z = true;
        this.f39488F = oaVar.mo29797b(1);
        this.f39489G = oaVar.mo29797b(2);
        this.f39491I = oaVar.mo29797b(13);
        if (oaVar.mo29795a(14) != 1) {
            z = false;
        }
        this.f39535t = z;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0015 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo31505a(android.content.Context r2, com.startapp.sdk.adsbase.model.AdPreferences r3) {
        /*
            r1 = this;
            com.startapp.sdk.components.ComponentLocator r0 = com.startapp.sdk.components.ComponentLocator.m50248a((android.content.Context) r2)     // Catch:{ all -> 0x000b }
            com.startapp.ye r0 = r0.mo31188x()     // Catch:{ all -> 0x000b }
            r1.f39501R0 = r0     // Catch:{ all -> 0x000b }
            goto L_0x000f
        L_0x000b:
            r0 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r0)
        L_0x000f:
            r1.mo31508c(r2)
            r1.mo29867b(r2, r3)     // Catch:{ all -> 0x0015 }
        L_0x0015:
            r1.mo31509d(r2)     // Catch:{ all -> 0x0019 }
            goto L_0x001d
        L_0x0019:
            r3 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r3)
        L_0x001d:
            r1.mo31510e(r2)     // Catch:{ all -> 0x0021 }
            goto L_0x0025
        L_0x0021:
            r3 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r3)
        L_0x0025:
            com.startapp.sdk.components.ComponentLocator r3 = com.startapp.sdk.components.ComponentLocator.m50248a((android.content.Context) r2)     // Catch:{ all -> 0x0034 }
            com.startapp.y8 r3 = r3.mo31182r()     // Catch:{ all -> 0x0034 }
            java.lang.String r3 = r3.mo31493a((java.lang.Object) r1)     // Catch:{ all -> 0x0034 }
            r1.f39492J = r3     // Catch:{ all -> 0x0034 }
            goto L_0x0038
        L_0x0034:
            r3 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r3)
        L_0x0038:
            r1.mo31504a((android.content.Context) r2)     // Catch:{ all -> 0x003c }
            goto L_0x0040
        L_0x003c:
            r3 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r3)
        L_0x0040:
            r1.mo31507b(r2)     // Catch:{ all -> 0x0044 }
            goto L_0x0048
        L_0x0044:
            r2 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r2)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C9671z0.mo31505a(android.content.Context, com.startapp.sdk.adsbase.model.AdPreferences):void");
    }

    /* renamed from: a */
    public void mo29314a(C9152n8 n8Var) throws SDKException {
        Map<String, ?> map = this.f39518e;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                n8Var.mo29310a((String) next.getKey(), next.getValue(), false, true);
            }
        }
        n8Var.mo29310a("publisherId", (Object) this.f39510a, false, true);
        n8Var.mo29310a(InAppPurchaseMetaData.KEY_PRODUCT_ID, (Object) this.f39512b, mo30902a(), true);
        n8Var.mo29310a("os", (Object) this.f39493K, true, true);
        n8Var.mo29310a("sdkVersion", (Object) this.f39514c, false, true);
        n8Var.mo29310a("flavor", (Object) 1023, false, true);
        Map<String, String> map2 = this.f39516d;
        if (map2 != null && !map2.isEmpty()) {
            String str = "";
            for (String next2 : this.f39516d.keySet()) {
                str = str + next2 + ":" + this.f39516d.get(next2) + ";";
            }
            n8Var.mo29310a("frameworksData", (Object) str.substring(0, str.length() - 1), false, false);
        }
        n8Var.mo29310a("packageId", (Object) this.f39523h, false, true);
        n8Var.mo29310a("installerPkg", (Object) this.f39524i, false, true);
        n8Var.mo29310a("age", (Object) this.f39520f, false, true);
        C9572u uVar = this.f39522g;
        if (uVar != null) {
            n8Var.mo29310a("userAdvertisingId", (Object) uVar.f39228a, false, true);
            boolean z = this.f39522g.f39230c;
            if (z) {
                n8Var.mo29310a("limat", (Object) Boolean.valueOf(z), false, true);
            }
            n8Var.mo29310a("advertisingIdSource", (Object) this.f39522g.f39229b, false, true);
        }
        String str2 = this.f39525j;
        if (str2 != null) {
            n8Var.mo29310a("duid", (Object) str2, false, true);
        }
        n8Var.mo29310a("model", (Object) this.f39526k, false, true);
        n8Var.mo29310a("manufacturer", (Object) this.f39527l, false, true);
        n8Var.mo29310a("deviceVersion", (Object) this.f39528m, false, true);
        n8Var.mo29310a("locale", (Object) this.f39529n, false, true);
        n8Var.mo29310a("localeList", (Object) this.f39530o, false, true);
        n8Var.mo29310a("inputLangs", (Object) this.f39531p, false, true);
        n8Var.mo29310a("isp", (Object) this.f39538w, false, true);
        n8Var.mo29310a("ispName", (Object) this.f39539x, false, true);
        n8Var.mo29310a("ispCarrId", (Object) this.f39540y, false, true);
        n8Var.mo29310a("ispCarrIdName", (Object) this.f39541z, false, true);
        n8Var.mo29310a("netOper", (Object) this.f39483A, false, true);
        n8Var.mo29310a("networkOperName", (Object) this.f39484B, false, true);
        n8Var.mo29310a("cid", (Object) this.f39485C, false, true);
        n8Var.mo29310a("lac", (Object) this.f39486D, false, true);
        n8Var.mo29310a("tac", (Object) this.f39487E, false, true);
        n8Var.mo29310a("blat", (Object) this.f39488F, false, true);
        n8Var.mo29310a("blon", (Object) this.f39489G, false, true);
        n8Var.mo29310a("subPublisherId", (Object) null, false, true);
        n8Var.mo29310a("subProductId", (Object) null, false, true);
        n8Var.mo29310a("retryCount", (Object) null, false, true);
        n8Var.mo29310a("roaming", (Object) this.f39533r, false, true);
        n8Var.mo29310a("grid", (Object) this.f39534s, false, true);
        if (this.f39535t) {
            n8Var.mo29310a("c5g", (Object) "1", false, false);
        }
        int i = this.f39536u;
        if (i >= 0) {
            n8Var.mo29310a("transport", (Object) String.valueOf(i), false, false);
        }
        n8Var.mo29310a("silev", (Object) this.f39537v, false, true);
        n8Var.mo29310a("cellSignalLevel", (Object) this.f39490H, false, true);
        n8Var.mo29310a("cellTimingAdv", (Object) this.f39491I, false, true);
        n8Var.mo29310a("outsource", (Object) this.f39532q, false, true);
        n8Var.mo29310a("width", (Object) String.valueOf(this.f39494L), false, true);
        n8Var.mo29310a("height", (Object) String.valueOf(this.f39495M), false, true);
        n8Var.mo29310a("density", (Object) String.valueOf(this.f39496N), false, true);
        n8Var.mo29310a("fgApp", (Object) this.f39497O, false, true);
        n8Var.mo29310a("sdkId", (Object) String.valueOf(this.f39498P), true, true);
        n8Var.mo29310a("clientSessionId", (Object) this.f39499Q, false, true);
        n8Var.mo29310a("appVersion", (Object) this.f39500R, false, true);
        n8Var.mo29310a("appCode", (Object) Integer.valueOf(this.f39502S), false, true);
        n8Var.mo29310a("timeSinceBoot", (Object) Long.valueOf(SystemClock.elapsedRealtime()), false, true);
        n8Var.mo29310a("udbg", (Object) Boolean.valueOf(this.f39503T), false, true);
        n8Var.mo29310a("root", (Object) Boolean.valueOf(this.f39504U), false, true);
        n8Var.mo29310a("smltr", (Object) Boolean.valueOf(this.f39505V), false, true);
        n8Var.mo29310a("isddbg", (Object) Boolean.valueOf(this.f39506W), false, true);
        n8Var.mo29310a("pas", (Object) this.f39507X, false, true);
        n8Var.mo29310a("prm", (Object) this.f39508Y, false, false);
        n8Var.mo29310a("free", (Object) this.f39511a0, false, false);
        n8Var.mo29310a("chr", (Object) this.f39515c0, false, false);
        n8Var.mo29310a("blp", (Object) this.f39513b0, false, false);
        n8Var.mo29310a("hs", (Object) this.f39517d0, false, false);
        n8Var.mo29310a("lpm", (Object) this.f39519e0, false, false);
        n8Var.mo29310a("dm", (Object) this.f39521f0, false, false);
        C9667ye yeVar = this.f39501R0;
        if (yeVar != null) {
            long j = 0;
            if (yeVar.f39456d > 0) {
                ((C9522y) yeVar.f39453a).getClass();
                j = SystemClock.elapsedRealtime() - yeVar.f39456d;
            }
            n8Var.mo29310a("appSessionDuration", (Object) Long.valueOf(j / 1000), false, false);
        }
        n8Var.mo29310a("rsc", (Object) this.f39492J, false, true);
    }

    /* renamed from: b */
    public void mo31507b(Context context) {
        boolean z;
        try {
            this.f39511a0 = null;
            if (Build.VERSION.SDK_INT >= 18) {
                this.f39511a0 = Long.valueOf(new StatFs(Environment.getRootDirectory().getAbsolutePath()).getFreeBytes());
            }
        } catch (Throwable th) {
            C9023i4.m48681a(th);
        }
        boolean z2 = true;
        try {
            this.f39515c0 = null;
            this.f39513b0 = null;
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                if (registerReceiver.hasExtra("status")) {
                    int intExtra = registerReceiver.getIntExtra("status", -1);
                    if (intExtra != 2) {
                        if (intExtra != 5) {
                            z = false;
                            this.f39515c0 = Boolean.valueOf(z);
                        }
                    }
                    z = true;
                    this.f39515c0 = Boolean.valueOf(z);
                }
                if (registerReceiver.hasExtra("level") && registerReceiver.hasExtra("scale")) {
                    int intExtra2 = registerReceiver.getIntExtra("level", -1);
                    int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                    if (intExtra2 >= 0 && intExtra3 > 0) {
                        this.f39513b0 = Integer.valueOf((intExtra2 * 100) / intExtra3);
                    }
                }
            }
        } catch (Throwable th2) {
            C9023i4.m48681a(th2);
        }
        try {
            this.f39517d0 = null;
            Object systemService = context.getSystemService("audio");
            if (systemService instanceof AudioManager) {
                AudioManager audioManager = (AudioManager) systemService;
                if (Build.VERSION.SDK_INT >= 23) {
                    AudioDeviceInfo[] devices = audioManager.getDevices(2);
                    if (devices != null) {
                        int length = devices.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                AudioDeviceInfo audioDeviceInfo = devices[i];
                                if (audioDeviceInfo != null && f39482g0.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                                    break;
                                }
                                i++;
                            } else {
                                break;
                            }
                        }
                        this.f39517d0 = Boolean.valueOf(z2);
                    }
                    z2 = false;
                    this.f39517d0 = Boolean.valueOf(z2);
                }
            }
        } catch (Throwable th3) {
            C9023i4.m48681a(th3);
        }
        try {
            this.f39519e0 = null;
            Object systemService2 = context.getSystemService("power");
            if (systemService2 instanceof PowerManager) {
                PowerManager powerManager = (PowerManager) systemService2;
                if (Build.VERSION.SDK_INT >= 21) {
                    this.f39519e0 = Boolean.valueOf(powerManager.isPowerSaveMode());
                }
            }
        } catch (Throwable th4) {
            C9023i4.m48681a(th4);
        }
        try {
            this.f39521f0 = null;
            int i2 = context.getResources().getConfiguration().uiMode & 48;
            if (i2 == 32) {
                this.f39521f0 = Boolean.TRUE;
            } else if (i2 == 16) {
                this.f39521f0 = Boolean.FALSE;
            }
        } catch (Throwable th5) {
            C9023i4.m48681a(th5);
        }
    }

    /* renamed from: a */
    public void mo31504a(Context context) {
        if (!MetaData.f38952k.mo31034o()) {
            this.f39522g = ComponentLocator.m50248a(context).mo31165a().mo31157a();
            try {
                this.f39525j = ComponentLocator.m50248a(context).f39042j.mo29904a().mo29308a();
            } catch (Throwable th) {
                C9023i4.m48681a(th);
            }
            try {
                this.f39518e = ComponentLocator.m50248a(context).mo31174j().getAll();
            } catch (Throwable th2) {
                C9023i4.m48681a(th2);
            }
        }
    }
}
