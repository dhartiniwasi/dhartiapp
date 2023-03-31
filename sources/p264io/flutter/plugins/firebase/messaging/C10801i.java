package p264io.flutter.plugins.firebase.messaging;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: io.flutter.plugins.firebase.messaging.i */
/* compiled from: JobIntentService */
abstract class C10801i extends Service {

    /* renamed from: h */
    static final Object f42215h = new Object();

    /* renamed from: i */
    static final HashMap<C10806e, C10811i> f42216i = new HashMap<>();

    /* renamed from: a */
    C10803b f42217a;

    /* renamed from: b */
    C10811i f42218b;

    /* renamed from: c */
    C10802a f42219c;

    /* renamed from: d */
    boolean f42220d = false;

    /* renamed from: e */
    boolean f42221e = false;

    /* renamed from: f */
    boolean f42222f = false;

    /* renamed from: g */
    final ArrayList<C10805d> f42223g = new ArrayList<>();

    /* renamed from: io.flutter.plugins.firebase.messaging.i$a */
    /* compiled from: JobIntentService */
    final class C10802a extends AsyncTask<Void, Void, Void> {
        C10802a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                C10807f a = C10801i.this.mo34425a();
                if (a == null) {
                    return null;
                }
                C10801i.this.mo34396g(a.getIntent());
                a.complete();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onCancelled(Void voidR) {
            C10801i.this.mo34428i();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(Void voidR) {
            C10801i.this.mo34428i();
        }
    }

    /* renamed from: io.flutter.plugins.firebase.messaging.i$b */
    /* compiled from: JobIntentService */
    interface C10803b {
        IBinder compatGetBinder();

        C10807f dequeueWork();
    }

    /* renamed from: io.flutter.plugins.firebase.messaging.i$c */
    /* compiled from: JobIntentService */
    static final class C10804c extends C10811i {

        /* renamed from: d */
        private final Context f42225d;

        /* renamed from: e */
        private final PowerManager.WakeLock f42226e;

        /* renamed from: f */
        private final PowerManager.WakeLock f42227f;

        /* renamed from: g */
        boolean f42228g;

        /* renamed from: h */
        boolean f42229h;

