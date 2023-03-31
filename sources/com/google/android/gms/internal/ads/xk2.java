package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p060h4.C4596v;
import p218e6.C9980l;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class xk2 implements tj2 {

    /* renamed from: a */
    private final xl0 f20144a;

    /* renamed from: b */
    private final String f20145b;

    /* renamed from: c */
    private final ScheduledExecutorService f20146c;

    /* renamed from: d */
    private final mf3 f20147d;

    /* renamed from: e */
    private final C3044xt f20148e;

    xk2(String str, C3044xt xtVar, xl0 xl0, ScheduledExecutorService scheduledExecutorService, mf3 mf3, byte[] bArr) {
        this.f20145b = str;
        this.f20148e = xtVar;
        this.f20144a = xl0;
        this.f20146c = scheduledExecutorService;
        this.f20147d = mf3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ yk2 mo15107a(Exception exc) {
        this.f20144a.mo15126t(exc, "AppSetIdInfoGmscoreSignal");
        return new yk2((String) null, -1);
    }

    /* renamed from: d */
    public final lf3 mo8340d() {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14620m2)).booleanValue()) {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14670r2)).booleanValue()) {
                lf3 n = cf3.m10916n(f53.m12425a(C9980l.m51031e(null)), vk2.f19136a, this.f20147d);
                if (((Boolean) t00.f17802a.mo13438e()).booleanValue()) {
                    n = cf3.m10917o(n, ((Long) t00.f17803b.mo13438e()).longValue(), TimeUnit.MILLISECONDS, this.f20146c);
                }
                return cf3.m10908f(n, Exception.class, new wk2(this), this.f20147d);
            }
        }
        return cf3.m10911i(new yk2((String) null, -1));
    }

    public final int zza() {
        return 43;
    }
}
