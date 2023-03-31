package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.cs */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2263cs implements C2412gs {

    /* renamed from: a */
    final /* synthetic */ Activity f7888a;

    C2263cs(C2449hs hsVar, Activity activity) {
        this.f7888a = activity;
    }

    /* renamed from: a */
    public final void mo8520a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f7888a);
    }
}
