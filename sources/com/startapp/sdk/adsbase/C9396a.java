package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.startapp.C8837b0;
import com.startapp.C8873c3;
import com.startapp.C8893cb;
import com.startapp.C9023i4;
import com.startapp.C9043j4;
import com.startapp.C9219p7;
import com.startapp.C9605vb;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.AnalyticsConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.Constants;
import com.startapp.sdk.components.ComponentLocator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.startapp.sdk.adsbase.a */
/* compiled from: Sta */
public class C9396a {

    /* renamed from: a */
    public static Handler f38713a;

    /* renamed from: b */
    public static ProgressDialog f38714b;

    /* JADX WARNING: type inference failed for: r4v3, types: [java.lang.CharSequence] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m49773a(android.content.Context r3, java.lang.String r4) {
        /*
            android.content.res.Resources r0 = r3.getResources()     // Catch:{ all -> 0x000f }
            android.content.pm.ApplicationInfo r1 = r3.getApplicationInfo()     // Catch:{ all -> 0x000f }
            int r1 = r1.labelRes     // Catch:{ all -> 0x000f }
            java.lang.String r3 = r0.getString(r1)     // Catch:{ all -> 0x000f }
            return r3
        L_0x000f:
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            r1 = 0
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch:{ all -> 0x0020 }
            java.lang.String r3 = r3.packageName     // Catch:{ all -> 0x0020 }
            r2 = 0
            android.content.pm.ApplicationInfo r1 = r0.getApplicationInfo(r3, r2)     // Catch:{ all -> 0x0020 }
            goto L_0x0021
        L_0x0020:
        L_0x0021:
            if (r1 == 0) goto L_0x0027
            java.lang.CharSequence r4 = r0.getApplicationLabel(r1)
        L_0x0027:
            java.lang.String r4 = (java.lang.String) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.C9396a.m49773a(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public static boolean m49795b(String str) {
        return str.startsWith("market") || str.startsWith("http://play.google.com") || str.startsWith("https://play.google.com");
    }

    /* renamed from: c */
    public static boolean m49797c(String str) {
        return str != null && (str.startsWith("http://") || str.startsWith("https://"));
    }

    /* renamed from: b */
    public static void m49793b(Context context) {
        if (context != null && (context instanceof Activity)) {
            Activity activity = (Activity) context;
            Map<Activity, Integer> map = C9605vb.f39316a;
            C9605vb.m50442a(activity, activity.getResources().getConfiguration().orientation, false);
        }
        ProgressDialog progressDialog = f38714b;
        if (progressDialog != null) {
            synchronized (progressDialog) {
                ProgressDialog progressDialog2 = f38714b;
                if (progressDialog2 != null && progressDialog2.isShowing()) {
                    try {
                        f38714b.cancel();
                    } catch (Throwable th) {
                        C9023i4.m48681a(th);
                    }
                    f38714b = null;
                }
            }
        }
    }

