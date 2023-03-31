package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class rx2 {

    /* renamed from: a */
    private final Executor f17126a;

    /* renamed from: b */
    private final um0 f17127b;

    public rx2(Executor executor, um0 um0) {
        this.f17126a = executor;
        this.f17127b = um0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo13885a(String str) {
        this.f17127b.mo9501f(str);
    }

    /* renamed from: b */
    public final void mo13886b(String str) {
        this.f17126a.execute(new qx2(this, str));
    }
}
