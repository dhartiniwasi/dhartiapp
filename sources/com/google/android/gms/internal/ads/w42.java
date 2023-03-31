package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import androidx.browser.customtabs.C0576b;
import androidx.core.app.C0651l;
import com.google.android.gms.ads.AdService;
import java.util.HashMap;
import java.util.Map;
import p039e4.C4239b;
import p053g4.C4409t;
import p060h4.C4596v;
import p066i4.C4678r;
import p073j4.C4751b2;
import p073j4.C4811t0;
import p088l5.C4954a;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class w42 extends se0 {

    /* renamed from: a */
    private final Context f19472a;

    /* renamed from: b */
    private final gv1 f19473b;

    /* renamed from: c */
    private final um0 f19474c;

    /* renamed from: d */
    private final o42 f19475d;

    /* renamed from: e */
    private final ux2 f19476e;

    public w42(Context context, o42 o42, um0 um0, gv1 gv1, ux2 ux2) {
        this.f19472a = context;
        this.f19473b = gv1;
        this.f19474c = um0;
        this.f19475d = o42;
        this.f19476e = ux2;
    }

    /* renamed from: J6 */
    public static void m22575J6(Context context, gv1 gv1, ux2 ux2, o42 o42, String str, String str2) {
        m22576K6(context, gv1, ux2, o42, str, str2, new HashMap());
    }

    /* renamed from: K6 */
    public static void m22576K6(Context context, gv1 gv1, ux2 ux2, o42 o42, String str, String str2, Map map) {
        String str3;
        String str4 = "offline";
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14685s7)).booleanValue()) {
            tx2 b = tx2.m21328b(str2);
            b.mo14409a("gqi", str);
            if (true == C4409t.m29325q().mo15128v(context)) {
                str4 = C0576b.ONLINE_EXTRAS_KEY;
            }
            b.mo14409a("device_connectivity", str4);
            b.mo14409a("event_timestamp", String.valueOf(C4409t.m29310b().mo18370a()));
            for (Map.Entry entry : map.entrySet()) {
                b.mo14409a((String) entry.getKey(), (String) entry.getValue());
            }
            str3 = ux2.mo8623b(b);
        } else {
            fv1 a = gv1.mo10653a();
            a.mo10303b("gqi", str);
            a.mo10303b("action", str2);
            if (true == C4409t.m29325q().mo15128v(context)) {
                str4 = C0576b.ONLINE_EXTRAS_KEY;
            }
            a.mo10303b("device_connectivity", str4);
            a.mo10303b("event_timestamp", String.valueOf(C4409t.m29310b().mo18370a()));
            for (Map.Entry entry2 : map.entrySet()) {
                a.mo10303b((String) entry2.getKey(), (String) entry2.getValue());
            }
            str3 = a.mo10307f();
        }
        o42.mo12822g(new q42(C4409t.m29310b().mo18370a(), str, str3, 2));
    }

    /* renamed from: L6 */
    public static void m22577L6(Activity activity, C4678r rVar, C4811t0 t0Var, o42 o42, gv1 gv1, ux2 ux2, String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        C4409t.m29326r();
        AlertDialog.Builder g = C4751b2.m30612g(activity);
        Resources d = C4409t.m29325q().mo15114d();
        if (d == null) {
            str3 = "Open ad when you're back online.";
        } else {
            str3 = d.getString(C4239b.f23604g);
        }
        AlertDialog.Builder title = g.setTitle(str3);
        if (d == null) {
            str4 = "We'll send you a notification with a link to the advertiser site.";
        } else {
            str4 = d.getString(C4239b.f23603f);
        }
        AlertDialog.Builder message = title.setMessage(str4);
        if (d == null) {
            str5 = "OK";
        } else {
            str5 = d.getString(C4239b.f23600c);
        }
        AlertDialog.Builder positiveButton = message.setPositiveButton(str5, new s42(gv1, activity, ux2, o42, str, t0Var, str2, d, rVar));
        if (d == null) {
            str6 = "No thanks";
        } else {
            str6 = d.getString(C4239b.f23602e);
        }
        positiveButton.setNegativeButton(str6, new t42(o42, str, gv1, activity, ux2, rVar)).setOnCancelListener(new u42(o42, str, gv1, activity, ux2, rVar));
        g.create().show();
    }

    /* renamed from: M6 */
    private final void m22578M6(String str, String str2, Map map) {
        m22576K6(this.f19472a, this.f19473b, this.f19476e, this.f19475d, str, str2, map);
    }

    /* renamed from: T */
    public final void mo13784T() {
        this.f19475d.mo12823h(new k42(this.f19474c));
    }

    /* renamed from: T0 */
    public final void mo13785T0(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            boolean v = C4409t.m29325q().mo15128v(this.f19472a);
            HashMap hashMap = new HashMap();
            char c = 2;
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                if (true == v) {
                    c = 1;
                }
                hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Context context = this.f19472a;
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    context.startActivity(launchIntentForPackage);
                    hashMap.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    hashMap.put("olaa", "olaf");
                }
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
            }
            m22578M6(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.f19475d.getWritableDatabase();
                if (c == 1) {
                    this.f19475d.mo12824n(writableDatabase, this.f19474c, stringExtra2);
                } else {
                    o42.m17494q(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e) {
                pm0.m18664d("Failed to get writable offline buffering database: ".concat(e.toString()));
            }
        }
    }

    /* renamed from: v2 */
    public final void mo13786v2(C4954a aVar, String str, String str2) {
        String str3;
        String str4;
        Context context = (Context) C4956b.m31384P0(aVar);
        C4409t.m29327s().mo18424f(context);
        Intent intent = new Intent();
        intent.setClass(context, AdService.class);
        intent.setAction("offline_notification_clicked");
        intent.putExtra("offline_notification_action", "offline_notification_clicked");
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str);
        int i = g53.f9707a;
        PendingIntent a = g53.m13044a(context, 0, intent, i | 1073741824, 0);
        Intent intent2 = new Intent();
        intent2.setClass(context, AdService.class);
        intent2.setAction("offline_notification_dismissed");
        intent2.putExtra("offline_notification_action", "offline_notification_dismissed");
        intent2.putExtra("gws_query_id", str2);
        PendingIntent a2 = g53.m13044a(context, 0, intent2, i | 1073741824, 0);
        Resources d = C4409t.m29325q().mo15114d();
        C0651l.C0659e eVar = new C0651l.C0659e(context, "offline_notification_channel");
        if (d == null) {
            str3 = "View the ad you saved when you were offline";
        } else {
            str3 = d.getString(C4239b.f23599b);
        }
        C0651l.C0659e q = eVar.mo2944q(str3);
        if (d == null) {
            str4 = "Tap to open ad";
        } else {
            str4 = d.getString(C4239b.f23598a);
        }
        ((NotificationManager) context.getSystemService("notification")).notify(str2, 54321, q.mo2943p(str4).mo2938k(true).mo2946s(a2).mo2942o(a).mo2922G(context.getApplicationInfo().icon).mo2932c());
        m22578M6(str2, "offline_notification_impression", new HashMap());
    }
}
