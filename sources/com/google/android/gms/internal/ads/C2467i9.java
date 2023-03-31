package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.internal.ads.i9 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2467i9 extends Thread {

    /* renamed from: a */
    private final BlockingQueue f10680a;

    /* renamed from: b */
    private final C2430h9 f10681b;

    /* renamed from: c */
    private final C3060y8 f10682c;

    /* renamed from: d */
    private volatile boolean f10683d = false;

    /* renamed from: e */
    private final C2355f9 f10684e;

    public C2467i9(BlockingQueue blockingQueue, C2430h9 h9Var, C3060y8 y8Var, C2355f9 f9Var, byte[] bArr) {
        this.f10680a = blockingQueue;
        this.f10681b = h9Var;
        this.f10682c = y8Var;
        this.f10684e = f9Var;
    }

    /* renamed from: b */
    private void m14237b() throws InterruptedException {
        C2727p9 p9Var = (C2727p9) this.f10680a.take();
        SystemClock.elapsedRealtime();
        p9Var.mo13169A(3);
        try {
            p9Var.mo13186t("network-queue-take");
            p9Var.mo13172D();
            TrafficStats.setThreadStatsTag(p9Var.mo13176b());
            C2542k9 a = this.f10681b.mo9863a(p9Var);
            p9Var.mo13186t("network-http-complete");
            if (!a.f11969e || !p9Var.mo13171C()) {
                C2950v9 o = p9Var.mo13182o(a);
                p9Var.mo13186t("network-parse-complete");
                if (o.f18979b != null) {
                    this.f10682c.mo11959g(p9Var.mo13183q(), o.f18979b);
                    p9Var.mo13186t("network-cache-written");
                }
                p9Var.mo13191x();
                this.f10684e.mo10109b(p9Var, o, (Runnable) null);
                p9Var.mo13193z(o);
                p9Var.mo13169A(4);
                return;
            }
            p9Var.mo13190w("not-modified");
            p9Var.mo13192y();
        } catch (C3061y9 e) {
            SystemClock.elapsedRealtime();
            this.f10684e.mo10108a(p9Var, e);
            p9Var.mo13192y();
        } catch (Exception e2) {
            C2208ba.m10259c(e2, "Unhandled exception %s", e2.toString());
            C3061y9 y9Var = new C3061y9((Throwable) e2);
            SystemClock.elapsedRealtime();
            this.f10684e.mo10108a(p9Var, y9Var);
            p9Var.mo13192y();
        } finally {
            p9Var.mo13169A(4);
        }
    }

    /* renamed from: a */
    public final void mo11062a() {
        this.f10683d = true;
        interrupt();
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m14237b();
            } catch (InterruptedException unused) {
                if (this.f10683d) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C2208ba.m10258b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
