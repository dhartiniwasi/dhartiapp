package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import p287la.C11778a;
import p287la.C11779b;
import p296ma.C11875a;

@Deprecated
public class LGHomeBadger implements C11778a {
    /* renamed from: a */
    public List<String> mo28204a() {
        return Arrays.asList(new String[]{"com.lge.launcher", "com.lge.launcher2"});
    }

    /* renamed from: b */
    public void mo28205b(Context context, ComponentName componentName, int i) throws C11779b {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        if (C11875a.m57372a(context, intent)) {
            context.sendBroadcast(intent);
            return;
        }
        throw new C11779b("unable to resolve intent: " + intent.toString());
    }
}
