package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import p053g4.C4409t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zw1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ kx1 f21501a;

    /* renamed from: b */
    public final /* synthetic */ in0 f21502b;

    public /* synthetic */ zw1(kx1 kx1, in0 in0) {
        this.f21501a = kx1;
        this.f21502b = in0;
    }

    public final void run() {
        in0 in0 = this.f21502b;
        String c = C4409t.m29325q().mo15117h().mo18486U().mo13843c();
        if (!TextUtils.isEmpty(c)) {
            in0.mo11172d(c);
        } else {
            in0.mo11173e(new Exception());
        }
    }
}
