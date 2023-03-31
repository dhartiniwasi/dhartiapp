package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class bf2 implements tj2 {

    /* renamed from: a */
    private final Executor f7229a;

    /* renamed from: b */
    private final xl0 f7230b;

    bf2(Executor executor, xl0 xl0) {
        this.f7229a = executor;
        this.f7230b = xl0;
    }

    /* renamed from: d */
    public final lf3 mo8340d() {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14610l2)).booleanValue()) {
            return cf3.m10911i((Object) null);
        }
        return cf3.m10915m(this.f7230b.mo15118j(), ze2.f21068a, this.f7229a);
    }

    public final int zza() {
        return 10;
    }
}
