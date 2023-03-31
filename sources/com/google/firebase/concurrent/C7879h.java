package com.google.firebase.concurrent;

import com.google.firebase.concurrent.C7887p;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.concurrent.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7879h implements C7887p.C7890c {

    /* renamed from: a */
    public final /* synthetic */ C7886o f34268a;

    /* renamed from: b */
    public final /* synthetic */ Callable f34269b;

    /* renamed from: c */
    public final /* synthetic */ long f34270c;

    /* renamed from: d */
    public final /* synthetic */ TimeUnit f34271d;

    public /* synthetic */ C7879h(C7886o oVar, Callable callable, long j, TimeUnit timeUnit) {
        this.f34268a = oVar;
        this.f34269b = callable;
        this.f34270c = j;
        this.f34271d = timeUnit;
    }

    /* renamed from: a */
    public final ScheduledFuture mo26256a(C7887p.C7889b bVar) {
        return this.f34268a.m43619s(this.f34269b, this.f34270c, this.f34271d, bVar);
    }
}
