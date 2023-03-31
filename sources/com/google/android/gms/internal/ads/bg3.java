package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class bg3 extends kf3 {

    /* renamed from: c */
    private final he3 f7245c;

    /* renamed from: d */
    final /* synthetic */ dg3 f7246d;

    bg3(dg3 dg3, he3 he3) {
        this.f7246d = dg3;
        Objects.requireNonNull(he3);
        this.f7245c = he3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8785a() throws Exception {
        lf3 zza = this.f7245c.zza();
        b83.m10240d(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f7245c);
        return zza;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo8786b() {
        return this.f7245c.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo8787d(Throwable th) {
        this.f7246d.mo9806h(th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo8788e(Object obj) {
        this.f7246d.mo10139w((lf3) obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo8789f() {
        return this.f7246d.isDone();
    }
}
