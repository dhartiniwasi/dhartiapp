package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import p287la.C11778a;
import p287la.C11779b;

public class ZukHomeBadger implements C11778a {

    /* renamed from: a */
    private final Uri f36031a = Uri.parse("content://com.android.badge/badge");

    /* renamed from: a */
    public List<String> mo28204a() {
        return Collections.singletonList("com.zui.launcher");
    }

    /* renamed from: b */
    public void mo28205b(Context context, ComponentName componentName, int i) throws C11779b {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        context.getContentResolver().call(this.f36031a, "setAppBadgeCount", (String) null, bundle);
    }
}
