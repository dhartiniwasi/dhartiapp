package p144t5;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: t5.x */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
final class C5607x implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final Activity f28236a;

    /* renamed from: b */
    final /* synthetic */ C5613z f28237b;

    public C5607x(C5613z zVar, Activity activity) {
        this.f28237b = zVar;
        this.f28236a = activity;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        if (activity == this.f28236a) {
            this.f28237b.mo19915e(new C5600u1(3, "Activity is destroyed."));
        }
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
