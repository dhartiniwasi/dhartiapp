package com.startapp.sdk.jobs;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.jobs.C9529b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: Sta */
public class SchedulerService extends JobService {

    /* renamed from: a */
    public ExecutorService f39137a;

    /* renamed from: b */
    public final C9528a f39138b = new C9526a();

    /* renamed from: com.startapp.sdk.jobs.SchedulerService$a */
    /* compiled from: Sta */
    public class C9526a extends C9528a {
        public C9526a() {
        }

        /* renamed from: a */
        public void mo31222a(C9529b bVar) {
            ExecutorService executorService = SchedulerService.this.f39137a;
            if (executorService != null) {
                executorService.execute(bVar);
            }
        }
    }

    /* renamed from: com.startapp.sdk.jobs.SchedulerService$b */
    /* compiled from: Sta */
    public class C9527b implements C9529b.C9530a {

        /* renamed from: a */
        public final /* synthetic */ JobParameters f39140a;

        public C9527b(PersistableBundle persistableBundle, JobParameters jobParameters) {
            this.f39140a = jobParameters;
        }

        /* renamed from: a */
        public void mo31223a(C9529b bVar, boolean z) {
            SchedulerService.this.jobFinished(this.f39140a, z);
        }
    }

    public void onCreate() {
        super.onCreate();
        this.f39137a = Executors.newSingleThreadExecutor(new ComponentLocator.C9488q0("scheduler"));
    }

    public void onDestroy() {
        super.onDestroy();
        ExecutorService executorService = this.f39137a;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean onStartJob(JobParameters jobParameters) {
        Bundle bundle;
        if (this.f39137a == null) {
            return false;
        }
        PersistableBundle extras = jobParameters.getExtras();
        if (extras.containsKey("extraKeyDuplicate")) {
            return false;
        }
        PersistableBundle persistableBundle = extras.getPersistableBundle("extraKeyBundle");
        if (persistableBundle != null) {
            bundle = new Bundle();
            bundle.putAll(persistableBundle);
        } else {
            bundle = null;
        }
        return this.f39138b.mo31224a(this, extras.getStringArray("extraKeyTags"), new C9527b(extras, jobParameters), bundle);
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
