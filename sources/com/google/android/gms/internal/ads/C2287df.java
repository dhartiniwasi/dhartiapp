package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.df */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2287df implements C2548kf {

    /* renamed from: a */
    final /* synthetic */ Activity f8230a;

    /* renamed from: b */
    final /* synthetic */ Bundle f8231b;

    C2287df(C2585lf lfVar, Activity activity, Bundle bundle) {
        this.f8230a = activity;
        this.f8231b = bundle;
    }

    /* renamed from: a */
    public final void mo9564a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f8230a, this.f8231b);
    }
}
