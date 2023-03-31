package com.onesignal;

import com.onesignal.C8338d3;

/* renamed from: com.onesignal.a2 */
/* compiled from: OSNotificationReceivedEvent */
public class C8295a2 {

    /* renamed from: a */
    private final C8600s1 f35316a;

    /* renamed from: b */
    private final C8664y2 f35317b;

    /* renamed from: c */
    private final Runnable f35318c;

    /* renamed from: d */
    private final C8575q1 f35319d;

    /* renamed from: e */
    private boolean f35320e = false;

    /* renamed from: com.onesignal.a2$a */
    /* compiled from: OSNotificationReceivedEvent */
    class C8296a implements Runnable {
        C8296a() {
        }

        public void run() {
            C8338d3.m46492a(C8338d3.C8384r0.DEBUG, "Running complete from OSNotificationReceivedEvent timeout runnable!");
            C8295a2 a2Var = C8295a2.this;
            a2Var.mo27590b(a2Var.mo27591c());
        }
    }

    /* renamed from: com.onesignal.a2$b */
    /* compiled from: OSNotificationReceivedEvent */
    class C8297b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C8575q1 f35322a;

        C8297b(C8575q1 q1Var) {
            this.f35322a = q1Var;
        }

        public void run() {
            C8295a2.this.m46265e(this.f35322a);
        }
    }

    C8295a2(C8600s1 s1Var, C8575q1 q1Var) {
        this.f35319d = q1Var;
        this.f35316a = s1Var;
        C8664y2 b = C8664y2.m47908b();
        this.f35317b = b;
        C8296a aVar = new C8296a();
        this.f35318c = aVar;
        b.mo28337c(25000, aVar);
    }

    /* renamed from: d */
    static boolean m46264d() {
        return OSUtils.m46175H();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m46265e(C8575q1 q1Var) {
        this.f35316a.mo28197f(this.f35319d.mo28113c(), q1Var != null ? q1Var.mo28113c() : null);
    }

    /* renamed from: b */
    public synchronized void mo27590b(C8575q1 q1Var) {
        this.f35317b.mo28336a(this.f35318c);
        if (this.f35320e) {
            C8338d3.m46594z1(C8338d3.C8384r0.DEBUG, "OSNotificationReceivedEvent already completed");
            return;
        }
        this.f35320e = true;
        if (m46264d()) {
            new Thread(new C8297b(q1Var), "OS_COMPLETE_NOTIFICATION").start();
        } else {
            m46265e(q1Var);
        }
    }

    /* renamed from: c */
    public C8575q1 mo27591c() {
        return this.f35319d;
    }

    public String toString() {
        return "OSNotificationReceivedEvent{isComplete=" + this.f35320e + ", notification=" + this.f35319d + '}';
    }
}
