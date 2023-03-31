package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class bf3 {

    /* renamed from: a */
    private final boolean f7231a;

    /* renamed from: b */
    private final ua3 f7232b;

    /* synthetic */ bf3(boolean z, ua3 ua3, ze3 ze3) {
        this.f7231a = z;
        this.f7232b = ua3;
    }

    /* renamed from: a */
    public final lf3 mo8777a(Callable callable, Executor executor) {
        return new oe3(this.f7232b, this.f7231a, executor, callable);
    }
}
