package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.gf */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2399gf implements C2548kf {

    /* renamed from: a */
    final /* synthetic */ Activity f9886a;

    C2399gf(C2585lf lfVar, Activity activity) {
        this.f9886a = activity;
    }

    /* renamed from: a */
    public final void mo9564a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f9886a);
    }
}
