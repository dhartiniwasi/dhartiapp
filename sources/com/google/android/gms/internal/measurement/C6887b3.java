package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.measurement.b3 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class C6887b3 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    final /* synthetic */ C6904c3 f31583a;

    C6887b3(C6904c3 c3Var) {
        this.f31583a = c3Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f31583a.m39703r(new C7180t2(this, bundle, activity));
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f31583a.m39703r(new C6870a3(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        this.f31583a.m39703r(new C7244x2(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        this.f31583a.m39703r(new C7212v2(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C6885b1 b1Var = new C6885b1();
        this.f31583a.m39703r(new C7276z2(this, activity, b1Var));
        Bundle B0 = b1Var.mo23036B0(50);
        if (B0 != null) {
            bundle.putAll(B0);
        }
    }

    public final void onActivityStarted(Activity activity) {
        this.f31583a.m39703r(new C7196u2(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        this.f31583a.m39703r(new C7260y2(this, activity));
    }
}
