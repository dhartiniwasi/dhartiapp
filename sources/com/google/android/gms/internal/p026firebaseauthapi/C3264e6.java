package com.google.android.gms.internal.p026firebaseauthapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.content.C0681a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.e6 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3264e6 extends C0681a {
    @Deprecated
    /* renamed from: o */
    public static Intent m25469o(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (!C3125a.m24975a()) {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, true != C3125a.m24975a() ? 0 : 2);
    }
}
