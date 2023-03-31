package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.hf */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2436hf implements C2548kf {

    /* renamed from: a */
    final /* synthetic */ Activity f10311a;

    C2436hf(C2585lf lfVar, Activity activity) {
        this.f10311a = activity;
    }

    /* renamed from: a */
    public final void mo9564a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f10311a);
    }
}
