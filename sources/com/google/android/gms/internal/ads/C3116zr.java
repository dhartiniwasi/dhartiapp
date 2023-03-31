package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.zr */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C3116zr implements C2412gs {

    /* renamed from: a */
    final /* synthetic */ Activity f21245a;

    C3116zr(C2449hs hsVar, Activity activity) {
        this.f21245a = activity;
    }

    /* renamed from: a */
    public final void mo8520a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f21245a);
    }
}
