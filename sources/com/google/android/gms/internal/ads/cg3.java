package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class cg3 extends kf3 {

    /* renamed from: c */
    private final Callable f7713c;

    /* renamed from: d */
    final /* synthetic */ dg3 f7714d;

    cg3(dg3 dg3, Callable callable) {
        this.f7714d = dg3;
        Objects.requireNonNull(callable);
        this.f7713c = callable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo8785a() throws Exception {
        return this.f7713c.call();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo8786b() {
        return this.f7713c.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo8787d(Throwable th) {
        this.f7714d.mo9806h(th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo8788e(Object obj) {
        this.f7714d.mo9805g(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo8789f() {
        return this.f7714d.isDone();
    }
}
