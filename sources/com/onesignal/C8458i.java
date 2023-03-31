package com.onesignal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.onesignal.C8338d3;
import p287la.C11779b;
import p287la.C11780c;

/* renamed from: com.onesignal.i */
/* compiled from: BadgeCountUpdater */
class C8458i {

    /* renamed from: a */
    private static int f35661a = -1;

    /* renamed from: a */
    private static boolean m46861a(Context context) {
        int i = f35661a;
        if (i != -1) {
            return i == 1;
        }
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                f35661a = "DISABLE".equals(bundle.getString("com.onesignal.BadgeCount")) ? 0 : 1;
            } else {
                f35661a = 1;
            }
        } catch (PackageManager.NameNotFoundException e) {
            f35661a = 0;
            C8338d3.m46496b(C8338d3.C8384r0.ERROR, "Error reading meta-data tag 'com.onesignal.BadgeCount'. Disabling badge setting.", e);
        }
        if (f35661a == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m46862b(Context context) {
        return m46861a(context) && OSUtils.m46194a(context);
    }

    /* renamed from: c */
    static void m46863c(C8469j3 j3Var, Context context) {
        if (m46862b(context)) {
            if (Build.VERSION.SDK_INT >= 23) {
                m46866f(context);
            } else {
                m46865e(j3Var, context);
            }
        }
    }

    /* renamed from: d */
    static void m46864d(int i, Context context) {
        if (m46861a(context)) {
            try {
                C11780c.m57113a(context, i);
            } catch (C11779b unused) {
            }
        }
    }

    /* renamed from: e */
    private static void m46865e(C8469j3 j3Var, Context context) {
        Cursor b = j3Var.mo27884b("notification", (String[]) null, C8475k3.m46967x().toString(), (String[]) null, (String) null, (String) null, (String) null, C8453h0.f35657a);
        int count = b.getCount();
        b.close();
        m46864d(count, context);
    }

    /* renamed from: f */
    private static void m46866f(Context context) {
        int i = 0;
        for (StatusBarNotification f : C8483l3.m47020d(context)) {
            if (!C8453h0.m46853f(f)) {
                i++;
            }
        }
        m46864d(i, context);
    }
}
