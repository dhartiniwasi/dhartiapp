package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.es */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2337es implements C2412gs {

    /* renamed from: a */
    final /* synthetic */ Activity f8909a;

    /* renamed from: b */
    final /* synthetic */ Bundle f8910b;

    C2337es(C2449hs hsVar, Activity activity, Bundle bundle) {
        this.f8909a = activity;
        this.f8910b = bundle;
    }

    /* renamed from: a */
    public final void mo8520a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f8909a, this.f8910b);
    }
}
