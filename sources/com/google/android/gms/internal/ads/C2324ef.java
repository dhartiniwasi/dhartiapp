package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.ef */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2324ef implements C2548kf {

    /* renamed from: a */
    final /* synthetic */ Activity f8788a;

    C2324ef(C2585lf lfVar, Activity activity) {
        this.f8788a = activity;
    }

    /* renamed from: a */
    public final void mo9564a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f8788a);
    }
}
