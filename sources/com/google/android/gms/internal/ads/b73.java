package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p218e6.C9975i;
import p218e6.C9977j;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class b73 {

    /* renamed from: o */
    private static final Map f7134o = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f7135a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final q63 f7136b;

    /* renamed from: c */
    private final String f7137c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final List f7138d = new ArrayList();

    /* renamed from: e */
    private final Set f7139e = new HashSet();

    /* renamed from: f */
    private final Object f7140f = new Object();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f7141g;

    /* renamed from: h */
    private final Intent f7142h;

    /* renamed from: i */
    private final WeakReference f7143i;

    /* renamed from: j */
    private final IBinder.DeathRecipient f7144j = new t63(this);

    /* renamed from: k */
    private final AtomicInteger f7145k = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: l */
    public ServiceConnection f7146l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public IInterface f7147m;

    /* renamed from: n */
    private final y53 f7148n;

    public b73(Context context, q63 q63, String str, Intent intent, y53 y53, w63 w63, byte[] bArr) {
        this.f7135a = context;
        this.f7136b = q63;
        this.f7137c = "OverlayDisplayService";
        this.f7142h = intent;
        this.f7148n = y53;
        this.f7143i = new WeakReference((Object) null);
    }

    /* renamed from: h */
    public static /* synthetic */ void m10217h(b73 b73) {
        b73.f7136b.mo13479d("reportBinderDeath", new Object[0]);
        w63 w63 = (w63) b73.f7143i.get();
        if (w63 != null) {
            b73.f7136b.mo13479d("calling onBinderDied", new Object[0]);
            w63.zza();
        } else {
            b73.f7136b.mo13479d("%s : Binder has died.", b73.f7137c);
            for (r63 c : b73.f7138d) {
                c.mo13688c(b73.m10225s());
            }
            b73.f7138d.clear();
        }
        b73.m10226t();
    }

    /* renamed from: m */
    static /* bridge */ /* synthetic */ void m10222m(b73 b73, r63 r63) {
        if (b73.f7147m == null && !b73.f7141g) {
            b73.f7136b.mo13479d("Initiate binding to the service.", new Object[0]);
            b73.f7138d.add(r63);
            a73 a73 = new a73(b73, (z63) null);
            b73.f7146l = a73;
            b73.f7141g = true;
            if (!b73.f7135a.bindService(b73.f7142h, a73, 1)) {
                b73.f7136b.mo13479d("Failed to bind to the service.", new Object[0]);
                b73.f7141g = false;
                for (r63 c : b73.f7138d) {
                    c.mo13688c(new c73());
                }
                b73.f7138d.clear();
            }
        } else if (b73.f7141g) {
            b73.f7136b.mo13479d("Waiting to bind to the service.", new Object[0]);
            b73.f7138d.add(r63);
        } else {
            r63.run();
        }
    }

    /* renamed from: n */
    static /* bridge */ /* synthetic */ void m10223n(b73 b73) {
        b73.f7136b.mo13479d("linkToDeath", new Object[0]);
        try {
            b73.f7147m.asBinder().linkToDeath(b73.f7144j, 0);
        } catch (RemoteException e) {
            b73.f7136b.mo13478c(e, "linkToDeath failed", new Object[0]);
        }
    }

    /* renamed from: o */
    static /* bridge */ /* synthetic */ void m10224o(b73 b73) {
        b73.f7136b.mo13479d("unlinkToDeath", new Object[0]);
        b73.f7147m.asBinder().unlinkToDeath(b73.f7144j, 0);
    }

    /* renamed from: s */
    private final RemoteException m10225s() {
        return new RemoteException(String.valueOf(this.f7137c).concat(" : Binder has died."));
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public final void m10226t() {
        synchronized (this.f7140f) {
            for (C9977j d : this.f7139e) {
                d.mo32545d(m10225s());
            }
            this.f7139e.clear();
        }
    }

    /* renamed from: c */
    public final Handler mo8686c() {
        Handler handler;
        Map map = f7134o;
        synchronized (map) {
            if (!map.containsKey(this.f7137c)) {
                HandlerThread handlerThread = new HandlerThread(this.f7137c, 10);
                handlerThread.start();
                map.put(this.f7137c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.f7137c);
        }
        return handler;
    }

    /* renamed from: e */
    public final IInterface mo8687e() {
        return this.f7147m;
    }

    /* renamed from: p */
    public final void mo8688p(r63 r63, C9977j jVar) {
        synchronized (this.f7140f) {
            this.f7139e.add(jVar);
            jVar.mo32542a().mo26347b(new s63(this, jVar));
        }
        synchronized (this.f7140f) {
            if (this.f7145k.getAndIncrement() > 0) {
                this.f7136b.mo13476a("Already connected to the service.", new Object[0]);
            }
        }
        mo8686c().post(new u63(this, r63.mo13687b(), r63));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void mo8689q(C9977j jVar, C9975i iVar) {
        synchronized (this.f7140f) {
            this.f7139e.remove(jVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        mo8686c().post(new com.google.android.gms.internal.ads.v63(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        return;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8690r() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f7140f
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicInteger r1 = r4.f7145k     // Catch:{ all -> 0x002e }
            int r1 = r1.get()     // Catch:{ all -> 0x002e }
            if (r1 <= 0) goto L_0x0020
            java.util.concurrent.atomic.AtomicInteger r1 = r4.f7145k     // Catch:{ all -> 0x002e }
            int r1 = r1.decrementAndGet()     // Catch:{ all -> 0x002e }
            if (r1 > 0) goto L_0x0014
            goto L_0x0020
        L_0x0014:
            com.google.android.gms.internal.ads.q63 r1 = r4.f7136b     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "Leaving the connection open for other ongoing calls."
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x002e }
            r1.mo13479d(r2, r3)     // Catch:{ all -> 0x002e }
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            com.google.android.gms.internal.ads.v63 r0 = new com.google.android.gms.internal.ads.v63
            r0.<init>(r4)
            android.os.Handler r1 = r4.mo8686c()
            r1.post(r0)
            return
        L_0x002e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b73.mo8690r():void");
    }
}
