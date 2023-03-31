package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.if */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2474if implements C2548kf {

    /* renamed from: a */
    final /* synthetic */ Activity f10761a;

    /* renamed from: b */
    final /* synthetic */ Bundle f10762b;

    C2474if(C2585lf lfVar, Activity activity, Bundle bundle) {
        this.f10761a = activity;
        this.f10762b = bundle;
    }

    /* renamed from: a */
    public final void mo9564a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f10761a, this.f10762b);
    }
}
