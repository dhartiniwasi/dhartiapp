package com.onesignal;

import com.onesignal.C8338d3;

/* renamed from: com.onesignal.z1 */
/* compiled from: OSNotificationOpenedResult */
public class C8685z1 implements C8338d3.C8376n0 {

    /* renamed from: a */
    private final C8664y2 f36238a;

    /* renamed from: b */
    private final Runnable f36239b;

    /* renamed from: c */
    private C8575q1 f36240c;

    /* renamed from: d */
    private C8585r1 f36241d;

    /* renamed from: e */
    private boolean f36242e = false;

    /* renamed from: com.onesignal.z1$a */
    /* compiled from: OSNotificationOpenedResult */
    class C8686a implements Runnable {
        C8686a() {
        }

        public void run() {
            C8338d3.m46492a(C8338d3.C8384r0.DEBUG, "Running complete from OSNotificationOpenedResult timeout runnable!");
            C8685z1.this.m48007c(false);
        }
    }

    public C8685z1(C8575q1 q1Var, C8585r1 r1Var) {
        this.f36240c = q1Var;
        this.f36241d = r1Var;
        C8664y2 b = C8664y2.m47908b();
        this.f36238a = b;
        C8686a aVar = new C8686a();
        this.f36239b = aVar;
        b.mo28337c(5000, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m48007c(boolean z) {
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
        C8338d3.m46594z1(r0Var, "OSNotificationOpenedResult complete called with opened: " + z);
        this.f36238a.mo28336a(this.f36239b);
        if (this.f36242e) {
            C8338d3.m46594z1(r0Var, "OSNotificationOpenedResult already completed");
            return;
        }
        this.f36242e = true;
        if (z) {
            C8338d3.m46415E(this.f36240c.mo28137t());
        }
        C8338d3.m46457O1(this);
    }

    /* renamed from: a */
    public void mo27738a(C8338d3.C8364i0 i0Var) {
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
        C8338d3.m46594z1(r0Var, "OSNotificationOpenedResult onEntryStateChange called with appEntryState: " + i0Var);
        m48007c(C8338d3.C8364i0.APP_CLOSE.equals(i0Var));
    }

    /* renamed from: d */
    public C8585r1 mo28359d() {
        return this.f36241d;
    }

    /* renamed from: e */
    public C8575q1 mo28360e() {
        return this.f36240c;
    }

    public String toString() {
        return "OSNotificationOpenedResult{notification=" + this.f36240c + ", action=" + this.f36241d + ", isComplete=" + this.f36242e + '}';
    }
}
