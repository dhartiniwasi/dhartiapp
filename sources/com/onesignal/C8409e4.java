package com.onesignal;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.onesignal.e4 */
/* compiled from: TrackFirebaseAnalytics */
class C8409e4 {

    /* renamed from: c */
    private static Class<?> f35565c;

    /* renamed from: d */
    private static AtomicLong f35566d;

    /* renamed from: e */
    private static AtomicLong f35567e;

    /* renamed from: f */
    private static C8575q1 f35568f;

    /* renamed from: a */
    private Object f35569a;

    /* renamed from: b */
    private Context f35570b;

    C8409e4(Context context) {
        this.f35570b = context;
    }

    /* renamed from: a */
    static boolean m46650a() {
        try {
            f35565c = FirebaseAnalytics.class;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: b */
    private String m46651b(C8575q1 q1Var) {
        if (q1Var.mo28090B().isEmpty() || q1Var.mo28089A().isEmpty()) {
            return q1Var.mo28091C() != null ? q1Var.mo28091C().substring(0, Math.min(10, q1Var.mo28091C().length())) : "";
        }
        return q1Var.mo28090B() + " - " + q1Var.mo28089A();
    }

    /* renamed from: c */
    private Object m46652c(Context context) {
        if (this.f35569a == null) {
            try {
                this.f35569a = m46653d(f35565c).invoke((Object) null, new Object[]{context});
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        return this.f35569a;
    }

    /* renamed from: d */
    private static Method m46653d(Class cls) {
        try {
            return cls.getMethod("getInstance", new Class[]{Context.class});
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    private static Method m46654e(Class cls) {
        try {
            return cls.getMethod("logEvent", new Class[]{String.class, Bundle.class});
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo27765f() {
        if (f35566d != null && f35568f != null) {
            long b = C8338d3.m46448M0().mo28281b();
            if (b - f35566d.get() <= 120000) {
                AtomicLong atomicLong = f35567e;
                if (atomicLong == null || b - atomicLong.get() >= 30000) {
                    try {
                        Object c = m46652c(this.f35570b);
                        Method e = m46654e(f35565c);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "OneSignal");
                        bundle.putString("medium", "notification");
                        bundle.putString("notification_id", f35568f.mo28137t());
                        bundle.putString("campaign", m46651b(f35568f));
                        e.invoke(c, new Object[]{"os_notification_influence_open", bundle});
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo27766g(C8685z1 z1Var) {
        if (f35567e == null) {
            f35567e = new AtomicLong();
        }
        f35567e.set(C8338d3.m46448M0().mo28281b());
        try {
            Object c = m46652c(this.f35570b);
            Method e = m46654e(f35565c);
            Bundle bundle = new Bundle();
            bundle.putString("source", "OneSignal");
            bundle.putString("medium", "notification");
            bundle.putString("notification_id", z1Var.mo28360e().mo28137t());
            bundle.putString("campaign", m46651b(z1Var.mo28360e()));
            e.invoke(c, new Object[]{"os_notification_opened", bundle});
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo27767h(C8685z1 z1Var) {
        try {
            Object c = m46652c(this.f35570b);
            Method e = m46654e(f35565c);
            Bundle bundle = new Bundle();
            bundle.putString("source", "OneSignal");
            bundle.putString("medium", "notification");
            bundle.putString("notification_id", z1Var.mo28360e().mo28137t());
            bundle.putString("campaign", m46651b(z1Var.mo28360e()));
            e.invoke(c, new Object[]{"os_notification_received", bundle});
            if (f35566d == null) {
                f35566d = new AtomicLong();
            }
            f35566d.set(C8338d3.m46448M0().mo28281b());
            f35568f = z1Var.mo28360e();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
