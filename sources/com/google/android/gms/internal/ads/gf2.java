package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p060h4.C4596v;
import p150u4.C5745a;
import p150u4.C5746b;
import p150u4.C5747c;
import p218e6.C9975i;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class gf2 implements tj2 {

    /* renamed from: a */
    final xl0 f9888a;

    /* renamed from: b */
    C5746b f9889b;

    /* renamed from: c */
    private final ScheduledExecutorService f9890c;

    /* renamed from: d */
    private final mf3 f9891d;

    /* renamed from: e */
    private final Context f9892e;

    gf2(Context context, xl0 xl0, ScheduledExecutorService scheduledExecutorService, mf3 mf3) {
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14660q2)).booleanValue()) {
            this.f9889b = C5745a.m34328a(context);
        }
        this.f9892e = context;
        this.f9888a = xl0;
        this.f9890c = scheduledExecutorService;
        this.f9891d = mf3;
    }

    /* renamed from: d */
    public final lf3 mo8340d() {
        C9975i<C5747c> iVar;
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14620m2)).booleanValue()) {
            if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14670r2)).booleanValue()) {
                if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14630n2)).booleanValue()) {
                    return cf3.m10915m(f53.m12425a(this.f9889b.mo19226a()), df2.f8233a, dn0.f8330f);
                }
                if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14660q2)).booleanValue()) {
                    iVar = hu2.m14047a(this.f9892e);
                } else {
                    iVar = this.f9889b.mo19226a();
                }
                if (iVar == null) {
                    return cf3.m10911i(new hf2((String) null, -1));
                }
                lf3 n = cf3.m10916n(f53.m12425a(iVar), ef2.f8790a, dn0.f8330f);
                if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14640o2)).booleanValue()) {
                    n = cf3.m10917o(n, ((Long) C4596v.m30088c().mo12227b(C2679nz.f14650p2)).longValue(), TimeUnit.MILLISECONDS, this.f9890c);
                }
                return cf3.m10908f(n, Exception.class, new ff2(this), this.f9891d);
            }
        }
        return cf3.m10911i(new hf2((String) null, -1));
    }

    public final int zza() {
        return 11;
    }
}