        C10804c(Context context, ComponentName componentName) {
            super(componentName);
            this.f42225d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f42226e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f42227f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo34437a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f42242a);
            if (this.f42225d.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.f42228g) {
                        this.f42228g = true;
                        if (!this.f42229h) {
                            this.f42226e.acquire(60000);
                        }
                    }
                }
            }
        }

        /* renamed from: c */
        public void mo34438c() {
            synchronized (this) {
                if (this.f42229h) {
                    if (this.f42228g) {
                        this.f42226e.acquire(60000);
                    }
                    this.f42229h = false;
                    this.f42227f.release();
                }
            }
        }

        /* renamed from: d */
        public void mo34439d() {
            synchronized (this) {
                if (!this.f42229h) {
                    this.f42229h = true;
                    this.f42227f.acquire(600000);
                    this.f42226e.release();
                }
            }
        }

        /* renamed from: e */
        public void mo34440e() {
            synchronized (this) {
                this.f42228g = false;
            }
        }
    }

    /* renamed from: io.flutter.plugins.firebase.messaging.i$d */
    /* compiled from: JobIntentService */
    final class C10805d implements C10807f {

        /* renamed from: a */
        final Intent f42230a;

        /* renamed from: b */
        final int f42231b;

        C10805d(Intent intent, int i) {
            this.f42230a = intent;
            this.f42231b = i;
        }

        public void complete() {
            C10801i.this.stopSelf(this.f42231b);
        }

        public Intent getIntent() {
            return this.f42230a;
        }
    }

    /* renamed from: io.flutter.plugins.firebase.messaging.i$e */
    /* compiled from: JobIntentService */
    private static class C10806e {

        /* renamed from: a */
        private ComponentName f42233a;

        /* renamed from: b */
        private boolean f42234b;

        C10806e(ComponentName componentName, boolean z) {
            this.f42233a = componentName;
            this.f42234b = z;
        }
    }

    /* renamed from: io.flutter.plugins.firebase.messaging.i$f */
    /* compiled from: JobIntentService */
    interface C10807f {
        void complete();

        Intent getIntent();
    }

    /* renamed from: io.flutter.plugins.firebase.messaging.i$g */
    /* compiled from: JobIntentService */
    static final class C10808g extends JobServiceEngine implements C10803b {

        /* renamed from: a */
        final C10801i f42235a;

        /* renamed from: b */
        final Object f42236b = new Object();

        /* renamed from: c */
        JobParameters f42237c;

        /* renamed from: io.flutter.plugins.firebase.messaging.i$g$a */
        /* compiled from: JobIntentService */
        final class C10809a implements C10807f {

            /* renamed from: a */
            final JobWorkItem f42238a;

            C10809a(JobWorkItem jobWorkItem) {
                this.f42238a = jobWorkItem;
            }

            public void complete() {
                synchronized (C10808g.this.f42236b) {
                    JobParameters jobParameters = C10808g.this.f42237c;
                    if (jobParameters != null) {
                        try {
                            jobParameters.completeWork(this.f42238a);
                        } catch (SecurityException e) {
                            Log.e("JobServiceEngineImpl", "SecurityException: Failed to run mParams.completeWork(mJobWork)!", e);
                        } catch (IllegalArgumentException e2) {
                            Log.e("JobServiceEngineImpl", "IllegalArgumentException: Failed to run mParams.completeWork(mJobWork)!", e2);
                        }
                    }
                }
            }

            public Intent getIntent() {
                return this.f42238a.getIntent();
            }
        }

        C10808g(C10801i iVar) {
            super(iVar);
            this.f42235a = iVar;
        }

        public IBinder compatGetBinder() {
            return getBinder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x000f, code lost:
            if (r1 == null) goto L_0x0024;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0011, code lost:
            r1.getIntent().setExtrasClassLoader(r5.f42235a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
            return new p264io.flutter.plugins.firebase.messaging.C10801i.C10808g.C10809a(r5, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p264io.flutter.plugins.firebase.messaging.C10801i.C10807f dequeueWork() {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f42236b
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r5.f42237c     // Catch:{ all -> 0x002f }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x002f }
                return r2
            L_0x000a:
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ SecurityException -> 0x0025 }
                monitor-exit(r0)     // Catch:{ all -> 0x002f }
                if (r1 == 0) goto L_0x0024
                android.content.Intent r0 = r1.getIntent()
                io.flutter.plugins.firebase.messaging.i r2 = r5.f42235a
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                io.flutter.plugins.firebase.messaging.i$g$a r0 = new io.flutter.plugins.firebase.messaging.i$g$a
                r0.<init>(r1)
                return r0
            L_0x0024:
                return r2
            L_0x0025:
                r1 = move-exception
                java.lang.String r3 = "JobServiceEngineImpl"
                java.lang.String r4 = "Failed to run mParams.dequeueWork()!"
                android.util.Log.e(r3, r4, r1)     // Catch:{ all -> 0x002f }
                monitor-exit(r0)     // Catch:{ all -> 0x002f }
                return r2
            L_0x002f:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002f }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p264io.flutter.plugins.firebase.messaging.C10801i.C10808g.dequeueWork():io.flutter.plugins.firebase.messaging.i$f");
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f42237c = jobParameters;
            this.f42235a.mo34427e(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean b = this.f42235a.mo34426b();
            synchronized (this.f42236b) {
                this.f42237c = null;
            }
            return b;
        }
    }

    /* renamed from: io.flutter.plugins.firebase.messaging.i$h */
    /* compiled from: JobIntentService */
    static final class C10810h extends C10811i {

        /* renamed from: d */
        private final JobInfo f42240d;

        /* renamed from: e */
        private final JobScheduler f42241e;

        C10810h(Context context, ComponentName componentName, int i) {
            super(componentName);
            mo34445b(i);
            this.f42240d = new JobInfo.Builder(i, this.f42242a).setOverrideDeadline(0).build();
            this.f42241e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo34437a(Intent intent) {
            this.f42241e.enqueue(this.f42240d, new JobWorkItem(intent));
        }
    }

    /* renamed from: io.flutter.plugins.firebase.messaging.i$i */
    /* compiled from: JobIntentService */
    static abstract class C10811i {

        /* renamed from: a */
        final ComponentName f42242a;

        /* renamed from: b */
        boolean f42243b;

        /* renamed from: c */
        int f42244c;

        C10811i(ComponentName componentName) {
            this.f42242a = componentName;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo34437a(Intent intent);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo34445b(int i) {
            if (!this.f42243b) {
                this.f42243b = true;
                this.f42244c = i;
            } else if (this.f42244c != i) {
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.f42244c);
            }
        }

        /* renamed from: c */
        public void mo34438c() {
        }

        /* renamed from: d */
        public void mo34439d() {
        }

        /* renamed from: e */
        public void mo34440e() {
        }
    }

    /* renamed from: c */
    public static void m54021c(Context context, ComponentName componentName, int i, Intent intent, boolean z) {
        if (intent != null) {
            synchronized (f42215h) {
                C10811i f = m54023f(context, componentName, true, i, z);
                f.mo34445b(i);
                try {
                    f.mo34437a(intent);
                } catch (IllegalStateException e) {
                    if (z) {
                        m54023f(context, componentName, true, i, false).mo34437a(intent);
                    } else {
                        throw e;
                    }
                }
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    /* renamed from: d */
    public static void m54022d(Context context, Class cls, int i, Intent intent, boolean z) {
        m54021c(context, new ComponentName(context, cls), i, intent, z);
    }

    /* renamed from: f */
    static C10811i m54023f(Context context, ComponentName componentName, boolean z, int i, boolean z2) {
        C10811i iVar;
        C10806e eVar = new C10806e(componentName, z2);
        HashMap<C10806e, C10811i> hashMap = f42216i;
        C10811i iVar2 = hashMap.get(eVar);
        if (iVar2 != null) {
            return iVar2;
        }
        if (Build.VERSION.SDK_INT < 26 || z2) {
            iVar = new C10804c(context, componentName);
        } else if (z) {
            iVar = new C10810h(context, componentName, i);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        C10811i iVar3 = iVar;
        hashMap.put(eVar, iVar3);
        return iVar3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C10807f mo34425a() {
        C10807f dequeueWork;
        C10803b bVar = this.f42217a;
        if (bVar != null && (dequeueWork = bVar.dequeueWork()) != null) {
            return dequeueWork;
        }
        synchronized (this.f42223g) {
            if (this.f42223g.size() <= 0) {
                return null;
            }
            C10807f remove = this.f42223g.remove(0);
            return remove;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo34426b() {
        C10802a aVar = this.f42219c;
        if (aVar != null) {
            aVar.cancel(this.f42220d);
        }
        this.f42221e = true;
        return mo34397h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo34427e(boolean z) {
        if (this.f42219c == null) {
            this.f42219c = new C10802a();
            C10811i iVar = this.f42218b;
            if (iVar != null && z) {
                iVar.mo34439d();
            }
            this.f42219c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo34396g(Intent intent);

    /* renamed from: h */
    public boolean mo34397h() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo34428i() {
        ArrayList<C10805d> arrayList = this.f42223g;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f42219c = null;
                ArrayList<C10805d> arrayList2 = this.f42223g;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    mo34427e(false);
                } else if (!this.f42222f) {
                    this.f42218b.mo34438c();
                }
            }
        }
    }

    public IBinder onBind(Intent intent) {
        C10803b bVar = this.f42217a;
        if (bVar != null) {
            return bVar.compatGetBinder();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f42217a = new C10808g(this);
            this.f42218b = null;
        }
        this.f42218b = m54023f(this, new ComponentName(this, getClass()), false, 0, true);
    }

    public void onDestroy() {
        super.onDestroy();
        mo34426b();
        synchronized (this.f42223g) {
            this.f42222f = true;
            this.f42218b.mo34438c();
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        this.f42218b.mo34440e();
        synchronized (this.f42223g) {
            ArrayList<C10805d> arrayList = this.f42223g;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C10805d(intent, i2));
            mo34427e(true);
        }
        return 3;
    }
}
