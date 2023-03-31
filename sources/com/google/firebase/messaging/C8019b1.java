package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p124r.C5413a;
import p218e6.C9975i;
import p218e6.C9977j;
import p218e6.C9980l;

/* renamed from: com.google.firebase.messaging.b1 */
/* compiled from: TopicsSubscriber */
class C8019b1 {

    /* renamed from: i */
    private static final long f34627i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a */
    private final Context f34628a;

    /* renamed from: b */
    private final C8044i0 f34629b;

    /* renamed from: c */
    private final C8027d0 f34630c;

    /* renamed from: d */
    private final FirebaseMessaging f34631d;

    /* renamed from: e */
    private final Map<String, ArrayDeque<C9977j<Void>>> f34632e = new C5413a();

    /* renamed from: f */
    private final ScheduledExecutorService f34633f;

    /* renamed from: g */
    private boolean f34634g = false;

    /* renamed from: h */
    private final C8087z0 f34635h;

    private C8019b1(FirebaseMessaging firebaseMessaging, C8044i0 i0Var, C8087z0 z0Var, C8027d0 d0Var, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f34631d = firebaseMessaging;
        this.f34629b = i0Var;
        this.f34635h = z0Var;
        this.f34630c = d0Var;
        this.f34628a = context;
        this.f34633f = scheduledExecutorService;
    }

    /* renamed from: b */
    private void m44167b(C8085y0 y0Var, C9977j<Void> jVar) {
        ArrayDeque arrayDeque;
        synchronized (this.f34632e) {
            String e = y0Var.mo26757e();
            if (this.f34632e.containsKey(e)) {
                arrayDeque = this.f34632e.get(e);
            } else {
                ArrayDeque arrayDeque2 = new ArrayDeque();
                this.f34632e.put(e, arrayDeque2);
                arrayDeque = arrayDeque2;
            }
            arrayDeque.add(jVar);
        }
    }

