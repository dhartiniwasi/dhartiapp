package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C7313b8;
import p402y5.C13048z;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class AppMeasurementJobService extends JobService implements C13048z {

    /* renamed from: a */
    private C7313b8 f32295a;

    /* renamed from: c */
    private final C7313b8 m41214c() {
        if (this.f32295a == null) {
            this.f32295a = new C7313b8(this);
        }
        return this.f32295a;
    }

    /* renamed from: a */
    public final void mo24057a(Intent intent) {
    }

    /* renamed from: b */
    public final void mo24058b(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    /* renamed from: d */
    public final boolean mo24059d(int i) {
        throw new UnsupportedOperationException();
    }

    public void onCreate() {
        super.onCreate();
        m41214c().mo24181e();
    }

    public void onDestroy() {
        m41214c().mo24182f();
        super.onDestroy();
    }

    public void onRebind(Intent intent) {
        m41214c().mo24183g(intent);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        m41214c().mo24185i(jobParameters);
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public boolean onUnbind(Intent intent) {
        m41214c().mo24186j(intent);
        return true;
    }
}
