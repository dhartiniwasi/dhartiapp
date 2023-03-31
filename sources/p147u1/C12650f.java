package p147u1;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

/* renamed from: u1.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12650f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ JobInfoSchedulerService f46400a;

    /* renamed from: b */
    public final /* synthetic */ JobParameters f46401b;

    public /* synthetic */ C12650f(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f46400a = jobInfoSchedulerService;
        this.f46401b = jobParameters;
    }

    public final void run() {
        this.f46400a.m8740b(this.f46401b);
    }
}
