package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p067i5.C4699m;

/* renamed from: com.google.android.gms.common.api.internal.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C2069a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e */
    private static final C2069a f6084e = new C2069a();

    /* renamed from: a */
    private final AtomicBoolean f6085a = new AtomicBoolean();

    /* renamed from: b */
    private final AtomicBoolean f6086b = new AtomicBoolean();

    /* renamed from: c */
    private final ArrayList f6087c = new ArrayList();

    /* renamed from: d */
    private boolean f6088d = false;

    /* renamed from: com.google.android.gms.common.api.internal.a$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface C2070a {
        /* renamed from: a */
        void mo8022a(boolean z);
    }

    private C2069a() {
    }

    /* renamed from: b */
    public static C2069a m9141b() {
        return f6084e;
    }

    /* renamed from: c */
    public static void m9142c(Application application) {
        C2069a aVar = f6084e;
        synchronized (aVar) {
            if (!aVar.f6088d) {
                application.registerActivityLifecycleCallbacks(aVar);
                application.registerComponentCallbacks(aVar);
                aVar.f6088d = true;
            }
        }
    }

    /* renamed from: f */
    private final void m9143f(boolean z) {
        synchronized (f6084e) {
            Iterator it = this.f6087c.iterator();
            while (it.hasNext()) {
                ((C2070a) it.next()).mo8022a(z);
            }
        }
    }

    /* renamed from: a */
    public void mo8009a(C2070a aVar) {
        synchronized (f6084e) {
            this.f6087c.add(aVar);
        }
    }

    /* renamed from: d */
    public boolean mo8010d() {
        return this.f6085a.get();
    }

    /* renamed from: e */
    public boolean mo8011e(boolean z) {
        if (!this.f6086b.get()) {
            if (!C4699m.m30411b()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f6086b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f6085a.set(true);
            }
        }
        return mo8010d();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f6085a.compareAndSet(true, false);
        this.f6086b.set(true);
        if (compareAndSet) {
            m9143f(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f6085a.compareAndSet(true, false);
        this.f6086b.set(true);
        if (compareAndSet) {
            m9143f(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f6085a.compareAndSet(false, true)) {
            this.f6086b.set(true);
            m9143f(true);
        }
    }
}
