package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class me3 extends ne3 {

    /* renamed from: e */
    private final Callable f13311e;

    /* renamed from: f */
    final /* synthetic */ oe3 f13312f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    me3(oe3 oe3, Callable callable, Executor executor) {
        super(oe3, executor);
        this.f13312f = oe3;
        Objects.requireNonNull(callable);
        this.f13311e = callable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo8785a() throws Exception {
        return this.f13311e.call();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo8786b() {
        return this.f13311e.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo12322h(Object obj) {
        this.f13312f.mo9805g(obj);
    }
}
