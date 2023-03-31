package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import p098n1.C5095o;
import p098n1.C5100t;
import p147u1.C12650f;
import p171y1.C6116a;

public class JobInfoSchedulerService extends JobService {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m8740b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C5100t.m31908f(getApplicationContext());
        C5095o.C5096a d = C5095o.m31889a().mo19030b(string).mo19032d(C6116a.m35765b(i));
        if (string2 != null) {
            d.mo19031c(Base64.decode(string2, 0));
        }
        C5100t.m31906c().mo19062e().mo20100v(d.mo19029a(), i2, new C12650f(this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
