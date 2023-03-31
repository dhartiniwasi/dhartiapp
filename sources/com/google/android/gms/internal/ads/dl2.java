package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class dl2 implements tj2 {

    /* renamed from: a */
    private final Context f8305a;

    /* renamed from: b */
    private final xl0 f8306b;

    /* renamed from: c */
    private final ScheduledExecutorService f8307c;

    /* renamed from: d */
    private final Executor f8308d;

    /* renamed from: e */
    private final String f8309e;

    /* renamed from: f */
    private final ol0 f8310f;

    public dl2(ol0 ol0, int i, Context context, xl0 xl0, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, byte[] bArr) {
        this.f8310f = ol0;
        this.f8305a = context;
        this.f8306b = xl0;
        this.f8307c = scheduledExecutorService;
        this.f8308d = executor;
        this.f8309e = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ el2 mo9626a(Exception exc) {
        this.f8306b.mo15126t(exc, "AttestationTokenSignal");
        return null;
    }

    /* renamed from: d */
    public final lf3 mo8340d() {
        return cf3.m10908f((se3) cf3.m10917o(cf3.m10915m(se3.m20287D(cf3.m10914l(new al2(this), this.f8308d)), bl2.f7342a, this.f8308d), ((Long) C4596v.m30088c().mo12227b(C2679nz.f14393P0)).longValue(), TimeUnit.MILLISECONDS, this.f8307c), Exception.class, new cl2(this), sf3.m20349b());
    }

    public final int zza() {
        return 44;
    }
}
