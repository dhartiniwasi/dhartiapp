package com.startapp.sdk.jobs;

import android.content.Context;
import android.os.Bundle;
import com.startapp.C9116l9;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.jobs.C9529b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.startapp.sdk.jobs.f */
/* compiled from: Sta */
public class C9536f implements C9116l9 {

    /* renamed from: a */
    public final WeakReference<Context> f39149a;

    /* renamed from: b */
    public final Map<Integer, Future<?>> f39150b = new HashMap();

    /* renamed from: c */
    public final ScheduledExecutorService f39151c = Executors.newScheduledThreadPool(1, ComponentLocator.m50250b("scheduler"));

    /* renamed from: com.startapp.sdk.jobs.f$a */
    /* compiled from: Sta */
    public class C9537a extends C9528a {

        /* renamed from: a */
        public final /* synthetic */ JobRequest f39152a;

        /* renamed from: b */
        public final /* synthetic */ long f39153b;

        public C9537a(JobRequest jobRequest, long j) {
            this.f39152a = jobRequest;
            this.f39153b = j;
        }

        /* renamed from: a */
        public void mo31222a(C9529b bVar) {
            C9536f fVar = C9536f.this;
            int a = JobRequest.m50298a(this.f39152a.f39127a);
            long j = this.f39153b;
            synchronized (fVar) {
                fVar.f39150b.put(Integer.valueOf(a), fVar.f39151c.scheduleAtFixedRate(bVar, j, j, TimeUnit.MILLISECONDS));
            }
        }
    }

    /* renamed from: com.startapp.sdk.jobs.f$b */
    /* compiled from: Sta */
    public class C9538b implements C9529b.C9530a {
        public C9538b(C9536f fVar, JobRequest jobRequest) {
        }

        /* renamed from: a */
        public void mo31223a(C9529b bVar, boolean z) {
        }
    }

    /* renamed from: com.startapp.sdk.jobs.f$c */
    /* compiled from: Sta */
    public class C9539c extends C9528a {

        /* renamed from: a */
        public final /* synthetic */ JobRequest f39155a;

        /* renamed from: b */
        public final /* synthetic */ long f39156b;

        public C9539c(JobRequest jobRequest, long j) {
            this.f39155a = jobRequest;
            this.f39156b = j;
        }

        /* renamed from: a */
        public void mo31222a(C9529b bVar) {
            C9536f fVar = C9536f.this;
            int a = JobRequest.m50298a(this.f39155a.f39127a);
            long j = this.f39156b;
            synchronized (fVar) {
                fVar.f39150b.put(Integer.valueOf(a), fVar.f39151c.schedule(bVar, j, TimeUnit.MILLISECONDS));
            }
        }
    }

    /* renamed from: com.startapp.sdk.jobs.f$d */
    /* compiled from: Sta */
    public class C9540d implements C9529b.C9530a {

        /* renamed from: a */
        public final /* synthetic */ JobRequest f39158a;

        /* renamed from: b */
        public final /* synthetic */ long f39159b;

        public C9540d(JobRequest jobRequest, long j) {
            this.f39158a = jobRequest;
            this.f39159b = j;
        }

        /* renamed from: a */
        public void mo31223a(C9529b bVar, boolean z) {
            if (z) {
                C9536f fVar = C9536f.this;
                int a = JobRequest.m50298a(this.f39158a.f39127a);
                long j = this.f39159b;
                synchronized (fVar) {
                    fVar.f39150b.put(Integer.valueOf(a), fVar.f39151c.schedule(bVar, j, TimeUnit.MILLISECONDS));
                }
                return;
            }
            synchronized (this) {
                C9536f.this.f39150b.remove(Integer.valueOf(JobRequest.m50298a(this.f39158a.f39127a)));
            }
        }
    }

    public C9536f(Context context) {
        this.f39149a = new WeakReference<>(context);
    }

    /* renamed from: a */
    public boolean mo29673a(JobRequest jobRequest, long j) {
        Context context = (Context) this.f39149a.get();
        if (context == null) {
            return false;
        }
        return new C9537a(jobRequest, j).mo31224a(context, jobRequest.f39127a, new C9538b(this, jobRequest), (Bundle) null);
    }

    /* renamed from: a */
    public boolean mo29674a(JobRequest jobRequest, Long l, Long l2) {
        Context context = (Context) this.f39149a.get();
        if (context == null) {
            return false;
        }
        long longValue = l != null ? l.longValue() : 0;
        return new C9539c(jobRequest, longValue).mo31224a(context, jobRequest.f39127a, new C9540d(jobRequest, longValue), (Bundle) null);
    }

    /* renamed from: a */
    public synchronized boolean mo29672a(int i) {
        Future future = this.f39150b.get(Integer.valueOf(i));
        if (future == null) {
            return false;
        }
        this.f39150b.remove(Integer.valueOf(i));
        return future.cancel(true);
    }
}
