package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.as */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2189as implements C2412gs {

    /* renamed from: a */
    final /* synthetic */ Activity f6753a;

    C2189as(C2449hs hsVar, Activity activity) {
        this.f6753a = activity;
    }

    /* renamed from: a */
    public final void mo8520a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f6753a);
    }
}
