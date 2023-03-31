package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import p033d5.C4087c;
import p033d5.C4141r;
import p061h5.C4626a;
import p180z4.C6362b;
import p402y5.C13028f;

/* renamed from: com.google.android.gms.measurement.internal.u7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7521u7 implements ServiceConnection, C4087c.C4088a, C4087c.C4089b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile boolean f33095a;

    /* renamed from: b */
    private volatile C7308b3 f33096b;

    /* renamed from: c */
    final /* synthetic */ C7532v7 f33097c;

    protected C7521u7(C7532v7 v7Var) {
        this.f33097c = v7Var;
    }

    /* renamed from: B0 */
    public final void mo8940B0(C6362b bVar) {
        C4141r.m28216f("MeasurementServiceConnection.onConnectionFailed");
        C7352f3 E = this.f33097c.f32389a.mo24415E();
        if (E != null) {
            E.mo24261w().mo24209b("Service connection failed", bVar);
        }
        synchronized (this) {
            this.f33095a = false;
            this.f33096b = null;
        }
        this.f33097c.f32389a.mo24143s().mo24309z(new C7510t7(this));
    }

    /* renamed from: P0 */
    public final void mo8531P0(Bundle bundle) {
        C4141r.m28216f("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                C4141r.m28221k(this.f33096b);
                this.f33097c.f32389a.mo24143s().mo24309z(new C7488r7(this, (C13028f) this.f33096b.mo17324H()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f33096b = null;
                this.f33095a = false;
            }
        }
    }

    /* renamed from: b */
    public final void mo24683b(Intent intent) {
        this.f33097c.mo24189f();
        Context d = this.f33097c.f32389a.mo24121d();
        C4626a b = C4626a.m30143b();
        synchronized (this) {
            if (this.f33095a) {
                this.f33097c.f32389a.mo24135l().mo24260v().mo24208a("Connection attempt already in progress");
                return;
            }
            this.f33097c.f32389a.mo24135l().mo24260v().mo24208a("Using local app measurement service");
            this.f33095a = true;
            b.mo18191a(d, intent, this.f33097c.f33126c, 129);
        }
    }

    /* renamed from: c */
    public final void mo24684c() {
        this.f33097c.mo24189f();
        Context d = this.f33097c.f32389a.mo24121d();
        synchronized (this) {
            if (this.f33095a) {
                this.f33097c.f32389a.mo24135l().mo24260v().mo24208a("Connection attempt already in progress");
            } else if (this.f33096b == null || (!this.f33096b.mo17344f() && !this.f33096b.mo17338a())) {
                this.f33096b = new C7308b3(d, Looper.getMainLooper(), this, this);
                this.f33097c.f32389a.mo24135l().mo24260v().mo24208a("Connecting to remote service");
                this.f33095a = true;
                C4141r.m28221k(this.f33096b);
                this.f33096b.mo17355u();
            } else {
                this.f33097c.f32389a.mo24135l().mo24260v().mo24208a("Already awaiting connection attempt");
            }
        }
    }

    /* renamed from: d */
    public final void mo24685d() {
        if (this.f33096b != null && (this.f33096b.mo17338a() || this.f33096b.mo17344f())) {
            this.f33096b.mo17343e();
        }
        this.f33096b = null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.f33097c.f32389a.mo24135l().mo24256q().mo24208a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0065 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            p033d5.C4141r.m28216f(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001e
            r3.f33095a = r4     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.v7 r4 = r3.f33097c     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.j4 r4 = r4.f32389a     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.f3 r4 = r4.mo24135l()     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo24256q()     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = "Service connected with null binder"
            r4.mo24208a(r5)     // Catch:{ all -> 0x0063 }
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            return
        L_0x001e:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0065 }
            if (r2 == 0) goto L_0x0051
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0065 }
            boolean r2 = r1 instanceof p402y5.C13028f     // Catch:{ RemoteException -> 0x0065 }
            if (r2 == 0) goto L_0x0039
            y5.f r1 = (p402y5.C13028f) r1     // Catch:{ RemoteException -> 0x0065 }
        L_0x0037:
            r0 = r1
            goto L_0x003f
        L_0x0039:
            com.google.android.gms.measurement.internal.v2 r1 = new com.google.android.gms.measurement.internal.v2     // Catch:{ RemoteException -> 0x0065 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0037
        L_0x003f:
            com.google.android.gms.measurement.internal.v7 r5 = r3.f33097c     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.j4 r5 = r5.f32389a     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.f3 r5 = r5.mo24135l()     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo24260v()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.mo24208a(r1)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0076
        L_0x0051:
            com.google.android.gms.measurement.internal.v7 r5 = r3.f33097c     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.j4 r5 = r5.f32389a     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.f3 r5 = r5.mo24135l()     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo24256q()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.mo24209b(r2, r1)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0076
        L_0x0063:
            r4 = move-exception
            goto L_0x00a2
        L_0x0065:
            com.google.android.gms.measurement.internal.v7 r5 = r3.f33097c     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.j4 r5 = r5.f32389a     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.f3 r5 = r5.mo24135l()     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo24256q()     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.mo24208a(r1)     // Catch:{ all -> 0x0063 }
        L_0x0076:
            if (r0 != 0) goto L_0x0090
            r3.f33095a = r4     // Catch:{ all -> 0x0063 }
            h5.a r4 = p061h5.C4626a.m30143b()     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.v7 r5 = r3.f33097c     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.j4 r5 = r5.f32389a     // Catch:{ IllegalArgumentException -> 0x00a0 }
            android.content.Context r5 = r5.mo24121d()     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.v7 r0 = r3.f33097c     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.u7 r0 = r0.f33126c     // Catch:{ IllegalArgumentException -> 0x00a0 }
            r4.mo18192c(r5, r0)     // Catch:{ IllegalArgumentException -> 0x00a0 }
            goto L_0x00a0
        L_0x0090:
            com.google.android.gms.measurement.internal.v7 r4 = r3.f33097c     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.j4 r4 = r4.f32389a     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.h4 r4 = r4.mo24143s()     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.p7 r5 = new com.google.android.gms.measurement.internal.p7     // Catch:{ all -> 0x0063 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0063 }
            r4.mo24309z(r5)     // Catch:{ all -> 0x0063 }
        L_0x00a0:
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            return
        L_0x00a2:
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7521u7.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C4141r.m28216f("MeasurementServiceConnection.onServiceDisconnected");
        this.f33097c.f32389a.mo24135l().mo24255p().mo24208a("Service disconnected");
        this.f33097c.f32389a.mo24143s().mo24309z(new C7477q7(this, componentName));
    }

    /* renamed from: p */
    public final void mo8532p(int i) {
        C4141r.m28216f("MeasurementServiceConnection.onConnectionSuspended");
        this.f33097c.f32389a.mo24135l().mo24255p().mo24208a("Service connection suspended");
        this.f33097c.f32389a.mo24143s().mo24309z(new C7499s7(this));
    }
}
