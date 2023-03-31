package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p053g4.C4409t;
import p060h4.C4596v;
import p073j4.C4751b2;

/* renamed from: com.google.android.gms.internal.ads.ms */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2635ms implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private Activity f13465a;

    /* renamed from: b */
    private Context f13466b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Object f13467c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f13468d = true;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f13469e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final List f13470f = new ArrayList();

    /* renamed from: g */
    private final List f13471g = new ArrayList();

    /* renamed from: h */
    private Runnable f13472h;

    /* renamed from: i */
    private boolean f13473i = false;

    /* renamed from: r */
    private long f13474r;

    C2635ms() {
    }

    /* renamed from: k */
    private final void m16675k(Activity activity) {
        synchronized (this.f13467c) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f13465a = activity;
            }
        }
    }

    /* renamed from: a */
    public final Activity mo12420a() {
        return this.f13465a;
    }

    /* renamed from: b */
    public final Context mo12421b() {
        return this.f13466b;
    }

    /* renamed from: f */
    public final void mo12422f(C2672ns nsVar) {
        synchronized (this.f13467c) {
            this.f13470f.add(nsVar);
        }
    }

    /* renamed from: g */
    public final void mo12423g(Application application, Context context) {
        if (!this.f13473i) {
            application.registerActivityLifecycleCallbacks(this);
            if (context instanceof Activity) {
                m16675k((Activity) context);
            }
            this.f13466b = application;
            this.f13474r = ((Long) C4596v.m30088c().mo12227b(C2679nz.f14363M0)).longValue();
            this.f13473i = true;
        }
    }

    /* renamed from: h */
    public final void mo12424h(C2672ns nsVar) {
        synchronized (this.f13467c) {
            this.f13470f.remove(nsVar);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f13467c) {
            Activity activity2 = this.f13465a;
            if (activity2 != null) {
                if (activity2.equals(activity)) {
                    this.f13465a = null;
                }
                Iterator it = this.f13471g.iterator();
                while (it.hasNext()) {
                    try {
                        if (((C2227bt) it.next()).zza()) {
                            it.remove();
                        }
                    } catch (Exception e) {
                        C4409t.m29325q().mo15126t(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        pm0.m18665e("", e);
                    }
                }
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        m16675k(activity);
        synchronized (this.f13467c) {
            for (C2227bt d : this.f13471g) {
                try {
                    d.mo8928d();
                } catch (Exception e) {
                    C4409t.m29325q().mo15126t(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    pm0.m18665e("", e);
                }
            }
        }
        this.f13469e = true;
        Runnable runnable = this.f13472h;
        if (runnable != null) {
            C4751b2.f25403i.removeCallbacks(runnable);
        }
        b53 b53 = C4751b2.f25403i;
        C2598ls lsVar = new C2598ls(this);
        this.f13472h = lsVar;
        b53.postDelayed(lsVar, this.f13474r);
    }

    public final void onActivityResumed(Activity activity) {
        m16675k(activity);
        this.f13469e = false;
        boolean z = !this.f13468d;
        this.f13468d = true;
        Runnable runnable = this.f13472h;
        if (runnable != null) {
            C4751b2.f25403i.removeCallbacks(runnable);
        }
        synchronized (this.f13467c) {
            for (C2227bt e : this.f13471g) {
                try {
                    e.mo8929e();
                } catch (Exception e2) {
                    C4409t.m29325q().mo15126t(e2, "AppActivityTracker.ActivityListener.onActivityResumed");
                    pm0.m18665e("", e2);
                }
            }
            if (z) {
                for (C2672ns b : this.f13470f) {
                    try {
                        b.mo9213b(true);
                    } catch (Exception e3) {
                        pm0.m18665e("", e3);
                    }
                }
            } else {
                pm0.m18662b("App is still foreground.");
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        m16675k(activity);
    }

    public final void onActivityStopped(Activity activity) {
    }
}
