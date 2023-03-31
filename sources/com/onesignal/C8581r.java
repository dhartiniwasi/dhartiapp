package com.onesignal;

import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.widget.RemoteViews;
import androidx.core.app.C0651l;
import androidx.core.app.C0665o;
import com.onesignal.C8338d3;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.r */
/* compiled from: GenerateNotification */
class C8581r {

    /* renamed from: a */
    private static Class<?> f35982a = NotificationOpenedReceiver.class;

    /* renamed from: b */
    private static Class<?> f35983b = NotificationDismissReceiver.class;

    /* renamed from: c */
    private static Resources f35984c = null;

    /* renamed from: d */
    private static Context f35985d = null;

    /* renamed from: e */
    private static String f35986e = null;

    /* renamed from: f */
    private static Integer f35987f = null;

    /* renamed from: com.onesignal.r$b */
    /* compiled from: GenerateNotification */
    private static class C8583b {

        /* renamed from: a */
        C0651l.C0659e f35988a;

        /* renamed from: b */
        boolean f35989b;

        private C8583b() {
        }
    }

    /* renamed from: A */
    private static int m47553A(JSONObject jSONObject) {
        int z = m47591z(jSONObject.optString("sicon", (String) null));
        if (z != 0) {
            return z;
        }
        return m47586u();
    }

    /* renamed from: B */
    private static CharSequence m47554B(JSONObject jSONObject) {
        String optString = jSONObject.optString("title", (String) null);
        if (optString != null) {
            return optString;
        }
        return f35985d.getPackageManager().getApplicationLabel(f35985d.getApplicationInfo());
    }

    /* renamed from: C */
    private static void m47555C() {
        if (Build.VERSION.SDK_INT >= 24) {
            f35987f = 2;
        } else {
            f35987f = 1;
        }
    }

    /* renamed from: D */
    static void m47556D() {
        if (OSUtils.m46175H()) {
            throw new C8633v2("Process for showing a notification should never been done on Main Thread!");
        }
    }

    /* renamed from: E */
    private static boolean m47557E(JSONObject jSONObject) {
        String optString = jSONObject.optString("sound", (String) null);
        return !"null".equals(optString) && !"nil".equals(optString);
    }

    /* renamed from: F */
    private static void m47558F(C0651l.C0659e eVar) {
        eVar.mo2918C(true).mo2945r(0).mo2923H((Uri) null).mo2927L((long[]) null).mo2926K((CharSequence) null);
    }

