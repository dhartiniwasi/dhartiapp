package com.startapp;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import java.util.Collections;
import p201ca.C6841a;

/* renamed from: com.startapp.ae */
/* compiled from: Sta */
public class C8832ae implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d */
    public static C8832ae f36432d = new C8832ae();

    /* renamed from: a */
    public boolean f36433a;

    /* renamed from: b */
    public boolean f36434b;

    /* renamed from: c */
    public C8833a f36435c;

    /* renamed from: com.startapp.ae$a */
    /* compiled from: Sta */
    public interface C8833a {
    }

    /* renamed from: a */
    public final void mo29113a(boolean z) {
        if (this.f36434b != z) {
            this.f36434b = z;
            if (this.f36433a) {
                mo29112a();
                if (this.f36435c == null) {
                    return;
                }
                if (!z) {
                    C9008hb.f36917h.mo29458a();
                    return;
                }
                C9008hb.f36917h.getClass();
                Handler handler = C9008hb.f36919j;
                if (handler != null) {
                    handler.removeCallbacks(C9008hb.f36921l);
                    C9008hb.f36919j = null;
                }
            }
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        mo29113a(false);
    }

    public void onActivityStopped(Activity activity) {
        View b;
        if (Build.VERSION.SDK_INT >= 16) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            boolean z = true;
            boolean z2 = runningAppProcessInfo.importance != 100;
            boolean z3 = true;
            for (T t : Collections.unmodifiableCollection(C9228pd.f38085c.f38087b)) {
                if (t.mo29885c() && (b = t.mo29884b()) != null && b.hasWindowFocus()) {
                    z3 = false;
                }
            }
            if (!z2 || !z3) {
                z = false;
            }
            mo29113a(z);
        }
    }

    /* renamed from: a */
    public final void mo29112a() {
        boolean z = !this.f36434b;
        for (T t : Collections.unmodifiableCollection(C9228pd.f38085c.f38086a)) {
            C6841a aVar = t.f38168e;
            if (aVar.f31483a.get() != null) {
                C9268re.f38174a.mo29889a(aVar.mo22948c(), "setState", z ? "foregrounded" : "backgrounded");
            }
        }
    }
}
