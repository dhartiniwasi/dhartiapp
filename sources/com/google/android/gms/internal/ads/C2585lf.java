package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.lf */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2585lf implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final Application f12762a;

    /* renamed from: b */
    private final WeakReference f12763b;

    /* renamed from: c */
    private boolean f12764c = false;

    public C2585lf(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f12763b = new WeakReference(activityLifecycleCallbacks);
        this.f12762a = application;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11989a(C2548kf kfVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f12763b.get();
            if (activityLifecycleCallbacks != null) {
                kfVar.mo9564a(activityLifecycleCallbacks);
            } else if (!this.f12764c) {
                this.f12762a.unregisterActivityLifecycleCallbacks(this);
                this.f12764c = true;
            }
        } catch (Exception unused) {
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        mo11989a(new C2287df(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        mo11989a(new C2511jf(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        mo11989a(new C2399gf(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        mo11989a(new C2362ff(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        mo11989a(new C2474if(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        mo11989a(new C2324ef(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        mo11989a(new C2436hf(this, activity));
    }
}
