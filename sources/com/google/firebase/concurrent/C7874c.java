package com.google.firebase.concurrent;

import com.google.firebase.concurrent.C7887p;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.concurrent.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7874c implements C7887p.C7890c {

    /* renamed from: a */
    public final /* synthetic */ C7886o f34249a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f34250b;

    /* renamed from: c */
    public final /* synthetic */ long f34251c;

    /* renamed from: d */
    public final /* synthetic */ long f34252d;

    /* renamed from: e */
    public final /* synthetic */ TimeUnit f34253e;

    public /* synthetic */ C7874c(C7886o oVar, Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        this.f34249a = oVar;
        this.f34250b = runnable;
        this.f34251c = j;
        this.f34252d = j2;
        this.f34253e = timeUnit;
    }

    /* renamed from: a */
    public final ScheduledFuture mo26256a(C7887p.C7889b bVar) {
        return this.f34249a.m43622v(this.f34250b, this.f34251c, this.f34252d, this.f34253e, bVar);
    }
}