    /* renamed from: G */
    private static Bitmap m47559G(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int dimension = (int) f35984c.getDimension(17104902);
            int dimension2 = (int) f35984c.getDimension(17104901);
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();
            if (width <= dimension2 && height <= dimension) {
                return bitmap;
            }
            if (height > width) {
                dimension2 = (int) (((float) dimension) * (((float) width) / ((float) height)));
            } else if (width > height) {
                dimension = (int) (((float) dimension2) * (((float) height) / ((float) width)));
            }
            return Bitmap.createScaledBitmap(bitmap, dimension2, dimension, true);
        } catch (Throwable unused) {
            return bitmap;
        }
    }

    /* renamed from: H */
    private static Integer m47560H(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.has(str)) {
                return Integer.valueOf(new BigInteger(jSONObject.optString(str), 16).intValue());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m47561I(org.json.JSONObject r6, androidx.core.app.C0651l.C0659e r7) {
        /*
            java.lang.String r0 = "pri"
            r1 = 6
            int r0 = r6.optInt(r0, r1)
            int r0 = m47570e(r0)
            r7.mo2919D(r0)
            r1 = 0
            r2 = 1
            if (r0 >= 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x0018
            return
        L_0x0018:
            java.lang.String r0 = "ledc"
            boolean r3 = r6.has(r0)
            r4 = 4
            if (r3 == 0) goto L_0x0040
            java.lang.String r3 = "led"
            int r3 = r6.optInt(r3, r2)
            if (r3 != r2) goto L_0x0040
            java.math.BigInteger r3 = new java.math.BigInteger     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = r6.optString(r0)     // Catch:{ all -> 0x0040 }
            r5 = 16
            r3.<init>(r0, r5)     // Catch:{ all -> 0x0040 }
            int r0 = r3.intValue()     // Catch:{ all -> 0x0040 }
            r3 = 2000(0x7d0, float:2.803E-42)
            r5 = 5000(0x1388, float:7.006E-42)
            r7.mo2951y(r0, r3, r5)     // Catch:{ all -> 0x0040 }
            goto L_0x0041
        L_0x0040:
            r1 = 4
        L_0x0041:
            java.lang.String r0 = "vib"
            int r0 = r6.optInt(r0, r2)
            if (r0 != r2) goto L_0x005d
            java.lang.String r0 = "vib_pt"
            boolean r0 = r6.has(r0)
            if (r0 == 0) goto L_0x005b
            long[] r0 = com.onesignal.OSUtils.m46185R(r6)
            if (r0 == 0) goto L_0x005d
            r7.mo2927L(r0)
            goto L_0x005d
        L_0x005b:
            r1 = r1 | 2
        L_0x005d:
            boolean r0 = m47557E(r6)
            if (r0 == 0) goto L_0x0078
            android.content.Context r0 = f35985d
            r2 = 0
            java.lang.String r3 = "sound"
            java.lang.String r6 = r6.optString(r3, r2)
            android.net.Uri r6 = com.onesignal.OSUtils.m46203n(r0, r6)
            if (r6 == 0) goto L_0x0076
            r7.mo2923H(r6)
            goto L_0x0078
        L_0x0076:
            r1 = r1 | 1
        L_0x0078:
            r7.mo2945r(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8581r.m47561I(org.json.JSONObject, androidx.core.app.l$e):void");
    }

    /* renamed from: J */
    private static void m47562J(Context context) {
        f35985d = context;
        f35986e = context.getPackageName();
        f35984c = f35985d.getResources();
    }

    /* renamed from: K */
    private static void m47563K(RemoteViews remoteViews, JSONObject jSONObject, int i, String str, String str2) {
        Integer H = m47560H(jSONObject, str);
        if (H != null) {
            remoteViews.setTextColor(i, H.intValue());
            return;
        }
        int identifier = f35984c.getIdentifier(str2, "color", f35986e);
        if (identifier != 0) {
            remoteViews.setTextColor(i, C8410f.m46659b(f35985d, identifier));
        }
    }

    /* renamed from: L */
    private static boolean m47564L(C8632v1 v1Var) {
        Notification notification;
        int intValue = v1Var.mo28247a().intValue();
        JSONObject e = v1Var.mo28251e();
        String optString = e.optString("grp", (String) null);
        C8666z zVar = new C8666z(f35985d);
        ArrayList<StatusBarNotification> arrayList = new ArrayList<>();
        if (Build.VERSION.SDK_INT >= 24) {
            arrayList = C8483l3.m47019c(f35985d);
            if (optString == null && arrayList.size() >= 3) {
                optString = C8483l3.m47023g();
                C8483l3.m47018b(f35985d, arrayList);
            }
        }
        C8583b p = m47581p(v1Var);
        C0651l.C0659e eVar = p.f35988a;
        m47567b(e, zVar, eVar, intValue, (String) null);
        try {
            m47566a(e, eVar);
        } catch (Throwable th) {
            C8338d3.m46496b(C8338d3.C8384r0.ERROR, "Could not set background notification image!", th);
        }
        m47569d(v1Var, eVar);
        if (v1Var.mo28260n()) {
            m47558F(eVar);
        }
        C8453h0.m46848a(f35985d, optString != null ? 2 : 1);
        if (optString != null) {
            m47572g(eVar, zVar, e, optString, intValue);
            notification = m47575j(v1Var, eVar);
            if (Build.VERSION.SDK_INT < 24 || !optString.equals(C8483l3.m47023g())) {
                m47577l(v1Var, p);
            } else {
                m47574i(v1Var, zVar, arrayList.size() + 1);
            }
        } else {
            notification = m47573h(eVar, zVar, e, intValue);
        }
        if (optString == null || Build.VERSION.SDK_INT > 17) {
            m47568c(p, notification);
            C0665o.m3094e(f35985d).mo2969g(intValue, notification);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return C8483l3.m47017a(f35985d, notification.getChannelId());
        }
        return true;
    }

    /* renamed from: M */
    static void m47565M(C8632v1 v1Var) {
        m47562J(v1Var.mo28250d());
        m47577l(v1Var, (C8583b) null);
    }

    /* renamed from: a */
    private static void m47566a(JSONObject jSONObject, C0651l.C0659e eVar) throws Throwable {
        JSONObject jSONObject2;
        Bitmap bitmap;
        String str;
        int i = Build.VERSION.SDK_INT;
        if (i < 16 || i >= 31) {
            C8338d3.m46492a(C8338d3.C8384r0.VERBOSE, "Cannot use background images in notifications for device on version: " + i);
            return;
        }
        String optString = jSONObject.optString("bg_img", (String) null);
        if (optString != null) {
            jSONObject2 = new JSONObject(optString);
            bitmap = m47582q(jSONObject2.optString("img", (String) null));
        } else {
            bitmap = null;
            jSONObject2 = null;
        }
        if (bitmap == null) {
            bitmap = m47583r("onesignal_bgimage_default_image");
        }
        if (bitmap != null) {
            RemoteViews remoteViews = new RemoteViews(f35985d.getPackageName(), C8690z3.onesignal_bgimage_notif_layout);
            int i2 = C8665y3.os_bgimage_notif_title;
            remoteViews.setTextViewText(i2, m47554B(jSONObject));
            int i3 = C8665y3.os_bgimage_notif_body;
            remoteViews.setTextViewText(i3, jSONObject.optString("alert"));
            m47563K(remoteViews, jSONObject2, i2, "tc", "onesignal_bgimage_notif_title_color");
            m47563K(remoteViews, jSONObject2, i3, "bc", "onesignal_bgimage_notif_body_color");
            if (jSONObject2 == null || !jSONObject2.has("img_align")) {
                int identifier = f35984c.getIdentifier("onesignal_bgimage_notif_image_align", "string", f35986e);
                str = identifier != 0 ? f35984c.getString(identifier) : null;
            } else {
                str = jSONObject2.getString("img_align");
            }
            if ("right".equals(str)) {
                remoteViews.setViewPadding(C8665y3.os_bgimage_notif_bgimage_align_layout, -5000, 0, 0, 0);
                int i4 = C8665y3.os_bgimage_notif_bgimage_right_aligned;
                remoteViews.setImageViewBitmap(i4, bitmap);
                remoteViews.setViewVisibility(i4, 0);
                remoteViews.setViewVisibility(C8665y3.os_bgimage_notif_bgimage, 2);
            } else {
                remoteViews.setImageViewBitmap(C8665y3.os_bgimage_notif_bgimage, bitmap);
            }
            eVar.mo2941n(remoteViews);
            eVar.mo2924I((C0651l.C0662h) null);
        }
    }

    /* renamed from: b */
    private static void m47567b(JSONObject jSONObject, C8666z zVar, C0651l.C0659e eVar, int i, String str) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("custom"));
            if (jSONObject2.has("a")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("a");
                if (jSONObject3.has("actionButtons")) {
                    JSONArray jSONArray = jSONObject3.getJSONArray("actionButtons");
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                        JSONObject jSONObject4 = new JSONObject(jSONObject.toString());
                        Intent b = zVar.mo28339b(i);
                        b.setAction("" + i2);
                        b.putExtra("action_button", true);
                        jSONObject4.put("actionId", optJSONObject.optString("id"));
                        b.putExtra("onesignalData", jSONObject4.toString());
                        if (str != null) {
                            b.putExtra("summary", str);
                        } else if (jSONObject.has("grp")) {
                            b.putExtra("grp", jSONObject.optString("grp"));
                        }
                        eVar.mo2930a(optJSONObject.has("icon") ? m47591z(optJSONObject.optString("icon")) : 0, optJSONObject.optString("text"), zVar.mo28338a(i, b));
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: c */
    private static void m47568c(C8583b bVar, Notification notification) {
        if (bVar.f35989b) {
            try {
                Object newInstance = Class.forName("android.app.MiuiNotification").newInstance();
                Field declaredField = newInstance.getClass().getDeclaredField("customizedIcon");
                declaredField.setAccessible(true);
                declaredField.set(newInstance, Boolean.TRUE);
                Field field = notification.getClass().getField("extraNotification");
                field.setAccessible(true);
                field.set(notification, newInstance);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: d */
    private static void m47569d(C8632v1 v1Var, C0651l.C0659e eVar) {
        Class<C0651l.C0659e> cls = C0651l.C0659e.class;
        if (v1Var.mo28258l()) {
            try {
                Field declaredField = cls.getDeclaredField("T");
                declaredField.setAccessible(true);
                Notification notification = (Notification) declaredField.get(eVar);
                v1Var.mo28265s(Integer.valueOf(notification.flags));
                v1Var.mo28266t(notification.sound);
                eVar.mo2933d(v1Var.mo28252f().mo28136s());
                Notification notification2 = (Notification) declaredField.get(eVar);
                Field declaredField2 = cls.getDeclaredField("f");
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("e");
                declaredField3.setAccessible(true);
                v1Var.mo28268u((CharSequence) declaredField2.get(eVar));
                v1Var.mo28271x((CharSequence) declaredField3.get(eVar));
                if (!v1Var.mo28260n()) {
                    v1Var.mo28269v(Integer.valueOf(notification2.flags));
                    v1Var.mo28270w(notification2.sound);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: e */
    private static int m47570e(int i) {
        if (i > 9) {
            return 2;
        }
        if (i > 7) {
            return 1;
        }
        if (i > 4) {
            return 0;
        }
        return i > 2 ? -1 : -2;
    }

    /* renamed from: f */
    private static Intent m47571f(int i, C8666z zVar, JSONObject jSONObject, String str) {
        return zVar.mo28339b(i).putExtra("onesignalData", jSONObject.toString()).putExtra("summary", str);
    }

    /* renamed from: g */
    private static void m47572g(C0651l.C0659e eVar, C8666z zVar, JSONObject jSONObject, String str, int i) {
        SecureRandom secureRandom = new SecureRandom();
        eVar.mo2942o(zVar.mo28338a(secureRandom.nextInt(), zVar.mo28339b(i).putExtra("onesignalData", jSONObject.toString()).putExtra("grp", str)));
        eVar.mo2946s(m47590y(secureRandom.nextInt(), m47589x(i).putExtra("grp", str)));
        eVar.mo2947u(str);
        try {
            eVar.mo2948v(f35987f.intValue());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: h */
    private static Notification m47573h(C0651l.C0659e eVar, C8666z zVar, JSONObject jSONObject, int i) {
        SecureRandom secureRandom = new SecureRandom();
        eVar.mo2942o(zVar.mo28338a(secureRandom.nextInt(), zVar.mo28339b(i).putExtra("onesignalData", jSONObject.toString())));
        eVar.mo2946s(m47590y(secureRandom.nextInt(), m47589x(i)));
        return eVar.mo2932c();
    }

    /* renamed from: i */
    private static void m47574i(C8632v1 v1Var, C8666z zVar, int i) {
        JSONObject e = v1Var.mo28251e();
        SecureRandom secureRandom = new SecureRandom();
        String g = C8483l3.m47023g();
        String str = i + " new messages";
        int f = C8483l3.m47022f();
        PendingIntent a = zVar.mo28338a(secureRandom.nextInt(), m47571f(f, zVar, e, g));
        PendingIntent y = m47590y(secureRandom.nextInt(), m47589x(0).putExtra("summary", g));
        C0651l.C0659e eVar = m47581p(v1Var).f35988a;
        if (v1Var.mo28255i() != null) {
            eVar.mo2923H(v1Var.mo28255i());
        }
        if (v1Var.mo28254h() != null) {
            eVar.mo2945r(v1Var.mo28254h().intValue());
        }
        eVar.mo2942o(a).mo2946s(y).mo2944q(f35985d.getPackageManager().getApplicationLabel(f35985d.getApplicationInfo())).mo2943p(str).mo2916A(i).mo2922G(m47586u()).mo2950x(m47585t()).mo2918C(true).mo2938k(false).mo2947u(g).mo2949w(true);
        try {
            eVar.mo2948v(f35987f.intValue());
        } catch (Throwable unused) {
        }
        C0651l.C0661g gVar = new C0651l.C0661g();
        gVar.mo2955n(str);
        eVar.mo2924I(gVar);
        C0665o.m3094e(f35985d).mo2969g(f, eVar.mo2932c());
    }

    /* renamed from: j */
    private static Notification m47575j(C8632v1 v1Var, C0651l.C0659e eVar) {
        int i = Build.VERSION.SDK_INT;
        boolean z = i > 17 && i < 24 && !v1Var.mo28260n();
        if (z && v1Var.mo28255i() != null && !v1Var.mo28255i().equals(v1Var.mo28253g())) {
            eVar.mo2923H((Uri) null);
        }
        Notification c = eVar.mo2932c();
        if (z) {
            eVar.mo2923H(v1Var.mo28255i());
        }
        return c;
    }

    /* renamed from: k */
    private static void m47576k(C8475k3 k3Var, String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("android_notification_id", Integer.valueOf(i));
        contentValues.put("group_id", str);
        contentValues.put("is_summary", 1);
        k3Var.mo27904t("notification", (String) null, contentValues);
    }

    /* renamed from: l */
    private static void m47577l(C8632v1 v1Var, C8583b bVar) {
        String str;
        String str2;
        Integer num;
        ArrayList<SpannableString> arrayList;
        JSONObject jSONObject;
        Notification notification;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        C8583b bVar2 = bVar;
        String str8 = "message";
        String str9 = "title";
        String str10 = "is_summary";
        boolean n = v1Var.mo28260n();
        JSONObject e = v1Var.mo28251e();
        C8666z zVar = new C8666z(f35985d);
        Cursor cursor = null;
        String optString = e.optString("grp", (String) null);
        SecureRandom secureRandom = new SecureRandom();
        PendingIntent y = m47590y(secureRandom.nextInt(), m47589x(0).putExtra("summary", optString));
        C8475k3 n2 = C8475k3.m46963n(f35985d);
        try {
            String[] strArr = {"android_notification_id", "full_data", str10, str9, str8};
            JSONObject jSONObject2 = e;
            try {
                String[] strArr2 = {optString};
                if (!n) {
                    try {
                        str = "group_id = ? AND dismissed = 0 AND opened = 0" + " AND android_notification_id <> " + v1Var.mo28247a();
                    } catch (Throwable th) {
                        th = th;
                        cursor = null;
                        cursor.close();
                        throw th;
                    }
                } else {
                    str = "group_id = ? AND dismissed = 0 AND opened = 0";
                }
                Cursor f = n2.mo27885f("notification", strArr, str, strArr2, (String) null, (String) null, "_id DESC");
                try {
                    str2 = "";
                    if (f.moveToFirst()) {
                        arrayList = new ArrayList<>();
                        String str11 = null;
                        num = null;
                        while (true) {
                            String str12 = str10;
                            if (f.getInt(f.getColumnIndex(str10)) == 1) {
                                num = Integer.valueOf(f.getInt(f.getColumnIndex("android_notification_id")));
                                str5 = str8;
                                str6 = str9;
                            } else {
                                String string = f.getString(f.getColumnIndex(str9));
                                if (string == null) {
                                    str4 = str2;
                                } else {
                                    str4 = string + " ";
                                }
                                str5 = str8;
                                str6 = str9;
                                SpannableString spannableString = new SpannableString(str4 + f.getString(f.getColumnIndex(str8)));
                                if (str4.length() > 0) {
                                    spannableString.setSpan(new StyleSpan(1), 0, str4.length(), 0);
                                }
                                arrayList.add(spannableString);
                                if (str11 == null) {
                                    str11 = f.getString(f.getColumnIndex("full_data"));
                                }
                            }
                            str7 = str11;
                            if (!f.moveToNext()) {
                                break;
                            }
                            C8583b bVar3 = bVar;
                            str11 = str7;
                            str10 = str12;
                            str8 = str5;
                            str9 = str6;
                        }
                        if (n && str7 != null) {
                            jSONObject = new JSONObject(str7);
                        }
                        jSONObject = jSONObject2;
                    } else {
                        jSONObject = jSONObject2;
                        arrayList = null;
                        num = null;
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                } catch (Throwable th2) {
                    th = th2;
                    cursor = f;
                    cursor.close();
                    throw th;
                }
                if (!f.isClosed()) {
                    f.close();
                }
                if (num == null) {
                    num = Integer.valueOf(secureRandom.nextInt());
                    m47576k(n2, optString, num.intValue());
                }
                PendingIntent a = zVar.mo28338a(secureRandom.nextInt(), m47571f(num.intValue(), zVar, jSONObject, optString));
                if (arrayList == null || ((!n || arrayList.size() <= 1) && (n || arrayList.size() <= 0))) {
                    C8583b bVar4 = bVar;
                    C0651l.C0659e eVar = bVar4.f35988a;
                    eVar.f2117b.clear();
                    m47567b(jSONObject, zVar, eVar, num.intValue(), optString);
                    eVar.mo2942o(a).mo2946s(y).mo2918C(n).mo2938k(false).mo2947u(optString).mo2949w(true);
                    try {
                        eVar.mo2948v(f35987f.intValue());
                    } catch (Throwable unused) {
                    }
                    notification = eVar.mo2932c();
                    m47568c(bVar4, notification);
                } else {
                    int size = arrayList.size() + (n ^ true ? 1 : 0);
                    String optString2 = jSONObject.optString("grp_msg", (String) null);
                    if (optString2 == null) {
                        str3 = size + " new messages";
                    } else {
                        str3 = optString2.replace("$[notif_count]", str2 + size);
                    }
                    C0651l.C0659e eVar2 = m47581p(v1Var).f35988a;
                    if (n) {
                        m47558F(eVar2);
                    } else {
                        if (v1Var.mo28255i() != null) {
                            eVar2.mo2923H(v1Var.mo28255i());
                        }
                        if (v1Var.mo28254h() != null) {
                            eVar2.mo2945r(v1Var.mo28254h().intValue());
                        }
                    }
                    eVar2.mo2942o(a).mo2946s(y).mo2944q(f35985d.getPackageManager().getApplicationLabel(f35985d.getApplicationInfo())).mo2943p(str3).mo2916A(size).mo2922G(m47586u()).mo2950x(m47585t()).mo2918C(n).mo2938k(false).mo2947u(optString).mo2949w(true);
                    try {
                        eVar2.mo2948v(f35987f.intValue());
                    } catch (Throwable unused2) {
                    }
                    if (!n) {
                        eVar2.mo2926K(str3);
                    }
                    C0651l.C0661g gVar = new C0651l.C0661g();
                    if (!n) {
                        String charSequence = v1Var.mo28257k() != null ? v1Var.mo28257k().toString() : null;
                        if (charSequence != null) {
                            str2 = charSequence + " ";
                        }
                        SpannableString spannableString2 = new SpannableString(str2 + v1Var.mo28249c().toString());
                        if (str2.length() > 0) {
                            spannableString2.setSpan(new StyleSpan(1), 0, str2.length(), 0);
                        }
                        gVar.mo2954m(spannableString2);
                    }
                    for (SpannableString m : arrayList) {
                        gVar.mo2954m(m);
                    }
                    gVar.mo2955n(str3);
                    eVar2.mo2924I(gVar);
                    notification = eVar2.mo2932c();
                }
                C0665o.m3094e(f35985d).mo2969g(num.intValue(), notification);
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
                cursor.close();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: m */
    static boolean m47578m(C8632v1 v1Var) {
        m47562J(v1Var.mo28250d());
        return m47564L(v1Var);
    }

    /* renamed from: n */
    static boolean m47579n(C8632v1 v1Var) {
        m47562J(v1Var.mo28250d());
        m47556D();
        m47555C();
        return m47564L(v1Var);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|(2:4|5)|6|7|(2:9|10)|11|12|(2:14|15)|16) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0025 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0015 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f A[Catch:{ all -> 0x0025 }] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.math.BigInteger m47580o(org.json.JSONObject r4) {
        /*
            java.lang.String r0 = "bgac"
            r1 = 16
            r2 = 0
            boolean r3 = r4.has(r0)     // Catch:{ all -> 0x0015 }
            if (r3 == 0) goto L_0x0015
            java.math.BigInteger r3 = new java.math.BigInteger     // Catch:{ all -> 0x0015 }
            java.lang.String r4 = r4.optString(r0, r2)     // Catch:{ all -> 0x0015 }
            r3.<init>(r4, r1)     // Catch:{ all -> 0x0015 }
            return r3
        L_0x0015:
            android.content.Context r4 = com.onesignal.C8338d3.f35438f     // Catch:{ all -> 0x0025 }
            java.lang.String r0 = "onesignal_notification_accent_color"
            java.lang.String r4 = com.onesignal.OSUtils.m46200k(r4, r0, r2)     // Catch:{ all -> 0x0025 }
            if (r4 == 0) goto L_0x0025
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch:{ all -> 0x0025 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x0025 }
            return r0
        L_0x0025:
            android.content.Context r4 = com.onesignal.C8338d3.f35438f     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = "com.onesignal.NotificationAccentColor.DEFAULT"
            java.lang.String r4 = com.onesignal.OSUtils.m46196f(r4, r0)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x0035
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch:{ all -> 0x0035 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x0035 }
            return r0
        L_0x0035:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8581r.m47580o(org.json.JSONObject):java.math.BigInteger");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(19:0|(2:1|2)|5|(1:9)|10|11|(1:13)|14|15|(1:17)(1:18)|19|21|(1:23)|24|(1:26)|27|(2:29|30)|31|33) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x006e */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0074 A[Catch:{ all -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007d A[Catch:{ all -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b0 A[SYNTHETIC, Splitter:B:29:0x00b0] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.onesignal.C8581r.C8583b m47581p(com.onesignal.C8632v1 r9) {
        /*
            java.lang.String r0 = "vis"
            org.json.JSONObject r1 = r9.mo28251e()
            com.onesignal.r$b r2 = new com.onesignal.r$b
            r3 = 0
            r2.<init>()
            java.lang.String r4 = com.onesignal.C8447g0.m46811c(r9)     // Catch:{ all -> 0x0018 }
            androidx.core.app.l$e r5 = new androidx.core.app.l$e     // Catch:{ all -> 0x0018 }
            android.content.Context r6 = f35985d     // Catch:{ all -> 0x0018 }
            r5.<init>(r6, r4)     // Catch:{ all -> 0x0018 }
            goto L_0x001f
        L_0x0018:
            androidx.core.app.l$e r5 = new androidx.core.app.l$e
            android.content.Context r4 = f35985d
            r5.<init>(r4)
        L_0x001f:
            java.lang.String r4 = "alert"
            java.lang.String r4 = r1.optString(r4, r3)
            r6 = 1
            androidx.core.app.l$e r7 = r5.mo2938k(r6)
            int r8 = m47553A(r1)
            androidx.core.app.l$e r7 = r7.mo2922G(r8)
            androidx.core.app.l$c r8 = new androidx.core.app.l$c
            r8.<init>()
            androidx.core.app.l$c r8 = r8.mo2915m(r4)
            androidx.core.app.l$e r7 = r7.mo2924I(r8)
            androidx.core.app.l$e r7 = r7.mo2943p(r4)
            r7.mo2926K(r4)
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 24
            if (r7 < r8) goto L_0x005a
            java.lang.String r7 = "title"
            java.lang.String r7 = r1.optString(r7)
            java.lang.String r8 = ""
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0061
        L_0x005a:
            java.lang.CharSequence r7 = m47554B(r1)
            r5.mo2944q(r7)
        L_0x0061:
            java.math.BigInteger r7 = m47580o(r1)     // Catch:{ all -> 0x006e }
            if (r7 == 0) goto L_0x006e
            int r7 = r7.intValue()     // Catch:{ all -> 0x006e }
            r5.mo2940m(r7)     // Catch:{ all -> 0x006e }
        L_0x006e:
            boolean r7 = r1.has(r0)     // Catch:{ all -> 0x0082 }
            if (r7 == 0) goto L_0x007d
            java.lang.String r0 = r1.optString(r0)     // Catch:{ all -> 0x0082 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0082 }
            goto L_0x007e
        L_0x007d:
            r0 = 1
        L_0x007e:
            r5.mo2928M(r0)     // Catch:{ all -> 0x0082 }
            goto L_0x0083
        L_0x0082:
        L_0x0083:
            android.graphics.Bitmap r0 = m47588w(r1)
            if (r0 == 0) goto L_0x008e
            r2.f35989b = r6
            r5.mo2950x(r0)
        L_0x008e:
            java.lang.String r0 = "bicon"
            java.lang.String r0 = r1.optString(r0, r3)
            android.graphics.Bitmap r0 = m47582q(r0)
            if (r0 == 0) goto L_0x00aa
            androidx.core.app.l$b r3 = new androidx.core.app.l$b
            r3.<init>()
            androidx.core.app.l$b r0 = r3.mo2912n(r0)
            androidx.core.app.l$b r0 = r0.mo2913o(r4)
            r5.mo2924I(r0)
        L_0x00aa:
            java.lang.Long r0 = r9.mo28256j()
            if (r0 == 0) goto L_0x00bf
            java.lang.Long r9 = r9.mo28256j()     // Catch:{ all -> 0x00bf }
            long r3 = r9.longValue()     // Catch:{ all -> 0x00bf }
            r6 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r6
            r5.mo2929N(r3)     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            m47561I(r1, r5)
            r2.f35988a = r5
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8581r.m47581p(com.onesignal.v1):com.onesignal.r$b");
    }

    /* renamed from: q */
    private static Bitmap m47582q(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.startsWith("http://") || trim.startsWith("https://")) {
            return m47584s(trim);
        }
        return m47583r(str);
    }

    /* renamed from: r */
    private static Bitmap m47583r(String str) {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeStream(f35985d.getAssets().open(str));
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap != null) {
            return bitmap;
        }
        try {
            for (String str2 : Arrays.asList(new String[]{".png", ".webp", ".jpg", ".gif", ".bmp"})) {
                try {
                    bitmap = BitmapFactory.decodeStream(f35985d.getAssets().open(str + str2));
                    continue;
                } catch (Throwable unused2) {
                }
                if (bitmap != null) {
                    return bitmap;
                }
            }
            int z = m47591z(str);
            if (z != 0) {
                return BitmapFactory.decodeResource(f35984c, z);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    /* renamed from: s */
    private static Bitmap m47584s(String str) {
        try {
            return BitmapFactory.decodeStream(new URL(str).openConnection().getInputStream());
        } catch (Throwable th) {
            C8338d3.m46496b(C8338d3.C8384r0.WARN, "Could not download image!", th);
            return null;
        }
    }

    /* renamed from: t */
    private static Bitmap m47585t() {
        return m47559G(m47583r("ic_onesignal_large_icon_default"));
    }

    /* renamed from: u */
    private static int m47586u() {
        int v = m47587v("ic_stat_onesignal_default");
        if (v != 0) {
            return v;
        }
        int v2 = m47587v("corona_statusbar_icon_default");
        if (v2 != 0) {
            return v2;
        }
        int v3 = m47587v("ic_os_notification_fallback_white_24dp");
        if (v3 != 0) {
            return v3;
        }
        return 17301598;
    }

    /* renamed from: v */
    private static int m47587v(String str) {
        return f35984c.getIdentifier(str, "drawable", f35986e);
    }

    /* renamed from: w */
    private static Bitmap m47588w(JSONObject jSONObject) {
        Bitmap q = m47582q(jSONObject.optString("licon"));
        if (q == null) {
            q = m47583r("ic_onesignal_large_icon_default");
        }
        if (q == null) {
            return null;
        }
        return m47559G(q);
    }

    /* renamed from: x */
    private static Intent m47589x(int i) {
        return new Intent(f35985d, f35983b).putExtra("androidNotificationId", i).putExtra("dismissed", true);
    }

    /* renamed from: y */
    private static PendingIntent m47590y(int i, Intent intent) {
        return PendingIntent.getBroadcast(f35985d, i, intent, 201326592);
    }

    /* renamed from: z */
    private static int m47591z(String str) {
        if (str == null) {
            return 0;
        }
        String trim = str.trim();
        if (!OSUtils.m46178K(trim)) {
            return 0;
        }
        int v = m47587v(trim);
        if (v != 0) {
            return v;
        }
        try {
            return R.drawable.class.getField(str).getInt((Object) null);
        } catch (Throwable unused) {
            return 0;
        }
    }
}
