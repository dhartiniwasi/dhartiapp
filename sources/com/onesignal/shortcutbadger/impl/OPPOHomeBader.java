package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import p287la.C11778a;
import p287la.C11779b;
import p296ma.C11875a;

public class OPPOHomeBader implements C11778a {

    /* renamed from: a */
    private int f36024a = -1;

    /* renamed from: c */
    private void m47680c(Context context, ComponentName componentName, int i) throws C11779b {
        if (i == 0) {
            i = -1;
        }
        Intent intent = new Intent("com.oppo.unsettledevent");
        intent.putExtra("pakeageName", componentName.getPackageName());
        intent.putExtra("number", i);
        intent.putExtra("upgradeNumber", i);
        C11875a.m57374c(context, intent);
    }

    /* renamed from: d */
    private void m47681d(Context context, int i) throws C11779b {
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("app_badge_count", i);
            context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
        } catch (Throwable unused) {
            throw new C11779b("Unable to execute Badge By Content Provider");
        }
    }

    /* renamed from: a */
    public List<String> mo28204a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    /* renamed from: b */
    public void mo28205b(Context context, ComponentName componentName, int i) throws C11779b {
        if (this.f36024a != i) {
            this.f36024a = i;
            if (Build.VERSION.SDK_INT >= 11) {
                m47681d(context, i);
            } else {
                m47680c(context, componentName, i);
            }
        }
    }
}
