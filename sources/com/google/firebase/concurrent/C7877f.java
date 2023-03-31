package com.google.firebase.concurrent;

import com.google.firebase.concurrent.C7887p;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.concurrent.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7877f implements C7887p.C7890c {

    /* renamed from: a */
    public final /* synthetic */ C7886o f34259a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f34260b;

    /* renamed from: c */
    public final /* synthetic */ long f34261c;

    /* renamed from: d */
    public final /* synthetic */ long f34262d;

    /* renamed from: e */
    public final /* synthetic */ TimeUnit f34263e;

    public /* synthetic */ C7877f(C7886o oVar, Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        this.f34259a = oVar;
        this.f34260b = runnable;
        this.f34261c = j;
        this.f34262d = j2;
        this.f34263e = timeUnit;
    }

    /* renamed from: a */
    public final ScheduledFuture mo26256a(C7887p.C7889b bVar) {
        return this.f34259a.m43624x(this.f34260b, this.f34261c, this.f34262d, this.f34263e, bVar);
    }
}