    /* renamed from: c */
    public static String m49796c(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return context.getClass().getName();
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m49787a(Activity activity) {
        boolean z = activity.getTheme().obtainStyledAttributes(new int[]{16843277}).getBoolean(0, false);
        if ((activity.getWindow().getAttributes().flags & 1024) != 0) {
            return true;
        }
        return z;
    }

    /* renamed from: a */
    public static int m49769a(String str) {
        String[] split = str.split("&");
        return Integer.parseInt(split[split.length - 1].split("=")[1]);
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m49782a(android.content.Context r17, java.lang.String r18, java.lang.String[] r19, java.lang.String r20, com.startapp.sdk.adsbase.commontracking.TrackingParams r21, long r22, long r24, boolean r26, java.lang.Boolean r27, boolean r28, java.lang.Runnable r29) {
        /*
            r15 = r17
            r0 = r20
            com.startapp.sdk.adsbase.AdsCommonMetaData r1 = com.startapp.sdk.adsbase.AdsCommonMetaData.f38625h
            boolean r1 = r1.mo30452N()
            if (r1 == 0) goto L_0x01bb
            r2 = r18
            r3 = r19
            r4 = r21
            r6 = r28
            android.util.Pair r1 = m49770a((android.content.Context) r15, (java.lang.String[]) r3, (java.lang.String) r2, (com.startapp.sdk.adsbase.commontracking.TrackingParams) r4, (boolean) r6)
            java.lang.Object r3 = r1.first
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.second
            r14 = r1
            java.lang.String r14 = (java.lang.String) r14
            java.lang.StringBuilder r1 = com.startapp.C8870c1.m48422a(r18)
            com.startapp.sdk.adsbase.AdsCommonMetaData r2 = com.startapp.sdk.adsbase.AdsCommonMetaData.f38625h
            boolean r2 = r2.mo30451M()
            r4 = 0
            r5 = 1
            if (r2 != 0) goto L_0x0038
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r2 = 0
            goto L_0x0039
        L_0x0038:
            r2 = 1
        L_0x0039:
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0042
            java.lang.String r2 = com.startapp.C8811a.m48227c(r14)
            goto L_0x0043
        L_0x0042:
            r2 = r3
        L_0x0043:
            r1.append(r2)
            java.lang.String r13 = r1.toString()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "com.startapp.android.OnClickCallback"
            r1.<init>(r2)
            java.lang.String r2 = "dParam"
            r1.putExtra(r2, r14)
            com.startapp.b6 r2 = com.startapp.C8846b6.m48400a((android.content.Context) r17)
            r2.mo29213a((android.content.Intent) r1)
            boolean r1 = m49795b((java.lang.String) r13)
            if (r1 == 0) goto L_0x00ae
            if (r0 == 0) goto L_0x00a4
            boolean r1 = r0.equals(r3)
            if (r1 != 0) goto L_0x00a4
            java.lang.String r1 = r13.toLowerCase()
            java.lang.String r2 = r20.toLowerCase()
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L_0x00a4
            com.startapp.i4 r1 = new com.startapp.i4
            com.startapp.j4 r2 = com.startapp.C9043j4.f36994e
            r1.<init>((com.startapp.C9043j4) r2)
            java.lang.String r2 = "Wrong package reached"
            r1.f36952d = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", Link: "
            r2.append(r0)
            r2.append(r13)
            java.lang.String r0 = r2.toString()
            r1.f36953e = r0
            r1.f36955g = r14
            r1.mo29471a()
        L_0x00a4:
            m49794b(r15, r13, r14)
            if (r29 == 0) goto L_0x01cb
            r29.run()
            goto L_0x01cb
        L_0x00ae:
            boolean r1 = r15 instanceof android.app.Activity
            if (r1 == 0) goto L_0x00b8
            r1 = r15
            android.app.Activity r1 = (android.app.Activity) r1
            com.startapp.C9605vb.m50456a((android.app.Activity) r1, (boolean) r5)
        L_0x00b8:
            com.startapp.sdk.components.ComponentLocator r1 = com.startapp.sdk.components.ComponentLocator.m50248a((android.content.Context) r17)     // Catch:{ all -> 0x01a7 }
            com.startapp.md r1 = r1.mo31187w()     // Catch:{ all -> 0x01a7 }
            android.webkit.WebView r12 = r1.mo29704b()     // Catch:{ all -> 0x01a7 }
            android.app.ProgressDialog r1 = f38714b     // Catch:{ all -> 0x01a7 }
            if (r1 != 0) goto L_0x0151
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x01a7 }
            r2 = 22
            if (r1 < r2) goto L_0x00d9
            android.app.ProgressDialog r2 = new android.app.ProgressDialog     // Catch:{ all -> 0x01a7 }
            r3 = 16974545(0x10302d1, float:2.406292E-38)
            r2.<init>(r15, r3)     // Catch:{ all -> 0x01a7 }
            f38714b = r2     // Catch:{ all -> 0x01a7 }
            goto L_0x00e0
        L_0x00d9:
            android.app.ProgressDialog r2 = new android.app.ProgressDialog     // Catch:{ all -> 0x01a7 }
            r2.<init>(r15)     // Catch:{ all -> 0x01a7 }
            f38714b = r2     // Catch:{ all -> 0x01a7 }
        L_0x00e0:
            android.app.ProgressDialog r2 = f38714b     // Catch:{ all -> 0x01a7 }
            r3 = 0
            r2.setTitle(r3)     // Catch:{ all -> 0x01a7 }
            android.app.ProgressDialog r2 = f38714b     // Catch:{ all -> 0x01a7 }
            java.lang.String r3 = "Loading...."
            r2.setMessage(r3)     // Catch:{ all -> 0x01a7 }
            android.app.ProgressDialog r2 = f38714b     // Catch:{ all -> 0x01a7 }
            r2.setIndeterminate(r4)     // Catch:{ all -> 0x01a7 }
            android.app.ProgressDialog r2 = f38714b     // Catch:{ all -> 0x01a7 }
            r2.setCancelable(r4)     // Catch:{ all -> 0x01a7 }
            android.app.ProgressDialog r2 = f38714b     // Catch:{ all -> 0x01a7 }
            com.startapp.s r3 = new com.startapp.s     // Catch:{ all -> 0x01a7 }
            r3.<init>(r12)     // Catch:{ all -> 0x01a7 }
            r2.setOnCancelListener(r3)     // Catch:{ all -> 0x01a7 }
            boolean r2 = r15 instanceof android.app.Activity     // Catch:{ all -> 0x01a7 }
            if (r2 == 0) goto L_0x0114
            r2 = r15
            android.app.Activity r2 = (android.app.Activity) r2     // Catch:{ all -> 0x01a7 }
            boolean r2 = r2.isFinishing()     // Catch:{ all -> 0x01a7 }
            if (r2 != 0) goto L_0x0114
            android.app.ProgressDialog r1 = f38714b     // Catch:{ all -> 0x01a7 }
            r1.show()     // Catch:{ all -> 0x01a7 }
            goto L_0x0151
        L_0x0114:
            boolean r2 = r15 instanceof android.app.Activity     // Catch:{ all -> 0x01a7 }
            if (r2 != 0) goto L_0x0151
            r2 = 23
            if (r1 < r2) goto L_0x0121
            boolean r2 = android.provider.Settings.canDrawOverlays(r17)     // Catch:{ all -> 0x01a7 }
            goto L_0x0127
        L_0x0121:
            java.lang.String r2 = "android.permission.SYSTEM_ALERT_WINDOW"
            boolean r2 = com.startapp.C8837b0.m48304a((android.content.Context) r15, (java.lang.String) r2)     // Catch:{ all -> 0x01a7 }
        L_0x0127:
            if (r2 == 0) goto L_0x0151
            android.app.ProgressDialog r2 = f38714b     // Catch:{ all -> 0x01a7 }
            android.view.Window r2 = r2.getWindow()     // Catch:{ all -> 0x01a7 }
            if (r2 == 0) goto L_0x0151
            r2 = 26
            if (r1 < r2) goto L_0x0141
            android.app.ProgressDialog r1 = f38714b     // Catch:{ all -> 0x01a7 }
            android.view.Window r1 = r1.getWindow()     // Catch:{ all -> 0x01a7 }
            r2 = 2038(0x7f6, float:2.856E-42)
            r1.setType(r2)     // Catch:{ all -> 0x01a7 }
            goto L_0x014c
        L_0x0141:
            android.app.ProgressDialog r1 = f38714b     // Catch:{ all -> 0x01a7 }
            android.view.Window r1 = r1.getWindow()     // Catch:{ all -> 0x01a7 }
            r2 = 2003(0x7d3, float:2.807E-42)
            r1.setType(r2)     // Catch:{ all -> 0x01a7 }
        L_0x014c:
            android.app.ProgressDialog r1 = f38714b     // Catch:{ all -> 0x01a7 }
            r1.show()     // Catch:{ all -> 0x01a7 }
        L_0x0151:
            android.webkit.WebSettings r1 = r12.getSettings()     // Catch:{ all -> 0x01a7 }
            r1.setJavaScriptEnabled(r5)     // Catch:{ all -> 0x01a7 }
            android.webkit.WebChromeClient r1 = new android.webkit.WebChromeClient     // Catch:{ all -> 0x01a7 }
            r1.<init>()     // Catch:{ all -> 0x01a7 }
            r12.setWebChromeClient(r1)     // Catch:{ all -> 0x01a7 }
            com.startapp.b7 r11 = new com.startapp.b7     // Catch:{ all -> 0x01a7 }
            com.startapp.sdk.components.ComponentLocator r1 = com.startapp.sdk.components.ComponentLocator.m50248a((android.content.Context) r17)     // Catch:{ all -> 0x01a7 }
            com.startapp.sdk.adsbase.e r3 = r1.mo31168d()     // Catch:{ all -> 0x01a7 }
            com.startapp.sdk.components.ComponentLocator r1 = com.startapp.sdk.components.ComponentLocator.m50248a((android.content.Context) r17)     // Catch:{ all -> 0x01a7 }
            java.util.concurrent.Executor r4 = r1.mo31175k()     // Catch:{ all -> 0x01a7 }
            android.os.Handler r5 = new android.os.Handler     // Catch:{ all -> 0x01a7 }
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x01a7 }
            r5.<init>(r1)     // Catch:{ all -> 0x01a7 }
            r1 = r11
            r2 = r17
            r6 = r22
            r8 = r24
            r10 = r26
            r0 = r11
            r11 = r27
            r18 = r0
            r0 = r12
            r12 = r13
            r16 = r13
            r13 = r20
            r19 = r14
            r15 = r29
            r1.<init>(r2, r3, r4, r5, r6, r8, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x01a3 }
            r1 = r18
            r0.setWebViewClient(r1)     // Catch:{ all -> 0x01a3 }
            r1 = r16
            r0.loadUrl(r1)     // Catch:{ all -> 0x01a1 }
            goto L_0x01cb
        L_0x01a1:
            r0 = move-exception
            goto L_0x01ab
        L_0x01a3:
            r0 = move-exception
            r1 = r16
            goto L_0x01ab
        L_0x01a7:
            r0 = move-exception
            r1 = r13
            r19 = r14
        L_0x01ab:
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r0)
            r5 = r17
            r2 = r19
            m49794b(r5, r1, r2)
            if (r29 == 0) goto L_0x01cb
            r29.run()
            goto L_0x01cb
        L_0x01bb:
            r2 = r18
            r3 = r19
            r4 = r21
            r6 = r28
            r5 = r15
            r1 = r17
            r5 = r26
            m49781a((android.content.Context) r1, (java.lang.String) r2, (java.lang.String[]) r3, (com.startapp.sdk.adsbase.commontracking.TrackingParams) r4, (boolean) r5, (boolean) r6)
        L_0x01cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.C9396a.m49782a(android.content.Context, java.lang.String, java.lang.String[], java.lang.String, com.startapp.sdk.adsbase.commontracking.TrackingParams, long, long, boolean, java.lang.Boolean, boolean, java.lang.Runnable):void");
    }

    /* renamed from: b */
    public static void m49794b(Context context, String str, String str2) {
        boolean c = m49797c(str);
        if (context != null) {
            int i = 76021760;
            if (AdsCommonMetaData.f38625h.mo30448J() || !(context instanceof Activity)) {
                i = 344457216;
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(i);
            boolean a = m49789a(context, intent);
            if (!a) {
                try {
                    if (Build.VERSION.SDK_INT >= 18 && MetaData.f38952k.mo31029j() && ComponentLocator.m50248a(context).mo31168d().getBoolean("chromeTabs", false)) {
                        m49780a(context, str, c);
                        return;
                    }
                } catch (Throwable th) {
                    C9023i4.m48681a(th);
                    return;
                }
            }
            if (c && !a) {
                m49777a(context, intent, i);
            }
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static void m49786a(String[] strArr, String str, int i, String str2) {
        TrackingParams a = new TrackingParams(str).mo30720a(i).mo30721a(str2);
        if (strArr == null || strArr.length == 0) {
            C9023i4 i4Var = new C9023i4(C9043j4.f36994e);
            i4Var.f36952d = "Non-impression without trackingUrls";
            i4Var.f36957i = str2;
            i4Var.f36953e = C9605vb.m50469b(a.mo30724d());
            i4Var.mo29471a();
            return;
        }
        for (String str3 : strArr) {
            if (str3 != null && str3.length() > 0) {
                C9023i4 i4Var2 = new C9023i4(C9043j4.f37001l);
                i4Var2.f36953e = C8893cb.m48469a(str3, a);
                i4Var2.mo29471a();
            }
        }
    }

    /* renamed from: a */
    public static List<String> m49776a(List<String> list, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < list.size()) {
            int i2 = i + 5;
            List<String> subList = list.subList(i, Math.min(i2, list.size()));
            StringBuilder sb = new StringBuilder();
            sb.append(AdsConstants.f38630e);
            sb.append("?");
            sb.append(TextUtils.join("&", subList));
            sb.append("&isShown=");
            sb.append(str);
            sb.append("&appPresence=" + str2);
            arrayList.add(sb.toString());
            i = i2;
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020 A[Catch:{ all -> 0x0088 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e A[Catch:{ all -> 0x0088 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0084 A[Catch:{ all -> 0x0088 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m49781a(android.content.Context r2, java.lang.String r3, java.lang.String[] r4, com.startapp.sdk.adsbase.commontracking.TrackingParams r5, boolean r6, boolean r7) {
        /*
            android.util.Pair r4 = m49770a((android.content.Context) r2, (java.lang.String[]) r4, (java.lang.String) r3, (com.startapp.sdk.adsbase.commontracking.TrackingParams) r5, (boolean) r7)
            java.lang.Object r5 = r4.first
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.second
            java.lang.String r4 = (java.lang.String) r4
            com.startapp.sdk.adsbase.AdsCommonMetaData r7 = com.startapp.sdk.adsbase.AdsCommonMetaData.f38625h     // Catch:{ all -> 0x0088 }
            boolean r7 = r7.mo30451M()     // Catch:{ all -> 0x0088 }
            if (r7 != 0) goto L_0x001d
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0088 }
            if (r7 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r7 = 0
            goto L_0x001e
        L_0x001d:
            r7 = 1
        L_0x001e:
            if (r7 == 0) goto L_0x0033
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0088 }
            r7.<init>()     // Catch:{ all -> 0x0088 }
            r7.append(r3)     // Catch:{ all -> 0x0088 }
            java.lang.String r3 = com.startapp.C8811a.m48227c(r4)     // Catch:{ all -> 0x0088 }
            r7.append(r3)     // Catch:{ all -> 0x0088 }
            java.lang.String r3 = r7.toString()     // Catch:{ all -> 0x0088 }
        L_0x0033:
            com.startapp.sdk.adsbase.remoteconfig.MetaData r7 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f38952k     // Catch:{ all -> 0x0088 }
            boolean r7 = r7.mo31004T()     // Catch:{ all -> 0x0088 }
            if (r7 == 0) goto L_0x0041
            if (r6 == 0) goto L_0x0041
            m49779a((android.content.Context) r2, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ all -> 0x0088 }
            goto L_0x008c
        L_0x0041:
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0088 }
            r5 = 0
            if (r4 == 0) goto L_0x0084
            boolean r4 = m49788a((android.content.Context) r2)     // Catch:{ all -> 0x0088 }
            if (r4 == 0) goto L_0x0084
            com.startapp.sdk.components.ComponentLocator r4 = com.startapp.sdk.components.ComponentLocator.m50248a((android.content.Context) r2)     // Catch:{ all -> 0x0088 }
            com.startapp.sdk.adsbase.e r4 = r4.mo31168d()     // Catch:{ all -> 0x0088 }
            com.startapp.sdk.adsbase.e$a r4 = r4.edit()     // Catch:{ all -> 0x0088 }
            java.lang.String r6 = "shared_prefs_CookieFeatureTS"
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0088 }
            java.lang.Long r7 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0088 }
            r4.mo30812a((java.lang.String) r6, r7)     // Catch:{ all -> 0x0088 }
            android.content.SharedPreferences$Editor r7 = r4.f38873a     // Catch:{ all -> 0x0088 }
            r7.putLong(r6, r0)     // Catch:{ all -> 0x0088 }
            r4.apply()     // Catch:{ all -> 0x0088 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0088 }
            r4.<init>()     // Catch:{ all -> 0x0088 }
            r4.append(r3)     // Catch:{ all -> 0x0088 }
            java.lang.String r3 = "&cki=1"
            r4.append(r3)     // Catch:{ all -> 0x0088 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0088 }
            m49794b(r2, r3, r5)     // Catch:{ all -> 0x0088 }
            goto L_0x008c
        L_0x0084:
            m49794b(r2, r3, r5)     // Catch:{ all -> 0x0088 }
            goto L_0x008c
        L_0x0088:
            r2 = move-exception
            com.startapp.C9023i4.m48681a((java.lang.Throwable) r2)
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.C9396a.m49781a(android.content.Context, java.lang.String, java.lang.String[], com.startapp.sdk.adsbase.commontracking.TrackingParams, boolean, boolean):void");
    }

    /* renamed from: a */
    public static Pair<String, String> m49770a(Context context, String[] strArr, String str, TrackingParams trackingParams, boolean z) {
        String str2;
        String str3;
        int i = 0;
        if (strArr != null) {
            for (String str4 : strArr) {
                if (!TextUtils.isEmpty(str4)) {
                    m49778a(context, str4, trackingParams);
                }
            }
        }
        Object obj = StartAppSDKInternal.f38662D;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.C9395d.f38707a;
        startAppSDKInternal.f38679m = true;
        startAppSDKInternal.f38671e = true;
        String str5 = null;
        if (z || strArr == null) {
            str2 = null;
        } else {
            try {
                int length = strArr.length;
                str2 = null;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    try {
                        str3 = strArr[i];
                        str2 = m49774a(str, str3);
                        if (str2 != null || C9605vb.m50477d(str3)) {
                            str5 = str3;
                        } else {
                            i++;
                        }
                    } catch (Throwable th) {
                        th = th;
                        C9023i4.m48681a(th);
                        return new Pair<>(str5, str2);
                    }
                }
                str5 = str3;
            } catch (Throwable th2) {
                th = th2;
                str2 = null;
                C9023i4.m48681a(th);
                return new Pair<>(str5, str2);
            }
        }
        return new Pair<>(str5, str2);
    }

    /* renamed from: a */
    public static void m49778a(Context context, String str, TrackingParams trackingParams) {
        if (context != null) {
            if (str != null && str.length() > 0) {
                C8893cb.m48468a(context, str, trackingParams, (C8873c3<String, C9219p7.C9220a, Throwable, Void>) null);
            }
            C9605vb.m50457a(context, 4, TextUtils.isEmpty(str) ? "Closed Ad" : "Clicked Ad", true);
        }
    }

    /* renamed from: a */
    public static void m49777a(Context context, Intent intent, int i) {
        String[] strArr = {"com.android.chrome", "com.android.browser", "com.opera.mini.native", "org.mozilla.firefox", "com.opera.browser"};
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, i);
            if (queryIntentActivities != null && queryIntentActivities.size() > 1) {
                for (int i2 = 0; i2 < 5; i2++) {
                    String str = strArr[i2];
                    if (C8837b0.m48305a(context, str, 0)) {
                        intent.setPackage(str);
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            C9023i4.m48681a(th);
        }
    }

    /* renamed from: a */
    public static void m49779a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            C9023i4 i4Var = new C9023i4(C9043j4.f36994e);
            i4Var.f36952d = "Can not open in app browser, clickUrl is empty";
            if (str2 != null) {
                i4Var.f36955g = str2;
            }
            i4Var.mo29471a();
        } else if (!m49795b(str)) {
            Map<Activity, Integer> map = C9605vb.f39316a;
            try {
                if (Build.VERSION.SDK_INT >= 18 && MetaData.f38952k.mo31030k() && ComponentLocator.m50248a(context).mo31168d().getBoolean("chromeTabs", false)) {
                    m49780a(context, str, true);
                    return;
                }
            } catch (Throwable th) {
                C9023i4.m48681a(th);
            }
            Intent intent = new Intent(context, OverlayActivity.class);
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                intent.addFlags(524288);
            }
            if (i >= 11) {
                intent.addFlags(32768);
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.setData(Uri.parse(str));
            intent.putExtra("placement", AdPreferences.Placement.INAPP_BROWSER.mo30901a());
            intent.putExtra("activityShouldLockOrientation", false);
            try {
                context.startActivity(intent);
            } catch (Throwable th2) {
                C9023i4.m48681a(th2);
            }
        } else {
            m49794b(context, str, str2);
        }
    }

    /* renamed from: a */
    public static void m49780a(Context context, String str, boolean z) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        Bundle bundle = new Bundle();
        bundle.putBinder("android.support.customtabs.extra.SESSION", (IBinder) null);
        intent.putExtras(bundle);
        if (z) {
            try {
                List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
                if (queryIntentActivities != null && queryIntentActivities.size() > 1) {
                    intent.setPackage(queryIntentActivities.get(0).activityInfo.packageName);
                }
            } catch (Throwable th) {
                C9023i4.m48681a(th);
            }
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            context.startActivity(intent);
        } catch (Throwable th2) {
            C9023i4.m48681a(th2);
        }
    }

    /* renamed from: a */
    public static void m49785a(String str, String str2, String str3, Context context, TrackingParams trackingParams) {
        C8893cb.m48468a(context, str3, trackingParams, (C8873c3<String, C9219p7.C9220a, Throwable, Void>) null);
        Intent a = C9605vb.m50444a(context, str);
        if (!(a == null || str2 == null)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String valueOf = String.valueOf(keys.next());
                    a.putExtra(valueOf, String.valueOf(jSONObject.get(valueOf)));
                }
            } catch (JSONException unused) {
            }
        }
        if (a != null) {
            try {
                context.startActivity(a);
            } catch (Throwable th) {
                C9023i4.m48681a(th);
            }
        }
    }

    /* renamed from: a */
    public static String m49774a(String str, String str2) {
        if (str2 != null) {
            try {
                if (!str2.equals("")) {
                    str = str2;
                }
            } catch (Exception unused) {
            }
        }
        if (str != null) {
            String[] split = str.split("[?&]d=");
            if (split.length >= 2) {
                return split[1].split("[?&]")[0];
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m49783a(Context context, String[] strArr, String str, int i, String str2, JSONObject jSONObject) {
        try {
            AnalyticsConfig analyticsConfig = MetaData.f38952k.analytics;
            if (!(analyticsConfig == null || !analyticsConfig.mo30951k() || jSONObject == null)) {
                C9023i4 i4Var = new C9023i4(C9043j4.f36993d);
                i4Var.f36952d = "viewability_info";
                i4Var.f36957i = str2;
                i4Var.f36953e = C9605vb.m50475c(jSONObject.toString());
                i4Var.mo29471a();
            }
        } catch (Throwable th) {
            C9023i4.m48681a(th);
        }
        try {
            String str3 = "Dropped impression because " + str2;
            if (jSONObject != null) {
                str3 = str3 + ", view hierarchy: " + jSONObject.toString(2);
            }
            C9605vb.m50457a(context, 6, str3, false);
        } catch (Throwable th2) {
            C9023i4.m48681a(th2);
        }
        m49786a(strArr, str, i, str2);
    }

    /* renamed from: a */
    public static boolean m49789a(Context context, Intent intent) {
        for (ResolveInfo next : context.getPackageManager().queryIntentActivities(intent, 0)) {
            if (next.activityInfo.packageName.equalsIgnoreCase(Constants.f39008a)) {
                ActivityInfo activityInfo = next.activityInfo;
                intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static String m49771a() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        for (int i = 0; i < 8; i++) {
            if (stackTrace[i].getMethodName().compareTo("doHome") == 0) {
                return "home";
            }
            if (stackTrace[i].getMethodName().compareTo("onBackPressed") == 0) {
                Object obj = StartAppSDKInternal.f38662D;
                StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.C9395d.f38707a;
                Activity activity = startAppSDKInternal.f38678l;
                if (!(activity != null ? activity.isTaskRoot() : true)) {
                    return "interstitial";
                }
                startAppSDKInternal.f38670d = false;
                startAppSDKInternal.f38672f = true;
                return "back";
            }
        }
        return "interstitial";
    }

    /* renamed from: a */
    public static String[] m49791a(C9440d dVar) {
        if (dVar instanceof HtmlAd) {
            return ((HtmlAd) dVar).trackingUrls;
        }
        return dVar instanceof JsonAd ? m49792a(((JsonAd) dVar).mo30512g()) : new String[0];
    }

    /* renamed from: a */
    public static String[] m49792a(List<AdDetails> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (AdDetails w : list) {
                arrayList.addAll(Arrays.asList(w.mo30851w()));
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: a */
    public static boolean m49790a(Context context, AdPreferences.Placement placement) {
        if (placement.equals(AdPreferences.Placement.INAPP_SPLASH) || !AdsCommonMetaData.f38625h.mo30455a()) {
            return false;
        }
        return m49788a(context);
    }

    /* renamed from: a */
    public static boolean m49788a(Context context) {
        ComponentLocator a = ComponentLocator.m50248a(context);
        if (a.mo31165a().mo31157a().f39230c) {
            return false;
        }
        long j = a.mo31168d().getLong("shared_prefs_CookieFeatureTS", 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (j == 0 || (((long) AdsCommonMetaData.f38625h.mo30459e()) * 86400000) + j <= currentTimeMillis) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m49784a(Runnable runnable) {
        if (runnable != null) {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == null || mainLooper.getThread() == Thread.currentThread()) {
                runnable.run();
                return;
            }
            Handler handler = f38713a;
            if (handler == null) {
                handler = new Handler(mainLooper);
                f38713a = handler;
            }
            handler.post(runnable);
        }
    }

    /* renamed from: a */
    public static String m49772a(Context context, Object obj) {
        if (Build.VERSION.SDK_INT < 9) {
            return null;
        }
        return m49775a(context.getPackageName(), obj.getClass().getName(), m49796c(context), (String) null);
    }

    /* renamed from: a */
    public static String m49775a(String str, String str2, String str3, String str4) {
        String str5;
        StringBuilder sb = new StringBuilder();
        Locale locale = Locale.ROOT;
        sb.append(String.format(locale, "10%08x", new Object[]{Integer.valueOf((str + str2).hashCode())}));
        String str6 = "";
        if (str3 != null) {
            str5 = String.format(locale, "ac%08x", new Object[]{Integer.valueOf(str3.hashCode())});
        } else {
            str5 = str6;
        }
        sb.append(str5);
        if (str4 != null) {
            str6 = String.format(locale, "b1%08x", new Object[]{Integer.valueOf(str4.hashCode())});
        }
        sb.append(str6);
        return sb.toString();
    }
}
