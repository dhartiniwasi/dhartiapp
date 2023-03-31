package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p032d4.C4076a;
import p060h4.C4584t;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ik2 implements tj2 {

    /* renamed from: a */
    private final Context f10825a;

    /* renamed from: b */
    private final ScheduledExecutorService f10826b;

    /* renamed from: c */
    private final Executor f10827c;

    /* renamed from: d */
    private final int f10828d;

    /* renamed from: e */
    private final ol0 f10829e;

    public ik2(ol0 ol0, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, byte[] bArr) {
        this.f10829e = ol0;
        this.f10825a = context;
        this.f10826b = scheduledExecutorService;
        this.f10827c = executor;
        this.f10828d = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ jk2 mo11146a(Throwable th) {
        String str;
        C4584t.m30036b();
        ContentResolver contentResolver = this.f10825a.getContentResolver();
        if (contentResolver == null) {
            str = null;
        } else {
            str = Settings.Secure.getString(contentResolver, "android_id");
        }
        return new jk2((C4076a.C4077a) null, str);
    }

    /* renamed from: d */
    public final lf3 mo8340d() {
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14383O0)).booleanValue()) {
            return cf3.m10910h(new Exception("Did not ad Ad ID into query param."));
        }
        return cf3.m10908f((se3) cf3.m10917o(cf3.m10915m(se3.m20287D(this.f10829e.mo12972a(this.f10825a, this.f10828d)), gk2.f9946a, this.f10827c), ((Long) C4596v.m30088c().mo12227b(C2679nz.f14393P0)).longValue(), TimeUnit.MILLISECONDS, this.f10826b), Throwable.class, new hk2(this), this.f10827c);
    }

    public final int zza() {
        return 40;
    }
}
