package androidx.core.app;

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
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
/* renamed from: androidx.core.app.h */
/* compiled from: JobIntentService */
public abstract class C0637h extends Service {

    /* renamed from: h */
    static final Object f2045h = new Object();

    /* renamed from: i */
    static final HashMap<ComponentName, C0646h> f2046i = new HashMap<>();

    /* renamed from: a */
    C0639b f2047a;

    /* renamed from: b */
    C0646h f2048b;

    /* renamed from: c */
    C0638a f2049c;

    /* renamed from: d */
    boolean f2050d = false;

    /* renamed from: e */
    boolean f2051e = false;

    /* renamed from: f */
    boolean f2052f = false;

    /* renamed from: g */
    final ArrayList<C0641d> f2053g;

    /* renamed from: androidx.core.app.h$a */
    /* compiled from: JobIntentService */
    final class C0638a extends AsyncTask<Void, Void, Void> {
        C0638a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                C0642e a = C0637h.this.mo2870a();
                if (a == null) {
                    return null;
                }
                C0637h.this.mo2873e(a.getIntent());
                a.complete();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onCancelled(Void voidR) {
            C0637h.this.mo2875g();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(Void voidR) {
            C0637h.this.mo2875g();
        }
    }

    /* renamed from: androidx.core.app.h$b */
    /* compiled from: JobIntentService */
    interface C0639b {
        IBinder compatGetBinder();

        C0642e dequeueWork();
    }

    /* renamed from: androidx.core.app.h$c */
    /* compiled from: JobIntentService */
    static final class C0640c extends C0646h {

        /* renamed from: d */
        private final Context f2055d;

        /* renamed from: e */
        private final PowerManager.WakeLock f2056e;

        /* renamed from: f */
        private final PowerManager.WakeLock f2057f;

        /* renamed from: g */
        boolean f2058g;

        /* renamed from: h */
        boolean f2059h;

        C0640c(Context context, ComponentName componentName) {
            super(componentName);
            this.f2055d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f2056e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f2057f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        /* renamed from: b */
        public void mo2888b() {
            synchronized (this) {
                if (this.f2059h) {
                    if (this.f2058g) {
                        this.f2056e.acquire(60000);
                    }
                    this.f2059h = false;
                    this.f2057f.release();
                }
            }
        }

        /* renamed from: c */
        public void mo2889c() {
            synchronized (this) {
                if (!this.f2059h) {
                    this.f2059h = true;
                    this.f2057f.acquire(600000);
                    this.f2056e.release();
                }
            }
        }

        /* renamed from: d */
        public void mo2890d() {
            synchronized (this) {
                this.f2058g = false;
            }
        }
    }

    /* renamed from: androidx.core.app.h$d */
    /* compiled from: JobIntentService */
    final class C0641d implements C0642e {

        /* renamed from: a */
        final Intent f2060a;

        /* renamed from: b */
        final int f2061b;

        C0641d(Intent intent, int i) {
            this.f2060a = intent;
            this.f2061b = i;
        }

        public void complete() {
            C0637h.this.stopSelf(this.f2061b);
        }

        public Intent getIntent() {
            return this.f2060a;
        }
    }

    /* renamed from: androidx.core.app.h$e */
    /* compiled from: JobIntentService */
    interface C0642e {
        void complete();

        Intent getIntent();
    }

    /* renamed from: androidx.core.app.h$f */
    /* compiled from: JobIntentService */
    static final class C0643f extends JobServiceEngine implements C0639b {

        /* renamed from: a */
        final C0637h f2063a;

        /* renamed from: b */
        final Object f2064b = new Object();

        /* renamed from: c */
        JobParameters f2065c;

        /* renamed from: androidx.core.app.h$f$a */
        /* compiled from: JobIntentService */
        final class C0644a implements C0642e {

            /* renamed from: a */
            final JobWorkItem f2066a;

            C0644a(JobWorkItem jobWorkItem) {
                this.f2066a = jobWorkItem;
            }

            public void complete() {
                synchronized (C0643f.this.f2064b) {
                    JobParameters jobParameters = C0643f.this.f2065c;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f2066a);
                    }
                }
            }

            public Intent getIntent() {
                return this.f2066a.getIntent();
            }
        }

        C0643f(C0637h hVar) {
            super(hVar);
            this.f2063a = hVar;
        }

