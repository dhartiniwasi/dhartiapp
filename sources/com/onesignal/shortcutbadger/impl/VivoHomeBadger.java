package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import p287la.C11778a;
import p287la.C11779b;

public class VivoHomeBadger implements C11778a {
    /* renamed from: a */
    public List<String> mo28204a() {
        return Arrays.asList(new String[]{"com.vivo.launcher"});
    }

    /* renamed from: b */
    public void mo28205b(Context context, ComponentName componentName, int i) throws C11779b {
        Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        intent.putExtra("packageName", context.getPackageName());
        intent.putExtra("className", componentName.getClassName());
        intent.putExtra("notificationNum", i);
        context.sendBroadcast(intent);
    }
}
