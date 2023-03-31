package com.google.firebase.concurrent;

import com.google.firebase.concurrent.C7887p;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.concurrent.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7878g implements C7887p.C7890c {

    /* renamed from: a */
    public final /* synthetic */ C7886o f34264a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f34265b;

    /* renamed from: c */
    public final /* synthetic */ long f34266c;

    /* renamed from: d */
    public final /* synthetic */ TimeUnit f34267d;

    public /* synthetic */ C7878g(C7886o oVar, Runnable runnable, long j, TimeUnit timeUnit) {
        this.f34264a = oVar;
        this.f34265b = runnable;
        this.f34266c = j;
        this.f34267d = timeUnit;
    }

    /* renamed from: a */
    public final ScheduledFuture mo26256a(C7887p.C7889b bVar) {
        return this.f34264a.m43616p(this.f34265b, this.f34266c, this.f34267d, bVar);
    }
}
