package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.hs */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2449hs implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final Application f10466a;

    /* renamed from: b */
    private final WeakReference f10467b;

    /* renamed from: c */
    private boolean f10468c = false;

    public C2449hs(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f10467b = new WeakReference(activityLifecycleCallbacks);
        this.f10466a = application;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10933a(C2412gs gsVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f10467b.get();
            if (activityLifecycleCallbacks != null) {
                gsVar.mo8520a(activityLifecycleCallbacks);
            } else if (!this.f10468c) {
                this.f10466a.unregisterActivityLifecycleCallbacks(this);
                this.f10468c = true;
            }
        } catch (Exception e) {
            pm0.m18665e("Error while dispatching lifecycle callback.", e);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        mo10933a(new C3079yr(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        mo10933a(new C2375fs(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        mo10933a(new C2226bs(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        mo10933a(new C2189as(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        mo10933a(new C2337es(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        mo10933a(new C3116zr(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        mo10933a(new C2263cs(this, activity));
    }
}
