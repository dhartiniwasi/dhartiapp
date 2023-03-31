package com.onesignal;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import com.onesignal.C8303b0;
import com.onesignal.C8338d3;
import java.lang.ref.WeakReference;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.onesignal.r2 */
/* compiled from: OSSyncService */
class C8587r2 extends C8521o0 {

    /* renamed from: e */
    private static final Object f35995e = new Object();

    /* renamed from: f */
    private static C8587r2 f35996f;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Long f35997d = 0L;

    /* renamed from: com.onesignal.r2$a */
    /* compiled from: OSSyncService */
    static class C8588a extends C8590c {

        /* renamed from: a */
        private WeakReference<Service> f35998a;

        C8588a(Service service) {
            this.f35998a = new WeakReference<>(service);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo28190a() {
            C8338d3.m46492a(C8338d3.C8384r0.DEBUG, "LegacySyncRunnable:Stopped");
            if (this.f35998a.get() != null) {
                ((Service) this.f35998a.get()).stopSelf();
            }
        }
    }

    /* renamed from: com.onesignal.r2$b */
    /* compiled from: OSSyncService */
    static class C8589b extends C8590c {

        /* renamed from: a */
        private WeakReference<JobService> f35999a;

        /* renamed from: b */
        private JobParameters f36000b;

        C8589b(JobService jobService, JobParameters jobParameters) {
            this.f35999a = new WeakReference<>(jobService);
            this.f36000b = jobParameters;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo28190a() {
            C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
            C8338d3.m46492a(r0Var, "LollipopSyncRunnable:JobFinished needsJobReschedule: " + C8587r2.m47596q().f35795a);
            boolean z = C8587r2.m47596q().f35795a;
            C8587r2.m47596q().f35795a = false;
            if (this.f35999a.get() != null) {
                ((JobService) this.f35999a.get()).jobFinished(this.f36000b, z);
            }
        }
    }

    /* renamed from: com.onesignal.r2$c */
    /* compiled from: OSSyncService */
    static abstract class C8590c implements Runnable {

        /* renamed from: com.onesignal.r2$c$a */
        /* compiled from: OSSyncService */
        class C8591a implements C8303b0.C8305b {

            /* renamed from: a */
            final /* synthetic */ BlockingQueue f36001a;

            C8591a(BlockingQueue blockingQueue) {
                this.f36001a = blockingQueue;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.onesignal.b0$d} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.onesignal.b0$d} */
            /* JADX WARNING: Failed to insert additional move for type inference */
            /* JADX WARNING: Multi-variable type inference failed */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo27610a(com.onesignal.C8303b0.C8307d r2) {
                /*
                    r1 = this;
                    if (r2 == 0) goto L_0x0003
                    goto L_0x0008
                L_0x0003:
                    java.lang.Object r2 = new java.lang.Object
                    r2.<init>()
                L_0x0008:
                    java.util.concurrent.BlockingQueue r0 = r1.f36001a
                    r0.offer(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8587r2.C8590c.C8591a.mo27610a(com.onesignal.b0$d):void");
            }

            public C8303b0.C8309f getType() {
                return C8303b0.C8309f.SYNC_SERVICE;
            }
        }

        C8590c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo28190a();

        public final void run() {
            synchronized (C8521o0.f35794c) {
                Long unused = C8587r2.m47596q().f35997d = 0L;
            }
            if (C8338d3.m46463Q0() == null) {
                mo28190a();
                return;
            }
            C8338d3.f35442h = C8338d3.m46416E0();
            C8592r3.m47625l();
            try {
                ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(1);
                C8303b0.m46289g(C8338d3.f35438f, false, false, new C8591a(arrayBlockingQueue));
                Object take = arrayBlockingQueue.take();
                if (take instanceof C8303b0.C8307d) {
                    C8592r3.m47612D((C8303b0.C8307d) take);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            C8592r3.m47610B(true);
            C8338d3.m46537l0().mo28052d();
            mo28190a();
        }
    }

    C8587r2() {
    }

    /* renamed from: q */
    static C8587r2 m47596q() {
        if (f35996f == null) {
            synchronized (f35995e) {
                if (f35996f == null) {
                    f35996f = new C8587r2();
                }
            }
        }
        return f35996f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Class mo28007c() {
        return SyncJobService.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Class mo28008d() {
        return SyncService.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo28009e() {
        return 2071862118;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo28010f() {
        return "OS_SYNCSRV_BG_SYNC";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo28186p(Context context) {
        synchronized (C8521o0.f35794c) {
            this.f35997d = 0L;
            if (!C8303b0.m46295m(context)) {
                mo28005a(context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo28187r(Context context, long j) {
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.VERBOSE;
        C8338d3.m46492a(r0Var, "OSSyncService scheduleLocationUpdateTask:delayMs: " + j);
        mo28189t(context, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo28188s(Context context) {
        C8338d3.m46492a(C8338d3.C8384r0.VERBOSE, "OSSyncService scheduleSyncTask:SYNC_AFTER_BG_DELAY_MS: 30000");
        mo28189t(context, 30000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo28189t(Context context, long j) {
        synchronized (C8521o0.f35794c) {
            if (this.f35997d.longValue() == 0 || C8338d3.m46448M0().mo28281b() + j <= this.f35997d.longValue()) {
                if (j < 5000) {
                    j = 5000;
                }
                mo28011i(context, j);
                this.f35997d = Long.valueOf(C8338d3.m46448M0().mo28281b() + j);
                return;
            }
            C8338d3.m46492a(C8338d3.C8384r0.VERBOSE, "OSSyncService scheduleSyncTask already update scheduled nextScheduledSyncTimeMs: " + this.f35997d);
        }
    }
}
