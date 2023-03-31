package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import p287la.C11778a;
import p287la.C11779b;
import p296ma.C11875a;

public class AdwHomeBadger implements C11778a {
    /* renamed from: a */
    public List<String> mo28204a() {
        return Arrays.asList(new String[]{"org.adw.launcher", "org.adwfreak.launcher"});
    }

    /* renamed from: b */
    public void mo28205b(Context context, ComponentName componentName, int i) throws C11779b {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", componentName.getPackageName());
        intent.putExtra("CNAME", componentName.getClassName());
        intent.putExtra("COUNT", i);
        if (C11875a.m57372a(context, intent)) {
            context.sendBroadcast(intent);
            return;
        }
        throw new C11779b("unable to resolve intent: " + intent.toString());
    }
}
