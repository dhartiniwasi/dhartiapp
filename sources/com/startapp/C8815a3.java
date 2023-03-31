package com.startapp;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import com.startapp.networkTest.startapp.CoverageMapperManager;
import com.startapp.networkTest.startapp.NetworkTester;
import com.startapp.networkTest.threads.ThreadManager;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.startapp.a3 */
/* compiled from: Sta */
public class C8815a3 implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: h */
    private static final String f36377h = C8815a3.class.getSimpleName();

    /* renamed from: i */
    private static final boolean f36378i = false;

    /* renamed from: a */
    private Application f36379a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ScheduledFuture<?> f36380b;

    /* renamed from: c */
    private int f36381c = -1;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f36382d = 0;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f36383e = false;

    /* renamed from: f */
    private CoverageMapperManager f36384f;

    /* renamed from: g */
    private final Runnable f36385g = new C8816a();

    /* renamed from: com.startapp.a3$a */
    /* compiled from: Sta */
    public class C8816a implements Runnable {
        public C8816a() {
        }

        public void run() {
            C8815a3.this.m48232c();
            if (C8815a3.this.f36382d == 0 && !C8815a3.this.f36383e) {
                C8815a3.this.f36380b.cancel(false);
            }
        }
    }

    /* renamed from: com.startapp.a3$b */
    /* compiled from: Sta */
    public class C8817b implements NetworkTester.C9175b {
        public C8817b() {
        }

        /* renamed from: a */
        public void mo29069a(boolean z) {
        }
    }

    public C8815a3(Context context, CoverageMapperManager coverageMapperManager) {
        this.f36379a = (Application) context.getApplicationContext();
        this.f36384f = coverageMapperManager;
    }

    /* renamed from: f */
    private void m48235f() {
        this.f36384f.mo29755c();
    }

    /* renamed from: g */
    private void m48236g() {
        m48238j();
        long FOREGROUND_TEST_CT_SCHEDULE_INTERVAL = C8821a5.m48254b().FOREGROUND_TEST_CT_SCHEDULE_INTERVAL();
        if (FOREGROUND_TEST_CT_SCHEDULE_INTERVAL > 0) {
            this.f36380b = ThreadManager.m49065b().mo29770d().scheduleWithFixedDelay(this.f36385g, FOREGROUND_TEST_CT_SCHEDULE_INTERVAL, FOREGROUND_TEST_CT_SCHEDULE_INTERVAL, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: i */
    private void m48237i() {
        this.f36384f.mo29757f();
    }

    /* renamed from: j */
    private void m48238j() {
        ScheduledFuture<?> scheduledFuture = this.f36380b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f36380b = null;
        }
    }

    /* renamed from: e */
    public void mo29056e() {
        this.f36381c = 0;
        this.f36379a.registerActivityLifecycleCallbacks(this);
        this.f36379a.registerComponentCallbacks(this);
    }

    /* renamed from: h */
    public void mo29057h() {
        this.f36379a.unregisterActivityLifecycleCallbacks(this);
        this.f36379a.unregisterComponentCallbacks(this);
        this.f36381c = -1;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
        if (activity.isTaskRoot() && this.f36382d < 0) {
            this.f36382d = 0;
        }
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        int i = this.f36382d + 1;
        this.f36382d = i;
        if (i == 1 && !this.f36383e) {
            m48228a();
        }
    }

    public void onActivityStopped(Activity activity) {
        boolean isChangingConfigurations = activity.isChangingConfigurations();
        this.f36383e = isChangingConfigurations;
        int i = this.f36382d - 1;
        this.f36382d = i;
        if (i == 0 && !isChangingConfigurations) {
            m48231b();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i) {
    }

    /* renamed from: a */
    private void m48228a() {
        this.f36381c = 1;
        if (C8821a5.m48254b().FOREGROUND_TEST_CT_ENABLED()) {
            m48232c();
            m48236g();
        }
        if (C8821a5.m48254b().FOREGROUND_TEST_NIR_ENABLED()) {
            m48235f();
        }
    }

    /* renamed from: b */
    private void m48231b() {
        this.f36381c = 0;
        m48237i();
        m48238j();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m48232c() {
        NetworkTester.runTests(this.f36379a, new C8817b());
    }

    /* renamed from: d */
    public int mo29055d() {
        return this.f36381c;
    }
}
