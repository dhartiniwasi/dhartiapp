package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class n03 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d */
    private static final n03 f13746d = new n03();

    /* renamed from: a */
    private boolean f13747a;

    /* renamed from: b */
    private boolean f13748b;

    /* renamed from: c */
    private s03 f13749c;

    private n03() {
    }

    /* renamed from: a */
    public static n03 m16839a() {
        return f13746d;
    }

    /* renamed from: e */
    private final void m16840e() {
        boolean z = this.f13748b;
        for (a03 g : m03.m16344a().mo12245c()) {
            y03 g2 = g.mo8162g();
            if (g2.mo15269k()) {
                r03.m19513a().mo13634b(g2.mo15262a(), "setState", true != z ? "foregrounded" : "backgrounded");
            }
        }
    }

    /* renamed from: f */
    private final void m16841f(boolean z) {
        if (this.f13748b != z) {
            this.f13748b = z;
            if (this.f13747a) {
                m16840e();
                if (this.f13749c == null) {
                    return;
                }
                if (!z) {
                    p13.m18272d().mo13103i();
                } else {
                    p13.m18272d().mo13102h();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo12477b() {
        this.f13747a = true;
        this.f13748b = false;
        m16840e();
    }

    /* renamed from: c */
    public final void mo12478c() {
        this.f13747a = false;
        this.f13748b = false;
        this.f13749c = null;
    }

    /* renamed from: d */
    public final void mo12479d(s03 s03) {
        this.f13749c = s03;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        m16841f(false);
    }

    public final void onActivityStopped(Activity activity) {
        View f;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i = runningAppProcessInfo.importance;
        boolean z = true;
        boolean z2 = true;
        for (a03 a03 : m03.m16344a().mo12244b()) {
            if (a03.mo8165j() && (f = a03.mo8161f()) != null && f.hasWindowFocus()) {
                z2 = false;
            }
        }
        if (i == 100 || !z2) {
            z = false;
        }
        m16841f(z);
    }
}
