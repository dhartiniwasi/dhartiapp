package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.internal.ads.a9 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2170a9 extends Thread {

    /* renamed from: g */
    private static final boolean f6476g = C2208ba.f7181b;

    /* renamed from: a */
    private final BlockingQueue f6477a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final BlockingQueue f6478b;

    /* renamed from: c */
    private final C3060y8 f6479c;

    /* renamed from: d */
    private volatile boolean f6480d = false;

    /* renamed from: e */
    private final C2245ca f6481e;

    /* renamed from: f */
    private final C2355f9 f6482f;

    public C2170a9(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, C3060y8 y8Var, C2355f9 f9Var, byte[] bArr) {
        this.f6477a = blockingQueue;
        this.f6478b = blockingQueue2;
        this.f6479c = y8Var;
        this.f6482f = f9Var;
        this.f6481e = new C2245ca(this, blockingQueue2, f9Var, (byte[]) null);
    }

    /* renamed from: c */
    private void m9642c() throws InterruptedException {
        C2727p9 p9Var = (C2727p9) this.f6477a.take();
        p9Var.mo13186t("cache-queue-take");
        p9Var.mo13169A(1);
        try {
            p9Var.mo13172D();
            C3023x8 f = this.f6479c.mo11958f(p9Var.mo13183q());
            if (f == null) {
                p9Var.mo13186t("cache-miss");
                if (!this.f6481e.mo9100c(p9Var)) {
                    this.f6478b.put(p9Var);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (f.mo15061a(currentTimeMillis)) {
                p9Var.mo13186t("cache-hit-expired");
                p9Var.mo13179j(f);
                if (!this.f6481e.mo9100c(p9Var)) {
                    this.f6478b.put(p9Var);
                }
                p9Var.mo13169A(2);
                return;
            }
            p9Var.mo13186t("cache-hit");
            C2950v9 o = p9Var.mo13182o(new C2542k9(f.f20023a, f.f20029g));
            p9Var.mo13186t("cache-hit-parsed");
            if (!o.mo14698c()) {
                p9Var.mo13186t("cache-parsing-failed");
                this.f6479c.mo11960h(p9Var.mo13183q(), true);
                p9Var.mo13179j((C3023x8) null);
                if (!this.f6481e.mo9100c(p9Var)) {
                    this.f6478b.put(p9Var);
                }
                p9Var.mo13169A(2);
                return;
            }
            if (f.f20028f < currentTimeMillis) {
                p9Var.mo13186t("cache-hit-refresh-needed");
                p9Var.mo13179j(f);
                o.f18981d = true;
                if (!this.f6481e.mo9100c(p9Var)) {
                    this.f6482f.mo10109b(p9Var, o, new C3097z8(this, p9Var));
                } else {
                    this.f6482f.mo10109b(p9Var, o, (Runnable) null);
                }
            } else {
                this.f6482f.mo10109b(p9Var, o, (Runnable) null);
            }
            p9Var.mo13169A(2);
        } finally {
            p9Var.mo13169A(2);
        }
    }

    /* renamed from: b */
    public final void mo8264b() {
        this.f6480d = true;
        interrupt();
    }

    public final void run() {
        if (f6476g) {
            C2208ba.m10260d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f6479c.mo11957d();
        while (true) {
            try {
                m9642c();
            } catch (InterruptedException unused) {
                if (this.f6480d) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C2208ba.m10258b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
