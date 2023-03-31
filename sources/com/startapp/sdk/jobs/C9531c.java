package com.startapp.sdk.jobs;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import com.startapp.C8837b0;
import com.startapp.C9116l9;
import com.startapp.sdk.jobs.JobRequest;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.startapp.sdk.jobs.c */
/* compiled from: Sta */
public class C9531c implements C9116l9 {

    /* renamed from: a */
    public final JobScheduler f39142a;

    /* renamed from: b */
    public final ComponentName f39143b;

    /* renamed from: c */
    public final boolean f39144c;

    public C9531c(Context context, Class<? extends JobService> cls) throws IllegalStateException {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            this.f39142a = jobScheduler;
            this.f39143b = new ComponentName(context, cls);
            this.f39144c = C8837b0.m48304a(context, "android.permission.RECEIVE_BOOT_COMPLETED");
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final JobInfo.Builder mo31226a(JobRequest jobRequest, Integer num) {
        int i;
        int i2;
        if (num != null) {
            i = num.intValue();
        } else {
            i = JobRequest.m50298a(jobRequest.f39127a);
        }
        JobInfo.Builder builder = new JobInfo.Builder(i, this.f39143b);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("extraKeyUuid", jobRequest.f39128b.toString());
        persistableBundle.putStringArray("extraKeyTags", jobRequest.f39127a);
        if (num != null) {
            persistableBundle.putInt("extraKeyDuplicate", 1);
        }
        builder.setExtras(persistableBundle);
        JobRequest.Network network = jobRequest.f39129c;
        if (network != null) {
            if (network == JobRequest.Network.UNMETERED) {
                i2 = 2;
            } else {
                i2 = network == JobRequest.Network.ANY ? 1 : 0;
            }
            builder.setRequiredNetworkType(i2);
        }
        if (this.f39144c) {
            builder.setPersisted(true);
        }
        return builder;
    }

    /* renamed from: a */
    public final boolean mo31228a(JobInfo jobInfo) {
        try {
            return this.f39142a.schedule(jobInfo) == 1;
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: a */
    public final List<JobInfo> mo31227a() {
        List<JobInfo> list;
        try {
            list = this.f39142a.getAllPendingJobs();
        } catch (Throwable unused) {
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (JobInfo next : list) {
            if (this.f39143b.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public boolean mo29673a(JobRequest jobRequest, long j) {
        JobInfo.Builder a = mo31226a(jobRequest, (Integer) null);
        if (Build.VERSION.SDK_INT >= 24) {
            return mo31228a(a.setPeriodic(j, JobInfo.getMinFlexMillis()).build());
        }
        List<JobInfo> a2 = mo31227a();
        if (a2 == null) {
            return false;
        }
        for (JobInfo next : a2) {
            if (next.getId() == JobRequest.m50298a(jobRequest.f39127a) && next.getIntervalMillis() == j) {
                return false;
            }
        }
        return mo31228a(a.setPeriodic(j).build());
    }

    /* renamed from: a */
    public boolean mo29674a(JobRequest jobRequest, Long l, Long l2) {
        ArrayList arrayList = null;
        JobInfo.Builder a = mo31226a(jobRequest, (Integer) null);
        long j = 0;
        if (l != null || Build.VERSION.SDK_INT <= 28) {
            a.setMinimumLatency(l != null ? l.longValue() : 0);
        }
        JobInfo build = a.build();
        boolean a2 = mo31228a(build);
        if (Build.VERSION.SDK_INT == 23) {
            String uuid = jobRequest.f39128b.toString();
            List<JobInfo> a3 = mo31227a();
            if (a3 != null) {
                arrayList = new ArrayList(2);
                for (JobInfo next : a3) {
                    PersistableBundle extras = next.getExtras();
                    try {
                        if (extras.containsKey("extraKeyUuid") && uuid.equals(extras.getString("extraKeyUuid"))) {
                            arrayList.add(Integer.valueOf(next.getId()));
                        }
                    } catch (NullPointerException unused) {
                    }
                }
            }
            if (arrayList != null) {
                int id = build.getId();
                int indexOf = arrayList.indexOf(Integer.valueOf(id));
                if (indexOf >= 0) {
                    arrayList.remove(indexOf);
                }
                JobInfo.Builder a4 = mo31226a(jobRequest, Integer.valueOf(!arrayList.isEmpty() ? ((Integer) arrayList.get(0)).intValue() : id < Integer.MAX_VALUE ? id + 1 : id - 1));
                if (l != null || Build.VERSION.SDK_INT <= 28) {
                    if (l != null) {
                        j = l.longValue();
                    }
                    a4.setMinimumLatency(j);
                }
                mo31228a(a4.build());
            }
        }
        return a2;
    }

    /* renamed from: a */
    public boolean mo29672a(int i) {
        List<JobInfo> a = mo31227a();
        if (a == null) {
            return false;
        }
        try {
            for (JobInfo id : a) {
                if (id.getId() == i) {
                    this.f39142a.cancel(i);
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