        public IBinder compatGetBinder() {
            return getBinder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
            r1.getIntent().setExtrasClassLoader(r3.f2063a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
            return new androidx.core.app.C0637h.C0643f.C0644a(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
            if (r1 == null) goto L_0x0024;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.core.app.C0637h.C0642e dequeueWork() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f2064b
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.f2065c     // Catch:{ all -> 0x0025 }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                return r2
            L_0x000a:
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ all -> 0x0025 }
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                if (r1 == 0) goto L_0x0024
                android.content.Intent r0 = r1.getIntent()
                androidx.core.app.h r2 = r3.f2063a
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                androidx.core.app.h$f$a r0 = new androidx.core.app.h$f$a
                r0.<init>(r1)
                return r0
            L_0x0024:
                return r2
            L_0x0025:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C0637h.C0643f.dequeueWork():androidx.core.app.h$e");
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f2065c = jobParameters;
            this.f2063a.mo2872c(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean b = this.f2063a.mo2871b();
            synchronized (this.f2064b) {
                this.f2065c = null;
            }
            return b;
        }
    }

    /* renamed from: androidx.core.app.h$g */
    /* compiled from: JobIntentService */
    static final class C0645g extends C0646h {

        /* renamed from: d */
        private final JobInfo f2068d;

        /* renamed from: e */
        private final JobScheduler f2069e;

        C0645g(Context context, ComponentName componentName, int i) {
            super(componentName);
            mo2895a(i);
            this.f2068d = new JobInfo.Builder(i, this.f2070a).setOverrideDeadline(0).build();
            this.f2069e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }
    }

    /* renamed from: androidx.core.app.h$h */
    /* compiled from: JobIntentService */
    static abstract class C0646h {

        /* renamed from: a */
        final ComponentName f2070a;

        /* renamed from: b */
        boolean f2071b;

        /* renamed from: c */
        int f2072c;

        C0646h(ComponentName componentName) {
            this.f2070a = componentName;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2895a(int i) {
            if (!this.f2071b) {
                this.f2071b = true;
                this.f2072c = i;
            } else if (this.f2072c != i) {
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.f2072c);
            }
        }

        /* renamed from: b */
        public void mo2888b() {
        }

        /* renamed from: c */
        public void mo2889c() {
        }

        /* renamed from: d */
        public void mo2890d() {
        }
    }

    public C0637h() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2053g = null;
        } else {
            this.f2053g = new ArrayList<>();
        }
    }

    /* renamed from: d */
    static C0646h m2966d(Context context, ComponentName componentName, boolean z, int i) {
        C0646h hVar;
        HashMap<ComponentName, C0646h> hashMap = f2046i;
        C0646h hVar2 = hashMap.get(componentName);
        if (hVar2 != null) {
            return hVar2;
        }
        if (Build.VERSION.SDK_INT < 26) {
            hVar = new C0640c(context, componentName);
        } else if (z) {
            hVar = new C0645g(context, componentName, i);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        C0646h hVar3 = hVar;
        hashMap.put(componentName, hVar3);
        return hVar3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0642e mo2870a() {
        C0639b bVar = this.f2047a;
        if (bVar != null) {
            return bVar.dequeueWork();
        }
        synchronized (this.f2053g) {
            if (this.f2053g.size() <= 0) {
                return null;
            }
            C0642e remove = this.f2053g.remove(0);
            return remove;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo2871b() {
        C0638a aVar = this.f2049c;
        if (aVar != null) {
            aVar.cancel(this.f2050d);
        }
        this.f2051e = true;
        return mo2874f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2872c(boolean z) {
        if (this.f2049c == null) {
            this.f2049c = new C0638a();
            C0646h hVar = this.f2048b;
            if (hVar != null && z) {
                hVar.mo2889c();
            }
            this.f2049c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo2873e(Intent intent);

    /* renamed from: f */
    public boolean mo2874f() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2875g() {
        ArrayList<C0641d> arrayList = this.f2053g;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f2049c = null;
                ArrayList<C0641d> arrayList2 = this.f2053g;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    mo2872c(false);
                } else if (!this.f2052f) {
                    this.f2048b.mo2888b();
                }
            }
        }
    }

    public IBinder onBind(Intent intent) {
        C0639b bVar = this.f2047a;
        if (bVar != null) {
            return bVar.compatGetBinder();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2047a = new C0643f(this);
            this.f2048b = null;
            return;
        }
        this.f2047a = null;
        this.f2048b = m2966d(this, new ComponentName(this, getClass()), false, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList<C0641d> arrayList = this.f2053g;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f2052f = true;
                this.f2048b.mo2888b();
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.f2053g == null) {
            return 2;
        }
        this.f2048b.mo2890d();
        synchronized (this.f2053g) {
            ArrayList<C0641d> arrayList = this.f2053g;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C0641d(intent, i2));
            mo2872c(true);
        }
        return 3;
    }
}
