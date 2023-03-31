package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class km2 implements tj2 {

    /* renamed from: a */
    private final xl0 f12165a;

    /* renamed from: b */
    private final boolean f12166b;

    /* renamed from: c */
    private final boolean f12167c;

    /* renamed from: d */
    private final ScheduledExecutorService f12168d;

    /* renamed from: e */
    private final mf3 f12169e;

    /* renamed from: f */
    private final String f12170f;

    /* renamed from: g */
    private final ml0 f12171g;

    km2(xl0 xl0, boolean z, boolean z2, ml0 ml0, mf3 mf3, String str, ScheduledExecutorService scheduledExecutorService, byte[] bArr) {
        this.f12165a = xl0;
        this.f12166b = z;
        this.f12167c = z2;
        this.f12171g = ml0;
        this.f12169e = mf3;
        this.f12170f = str;
        this.f12168d = scheduledExecutorService;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ lm2 mo11725a(Exception exc) {
        this.f12165a.mo15126t(exc, "TrustlessTokenSignal");
        return null;
    }

    /* renamed from: d */
    public final lf3 mo8340d() {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14624m6)).booleanValue() && this.f12167c) {
            return cf3.m10911i((Object) null);
        }
        if (!this.f12166b) {
            return cf3.m10911i((Object) null);
        }
        return cf3.m10908f(cf3.m10917o(cf3.m10915m(cf3.m10911i((Object) null), im2.f10865a, this.f12169e), ((Long) s10.f17184c.mo13438e()).longValue(), TimeUnit.MILLISECONDS, this.f12168d), Exception.class, new jm2(this), this.f12169e);
    }

    public final int zza() {
        return 50;
    }
}
