package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

/* renamed from: com.google.android.gms.measurement.internal.y7 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final /* synthetic */ class C7562y7 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C7313b8 f33205a;

    /* renamed from: b */
    public final /* synthetic */ C7352f3 f33206b;

    /* renamed from: c */
    public final /* synthetic */ JobParameters f33207c;

    public /* synthetic */ C7562y7(C7313b8 b8Var, C7352f3 f3Var, JobParameters jobParameters) {
        this.f33205a = b8Var;
        this.f33206b = f3Var;
        this.f33207c = jobParameters;
    }

    public final void run() {
        this.f33205a.mo24180d(this.f33206b, this.f33207c);
    }
}
