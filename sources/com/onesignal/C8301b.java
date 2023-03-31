package com.onesignal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.os.Bundle;

/* renamed from: com.onesignal.b */
/* compiled from: ActivityLifecycleListener */
class C8301b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static C8301b f35327a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static C8289a f35328b;

    /* renamed from: c */
    private static ComponentCallbacks f35329c;

    /* renamed from: com.onesignal.b$a */
    /* compiled from: ActivityLifecycleListener */
    class C8302a implements ComponentCallbacks {
        C8302a() {
        }

        public void onConfigurationChanged(Configuration configuration) {
            C8301b.f35328b.mo27583o(configuration, C8301b.f35328b.mo27576d());
        }

        public void onLowMemory() {
        }
    }

    C8301b() {
    }

    /* renamed from: b */
    public static C8289a m46281b() {
        return f35328b;
    }

    /* renamed from: c */
    static void m46282c(Application application) {
        if (f35327a == null) {
            C8301b bVar = new C8301b();
            f35327a = bVar;
            application.registerActivityLifecycleCallbacks(bVar);
        }
        if (f35328b == null) {
            f35328b = new C8289a(new OSFocusHandler());
        }
        if (f35329c == null) {
            C8302a aVar = new C8302a();
            f35329c = aVar;
            application.registerComponentCallbacks(aVar);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C8289a aVar = f35328b;
        if (aVar != null) {
            aVar.mo27577i(activity);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        C8289a aVar = f35328b;
        if (aVar != null) {
            aVar.mo27578j(activity);
        }
    }

    public void onActivityPaused(Activity activity) {
        C8289a aVar = f35328b;
        if (aVar != null) {
            aVar.mo27579k(activity);
        }
    }

    public void onActivityResumed(Activity activity) {
        C8289a aVar = f35328b;
        if (aVar != null) {
            aVar.mo27580l(activity);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        C8289a aVar = f35328b;
        if (aVar != null) {
            aVar.mo27581m(activity);
        }
    }

    public void onActivityStopped(Activity activity) {
        C8289a aVar = f35328b;
        if (aVar != null) {
            aVar.mo27582n(activity);
        }
    }
}
