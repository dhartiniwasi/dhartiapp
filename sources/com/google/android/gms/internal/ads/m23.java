package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import p033d5.C4087c;
import p180z4.C6362b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class m23 implements C4087c.C4088a, C4087c.C4089b {

    /* renamed from: a */
    protected final m33 f13192a;

    /* renamed from: b */
    private final String f13193b;

    /* renamed from: c */
    private final String f13194c;

    /* renamed from: d */
    private final LinkedBlockingQueue f13195d = new LinkedBlockingQueue();

    /* renamed from: e */
    private final HandlerThread f13196e;

    public m23(Context context, String str, String str2) {
        this.f13193b = str;
        this.f13194c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f13196e = handlerThread;
        handlerThread.start();
        m33 m33 = new m33(context, handlerThread.getLooper(), this, this, 9200000);
        this.f13192a = m33;
        m33.mo17355u();
    }

    /* renamed from: a */
    static C2730pc m16360a() {
        C3063yb g0 = C2730pc.m18499g0();
        g0.mo15406u(32768);
        return (C2730pc) g0.mo13423m();
    }

    /* renamed from: B0 */
    public final void mo8940B0(C6362b bVar) {
        try {
            this.f13195d.put(m16360a());
        } catch (InterruptedException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        mo12265c();
        r3.f13196e.quit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3.f13195d.put(m16360a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0025 */
    /* renamed from: P0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8531P0(android.os.Bundle r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.r33 r4 = r3.mo12266d()
            if (r4 == 0) goto L_0x0039
            com.google.android.gms.internal.ads.n33 r0 = new com.google.android.gms.internal.ads.n33     // Catch:{ all -> 0x0025 }
            java.lang.String r1 = r3.f13193b     // Catch:{ all -> 0x0025 }
            java.lang.String r2 = r3.f13194c     // Catch:{ all -> 0x0025 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.p33 r4 = r4.mo13661i5(r0)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.pc r4 = r4.mo13126I1()     // Catch:{ all -> 0x0025 }
            java.util.concurrent.LinkedBlockingQueue r0 = r3.f13195d     // Catch:{ all -> 0x0025 }
            r0.put(r4)     // Catch:{ all -> 0x0025 }
        L_0x001c:
            r3.mo12265c()
            android.os.HandlerThread r4 = r3.f13196e
            r4.quit()
            return
        L_0x0025:
            java.util.concurrent.LinkedBlockingQueue r4 = r3.f13195d     // Catch:{ InterruptedException -> 0x001c, all -> 0x002f }
            com.google.android.gms.internal.ads.pc r0 = m16360a()     // Catch:{ InterruptedException -> 0x001c, all -> 0x002f }
            r4.put(r0)     // Catch:{ InterruptedException -> 0x001c, all -> 0x002f }
            goto L_0x001c
        L_0x002f:
            r4 = move-exception
            r3.mo12265c()
            android.os.HandlerThread r0 = r3.f13196e
            r0.quit()
            throw r4
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m23.mo8531P0(android.os.Bundle):void");
    }

    /* renamed from: b */
    public final C2730pc mo12264b(int i) {
        C2730pc pcVar;
        try {
            pcVar = (C2730pc) this.f13195d.poll(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            pcVar = null;
        }
        return pcVar == null ? m16360a() : pcVar;
    }

    /* renamed from: c */
    public final void mo12265c() {
        m33 m33 = this.f13192a;
        if (m33 == null) {
            return;
        }
        if (m33.mo17338a() || this.f13192a.mo17344f()) {
            this.f13192a.mo17343e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final r33 mo12266d() {
        try {
            return this.f13192a.mo12269n0();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: p */
    public final void mo8532p(int i) {
        try {
            this.f13195d.put(m16360a());
        } catch (InterruptedException unused) {
        }
    }
}
