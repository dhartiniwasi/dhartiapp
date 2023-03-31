package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p060h4.C4571q4;
import p060h4.C4596v;
import p115p4.C5284e;
import p115p4.C5316x;
import p179z3.C6323b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zi2 implements tj2 {

    /* renamed from: a */
    private final String f21093a;

    /* renamed from: b */
    private final mf3 f21094b;

    /* renamed from: c */
    private final ScheduledExecutorService f21095c;

    /* renamed from: d */
    private final Context f21096d;

    /* renamed from: e */
    private final et2 f21097e;

    /* renamed from: f */
    private final su0 f21098f;

    zi2(mf3 mf3, ScheduledExecutorService scheduledExecutorService, String str, Context context, et2 et2, su0 su0) {
        this.f21094b = mf3;
        this.f21095c = scheduledExecutorService;
        this.f21093a = str;
        this.f21096d = context;
        this.f21097e = et2;
        this.f21098f = su0;
    }

    /* renamed from: a */
    public static /* synthetic */ lf3 m24621a(zi2 zi2) {
        String str = zi2.f21093a;
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14594j6)).booleanValue()) {
            str = C6323b.UNKNOWN.name();
        }
        C5316x r = zi2.f21098f.mo9725r();
        f91 f91 = new f91();
        f91.mo10111c(zi2.f21096d);
        ct2 ct2 = new ct2();
        ct2.mo9328J("adUnitId");
        ct2.mo9340e(zi2.f21097e.f8933d);
        ct2.mo9327I(new C4571q4());
        f91.mo10114f(ct2.mo9342g());
        r.mo13624a(f91.mo10115g());
        C5284e eVar = new C5284e();
        eVar.mo19271a(str);
        r.mo13625b(eVar.mo19272b());
        new lf1();
        return cf3.m10908f(cf3.m10915m((se3) cf3.m10917o(se3.m20287D(r.mo13626e().mo14167c()), ((Long) C4596v.m30088c().mo12227b(C2679nz.f14604k6)).longValue(), TimeUnit.MILLISECONDS, zi2.f21095c), xi2.f20112a, zi2.f21094b), Exception.class, yi2.f20627a, zi2.f21094b);
    }

    /* renamed from: d */
    public final lf3 mo8340d() {
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14584i6)).booleanValue() || "adUnitId".equals(this.f21097e.f8935f)) {
            return this.f21094b.mo12324a(vi2.f19113a);
        }
        return cf3.m10914l(new wi2(this), this.f21094b);
    }

    public final int zza() {
        return 33;
    }
}
