package com.onesignal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.onesignal.C8338d3;

/* renamed from: com.onesignal.o0 */
/* compiled from: OSBackgroundSync */
abstract class C8521o0 {

    /* renamed from: c */
    protected static final Object f35794c = new Object();

    /* renamed from: a */
    protected boolean f35795a = false;

    /* renamed from: b */
    private Thread f35796b;

    C8521o0() {
    }

    /* renamed from: g */
    private boolean m47199g(Context context) {
        return C8410f.m46658a(context, "android.permission.RECEIVE_BOOT_COMPLETED") == 0;
    }

    /* renamed from: h */
    private boolean m47200h(Context context) {
        Thread thread;
        for (JobInfo id : ((JobScheduler) context.getSystemService("jobscheduler")).getAllPendingJobs()) {
            if (id.getId() == mo28009e() && (thread = this.f35796b) != null && thread.isAlive()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    private void m47201j(Context context, long j) {
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.VERBOSE;
        C8338d3.m46492a(r0Var, getClass().getSimpleName() + " scheduleServiceSyncTask:atTime: " + j);
        ((AlarmManager) context.getSystemService("alarm")).set(0, C8338d3.m46448M0().mo28281b() + j, m47203m(context));
    }

    /* renamed from: k */
    private void m47202k(Context context, long j) {
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.VERBOSE;
        C8338d3.m46492a(r0Var, "OSBackgroundSync scheduleSyncServiceAsJob:atTime: " + j);
        if (m47200h(context)) {
            C8338d3.m46492a(r0Var, "OSBackgroundSync scheduleSyncServiceAsJob Scheduler already running!");
            this.f35795a = true;
            return;
        }
        JobInfo.Builder builder = new JobInfo.Builder(mo28009e(), new ComponentName(context, mo28007c()));
        builder.setMinimumLatency(j).setRequiredNetworkType(1);
        if (m47199g(context)) {
            builder.setPersisted(true);
        }
        try {
            int schedule = ((JobScheduler) context.getSystemService("jobscheduler")).schedule(builder.build());
            C8338d3.C8384r0 r0Var2 = C8338d3.C8384r0.INFO;
            C8338d3.m46492a(r0Var2, "OSBackgroundSync scheduleSyncServiceAsJob:result: " + schedule);
        } catch (NullPointerException e) {
            C8338d3.m46496b(C8338d3.C8384r0.ERROR, "scheduleSyncServiceAsJob called JobScheduler.jobScheduler which triggered an internal null Android error. Skipping job.", e);
        }
    }

    /* renamed from: m */
    private PendingIntent m47203m(Context context) {
        return PendingIntent.getService(context, mo28009e(), new Intent(context, mo28008d()), 201326592);
    }

    /* renamed from: n */
    private static boolean m47204n() {
        return Build.VERSION.SDK_INT >= 21;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28005a(Context context) {
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
        C8338d3.m46594z1(r0Var, getClass().getSimpleName() + " cancel background sync");
        synchronized (f35794c) {
            if (m47204n()) {
                ((JobScheduler) context.getSystemService("jobscheduler")).cancel(mo28009e());
            } else {
                ((AlarmManager) context.getSystemService("alarm")).cancel(m47203m(context));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo28006b(Context context, Runnable runnable) {
        C8338d3.m46594z1(C8338d3.C8384r0.DEBUG, "OSBackground sync, calling initWithContext");
        C8338d3.m46506d1(context);
        Thread thread = new Thread(runnable, mo28010f());
        this.f35796b = thread;
        thread.start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Class mo28007c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Class mo28008d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo28009e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract String mo28010f();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo28011i(Context context, long j) {
        synchronized (f35794c) {
            if (m47204n()) {
                m47202k(context, j);
            } else {
                m47201j(context, j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo28012l() {
        Thread thread = this.f35796b;
        if (thread == null || !thread.isAlive()) {
            return false;
        }
        this.f35796b.interrupt();
        return true;
    }
}
