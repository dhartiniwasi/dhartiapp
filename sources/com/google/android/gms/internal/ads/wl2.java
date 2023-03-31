package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class wl2 implements tj2 {

    /* renamed from: a */
    final ScheduledExecutorService f19710a;

    /* renamed from: b */
    final Context f19711b;

    /* renamed from: c */
    final ff0 f19712c;

    public wl2(ff0 ff0, ScheduledExecutorService scheduledExecutorService, Context context, byte[] bArr) {
        this.f19712c = ff0;
        this.f19710a = scheduledExecutorService;
        this.f19711b = context;
    }

    /* renamed from: d */
    public final lf3 mo8340d() {
        return cf3.m10915m(cf3.m10917o(cf3.m10911i(new Bundle()), ((Long) C4596v.m30088c().mo12227b(C2679nz.f14591j3)).longValue(), TimeUnit.MILLISECONDS, this.f19710a), vl2.f19145a, dn0.f8325a);
    }

    public final int zza() {
        return 49;
    }
}
