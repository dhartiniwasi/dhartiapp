package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.jf */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2511jf implements C2548kf {

    /* renamed from: a */
    final /* synthetic */ Activity f11531a;

    C2511jf(C2585lf lfVar, Activity activity) {
        this.f11531a = activity;
    }

    /* renamed from: a */
    public final void mo9564a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f11531a);
    }
}
