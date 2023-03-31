package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.bs */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2226bs implements C2412gs {

    /* renamed from: a */
    final /* synthetic */ Activity f7451a;

    C2226bs(C2449hs hsVar, Activity activity) {
        this.f7451a = activity;
    }

    /* renamed from: a */
    public final void mo8520a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f7451a);
    }
}
