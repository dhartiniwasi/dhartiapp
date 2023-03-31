package com.startapp;

import android.content.Context;
import android.os.Build;

/* renamed from: com.startapp.d8 */
/* compiled from: Sta */
public class C8913d8 {
    /* renamed from: a */
    public static boolean m48515a(Context context) {
        if (Build.VERSION.SDK_INT < 16 || context.checkCallingOrSelfPermission("android.permission.READ_CALL_LOG") == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m48516b(Context context) {
        return context.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0;
    }
}
