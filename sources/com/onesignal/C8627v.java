package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import p180z4.C6368e;

/* renamed from: com.onesignal.v */
/* compiled from: GooglePlayServicesUpgradePrompt */
class C8627v {

    /* renamed from: com.onesignal.v$a */
    /* compiled from: GooglePlayServicesUpgradePrompt */
    class C8628a implements Runnable {

        /* renamed from: com.onesignal.v$a$a */
        /* compiled from: GooglePlayServicesUpgradePrompt */
        class C8629a implements DialogInterface.OnClickListener {
            C8629a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C8500m3.m47111j(C8500m3.f35731a, "GT_DO_NOT_SHOW_MISSING_GPS", true);
            }
        }

        /* renamed from: com.onesignal.v$a$b */
        /* compiled from: GooglePlayServicesUpgradePrompt */
        class C8630b implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ Activity f36074a;

            C8630b(Activity activity) {
                this.f36074a = activity;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C8627v.m47758a(this.f36074a);
            }
        }

        C8628a() {
        }

        public void run() {
            Activity Y = C8338d3.m46486Y();
            if (Y != null) {
                String k = OSUtils.m46200k(Y, "onesignal_gms_missing_alert_text", "To receive push notifications please press 'Update' to enable 'Google Play services'.");
                String k2 = OSUtils.m46200k(Y, "onesignal_gms_missing_alert_button_update", "Update");
                String k3 = OSUtils.m46200k(Y, "onesignal_gms_missing_alert_button_skip", "Skip");
                new AlertDialog.Builder(Y).setMessage(k).setPositiveButton(k2, new C8630b(Y)).setNegativeButton(k3, new C8629a()).setNeutralButton(OSUtils.m46200k(Y, "onesignal_gms_missing_alert_button_close", "Close"), (DialogInterface.OnClickListener) null).create().show();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m47758a(Activity activity) {
        try {
            C6368e q = C6368e.m37415q();
            PendingIntent e = q.mo21774e(activity, q.mo21776i(C8338d3.f35438f), 9000);
            if (e != null) {
                e.send();
            }
        } catch (PendingIntent.CanceledException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: c */
    private static boolean m47760c() {
        try {
            PackageManager packageManager = C8338d3.f35438f.getPackageManager();
            return !((String) packageManager.getPackageInfo("com.google.android.gms", 128).applicationInfo.loadLabel(packageManager)).equals("Market");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: d */
    static void m47761d() {
        if (OSUtils.m46169B() && m47760c() && !C8338d3.m46517g0() && !C8500m3.m47103b(C8500m3.f35731a, "GT_DO_NOT_SHOW_MISSING_GPS", false)) {
            OSUtils.m46187T(new C8628a());
        }
    }
}
