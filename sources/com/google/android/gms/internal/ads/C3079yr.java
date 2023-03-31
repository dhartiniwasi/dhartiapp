package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.yr */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C3079yr implements C2412gs {

    /* renamed from: a */
    final /* synthetic */ Activity f20789a;

    /* renamed from: b */
    final /* synthetic */ Bundle f20790b;

    C3079yr(C2449hs hsVar, Activity activity, Bundle bundle) {
        this.f20789a = activity;
        this.f20790b = bundle;
    }

    /* renamed from: a */
    public final void mo8520a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f20789a, this.f20790b);
    }
}
