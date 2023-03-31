package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.fs */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2375fs implements C2412gs {

    /* renamed from: a */
    final /* synthetic */ Activity f9421a;

    C2375fs(C2449hs hsVar, Activity activity) {
        this.f9421a = activity;
    }

    /* renamed from: a */
    public final void mo8520a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f9421a);
    }
}