    /* renamed from: c */
    private static <T> void m44168c(C9975i<T> iVar) throws IOException {
        try {
            C9980l.m51028b(iVar, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException e2) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e2);
        }
    }

    /* renamed from: d */
    private void m44169d(String str) throws IOException {
        m44168c(this.f34630c.mo26627l(this.f34631d.mo26582n(), str));
    }

    /* renamed from: e */
    private void m44170e(String str) throws IOException {
        m44168c(this.f34630c.mo26628m(this.f34631d.mo26582n(), str));
    }

    /* renamed from: f */
    static C9975i<C8019b1> m44171f(FirebaseMessaging firebaseMessaging, C8044i0 i0Var, C8027d0 d0Var, Context context, ScheduledExecutorService scheduledExecutorService) {
        return C9980l.m51029c(scheduledExecutorService, new C8015a1(context, scheduledExecutorService, firebaseMessaging, i0Var, d0Var));
    }

    /* renamed from: h */
    static boolean m44172h() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ C8019b1 m44173j(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, C8044i0 i0Var, C8027d0 d0Var) throws Exception {
        return new C8019b1(firebaseMessaging, i0Var, C8087z0.m44467b(context, scheduledExecutorService), d0Var, context, scheduledExecutorService);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        return;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m44174k(com.google.firebase.messaging.C8085y0 r5) {
        /*
            r4 = this;
            java.util.Map<java.lang.String, java.util.ArrayDeque<e6.j<java.lang.Void>>> r0 = r4.f34632e
            monitor-enter(r0)
            java.lang.String r5 = r5.mo26757e()     // Catch:{ all -> 0x0032 }
            java.util.Map<java.lang.String, java.util.ArrayDeque<e6.j<java.lang.Void>>> r1 = r4.f34632e     // Catch:{ all -> 0x0032 }
            boolean r1 = r1.containsKey(r5)     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0011:
            java.util.Map<java.lang.String, java.util.ArrayDeque<e6.j<java.lang.Void>>> r1 = r4.f34632e     // Catch:{ all -> 0x0032 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0032 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x0032 }
            java.lang.Object r2 = r1.poll()     // Catch:{ all -> 0x0032 }
            e6.j r2 = (p218e6.C9977j) r2     // Catch:{ all -> 0x0032 }
            if (r2 == 0) goto L_0x0025
            r3 = 0
            r2.mo32544c(r3)     // Catch:{ all -> 0x0032 }
        L_0x0025:
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0030
            java.util.Map<java.lang.String, java.util.ArrayDeque<e6.j<java.lang.Void>>> r1 = r4.f34632e     // Catch:{ all -> 0x0032 }
            r1.remove(r5)     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C8019b1.m44174k(com.google.firebase.messaging.y0):void");
    }

    /* renamed from: p */
    private void m44175p() {
        if (!mo26612i()) {
            mo26620t(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo26611g() {
        return this.f34635h.mo26762c() != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public synchronized boolean mo26612i() {
        return this.f34634g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo26613l(C8085y0 y0Var) throws IOException {
        try {
            String b = y0Var.mo26755b();
            char c = 65535;
            int hashCode = b.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85) {
                    if (b.equals("U")) {
                        c = 1;
                    }
                }
            } else if (b.equals("S")) {
                c = 0;
            }
            if (c == 0) {
                m44169d(y0Var.mo26756c());
                if (m44172h()) {
                    Log.d("FirebaseMessaging", "Subscribe to topic: " + y0Var.mo26756c() + " succeeded.");
                }
            } else if (c == 1) {
                m44170e(y0Var.mo26756c());
                if (m44172h()) {
                    Log.d("FirebaseMessaging", "Unsubscribe from topic: " + y0Var.mo26756c() + " succeeded.");
                }
            } else if (m44172h()) {
                Log.d("FirebaseMessaging", "Unknown topic operation" + y0Var + ".");
            }
            return true;
        } catch (IOException e) {
            if ("SERVICE_NOT_AVAILABLE".equals(e.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                Log.e("FirebaseMessaging", "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.");
                return false;
            } else if (e.getMessage() == null) {
                Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                return false;
            } else {
                throw e;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo26614m(Runnable runnable, long j) {
        this.f34633f.schedule(runnable, j, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C9975i<Void> mo26615n(C8085y0 y0Var) {
        this.f34635h.mo26761a(y0Var);
        C9977j jVar = new C9977j();
        m44167b(y0Var, jVar);
        return jVar.mo32542a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public synchronized void mo26616o(boolean z) {
        this.f34634g = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo26617q() {
        if (mo26611g()) {
            m44175p();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C9975i<Void> mo26618r(String str) {
        C9975i<Void> n = mo26615n(C8085y0.m44462f(str));
        mo26617q();
        return n;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (mo26613l(r0) != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        return false;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo26619s() throws java.io.IOException {
        /*
            r2 = this;
        L_0x0000:
            monitor-enter(r2)
            com.google.firebase.messaging.z0 r0 = r2.f34635h     // Catch:{ all -> 0x002b }
            com.google.firebase.messaging.y0 r0 = r0.mo26762c()     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0019
            boolean r0 = m44172h()     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x002b }
        L_0x0016:
            r0 = 1
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            return r0
        L_0x0019:
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            boolean r1 = r2.mo26613l(r0)
            if (r1 != 0) goto L_0x0022
            r0 = 0
            return r0
        L_0x0022:
            com.google.firebase.messaging.z0 r1 = r2.f34635h
            r1.mo26763e(r0)
            r2.m44174k(r0)
            goto L_0x0000
        L_0x002b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C8019b1.mo26619s():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo26620t(long j) {
        mo26614m(new C8023c1(this, this.f34628a, this.f34629b, Math.min(Math.max(30, 2 * j), f34627i)), j);
        mo26616o(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public C9975i<Void> mo26621u(String str) {
        C9975i<Void> n = mo26615n(C8085y0.m44463g(str));
        mo26617q();
        return n;
    }
}
