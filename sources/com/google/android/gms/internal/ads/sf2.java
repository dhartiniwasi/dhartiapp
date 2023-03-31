package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class sf2 implements tj2 {

    /* renamed from: a */
    private final mf3 f17454a;

    /* renamed from: b */
    private final Context f17455b;

    sf2(mf3 mf3, Context context) {
        this.f17454a = mf3;
        this.f17455b = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ tf2 mo13994a() throws Exception {
        Intent intent;
        double d;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14291E8)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            intent = this.f17455b.registerReceiver((BroadcastReceiver) null, intentFilter);
        } else {
            intent = this.f17455b.registerReceiver((BroadcastReceiver) null, intentFilter, 4);
        }
        boolean z = false;
        if (intent != null) {
            int intExtra = intent.getIntExtra("status", -1);
            d = ((double) intent.getIntExtra("level", -1)) / ((double) intent.getIntExtra("scale", -1));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
        } else {
            d = -1.0d;
        }
        return new tf2(d, z);
    }

    /* renamed from: d */
    public final lf3 mo8340d() {
        return this.f17454a.mo12324a(new rf2(this));
    }

    public final int zza() {
        return 14;
    }
}
