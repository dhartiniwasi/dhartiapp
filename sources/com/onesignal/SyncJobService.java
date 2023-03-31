package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobService;
import com.onesignal.C8338d3;
import com.onesignal.C8587r2;

public class SyncJobService extends JobService {
    public boolean onStartJob(JobParameters jobParameters) {
        C8587r2.m47596q().mo28006b(this, new C8587r2.C8589b(this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        boolean l = C8587r2.m47596q().mo28012l();
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
        C8338d3.m46492a(r0Var, "SyncJobService onStopJob called, system conditions not available reschedule: " + l);
        return l;
    }
}
