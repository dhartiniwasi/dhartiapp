package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.ff */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2362ff implements C2548kf {

    /* renamed from: a */
    final /* synthetic */ Activity f9265a;

    C2362ff(C2585lf lfVar, Activity activity) {
        this.f9265a = activity;
    }

    /* renamed from: a */
    public final void mo9564a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f9265a);
    }
}
