package com.onesignal;

import android.os.Handler;
import android.os.HandlerThread;
import com.onesignal.C8338d3;

/* renamed from: com.onesignal.y2 */
/* compiled from: OSTimeoutHandler */
class C8664y2 extends HandlerThread {

    /* renamed from: b */
    private static final String f36174b = C8664y2.class.getCanonicalName();

    /* renamed from: c */
    private static final Object f36175c = new Object();

    /* renamed from: d */
    private static C8664y2 f36176d;

    /* renamed from: a */
    private final Handler f36177a = new Handler(getLooper());

    private C8664y2() {
        super(f36174b);
        start();
    }

    /* renamed from: b */
    static C8664y2 m47908b() {
        if (f36176d == null) {
            synchronized (f36175c) {
                if (f36176d == null) {
                    f36176d = new C8664y2();
                }
            }
        }
        return f36176d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo28336a(Runnable runnable) {
        synchronized (f36175c) {
            C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
            C8338d3.m46492a(r0Var, "Running destroyTimeout with runnable: " + runnable.toString());
            this.f36177a.removeCallbacks(runnable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo28337c(long j, Runnable runnable) {
        synchronized (f36175c) {
            mo28336a(runnable);
            C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
            C8338d3.m46492a(r0Var, "Running startTimeout with timeout: " + j + " and runnable: " + runnable.toString());
            this.f36177a.postDelayed(runnable, j);
        }
    }
}
