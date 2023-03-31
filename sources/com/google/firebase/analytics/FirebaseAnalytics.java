package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.C6904c3;
import com.google.firebase.installations.C7998c;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p033d5.C4141r;
import p218e6.C9975i;
import p218e6.C9980l;
import p402y5.C13045w;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
public final class FirebaseAnalytics {

    /* renamed from: c */
    private static volatile FirebaseAnalytics f34061c;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C6904c3 f34062a;

    /* renamed from: b */
    private ExecutorService f34063b;

    /* renamed from: com.google.firebase.analytics.FirebaseAnalytics$a */
    /* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
    public enum C7768a {
        GRANTED,
        DENIED
    }

    /* renamed from: com.google.firebase.analytics.FirebaseAnalytics$b */
    /* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
    public enum C7769b {
        AD_STORAGE,
        ANALYTICS_STORAGE
    }

    public FirebaseAnalytics(C6904c3 c3Var) {
        C4141r.m28221k(c3Var);
        this.f34062a = c3Var;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f34061c == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f34061c == null) {
                    f34061c = new FirebaseAnalytics(C6904c3.m39706z(context, (String) null, (String) null, (String) null, (Bundle) null));
                }
            }
        }
        return f34061c;
    }

    @Keep
    public static C13045w getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C6904c3 z = C6904c3.m39706z(context, (String) null, (String) null, (String) null, bundle);
        if (z == null) {
            return null;
        }
        return new C7772c(z);
    }

    /* renamed from: k */
    private final ExecutorService m43204k() {
        ExecutorService executorService;
        synchronized (FirebaseAnalytics.class) {
            if (this.f34063b == null) {
                this.f34063b = new C7770a(this, 0, 1, 30, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
            }
            executorService = this.f34063b;
        }
        return executorService;
    }

    /* renamed from: a */
    public C9975i<String> mo25977a() {
        try {
            return C9980l.m51029c(m43204k(), new C7771b(this));
        } catch (RuntimeException e) {
            this.f34062a.mo23160a(5, "Failed to schedule task for getAppInstanceId", (Object) null, (Object) null, (Object) null);
            return C9980l.m51030d(e);
        }
    }

    /* renamed from: b */
    public void mo25978b(String str, Bundle bundle) {
        this.f34062a.mo23158P(str, bundle);
    }

    /* renamed from: c */
    public void mo25979c() {
        this.f34062a.mo23161b();
    }

    /* renamed from: d */
    public void mo25980d(boolean z) {
        this.f34062a.mo23168i(Boolean.valueOf(z));
    }

    /* renamed from: e */
    public void mo25981e(Map<C7769b, C7768a> map) {
        Bundle bundle = new Bundle();
        C7768a aVar = map.get(C7769b.AD_STORAGE);
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (ordinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        C7768a aVar2 = map.get(C7769b.ANALYTICS_STORAGE);
        if (aVar2 != null) {
            int ordinal2 = aVar2.ordinal();
            if (ordinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (ordinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        this.f34062a.mo23164e(bundle);
    }

    /* renamed from: f */
    public void mo25982f(Bundle bundle) {
        this.f34062a.mo23167h(bundle);
    }

    /* renamed from: g */
    public void mo25983g(long j) {
        this.f34062a.mo23169j(j);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) C9980l.m51028b(C7998c.m44050p().getId(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* renamed from: h */
    public void mo25985h(String str) {
        this.f34062a.mo23170k(str);
    }

    /* renamed from: i */
    public void mo25986i(String str, String str2) {
        this.f34062a.mo23171l((String) null, str, str2, false);
    }

    @Deprecated
    @Keep
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f34062a.mo23165f(activity, str, str2);
    }
}
