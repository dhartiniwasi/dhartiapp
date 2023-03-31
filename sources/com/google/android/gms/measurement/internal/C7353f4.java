package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.measurement.internal.f4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7353f4 extends FutureTask implements Comparable {

    /* renamed from: a */
    private final long f32475a;

    /* renamed from: b */
    final boolean f32476b;

    /* renamed from: c */
    private final String f32477c;

    /* renamed from: d */
    final /* synthetic */ C7375h4 f32478d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7353f4(C7375h4 h4Var, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        this.f32478d = h4Var;
        C4141r.m28221k(str);
        long andIncrement = C7375h4.f32531l.getAndIncrement();
        this.f32475a = andIncrement;
        this.f32477c = str;
        this.f32476b = z;
        if (andIncrement == Long.MAX_VALUE) {
            h4Var.f32389a.mo24135l().mo24256q().mo24208a("Tasks index overflow");
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C7353f4 f4Var = (C7353f4) obj;
        boolean z = this.f32476b;
        if (z != f4Var.f32476b) {
            return !z ? 1 : -1;
        }
        int i = (this.f32475a > f4Var.f32475a ? 1 : (this.f32475a == f4Var.f32475a ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i > 0) {
            return 1;
        }
        this.f32478d.f32389a.mo24135l().mo24258t().mo24209b("Two tasks share the same index. index", Long.valueOf(this.f32475a));
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.f32478d.f32389a.mo24135l().mo24256q().mo24209b(this.f32477c, th);
        super.setException(th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7353f4(C7375h4 h4Var, Callable callable, boolean z, String str) {
        super(callable);
        this.f32478d = h4Var;
        C4141r.m28221k("Task exception on worker thread");
        long andIncrement = C7375h4.f32531l.getAndIncrement();
        this.f32475a = andIncrement;
        this.f32477c = "Task exception on worker thread";
        this.f32476b = z;
        if (andIncrement == Long.MAX_VALUE) {
            h4Var.f32389a.mo24135l().mo24256q().mo24208a("Tasks index overflow");
        }
    }
}
