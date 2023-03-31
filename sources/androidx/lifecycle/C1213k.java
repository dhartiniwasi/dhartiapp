package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.lifecycle.k */
/* compiled from: LifecycleDispatcher */
class C1213k {

    /* renamed from: a */
    private static AtomicBoolean f3337a = new AtomicBoolean(false);

    /* renamed from: androidx.lifecycle.k$a */
    /* compiled from: LifecycleDispatcher */
    static class C1214a extends C1188e {
        C1214a() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C1236x.m5481g(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    static void m5430a(Context context) {
        if (!f3337a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C1214a());
        }
    }
}
