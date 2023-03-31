package com.startapp;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.remoteconfig.AppSessionConfig;
import com.startapp.sdk.components.C9522y;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.triggeredlinks.AppEventsMetadata;
import com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata;
import java.util.Map;

/* renamed from: com.startapp.h0 */
/* compiled from: Sta */
public class C8992h0 extends C9109l2 {

    /* renamed from: a */
    public final C9019i0 f36886a;

    /* renamed from: b */
    public int f36887b;

    /* renamed from: c */
    public boolean f36888c;

    /* renamed from: d */
    public boolean f36889d;

    public C8992h0(C9019i0 i0Var) {
        this.f36886a = i0Var;
    }

    public void onActivityStarted(Activity activity) {
        if (activity != null) {
            int i = this.f36887b + 1;
            this.f36887b = i;
            if (i == 1 && !this.f36888c) {
                Map<String, String> map = null;
                if (!this.f36889d) {
                    this.f36889d = true;
                    StartAppSDKInternal startAppSDKInternal = (StartAppSDKInternal) this.f36886a;
                    StartAppSDKInternal.m49732h(startAppSDKInternal.f38674h);
                    C9090kb kbVar = startAppSDKInternal.f38665B;
                    if (kbVar != null) {
                        TriggeredLinksMetadata a = kbVar.mo29612a();
                        AppEventsMetadata a2 = a != null ? a.mo31246a() : null;
                        Map<String, String> c = a2 != null ? a2.mo31237c() : null;
                        if (c != null) {
                            kbVar.mo29615a(a, c, "Launch");
                        }
                    }
                }
                StartAppSDKInternal startAppSDKInternal2 = (StartAppSDKInternal) this.f36886a;
                Application application = startAppSDKInternal2.f38674h;
                if (application != null) {
                    C9558ta v = ComponentLocator.m50248a((Context) application).mo31186v();
                    v.f39196b.execute(new C9264ra(v));
                    C9667ye x = ComponentLocator.m50248a((Context) startAppSDKInternal2.f38674h).mo31188x();
                    ((C9522y) x.f39453a).getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = x.f39457e;
                    AppSessionConfig call = x.f39454b.call();
                    if (elapsedRealtime > Math.max(0, call != null ? call.mo30953a() : 600000) + j || x.f39456d <= 0) {
                        x.f39456d = elapsedRealtime;
                        x.f39455c.clear();
                    }
                }
                StartAppSDKInternal.m49732h(startAppSDKInternal2.f38674h);
                C9090kb kbVar2 = startAppSDKInternal2.f38665B;
                if (kbVar2 != null) {
                    TriggeredLinksMetadata a3 = kbVar2.mo29612a();
                    AppEventsMetadata a4 = a3 != null ? a3.mo31246a() : null;
                    if (a4 != null) {
                        map = a4.mo31235a();
                    }
                    if (map != null) {
                        kbVar2.mo29615a(a3, map, "Active");
                    }
                }
            }
        }
    }

    public void onActivityStopped(Activity activity) {
        if (activity != null) {
            this.f36887b--;
            boolean isChangingConfigurations = activity.isChangingConfigurations();
            this.f36888c = isChangingConfigurations;
            if (this.f36887b == 0 && !isChangingConfigurations) {
                StartAppSDKInternal startAppSDKInternal = (StartAppSDKInternal) this.f36886a;
                Application application = startAppSDKInternal.f38674h;
                if (application != null) {
                    C9558ta v = ComponentLocator.m50248a((Context) application).mo31186v();
                    v.f39196b.execute(new C9282sa(v));
                    C9667ye x = ComponentLocator.m50248a((Context) startAppSDKInternal.f38674h).mo31188x();
                    ((C9522y) x.f39453a).getClass();
                    x.f39457e = SystemClock.elapsedRealtime();
                }
                StartAppSDKInternal.m49732h(startAppSDKInternal.f38674h);
                C9090kb kbVar = startAppSDKInternal.f38665B;
                if (kbVar != null) {
                    TriggeredLinksMetadata a = kbVar.mo29612a();
                    Map<String, String> map = null;
                    AppEventsMetadata a2 = a != null ? a.mo31246a() : null;
                    if (a2 != null) {
                        map = a2.mo31236b();
                    }
                    if (map != null) {
                        kbVar.mo29615a(a, map, "Inactive");
                    }
                }
                Application application2 = startAppSDKInternal.f38674h;
                if (application2 != null) {
                    try {
                        ComponentLocator.m50248a((Context) application2).mo31180p().mo29514c();
                    } catch (Throwable th) {
                        C9023i4.m48681a(th);
                    }
                }
            }
        }
    }
}
